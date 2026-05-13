package com.zepto;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.zepto.l44;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public class ok1 {
    public final b a;
    public final Context b;
    public final ExecutorService c;
    public final sw1 d;
    public final Map e;
    public final Map f;
    public final Map g;
    public final Set h;
    public final Handler i;
    public final Handler j;
    public final h90 k;
    public final f76 l;
    public final List m;
    public final c n;
    public final boolean o;
    public boolean p;

    public static class a extends Handler {
        public final ok1 a;

        /* JADX INFO: renamed from: com.zepto.ok1$a$a, reason: collision with other inner class name */
        public class RunnableC0111a implements Runnable {
            public final /* synthetic */ Message c;

            public RunnableC0111a(Message message) {
                this.c = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new AssertionError("Unknown handler message received: " + this.c.what);
            }
        }

        public a(Looper looper, ok1 ok1Var) {
            super(looper);
            this.a = ok1Var;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    this.a.v((s5) message.obj);
                    break;
                case 2:
                    this.a.o((s5) message.obj);
                    break;
                case 3:
                case 8:
                default:
                    ds4.o.post(new RunnableC0111a(message));
                    break;
                case 4:
                    this.a.p((t60) message.obj);
                    break;
                case 5:
                    this.a.u((t60) message.obj);
                    break;
                case 6:
                    this.a.q((t60) message.obj, false);
                    break;
                case 7:
                    this.a.n();
                    break;
                case 9:
                    this.a.r((NetworkInfo) message.obj);
                    break;
                case 10:
                    this.a.m(message.arg1 == 1);
                    break;
                case 11:
                    this.a.s(message.obj);
                    break;
                case 12:
                    this.a.t(message.obj);
                    break;
            }
        }
    }

    public static class b extends HandlerThread {
        public b() {
            super("Picasso-Dispatcher", 10);
        }
    }

    public static class c extends BroadcastReceiver {
        public final ok1 a;

        public c(ok1 ok1Var) {
            this.a = ok1Var;
        }

        public void a() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
            if (this.a.o) {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
            this.a.b.registerReceiver(this, intentFilter);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                if (intent.hasExtra("state")) {
                    this.a.b(intent.getBooleanExtra("state", false));
                }
            } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                this.a.f(((ConnectivityManager) nt6.n(context, "connectivity")).getActiveNetworkInfo());
            }
        }
    }

    public ok1(Context context, ExecutorService executorService, Handler handler, sw1 sw1Var, h90 h90Var, f76 f76Var) {
        b bVar = new b();
        this.a = bVar;
        bVar.start();
        nt6.h(bVar.getLooper());
        this.b = context;
        this.c = executorService;
        this.e = new LinkedHashMap();
        this.f = new WeakHashMap();
        this.g = new WeakHashMap();
        this.h = new LinkedHashSet();
        this.i = new a(bVar.getLooper(), this);
        this.d = sw1Var;
        this.j = handler;
        this.k = h90Var;
        this.l = f76Var;
        this.m = new ArrayList(4);
        this.p = nt6.p(context);
        this.o = nt6.o(context, "android.permission.ACCESS_NETWORK_STATE");
        c cVar = new c(this);
        this.n = cVar;
        cVar.a();
    }

    public final void a(t60 t60Var) {
        if (t60Var.u()) {
            return;
        }
        Bitmap bitmap = t60Var.p;
        if (bitmap != null) {
            bitmap.prepareToDraw();
        }
        this.m.add(t60Var);
        if (this.i.hasMessages(7)) {
            return;
        }
        this.i.sendEmptyMessageDelayed(7, 200L);
    }

    public void b(boolean z) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(10, z ? 1 : 0, 0));
    }

    public void c(s5 s5Var) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(2, s5Var));
    }

    public void d(t60 t60Var) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(4, t60Var));
    }

    public void e(t60 t60Var) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(6, t60Var));
    }

    public void f(NetworkInfo networkInfo) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(9, networkInfo));
    }

    public void g(t60 t60Var) {
        Handler handler = this.i;
        handler.sendMessageDelayed(handler.obtainMessage(5, t60Var), 500L);
    }

    public void h(s5 s5Var) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(1, s5Var));
    }

    public final void i() {
        if (this.f.isEmpty()) {
            return;
        }
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            s5 s5Var = (s5) it.next();
            it.remove();
            if (s5Var.g().m) {
                nt6.s("Dispatcher", "replaying", s5Var.i().d());
            }
            w(s5Var, false);
        }
    }

    public final void j(List list) {
        if (list == null || list.isEmpty() || !((t60) list.get(0)).q().m) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            t60 t60Var = (t60) it.next();
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(nt6.j(t60Var));
        }
        nt6.s("Dispatcher", "delivered", sb.toString());
    }

    public final void k(s5 s5Var) {
        Object objK = s5Var.k();
        if (objK != null) {
            s5Var.k = true;
            this.f.put(objK, s5Var);
        }
    }

    public final void l(t60 t60Var) {
        s5 s5VarH = t60Var.h();
        if (s5VarH != null) {
            k(s5VarH);
        }
        List listI = t60Var.i();
        if (listI != null) {
            int size = listI.size();
            for (int i = 0; i < size; i++) {
                k((s5) listI.get(i));
            }
        }
    }

    public void m(boolean z) {
        this.p = z;
    }

    public void n() {
        ArrayList arrayList = new ArrayList(this.m);
        this.m.clear();
        Handler handler = this.j;
        handler.sendMessage(handler.obtainMessage(8, arrayList));
        j(arrayList);
    }

    public void o(s5 s5Var) {
        String strD = s5Var.d();
        t60 t60Var = (t60) this.e.get(strD);
        if (t60Var != null) {
            t60Var.f(s5Var);
            if (t60Var.c()) {
                this.e.remove(strD);
                if (s5Var.g().m) {
                    nt6.s("Dispatcher", "canceled", s5Var.i().d());
                }
            }
        }
        if (this.h.contains(s5Var.j())) {
            this.g.remove(s5Var.k());
            if (s5Var.g().m) {
                nt6.t("Dispatcher", "canceled", s5Var.i().d(), "because paused request got canceled");
            }
        }
        s5 s5Var2 = (s5) this.f.remove(s5Var.k());
        if (s5Var2 == null || !s5Var2.g().m) {
            return;
        }
        nt6.t("Dispatcher", "canceled", s5Var2.i().d(), "from replaying");
    }

    public void p(t60 t60Var) {
        if (os3.b(t60Var.p())) {
            this.k.b(t60Var.n(), t60Var.s());
        }
        this.e.remove(t60Var.n());
        a(t60Var);
        if (t60Var.q().m) {
            nt6.t("Dispatcher", "batched", nt6.j(t60Var), "for completion");
        }
    }

    public void q(t60 t60Var, boolean z) {
        if (t60Var.q().m) {
            String strJ = nt6.j(t60Var);
            StringBuilder sb = new StringBuilder();
            sb.append("for error");
            sb.append(z ? " (will replay)" : "");
            nt6.t("Dispatcher", "batched", strJ, sb.toString());
        }
        this.e.remove(t60Var.n());
        a(t60Var);
    }

    public void r(NetworkInfo networkInfo) {
        ExecutorService executorService = this.c;
        if (executorService instanceof fs4) {
            ((fs4) executorService).a(networkInfo);
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return;
        }
        i();
    }

    public void s(Object obj) {
        if (this.h.add(obj)) {
            Iterator it = this.e.values().iterator();
            while (it.hasNext()) {
                t60 t60Var = (t60) it.next();
                boolean z = t60Var.q().m;
                s5 s5VarH = t60Var.h();
                List listI = t60Var.i();
                boolean z2 = (listI == null || listI.isEmpty()) ? false : true;
                if (s5VarH != null || z2) {
                    if (s5VarH != null && s5VarH.j().equals(obj)) {
                        t60Var.f(s5VarH);
                        this.g.put(s5VarH.k(), s5VarH);
                        if (z) {
                            nt6.t("Dispatcher", "paused", s5VarH.b.d(), "because tag '" + obj + "' was paused");
                        }
                    }
                    if (z2) {
                        for (int size = listI.size() - 1; size >= 0; size--) {
                            s5 s5Var = (s5) listI.get(size);
                            if (s5Var.j().equals(obj)) {
                                t60Var.f(s5Var);
                                this.g.put(s5Var.k(), s5Var);
                                if (z) {
                                    nt6.t("Dispatcher", "paused", s5Var.b.d(), "because tag '" + obj + "' was paused");
                                }
                            }
                        }
                    }
                    if (t60Var.c()) {
                        it.remove();
                        if (z) {
                            nt6.t("Dispatcher", "canceled", nt6.j(t60Var), "all actions paused");
                        }
                    }
                }
            }
        }
    }

    public void t(Object obj) {
        if (this.h.remove(obj)) {
            Iterator it = this.g.values().iterator();
            ArrayList arrayList = null;
            while (it.hasNext()) {
                s5 s5Var = (s5) it.next();
                if (s5Var.j().equals(obj)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(s5Var);
                    it.remove();
                }
            }
            if (arrayList != null) {
                Handler handler = this.j;
                handler.sendMessage(handler.obtainMessage(13, arrayList));
            }
        }
    }

    public void u(t60 t60Var) {
        if (t60Var.u()) {
            return;
        }
        boolean z = false;
        if (this.c.isShutdown()) {
            q(t60Var, false);
            return;
        }
        if (t60Var.w(this.p, this.o ? ((ConnectivityManager) nt6.n(this.b, "connectivity")).getActiveNetworkInfo() : null)) {
            if (t60Var.q().m) {
                nt6.s("Dispatcher", "retrying", nt6.j(t60Var));
            }
            if (t60Var.k() instanceof l44.a) {
                t60Var.l |= k44.NO_CACHE.c;
            }
            t60Var.q = this.c.submit(t60Var);
            return;
        }
        if (this.o && t60Var.x()) {
            z = true;
        }
        q(t60Var, z);
        if (z) {
            l(t60Var);
        }
    }

    public void v(s5 s5Var) {
        w(s5Var, true);
    }

    public void w(s5 s5Var, boolean z) {
        if (this.h.contains(s5Var.j())) {
            this.g.put(s5Var.k(), s5Var);
            if (s5Var.g().m) {
                nt6.t("Dispatcher", "paused", s5Var.b.d(), "because tag '" + s5Var.j() + "' is paused");
                return;
            }
            return;
        }
        t60 t60Var = (t60) this.e.get(s5Var.d());
        if (t60Var != null) {
            t60Var.b(s5Var);
            return;
        }
        if (this.c.isShutdown()) {
            if (s5Var.g().m) {
                nt6.t("Dispatcher", "ignored", s5Var.b.d(), "because shut down");
                return;
            }
            return;
        }
        t60 t60VarG = t60.g(s5Var.g(), this, this.k, this.l, s5Var);
        t60VarG.q = this.c.submit(t60VarG);
        this.e.put(s5Var.d(), t60VarG);
        if (z) {
            this.f.remove(s5Var.k());
        }
        if (s5Var.g().m) {
            nt6.s("Dispatcher", "enqueued", s5Var.b.d());
        }
    }
}
