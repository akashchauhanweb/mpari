package com.zepto;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/* JADX INFO: loaded from: classes.dex */
public final class vf8 {
    public static final z68 d = new z68("PackMetadataManager");
    public final s98 a;
    public final xf8 b;
    public final n58 c;

    public vf8(s98 s98Var, xf8 xf8Var, n58 n58Var) {
        this.a = s98Var;
        this.b = xf8Var;
        this.c = n58Var;
    }

    public final String a(String str) {
        if (this.c.a("assetOnlyUpdates") && this.a.f(str)) {
            int iA = this.b.a();
            s98 s98Var = this.a;
            File fileX = s98Var.x(str, iA, s98Var.r(str));
            try {
                if (!fileX.exists()) {
                    return String.valueOf(iA);
                }
                FileInputStream fileInputStream = new FileInputStream(fileX);
                try {
                    Properties properties = new Properties();
                    properties.load(fileInputStream);
                    fileInputStream.close();
                    String property = properties.getProperty("moduleVersionTag");
                    return property == null ? String.valueOf(iA) : property;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            } catch (IOException unused2) {
                d.b("Failed to read pack version tag for pack %s", str);
            }
        }
        return "";
    }

    public final void b(String str, int i, long j, String str2) throws IOException {
        if (str2 == null || str2.isEmpty()) {
            str2 = String.valueOf(i);
        }
        Properties properties = new Properties();
        properties.put("moduleVersionTag", str2);
        File fileX = this.a.x(str, i, j);
        fileX.getParentFile().mkdirs();
        fileX.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(fileX);
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }
}
