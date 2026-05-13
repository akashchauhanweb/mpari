package com.zepto;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class f85 extends p2 {
    public static final Parcelable.Creator<f85> CREATOR = new g85();
    public Bundle c;
    public b e;

    public static class b {
        public final String a;
        public final String b;
        public final String[] c;
        public final String d;
        public final String e;
        public final String[] f;
        public final String g;
        public final String h;
        public final String i;
        public final String j;
        public final String k;
        public final String l;
        public final String m;
        public final Uri n;
        public final String o;
        public final Integer p;
        public final Integer q;
        public final Integer r;
        public final int[] s;
        public final Long t;
        public final boolean u;
        public final boolean v;
        public final boolean w;
        public final boolean x;
        public final boolean y;
        public final long[] z;

        public static String[] b(ee4 ee4Var, String str) {
            Object[] objArrG = ee4Var.g(str);
            if (objArrG == null) {
                return null;
            }
            String[] strArr = new String[objArrG.length];
            for (int i = 0; i < objArrG.length; i++) {
                strArr[i] = String.valueOf(objArrG[i]);
            }
            return strArr;
        }

        public String a() {
            return this.d;
        }

        public String c() {
            return this.a;
        }

        public b(ee4 ee4Var) {
            this.a = ee4Var.p("gcm.n.title");
            this.b = ee4Var.h("gcm.n.title");
            this.c = b(ee4Var, "gcm.n.title");
            this.d = ee4Var.p("gcm.n.body");
            this.e = ee4Var.h("gcm.n.body");
            this.f = b(ee4Var, "gcm.n.body");
            this.g = ee4Var.p("gcm.n.icon");
            this.i = ee4Var.o();
            this.j = ee4Var.p("gcm.n.tag");
            this.k = ee4Var.p("gcm.n.color");
            this.l = ee4Var.p("gcm.n.click_action");
            this.m = ee4Var.p("gcm.n.android_channel_id");
            this.n = ee4Var.f();
            this.h = ee4Var.p("gcm.n.image");
            this.o = ee4Var.p("gcm.n.ticker");
            this.p = ee4Var.b("gcm.n.notification_priority");
            this.q = ee4Var.b("gcm.n.visibility");
            this.r = ee4Var.b("gcm.n.notification_count");
            this.u = ee4Var.a("gcm.n.sticky");
            this.v = ee4Var.a("gcm.n.local_only");
            this.w = ee4Var.a("gcm.n.default_sound");
            this.x = ee4Var.a("gcm.n.default_vibrate_timings");
            this.y = ee4Var.a("gcm.n.default_light_settings");
            this.t = ee4Var.j("gcm.n.event_time");
            this.s = ee4Var.e();
            this.z = ee4Var.q();
        }
    }

    public f85(Bundle bundle) {
        this.c = bundle;
    }

    public b c() {
        if (this.e == null && ee4.t(this.c)) {
            this.e = new b(new ee4(this.c));
        }
        return this.e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        g85.c(this, parcel, i);
    }
}
