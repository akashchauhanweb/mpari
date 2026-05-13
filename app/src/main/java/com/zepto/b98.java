package com.zepto;

import android.app.Activity;
import android.app.Fragment;
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
public final class b98 extends Fragment implements af3 {
    public static final WeakHashMap d = new WeakHashMap();
    public final Map a = Collections.synchronizedMap(new nx());
    public int b = 0;
    public Bundle c;

    public static b98 f(Activity activity) {
        b98 b98Var;
        WeakHashMap weakHashMap = d;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (b98Var = (b98) weakReference.get()) != null) {
            return b98Var;
        }
        try {
            b98 b98Var2 = (b98) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (b98Var2 == null || b98Var2.isRemoving()) {
                b98Var2 = new b98();
                activity.getFragmentManager().beginTransaction().add(b98Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(b98Var2));
            return b98Var2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
        }
    }

    @Override // com.zepto.af3
    public final void b(String str, LifecycleCallback lifecycleCallback) {
        if (this.a.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.a.put(str, lifecycleCallback);
        if (this.b > 0) {
            new th8(Looper.getMainLooper()).post(new p58(this, lifecycleCallback, str));
        }
    }

    @Override // com.zepto.af3
    public final LifecycleCallback c(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.a.get(str));
    }

    @Override // com.zepto.af3
    public final Activity d() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).e(i, i2, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.b = 1;
        this.c = bundle;
        for (Map.Entry entry : this.a.entrySet()) {
            ((LifecycleCallback) entry.getValue()).f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.b = 5;
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).g();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.b = 3;
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).h();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).i(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.b = 2;
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).j();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.b = 4;
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).k();
        }
    }
}
