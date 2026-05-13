package org.json;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class CookieList {
    public static JSONObject toJSONObject(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONTokener jSONTokener = new JSONTokener(str);
        while (jSONTokener.more()) {
            String strUnescape = Cookie.unescape(jSONTokener.nextTo('='));
            jSONTokener.next('=');
            jSONObject.put(strUnescape, Cookie.unescape(jSONTokener.nextTo(';')));
            jSONTokener.next();
        }
        return jSONObject;
    }

    public static String toString(JSONObject jSONObject) throws JSONException {
        Iterator itKeys = jSONObject.keys();
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = false;
        while (itKeys.hasNext()) {
            String string = itKeys.next().toString();
            if (!jSONObject.isNull(string)) {
                if (z) {
                    stringBuffer.append(';');
                }
                stringBuffer.append(Cookie.escape(string));
                stringBuffer.append("=");
                stringBuffer.append(Cookie.escape(jSONObject.getString(string)));
                z = true;
            }
        }
        return stringBuffer.toString();
    }
}
