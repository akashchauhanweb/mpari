package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.d;
import com.zepto.ay7;
import com.zepto.o66;
import com.zepto.p66;
import com.zepto.rn3;
import com.zepto.vn;
import com.zepto.x52;
import com.zepto.xq0;
import com.zepto.yy7;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class a implements x52 {
    public static final String f = rn3.i("CommandHandler");
    public final Context a;
    public final Map b = new HashMap();
    public final Object c = new Object();
    public final xq0 d;
    public final p66 e;

    public a(Context context, xq0 xq0Var, p66 p66Var) {
        this.a = context;
        this.d = xq0Var;
        this.e = p66Var;
    }

    public static Intent a(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    public static Intent b(Context context, ay7 ay7Var) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        return q(intent, ay7Var);
    }

    public static Intent c(Context context, ay7 ay7Var, boolean z) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        return q(intent, ay7Var);
    }

    public static Intent e(Context context, ay7 ay7Var) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        return q(intent, ay7Var);
    }

    public static Intent f(Context context, ay7 ay7Var) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        return q(intent, ay7Var);
    }

    public static boolean m(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    public static ay7 p(Intent intent) {
        return new ay7(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static Intent q(Intent intent, ay7 ay7Var) {
        intent.putExtra("KEY_WORKSPEC_ID", ay7Var.b());
        intent.putExtra("KEY_WORKSPEC_GENERATION", ay7Var.a());
        return intent;
    }

    @Override // com.zepto.x52
    public void d(ay7 ay7Var, boolean z) {
        synchronized (this.c) {
            try {
                c cVar = (c) this.b.remove(ay7Var);
                this.e.b(ay7Var);
                if (cVar != null) {
                    cVar.g(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(Intent intent, int i, d dVar) {
        rn3.e().a(f, "Handling constraints changed " + intent);
        new b(this.a, this.d, i, dVar).a();
    }

    public final void h(Intent intent, int i, d dVar) {
        synchronized (this.c) {
            try {
                ay7 ay7VarP = p(intent);
                rn3 rn3VarE = rn3.e();
                String str = f;
                rn3VarE.a(str, "Handing delay met for " + ay7VarP);
                if (this.b.containsKey(ay7VarP)) {
                    rn3.e().a(str, "WorkSpec " + ay7VarP + " is is already being handled for ACTION_DELAY_MET");
                } else {
                    c cVar = new c(this.a, i, dVar, this.e.d(ay7VarP));
                    this.b.put(ay7VarP, cVar);
                    cVar.f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(Intent intent, int i) {
        ay7 ay7VarP = p(intent);
        boolean z = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
        rn3.e().a(f, "Handling onExecutionCompleted " + intent + ", " + i);
        d(ay7VarP, z);
    }

    public final void j(Intent intent, int i, d dVar) {
        rn3.e().a(f, "Handling reschedule " + intent + ", " + i);
        dVar.g().q();
    }

    public final void k(Intent intent, int i, d dVar) {
        ay7 ay7VarP = p(intent);
        rn3 rn3VarE = rn3.e();
        String str = f;
        rn3VarE.a(str, "Handling schedule work for " + ay7VarP);
        WorkDatabase workDatabaseN = dVar.g().n();
        workDatabaseN.e();
        try {
            yy7 yy7VarM = workDatabaseN.H().m(ay7VarP.b());
            if (yy7VarM == null) {
                rn3.e().k(str, "Skipping scheduling " + ay7VarP + " because it's no longer in the DB");
                return;
            }
            if (yy7VarM.b.b()) {
                rn3.e().k(str, "Skipping scheduling " + ay7VarP + "because it is finished.");
                return;
            }
            long jC = yy7VarM.c();
            if (yy7VarM.i()) {
                rn3.e().a(str, "Opportunistically setting an alarm for " + ay7VarP + "at " + jC);
                vn.c(this.a, workDatabaseN, ay7VarP, jC);
                dVar.f().a().execute(new d.b(dVar, a(this.a), i));
            } else {
                rn3.e().a(str, "Setting up Alarms for " + ay7VarP + "at " + jC);
                vn.c(this.a, workDatabaseN, ay7VarP, jC);
            }
            workDatabaseN.A();
        } finally {
            workDatabaseN.i();
        }
    }

    public final void l(Intent intent, d dVar) {
        List<o66> listC;
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        if (extras.containsKey("KEY_WORKSPEC_GENERATION")) {
            int i = extras.getInt("KEY_WORKSPEC_GENERATION");
            listC = new ArrayList(1);
            o66 o66VarB = this.e.b(new ay7(string, i));
            if (o66VarB != null) {
                listC.add(o66VarB);
            }
        } else {
            listC = this.e.c(string);
        }
        for (o66 o66Var : listC) {
            rn3.e().a(f, "Handing stopWork work for " + string);
            dVar.i().e(o66Var);
            vn.a(this.a, dVar.g().n(), o66Var.a());
            dVar.d(o66Var.a(), false);
        }
    }

    public boolean n() {
        boolean z;
        synchronized (this.c) {
            z = !this.b.isEmpty();
        }
        return z;
    }

    public void o(Intent intent, int i, d dVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            g(intent, i, dVar);
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            j(intent, i, dVar);
            return;
        }
        if (!m(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            rn3.e().c(f, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            k(intent, i, dVar);
            return;
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            h(intent, i, dVar);
            return;
        }
        if ("ACTION_STOP_WORK".equals(action)) {
            l(intent, dVar);
            return;
        }
        if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            i(intent, i);
            return;
        }
        rn3.e().k(f, "Ignoring intent " + intent);
    }
}
