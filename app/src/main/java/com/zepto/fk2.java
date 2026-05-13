package com.zepto;

import android.content.Context;
import android.content.SharedPreferences;
import com.zepto.bq3;
import com.zepto.h22;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class fk2 {
    public static final a d = new a(null);
    public static Context e;
    public static fk2 f;
    public final String a = "GoogleSharedPreference";
    public bq3 b;
    public SharedPreferences c;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final fk2 a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            fk2.e = context;
            if (fk2.f == null) {
                fk2.f = new fk2();
            }
            fk2 fk2Var = fk2.f;
            Intrinsics.checkNotNull(fk2Var);
            return fk2Var;
        }
    }

    public fk2() {
        try {
            Context context = e;
            Intrinsics.checkNotNull(context);
            this.b = new bq3.b(context).b(bq3.c.AES256_GCM).a();
            Context context2 = e;
            Intrinsics.checkNotNull(context2);
            bq3 bq3Var = this.b;
            Intrinsics.checkNotNull(bq3Var);
            this.c = h22.a(context2, "google_shared_pref", bq3Var, h22.d.AES256_SIV, h22.e.AES256_GCM);
        } catch (Exception e2) {
            nn3.c(nn3.a, this.a, e2.toString(), null, 4, null);
        } catch (NoClassDefFoundError e3) {
            nn3.c(nn3.a, this.a, e3.toString(), null, 4, null);
        }
    }

    public final String d(String key, String defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        try {
            SharedPreferences sharedPreferences = this.c;
            if (sharedPreferences == null) {
                return null;
            }
            return sharedPreferences.getString(key, defaultValue);
        } catch (Exception e2) {
            nn3.c(nn3.a, this.a, e2.toString(), null, 4, null);
            return null;
        }
    }

    public final void e(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            SharedPreferences sharedPreferences = this.c;
            Intrinsics.checkNotNull(sharedPreferences);
            sharedPreferences.edit().putString(key, value).apply();
        } catch (Exception e2) {
            nn3.c(nn3.a, this.a, e2.toString(), null, 4, null);
        }
    }
}
