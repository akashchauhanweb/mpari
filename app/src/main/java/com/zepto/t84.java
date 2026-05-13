package com.zepto;

import android.util.Log;
import com.google.gson.Gson;
import com.nic.mparivahan.NewDlScreen.Modal.CheckLLExitModal;
import com.nic.mparivahan.NewDlScreen.Modal.DrivingSchoolModal;
import com.nic.mparivahan.NewDlScreen.Modal.SubmitDlResponseModal;
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
public final class t84 extends zq7 {
    public final o74 d;
    public final oy3 e;
    public final oy3 f;
    public final oy3 g;
    public final oy3 h;

    public static final class a implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ t84 b;

        public a(String str, t84 t84Var) {
            this.a = str;
            this.b = t84Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.m().k("error");
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
                Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) CheckLLExitModal.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.b.i().k((CheckLLExitModal) objFromJson);
            } catch (Exception unused) {
                this.b.m().k("error");
            }
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ t84 b;

        public b(String str, t84 t84Var) {
            this.a = str;
            this.b = t84Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.m().k("error");
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
                Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) DrivingSchoolModal.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.b.j().k((DrivingSchoolModal) objFromJson);
            } catch (Exception unused) {
                this.b.m().k("error");
            }
        }
    }

    public static final class c implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ t84 b;

        public c(String str, t84 t84Var) {
            this.a = str;
            this.b = t84Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.m().k("error");
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
                Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) SubmitDlResponseModal.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.b.n().k((SubmitDlResponseModal) objFromJson);
            } catch (Exception unused) {
                this.b.m().k("error");
            }
        }
    }

    public t84(o74 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.d = repository;
        this.e = new oy3();
        this.f = new oy3();
        this.g = new oy3();
        this.h = new oy3();
    }

    public final void g(String enteredLlNo, String dob) {
        Intrinsics.checkNotNullParameter(enteredLlNo, "enteredLlNo");
        Intrinsics.checkNotNullParameter(dob, "dob");
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = l(enteredLlNo, dob).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        lc5 lc5VarD = aVar.d(ls3VarB, string);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        this.d.a(lc5VarD, strValueOf).enqueue(new a(strValueOf, this));
    }

    public final void h(String stateName) {
        Intrinsics.checkNotNullParameter(stateName, "stateName");
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = k(stateName).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        lc5 lc5VarD = aVar.d(ls3VarB, string);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        this.d.b(lc5VarD, strValueOf).enqueue(new b(strValueOf, this));
    }

    public final oy3 i() {
        return this.e;
    }

    public final oy3 j() {
        return this.f;
    }

    public final JSONObject k(String stateName) {
        Intrinsics.checkNotNullParameter(stateName, "stateName");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("llFromState1", stateName);
            jSONObject.put("llToDLState", stateName);
            jSONObject.put("dsListFlag", "true");
            jSONObject.put("agentId", "UmangOD");
            jSONObject.put("agentIpAddress", "164.100.161.142");
            jSONObject.put("agentServiceName", "SarathiMobileService");
            jSONObject.put("agentPwd", "2335647e653c970102713f68f6aad970");
            return jSONObject;
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    public final JSONObject l(String llNo, String dob) {
        Intrinsics.checkNotNullParameter(llNo, "llNo");
        Intrinsics.checkNotNullParameter(dob, "dob");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("learningLicence", llNo);
            jSONObject.put("dateOfBirth", dob);
            jSONObject.put("agentId", "UmangOD");
            jSONObject.put("agentIpAddress", "164.100.161.142");
            jSONObject.put("agentServiceName", "SarathiMobileService");
            jSONObject.put("agentPwd", "2335647e653c970102713f68f6aad970");
            return jSONObject;
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    public final oy3 m() {
        return this.g;
    }

    public final oy3 n() {
        return this.h;
    }

    public final JSONObject o(String llNo, String dob, String llFromRTO1, String llFromState1, String aadharFlag, String ekycId, String userId, String fName, String mName, String lName, String relationType, String relationFName, String relationMName, String relationLName, String aadharNo, String fullName, String gender, String dateOfBirth, String nprNo, String placeOfBirth, String countryOfBirth, String eduQual, String bloodGroup, String email, String mobileNo, String altMobileNo, String idMark1, String idMark2, String llToDlState, String llToDlRto, String presState, String presDist, String presSubDist, String presPincode, String presHNo, String presVillTown, String presStreet, String presCity, String presLoc, String presSameAsPerm, String permState, String permDist, String permSubDistr, String permPincode, String permHNo, String permVillOrTown, String permStreet, String permCity, String permLoc, String permStayMonth, String permStayYear, String age, boolean z, boolean z2, String selectedCov, ArrayList dSchoolList) {
        Intrinsics.checkNotNullParameter(llNo, "llNo");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(llFromRTO1, "llFromRTO1");
        Intrinsics.checkNotNullParameter(llFromState1, "llFromState1");
        Intrinsics.checkNotNullParameter(aadharFlag, "aadharFlag");
        Intrinsics.checkNotNullParameter(ekycId, "ekycId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(fName, "fName");
        Intrinsics.checkNotNullParameter(mName, "mName");
        Intrinsics.checkNotNullParameter(lName, "lName");
        Intrinsics.checkNotNullParameter(relationType, "relationType");
        Intrinsics.checkNotNullParameter(relationFName, "relationFName");
        Intrinsics.checkNotNullParameter(relationMName, "relationMName");
        Intrinsics.checkNotNullParameter(relationLName, "relationLName");
        Intrinsics.checkNotNullParameter(aadharNo, "aadharNo");
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(nprNo, "nprNo");
        Intrinsics.checkNotNullParameter(placeOfBirth, "placeOfBirth");
        Intrinsics.checkNotNullParameter(countryOfBirth, "countryOfBirth");
        Intrinsics.checkNotNullParameter(eduQual, "eduQual");
        Intrinsics.checkNotNullParameter(bloodGroup, "bloodGroup");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(mobileNo, "mobileNo");
        Intrinsics.checkNotNullParameter(altMobileNo, "altMobileNo");
        Intrinsics.checkNotNullParameter(idMark1, "idMark1");
        Intrinsics.checkNotNullParameter(idMark2, "idMark2");
        Intrinsics.checkNotNullParameter(llToDlState, "llToDlState");
        Intrinsics.checkNotNullParameter(llToDlRto, "llToDlRto");
        Intrinsics.checkNotNullParameter(presState, "presState");
        Intrinsics.checkNotNullParameter(presDist, "presDist");
        Intrinsics.checkNotNullParameter(presSubDist, "presSubDist");
        Intrinsics.checkNotNullParameter(presPincode, "presPincode");
        Intrinsics.checkNotNullParameter(presHNo, "presHNo");
        Intrinsics.checkNotNullParameter(presVillTown, "presVillTown");
        Intrinsics.checkNotNullParameter(presStreet, "presStreet");
        Intrinsics.checkNotNullParameter(presCity, "presCity");
        Intrinsics.checkNotNullParameter(presLoc, "presLoc");
        Intrinsics.checkNotNullParameter(presSameAsPerm, "presSameAsPerm");
        Intrinsics.checkNotNullParameter(permState, "permState");
        Intrinsics.checkNotNullParameter(permDist, "permDist");
        Intrinsics.checkNotNullParameter(permSubDistr, "permSubDistr");
        Intrinsics.checkNotNullParameter(permPincode, "permPincode");
        Intrinsics.checkNotNullParameter(permHNo, "permHNo");
        Intrinsics.checkNotNullParameter(permVillOrTown, "permVillOrTown");
        Intrinsics.checkNotNullParameter(permStreet, "permStreet");
        Intrinsics.checkNotNullParameter(permCity, "permCity");
        Intrinsics.checkNotNullParameter(permLoc, "permLoc");
        Intrinsics.checkNotNullParameter(permStayMonth, "permStayMonth");
        Intrinsics.checkNotNullParameter(permStayYear, "permStayYear");
        Intrinsics.checkNotNullParameter(age, "age");
        Intrinsics.checkNotNullParameter(selectedCov, "selectedCov");
        Intrinsics.checkNotNullParameter(dSchoolList, "dSchoolList");
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = dSchoolList.size() > 0 ? new JSONArray(new Gson().toJson(dSchoolList)) : new JSONArray();
            jSONObject.put("agentId", "UmangDL");
            jSONObject.put("agentIpAddress", "164.100.161.142");
            jSONObject.put("agentServiceName", "SarathiMobileService");
            jSONObject.put("agentPwd", "2335647e653c970102713f68f6aad970");
            jSONObject.put("learningLicence", llNo);
            jSONObject.put("dOB", dob);
            jSONObject.put("llFromRTO1", llFromRTO1);
            jSONObject.put("llFromState1", llFromState1);
            jSONObject.put("aadharflag", aadharFlag);
            jSONObject.put("ekycId", ekycId);
            jSONObject.put("userId", userId);
            jSONObject.put("fname", fName);
            jSONObject.put("mname", mName);
            jSONObject.put("lname", lName);
            jSONObject.put("relationType", relationType);
            jSONObject.put("swdfName", relationFName);
            jSONObject.put("swdmName", relationMName);
            jSONObject.put("swdlName", relationLName);
            jSONObject.put("aadharNumber", aadharNo);
            jSONObject.put("newFullName", fullName);
            jSONObject.put("gender", gender);
            jSONObject.put("dateOfBirth", dateOfBirth);
            jSONObject.put("nprnumber", nprNo);
            jSONObject.put("placeOfBirth", placeOfBirth);
            jSONObject.put("countryOfBirth", countryOfBirth);
            jSONObject.put("eduQual", eduQual);
            jSONObject.put("bloodGroup", bloodGroup);
            jSONObject.put("email", email);
            jSONObject.put("mobileNumber", mobileNo);
            jSONObject.put("alternatemobileNumber", altMobileNo);
            jSONObject.put("idMarks1", idMark1);
            jSONObject.put("idMarks2", idMark2);
            jSONObject.put("llToDLState", llToDlState);
            jSONObject.put("llToDLRto", llToDlRto);
            jSONObject.put("presState", presState);
            jSONObject.put("presDistrict", presDist);
            jSONObject.put("presSubDistrict", presSubDist);
            jSONObject.put("presPinCode", presPincode);
            jSONObject.put("presHouseNo", presHNo);
            jSONObject.put("presVillageOrTown", presVillTown);
            jSONObject.put("presStreet", presStreet);
            jSONObject.put("presCity", presCity);
            jSONObject.put("presLocation", presLoc);
            jSONObject.put("presSameAsPerm", presSameAsPerm);
            jSONObject.put("permState", permState);
            jSONObject.put("permDistrict", permDist);
            jSONObject.put("permSubDistrict", permSubDistr);
            jSONObject.put("permPinCode", permPincode);
            jSONObject.put("permHouseNo", permHNo);
            jSONObject.put("permVillageOrTown", permVillOrTown);
            jSONObject.put("permStreet", permStreet);
            jSONObject.put("permCity", permCity);
            jSONObject.put("permLocation", permLoc);
            jSONObject.put("presStayMonths", permStayMonth);
            jSONObject.put("presStayYears", permStayYear);
            jSONObject.put("age", age);
            jSONObject.put("onlyEditAddressLL", z);
            jSONObject.put("editAddressLL", z2);
            jSONObject.put("selectedCovs", selectedCov);
            jSONObject.put("drivingSchoolDetforInput", jSONArray);
            Log.e("Obj", jSONObject.toString());
            return jSONObject;
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    public final void p(String llNo, String dob, String llFromRTO1, String llFromState1, String aadharFlag, String ekycId, String userId, String fName, String mName, String lName, String relationType, String relationFName, String relationMName, String relationLName, String aadharNo, String fullName, String gender, String dateOfBirth, String nprNo, String placeOfBirth, String countryOfBirth, String eduQual, String bloodGroup, String email, String mobileNo, String altMobileNo, String idMark1, String idMark2, String llToDlState, String llToDlRto, String presState, String presDist, String presSubDist, String presPincode, String presHNo, String presVillTown, String presStreet, String presCity, String presLoc, String presSameAsPerm, String permState, String permDist, String permSubDistr, String permPincode, String permHNo, String permVillOrTown, String permStreet, String permCity, String permLoc, String permStayMonth, String permStayYear, String age, boolean z, boolean z2, String selectedCov, ArrayList dSchoolList) {
        Intrinsics.checkNotNullParameter(llNo, "llNo");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(llFromRTO1, "llFromRTO1");
        Intrinsics.checkNotNullParameter(llFromState1, "llFromState1");
        Intrinsics.checkNotNullParameter(aadharFlag, "aadharFlag");
        Intrinsics.checkNotNullParameter(ekycId, "ekycId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(fName, "fName");
        Intrinsics.checkNotNullParameter(mName, "mName");
        Intrinsics.checkNotNullParameter(lName, "lName");
        Intrinsics.checkNotNullParameter(relationType, "relationType");
        Intrinsics.checkNotNullParameter(relationFName, "relationFName");
        Intrinsics.checkNotNullParameter(relationMName, "relationMName");
        Intrinsics.checkNotNullParameter(relationLName, "relationLName");
        Intrinsics.checkNotNullParameter(aadharNo, "aadharNo");
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(nprNo, "nprNo");
        Intrinsics.checkNotNullParameter(placeOfBirth, "placeOfBirth");
        Intrinsics.checkNotNullParameter(countryOfBirth, "countryOfBirth");
        Intrinsics.checkNotNullParameter(eduQual, "eduQual");
        Intrinsics.checkNotNullParameter(bloodGroup, "bloodGroup");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(mobileNo, "mobileNo");
        Intrinsics.checkNotNullParameter(altMobileNo, "altMobileNo");
        Intrinsics.checkNotNullParameter(idMark1, "idMark1");
        Intrinsics.checkNotNullParameter(idMark2, "idMark2");
        Intrinsics.checkNotNullParameter(llToDlState, "llToDlState");
        Intrinsics.checkNotNullParameter(llToDlRto, "llToDlRto");
        Intrinsics.checkNotNullParameter(presState, "presState");
        Intrinsics.checkNotNullParameter(presDist, "presDist");
        Intrinsics.checkNotNullParameter(presSubDist, "presSubDist");
        Intrinsics.checkNotNullParameter(presPincode, "presPincode");
        Intrinsics.checkNotNullParameter(presHNo, "presHNo");
        Intrinsics.checkNotNullParameter(presVillTown, "presVillTown");
        Intrinsics.checkNotNullParameter(presStreet, "presStreet");
        Intrinsics.checkNotNullParameter(presCity, "presCity");
        Intrinsics.checkNotNullParameter(presLoc, "presLoc");
        Intrinsics.checkNotNullParameter(presSameAsPerm, "presSameAsPerm");
        Intrinsics.checkNotNullParameter(permState, "permState");
        Intrinsics.checkNotNullParameter(permDist, "permDist");
        Intrinsics.checkNotNullParameter(permSubDistr, "permSubDistr");
        Intrinsics.checkNotNullParameter(permPincode, "permPincode");
        Intrinsics.checkNotNullParameter(permHNo, "permHNo");
        Intrinsics.checkNotNullParameter(permVillOrTown, "permVillOrTown");
        Intrinsics.checkNotNullParameter(permStreet, "permStreet");
        Intrinsics.checkNotNullParameter(permCity, "permCity");
        Intrinsics.checkNotNullParameter(permLoc, "permLoc");
        Intrinsics.checkNotNullParameter(permStayMonth, "permStayMonth");
        Intrinsics.checkNotNullParameter(permStayYear, "permStayYear");
        Intrinsics.checkNotNullParameter(age, "age");
        Intrinsics.checkNotNullParameter(selectedCov, "selectedCov");
        Intrinsics.checkNotNullParameter(dSchoolList, "dSchoolList");
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = o(llNo, dob, llFromRTO1, llFromState1, aadharFlag, ekycId, userId, fName, mName, lName, relationType, relationFName, relationMName, relationLName, aadharNo, fullName, gender, dateOfBirth, nprNo, placeOfBirth, countryOfBirth, eduQual, bloodGroup, email, mobileNo, altMobileNo, idMark1, idMark2, llToDlState, llToDlRto, presState, presDist, presSubDist, presPincode, presHNo, presVillTown, presStreet, presCity, presLoc, presSameAsPerm, permState, permDist, permSubDistr, permPincode, permHNo, permVillOrTown, permStreet, permCity, permLoc, permStayMonth, permStayYear, age, z, z2, selectedCov, dSchoolList).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        lc5 lc5VarD = aVar.d(ls3VarB, string);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        this.d.c(lc5VarD, strValueOf).enqueue(new c(strValueOf, this));
    }
}
