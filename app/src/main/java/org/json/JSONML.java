package org.json;

import java.util.Iterator;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
public class JSONML {
    /* JADX WARN: Code restructure failed: missing block: B:109:0x016f, code lost:
    
        throw r9.syntaxError("Reserved attribute.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0178, code lost:
    
        r7 = r9.nextToken();
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x017e, code lost:
    
        if ((r7 instanceof java.lang.String) == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0191, code lost:
    
        throw r9.syntaxError("Missing value");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008c, code lost:
    
        throw r9.syntaxError("Expected 'CDATA['");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.Object parse(org.json.XMLTokener r9, boolean r10, org.json.JSONArray r11) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 457
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.json.JSONML.parse(org.json.XMLTokener, boolean, org.json.JSONArray):java.lang.Object");
    }

    public static JSONArray toJSONArray(String str) throws JSONException {
        return toJSONArray(new XMLTokener(str));
    }

    public static JSONObject toJSONObject(XMLTokener xMLTokener) throws JSONException {
        return (JSONObject) parse(xMLTokener, false, null);
    }

    public static String toString(JSONArray jSONArray) throws JSONException {
        int i;
        StringBuffer stringBuffer = new StringBuffer();
        String string = jSONArray.getString(0);
        XML.noSpace(string);
        String strEscape = XML.escape(string);
        stringBuffer.append(Typography.less);
        stringBuffer.append(strEscape);
        Object objOpt = jSONArray.opt(1);
        if (objOpt instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) objOpt;
            Iterator itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String string2 = itKeys.next().toString();
                XML.noSpace(string2);
                String strOptString = jSONObject.optString(string2);
                if (strOptString != null) {
                    stringBuffer.append(' ');
                    stringBuffer.append(XML.escape(string2));
                    stringBuffer.append('=');
                    stringBuffer.append(Typography.quote);
                    stringBuffer.append(XML.escape(strOptString));
                    stringBuffer.append(Typography.quote);
                }
            }
            i = 2;
        } else {
            i = 1;
        }
        int length = jSONArray.length();
        if (i >= length) {
            stringBuffer.append('/');
            stringBuffer.append(Typography.greater);
        } else {
            stringBuffer.append(Typography.greater);
            do {
                Object obj = jSONArray.get(i);
                i++;
                if (obj != null) {
                    if (obj instanceof String) {
                        stringBuffer.append(XML.escape(obj.toString()));
                    } else if (obj instanceof JSONObject) {
                        stringBuffer.append(toString((JSONObject) obj));
                    } else if (obj instanceof JSONArray) {
                        stringBuffer.append(toString((JSONArray) obj));
                    }
                }
            } while (i < length);
            stringBuffer.append(Typography.less);
            stringBuffer.append('/');
            stringBuffer.append(strEscape);
            stringBuffer.append(Typography.greater);
        }
        return stringBuffer.toString();
    }

    public static JSONArray toJSONArray(XMLTokener xMLTokener) throws JSONException {
        return (JSONArray) parse(xMLTokener, true, null);
    }

    public static JSONObject toJSONObject(String str) throws JSONException {
        return toJSONObject(new XMLTokener(str));
    }

    public static String toString(JSONObject jSONObject) throws JSONException {
        StringBuffer stringBuffer = new StringBuffer();
        String strOptString = jSONObject.optString("tagName");
        if (strOptString == null) {
            return XML.escape(jSONObject.toString());
        }
        XML.noSpace(strOptString);
        String strEscape = XML.escape(strOptString);
        stringBuffer.append(Typography.less);
        stringBuffer.append(strEscape);
        Iterator itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String string = itKeys.next().toString();
            if (!string.equals("tagName") && !string.equals("childNodes")) {
                XML.noSpace(string);
                String strOptString2 = jSONObject.optString(string);
                if (strOptString2 != null) {
                    stringBuffer.append(' ');
                    stringBuffer.append(XML.escape(string));
                    stringBuffer.append('=');
                    stringBuffer.append(Typography.quote);
                    stringBuffer.append(XML.escape(strOptString2));
                    stringBuffer.append(Typography.quote);
                }
            }
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childNodes");
        if (jSONArrayOptJSONArray == null) {
            stringBuffer.append('/');
            stringBuffer.append(Typography.greater);
        } else {
            stringBuffer.append(Typography.greater);
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                Object obj = jSONArrayOptJSONArray.get(i);
                if (obj != null) {
                    if (obj instanceof String) {
                        stringBuffer.append(XML.escape(obj.toString()));
                    } else if (obj instanceof JSONObject) {
                        stringBuffer.append(toString((JSONObject) obj));
                    } else if (obj instanceof JSONArray) {
                        stringBuffer.append(toString((JSONArray) obj));
                    }
                }
            }
            stringBuffer.append(Typography.less);
            stringBuffer.append('/');
            stringBuffer.append(strEscape);
            stringBuffer.append(Typography.greater);
        }
        return stringBuffer.toString();
    }
}
