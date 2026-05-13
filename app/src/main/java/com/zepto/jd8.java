package com.zepto;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class jd8 extends sf2 implements af3 {
    public static final WeakHashMap g0 = new WeakHashMap();
    public final Map d0 = Collections.synchronizedMap(new nx());
    public int e0 = 0;
    public Bundle f0;

    public static jd8 X1(yf2 yf2Var) {
        jd8 jd8Var;
        WeakHashMap weakHashMap = g0;
        WeakReference weakReference = (WeakReference) weakHashMap.get(yf2Var);
        if (weakReference != null && (jd8Var = (jd8) weakReference.get()) != null) {
            return jd8Var;
        }
        try {
            jd8 jd8Var2 = (jd8) yf2Var.I0().h0("SupportLifecycleFragmentImpl");
            if (jd8Var2 == null || jd8Var2.s0()) {
                jd8Var2 = new jd8();
                yf2Var.I0().n().e(jd8Var2, "SupportLifecycleFragmentImpl").i();
            }
            weakHashMap.put(yf2Var, new WeakReference(jd8Var2));
            return jd8Var2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
        }
    }

    @Override // com.zepto.sf2
    public final void C0(Bundle bundle) {
        super.C0(bundle);
        this.e0 = 1;
        this.f0 = bundle;
        for (Map.Entry entry : this.d0.entrySet()) {
            ((LifecycleCallback) entry.getValue()).f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // com.zepto.sf2
    public final void H0() {
        super.H0();
        this.e0 = 5;
        Iterator it = this.d0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).g();
        }
    }

    @Override // com.zepto.sf2
    public final void X0() {
        super.X0();
        this.e0 = 3;
        Iterator it = this.d0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).h();
        }
    }

    @Override // com.zepto.sf2
    public final void Y0(Bundle bundle) {
        super.Y0(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.d0.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).i(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // com.zepto.sf2
    public final void Z0() {
        super.Z0();
        this.e0 = 2;
        Iterator it = this.d0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).j();
        }
    }

    @Override // com.zepto.sf2
    public final void a1() {
        super.a1();
        this.e0 = 4;
        Iterator it = this.d0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).k();
        }
    }

    @Override // com.zepto.af3
    public final void b(String str, LifecycleCallback lifecycleCallback) {
        if (this.d0.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.d0.put(str, lifecycleCallback);
        if (this.e0 > 0) {
            new th8(Looper.getMainLooper()).post(new wa8(this, lifecycleCallback, str));
        }
    }

    @Override // com.zepto.af3
    public final LifecycleCallback c(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.d0.get(str));
    }

    @Override // com.zepto.af3
    public final /* synthetic */ Activity d() {
        return n();
    }

    @Override // com.zepto.sf2
    public final void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.i(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.d0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.zepto.sf2
    public final void x0(int i, int i2, Intent intent) {
        super.x0(i, i2, intent);
        Iterator it = this.d0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).e(i, i2, intent);
        }
    }
}
