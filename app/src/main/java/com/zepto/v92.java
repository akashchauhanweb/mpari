package com.zepto;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class v92 {
    public static final a a = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final JSONObject a(long j, boolean z) throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("echlogRecordId", j);
            jSONObject.put("echlogStatus", z);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("Echallan", jSONObject);
            return jSONObject2;
        }

        public final JSONObject b(long j, boolean z) throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("echlogCtzId", j);
            jSONObject.put("echlogStatus", z);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("Echallan", jSONObject);
            return jSONObject2;
        }
    }
}
