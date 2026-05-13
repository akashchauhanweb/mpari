package com.zepto;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bn3 {
    public static final a a = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final JSONObject a(int i, String soscParam) throws JSONException {
            Intrinsics.checkNotNullParameter(soscParam, "soscParam");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("soscCtzId", i);
            jSONObject.put("soscParam", soscParam);
            return jSONObject;
        }
    }
}
