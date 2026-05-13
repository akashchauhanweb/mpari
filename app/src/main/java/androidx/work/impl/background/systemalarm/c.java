package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.d;
import com.zepto.ay7;
import com.zepto.ch1;
import com.zepto.dh1;
import com.zepto.e43;
import com.zepto.ej6;
import com.zepto.fz7;
import com.zepto.jx7;
import com.zepto.kx7;
import com.zepto.mg4;
import com.zepto.nx0;
import com.zepto.o66;
import com.zepto.pu7;
import com.zepto.rn3;
import com.zepto.sz0;
import com.zepto.yy7;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class c implements mg4, fz7.a {
    public static final String o = rn3.i("DelayMetCommandHandler");
    public final Context a;
    public final int b;
    public final ay7 c;
    public final d d;
    public final jx7 e;
    public final Object f;
    public int g;
    public final Executor h;
    public final Executor i;
    public PowerManager.WakeLock j;
    public boolean k;
    public final o66 l;
    public final sz0 m;
    public volatile e43 n;

    public c(Context context, int i, d dVar, o66 o66Var) {
        this.a = context;
        this.b = i;
        this.d = dVar;
        this.c = o66Var.a();
        this.l = o66Var;
        ej6 ej6VarM = dVar.g().m();
        this.h = dVar.f().b();
        this.i = dVar.f().a();
        this.m = dVar.f().d();
        this.e = new jx7(ej6VarM);
        this.k = false;
        this.g = 0;
        this.f = new Object();
    }

    @Override // com.zepto.fz7.a
    public void a(ay7 ay7Var) {
        rn3.e().a(o, "Exceeded time limits on execution for " + ay7Var);
        this.h.execute(new ch1(this));
    }

    @Override // com.zepto.mg4
    public void b(yy7 yy7Var, nx0 nx0Var) {
        if (nx0Var instanceof nx0.a) {
            this.h.execute(new dh1(this));
        } else {
            this.h.execute(new ch1(this));
        }
    }

    public final void e() {
        synchronized (this.f) {
            try {
                if (this.n != null) {
                    this.n.d(null);
                }
                this.d.h().b(this.c);
                PowerManager.WakeLock wakeLock = this.j;
                if (wakeLock != null && wakeLock.isHeld()) {
                    rn3.e().a(o, "Releasing wakelock " + this.j + "for WorkSpec " + this.c);
                    this.j.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f() {
        String strB = this.c.b();
        this.j = pu7.b(this.a, strB + " (" + this.b + ")");
        rn3 rn3VarE = rn3.e();
        String str = o;
        rn3VarE.a(str, "Acquiring wakelock " + this.j + "for WorkSpec " + strB);
        this.j.acquire();
        yy7 yy7VarM = this.d.g().n().H().m(strB);
        if (yy7VarM == null) {
            this.h.execute(new ch1(this));
            return;
        }
        boolean zI = yy7VarM.i();
        this.k = zI;
        if (zI) {
            this.n = kx7.b(this.e, yy7VarM, this.m, this);
            return;
        }
        rn3.e().a(str, "No constraints for " + strB);
        this.h.execute(new dh1(this));
    }

    public void g(boolean z) {
        rn3.e().a(o, "onExecuted " + this.c + ", " + z);
        e();
        if (z) {
            this.i.execute(new d.b(this.d, a.e(this.a, this.c), this.b));
        }
        if (this.k) {
            this.i.execute(new d.b(this.d, a.a(this.a), this.b));
        }
    }

    public final void h() {
        if (this.g != 0) {
            rn3.e().a(o, "Already started work for " + this.c);
            return;
        }
        this.g = 1;
        rn3.e().a(o, "onAllConstraintsMet for " + this.c);
        if (this.d.e().r(this.l)) {
            this.d.h().a(this.c, 600000L, this);
        } else {
            e();
        }
    }

    public final void i() {
        String strB = this.c.b();
        if (this.g >= 2) {
            rn3.e().a(o, "Already stopped work for " + strB);
            return;
        }
        this.g = 2;
        rn3 rn3VarE = rn3.e();
        String str = o;
        rn3VarE.a(str, "Stopping work for WorkSpec " + strB);
        this.i.execute(new d.b(this.d, a.f(this.a, this.c), this.b));
        if (!this.d.e().k(this.c.b())) {
            rn3.e().a(str, "Processor does not have WorkSpec " + strB + ". No need to reschedule");
            return;
        }
        rn3.e().a(str, "WorkSpec " + strB + " needs to be rescheduled");
        this.i.execute(new d.b(this.d, a.e(this.a, this.c), this.b));
    }
}
