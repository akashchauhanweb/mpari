package com.zepto;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class uf6 implements Parcelable {
    public static final Parcelable.Creator<uf6> CREATOR = new a();
    public final jr3 c;
    public final jr3 e;
    public final int f;
    public int g;
    public int h;
    public int i;
    public int j;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public uf6 createFromParcel(Parcel parcel) {
            return new uf6(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public uf6[] newArray(int i) {
            return new uf6[i];
        }
    }

    public uf6(int i, int i2, int i3, int i4) {
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.f = i4;
        this.j = e(i);
        this.c = new jr3(59);
        this.e = new jr3(i4 == 1 ? 23 : 12);
    }

    public static String c(Resources resources, CharSequence charSequence) {
        return d(resources, charSequence, "%02d");
    }

    public static String d(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static int e(int i) {
        return i >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uf6)) {
            return false;
        }
        uf6 uf6Var = (uf6) obj;
        return this.g == uf6Var.g && this.h == uf6Var.h && this.f == uf6Var.f && this.i == uf6Var.i;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.f);
    }

    public uf6(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
