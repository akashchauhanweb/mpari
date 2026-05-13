package com.zepto;

import android.util.Log;
import com.google.gson.Gson;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.zepto.lc5;
import com.zepto.tu5;
import java.util.ArrayList;
import java.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes2.dex */
public final class zz1 extends zq7 {
    public final tz1 d;
    public final oy3 e;
    public final oy3 f;
    public final oy3 g;
    public final oy3 h;
    public final oy3 i;

    public static final class a implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ zz1 b;

        public a(String str, zz1 zz1Var) {
            this.a = str;
            this.b = zz1Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.j().k("error");
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                tu5.a aVar = tu5.a;
                String str = this.a;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                String strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
                Log.d("Response", strValueOf);
                Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) cc2.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                wb0.a(objFromJson);
                Log.d("response", String.valueOf((SecurityModle) response.body()));
                this.b.k().k(null);
            } catch (Exception unused) {
            }
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ zz1 b;

        public b(String str, zz1 zz1Var) {
            this.a = str;
            this.b = zz1Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.j().k("error");
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                tu5.a aVar = tu5.a;
                String str = this.a;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                String strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
                Log.d("Response", strValueOf);
                Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) sz1.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                wb0.a(objFromJson);
                Log.d("response", String.valueOf((SecurityModle) response.body()));
                this.b.i().k(null);
            } catch (Exception unused) {
            }
        }
    }

    public static final class c implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ zz1 b;

        public c(String str, zz1 zz1Var) {
            this.a = str;
            this.b = zz1Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.j().k("error");
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                tu5.a aVar = tu5.a;
                String str = this.a;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                String strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
                Log.d("Response", strValueOf);
                Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) qi4.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                wb0.a(objFromJson);
                Log.d("response", String.valueOf((SecurityModle) response.body()));
                this.b.o().k(null);
            } catch (Exception unused) {
            }
        }
    }

    public zz1(tz1 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.d = repository;
        this.e = new oy3();
        this.f = new oy3();
        this.g = new oy3();
        this.h = new oy3();
        this.i = new oy3();
    }

    public final void g(String licenceFromState, String licenceFromRTO, String jurisdiction, String fName, String mName, String lName, String fullName, String relationType, String relationFName, String relationMName, String relationLName, String aadharNo, String gender, String dob, String placeBirth, String countryBirth, String eduQualCode, String bloodGroup, String phoneNo, String mobileNo, String email, String altMobileNo, String idMark, String idMark2, String applNo, String preState, String presDistrictCd, String presSubDistrictCd, String presVillageOrTown, String presCityCd, String presHouseNo, String presStreet, String presLocation, String presPinCode, String permState, String permDistrictCd, String permSubDistrictCd, String permVillageOrTown, String permCityCd, String permHouseNo, String permStreet, String permLocation, String permPinCode, String stayPeriodYear, String stayPeriodMonth, String reference, String referenceType, String llValidUpto, String refRTOCode, String bioId, String allClassOfVehicles, String selectedString, ArrayList selectedCovsList, String willingToDonate, String allowNewAddr, String applCatg, String applDate, String llLicenceNo) {
        Intrinsics.checkNotNullParameter(licenceFromState, "licenceFromState");
        Intrinsics.checkNotNullParameter(licenceFromRTO, "licenceFromRTO");
        Intrinsics.checkNotNullParameter(jurisdiction, "jurisdiction");
        Intrinsics.checkNotNullParameter(fName, "fName");
        Intrinsics.checkNotNullParameter(mName, "mName");
        Intrinsics.checkNotNullParameter(lName, "lName");
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        Intrinsics.checkNotNullParameter(relationType, "relationType");
        Intrinsics.checkNotNullParameter(relationFName, "relationFName");
        Intrinsics.checkNotNullParameter(relationMName, "relationMName");
        Intrinsics.checkNotNullParameter(relationLName, "relationLName");
        Intrinsics.checkNotNullParameter(aadharNo, "aadharNo");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(placeBirth, "placeBirth");
        Intrinsics.checkNotNullParameter(countryBirth, "countryBirth");
        Intrinsics.checkNotNullParameter(eduQualCode, "eduQualCode");
        Intrinsics.checkNotNullParameter(bloodGroup, "bloodGroup");
        Intrinsics.checkNotNullParameter(phoneNo, "phoneNo");
        Intrinsics.checkNotNullParameter(mobileNo, "mobileNo");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(altMobileNo, "altMobileNo");
        Intrinsics.checkNotNullParameter(idMark, "idMark");
        Intrinsics.checkNotNullParameter(idMark2, "idMark2");
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(preState, "preState");
        Intrinsics.checkNotNullParameter(presDistrictCd, "presDistrictCd");
        Intrinsics.checkNotNullParameter(presSubDistrictCd, "presSubDistrictCd");
        Intrinsics.checkNotNullParameter(presVillageOrTown, "presVillageOrTown");
        Intrinsics.checkNotNullParameter(presCityCd, "presCityCd");
        Intrinsics.checkNotNullParameter(presHouseNo, "presHouseNo");
        Intrinsics.checkNotNullParameter(presStreet, "presStreet");
        Intrinsics.checkNotNullParameter(presLocation, "presLocation");
        Intrinsics.checkNotNullParameter(presPinCode, "presPinCode");
        Intrinsics.checkNotNullParameter(permState, "permState");
        Intrinsics.checkNotNullParameter(permDistrictCd, "permDistrictCd");
        Intrinsics.checkNotNullParameter(permSubDistrictCd, "permSubDistrictCd");
        Intrinsics.checkNotNullParameter(permVillageOrTown, "permVillageOrTown");
        Intrinsics.checkNotNullParameter(permCityCd, "permCityCd");
        Intrinsics.checkNotNullParameter(permHouseNo, "permHouseNo");
        Intrinsics.checkNotNullParameter(permStreet, "permStreet");
        Intrinsics.checkNotNullParameter(permLocation, "permLocation");
        Intrinsics.checkNotNullParameter(permPinCode, "permPinCode");
        Intrinsics.checkNotNullParameter(stayPeriodYear, "stayPeriodYear");
        Intrinsics.checkNotNullParameter(stayPeriodMonth, "stayPeriodMonth");
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(referenceType, "referenceType");
        Intrinsics.checkNotNullParameter(llValidUpto, "llValidUpto");
        Intrinsics.checkNotNullParameter(refRTOCode, "refRTOCode");
        Intrinsics.checkNotNullParameter(bioId, "bioId");
        Intrinsics.checkNotNullParameter(allClassOfVehicles, "allClassOfVehicles");
        Intrinsics.checkNotNullParameter(selectedString, "selectedString");
        Intrinsics.checkNotNullParameter(selectedCovsList, "selectedCovsList");
        Intrinsics.checkNotNullParameter(willingToDonate, "willingToDonate");
        Intrinsics.checkNotNullParameter(allowNewAddr, "allowNewAddr");
        Intrinsics.checkNotNullParameter(applCatg, "applCatg");
        Intrinsics.checkNotNullParameter(applDate, "applDate");
        Intrinsics.checkNotNullParameter(llLicenceNo, "llLicenceNo");
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = l(licenceFromState, licenceFromRTO, jurisdiction, fName, mName, lName, fullName, relationType, relationFName, relationMName, relationLName, aadharNo, gender, dob, placeBirth, countryBirth, eduQualCode, bloodGroup, phoneNo, mobileNo, email, altMobileNo, idMark, idMark2, applNo, preState, presDistrictCd, presSubDistrictCd, presVillageOrTown, presCityCd, presHouseNo, presStreet, presLocation, presPinCode, permState, permDistrictCd, permSubDistrictCd, permVillageOrTown, permCityCd, permHouseNo, permStreet, permLocation, permPinCode, stayPeriodYear, stayPeriodMonth, reference, referenceType, llValidUpto, refRTOCode, bioId, allClassOfVehicles, selectedString, selectedCovsList, willingToDonate, allowNewAddr, applCatg, applDate, llLicenceNo).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        lc5 lc5VarD = aVar.d(ls3VarB, string);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        this.d.a(lc5VarD, strValueOf).enqueue(new a(strValueOf, this));
    }

    public final JSONObject h(String applNo, String dob) {
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(dob, "dob");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("applicationNumber", applNo);
            jSONObject.put("dateOfBirth", dob);
            jSONObject.put("agentId", "mobSARATHI");
            jSONObject.put("agentIpAddress", "10.248.210.8");
            jSONObject.put("agentServiceName", "sarathiservice");
            jSONObject.put("agentPwd", "657d1c758e2e95af0014e16f5109f933");
            return jSONObject;
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    public final oy3 i() {
        return this.e;
    }

    public final oy3 j() {
        return this.h;
    }

    public final oy3 k() {
        return this.i;
    }

    public final JSONObject l(String licenceFromState, String licenceFromRTO, String jurisdiction, String fName, String mName, String lName, String fullName, String relationType, String relationFName, String relationMName, String relationLName, String aadharNo, String gender, String dob, String placeBirth, String countryBirth, String eduQualCode, String bloodGroup, String phoneNo, String mobileNo, String email, String altMobileNo, String idMark, String idMark2, String applNo, String preState, String presDistrictCd, String presSubDistrictCd, String presVillageOrTown, String presCityCd, String presHouseNo, String presStreet, String presLocation, String presPinCode, String permState, String permDistrictCd, String permSubDistrictCd, String permVillageOrTown, String permCityCd, String permHouseNo, String permStreet, String permLocation, String permPinCode, String stayPeriodYear, String stayPeriodMonth, String reference, String referenceType, String llValidUpto, String refRTOCode, String bioId, String allClassOfVehicles, String selectedString, ArrayList selectedCovsList, String willingToDonate, String allowNewAddr, String applCatg, String applDate, String llLicenceNo) {
        Intrinsics.checkNotNullParameter(licenceFromState, "licenceFromState");
        Intrinsics.checkNotNullParameter(licenceFromRTO, "licenceFromRTO");
        Intrinsics.checkNotNullParameter(jurisdiction, "jurisdiction");
        Intrinsics.checkNotNullParameter(fName, "fName");
        Intrinsics.checkNotNullParameter(mName, "mName");
        Intrinsics.checkNotNullParameter(lName, "lName");
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        Intrinsics.checkNotNullParameter(relationType, "relationType");
        Intrinsics.checkNotNullParameter(relationFName, "relationFName");
        Intrinsics.checkNotNullParameter(relationMName, "relationMName");
        Intrinsics.checkNotNullParameter(relationLName, "relationLName");
        Intrinsics.checkNotNullParameter(aadharNo, "aadharNo");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(placeBirth, "placeBirth");
        Intrinsics.checkNotNullParameter(countryBirth, "countryBirth");
        Intrinsics.checkNotNullParameter(eduQualCode, "eduQualCode");
        Intrinsics.checkNotNullParameter(bloodGroup, "bloodGroup");
        Intrinsics.checkNotNullParameter(phoneNo, "phoneNo");
        Intrinsics.checkNotNullParameter(mobileNo, "mobileNo");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(altMobileNo, "altMobileNo");
        Intrinsics.checkNotNullParameter(idMark, "idMark");
        Intrinsics.checkNotNullParameter(idMark2, "idMark2");
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(preState, "preState");
        Intrinsics.checkNotNullParameter(presDistrictCd, "presDistrictCd");
        Intrinsics.checkNotNullParameter(presSubDistrictCd, "presSubDistrictCd");
        Intrinsics.checkNotNullParameter(presVillageOrTown, "presVillageOrTown");
        Intrinsics.checkNotNullParameter(presCityCd, "presCityCd");
        Intrinsics.checkNotNullParameter(presHouseNo, "presHouseNo");
        Intrinsics.checkNotNullParameter(presStreet, "presStreet");
        Intrinsics.checkNotNullParameter(presLocation, "presLocation");
        Intrinsics.checkNotNullParameter(presPinCode, "presPinCode");
        Intrinsics.checkNotNullParameter(permState, "permState");
        Intrinsics.checkNotNullParameter(permDistrictCd, "permDistrictCd");
        Intrinsics.checkNotNullParameter(permSubDistrictCd, "permSubDistrictCd");
        Intrinsics.checkNotNullParameter(permVillageOrTown, "permVillageOrTown");
        Intrinsics.checkNotNullParameter(permCityCd, "permCityCd");
        Intrinsics.checkNotNullParameter(permHouseNo, "permHouseNo");
        Intrinsics.checkNotNullParameter(permStreet, "permStreet");
        Intrinsics.checkNotNullParameter(permLocation, "permLocation");
        Intrinsics.checkNotNullParameter(permPinCode, "permPinCode");
        Intrinsics.checkNotNullParameter(stayPeriodYear, "stayPeriodYear");
        Intrinsics.checkNotNullParameter(stayPeriodMonth, "stayPeriodMonth");
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(referenceType, "referenceType");
        Intrinsics.checkNotNullParameter(llValidUpto, "llValidUpto");
        Intrinsics.checkNotNullParameter(refRTOCode, "refRTOCode");
        Intrinsics.checkNotNullParameter(bioId, "bioId");
        Intrinsics.checkNotNullParameter(allClassOfVehicles, "allClassOfVehicles");
        Intrinsics.checkNotNullParameter(selectedString, "selectedString");
        Intrinsics.checkNotNullParameter(selectedCovsList, "selectedCovsList");
        Intrinsics.checkNotNullParameter(willingToDonate, "willingToDonate");
        Intrinsics.checkNotNullParameter(allowNewAddr, "allowNewAddr");
        Intrinsics.checkNotNullParameter(applCatg, "applCatg");
        Intrinsics.checkNotNullParameter(applDate, "applDate");
        Intrinsics.checkNotNullParameter(llLicenceNo, "llLicenceNo");
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray(new Gson().toJson(selectedCovsList));
            jSONObject.put("licenceFromStateCode", licenceFromState);
            jSONObject.put("licenceFromRTOCode", licenceFromRTO);
            jSONObject.put("jurisdiction", jurisdiction);
            jSONObject.put("fname", fName);
            jSONObject.put("mname", mName);
            jSONObject.put("lname", lName);
            jSONObject.put("fullName", fullName);
            jSONObject.put("relationType", relationType);
            jSONObject.put("swdFname", relationFName);
            jSONObject.put("swdMname", relationMName);
            jSONObject.put("swdLname", relationLName);
            jSONObject.put("aadharNumber", aadharNo);
            jSONObject.put("gender", gender);
            jSONObject.put("dateOfBirth", dob);
            jSONObject.put("placeOfBirth", placeBirth);
            jSONObject.put("countryOfBirthCode", countryBirth);
            jSONObject.put("eduQualCode", eduQualCode);
            jSONObject.put("bloodGroupCode", bloodGroup);
            jSONObject.put("phoneNumber", phoneNo);
            jSONObject.put("mobileNumber", mobileNo);
            jSONObject.put("email", email);
            jSONObject.put("altMobileNumber", altMobileNo);
            jSONObject.put("idMarks1", idMark);
            jSONObject.put("idMarks2", idMark2);
            jSONObject.put("applicationNumber", applNo);
            jSONObject.put("presState", preState);
            jSONObject.put("presDistrictCode", presDistrictCd);
            jSONObject.put("presSubDistrictCode", presSubDistrictCd);
            jSONObject.put("presVillageOrTown", presVillageOrTown);
            jSONObject.put("presCityCode", presCityCd);
            jSONObject.put("presHouseNo", presHouseNo);
            jSONObject.put("presStreet", presStreet);
            jSONObject.put("presLocation", presLocation);
            jSONObject.put("presPinCode", presPinCode);
            jSONObject.put("permState", permState);
            jSONObject.put("permDistrictCode", permDistrictCd);
            jSONObject.put("permSubDistrictCode", permSubDistrictCd);
            jSONObject.put("permVillageOrTown", permVillageOrTown);
            jSONObject.put("permCityCode", permCityCd);
            jSONObject.put("permHouseNo", permHouseNo);
            jSONObject.put("permStreet", permStreet);
            jSONObject.put("permLocation", permLocation);
            jSONObject.put("permPinCode", permPinCode);
            jSONObject.put("stayPeriodYears", stayPeriodYear);
            jSONObject.put("stayPeriodMonths", stayPeriodMonth);
            jSONObject.put("reference", reference);
            jSONObject.put("applDate", applDate);
            jSONObject.put("referenceType", referenceType);
            jSONObject.put("llValidUpto", llValidUpto);
            jSONObject.put("llRefRTOCode", refRTOCode);
            jSONObject.put("bioId", bioId);
            jSONObject.put("allClassOfVehicles", allClassOfVehicles);
            jSONObject.put("selectedString", selectedString);
            jSONObject.put("selectedCovsList", jSONArray);
            jSONObject.put("willingToDonate", willingToDonate);
            jSONObject.put("allowNewAddr", allowNewAddr);
            jSONObject.put("applCatg", applCatg);
            jSONObject.put("llLicenceNo", llLicenceNo);
            return jSONObject;
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    public final void m(String applNo, String dob) {
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(dob, "dob");
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = h(applNo, dob).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        lc5 lc5VarD = aVar.d(ls3VarB, string);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        this.d.c(lc5VarD, strValueOf).enqueue(new b(strValueOf, this));
    }

    public final JSONObject n(String transCd, String mobileNo, String applNo, String fullName, String rtoCd) {
        Intrinsics.checkNotNullParameter(transCd, "transCd");
        Intrinsics.checkNotNullParameter(mobileNo, "mobileNo");
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        Intrinsics.checkNotNullParameter(rtoCd, "rtoCd");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("transactionCode", transCd);
            jSONObject.put("mobileNumber", mobileNo);
            jSONObject.put("applicationNumber", applNo);
            jSONObject.put("fullName", fullName);
            jSONObject.put("licenceFromRTO", rtoCd);
            return jSONObject;
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    public final oy3 o() {
        return this.f;
    }

    public final void p(String transCd, String mobileNo, String applNo, String fullName, String rtoCd) {
        Intrinsics.checkNotNullParameter(transCd, "transCd");
        Intrinsics.checkNotNullParameter(mobileNo, "mobileNo");
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        Intrinsics.checkNotNullParameter(rtoCd, "rtoCd");
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = n(transCd, mobileNo, applNo, fullName, rtoCd).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        lc5 lc5VarD = aVar.d(ls3VarB, string);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        this.d.b(lc5VarD, strValueOf).enqueue(new c(strValueOf, this));
    }

    public final oy3 q() {
        return this.g;
    }
}
