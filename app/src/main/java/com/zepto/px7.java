package com.zepto;

import android.content.Context;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final class px7 {
    public static final px7 a = new px7();

    public static final void d(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        px7 px7Var = a;
        if (px7Var.b(context).exists()) {
            rn3.e().a(qx7.a, "Migrating WorkDatabase to the no-backup directory");
            for (Map.Entry entry : px7Var.e(context).entrySet()) {
                File file = (File) entry.getKey();
                File file2 = (File) entry.getValue();
                if (file.exists()) {
                    if (file2.exists()) {
                        rn3.e().k(qx7.a, "Over-writing contents of " + file2);
                    }
                    rn3.e().a(qx7.a, file.renameTo(file2) ? "Migrated " + file + "to " + file2 : "Renaming " + file + " to " + file2 + " failed");
                }
            }
        }
    }

    public final File a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return c(context);
    }

    public final File b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        Intrinsics.checkNotNullExpressionValue(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        return databasePath;
    }

    public final File c(Context context) {
        return new File(zp.a.a(context), "androidx.work.workdb");
    }

    public final Map e(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File fileB = b(context);
        File fileA = a(context);
        String[] strArr = qx7.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(strArr.length), 16));
        for (String str : strArr) {
            Pair pair = TuplesKt.to(new File(fileB.getPath() + str), new File(fileA.getPath() + str));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return MapsKt__MapsKt.plus(linkedHashMap, TuplesKt.to(fileB, fileA));
    }
}
