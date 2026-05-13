package com.zepto;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public class m76 {
    public static final Lock c = new ReentrantLock();
    public static m76 d;
    public final Lock a = new ReentrantLock();
    public final SharedPreferences b;

    public m76(Context context) {
        this.b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static m76 a(Context context) {
        iu4.i(context);
        Lock lock = c;
        lock.lock();
        try {
            if (d == null) {
                d = new m76(context.getApplicationContext());
            }
            m76 m76Var = d;
            lock.unlock();
            return m76Var;
        } catch (Throwable th) {
            c.unlock();
            throw th;
        }
    }

    public static final String d(String str, String str2) {
        return str + ":" + str2;
    }

    public GoogleSignInAccount b() {
        String strC;
        String strC2 = c("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strC2) || (strC = c(d("googleSignInAccount", strC2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.m(strC);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final String c(String str) {
        this.a.lock();
        try {
            return this.b.getString(str, null);
        } finally {
            this.a.unlock();
        }
    }
}
