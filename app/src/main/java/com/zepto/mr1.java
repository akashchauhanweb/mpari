package com.zepto;

import android.util.Log;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mr1 {
    public static final a a = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final JSONObject a(String dlNumber, String dob, String rtoCode, String random_key) throws JSONException {
            Intrinsics.checkNotNullParameter(dlNumber, "dlNumber");
            Intrinsics.checkNotNullParameter(dob, "dob");
            Intrinsics.checkNotNullParameter(rtoCode, "rtoCode");
            Intrinsics.checkNotNullParameter(random_key, "random_key");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("dlno", dlNumber);
            jSONObject.put("dob", dob);
            jSONObject.put("rtoCodeDLTr", rtoCode);
            jSONObject.put("applcatgDLserReq", "G");
            Log.d("checkEligiblity", jSONObject.toString());
            return jSONObject;
        }

        public final String b(int i) {
            StringBuilder sb = new StringBuilder();
            String strSubstring = "dlari$#@$G#2033@".substring(0, 11);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb.append(strSubstring);
            sb.append(Integer.toString(i));
            return sb.toString();
        }

        public final JSONObject c(String selectState) throws JSONException {
            Intrinsics.checkNotNullParameter(selectState, "selectState");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("stCode", selectState);
            Log.d("state_request", jSONObject.toString());
            return jSONObject;
        }

        public final JSONObject d() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("agentId", "DelhTrans");
            jSONObject.put("agentPwd", "d9fe1613399b0883e4ecf3f710e18317");
            jSONObject.put("agentIpAddress", "164.100.161.142");
            jSONObject.put("agentServiceName", "sarathiservice");
            Log.d("state_request", jSONObject.toString());
            return jSONObject;
        }

        public final JSONObject e(String stCode) throws JSONException {
            Intrinsics.checkNotNullParameter(stCode, "stCode");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("stCode", stCode);
            Log.d("customState", jSONObject.toString());
            return jSONObject;
        }

        public final JSONObject f(String dlnumber, String dob) throws JSONException {
            Intrinsics.checkNotNullParameter(dlnumber, "dlnumber");
            Intrinsics.checkNotNullParameter(dob, "dob");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("dlno", dlnumber);
            jSONObject.put("dob", dob);
            Log.d("getLastRTO_", jSONObject.toString());
            return jSONObject;
        }

        public final int g(double d, double d2) {
            return (int) (((double) ((int) (Math.random() * ((d2 - d) + ((double) 1))))) + d);
        }

        public final JSONObject h(String smsId) throws JSONException {
            Intrinsics.checkNotNullParameter(smsId, "smsId");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("smsId", smsId);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("smsAlert", jSONObject);
            Log.d("resend_otp", jSONObject2.toString());
            return jSONObject2;
        }

        public final JSONObject i(String otp, String otpid) throws JSONException {
            Intrinsics.checkNotNullParameter(otp, "otp");
            Intrinsics.checkNotNullParameter(otpid, "otpid");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("otpSmsId", Integer.parseInt(otpid));
            jSONObject.put("otpVal", otp);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("smsOtp", jSONObject);
            Log.d("verify_otp", jSONObject2.toString());
            return jSONObject2;
        }

        public final JSONObject j(String mobile_number, String smsId) throws JSONException {
            Intrinsics.checkNotNullParameter(mobile_number, "mobile_number");
            Intrinsics.checkNotNullParameter(smsId, "smsId");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("smsCtzId", Long.parseLong(smsId));
            jSONObject.put("smsEvent", "DL_VRF");
            jSONObject.put("smsMobile", mobile_number);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("smsAlert", jSONObject);
            Log.d("sendOtp", jSONObject2.toString());
            return jSONObject2;
        }
    }
}
