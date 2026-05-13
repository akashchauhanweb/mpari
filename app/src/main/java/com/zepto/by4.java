package com.zepto;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class by4 {
    public static final a a = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final JSONObject a(long j) throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pshnotId", j);
            jSONObject.put("pshnotStatus", 0);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("pushNotification", jSONObject);
            return jSONObject2;
        }

        public final JSONObject b(long j) throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pshnotCtzId", j);
            jSONObject.put("pshnotStatus", 1);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("pushNotification", jSONObject);
            return jSONObject2;
        }
    }
}
