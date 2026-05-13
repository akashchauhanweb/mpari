package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class zx implements Parcelable {
    public static final Parcelable.Creator<zx> CREATOR = new a();
    public final String c;
    public final float e;
    public final float f;

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public zx createFromParcel(Parcel parcel) {
            return new zx(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public zx[] newArray(int i) {
            return new zx[i];
        }
    }

    public zx(String str, float f, float f2) {
        this.c = str;
        this.e = f;
        this.f = f2;
    }

    public String c() {
        return this.c;
    }

    public float d() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float e() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeFloat(this.e);
        parcel.writeFloat(this.f);
    }

    public zx(Parcel parcel) {
        this.c = parcel.readString();
        this.e = parcel.readFloat();
        this.f = parcel.readFloat();
    }
}
