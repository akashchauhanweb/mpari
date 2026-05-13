package com.zepto;

import android.content.Context;
import android.content.SharedPreferences;
import com.zepto.h22;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class wm6 {
    public SharedPreferences a;
    public SharedPreferences.Editor b;
    public Context c;
    public static final a d = new a(null);
    public static final String e = "TransferOfOwnership";
    public static final String f = "stateCd";
    public static final String g = "rcChasiNo";
    public static final String h = "rcEngNo";
    public static final String i = "officeCode";
    public static final String j = "enterNewOwner";
    public static final String k = "purpose";
    public static final String l = "ownershipType";
    public static final String m = "newOwnerCategory";
    public static final String n = "newOwnerName";
    public static final String o = "fatherHusbandName";
    public static final String p = "saleAmount";
    public static final String q = "saleDate";
    public static final String r = "mobileNumber";
    public static final String s = "panNumber";
    public static final String t = "emailId";
    public static final String u = "currenthouseStreetName";
    public static final String v = "currentVillageTown";
    public static final String w = "currentLandmark";
    public static final String x = "currentPinCode";
    public static final String y = "currentState";
    public static final String z = "currentDistrict";
    public static final String A = "permanenthouseStreetName";
    public static final String B = "permanentVillageTown";
    public static final String C = "permanentLandmark";
    public static final String D = "permanentPinCode";
    public static final String E = "permanentState";
    public static final String F = "permanentDistrict";
    public static final String G = "addNomineeYes";
    public static final String H = "addNomineeNo";
    public static final String I = "nomineeName";
    public static final String J = "relationWithNominee";
    public static final String K = "nomineeDateOfBirth";
    public static final String L = "insuranceType";
    public static final String M = "insuranceCompany";
    public static final String N = "policyNumber";
    public static final String O = "insuranceFrom";
    public static final String P = "insuranceUpto";
    public static final String Q = "declaredInsurance";
    public static final String R = "auth_mode";

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return wm6.z;
        }

        public final String b() {
            return wm6.w;
        }

        public final String c() {
            return wm6.x;
        }

        public final String d() {
            return wm6.y;
        }

        public final String e() {
            return wm6.v;
        }

        public final String f() {
            return wm6.u;
        }

        public final String g() {
            return wm6.F;
        }

        public final String h() {
            return wm6.C;
        }

        public final String i() {
            return wm6.D;
        }

        public final String j() {
            return wm6.E;
        }

        public final String k() {
            return wm6.B;
        }

        public final String l() {
            return wm6.A;
        }
    }

    public wm6(Context context) {
        if (context != null) {
            s(context);
        }
        if (context != null) {
            String strC = dq3.c(dq3.a);
            Intrinsics.checkNotNullExpressionValue(strC, "getOrCreate(...)");
            SharedPreferences sharedPreferencesB = h22.b(e, strC, context, h22.d.AES256_SIV, h22.e.AES256_GCM);
            Intrinsics.checkNotNullExpressionValue(sharedPreferencesB, "create(...)");
            u(sharedPreferencesB);
        }
        SharedPreferences.Editor editorEdit = o().edit();
        Intrinsics.checkNotNullExpressionValue(editorEdit, "edit(...)");
        t(editorEdit);
    }

    public final ii6 m() {
        String string = o().getString(g, "");
        Intrinsics.checkNotNull(string);
        String string2 = o().getString(u, "");
        Intrinsics.checkNotNull(string2);
        String string3 = o().getString(v, "");
        Intrinsics.checkNotNull(string3);
        String string4 = o().getString(w, "");
        Intrinsics.checkNotNull(string4);
        String string5 = o().getString(z, "0");
        Intrinsics.checkNotNull(string5);
        int i2 = o().getInt(x, 0);
        String string6 = o().getString(y, "");
        Intrinsics.checkNotNull(string6);
        String string7 = o().getString(t, "");
        Intrinsics.checkNotNull(string7);
        String string8 = o().getString(o, "");
        Intrinsics.checkNotNull(string8);
        SharedPreferences sharedPreferencesO = o();
        String str = i;
        int i3 = sharedPreferencesO.getInt(str, 0);
        int i4 = o().getInt(m, 0);
        String string9 = o().getString(n, "");
        Intrinsics.checkNotNull(string9);
        String string10 = o().getString(j, "0");
        Intrinsics.checkNotNull(string10);
        int i5 = Integer.parseInt(string10);
        String string11 = o().getString(s, "");
        Intrinsics.checkNotNull(string11);
        String string12 = o().getString(A, "");
        Intrinsics.checkNotNull(string12);
        String string13 = o().getString(B, "");
        Intrinsics.checkNotNull(string13);
        String string14 = o().getString(C, "");
        Intrinsics.checkNotNull(string14);
        String string15 = o().getString(F, "0");
        Intrinsics.checkNotNull(string15);
        int i6 = o().getInt(D, 0);
        String string16 = o().getString(E, "");
        Intrinsics.checkNotNull(string16);
        int i7 = o().getInt(str, 5);
        String string17 = o().getString(k, "");
        Intrinsics.checkNotNull(string17);
        String string18 = o().getString(h, "");
        Intrinsics.checkNotNull(string18);
        String string19 = o().getString(p, "0.0");
        Intrinsics.checkNotNull(string19);
        long j2 = Long.parseLong(string19);
        String string20 = o().getString(q, "");
        Intrinsics.checkNotNull(string20);
        String string21 = o().getString(f, "");
        Intrinsics.checkNotNull(string21);
        String string22 = o().getString(r, "0000000000");
        Intrinsics.checkNotNull(string22);
        return new ii6("", "AU", string, string2, string3, string4, string5, i2, string6, string7, string8, "", true, "", i3, "", i4, 0, "", string9, i5, string11, string12, string13, string14, string15, i6, string16, i7, string17, string18, j2, string20, "", string21, "", string22);
    }

    public final SharedPreferences.Editor n() {
        SharedPreferences.Editor editor = this.b;
        if (editor != null) {
            return editor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("editor");
        return null;
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
        return o().getString(i, "");
    }

    public final void q(f7 binding, String currentstateCd, String permentstateCd, String currentDistrictGet, String permanentDistrictGet) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(currentstateCd, "currentstateCd");
        Intrinsics.checkNotNullParameter(permentstateCd, "permentstateCd");
        Intrinsics.checkNotNullParameter(currentDistrictGet, "currentDistrictGet");
        Intrinsics.checkNotNullParameter(permanentDistrictGet, "permanentDistrictGet");
        n().putString(u, binding.h.getText().toString());
        n().putString(v, binding.f.getText().toString());
        n().putString(w, binding.c.getText().toString());
        n().putString(x, binding.d.getText().toString());
        n().putString(y, currentstateCd);
        n().putString(z, currentDistrictGet);
        n().putString(A, binding.o.getText().toString());
        n().putString(B, binding.w.getText().toString());
        n().putString(C, binding.q.getText().toString());
        n().putString(D, binding.n.getText().toString());
        n().putString(E, permentstateCd);
        n().putString(F, permanentDistrictGet);
        n().commit();
    }

    public final void r(gi7 binding, String str, String str2, String str3, String officeCode, String purposeGet, String ownershipTypeGet, String newOwnerCatagoryGet) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(officeCode, "officeCode");
        Intrinsics.checkNotNullParameter(purposeGet, "purposeGet");
        Intrinsics.checkNotNullParameter(ownershipTypeGet, "ownershipTypeGet");
        Intrinsics.checkNotNullParameter(newOwnerCatagoryGet, "newOwnerCatagoryGet");
        n().putString(j, binding.d.getText().toString());
        n().putString(k, purposeGet);
        n().putString(l, ownershipTypeGet);
        n().putString(m, newOwnerCatagoryGet);
        n().putString(n, binding.m.getText().toString());
        n().putString(o, binding.f.getText().toString());
        n().putString(p, binding.z.getText().toString());
        n().putString(q, binding.B.getText().toString());
        n().putString(r, binding.h.getText().toString());
        n().putString(s, binding.r.getText().toString());
        n().putString(t, binding.b.getText().toString());
        n().putString(f, str);
        n().putString(g, str2);
        n().putString(h, str3);
        n().putString(i, officeCode);
        n().commit();
    }

    public final void s(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.c = context;
    }

    public final void t(SharedPreferences.Editor editor) {
        Intrinsics.checkNotNullParameter(editor, "<set-?>");
        this.b = editor;
    }

    public final void u(SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<set-?>");
        this.a = sharedPreferences;
    }
}
