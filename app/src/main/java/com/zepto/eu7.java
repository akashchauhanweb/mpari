package com.zepto;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class eu7 {
    public static final a d = new a(null);
    public static final String e = "VulnerabilitySharedPreferenceHelper";
    public static eu7 f;
    public SharedPreferences a;
    public SharedPreferences.Editor b;
    public final d06 c;

    public static final class a {

        /* JADX INFO: renamed from: com.zepto.eu7$a$a, reason: collision with other inner class name */
        public static final class C0079a extends SuspendLambda implements Function2 {
            public int c;
            public final /* synthetic */ if5 e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0079a(if5 if5Var, Continuation continuation) {
                super(2, continuation);
                this.e = if5Var;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(yz0 yz0Var, Continuation continuation) {
                return ((C0079a) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0079a(this.e, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                try {
                    eu7 eu7VarA = eu7.d.a();
                    Intrinsics.checkNotNull(eu7VarA);
                    eu7VarA.j(this.e.getRuleid() + "||" + ((Object) this.e.getMobileSessionID()), this.e);
                } catch (Exception e) {
                    nn3.c(nn3.a, eu7.e, e.toString(), null, 4, null);
                }
                return Unit.INSTANCE;
            }
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final eu7 a() {
            return eu7.f;
        }

        public final eu7 b(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (a() == null) {
                c(new eu7(context));
            }
            eu7 eu7VarA = a();
            Intrinsics.checkNotNull(eu7VarA);
            return eu7VarA;
        }

        public final void c(eu7 eu7Var) {
            eu7.f = eu7Var;
        }

        public final void d(if5 ruleItem) {
            Intrinsics.checkNotNullParameter(ruleItem, "ruleItem");
            f80.d(qj2.c, null, null, new C0079a(ruleItem, null), 3, null);
        }
    }

    public eu7(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("vulnerabilityPref", 0);
        this.a = sharedPreferences;
        this.b = sharedPreferences.edit();
        this.c = d06.b.a();
    }

    public final String e(String str) {
        return this.c.c(str, l06.e.a().c());
    }

    public final String f(String str) {
        return this.c.d(str, l06.e.a().c());
    }

    public final List g() {
        ArrayList arrayList = new ArrayList();
        try {
            SharedPreferences sharedPreferences = this.a;
            Intrinsics.checkNotNull(sharedPreferences);
            Map<String, ?> all = sharedPreferences.getAll();
            Intrinsics.checkNotNull(all);
            for (Object obj : all.values()) {
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                try {
                    arrayList.add((if5) new Gson().fromJson(e((String) obj), if5.class));
                } catch (Exception e2) {
                    nn3.c(nn3.a, e, e2.toString(), null, 4, null);
                }
            }
        } catch (Exception e3) {
            nn3.c(nn3.a, e, e3.toString(), null, 4, null);
        }
        return CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
    }

    public final if5 h(if5 rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        if5 if5Var = new if5();
        if5Var.setRuleid(rule.getRuleid());
        if5Var.setRuleaction(rule.getRuleaction());
        if5Var.setMdyDate(rule.getMdyDate());
        if5Var.setPostStatus(rule.getPostStatus());
        if5Var.setResult(rule.getResult());
        if5Var.setMobileSessionID(rule.getMobileSessionID());
        if5Var.setThreatDetectedFlag(rule.getThreatDetectedFlag());
        if5Var.setThreatDateAndTime(rule.getThreatDateAndTime());
        return if5Var;
    }

    public final void i(if5 rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        try {
            this.b.remove(rule.getRuleid() + "||" + ((Object) rule.getMobileSessionID()));
            this.b.apply();
        } catch (Exception e2) {
            nn3.c(nn3.a, e, e2.toString(), null, 4, null);
        }
    }

    public final void j(String str, if5 if5Var) {
        try {
            String ruleAsJsonStr = new Gson().toJson(if5Var);
            Intrinsics.checkNotNullExpressionValue(ruleAsJsonStr, "ruleAsJsonStr");
            k(str, ruleAsJsonStr);
        } catch (Exception e2) {
            nn3.c(nn3.a, e, e2.toString(), null, 4, null);
        }
    }

    public final void k(String str, String str2) {
        try {
            String strF = f(str2);
            SharedPreferences.Editor editor = this.b;
            Intrinsics.checkNotNull(editor);
            editor.putString(str, strF);
            SharedPreferences.Editor editor2 = this.b;
            Intrinsics.checkNotNull(editor2);
            editor2.apply();
        } catch (Exception e2) {
            nn3.c(nn3.a, e, e2.toString(), null, 4, null);
        }
    }
}
