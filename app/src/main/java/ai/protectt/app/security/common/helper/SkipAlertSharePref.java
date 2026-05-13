package ai.protectt.app.security.common.helper;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.zepto.d06;
import com.zepto.eg5;
import com.zepto.if5;
import com.zepto.jt;
import com.zepto.l06;
import com.zepto.s06;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SkipAlertSharePref {
    public static SkipAlertSharePref h;
    public final String a = "SkipAlertSharePref";
    public final SharedPreferences b;
    public final SharedPreferences.Editor c;
    public final SharedPreferences d;
    public final SharedPreferences.Editor e;
    public final s06 f;
    public static final a g = new a(null);
    public static final ArrayList i = new ArrayList();

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SkipAlertSharePref a() {
            return SkipAlertSharePref.h;
        }

        public final SkipAlertSharePref b() {
            if (a() == null) {
                c(new SkipAlertSharePref());
            }
            SkipAlertSharePref skipAlertSharePrefA = a();
            return skipAlertSharePrefA == null ? new SkipAlertSharePref() : skipAlertSharePrefA;
        }

        public final void c(SkipAlertSharePref skipAlertSharePref) {
            SkipAlertSharePref.h = skipAlertSharePref;
        }
    }

    public SkipAlertSharePref() {
        jt.a aVar = jt.c;
        Context contextC = aVar.C();
        eg5 eg5Var = eg5.a;
        SharedPreferences sharedPreferences = contextC.getSharedPreferences(eg5Var.l(), 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "AppProtecttInteractor.mA…xt.MODE_PRIVATE\n        )");
        this.b = sharedPreferences;
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        Intrinsics.checkNotNullExpressionValue(editorEdit, "skipAlertSharePref.edit()");
        this.c = editorEdit;
        SharedPreferences sharedPreferences2 = aVar.C().getSharedPreferences(eg5Var.h(), 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences2, "AppProtecttInteractor.mA…xt.MODE_PRIVATE\n        )");
        this.d = sharedPreferences2;
        SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
        Intrinsics.checkNotNullExpressionValue(editorEdit2, "locationDenialSharePref.edit()");
        this.e = editorEdit2;
        this.f = s06.m.a();
    }

    public final void c() {
        this.d.edit().clear().apply();
    }

    public final void d() {
        this.b.edit().clear().apply();
    }

    public final String e(String str) {
        return d06.b.a().c(str, l06.e.a().c());
    }

    public final String f(String str) {
        return d06.b.a().d(str, l06.e.a().c());
    }

    public final List g() {
        ArrayList arrayList = new ArrayList();
        try {
            Map<String, ?> all = this.b.getAll();
            Intrinsics.checkNotNullExpressionValue(all, "skipAlertSharePref.all");
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                Type type = new TypeToken<List<if5>>() { // from class: ai.protectt.app.security.common.helper.SkipAlertSharePref$getSkippAllVulnerability$listType$1
                }.getType();
                Object objFromJson = new Gson().fromJson(e(String.valueOf(entry.getValue())), type);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "Gson().fromJson(decData, listType)");
                arrayList.addAll((Collection) objFromJson);
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    public final void h(ArrayList response) {
        Intrinsics.checkNotNullParameter(response, "response");
        s06 s06Var = this.f;
        Intrinsics.checkNotNull(s06Var);
        String strF = f(s06Var.x());
        String json = new Gson().toJson(response);
        Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(response)");
        this.c.putString(strF, f(json));
        this.c.apply();
    }
}
