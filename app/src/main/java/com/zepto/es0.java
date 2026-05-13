package com.zepto;

import android.util.Log;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class es0 {
    public static final a a = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final JSONObject a(boolean z, ArrayList covsArrayList, String bioRecGenesis, String allowAddrChangeAtDlservReqst, ArrayList multiListName, String agentId, String agentPwd, String agentIpAddress, String agentServiceName, String applcatgDLserReq, String dlHolderAltMobMum, String dlno, String dob, String rtoCodeDLTr, String willtoDonateOrgans, String relationType, String conDlReasonCode, String conDlReasonName, String dlHolderNaturalName, String conEffdate, String applFirstName, String applLastName, String relFirstName, String relLastName, String mobileNumber, String changeOfAddReq, String perHouseNo, String perStreet, String perLocation, String permVillageOrTown, String perSubDistrict, String perDistrict, String perState, String perPinCode, String presHouseNo, String presStreet, String presLocation, String presVillageOrTown, String presSubDistrict, String presDistrict, String presState, String presPincode, String dleDlReasonCode, String dleDlReasonName, String dupDlReasonName, String dupDlReasonCode, String applDateOfBirth, String codobDlReasonName, String codobDlReasonCode, String declaringcheck, String hillcertificate, String hillissueDate, String hillvalidFrom, String hillvalidTo, String hilldrivingschool, String hillissby, String pofbirth, String country, String passno, String passvaltill, String visano, String visavaltill, String tovisit, String iscountryrestricted, String countryRestrictedReason, String isDlSerdisqualified, String dlSerdisqualifiedReason, String forAdd1, String forAdd2, String forAdd3, String forAddPinCode, String forNationMobNum, String emailID, String appliedIdpfromIndEmb, String indEmbName, String embPlace, String dateOfVerifEmb, String embEndorseNo, String idpcountryapplyfrom, String eKYCId, String eKYCOpted, String eKYCGender, String eKYCapplicantPhoto) throws JSONException {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
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
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("agentId", agentId);
            jSONObject.put("agentPwd", agentPwd);
            jSONObject.put("agentIpAddress", agentIpAddress);
            jSONObject.put("agentServiceName", agentServiceName);
            jSONObject.put("dlno", dlno);
            jSONObject.put("dob", dob);
            jSONObject.put("rtoCodeDLTr", rtoCodeDLTr);
            jSONObject.put("mobileNumber", mobileNumber);
            jSONObject.put("dlHolderAltMobMum", dlHolderAltMobMum);
            jSONObject.put("willtoDonateOrgans", willtoDonateOrgans);
            jSONObject.put("applcatgDLserReq", "G");
            jSONObject.put("changeOfAddReq", "B");
            if (Intrinsics.areEqual(eKYCOpted, "Y")) {
                jSONObject.put("eKYCId", eKYCId);
                jSONObject.put("eKYCOpted", eKYCOpted);
                jSONObject.put("eKYCGender", eKYCGender);
                jSONObject.put("eKYCapplicantPhoto", eKYCapplicantPhoto);
            }
            JSONObject jSONObject2 = new JSONObject();
            if (multiListName.contains("Issue of Duplicate DL")) {
                str3 = dupDlReasonCode;
                str4 = "dupDlReasonCode";
                jSONObject.put(str4, str3);
                str = "dupDlReasonName";
                str2 = dupDlReasonName;
                jSONObject.put(str, str2);
                jSONObject2.put("513", "Issue of Duplicate DL");
            } else {
                str = "dupDlReasonName";
                str2 = dupDlReasonName;
                str3 = dupDlReasonCode;
                str4 = "dupDlReasonCode";
            }
            if (multiListName.contains("Renewal of DL")) {
                jSONObject2.put("514", "Renewal of DL");
            }
            if (multiListName.contains("Re-Validation of Expired DL")) {
                JSONArray jSONArray = new JSONArray();
                int size = covsArrayList.size();
                for (int i = 0; i < size; i++) {
                    jSONArray.put(covsArrayList.get(i));
                }
                jSONObject.put("covsForRetest", jSONArray);
                jSONObject2.put("537", "Re-Validation of Expired DL");
            }
            if (multiListName.contains("Change of Address in DL")) {
                str5 = str3;
                jSONObject.put("perHouseNo", perHouseNo);
                str6 = str4;
                jSONObject.put("perStreet", perStreet);
                jSONObject.put("perLocation", perLocation);
                jSONObject.put("permVillageOrTown", permVillageOrTown);
                jSONObject.put("perSubDistrict", perSubDistrict);
                jSONObject.put("perDistrict", perDistrict);
                jSONObject.put("perState", perState);
                jSONObject.put("perPinCode", perPinCode);
                jSONObject.put("presHouseNo", presHouseNo);
                jSONObject.put("presStreet", presStreet);
                jSONObject.put("presLocation", presLocation);
                jSONObject.put("presVillageOrTown", presVillageOrTown);
                jSONObject.put("presSubDistrict", presSubDistrict);
                jSONObject.put("presDistrict", presDistrict);
                jSONObject.put("presState", presState);
                jSONObject.put("presPincode", presPincode);
                if (z || tx3.a.a()) {
                    jSONObject2.put("515", "Change of Address in DL");
                }
            } else {
                str5 = str3;
                str6 = str4;
            }
            if (multiListName.contains("Replacement of DL")) {
                jSONObject.put(str6, str5);
                jSONObject.put(str, str2);
                jSONObject2.put("516", "Replacement of DL");
            }
            if (multiListName.contains("DL Extract")) {
                jSONObject.put("dleDlReasonCode", dleDlReasonCode);
                jSONObject.put("dleDlReasonName", dleDlReasonName);
                jSONObject2.put("523", "DL Extract");
            }
            if (multiListName.contains("Endorsement to Drive in Hill Region")) {
                jSONObject.put("declaringcheck", declaringcheck);
                jSONObject.put("hillcertificate", hillcertificate);
                jSONObject.put("hillissueDate", hillissueDate);
                jSONObject.put("hillvalidFrom", hillvalidFrom);
                jSONObject.put("hillvalidTo", hillvalidTo);
                jSONObject.put("hilldrivingschool", hilldrivingschool);
                str7 = pofbirth;
                jSONObject.put("hillissby", hillissby);
                jSONObject2.put("524", "Endorsement to Drive in Hill Region");
            } else {
                str7 = pofbirth;
            }
            if (multiListName.contains("Change of Name in DL")) {
                jSONObject.put("relationType", relationType);
                jSONObject.put("conDlReasonCode", Integer.parseInt(conDlReasonCode));
                jSONObject.put("conDlReasonName", conDlReasonName);
                jSONObject.put("dlHolderNaturalName", dlHolderNaturalName);
                jSONObject.put("conEffdate", conEffdate);
                jSONObject.put("applFirstName", applFirstName);
                jSONObject.put("applLastName", applLastName);
                jSONObject.put("relFirstName", relFirstName);
                jSONObject.put("relLastName", relLastName);
                jSONObject2.put("526", "Change of Name in DL");
            }
            if (multiListName.contains("Change of Date of Birth in DL")) {
                jSONObject.put("codobDlReasonName", codobDlReasonName);
                jSONObject.put("codobDlReasonCode", codobDlReasonCode);
                jSONObject.put("applDateOfBirth", applDateOfBirth);
                jSONObject2.put("548", "Change of Date of Birth in DL");
            }
            if (multiListName.contains("International Driving Permit")) {
                jSONObject.put("pofbirth", str7);
                jSONObject.put("country", country);
                jSONObject.put("passno", passno);
                jSONObject.put("passvaltill", passvaltill);
                jSONObject.put("visano", visano);
                jSONObject.put("visavaltill", visavaltill);
                jSONObject.put("tovisit", tovisit);
                jSONObject.put("iscountryrestricted", iscountryrestricted);
                jSONObject.put("countryRestrictedReason", countryRestrictedReason);
                jSONObject.put("isDlSerdisqualified", isDlSerdisqualified);
                jSONObject.put("dlSerdisqualifiedReason", dlSerdisqualifiedReason);
                jSONObject.put("forAdd1", forAdd1);
                jSONObject.put("forAdd2", forAdd2);
                jSONObject.put("forAdd3", forAdd3);
                jSONObject.put("forAddPinCode", forAddPinCode);
                jSONObject.put("forNationMobNum", forNationMobNum);
                jSONObject.put("emailID", emailID);
                jSONObject.put("appliedIdpfromIndEmb", appliedIdpfromIndEmb);
                jSONObject.put("indEmbName", indEmbName);
                jSONObject.put("dateOfVerifEmb", dateOfVerifEmb);
                jSONObject.put("embPlace", embPlace);
                jSONObject.put("embEndorseNo", embEndorseNo);
                jSONObject.put("idpcountryapplyfrom", idpcountryapplyfrom);
                jSONObject2.put("525", "International Driving Permit");
            }
            jSONObject.put("selectedDLSerList", jSONObject2);
            Log.d("request_data", jSONObject.toString());
            return jSONObject;
        }
    }
}
