package com.zepto;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.zepto.ul2;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public class vj2 {
    public final hc2 a;
    public final lt3 b;
    public final ff5 c;
    public final nx4 d;
    public final nx4 e;
    public final uc2 f;

    public vj2(hc2 hc2Var, lt3 lt3Var, nx4 nx4Var, nx4 nx4Var2, uc2 uc2Var) {
        this(hc2Var, lt3Var, new ff5(hc2Var.j()), nx4Var, nx4Var2, uc2Var);
    }

    public static String b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    public static boolean g(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    public final Task c(Task task) {
        return task.h(new hw4(), new cz0() { // from class: com.zepto.uj2
            @Override // com.zepto.cz0
            public final Object a(Task task2) {
                return this.a.h(task2);
            }
        });
    }

    public final String d() {
        try {
            return b(MessageDigest.getInstance("SHA-1").digest(this.a.l().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    public Task e() {
        return c(j(lt3.c(this.a), "*", new Bundle()));
    }

    public final String f(Bundle bundle) throws IOException {
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    public final /* synthetic */ String h(Task task) {
        return f((Bundle) task.l(IOException.class));
    }

    public final void i(String str, String str2, Bundle bundle) {
        ul2.a aVarB;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.a.m().c());
        bundle.putString("gmsv", Integer.toString(this.b.d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.b.a());
        bundle.putString("app_ver_name", this.b.b());
        bundle.putString("firebase-app-name-hash", d());
        try {
            String strB = ((a03) gd6.a(this.f.a(false))).b();
            if (TextUtils.isEmpty(strB)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", strB);
            }
        } catch (InterruptedException e) {
            e = e;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        } catch (ExecutionException e2) {
            e = e2;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString("appid", (String) gd6.a(this.f.c()));
        bundle.putString("cliv", "fcm-23.4.0");
        ul2 ul2Var = (ul2) this.e.get();
        vr6 vr6Var = (vr6) this.d.get();
        if (ul2Var == null || vr6Var == null || (aVarB = ul2Var.b("fire-iid")) == ul2.a.NONE) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(aVarB.a()));
        bundle.putString("Firebase-Client", vr6Var.a());
    }

    public final Task j(String str, String str2, Bundle bundle) {
        try {
            i(str, str2, bundle);
            return this.c.b(bundle);
        } catch (InterruptedException | ExecutionException e) {
            return gd6.d(e);
        }
    }

    public Task k(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return c(j(str, "/topics/" + str2, bundle));
    }

    public Task l(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", VContant.MAINSCREEN);
        return c(j(str, "/topics/" + str2, bundle));
    }

    public vj2(hc2 hc2Var, lt3 lt3Var, ff5 ff5Var, nx4 nx4Var, nx4 nx4Var2, uc2 uc2Var) {
        this.a = hc2Var;
        this.b = lt3Var;
        this.c = ff5Var;
        this.d = nx4Var;
        this.e = nx4Var2;
        this.f = uc2Var;
    }
}
