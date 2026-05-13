package com.zepto;

import android.content.Context;
import android.content.SharedPreferences;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class wl5 {
    public static final a e = new a(null);
    public static final String f = "Sarthi_Pagging";
    public static final String g = VContant.SERVICE_NAME;
    public static final String h = "Service_Code";
    public static final String i = "State_Code";
    public static final String j = "idpValue";
    public static final String k = "saveCatValue";
    public static final String l = "rtoValue";
    public static final String m = "eKYCId";
    public static final String n = "eKYCOpted";
    public static final String o = "eKYCGender";
    public static final String p = "eKYCapplicantPhoto";
    public static final String q = "mobileNumber";
    public static final String r = "mobileNumberFlow";
    public SharedPreferences a;
    public SharedPreferences.Editor b;
    public Context c;
    public int d;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public wl5(Context context) {
        if (context != null) {
            w(context);
        }
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(f, this.d);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
            y(sharedPreferences);
        }
        SharedPreferences.Editor editorEdit = l().edit();
        Intrinsics.checkNotNullExpressionValue(editorEdit, "edit(...)");
        x(editorEdit);
    }

    public final String a() {
        String string = l().getString(k, "0");
        if (string == null) {
            string = null;
        }
        Intrinsics.checkNotNull(string);
        return string;
    }

    public final String b() {
        String string = l().getString(h, "0");
        if (string == null) {
            string = null;
        }
        Intrinsics.checkNotNull(string);
        return string;
    }

    public final SharedPreferences.Editor c() {
        SharedPreferences.Editor editor = this.b;
        if (editor != null) {
            return editor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("editor");
        return null;
    }

    public final String d() {
        String string = l().getString(j, "0");
        if (string == null) {
            string = null;
        }
        Intrinsics.checkNotNull(string);
        return string;
    }

    public final String e() {
        String string = l().getString(o, "NA");
        if (string == null) {
            string = null;
        }
        Intrinsics.checkNotNull(string);
        return string;
    }

    public final String f() {
        String string = l().getString(m, "NA");
        if (string == null) {
            string = null;
        }
        Intrinsics.checkNotNull(string);
        return string;
    }

    public final String g() {
        String string = l().getString(n, "N");
        if (string == null) {
            string = null;
        }
        Intrinsics.checkNotNull(string);
        return string;
    }

    public final String h() {
        String string = l().getString(p, "0");
        if (string == null) {
            string = null;
        }
        Intrinsics.checkNotNull(string);
        return string;
    }

    public final String i() {
        String string = l().getString(r, "");
        if (string == null) {
            string = null;
        }
        Intrinsics.checkNotNull(string);
        return string;
    }

    public final String j() {
        String string = l().getString(q, "");
        if (string == null) {
            string = null;
        }
        Intrinsics.checkNotNull(string);
        return string;
    }

    public final String k() {
        String string = l().getString(g, "");
        if (string == null) {
            string = null;
        }
        Intrinsics.checkNotNull(string);
        return string;
    }

    public final SharedPreferences l() {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pref");
        return null;
    }

    public final String m() {
        return String.valueOf(l().getString(l, "NA"));
    }

    public final String n() {
        String string = l().getString(i, "");
        if (string == null) {
            string = null;
        }
        Intrinsics.checkNotNull(string);
        return string;
    }

    public final void o(String save_cat_value) {
        Intrinsics.checkNotNullParameter(save_cat_value, "save_cat_value");
        c().putString(k, save_cat_value);
        c().commit();
    }

    public final void p(String idp_Value) {
        Intrinsics.checkNotNullParameter(idp_Value, "idp_Value");
        c().putString(j, idp_Value);
        c().commit();
    }

    public final void q(String id, String opted, String gender, String photo) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(opted, "opted");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(photo, "photo");
        c().putString(m, id);
        c().putString(n, opted);
        c().putString(o, gender);
        c().putString(p, photo);
        c().commit();
    }

    public final void r(String mob_flow) {
        Intrinsics.checkNotNullParameter(mob_flow, "mob_flow");
        c().putString(r, mob_flow);
        c().commit();
    }

    public final void s(String mobile_number) {
        Intrinsics.checkNotNullParameter(mobile_number, "mobile_number");
        c().putString(q, mobile_number);
        c().commit();
    }

    public final void t(String name_service, String code_service) {
        Intrinsics.checkNotNullParameter(name_service, "name_service");
        Intrinsics.checkNotNullParameter(code_service, "code_service");
        c().putString(g, name_service);
        c().putString(h, code_service);
        c().commit();
    }

    public final void u(String rto_value) {
        Intrinsics.checkNotNullParameter(rto_value, "rto_value");
        c().putString(l, rto_value);
        c().commit();
    }

    public final void v(String state_code) {
        Intrinsics.checkNotNullParameter(state_code, "state_code");
        c().putString(i, state_code);
        c().commit();
    }

    public final void w(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.c = context;
    }

    public final void x(SharedPreferences.Editor editor) {
        Intrinsics.checkNotNullParameter(editor, "<set-?>");
        this.b = editor;
    }

    public final void y(SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<set-?>");
        this.a = sharedPreferences;
    }
}
