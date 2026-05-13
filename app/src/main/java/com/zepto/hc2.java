package com.zepto;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import com.zepto.tu0;
import com.zepto.w30;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class hc2 {
    public static final Object k = new Object();
    public static final Map l = new nx();
    public final Context a;
    public final String b;
    public final gd2 c;
    public final tu0 d;
    public final lb3 g;
    public final nx4 h;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean();
    public final List i = new CopyOnWriteArrayList();
    public final List j = new CopyOnWriteArrayList();

    public interface a {
        void a(boolean z);
    }

    public static class b implements w30.a {
        public static AtomicReference a = new AtomicReference();

        public static void c(Context context) {
            if (ls4.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (a.get() == null) {
                    b bVar = new b();
                    if (bf3.a(a, null, bVar)) {
                        w30.c(application);
                        w30.b().a(bVar);
                    }
                }
            }
        }

        @Override // com.zepto.w30.a
        public void a(boolean z) {
            synchronized (hc2.k) {
                try {
                    for (hc2 hc2Var : new ArrayList(hc2.l.values())) {
                        if (hc2Var.e.get()) {
                            hc2Var.x(z);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static class c extends BroadcastReceiver {
        public static AtomicReference b = new AtomicReference();
        public final Context a;

        public c(Context context) {
            this.a = context;
        }

        public static void b(Context context) {
            if (b.get() == null) {
                c cVar = new c(context);
                if (bf3.a(b, null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (hc2.k) {
                try {
                    Iterator it = hc2.l.values().iterator();
                    while (it.hasNext()) {
                        ((hc2) it.next()).o();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c();
        }
    }

    public hc2(final Context context, String str, gd2 gd2Var) {
        this.a = (Context) iu4.i(context);
        this.b = iu4.e(str);
        this.c = (gd2) iu4.i(gd2Var);
        s66 s66VarB = FirebaseInitProvider.b();
        hd2.b("Firebase");
        hd2.b("ComponentDiscovery");
        List listB = hu0.c(context, ComponentDiscoveryService.class).b();
        hd2.a();
        hd2.b("Runtime");
        tu0.b bVarG = tu0.k(kp6.INSTANCE).d(listB).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(ut0.s(context, Context.class, new Class[0])).b(ut0.s(this, hc2.class, new Class[0])).b(ut0.s(gd2Var, gd2.class, new Class[0])).g(new mu0());
        if (vs6.a(context) && FirebaseInitProvider.c()) {
            bVarG.b(ut0.s(s66VarB, s66.class, new Class[0]));
        }
        tu0 tu0VarE = bVarG.e();
        this.d = tu0VarE;
        hd2.a();
        this.g = new lb3(new nx4() { // from class: com.zepto.fc2
            @Override // com.zepto.nx4
            public final Object get() {
                return this.a.u(context);
            }
        });
        this.h = tu0VarE.g(of1.class);
        g(new a() { // from class: com.zepto.gc2
            @Override // com.zepto.hc2.a
            public final void a(boolean z) {
                this.a.v(z);
            }
        });
        hd2.a();
    }

    public static hc2 k() {
        hc2 hc2Var;
        synchronized (k) {
            try {
                hc2Var = (hc2) l.get("[DEFAULT]");
                if (hc2Var == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + wv4.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((of1) hc2Var.h.get()).l();
            } catch (Throwable th) {
                throw th;
            }
        }
        return hc2Var;
    }

    public static hc2 p(Context context) {
        synchronized (k) {
            try {
                if (l.containsKey("[DEFAULT]")) {
                    return k();
                }
                gd2 gd2VarA = gd2.a(context);
                if (gd2VarA == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return q(context, gd2VarA);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static hc2 q(Context context, gd2 gd2Var) {
        return r(context, gd2Var, "[DEFAULT]");
    }

    public static hc2 r(Context context, gd2 gd2Var, String str) {
        hc2 hc2Var;
        b.c(context);
        String strW = w(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (k) {
            Map map = l;
            iu4.l(!map.containsKey(strW), "FirebaseApp name " + strW + " already exists!");
            iu4.j(context, "Application context cannot be null.");
            hc2Var = new hc2(context, strW, gd2Var);
            map.put(strW, hc2Var);
        }
        hc2Var.o();
        return hc2Var;
    }

    public static String w(String str) {
        return str.trim();
    }

    public boolean equals(Object obj) {
        if (obj instanceof hc2) {
            return this.b.equals(((hc2) obj).l());
        }
        return false;
    }

    public void g(a aVar) {
        h();
        if (this.e.get() && w30.b().d()) {
            aVar.a(true);
        }
        this.i.add(aVar);
    }

    public final void h() {
        iu4.l(!this.f.get(), "FirebaseApp was deleted");
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public Object i(Class cls) {
        h();
        return this.d.a(cls);
    }

    public Context j() {
        h();
        return this.a;
    }

    public String l() {
        h();
        return this.b;
    }

    public gd2 m() {
        h();
        return this.c;
    }

    public String n() {
        return i40.a(l().getBytes(Charset.defaultCharset())) + "+" + i40.a(m().c().getBytes(Charset.defaultCharset()));
    }

    public final void o() {
        if (!vs6.a(this.a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + l());
            c.b(this.a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + l());
        this.d.n(t());
        ((of1) this.h.get()).l();
    }

    public boolean s() {
        h();
        return ((ld1) this.g.get()).b();
    }

    public boolean t() {
        return "[DEFAULT]".equals(l());
    }

    public String toString() {
        return if4.c(this).a("name", this.b).a("options", this.c).toString();
    }

    public final /* synthetic */ ld1 u(Context context) {
        return new ld1(context, n(), (xx4) this.d.a(xx4.class));
    }

    public final /* synthetic */ void v(boolean z) {
        if (z) {
            return;
        }
        ((of1) this.h.get()).l();
    }

    public final void x(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(z);
        }
    }
}
