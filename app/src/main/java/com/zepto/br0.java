package com.zepto;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class br0 extends p2 {
    public static final Parcelable.Creator<br0> CREATOR = new i98();
    public final Intent c;

    public br0(Intent intent) {
        this.c = intent;
    }

    public Intent c() {
        return this.c;
    }

    public String d() {
        String stringExtra = this.c.getStringExtra("google.message_id");
        return stringExtra == null ? this.c.getStringExtra("message_id") : stringExtra;
    }

    public final Integer e() {
        if (this.c.hasExtra("google.product_id")) {
            return Integer.valueOf(this.c.getIntExtra("google.product_id", 0));
        }
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iA = ki5.a(parcel);
        ki5.n(parcel, 1, this.c, i, false);
        ki5.b(parcel, iA);
    }
}
