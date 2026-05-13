package com.zepto;

import android.util.Log;
import com.nic.mparivahan.Welcome.Model.Version;
import com.nic.mparivahan.Welcome.Model.VersionX;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ut6 {
    public static final a a = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final JSONObject a() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("versionOs", "Android");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("version", jSONObject);
            Log.d("version", jSONObject2.toString());
            return jSONObject2;
        }

        public final Version b(String response) throws JSONException {
            Intrinsics.checkNotNullParameter(response, "response");
            JSONObject jSONObject = new JSONObject(response.toString());
            if (jSONObject.isNull("statusCode") || jSONObject.isNull("version")) {
                return new Version("400", "", null);
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("version");
            String string = jSONObject.getString("statusCode");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = jSONObject.getString("statusDesc");
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            int i = jSONObject2.getInt("versionNo");
            String string3 = jSONObject2.getString("versionOs");
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            String string4 = jSONObject2.getString("versionDesc");
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            String string5 = jSONObject2.getString("versionUpdatedBy");
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            return new Version(string, string2, new VersionX(string4, jSONObject2.getBoolean("versionMandate"), i, string3, string5));
        }
    }
}
