package com.zepto;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class ya2 {
    public static final a a = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final JSONObject a(int i, boolean z) throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("vahlogRecordId", i);
            jSONObject.put("vahlogStatus", z);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("vahanLog", jSONObject);
            return jSONObject2;
        }

        public final JSONObject b() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("langActive", true);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mParLanguage", jSONObject);
            return jSONObject2;
        }

        public final JSONObject c(String langCode) throws JSONException {
            Intrinsics.checkNotNullParameter(langCode, "langCode");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("langVersion", "1.0");
            jSONObject.put("langCode", langCode);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mParLanguage", jSONObject);
            return jSONObject2;
        }

        public final JSONObject d(int i, boolean z) throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("vahlogCtzId", i);
            jSONObject.put("vahlogStatus", z);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("vahanLog", jSONObject);
            return jSONObject2;
        }
    }
}
