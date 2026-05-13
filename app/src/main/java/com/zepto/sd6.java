package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class sd6 extends p2 {
    public static final Parcelable.Creator<sd6> CREATOR = new r18();
    public final int c;
    public List e;

    public sd6(int i, List list) {
        this.c = i;
        this.e = list;
    }

    public final int c() {
        return this.c;
    }

    public final List d() {
        return this.e;
    }

    public final void e(vt3 vt3Var) {
        if (this.e == null) {
            this.e = new ArrayList();
        }
        this.e.add(vt3Var);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ki5.a(parcel);
        ki5.j(parcel, 1, this.c);
        ki5.r(parcel, 2, this.e, false);
        ki5.b(parcel, iA);
    }
}
