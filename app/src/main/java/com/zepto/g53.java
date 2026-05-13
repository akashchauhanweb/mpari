package com.zepto;

import ai.protectt.app.security.common.helper.NativeInteractor;
import ai.protectt.app.security.main.scan.ScanCore;
import ai.protectt.app.security.main.scan.ScanUtils;
import android.content.Context;
import android.content.pm.Signature;
import com.zepto.jt;
import com.zepto.ru5;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class g53 {
    public static final g53 a = new g53();

    public static final class a extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ jf5 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(jf5 jf5Var, Continuation continuation) {
            super(2, continuation);
            this.e = jf5Var;
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
                pd1 pd1VarA = pd1.c.a();
                List<if5> ruleList = this.e.getRuleList();
                Intrinsics.checkNotNull(ruleList);
                pd1VarA.i(ruleList);
            } catch (Exception e) {
                nn3.a.b("JsonFileLoader", Intrinsics.stringPlus("Exception :: ", e.getMessage()), e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class b extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ jf5 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(jf5 jf5Var, Continuation continuation) {
            super(2, continuation);
            this.e = jf5Var;
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
                List<if5> ruleList = this.e.getRuleList();
                List<if5> list = ruleList;
                if (list == null || list.isEmpty()) {
                    nn3.a.f("JsonFileLoader", "feature file rule is empty");
                } else {
                    for (if5 if5Var : ruleList) {
                        if (Intrinsics.areEqual(if5Var.getDefaultValue(), "Y")) {
                            wt4 wt4VarA = wt4.b.a();
                            Intrinsics.checkNotNull(wt4VarA);
                            wt4VarA.H(if5Var, "feature - file");
                        }
                    }
                }
            } catch (Exception e) {
                nn3.a.b("JsonFileLoader", Intrinsics.stringPlus("Exception :: ", e.getMessage()), e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class c extends SuspendLambda implements Function2 {
        public int c;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((c) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                List<if5> listF = l06.e.a().f();
                if (!listF.isEmpty()) {
                    for (if5 if5Var : listF) {
                        wt4 wt4VarA = wt4.b.a();
                        Intrinsics.checkNotNull(wt4VarA);
                        wt4VarA.H(if5Var, "DB");
                    }
                }
            } catch (Exception e) {
                nn3.a.b("JsonFileLoader", Intrinsics.stringPlus("Exception :: ", e.getMessage()), e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class d extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ jf5 e;

        public static final class a extends SuspendLambda implements Function2 {
            public int c;
            public final /* synthetic */ jf5 e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(jf5 jf5Var, Continuation continuation) {
                super(2, continuation);
                this.e = jf5Var;
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
                    ru5.a aVar = ru5.c;
                    String strE = aVar.e();
                    NativeInteractor nativeInteractor = NativeInteractor.a;
                    nativeInteractor.B0(strE);
                    ni0 channelDtls = this.e.getChannelDtls();
                    Intrinsics.checkNotNull(channelDtls);
                    nativeInteractor.C0(aVar.b(strE, aVar.g(channelDtls.getPublickey())));
                } catch (Exception e) {
                    nn3.a.b("JsonFileLoader", Intrinsics.stringPlus("Exception :: ", e.getMessage()), e);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(jf5 jf5Var, Continuation continuation) {
            super(2, continuation);
            this.e = jf5Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((d) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new d(this.e, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0066 A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:5:0x000a, B:6:0x0019, B:8:0x0020, B:14:0x0034, B:16:0x003a, B:18:0x0046, B:20:0x007b, B:21:0x008a, B:23:0x0090, B:26:0x00a0, B:29:0x00a7, B:19:0x0066), top: B:36:0x000a }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 203
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zepto.g53.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x01f3 A[Catch: IOException -> 0x004b, TryCatch #2 {IOException -> 0x004b, blocks: (B:3:0x000c, B:4:0x0040, B:6:0x0047, B:9:0x004e, B:11:0x0064, B:16:0x0072, B:18:0x008e, B:20:0x009e, B:24:0x00aa, B:26:0x00b6, B:30:0x00da, B:29:0x00d6, B:31:0x00f5, B:35:0x010f, B:39:0x0120, B:41:0x0147, B:43:0x0153, B:44:0x0156, B:46:0x018b, B:48:0x01da, B:50:0x01fa, B:52:0x0200, B:47:0x01c3, B:38:0x0116, B:34:0x00fe, B:23:0x00a6, B:49:0x01f3, B:57:0x0208, B:58:0x020b, B:12:0x0067, B:14:0x006d, B:55:0x0206), top: B:78:0x000c, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.io.InputStream r15) {
        /*
            Method dump skipped, instruction units count: 637
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.g53.a(java.io.InputStream):void");
    }

    public final void b(String str) {
        try {
            NativeInteractor nativeInteractor = NativeInteractor.a;
            jt.a aVar = jt.c;
            Context contextC = aVar.C();
            ScanCore scanCore = ScanCore.a;
            Object objP1 = nativeInteractor.p1(contextC, scanCore.T("ZS0wMzE="));
            if (objP1.toString().length() == 0) {
                nativeInteractor.o(aVar.C(), scanCore.T("ZS0wMjA="));
            } else {
                String strI1 = ScanUtils.a.i1((Signature) objP1);
                Intrinsics.checkNotNull(strI1);
                if (!StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) strI1, false, 2, (Object) null) && gw4.a.b()) {
                    nativeInteractor.n(aVar.C(), scanCore.T("ZS0wMTE="));
                }
            }
        } catch (Exception e) {
            nn3.a.b("JsonFileLoader", Intrinsics.stringPlus("Exception :: ", e.getMessage()), e);
        }
    }

    public final void c(jf5 jf5Var) {
        f80.d(qj2.c, null, null, new d(jf5Var, null), 3, null);
    }
}
