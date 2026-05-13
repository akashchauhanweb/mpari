package com.zepto;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class ka6 implements ro5 {
    public static final String f = rn3.i("SystemJobScheduler");
    public final Context a;
    public final JobScheduler b;
    public final ja6 c;
    public final WorkDatabase d;
    public final androidx.work.a e;

    public ka6(Context context, WorkDatabase workDatabase, androidx.work.a aVar) {
        this(context, workDatabase, aVar, (JobScheduler) context.getSystemService("jobscheduler"), new ja6(context, aVar.a()));
    }

    public static void b(Context context) {
        List listG;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (listG = g(context, jobScheduler)) == null || listG.isEmpty()) {
            return;
        }
        Iterator it = listG.iterator();
        while (it.hasNext()) {
            d(jobScheduler, ((JobInfo) it.next()).getId());
        }
    }

    public static void d(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            rn3.e().d(f, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    public static List f(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> listG = g(context, jobScheduler);
        if (listG == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : listG) {
            ay7 ay7VarH = h(jobInfo);
            if (ay7VarH != null && str.equals(ay7VarH.b())) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    public static List g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            rn3.e().d(f, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static ay7 h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new ay7(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static boolean i(Context context, WorkDatabase workDatabase) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> listG = g(context, jobScheduler);
        List listA = workDatabase.E().a();
        boolean z = false;
        HashSet hashSet = new HashSet(listG != null ? listG.size() : 0);
        if (listG != null && !listG.isEmpty()) {
            for (JobInfo jobInfo : listG) {
                ay7 ay7VarH = h(jobInfo);
                if (ay7VarH != null) {
                    hashSet.add(ay7VarH.b());
                } else {
                    d(jobScheduler, jobInfo.getId());
                }
            }
        }
        Iterator it = listA.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!hashSet.contains((String) it.next())) {
                rn3.e().a(f, "Reconciling jobs");
                z = true;
                break;
            }
        }
        if (z) {
            workDatabase.e();
            try {
                zy7 zy7VarH = workDatabase.H();
                Iterator it2 = listA.iterator();
                while (it2.hasNext()) {
                    zy7VarH.f((String) it2.next(), -1L);
                }
                workDatabase.A();
                workDatabase.i();
            } catch (Throwable th) {
                workDatabase.i();
                throw th;
            }
        }
        return z;
    }

    @Override // com.zepto.ro5
    public void a(String str) {
        List listF = f(this.a, this.b, str);
        if (listF == null || listF.isEmpty()) {
            return;
        }
        Iterator it = listF.iterator();
        while (it.hasNext()) {
            d(this.b, ((Integer) it.next()).intValue());
        }
        this.d.E().f(str);
    }

    @Override // com.zepto.ro5
    public void c(yy7... yy7VarArr) {
        bx2 bx2Var = new bx2(this.d);
        for (yy7 yy7Var : yy7VarArr) {
            this.d.e();
            try {
                yy7 yy7VarM = this.d.H().m(yy7Var.a);
                if (yy7VarM == null) {
                    rn3.e().k(f, "Skipping scheduling " + yy7Var.a + " because it's no longer in the DB");
                    this.d.A();
                } else if (yy7VarM.b != by7.ENQUEUED) {
                    rn3.e().k(f, "Skipping scheduling " + yy7Var.a + " because it is no longer enqueued");
                    this.d.A();
                } else {
                    ay7 ay7VarA = bz7.a(yy7Var);
                    ca6 ca6VarC = this.d.E().c(ay7VarA);
                    int iE = ca6VarC != null ? ca6VarC.c : bx2Var.e(this.e.i(), this.e.g());
                    if (ca6VarC == null) {
                        this.d.E().b(fa6.a(ay7VarA, iE));
                    }
                    j(yy7Var, iE);
                    this.d.A();
                }
            } finally {
                this.d.i();
            }
        }
    }

    @Override // com.zepto.ro5
    public boolean e() {
        return true;
    }

    public void j(yy7 yy7Var, int i) {
        JobInfo jobInfoA = this.c.a(yy7Var, i);
        rn3 rn3VarE = rn3.e();
        String str = f;
        rn3VarE.a(str, "Scheduling work ID " + yy7Var.a + "Job ID " + i);
        try {
            if (this.b.schedule(jobInfoA) == 0) {
                rn3.e().k(str, "Unable to schedule work ID " + yy7Var.a);
                if (yy7Var.q && yy7Var.r == ij4.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    yy7Var.q = false;
                    rn3.e().a(str, String.format("Scheduling a non-expedited job (work ID %s)", yy7Var.a));
                    j(yy7Var, i);
                }
            }
        } catch (IllegalStateException e) {
            List listG = g(this.a, this.b);
            String str2 = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(listG != null ? listG.size() : 0), Integer.valueOf(this.d.H().u().size()), Integer.valueOf(this.e.h()));
            rn3.e().c(f, str2);
            IllegalStateException illegalStateException = new IllegalStateException(str2, e);
            ux0 ux0VarL = this.e.l();
            if (ux0VarL == null) {
                throw illegalStateException;
            }
            ux0VarL.a(illegalStateException);
        } catch (Throwable th) {
            rn3.e().d(f, "Unable to schedule " + yy7Var, th);
        }
    }

    public ka6(Context context, WorkDatabase workDatabase, androidx.work.a aVar, JobScheduler jobScheduler, ja6 ja6Var) {
        this.a = context;
        this.b = jobScheduler;
        this.c = ja6Var;
        this.d = workDatabase;
        this.e = aVar;
    }
}
