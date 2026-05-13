package com.zepto;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.h;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class lq7 extends y40 {
    public static final int n = 8;
    public final Runnable a;
    public boolean b;
    public boolean c;
    public su7[] d;
    public final View e;
    public boolean f;
    public Choreographer g;
    public final Choreographer.FrameCallback h;
    public Handler i;
    public lq7 j;
    public df3 k;
    public j l;
    public static int m = Build.VERSION.SDK_INT;
    public static final boolean o = true;
    public static final c31 p = new a();
    public static final c31 q = new b();
    public static final c31 r = new c();
    public static final c31 s = new d();
    public static final ja0 t = new e();
    public static final ReferenceQueue u = new ReferenceQueue();
    public static final View.OnAttachStateChangeListener v = new f();

    public class a implements c31 {
    }

    public class b implements c31 {
    }

    public class c implements c31 {
    }

    public class d implements c31 {
    }

    public class e extends ja0 {
    }

    public class f implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            lq7.l(view).a.run();
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                lq7.this.b = false;
            }
            lq7.t();
            if (lq7.this.e.isAttachedToWindow()) {
                lq7.this.k();
            } else {
                lq7.this.e.removeOnAttachStateChangeListener(lq7.v);
                lq7.this.e.addOnAttachStateChangeListener(lq7.v);
            }
        }
    }

    public class h implements Choreographer.FrameCallback {
        public h() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            lq7.this.a.run();
        }
    }

    public static class i {
    }

    public static class j implements cf3 {
        public final WeakReference c;

        public /* synthetic */ j(lq7 lq7Var, a aVar) {
            this(lq7Var);
        }

        @androidx.lifecycle.o(h.a.ON_START)
        public void onStart() {
            lq7 lq7Var = (lq7) this.c.get();
            if (lq7Var != null) {
                lq7Var.k();
            }
        }

        public j(lq7 lq7Var) {
            this.c = new WeakReference(lq7Var);
        }
    }

    public lq7(jd1 jd1Var, View view, int i2) {
        this.a = new g();
        this.b = false;
        this.c = false;
        this.d = new su7[i2];
        this.e = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        }
        if (o) {
            this.g = Choreographer.getInstance();
            this.h = new h();
        } else {
            this.h = null;
            this.i = new Handler(Looper.myLooper());
        }
    }

    public static jd1 h(Object obj) {
        if (obj == null) {
            return null;
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    public static lq7 l(View view) {
        if (view != null) {
            return (lq7) view.getTag(f05.a);
        }
        return null;
    }

    public static lq7 o(LayoutInflater layoutInflater, int i2, ViewGroup viewGroup, boolean z, Object obj) {
        h(obj);
        return kd1.e(layoutInflater, i2, viewGroup, z, null);
    }

    public static boolean p(String str, int i2) {
        int length = str.length();
        if (length == i2) {
            return false;
        }
        while (i2 < length) {
            if (!Character.isDigit(str.charAt(i2))) {
                return false;
            }
            i2++;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void q(com.zepto.jd1 r8, android.view.View r9, java.lang.Object[] r10, com.zepto.lq7.i r11, android.util.SparseIntArray r12, boolean r13) {
        /*
            com.zepto.lq7 r0 = l(r9)
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.Object r0 = r9.getTag()
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L12
            java.lang.String r0 = (java.lang.String) r0
            goto L13
        L12:
            r0 = 0
        L13:
            r1 = 0
            r2 = 1
            if (r13 == 0) goto L3b
            if (r0 == 0) goto L3b
            java.lang.String r13 = "layout"
            boolean r13 = r0.startsWith(r13)
            if (r13 == 0) goto L3b
            r13 = 95
            int r13 = r0.lastIndexOf(r13)
            if (r13 <= 0) goto L52
            int r13 = r13 + r2
            boolean r3 = p(r0, r13)
            if (r3 == 0) goto L52
            int r13 = s(r0, r13)
            r0 = r10[r13]
            if (r0 != 0) goto L53
            r10[r13] = r9
            goto L53
        L3b:
            if (r0 == 0) goto L52
            java.lang.String r13 = "binding_"
            boolean r13 = r0.startsWith(r13)
            if (r13 == 0) goto L52
            int r13 = com.zepto.lq7.n
            int r13 = s(r0, r13)
            r0 = r10[r13]
            if (r0 != 0) goto L53
            r10[r13] = r9
            goto L53
        L52:
            r2 = r1
        L53:
            if (r2 != 0) goto L6a
            int r13 = r9.getId()
            if (r13 <= 0) goto L6a
            if (r12 == 0) goto L6a
            r0 = -1
            int r13 = r12.get(r13, r0)
            if (r13 < 0) goto L6a
            r0 = r10[r13]
            if (r0 != 0) goto L6a
            r10[r13] = r9
        L6a:
            boolean r13 = r9 instanceof android.view.ViewGroup
            if (r13 == 0) goto L85
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            int r13 = r9.getChildCount()
        L74:
            if (r1 >= r13) goto L85
            android.view.View r3 = r9.getChildAt(r1)
            r7 = 0
            r2 = r8
            r4 = r10
            r5 = r11
            r6 = r12
            q(r2, r3, r4, r5, r6, r7)
            int r1 = r1 + 1
            goto L74
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.lq7.q(com.zepto.jd1, android.view.View, java.lang.Object[], com.zepto.lq7$i, android.util.SparseIntArray, boolean):void");
    }

    public static Object[] r(jd1 jd1Var, View view, int i2, i iVar, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i2];
        q(jd1Var, view, objArr, iVar, sparseIntArray, true);
        return objArr;
    }

    public static int s(String str, int i2) {
        int iCharAt = 0;
        while (i2 < str.length()) {
            iCharAt = (iCharAt * 10) + (str.charAt(i2) - '0');
            i2++;
        }
        return iCharAt;
    }

    public static void t() {
        while (u.poll() != null) {
        }
    }

    public abstract void i();

    public final void j() {
        if (this.f) {
            u();
        } else if (n()) {
            this.f = true;
            this.c = false;
            i();
            this.f = false;
        }
    }

    public void k() {
        lq7 lq7Var = this.j;
        if (lq7Var == null) {
            j();
        } else {
            lq7Var.k();
        }
    }

    public View m() {
        return this.e;
    }

    public abstract boolean n();

    public void u() {
        lq7 lq7Var = this.j;
        if (lq7Var != null) {
            lq7Var.u();
            return;
        }
        df3 df3Var = this.k;
        if (df3Var == null || df3Var.g0().b().b(h.b.STARTED)) {
            synchronized (this) {
                try {
                    if (this.b) {
                        return;
                    }
                    this.b = true;
                    if (o) {
                        this.g.postFrameCallback(this.h);
                    } else {
                        this.i.post(this.a);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void v(df3 df3Var) {
        if (df3Var instanceof sf2) {
            Log.w("DataBinding", "Setting the fragment as the LifecycleOwner might cause memory leaks because views lives shorter than the Fragment. Consider using Fragment's view lifecycle");
        }
        df3 df3Var2 = this.k;
        if (df3Var2 == df3Var) {
            return;
        }
        if (df3Var2 != null) {
            df3Var2.g0().d(this.l);
        }
        this.k = df3Var;
        if (df3Var != null) {
            if (this.l == null) {
                this.l = new j(this, null);
            }
            df3Var.g0().a(this.l);
        }
        for (su7 su7Var : this.d) {
        }
    }

    public void w(View view) {
        view.setTag(f05.a, this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public lq7(Object obj, View view, int i2) {
        this((jd1) null, view, i2);
        h(obj);
    }
}
