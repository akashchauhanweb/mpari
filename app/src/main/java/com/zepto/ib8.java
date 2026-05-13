package com.zepto;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.zepto.vp3;

/* JADX INFO: loaded from: classes.dex */
public abstract class ib8 {
    public static final String a = "ib8";
    public static Context b;
    public static sg8 c;

    public static sg8 a(Context context, vp3.a aVar) throws ck2 {
        iu4.i(context);
        Log.d(a, "preferredRenderer: ".concat(String.valueOf(aVar)));
        sg8 sg8Var = c;
        if (sg8Var != null) {
            return sg8Var;
        }
        int iD = dk2.d(context, 13400000);
        if (iD != 0) {
            throw new ck2(iD);
        }
        sg8 sg8VarD = d(context, aVar);
        c = sg8VarD;
        try {
            if (sg8VarD.a() == 2) {
                try {
                    c.s(hf4.p0(c(context, aVar)));
                } catch (RemoteException e) {
                    throw new cg5(e);
                } catch (UnsatisfiedLinkError unused) {
                    Log.w(a, "Caught UnsatisfiedLinkError attempting to load the LATEST renderer's native library. Attempting to use the LEGACY renderer instead.");
                    b = null;
                    c = d(context, vp3.a.LEGACY);
                }
            }
            try {
                sg8 sg8Var2 = c;
                Context contextC = c(context, aVar);
                contextC.getClass();
                sg8Var2.t(hf4.p0(contextC.getResources()), 18020000);
                return c;
            } catch (RemoteException e2) {
                throw new cg5(e2);
            }
        } catch (RemoteException e3) {
            throw new cg5(e3);
        }
    }

    public static Context b(Exception exc, Context context) {
        Log.e(a, "Failed to load maps module, use pre-Chimera", exc);
        return dk2.b(context);
    }

    public static Context c(Context context, vp3.a aVar) {
        Context contextB;
        Context context2 = b;
        if (context2 != null) {
            return context2;
        }
        String str = aVar == vp3.a.LEGACY ? "com.google.android.gms.maps_legacy_dynamite" : "com.google.android.gms.maps_core_dynamite";
        try {
            contextB = DynamiteModule.c(context, DynamiteModule.b, str).b();
        } catch (Exception e) {
            if (str.equals("com.google.android.gms.maps_dynamite")) {
                contextB = b(e, context);
            } else {
                try {
                    Log.d(a, "Attempting to load maps_dynamite again.");
                    contextB = DynamiteModule.c(context, DynamiteModule.b, "com.google.android.gms.maps_dynamite").b();
                } catch (Exception e2) {
                    contextB = b(e2, context);
                }
            }
        }
        b = contextB;
        return contextB;
    }

    public static sg8 d(Context context, vp3.a aVar) {
        Log.i(a, "Making Creator dynamically");
        try {
            IBinder iBinder = (IBinder) e(((ClassLoader) iu4.i(c(context, aVar).getClassLoader())).loadClass("com.google.android.gms.maps.internal.CreatorImpl"));
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
            return iInterfaceQueryLocalInterface instanceof sg8 ? (sg8) iInterfaceQueryLocalInterface : new pf8(iBinder);
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl", e);
        }
    }

    public static Object e(Class cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Unable to call the default constructor of ".concat(cls.getName()), e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(cls.getName()), e2);
        }
    }
}
