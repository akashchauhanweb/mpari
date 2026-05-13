package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xm3 extends p2 {
    public static final Parcelable.Creator<xm3> CREATOR = new dn8();
    public final List c;
    public final boolean e;
    public final boolean f;

    public static final class a {
        public final ArrayList a = new ArrayList();
        public boolean b = false;
        public boolean c = false;

        public a a(LocationRequest locationRequest) {
            if (locationRequest != null) {
                this.a.add(locationRequest);
            }
            return this;
        }

        public xm3 b() {
            return new xm3(this.a, this.b, this.c);
        }
    }

    public xm3(List list, boolean z, boolean z2) {
        this.c = list;
        this.e = z;
        this.f = z2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iA = ki5.a(parcel);
        ki5.r(parcel, 1, Collections.unmodifiableList(this.c), false);
        ki5.c(parcel, 2, this.e);
        ki5.c(parcel, 3, this.f);
        ki5.b(parcel, iA);
    }
}
