package com.zepto;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.zepto.ds4;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s5 {
    public final ds4 a;
    public final jc5 b;
    public final WeakReference c;
    public final boolean d;
    public final int e;
    public final int f;
    public final int g;
    public final Drawable h;
    public final String i;
    public final Object j;
    public boolean k;
    public boolean l;

    public static class a extends WeakReference {
        public final s5 a;

        public a(s5 s5Var, Object obj, ReferenceQueue referenceQueue) {
            super(obj, referenceQueue);
            this.a = s5Var;
        }
    }

    public s5(ds4 ds4Var, Object obj, jc5 jc5Var, int i, int i2, int i3, Drawable drawable, String str, Object obj2, boolean z) {
        this.a = ds4Var;
        this.b = jc5Var;
        this.c = obj == null ? null : new a(this, obj, ds4Var.j);
        this.e = i;
        this.f = i2;
        this.d = z;
        this.g = i3;
        this.h = drawable;
        this.i = str;
        this.j = obj2 == null ? this : obj2;
    }

    public void a() {
        this.l = true;
    }

    public abstract void b(Bitmap bitmap, ds4.e eVar);

    public abstract void c(Exception exc);

    public String d() {
        return this.i;
    }

    public int e() {
        return this.e;
    }

    public int f() {
        return this.f;
    }

    public ds4 g() {
        return this.a;
    }

    public ds4.f h() {
        return this.b.t;
    }

    public jc5 i() {
        return this.b;
    }

    public Object j() {
        return this.j;
    }

    public Object k() {
        WeakReference weakReference = this.c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public boolean l() {
        return this.l;
    }

    public boolean m() {
        return this.k;
    }
}
