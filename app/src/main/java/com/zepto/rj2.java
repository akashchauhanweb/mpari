package com.zepto;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.StringTokenizer;
import org.json.HTTP;

/* JADX INFO: loaded from: classes.dex */
public abstract class rj2 {
    public static HashMap a = new HashMap();
    public static HashMap b = new HashMap();

    static {
        InputStream inputStream = null;
        try {
            try {
                new ke2();
                InputStream inputStreamR = s40.r("com/itextpdf/text/pdf/fonts/glyphlist.txt", ke2.class.getClassLoader());
                try {
                    if (inputStreamR == null) {
                        throw new Exception("glyphlist.txt not found as resource. (It must exist as resource in the package com.itextpdf.text.pdf.fonts)");
                    }
                    byte[] bArr = new byte[1024];
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        int i = inputStreamR.read(bArr);
                        if (i < 0) {
                            break;
                        } else {
                            byteArrayOutputStream.write(bArr, 0, i);
                        }
                    }
                    inputStreamR.close();
                    StringTokenizer stringTokenizer = new StringTokenizer(xo4.d(byteArrayOutputStream.toByteArray(), null), HTTP.CRLF);
                    while (stringTokenizer.hasMoreTokens()) {
                        String strNextToken = stringTokenizer.nextToken();
                        if (!strNextToken.startsWith("#")) {
                            StringTokenizer stringTokenizer2 = new StringTokenizer(strNextToken, " ;\r\n\t\f");
                            if (stringTokenizer2.hasMoreTokens()) {
                                String strNextToken2 = stringTokenizer2.nextToken();
                                if (stringTokenizer2.hasMoreTokens()) {
                                    Integer numValueOf = Integer.valueOf(stringTokenizer2.nextToken(), 16);
                                    a.put(numValueOf, strNextToken2);
                                    b.put(strNextToken2, new int[]{numValueOf.intValue()});
                                }
                            }
                        }
                    }
                    return;
                } catch (Exception e) {
                    e = e;
                    inputStream = inputStreamR;
                } catch (Throwable th) {
                    th = th;
                    inputStream = inputStreamR;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception unused) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
        System.err.println("glyphlist.txt loading error: " + e.getMessage());
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Exception unused2) {
            }
        }
    }

    public static int[] a(String str) {
        return (int[]) b.get(str);
    }

    public static String b(int i) {
        return (String) a.get(Integer.valueOf(i));
    }
}
