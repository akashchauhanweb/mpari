package com.zepto;

import android.util.Log;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class cj2 {
    public static final a a = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final JSONObject a(String app_no, String dob) throws JSONException {
            Intrinsics.checkNotNullParameter(app_no, "app_no");
            Intrinsics.checkNotNullParameter(dob, "dob");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("applNumber", app_no);
            jSONObject.put("applDob", dob);
            return jSONObject;
        }

        public final JSONObject b(String app_no, String dob) throws JSONException {
            Intrinsics.checkNotNullParameter(app_no, "app_no");
            Intrinsics.checkNotNullParameter(dob, "dob");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("applicationNumber", app_no);
            jSONObject.put("dateOfBirth", dob);
            jSONObject.put("agentServiceName", "sarathiservice");
            jSONObject.put("agentId", "mobSARATHI");
            jSONObject.put("agentPwd", "657d1c758e2e95af0014e16f5109f933");
            jSONObject.put("agentIpAddress", "");
            return jSONObject;
        }

        public final JSONObject c(String appNo, String dob) throws JSONException {
            Intrinsics.checkNotNullParameter(appNo, "appNo");
            Intrinsics.checkNotNullParameter(dob, "dob");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("applNo", appNo);
            jSONObject.put("dob", dob);
            Log.d("Slot_Pdf", jSONObject.toString());
            return jSONObject;
        }
    }
}
