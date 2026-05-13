package com.zepto;

import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t46 {
    public static final a a = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final JSONObject a(long j, long j2, String mobile, String name, String sosrelation) throws JSONException {
            Intrinsics.checkNotNullParameter(mobile, "mobile");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(sosrelation, "sosrelation");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("soscRecordId", j);
            jSONObject.put("soscCtzId", j2);
            jSONObject.put("soscMobile", mobile);
            jSONObject.put("soscName", name);
            jSONObject.put("soscRelation", sosrelation);
            jSONObject.put("soscStatus", VContant.MAINSCREEN);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mparSosContact", jSONObject);
            return jSONObject2;
        }

        public final JSONObject b() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", VContant.MAINSCREEN);
            return jSONObject;
        }

        public final JSONObject c(long j) throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("soscCtzId", j);
            return jSONObject;
        }

        public final JSONObject d(long j, String mobile, String name, String sosrelation) throws JSONException {
            Intrinsics.checkNotNullParameter(mobile, "mobile");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(sosrelation, "sosrelation");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("soscCtzId", j);
            jSONObject.put("soscMobile", mobile);
            jSONObject.put("soscName", name);
            jSONObject.put("soscRelation", sosrelation);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mparSosContact", jSONObject);
            return jSONObject2;
        }

        public final JSONObject e(String citizenId) throws JSONException {
            Intrinsics.checkNotNullParameter(citizenId, "citizenId");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("soscRecordId", Long.parseLong(citizenId));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mparSosContact", jSONObject);
            return jSONObject2;
        }
    }
}
