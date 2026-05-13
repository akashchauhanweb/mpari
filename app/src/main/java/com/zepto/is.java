package com.zepto;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.startup.InitializationProvider;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class is {
    public static volatile is d;
    public static final Object e = new Object();
    public final Context c;
    public final Set b = new HashSet();
    public final Map a = new HashMap();

    public is(Context context) {
        this.c = context.getApplicationContext();
    }

    public static is e(Context context) {
        if (d == null) {
            synchronized (e) {
                try {
                    if (d == null) {
                        d = new is(context);
                    }
                } finally {
                }
            }
        }
        return d;
    }

    public void a() {
        try {
            try {
                yi6.a("Startup");
                b(this.c.getPackageManager().getProviderInfo(new ComponentName(this.c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e2) {
                throw new r66(e2);
            }
        } finally {
            yi6.b();
        }
    }

    public void b(Bundle bundle) {
        String string = this.c.getString(x05.a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (qy2.class.isAssignableFrom(cls)) {
                            this.b.add(cls);
                        }
                    }
                }
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    d((Class) it.next(), hashSet);
                }
            } catch (ClassNotFoundException e2) {
                throw new r66(e2);
            }
        }
    }

    public Object c(Class cls) {
        Object objD;
        synchronized (e) {
            try {
                objD = this.a.get(cls);
                if (objD == null) {
                    objD = d(cls, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objD;
    }

    public final Object d(Class cls, Set set) {
        Object objB;
        if (yi6.d()) {
            try {
                yi6.a(cls.getSimpleName());
            } catch (Throwable th) {
                yi6.b();
                throw th;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.a.containsKey(cls)) {
            objB = this.a.get(cls);
        } else {
            set.add(cls);
            try {
                qy2 qy2Var = (qy2) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class> listA = qy2Var.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!this.a.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                objB = qy2Var.b(this.c);
                set.remove(cls);
                this.a.put(cls, objB);
            } catch (Throwable th2) {
                throw new r66(th2);
            }
        }
        yi6.b();
        return objB;
    }

    public Object f(Class cls) {
        return c(cls);
    }

    public boolean g(Class cls) {
        return this.b.contains(cls);
    }
}
