package com.zepto;

import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jr2 {
    public static final a a = new a(null);
    public static final Pattern b = Pattern.compile("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+");

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final JSONObject a(String fncr_add1, String fncr_add2, String fncr_add3, String dis_code, String fncr_name, String fncr_pincode, String fncr_state, String from_dt, String op_dt, String state_cd, String regn_no, String off_code, String hptcode) throws JSONException {
            Intrinsics.checkNotNullParameter(fncr_add1, "fncr_add1");
            Intrinsics.checkNotNullParameter(fncr_add2, "fncr_add2");
            Intrinsics.checkNotNullParameter(fncr_add3, "fncr_add3");
            Intrinsics.checkNotNullParameter(dis_code, "dis_code");
            Intrinsics.checkNotNullParameter(fncr_name, "fncr_name");
            Intrinsics.checkNotNullParameter(fncr_pincode, "fncr_pincode");
            Intrinsics.checkNotNullParameter(fncr_state, "fncr_state");
            Intrinsics.checkNotNullParameter(from_dt, "from_dt");
            Intrinsics.checkNotNullParameter(op_dt, "op_dt");
            Intrinsics.checkNotNullParameter(state_cd, "state_cd");
            Intrinsics.checkNotNullParameter(regn_no, "regn_no");
            Intrinsics.checkNotNullParameter(off_code, "off_code");
            Intrinsics.checkNotNullParameter(hptcode, "hptcode");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appl_no", " ");
            jSONObject.put("fncr_add1", fncr_add1);
            jSONObject.put("fncr_add2", fncr_add2);
            jSONObject.put("fncr_add3", fncr_add3);
            jSONObject.put("fncr_district", dis_code);
            jSONObject.put("fncr_name", fncr_name);
            jSONObject.put("fncr_pincode", fncr_pincode);
            jSONObject.put("fncr_state", fncr_state);
            jSONObject.put("from_dt", from_dt);
            jSONObject.put("hp_type", hptcode);
            jSONObject.put("off_cd", off_code);
            jSONObject.put("op_dt", op_dt);
            jSONObject.put("regn_no", regn_no);
            jSONObject.put("sr_no", VContant.MAINSCREEN);
            jSONObject.put("pur_cd", VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE);
            jSONObject.put("state_cd", state_cd);
            return jSONObject;
        }
    }
}
