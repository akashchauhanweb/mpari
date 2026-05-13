package ai.protectt.app.security.common.helper;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.zepto.d06;
import com.zepto.f80;
import com.zepto.if5;
import com.zepto.l06;
import com.zepto.nn3;
import com.zepto.qj2;
import com.zepto.qk1;
import com.zepto.yz0;
import java.util.HashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class RuleConfigSharedPreferenceHelper {
    public static final a f = new a(null);
    public static RuleConfigSharedPreferenceHelper g;
    public Context a;
    public SharedPreferences b;
    public SharedPreferences.Editor c;
    public final d06 d;
    public final String e;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RuleConfigSharedPreferenceHelper a() {
            return RuleConfigSharedPreferenceHelper.g;
        }

        public final RuleConfigSharedPreferenceHelper b(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (a() == null) {
                c(new RuleConfigSharedPreferenceHelper(context));
            }
            RuleConfigSharedPreferenceHelper ruleConfigSharedPreferenceHelperA = a();
            Intrinsics.checkNotNull(ruleConfigSharedPreferenceHelperA);
            return ruleConfigSharedPreferenceHelperA;
        }

        public final void c(RuleConfigSharedPreferenceHelper ruleConfigSharedPreferenceHelper) {
            RuleConfigSharedPreferenceHelper.g = ruleConfigSharedPreferenceHelper;
        }
    }

    public static final class b extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ HashMap e;
        public final /* synthetic */ RuleConfigSharedPreferenceHelper f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HashMap map, RuleConfigSharedPreferenceHelper ruleConfigSharedPreferenceHelper, Continuation continuation) {
            super(2, continuation);
            this.e = map;
            this.f = ruleConfigSharedPreferenceHelper;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((b) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.e, this.f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                String json = new Gson().toJson(this.e);
                RuleConfigSharedPreferenceHelper ruleConfigSharedPreferenceHelper = this.f;
                Intrinsics.checkNotNullExpressionValue(json, "json");
                ruleConfigSharedPreferenceHelper.j(json);
            } catch (Exception e) {
                nn3.c(nn3.a, this.f.e, Intrinsics.stringPlus("", e), null, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    public RuleConfigSharedPreferenceHelper(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("ruleConfigPref", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…ontext.MODE_PRIVATE\n    )");
        this.b = sharedPreferences;
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        Intrinsics.checkNotNullExpressionValue(editorEdit, "ruleConfigSharedPreferences.edit()");
        this.c = editorEdit;
        this.d = d06.b.a();
        this.e = "RuleConfigSharedPreferenceHelper";
    }

    public final String e(String str) {
        return this.d.c(str, l06.e.a().c());
    }

    public final String f(String str) {
        return this.d.d(str, l06.e.a().c());
    }

    public final Object g(String str) {
        try {
            String string = this.b.getString("ruleConfigResponse", str);
            if (string != null && string.length() != 0 && !Intrinsics.areEqual(string, str)) {
                String strE = e(string);
                return strE.length() == 0 ? str : Intrinsics.areEqual(strE, str) ? str : strE;
            }
            return str;
        } catch (Exception e) {
            nn3.c(nn3.a, this.e, e.toString(), null, 4, null);
            return str;
        }
    }

    public final HashMap h() {
        HashMap map = new HashMap();
        try {
            String string = g("").toString();
            return string.length() == 0 ? map : (HashMap) new Gson().fromJson(string, new TypeToken<HashMap<Integer, if5>>() { // from class: ai.protectt.app.security.common.helper.RuleConfigSharedPreferenceHelper$getRuleConfigResponseDetails$1
            }.getType());
        } catch (Exception e) {
            nn3.c(nn3.a, this.e, Intrinsics.stringPlus("", e), null, 4, null);
            return map;
        }
    }

    public final void i(HashMap response) {
        Intrinsics.checkNotNullParameter(response, "response");
        f80.d(qj2.c, qk1.a(), null, new b(response, this, null), 2, null);
    }

    public final void j(String str) {
        try {
            this.c.putString("ruleConfigResponse", f(str));
            this.c.apply();
        } catch (Exception e) {
            nn3.c(nn3.a, this.e, e.toString(), null, 4, null);
        }
    }
}
