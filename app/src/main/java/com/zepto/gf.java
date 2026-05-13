package com.zepto;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class gf implements Parcelable {
    public static final Parcelable.Creator<gf> CREATOR = new a();
    public final int c;
    public final Intent e;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public gf createFromParcel(Parcel parcel) {
            return new gf(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public gf[] newArray(int i) {
            return new gf[i];
        }
    }

    public gf(int i, Intent intent) {
        this.c = i;
        this.e = intent;
    }

    public static String e(int i) {
        return i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK";
    }

    public Intent c() {
        return this.e;
    }

    public int d() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + e(this.c) + ", data=" + this.e + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.e == null ? 0 : 1);
        Intent intent = this.e;
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }

    public gf(Parcel parcel) {
        this.c = parcel.readInt();
        this.e = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
