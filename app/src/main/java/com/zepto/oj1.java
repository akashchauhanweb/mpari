package com.zepto;

import ai.protectt.app.security.common.helper.NativeInteractor;
import ai.protectt.app.security.main.scan.ScanCore;
import ai.protectt.app.security.main.scan.ScanUtils;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.google.gson.Gson;
import com.zepto.jt;
import dalvik.system.DexClassLoader;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class oj1 {
    public static final oj1 a = new oj1();
    public static Object b;
    public static Class c;
    public static File d;

    public static final class a extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ if5 e;
        public final /* synthetic */ Context f;

        /* JADX INFO: renamed from: com.zepto.oj1$a$a, reason: collision with other inner class name */
        public static final class C0110a extends SuspendLambda implements Function2 {
            public int c;
            public final /* synthetic */ if5 e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0110a(if5 if5Var, Continuation continuation) {
                super(2, continuation);
                this.e = if5Var;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(yz0 yz0Var, Continuation continuation) {
                return ((C0110a) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0110a(this.e, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                try {
                    NativeInteractor.a.G0();
                    ScanCore.a.Q(this.e);
                } catch (Exception e) {
                    nn3.c(nn3.a, "DexLoader", e.toString(), null, 4, null);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(if5 if5Var, Context context, Continuation continuation) {
            super(2, continuation);
            this.e = if5Var;
            this.f = context;
        }

        public static final void g(if5 if5Var) {
            ScanUtils.a.H(if5Var);
        }

        public static final void h() {
            ScanUtils.a.G0();
        }

        public static final void i() {
            ScanCore.a.F0();
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.e, this.f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((a) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:33:0x004d. Please report as an issue. */
        /* JADX WARN: Failed to find 'out' block for switch in B:34:0x0050. Please report as an issue. */
        /* JADX WARN: Failed to find 'out' block for switch in B:35:0x0053. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:118:0x0363 A[Catch: Exception -> 0x008b, TryCatch #1 {Exception -> 0x008b, blocks: (B:5:0x000e, B:33:0x004d, B:34:0x0050, B:35:0x0053, B:36:0x0056, B:37:0x0059, B:44:0x0087, B:122:0x0378, B:125:0x0380, B:131:0x040c, B:133:0x0424, B:135:0x04ad, B:137:0x04bf, B:139:0x04cf, B:142:0x04e2, B:143:0x04e7, B:145:0x04f7, B:146:0x0514, B:148:0x0528, B:151:0x0578, B:128:0x03fc, B:130:0x0403, B:43:0x0079, B:40:0x0061, B:47:0x008e, B:48:0x009e, B:49:0x00a7, B:50:0x00b0, B:51:0x00b9, B:52:0x00c2, B:53:0x00cb, B:61:0x010a, B:60:0x00fa, B:62:0x0113, B:63:0x011e, B:64:0x0127, B:65:0x0137, B:66:0x0142, B:67:0x0155, B:68:0x015e, B:69:0x0167, B:70:0x0170, B:71:0x0179, B:72:0x0182, B:73:0x018d, B:74:0x0196, B:75:0x01a1, B:76:0x01aa, B:77:0x01b3, B:78:0x01be, B:79:0x01c7, B:80:0x01d0, B:81:0x01d9, B:82:0x01e2, B:83:0x01eb, B:84:0x01f4, B:86:0x01fc, B:87:0x0226, B:100:0x0293, B:101:0x029e, B:102:0x02b1, B:103:0x02c6, B:104:0x02d1, B:105:0x02e3, B:99:0x0283, B:106:0x02ee, B:107:0x02f7, B:108:0x0302, B:109:0x030c, B:110:0x0314, B:111:0x031c, B:112:0x0324, B:113:0x0335, B:114:0x033d, B:115:0x0345, B:116:0x034f, B:117:0x0359, B:118:0x0363, B:119:0x036d, B:89:0x0231, B:91:0x024b, B:95:0x026c, B:97:0x0278, B:94:0x025d, B:55:0x00df, B:57:0x00eb), top: B:160:0x000e, inners: #0, #2 }] */
        /* JADX WARN: Removed duplicated region for block: B:133:0x0424 A[Catch: Exception -> 0x008b, TryCatch #1 {Exception -> 0x008b, blocks: (B:5:0x000e, B:33:0x004d, B:34:0x0050, B:35:0x0053, B:36:0x0056, B:37:0x0059, B:44:0x0087, B:122:0x0378, B:125:0x0380, B:131:0x040c, B:133:0x0424, B:135:0x04ad, B:137:0x04bf, B:139:0x04cf, B:142:0x04e2, B:143:0x04e7, B:145:0x04f7, B:146:0x0514, B:148:0x0528, B:151:0x0578, B:128:0x03fc, B:130:0x0403, B:43:0x0079, B:40:0x0061, B:47:0x008e, B:48:0x009e, B:49:0x00a7, B:50:0x00b0, B:51:0x00b9, B:52:0x00c2, B:53:0x00cb, B:61:0x010a, B:60:0x00fa, B:62:0x0113, B:63:0x011e, B:64:0x0127, B:65:0x0137, B:66:0x0142, B:67:0x0155, B:68:0x015e, B:69:0x0167, B:70:0x0170, B:71:0x0179, B:72:0x0182, B:73:0x018d, B:74:0x0196, B:75:0x01a1, B:76:0x01aa, B:77:0x01b3, B:78:0x01be, B:79:0x01c7, B:80:0x01d0, B:81:0x01d9, B:82:0x01e2, B:83:0x01eb, B:84:0x01f4, B:86:0x01fc, B:87:0x0226, B:100:0x0293, B:101:0x029e, B:102:0x02b1, B:103:0x02c6, B:104:0x02d1, B:105:0x02e3, B:99:0x0283, B:106:0x02ee, B:107:0x02f7, B:108:0x0302, B:109:0x030c, B:110:0x0314, B:111:0x031c, B:112:0x0324, B:113:0x0335, B:114:0x033d, B:115:0x0345, B:116:0x034f, B:117:0x0359, B:118:0x0363, B:119:0x036d, B:89:0x0231, B:91:0x024b, B:95:0x026c, B:97:0x0278, B:94:0x025d, B:55:0x00df, B:57:0x00eb), top: B:160:0x000e, inners: #0, #2 }] */
        /* JADX WARN: Removed duplicated region for block: B:143:0x04e7 A[Catch: Exception -> 0x008b, TryCatch #1 {Exception -> 0x008b, blocks: (B:5:0x000e, B:33:0x004d, B:34:0x0050, B:35:0x0053, B:36:0x0056, B:37:0x0059, B:44:0x0087, B:122:0x0378, B:125:0x0380, B:131:0x040c, B:133:0x0424, B:135:0x04ad, B:137:0x04bf, B:139:0x04cf, B:142:0x04e2, B:143:0x04e7, B:145:0x04f7, B:146:0x0514, B:148:0x0528, B:151:0x0578, B:128:0x03fc, B:130:0x0403, B:43:0x0079, B:40:0x0061, B:47:0x008e, B:48:0x009e, B:49:0x00a7, B:50:0x00b0, B:51:0x00b9, B:52:0x00c2, B:53:0x00cb, B:61:0x010a, B:60:0x00fa, B:62:0x0113, B:63:0x011e, B:64:0x0127, B:65:0x0137, B:66:0x0142, B:67:0x0155, B:68:0x015e, B:69:0x0167, B:70:0x0170, B:71:0x0179, B:72:0x0182, B:73:0x018d, B:74:0x0196, B:75:0x01a1, B:76:0x01aa, B:77:0x01b3, B:78:0x01be, B:79:0x01c7, B:80:0x01d0, B:81:0x01d9, B:82:0x01e2, B:83:0x01eb, B:84:0x01f4, B:86:0x01fc, B:87:0x0226, B:100:0x0293, B:101:0x029e, B:102:0x02b1, B:103:0x02c6, B:104:0x02d1, B:105:0x02e3, B:99:0x0283, B:106:0x02ee, B:107:0x02f7, B:108:0x0302, B:109:0x030c, B:110:0x0314, B:111:0x031c, B:112:0x0324, B:113:0x0335, B:114:0x033d, B:115:0x0345, B:116:0x034f, B:117:0x0359, B:118:0x0363, B:119:0x036d, B:89:0x0231, B:91:0x024b, B:95:0x026c, B:97:0x0278, B:94:0x025d, B:55:0x00df, B:57:0x00eb), top: B:160:0x000e, inners: #0, #2 }] */
        /* JADX WARN: Removed duplicated region for block: B:146:0x0514 A[Catch: Exception -> 0x008b, TryCatch #1 {Exception -> 0x008b, blocks: (B:5:0x000e, B:33:0x004d, B:34:0x0050, B:35:0x0053, B:36:0x0056, B:37:0x0059, B:44:0x0087, B:122:0x0378, B:125:0x0380, B:131:0x040c, B:133:0x0424, B:135:0x04ad, B:137:0x04bf, B:139:0x04cf, B:142:0x04e2, B:143:0x04e7, B:145:0x04f7, B:146:0x0514, B:148:0x0528, B:151:0x0578, B:128:0x03fc, B:130:0x0403, B:43:0x0079, B:40:0x0061, B:47:0x008e, B:48:0x009e, B:49:0x00a7, B:50:0x00b0, B:51:0x00b9, B:52:0x00c2, B:53:0x00cb, B:61:0x010a, B:60:0x00fa, B:62:0x0113, B:63:0x011e, B:64:0x0127, B:65:0x0137, B:66:0x0142, B:67:0x0155, B:68:0x015e, B:69:0x0167, B:70:0x0170, B:71:0x0179, B:72:0x0182, B:73:0x018d, B:74:0x0196, B:75:0x01a1, B:76:0x01aa, B:77:0x01b3, B:78:0x01be, B:79:0x01c7, B:80:0x01d0, B:81:0x01d9, B:82:0x01e2, B:83:0x01eb, B:84:0x01f4, B:86:0x01fc, B:87:0x0226, B:100:0x0293, B:101:0x029e, B:102:0x02b1, B:103:0x02c6, B:104:0x02d1, B:105:0x02e3, B:99:0x0283, B:106:0x02ee, B:107:0x02f7, B:108:0x0302, B:109:0x030c, B:110:0x0314, B:111:0x031c, B:112:0x0324, B:113:0x0335, B:114:0x033d, B:115:0x0345, B:116:0x034f, B:117:0x0359, B:118:0x0363, B:119:0x036d, B:89:0x0231, B:91:0x024b, B:95:0x026c, B:97:0x0278, B:94:0x025d, B:55:0x00df, B:57:0x00eb), top: B:160:0x000e, inners: #0, #2 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1620
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zepto.oj1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class b extends SuspendLambda implements Function2 {
        public int c;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((b) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.c = 1;
                if (bh1.a(1000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ Boolean i(oj1 oj1Var, if5 if5Var, Context context, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        return oj1Var.h(if5Var, context, str);
    }

    public static final void k(Context context) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Toast.makeText(context, NativeInteractor.a.J0(), 0).show();
    }

    public final void d() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setFlags(67108864);
        jt.a aVar = jt.c;
        Activity activityR = aVar.r();
        if (activityR != null) {
            activityR.startActivity(intent);
        }
        Iterator it = aVar.d().iterator();
        while (it.hasNext()) {
            ((Activity) it.next()).finish();
        }
        Activity activityR2 = jt.c.r();
        if (activityR2 != null) {
            activityR2.finish();
        }
        System.exit(0);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    public final void e() {
        try {
            if (mx2.a.a()) {
                File file = d;
                Intrinsics.checkNotNull(file);
                if (file.exists()) {
                    File file2 = d;
                    Intrinsics.checkNotNull(file2);
                    if (file2.delete()) {
                        nn3.a.f("DexLoader", "runTimeDecryptedApkStorePath deletion completed successfully");
                    }
                }
            }
        } catch (Exception e) {
            nn3.c(nn3.a, "DexLoader", e.toString(), null, 4, null);
        }
    }

    public final File f() {
        return d;
    }

    public final void g(if5 ruleItem, Context context) {
        Intrinsics.checkNotNullParameter(ruleItem, "ruleItem");
        Intrinsics.checkNotNullParameter(context, "context");
        f80.d(qj2.c, qk1.a(), null, new a(ruleItem, context, null), 2, null);
    }

    public final Boolean h(if5 ruleItem, Context context, String str) {
        String str2;
        Intrinsics.checkNotNullParameter(ruleItem, "ruleItem");
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Class cls = c;
            Method method = cls == null ? null : cls.getMethod(String.valueOf(ruleItem.getMethodname()), Context.class);
            Object objInvoke = method == null ? null : method.invoke(b, context);
            if (objInvoke != null) {
                md5 md5Var = new md5(Integer.valueOf(Integer.parseInt((String) StringsKt__StringsKt.split$default((CharSequence) objInvoke.toString(), new String[]{"|-|"}, false, 0, 6, (Object) null).get(0))), (String) StringsKt__StringsKt.split$default((CharSequence) objInvoke.toString(), new String[]{"|-|"}, false, 0, 6, (Object) null).get(1), (String) StringsKt__StringsKt.split$default((CharSequence) objInvoke.toString(), new String[]{"|-|"}, false, 0, 6, (Object) null).get(2), (String) StringsKt__StringsKt.split$default((CharSequence) objInvoke.toString(), new String[]{"|-|"}, false, 0, 6, (Object) null).get(3));
                nn3 nn3Var = nn3.a;
                String json = new Gson().toJson(md5Var);
                Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(response)");
                nn3Var.f("MagiskTest", json);
                String vulnerabilityResponse = md5Var.getVulnerabilityResponse();
                ScanUtils scanUtils = ScanUtils.a;
                if (!StringsKt__StringsJVMKt.equals$default(vulnerabilityResponse, scanUtils.S(context, NativeInteractor.a.u1()), false, 2, null)) {
                    jt.c.L0("SAFE");
                    return Boolean.TRUE;
                }
                String str3 = (String) StringsKt__StringsKt.split$default((CharSequence) objInvoke.toString(), new String[]{"|-|"}, false, 0, 6, (Object) null).get(4);
                if (ScanCore.a.m1() && Intrinsics.areEqual(str3, context.getPackageName())) {
                    str2 = scanUtils.N(context, str3) + '(' + str3 + ")HideMyAppList Enabled";
                } else {
                    str2 = scanUtils.N(context, str3) + '(' + str3 + ')';
                }
                jt.c.L0(str2);
                if (str == null || str.length() == 0) {
                    pd5.a.c(ruleItem, "A:-" + str2 + "|-|" + scanUtils.Q());
                }
                return Boolean.FALSE;
            }
        } catch (Exception e) {
            nn3.a.b("DexLoader", e.toString(), e);
        }
        return null;
    }

    public final void j(final Context context) {
        Constructor<?> declaredConstructor;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Context applicationContext = context.getApplicationContext();
            File file = new File(applicationContext == null ? null : applicationContext.getDir("dex", 0), "temp.apk");
            d = file;
            Intrinsics.checkNotNull(file);
            if (file.exists()) {
                File file2 = d;
                Intrinsics.checkNotNull(file2);
                if (file2.delete()) {
                    nn3.a.f("DexLoader", "runTimeDecryptedApkStorePath deletion completed successfully");
                }
            }
            InputStream inputStreamOpenRawResource = context.getResources().openRawResource(t05.b);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpenRawResource, "context.resources.openRawResource(R.raw.temp)");
            ye1 ye1Var = ye1.a;
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new ByteArrayInputStream(ye1Var.b(ye1Var.f(inputStreamOpenRawResource))));
            bufferedInputStream.available();
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(d));
            byte[] bArr = new byte[ConstantsKt.DEFAULT_BUFFER_SIZE];
            while (true) {
                int i = bufferedInputStream.read(bArr);
                if (i == -1) {
                    break;
                } else {
                    bufferedOutputStream.write(bArr, 0, i);
                }
            }
            bufferedOutputStream.close();
            bufferedInputStream.close();
            File dir = context.getDir("outdex", 0);
            Intrinsics.checkNotNull(dir);
            File file3 = d;
            Intrinsics.checkNotNull(file3);
            file3.setReadOnly();
            File file4 = d;
            DexClassLoader dexClassLoader = new DexClassLoader(file4 == null ? null : file4.getAbsolutePath(), dir.getAbsolutePath(), context.getApplicationInfo().nativeLibraryDir, oj1.class.getClassLoader());
            nn3 nn3Var = nn3.a;
            StringBuilder sb = new StringBuilder();
            sb.append("runTimeDecryptedApkStorePath====>>> ");
            File file5 = d;
            sb.append((Object) (file5 == null ? null : file5.getAbsolutePath()));
            sb.append(" ----- optimizedDexOutputPath: ");
            sb.append((Object) dir.getAbsolutePath());
            nn3Var.f("DexLoader", sb.toString());
            mx2.a.b(dexClassLoader);
            Class<?> clsLoadClass = dexClassLoader.loadClass("ai.protectt.apk.Utils");
            c = clsLoadClass;
            Object objNewInstance = (clsLoadClass == null || (declaredConstructor = clsLoadClass.getDeclaredConstructor(new Class[0])) == null) ? null : declaredConstructor.newInstance(new Object[0]);
            if (objNewInstance == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
            }
            b = objNewInstance;
            mo5.a.m(true);
            e();
        } catch (Exception e) {
            Context applicationContext2 = context.getApplicationContext();
            File file6 = new File(applicationContext2 == null ? null : applicationContext2.getDir("dex", 0), "temp.apk");
            if (file6.exists()) {
                file6.delete();
                if (!file6.canRead()) {
                    d();
                }
            }
            if (StringsKt__StringsKt.contains((CharSequence) e.toString(), (CharSequence) "NotFoundException: File res/raw/temp", true)) {
                Activity activityR = jt.c.r();
                if (activityR != null) {
                    activityR.runOnUiThread(new Runnable() { // from class: com.zepto.kj1
                        @Override // java.lang.Runnable
                        public final void run() {
                            oj1.k(context);
                        }
                    });
                }
                f80.d(qj2.c, null, null, new b(null), 3, null);
                d();
            }
            nn3.a.b("DexLoader", Intrinsics.stringPlus("Dexloader ==>>> startInitializeDexLoaderClass: ", e), e);
        }
    }
}
