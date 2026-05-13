package com.zepto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class z45 {
    public static final a a = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final JSONObject a(String mString, String user_id, String chasi5, String engine5, String id, String mid, String type, String tid) throws JSONException {
            Intrinsics.checkNotNullParameter(mString, "mString");
            Intrinsics.checkNotNullParameter(user_id, "user_id");
            Intrinsics.checkNotNullParameter(chasi5, "chasi5");
            Intrinsics.checkNotNullParameter(engine5, "engine5");
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(mid, "mid");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(tid, "tid");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("rcNumber", mString);
            jSONObject.put("recordId", Long.parseLong(user_id));
            jSONObject.put("chasi5", chasi5);
            jSONObject.put("engine5", engine5);
            jSONObject.put("did", id);
            jSONObject.put("mid", mid);
            jSONObject.put("tid", tid);
            jSONObject.put("param", type);
            return jSONObject;
        }

        public final JSONObject b(String doc_id, String did, String mdid, String ctz_id, String docType, String tid) {
            Intrinsics.checkNotNullParameter(doc_id, "doc_id");
            Intrinsics.checkNotNullParameter(did, "did");
            Intrinsics.checkNotNullParameter(mdid, "mdid");
            Intrinsics.checkNotNullParameter(ctz_id, "ctz_id");
            Intrinsics.checkNotNullParameter(docType, "docType");
            Intrinsics.checkNotNullParameter(tid, "tid");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("docId", Long.parseLong(doc_id));
                jSONObject.put("docCtzId", ctz_id);
                jSONObject.put("docType", docType);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("mparCitizenDoc", jSONObject);
                jSONObject2.put("did", did);
                jSONObject2.put("mid", mdid);
                jSONObject2.put("tid", tid);
                return jSONObject2;
            } catch (Exception unused) {
                return null;
            }
        }

        public final JSONObject c(String doc_id, String docType, String did, String mdid, String tid, String ctz_id) throws JSONException {
            Intrinsics.checkNotNullParameter(doc_id, "doc_id");
            Intrinsics.checkNotNullParameter(docType, "docType");
            Intrinsics.checkNotNullParameter(did, "did");
            Intrinsics.checkNotNullParameter(mdid, "mdid");
            Intrinsics.checkNotNullParameter(tid, "tid");
            Intrinsics.checkNotNullParameter(ctz_id, "ctz_id");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("docId", Long.parseLong(doc_id));
            jSONObject.put("docType", docType);
            jSONObject.put("docCtzId", ctz_id);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mparCitizenDoc", jSONObject);
            jSONObject2.put("did", did);
            jSONObject2.put("mid", mdid);
            jSONObject2.put("tid", tid);
            return jSONObject2;
        }

        public final JSONObject d(String recordId, String docId, String id, String mid, String tid, String user_id) throws JSONException {
            Intrinsics.checkNotNullParameter(recordId, "recordId");
            Intrinsics.checkNotNullParameter(docId, "docId");
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(mid, "mid");
            Intrinsics.checkNotNullParameter(tid, "tid");
            Intrinsics.checkNotNullParameter(user_id, "user_id");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("recordId", Long.parseLong(user_id));
            jSONObject.put("docId", Long.parseLong(docId));
            jSONObject.put("did", id);
            jSONObject.put("mid", mid);
            jSONObject.put("tid", tid);
            jSONObject.put("sharedTo", Long.parseLong(recordId));
            return jSONObject;
        }

        public final JSONObject e(String recordId, String docId, String id, String mid, String tid) throws JSONException {
            Intrinsics.checkNotNullParameter(recordId, "recordId");
            Intrinsics.checkNotNullParameter(docId, "docId");
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(mid, "mid");
            Intrinsics.checkNotNullParameter(tid, "tid");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("recordId", Long.parseLong(recordId));
            jSONObject.put("docId", Long.parseLong(docId));
            jSONObject.put("did", id);
            jSONObject.put("mid", mid);
            jSONObject.put("tid", tid);
            return jSONObject;
        }

        public final JSONObject f(String mString, String user_id, String device_id, String mobile_no, String tid) throws JSONException {
            Intrinsics.checkNotNullParameter(mString, "mString");
            Intrinsics.checkNotNullParameter(user_id, "user_id");
            Intrinsics.checkNotNullParameter(device_id, "device_id");
            Intrinsics.checkNotNullParameter(mobile_no, "mobile_no");
            Intrinsics.checkNotNullParameter(tid, "tid");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("rcNumber", mString);
            jSONObject.put("recordId", Long.parseLong(user_id));
            jSONObject.put("did", device_id);
            jSONObject.put("mid", mobile_no);
            jSONObject.put("tid", tid);
            new JSONObject().put("request", jSONObject);
            return jSONObject;
        }

        public final JSONObject g(String citizenId, String docnumber, String shared_id, String shared_days, String did, String mobile_no, String tid) throws JSONException {
            Intrinsics.checkNotNullParameter(citizenId, "citizenId");
            Intrinsics.checkNotNullParameter(docnumber, "docnumber");
            Intrinsics.checkNotNullParameter(shared_id, "shared_id");
            Intrinsics.checkNotNullParameter(shared_days, "shared_days");
            Intrinsics.checkNotNullParameter(did, "did");
            Intrinsics.checkNotNullParameter(mobile_no, "mobile_no");
            Intrinsics.checkNotNullParameter(tid, "tid");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("shrdDocType", "RC");
            jSONObject.put("shrdDocNumber", docnumber);
            jSONObject.put("shrdFromCtz", Long.parseLong(citizenId));
            jSONObject.put("shrdNdays", shared_days);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mparCitizenSharedDoc", jSONObject);
            jSONObject2.put("did", did);
            jSONObject2.put("mid", mobile_no);
            jSONObject2.put("tid", tid);
            jSONObject2.put("sharedToMob", shared_id);
            return jSONObject2;
        }

        public final JSONObject h(String shared_id, String citizenId, String did, String mdid, String tid) throws JSONException {
            Intrinsics.checkNotNullParameter(shared_id, "shared_id");
            Intrinsics.checkNotNullParameter(citizenId, "citizenId");
            Intrinsics.checkNotNullParameter(did, "did");
            Intrinsics.checkNotNullParameter(mdid, "mdid");
            Intrinsics.checkNotNullParameter(tid, "tid");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("shrdId", Long.parseLong(shared_id));
            jSONObject.put("shrdDeletedBy", Long.parseLong(citizenId));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mparCitizenSharedDoc", jSONObject);
            jSONObject2.put("did", did);
            jSONObject2.put("mid", mdid);
            jSONObject2.put("tid", tid);
            return jSONObject2;
        }

        public final JSONObject i(String citizenId, String did, String mdid, String tid) throws JSONException {
            Intrinsics.checkNotNullParameter(citizenId, "citizenId");
            Intrinsics.checkNotNullParameter(did, "did");
            Intrinsics.checkNotNullParameter(mdid, "mdid");
            Intrinsics.checkNotNullParameter(tid, "tid");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ctzId", Long.parseLong(citizenId));
            jSONObject.put("did", did);
            jSONObject.put("mid", mdid);
            jSONObject.put("tid", tid);
            return jSONObject;
        }

        public final String j(String str, String str2, String str3) {
            try {
                return new SimpleDateFormat(str3).format(new SimpleDateFormat(str2).parse(str));
            } catch (ParseException e) {
                e.printStackTrace();
                return str;
            }
        }

        public final String k(String dateString1) {
            Intrinsics.checkNotNullParameter(dateString1, "dateString1");
            try {
                return String.valueOf(z45.a.j(StringsKt__StringsKt.trim((CharSequence) ((String[]) StringsKt__StringsKt.split$default((CharSequence) dateString1, new String[]{"T"}, false, 0, 6, (Object) null).toArray(new String[0]))[0]).toString().toString(), "yyyy-MM-dd", "dd MMM,yyyy"));
            } catch (Exception unused) {
                return " ";
            }
        }
    }
}
