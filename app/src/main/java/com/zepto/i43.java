package com.zepto;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;

/* JADX INFO: loaded from: classes.dex */
public class i43 implements vy7 {
    public final Context a;
    public final d52 b;
    public final so5 c;

    public i43(Context context, d52 d52Var, so5 so5Var) {
        this.a = context;
        this.b = d52Var;
        this.c = so5Var;
    }

    @Override // com.zepto.vy7
    public void a(qn6 qn6Var, int i) {
        b(qn6Var, i, false);
    }

    @Override // com.zepto.vy7
    public void b(qn6 qn6Var, int i, boolean z) {
        ComponentName componentName = new ComponentName(this.a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.a.getSystemService("jobscheduler");
        int iC = c(qn6Var);
        if (!z && d(jobScheduler, iC, i)) {
            yn3.a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", qn6Var);
            return;
        }
        long jI0 = this.b.i0(qn6Var);
        JobInfo.Builder builderC = this.c.c(new JobInfo.Builder(iC, componentName), qn6Var.d(), jI0, i);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", qn6Var.b());
        persistableBundle.putInt("priority", pv4.a(qn6Var.d()));
        if (qn6Var.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(qn6Var.c(), 0));
        }
        builderC.setExtras(persistableBundle);
        yn3.b("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", qn6Var, Integer.valueOf(iC), Long.valueOf(this.c.g(qn6Var.d(), jI0, i)), Long.valueOf(jI0), Integer.valueOf(i));
        jobScheduler.schedule(builderC.build());
    }

    public int c(qn6 qn6Var) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(qn6Var.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(pv4.a(qn6Var.d())).array());
        if (qn6Var.c() != null) {
            adler32.update(qn6Var.c());
        }
        return (int) adler32.getValue();
    }

    public final boolean d(JobScheduler jobScheduler, int i, int i2) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i3 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i) {
                return i3 >= i2;
            }
        }
        return false;
    }
}
