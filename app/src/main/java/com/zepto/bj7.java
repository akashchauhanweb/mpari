package com.zepto;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bj7 {
    public static final a a = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final JSONObject a(String c_add1, String c_add2, String c_add3, String c_dist, String c_pincode, String c_state, String from_dt, String p_add1, String p_add2, String p_add3, String p_district, String p_pincode, String p_state, String regn_no, String state_code, String off_code) throws JSONException {
            Intrinsics.checkNotNullParameter(c_add1, "c_add1");
            Intrinsics.checkNotNullParameter(c_add2, "c_add2");
            Intrinsics.checkNotNullParameter(c_add3, "c_add3");
            Intrinsics.checkNotNullParameter(c_dist, "c_dist");
            Intrinsics.checkNotNullParameter(c_pincode, "c_pincode");
            Intrinsics.checkNotNullParameter(c_state, "c_state");
            Intrinsics.checkNotNullParameter(from_dt, "from_dt");
            Intrinsics.checkNotNullParameter(p_add1, "p_add1");
            Intrinsics.checkNotNullParameter(p_add2, "p_add2");
            Intrinsics.checkNotNullParameter(p_add3, "p_add3");
            Intrinsics.checkNotNullParameter(p_district, "p_district");
            Intrinsics.checkNotNullParameter(p_pincode, "p_pincode");
            Intrinsics.checkNotNullParameter(p_state, "p_state");
            Intrinsics.checkNotNullParameter(regn_no, "regn_no");
            Intrinsics.checkNotNullParameter(state_code, "state_code");
            Intrinsics.checkNotNullParameter(off_code, "off_code");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_cd", "40005");
            jSONObject.put("action_code", "40005");
            jSONObject.put("appl_no", " ");
            jSONObject.put("c_add1", c_add1);
            jSONObject.put("c_add2", c_add2);
            jSONObject.put("c_add3", c_add3);
            jSONObject.put("c_district", c_dist);
            jSONObject.put("c_pincode", c_pincode);
            jSONObject.put("c_state", c_state);
            jSONObject.put("facelessmessge", " ");
            jSONObject.put("flow_slno", "3");
            jSONObject.put("from_dt", from_dt);
            jSONObject.put("messege", " ");
            jSONObject.put("off_cd", off_code);
            jSONObject.put("op_dt", hz0.a.r());
            jSONObject.put("p_add1", p_add1);
            jSONObject.put("p_add2", p_add2);
            jSONObject.put("p_add3", p_add3);
            jSONObject.put("p_district", p_district);
            jSONObject.put("p_pincode", p_pincode);
            jSONObject.put("p_state", p_state);
            jSONObject.put("pur_cd", "4");
            jSONObject.put("regn_no", regn_no);
            jSONObject.put("state_cd", state_code);
            jSONObject.put("state_header", " ");
            return jSONObject;
        }
    }
}
