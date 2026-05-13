package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.WorkerParameters;
import com.zepto.ay7;
import com.zepto.bw4;
import com.zepto.gy7;
import com.zepto.hy7;
import com.zepto.jy7;
import com.zepto.o66;
import com.zepto.p66;
import com.zepto.rn3;
import com.zepto.x52;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements x52 {
    public static final String e = rn3.i("SystemJobService");
    public jy7 a;
    public final Map b = new HashMap();
    public final p66 c = new p66();
    public gy7 d;

    public static class a {
        public static String[] a(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentAuthorities();
        }

        public static Uri[] b(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentUris();
        }
    }

    public static class b {
        public static Network a(JobParameters jobParameters) {
            return jobParameters.getNetwork();
        }
    }

    public static class c {
        public static int a(JobParameters jobParameters) {
            return SystemJobService.a(jobParameters.getStopReason());
        }
    }

    public static int a(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return i;
            default:
                return -512;
        }
    }

    public static ay7 b(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new ay7(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // com.zepto.x52
    public void d(ay7 ay7Var, boolean z) {
        JobParameters jobParameters;
        rn3.e().a(e, ay7Var.b() + " executed on JobScheduler");
        synchronized (this.b) {
            jobParameters = (JobParameters) this.b.remove(ay7Var);
        }
        this.c.b(ay7Var);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            jy7 jy7VarI = jy7.i(getApplicationContext());
            this.a = jy7VarI;
            bw4 bw4VarK = jy7VarI.k();
            this.d = new hy7(bw4VarK, this.a.o());
            bw4VarK.e(this);
        } catch (IllegalStateException e2) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e2);
            }
            rn3.e().k(e, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        jy7 jy7Var = this.a;
        if (jy7Var != null) {
            jy7Var.k().p(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        if (this.a == null) {
            rn3.e().a(e, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        ay7 ay7VarB = b(jobParameters);
        if (ay7VarB == null) {
            rn3.e().c(e, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.b) {
            try {
                if (this.b.containsKey(ay7VarB)) {
                    rn3.e().a(e, "Job is already being executed by SystemJobService: " + ay7VarB);
                    return false;
                }
                rn3.e().a(e, "onStartJob for " + ay7VarB);
                this.b.put(ay7VarB, jobParameters);
                int i = Build.VERSION.SDK_INT;
                WorkerParameters.a aVar = new WorkerParameters.a();
                if (a.b(jobParameters) != null) {
                    aVar.b = Arrays.asList(a.b(jobParameters));
                }
                if (a.a(jobParameters) != null) {
                    aVar.a = Arrays.asList(a.a(jobParameters));
                }
                if (i >= 28) {
                    aVar.c = b.a(jobParameters);
                }
                this.d.d(this.c.d(ay7VarB), aVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        if (this.a == null) {
            rn3.e().a(e, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        ay7 ay7VarB = b(jobParameters);
        if (ay7VarB == null) {
            rn3.e().c(e, "WorkSpec id not found!");
            return false;
        }
        rn3.e().a(e, "onStopJob for " + ay7VarB);
        synchronized (this.b) {
            this.b.remove(ay7VarB);
        }
        o66 o66VarB = this.c.b(ay7VarB);
        if (o66VarB != null) {
            this.d.a(o66VarB, Build.VERSION.SDK_INT >= 31 ? c.a(jobParameters) : -512);
        }
        return !this.a.k().j(ay7VarB.b());
    }
}
