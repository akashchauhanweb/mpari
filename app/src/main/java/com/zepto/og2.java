package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;
import com.zepto.mg2;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class og2 implements Parcelable {
    public static final Parcelable.Creator<og2> CREATOR = new a();
    public ArrayList c;
    public ArrayList e;
    public p30[] f;
    public int g;
    public String h;
    public ArrayList i;
    public ArrayList j;
    public ArrayList k;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public og2 createFromParcel(Parcel parcel) {
            return new og2(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public og2[] newArray(int i) {
            return new og2[i];
        }
    }

    public og2() {
        this.h = null;
        this.i = new ArrayList();
        this.j = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.c);
        parcel.writeStringList(this.e);
        parcel.writeTypedArray(this.f, i);
        parcel.writeInt(this.g);
        parcel.writeString(this.h);
        parcel.writeStringList(this.i);
        parcel.writeTypedList(this.j);
        parcel.writeTypedList(this.k);
    }

    public og2(Parcel parcel) {
        this.h = null;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.c = parcel.createStringArrayList();
        this.e = parcel.createStringArrayList();
        this.f = (p30[]) parcel.createTypedArray(p30.CREATOR);
        this.g = parcel.readInt();
        this.h = parcel.readString();
        this.i = parcel.createStringArrayList();
        this.j = parcel.createTypedArrayList(q30.CREATOR);
        this.k = parcel.createTypedArrayList(mg2.k.CREATOR);
    }
}
