package com.zepto;

import ai.protectt.app.security.common.helper.NativeInteractor;
import ai.protectt.app.security.common.helper.SkipAlertSharePref;
import ai.protectt.app.security.main.scan.ScanCore;
import ai.protectt.app.security.main.scan.ScanUtils;
import android.text.TextUtils;
import com.zepto.eu7;
import com.zepto.fj1;
import com.zepto.id5;
import com.zepto.jt;
import com.zepto.nt;
import com.zepto.ru5;
import com.zepto.s06;
import com.zepto.vt;
import com.zepto.z34;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class vt implements nt {
    public static final a c = new a(null);
    public pt a;
    public final String b;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b extends SuspendLambda implements Function2 {
        public int c;

        public static final class a implements z34.a {
            public final /* synthetic */ vt a;

            public a(vt vtVar) {
                this.a = vtVar;
            }

            @Override // com.zepto.z34.a
            public void a() {
                this.a.f();
            }

            @Override // com.zepto.z34.a
            public void b(int i, String error) {
                Intrinsics.checkNotNullParameter(error, "error");
                nn3 nn3Var = nn3.a;
                String TAG = this.a.b;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                nn3Var.f(TAG, Intrinsics.stringPlus("callCustRefId: token Failure ===>>", error));
            }
        }

        public b(Continuation continuation) {
            super(2, continuation);
        }

        public static final void e(vt vtVar, ks0 ks0Var) {
            if (ks0Var != null && StringsKt__StringsJVMKt.equals$default(ks0Var.getStatus(), "S", false, 2, null)) {
                nn3 nn3Var = nn3.a;
                String TAG = vtVar.b;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                String statusDesc = ks0Var.getStatusDesc();
                Intrinsics.checkNotNull(statusDesc);
                nn3Var.f(TAG, Intrinsics.stringPlus("callCustRefId Success ==>>>: ", statusDesc));
                return;
            }
            if (ks0Var != null) {
                nn3 nn3Var2 = nn3.a;
                String TAG2 = vtVar.b;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                String statusDesc2 = ks0Var.getStatusDesc();
                Intrinsics.checkNotNull(statusDesc2);
                nn3Var2.f(TAG2, Intrinsics.stringPlus("callCustRefId: Failure ===>>: ", statusDesc2));
            }
        }

        public static final void g(vt vtVar, bu7 bu7Var) {
            nn3 nn3Var = nn3.a;
            String TAG = vtVar.b;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            nn3Var.f(TAG, Intrinsics.stringPlus("error called ", bu7Var == null ? null : bu7Var.toString()));
            int iA = dq.a.a(bu7Var);
            if (iA != 401 || ScanUtils.a.v0()) {
                return;
            }
            z34.a.l(iA, new a(vtVar));
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return vt.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((b) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                js0 js0Var = new js0();
                fj1.a aVar = fj1.j;
                fj1 fj1VarB = aVar.b();
                Intrinsics.checkNotNull(fj1VarB);
                js0Var.setDeviceDetails(fj1VarB.h(false));
                fj1 fj1VarB2 = aVar.b();
                Integer numBoxInt = null;
                js0Var.setRequestInfo(fj1VarB2 == null ? null : fj1VarB2.j());
                jt.a aVar2 = jt.c;
                js0Var.setClientInfoHandshake(aVar2.p());
                qq0 qq0VarP = aVar2.p();
                if (qq0VarP != null) {
                    numBoxInt = Boxing.boxInt(qq0VarP.getChannelId());
                }
                Intrinsics.checkNotNull(numBoxInt);
                js0Var.setChannelId(numBoxInt.intValue());
                ea0 ea0Var = ea0.a;
                final vt vtVar = vt.this;
                id5.b bVar = new id5.b() { // from class: com.zepto.wt
                    @Override // com.zepto.id5.b
                    public final void onResponse(Object obj2) {
                        vt.b.e(vtVar, (ks0) obj2);
                    }
                };
                final vt vtVar2 = vt.this;
                ea0Var.a(js0Var, bVar, new id5.a() { // from class: com.zepto.xt
                    @Override // com.zepto.id5.a
                    public final void onErrorResponse(bu7 bu7Var) {
                        vt.b.g(vtVar2, bu7Var);
                    }
                });
            } catch (Exception e) {
                nn3 nn3Var = nn3.a;
                String TAG = vt.this.b;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                nn3Var.b(TAG, Intrinsics.stringPlus("callCustRefId API: Error: ====::: ", e), e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class c extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ String e;
        public final /* synthetic */ vt f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, vt vtVar, Continuation continuation) {
            super(2, continuation);
            this.e = str;
            this.f = vtVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(vt vtVar, ks0 ks0Var) {
            if (ks0Var == null || !StringsKt__StringsJVMKt.equals$default(ks0Var.getStatus(), "S", false, 2, null)) {
                return;
            }
            nn3 nn3Var = nn3.a;
            String TAG = vtVar.b;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            nn3Var.f(TAG, "calDevProps =>> : OnSuccess");
            s06 s06VarA = s06.m.a();
            Intrinsics.checkNotNull(s06VarA);
            s06VarA.N();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g(vt vtVar, bu7 bu7Var) {
            int iA = dq.a.a(bu7Var);
            nn3 nn3Var = nn3.a;
            String TAG = vtVar.b;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            nn3.c(nn3Var, TAG, Intrinsics.stringPlus("calDevProps API: Error: ====::: ", Integer.valueOf(iA)), null, 4, null);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(this.e, this.f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((c) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                js0 js0Var = new js0();
                fj1.a aVar = fj1.j;
                fj1 fj1VarB = aVar.b();
                Intrinsics.checkNotNull(fj1VarB);
                js0Var.setDeviceDetails(fj1VarB.h(false));
                fj1 fj1VarB2 = aVar.b();
                Integer numBoxInt = null;
                js0Var.setRequestInfo(fj1VarB2 == null ? null : fj1VarB2.j());
                jt.a aVar2 = jt.c;
                js0Var.setClientInfoHandshake(aVar2.p());
                js0Var.setProps(this.e);
                qq0 qq0VarP = aVar2.p();
                if (qq0VarP != null) {
                    numBoxInt = Boxing.boxInt(qq0VarP.getChannelId());
                }
                Intrinsics.checkNotNull(numBoxInt);
                js0Var.setChannelId(numBoxInt.intValue());
                ea0 ea0Var = ea0.a;
                final vt vtVar = this.f;
                id5.b bVar = new id5.b() { // from class: com.zepto.yt
                    @Override // com.zepto.id5.b
                    public final void onResponse(Object obj2) {
                        vt.c.e(vtVar, (ks0) obj2);
                    }
                };
                final vt vtVar2 = this.f;
                ea0Var.d(js0Var, bVar, new id5.a() { // from class: com.zepto.zt
                    @Override // com.zepto.id5.a
                    public final void onErrorResponse(bu7 bu7Var) {
                        vt.c.g(vtVar2, bu7Var);
                    }
                });
            } catch (Exception e) {
                nn3 nn3Var = nn3.a;
                String TAG = this.f.b;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                nn3Var.b(TAG, Intrinsics.stringPlus("calDevProps API: Error: ====::: ", e), e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class d extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ String f;

        public static final class a extends SuspendLambda implements Function2 {
            public int c;
            public final /* synthetic */ vt e;
            public final /* synthetic */ js0 f;
            public final /* synthetic */ ss1 g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(vt vtVar, js0 js0Var, ss1 ss1Var, Continuation continuation) {
                super(2, continuation);
                this.e = vtVar;
                this.f = js0Var;
                this.g = ss1Var;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(yz0 yz0Var, Continuation continuation) {
                return ((a) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.e, this.f, this.g, continuation);
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
                    String TAG = this.e.b;
                    Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    StringBuilder sb = new StringBuilder();
                    sb.append("DoAffirmation =>>>>> 1: ");
                    zi1 deviceDetails = this.f.getDeviceDetails();
                    Intrinsics.checkNotNull(deviceDetails);
                    sb.append((Object) deviceDetails.getRootStatus());
                    sb.append(' ');
                    sb.append((Object) this.g.getRootStatus());
                    sb.append("blocklist");
                    sb.append((Object) this.g.getIsblacklisting());
                    nn3Var.f(TAG, sb.toString());
                    vt vtVar = this.e;
                    js0 js0Var = this.f;
                    ss1 response = this.g;
                    Intrinsics.checkNotNullExpressionValue(response, "response");
                    vtVar.E(js0Var, response);
                } catch (Exception e) {
                    nn3 nn3Var2 = nn3.a;
                    String TAG2 = this.e.b;
                    Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                    nn3.c(nn3Var2, TAG2, e.toString(), null, 4, null);
                }
                return Unit.INSTANCE;
            }
        }

        public static final class b extends SuspendLambda implements Function2 {
            public int c;
            public final /* synthetic */ vt e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(vt vtVar, Continuation continuation) {
                super(2, continuation);
                this.e = vtVar;
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
                    if (!jt.c.z()) {
                        s06 s06VarA = s06.m.a();
                        String strY = s06VarA == null ? null : s06VarA.y();
                        Intrinsics.checkNotNull(strY);
                        if (strY.length() > 0) {
                            this.e.f();
                        }
                    }
                } catch (Exception e) {
                    nn3 nn3Var = nn3.a;
                    String TAG = this.e.b;
                    Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    nn3Var.b(TAG, Intrinsics.stringPlus(">>>>>>>>>>>> generateAndEncryptKey: Error: ", e), e);
                }
                return Unit.INSTANCE;
            }
        }

        public static final class c extends SuspendLambda implements Function2 {
            public int c;
            public final /* synthetic */ vt e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(vt vtVar, Continuation continuation) {
                super(2, continuation);
                this.e = vtVar;
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
                    this.e.i();
                } catch (Exception e) {
                    nn3 nn3Var = nn3.a;
                    String TAG = this.e.b;
                    Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    nn3Var.b(TAG, Intrinsics.stringPlus(">>>>>>>>>>>> DoAffirmation-callRulesResult: Error: ", e), e);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.zepto.vt$d$d, reason: collision with other inner class name */
        public static final class C0126d extends SuspendLambda implements Function2 {
            public int c;
            public final /* synthetic */ vt e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0126d(vt vtVar, Continuation continuation) {
                super(2, continuation);
                this.e = vtVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(yz0 yz0Var, Continuation continuation) {
                return ((C0126d) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0126d(this.e, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                try {
                    SkipAlertSharePref skipAlertSharePrefA = SkipAlertSharePref.g.a();
                    Intrinsics.checkNotNull(skipAlertSharePrefA);
                    List listG = skipAlertSharePrefA.g();
                    if (!listG.isEmpty()) {
                        nt.a.a(this.e, listG, false, 2, null);
                    }
                } catch (Exception e) {
                    nn3 nn3Var = nn3.a;
                    String TAG = this.e.b;
                    Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    nn3Var.b(TAG, Intrinsics.stringPlus(">>>>>>>>>>>> DoAffirmation-callSkipAlertApi: Error: ", e), e);
                }
                return Unit.INSTANCE;
            }
        }

        public static final class e implements z34.a {
            public final /* synthetic */ vt a;
            public final /* synthetic */ String b;

            public e(vt vtVar, String str) {
                this.a = vtVar;
                this.b = str;
            }

            @Override // com.zepto.z34.a
            public void a() {
                this.a.u(this.b);
            }

            @Override // com.zepto.z34.a
            public void b(int i, String error) {
                Intrinsics.checkNotNullParameter(error, "error");
                this.a.A().k(new md5(-9, "F", "callDoAffirmation onTokenFailed Error code: " + i + "||" + error));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Continuation continuation) {
            super(2, continuation);
            this.f = str;
        }

        public static final void g(vt vtVar, js0 js0Var, ss1 ss1Var) {
            jt.a aVar = jt.c;
            aVar.C0(true);
            if (ss1Var == null || !StringsKt__StringsJVMKt.equals$default(ss1Var.getStatus(), "S", false, 2, null)) {
                if (ss1Var != null) {
                    vtVar.A().k(new md5(-8, ss1Var.getStatus(), "callDoAffirmation Trust else" + ((Object) ss1Var.getStatusDesc()) + " --- Error code: 503"));
                    return;
                }
                return;
            }
            aVar.o0(aVar.e() + "|Do-R" + ScanUtils.a.m1());
            nn3 nn3Var = nn3.a;
            String TAG = vtVar.b;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            StringBuilder sb = new StringBuilder();
            sb.append("DoAffirmation =>>>>> 2.1: ");
            zi1 deviceDetails = js0Var.getDeviceDetails();
            Intrinsics.checkNotNull(deviceDetails);
            sb.append((Object) deviceDetails.getRootStatus());
            sb.append(' ');
            sb.append((Object) ss1Var.getRootStatus());
            sb.append("blocklist");
            sb.append((Object) ss1Var.getIsblacklisting());
            nn3Var.f(TAG, sb.toString());
            NativeInteractor nativeInteractor = NativeInteractor.a;
            nativeInteractor.x0(ss1Var.getNetworkAddress());
            vtVar.v(ss1Var);
            s06.a aVar2 = s06.m;
            s06 s06VarA = aVar2.a();
            Intrinsics.checkNotNull(s06VarA);
            s06VarA.M(new ArrayList());
            s06 s06VarA2 = aVar2.a();
            Intrinsics.checkNotNull(s06VarA2);
            s06VarA2.T("online");
            String sessionId = ss1Var.getSessionId();
            Intrinsics.checkNotNull(sessionId);
            nativeInteractor.setSessionToken(sessionId);
            aVar.A0(ss1Var.getServerCurrentTimestamp());
            qj2 qj2Var = qj2.c;
            f80.d(qj2Var, null, null, new a(vtVar, js0Var, ss1Var, null), 3, null);
            f80.d(qj2Var, null, null, new b(vtVar, null), 3, null);
            try {
                f80.d(qj2Var, null, null, new c(vtVar, null), 3, null);
                f80.d(qj2Var, null, null, new C0126d(vtVar, null), 3, null);
                vtVar.A().h();
                try {
                    Boolean ruleUpdateFlag = ss1Var.getRuleUpdateFlag();
                    Intrinsics.checkNotNull(ruleUpdateFlag);
                    if (ruleUpdateFlag.booleanValue()) {
                        vtVar.c();
                    } else {
                        vtVar.A().c();
                    }
                } catch (Exception e2) {
                    nn3 nn3Var2 = nn3.a;
                    String TAG2 = vtVar.b;
                    Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                    nn3Var2.b(TAG2, e2.toString(), e2);
                }
            } catch (Exception e3) {
                nn3 nn3Var3 = nn3.a;
                String TAG3 = vtVar.b;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                nn3Var3.b(TAG3, Intrinsics.stringPlus("Error: callDoAffirmation==>> ", e3.getMessage()), e3);
            }
        }

        public static final void h(final vt vtVar, final String str, bu7 bu7Var) {
            String string;
            nn3 nn3Var = nn3.a;
            String TAG = vtVar.b;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            nn3Var.f(TAG, Intrinsics.stringPlus("error called ", bu7Var == null ? null : bu7Var.toString()));
            int iA = dq.a.a(bu7Var);
            if (iA == 401) {
                if (ScanUtils.a.v0()) {
                    return;
                }
                z34.a.l(iA, new e(vtVar, str));
                return;
            }
            if (bu7Var != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(bu7Var);
                sb.append('|');
                sb.append((Object) bu7Var.getMessage());
                sb.append('|');
                String localizedMessage = bu7Var.getLocalizedMessage();
                if (localizedMessage == null) {
                    localizedMessage = null;
                }
                sb.append((Object) localizedMessage);
                sb.append('|');
                m44 m44Var = bu7Var.networkResponse;
                sb.append((Object) (m44Var != null ? Integer.valueOf(m44Var.statusCode).toString() : null));
                string = sb.toString();
                ScanCore.a.p1(new Runnable() { // from class: com.zepto.cu
                    @Override // java.lang.Runnable
                    public final void run() {
                        vt.d.i(vtVar, str);
                    }
                }, bu7Var);
            } else {
                string = "";
            }
            pt ptVarA = vtVar.A();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("callDoAffirmation errorcode else  Error code: ");
            sb2.append(iA);
            sb2.append("||");
            if (string.length() == 0) {
                string = "error msg is null";
            }
            sb2.append(string);
            ptVarA.k(new md5(-9, "F", sb2.toString()));
        }

        public static final void i(vt vtVar, String str) {
            eg5 eg5Var = eg5.a;
            if (eg5Var.c() < 2) {
                eg5Var.n(eg5Var.c() + 1);
                nn3.a.f("RE-TRYLOG", Intrinsics.stringPlus("DO_AFFIRMATION CALLED:-", Integer.valueOf(eg5Var.c())));
                vtVar.u(str);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return vt.this.new d(this.f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((d) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String strJ;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                vt.this.z(this.f);
                fj1.a aVar = fj1.j;
                fj1 fj1VarB = aVar.b();
                Intrinsics.checkNotNull(fj1VarB);
                fj1VarB.k();
                final js0 js0Var = new js0();
                fj1 fj1VarB2 = aVar.b();
                Intrinsics.checkNotNull(fj1VarB2);
                js0Var.setDeviceDetails(fj1VarB2.h(false));
                fj1 fj1VarB3 = aVar.b();
                String appVersionName = null;
                js0Var.setRequestInfo(fj1VarB3 == null ? null : fj1VarB3.j());
                jt.a aVar2 = jt.c;
                js0Var.setClientInfoHandshake(aVar2.p());
                qq0 qq0VarP = aVar2.p();
                Integer numBoxInt = qq0VarP == null ? null : Boxing.boxInt(qq0VarP.getChannelId());
                Intrinsics.checkNotNull(numBoxInt);
                js0Var.setChannelId(numBoxInt.intValue());
                s06.a aVar3 = s06.m;
                s06 s06VarA = aVar3.a();
                Integer numBoxInt2 = s06VarA == null ? null : Boxing.boxInt(s06VarA.e());
                Intrinsics.checkNotNull(numBoxInt2);
                js0Var.setAppVersionCode(numBoxInt2.intValue());
                StringBuilder sb = new StringBuilder();
                sb.append(aVar2.e());
                sb.append("|Do-C");
                ScanUtils scanUtils = ScanUtils.a;
                sb.append(scanUtils.m1());
                aVar2.o0(sb.toString());
                s06 s06VarA2 = aVar3.a();
                Intrinsics.checkNotNull(s06VarA2);
                s06VarA2.T("online");
                s06 s06VarA3 = aVar3.a();
                Intrinsics.checkNotNull(s06VarA3);
                s06VarA3.U("this is online flow");
                js0Var.setMobileSessionDetails(scanUtils.M());
                s06 s06VarA4 = aVar3.a();
                String str = "";
                if (s06VarA4 != null && (strJ = s06VarA4.j()) != null) {
                    str = strJ;
                }
                js0Var.setLastRuleModify(str);
                js0Var.setLastCommit("86b403b18b386bcf76e2dec5f660d80450653fac");
                js0Var.setBuildTime("2025-02-28 15:06:56");
                js0Var.setSdkVersion("4.0");
                js0Var.setHashTrust(aVar.a());
                fj1 fj1VarB4 = aVar.b();
                Intrinsics.checkNotNull(fj1VarB4);
                js0Var.setInstallationDetails(fj1VarB4.i());
                js0Var.setTestTrust(aVar.c());
                qq0 qq0VarP2 = aVar2.p();
                if (qq0VarP2 != null) {
                    appVersionName = qq0VarP2.getAppVersionName();
                }
                Intrinsics.checkNotNull(appVersionName);
                js0Var.setAppVersion(appVersionName);
                String strA = eg5.a.a();
                Intrinsics.checkNotNullExpressionValue(strA, "SDKConstants.ABI");
                js0Var.setArchitecture(strA);
                js0Var.setVbsFlag(ScanCore.a.Z());
                ea0 ea0Var = ea0.a;
                final vt vtVar = vt.this;
                id5.b bVar = new id5.b() { // from class: com.zepto.au
                    @Override // com.zepto.id5.b
                    public final void onResponse(Object obj2) {
                        vt.d.g(vtVar, js0Var, (ss1) obj2);
                    }
                };
                final vt vtVar2 = vt.this;
                final String str2 = this.f;
                ea0Var.b(js0Var, bVar, new id5.a() { // from class: com.zepto.bu
                    @Override // com.zepto.id5.a
                    public final void onErrorResponse(bu7 bu7Var) {
                        vt.d.h(vtVar2, str2, bu7Var);
                    }
                });
            } catch (Exception e2) {
                nn3 nn3Var = nn3.a;
                String TAG = vt.this.b;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                nn3Var.b(TAG, Intrinsics.stringPlus("DoAffirmation ===>>>: ", e2), e2);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class e implements z34.a {
        public final /* synthetic */ String b;

        public e(String str) {
            this.b = str;
        }

        @Override // com.zepto.z34.a
        public void a() {
            vt.this.d(this.b);
        }

        @Override // com.zepto.z34.a
        public void b(int i, String error) {
            Intrinsics.checkNotNullParameter(error, "error");
            nn3 nn3Var = nn3.a;
            String TAG = vt.this.b;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            nn3.c(nn3Var, TAG, error, null, 4, null);
        }
    }

    public static final class f extends SuspendLambda implements Function2 {
        public int c;

        public static final class a extends SuspendLambda implements Function2 {
            public int c;
            public final /* synthetic */ jf5 e;
            public final /* synthetic */ vt f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(jf5 jf5Var, vt vtVar, Continuation continuation) {
                super(2, continuation);
                this.e = jf5Var;
                this.f = vtVar;
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
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                try {
                    if (this.e.getLastRuleModify() != null) {
                        s06 s06VarA = s06.m.a();
                        if (s06VarA != null) {
                            s06VarA.I(this.e.getLastRuleModify());
                        }
                        nn3.a.f("lastRuleModify", Intrinsics.stringPlus("not null :: ", this.e.getLastRuleModify()));
                    } else {
                        nn3.a.f("lastRuleModify", "null");
                    }
                } catch (Exception e) {
                    nn3 nn3Var = nn3.a;
                    String TAG = this.f.b;
                    Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    nn3Var.b(TAG, Intrinsics.stringPlus("callRulesConfig: Error: =====>>:: ", e), e);
                }
                return Unit.INSTANCE;
            }
        }

        public static final class b implements z34.a {
            public final /* synthetic */ vt a;

            public b(vt vtVar) {
                this.a = vtVar;
            }

            @Override // com.zepto.z34.a
            public void a() {
                this.a.c();
            }

            @Override // com.zepto.z34.a
            public void b(int i, String error) {
                Intrinsics.checkNotNullParameter(error, "error");
                this.a.A().k(new md5(-9, "F", "RulesConfig onTokenFailed Error code: " + i + "||" + error));
            }
        }

        public f(Continuation continuation) {
            super(2, continuation);
        }

        public static final void e(vt vtVar, jf5 jf5Var) {
            if (jf5Var == null || !StringsKt__StringsJVMKt.equals$default(jf5Var.getStatus(), "S", false, 2, null)) {
                if (jf5Var != null) {
                    vtVar.A().k(new md5(-8, jf5Var.getStatus(), "RulesConfig FailedResponse " + ((Object) jf5Var.getStatusDesc()) + " --- Error code: 503"));
                    return;
                }
                return;
            }
            f80.d(qj2.c, null, null, new a(jf5Var, vtVar, null), 3, null);
            if (jf5Var.getSkipMessage()) {
                nn3 nn3Var = nn3.a;
                String TAG = vtVar.b;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                nn3Var.f(TAG, "Feature rule -----> true");
                vtVar.A().e(jf5Var.getRuleList());
                return;
            }
            nn3 nn3Var2 = nn3.a;
            String TAG2 = vtVar.b;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            nn3Var2.f(TAG2, "Feature rule -----> false");
            vtVar.A().i(jf5Var.getRuleList());
        }

        public static final void g(vt vtVar, bu7 bu7Var) {
            String string;
            nn3 nn3Var = nn3.a;
            String TAG = vtVar.b;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            nn3Var.f(TAG, Intrinsics.stringPlus("error called ", bu7Var == null ? null : bu7Var.toString()));
            int iA = dq.a.a(bu7Var);
            if (iA == 401) {
                if (ScanUtils.a.v0()) {
                    return;
                }
                z34.a.l(iA, new b(vtVar));
                return;
            }
            if (bu7Var != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(bu7Var);
                sb.append('|');
                sb.append((Object) bu7Var.getMessage());
                sb.append('|');
                String localizedMessage = bu7Var.getLocalizedMessage();
                if (localizedMessage == null) {
                    localizedMessage = null;
                }
                sb.append((Object) localizedMessage);
                sb.append('|');
                m44 m44Var = bu7Var.networkResponse;
                sb.append((Object) (m44Var != null ? Integer.valueOf(m44Var.statusCode).toString() : null));
                string = sb.toString();
            } else {
                string = "";
            }
            pt ptVarA = vtVar.A();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("RulesConfig errorcode else Error code: ");
            sb2.append(iA);
            sb2.append("||");
            if (string.length() == 0) {
                string = "error msg is null";
            }
            sb2.append(string);
            ptVarA.k(new md5(-9, "F", sb2.toString()));
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return vt.this.new f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((f) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String strJ;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                js0 js0Var = new js0();
                fj1.a aVar = fj1.j;
                fj1 fj1VarB = aVar.b();
                Intrinsics.checkNotNull(fj1VarB);
                js0Var.setDeviceDetails(fj1VarB.h(false));
                fj1 fj1VarB2 = aVar.b();
                Integer numBoxInt = null;
                js0Var.setRequestInfo(fj1VarB2 == null ? null : fj1VarB2.j());
                jt.a aVar2 = jt.c;
                js0Var.setClientInfoHandshake(aVar2.p());
                qq0 qq0VarP = aVar2.p();
                if (qq0VarP != null) {
                    numBoxInt = Boxing.boxInt(qq0VarP.getChannelId());
                }
                Intrinsics.checkNotNull(numBoxInt);
                js0Var.setChannelId(numBoxInt.intValue());
                s06 s06VarA = s06.m.a();
                String str = "";
                if (s06VarA != null && (strJ = s06VarA.j()) != null) {
                    str = strJ;
                }
                js0Var.setLastRuleModifyMobReq(str);
                ea0 ea0Var = ea0.a;
                final vt vtVar = vt.this;
                id5.b bVar = new id5.b() { // from class: com.zepto.du
                    @Override // com.zepto.id5.b
                    public final void onResponse(Object obj2) {
                        vt.f.e(vtVar, (jf5) obj2);
                    }
                };
                final vt vtVar2 = vt.this;
                ea0Var.i(js0Var, bVar, new id5.a() { // from class: com.zepto.eu
                    @Override // com.zepto.id5.a
                    public final void onErrorResponse(bu7 bu7Var) {
                        vt.f.g(vtVar2, bu7Var);
                    }
                });
            } catch (Exception e) {
                nn3 nn3Var = nn3.a;
                String TAG = vt.this.b;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                nn3Var.b(TAG, Intrinsics.stringPlus("callRulesConfig: Error: =====>>:: ", e), e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class g extends SuspendLambda implements Function2 {
        public int c;

        public g(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((g) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return vt.this.new g(continuation);
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
                String TAG = vt.this.b;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                nn3Var.f(TAG, "callRulesResult Called ");
                ArrayList arrayList = new ArrayList();
                eu7 eu7VarA = eu7.d.a();
                Intrinsics.checkNotNull(eu7VarA);
                List<if5> listG = eu7VarA.g();
                if (!listG.isEmpty()) {
                    s06 s06VarA = s06.m.a();
                    Intrinsics.checkNotNull(s06VarA);
                    String strX = s06VarA.x();
                    for (if5 if5Var : listG) {
                        if (Intrinsics.areEqual(if5Var.getPostStatus(), "N") || (Intrinsics.areEqual(if5Var.getPostStatus(), "Y") && !StringsKt__StringsJVMKt.equals$default(if5Var.getMobileSessionID(), strX, false, 2, null))) {
                            arrayList.add(if5Var);
                        }
                    }
                }
                vt.this.D(arrayList);
                vt.this.H(arrayList);
                nn3 nn3Var2 = nn3.a;
                String TAG2 = vt.this.b;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                nn3Var2.f(TAG2, "callRulesResult Completed ");
            } catch (Exception e) {
                nn3 nn3Var3 = nn3.a;
                String TAG3 = vt.this.b;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                nn3Var3.b(TAG3, Intrinsics.stringPlus("Rule Result API: Error: ====::: ", e), e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class h extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ String f;

        public static final class a implements z34.a {
            public final /* synthetic */ vt a;
            public final /* synthetic */ String b;

            public a(vt vtVar, String str) {
                this.a = vtVar;
                this.b = str;
            }

            @Override // com.zepto.z34.a
            public void a() {
                this.a.u(this.b);
            }

            @Override // com.zepto.z34.a
            public void b(int i, String error) {
                Intrinsics.checkNotNullParameter(error, "error");
                if (i != 503) {
                    this.a.a();
                    return;
                }
                this.a.A().k(new md5(-9, "F", "calloAuthToken onTokenFailed::Error code: " + i + "||" + error));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, Continuation continuation) {
            super(2, continuation);
            this.f = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((h) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return vt.this.new h(this.f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                z34.a.l(1003, new a(vt.this, this.f));
            } catch (Exception e) {
                nn3 nn3Var = nn3.a;
                String TAG = vt.this.b;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                nn3Var.b(TAG, Intrinsics.stringPlus("calloAuthToken: =======>:: Error: ", e), e);
                vt.this.a();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class i extends SuspendLambda implements Function2 {
        public int c;

        public i(Continuation continuation) {
            super(2, continuation);
        }

        public static final void g(vt vtVar, zk2 zk2Var) {
            if (zk2Var == null || !StringsKt__StringsJVMKt.equals$default(zk2Var.getStatus(), "S", false, 2, null)) {
                if (zk2Var != null) {
                    nn3 nn3Var = nn3.a;
                    String TAG = vtVar.b;
                    Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    nn3Var.b(TAG, Intrinsics.stringPlus("#### doHandShake : on Fail: ", zk2Var.getStatusDescription()), new Exception(Intrinsics.stringPlus("#### doHandShake : on Fail: ", zk2Var.getStatusDescription())));
                    vtVar.A().k(new md5(-8, zk2Var.getStatus(), "doHandShake Trust else " + ((Object) zk2Var.getStatusDescription()) + " --- Error code: 503"));
                    return;
                }
                return;
            }
            jt.a aVar = jt.c;
            aVar.o0(aVar.e() + "|Hand-R" + ScanUtils.a.m1());
            s06.a aVar2 = s06.m;
            s06 s06VarA = aVar2.a();
            if (s06VarA != null) {
                String encryptedResponse = zk2Var.getEncryptedResponse();
                Intrinsics.checkNotNull(encryptedResponse);
                s06VarA.H(encryptedResponse);
            }
            s06 s06VarA2 = aVar2.a();
            if (s06VarA2 != null) {
                s06VarA2.A();
            }
            NativeInteractor nativeInteractor = NativeInteractor.a;
            nativeInteractor.y0(zk2Var.getTrust());
            s06 s06VarA3 = aVar2.a();
            if (s06VarA3 != null) {
                s06VarA3.Q(zk2Var.getTrust());
            }
            vtVar.b(nativeInteractor.F());
            nn3 nn3Var2 = nn3.a;
            String TAG2 = vtVar.b;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            nn3Var2.f(TAG2, Intrinsics.stringPlus("#### doHandShake : on success: ", zk2Var.getEncryptedResponse()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void h(final vt vtVar, bu7 bu7Var) {
            nn3 nn3Var = nn3.a;
            String TAG = vtVar.b;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            nn3Var.f(TAG, Intrinsics.stringPlus("error called ", bu7Var == null ? null : bu7Var.toString()));
            if (bu7Var == null) {
                vtVar.A().k(new md5(-9, "F", Intrinsics.stringPlus("Error message not available", Integer.valueOf(dq.a.a(bu7Var)))));
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(bu7Var);
            sb.append('|');
            sb.append((Object) bu7Var.getMessage());
            sb.append('|');
            String localizedMessage = bu7Var.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = null;
            }
            sb.append((Object) localizedMessage);
            sb.append('|');
            m44 m44Var = bu7Var.networkResponse;
            sb.append((Object) (m44Var != null ? Integer.valueOf(m44Var.statusCode).toString() : null));
            String string = sb.toString();
            int iA = dq.a.a(bu7Var);
            pt ptVarA = vtVar.A();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("doHandShake::Error code: ");
            sb2.append(iA);
            sb2.append(": ");
            String message = bu7Var.getMessage();
            if (message == null) {
                message = "Server Unavailable";
            }
            sb2.append(message);
            sb2.append("||");
            sb2.append(string);
            ptVarA.k(new md5(-9, "F", sb2.toString()));
            ScanCore.a.p1(new Runnable() { // from class: com.zepto.hu
                @Override // java.lang.Runnable
                public final void run() {
                    vt.i.i(vtVar);
                }
            }, bu7Var);
        }

        public static final void i(vt vtVar) {
            eg5 eg5Var = eg5.a;
            if (eg5Var.d() < 2) {
                eg5Var.o(eg5Var.d() + 1);
                nn3.a.f("RE-TRYLOG", Intrinsics.stringPlus("HANDSHAKE CALLED:-", Integer.valueOf(eg5Var.d())));
                vtVar.a();
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return vt.this.new i(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((i) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                js0 js0Var = new js0();
                fj1.a aVar = fj1.j;
                fj1 fj1VarB = aVar.b();
                Intrinsics.checkNotNull(fj1VarB);
                js0Var.setDeviceDetails(fj1VarB.h(false));
                fj1 fj1VarB2 = aVar.b();
                Integer numBoxInt = null;
                js0Var.setRequestInfo(fj1VarB2 == null ? null : fj1VarB2.j());
                jt.a aVar2 = jt.c;
                js0Var.setClientInfoHandshake(aVar2.p());
                qq0 qq0VarP = aVar2.p();
                if (qq0VarP != null) {
                    numBoxInt = Boxing.boxInt(qq0VarP.getChannelId());
                }
                Intrinsics.checkNotNull(numBoxInt);
                js0Var.setChannelId(numBoxInt.intValue());
                js0Var.setVbsFlag(ScanCore.a.Z());
                aVar2.o0(aVar2.e() + "|Hand-C" + ScanUtils.a.m1());
                ea0 ea0Var = ea0.a;
                final vt vtVar = vt.this;
                id5.b bVar = new id5.b() { // from class: com.zepto.fu
                    @Override // com.zepto.id5.b
                    public final void onResponse(Object obj2) {
                        vt.i.g(vtVar, (zk2) obj2);
                    }
                };
                final vt vtVar2 = vt.this;
                ea0Var.e(js0Var, bVar, new id5.a() { // from class: com.zepto.gu
                    @Override // com.zepto.id5.a
                    public final void onErrorResponse(bu7 bu7Var) {
                        vt.i.h(vtVar2, bu7Var);
                    }
                });
            } catch (Exception e) {
                nn3 nn3Var = nn3.a;
                String TAG = vt.this.b;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                nn3Var.b(TAG, Intrinsics.stringPlus("HandShake: =======>:: Error: ", e), e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class j extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ Runnable f;
        public final /* synthetic */ X509Certificate[] g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Runnable runnable, X509Certificate[] x509CertificateArr, Continuation continuation) {
            super(2, continuation);
            this.f = runnable;
            this.g = x509CertificateArr;
        }

        public static final void e(vt vtVar, X509Certificate[] x509CertificateArr, zk2 zk2Var) {
            if (zk2Var == null || !StringsKt__StringsJVMKt.equals$default(zk2Var.getStatus(), "S", false, 2, null)) {
                if (zk2Var != null) {
                    nn3 nn3Var = nn3.a;
                    String TAG = vtVar.b;
                    Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    String statusDescription = zk2Var.getStatusDescription();
                    Intrinsics.checkNotNull(statusDescription);
                    nn3Var.f(TAG, Intrinsics.stringPlus("callCustRefId: Failure ===>>: ", statusDescription));
                    return;
                }
                return;
            }
            c66 sslDtls = zk2Var.getSslDtls();
            if (sslDtls == null) {
                return;
            }
            s06 s06VarA = s06.m.a();
            if (s06VarA != null) {
                s06VarA.P(sslDtls.getSslpublickey());
                s06VarA.O(sslDtls.getSslexpirydate());
                mo5.a.r(sslDtls.getSslflag());
            }
            if (x509CertificateArr == null) {
                return;
            }
            z34.a.t(x509CertificateArr, NativeInteractor.a.U());
        }

        public static final void g(vt vtVar, bu7 bu7Var) {
            nn3 nn3Var = nn3.a;
            String TAG = vtVar.b;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            nn3Var.f(TAG, Intrinsics.stringPlus("error called ", bu7Var == null ? null : bu7Var.toString()));
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return vt.this.new j(this.f, this.g, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((j) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Runnable runnable;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                try {
                    js0 js0Var = new js0();
                    jt.a aVar = jt.c;
                    qq0 qq0VarP = aVar.p();
                    qc5 qc5VarJ = null;
                    Integer numBoxInt = qq0VarP == null ? null : Boxing.boxInt(qq0VarP.getChannelId());
                    Intrinsics.checkNotNull(numBoxInt);
                    js0Var.setChannelId(numBoxInt.intValue());
                    fj1.a aVar2 = fj1.j;
                    fj1 fj1VarB = aVar2.b();
                    Intrinsics.checkNotNull(fj1VarB);
                    js0Var.setDeviceDetails(fj1VarB.h(false));
                    fj1 fj1VarB2 = aVar2.b();
                    if (fj1VarB2 != null) {
                        qc5VarJ = fj1VarB2.j();
                    }
                    js0Var.setRequestInfo(qc5VarJ);
                    js0Var.setClientInfoHandshake(aVar.p());
                    ea0 ea0Var = ea0.a;
                    final vt vtVar = vt.this;
                    final X509Certificate[] x509CertificateArr = this.g;
                    id5.b bVar = new id5.b() { // from class: com.zepto.iu
                        @Override // com.zepto.id5.b
                        public final void onResponse(Object obj2) {
                            vt.j.e(vtVar, x509CertificateArr, (zk2) obj2);
                        }
                    };
                    final vt vtVar2 = vt.this;
                    ea0Var.c(js0Var, bVar, new id5.a() { // from class: com.zepto.ju
                        @Override // com.zepto.id5.a
                        public final void onErrorResponse(bu7 bu7Var) {
                            vt.j.g(vtVar2, bu7Var);
                        }
                    });
                    runnable = this.f;
                } catch (Exception e) {
                    nn3 nn3Var = nn3.a;
                    String TAG = vt.this.b;
                    Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    nn3Var.b(TAG, Intrinsics.stringPlus("callCustRefId API: Error: ====::: ", e), e);
                    runnable = this.f;
                    if (runnable != null) {
                    }
                }
                if (runnable != null) {
                    runnable.run();
                }
                return Unit.INSTANCE;
            } catch (Throwable th) {
                Runnable runnable2 = this.f;
                if (runnable2 != null) {
                    runnable2.run();
                }
                throw th;
            }
        }
    }

    public static final class k extends SuspendLambda implements Function2 {
        public int c;

        public k(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((k) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return vt.this.new k(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.c = 1;
                    if (bh1.a(100L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                vt.this.g();
            } catch (Exception e) {
                nn3 nn3Var = nn3.a;
                String TAG = vt.this.b;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                nn3.c(nn3Var, TAG, e.toString(), null, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class l extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ List e;
        public final /* synthetic */ vt f;
        public final /* synthetic */ boolean g;

        public static final class a implements z34.a {
            public final /* synthetic */ vt a;
            public final /* synthetic */ List b;

            /* JADX INFO: renamed from: com.zepto.vt$l$a$a, reason: collision with other inner class name */
            public static final class C0127a extends SuspendLambda implements Function2 {
                public int c;
                public final /* synthetic */ vt e;
                public final /* synthetic */ List f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0127a(vt vtVar, List list, Continuation continuation) {
                    super(2, continuation);
                    this.e = vtVar;
                    this.f = list;
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object invoke(yz0 yz0Var, Continuation continuation) {
                    return ((C0127a) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C0127a(this.e, this.f, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.c != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    try {
                        vt.G(this.e, this.f, false, 2, null);
                    } catch (Exception e) {
                        nn3 nn3Var = nn3.a;
                        String TAG = this.e.b;
                        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                        nn3.c(nn3Var, TAG, e.toString(), null, 4, null);
                    }
                    return Unit.INSTANCE;
                }
            }

            public a(vt vtVar, List list) {
                this.a = vtVar;
                this.b = list;
            }

            @Override // com.zepto.z34.a
            public void a() {
                f80.d(qj2.c, null, null, new C0127a(this.a, this.b, null), 3, null);
            }

            @Override // com.zepto.z34.a
            public void b(int i, String error) {
                Intrinsics.checkNotNullParameter(error, "error");
                nn3 nn3Var = nn3.a;
                String TAG = this.a.b;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                nn3.c(nn3Var, TAG, Intrinsics.stringPlus("callSkipAlertApi onTokenFailed Error:-", error), null, 4, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(List list, vt vtVar, boolean z, Continuation continuation) {
            super(2, continuation);
            this.e = list;
            this.f = vtVar;
            this.g = z;
        }

        public static final void g(vt vtVar, List list, boolean z, jf5 jf5Var) {
            if (jf5Var == null || !StringsKt__StringsJVMKt.equals$default(jf5Var.getStatus(), "S", false, 2, null)) {
                if (jf5Var != null) {
                    nn3 nn3Var = nn3.a;
                    String TAG = vtVar.b;
                    Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    String statusDesc = jf5Var.getStatusDesc();
                    Intrinsics.checkNotNull(statusDesc);
                    nn3.c(nn3Var, TAG, Intrinsics.stringPlus("callSkipAlertApi:-", statusDesc), null, 4, null);
                    return;
                }
                return;
            }
            nn3 nn3Var2 = nn3.a;
            String TAG2 = vtVar.b;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            nn3Var2.f(TAG2, Intrinsics.stringPlus("callSkipAlertApi Resp size ==>>>OUTPUT: ", Integer.valueOf(list.size())));
            if (z) {
                SkipAlertSharePref skipAlertSharePrefA = SkipAlertSharePref.g.a();
                Intrinsics.checkNotNull(skipAlertSharePrefA);
                skipAlertSharePrefA.c();
            } else {
                SkipAlertSharePref skipAlertSharePrefA2 = SkipAlertSharePref.g.a();
                Intrinsics.checkNotNull(skipAlertSharePrefA2);
                skipAlertSharePrefA2.d();
            }
        }

        public static final void h(final vt vtVar, final List list, final boolean z, bu7 bu7Var) {
            nn3 nn3Var = nn3.a;
            String TAG = vtVar.b;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            nn3Var.f(TAG, Intrinsics.stringPlus("skip error called ", bu7Var == null ? null : bu7Var.toString()));
            int iA = dq.a.a(bu7Var);
            if (iA == 401 && !ScanUtils.a.v0()) {
                z34.a.l(iA, new a(vtVar, list));
            }
            if (bu7Var != null) {
                ScanCore.a.p1(new Runnable() { // from class: com.zepto.mu
                    @Override // java.lang.Runnable
                    public final void run() {
                        vt.l.i(vtVar, list, z);
                    }
                }, bu7Var);
            }
        }

        public static final void i(vt vtVar, List list, boolean z) {
            eg5 eg5Var = eg5.a;
            if (eg5Var.k() < 2) {
                eg5Var.r(eg5Var.k() + 1);
                nn3.a.f("RE-TRYLOG", Intrinsics.stringPlus("JTOKEN CALLED:-", Integer.valueOf(eg5Var.k())));
                vtVar.F(list, z);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new l(this.e, this.f, this.g, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((l) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                if (!this.e.isEmpty()) {
                    js0 js0Var = new js0();
                    fj1.a aVar = fj1.j;
                    fj1 fj1VarB = aVar.b();
                    Intrinsics.checkNotNull(fj1VarB);
                    js0Var.setDeviceDetails(fj1VarB.h(false));
                    fj1 fj1VarB2 = aVar.b();
                    Integer numBoxInt = null;
                    js0Var.setRequestInfo(fj1VarB2 == null ? null : fj1VarB2.j());
                    jt.a aVar2 = jt.c;
                    js0Var.setClientInfoHandshake(aVar2.p());
                    js0Var.setRuleConfigDTO(this.e);
                    nn3 nn3Var = nn3.a;
                    String TAG = this.f.b;
                    Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    nn3Var.f(TAG, Intrinsics.stringPlus("callSkipAlertApi Resp size ==>>>INPUT: ", Boxing.boxInt(this.e.size())));
                    qq0 qq0VarP = aVar2.p();
                    if (qq0VarP != null) {
                        numBoxInt = Boxing.boxInt(qq0VarP.getChannelId());
                    }
                    Intrinsics.checkNotNull(numBoxInt);
                    js0Var.setChannelId(numBoxInt.intValue());
                    ea0 ea0Var = ea0.a;
                    final vt vtVar = this.f;
                    final List list = this.e;
                    final boolean z = this.g;
                    id5.b bVar = new id5.b() { // from class: com.zepto.ku
                        @Override // com.zepto.id5.b
                        public final void onResponse(Object obj2) {
                            vt.l.g(vtVar, list, z, (jf5) obj2);
                        }
                    };
                    final vt vtVar2 = this.f;
                    final List list2 = this.e;
                    final boolean z2 = this.g;
                    ea0Var.k(js0Var, bVar, new id5.a() { // from class: com.zepto.lu
                        @Override // com.zepto.id5.a
                        public final void onErrorResponse(bu7 bu7Var) {
                            vt.l.h(vtVar2, list2, z2, bu7Var);
                        }
                    });
                }
            } catch (Exception e) {
                nn3 nn3Var2 = nn3.a;
                String TAG2 = this.f.b;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                nn3.c(nn3Var2, TAG2, e.toString(), null, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class m extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ List e;
        public final /* synthetic */ vt f;

        public static final class a extends SuspendLambda implements Function2 {
            public int c;
            public final /* synthetic */ List e;
            public final /* synthetic */ vt f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List list, vt vtVar, Continuation continuation) {
                super(2, continuation);
                this.e = list;
                this.f = vtVar;
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
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                try {
                    for (if5 if5Var : this.e) {
                        String mobileSessionID = if5Var.getMobileSessionID();
                        s06 s06VarA = s06.m.a();
                        Intrinsics.checkNotNull(s06VarA);
                        if (StringsKt__StringsJVMKt.equals$default(mobileSessionID, s06VarA.x(), false, 2, null)) {
                            nn3 nn3Var = nn3.a;
                            String TAG = this.f.b;
                            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                            nn3Var.f(TAG, "RulesResult Resp ==>>>RULEID: " + if5Var.getRuleid() + ">>>>" + ((Object) if5Var.getResult()));
                            jt.c.a(if5Var.getRuleid());
                        } else {
                            nn3 nn3Var2 = nn3.a;
                            String TAG2 = this.f.b;
                            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                            nn3Var2.f(TAG2, "RulesResult Resp ==>>>Older RULEID: " + if5Var.getRuleid() + ">>>>" + ((Object) if5Var.getResult()));
                        }
                    }
                } catch (Exception e) {
                    nn3 nn3Var3 = nn3.a;
                    String TAG3 = this.f.b;
                    Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                    nn3Var3.b(TAG3, Intrinsics.stringPlus("Rule Result API: Error: ====::: ", e), e);
                }
                return Unit.INSTANCE;
            }
        }

        public static final class b implements z34.a {
            public final /* synthetic */ vt a;
            public final /* synthetic */ List b;

            public static final class a extends SuspendLambda implements Function2 {
                public int c;
                public final /* synthetic */ vt e;
                public final /* synthetic */ List f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(vt vtVar, List list, Continuation continuation) {
                    super(2, continuation);
                    this.e = vtVar;
                    this.f = list;
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
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.c != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    try {
                        this.e.H(this.f);
                    } catch (Exception e) {
                        nn3 nn3Var = nn3.a;
                        String TAG = this.e.b;
                        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                        nn3.c(nn3Var, TAG, e.toString(), null, 4, null);
                    }
                    return Unit.INSTANCE;
                }
            }

            public b(vt vtVar, List list) {
                this.a = vtVar;
                this.b = list;
            }

            @Override // com.zepto.z34.a
            public void a() {
                f80.d(qj2.c, null, null, new a(this.a, this.b, null), 3, null);
            }

            @Override // com.zepto.z34.a
            public void b(int i, String error) {
                Intrinsics.checkNotNullParameter(error, "error");
                nn3 nn3Var = nn3.a;
                String TAG = this.a.b;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                nn3.c(nn3Var, TAG, Intrinsics.stringPlus("RulesResult: failure ===>>", error), null, 4, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(List list, vt vtVar, Continuation continuation) {
            super(2, continuation);
            this.e = list;
            this.f = vtVar;
        }

        public static final void g(vt vtVar, List list, ks0 ks0Var) {
            if (ks0Var == null || !StringsKt__StringsJVMKt.equals$default(ks0Var.getStatus(), "S", false, 2, null)) {
                if (ks0Var != null) {
                    nn3 nn3Var = nn3.a;
                    String TAG = vtVar.b;
                    Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    String statusDesc = ks0Var.getStatusDesc();
                    Intrinsics.checkNotNull(statusDesc);
                    nn3.c(nn3Var, TAG, Intrinsics.stringPlus("RulesResult: failure ===>>: response: ", statusDesc), null, 4, null);
                    return;
                }
                return;
            }
            nn3 nn3Var2 = nn3.a;
            String TAG2 = vtVar.b;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            nn3Var2.f(TAG2, Intrinsics.stringPlus("RulesResult Resp size ==>>>OUTPUT: ", Integer.valueOf(list.size())));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if5 if5Var = (if5) it.next();
                eu7 eu7VarA = eu7.d.a();
                Intrinsics.checkNotNull(eu7VarA);
                eu7VarA.i(if5Var);
            }
            f80.d(qj2.c, null, null, new a(list, vtVar, null), 3, null);
        }

        public static final void h(final vt vtVar, final List list, bu7 bu7Var) {
            String string;
            nn3 nn3Var = nn3.a;
            String TAG = vtVar.b;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            nn3Var.f(TAG, Intrinsics.stringPlus("error called ", bu7Var == null ? null : bu7Var.toString()));
            int iA = dq.a.a(bu7Var);
            if (iA == 401) {
                if (ScanUtils.a.v0()) {
                    return;
                }
                z34.a.l(iA, new b(vtVar, list));
                return;
            }
            if (bu7Var != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(bu7Var);
                sb.append('|');
                sb.append((Object) bu7Var.getMessage());
                sb.append('|');
                String localizedMessage = bu7Var.getLocalizedMessage();
                if (localizedMessage == null) {
                    localizedMessage = null;
                }
                sb.append((Object) localizedMessage);
                sb.append('|');
                m44 m44Var = bu7Var.networkResponse;
                sb.append((Object) (m44Var != null ? Integer.valueOf(m44Var.statusCode).toString() : null));
                string = sb.toString();
                ScanCore.a.p1(new Runnable() { // from class: com.zepto.pu
                    @Override // java.lang.Runnable
                    public final void run() {
                        vt.m.i(vtVar, list);
                    }
                }, bu7Var);
            } else {
                string = "";
            }
            pt ptVarA = vtVar.A();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("callRulesResult errorcode else Error code: ");
            sb2.append(iA);
            sb2.append("||");
            if (string.length() == 0) {
                string = "error msg is empty";
            }
            sb2.append(string);
            ptVarA.k(new md5(-9, "F", sb2.toString()));
        }

        public static final void i(vt vtVar, List list) {
            eg5 eg5Var = eg5.a;
            if (eg5Var.j() < 2) {
                eg5Var.q(eg5Var.j() + 1);
                nn3.a.f("RE-TRYLOG", Intrinsics.stringPlus("JTOKEN CALLED:-", Integer.valueOf(eg5Var.j())));
                vtVar.H(list);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new m(this.e, this.f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((m) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                Intrinsics.checkNotNull(this.e);
                if (!r8.isEmpty()) {
                    js0 js0Var = new js0();
                    fj1.a aVar = fj1.j;
                    fj1 fj1VarB = aVar.b();
                    Intrinsics.checkNotNull(fj1VarB);
                    js0Var.setDeviceDetails(fj1VarB.h(false));
                    fj1 fj1VarB2 = aVar.b();
                    Integer numBoxInt = null;
                    js0Var.setRequestInfo(fj1VarB2 == null ? null : fj1VarB2.j());
                    jt.a aVar2 = jt.c;
                    js0Var.setClientInfoHandshake(aVar2.p());
                    js0Var.setRuleConfigDTO(this.e);
                    nn3 nn3Var = nn3.a;
                    String TAG = this.f.b;
                    Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    nn3Var.f(TAG, Intrinsics.stringPlus("RulesResult Resp size ==>>>INPUT: ", Boxing.boxInt(this.e.size())));
                    qq0 qq0VarP = aVar2.p();
                    if (qq0VarP != null) {
                        numBoxInt = Boxing.boxInt(qq0VarP.getChannelId());
                    }
                    Intrinsics.checkNotNull(numBoxInt);
                    js0Var.setChannelId(numBoxInt.intValue());
                    ea0 ea0Var = ea0.a;
                    final vt vtVar = this.f;
                    final List list = this.e;
                    id5.b bVar = new id5.b() { // from class: com.zepto.nu
                        @Override // com.zepto.id5.b
                        public final void onResponse(Object obj2) {
                            vt.m.g(vtVar, list, (ks0) obj2);
                        }
                    };
                    final vt vtVar2 = this.f;
                    final List list2 = this.e;
                    ea0Var.j(js0Var, bVar, new id5.a() { // from class: com.zepto.ou
                        @Override // com.zepto.id5.a
                        public final void onErrorResponse(bu7 bu7Var) {
                            vt.m.h(vtVar2, list2, bu7Var);
                        }
                    });
                }
            } catch (Exception e) {
                nn3 nn3Var2 = nn3.a;
                String TAG2 = this.f.b;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                nn3.c(nn3Var2, TAG2, e.toString(), null, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    public vt(pt view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.a = view;
        this.b = vt.class.getSimpleName();
    }

    public static final void B(vt this$0, zk2 zk2Var) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (zk2Var != null) {
            nn3 nn3Var = nn3.a;
            String TAG = this$0.b;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            nn3Var.f(TAG, Intrinsics.stringPlus("isSSLPinningIdentify", zk2Var.getStatus()));
        }
    }

    public static final void C(vt this$0, bu7 bu7Var) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bu7Var == null) {
            nn3 nn3Var = nn3.a;
            String TAG = this$0.b;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            nn3Var.f(TAG, "error is null");
            return;
        }
        nn3 nn3Var2 = nn3.a;
        String TAG2 = this$0.b;
        Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
        nn3Var2.f(TAG2, Intrinsics.stringPlus("isSSLPinningIdentify error :- ", bu7Var));
        if (StringsKt__StringsKt.contains$default((CharSequence) bu7Var.toString(), (CharSequence) "checkServerTrusted None of the TrustManagers trust this certificate chain", false, 2, (Object) null)) {
            z34.a.s(jt.c.C(), Intrinsics.stringPlus("NewApi", bu7Var));
        }
        if (StringsKt__StringsKt.contains$default((CharSequence) bu7Var.toString(), (CharSequence) "com.android.volley.TimeoutError", false, 2, (Object) null)) {
            f80.d(qj2.c, null, null, this$0.new k(null), 3, null);
        }
    }

    public static /* synthetic */ void G(vt vtVar, List list, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        vtVar.F(list, z);
    }

    public static final void w(os4 os4Var) {
        if (os4Var == null || os4Var.getSafetyNetResp() == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject(os4Var.getSafetyNetResp());
        if (jSONObject.isNull("deviceRecognitionVerdict")) {
            if (!jSONObject.isNull("deviceRecognitionVerdict") || jSONObject.isNull("timestampMillis")) {
                return;
            }
            nn3.a.f("doPlayIntegrity", "all 3rd params are empty");
            ScanCore.a.a0(null, os4Var.getSafetyNetResp());
            return;
        }
        String string = jSONObject.get("deviceRecognitionVerdict").toString();
        nn3.a.f("doPlayIntegrity", Intrinsics.stringPlus("", string));
        s06 s06VarA = s06.m.a();
        if (s06VarA != null) {
            s06VarA.K(string);
        }
        ScanCore.b0(ScanCore.a, string, null, 2, null);
    }

    public static final void x(vt this$0, String integrityToken, bu7 bu7Var) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(integrityToken, "$integrityToken");
        int iA = dq.a.a(bu7Var);
        if (iA == 401) {
            if (ScanUtils.a.v0()) {
                return;
            }
            z34.a.l(iA, this$0.new e(integrityToken));
        } else {
            nn3 nn3Var = nn3.a;
            String TAG = this$0.b;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            nn3.c(nn3Var, TAG, bu7Var.toString(), null, 4, null);
        }
    }

    public final pt A() {
        return this.a;
    }

    public final void D(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if5 if5Var = (if5) it.next();
            eu7.a aVar = eu7.d;
            eu7 eu7VarA = aVar.a();
            Intrinsics.checkNotNull(eu7VarA);
            if5 if5VarH = eu7VarA.h(if5Var);
            if5VarH.setPostStatus("Y");
            aVar.d(if5VarH);
        }
    }

    public final void E(js0 js0Var, ss1 ss1Var) {
        String rootStatus;
        zi1 deviceDetails = js0Var.getDeviceDetails();
        Intrinsics.checkNotNull(deviceDetails);
        String rootStatus2 = deviceDetails.getRootStatus();
        NativeInteractor nativeInteractor = NativeInteractor.a;
        if (Intrinsics.areEqual(rootStatus2, nativeInteractor.v1()) && (rootStatus = ss1Var.getRootStatus()) != null && rootStatus.length() != 0 && !Intrinsics.areEqual(ss1Var.getRootStatus(), nativeInteractor.v1())) {
            nn3 nn3Var = nn3.a;
            String TAG = this.b;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            nn3Var.f(TAG, "DoAffirmation =>>>>> 1:Boot Verify Called");
            ScanCore scanCore = ScanCore.a;
            String rootStatus3 = ss1Var.getRootStatus();
            Intrinsics.checkNotNull(rootStatus3);
            scanCore.A1(rootStatus3);
        }
        if (Intrinsics.areEqual(ss1Var.getIsblacklisting(), "Y")) {
            nn3 nn3Var2 = nn3.a;
            String TAG2 = this.b;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            nn3Var2.f(TAG2, "DoAffirmation =>>>>> 1:Boot Verify Called");
            ScanCore scanCore2 = ScanCore.a;
            String isblacklisting = ss1Var.getIsblacklisting();
            Intrinsics.checkNotNull(isblacklisting);
            scanCore2.A1(isblacklisting);
            try {
                s06 s06VarA = s06.m.a();
                Intrinsics.checkNotNull(s06VarA);
                if (s06VarA.q()) {
                    return;
                }
                String str = scanCore2.C0() + '|' + scanCore2.s0();
                if (str.length() > 0) {
                    t(str);
                }
            } catch (Exception e2) {
                nn3 nn3Var3 = nn3.a;
                String TAG3 = this.b;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                nn3.c(nn3Var3, TAG3, e2.toString(), null, 4, null);
            }
        }
    }

    public final void F(List dataHaveToSend, boolean z) {
        Intrinsics.checkNotNullParameter(dataHaveToSend, "dataHaveToSend");
        f80.d(qj2.c, null, null, new l(dataHaveToSend, this, z, null), 3, null);
    }

    public final void H(List list) {
        f80.d(qj2.c, null, null, new m(list, this, null), 3, null);
    }

    @Override // com.zepto.nt
    public void a() {
        f80.d(qj2.c, null, null, new i(null), 3, null);
    }

    @Override // com.zepto.nt
    public void b(String publicKey) {
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        y(publicKey, false);
    }

    @Override // com.zepto.nt
    public void c() {
        f80.d(qj2.c, null, null, new f(null), 3, null);
    }

    @Override // com.zepto.nt
    public void d(final String integrityToken) {
        Intrinsics.checkNotNullParameter(integrityToken, "integrityToken");
        try {
            js0 js0Var = new js0();
            ns4 ns4Var = new ns4();
            ScanCore scanCore = ScanCore.a;
            jt.a aVar = jt.c;
            ns4Var.setPayLoad(integrityToken + "||" + ((Object) scanCore.o1(aVar.C(), "ap_integrity_cred.json")));
            zy zyVarJ = aVar.j();
            Integer numValueOf = null;
            ns4Var.setAttestationstate(String.valueOf(zyVarJ == null ? null : zyVarJ.getAttestationResInfo()));
            fj1 fj1VarB = fj1.j.b();
            Intrinsics.checkNotNull(fj1VarB);
            js0Var.setDeviceDetails(fj1VarB.h(false));
            js0Var.setClientInfoHandshake(aVar.p());
            js0Var.setSafetyNetDTO(ns4Var);
            qq0 qq0VarP = aVar.p();
            if (qq0VarP != null) {
                numValueOf = Integer.valueOf(qq0VarP.getChannelId());
            }
            Intrinsics.checkNotNull(numValueOf);
            js0Var.setChannelId(numValueOf.intValue());
            ea0.a.h(js0Var, new id5.b() { // from class: com.zepto.tt
                @Override // com.zepto.id5.b
                public final void onResponse(Object obj) {
                    vt.w((os4) obj);
                }
            }, new id5.a() { // from class: com.zepto.ut
                @Override // com.zepto.id5.a
                public final void onErrorResponse(bu7 bu7Var) {
                    vt.x(this.a, integrityToken, bu7Var);
                }
            });
        } catch (Exception e2) {
            nn3 nn3Var = nn3.a;
            String TAG = this.b;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            nn3Var.b(TAG, Intrinsics.stringPlus("callPlayIntegrity API: Error: ===>:: ", e2), e2);
        }
    }

    @Override // com.zepto.nt
    public void e(List dataHaveToSend, boolean z) {
        Intrinsics.checkNotNullParameter(dataHaveToSend, "dataHaveToSend");
        F(dataHaveToSend, z);
    }

    @Override // com.zepto.nt
    public void f() {
        f80.d(qj2.c, null, null, new b(null), 3, null);
    }

    @Override // com.zepto.nt
    public void g() {
        try {
            ea0.a.l(new id5.b() { // from class: com.zepto.rt
                @Override // com.zepto.id5.b
                public final void onResponse(Object obj) {
                    vt.B(this.a, (zk2) obj);
                }
            }, new id5.a() { // from class: com.zepto.st
                @Override // com.zepto.id5.a
                public final void onErrorResponse(bu7 bu7Var) {
                    vt.C(this.a, bu7Var);
                }
            });
        } catch (Exception e2) {
            nn3 nn3Var = nn3.a;
            String TAG = this.b;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            nn3Var.b(TAG, Intrinsics.stringPlus("isSSLPinningIdentify: =======>:: Error: ", e2), e2);
        }
    }

    @Override // com.zepto.nt
    public void h(X509Certificate[] x509CertificateArr, Runnable runnable) {
        f80.d(qj2.c, null, null, new j(runnable, x509CertificateArr, null), 3, null);
    }

    @Override // com.zepto.nt
    public synchronized void i() {
        f80.d(qj2.c, null, null, new g(null), 3, null);
    }

    public void t(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        f80.d(qj2.c, null, null, new c(input, this, null), 3, null);
    }

    public void u(String publicKey) {
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        f80.d(qj2.c, null, null, new d(publicKey, null), 3, null);
    }

    public final void v(ss1 ss1Var) {
        try {
            if (ss1Var.getCloudProjectNum().length() > 0) {
                jt.c.M0(ss1Var.getCloudProjectNum());
                if (ss1Var.getDeviceRecognitionVerdict() == null) {
                    s06 s06VarA = s06.m.a();
                    if (s06VarA == null) {
                        return;
                    }
                    s06VarA.K("");
                    return;
                }
                s06.a aVar = s06.m;
                s06 s06VarA2 = aVar.a();
                String strongIntegrity = null;
                String strM = s06VarA2 == null ? null : s06VarA2.m();
                if ((strM == null || strM.length() == 0) && ss1Var.getDeviceRecognitionVerdict() != null) {
                    ij1 deviceRecognitionVerdict = ss1Var.getDeviceRecognitionVerdict();
                    ArrayList arrayList = new ArrayList();
                    String basicIntegrity = deviceRecognitionVerdict == null ? null : deviceRecognitionVerdict.getBasicIntegrity();
                    if (basicIntegrity != null && basicIntegrity.length() != 0) {
                        arrayList.add(StringsKt__StringsKt.trim((CharSequence) basicIntegrity).toString());
                    }
                    String deviceIntegrity = deviceRecognitionVerdict == null ? null : deviceRecognitionVerdict.getDeviceIntegrity();
                    if (deviceIntegrity != null && deviceIntegrity.length() != 0) {
                        arrayList.add(StringsKt__StringsKt.trim((CharSequence) deviceIntegrity).toString());
                    }
                    if (deviceRecognitionVerdict != null) {
                        strongIntegrity = deviceRecognitionVerdict.getStrongIntegrity();
                    }
                    if (strongIntegrity != null && strongIntegrity.length() != 0) {
                        arrayList.add(StringsKt__StringsKt.trim((CharSequence) strongIntegrity).toString());
                    }
                    s06 s06VarA3 = aVar.a();
                    if (s06VarA3 == null) {
                        return;
                    }
                    s06VarA3.K(arrayList.toString());
                }
            }
        } catch (Exception e2) {
            nn3 nn3Var = nn3.a;
            String TAG = this.b;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            nn3Var.b(TAG, e2.toString(), e2);
        }
    }

    public void y(String publicKey, boolean z) {
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        f80.d(qj2.c, null, null, new h(publicKey, null), 3, null);
    }

    public final void z(String str) {
        try {
            ru5.a aVar = ru5.c;
            String strE = aVar.e();
            NativeInteractor nativeInteractor = NativeInteractor.a;
            nativeInteractor.s0(strE);
            String strB = aVar.b(strE, aVar.g(str));
            nativeInteractor.u0(strB);
            nn3 nn3Var = nn3.a;
            String TAG = this.b;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            nn3Var.f(TAG, Intrinsics.stringPlus("#### After setting encryptedAESKey: ", strB));
            if (TextUtils.isEmpty(str)) {
                u(str);
            } else {
                String TAG2 = this.b;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                nn3Var.f(TAG2, "#### generateAndEncryptKey: calling startSession");
            }
        } catch (Exception e2) {
            nn3 nn3Var2 = nn3.a;
            String TAG3 = this.b;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            nn3Var2.b(TAG3, Intrinsics.stringPlus("#### generateAndEncryptKey exception: ", e2), e2);
        }
    }
}
