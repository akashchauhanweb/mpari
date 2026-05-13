package ai.protectt.app.security.common.helper;

import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.zepto.d06;
import com.zepto.f80;
import com.zepto.jt;
import com.zepto.nn3;
import com.zepto.qj2;
import com.zepto.qk1;
import com.zepto.ru5;
import com.zepto.y60;
import com.zepto.yz0;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AppBlackListingSharedPreferenceHelper {
    public static final a f = new a(null);
    public static AppBlackListingSharedPreferenceHelper g;
    public SharedPreferences a;
    public SharedPreferences.Editor b;
    public final d06 c;
    public String d;
    public final String e;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AppBlackListingSharedPreferenceHelper a() {
            if (AppBlackListingSharedPreferenceHelper.g == null) {
                AppBlackListingSharedPreferenceHelper.g = new AppBlackListingSharedPreferenceHelper();
            }
            AppBlackListingSharedPreferenceHelper appBlackListingSharedPreferenceHelper = AppBlackListingSharedPreferenceHelper.g;
            Intrinsics.checkNotNull(appBlackListingSharedPreferenceHelper);
            return appBlackListingSharedPreferenceHelper;
        }
    }

    public static final class b extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ y60 e;
        public final /* synthetic */ AppBlackListingSharedPreferenceHelper f;
        public final /* synthetic */ String g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(y60 y60Var, AppBlackListingSharedPreferenceHelper appBlackListingSharedPreferenceHelper, String str, Continuation continuation) {
            super(2, continuation);
            this.e = y60Var;
            this.f = appBlackListingSharedPreferenceHelper;
            this.g = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((b) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.e, this.f, this.g, continuation);
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
                Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(appListEntity)");
                AppBlackListingSharedPreferenceHelper appBlackListingSharedPreferenceHelper = this.f;
                appBlackListingSharedPreferenceHelper.o(appBlackListingSharedPreferenceHelper.i(this.g), json);
            } catch (Exception e) {
                nn3.c(nn3.a, this.f.e, e.toString(), null, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class c extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ String f;
        public final /* synthetic */ String g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, Continuation continuation) {
            super(2, continuation);
            this.f = str;
            this.g = str2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((c) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return AppBlackListingSharedPreferenceHelper.this.new c(this.f, this.g, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                AppBlackListingSharedPreferenceHelper.this.b.putString(this.f, AppBlackListingSharedPreferenceHelper.this.i(this.g));
                AppBlackListingSharedPreferenceHelper.this.b.apply();
            } catch (Exception e) {
                nn3.c(nn3.a, AppBlackListingSharedPreferenceHelper.this.e, e.toString(), null, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    public AppBlackListingSharedPreferenceHelper() {
        SharedPreferences sharedPreferences = jt.c.C().getSharedPreferences("applicationInfoPref", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "AppProtecttInteractor.mA…xt.MODE_PRIVATE\n        )");
        this.a = sharedPreferences;
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        Intrinsics.checkNotNullExpressionValue(editorEdit, "appBlackListingSharedPreferenceHelper.edit()");
        this.b = editorEdit;
        this.c = d06.b.a();
        this.d = "";
        this.e = "AppBlackListingSharedPreferenceHelper";
    }

    public final void g() {
        this.a.edit().clear().apply();
    }

    public final String h(String str) {
        return this.c.c(str, j());
    }

    public final String i(String str) {
        return this.c.d(str, j());
    }

    public final String j() {
        try {
            if (this.d.length() == 0) {
                this.d = new ru5().g();
            }
        } catch (Exception e) {
            nn3.c(nn3.a, this.e, e.toString(), null, 4, null);
        }
        return this.d;
    }

    public final List k() {
        ArrayList arrayList = new ArrayList();
        try {
            Set<String> setKeySet = this.a.getAll().keySet();
            if (!setKeySet.isEmpty()) {
                for (String app : setKeySet) {
                    Intrinsics.checkNotNullExpressionValue(app, "app");
                    arrayList.add(h(app));
                }
            }
        } catch (Exception e) {
            nn3.a.f(this.e, Intrinsics.stringPlus("", e));
        }
        return arrayList;
    }

    public final y60 l(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            String strValueOf = String.valueOf(m(i(key), ""));
            if (strValueOf.length() == 0) {
                return null;
            }
            return (y60) new Gson().fromJson(strValueOf, new TypeToken<y60>() { // from class: ai.protectt.app.security.common.helper.AppBlackListingSharedPreferenceHelper$getAppInfo$1
            }.getType());
        } catch (Exception e) {
            nn3.c(nn3.a, this.e, e.toString(), null, 4, null);
            return null;
        }
    }

    public final String m(String str, String str2) {
        try {
            String string = this.a.getString(str, str2);
            if (string != null && string.length() != 0 && !Intrinsics.areEqual(string, str2)) {
                String strH = h(string);
                return strH.length() == 0 ? str2 : Intrinsics.areEqual(strH, str2) ? str2 : strH;
            }
            return str2;
        } catch (Exception e) {
            nn3.c(nn3.a, this.e, e.toString(), null, 4, null);
            return null;
        }
    }

    public final void n(String key, y60 y60Var) {
        Intrinsics.checkNotNullParameter(key, "key");
        f80.d(qj2.c, qk1.a(), null, new b(y60Var, this, key, null), 2, null);
    }

    public final void o(String str, String str2) {
        f80.d(qj2.c, qk1.a(), null, new c(str, str2, null), 2, null);
    }
}
