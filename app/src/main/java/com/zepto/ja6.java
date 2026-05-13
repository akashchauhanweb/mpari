package com.zepto;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.zepto.lx0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class ja6 {
    public static final String c = rn3.i("SystemJobInfoConverter");
    public final ComponentName a;
    public final xq0 b;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[s44.values().length];
            a = iArr;
            try {
                iArr[s44.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[s44.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[s44.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[s44.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[s44.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public ja6(Context context, xq0 xq0Var) {
        this.b = xq0Var;
        this.a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }

    public static JobInfo.TriggerContentUri b(lx0.c cVar) {
        return new JobInfo.TriggerContentUri(cVar.a(), cVar.b() ? 1 : 0);
    }

    public static int c(s44 s44Var) {
        int i = a.a[s44Var.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 5) {
            return 4;
        }
        rn3.e().a(c, "API version too low. Cannot convert network type value " + s44Var);
        return 1;
    }

    public static void d(JobInfo.Builder builder, s44 s44Var) {
        if (Build.VERSION.SDK_INT < 30 || s44Var != s44.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(c(s44Var));
        } else {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    public JobInfo a(yy7 yy7Var, int i) {
        lx0 lx0Var = yy7Var.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", yy7Var.a);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", yy7Var.d());
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", yy7Var.k());
        JobInfo.Builder extras = new JobInfo.Builder(i, this.a).setRequiresCharging(lx0Var.g()).setRequiresDeviceIdle(lx0Var.h()).setExtras(persistableBundle);
        d(extras, lx0Var.d());
        if (!lx0Var.h()) {
            extras.setBackoffCriteria(yy7Var.m, yy7Var.l == x30.LINEAR ? 0 : 1);
        }
        long jMax = Math.max(yy7Var.c() - this.b.a(), 0L);
        if (Build.VERSION.SDK_INT <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!yy7Var.q) {
            extras.setImportantWhileForeground(true);
        }
        if (lx0Var.e()) {
            Iterator it = lx0Var.c().iterator();
            while (it.hasNext()) {
                extras.addTriggerContentUri(b((lx0.c) it.next()));
            }
            extras.setTriggerContentUpdateDelay(lx0Var.b());
            extras.setTriggerContentMaxDelay(lx0Var.a());
        }
        extras.setPersisted(false);
        int i2 = Build.VERSION.SDK_INT;
        extras.setRequiresBatteryNotLow(lx0Var.f());
        extras.setRequiresStorageNotLow(lx0Var.i());
        boolean z = yy7Var.k > 0;
        boolean z2 = jMax > 0;
        if (i2 >= 31 && yy7Var.q && !z && !z2) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
