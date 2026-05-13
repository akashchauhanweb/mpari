package com.zepto;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class cx2 {
    public static final void c(Context context, n96 sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i2 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            sqLiteDatabase.g();
            try {
                sqLiteDatabase.a0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                sqLiteDatabase.a0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                sharedPreferences.edit().clear().apply();
                sqLiteDatabase.Y();
            } finally {
                sqLiteDatabase.f();
            }
        }
    }

    public static final int d(WorkDatabase workDatabase, String str) {
        Long lA = workDatabase.D().a(str);
        int iLongValue = lA != null ? (int) lA.longValue() : 0;
        e(workDatabase, str, iLongValue != Integer.MAX_VALUE ? iLongValue + 1 : 0);
        return iLongValue;
    }

    public static final void e(WorkDatabase workDatabase, String str, int i) {
        workDatabase.D().b(new mu4(str, Long.valueOf(i)));
    }
}
