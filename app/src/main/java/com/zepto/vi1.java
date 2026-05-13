package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class vi1 implements Parcelable {
    public static final Parcelable.Creator<vi1> CREATOR = new a();
    public final String c;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final boolean p;
    public final ArrayList q;
    public final ArrayList r;
    public final ArrayList s;
    public final ArrayList t;
    public final u73 u;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final vi1 createFromParcel(Parcel parcel) {
            boolean z;
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            boolean z2 = parcel.readInt() != 0;
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            boolean z3 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                z = z3;
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i);
                z = z3;
                int i2 = 0;
                while (i2 != i) {
                    arrayList5.add(nr4.CREATOR.createFromParcel(parcel));
                    i2++;
                    i = i;
                }
                arrayList = arrayList5;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i3);
                int i4 = 0;
                while (i4 != i3) {
                    arrayList6.add(il.CREATOR.createFromParcel(parcel));
                    i4++;
                    i3 = i3;
                }
                arrayList2 = arrayList6;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i5 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i5);
                int i6 = 0;
                while (i6 != i5) {
                    arrayList7.add(qv5.CREATOR.createFromParcel(parcel));
                    i6++;
                    i5 = i5;
                }
                arrayList3 = arrayList7;
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int i7 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(i7);
                int i8 = 0;
                while (i8 != i7) {
                    arrayList8.add(w01.CREATOR.createFromParcel(parcel));
                    i8++;
                    i7 = i7;
                }
                arrayList4 = arrayList8;
            }
            return new vi1(string, string2, string3, string4, z2, string5, string6, string7, string8, string9, string10, string11, z, arrayList, arrayList2, arrayList3, arrayList4, u73.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final vi1[] newArray(int i) {
            return new vi1[i];
        }
    }

    public vi1(String statusCode, String statusDesc, String licenceFromState, String applCatg, boolean z, String applDate, String applicationNumber, String licenceFromRTOCode, String licenceFromStateCode, String reference, String licenceFromRTO, String jurisdiction, boolean z2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, u73 LLDetails) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        Intrinsics.checkNotNullParameter(licenceFromState, "licenceFromState");
        Intrinsics.checkNotNullParameter(applCatg, "applCatg");
        Intrinsics.checkNotNullParameter(applDate, "applDate");
        Intrinsics.checkNotNullParameter(applicationNumber, "applicationNumber");
        Intrinsics.checkNotNullParameter(licenceFromRTOCode, "licenceFromRTOCode");
        Intrinsics.checkNotNullParameter(licenceFromStateCode, "licenceFromStateCode");
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(licenceFromRTO, "licenceFromRTO");
        Intrinsics.checkNotNullParameter(jurisdiction, "jurisdiction");
        Intrinsics.checkNotNullParameter(LLDetails, "LLDetails");
        this.c = statusCode;
        this.e = statusDesc;
        this.f = licenceFromState;
        this.g = applCatg;
        this.h = z;
        this.i = applDate;
        this.j = applicationNumber;
        this.k = licenceFromRTOCode;
        this.l = licenceFromStateCode;
        this.m = reference;
        this.n = licenceFromRTO;
        this.o = jurisdiction;
        this.p = z2;
        this.q = arrayList;
        this.r = arrayList2;
        this.s = arrayList3;
        this.t = arrayList4;
        this.u = LLDetails;
    }

    public final ArrayList c() {
        return this.r;
    }

    public final boolean d() {
        return this.h;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vi1)) {
            return false;
        }
        vi1 vi1Var = (vi1) obj;
        return Intrinsics.areEqual(this.c, vi1Var.c) && Intrinsics.areEqual(this.e, vi1Var.e) && Intrinsics.areEqual(this.f, vi1Var.f) && Intrinsics.areEqual(this.g, vi1Var.g) && this.h == vi1Var.h && Intrinsics.areEqual(this.i, vi1Var.i) && Intrinsics.areEqual(this.j, vi1Var.j) && Intrinsics.areEqual(this.k, vi1Var.k) && Intrinsics.areEqual(this.l, vi1Var.l) && Intrinsics.areEqual(this.m, vi1Var.m) && Intrinsics.areEqual(this.n, vi1Var.n) && Intrinsics.areEqual(this.o, vi1Var.o) && this.p == vi1Var.p && Intrinsics.areEqual(this.q, vi1Var.q) && Intrinsics.areEqual(this.r, vi1Var.r) && Intrinsics.areEqual(this.s, vi1Var.s) && Intrinsics.areEqual(this.t, vi1Var.t) && Intrinsics.areEqual(this.u, vi1Var.u);
    }

    public final String f() {
        return this.i;
    }

    public final String g() {
        return this.j;
    }

    public final ArrayList h() {
        return this.t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    public int hashCode() {
        int iHashCode = ((((((this.c.hashCode() * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31;
        boolean z = this.h;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iHashCode2 = (((((((((((((((iHashCode + r1) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + this.o.hashCode()) * 31;
        boolean z2 = this.p;
        int i = (iHashCode2 + (z2 ? 1 : z2)) * 31;
        ArrayList arrayList = this.q;
        int iHashCode3 = (i + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ArrayList arrayList2 = this.r;
        int iHashCode4 = (iHashCode3 + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
        ArrayList arrayList3 = this.s;
        int iHashCode5 = (iHashCode4 + (arrayList3 == null ? 0 : arrayList3.hashCode())) * 31;
        ArrayList arrayList4 = this.t;
        return ((iHashCode5 + (arrayList4 != null ? arrayList4.hashCode() : 0)) * 31) + this.u.hashCode();
    }

    public final String i() {
        return this.o;
    }

    public final String j() {
        return this.n;
    }

    public final String k() {
        return this.k;
    }

    public final String l() {
        return this.l;
    }

    public final ArrayList m() {
        return this.q;
    }

    public final String n() {
        return this.m;
    }

    public final ArrayList o() {
        return this.s;
    }

    public final String p() {
        return this.c;
    }

    public final boolean q() {
        return this.p;
    }

    public String toString() {
        return "DetailsSuccessModal(statusCode=" + this.c + ", statusDesc=" + this.e + ", licenceFromState=" + this.f + ", applCatg=" + this.g + ", allowNewAddr=" + this.h + ", applDate=" + this.i + ", applicationNumber=" + this.j + ", licenceFromRTOCode=" + this.k + ", licenceFromStateCode=" + this.l + ", reference=" + this.m + ", licenceFromRTO=" + this.n + ", jurisdiction=" + this.o + ", willingToDonate=" + this.p + ", personalDetails=" + this.q + ", AddressDetails=" + this.r + ", selectedCovList=" + this.s + ", covDetails=" + this.t + ", LLDetails=" + this.u + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.c);
        out.writeString(this.e);
        out.writeString(this.f);
        out.writeString(this.g);
        out.writeInt(this.h ? 1 : 0);
        out.writeString(this.i);
        out.writeString(this.j);
        out.writeString(this.k);
        out.writeString(this.l);
        out.writeString(this.m);
        out.writeString(this.n);
        out.writeString(this.o);
        out.writeInt(this.p ? 1 : 0);
        ArrayList arrayList = this.q;
        if (arrayList == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((nr4) it.next()).writeToParcel(out, i);
            }
        }
        ArrayList arrayList2 = this.r;
        if (arrayList2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(arrayList2.size());
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((il) it2.next()).writeToParcel(out, i);
            }
        }
        ArrayList arrayList3 = this.s;
        if (arrayList3 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(arrayList3.size());
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                ((qv5) it3.next()).writeToParcel(out, i);
            }
        }
        ArrayList arrayList4 = this.t;
        if (arrayList4 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(arrayList4.size());
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                ((w01) it4.next()).writeToParcel(out, i);
            }
        }
        this.u.writeToParcel(out, i);
    }
}
