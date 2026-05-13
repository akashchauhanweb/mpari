package com.zepto;

import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class bx2 {
    public final WorkDatabase a;

    public bx2(WorkDatabase workDatabase) {
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        this.a = workDatabase;
    }

    public static final Integer d(bx2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return Integer.valueOf(cx2.d(this$0.a, "next_alarm_manager_id"));
    }

    public static final Integer f(bx2 this$0, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int iD = cx2.d(this$0.a, "next_job_scheduler_id");
        if (i > iD || iD > i2) {
            cx2.e(this$0.a, "next_job_scheduler_id", i + 1);
        } else {
            i = iD;
        }
        return Integer.valueOf(i);
    }

    public final int c() {
        Object objZ = this.a.z(new Callable() { // from class: com.zepto.zw2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return bx2.d(this.a);
            }
        });
        Intrinsics.checkNotNullExpressionValue(objZ, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
        return ((Number) objZ).intValue();
    }

    public final int e(final int i, final int i2) {
        Object objZ = this.a.z(new Callable() { // from class: com.zepto.ax2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return bx2.f(this.a, i, i2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(objZ, "workDatabase.runInTransa…            id\n        })");
        return ((Number) objZ).intValue();
    }
}
