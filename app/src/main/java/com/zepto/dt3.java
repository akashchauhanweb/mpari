package com.zepto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class dt3 {
    public static HashMap a;
    public static HashMap b;

    static {
        a = new HashMap();
        try {
            a = c("en", null);
        } catch (Exception unused) {
        }
        if (a == null) {
            a = new HashMap();
        }
    }

    public static String a(String str, int i) {
        return b(str, String.valueOf(i), null, null, null);
    }

    public static String b(String str, Object... objArr) {
        String strD = d(str);
        if (objArr != null) {
            int i = 1;
            for (Object obj : objArr) {
                if (obj != null) {
                    strD = strD.replaceAll("\\{" + i + "\\}", obj.toString());
                }
                i++;
            }
        }
        return strD;
    }

    public static HashMap c(String str, String str2) throws Throwable {
        String str3;
        if (str == null) {
            throw new IllegalArgumentException("The language cannot be null.");
        }
        InputStream inputStream = null;
        try {
            if (str2 != null) {
                str3 = str + "_" + str2 + ".lng";
            } else {
                str3 = str + ".lng";
            }
            new dt3();
            InputStream inputStreamR = s40.r("l10n/error/" + str3, dt3.class.getClassLoader());
            try {
                if (inputStreamR != null) {
                    HashMap mapE = e(inputStreamR);
                    try {
                        inputStreamR.close();
                    } catch (Exception unused) {
                    }
                    return mapE;
                }
                if (str2 == null) {
                    if (inputStreamR != null) {
                        try {
                            inputStreamR.close();
                        } catch (Exception unused2) {
                        }
                    }
                    return null;
                }
                new dt3();
                InputStream inputStreamR2 = s40.r("l10n/error/" + (str + ".lng"), dt3.class.getClassLoader());
                if (inputStreamR2 == null) {
                    if (inputStreamR2 != null) {
                        try {
                            inputStreamR2.close();
                        } catch (Exception unused3) {
                        }
                    }
                    return null;
                }
                try {
                    HashMap mapE2 = e(inputStreamR2);
                    try {
                        inputStreamR2.close();
                    } catch (Exception unused4) {
                    }
                    return mapE2;
                } catch (Throwable th) {
                    inputStream = inputStreamR2;
                    th = th;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception unused5) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream = inputStreamR;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static String d(String str) {
        String str2;
        HashMap map = b;
        if (map != null && (str2 = (String) map.get(str)) != null) {
            return str2;
        }
        String str3 = (String) a.get(str);
        if (str3 != null) {
            return str3;
        }
        return "No message found for " + str;
    }

    public static HashMap e(InputStream inputStream) {
        return f(new InputStreamReader(inputStream, "UTF-8"));
    }

    public static HashMap f(Reader reader) throws IOException {
        HashMap map = new HashMap();
        BufferedReader bufferedReader = new BufferedReader(reader);
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return map;
            }
            int iIndexOf = line.indexOf(61);
            if (iIndexOf >= 0) {
                String strTrim = line.substring(0, iIndexOf).trim();
                if (!strTrim.startsWith("#")) {
                    map.put(strTrim, line.substring(iIndexOf + 1));
                }
            }
        }
    }
}
