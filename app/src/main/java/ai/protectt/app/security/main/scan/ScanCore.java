package ai.protectt.app.security.main.scan;

import ai.protectt.app.security.common.helper.IsolatedService;
import ai.protectt.app.security.common.helper.NativeInteractor;
import ai.protectt.app.security.main.scan.ScanCore;
import ai.protectt.app.security.recyclerviewhelper.RecyclerViewInteractor;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.app.Activity;
import android.app.admin.DevicePolicyManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.icu.text.SimpleDateFormat;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.os.IBinder;
import android.os.SystemClock;
import android.os.UserHandle;
import android.os.UserManager;
import android.provider.Settings;
import android.system.Os;
import android.util.Base64;
import android.util.Log;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import com.google.gson.Gson;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.zepto.bh1;
import com.zepto.bu7;
import com.zepto.eg5;
import com.zepto.eh4;
import com.zepto.f80;
import com.zepto.gw4;
import com.zepto.if5;
import com.zepto.jt;
import com.zepto.k16;
import com.zepto.m44;
import com.zepto.ml4;
import com.zepto.mx2;
import com.zepto.ni0;
import com.zepto.nn3;
import com.zepto.nq;
import com.zepto.nt;
import com.zepto.oj1;
import com.zepto.pd5;
import com.zepto.qj2;
import com.zepto.qk1;
import com.zepto.qw2;
import com.zepto.rg4;
import com.zepto.ru5;
import com.zepto.s06;
import com.zepto.xy;
import com.zepto.yy0;
import com.zepto.yz0;
import com.zepto.z34;
import com.zepto.zy;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__IteratorsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.text.Charsets;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.Typography;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ScanCore {
    public static final ScanCore a;
    public static final String b;
    public static qw2 c;
    public static List d;
    public static List e;
    public static List f;
    public static List g;
    public static if5 h;
    public static long i;
    public static final ServiceConnection j;
    public static String k;
    public static final BroadcastReceiver l;

    public static final class a extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ if5 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(if5 if5Var, Continuation continuation) {
            super(2, continuation);
            this.e = if5Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((a) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                nn3 nn3Var = nn3.a;
                String str = ScanCore.b;
                NativeInteractor nativeInteractor = NativeInteractor.a;
                nn3Var.f(str, Intrinsics.stringPlus("", Boxing.boxInt(nativeInteractor.r())));
                if (nativeInteractor.r() != 0) {
                    pd5.a.c(this.e, nativeInteractor.r() + '|' + ScanUtils.a.Q());
                }
            } catch (Exception e) {
                nn3.c(nn3.a, ScanCore.b, e.toString(), null, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class a0 extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ Runnable e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(Runnable runnable, Continuation continuation) {
            super(2, continuation);
            this.e = runnable;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((a0) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a0(this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                this.e.run();
            } catch (Exception e) {
                nn3.c(nn3.a, ScanCore.b, e.toString(), null, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class b extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ if5 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(if5 if5Var, Continuation continuation) {
            super(2, continuation);
            this.e = if5Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((b) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                nn3 nn3Var = nn3.a;
                String str = ScanCore.b;
                NativeInteractor nativeInteractor = NativeInteractor.a;
                nn3Var.f(str, Intrinsics.stringPlus("", Boxing.boxInt(nativeInteractor.Q())));
                if (nativeInteractor.Q() != 0) {
                    pd5.a.c(this.e, nativeInteractor.Q() + '|' + ScanUtils.a.Q());
                }
            } catch (Exception e) {
                nn3.c(nn3.a, ScanCore.b, e.toString(), null, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class b0 extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ if5 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(if5 if5Var, Continuation continuation) {
            super(2, continuation);
            this.e = if5Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((b0) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b0(this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                nn3 nn3Var = nn3.a;
                nn3Var.f("DeviceInfo", Intrinsics.stringPlus("", this.e.getMethodname()));
                ArrayList arrayList = new ArrayList();
                new ArrayList();
                List<ml4> addparmsList = this.e.getAddparmsList();
                Intrinsics.checkNotNull(addparmsList);
                nn3Var.f("DeviceInfo", Intrinsics.stringPlus("", new Gson().toJson(addparmsList)));
                if (!addparmsList.isEmpty()) {
                    String addpar1 = "";
                    for (ml4 ml4Var : addparmsList) {
                        nn3 nn3Var2 = nn3.a;
                        String addpar12 = ml4Var.getAddpar1();
                        Intrinsics.checkNotNull(addpar12);
                        nn3Var2.f("DeviceInfo", Intrinsics.stringPlus("", addpar12));
                        addpar1 = ml4Var.getAddpar1();
                        Intrinsics.checkNotNull(addpar1);
                    }
                    str = addpar1;
                } else {
                    str = "";
                }
                if (str.length() > 0) {
                    boolean z = false;
                    List<String> listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{"#"}, false, 0, 6, (Object) null);
                    nn3.a.f("DeviceInfo", Intrinsics.stringPlus("", listSplit$default));
                    for (String str2 : listSplit$default) {
                        switch (Integer.parseInt(str2)) {
                            case 1:
                                ScanCore scanCore = ScanCore.a;
                                if (scanCore.I().length() > 0) {
                                    arrayList.add(scanCore.I());
                                    nn3.a.f("DeviceInfo", Intrinsics.stringPlus("", str2));
                                }
                                break;
                            case 2:
                                xy.a aVar = xy.k;
                                if (!aVar.a().isEmpty()) {
                                    arrayList.add(aVar.a().toString());
                                    nn3.a.f("DeviceInfo", Intrinsics.stringPlus("", str2));
                                }
                                break;
                            case 3:
                                ScanCore scanCore2 = ScanCore.a;
                                if (scanCore2.m1()) {
                                    arrayList.add(scanCore2.A0());
                                    nn3.a.f("DeviceInfo", Intrinsics.stringPlus("", str2));
                                }
                                break;
                            case 4:
                                ScanCore scanCore3 = ScanCore.a;
                                if (scanCore3.h0().length() > 0) {
                                    arrayList.add(scanCore3.h0());
                                    nn3.a.f("DeviceInfo", Intrinsics.stringPlus("", str2));
                                }
                                break;
                            case 5:
                                ScanCore scanCore4 = ScanCore.a;
                                if (scanCore4.R().length() > 0) {
                                    arrayList.add(scanCore4.R());
                                    nn3.a.f("DeviceInfo", Intrinsics.stringPlus("", str2));
                                }
                                break;
                            case 6:
                                if (NativeInteractor.a.c0()) {
                                    arrayList.add("MagiskMountPathIdentify");
                                    nn3.a.f("DeviceInfo", Intrinsics.stringPlus("", str2));
                                }
                                break;
                            case 7:
                                jt.a aVar2 = jt.c;
                                if (aVar2.D().length() > 0 && !Intrinsics.areEqual(aVar2.D(), "SAFE")) {
                                    arrayList.add(aVar2.D());
                                    nn3.a.f("DeviceInfo", Intrinsics.stringPlus("", str2));
                                } else if (aVar2.D().length() == 0) {
                                    ScanAlerts scanAlertsL = aVar2.L();
                                    Intrinsics.checkNotNull(scanAlertsL);
                                    if5 if5VarQ = scanAlertsL.Q(47);
                                    if (if5VarQ != null) {
                                        oj1.a.h(if5VarQ, aVar2.C(), "BOOT");
                                        if (aVar2.D().length() > 0 && !Intrinsics.areEqual(aVar2.D(), "SAFE")) {
                                            arrayList.add(aVar2.D());
                                            nn3.a.f("DeviceInfo", Intrinsics.stringPlus("", str2));
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 8:
                                int iO = NativeInteractor.a.O();
                                String strG0 = ScanCore.a.g0();
                                if (iO != 0 || strG0.length() > 0) {
                                    arrayList.add(iO + '|' + strG0);
                                    nn3.a.f("DeviceInfo", Intrinsics.stringPlus("", str2));
                                }
                                break;
                            case 9:
                                NativeInteractor nativeInteractor = NativeInteractor.a;
                                if (nativeInteractor.r() != 0) {
                                    arrayList.add(String.valueOf(nativeInteractor.r()));
                                    nn3.a.f("DeviceInfo", Intrinsics.stringPlus("", str2));
                                }
                                break;
                            case 10:
                                NativeInteractor nativeInteractor2 = NativeInteractor.a;
                                if (!Intrinsics.areEqual(nativeInteractor2.r0(), "failed")) {
                                    arrayList.add(nativeInteractor2.r0());
                                    nn3.a.f("DeviceInfo", Intrinsics.stringPlus("", str2));
                                }
                                break;
                            case 11:
                                String strB = NativeInteractor.a.B();
                                if (!Intrinsics.areEqual(strB, "G")) {
                                    arrayList.add(strB);
                                    nn3.a.f("DeviceInfo", Intrinsics.stringPlus("", str2));
                                }
                                break;
                            case 12:
                                Object objE = NativeInteractor.a.e(jt.c.C());
                                if (objE != null && objE.toString().length() != 0 && !Intrinsics.areEqual(objE.toString(), "null")) {
                                }
                                arrayList.add(Intrinsics.stringPlus("REF:-", objE));
                                nn3.a.f("DeviceInfo", Intrinsics.stringPlus("", str2));
                                break;
                            default:
                                continue;
                        }
                        z = true;
                    }
                    if (z) {
                        pd5.a.c(this.e, arrayList.toString());
                    }
                }
            } catch (Exception e) {
                nn3.c(nn3.a, ScanCore.b, e.toString(), null, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class c extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ if5 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(if5 if5Var, Continuation continuation) {
            super(2, continuation);
            this.e = if5Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((c) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                String strA = NativeInteractor.a.a();
                if (!Intrinsics.areEqual(strA, "LFO")) {
                    pd5.a.c(this.e, strA);
                }
            } catch (Exception e) {
                nn3.c(nn3.a, ScanCore.b, e.toString(), null, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class c0 extends Lambda implements Function1 {
        public static final c0 c = new c0();

        public c0() {
            super(1);
        }

        public final CharSequence a(byte b) {
            String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(this, *args)");
            return str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).byteValue());
        }
    }

    public static final class d extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            try {
                if (!StringsKt__StringsJVMKt.equals$default(intent.getAction(), "android.intent.action.TIME_SET", false, 2, null) && !StringsKt__StringsJVMKt.equals$default(intent.getAction(), "android.intent.action.TIMEZONE_CHANGED", false, 2, null)) {
                    return;
                }
                z34.a.m(41);
            } catch (Exception e) {
                nn3.a.i(e);
            }
        }
    }

    public static final class d0 extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ if5 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(if5 if5Var, Continuation continuation) {
            super(2, continuation);
            this.e = if5Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((d0) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new d0(this.e, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:66:0x029c A[Catch: Exception -> 0x00da, TRY_LEAVE, TryCatch #0 {Exception -> 0x00da, blocks: (B:5:0x000e, B:8:0x001f, B:11:0x0027, B:12:0x0036, B:14:0x003e, B:16:0x0051, B:18:0x007f, B:19:0x00bb, B:21:0x00c1, B:24:0x00dd, B:27:0x010a, B:29:0x0110, B:31:0x0116, B:33:0x0154, B:41:0x0198, B:43:0x01aa, B:45:0x01b0, B:47:0x01b8, B:49:0x01eb, B:52:0x01fc, B:54:0x0208, B:56:0x021c, B:35:0x0163, B:37:0x0172, B:39:0x0186, B:58:0x022c, B:60:0x0234, B:62:0x0247, B:64:0x0258, B:65:0x027a, B:66:0x029c), top: B:73:0x000e }] */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r5v7 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 703
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.protectt.app.security.main.scan.ScanCore.d0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class e extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ if5 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(if5 if5Var, Continuation continuation) {
            super(2, continuation);
            this.e = if5Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(if5 if5Var) {
            ScanCore.a.F1(if5Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((e) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new e(this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                Log.i(ScanCore.b, "Sanity_test..1");
                final if5 if5Var = this.e;
                ScanCore.a.J(new Runnable() { // from class: com.zepto.kn5
                    @Override // java.lang.Runnable
                    public final void run() {
                        ScanCore.e.d(if5Var);
                    }
                });
            } catch (Exception e) {
                nn3.a.b(ScanCore.b, e.toString(), e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class e0 extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(String str, Continuation continuation) {
            super(2, continuation);
            this.e = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((e0) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new e0(this.e, continuation);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                Log.i(ScanCore.b, "Sanity_test..100");
                jt.a aVar = jt.c;
                ScanAlerts scanAlertsL = aVar.L();
                Intrinsics.checkNotNull(scanAlertsL);
                if5 if5VarQ = scanAlertsL.Q(232);
                if (if5VarQ != null) {
                    pd5.a.c(if5VarQ, this.e + ' ' + ScanUtils.a.Q());
                } else {
                    List listW = aVar.w();
                    Object obj2 = null;
                    if5 if5Var = null;
                    if (listW != null) {
                        Iterator it = listW.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            if (((if5) next).getRuleid() == 232) {
                                obj2 = next;
                                break;
                            }
                        }
                        if5Var = (if5) obj2;
                    }
                    if (if5Var != null) {
                        pd5.a.c(if5Var, this.e + ' ' + ScanUtils.a.Q());
                    } else {
                        nn3.a.f(ScanCore.b, "Rule not configured...");
                    }
                }
            } catch (Exception e) {
                nn3.a.b(ScanCore.b, e.toString(), e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class f extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ if5 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(if5 if5Var, Continuation continuation) {
            super(2, continuation);
            this.e = if5Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((f) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new f(this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                jt.a aVar = jt.c;
                if (aVar.j() != null) {
                    zy zyVarJ = aVar.j();
                    Intrinsics.checkNotNull(zyVarJ);
                    String attestationResInfo = zyVarJ.getAttestationResInfo();
                    if (Intrinsics.areEqual(attestationResInfo, NativeInteractor.a.X0())) {
                        nn3.a.f(ScanCore.b, Intrinsics.stringPlus("Attestation happened.. ", attestationResInfo));
                    } else {
                        nn3.a.f(ScanCore.b, Intrinsics.stringPlus("Attestation happened.. ", attestationResInfo));
                        if (ScanCore.a.V0()) {
                            ScanUtils.a.b0(this.e, k16.a.b("stat /data/local/tmp", true));
                        }
                    }
                }
            } catch (Exception e) {
                nn3.a.b(ScanCore.b, e.toString(), e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class f0 extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ Context e;
        public final /* synthetic */ if5 f;

        public static final class a extends SuspendLambda implements Function2 {
            public int c;
            public final /* synthetic */ List e;
            public final /* synthetic */ if5 f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List list, if5 if5Var, Continuation continuation) {
                super(2, continuation);
                this.e = list;
                this.f = if5Var;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(yz0 yz0Var, Continuation continuation) {
                return ((a) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.e, this.f, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.c;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.c = 1;
                        if (bh1.a(2000L, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    nn3.a.f(ScanCore.b, Intrinsics.stringPlus("after 2s Doafformation is done", Boxing.boxBoolean(jt.c.d0())));
                    String strE = NativeInteractor.a.E();
                    if (this.e.contains(strE)) {
                        ScanUtils.a.Y0(242);
                    } else {
                        if (strE.length() == 0) {
                            strE = Intrinsics.stringPlus("After 2s delay still add is empty:-", Boxing.boxBoolean(ScanUtils.a.v0()));
                        }
                        ScanUtils.a.b0(this.f, strE);
                    }
                } catch (Exception e) {
                    nn3.c(nn3.a, ScanCore.b, e.toString(), null, 4, null);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(Context context, if5 if5Var, Continuation continuation) {
            super(2, continuation);
            this.e = context;
            this.f = if5Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((f0) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new f0(this.e, this.f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                if (ScanUtils.a.B0(this.e)) {
                    ArrayList arrayList = new ArrayList();
                    new ArrayList();
                    List<ml4> addparmsList = this.f.getAddparmsList();
                    Intrinsics.checkNotNull(addparmsList);
                    if (!addparmsList.isEmpty()) {
                        for (ml4 ml4Var : addparmsList) {
                            if (!CollectionsKt___CollectionsKt.contains(arrayList, ml4Var.getAddpar1())) {
                                nn3.a.f(ScanCore.b, Intrinsics.stringPlus("", ml4Var.getAddpar1()));
                                String addpar1 = ml4Var.getAddpar1();
                                Intrinsics.checkNotNull(addpar1);
                                arrayList.add(addpar1);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            nn3 nn3Var = nn3.a;
                            nn3Var.f(ScanCore.b, Intrinsics.stringPlus("white list NetworkAddress", arrayList));
                            String str = ScanCore.b;
                            jt.a aVar = jt.c;
                            nn3Var.f(str, Intrinsics.stringPlus("Doafformation is done", Boxing.boxBoolean(aVar.d0())));
                            String str2 = ScanCore.b;
                            NativeInteractor nativeInteractor = NativeInteractor.a;
                            nn3Var.f(str2, Intrinsics.stringPlus("current Address", nativeInteractor.E()));
                            if (!aVar.d0()) {
                                f80.d(qj2.c, null, null, new a(arrayList, this.f, null), 3, null);
                            } else if (arrayList.contains(nativeInteractor.E())) {
                                ScanUtils.a.Y0(242);
                            } else {
                                ScanUtils.a.b0(this.f, nativeInteractor.E());
                            }
                        } else {
                            nn3.a.f(ScanCore.b, "NetworkAddress is empty ,No need to do anything");
                        }
                    } else {
                        nn3.a.f(ScanCore.b, "addParams is empty...");
                    }
                }
            } catch (Exception e) {
                nn3.c(nn3.a, ScanCore.b, e.toString(), null, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class g extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ if5 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(if5 if5Var, Continuation continuation) {
            super(2, continuation);
            this.e = if5Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((g) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new g(this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                List listK = jt.c.K();
                boolean z = false;
                List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Boxing.boxInt(47), Boxing.boxInt(207), Boxing.boxInt(219), Boxing.boxInt(235), Boxing.boxInt(250)});
                if (!(listListOf instanceof Collection) || !listListOf.isEmpty()) {
                    Iterator it = listListOf.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (listK.contains(Boxing.boxInt(((Number) it.next()).intValue()))) {
                            z = true;
                            break;
                        }
                    }
                }
                jt.a aVar = jt.c;
                if (aVar.g().length() > 0 && !z) {
                    ScanUtils.a.b0(this.e, aVar.g());
                }
            } catch (Exception e) {
                nn3.c(nn3.a, ScanCore.b, e.toString(), null, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class g0 extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ if5 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(if5 if5Var, Continuation continuation) {
            super(2, continuation);
            this.e = if5Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(if5 if5Var) {
            NativeInteractor nativeInteractor = NativeInteractor.a;
            String strV = nativeInteractor.v();
            nn3 nn3Var = nn3.a;
            nn3Var.f(ScanCore.b, Intrinsics.stringPlus("Dalvik-Dex:-", strV));
            nn3Var.f(ScanCore.b, Intrinsics.stringPlus("Debuggable-Ro-", Integer.valueOf(nativeInteractor.l())));
            nn3Var.f(ScanCore.b, Intrinsics.stringPlus("persistDebuggable-", Integer.valueOf(nativeInteractor.j0())));
            if (!Intrinsics.areEqual(strV, "Not-found") || nativeInteractor.l() == 1 || nativeInteractor.j0() == 1) {
                ScanUtils scanUtils = ScanUtils.a;
                scanUtils.b0(if5Var, "Dalvik-Dex:-" + strV + "||Debuggable-Ro-" + nativeInteractor.l() + "||persistDebuggable-" + nativeInteractor.j0() + '|' + scanUtils.Q());
            }
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((g0) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new g0(this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                final if5 if5Var = this.e;
                ScanCore.a.J(new Runnable() { // from class: com.zepto.vn5
                    @Override // java.lang.Runnable
                    public final void run() {
                        ScanCore.g0.d(if5Var);
                    }
                });
            } catch (Exception e) {
                nn3.c(nn3.a, ScanCore.b, e.toString(), null, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class h extends SuspendLambda implements Function2 {
        public int c;

        public h(Continuation continuation) {
            super(2, continuation);
        }

        public static final void d() {
            jt.a aVar = jt.c;
            Activity activityR = aVar.r();
            Intrinsics.checkNotNull(activityR);
            Intent intent = new Intent(activityR, (Class<?>) IsolatedService.class);
            Activity activityR2 = aVar.r();
            Intrinsics.checkNotNull(activityR2);
            activityR2.bindService(intent, ScanCore.j, 1);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((h) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new h(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                Log.i(ScanCore.b, "Sanity_test..v3");
                ScanCore.a.J(new Runnable() { // from class: com.zepto.ln5
                    @Override // java.lang.Runnable
                    public final void run() {
                        ScanCore.h.d();
                    }
                });
            } catch (Exception e) {
                nn3.a.b(ScanCore.b, e.toString(), e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class i extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ if5 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(if5 if5Var, Continuation continuation) {
            super(2, continuation);
            this.e = if5Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((i) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new i(this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                String strI = ScanCore.a.I();
                if (strI.length() > 0) {
                    ScanUtils scanUtils = ScanUtils.a;
                    scanUtils.b0(this.e, strI + '#' + scanUtils.Q());
                }
            } catch (Exception e) {
                nn3.c(nn3.a, ScanCore.b, e.toString(), null, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class j extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ if5 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(if5 if5Var, Continuation continuation) {
            super(2, continuation);
            this.e = if5Var;
        }

        public static final void d(long j) {
            Toast.makeText(jt.c.r(), Intrinsics.stringPlus("Avg:", Long.valueOf(j)), 1).show();
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((j) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new j(this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean zF;
            Activity activityR;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                String strSubstring = String.valueOf(System.currentTimeMillis()).substring(0, 3);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                ScanCore scanCore = ScanCore.a;
                long jX1 = scanCore.x1(Intrinsics.stringPlus(VContant.MAINSCREEN, strSubstring));
                String strStringPlus = Intrinsics.stringPlus(strSubstring, strSubstring);
                long jX12 = scanCore.x1(Intrinsics.stringPlus(VContant.APPLICATION_SCREEN, strStringPlus));
                String str = strStringPlus + strStringPlus + strStringPlus;
                long jX13 = scanCore.x1(Intrinsics.stringPlus("3", str));
                String str2 = str + str + str + str;
                long jX14 = scanCore.x1(Intrinsics.stringPlus("4", str2));
                String str3 = str2 + str2 + str2 + str2 + str2;
                long jX15 = scanCore.x1(Intrinsics.stringPlus(VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE, str3));
                String str4 = str3 + str3 + str3 + str3 + str3 + str3;
                long jX16 = scanCore.x1(Intrinsics.stringPlus(VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE, str4));
                String str5 = str4 + str4 + str4 + str4 + str4 + str4 + str4;
                final long jX17 = (((((((jX1 + jX12) + jX13) + jX14) + jX15) + jX16) + scanCore.x1(Intrinsics.stringPlus(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE, str5))) + scanCore.x1(Intrinsics.stringPlus(VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE, str5 + str5 + str5 + str5 + str5 + str5 + str5 + str5))) / ((long) 8);
                nn3 nn3Var = nn3.a;
                nn3Var.f(ScanCore.b, Intrinsics.stringPlus("Avg--> ", Boxing.boxLong(jX17)));
                if (this.e != null) {
                    if (gw4.a.b() && (activityR = jt.c.r()) != null) {
                        activityR.runOnUiThread(new Runnable() { // from class: com.zepto.mn5
                            @Override // java.lang.Runnable
                            public final void run() {
                                ScanCore.j.d(jX17);
                            }
                        });
                    }
                    new ArrayList();
                    List<ml4> addparmsList = this.e.getAddparmsList();
                    Intrinsics.checkNotNull(addparmsList);
                    nn3Var.f("TimerOFAvg", Intrinsics.stringPlus("", new Gson().toJson(addparmsList)));
                    if (!addparmsList.isEmpty()) {
                        zF = false;
                        for (ml4 ml4Var : addparmsList) {
                            nn3 nn3Var2 = nn3.a;
                            String addpar1 = ml4Var.getAddpar1();
                            Intrinsics.checkNotNull(addpar1);
                            nn3Var2.f("TimerOFAvg", Intrinsics.stringPlus("", Boxing.boxInt(Integer.parseInt(addpar1))));
                            Context contextC = jt.c.C();
                            String addpar12 = ml4Var.getAddpar1();
                            Intrinsics.checkNotNull(addpar12);
                            zF = NativeInteractor.a.f((int) jX17, contextC, Integer.parseInt(addpar12));
                        }
                    } else {
                        nn3Var.f("TimerOFAvg", "100");
                        zF = NativeInteractor.a.f((int) jX17, jt.c.C(), 100);
                    }
                    if (zF) {
                        ScanUtils.a.b0(this.e, Intrinsics.stringPlus("avg time is ", Boxing.boxLong(jX17)));
                    }
                }
            } catch (Exception e) {
                nn3.a.f("cipherAttackDetection", e.toString());
            } catch (UnsatisfiedLinkError e2) {
                nn3.a.f("cipherAttackDetection", e2.toString());
            }
            return Unit.INSTANCE;
        }
    }

    public static final class k implements Runnable {
        public final /* synthetic */ Activity c;

        public k(Activity activity) {
            this.c = activity;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.c.getWindow().clearFlags(ConstantsKt.DEFAULT_BUFFER_SIZE);
        }
    }

    public static final class l extends SuspendLambda implements Function2 {
        public int c;

        public l(Continuation continuation) {
            super(2, continuation);
        }

        public static final void e(IntegrityTokenResponse integrityTokenResponse) {
            String integrityToken = integrityTokenResponse.token();
            nt ntVarH = jt.c.H();
            if (ntVarH == null) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue(integrityToken, "integrityToken");
            ntVarH.d(integrityToken);
        }

        public static final void g(Exception exc) {
            if (exc != null) {
                nn3 nn3Var = nn3.a;
                nn3Var.b(ScanCore.b, exc.toString(), exc);
                ScanCore scanCore = ScanCore.a;
                nn3.c(nn3Var, ScanCore.b, Intrinsics.stringPlus("Error Code is", scanCore.p0(exc)), null, 4, null);
                String message = exc.getMessage();
                if (message != null) {
                    if (!eg5.a.g().contains(Integer.valueOf(Integer.parseInt(new Regex(":(.*)").replace(new Regex("\n").replace(message, ""), "")))) || ScanCore.i > 6000) {
                        return;
                    }
                    ScanCore.i += 2000;
                    scanCore.e0();
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new l(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((l) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j = ScanCore.i;
                this.c = 1;
                if (bh1.a(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            try {
                s06 s06VarA = s06.m.a();
                String strM = s06VarA == null ? null : s06VarA.m();
                if (strM == null || strM.length() == 0) {
                    jt.a aVar = jt.c;
                    if (aVar.I().length() > 0) {
                        long j2 = Long.parseLong(aVar.I());
                        String strL0 = ScanCore.a.l0();
                        IntegrityManager integrityManagerCreate = IntegrityManagerFactory.create(aVar.C());
                        Intrinsics.checkNotNullExpressionValue(integrityManagerCreate, "create(AppProtecttInteractor.mAppContext)");
                        Task taskRequestIntegrityToken = integrityManagerCreate.requestIntegrityToken(IntegrityTokenRequest.builder().setCloudProjectNumber(j2).setNonce(strL0).build());
                        taskRequestIntegrityToken.f(new eh4() { // from class: com.zepto.nn5
                            @Override // com.zepto.eh4
                            public final void b(Object obj2) {
                                ScanCore.l.e((IntegrityTokenResponse) obj2);
                            }
                        });
                        taskRequestIntegrityToken.d(new rg4() { // from class: com.zepto.on5
                            @Override // com.zepto.rg4
                            public final void a(Exception exc) {
                                ScanCore.l.g(exc);
                            }
                        });
                    } else {
                        nn3.a.f(ScanCore.b, "pro_Num is empty");
                    }
                } else {
                    nn3.a.f(ScanCore.b, Intrinsics.stringPlus("local integrity ", strM));
                    ScanCore.b0(ScanCore.a, strM, null, 2, null);
                }
            } catch (Exception e) {
                nn3.a.b(ScanCore.b, e.toString(), e);
            } catch (NoClassDefFoundError e2) {
                Log.e(ScanCore.b, e2.toString());
            }
            return Unit.INSTANCE;
        }
    }

    public static final class m implements Runnable {
        public final /* synthetic */ Activity c;

        public m(Activity activity) {
            this.c = activity;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.c.getWindow().setFlags(ConstantsKt.DEFAULT_BUFFER_SIZE, ConstantsKt.DEFAULT_BUFFER_SIZE);
        }
    }

    public static final class n extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ if5 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(if5 if5Var, Continuation continuation) {
            super(2, continuation);
            this.e = if5Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((n) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new n(this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.c = 1;
                if (bh1.a(3000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            try {
                String strB = NativeInteractor.a.B();
                nn3.a.f(ScanCore.b, Intrinsics.stringPlus("So-load:-", strB));
                if (!Intrinsics.areEqual(strB, "G")) {
                    pd5.a.c(this.e, strB + '|' + ScanUtils.a.Q());
                }
                if (jt.c.f()) {
                    ScanCore.a.i0(this.e);
                }
            } catch (Exception e) {
                nn3.a.b(ScanCore.b, e.toString(), e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ if5 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(if5 if5Var, Continuation continuation) {
            super(2, continuation);
            this.e = if5Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(if5 if5Var) {
            String strA0 = NativeInteractor.a.a0();
            nn3.a.f(ScanCore.b, Intrinsics.stringPlus("Script:-", strA0));
            if (Intrinsics.areEqual(strA0, "G")) {
                return;
            }
            ScanUtils scanUtils = ScanUtils.a;
            scanUtils.b0(if5Var, strA0 + '|' + scanUtils.Q());
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((o) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new o(this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                final if5 if5Var = this.e;
                ScanCore.a.J(new Runnable() { // from class: com.zepto.pn5
                    @Override // java.lang.Runnable
                    public final void run() {
                        ScanCore.o.d(if5Var);
                    }
                });
            } catch (Exception e) {
                nn3.a.b(ScanCore.b, e.toString(), e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class p extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ if5 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(if5 if5Var, Continuation continuation) {
            super(2, continuation);
            this.e = if5Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((p) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new p(this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                StringBuilder sb = new StringBuilder();
                NativeInteractor nativeInteractor = NativeInteractor.a;
                sb.append(nativeInteractor.s());
                sb.append('|');
                sb.append(nativeInteractor.p());
                String string = sb.toString();
                nn3.a.f("DetectAF", Intrinsics.stringPlus("LEO:-->", string));
                if (StringsKt__StringsKt.contains$default((CharSequence) string, (CharSequence) "LEO", false, 2, (Object) null)) {
                    ScanUtils.a.b0(this.e, string);
                }
            } catch (Exception e) {
                nn3.c(nn3.a, ScanCore.b, e.toString(), null, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class q extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ File e;
        public final /* synthetic */ File f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(File file, File file2, Continuation continuation) {
            super(2, continuation);
            this.e = file;
            this.f = file2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((q) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new q(this.e, this.f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            try {
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
                if (this.e.exists()) {
                    this.e.delete();
                }
                if (this.f.exists()) {
                    this.f.delete();
                }
                nn3.a.f(ScanCore.b, "login file deleted");
            } catch (Exception e) {
                nn3.c(nn3.a, ScanCore.b, e.toString(), null, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class r extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ File e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(File file, Continuation continuation) {
            super(2, continuation);
            this.e = file;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((r) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new r(this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            try {
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
                if (this.e.exists()) {
                    this.e.delete();
                }
                nn3.a.f(ScanCore.b, "login et file deleted");
            } catch (Exception e) {
                nn3.c(nn3.a, ScanCore.b, e.toString(), null, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class s extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ if5 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(if5 if5Var, Continuation continuation) {
            super(2, continuation);
            this.e = if5Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((s) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new s(this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                jt.a aVar = jt.c;
                if (aVar.j() != null) {
                    zy zyVarJ = aVar.j();
                    Intrinsics.checkNotNull(zyVarJ);
                    String attestationResInfo = zyVarJ.getAttestationResInfo();
                    NativeInteractor nativeInteractor = NativeInteractor.a;
                    if (Intrinsics.areEqual(attestationResInfo, nativeInteractor.X0())) {
                        nn3.a.f(ScanCore.b, Intrinsics.stringPlus("Attestation happened.. ", attestationResInfo));
                    } else {
                        String strR0 = nativeInteractor.r0();
                        if (!Intrinsics.areEqual(strR0, "failed")) {
                            ScanUtils scanUtils = ScanUtils.a;
                            scanUtils.b0(this.e, "Empty:-" + strR0 + '|' + scanUtils.Q());
                        }
                    }
                } else {
                    ScanCore.a.d0();
                    zy zyVarJ2 = aVar.j();
                    String attestationResInfo2 = zyVarJ2 == null ? null : zyVarJ2.getAttestationResInfo();
                    NativeInteractor nativeInteractor2 = NativeInteractor.a;
                    if (!Intrinsics.areEqual(attestationResInfo2, nativeInteractor2.X0())) {
                        String strR02 = nativeInteractor2.r0();
                        if (!Intrinsics.areEqual(strR02, "failed")) {
                            ScanUtils scanUtils2 = ScanUtils.a;
                            scanUtils2.b0(this.e, "Empty:-" + strR02 + '|' + scanUtils2.Q());
                        }
                    }
                }
            } catch (Exception e) {
                nn3.c(nn3.a, ScanCore.b, e.toString(), null, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class t extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ Context e;
        public final /* synthetic */ if5 f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(Context context, if5 if5Var, Continuation continuation) {
            super(2, continuation);
            this.e = context;
            this.f = if5Var;
        }

        public static final void d(Context context, if5 if5Var) {
            try {
                ArrayList arrayList = new ArrayList();
                PackageManager packageManager = context.getPackageManager();
                Intrinsics.checkNotNull(packageManager);
                int i = 0;
                List<PackageInfo> installedPackages = packageManager.getInstalledPackages(0);
                Intrinsics.checkNotNullExpressionValue(installedPackages, "context.packageManager!!…                        )");
                for (PackageInfo packages : installedPackages) {
                    ScanUtils scanUtils = ScanUtils.a;
                    Intrinsics.checkNotNullExpressionValue(packages, "packages");
                    if (!scanUtils.y0(packages)) {
                        i++;
                        String str = packages.packageName;
                        Intrinsics.checkNotNullExpressionValue(str, "packages.packageName");
                        arrayList.add(str);
                    }
                }
                if (i <= 10) {
                    nn3.a.f(ScanCore.b, "unsafe" + i + "--" + ((Object) new Gson().toJson(arrayList)));
                    ScanUtils scanUtils2 = ScanUtils.a;
                    String json = new Gson().toJson(arrayList);
                    Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(appList)");
                    scanUtils2.b0(if5Var, json);
                }
            } catch (Exception e) {
                nn3.a.b(ScanCore.b, e.toString(), e);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((t) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new t(this.e, this.f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            ScanCore scanCore;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                scanCore = ScanCore.a;
            } catch (Exception e) {
                nn3.a.b("TAG", Intrinsics.stringPlus(">>>>>>>>>>>> installAppsBehaviour: Error: ", e), e);
            }
            if (scanCore.T0(this.e)) {
                return Unit.INSTANCE;
            }
            final Context context = this.e;
            final if5 if5Var = this.f;
            scanCore.J(new Runnable() { // from class: com.zepto.sn5
                @Override // java.lang.Runnable
                public final void run() {
                    ScanCore.t.d(context, if5Var);
                }
            });
            return Unit.INSTANCE;
        }
    }

    public static final class u extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(String str, Continuation continuation) {
            super(2, continuation);
            this.e = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((u) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new u(this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                jt.a aVar = jt.c;
                ScanAlerts scanAlertsL = aVar.L();
                if5 if5VarQ = scanAlertsL == null ? null : scanAlertsL.Q(1010);
                if (if5VarQ != null && StringsKt__StringsKt.contains$default((CharSequence) this.e, (CharSequence) "doAffirmation", false, 2, (Object) null) && !aVar.o()) {
                    ScanUtils.a.b0(if5VarQ, "");
                }
            } catch (Exception e) {
                nn3.c(nn3.a, ScanCore.b, e.toString(), null, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class v extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ Context e;
        public final /* synthetic */ if5 f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(Context context, if5 if5Var, Continuation continuation) {
            super(2, continuation);
            this.e = context;
            this.f = if5Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((v) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new v(this.e, this.f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                ScanUtils scanUtils = ScanUtils.a;
                if (scanUtils.B0(this.e) && scanUtils.c0(this.e).length() > 0) {
                    scanUtils.b0(this.f, scanUtils.c0(this.e));
                }
            } catch (Exception e) {
                nn3.c(nn3.a, ScanCore.b, e.toString(), null, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class w extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ if5 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(if5 if5Var, Continuation continuation) {
            super(2, continuation);
            this.e = if5Var;
        }

        public static final void d(if5 if5Var) {
            int iO = NativeInteractor.a.O();
            nn3 nn3Var = nn3.a;
            nn3Var.f(ScanCore.b, Intrinsics.stringPlus("JIT_COUNT:-", Integer.valueOf(iO)));
            String strG0 = ScanCore.a.g0();
            if (iO != 0 || strG0.length() > 0) {
                nn3Var.f("verifyCertificateChain", Intrinsics.stringPlus("JIT_COUNT:-", Integer.valueOf(iO)));
                ScanUtils scanUtils = ScanUtils.a;
                StringBuilder sb = new StringBuilder();
                sb.append("JIT_COUNT:-");
                sb.append(iO);
                sb.append("||ExceptionRes:-");
                if (strG0.length() == 0) {
                    strG0 = "G";
                }
                sb.append(strG0);
                sb.append('|');
                sb.append(scanUtils.Q());
                scanUtils.b0(if5Var, sb.toString());
            }
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((w) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new w(this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                final if5 if5Var = this.e;
                ScanCore.a.J(new Runnable() { // from class: com.zepto.tn5
                    @Override // java.lang.Runnable
                    public final void run() {
                        ScanCore.w.d(if5Var);
                    }
                });
            } catch (Exception e) {
                nn3.c(nn3.a, ScanCore.b, e.toString(), null, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class x extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ if5 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(if5 if5Var, Continuation continuation) {
            super(2, continuation);
            this.e = if5Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(if5 if5Var) {
            if (ScanCore.a.m1()) {
                pd5.a.c(if5Var, ScanUtils.a.Q());
            }
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((x) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new x(this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                Log.i(ScanCore.b, "Sanity_test..200");
                final if5 if5Var = this.e;
                ScanCore.a.J(new Runnable() { // from class: com.zepto.un5
                    @Override // java.lang.Runnable
                    public final void run() {
                        ScanCore.x.d(if5Var);
                    }
                });
            } catch (Exception e) {
                nn3.a.b(ScanCore.b, e.toString(), e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class y implements ServiceConnection {

        public static final class a extends SuspendLambda implements Function2 {
            public int c;
            public final /* synthetic */ boolean e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z, Continuation continuation) {
                super(2, continuation);
                this.e = z;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(yz0 yz0Var, Continuation continuation) {
                return ((a) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.e, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                try {
                    ScanAlerts scanAlertsL = jt.c.L();
                    Intrinsics.checkNotNull(scanAlertsL);
                    if5 if5VarQ = scanAlertsL.Q(219);
                    if (if5VarQ != null) {
                        boolean z = this.e;
                        pd5 pd5Var = pd5.a;
                        StringBuilder sb = new StringBuilder();
                        String str = "G";
                        sb.append(z ? "magiskMount info path exit" : "G");
                        sb.append('|');
                        String strL0 = NativeInteractor.a.l0();
                        if (strL0.length() != 0) {
                            str = strL0;
                        }
                        sb.append(str);
                        sb.append('|');
                        sb.append(ScanUtils.a.Q());
                        pd5Var.c(if5VarQ, sb.toString());
                    }
                } catch (Exception e) {
                    nn3.a.b(ScanCore.b, Intrinsics.stringPlus("Exception :: ", e.getMessage()), e);
                }
                return Unit.INSTANCE;
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Intrinsics.checkNotNullParameter(componentName, "componentName");
            Intrinsics.checkNotNullParameter(iBinder, "iBinder");
            try {
                ScanCore scanCore = ScanCore.a;
                ScanCore.c = qw2.a.c(iBinder);
                nn3.a.f(ScanCore.b, "Service bound");
                qw2 qw2Var = ScanCore.c;
                Intrinsics.checkNotNull(qw2Var);
                boolean zQ = qw2Var.Q();
                if (!zQ && NativeInteractor.a.l0().length() <= 0) {
                    return;
                }
                f80.d(qj2.c, null, null, new a(zQ, null), 3, null);
            } catch (Exception e) {
                nn3.a.b(ScanCore.b, Intrinsics.stringPlus("Exception :: ", e.getMessage()), e);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Intrinsics.checkNotNullParameter(componentName, "componentName");
            nn3.a.f(ScanCore.b, "Service Unbound");
        }
    }

    public static final class z extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ if5 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(if5 if5Var, Continuation continuation) {
            super(2, continuation);
            this.e = if5Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((z) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new z(this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List<String> groupValues;
            String str;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                Integer numBoxInt = null;
                MatchResult matchResultFind$default = Regex.find$default(new Regex("Links: (\\d+)"), k16.a.b("stat /debug_ramdisk", true), 0, 2, null);
                if (matchResultFind$default != null && (groupValues = matchResultFind$default.getGroupValues()) != null && (str = groupValues.get(1)) != null) {
                    numBoxInt = Boxing.boxInt(Integer.parseInt(str));
                }
                if (numBoxInt != null && numBoxInt.intValue() > 2) {
                    ScanUtils.a.b0(this.e, Intrinsics.stringPlus("linksOfRamdisk:", numBoxInt));
                }
            } catch (Exception e) {
                nn3.c(nn3.a, ScanCore.b, e.toString(), null, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        ScanCore scanCore = new ScanCore();
        a = scanCore;
        b = "ScanCore";
        d = new ArrayList();
        e = new ArrayList();
        f = new ArrayList();
        g = new ArrayList();
        j = new y();
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        NativeInteractor nativeInteractor = NativeInteractor.a;
        sb.append(scanCore.E0(nativeInteractor.m0()));
        sb.append('|');
        sb.append(scanCore.E0(nativeInteractor.n0()));
        sb.append('|');
        sb.append(scanCore.E0(nativeInteractor.o0()));
        sb.append(']');
        k = sb.toString();
        l = new d();
    }

    public static final void F(if5 rule) {
        Intrinsics.checkNotNullParameter(rule, "$rule");
        ScanCore scanCore = a;
        if (scanCore.R().length() <= 0 && scanCore.h0().length() <= 0) {
            return;
        }
        pd5.a.c(rule, ScanUtils.a.Q());
    }

    public static final void Q0(if5 rule) {
        Intrinsics.checkNotNullParameter(rule, "$rule");
        if (Intrinsics.areEqual(rule.getRuleaction(), NativeInteractor.a.e1())) {
            RecyclerViewInteractor.a aVar = RecyclerViewInteractor.c;
            aVar.o().setVisibility(8);
            ConstraintLayout constraintLayoutM = aVar.m();
            if (constraintLayoutM == null) {
                return;
            }
            constraintLayoutM.setVisibility(0);
        }
    }

    public static final void S0(if5 rule) {
        Intrinsics.checkNotNullParameter(rule, "$rule");
        if (Intrinsics.areEqual(rule.getRuleaction(), NativeInteractor.a.e1())) {
            RecyclerViewInteractor.a aVar = RecyclerViewInteractor.c;
            aVar.o().setVisibility(8);
            ConstraintLayout constraintLayoutM = aVar.m();
            if (constraintLayoutM == null) {
                return;
            }
            constraintLayoutM.setVisibility(0);
        }
    }

    public static final void W(nq it) {
        Intrinsics.checkNotNullParameter(it, "$it");
        it.j();
    }

    public static final void X(if5 rule) {
        Intrinsics.checkNotNullParameter(rule, "$rule");
        if (Intrinsics.areEqual(rule.getRuleaction(), NativeInteractor.a.e1())) {
            RecyclerViewInteractor.a aVar = RecyclerViewInteractor.c;
            aVar.o().setVisibility(8);
            ConstraintLayout constraintLayoutM = aVar.m();
            if (constraintLayoutM == null) {
                return;
            }
            constraintLayoutM.setVisibility(0);
        }
    }

    public static final void Y(nq it) {
        Intrinsics.checkNotNullParameter(it, "$it");
        it.j();
    }

    public static /* synthetic */ void b0(ScanCore scanCore, String str, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        scanCore.a0(str, str2);
    }

    public static final void g1(if5 rule) {
        Intrinsics.checkNotNullParameter(rule, "$rule");
        jt.a aVar = jt.c;
        boolean z2 = Settings.Global.getInt(aVar.C().getContentResolver(), "adb_wifi_enabled", 1) > 0;
        boolean z3 = Settings.Global.getInt(aVar.C().getContentResolver(), "adb_enabled", 1) > 0;
        ScanUtils scanUtils = ScanUtils.a;
        if (!scanUtils.F0(aVar.C()) || z2 || z3) {
            return;
        }
        Triple tripleY = scanUtils.y();
        String str = (String) tripleY.component1();
        String str2 = (String) tripleY.component2();
        String str3 = (String) tripleY.component3();
        ScanCore scanCore = a;
        String strE0 = scanCore.E0(scanCore.T("c2VydmljZS5hZGIudGNwLnBvcnQ="));
        if (str == null || !StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) scanCore.T("cnVubmluZw=="), false, 2, (Object) null) || strE0.length() <= 0 || strE0.length() < 4) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("initSvcAdbd:-");
        sb.append((Object) str);
        sb.append("|usbConfig:-");
        sb.append((Object) str2);
        sb.append("|tcpPort:-");
        sb.append((Object) str3);
        sb.append("|wirelessADBEnableflag:-");
        sb.append(z2);
        sb.append("|bootInfo:-");
        zy zyVarJ = aVar.j();
        Intrinsics.checkNotNull(zyVarJ);
        sb.append((Object) zyVarJ.getAttestationResInfo());
        sb.append("|USB:-");
        sb.append(z3);
        scanUtils.b0(rule, sb.toString());
    }

    public static final void u0(if5 rule) {
        Intrinsics.checkNotNullParameter(rule, "$rule");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = jCurrentTimeMillis - jElapsedRealtime;
        if (jCurrentTimeMillis - j2 <= 60000) {
            nn3.a.f("getLastRebootTime", Intrinsics.stringPlus("", new Date(j2)));
            ScanUtils scanUtils = ScanUtils.a;
            String string = new Date(j2).toString();
            Intrinsics.checkNotNullExpressionValue(string, "Date(rebootTimeMillis).toString()");
            scanUtils.b0(rule, string);
        }
    }

    public final String A0() {
        return k;
    }

    public final void A1(String res) {
        Intrinsics.checkNotNullParameter(res, "res");
        f80.d(qj2.c, qk1.a(), null, new e0(res, null), 2, null);
    }

    public final boolean B() {
        try {
            jt.a aVar = jt.c;
            zy zyVarJ = aVar.j();
            boolean z2 = !Intrinsics.areEqual(zyVarJ == null ? null : zyVarJ.getAttestationResInfo(), NativeInteractor.a.X0());
            ScanUtils scanUtils = ScanUtils.a;
            if (scanUtils.F0(aVar.C()) && z2) {
                Triple tripleY = scanUtils.y();
                String str = (String) tripleY.component1();
                String str2 = (String) tripleY.component2();
                String str3 = (String) tripleY.component3();
                String strE0 = E0(T("c2VydmljZS5hZGIudGNwLnBvcnQ="));
                if (str != null && str2 != null && str3 != null && StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) T("cnVubmluZw=="), false, 2, (Object) null) && StringsKt__StringsKt.contains$default((CharSequence) str2, (CharSequence) T("YWRi"), false, 2, (Object) null) && strE0.length() > 0) {
                    if (strE0.length() >= 4) {
                        return true;
                    }
                }
            }
        } catch (Exception e2) {
            nn3.c(nn3.a, b, e2.toString(), null, 4, null);
        }
        return false;
    }

    public final String[] B0() {
        NativeInteractor nativeInteractor = NativeInteractor.a;
        String[] strArrX1 = nativeInteractor.x1();
        ArrayList arrayList = new ArrayList(Arrays.asList(Arrays.copyOf(strArrX1, strArrX1.length)));
        String strX = nativeInteractor.x();
        if (Intrinsics.areEqual("", strX)) {
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        Object[] array2 = new Regex(":").split(strX, 0).toArray(new String[0]);
        if (array2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        String[] strArr = (String[]) array2;
        int length = strArr.length;
        int i2 = 0;
        while (i2 < length) {
            String str = strArr[i2];
            i2++;
            if (!StringsKt__StringsJVMKt.endsWith$default(str, "/", false, 2, null)) {
                Intrinsics.stringPlus(str, "/");
            }
            if (!arrayList.contains(str)) {
                arrayList.add(str);
            }
        }
        Object[] array3 = arrayList.toArray(new String[0]);
        if (array3 != null) {
            return (String[]) array3;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public final void B1(if5 rule, Context context) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        Intrinsics.checkNotNullParameter(context, "context");
        f80.d(qj2.c, null, null, new f0(context, rule, null), 3, null);
    }

    public final void C(if5 rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        f80.d(qj2.c, qk1.a(), null, new e(rule, null), 2, null);
    }

    public final String C0() {
        try {
            return StringsKt__StringsKt.trim((CharSequence) k16.a.b("getprop", true)).toString();
        } catch (Exception e2) {
            nn3.c(nn3.a, b, e2.toString(), null, 4, null);
            return "";
        }
    }

    public final boolean C1(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getPackageInfo("com.android.vending", 0).applicationInfo;
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public final void D(if5 rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        f80.d(qj2.c, qk1.a(), null, new f(rule, null), 2, null);
    }

    public final String D0(String str) {
        try {
            Process processExec = Runtime.getRuntime().exec(Intrinsics.stringPlus("getprop ", str));
            return new BufferedReader(new InputStreamReader(processExec == null ? null : processExec.getInputStream())).readLine();
        } catch (Exception unused) {
            return null;
        }
    }

    public final void D1(if5 rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        try {
            jt.a aVar = jt.c;
            if (aVar.j() != null) {
                zy zyVarJ = aVar.j();
                Intrinsics.checkNotNull(zyVarJ);
                if (Intrinsics.areEqual(zyVarJ.getAttestationResInfo(), NativeInteractor.a.X0())) {
                    xy.a aVar2 = xy.k;
                    if (!aVar2.a().isEmpty()) {
                        ScanUtils scanUtils = ScanUtils.a;
                        scanUtils.b0(rule, aVar2.a() + '#' + scanUtils.Q());
                    }
                }
            }
        } catch (Exception e2) {
            nn3.c(nn3.a, b, e2.toString(), null, 4, null);
        }
    }

    public final void E(final if5 rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        try {
            J(new Runnable() { // from class: com.zepto.jn5
                @Override // java.lang.Runnable
                public final void run() {
                    ScanCore.F(rule);
                }
            });
        } catch (Exception e2) {
            nn3.a.b(b, Intrinsics.stringPlus("Exception :: ", e2.getMessage()), e2);
        }
    }

    public final String E0(String str) {
        try {
            return NativeInteractor.a.y1(str);
        } catch (Exception e2) {
            nn3.a.b(b, e2.toString(), e2);
            return "";
        }
    }

    public final void E1(if5 rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        f80.d(qj2.c, null, null, new g0(rule, null), 3, null);
    }

    public final void F0() {
        try {
            nn3.a.f(b, "getTapJacking.....called");
            jt.a aVar = jt.c;
            if (aVar.r() == null || Build.VERSION.SDK_INT < 31) {
                return;
            }
            Activity activityR = aVar.r();
            Intrinsics.checkNotNull(activityR);
            activityR.getWindow().setHideOverlayWindows(true);
        } catch (Exception e2) {
            nn3.c(nn3.a, b, e2.toString(), null, 4, null);
        }
    }

    public final void F1(if5 if5Var) {
        oj1 oj1Var = oj1.a;
        jt.a aVar = jt.c;
        if (Intrinsics.areEqual(oj1.i(oj1Var, if5Var, aVar.C(), null, 4, null), Boolean.TRUE)) {
            Log.i(b, "Sanity_test..2");
            PackageManager packageManager = aVar.C().getPackageManager();
            Intrinsics.checkNotNull(packageManager);
            List<PackageInfo> installedPackages = packageManager.getInstalledPackages(0);
            Intrinsics.checkNotNullExpressionValue(installedPackages, "AppProtecttInteractor.mA…      0\n                )");
            int size = installedPackages.size();
            int i2 = 0;
            while (i2 < size) {
                int i3 = i2 + 1;
                PackageInfo packageInfo = installedPackages.get(i2);
                String[] strArrD = NativeInteractor.a.d();
                int length = strArrD.length;
                int i4 = 0;
                while (i4 < length) {
                    String str = strArrD[i4];
                    i4++;
                    if (Intrinsics.areEqual(str, packageInfo.packageName)) {
                        pd5 pd5Var = pd5.a;
                        StringBuilder sb = new StringBuilder();
                        sb.append("B:-");
                        ScanUtils scanUtils = ScanUtils.a;
                        Context contextC = jt.c.C();
                        String str2 = packageInfo.packageName;
                        Intrinsics.checkNotNullExpressionValue(str2, "paInfo.packageName");
                        sb.append(scanUtils.N(contextC, str2));
                        sb.append('(');
                        sb.append((Object) packageInfo.packageName);
                        sb.append(")|-|");
                        sb.append(scanUtils.Q());
                        pd5Var.c(if5Var, sb.toString());
                    }
                }
                i2 = i3;
            }
        }
    }

    public final void G(if5 rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        f80.d(qj2.c, null, null, new g(rule, null), 3, null);
    }

    public final List G0() {
        return e;
    }

    public final void H() {
        try {
            f80.d(qj2.c, qk1.a(), null, new h(null), 2, null);
        } catch (Exception e2) {
            nn3.a.b(b, Intrinsics.stringPlus("Exception :: ", e2.getMessage()), e2);
        }
    }

    public final List H0() {
        return d;
    }

    public final String I() {
        try {
            jt.a aVar = jt.c;
            if (aVar.j() != null) {
                zy zyVarJ = aVar.j();
                Intrinsics.checkNotNull(zyVarJ);
                String attestationResInfo = zyVarJ.getAttestationResInfo();
                NativeInteractor nativeInteractor = NativeInteractor.a;
                if (Intrinsics.areEqual(attestationResInfo, nativeInteractor.X0())) {
                    zy zyVarJ2 = aVar.j();
                    Intrinsics.checkNotNull(zyVarJ2);
                    boolean z2 = false;
                    if (StringsKt__StringsKt.contains$default((CharSequence) zyVarJ2.getAuthorizationListPurpose(), (CharSequence) T("VW5rbm93bg=="), false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) zyVarJ2.getAuthorizationListPurpose(), (CharSequence) T("RU5DUllQVA=="), false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) zyVarJ2.getAuthorizationListPurpose(), (CharSequence) T("REVDUllQVA=="), false, 2, (Object) null)) {
                        if (StringsKt__StringsKt.contains$default((CharSequence) zyVarJ2.getAuthorizationListDigests(), (CharSequence) T("VW5rbm93bg=="), false, 2, (Object) null)) {
                            z2 = true;
                        }
                    }
                    String strI1 = i1();
                    if ((z2 || strI1.length() > 0) && !Intrinsics.areEqual(nativeInteractor.r0(), "failed")) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(new Gson().toJson(zyVarJ2));
                        sb.append('#');
                        sb.append(nativeInteractor.r0());
                        sb.append('#');
                        if (strI1.length() == 0) {
                            strI1 = "NIL";
                        }
                        sb.append(strI1);
                        return sb.toString();
                    }
                }
            }
        } catch (Exception e2) {
            nn3.c(nn3.a, b, e2.toString(), null, 4, null);
        }
        return "";
    }

    public final List I0() {
        return f;
    }

    public final synchronized void J(Runnable runnable) {
        try {
            try {
                jt.a aVar = jt.c;
                if (aVar.j() != null) {
                    zy zyVarJ = aVar.j();
                    Intrinsics.checkNotNull(zyVarJ);
                    String attestationResInfo = zyVarJ.getAttestationResInfo();
                    if (Intrinsics.areEqual(attestationResInfo, NativeInteractor.a.X0())) {
                        nn3.a.f(b, Intrinsics.stringPlus("Attestation happened.. ", attestationResInfo));
                    } else {
                        nn3.a.f(b, Intrinsics.stringPlus("Attestation happened.. ", attestationResInfo));
                        runnable.run();
                    }
                } else {
                    nn3 nn3Var = nn3.a;
                    String str = b;
                    nn3Var.f(str, "Attestation not happened..");
                    d0();
                    if (aVar.j() != null) {
                        zy zyVarJ2 = aVar.j();
                        Intrinsics.checkNotNull(zyVarJ2);
                        String attestationResInfo2 = zyVarJ2.getAttestationResInfo();
                        if (Intrinsics.areEqual(attestationResInfo2, NativeInteractor.a.X0())) {
                            nn3Var.f(str, Intrinsics.stringPlus("Attestation happened.. ", attestationResInfo2));
                        } else {
                            nn3Var.f(str, Intrinsics.stringPlus("Attestation happened.. ", attestationResInfo2));
                            runnable.run();
                        }
                    } else {
                        runnable.run();
                    }
                }
            } catch (Exception e2) {
                nn3.c(nn3.a, b, e2.toString(), null, 4, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final List J0() {
        return g;
    }

    public final void K(if5 rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        f80.d(qj2.c, null, null, new i(rule, null), 3, null);
    }

    public final BroadcastReceiver K0() {
        return l;
    }

    public final String L(String str) {
        try {
            return NativeInteractor.a.h(str, B0());
        } catch (Exception e2) {
            nn3.c(nn3.a, b, e2.toString(), null, 4, null);
            return "";
        }
    }

    public final void L0(if5 if5Var, String str) {
        f80.d(qj2.c, null, null, new ScanCore$handleAppBasedAlertResponse$1(if5Var, str, null), 3, null);
    }

    public final boolean M(if5 if5Var) {
        String strL = L(NativeInteractor.a.g());
        if (if5Var == null) {
            return strL.length() > 0;
        }
        if (!X0() || strL.length() <= 0) {
            return false;
        }
        ScanUtils scanUtils = ScanUtils.a;
        scanUtils.b0(if5Var, strL + '#' + scanUtils.Q());
        return false;
    }

    public final void M0(if5 rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        f80.d(qj2.c, null, null, new s(rule, null), 3, null);
    }

    public final boolean N(if5 if5Var) {
        String strL = L(NativeInteractor.a.i());
        if (if5Var == null) {
            return strL.length() > 0;
        }
        if (strL.length() <= 0) {
            return false;
        }
        ScanUtils scanUtils = ScanUtils.a;
        scanUtils.b0(if5Var, strL + '#' + scanUtils.Q());
        return false;
    }

    public final void N0(Activity activity, String lifeCycle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(lifeCycle, "lifeCycle");
        try {
            nn3 nn3Var = nn3.a;
            String str = b;
            if5 if5Var = h;
            nn3Var.f(str, Intrinsics.stringPlus("hideScreenContentRule:-", if5Var == null ? null : if5Var.getMethodname()));
            if (h != null) {
                if (Intrinsics.areEqual(lifeCycle, "RESUME")) {
                    c0(activity);
                } else if (Intrinsics.areEqual(lifeCycle, "PAUSE")) {
                    f0(activity);
                }
            }
        } catch (Exception e2) {
            nn3.c(nn3.a, b, e2.toString(), null, 4, null);
        }
    }

    public final boolean O(String str) throws ParseException {
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSSSSSSS Z").parse(str);
            Intrinsics.checkNotNullExpressionValue(date, "dateFormat.parse(timestampString)");
            return ((double) (System.currentTimeMillis() - date.getTime())) / ((double) 3600000) <= 72.0d;
        } catch (android.net.ParseException e2) {
            nn3.a.b("AppProtecttInteractor", Intrinsics.stringPlus("checkForSuspiciousActivity: ", e2.getMessage()), e2);
            return false;
        }
    }

    public final void O0(Context context, if5 rule) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rule, "rule");
        f80.d(qj2.c, null, null, new t(context, rule, null), 3, null);
    }

    public final boolean P(String str) {
        String strSubstring = ((String) StringsKt__StringsKt.split$default((CharSequence) str, new String[]{"Links:"}, false, 0, 6, (Object) null).get(1)).substring(1, 2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return Integer.parseInt(strSubstring) > 3;
    }

    public final void P0(Context context, final if5 rule) {
        nq nqVarG;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rule, "rule");
        try {
            HashMap map = new HashMap();
            Object systemService = context.getSystemService("device_policy");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.admin.DevicePolicyManager");
            }
            List<ComponentName> activeAdmins = ((DevicePolicyManager) systemService).getActiveAdmins();
            List<ComponentName> list = activeAdmins;
            if (list != null && !list.isEmpty()) {
                for (ComponentName componentName : activeAdmins) {
                    if (!Intrinsics.areEqual(context.getPackageName(), componentName.getPackageName())) {
                        ScanUtils scanUtils = ScanUtils.a;
                        String packageName = componentName.getPackageName();
                        Intrinsics.checkNotNullExpressionValue(packageName, "i.packageName");
                        String strE0 = scanUtils.e0(packageName);
                        if (!Intrinsics.areEqual(strE0, "SAFE")) {
                            nn3.a.f(b, Intrinsics.stringPlus("AdminApps:-", componentName.getPackageName()));
                            String packageName2 = componentName.getPackageName();
                            Intrinsics.checkNotNullExpressionValue(packageName2, "i.packageName");
                            map.put(packageName2, strE0);
                        }
                    }
                }
            }
            if (!map.isEmpty()) {
                String resInfo = new Gson().toJson(map);
                List list2 = d;
                Intrinsics.checkNotNullExpressionValue(resInfo, "resInfo");
                list2.add(resInfo);
                L0(rule, resInfo);
                return;
            }
            if (U0() && (nqVarG = RecyclerViewInteractor.c.g()) != null && nqVarG.C().size() != 0) {
                nqVarG.C().clear();
                Activity activityR = jt.c.r();
                Intrinsics.checkNotNull(activityR);
                activityR.runOnUiThread(new Runnable() { // from class: com.zepto.cn5
                    @Override // java.lang.Runnable
                    public final void run() {
                        ScanCore.Q0(rule);
                    }
                });
            }
            ScanUtils.a.Y0(rule.getRuleid());
        } catch (Exception e2) {
            nn3.a.b(b, String.valueOf(e2.getMessage()), e2);
        }
    }

    public final void Q(if5 if5Var) {
        f80.d(qj2.c, null, null, new j(if5Var, null), 3, null);
    }

    public final String R() {
        if (Build.VERSION.SDK_INT < 28) {
            return "";
        }
        try {
            NativeInteractor nativeInteractor = NativeInteractor.a;
            FileInputStream fileInputStream = new FileInputStream(new File(nativeInteractor.h0() + Os.getpid() + nativeInteractor.m("L2F0dHIvcHJldg==")));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            String line = bufferedReader.readLine();
            Intrinsics.checkNotNullExpressionValue(line, "reader.readLine()");
            String strM = nativeInteractor.m("dTpyOnp5Z290ZQ==");
            if (StringsKt__StringsKt.contains$default((CharSequence) line, (CharSequence) strM, false, 2, (Object) null)) {
                nn3.a.f(b, line);
                return strM;
            }
            bufferedReader.close();
            fileInputStream.close();
            r1(fileInputStream);
            return "";
        } catch (Exception e2) {
            nn3.a.b(b, Intrinsics.stringPlus("Exception :: ", e2.getMessage()), e2);
            return "";
        }
    }

    public final void R0(Context context, final if5 rule) {
        nq nqVarE;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rule, "rule");
        try {
            HashMap map = new HashMap();
            Object systemService = context.getSystemService("accessibility");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
            }
            List<AccessibilityServiceInfo> enabledAccessibilityServiceList = ((AccessibilityManager) systemService).getEnabledAccessibilityServiceList(-1);
            List<AccessibilityServiceInfo> list = enabledAccessibilityServiceList;
            if (list != null && !list.isEmpty()) {
                Iterator<AccessibilityServiceInfo> it = enabledAccessibilityServiceList.iterator();
                while (it.hasNext()) {
                    String packName = it.next().getResolveInfo().serviceInfo.packageName;
                    ScanUtils scanUtils = ScanUtils.a;
                    Intrinsics.checkNotNullExpressionValue(packName, "packName");
                    String strE0 = scanUtils.e0(packName);
                    if (!Intrinsics.areEqual(strE0, "SAFE")) {
                        nn3.a.f(b, Intrinsics.stringPlus("Accessibility:-", packName));
                        map.put(packName, strE0);
                    }
                }
            }
            if (!map.isEmpty()) {
                String resInfo = new Gson().toJson(map);
                List list2 = e;
                Intrinsics.checkNotNullExpressionValue(resInfo, "resInfo");
                list2.add(resInfo);
                L0(rule, resInfo);
                return;
            }
            if (U0() && (nqVarE = RecyclerViewInteractor.c.e()) != null && nqVarE.C().size() != 0) {
                nqVarE.C().clear();
                Activity activityR = jt.c.r();
                Intrinsics.checkNotNull(activityR);
                activityR.runOnUiThread(new Runnable() { // from class: com.zepto.dn5
                    @Override // java.lang.Runnable
                    public final void run() {
                        ScanCore.S0(rule);
                    }
                });
            }
            ScanUtils.a.Y0(rule.getRuleid());
        } catch (Exception e2) {
            nn3.a.b(b, Intrinsics.stringPlus(">>>>>>>>>>>>isAnyAppHaveAccessibilityPermission: Error: ", e2), e2);
        }
    }

    public final void S(Context context, if5 rule) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rule, "rule");
        try {
            jt.a aVar = jt.c;
            String strH = aVar.h();
            if (strH != null && strH.length() != 0) {
                oj1 oj1Var = oj1.a;
                if (oj1Var.f() == null) {
                    oj1Var.j(context);
                }
                Activity activityR = aVar.r();
                Intrinsics.checkNotNull(activityR);
                Boolean bool = Boolean.TRUE;
                StringBuilder sb = new StringBuilder();
                String strH2 = aVar.h();
                Intrinsics.checkNotNull(strH2);
                sb.append(strH2);
                sb.append("||");
                gw4 gw4Var = gw4.a;
                sb.append(gw4Var.a());
                Object[] objArr = {activityR, bool, sb.toString()};
                mx2 mx2Var = mx2.a;
                NativeInteractor nativeInteractor = NativeInteractor.a;
                Object objE = mx2Var.e(nativeInteractor.o1(), objArr);
                Activity activityR2 = aVar.r();
                Intrinsics.checkNotNull(activityR2);
                Object objE2 = mx2Var.e(nativeInteractor.l1(), new Object[]{activityR2, bool, gw4Var.a()});
                nn3 nn3Var = nn3.a;
                String str = b;
                nn3Var.f(str, "Dex Anti Total Res:-" + objE + ':' + objE2);
                if (Intrinsics.areEqual(String.valueOf(objE), T("U0FGRQ==")) && Intrinsics.areEqual(String.valueOf(objE2), T("U0FGRQ=="))) {
                    nn3Var.f(str, Intrinsics.stringPlus("Dex Anti  Res:-", objE));
                    return;
                }
                ScanUtils.a.b0(rule, "A:-" + objE + '#' + objE2);
                return;
            }
            Log.e(b, "error.01");
        } catch (Exception e2) {
            nn3.a.b("TAG", Intrinsics.stringPlus(">>>>>>>>>>>> appDebugging: Error: ", e2), e2);
        }
    }

    public final String T(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        return NativeInteractor.a.m(string);
    }

    public final boolean T0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("user");
        if (systemService != null) {
            return !((UserManager) systemService).isSystemUser();
        }
        throw new NullPointerException("null cannot be cast to non-null type android.os.UserManager");
    }

    public final boolean U(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            List<ApplicationInfo> installedApplications = context.getPackageManager().getInstalledApplications(128);
            Intrinsics.checkNotNullExpressionValue(installedApplications, "pm.getInstalledApplicati…ageManager.GET_META_DATA)");
            String originalPackage = context.getPackageName();
            int i2 = 0;
            for (ApplicationInfo applicationInfo : installedApplications) {
                String str = applicationInfo.packageName;
                Intrinsics.checkNotNullExpressionValue(str, "packageInfo.packageName");
                Intrinsics.checkNotNullExpressionValue(originalPackage, "originalPackage");
                if (!StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) originalPackage, false, 2, (Object) null)) {
                    String str2 = applicationInfo.packageName;
                    Intrinsics.checkNotNullExpressionValue(str2, "packageInfo.packageName");
                    if (c1(context, str2)) {
                    }
                }
                i2++;
            }
            return i2 > 1;
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean U0() {
        return jt.c.W() == 2;
    }

    public final void V(final if5 rule) {
        nq nqVarW;
        Intrinsics.checkNotNullParameter(rule, "rule");
        try {
            g.clear();
            PackageManager packageManager = jt.c.C().getPackageManager();
            Intrinsics.checkNotNull(packageManager);
            List<PackageInfo> installedPackages = packageManager.getInstalledPackages(0);
            Intrinsics.checkNotNullExpressionValue(installedPackages, "AppProtecttInteractor.mA…      0\n                )");
            int size = installedPackages.size();
            int i2 = 0;
            while (i2 < size) {
                int i3 = i2 + 1;
                PackageInfo packageInfo = installedPackages.get(i2);
                String[] strArrD0 = NativeInteractor.a.d0();
                int length = strArrD0.length;
                int i4 = 0;
                while (i4 < length) {
                    String str = strArrD0[i4];
                    i4++;
                    if (Intrinsics.areEqual(str, packageInfo.packageName) && !g.contains(str)) {
                        g.add(str);
                    }
                }
                i2 = i3;
            }
            if (!(!g.isEmpty())) {
                g.clear();
                if (U0() && (nqVarW = RecyclerViewInteractor.c.w()) != null && nqVarW.C().size() != 0) {
                    nqVarW.C().clear();
                    Activity activityR = jt.c.r();
                    Intrinsics.checkNotNull(activityR);
                    activityR.runOnUiThread(new Runnable() { // from class: com.zepto.in5
                        @Override // java.lang.Runnable
                        public final void run() {
                            ScanCore.X(rule);
                        }
                    });
                }
                ScanUtils.a.Y0(rule.getRuleid());
                return;
            }
            if (U0()) {
                final nq nqVarW2 = RecyclerViewInteractor.c.w();
                if (nqVarW2 != null) {
                    ScanCore scanCore = a;
                    if (!scanCore.J0().isEmpty()) {
                        nqVarW2.C().clear();
                        for (String str2 : scanCore.J0()) {
                            if (!nqVarW2.C().contains(str2)) {
                                nqVarW2.C().add(str2);
                            }
                        }
                        Activity activityR2 = jt.c.r();
                        Intrinsics.checkNotNull(activityR2);
                        activityR2.runOnUiThread(new Runnable() { // from class: com.zepto.gn5
                            @Override // java.lang.Runnable
                            public final void run() {
                                ScanCore.Y(nqVarW2);
                            }
                        });
                    }
                }
            } else {
                ScanAlerts scanAlertsL = jt.c.L();
                Intrinsics.checkNotNull(scanAlertsL);
                final nq nqVarP = scanAlertsL.P();
                if (nqVarP != null) {
                    nqVarP.C().clear();
                    for (String str3 : a.J0()) {
                        if (!nqVarP.C().contains(str3)) {
                            nqVarP.C().add(str3);
                        }
                    }
                    Activity activityR3 = jt.c.r();
                    if (activityR3 != null) {
                        activityR3.runOnUiThread(new Runnable() { // from class: com.zepto.hn5
                            @Override // java.lang.Runnable
                            public final void run() {
                                ScanCore.W(nqVarP);
                            }
                        });
                    }
                }
            }
            ScanUtils.a.b0(rule, g.toString());
        } catch (Exception e2) {
            nn3.a.b(b, String.valueOf(e2.getMessage()), e2);
        }
    }

    public final boolean V0() throws ParseException {
        String str;
        Object obj;
        int i2;
        String str2;
        String strB = k16.a.b("stat /data/local/tmp", true);
        boolean zP = false;
        boolean zO = false;
        boolean zO2 = false;
        boolean zO3 = false;
        for (String str3 : StringsKt__StringsKt.split$default((CharSequence) strB, new String[]{"\n"}, false, 0, 6, (Object) null)) {
            if (StringsKt__StringsKt.contains$default((CharSequence) str3, (CharSequence) "Links:", false, 2, (Object) null)) {
                zP = P(str3);
            }
            if (StringsKt__StringsKt.contains$default((CharSequence) str3, (CharSequence) "Access:", false, 2, (Object) null) && StringsKt__StringsKt.contains$default((CharSequence) str3, (CharSequence) "+", false, 2, (Object) null)) {
                nn3.a.f(b, Intrinsics.stringPlus("isDeviceSuspicious: ", str3));
                str = "isDeviceSuspicious: ";
                obj = null;
                zO = O((String) StringsKt__StringsKt.split$default((CharSequence) str3, new String[]{":"}, false, 2, 2, (Object) null).get(1));
            } else {
                str = "isDeviceSuspicious: ";
                obj = null;
            }
            if (StringsKt__StringsKt.contains$default((CharSequence) str3, (CharSequence) "Modify:", false, 2, obj)) {
                String str4 = str;
                nn3.a.f(b, Intrinsics.stringPlus(str4, str3));
                str2 = str4;
                i2 = 2;
                zO2 = O((String) StringsKt__StringsKt.split$default((CharSequence) str3, new String[]{":"}, false, 2, 2, (Object) null).get(1));
            } else {
                i2 = 2;
                str2 = str;
            }
            if (StringsKt__StringsKt.contains$default((CharSequence) str3, (CharSequence) "Change:", false, i2, (Object) null)) {
                nn3.a.f(b, Intrinsics.stringPlus(str2, str3));
                zO3 = O((String) StringsKt__StringsKt.split$default((CharSequence) str3, new String[]{":"}, false, 2, 2, (Object) null).get(1));
            }
        }
        nn3.a.f(b, Intrinsics.stringPlus("isDeviceSuspicious Final op : \n", strB));
        return zP || zO || zO2 || zO3;
    }

    public final void W0(if5 rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        try {
            String strM = NativeInteractor.a.M();
            nn3.a.f(b, Intrinsics.stringPlus("isLogRunning:-", strM));
            if (strM.length() > 0) {
                ScanUtils.a.b0(rule, strM + '|' + n0());
            }
        } catch (Exception e2) {
            nn3.c(nn3.a, b, e2.toString(), null, 4, null);
        }
    }

    public final boolean X0() {
        jt.a aVar = jt.c;
        if (aVar.j() == null) {
            return false;
        }
        zy zyVarJ = aVar.j();
        Intrinsics.checkNotNull(zyVarJ);
        String attestationResInfo = zyVarJ.getAttestationResInfo();
        if (Intrinsics.areEqual(attestationResInfo, NativeInteractor.a.X0())) {
            nn3.a.f(b, Intrinsics.stringPlus("Attestation happened.. ", attestationResInfo));
            return false;
        }
        nn3.a.f(b, Intrinsics.stringPlus("Attestation happened.. ", attestationResInfo));
        return Build.VERSION.SDK_INT >= 29;
    }

    public final boolean Y0() {
        nn3 nn3Var = nn3.a;
        String str = b;
        nn3Var.f(str, Intrinsics.stringPlus("isEmulator is t", Boolean.valueOf(d1())));
        if (!d1()) {
            return false;
        }
        boolean zN = N(null);
        boolean zM = M(null);
        boolean zB1 = b1();
        if (!zN && !zB1 && !zM) {
            return false;
        }
        nn3Var.f(str, "isRootedEmulatortrue");
        return true;
    }

    public final String Z() {
        try {
            String strE0 = E0(T("cm8uYm9vdC52ZXJpZmllZGJvb3RzdGF0ZQ=="));
            nn3.a.f(b, Intrinsics.stringPlus("", strE0));
            return strE0;
        } catch (Exception e2) {
            nn3.c(nn3.a, b, e2.toString(), null, 4, null);
            return "";
        }
    }

    public final void Z0(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        f80.d(qj2.c, null, null, new u(url, null), 3, null);
    }

    public final void a0(String str, String str2) {
        if5 if5VarT1;
        if5 if5VarT12;
        if5 if5VarT13;
        String attestationResInfo = null;
        try {
            if (str == null) {
                StringBuilder sb = new StringBuilder();
                zy zyVarJ = jt.c.j();
                if (zyVarJ != null) {
                    attestationResInfo = zyVarJ.getAttestationResInfo();
                }
                sb.append((Object) attestationResInfo);
                sb.append('#');
                sb.append((Object) str2);
                String string = sb.toString();
                if5 if5VarT14 = t1(245);
                if (if5VarT14 != null) {
                    ScanUtils.a.b0(if5VarT14, string);
                    return;
                }
                return;
            }
            String strSubstring = str.substring(1, str.length() - 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) strSubstring, new String[]{","}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSplit$default, 10));
            Iterator it = listSplit$default.iterator();
            while (it.hasNext()) {
                arrayList.add(StringsKt__StringsKt.trim((CharSequence) StringsKt__StringsKt.trim((String) it.next(), Typography.quote)).toString());
            }
            if (arrayList.size() == 3) {
                nn3.a.f(b, "Device Safe");
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            zy zyVarJ2 = jt.c.j();
            if (zyVarJ2 != null) {
                attestationResInfo = zyVarJ2.getAttestationResInfo();
            }
            sb2.append((Object) attestationResInfo);
            sb2.append('#');
            sb2.append(arrayList);
            String string2 = sb2.toString();
            if (!arrayList.contains(T("TUVFVFNfQkFTSUNfSU5URUdSSVRZ")) && (if5VarT13 = t1(241)) != null) {
                ScanUtils.a.b0(if5VarT13, string2);
            }
            if (!arrayList.contains(T("TUVFVFNfREVWSUNFX0lOVEVHUklUWQ==")) && (if5VarT12 = t1(244)) != null) {
                ScanUtils.a.b0(if5VarT12, string2);
            }
            if (arrayList.contains(T("TUVFVFNfU1RST05HX0lOVEVHUklUWQ==")) || (if5VarT1 = t1(245)) == null) {
                return;
            }
            ScanUtils.a.b0(if5VarT1, string2);
        } catch (Exception e2) {
            nn3.c(nn3.a, b, e2.toString(), null, 4, null);
        }
    }

    public final String a1(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            String packageName = context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
            int iZ0 = z0(packageName);
            jt.a aVar = jt.c;
            Activity activityR = aVar.r();
            Intrinsics.checkNotNull(activityR);
            String path = activityR.getFilesDir().getPath();
            Intrinsics.checkNotNullExpressionValue(path, "AppProtecttInteractor.cu…tActivity!!.filesDir.path");
            if (o0(path, iZ0) > iZ0) {
                return m0(path, context);
            }
            if (C1(context)) {
                return "";
            }
            return "play store Not available in my Environment|" + s0() + '|' + U(aVar.C());
        } catch (Exception e2) {
            nn3.a.b(b, Intrinsics.stringPlus("Exception :: ", e2.getMessage()), e2);
            return "";
        }
    }

    public final boolean b1() {
        try {
            return Intrinsics.areEqual(VContant.MAINSCREEN, NativeInteractor.a.y1("ro.build.selinux"));
        } catch (Exception e2) {
            nn3.a.b("isSelinuxFlagInEnabled", "Exception occured :", e2);
            return false;
        }
    }

    public final void c0(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        try {
            activity.runOnUiThread(new k(activity));
        } catch (Exception e2) {
            nn3.a.b(b, e2.toString(), e2);
        }
    }

    public final boolean c1(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            Signature[] originalSignature = packageManager.getPackageInfo(context.getPackageName(), 64).signatures;
            Signature[] targetSignature = packageManager.getPackageInfo(str, 64).signatures;
            Intrinsics.checkNotNullExpressionValue(originalSignature, "originalSignature");
            int length = originalSignature.length;
            int i2 = 0;
            while (i2 < length) {
                Signature signature = originalSignature[i2];
                i2++;
                Intrinsics.checkNotNullExpressionValue(targetSignature, "targetSignature");
                int length2 = targetSignature.length;
                int i3 = 0;
                while (i3 < length2) {
                    Signature signature2 = targetSignature[i3];
                    i3++;
                    if (Intrinsics.areEqual(signature.toCharsString(), signature2.toCharsString())) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public final synchronized void d0() {
        try {
            try {
                xy.a aVar = xy.k;
                aVar.c();
                jt.a aVar2 = jt.c;
                if (aVar2.j() == null) {
                    nn3.a.f(b, "Attestation is empty");
                    xy xyVarB = aVar.b();
                    Intrinsics.checkNotNull(xyVarB);
                    xyVarB.k();
                } else {
                    s06.a aVar3 = s06.m;
                    s06 s06VarA = aVar3.a();
                    Intrinsics.checkNotNull(s06VarA);
                    if (s06VarA.l().length() == 0 && aVar2.k().length() > 0) {
                        s06 s06VarA2 = aVar3.a();
                        Intrinsics.checkNotNull(s06VarA2);
                        s06VarA2.J(aVar2.k());
                    }
                }
            } catch (Exception e2) {
                nn3.a.b(b, e2.toString(), e2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean d1() {
        String radioVersion = Build.getRadioVersion();
        NativeInteractor nativeInteractor = NativeInteractor.a;
        String strQ0 = nativeInteractor.q0();
        String strJ = nativeInteractor.j();
        nn3.a.f(b, "" + ((Object) radioVersion) + '|' + strQ0 + '|' + strJ + '|' + Build.VERSION.SDK_INT);
        return (radioVersion == null || radioVersion.length() == 0 || Intrinsics.areEqual(radioVersion, "1.0.0.0") || Intrinsics.areEqual(radioVersion, "G9300ZCU2API3") || Intrinsics.areEqual(radioVersion, "MPSS.AT.2.0.c4.7-00070-8998_GEN_PACK-2.179387.1.214666.1")) && Intrinsics.areEqual(strQ0, "NOT GETTING") && StringsKt__StringsKt.contains$default((CharSequence) strJ, (CharSequence) "[sys.usb.configfs]: [0]", false, 2, (Object) null);
    }

    public final void e0() {
        f80.d(qj2.c, null, null, new l(null), 3, null);
    }

    public final void e1(if5 rule, Context context) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        Intrinsics.checkNotNullParameter(context, "context");
        f80.d(qj2.c, null, null, new v(context, rule, null), 3, null);
    }

    public final void f0(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        try {
            activity.runOnUiThread(new m(activity));
        } catch (Exception e2) {
            nn3.a.b(b, e2.toString(), e2);
        }
    }

    public final void f1(final if5 rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        try {
            J(new Runnable() { // from class: com.zepto.en5
                @Override // java.lang.Runnable
                public final void run() {
                    ScanCore.g1(rule);
                }
            });
        } catch (Exception e2) {
            nn3.c(nn3.a, b, e2.toString(), null, 4, null);
        }
    }

    public final String g0() {
        try {
            Runtime.getRuntime().exec(new String[]{"/bin/sh", "-c", "getprop | grep sys.oem_unlock_allowed"});
            return "";
        } catch (Exception e2) {
            nn3.c(nn3.a, b, e2.toString(), null, 4, null);
            StackTraceElement[] stackTrace = e2.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "e.stackTrace");
            int length = stackTrace.length;
            int i2 = 0;
            while (i2 < length) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                i2++;
                String className = stackTraceElement.getClassName();
                Intrinsics.checkNotNullExpressionValue(className, "stackTraceElement.className");
                if (!StringsKt__StringsKt.contains$default((CharSequence) className, (CharSequence) "com.devadvance.rootcloak2.RootCloak$13", false, 2, (Object) null)) {
                    String className2 = stackTraceElement.getClassName();
                    Intrinsics.checkNotNullExpressionValue(className2, "stackTraceElement.className");
                    if (!StringsKt__StringsKt.contains((CharSequence) className2, (CharSequence) "RootCloak", true)) {
                        String className3 = stackTraceElement.getClassName();
                        Intrinsics.checkNotNullExpressionValue(className3, "stackTraceElement.className");
                        if (!StringsKt__StringsKt.contains((CharSequence) className3, (CharSequence) "de.robv.android.xposed.XposedBridge", true)) {
                            String className4 = stackTraceElement.getClassName();
                            Intrinsics.checkNotNullExpressionValue(className4, "stackTraceElement.className");
                            if (!StringsKt__StringsKt.contains((CharSequence) className4, (CharSequence) "xposed", true)) {
                                String className5 = stackTraceElement.getClassName();
                                Intrinsics.checkNotNullExpressionValue(className5, "stackTraceElement.className");
                                if (StringsKt__StringsKt.contains((CharSequence) className5, (CharSequence) "LSPHooker", true)) {
                                }
                            }
                        }
                    }
                }
                nn3.a.f(b, Intrinsics.stringPlus("", stackTraceElement.getClassName()));
                String className6 = stackTraceElement.getClassName();
                Intrinsics.checkNotNullExpressionValue(className6, "stackTraceElement.className");
                return className6;
            }
            return "";
        }
    }

    public final String h0() {
        File[] fileArrListFiles;
        try {
            ArrayList arrayList = new ArrayList();
            File file = new File(NativeInteractor.a.m("L2RhdGEvc3lzdGVt"));
            if (file.exists() && file.canRead() && (fileArrListFiles = file.listFiles()) != null) {
                if (!(fileArrListFiles.length == 0)) {
                    File[] fileArrListFiles2 = file.listFiles();
                    Intrinsics.checkNotNull(fileArrListFiles2);
                    int length = fileArrListFiles2.length;
                    int i2 = 0;
                    while (i2 < length) {
                        File file2 = fileArrListFiles2[i2];
                        i2++;
                        String name = file2.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "i.name");
                        if (StringsKt__StringsJVMKt.startsWith$default(name, "hide", false, 2, null)) {
                            String name2 = file2.getName();
                            Intrinsics.checkNotNullExpressionValue(name2, "i.name");
                            arrayList.add(name2);
                            nn3.a.f(b, Intrinsics.stringPlus("h_i_d_e_a_p_p_l_i_s_t", file2.getName()));
                        }
                    }
                    return arrayList.isEmpty() ? "" : arrayList.toString();
                }
            }
        } catch (Exception e2) {
            nn3.a.b(b, Intrinsics.stringPlus("Exception :: ", e2.getMessage()), e2);
        }
        return "";
    }

    public final void h1(if5 rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        f80.d(qj2.c, null, null, new w(rule, null), 3, null);
    }

    public final void i(if5 rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        f80.d(qj2.c, null, null, new a(rule, null), 3, null);
    }

    public final void i0(if5 rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        f80.d(qj2.c, null, null, new n(rule, null), 3, null);
    }

    public final String i1() {
        s06 s06VarA = s06.m.a();
        Intrinsics.checkNotNull(s06VarA);
        zy zyVarF = s06VarA.f();
        if (zyVarF == null) {
            return "";
        }
        String atteatationStatus = zyVarF.getAtteatationStatus();
        if (!Intrinsics.areEqual(atteatationStatus, "ATTEST_SUCCESS")) {
            return "";
        }
        String attestationResInfo = zyVarF.getAttestationResInfo();
        if (Intrinsics.areEqual(attestationResInfo, NativeInteractor.a.X0())) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append((Object) atteatationStatus);
        sb.append('|');
        sb.append((Object) attestationResInfo);
        return sb.toString();
    }

    public final void j(if5 rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        f80.d(qj2.c, null, null, new b(rule, null), 3, null);
    }

    public final void j0(if5 rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        f80.d(qj2.c, null, null, new o(rule, null), 3, null);
    }

    public final void j1(if5 rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        f80.d(qj2.c, qk1.a(), null, new x(rule, null), 2, null);
    }

    public final void k(if5 ruleItem) {
        Intrinsics.checkNotNullParameter(ruleItem, "ruleItem");
        f80.d(qj2.c, null, null, new c(ruleItem, null), 3, null);
    }

    public final void k0(if5 rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        f80.d(qj2.c, null, null, new p(rule, null), 3, null);
    }

    public final String k1() {
        try {
            NativeInteractor nativeInteractor = NativeInteractor.a;
            String strM = nativeInteractor.m("L3N1IC12");
            return Build.VERSION.SDK_INT >= 30 ? k16.a.c(Intrinsics.stringPlus(nativeInteractor.m("L2RlYnVnX3JhbWRpc2s="), strM), false) : k16.a.c(Intrinsics.stringPlus(nativeInteractor.m("L3NiaW4="), strM), false);
        } catch (Exception e2) {
            nn3.a.b(b, Intrinsics.stringPlus("Exception :: ", e2.getMessage()), e2);
            return "";
        }
    }

    public final String l0() {
        byte[] bArr = new byte[RangesKt___RangesKt.random(new IntRange(16, 500), Random.INSTANCE)];
        new SecureRandom().nextBytes(bArr);
        String strEncodeToString = Base64.encodeToString(bArr, 10);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(nonce, Ba…L_SAFE or Base64.NO_WRAP)");
        return strEncodeToString;
    }

    public final void l1(Context context, String url) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            nn3.a.f("UrlCheck", "url called");
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(268435456);
            intent.setData(Uri.parse(url));
            yy0.m(context, intent, new Bundle());
        } catch (Exception unused) {
            NativeInteractor nativeInteractor = NativeInteractor.a;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            nativeInteractor.o(applicationContext, T("ZS0wMjk="));
        }
    }

    public final String m0(String str, Context context) {
        PackageManager packageManager = context.getPackageManager();
        Intrinsics.checkNotNull(packageManager);
        List<PackageInfo> installedPackages = packageManager.getInstalledPackages(0);
        Intrinsics.checkNotNullExpressionValue(installedPackages, "context.packageManager!!…(\n            0\n        )");
        int size = installedPackages.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            PackageInfo paInfo = installedPackages.get(i2);
            ScanUtils scanUtils = ScanUtils.a;
            Intrinsics.checkNotNullExpressionValue(paInfo, "paInfo");
            if (!scanUtils.y0(paInfo)) {
                String str2 = paInfo.packageName;
                Intrinsics.checkNotNullExpressionValue(str2, "paInfo.packageName");
                if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) str2, false, 2, (Object) null) && !Intrinsics.areEqual(paInfo.packageName, context.getPackageName())) {
                    StringBuilder sb = new StringBuilder();
                    ApplicationInfo applicationInfo = paInfo.applicationInfo;
                    PackageManager packageManager2 = context.getPackageManager();
                    Intrinsics.checkNotNull(packageManager2);
                    sb.append((Object) applicationInfo.loadLabel(packageManager2));
                    sb.append('|');
                    sb.append((Object) paInfo.packageName);
                    return sb.toString();
                }
            }
            i2 = i3;
        }
        return str;
    }

    public final boolean m1() {
        NativeInteractor nativeInteractor = NativeInteractor.a;
        if (!Intrinsics.areEqual(E0(nativeInteractor.m0()), "-1") && !Intrinsics.areEqual(E0(nativeInteractor.n0()), "-1") && !Intrinsics.areEqual(E0(nativeInteractor.o0()), "-1")) {
            return false;
        }
        nn3.a.f(b, "all prop got -1");
        return true;
    }

    public final String n0() {
        try {
            boolean z2 = (jt.c.C().getApplicationContext().getApplicationInfo().flags & 2) != 0;
            boolean zIsDebuggerConnected = Debug.isDebuggerConnected();
            boolean zWaitingForDebugger = Debug.waitingForDebugger();
            StringBuilder sb = new StringBuilder();
            sb.append(z2);
            sb.append(zIsDebuggerConnected);
            sb.append(zWaitingForDebugger);
            return sb.toString();
        } catch (Exception e2) {
            nn3.c(nn3.a, b, e2.toString(), null, 4, null);
            return "";
        }
    }

    public final void n1(Context context, if5 rule) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rule, "rule");
        f80.d(qj2.c, null, null, new z(rule, null), 3, null);
    }

    public final int o0(String str, int i2) {
        int length = str.length();
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            char cCharAt = str.charAt(i3);
            i3++;
            if (i4 > i2) {
                break;
            }
            if (cCharAt == '.') {
                i4++;
            }
        }
        return i4;
    }

    public final String o1(Context context, String fileName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        StringBuilder sb = new StringBuilder();
        try {
            InputStream inputStreamOpen = context.getAssets().open(fileName);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "context.assets.open(fileName)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
                sb.append("\n");
            }
            bufferedReader.close();
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "stringBuilder.toString()");
            if (StringsKt__StringsKt.contains$default((CharSequence) string, (CharSequence) "appprotectt_integrityconfig", false, 2, (Object) null)) {
                return new JSONObject(string).getString("appprotectt_integrityconfig");
            }
            byte[] bytes = string.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return Base64.encodeToString(bytes, 2);
        } catch (IOException e2) {
            nn3.c(nn3.a, b, e2.toString(), null, 4, null);
            return null;
        }
    }

    public final String p0(Exception exc) {
        try {
            String message = exc.getMessage();
            if (message == null) {
                return "Unknown Error";
            }
            int i2 = Integer.parseInt(new Regex(":(.*)").replace(new Regex("\n").replace(message, ""), ""));
            if (i2 == -100) {
                return "Unknown internal error.";
            }
            switch (i2) {
            }
            return "Unknown Error";
        } catch (Exception unused) {
            return "Unknown Error";
        }
    }

    public final void p1(Runnable runnable, bu7 bu7Var) {
        m44 m44Var;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        if (bu7Var != null) {
            try {
                if (!StringsKt__StringsKt.contains$default((CharSequence) bu7Var.toString(), (CharSequence) "com.android.volley.TimeoutError", false, 2, (Object) null) && !StringsKt__StringsKt.contains$default((CharSequence) bu7Var.toString(), (CharSequence) "java.net.UnknownHostException", false, 2, (Object) null) && ((m44Var = bu7Var.networkResponse) == null || m44Var.statusCode != 502)) {
                    return;
                }
                f80.d(qj2.c, null, null, new a0(runnable, null), 3, null);
            } catch (Exception e2) {
                nn3.c(nn3.a, b, e2.toString(), null, 4, null);
            }
        }
    }

    public final String q0() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            sb.append((Object) D0("ro.debuggable"));
            sb.append('|');
            sb.append((Object) D0("ro.secure"));
            sb.append('|');
            sb.append((Object) D0("ro.boot.verifiedbootstate"));
            sb.append('|');
            sb.append((Object) D0("ro.boot.flash.locked"));
            sb.append('|');
            sb.append((Object) D0("ro.boot.vbmeta.device_state"));
            sb.append(']');
            return sb.toString();
        } catch (Exception e2) {
            nn3.c(nn3.a, b, e2.toString(), null, 4, null);
            return "-";
        }
    }

    public final void q1(if5 rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        f80.d(qj2.c, null, null, new b0(rule, null), 3, null);
    }

    public final void r0(if5 rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        try {
            StringBuilder sb = new StringBuilder();
            NativeInteractor nativeInteractor = NativeInteractor.a;
            sb.append(nativeInteractor.W());
            sb.append((Object) jt.c.C().getPackageName());
            sb.append(nativeInteractor.X());
            File file = new File(sb.toString());
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) nativeInteractor.b0(), new String[]{"."}, false, 0, 6, (Object) null);
            if (rule.getRuleid() == 250) {
                String str = ((String) listSplit$default.get(0)) + "lin." + ((String) listSplit$default.get(1));
                String str2 = ((String) listSplit$default.get(0)) + "gum." + ((String) listSplit$default.get(1));
                File file2 = new File(file.getAbsolutePath() + '/' + str);
                File file3 = new File(file.getAbsolutePath() + '/' + str2);
                if (file2.exists() || file3.exists()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(file2.exists());
                    sb2.append('#');
                    sb2.append(file3.exists());
                    String string = sb2.toString();
                    pd5.a.c(rule, string + '#' + ScanUtils.a.Q());
                    f80.d(qj2.c, null, null, new q(file2, file3, null), 3, null);
                }
            } else if (rule.getRuleid() == 1036) {
                File file4 = new File(file.getAbsolutePath() + '/' + (((String) listSplit$default.get(0)) + "et." + ((String) listSplit$default.get(1))));
                if (file4.exists()) {
                    String strValueOf = String.valueOf(file4.exists());
                    ScanUtils scanUtils = ScanUtils.a;
                    scanUtils.b0(rule, strValueOf + '#' + scanUtils.Q());
                    f80.d(qj2.c, null, null, new r(file4, null), 3, null);
                }
            }
        } catch (Exception e2) {
            nn3.c(nn3.a, b, e2.toString(), null, 4, null);
        }
    }

    public final void r1(FileInputStream fileInputStream) {
        if (fileInputStream != null) {
            try {
                fileInputStream.close();
            } catch (IOException e2) {
                nn3.c(nn3.a, "TAG", e2.toString(), null, 4, null);
            }
        }
    }

    public final List s0() {
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = jt.c.C().getPackageManager();
        Intrinsics.checkNotNull(packageManager);
        int i2 = 0;
        List<PackageInfo> installedPackages = packageManager.getInstalledPackages(0);
        Intrinsics.checkNotNullExpressionValue(installedPackages, "AppProtecttInteractor.mA…(\n            0\n        )");
        int size = installedPackages.size();
        while (i2 < size) {
            int i3 = i2 + 1;
            PackageInfo paInfo = installedPackages.get(i2);
            ScanUtils scanUtils = ScanUtils.a;
            Intrinsics.checkNotNullExpressionValue(paInfo, "paInfo");
            if (!scanUtils.y0(paInfo) && !arrayList.contains(paInfo.packageName)) {
                String str = paInfo.packageName;
                Intrinsics.checkNotNullExpressionValue(str, "paInfo.packageName");
                arrayList.add(str);
            }
            i2 = i3;
        }
        return arrayList;
    }

    public final void s1(if5 ruleObject, Context context) {
        Intrinsics.checkNotNullParameter(ruleObject, "ruleObject");
        Intrinsics.checkNotNullParameter(context, "context");
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        int iZ0 = z0(packageName);
        jt.a aVar = jt.c;
        Activity activityR = aVar.r();
        Intrinsics.checkNotNull(activityR);
        String path = activityR.getFilesDir().getPath();
        Intrinsics.checkNotNullExpressionValue(path, "AppProtecttInteractor.cu…tActivity!!.filesDir.path");
        nn3 nn3Var = nn3.a;
        String str = b;
        nn3Var.f(str, Intrinsics.stringPlus("SanBox:-", path));
        if (o0(path, iZ0) > iZ0) {
            ScanUtils.a.b0(ruleObject, m0(path, context));
        } else {
            if (C1(context)) {
                return;
            }
            nn3Var.f(str, "SanBox:- play store Not available");
            ScanUtils.a.b0(ruleObject, "play store Not available in my Environment|" + s0() + '|' + U(aVar.C()));
        }
    }

    public final void t0(final if5 rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        try {
            J(new Runnable() { // from class: com.zepto.fn5
                @Override // java.lang.Runnable
                public final void run() {
                    ScanCore.u0(rule);
                }
            });
        } catch (Exception e2) {
            nn3.c(nn3.a, b, e2.toString(), null, 4, null);
        }
    }

    public final if5 t1(int i2) {
        Object next;
        if5 if5Var;
        try {
            Iterator it = jt.c.G().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((if5) next).getRuleid() == i2) {
                    break;
                }
            }
            if5Var = (if5) next;
        } catch (Exception e2) {
            nn3.c(nn3.a, b, e2.toString(), null, 4, null);
        }
        if (if5Var != null) {
            return if5Var;
        }
        return null;
    }

    public final void u1(if5 ruleObject, Context context) throws IOException {
        Intrinsics.checkNotNullParameter(ruleObject, "ruleObject");
        Intrinsics.checkNotNullParameter(context, "context");
        ArrayList arrayList = new ArrayList();
        Object systemService = context.getSystemService("user");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.os.UserManager");
        }
        UserManager userManager = (UserManager) systemService;
        Iterator<UserHandle> it = userManager.getUserProfiles().iterator();
        while (it.hasNext()) {
            String string = it.next().toString();
            Intrinsics.checkNotNullExpressionValue(string, "i.toString()");
            StringBuilder sb = new StringBuilder();
            int length = string.length();
            int i2 = 0;
            while (i2 < length) {
                int i3 = i2 + 1;
                char cCharAt = string.charAt(i2);
                if (Character.isDigit(cCharAt)) {
                    sb.append(cCharAt);
                }
                i2 = i3;
            }
            String string2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "filterTo(StringBuilder(), predicate).toString()");
            arrayList.add(string2);
        }
        if (T0(context)) {
            ScanUtils.a.b0(ruleObject, "Gust User Profile|" + ((Object) new Gson().toJson(userManager.getUserProfiles())) + '|' + arrayList);
        }
    }

    public final String v0(String str, String str2) {
        Object next;
        try {
            ZipFile zipFile = new ZipFile(str);
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
            Intrinsics.checkNotNullExpressionValue(enumerationEntries, "zipFile.entries()");
            Iterator it = SequencesKt__SequencesKt.asSequence(CollectionsKt__IteratorsJVMKt.iterator(enumerationEntries)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((ZipEntry) next).getName(), str2)) {
                    break;
                }
            }
            ZipEntry zipEntry = (ZipEntry) next;
            if (zipEntry == null) {
                return "";
            }
            InputStream i2 = zipFile.getInputStream(zipEntry);
            ScanCore scanCore = a;
            Intrinsics.checkNotNullExpressionValue(i2, "i");
            return scanCore.w1(i2);
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public final void v1(if5 if5Var) {
        h = if5Var;
    }

    public final String w0() {
        try {
            s06 s06VarA = s06.m.a();
            Intrinsics.checkNotNull(s06VarA);
            String strT = s06VarA.t();
            if (strT.length() == 0) {
                ni0 ni0VarM = jt.c.m();
                Intrinsics.checkNotNull(ni0VarM);
                strT = ni0VarM.getTrust();
            }
            return strT == null ? "" : strT;
        } catch (Exception e2) {
            nn3.c(nn3.a, b, e2.toString(), null, 4, null);
            return "";
        }
    }

    public final String w1(InputStream inputStream) {
        try {
            byte[] bArr = new byte[65536];
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            while (true) {
                int i2 = inputStream.read(bArr);
                if (i2 == -1) {
                    byte[] hash = messageDigest.digest();
                    Intrinsics.checkNotNullExpressionValue(hash, "hash");
                    return ArraysKt___ArraysKt.joinToString$default(hash, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) c0.c, 30, (Object) null);
                }
                messageDigest.update(bArr, 0, i2);
            }
        } catch (Exception e2) {
            nn3.c(nn3.a, b, e2.toString(), null, 4, null);
            return "";
        }
    }

    public final String x0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Object systemService = context.getSystemService("connectivity");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
            }
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                if (activeNetworkInfo.getType() == 1) {
                    return "WIFI";
                }
                if (activeNetworkInfo.getType() != 0) {
                    return "?";
                }
                switch (activeNetworkInfo.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                    case 16:
                        return "2G";
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                    case 17:
                        return "3G";
                    case 13:
                    case 18:
                    case 19:
                        return "4G";
                    case 20:
                        return "5G";
                    default:
                        return Intrinsics.stringPlus("eles-", Integer.valueOf(activeNetworkInfo.getSubtype()));
                }
            }
            return "-";
        } catch (Exception e2) {
            nn3.c(nn3.a, b, e2.toString(), null, 4, null);
            return "?";
        }
    }

    public final long x1(String str) {
        try {
            ru5 ru5Var = new ru5();
            NativeInteractor nativeInteractor = NativeInteractor.a;
            String strF = ru5Var.f(str, nativeInteractor.c1());
            long jCurrentTimeMillis = System.currentTimeMillis();
            new ru5().e(strF, nativeInteractor.c1());
            return System.currentTimeMillis() - jCurrentTimeMillis;
        } catch (Exception e2) {
            nn3.a.f(b, e2.toString());
            return 0L;
        }
    }

    public final String y0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Object systemService = context.getSystemService("connectivity");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            Integer numValueOf = null;
            Integer numValueOf2 = networkCapabilities == null ? null : Integer.valueOf(networkCapabilities.getLinkDownstreamBandwidthKbps() / 1000);
            if (networkCapabilities != null) {
                numValueOf = Integer.valueOf(networkCapabilities.getLinkUpstreamBandwidthKbps());
            }
            StringBuilder sb = new StringBuilder();
            int iIntValue = 0;
            sb.append(numValueOf2 == null ? 0 : numValueOf2.intValue());
            sb.append(" Mbps|");
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            }
            sb.append(iIntValue);
            return sb.toString();
        } catch (Exception e2) {
            nn3.c(nn3.a, b, e2.toString(), null, 4, null);
            return "?";
        }
    }

    public final void y1(if5 rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        f80.d(qj2.c, qk1.b(), null, new d0(rule, null), 2, null);
    }

    public final int z0(String str) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            i2++;
            if (cCharAt == '.') {
                i3++;
            }
        }
        return i3;
    }

    public final void z1(if5 rule, Context context) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            HashMap map = new HashMap();
            Object systemService = context.getSystemService("input_method");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            }
            List<InputMethodInfo> enabledInputMethodList = ((InputMethodManager) systemService).getEnabledInputMethodList();
            Intrinsics.checkNotNullExpressionValue(enabledInputMethodList, "inputMethodManager.enabledInputMethodList");
            for (InputMethodInfo inputMethodInfo : enabledInputMethodList) {
                String packageName = inputMethodInfo.getServiceInfo().applicationInfo.packageName;
                ScanUtils scanUtils = ScanUtils.a;
                Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
                String strE0 = scanUtils.e0(packageName);
                if (!Intrinsics.areEqual(strE0, "SAFE")) {
                    ArrayList arrayList = new ArrayList();
                    List<ml4> addparmsList = rule.getAddparmsList();
                    if (addparmsList == null || addparmsList.isEmpty()) {
                        map.put(packageName, strE0);
                        nn3 nn3Var = nn3.a;
                        String str = b;
                        StringBuilder sb = new StringBuilder();
                        sb.append(" packageName  ");
                        sb.append((Object) packageName);
                        sb.append(' ');
                        String str2 = inputMethodInfo.getServiceInfo().applicationInfo.packageName;
                        Intrinsics.checkNotNullExpressionValue(str2, "inputMethodInfo.serviceI…plicationInfo.packageName");
                        sb.append(scanUtils.e0(str2));
                        nn3Var.f(str, sb.toString());
                    } else {
                        List<ml4> addparmsList2 = rule.getAddparmsList();
                        if (addparmsList2 != null) {
                            Iterator<T> it = addparmsList2.iterator();
                            while (it.hasNext()) {
                                String addpar1 = ((ml4) it.next()).getAddpar1();
                                Intrinsics.checkNotNull(addpar1);
                                arrayList.add(addpar1);
                            }
                        }
                        nn3 nn3Var2 = nn3.a;
                        String str3 = b;
                        nn3Var2.f(str3, Intrinsics.stringPlus("Whitelist-KeyBoard", new Gson().toJson(arrayList)));
                        if (arrayList.contains(StringsKt__StringsKt.trim((CharSequence) strE0).toString())) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Whitelist-KeyBoard packageName  ");
                            sb2.append((Object) packageName);
                            sb2.append(' ');
                            ScanUtils scanUtils2 = ScanUtils.a;
                            String str4 = inputMethodInfo.getServiceInfo().applicationInfo.packageName;
                            Intrinsics.checkNotNullExpressionValue(str4, "inputMethodInfo.serviceI…plicationInfo.packageName");
                            sb2.append(scanUtils2.e0(str4));
                            nn3Var2.f(str3, sb2.toString());
                        } else {
                            map.put(packageName, strE0);
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("ThirdParty-packageName  ");
                            sb3.append((Object) packageName);
                            sb3.append(' ');
                            ScanUtils scanUtils3 = ScanUtils.a;
                            String str5 = inputMethodInfo.getServiceInfo().applicationInfo.packageName;
                            Intrinsics.checkNotNullExpressionValue(str5, "inputMethodInfo.serviceI…plicationInfo.packageName");
                            sb3.append(scanUtils3.e0(str5));
                            nn3Var2.f(str3, sb3.toString());
                        }
                    }
                }
            }
            if (map.isEmpty()) {
                ScanUtils.a.Y0(rule.getRuleid());
                return;
            }
            String resInfo = new Gson().toJson(map);
            ScanUtils scanUtils4 = ScanUtils.a;
            Intrinsics.checkNotNullExpressionValue(resInfo, "resInfo");
            scanUtils4.b0(rule, resInfo);
        } catch (Exception e2) {
            nn3.a.b(b, e2.toString(), e2);
        }
    }
}
