package com.zepto;

import ai.protectt.app.security.common.helper.NativeInteractor;
import ai.protectt.app.security.common.helper.RuleConfigSharedPreferenceHelper;
import ai.protectt.app.security.main.scan.ScanUtils;
import com.zepto.eu7;
import com.zepto.jt;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class pd1 {
    public static final a c = new a(null);
    public static pd1 d;
    public final String a = "DataHelper";
    public final l06 b = l06.e.a();

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final pd1 a() {
            if (pd1.d == null) {
                pd1.d = new pd1();
            }
            pd1 pd1Var = pd1.d;
            Intrinsics.checkNotNull(pd1Var);
            return pd1Var;
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
            return pd1.this.new b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                for (String str : CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"AdaptiveDB", "RuleConfigDB_v2", "RuleConfigDB", "VulnerabilityFoundDB_v2", "VulnerabilityFoundDB", "AppListDB_v2", "AppListDB", "AddParamDB_v2", "AddParamDB", "SkipRuleDB"})) {
                    jt.a aVar = jt.c;
                    if (aVar.C().getDatabasePath(str).exists()) {
                        aVar.C().deleteDatabase(str);
                    }
                }
            } catch (Exception e) {
                nn3.c(nn3.a, pd1.this.a, Intrinsics.stringPlus("", e), null, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class c extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ if5 e;
        public final /* synthetic */ pd1 f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(if5 if5Var, pd1 pd1Var, Continuation continuation) {
            super(2, continuation);
            this.e = if5Var;
            this.f = pd1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((c) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(this.e, this.f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                boolean z = this.e.getRuleid() >= 1000 && Intrinsics.areEqual(this.e.getRuleaction(), eg5.a.m());
                jt.a aVar = jt.c;
                if (!aVar.l().contains(Boxing.boxInt(this.e.getRuleid())) && !z) {
                    new md5(Boxing.boxInt(this.e.getRuleid()), this.e.getTitle(), ScanUtils.a.S(aVar.C(), NativeInteractor.a.u1()), this.e.getMsg(), this.e.getRuleaction());
                    this.f.g();
                }
            } catch (Exception e) {
                nn3.a.f(this.f.a, String.valueOf(e.getMessage()));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class d extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ if5 e;
        public final /* synthetic */ pd1 f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(if5 if5Var, pd1 pd1Var, Continuation continuation) {
            super(2, continuation);
            this.e = if5Var;
            this.f = pd1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((d) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new d(this.e, this.f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                if (!jt.c.B().contains(Boxing.boxInt(this.e.getRuleid()))) {
                    eu7.a aVar = eu7.d;
                    eu7 eu7VarA = aVar.a();
                    Intrinsics.checkNotNull(eu7VarA);
                    aVar.d(eu7VarA.h(this.e));
                }
                this.f.h(this.e);
            } catch (Exception e) {
                nn3.a.b(this.f.a, Intrinsics.stringPlus(">>>>>>>>>>>> saveVulnerabilityDetectedData Error: ", e), e);
            }
            return Unit.INSTANCE;
        }
    }

    public final void e() {
        f();
    }

    public final void f() {
        f80.d(qj2.c, qk1.a(), null, new b(null), 2, null);
    }

    public final lt g() {
        return null;
    }

    public final void h(if5 if5Var) {
        f80.d(qj2.c, null, null, new c(if5Var, this, null), 3, null);
    }

    public final List i(List ruleList) {
        Intrinsics.checkNotNullParameter(ruleList, "ruleList");
        RuleConfigSharedPreferenceHelper ruleConfigSharedPreferenceHelperA = RuleConfigSharedPreferenceHelper.f.a();
        Intrinsics.checkNotNull(ruleConfigSharedPreferenceHelperA);
        HashMap mapH = ruleConfigSharedPreferenceHelperA.h();
        Intrinsics.checkNotNull(mapH);
        try {
            Iterator it = ruleList.iterator();
            while (it.hasNext()) {
                if5 if5Var = (if5) it.next();
                if (if5Var.isDeleted() == null) {
                    mapH.put(Integer.valueOf(if5Var.getRuleid()), if5Var);
                } else {
                    String strIsDeleted = if5Var.isDeleted();
                    Intrinsics.checkNotNull(strIsDeleted);
                    if (StringsKt__StringsKt.contains$default((CharSequence) strIsDeleted, (CharSequence) "false", false, 2, (Object) null)) {
                        mapH.put(Integer.valueOf(if5Var.getRuleid()), if5Var);
                    } else if (mapH.containsKey(Integer.valueOf(if5Var.getRuleid()))) {
                        mapH.remove(Integer.valueOf(if5Var.getRuleid()));
                    }
                }
            }
        } catch (Exception e) {
            nn3.a.i(e);
        }
        RuleConfigSharedPreferenceHelper ruleConfigSharedPreferenceHelperA2 = RuleConfigSharedPreferenceHelper.f.a();
        Intrinsics.checkNotNull(ruleConfigSharedPreferenceHelperA2);
        ruleConfigSharedPreferenceHelperA2.i(mapH);
        Collection collectionValues = mapH.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "hashMapOfSavedRuleConfig.values");
        return CollectionsKt___CollectionsKt.toMutableList(collectionValues);
    }

    public final synchronized void j(if5 data) {
        Intrinsics.checkNotNullParameter(data, "data");
        f80.d(qj2.c, null, null, new d(data, this, null), 3, null);
    }
}
