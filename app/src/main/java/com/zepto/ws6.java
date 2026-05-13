package com.zepto;

import android.content.Context;
import android.content.SharedPreferences;
import com.zepto.h22;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ws6 {
    public static final a d = new a(null);
    public static final String e = "NexGen";
    public static final String f = "citizenId";
    public static final String g = "ctzMobile";
    public static final String h = "ctzDispName";
    public static final String i = "ctzEmail";
    public static final String j = "MPIN";
    public static final String k = "LoginStaus";
    public static final String l = "blood_group";
    public static final String m = "state_code";
    public static final String n = "Token";
    public static final String o = "FireBaseToken";
    public static final String p = "CitizenToken";
    public static final String q = "ctzMpinStatus";
    public static final String r = "profile_img";
    public static final String s = "userHeight";
    public static final String t = "userWeight";
    public static final String u = "userGender";
    public static final String v = "userdob";
    public static final String w = "appversion";
    public static final String x = "echallanN";
    public SharedPreferences a;
    public SharedPreferences.Editor b;
    public Context c;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ws6(Context context) {
        if (context != null) {
            H(context);
        }
        if (context != null) {
            String strC = dq3.c(dq3.a);
            Intrinsics.checkNotNullExpressionValue(strC, "getOrCreate(...)");
            SharedPreferences sharedPreferencesB = h22.b(e, strC, context, h22.d.AES256_SIV, h22.e.AES256_GCM);
            Intrinsics.checkNotNullExpressionValue(sharedPreferencesB, "create(...)");
            J(sharedPreferencesB);
        }
        SharedPreferences.Editor editorEdit = o().edit();
        Intrinsics.checkNotNullExpressionValue(editorEdit, "edit(...)");
        I(editorEdit);
    }

    public final void A(String imagePath) {
        Intrinsics.checkNotNullParameter(imagePath, "imagePath");
        g().putString(i, imagePath);
        g().commit();
    }

    public final void B(String imagePath) {
        Intrinsics.checkNotNullParameter(imagePath, "imagePath");
        g().putString(s, imagePath);
        g().commit();
    }

    public final void C(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        g().putString(h, name);
        g().commit();
    }

    public final void D(String imagePath) {
        Intrinsics.checkNotNullParameter(imagePath, "imagePath");
        g().putString(r, imagePath);
        g().commit();
    }

    public final void E(String state_code) {
        Intrinsics.checkNotNullParameter(state_code, "state_code");
        g().putString(m, state_code);
        g().commit();
    }

    public final void F(String napToken) {
        Intrinsics.checkNotNullParameter(napToken, "napToken");
        g().putString(n, napToken);
        g().commit();
    }

    public final void G(String imagePath) {
        Intrinsics.checkNotNullParameter(imagePath, "imagePath");
        g().putString(t, imagePath);
        g().commit();
    }

    public final void H(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.c = context;
    }

    public final void I(SharedPreferences.Editor editor) {
        Intrinsics.checkNotNullParameter(editor, "<set-?>");
        this.b = editor;
    }

    public final void J(SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<set-?>");
        this.a = sharedPreferences;
    }

    public final void a(String mPin) {
        Intrinsics.checkNotNullParameter(mPin, "mPin");
        g().putString(j, mPin);
        g().commit();
    }

    public final void b(String id, String mobile_no, String str, String str2, String mpin, String str3, Boolean bool, Boolean bool2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(mobile_no, "mobile_no");
        Intrinsics.checkNotNullParameter(mpin, "mpin");
        g().putString(g, mobile_no);
        g().putString(h, str);
        g().putString(i, str2);
        g().putString(j, mpin);
        g().putString(f, id);
        g().putString(m, str3);
        if (bool2 != null) {
            g().putBoolean(q, bool2.booleanValue());
        }
        if (bool != null) {
            g().putBoolean(k, bool.booleanValue());
        }
        g().commit();
    }

    public final String c() {
        return String.valueOf(o().getString(w, "0"));
    }

    public final boolean d() {
        return o().getBoolean(q, false);
    }

    public final String e() {
        return String.valueOf(o().getString(p, ""));
    }

    public final String f() {
        return String.valueOf(o().getString(v, ""));
    }

    public final SharedPreferences.Editor g() {
        SharedPreferences.Editor editor = this.b;
        if (editor != null) {
            return editor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("editor");
        return null;
    }

    public final String h() {
        return String.valueOf(o().getString(i, "NA"));
    }

    public final String i() {
        return String.valueOf(o().getString(u, "M"));
    }

    public final String j() {
        return String.valueOf(o().getString(s, "0"));
    }

    public final String k() {
        return String.valueOf(o().getString(f, null));
    }

    public final String l() {
        return String.valueOf(o().getString(g, null));
    }

    public final String m() {
        return String.valueOf(o().getString(j, null));
    }

    public final String n() {
        return String.valueOf(o().getString(h, "Guest User"));
    }

    public final SharedPreferences o() {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pref");
        return null;
    }

    public final String p() {
        return String.valueOf(o().getString(r, "0"));
    }

    public final String q() {
        return String.valueOf(o().getString(m, "DL"));
    }

    public final String r() {
        return String.valueOf(o().getString(n, "0"));
    }

    public final String s() {
        return String.valueOf(o().getString(x, "0"));
    }

    public final String t() {
        return String.valueOf(o().getString(t, "0"));
    }

    public final boolean u() {
        return o().getBoolean(k, false);
    }

    public final void v() {
        g().clear().apply();
        g().commit();
    }

    public final void w(String version) {
        Intrinsics.checkNotNullParameter(version, "version");
        g().putString(w, version);
        g().commit();
    }

    public final void x(String blood_group) {
        Intrinsics.checkNotNullParameter(blood_group, "blood_group");
        g().putString(l, blood_group);
        g().commit();
    }

    public final void y(String Token) {
        Intrinsics.checkNotNullParameter(Token, "Token");
        g().putString(x, Token);
        g().commit();
    }

    public final void z(String citizen) {
        Intrinsics.checkNotNullParameter(citizen, "citizen");
        g().putString(p, citizen);
        g().commit();
    }
}
