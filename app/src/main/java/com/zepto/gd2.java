package com.zepto;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class gd2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public gd2(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        iu4.l(!j86.a(str), "ApplicationId must be set.");
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public static gd2 a(Context context) {
        e86 e86Var = new e86(context);
        String strA = e86Var.a("google_app_id");
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return new gd2(strA, e86Var.a("google_api_key"), e86Var.a("firebase_database_url"), e86Var.a("ga_trackingId"), e86Var.a("gcm_defaultSenderId"), e86Var.a("google_storage_bucket"), e86Var.a("project_id"));
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.e;
    }

    public String e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof gd2)) {
            return false;
        }
        gd2 gd2Var = (gd2) obj;
        return if4.a(this.b, gd2Var.b) && if4.a(this.a, gd2Var.a) && if4.a(this.c, gd2Var.c) && if4.a(this.d, gd2Var.d) && if4.a(this.e, gd2Var.e) && if4.a(this.f, gd2Var.f) && if4.a(this.g, gd2Var.g);
    }

    public int hashCode() {
        return if4.b(this.b, this.a, this.c, this.d, this.e, this.f, this.g);
    }

    public String toString() {
        return if4.c(this).a("applicationId", this.b).a("apiKey", this.a).a("databaseUrl", this.c).a("gcmSenderId", this.e).a("storageBucket", this.f).a("projectId", this.g).toString();
    }
}
