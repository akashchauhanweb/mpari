package com.zepto;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class gr4 {
    public File a;
    public final hc2 b;

    public enum a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public gr4(hc2 hc2Var) {
        this.b = hc2Var;
    }

    public final File a() {
        if (this.a == null) {
            synchronized (this) {
                try {
                    if (this.a == null) {
                        this.a = new File(this.b.j().getFilesDir(), "PersistedInstallation." + this.b.n() + ".json");
                    }
                } finally {
                }
            }
        }
        return this.a;
    }

    public hr4 b(hr4 hr4Var) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", hr4Var.d());
            jSONObject.put("Status", hr4Var.g().ordinal());
            jSONObject.put("AuthToken", hr4Var.b());
            jSONObject.put("RefreshToken", hr4Var.f());
            jSONObject.put("TokenCreationEpochInSecs", hr4Var.h());
            jSONObject.put("ExpiresInSecs", hr4Var.c());
            jSONObject.put("FisError", hr4Var.e());
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", this.b.j().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!fileCreateTempFile.renameTo(a())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
        return hr4Var;
    }

    public final JSONObject c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(a());
            while (true) {
                try {
                    int i = fileInputStream.read(bArr, 0, 16384);
                    if (i < 0) {
                        JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                        fileInputStream.close();
                        return jSONObject;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        }
    }

    public hr4 d() {
        JSONObject jSONObjectC = c();
        String strOptString = jSONObjectC.optString("Fid", null);
        int iOptInt = jSONObjectC.optInt("Status", a.ATTEMPT_MIGRATION.ordinal());
        String strOptString2 = jSONObjectC.optString("AuthToken", null);
        String strOptString3 = jSONObjectC.optString("RefreshToken", null);
        long jOptLong = jSONObjectC.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObjectC.optLong("ExpiresInSecs", 0L);
        return hr4.a().d(strOptString).g(a.values()[iOptInt]).b(strOptString2).f(strOptString3).h(jOptLong).c(jOptLong2).e(jSONObjectC.optString("FisError", null)).a();
    }
}
