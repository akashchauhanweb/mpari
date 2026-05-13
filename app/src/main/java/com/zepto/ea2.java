package com.zepto;

import android.util.Log;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ea2 {
    public static final a a = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final JSONObject a(int i, boolean z) throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sarlogRecordId", i);
            jSONObject.put("sarlogStatus", z);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("sarathiLog", jSONObject);
            Log.d("dltSarLogReq", jSONObject2.toString());
            return jSONObject2;
        }

        public final JSONObject b(int i, boolean z) throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sarlogCtzId", i);
            jSONObject.put("sarlogStatus", z);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("sarathiLog", jSONObject);
            Log.d("fetchSarthiReq", jSONObject2.toString());
            return jSONObject2;
        }
    }
}
