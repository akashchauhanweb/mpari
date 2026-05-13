package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.h;

/* JADX INFO: loaded from: classes.dex */
public final class xg2 implements Parcelable {
    public static final Parcelable.Creator<xg2> CREATOR = new a();
    public final String c;
    public final String e;
    public final boolean f;
    public final int g;
    public final int h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final int n;
    public final String o;
    public final int p;
    public final boolean q;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public xg2 createFromParcel(Parcel parcel) {
            return new xg2(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public xg2[] newArray(int i) {
            return new xg2[i];
        }
    }

    public xg2(sf2 sf2Var) {
        this.c = sf2Var.getClass().getName();
        this.e = sf2Var.f;
        this.f = sf2Var.o;
        this.g = sf2Var.x;
        this.h = sf2Var.y;
        this.i = sf2Var.z;
        this.j = sf2Var.C;
        this.k = sf2Var.m;
        this.l = sf2Var.B;
        this.m = sf2Var.A;
        this.n = sf2Var.S.ordinal();
        this.o = sf2Var.i;
        this.p = sf2Var.j;
        this.q = sf2Var.K;
    }

    public sf2 c(dg2 dg2Var, ClassLoader classLoader) {
        sf2 sf2VarA = dg2Var.a(classLoader, this.c);
        sf2VarA.f = this.e;
        sf2VarA.o = this.f;
        sf2VarA.q = true;
        sf2VarA.x = this.g;
        sf2VarA.y = this.h;
        sf2VarA.z = this.i;
        sf2VarA.C = this.j;
        sf2VarA.m = this.k;
        sf2VarA.B = this.l;
        sf2VarA.A = this.m;
        sf2VarA.S = h.b.values()[this.n];
        sf2VarA.i = this.o;
        sf2VarA.j = this.p;
        sf2VarA.K = this.q;
        return sf2VarA;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.c);
        sb.append(" (");
        sb.append(this.e);
        sb.append(")}:");
        if (this.f) {
            sb.append(" fromLayout");
        }
        if (this.h != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.h));
        }
        String str = this.i;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.i);
        }
        if (this.j) {
            sb.append(" retainInstance");
        }
        if (this.k) {
            sb.append(" removing");
        }
        if (this.l) {
            sb.append(" detached");
        }
        if (this.m) {
            sb.append(" hidden");
        }
        if (this.o != null) {
            sb.append(" targetWho=");
            sb.append(this.o);
            sb.append(" targetRequestCode=");
            sb.append(this.p);
        }
        if (this.q) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeString(this.e);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeString(this.i);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeInt(this.m ? 1 : 0);
        parcel.writeInt(this.n);
        parcel.writeString(this.o);
        parcel.writeInt(this.p);
        parcel.writeInt(this.q ? 1 : 0);
    }

    public xg2(Parcel parcel) {
        this.c = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readInt() != 0;
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = parcel.readString();
        this.j = parcel.readInt() != 0;
        this.k = parcel.readInt() != 0;
        this.l = parcel.readInt() != 0;
        this.m = parcel.readInt() != 0;
        this.n = parcel.readInt();
        this.o = parcel.readString();
        this.p = parcel.readInt();
        this.q = parcel.readInt() != 0;
    }
}
