package com.zepto;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import com.squareup.picasso.PicassoProvider;
import com.zepto.s5;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public class ds4 {
    public static final Handler o = new a(Looper.getMainLooper());
    public static volatile ds4 p = null;
    public final g a;
    public final c b;
    public final List c;
    public final Context d;
    public final ok1 e;
    public final h90 f;
    public final f76 g;
    public final Map h;
    public final Map i;
    public final ReferenceQueue j;
    public final Bitmap.Config k;
    public boolean l;
    public volatile boolean m;
    public boolean n;

    public static class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 3) {
                s5 s5Var = (s5) message.obj;
                if (s5Var.g().m) {
                    nt6.t("Main", "canceled", s5Var.b.d(), "target got garbage collected");
                }
                s5Var.a.a(s5Var.k());
                return;
            }
            int i2 = 0;
            if (i == 8) {
                List list = (List) message.obj;
                int size = list.size();
                while (i2 < size) {
                    t60 t60Var = (t60) list.get(i2);
                    t60Var.e.c(t60Var);
                    i2++;
                }
                return;
            }
            if (i != 13) {
                throw new AssertionError("Unknown handler message received: " + message.what);
            }
            List list2 = (List) message.obj;
            int size2 = list2.size();
            while (i2 < size2) {
                s5 s5Var2 = (s5) list2.get(i2);
                s5Var2.a.m(s5Var2);
                i2++;
            }
        }
    }

    public static class b {
        public final Context a;
        public sw1 b;
        public ExecutorService c;
        public h90 d;
        public g e;
        public List f;
        public Bitmap.Config g;
        public boolean h;
        public boolean i;

        public b(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null.");
            }
            this.a = context.getApplicationContext();
        }

        public ds4 a() {
            Context context = this.a;
            if (this.b == null) {
                this.b = new xf4(context);
            }
            if (this.d == null) {
                this.d = new mo3(context);
            }
            if (this.c == null) {
                this.c = new fs4();
            }
            if (this.e == null) {
                this.e = g.a;
            }
            f76 f76Var = new f76(this.d);
            return new ds4(context, new ok1(context, this.c, ds4.o, this.b, this.d, f76Var), this.d, null, this.e, this.f, f76Var, this.g, this.h, this.i);
        }

        public b b(sw1 sw1Var) {
            if (sw1Var == null) {
                throw new IllegalArgumentException("Downloader must not be null.");
            }
            if (this.b != null) {
                throw new IllegalStateException("Downloader already set.");
            }
            this.b = sw1Var;
            return this;
        }
    }

    public static class c extends Thread {
        public final ReferenceQueue c;
        public final Handler e;

        public class a implements Runnable {
            public final /* synthetic */ Exception c;

            public a(Exception exc) {
                this.c = exc;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new RuntimeException(this.c);
            }
        }

        public c(ReferenceQueue referenceQueue, Handler handler) {
            this.c = referenceQueue;
            this.e = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    s5.a aVar = (s5.a) this.c.remove(1000L);
                    Message messageObtainMessage = this.e.obtainMessage();
                    if (aVar != null) {
                        messageObtainMessage.what = 3;
                        messageObtainMessage.obj = aVar.a;
                        this.e.sendMessage(messageObtainMessage);
                    } else {
                        messageObtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e) {
                    this.e.post(new a(e));
                    return;
                }
            }
        }
    }

    public interface d {
    }

    public enum e {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);

        public final int c;

        e(int i) {
            this.c = i;
        }
    }

    public enum f {
        LOW,
        NORMAL,
        HIGH
    }

    public interface g {
        public static final g a = new a();

        public static class a implements g {
            @Override // com.zepto.ds4.g
            public jc5 a(jc5 jc5Var) {
                return jc5Var;
            }
        }

        jc5 a(jc5 jc5Var);
    }

    public ds4(Context context, ok1 ok1Var, h90 h90Var, d dVar, g gVar, List list, f76 f76Var, Bitmap.Config config, boolean z, boolean z2) {
        this.d = context;
        this.e = ok1Var;
        this.f = h90Var;
        this.a = gVar;
        this.k = config;
        ArrayList arrayList = new ArrayList((list != null ? list.size() : 0) + 7);
        arrayList.add(new dd5(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new fy0(context));
        arrayList.add(new ks3(context));
        arrayList.add(new uy0(context));
        arrayList.add(new ey(context));
        arrayList.add(new rb2(context));
        arrayList.add(new l44(ok1Var.d, f76Var));
        this.c = Collections.unmodifiableList(arrayList);
        this.g = f76Var;
        this.h = new WeakHashMap();
        this.i = new WeakHashMap();
        this.l = z;
        this.m = z2;
        ReferenceQueue referenceQueue = new ReferenceQueue();
        this.j = referenceQueue;
        c cVar = new c(referenceQueue, o);
        this.b = cVar;
        cVar.start();
    }

    public static ds4 g() {
        if (p == null) {
            synchronized (ds4.class) {
                try {
                    if (p == null) {
                        Context context = PicassoProvider.a;
                        if (context == null) {
                            throw new IllegalStateException("context == null");
                        }
                        p = new b(context).a();
                    }
                } finally {
                }
            }
        }
        return p;
    }

    public void a(Object obj) {
        nt6.c();
        s5 s5Var = (s5) this.h.remove(obj);
        if (s5Var != null) {
            s5Var.a();
            this.e.c(s5Var);
        }
        if (obj instanceof ImageView) {
            vg1 vg1Var = (vg1) this.i.remove((ImageView) obj);
            if (vg1Var != null) {
                vg1Var.a();
            }
        }
    }

    public void b(ImageView imageView) {
        if (imageView == null) {
            throw new IllegalArgumentException("view cannot be null.");
        }
        a(imageView);
    }

    public void c(t60 t60Var) {
        s5 s5VarH = t60Var.h();
        List listI = t60Var.i();
        boolean z = (listI == null || listI.isEmpty()) ? false : true;
        if (s5VarH != null || z) {
            Uri uri = t60Var.j().d;
            Exception excK = t60Var.k();
            Bitmap bitmapS = t60Var.s();
            e eVarO = t60Var.o();
            if (s5VarH != null) {
                e(bitmapS, eVarO, s5VarH, excK);
            }
            if (z) {
                int size = listI.size();
                for (int i = 0; i < size; i++) {
                    e(bitmapS, eVarO, (s5) listI.get(i), excK);
                }
            }
        }
    }

    public void d(ImageView imageView, vg1 vg1Var) {
        if (this.i.containsKey(imageView)) {
            a(imageView);
        }
        this.i.put(imageView, vg1Var);
    }

    public final void e(Bitmap bitmap, e eVar, s5 s5Var, Exception exc) {
        if (s5Var.l()) {
            return;
        }
        if (!s5Var.m()) {
            this.h.remove(s5Var.k());
        }
        if (bitmap == null) {
            s5Var.c(exc);
            if (this.m) {
                nt6.t("Main", "errored", s5Var.b.d(), exc.getMessage());
                return;
            }
            return;
        }
        if (eVar == null) {
            throw new AssertionError("LoadedFrom cannot be null.");
        }
        s5Var.b(bitmap, eVar);
        if (this.m) {
            nt6.t("Main", "completed", s5Var.b.d(), "from " + eVar);
        }
    }

    public void f(s5 s5Var) {
        Object objK = s5Var.k();
        if (objK != null && this.h.get(objK) != s5Var) {
            a(objK);
            this.h.put(objK, s5Var);
        }
        n(s5Var);
    }

    public List h() {
        return this.c;
    }

    public mc5 i(int i) {
        if (i != 0) {
            return new mc5(this, null, i);
        }
        throw new IllegalArgumentException("Resource ID must not be zero.");
    }

    public mc5 j(Uri uri) {
        return new mc5(this, uri, 0);
    }

    public mc5 k(String str) {
        if (str == null) {
            return new mc5(this, null, 0);
        }
        if (str.trim().length() != 0) {
            return j(Uri.parse(str));
        }
        throw new IllegalArgumentException("Path must not be empty.");
    }

    public Bitmap l(String str) {
        Bitmap bitmap = this.f.get(str);
        if (bitmap != null) {
            this.g.d();
        } else {
            this.g.e();
        }
        return bitmap;
    }

    public void m(s5 s5Var) {
        Bitmap bitmapL = os3.a(s5Var.e) ? l(s5Var.d()) : null;
        if (bitmapL == null) {
            f(s5Var);
            if (this.m) {
                nt6.s("Main", "resumed", s5Var.b.d());
                return;
            }
            return;
        }
        e eVar = e.MEMORY;
        e(bitmapL, eVar, s5Var, null);
        if (this.m) {
            nt6.t("Main", "completed", s5Var.b.d(), "from " + eVar);
        }
    }

    public void n(s5 s5Var) {
        this.e.h(s5Var);
    }

    public jc5 o(jc5 jc5Var) {
        jc5 jc5VarA = this.a.a(jc5Var);
        if (jc5VarA != null) {
            return jc5VarA;
        }
        throw new IllegalStateException("Request transformer " + this.a.getClass().getCanonicalName() + " returned null for " + jc5Var);
    }
}
