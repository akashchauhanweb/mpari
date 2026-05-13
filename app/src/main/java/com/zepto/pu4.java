package com.zepto;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes.dex */
public class pu4 {
    public final WorkDatabase a;

    public pu4(WorkDatabase workDatabase) {
        this.a = workDatabase;
    }

    public static void c(Context context, n96 n96Var) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j2 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            n96Var.g();
            try {
                n96Var.a0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                n96Var.a0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j2)});
                sharedPreferences.edit().clear().apply();
                n96Var.Y();
            } finally {
                n96Var.f();
            }
        }
    }

    public long a() {
        Long lA = this.a.D().a("last_force_stop_ms");
        if (lA != null) {
            return lA.longValue();
        }
        return 0L;
    }

    public boolean b() {
        Long lA = this.a.D().a("reschedule_needed");
        return lA != null && lA.longValue() == 1;
    }

    public void d(long j) {
        this.a.D().b(new mu4("last_force_stop_ms", Long.valueOf(j)));
    }

    public void e(boolean z) {
        this.a.D().b(new mu4("reschedule_needed", z));
    }
}
