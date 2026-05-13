package com.zepto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pw4 {
    public static final a a = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final JSONObject a() {
            return new JSONObject();
        }

        public final JSONObject b(long j, String did, String mdid, String tid) throws JSONException {
            Intrinsics.checkNotNullParameter(did, "did");
            Intrinsics.checkNotNullParameter(mdid, "mdid");
            Intrinsics.checkNotNullParameter(tid, "tid");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cpCtzId", j);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mparCitizenProfile", jSONObject);
            jSONObject2.put("did", did);
            jSONObject2.put("mid", mdid);
            jSONObject2.put("tid", tid);
            return jSONObject2;
        }

        public final JSONObject c(long j, String ctzmobile, String ctzDispName, String ctzEmail, String ctzStateCd, boolean z, String did, String mdid, String tid, String mpin) throws JSONException {
            Intrinsics.checkNotNullParameter(ctzmobile, "ctzmobile");
            Intrinsics.checkNotNullParameter(ctzDispName, "ctzDispName");
            Intrinsics.checkNotNullParameter(ctzEmail, "ctzEmail");
            Intrinsics.checkNotNullParameter(ctzStateCd, "ctzStateCd");
            Intrinsics.checkNotNullParameter(did, "did");
            Intrinsics.checkNotNullParameter(mdid, "mdid");
            Intrinsics.checkNotNullParameter(tid, "tid");
            Intrinsics.checkNotNullParameter(mpin, "mpin");
            String str = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMM dd, yyyy hh:mm:ss a"));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ctzRecordId", j);
            jSONObject.put("ctzMobile", ctzmobile);
            jSONObject.put("ctzDispName", ctzDispName);
            jSONObject.put("ctzEmail", ctzEmail);
            jSONObject.put("ctzMpinStatus", z);
            jSONObject.put("ctzStateCd", ctzStateCd);
            jSONObject.put("ctzMpin", mpin);
            jSONObject.put("ctzMpinAttempts", 0);
            jSONObject.put("ctzStatus", 1);
            jSONObject.put("ctzCreatedAt", str);
            jSONObject.put("ctzMpinFailed", 0);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mparCitizenUser", jSONObject);
            jSONObject2.put("did", did);
            jSONObject2.put("mid", ctzmobile);
            jSONObject2.put("sid", tid);
            return jSONObject2;
        }

        public final JSONObject d(long j, String ctzmobile, String ctzDispName, String ctzEmail, String ctzStateCd, boolean z, String did, String mdid, String tid, String mpin) throws JSONException {
            Intrinsics.checkNotNullParameter(ctzmobile, "ctzmobile");
            Intrinsics.checkNotNullParameter(ctzDispName, "ctzDispName");
            Intrinsics.checkNotNullParameter(ctzEmail, "ctzEmail");
            Intrinsics.checkNotNullParameter(ctzStateCd, "ctzStateCd");
            Intrinsics.checkNotNullParameter(did, "did");
            Intrinsics.checkNotNullParameter(mdid, "mdid");
            Intrinsics.checkNotNullParameter(tid, "tid");
            Intrinsics.checkNotNullParameter(mpin, "mpin");
            String str = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMM dd, yyyy hh:mm:ss a"));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ctzRecordId", j);
            jSONObject.put("ctzMobile", ctzmobile);
            jSONObject.put("ctzDispName", ctzDispName);
            jSONObject.put("ctzEmail", ctzEmail);
            jSONObject.put("ctzMpinStatus", z);
            jSONObject.put("ctzStateCd", ctzStateCd);
            jSONObject.put("ctzMpin", mpin);
            jSONObject.put("ctzMpinAttempts", 0);
            jSONObject.put("ctzStatus", 1);
            jSONObject.put("ctzCreatedAt", str);
            jSONObject.put("ctzMpinFailed", 0);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mparCitizenUser", jSONObject);
            jSONObject2.put("did", did);
            jSONObject2.put("mid", ctzmobile);
            jSONObject2.put("tid", tid);
            return jSONObject2;
        }

        public final JSONObject e(long j, String ctzmobile, String ctzDispName, String ctzEmail, String ctzStateCd, boolean z, String did, String mdid, String tid, String mpin) throws JSONException {
            Intrinsics.checkNotNullParameter(ctzmobile, "ctzmobile");
            Intrinsics.checkNotNullParameter(ctzDispName, "ctzDispName");
            Intrinsics.checkNotNullParameter(ctzEmail, "ctzEmail");
            Intrinsics.checkNotNullParameter(ctzStateCd, "ctzStateCd");
            Intrinsics.checkNotNullParameter(did, "did");
            Intrinsics.checkNotNullParameter(mdid, "mdid");
            Intrinsics.checkNotNullParameter(tid, "tid");
            Intrinsics.checkNotNullParameter(mpin, "mpin");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ctzRecordId", j);
            jSONObject.put("ctzMobile", ctzmobile);
            jSONObject.put("ctzDispName", ctzDispName);
            jSONObject.put("ctzEmail", ctzEmail);
            jSONObject.put("ctzMpinStatus", z);
            jSONObject.put("ctzStateCd", ctzStateCd);
            jSONObject.put("ctzMpin", mpin);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mparCitizenUser", jSONObject);
            jSONObject2.put("did", did);
            jSONObject2.put("mid", mdid);
            jSONObject2.put("tid", tid);
            return jSONObject2;
        }
    }
}
