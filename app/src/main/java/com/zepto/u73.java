package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class u73 implements Parcelable {
    public static final Parcelable.Creator<u73> CREATOR = new a();
    public final String c;
    public final String e;
    public final ArrayList f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u73 createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(t93.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new u73(string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final u73[] newArray(int i) {
            return new u73[i];
        }
    }

    public u73(String bioId, String allClassOfVehicles, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(bioId, "bioId");
        Intrinsics.checkNotNullParameter(allClassOfVehicles, "allClassOfVehicles");
        this.c = bioId;
        this.e = allClassOfVehicles;
        this.f = arrayList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u73)) {
            return false;
        }
        u73 u73Var = (u73) obj;
        return Intrinsics.areEqual(this.c, u73Var.c) && Intrinsics.areEqual(this.e, u73Var.e) && Intrinsics.areEqual(this.f, u73Var.f);
    }

    public int hashCode() {
        int iHashCode = ((this.c.hashCode() * 31) + this.e.hashCode()) * 31;
        ArrayList arrayList = this.f;
        return iHashCode + (arrayList == null ? 0 : arrayList.hashCode());
    }

    public String toString() {
        return "LLDetailsModal(bioId=" + this.c + ", allClassOfVehicles=" + this.e + ", LLRefDetails=" + this.f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.c);
        out.writeString(this.e);
        ArrayList arrayList = this.f;
        if (arrayList == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((t93) it.next()).writeToParcel(out, i);
        }
    }
}
