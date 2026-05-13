package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class qc5 implements Parcelable {
    public static final Parcelable.Creator<qc5> CREATOR = new a();

    @x62
    @xy5("pspId")
    public String pspId;

    @x62
    @xy5("pspRefNo")
    public String pspRefNo;
    public String pspRespRefNo;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public qc5 createFromParcel(Parcel parcel) {
            return new qc5(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public qc5[] newArray(int i) {
            return new qc5[i];
        }
    }

    public qc5() {
    }

    public qc5(Parcel parcel) {
        this.pspId = parcel.readString();
        this.pspRefNo = parcel.readString();
        this.pspRespRefNo = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.pspId);
        parcel.writeString(this.pspRefNo);
        parcel.writeString(this.pspRespRefNo);
    }
}
