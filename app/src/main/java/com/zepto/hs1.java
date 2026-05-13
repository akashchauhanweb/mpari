package com.zepto;

import android.content.Context;
import java.util.StringTokenizer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class hs1 {
    public static final a a = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final JSONObject a(String docId, String docType, String docDob, String did, String mdid, String tid) {
            Intrinsics.checkNotNullParameter(docId, "docId");
            Intrinsics.checkNotNullParameter(docType, "docType");
            Intrinsics.checkNotNullParameter(docDob, "docDob");
            Intrinsics.checkNotNullParameter(did, "did");
            Intrinsics.checkNotNullParameter(mdid, "mdid");
            Intrinsics.checkNotNullParameter(tid, "tid");
            JSONObject jSONObject = new JSONObject();
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("docId", Long.parseLong(docId));
                jSONObject2.put("docType", docType);
                jSONObject2.put("docDob", docDob);
                jSONObject.put("mparCitizenDoc", jSONObject2);
                jSONObject.put("did", did);
                jSONObject.put("mid", mdid);
                jSONObject.put("tid", tid);
                return jSONObject;
            } catch (Exception e) {
                e.printStackTrace();
                return jSONObject;
            }
        }

        public final String b(String str) {
            try {
                StringTokenizer stringTokenizer = new StringTokenizer(str);
                String str2 = "";
                while (stringTokenizer.hasMoreTokens()) {
                    String strNextToken = stringTokenizer.nextToken();
                    Intrinsics.checkNotNullExpressionValue(strNextToken, "nextToken(...)");
                    String[] strArr = (String[]) new Regex("").split(strNextToken, 0).toArray(new String[0]);
                    int length = strArr.length;
                    for (int i = 0; i < length; i++) {
                        str2 = i % 2 == 0 ? str2 + strArr[i] : str2 + '*';
                    }
                    str2 = str2 + "  ";
                }
                return str2;
            } catch (Exception unused) {
                return "--";
            }
        }

        public final JSONObject c(String str, String str2, Context context, String did, String mid) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(did, "did");
            Intrinsics.checkNotNullParameter(mid, "mid");
            JSONObject jSONObject = new JSONObject();
            ws6 ws6Var = new ws6(context);
            if (str2 != null) {
                try {
                    if (str2.length() != 0) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("dlno", str != null ? StringsKt__StringsKt.trim((CharSequence) str).toString() : null);
                        jSONObject2.put("dob", str2);
                        jSONObject.put("dlReq", jSONObject2);
                        jSONObject.put("recordId", Long.parseLong(ws6Var.k()));
                        jSONObject.put("did", did);
                        jSONObject.put("mid", mid);
                        jSONObject.put("tid", ws6Var.e());
                        return jSONObject;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    return jSONObject;
                }
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("dlno", str != null ? StringsKt__StringsKt.trim((CharSequence) str).toString() : null);
            jSONObject.put("dlReq", jSONObject3);
            jSONObject.put("recordId", Long.parseLong(ws6Var.k()));
            jSONObject.put("did", did);
            jSONObject.put("mid", mid);
            jSONObject.put("tid", ws6Var.e());
            return jSONObject;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
        
            if (r9.equals("Blocked") == false) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
        
            if (r9.equals("SUSPENDED") == false) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
        
            if (r9.equals("BLOCKED") == false) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
        
            if (r9.equals("Suspended") == false) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
        
            if (r9.equals("REJECTED") == false) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
        
            if (r9.equals("Valid") == false) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
        
            if (r9.equals("VALID") == false) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0082, code lost:
        
            if (r9.equals("V") == false) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0086, code lost:
        
            r10.setText("Active");
            r10.setTextColor(-16711936);
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0094, code lost:
        
            if (r9.equals("S") == false) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0098, code lost:
        
            r10.setText("Suspended");
            r10.setTextColor(com.zepto.yy0.c(r11, com.nic.mparivahan.R.color.danger));
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00aa, code lost:
        
            if (r9.equals("R") == false) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00b3, code lost:
        
            if (r9.equals("C") == false) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00bc, code lost:
        
            if (r9.equals("B") == false) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00bf, code lost:
        
            r10.setText("Blocked");
            r10.setTextColor(com.zepto.yy0.c(r11, com.nic.mparivahan.R.color.danger));
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00d0, code lost:
        
            if (r9.equals("A") == false) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00d3, code lost:
        
            r10.setText("Active");
            r10.setTextColor(-16711936);
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00de, code lost:
        
            if (r9.equals("Rejected") == false) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00e1, code lost:
        
            r10.setText("Rejected");
            r10.setTextColor(com.zepto.yy0.c(r11, com.nic.mparivahan.R.color.danger));
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00f2, code lost:
        
            if (r9.equals("CANCELLED") == false) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x00f9, code lost:
        
            if (r9.equals("Cancelled") == false) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x0104, code lost:
        
            r10.setText("Cancelled");
            r10.setTextColor(com.zepto.yy0.c(r11, com.nic.mparivahan.R.color.danger));
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x002c, code lost:
        
            if (r9.equals("Active") == false) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
        
            if (r9.equals("ACTIVE") == false) goto L63;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void d(java.lang.String r9, android.widget.TextView r10, android.content.Context r11) {
            /*
                Method dump skipped, instruction units count: 346
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zepto.hs1.a.d(java.lang.String, android.widget.TextView, android.content.Context):void");
        }
    }
}
