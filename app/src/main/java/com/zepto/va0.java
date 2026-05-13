package com.zepto;

import androidx.work.impl.WorkDatabase;
import com.zepto.nh4;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public abstract class va0 implements Runnable {
    public final oh4 c = new oh4();

    public class a extends va0 {
        public final /* synthetic */ jy7 e;
        public final /* synthetic */ UUID f;

        public a(jy7 jy7Var, UUID uuid) {
            this.e = jy7Var;
            this.f = uuid;
        }

        @Override // com.zepto.va0
        public void g() {
            WorkDatabase workDatabaseN = this.e.n();
            workDatabaseN.e();
            try {
                a(this.e, this.f.toString());
                workDatabaseN.A();
                workDatabaseN.i();
                f(this.e);
            } catch (Throwable th) {
                workDatabaseN.i();
                throw th;
            }
        }
    }

    public class b extends va0 {
        public final /* synthetic */ jy7 e;
        public final /* synthetic */ String f;
        public final /* synthetic */ boolean g;

        public b(jy7 jy7Var, String str, boolean z) {
            this.e = jy7Var;
            this.f = str;
            this.g = z;
        }

        @Override // com.zepto.va0
        public void g() {
            WorkDatabase workDatabaseN = this.e.n();
            workDatabaseN.e();
            try {
                Iterator it = workDatabaseN.H().g(this.f).iterator();
                while (it.hasNext()) {
                    a(this.e, (String) it.next());
                }
                workDatabaseN.A();
                workDatabaseN.i();
                if (this.g) {
                    f(this.e);
                }
            } catch (Throwable th) {
                workDatabaseN.i();
                throw th;
            }
        }
    }

    public static va0 b(UUID uuid, jy7 jy7Var) {
        return new a(jy7Var, uuid);
    }

    public static va0 c(String str, jy7 jy7Var, boolean z) {
        return new b(jy7Var, str, z);
    }

    public void a(jy7 jy7Var, String str) {
        e(jy7Var.n(), str);
        jy7Var.k().t(str, 1);
        Iterator it = jy7Var.l().iterator();
        while (it.hasNext()) {
            ((ro5) it.next()).a(str);
        }
    }

    public nh4 d() {
        return this.c;
    }

    public final void e(WorkDatabase workDatabase, String str) {
        zy7 zy7VarH = workDatabase.H();
        ki1 ki1VarC = workDatabase.C();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            by7 by7VarK = zy7VarH.k(str2);
            if (by7VarK != by7.SUCCEEDED && by7VarK != by7.FAILED) {
                zy7VarH.p(str2);
            }
            linkedList.addAll(ki1VarC.d(str2));
        }
    }

    public void f(jy7 jy7Var) {
        xo5.h(jy7Var.g(), jy7Var.n(), jy7Var.l());
    }

    public abstract void g();

    @Override // java.lang.Runnable
    public void run() {
        try {
            g();
            this.c.a(nh4.a);
        } catch (Throwable th) {
            this.c.a(new nh4.b.a(th));
        }
    }
}
