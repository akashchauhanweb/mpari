package com.zepto;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import kotlin.UByte;

/* JADX INFO: loaded from: classes.dex */
public abstract class ot6 {

    public static class a implements Runnable {
        public final /* synthetic */ int c;

        public a(int i) {
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            List<cw1> listC = ju0.d().b().c(this.c);
            if (listC != null) {
                for (cw1 cw1Var : listC) {
                    String strD = ot6.d(cw1Var.a(), cw1Var.d());
                    ju0.d().b().remove(cw1Var.e());
                    File file = new File(strD);
                    if (file.exists()) {
                        file.delete();
                    }
                }
            }
        }
    }

    public static void a(int i) {
        nz0.b().a().b().execute(new a(i));
    }

    public static String b(String str, String str2) {
        return str + File.separator + str2;
    }

    public static wr2 c(wr2 wr2Var, nw1 nw1Var) {
        int iW = wr2Var.w();
        String strB = wr2Var.B("Location");
        int i = 0;
        while (f(iW)) {
            if (strB == null) {
                throw new IllegalAccessException("Location is null");
            }
            wr2Var.close();
            nw1Var.F(strB);
            wr2Var = ju0.d().c();
            wr2Var.P(nw1Var);
            iW = wr2Var.w();
            strB = wr2Var.B("Location");
            i++;
            if (i >= 10) {
                throw new IllegalAccessException("Max redirection done");
            }
        }
        return wr2Var;
    }

    public static String d(String str, String str2) {
        return b(str, str2) + ".temp";
    }

    public static int e(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str4 = File.separator;
        sb.append(str4);
        sb.append(str2);
        sb.append(str4);
        sb.append(str3);
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(sb.toString().getBytes("UTF-8"));
            StringBuilder sb2 = new StringBuilder(bArrDigest.length * 2);
            for (byte b : bArrDigest) {
                int i = b & UByte.MAX_VALUE;
                if (i < 16) {
                    sb2.append("0");
                }
                sb2.append(Integer.toHexString(i));
            }
            return sb2.toString().hashCode();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UnsupportedEncodingException", e);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException("NoSuchAlgorithmException", e2);
        }
    }

    public static boolean f(int i) {
        return i == 301 || i == 302 || i == 303 || i == 300 || i == 307 || i == 308;
    }

    public static void g(String str, String str2) {
        File file = new File(str);
        try {
            File file2 = new File(str2);
            if (file2.exists() && !file2.delete()) {
                throw new IOException("Deletion Failed");
            }
            if (!file.renameTo(file2)) {
                throw new IOException("Rename Failed");
            }
            if (file.exists()) {
                file.delete();
            }
        } catch (Throwable th) {
            if (file.exists()) {
                file.delete();
            }
            throw th;
        }
    }
}
