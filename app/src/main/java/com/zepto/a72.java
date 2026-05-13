package com.zepto;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class a72 extends z1 {
    public static final Parcelable.Creator<a72> CREATOR = new a();
    public final w26 f;

    public class a implements Parcelable.ClassLoaderCreator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a72 createFromParcel(Parcel parcel) {
            return new a72(parcel, null, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a72 createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new a72(parcel, classLoader, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a72[] newArray(int i) {
            return new a72[i];
        }
    }

    public /* synthetic */ a72(Parcel parcel, ClassLoader classLoader, a aVar) {
        this(parcel, classLoader);
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f + "}";
    }

    @Override // com.zepto.z1, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int size = this.f.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = (String) this.f.i(i2);
            bundleArr[i2] = (Bundle) this.f.m(i2);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public a72(Parcelable parcelable) {
        super(parcelable);
        this.f = new w26();
    }

    public a72(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i = parcel.readInt();
        String[] strArr = new String[i];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[i];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f = new w26(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.f.put(strArr[i2], bundleArr[i2]);
        }
    }
}
