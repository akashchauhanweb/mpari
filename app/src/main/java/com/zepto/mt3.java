package com.zepto;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class mt3 implements s30 {
    public final a a;
    public final f31 b;
    public final Map c;

    public static class a {
        public final Context a;
        public Map b = null;

        public a(Context context) {
            this.a = context;
        }

        public static Bundle d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        public final Map a(Context context) {
            Bundle bundleD = d(context);
            if (bundleD == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap map = new HashMap();
            for (String str : bundleD.keySet()) {
                Object obj = bundleD.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String strTrim = str2.trim();
                        if (!strTrim.isEmpty()) {
                            map.put(strTrim, str.substring(8));
                        }
                    }
                }
            }
            return map;
        }

        public r30 b(String str) {
            String str2 = (String) c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (r30) Class.forName(str2).asSubclass(r30.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", str2), e);
                return null;
            } catch (IllegalAccessException e2) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e2);
                return null;
            } catch (InstantiationException e3) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e3);
                return null;
            } catch (NoSuchMethodException e4) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e4);
                return null;
            } catch (InvocationTargetException e5) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e5);
                return null;
            }
        }

        public final Map c() {
            if (this.b == null) {
                this.b = a(this.a);
            }
            return this.b;
        }
    }

    public mt3(Context context, f31 f31Var) {
        this(new a(context), f31Var);
    }

    @Override // com.zepto.s30
    public synchronized pn6 get(String str) {
        if (this.c.containsKey(str)) {
            return (pn6) this.c.get(str);
        }
        r30 r30VarB = this.a.b(str);
        if (r30VarB == null) {
            return null;
        }
        pn6 pn6VarCreate = r30VarB.create(this.b.a(str));
        this.c.put(str, pn6VarCreate);
        return pn6VarCreate;
    }

    public mt3(a aVar, f31 f31Var) {
        this.c = new HashMap();
        this.a = aVar;
        this.b = f31Var;
    }
}
