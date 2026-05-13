package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public abstract class z1 implements Parcelable {
    public final Parcelable c;
    public static final z1 e = new a();
    public static final Parcelable.Creator<z1> CREATOR = new b();

    public class a extends z1 {
        public a() {
            super((a) null);
        }
    }

    public class b implements Parcelable.ClassLoaderCreator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public z1 createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public z1 createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return z1.e;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public z1[] newArray(int i) {
            return new z1[i];
        }
    }

    public /* synthetic */ z1(a aVar) {
        this();
    }

    public final Parcelable c() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.c, i);
    }

    public z1() {
        this.c = null;
    }

    public z1(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.c = parcelable == e ? null : parcelable;
    }

    public z1(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.c = parcelable == null ? e : parcelable;
    }
}
