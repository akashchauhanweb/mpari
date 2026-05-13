package com.zepto;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import com.zepto.ds4;
import com.zepto.l44;
import com.zepto.pc5;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class t60 implements Runnable {
    public static final Object w = new Object();
    public static final ThreadLocal x = new a();
    public static final AtomicInteger y = new AtomicInteger();
    public static final pc5 z = new b();
    public final int c = y.incrementAndGet();
    public final ds4 e;
    public final ok1 f;
    public final h90 g;
    public final f76 h;
    public final String i;
    public final jc5 j;
    public final int k;
    public int l;
    public final pc5 m;
    public s5 n;
    public List o;
    public Bitmap p;
    public Future q;
    public ds4.e r;
    public Exception s;
    public int t;
    public int u;
    public ds4.f v;

    public static class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }
    }

    public static class b extends pc5 {
        @Override // com.zepto.pc5
        public boolean c(jc5 jc5Var) {
            return true;
        }

        @Override // com.zepto.pc5
        public pc5.a f(jc5 jc5Var, int i) {
            throw new IllegalStateException("Unrecognized type of request: " + jc5Var);
        }
    }

    public static class c implements Runnable {
        public final /* synthetic */ an6 c;
        public final /* synthetic */ RuntimeException e;

        public c(an6 an6Var, RuntimeException runtimeException) {
            this.c = an6Var;
            this.e = runtimeException;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new RuntimeException("Transformation " + this.c.b() + " crashed with exception.", this.e);
        }
    }

    public static class d implements Runnable {
        public final /* synthetic */ StringBuilder c;

        public d(StringBuilder sb) {
            this.c = sb;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new NullPointerException(this.c.toString());
        }
    }

    public static class e implements Runnable {
        public final /* synthetic */ an6 c;

        public e(an6 an6Var) {
            this.c = an6Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new IllegalStateException("Transformation " + this.c.b() + " returned input Bitmap but recycled it.");
        }
    }

    public static class f implements Runnable {
        public final /* synthetic */ an6 c;

        public f(an6 an6Var) {
            this.c = an6Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new IllegalStateException("Transformation " + this.c.b() + " mutated input Bitmap but failed to recycle the original.");
        }
    }

    public t60(ds4 ds4Var, ok1 ok1Var, h90 h90Var, f76 f76Var, s5 s5Var, pc5 pc5Var) {
        this.e = ds4Var;
        this.f = ok1Var;
        this.g = h90Var;
        this.h = f76Var;
        this.n = s5Var;
        this.i = s5Var.d();
        this.j = s5Var.i();
        this.v = s5Var.h();
        this.k = s5Var.e();
        this.l = s5Var.f();
        this.m = pc5Var;
        this.u = pc5Var.e();
    }

    public static Bitmap a(List list, Bitmap bitmap) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            an6 an6Var = (an6) list.get(i);
            try {
                Bitmap bitmapA = an6Var.a(bitmap);
                if (bitmapA == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Transformation ");
                    sb.append(an6Var.b());
                    sb.append(" returned null after ");
                    sb.append(i);
                    sb.append(" previous transformation(s).\n\nTransformation list:\n");
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        sb.append(((an6) it.next()).b());
                        sb.append('\n');
                    }
                    ds4.o.post(new d(sb));
                    return null;
                }
                if (bitmapA == bitmap && bitmap.isRecycled()) {
                    ds4.o.post(new e(an6Var));
                    return null;
                }
                if (bitmapA != bitmap && !bitmap.isRecycled()) {
                    ds4.o.post(new f(an6Var));
                    return null;
                }
                i++;
                bitmap = bitmapA;
            } catch (RuntimeException e2) {
                ds4.o.post(new c(an6Var, e2));
                return null;
            }
        }
        return bitmap;
    }

    public static Bitmap e(y46 y46Var, jc5 jc5Var) throws IOException {
        a80 a80VarD = zf4.d(y46Var);
        boolean zR = nt6.r(a80VarD);
        boolean z2 = jc5Var.r;
        BitmapFactory.Options optionsD = pc5.d(jc5Var);
        boolean zG = pc5.g(optionsD);
        if (zR) {
            byte[] bArrG = a80VarD.G();
            if (zG) {
                BitmapFactory.decodeByteArray(bArrG, 0, bArrG.length, optionsD);
                pc5.b(jc5Var.h, jc5Var.i, optionsD, jc5Var);
            }
            return BitmapFactory.decodeByteArray(bArrG, 0, bArrG.length, optionsD);
        }
        InputStream inputStreamU0 = a80VarD.u0();
        if (zG) {
            xp3 xp3Var = new xp3(inputStreamU0);
            xp3Var.d(false);
            long j = xp3Var.j(1024);
            BitmapFactory.decodeStream(xp3Var, null, optionsD);
            pc5.b(jc5Var.h, jc5Var.i, optionsD, jc5Var);
            xp3Var.e(j);
            xp3Var.d(true);
            inputStreamU0 = xp3Var;
        }
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamU0, null, optionsD);
        if (bitmapDecodeStream != null) {
            return bitmapDecodeStream;
        }
        throw new IOException("Failed to decode stream.");
    }

    public static t60 g(ds4 ds4Var, ok1 ok1Var, h90 h90Var, f76 f76Var, s5 s5Var) {
        jc5 jc5VarI = s5Var.i();
        List listH = ds4Var.h();
        int size = listH.size();
        for (int i = 0; i < size; i++) {
            pc5 pc5Var = (pc5) listH.get(i);
            if (pc5Var.c(jc5VarI)) {
                return new t60(ds4Var, ok1Var, h90Var, f76Var, s5Var, pc5Var);
            }
        }
        return new t60(ds4Var, ok1Var, h90Var, f76Var, s5Var, z);
    }

    public static int l(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public static int m(int i) {
        return (i == 2 || i == 7 || i == 4 || i == 5) ? -1 : 1;
    }

    public static boolean v(boolean z2, int i, int i2, int i3, int i4) {
        return !z2 || (i3 != 0 && i > i3) || (i4 != 0 && i2 > i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0254  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap y(com.zepto.jc5 r26, android.graphics.Bitmap r27, int r28) {
        /*
            Method dump skipped, instruction units count: 598
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.t60.y(com.zepto.jc5, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    public static void z(jc5 jc5Var) {
        String strA = jc5Var.a();
        StringBuilder sb = (StringBuilder) x.get();
        sb.ensureCapacity(strA.length() + 8);
        sb.replace(8, sb.length(), strA);
        Thread.currentThread().setName(sb.toString());
    }

    public void b(s5 s5Var) {
        boolean z2 = this.e.m;
        jc5 jc5Var = s5Var.b;
        if (this.n == null) {
            this.n = s5Var;
            if (z2) {
                List list = this.o;
                if (list == null || list.isEmpty()) {
                    nt6.t("Hunter", "joined", jc5Var.d(), "to empty hunter");
                    return;
                } else {
                    nt6.t("Hunter", "joined", jc5Var.d(), nt6.k(this, "to "));
                    return;
                }
            }
            return;
        }
        if (this.o == null) {
            this.o = new ArrayList(3);
        }
        this.o.add(s5Var);
        if (z2) {
            nt6.t("Hunter", "joined", jc5Var.d(), nt6.k(this, "to "));
        }
        ds4.f fVarH = s5Var.h();
        if (fVarH.ordinal() > this.v.ordinal()) {
            this.v = fVarH;
        }
    }

    public boolean c() {
        Future future;
        if (this.n != null) {
            return false;
        }
        List list = this.o;
        return (list == null || list.isEmpty()) && (future = this.q) != null && future.cancel(false);
    }

    public final ds4.f d() {
        ds4.f fVarH = ds4.f.LOW;
        List list = this.o;
        boolean z2 = (list == null || list.isEmpty()) ? false : true;
        s5 s5Var = this.n;
        if (s5Var == null && !z2) {
            return fVarH;
        }
        if (s5Var != null) {
            fVarH = s5Var.h();
        }
        if (z2) {
            int size = this.o.size();
            for (int i = 0; i < size; i++) {
                ds4.f fVarH2 = ((s5) this.o.get(i)).h();
                if (fVarH2.ordinal() > fVarH.ordinal()) {
                    fVarH = fVarH2;
                }
            }
        }
        return fVarH;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f(com.zepto.s5 r4) {
        /*
            r3 = this;
            com.zepto.s5 r0 = r3.n
            if (r0 != r4) goto L8
            r0 = 0
            r3.n = r0
            goto L12
        L8:
            java.util.List r0 = r3.o
            if (r0 == 0) goto L20
            boolean r0 = r0.remove(r4)
            if (r0 == 0) goto L20
        L12:
            com.zepto.ds4$f r0 = r4.h()
            com.zepto.ds4$f r1 = r3.v
            if (r0 != r1) goto L20
            com.zepto.ds4$f r0 = r3.d()
            r3.v = r0
        L20:
            com.zepto.ds4 r0 = r3.e
            boolean r0 = r0.m
            if (r0 == 0) goto L39
            com.zepto.jc5 r4 = r4.b
            java.lang.String r4 = r4.d()
            java.lang.String r0 = "from "
            java.lang.String r0 = com.zepto.nt6.k(r3, r0)
            java.lang.String r1 = "Hunter"
            java.lang.String r2 = "removed"
            com.zepto.nt6.t(r1, r2, r4, r0)
        L39:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.t60.f(com.zepto.s5):void");
    }

    public s5 h() {
        return this.n;
    }

    public List i() {
        return this.o;
    }

    public jc5 j() {
        return this.j;
    }

    public Exception k() {
        return this.s;
    }

    public String n() {
        return this.i;
    }

    public ds4.e o() {
        return this.r;
    }

    public int p() {
        return this.k;
    }

    public ds4 q() {
        return this.e;
    }

    public ds4.f r() {
        return this.v;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                try {
                    try {
                        z(this.j);
                        if (this.e.m) {
                            nt6.s("Hunter", "executing", nt6.j(this));
                        }
                        Bitmap bitmapT = t();
                        this.p = bitmapT;
                        if (bitmapT == null) {
                            this.f.e(this);
                        } else {
                            this.f.d(this);
                        }
                    } catch (Exception e2) {
                        this.s = e2;
                        this.f.e(this);
                    } catch (OutOfMemoryError e3) {
                        StringWriter stringWriter = new StringWriter();
                        this.h.a().a(new PrintWriter(stringWriter));
                        this.s = new RuntimeException(stringWriter.toString(), e3);
                        this.f.e(this);
                    }
                } catch (IOException e4) {
                    this.s = e4;
                    this.f.g(this);
                }
            } catch (l44.b e5) {
                if (!k44.a(e5.e) || e5.c != 504) {
                    this.s = e5;
                }
                this.f.e(this);
            }
            Thread.currentThread().setName("Picasso-Idle");
        } catch (Throwable th) {
            Thread.currentThread().setName("Picasso-Idle");
            throw th;
        }
    }

    public Bitmap s() {
        return this.p;
    }

    public Bitmap t() throws IOException {
        Bitmap bitmapY;
        if (os3.a(this.k)) {
            bitmapY = this.g.get(this.i);
            if (bitmapY != null) {
                this.h.d();
                this.r = ds4.e.MEMORY;
                if (this.e.m) {
                    nt6.t("Hunter", "decoded", this.j.d(), "from cache");
                }
                return bitmapY;
            }
        } else {
            bitmapY = null;
        }
        int i = this.u == 0 ? k44.OFFLINE.c : this.l;
        this.l = i;
        pc5.a aVarF = this.m.f(this.j, i);
        if (aVarF != null) {
            this.r = aVarF.c();
            this.t = aVarF.b();
            bitmapY = aVarF.a();
            if (bitmapY == null) {
                y46 y46VarD = aVarF.d();
                try {
                    bitmapY = e(y46VarD, this.j);
                } finally {
                    try {
                        y46VarD.close();
                    } catch (IOException unused) {
                    }
                }
            }
        }
        if (bitmapY != null) {
            if (this.e.m) {
                nt6.s("Hunter", "decoded", this.j.d());
            }
            this.h.b(bitmapY);
            if (this.j.f() || this.t != 0) {
                synchronized (w) {
                    try {
                        if (this.j.e() || this.t != 0) {
                            bitmapY = y(this.j, bitmapY, this.t);
                            if (this.e.m) {
                                nt6.s("Hunter", "transformed", this.j.d());
                            }
                        }
                        if (this.j.b()) {
                            bitmapY = a(this.j.g, bitmapY);
                            if (this.e.m) {
                                nt6.t("Hunter", "transformed", this.j.d(), "from custom transformations");
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (bitmapY != null) {
                    this.h.c(bitmapY);
                }
            }
        }
        return bitmapY;
    }

    public boolean u() {
        Future future = this.q;
        return future != null && future.isCancelled();
    }

    public boolean w(boolean z2, NetworkInfo networkInfo) {
        int i = this.u;
        if (i <= 0) {
            return false;
        }
        this.u = i - 1;
        return this.m.h(z2, networkInfo);
    }

    public boolean x() {
        return this.m.i();
    }
}
