package com.zepto;

import android.content.Context;
import android.content.SharedPreferences;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerModel.DataX;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerModel.TOFetchApplicationDetails;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.TransferOwnershipDto;
import com.zepto.h22;
import com.zepto.wm6;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class pb6 {
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
    public static final String l = "applNo";
    public static final String m = "ownershipType";
    public static final String n = "newOwnerCategory";
    public static final String o = "newOwnerName";
    public static final String p = "fatherHusbandName";
    public static final String q = "saleAmount";
    public static final String r = "saleDate";
    public static final String s = "mobileNumber";
    public static final String t = "panNumber";
    public static final String u = "emailId";
    public static final String v = "currenthouseStreetName";
    public static final String w = "currentVillageTown";
    public static final String x = "currentLandmark";
    public static final String y = "currentPinCode";
    public static final String z = "currentState";
    public static final String A = "currentDistrict";
    public static final String B = "permanenthouseStreetName";
    public static final String C = "permanentVillageTown";
    public static final String D = "permanentLandmark";
    public static final String E = "permanentPinCode";
    public static final String F = "permanentState";
    public static final String G = "permanentDistrict";
    public static final String H = "addNomineeYes";
    public static final String I = "addNomineeNo";
    public static final String J = "nomineeName";
    public static final String K = "relationWithNominee";
    public static final String L = "nomineeDateOfBirth";
    public static final String M = "insuranceType";
    public static final String N = "insuranceCompany";
    public static final String O = "policyNumber";
    public static final String P = "insuranceFrom";
    public static final String Q = "insuranceUpto";
    public static final String R = "declaredInsurance";
    public static final String S = "auth_mode";
    public static final String T = "ownerSerial";

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public pb6(Context context) {
        if (context != null) {
            h(context);
        }
        if (context != null) {
            String strC = dq3.c(dq3.a);
            Intrinsics.checkNotNullExpressionValue(strC, "getOrCreate(...)");
            SharedPreferences sharedPreferencesB = h22.b(e, strC, context, h22.d.AES256_SIV, h22.e.AES256_GCM);
            Intrinsics.checkNotNullExpressionValue(sharedPreferencesB, "create(...)");
            j(sharedPreferencesB);
        }
        SharedPreferences.Editor editorEdit = c().edit();
        Intrinsics.checkNotNullExpressionValue(editorEdit, "edit(...)");
        i(editorEdit);
    }

    public final ii6 a() {
        String string = c().getString(l, "");
        Intrinsics.checkNotNull(string);
        String string2 = c().getString(S, "");
        Intrinsics.checkNotNull(string2);
        String string3 = c().getString(g, "");
        Intrinsics.checkNotNull(string3);
        String string4 = c().getString(v, "");
        Intrinsics.checkNotNull(string4);
        String string5 = c().getString(w, "");
        Intrinsics.checkNotNull(string5);
        String string6 = c().getString(x, "");
        Intrinsics.checkNotNull(string6);
        String string7 = c().getString(A, "0");
        Intrinsics.checkNotNull(string7);
        String string8 = c().getString(y, "0");
        Intrinsics.checkNotNull(string8);
        int i2 = Integer.parseInt(string8);
        String string9 = c().getString(z, "");
        Intrinsics.checkNotNull(string9);
        String string10 = c().getString(u, "");
        Intrinsics.checkNotNull(string10);
        String string11 = c().getString(p, "");
        Intrinsics.checkNotNull(string11);
        SharedPreferences sharedPreferencesC = c();
        String str = i;
        String string12 = sharedPreferencesC.getString(str, "0");
        Intrinsics.checkNotNull(string12);
        int i3 = Integer.parseInt(string12);
        int i4 = c().getInt(n, 0);
        String string13 = c().getString(o, "");
        Intrinsics.checkNotNull(string13);
        String string14 = c().getString(T, "0");
        Intrinsics.checkNotNull(string14);
        int i5 = Integer.parseInt(string14);
        String string15 = c().getString(t, "");
        Intrinsics.checkNotNull(string15);
        String string16 = c().getString(B, "");
        Intrinsics.checkNotNull(string16);
        String string17 = c().getString(C, "");
        Intrinsics.checkNotNull(string17);
        String string18 = c().getString(D, "");
        Intrinsics.checkNotNull(string18);
        String string19 = c().getString(G, "0");
        Intrinsics.checkNotNull(string19);
        String string20 = c().getString(E, "0");
        Intrinsics.checkNotNull(string20);
        int i6 = Integer.parseInt(string20);
        String string21 = c().getString(F, "");
        Intrinsics.checkNotNull(string21);
        int i7 = c().getInt(str, 5);
        String string22 = c().getString(k, "");
        Intrinsics.checkNotNull(string22);
        String string23 = c().getString(h, "");
        Intrinsics.checkNotNull(string23);
        String string24 = c().getString(q, "0.0");
        Intrinsics.checkNotNull(string24);
        long j2 = Long.parseLong(string24);
        String string25 = c().getString(r, "");
        Intrinsics.checkNotNull(string25);
        String string26 = c().getString(f, "");
        Intrinsics.checkNotNull(string26);
        return new ii6(string, string2, string3, string4, string5, string6, string7, i2, string9, string10, string11, "", true, "", i3, "", i4, 0, "", string13, i5, string15, string16, string17, string18, string19, i6, string21, i7, string22, string23, j2, string25, "", string26, "", c().getString(s, "000000000"));
    }

    public final SharedPreferences.Editor b() {
        SharedPreferences.Editor editor = this.b;
        if (editor != null) {
            return editor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("editor");
        return null;
    }

    public final SharedPreferences c() {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pref");
        return null;
    }

    public final void d(pg binding, String applNo, String authMode, TOFetchApplicationDetails tOFetchApplicationDetails) {
        DataX data;
        DataX data2;
        DataX data3;
        TransferOwnershipDto transferOwnershipDto;
        DataX data4;
        TransferOwnershipDto transferOwnershipDto2;
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(authMode, "authMode");
        String stateCode = null;
        b().putString(T, String.valueOf((tOFetchApplicationDetails == null || (data4 = tOFetchApplicationDetails.getData()) == null || (transferOwnershipDto2 = data4.getTransferOwnershipDto()) == null) ? null : Integer.valueOf(transferOwnershipDto2.getOwnerSerial())));
        b().putString(l, applNo);
        b().putString(S, authMode);
        b().putString(k, binding.l.getText().toString());
        b().putString(m, binding.n.getText().toString());
        b().putString(n, binding.h.getText().toString());
        b().putString(o, binding.j.getText().toString());
        b().putString(p, binding.d.getText().toString());
        b().putString(q, binding.u.getText().toString());
        b().putString(r, binding.w.getText().toString());
        b().putString(s, binding.f.getText().toString());
        b().putString(t, binding.p.getText().toString());
        b().putString(u, binding.b.getText().toString());
        b().putString(g, String.valueOf((tOFetchApplicationDetails == null || (data3 = tOFetchApplicationDetails.getData()) == null || (transferOwnershipDto = data3.getTransferOwnershipDto()) == null) ? null : transferOwnershipDto.getChassisNo()));
        b().putString(i, String.valueOf((tOFetchApplicationDetails == null || (data2 = tOFetchApplicationDetails.getData()) == null) ? null : Integer.valueOf(data2.getOfficeCode())));
        SharedPreferences.Editor editorB = b();
        String str = f;
        if (tOFetchApplicationDetails != null && (data = tOFetchApplicationDetails.getData()) != null) {
            stateCode = data.getStateCode();
        }
        editorB.putString(str, stateCode);
        b().commit();
    }

    public final void e(w1 binding, String currentstateCd, String permentstateCd, String currentDistrictGet, String permanentDistrictGet) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(currentstateCd, "currentstateCd");
        Intrinsics.checkNotNullParameter(permentstateCd, "permentstateCd");
        Intrinsics.checkNotNullParameter(currentDistrictGet, "currentDistrictGet");
        Intrinsics.checkNotNullParameter(permanentDistrictGet, "permanentDistrictGet");
        b().putString(v, binding.h.getText().toString());
        b().putString(w, binding.f.getText().toString());
        b().putString(x, binding.c.getText().toString());
        b().putString(y, binding.d.getText().toString());
        b().putString(z, currentstateCd);
        b().putString(A, currentDistrictGet);
        b().putString(B, binding.o.getText().toString());
        b().putString(C, binding.w.getText().toString());
        b().putString(D, binding.q.getText().toString());
        b().putString(E, binding.n.getText().toString());
        b().putString(F, permentstateCd);
        b().putString(G, permanentDistrictGet);
        b().commit();
    }

    public final void f(v1 binding, String currentstateCd, String permentstateCd, String currentDistrictGet, String permanentDistrictGet) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(currentstateCd, "currentstateCd");
        Intrinsics.checkNotNullParameter(permentstateCd, "permentstateCd");
        Intrinsics.checkNotNullParameter(currentDistrictGet, "currentDistrictGet");
        Intrinsics.checkNotNullParameter(permanentDistrictGet, "permanentDistrictGet");
        SharedPreferences.Editor editorB = b();
        wm6.a aVar = wm6.d;
        editorB.putString(aVar.f(), binding.h.getText().toString());
        b().putString(aVar.e(), binding.f.getText().toString());
        b().putString(aVar.b(), binding.c.getText().toString());
        b().putString(aVar.c(), binding.d.getText().toString());
        b().putString(aVar.d(), currentstateCd);
        b().putString(aVar.a(), currentDistrictGet);
        b().putString(aVar.l(), binding.o.getText().toString());
        b().putString(aVar.k(), binding.w.getText().toString());
        b().putString(aVar.h(), binding.q.getText().toString());
        b().putString(aVar.i(), binding.n.getText().toString());
        b().putString(aVar.j(), permentstateCd);
        b().putString(aVar.g(), permanentDistrictGet);
        b().commit();
    }

    public final void g(pg binding, String applNo, String authMode, TOFetchApplicationDetails tOFetchApplicationDetails) {
        DataX data;
        DataX data2;
        DataX data3;
        TransferOwnershipDto transferOwnershipDto;
        DataX data4;
        TransferOwnershipDto transferOwnershipDto2;
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(authMode, "authMode");
        String stateCode = null;
        b().putString(T, String.valueOf((tOFetchApplicationDetails == null || (data4 = tOFetchApplicationDetails.getData()) == null || (transferOwnershipDto2 = data4.getTransferOwnershipDto()) == null) ? null : Integer.valueOf(transferOwnershipDto2.getOwnerSerial())));
        b().putString(l, applNo);
        b().putString(S, authMode);
        b().putString(k, binding.l.getText().toString());
        b().putString(m, binding.n.getText().toString());
        b().putString(n, binding.h.getText().toString());
        b().putString(o, binding.j.getText().toString());
        b().putString(p, binding.d.getText().toString());
        b().putString(q, binding.u.getText().toString());
        b().putString(r, binding.w.getText().toString());
        b().putString(s, binding.f.getText().toString());
        b().putString(t, binding.p.getText().toString());
        b().putString(u, binding.b.getText().toString());
        b().putString(g, String.valueOf((tOFetchApplicationDetails == null || (data3 = tOFetchApplicationDetails.getData()) == null || (transferOwnershipDto = data3.getTransferOwnershipDto()) == null) ? null : transferOwnershipDto.getChassisNo()));
        b().putString(i, String.valueOf((tOFetchApplicationDetails == null || (data2 = tOFetchApplicationDetails.getData()) == null) ? null : Integer.valueOf(data2.getOfficeCode())));
        SharedPreferences.Editor editorB = b();
        String str = f;
        if (tOFetchApplicationDetails != null && (data = tOFetchApplicationDetails.getData()) != null) {
            stateCode = data.getStateCode();
        }
        editorB.putString(str, stateCode);
        b().commit();
    }

    public final void h(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.c = context;
    }

    public final void i(SharedPreferences.Editor editor) {
        Intrinsics.checkNotNullParameter(editor, "<set-?>");
        this.b = editor;
    }

    public final void j(SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<set-?>");
        this.a = sharedPreferences;
    }
}
