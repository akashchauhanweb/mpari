package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.zepto.pv4;
import com.zepto.qn6;
import com.zepto.xn6;

/* JADX INFO: loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    public final /* synthetic */ void b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        xn6.f(getApplicationContext());
        qn6.a aVarD = qn6.a().b(string).d(pv4.b(i));
        if (string2 != null) {
            aVarD.c(Base64.decode(string2, 0));
        }
        xn6.c().e().v(aVarD.a(), i2, new Runnable() { // from class: com.zepto.j43
            @Override // java.lang.Runnable
            public final void run() {
                this.c.b(jobParameters);
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
