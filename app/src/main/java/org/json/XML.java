package org.json;

import java.util.Iterator;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
public class XML {
    public static final Character AMP = new Character(Typography.amp);
    public static final Character APOS = new Character('\'');
    public static final Character BANG = new Character('!');
    public static final Character EQ = new Character('=');
    public static final Character GT = new Character(Typography.greater);
    public static final Character LT = new Character(Typography.less);
    public static final Character QUEST = new Character('?');
    public static final Character QUOT = new Character(Typography.quote);
    public static final Character SLASH = new Character('/');

    public static String escape(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\"') {
                stringBuffer.append("&quot;");
            } else if (cCharAt == '<') {
                stringBuffer.append("&lt;");
            } else if (cCharAt == '>') {
                stringBuffer.append("&gt;");
            } else if (cCharAt == '&') {
                stringBuffer.append("&amp;");
            } else if (cCharAt != '\'') {
                stringBuffer.append(cCharAt);
            } else {
                stringBuffer.append("&apos;");
            }
        }
        return stringBuffer.toString();
    }

    public static void noSpace(String str) throws JSONException {
        int length = str.length();
        if (length == 0) {
            throw new JSONException("Empty string.");
        }
        for (int i = 0; i < length; i++) {
            if (Character.isWhitespace(str.charAt(i))) {
                throw new JSONException("'" + str + "' contains a space character.");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ef, code lost:
    
        r7 = r10.nextToken();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00f5, code lost:
    
        if ((r7 instanceof java.lang.String) == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0107, code lost:
    
        throw r10.syntaxError("Missing value");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean parse(org.json.XMLTokener r10, org.json.JSONObject r11, java.lang.String r12) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.json.XML.parse(org.json.XMLTokener, org.json.JSONObject, java.lang.String):boolean");
    }

    public static Object stringToValue(String str) {
        if (str.equals("")) {
            return str;
        }
        if (str.equalsIgnoreCase("true")) {
            return Boolean.TRUE;
        }
        if (str.equalsIgnoreCase("false")) {
            return Boolean.FALSE;
        }
        if (str.equalsIgnoreCase("null")) {
            return JSONObject.NULL;
        }
        boolean z = false;
        if (str.equals("0")) {
            return new Integer(0);
        }
        try {
            char cCharAt = str.charAt(0);
            if (cCharAt == '-') {
                cCharAt = str.charAt(1);
                z = true;
            }
            if (cCharAt == '0') {
                if (str.charAt(z ? 2 : 1) == '0') {
                    return str;
                }
            }
            if (cCharAt >= '0' && cCharAt <= '9') {
                if (str.indexOf(46) >= 0) {
                    return Double.valueOf(str);
                }
                if (str.indexOf(101) < 0 && str.indexOf(69) < 0) {
                    Long l = new Long(str);
                    return l.longValue() == ((long) l.intValue()) ? new Integer(l.intValue()) : l;
                }
            }
        } catch (Exception unused) {
        }
        return str;
    }

    public static JSONObject toJSONObject(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        XMLTokener xMLTokener = new XMLTokener(str);
        while (xMLTokener.more() && xMLTokener.skipPast("<")) {
            parse(xMLTokener, jSONObject, null);
        }
        return jSONObject;
    }

    public static String toString(Object obj) throws JSONException {
        return toString(obj, null);
    }

    public static String toString(Object obj, String str) throws JSONException {
        StringBuffer stringBuffer = new StringBuffer();
        if (!(obj instanceof JSONObject)) {
            if (obj.getClass().isArray()) {
                obj = new JSONArray(obj);
            }
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    stringBuffer.append(toString(jSONArray.opt(i), str == null ? "array" : str));
                }
                return stringBuffer.toString();
            }
            String strEscape = escape(obj.toString());
            if (str == null) {
                return "\"" + strEscape + "\"";
            }
            if (strEscape.length() == 0) {
                return "<" + str + "/>";
            }
            return "<" + str + ">" + strEscape + "</" + str + ">";
        }
        if (str != null) {
            stringBuffer.append(Typography.less);
            stringBuffer.append(str);
            stringBuffer.append(Typography.greater);
        }
        JSONObject jSONObject = (JSONObject) obj;
        Iterator itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String string = itKeys.next().toString();
            Object objOpt = jSONObject.opt(string);
            if (objOpt == null) {
                objOpt = "";
            }
            if (objOpt instanceof String) {
            }
            if (string.equals("content")) {
                if (objOpt instanceof JSONArray) {
                    JSONArray jSONArray2 = (JSONArray) objOpt;
                    int length2 = jSONArray2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        if (i2 > 0) {
                            stringBuffer.append('\n');
                        }
                        stringBuffer.append(escape(jSONArray2.get(i2).toString()));
                    }
                } else {
                    stringBuffer.append(escape(objOpt.toString()));
                }
            } else if (objOpt instanceof JSONArray) {
                JSONArray jSONArray3 = (JSONArray) objOpt;
                int length3 = jSONArray3.length();
                for (int i3 = 0; i3 < length3; i3++) {
                    Object obj2 = jSONArray3.get(i3);
                    if (obj2 instanceof JSONArray) {
                        stringBuffer.append(Typography.less);
                        stringBuffer.append(string);
                        stringBuffer.append(Typography.greater);
                        stringBuffer.append(toString(obj2));
                        stringBuffer.append("</");
                        stringBuffer.append(string);
                        stringBuffer.append(Typography.greater);
                    } else {
                        stringBuffer.append(toString(obj2, string));
                    }
                }
            } else if (objOpt.equals("")) {
                stringBuffer.append(Typography.less);
                stringBuffer.append(string);
                stringBuffer.append("/>");
            } else {
                stringBuffer.append(toString(objOpt, string));
            }
        }
        if (str != null) {
            stringBuffer.append("</");
            stringBuffer.append(str);
            stringBuffer.append(Typography.greater);
        }
        return stringBuffer.toString();
    }
}
