package com.zepto;

import android.util.Log;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class cz5 {
    public static final a a = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final JSONObject a(String stateCodeDLTr) throws JSONException {
            Intrinsics.checkNotNullParameter(stateCodeDLTr, "stateCodeDLTr");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("agentId", "mobSARATHI");
            jSONObject.put("agentPwd", "657d1c758e2e95af0014e16f5109f933");
            jSONObject.put("agentIpAddress", "10.248.210.8");
            jSONObject.put("agentServiceName", "sarathiservice");
            return jSONObject;
        }

        public final JSONObject b(String appNumber, String dob) throws JSONException {
            Intrinsics.checkNotNullParameter(appNumber, "appNumber");
            Intrinsics.checkNotNullParameter(dob, "dob");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("agentId", "mobSARATHI");
            jSONObject.put("agentPwd", "657d1c758e2e95af0014e16f5109f933");
            jSONObject.put("agentIpAddress", "10.246.82.159");
            jSONObject.put("agentServiceName", "sarathiservice");
            jSONObject.put("applNo", appNumber);
            jSONObject.put("dob", dob);
            return jSONObject;
        }

        public final JSONObject c(String clState, String clRto, String permHouseNo, String permStreet, String permLocation, String permPinCode, String presHouseNo, String presStreet, String presLocation, String presPinCode, String permDistrict, String permVillageOrTown, String presDistrict, String presVillageOrTown, String permSubDistrict, String presSubDistrict, String serviceCode, String clNumber, String dateOfBirth) throws JSONException {
            Intrinsics.checkNotNullParameter(clState, "clState");
            Intrinsics.checkNotNullParameter(clRto, "clRto");
            Intrinsics.checkNotNullParameter(permHouseNo, "permHouseNo");
            Intrinsics.checkNotNullParameter(permStreet, "permStreet");
            Intrinsics.checkNotNullParameter(permLocation, "permLocation");
            Intrinsics.checkNotNullParameter(permPinCode, "permPinCode");
            Intrinsics.checkNotNullParameter(presHouseNo, "presHouseNo");
            Intrinsics.checkNotNullParameter(presStreet, "presStreet");
            Intrinsics.checkNotNullParameter(presLocation, "presLocation");
            Intrinsics.checkNotNullParameter(presPinCode, "presPinCode");
            Intrinsics.checkNotNullParameter(permDistrict, "permDistrict");
            Intrinsics.checkNotNullParameter(permVillageOrTown, "permVillageOrTown");
            Intrinsics.checkNotNullParameter(presDistrict, "presDistrict");
            Intrinsics.checkNotNullParameter(presVillageOrTown, "presVillageOrTown");
            Intrinsics.checkNotNullParameter(permSubDistrict, "permSubDistrict");
            Intrinsics.checkNotNullParameter(presSubDistrict, "presSubDistrict");
            Intrinsics.checkNotNullParameter(serviceCode, "serviceCode");
            Intrinsics.checkNotNullParameter(clNumber, "clNumber");
            Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clState", clState);
            jSONObject.put("clRto", clRto);
            jSONObject.put("permHouseNo", permHouseNo);
            jSONObject.put("permStreet", permStreet);
            jSONObject.put("permLocation", permLocation);
            jSONObject.put("permPinCode", permPinCode);
            jSONObject.put("presHouseNo", presHouseNo);
            jSONObject.put("presStreet", presStreet);
            jSONObject.put("presLocation", presLocation);
            jSONObject.put("presPinCode", presPinCode);
            jSONObject.put("permDistrict", permDistrict);
            jSONObject.put("permVillageOrTown", permVillageOrTown);
            jSONObject.put("presDistrict", presDistrict);
            jSONObject.put("presVillageOrTown", presVillageOrTown);
            jSONObject.put("permSubDistrict", permSubDistrict);
            jSONObject.put("presSubDistrict", presSubDistrict);
            jSONObject.put("serviceCode", serviceCode);
            jSONObject.put("clNumber", clNumber);
            jSONObject.put("dateOfBirth", dateOfBirth);
            return jSONObject;
        }

        public final JSONObject d(String clState, String clRto, String fname, String mname, String lname, String swdfName, String swdmName, String swdlName, String relationTypeEntry, String fullName, String swdFullName, String serviceCode, String clNumber, String dateOfBirth) throws JSONException {
            Intrinsics.checkNotNullParameter(clState, "clState");
            Intrinsics.checkNotNullParameter(clRto, "clRto");
            Intrinsics.checkNotNullParameter(fname, "fname");
            Intrinsics.checkNotNullParameter(mname, "mname");
            Intrinsics.checkNotNullParameter(lname, "lname");
            Intrinsics.checkNotNullParameter(swdfName, "swdfName");
            Intrinsics.checkNotNullParameter(swdmName, "swdmName");
            Intrinsics.checkNotNullParameter(swdlName, "swdlName");
            Intrinsics.checkNotNullParameter(relationTypeEntry, "relationTypeEntry");
            Intrinsics.checkNotNullParameter(fullName, "fullName");
            Intrinsics.checkNotNullParameter(swdFullName, "swdFullName");
            Intrinsics.checkNotNullParameter(serviceCode, "serviceCode");
            Intrinsics.checkNotNullParameter(clNumber, "clNumber");
            Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clState", clState);
            jSONObject.put("clRto", clRto);
            jSONObject.put("fname", fname);
            jSONObject.put("mname", mname);
            jSONObject.put("lname", lname);
            jSONObject.put("swdfName", swdfName);
            jSONObject.put("swdmName", swdmName);
            jSONObject.put("swdlName", swdlName);
            jSONObject.put("relationTypeEntry", relationTypeEntry);
            jSONObject.put("fullName", fullName);
            jSONObject.put("swdFullName", swdFullName);
            jSONObject.put("fullName", fullName);
            jSONObject.put("serviceCode", serviceCode);
            jSONObject.put("clNumber", clNumber);
            jSONObject.put("dateOfBirth", dateOfBirth);
            return jSONObject;
        }

        public final JSONObject e(String stateCd, int i, String adharRtoCode) throws JSONException {
            Intrinsics.checkNotNullParameter(stateCd, "stateCd");
            Intrinsics.checkNotNullParameter(adharRtoCode, "adharRtoCode");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("stateCd", stateCd);
            jSONObject.put("serviceCd", i);
            jSONObject.put("rtoCode", adharRtoCode);
            Log.d("checkAdharRequest", jSONObject.toString());
            return jSONObject;
        }

        public final JSONObject f(String appNumber, String dob) throws JSONException {
            Intrinsics.checkNotNullParameter(appNumber, "appNumber");
            Intrinsics.checkNotNullParameter(dob, "dob");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("agentId", "mobSARATHI");
            jSONObject.put("agentPwd", "657d1c758e2e95af0014e16f5109f933");
            jSONObject.put("agentIpAddress", "10.246.82.159");
            jSONObject.put("agentServiceName", "sarathiservice");
            jSONObject.put("dob", dob);
            jSONObject.put("applNo", appNumber);
            jSONObject.put("trackCd", "0");
            jSONObject.put("campCd", "0");
            return jSONObject;
        }

        public final JSONObject g(String clNumber, String dob) throws JSONException {
            Intrinsics.checkNotNullParameter(clNumber, "clNumber");
            Intrinsics.checkNotNullParameter(dob, "dob");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cl", clNumber);
            jSONObject.put("db", dob);
            Log.d("cl_data_req", jSONObject.toString());
            return jSONObject;
        }

        public final JSONObject h(String learningLicence, String dateOfBirth, String agentId, String agentPwd, String agentIpAddress, String agentServiceName) throws JSONException {
            Intrinsics.checkNotNullParameter(learningLicence, "learningLicence");
            Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
            Intrinsics.checkNotNullParameter(agentId, "agentId");
            Intrinsics.checkNotNullParameter(agentPwd, "agentPwd");
            Intrinsics.checkNotNullParameter(agentIpAddress, "agentIpAddress");
            Intrinsics.checkNotNullParameter(agentServiceName, "agentServiceName");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("learningLicence", learningLicence);
            jSONObject.put("dateOfBirth", dateOfBirth);
            jSONObject.put("agentId", agentId);
            jSONObject.put("agentPwd", agentPwd);
            jSONObject.put("agentIpAddress", agentIpAddress);
            jSONObject.put("agentServiceName", agentServiceName);
            Log.d("ll_details_req", jSONObject.toString());
            return jSONObject;
        }

        public final JSONObject i(String aadhaarNo, String randomNumber) throws JSONException {
            Intrinsics.checkNotNullParameter(aadhaarNo, "aadhaarNo");
            Intrinsics.checkNotNullParameter(randomNumber, "randomNumber");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("aadhaar_no", aadhaarNo);
            jSONObject.put("isAuth", false);
            jSONObject.put("isDemo", false);
            jSONObject.put("isEkyc", false);
            jSONObject.put("isOTP", true);
            jSONObject.put("randomnumber", randomNumber);
            Log.d("new_request", jSONObject.toString());
            return jSONObject;
        }

        public final JSONObject j(String aadhaarNo, String otpNo, String txNo) throws JSONException {
            Intrinsics.checkNotNullParameter(aadhaarNo, "aadhaarNo");
            Intrinsics.checkNotNullParameter(otpNo, "otpNo");
            Intrinsics.checkNotNullParameter(txNo, "txNo");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("aadhaar_no", aadhaarNo);
            jSONObject.put("isAuth", false);
            jSONObject.put("isDemo", false);
            jSONObject.put("isEkyc", true);
            jSONObject.put("isOTP", true);
            jSONObject.put("otpNo", otpNo);
            jSONObject.put("txNo", txNo);
            Log.d("new_request", jSONObject.toString());
            return jSONObject;
        }

        public final JSONObject k(String newclState, String newclRto, String newclPresState, String newclPermState, String newclPresDistrict, String newclPermDistrict, String newclPresSubDistrict, String newclPermSubDistrict, String newclPresHouseNo, String newclPermHouseNo, String newclPermPincode, String newclPresStreet, String newclPermStreet, String newclPresPincode, String newclPresVillageOrTownCode, String newclPermVillageOrTownCode, String newclPresVillageOrTown, String newclPermVillageOrTown, String newclFname, String newclMname, String newclLname, String newclRelation, String newclRFname, String newclRMname, String newclRLname, String newclGender, String newclDateofBirth, String newclEduQ, String newclBlood, String newclMobile) throws JSONException {
            Intrinsics.checkNotNullParameter(newclState, "newclState");
            Intrinsics.checkNotNullParameter(newclRto, "newclRto");
            Intrinsics.checkNotNullParameter(newclPresState, "newclPresState");
            Intrinsics.checkNotNullParameter(newclPermState, "newclPermState");
            Intrinsics.checkNotNullParameter(newclPresDistrict, "newclPresDistrict");
            Intrinsics.checkNotNullParameter(newclPermDistrict, "newclPermDistrict");
            Intrinsics.checkNotNullParameter(newclPresSubDistrict, "newclPresSubDistrict");
            Intrinsics.checkNotNullParameter(newclPermSubDistrict, "newclPermSubDistrict");
            Intrinsics.checkNotNullParameter(newclPresHouseNo, "newclPresHouseNo");
            Intrinsics.checkNotNullParameter(newclPermHouseNo, "newclPermHouseNo");
            Intrinsics.checkNotNullParameter(newclPermPincode, "newclPermPincode");
            Intrinsics.checkNotNullParameter(newclPresStreet, "newclPresStreet");
            Intrinsics.checkNotNullParameter(newclPermStreet, "newclPermStreet");
            Intrinsics.checkNotNullParameter(newclPresPincode, "newclPresPincode");
            Intrinsics.checkNotNullParameter(newclPresVillageOrTownCode, "newclPresVillageOrTownCode");
            Intrinsics.checkNotNullParameter(newclPermVillageOrTownCode, "newclPermVillageOrTownCode");
            Intrinsics.checkNotNullParameter(newclPresVillageOrTown, "newclPresVillageOrTown");
            Intrinsics.checkNotNullParameter(newclPermVillageOrTown, "newclPermVillageOrTown");
            Intrinsics.checkNotNullParameter(newclFname, "newclFname");
            Intrinsics.checkNotNullParameter(newclMname, "newclMname");
            Intrinsics.checkNotNullParameter(newclLname, "newclLname");
            Intrinsics.checkNotNullParameter(newclRelation, "newclRelation");
            Intrinsics.checkNotNullParameter(newclRFname, "newclRFname");
            Intrinsics.checkNotNullParameter(newclRMname, "newclRMname");
            Intrinsics.checkNotNullParameter(newclRLname, "newclRLname");
            Intrinsics.checkNotNullParameter(newclGender, "newclGender");
            Intrinsics.checkNotNullParameter(newclDateofBirth, "newclDateofBirth");
            Intrinsics.checkNotNullParameter(newclEduQ, "newclEduQ");
            Intrinsics.checkNotNullParameter(newclBlood, "newclBlood");
            Intrinsics.checkNotNullParameter(newclMobile, "newclMobile");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("newclState", StringsKt__StringsKt.trim((CharSequence) newclState).toString());
            jSONObject.put("newclRto", StringsKt__StringsKt.trim((CharSequence) newclRto).toString());
            jSONObject.put("newclPresState", newclPresState);
            jSONObject.put("newclPermState", newclPermState);
            jSONObject.put("newclPresDistrict", newclPresDistrict);
            jSONObject.put("newclPermDistrict", newclPermDistrict);
            jSONObject.put("newclPresSubDistrict", newclPresSubDistrict);
            jSONObject.put("newclPermSubDistrict", newclPermSubDistrict);
            jSONObject.put("newclPresHouseNo", newclPresHouseNo);
            jSONObject.put("newclPresStreet", newclPresStreet);
            jSONObject.put("newclPermStreet", newclPermStreet);
            jSONObject.put("newclPresPincode", newclPresPincode);
            jSONObject.put("newclPermHouseNo", newclPermHouseNo);
            jSONObject.put("newclPermPincode", newclPermPincode);
            jSONObject.put("newclPresVillageOrTownCode", newclPresVillageOrTownCode);
            jSONObject.put("newclPermVillageOrTownCode", newclPermVillageOrTownCode);
            jSONObject.put("newclPresVillageOrTown", StringsKt__StringsKt.trim((CharSequence) newclPresVillageOrTown).toString());
            jSONObject.put("newclPermVillageOrTown", StringsKt__StringsKt.trim((CharSequence) newclPermVillageOrTown).toString());
            jSONObject.put("newclFname", StringsKt__StringsKt.trim((CharSequence) newclFname).toString());
            jSONObject.put("newclMname", StringsKt__StringsKt.trim((CharSequence) newclMname).toString());
            jSONObject.put("newclLname", StringsKt__StringsKt.trim((CharSequence) newclLname).toString());
            jSONObject.put("newclRelation", newclRelation);
            jSONObject.put("newclRFname", StringsKt__StringsKt.trim((CharSequence) newclRFname).toString());
            jSONObject.put("newclRMname", StringsKt__StringsKt.trim((CharSequence) newclRMname).toString());
            jSONObject.put("newclRLname", StringsKt__StringsKt.trim((CharSequence) newclRLname).toString());
            jSONObject.put("newclGender", newclGender);
            jSONObject.put("newclDateofBirth", newclDateofBirth);
            jSONObject.put("newclEduQ", newclEduQ);
            jSONObject.put("newclBlood", newclBlood);
            jSONObject.put("newclMobile", StringsKt__StringsKt.trim((CharSequence) newclMobile).toString());
            return jSONObject;
        }

        public final JSONObject l(String clState, String clRto, String serviceCode, String clNumber, String dateOfBirth) throws JSONException {
            Intrinsics.checkNotNullParameter(clState, "clState");
            Intrinsics.checkNotNullParameter(clRto, "clRto");
            Intrinsics.checkNotNullParameter(serviceCode, "serviceCode");
            Intrinsics.checkNotNullParameter(clNumber, "clNumber");
            Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clState", clState);
            jSONObject.put("clRto", clRto);
            jSONObject.put("serviceCode", serviceCode);
            jSONObject.put("clNumber", clNumber);
            jSONObject.put("dateOfBirth", dateOfBirth);
            return jSONObject;
        }

        public final JSONObject m(String aadhaarNo, String careOf, String code, String dist, String dobAdhar, String gender, String house, String landMark, String localityIfAny, String name, String phone, String pht, String pincode, String state, String adharStatus, String street, String villageTownCity, String xmlUID, String dlNo, String dlOwnerName, String dob, String dlOwnerRelationFullName, int i, String status, String txNo, String uid, String stateCd) throws JSONException {
            Intrinsics.checkNotNullParameter(aadhaarNo, "aadhaarNo");
            Intrinsics.checkNotNullParameter(careOf, "careOf");
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(dist, "dist");
            Intrinsics.checkNotNullParameter(dobAdhar, "dobAdhar");
            Intrinsics.checkNotNullParameter(gender, "gender");
            Intrinsics.checkNotNullParameter(house, "house");
            Intrinsics.checkNotNullParameter(landMark, "landMark");
            Intrinsics.checkNotNullParameter(localityIfAny, "localityIfAny");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(phone, "phone");
            Intrinsics.checkNotNullParameter(pht, "pht");
            Intrinsics.checkNotNullParameter(pincode, "pincode");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(adharStatus, "adharStatus");
            Intrinsics.checkNotNullParameter(street, "street");
            Intrinsics.checkNotNullParameter(villageTownCity, "villageTownCity");
            Intrinsics.checkNotNullParameter(xmlUID, "xmlUID");
            Intrinsics.checkNotNullParameter(dlNo, "dlNo");
            Intrinsics.checkNotNullParameter(dlOwnerName, "dlOwnerName");
            Intrinsics.checkNotNullParameter(dob, "dob");
            Intrinsics.checkNotNullParameter(dlOwnerRelationFullName, "dlOwnerRelationFullName");
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(txNo, "txNo");
            Intrinsics.checkNotNullParameter(uid, "uid");
            Intrinsics.checkNotNullParameter(stateCd, "stateCd");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("dlNo", dlNo);
            jSONObject.put("dlOwnerName", dlOwnerName);
            jSONObject.put("dob", dob);
            jSONObject.put("dlOwnerRelationFullName", dlOwnerRelationFullName);
            jSONObject.put("serviceCd", i);
            jSONObject.put("status", status);
            jSONObject.put("txNo", txNo);
            jSONObject.put("uid", uid);
            jSONObject.put("stateCd", stateCd);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("aadhaarNo", aadhaarNo);
            jSONObject2.put("careOf", careOf);
            jSONObject2.put("code", code);
            jSONObject2.put("dist", dist);
            jSONObject2.put("dobAdhar", dobAdhar);
            jSONObject2.put("gender", gender);
            jSONObject2.put("house", house);
            jSONObject2.put("landMark", landMark);
            jSONObject2.put("localityIfAny", localityIfAny);
            jSONObject2.put("name", name);
            jSONObject2.put("phone", phone);
            jSONObject2.put("pincode", pincode);
            jSONObject2.put("state", state);
            jSONObject2.put("adharStatus", adharStatus);
            jSONObject2.put("street", street);
            jSONObject2.put("villageTownCity", villageTownCity);
            jSONObject2.put("xmlUID", xmlUID);
            jSONObject2.put("pht", pht);
            jSONObject.put("dOEkyc", jSONObject2);
            Log.d("adhar_request_json", jSONObject.toString());
            int length = jSONObject.toString().length() / 1000;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 * 1000;
                    int i4 = i2 + 1;
                    int length2 = i4 * 1000;
                    if (length2 > jSONObject.toString().length()) {
                        length2 = jSONObject.toString().length();
                    }
                    String string = jSONObject.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    String strSubstring = string.substring(i3, length2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.v("TAG_TAG", strSubstring);
                    if (i2 == length) {
                        break;
                    }
                    i2 = i4;
                }
            }
            return jSONObject;
        }
    }
}
