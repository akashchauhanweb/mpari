package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;
import com.zepto.al8;
import com.zepto.hk8;
import com.zepto.if4;
import com.zepto.iu4;
import com.zepto.ld8;
import com.zepto.oj8;
import com.zepto.rk8;
import com.zepto.yj2;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class DynamiteModule {
    public static Boolean h = null;
    public static String i = null;
    public static boolean j = false;
    public static int k = -1;
    public static Boolean l;
    public static rk8 q;
    public static al8 r;
    public final Context a;
    public static final ThreadLocal m = new ThreadLocal();
    public static final ThreadLocal n = new ld8();
    public static final b.a o = new com.google.android.gms.dynamite.a();
    public static final b b = new com.google.android.gms.dynamite.b();
    public static final b c = new c();
    public static final b d = new d();
    public static final b e = new e();
    public static final b f = new f();
    public static final b g = new g();
    public static final b p = new h();

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public static class a extends Exception {
        public /* synthetic */ a(String str, hk8 hk8Var) {
            super(str);
        }

        public /* synthetic */ a(String str, Throwable th, hk8 hk8Var) {
            super(str, th);
        }
    }

    public interface b {

        public interface a {
            int a(Context context, String str);

            int b(Context context, String str, boolean z);
        }

        /* JADX INFO: renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b, reason: collision with other inner class name */
        public static class C0033b {
            public int a = 0;
            public int b = 0;
            public int c = 0;
        }

        C0033b a(Context context, String str, a aVar);
    }

    public DynamiteModule(Context context) {
        iu4.i(context);
        this.a = context;
    }

    public static int a(Context context, String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (if4.a(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e2) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e2.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082 A[Catch: all -> 0x0075, TRY_LEAVE, TryCatch #2 {all -> 0x0075, blocks: (B:7:0x006f, B:14:0x007c, B:17:0x0082), top: B:159:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.dynamite.DynamiteModule c(android.content.Context r18, com.google.android.gms.dynamite.DynamiteModule.b r19, java.lang.String r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 781
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.c(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$b, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0175 A[Catch: all -> 0x00e9, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x00e9, blocks: (B:3:0x0002, B:64:0x00de, B:66:0x00e4, B:73:0x0108, B:101:0x0167, B:105:0x0175, B:123:0x01c7, B:124:0x01ca, B:118:0x01bf, B:71:0x00ed, B:126:0x01cc, B:4:0x0003, B:7:0x0009, B:8:0x0025, B:62:0x00db, B:21:0x0049, B:45:0x009e, B:48:0x00a1, B:55:0x00b9, B:63:0x00dd, B:61:0x00bf), top: B:137:0x0002, inners: #1, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ad A[Catch: all -> 0x0036, TryCatch #12 {, blocks: (B:9:0x0026, B:11:0x0032, B:52:0x00b6, B:16:0x003b, B:18:0x0042, B:20:0x0048, B:25:0x004e, B:27:0x0052, B:31:0x005c, B:33:0x0064, B:36:0x006b, B:43:0x0095, B:44:0x009d, B:39:0x0072, B:41:0x0078, B:42:0x0087, B:47:0x00a0, B:50:0x00a3, B:51:0x00ad, B:17:0x003e), top: B:144:0x0026, inners: #4 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x01bd -> B:132:0x01c2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:118:0x01bf -> B:132:0x01c2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int d(android.content.Context r10, java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 465
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.d(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cd  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int e(android.content.Context r10, java.lang.String r11, boolean r12, boolean r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.e(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    public static DynamiteModule f(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context.getApplicationContext());
    }

    public static void g(ClassLoader classLoader) throws a {
        al8 al8Var;
        hk8 hk8Var = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                al8Var = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                al8Var = iInterfaceQueryLocalInterface instanceof al8 ? (al8) iInterfaceQueryLocalInterface : new al8(iBinder);
            }
            r = al8Var;
        } catch (ClassNotFoundException e2) {
            e = e2;
            throw new a("Failed to instantiate dynamite loader", e, hk8Var);
        } catch (IllegalAccessException e3) {
            e = e3;
            throw new a("Failed to instantiate dynamite loader", e, hk8Var);
        } catch (InstantiationException e4) {
            e = e4;
            throw new a("Failed to instantiate dynamite loader", e, hk8Var);
        } catch (NoSuchMethodException e5) {
            e = e5;
            throw new a("Failed to instantiate dynamite loader", e, hk8Var);
        } catch (InvocationTargetException e6) {
            e = e6;
            throw new a("Failed to instantiate dynamite loader", e, hk8Var);
        }
    }

    public static boolean h(Cursor cursor) {
        oj8 oj8Var = (oj8) m.get();
        if (oj8Var == null || oj8Var.a != null) {
            return false;
        }
        oj8Var.a = cursor;
        return true;
    }

    public static boolean i(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(l)) {
            return true;
        }
        boolean zBooleanValue = false;
        if (l == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (yj2.e().g(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                zBooleanValue = true;
            }
            Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
            l = boolValueOf;
            zBooleanValue = boolValueOf.booleanValue();
            if (zBooleanValue && providerInfoResolveContentProvider != null && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                j = true;
            }
        }
        if (!zBooleanValue) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return zBooleanValue;
    }

    public static rk8 j(Context context) {
        rk8 rk8Var;
        synchronized (DynamiteModule.class) {
            rk8 rk8Var2 = q;
            if (rk8Var2 != null) {
                return rk8Var2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    rk8Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    rk8Var = iInterfaceQueryLocalInterface instanceof rk8 ? (rk8) iInterfaceQueryLocalInterface : new rk8(iBinder);
                }
                if (rk8Var != null) {
                    q = rk8Var;
                    return rk8Var;
                }
            } catch (Exception e2) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e2.getMessage());
            }
            return null;
        }
    }

    public Context b() {
        return this.a;
    }
}
