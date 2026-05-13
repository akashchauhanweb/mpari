package androidx.work.impl.utils;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import com.zepto.by7;
import com.zepto.jy7;
import com.zepto.ka6;
import com.zepto.me2;
import com.zepto.pu4;
import com.zepto.px7;
import com.zepto.qy7;
import com.zepto.rn3;
import com.zepto.ux0;
import com.zepto.vs6;
import com.zepto.xo5;
import com.zepto.xv4;
import com.zepto.yy7;
import com.zepto.zy7;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class ForceStopRunnable implements Runnable {
    public static final String h = rn3.i("ForceStopRunnable");
    public static final long i = TimeUnit.DAYS.toMillis(3650);
    public final Context c;
    public final jy7 e;
    public final pu4 f;
    public int g = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        public static final String a = rn3.i("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            rn3.e().j(a, "Rescheduling alarm that keeps track of force-stops.");
            ForceStopRunnable.g(context);
        }
    }

    public ForceStopRunnable(Context context, jy7 jy7Var) {
        this.c = context.getApplicationContext();
        this.e = jy7Var;
        this.f = jy7Var.j();
    }

    public static Intent c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    public static PendingIntent d(Context context, int i2) {
        return PendingIntent.getBroadcast(context, -1, c(context), i2);
    }

    public static void g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent pendingIntentD = d(context, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
        long jCurrentTimeMillis = System.currentTimeMillis() + i;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, pendingIntentD);
        }
    }

    public boolean a() {
        boolean zI = ka6.i(this.c, this.e.n());
        WorkDatabase workDatabaseN = this.e.n();
        zy7 zy7VarH = workDatabaseN.H();
        qy7 qy7VarG = workDatabaseN.G();
        workDatabaseN.e();
        try {
            List<yy7> listC = zy7VarH.c();
            boolean z = (listC == null || listC.isEmpty()) ? false : true;
            if (z) {
                for (yy7 yy7Var : listC) {
                    zy7VarH.y(by7.ENQUEUED, yy7Var.a);
                    zy7VarH.n(yy7Var.a, -512);
                    zy7VarH.f(yy7Var.a, -1L);
                }
            }
            qy7VarG.b();
            workDatabaseN.A();
            workDatabaseN.i();
            return z || zI;
        } catch (Throwable th) {
            workDatabaseN.i();
            throw th;
        }
    }

    public void b() {
        boolean zA = a();
        if (h()) {
            rn3.e().a(h, "Rescheduling Workers.");
            this.e.q();
            this.e.j().e(false);
        } else if (e()) {
            rn3.e().a(h, "Application was force-stopped, rescheduling.");
            this.e.q();
            this.f.d(this.e.g().a().a());
        } else if (zA) {
            rn3.e().a(h, "Found unfinished work, scheduling it.");
            xo5.h(this.e.g(), this.e.n(), this.e.l());
        }
    }

    public boolean e() {
        try {
            int i2 = Build.VERSION.SDK_INT;
            PendingIntent pendingIntentD = d(this.c, i2 >= 31 ? 570425344 : 536870912);
            if (i2 >= 30) {
                if (pendingIntentD != null) {
                    pendingIntentD.cancel();
                }
                List historicalProcessExitReasons = ((ActivityManager) this.c.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    long jA = this.f.a();
                    for (int i3 = 0; i3 < historicalProcessExitReasons.size(); i3++) {
                        ApplicationExitInfo applicationExitInfoA = me2.a(historicalProcessExitReasons.get(i3));
                        if (applicationExitInfoA.getReason() == 10 && applicationExitInfoA.getTimestamp() >= jA) {
                            return true;
                        }
                    }
                }
            } else if (pendingIntentD == null) {
                g(this.c);
                return true;
            }
            return false;
        } catch (IllegalArgumentException e) {
            e = e;
            rn3.e().l(h, "Ignoring exception", e);
            return true;
        } catch (SecurityException e2) {
            e = e2;
            rn3.e().l(h, "Ignoring exception", e);
            return true;
        }
    }

    public boolean f() {
        a aVarG = this.e.g();
        if (TextUtils.isEmpty(aVarG.c())) {
            rn3.e().a(h, "The default process name was not specified.");
            return true;
        }
        boolean zB = xv4.b(this.c, aVarG);
        rn3.e().a(h, "Is default app process = " + zB);
        return zB;
    }

    public boolean h() {
        return this.e.j().b();
    }

    public void i(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i2;
        try {
            if (f()) {
                while (true) {
                    try {
                        px7.d(this.c);
                        rn3.e().a(h, "Performing cleanup operations.");
                        try {
                            b();
                            break;
                        } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e) {
                            i2 = this.g + 1;
                            this.g = i2;
                            if (i2 >= 3) {
                                String str = vs6.a(this.c) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                                rn3 rn3VarE = rn3.e();
                                String str2 = h;
                                rn3VarE.d(str2, str, e);
                                IllegalStateException illegalStateException = new IllegalStateException(str, e);
                                ux0 ux0VarE = this.e.g().e();
                                if (ux0VarE == null) {
                                    throw illegalStateException;
                                }
                                rn3.e().b(str2, "Routing exception to the specified exception handler", illegalStateException);
                                ux0VarE.a(illegalStateException);
                            } else {
                                rn3.e().b(h, "Retrying after " + (((long) i2) * 300), e);
                                i(((long) this.g) * 300);
                            }
                        }
                        rn3.e().b(h, "Retrying after " + (((long) i2) * 300), e);
                        i(((long) this.g) * 300);
                    } catch (SQLiteException e2) {
                        rn3.e().c(h, "Unexpected SQLite exception during migrations");
                        IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e2);
                        ux0 ux0VarE2 = this.e.g().e();
                        if (ux0VarE2 == null) {
                            throw illegalStateException2;
                        }
                        ux0VarE2.a(illegalStateException2);
                    }
                }
            }
        } finally {
            this.e.p();
        }
    }
}
