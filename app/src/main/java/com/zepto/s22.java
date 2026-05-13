package com.zepto;

import androidx.work.impl.WorkDatabase;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class s22 {
    public static final void a(WorkDatabase workDatabase, androidx.work.a configuration, mx7 continuation) {
        int i;
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        List listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(continuation);
        int i2 = 0;
        while (!listMutableListOf.isEmpty()) {
            mx7 mx7Var = (mx7) CollectionsKt__MutableCollectionsKt.removeLast(listMutableListOf);
            List listF = mx7Var.f();
            Intrinsics.checkNotNullExpressionValue(listF, "current.work");
            List list = listF;
            if ((list instanceof Collection) && list.isEmpty()) {
                i = 0;
            } else {
                Iterator it = list.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (((uy7) it.next()).d().j.e() && (i = i + 1) < 0) {
                        CollectionsKt__CollectionsKt.throwCountOverflow();
                    }
                }
            }
            i2 += i;
            List listE = mx7Var.e();
            if (listE != null) {
                listMutableListOf.addAll(listE);
            }
        }
        if (i2 == 0) {
            return;
        }
        int iS = workDatabase.H().s();
        int iB = configuration.b();
        if (iS + i2 <= iB) {
            return;
        }
        throw new IllegalArgumentException("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: " + iB + ";\nalready enqueued count: " + iS + ";\ncurrent enqueue operation count: " + i2 + ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.");
    }

    public static final yy7 b(List schedulers, yy7 workSpec) {
        Intrinsics.checkNotNullParameter(schedulers, "schedulers");
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return workSpec;
    }
}
