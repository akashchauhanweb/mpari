package com.zepto;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes.dex */
public abstract class vn {
    public static final String a = rn3.i("Alarms");

    public static class a {
        public static void a(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
            alarmManager.setExact(i, j, pendingIntent);
        }
    }

    public static void a(Context context, WorkDatabase workDatabase, ay7 ay7Var) {
        da6 da6VarE = workDatabase.E();
        ca6 ca6VarC = da6VarE.c(ay7Var);
        if (ca6VarC != null) {
            b(context, ay7Var, ca6VarC.c);
            rn3.e().a(a, "Removing SystemIdInfo for workSpecId (" + ay7Var + ")");
            da6VarE.h(ay7Var);
        }
    }

    public static void b(Context context, ay7 ay7Var, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, androidx.work.impl.background.systemalarm.a.b(context, ay7Var), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        rn3.e().a(a, "Cancelling existing alarm with (workSpecId, systemId) (" + ay7Var + ", " + i + ")");
        alarmManager.cancel(service);
    }

    public static void c(Context context, WorkDatabase workDatabase, ay7 ay7Var, long j) {
        da6 da6VarE = workDatabase.E();
        ca6 ca6VarC = da6VarE.c(ay7Var);
        if (ca6VarC != null) {
            b(context, ay7Var, ca6VarC.c);
            d(context, ay7Var, ca6VarC.c, j);
        } else {
            int iC = new bx2(workDatabase).c();
            da6VarE.b(fa6.a(ay7Var, iC));
            d(context, ay7Var, iC, j);
        }
    }

    public static void d(Context context, ay7 ay7Var, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, androidx.work.impl.background.systemalarm.a.b(context, ay7Var), 201326592);
        if (alarmManager != null) {
            a.a(alarmManager, 0, j, service);
        }
    }
}
