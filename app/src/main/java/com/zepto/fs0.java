package com.zepto;

import android.util.Log;
import com.google.gson.Gson;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse;
import com.zepto.lc5;
import com.zepto.tu5;
import java.util.ArrayList;
import java.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes.dex */
public final class fs0 extends zq7 {
    public final cs0 d;
    public oy3 e;
    public final oy3 f;

    public static final class a implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ fs0 b;

        public a(Ref.ObjectRef objectRef, fs0 fs0Var) {
            this.a = objectRef;
            this.b = fs0Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.h().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.b.h().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) GetAckDetForGivenDLNumberResponse.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.i().k((GetAckDetForGivenDLNumberResponse) objFromJson);
        }
    }

    public fs0(cs0 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.d = repository;
        this.e = new oy3();
        this.f = new oy3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v82, types: [T, java.lang.String] */
    public final void g(boolean z, ArrayList covsArrayList, String bioRecGenesis, String allowAddrChangeAtDlservReqst, ArrayList multiListName, String agentId, String agentPwd, String agentIpAddress, String agentServiceName, String applcatgDLserReq, String dlHolderAltMobMum, String dlno, String dob, String rtoCodeDLTr, String willtoDonateOrgans, String relationType, String conDlReasonCode, String conDlReasonName, String dlHolderNaturalName, String conEffdate, String applFirstName, String applLastName, String relFirstName, String relLastName, String mobileNumber, String changeOfAddReq, String perHouseNo, String perStreet, String perLocation, String permVillageOrTown, String perSubDistrict, String perDistrict, String perState, String perPinCode, String presHouseNo, String presStreet, String presLocation, String presVillageOrTown, String presSubDistrict, String presDistrict, String presState, String presPincode, String dleDlReasonCode, String dleDlReasonName, String dupDlReasonName, String dupDlReasonCode, String applDateOfBirth, String codobDlReasonName, String codobDlReasonCode, String declaringcheck, String hillcertificate, String hillissueDate, String hillvalidFrom, String hillvalidTo, String hilldrivingschool, String hillissby, String pofbirth, String country, String passno, String passvaltill, String visano, String visavaltill, String tovisit, String iscountryrestricted, String countryRestrictedReason, String isDlSerdisqualified, String dlSerdisqualifiedReason, String forAdd1, String forAdd2, String forAdd3, String forAddPinCode, String forNationMobNum, String emailID, String appliedIdpfromIndEmb, String indEmbName, String embPlace, String dateOfVerifEmb, String embEndorseNo, String idpcountryapplyfrom, String eKYCId, String eKYCOpted, String eKYCGender, String eKYCapplicantPhoto) {
        Intrinsics.checkNotNullParameter(covsArrayList, "covsArrayList");
        Intrinsics.checkNotNullParameter(bioRecGenesis, "bioRecGenesis");
        Intrinsics.checkNotNullParameter(allowAddrChangeAtDlservReqst, "allowAddrChangeAtDlservReqst");
        Intrinsics.checkNotNullParameter(multiListName, "multiListName");
        Intrinsics.checkNotNullParameter(agentId, "agentId");
        Intrinsics.checkNotNullParameter(agentPwd, "agentPwd");
        Intrinsics.checkNotNullParameter(agentIpAddress, "agentIpAddress");
        Intrinsics.checkNotNullParameter(agentServiceName, "agentServiceName");
        Intrinsics.checkNotNullParameter(applcatgDLserReq, "applcatgDLserReq");
        Intrinsics.checkNotNullParameter(dlHolderAltMobMum, "dlHolderAltMobMum");
        Intrinsics.checkNotNullParameter(dlno, "dlno");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(rtoCodeDLTr, "rtoCodeDLTr");
        Intrinsics.checkNotNullParameter(willtoDonateOrgans, "willtoDonateOrgans");
        Intrinsics.checkNotNullParameter(relationType, "relationType");
        Intrinsics.checkNotNullParameter(conDlReasonCode, "conDlReasonCode");
        Intrinsics.checkNotNullParameter(conDlReasonName, "conDlReasonName");
        Intrinsics.checkNotNullParameter(dlHolderNaturalName, "dlHolderNaturalName");
        Intrinsics.checkNotNullParameter(conEffdate, "conEffdate");
        Intrinsics.checkNotNullParameter(applFirstName, "applFirstName");
        Intrinsics.checkNotNullParameter(applLastName, "applLastName");
        Intrinsics.checkNotNullParameter(relFirstName, "relFirstName");
        Intrinsics.checkNotNullParameter(relLastName, "relLastName");
        Intrinsics.checkNotNullParameter(mobileNumber, "mobileNumber");
        Intrinsics.checkNotNullParameter(changeOfAddReq, "changeOfAddReq");
        Intrinsics.checkNotNullParameter(perHouseNo, "perHouseNo");
        Intrinsics.checkNotNullParameter(perStreet, "perStreet");
        Intrinsics.checkNotNullParameter(perLocation, "perLocation");
        Intrinsics.checkNotNullParameter(permVillageOrTown, "permVillageOrTown");
        Intrinsics.checkNotNullParameter(perSubDistrict, "perSubDistrict");
        Intrinsics.checkNotNullParameter(perDistrict, "perDistrict");
        Intrinsics.checkNotNullParameter(perState, "perState");
        Intrinsics.checkNotNullParameter(perPinCode, "perPinCode");
        Intrinsics.checkNotNullParameter(presHouseNo, "presHouseNo");
        Intrinsics.checkNotNullParameter(presStreet, "presStreet");
        Intrinsics.checkNotNullParameter(presLocation, "presLocation");
        Intrinsics.checkNotNullParameter(presVillageOrTown, "presVillageOrTown");
        Intrinsics.checkNotNullParameter(presSubDistrict, "presSubDistrict");
        Intrinsics.checkNotNullParameter(presDistrict, "presDistrict");
        Intrinsics.checkNotNullParameter(presState, "presState");
        Intrinsics.checkNotNullParameter(presPincode, "presPincode");
        Intrinsics.checkNotNullParameter(dleDlReasonCode, "dleDlReasonCode");
        Intrinsics.checkNotNullParameter(dleDlReasonName, "dleDlReasonName");
        Intrinsics.checkNotNullParameter(dupDlReasonName, "dupDlReasonName");
        Intrinsics.checkNotNullParameter(dupDlReasonCode, "dupDlReasonCode");
        Intrinsics.checkNotNullParameter(applDateOfBirth, "applDateOfBirth");
        Intrinsics.checkNotNullParameter(codobDlReasonName, "codobDlReasonName");
        Intrinsics.checkNotNullParameter(codobDlReasonCode, "codobDlReasonCode");
        Intrinsics.checkNotNullParameter(declaringcheck, "declaringcheck");
        Intrinsics.checkNotNullParameter(hillcertificate, "hillcertificate");
        Intrinsics.checkNotNullParameter(hillissueDate, "hillissueDate");
        Intrinsics.checkNotNullParameter(hillvalidFrom, "hillvalidFrom");
        Intrinsics.checkNotNullParameter(hillvalidTo, "hillvalidTo");
        Intrinsics.checkNotNullParameter(hilldrivingschool, "hilldrivingschool");
        Intrinsics.checkNotNullParameter(hillissby, "hillissby");
        Intrinsics.checkNotNullParameter(pofbirth, "pofbirth");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(passno, "passno");
        Intrinsics.checkNotNullParameter(passvaltill, "passvaltill");
        Intrinsics.checkNotNullParameter(visano, "visano");
        Intrinsics.checkNotNullParameter(visavaltill, "visavaltill");
        Intrinsics.checkNotNullParameter(tovisit, "tovisit");
        Intrinsics.checkNotNullParameter(iscountryrestricted, "iscountryrestricted");
        Intrinsics.checkNotNullParameter(countryRestrictedReason, "countryRestrictedReason");
        Intrinsics.checkNotNullParameter(isDlSerdisqualified, "isDlSerdisqualified");
        Intrinsics.checkNotNullParameter(dlSerdisqualifiedReason, "dlSerdisqualifiedReason");
        Intrinsics.checkNotNullParameter(forAdd1, "forAdd1");
        Intrinsics.checkNotNullParameter(forAdd2, "forAdd2");
        Intrinsics.checkNotNullParameter(forAdd3, "forAdd3");
        Intrinsics.checkNotNullParameter(forAddPinCode, "forAddPinCode");
        Intrinsics.checkNotNullParameter(forNationMobNum, "forNationMobNum");
        Intrinsics.checkNotNullParameter(emailID, "emailID");
        Intrinsics.checkNotNullParameter(appliedIdpfromIndEmb, "appliedIdpfromIndEmb");
        Intrinsics.checkNotNullParameter(indEmbName, "indEmbName");
        Intrinsics.checkNotNullParameter(embPlace, "embPlace");
        Intrinsics.checkNotNullParameter(dateOfVerifEmb, "dateOfVerifEmb");
        Intrinsics.checkNotNullParameter(embEndorseNo, "embEndorseNo");
        Intrinsics.checkNotNullParameter(idpcountryapplyfrom, "idpcountryapplyfrom");
        Intrinsics.checkNotNullParameter(eKYCId, "eKYCId");
        Intrinsics.checkNotNullParameter(eKYCOpted, "eKYCOpted");
        Intrinsics.checkNotNullParameter(eKYCGender, "eKYCGender");
        Intrinsics.checkNotNullParameter(eKYCapplicantPhoto, "eKYCapplicantPhoto");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = es0.a.a(z, covsArrayList, bioRecGenesis, allowAddrChangeAtDlservReqst, multiListName, agentId, agentPwd, agentIpAddress, agentServiceName, applcatgDLserReq, dlHolderAltMobMum, dlno, dob, rtoCodeDLTr, willtoDonateOrgans, relationType, conDlReasonCode, conDlReasonName, dlHolderNaturalName, conEffdate, applFirstName, applLastName, relFirstName, relLastName, mobileNumber, changeOfAddReq, perHouseNo, perStreet, perLocation, permVillageOrTown, perSubDistrict, perDistrict, perState, perPinCode, presHouseNo, presStreet, presLocation, presVillageOrTown, presSubDistrict, presDistrict, presState, presPincode, dleDlReasonCode, dleDlReasonName, dupDlReasonName, dupDlReasonCode, applDateOfBirth, codobDlReasonName, codobDlReasonCode, declaringcheck, hillcertificate, hillissueDate, hillvalidFrom, hillvalidTo, hilldrivingschool, hillissby, pofbirth, country, passno, passvaltill, visano, visavaltill, tovisit, iscountryrestricted, countryRestrictedReason, isDlSerdisqualified, dlSerdisqualifiedReason, forAdd1, forAdd2, forAdd3, forAddPinCode, forNationMobNum, emailID, appliedIdpfromIndEmb, indEmbName, embPlace, dateOfVerifEmb, embEndorseNo, idpcountryapplyfrom, eKYCId, eKYCOpted, eKYCGender, eKYCapplicantPhoto).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        lc5 lc5VarD = aVar.d(ls3VarB, string);
        Log.d("RepCOA", lc5VarD.toString());
        this.d.a(lc5VarD, (String) objectRef.element).enqueue(new a(objectRef, this));
    }

    public final oy3 h() {
        return this.f;
    }

    public final oy3 i() {
        return this.e;
    }
}
