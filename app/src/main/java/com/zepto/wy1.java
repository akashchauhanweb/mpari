package com.zepto;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class wy1 {
    public static final a a = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final JSONObject a(String servStateCd) throws JSONException {
            Intrinsics.checkNotNullParameter(servStateCd, "servStateCd");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("servModule", "S4");
            jSONObject.put("servStateCd", servStateCd);
            jSONObject.put("servStatus", 1);
            jSONObject.put("servAndroid", true);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mparEnabledService", jSONObject);
            return jSONObject2;
        }

        public final JSONObject b(String servStateCd) throws JSONException {
            Intrinsics.checkNotNullParameter(servStateCd, "servStateCd");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("servModule", "E4");
            jSONObject.put("servStateCd", servStateCd);
            jSONObject.put("servStatus", 1);
            jSONObject.put("servAndroid", true);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mparEnabledService", jSONObject);
            return jSONObject2;
        }

        public final JSONObject c(String servStateCd) throws JSONException {
            Intrinsics.checkNotNullParameter(servStateCd, "servStateCd");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("servModule", "N4");
            jSONObject.put("servStateCd", servStateCd);
            jSONObject.put("servStatus", 1);
            jSONObject.put("servAndroid", true);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mparEnabledService", jSONObject);
            return jSONObject2;
        }

        public final JSONObject d(String servStateCd) throws JSONException {
            Intrinsics.checkNotNullParameter(servStateCd, "servStateCd");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("servModule", "V4");
            jSONObject.put("servStateCd", servStateCd);
            jSONObject.put("servStatus", 1);
            jSONObject.put("servAndroid", true);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mparEnabledService", jSONObject);
            return jSONObject2;
        }
    }
}
