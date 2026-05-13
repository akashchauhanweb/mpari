package com.zepto;

import android.util.Log;
import com.google.gson.Gson;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.dlservices.newlearner.DataClass.CampResponseModal;
import com.nic.mparivahan.dlservices.newlearner.DataClass.CheckPhotoSignResponseModal;
import com.nic.mparivahan.dlservices.newlearner.DataClass.DownloadLLResponseModal;
import com.nic.mparivahan.dlservices.newlearner.DataClass.SubmittedLLResponseModal;
import com.nic.mparivahan.dlservices.ui.newlearner.DataClass.BloodGroupResponseModal;
import com.nic.mparivahan.dlservices.ui.newlearner.DataClass.CountryResponseModal;
import com.nic.mparivahan.dlservices.ui.newlearner.DataClass.DrivingSchoolResponseModal;
import com.nic.mparivahan.dlservices.ui.newlearner.DataClass.EducationQualResponseModal;
import com.nic.mparivahan.dlservices.ui.newlearner.DataClass.LearnerLicenceClassResponseModal;
import com.zepto.lc5;
import com.zepto.tu5;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Random;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes2.dex */
public final class j94 extends zq7 {
    public final i94 d;
    public final oy3 e;
    public final oy3 f;
    public final oy3 g;
    public final oy3 h;
    public final oy3 i;
    public final oy3 j;
    public final oy3 k;
    public final oy3 l;
    public final oy3 m;
    public final oy3 n;

    public static final class a implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ j94 b;

        public a(String str, j94 j94Var) {
            this.a = str;
            this.b = j94Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.w().k("error");
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
                Log.d("submit_response", strValueOf);
                Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) CheckPhotoSignResponseModal.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                Log.d("response", String.valueOf(response.body()));
                this.b.m().k((CheckPhotoSignResponseModal) objFromJson);
            } catch (Exception unused) {
                this.b.w().k("error");
            }
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ j94 b;

        public b(String str, j94 j94Var) {
            this.a = str;
            this.b = j94Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.w().k("error");
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
                Log.d("submit_response", strValueOf);
                Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) DownloadLLResponseModal.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                Log.d("response", String.valueOf(response.body()));
                this.b.q().k((DownloadLLResponseModal) objFromJson);
            } catch (Exception e) {
                e.printStackTrace();
                this.b.w().k("error");
            }
        }
    }

    public static final class c implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ j94 b;

        public c(String str, j94 j94Var) {
            this.a = str;
            this.b = j94Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.w().k("error");
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
                Log.d("submit_response", strValueOf);
                Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) CampResponseModal.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                Log.d("response", String.valueOf(response.body()));
                this.b.l().k((CampResponseModal) objFromJson);
            } catch (Exception e) {
                e.printStackTrace();
                this.b.w().k("error");
            }
        }
    }

    public static final class d implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ j94 b;

        public d(String str, j94 j94Var) {
            this.a = str;
            this.b = j94Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.w().k("error");
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
                Log.d("submit_response", strValueOf);
                Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) BloodGroupResponseModal.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                Log.d("response", String.valueOf(response.body()));
                this.b.k().k((BloodGroupResponseModal) objFromJson);
            } catch (Exception unused) {
                this.b.w().k("error");
            }
        }
    }

    public static final class e implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ j94 b;

        public e(String str, j94 j94Var) {
            this.a = str;
            this.b = j94Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.w().k("error");
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
                Log.d("submit_response", strValueOf);
                Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) CountryResponseModal.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                Log.d("response", String.valueOf(response.body()));
                this.b.p().k((CountryResponseModal) objFromJson);
            } catch (Exception unused) {
                this.b.w().k("error");
            }
        }
    }

    public static final class f implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ j94 b;

        public f(String str, j94 j94Var) {
            this.a = str;
            this.b = j94Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.w().k("error");
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
                Log.d("submit_response", strValueOf);
                Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) DrivingSchoolResponseModal.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                Log.d("response", String.valueOf(response.body()));
                this.b.s().k((DrivingSchoolResponseModal) objFromJson);
            } catch (Exception unused) {
                this.b.w().k("error");
            }
        }
    }

    public static final class g implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ j94 b;

        public g(String str, j94 j94Var) {
            this.a = str;
            this.b = j94Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.w().k("error");
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
                Log.d("submit_response", strValueOf);
                Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) EducationQualResponseModal.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                Log.d("response", String.valueOf(response.body()));
                this.b.u().k((EducationQualResponseModal) objFromJson);
            } catch (Exception unused) {
                this.b.w().k("error");
            }
        }
    }

    public static final class h implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ j94 b;

        public h(String str, j94 j94Var) {
            this.a = str;
            this.b = j94Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.w().k("error");
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
                Log.d("submit_response", strValueOf);
                Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) LearnerLicenceClassResponseModal.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                Log.d("response", String.valueOf(response.body()));
                this.b.C().k((LearnerLicenceClassResponseModal) objFromJson);
            } catch (Exception unused) {
                this.b.w().k("error");
            }
        }
    }

    public static final class i implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ j94 b;

        public i(String str, j94 j94Var) {
            this.a = str;
            this.b = j94Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.w().k("error");
            String message = t.getMessage();
            Intrinsics.checkNotNull(message);
            Log.e("Exception", message);
            String localizedMessage = t.getLocalizedMessage();
            Intrinsics.checkNotNull(localizedMessage);
            Log.e("Local Msg", localizedMessage);
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
                Log.d("submit_response", strValueOf);
                Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) SubmittedLLResponseModal.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                Log.d("response", String.valueOf(response.body()));
                this.b.D().k((SubmittedLLResponseModal) objFromJson);
            } catch (Exception e) {
                String message = e.getMessage();
                Intrinsics.checkNotNull(message);
                Log.e("Exception", message);
                String localizedMessage = e.getLocalizedMessage();
                Intrinsics.checkNotNull(localizedMessage);
                Log.e("Local Msg", localizedMessage);
                this.b.w().k("error");
            }
        }
    }

    public j94(i94 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.d = repository;
        this.e = new oy3();
        this.f = new oy3();
        this.g = new oy3();
        this.h = new oy3();
        this.i = new oy3();
        this.j = new oy3();
        this.k = new oy3();
        this.l = new oy3();
        this.m = new oy3();
        this.n = new oy3();
    }

    public final JSONObject A(String rtoCampValue) {
        Intrinsics.checkNotNullParameter(rtoCampValue, "rtoCampValue");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cmRtoCode", rtoCampValue);
            jSONObject.put("agentId", "mobSARATHI");
            jSONObject.put("agentIpAddress", "10.248.210.8");
            jSONObject.put("agentServiceName", "sarathiservice");
            jSONObject.put("agentPwd", "657d1c758e2e95af0014e16f5109f933");
            Log.v("Driving School", jSONObject.toString());
            return jSONObject;
        } catch (Exception e2) {
            e2.printStackTrace();
            return new JSONObject();
        }
    }

    public final JSONObject B(String applNo) {
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("aiApplno", applNo);
            return jSONObject;
        } catch (Exception e2) {
            e2.printStackTrace();
            return new JSONObject();
        }
    }

    public final oy3 C() {
        return this.e;
    }

    public final oy3 D() {
        return this.j;
    }

    public final void E(String stateCd, String rtoCd, String applicationFName, String applicationMName, String applicationSName, String relationType, String relationFName, String relationMName, String relationLName, String fullName, String gender, String dob, String birthPlace, String countryCd, String eduQualification, String bloodGroup, String landlineNo, String emailId, String mobileNo, String altMobileNo, String idMark1, String idMark2, String preState, String preDistrict, String preSubDist, String preVillageName, String preTownName, String preHouseNo, String preStreet, String prePinCode, String preYear, String preMonth, String perState, String perDist, String perSubDist, String perVillage, String perTown, String perHouseNo, String perStreet, String perPinCd, ArrayList covList, String organsDonation, String presVillageOrTown, String perVillageOrTown, String fromDSchool, String applCatg, JSONArray drivingSchoolDetails, String ekycId, boolean z, String aadhaarPhoto, String form1Value, String cmCampDesc, String cmType, JSONArray form1SubmittedValue) {
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        Intrinsics.checkNotNullParameter(rtoCd, "rtoCd");
        Intrinsics.checkNotNullParameter(applicationFName, "applicationFName");
        Intrinsics.checkNotNullParameter(applicationMName, "applicationMName");
        Intrinsics.checkNotNullParameter(applicationSName, "applicationSName");
        Intrinsics.checkNotNullParameter(relationType, "relationType");
        Intrinsics.checkNotNullParameter(relationFName, "relationFName");
        Intrinsics.checkNotNullParameter(relationMName, "relationMName");
        Intrinsics.checkNotNullParameter(relationLName, "relationLName");
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(birthPlace, "birthPlace");
        Intrinsics.checkNotNullParameter(countryCd, "countryCd");
        Intrinsics.checkNotNullParameter(eduQualification, "eduQualification");
        Intrinsics.checkNotNullParameter(bloodGroup, "bloodGroup");
        Intrinsics.checkNotNullParameter(landlineNo, "landlineNo");
        Intrinsics.checkNotNullParameter(emailId, "emailId");
        Intrinsics.checkNotNullParameter(mobileNo, "mobileNo");
        Intrinsics.checkNotNullParameter(altMobileNo, "altMobileNo");
        Intrinsics.checkNotNullParameter(idMark1, "idMark1");
        Intrinsics.checkNotNullParameter(idMark2, "idMark2");
        Intrinsics.checkNotNullParameter(preState, "preState");
        Intrinsics.checkNotNullParameter(preDistrict, "preDistrict");
        Intrinsics.checkNotNullParameter(preSubDist, "preSubDist");
        Intrinsics.checkNotNullParameter(preVillageName, "preVillageName");
        Intrinsics.checkNotNullParameter(preTownName, "preTownName");
        Intrinsics.checkNotNullParameter(preHouseNo, "preHouseNo");
        Intrinsics.checkNotNullParameter(preStreet, "preStreet");
        Intrinsics.checkNotNullParameter(prePinCode, "prePinCode");
        Intrinsics.checkNotNullParameter(preYear, "preYear");
        Intrinsics.checkNotNullParameter(preMonth, "preMonth");
        Intrinsics.checkNotNullParameter(perState, "perState");
        Intrinsics.checkNotNullParameter(perDist, "perDist");
        Intrinsics.checkNotNullParameter(perSubDist, "perSubDist");
        Intrinsics.checkNotNullParameter(perVillage, "perVillage");
        Intrinsics.checkNotNullParameter(perTown, "perTown");
        Intrinsics.checkNotNullParameter(perHouseNo, "perHouseNo");
        Intrinsics.checkNotNullParameter(perStreet, "perStreet");
        Intrinsics.checkNotNullParameter(perPinCd, "perPinCd");
        Intrinsics.checkNotNullParameter(covList, "covList");
        Intrinsics.checkNotNullParameter(organsDonation, "organsDonation");
        Intrinsics.checkNotNullParameter(presVillageOrTown, "presVillageOrTown");
        Intrinsics.checkNotNullParameter(perVillageOrTown, "perVillageOrTown");
        Intrinsics.checkNotNullParameter(fromDSchool, "fromDSchool");
        Intrinsics.checkNotNullParameter(applCatg, "applCatg");
        Intrinsics.checkNotNullParameter(drivingSchoolDetails, "drivingSchoolDetails");
        Intrinsics.checkNotNullParameter(ekycId, "ekycId");
        Intrinsics.checkNotNullParameter(aadhaarPhoto, "aadhaarPhoto");
        Intrinsics.checkNotNullParameter(form1Value, "form1Value");
        Intrinsics.checkNotNullParameter(cmCampDesc, "cmCampDesc");
        Intrinsics.checkNotNullParameter(cmType, "cmType");
        Intrinsics.checkNotNullParameter(form1SubmittedValue, "form1SubmittedValue");
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = y(stateCd, rtoCd, applicationFName, applicationMName, applicationSName, relationType, relationFName, relationMName, relationLName, fullName, gender, dob, birthPlace, countryCd, eduQualification, bloodGroup, landlineNo, emailId, mobileNo, altMobileNo, idMark1, idMark2, preState, preDistrict, preSubDist, preVillageName, preTownName, preHouseNo, preStreet, prePinCode, preYear, preMonth, perState, perDist, perSubDist, perVillage, perTown, perHouseNo, perStreet, perPinCd, covList, organsDonation, presVillageOrTown, perVillageOrTown, fromDSchool, applCatg, drivingSchoolDetails, ekycId, z, aadhaarPhoto, form1Value, cmCampDesc, cmType, form1SubmittedValue).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        lc5 lc5VarD = aVar.d(ls3VarB, string);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        this.d.h(lc5VarD, strValueOf).enqueue(new i(strValueOf, this));
    }

    public final void g(String applicationNo) {
        Intrinsics.checkNotNullParameter(applicationNo, "applicationNo");
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = B(applicationNo).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        lc5 lc5VarD = aVar.d(ls3VarB, string);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        this.d.a(lc5VarD, strValueOf).enqueue(new a(strValueOf, this));
    }

    public final void h(String applicationNo, String dob) {
        Intrinsics.checkNotNullParameter(applicationNo, "applicationNo");
        Intrinsics.checkNotNullParameter(dob, "dob");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("applno", applicationNo);
            jSONObject.put("dob", dob);
            lc5.a aVar = lc5.Companion;
            ls3 ls3VarB = ls3.g.b("application/json");
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            lc5 lc5VarD = aVar.d(ls3VarB, string);
            String strValueOf = String.valueOf(System.currentTimeMillis());
            this.d.i(lc5VarD, strValueOf).enqueue(new b(strValueOf, this));
        } catch (Exception e2) {
            e2.printStackTrace();
            this.n.k("error");
        }
    }

    public final void i(String rtoCd) {
        Intrinsics.checkNotNullParameter(rtoCd, "rtoCd");
        try {
            lc5.a aVar = lc5.Companion;
            ls3 ls3VarB = ls3.g.b("application/json");
            String string = A(rtoCd).toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            lc5 lc5VarD = aVar.d(ls3VarB, string);
            String strValueOf = String.valueOf(System.currentTimeMillis());
            this.d.c(lc5VarD, strValueOf).enqueue(new c(strValueOf, this));
        } catch (Exception e2) {
            e2.printStackTrace();
            this.n.k("error");
        }
    }

    public final void j() {
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = n().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        lc5 lc5VarD = aVar.d(ls3VarB, string);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        this.d.b(lc5VarD, strValueOf).enqueue(new d(strValueOf, this));
    }

    public final oy3 k() {
        return this.i;
    }

    public final oy3 l() {
        return this.m;
    }

    public final oy3 m() {
        return this.k;
    }

    public final JSONObject n() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("agentId", "mobSARATHI");
            jSONObject.put("agentIpAddress", "10.248.210.8");
            jSONObject.put("agentServiceName", "sarathiservice");
            jSONObject.put("agentPwd", "657d1c758e2e95af0014e16f5109f933");
            return jSONObject;
        } catch (Exception e2) {
            e2.printStackTrace();
            return new JSONObject();
        }
    }

    public final void o() {
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = n().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        lc5 lc5VarD = aVar.d(ls3VarB, string);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        this.d.d(lc5VarD, strValueOf).enqueue(new e(strValueOf, this));
    }

    public final oy3 p() {
        return this.g;
    }

    public final oy3 q() {
        return this.l;
    }

    public final void r(String stateCd) {
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = t(stateCd).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        lc5 lc5VarD = aVar.d(ls3VarB, string);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        this.d.e(lc5VarD, strValueOf).enqueue(new f(strValueOf, this));
    }

    public final oy3 s() {
        return this.f;
    }

    public final JSONObject t(String stateCd) {
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("stCode", stateCd);
            jSONObject.put("agentId", "mobSARATHI");
            jSONObject.put("agentIpAddress", "10.248.210.8");
            jSONObject.put("agentServiceName", "sarathiservice");
            jSONObject.put("agentPwd", "657d1c758e2e95af0014e16f5109f933");
            Log.v("Driving School", jSONObject.toString());
            return jSONObject;
        } catch (Exception e2) {
            e2.printStackTrace();
            return new JSONObject();
        }
    }

    public final oy3 u() {
        return this.h;
    }

    public final void v() {
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = n().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        lc5 lc5VarD = aVar.d(ls3VarB, string);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        this.d.f(lc5VarD, strValueOf).enqueue(new g(strValueOf, this));
    }

    public final oy3 w() {
        return this.n;
    }

    public final void x(String stateCd, int i2, int i3, String applCatg) {
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        Intrinsics.checkNotNullParameter(applCatg, "applCatg");
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = z(stateCd, i2, i3, applCatg).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        lc5 lc5VarD = aVar.d(ls3VarB, string);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        this.d.g(lc5VarD, strValueOf).enqueue(new h(strValueOf, this));
    }

    public final JSONObject y(String stateCd, String rtoCd, String applicationFName, String applicationMName, String applicationSName, String relationType, String relationFName, String relationMName, String relationLName, String fullName, String gender, String dob, String birthPlace, String countryCd, String eduQualification, String bloodGroup, String landlineNo, String emailId, String mobileNo, String altMobileNo, String idMark1, String idMark2, String preState, String preDistrict, String preSubDist, String preVillageName, String preTownName, String preHouseNo, String preStreet, String prePinCode, String preYear, String preMonth, String perState, String perDist, String perSubDist, String perVillage, String perTown, String perHouseNo, String perStreet, String perPinCd, ArrayList arrayList, String organsDonation, String presVillageOrTown, String perVillageOrTown, String fromDSchool, String applCatg, JSONArray drivingSchoolDetails, String ekycId, boolean z, String aadhaarPhoto, String form1Value, String cmCampDesc, String cmType, JSONArray form1SubmittedValue) {
        BigInteger bigInteger;
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        Intrinsics.checkNotNullParameter(rtoCd, "rtoCd");
        Intrinsics.checkNotNullParameter(applicationFName, "applicationFName");
        Intrinsics.checkNotNullParameter(applicationMName, "applicationMName");
        Intrinsics.checkNotNullParameter(applicationSName, "applicationSName");
        Intrinsics.checkNotNullParameter(relationType, "relationType");
        Intrinsics.checkNotNullParameter(relationFName, "relationFName");
        Intrinsics.checkNotNullParameter(relationMName, "relationMName");
        Intrinsics.checkNotNullParameter(relationLName, "relationLName");
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(birthPlace, "birthPlace");
        Intrinsics.checkNotNullParameter(countryCd, "countryCd");
        Intrinsics.checkNotNullParameter(eduQualification, "eduQualification");
        Intrinsics.checkNotNullParameter(bloodGroup, "bloodGroup");
        Intrinsics.checkNotNullParameter(landlineNo, "landlineNo");
        Intrinsics.checkNotNullParameter(emailId, "emailId");
        Intrinsics.checkNotNullParameter(mobileNo, "mobileNo");
        Intrinsics.checkNotNullParameter(altMobileNo, "altMobileNo");
        Intrinsics.checkNotNullParameter(idMark1, "idMark1");
        Intrinsics.checkNotNullParameter(idMark2, "idMark2");
        Intrinsics.checkNotNullParameter(preState, "preState");
        Intrinsics.checkNotNullParameter(preDistrict, "preDistrict");
        Intrinsics.checkNotNullParameter(preSubDist, "preSubDist");
        Intrinsics.checkNotNullParameter(preVillageName, "preVillageName");
        Intrinsics.checkNotNullParameter(preTownName, "preTownName");
        Intrinsics.checkNotNullParameter(preHouseNo, "preHouseNo");
        Intrinsics.checkNotNullParameter(preStreet, "preStreet");
        Intrinsics.checkNotNullParameter(prePinCode, "prePinCode");
        Intrinsics.checkNotNullParameter(preYear, "preYear");
        Intrinsics.checkNotNullParameter(preMonth, "preMonth");
        Intrinsics.checkNotNullParameter(perState, "perState");
        Intrinsics.checkNotNullParameter(perDist, "perDist");
        Intrinsics.checkNotNullParameter(perSubDist, "perSubDist");
        Intrinsics.checkNotNullParameter(perVillage, "perVillage");
        Intrinsics.checkNotNullParameter(perTown, "perTown");
        Intrinsics.checkNotNullParameter(perHouseNo, "perHouseNo");
        Intrinsics.checkNotNullParameter(perStreet, "perStreet");
        Intrinsics.checkNotNullParameter(perPinCd, "perPinCd");
        ArrayList covList = arrayList;
        Intrinsics.checkNotNullParameter(covList, "covList");
        Intrinsics.checkNotNullParameter(organsDonation, "organsDonation");
        Intrinsics.checkNotNullParameter(presVillageOrTown, "presVillageOrTown");
        Intrinsics.checkNotNullParameter(perVillageOrTown, "perVillageOrTown");
        Intrinsics.checkNotNullParameter(fromDSchool, "fromDSchool");
        Intrinsics.checkNotNullParameter(applCatg, "applCatg");
        Intrinsics.checkNotNullParameter(drivingSchoolDetails, "drivingSchoolDetails");
        Intrinsics.checkNotNullParameter(ekycId, "ekycId");
        Intrinsics.checkNotNullParameter(aadhaarPhoto, "aadhaarPhoto");
        Intrinsics.checkNotNullParameter(form1Value, "form1Value");
        Intrinsics.checkNotNullParameter(cmCampDesc, "cmCampDesc");
        Intrinsics.checkNotNullParameter(cmType, "cmType");
        Intrinsics.checkNotNullParameter(form1SubmittedValue, "form1SubmittedValue");
        try {
            Random random = new Random();
            while (true) {
                bigInteger = new BigInteger(60, random);
                Random random2 = random;
                if (bigInteger.toString().length() == 18) {
                    break;
                }
                covList = arrayList;
                random = random2;
            }
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray(new Gson().toJson(covList));
            jSONObject.put("agentId", "mobSARATHI");
            jSONObject.put("agentIpAddress", "10.248.210.8");
            jSONObject.put("agentServiceName", "sarathiservice");
            jSONObject.put("agentPwd", "657d1c758e2e95af0014e16f5109f933");
            jSONObject.put("licenseType", "newLicence");
            jSONObject.put("stCode", stateCd);
            jSONObject.put("rtoCode", rtoCd);
            jSONObject.put("applFirstName", applicationFName);
            jSONObject.put("applMiddleName", applicationMName);
            jSONObject.put("applLastName", applicationSName);
            jSONObject.put("relationType", relationType);
            jSONObject.put("relFirstName", relationFName);
            jSONObject.put("relMiddleName", relationMName);
            jSONObject.put("relLastName", relationLName);
            jSONObject.put("applFullName", fullName);
            jSONObject.put("gender", gender);
            jSONObject.put("applDateOfBirth", dob);
            jSONObject.put("applBirthPlace", birthPlace);
            jSONObject.put("applBirthCountry", countryCd);
            jSONObject.put("eduQual", eduQualification);
            jSONObject.put("bloodGroup", bloodGroup);
            jSONObject.put("phoneNumber", landlineNo);
            jSONObject.put("email", emailId);
            jSONObject.put("mobileNumber", mobileNo);
            if (Intrinsics.areEqual(ekycId, "0")) {
                jSONObject.put("aadhaarMobileNumber", "");
            } else {
                jSONObject.put("aadhaarMobileNumber", mobileNo);
            }
            jSONObject.put("altMobileNumber", altMobileNo);
            jSONObject.put("idMarks1", idMark1);
            jSONObject.put("idMarks2", idMark2);
            jSONObject.put("presState", preState);
            jSONObject.put("presDistrict", preDistrict);
            jSONObject.put("presSubDistrict", preSubDist);
            jSONObject.put("presVillageName", preVillageName);
            jSONObject.put("presTownName", preTownName);
            jSONObject.put("presHouseNo", preHouseNo);
            jSONObject.put("presStreet", preStreet);
            jSONObject.put("presPincode", prePinCode);
            jSONObject.put("presAddrDurYears", preYear);
            jSONObject.put("presAddrDurMonths", preMonth);
            jSONObject.put("perState", perState);
            jSONObject.put("perDistrict", perDist);
            jSONObject.put("perSubDistrict", perSubDist);
            jSONObject.put("perVillageName", perVillage);
            jSONObject.put("perTownName", perTown);
            jSONObject.put("perHouseNo", perHouseNo);
            jSONObject.put("perStreet", perStreet);
            jSONObject.put("perPincode", perPinCd);
            jSONObject.put("selectedCovsList", jSONArray);
            jSONObject.put("organsDonation", organsDonation);
            jSONObject.put("presVillageOrTown", presVillageOrTown);
            jSONObject.put("permVillageOrTown", perVillageOrTown);
            jSONObject.put("fromDschool", fromDSchool);
            jSONObject.put("applCatg", applCatg);
            jSONObject.put("eKycFlag", z);
            jSONObject.put("applAddress", "");
            jSONObject.put("applAddress1", "");
            jSONObject.put("applAddress2", "");
            jSONObject.put("cmCampDesc", cmCampDesc);
            jSONObject.put("cmType", cmType);
            jSONObject.put("form1Enable", form1Value);
            jSONObject.put("formOneDetails", form1SubmittedValue);
            jSONObject.put("dsTrainedCovsDetails", drivingSchoolDetails);
            jSONObject.put("applicantPhoto", aadhaarPhoto);
            jSONObject.put("eKycId", bigInteger);
            return jSONObject;
        } catch (Exception e2) {
            e2.printStackTrace();
            return new JSONObject();
        }
    }

    public final JSONObject z(String stateCd, int i2, int i3, String applCat) {
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        Intrinsics.checkNotNullParameter(applCat, "applCat");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("stCode", stateCd);
            jSONObject.put("age", i2);
            jSONObject.put("eduQual", i3);
            jSONObject.put("applicantCatg", applCat);
            jSONObject.put("agentId", "mobSARATHI");
            jSONObject.put("agentIpAddress", "10.248.210.8");
            jSONObject.put("agentServiceName", "sarathiservice");
            jSONObject.put("agentPwd", "657d1c758e2e95af0014e16f5109f933");
            Log.v("Req Cov", jSONObject.toString());
            return jSONObject;
        } catch (Exception e2) {
            e2.printStackTrace();
            return new JSONObject();
        }
    }
}
