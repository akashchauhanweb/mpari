package com.zepto;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public abstract class ik8 extends o88 implements sk8 {
    public ik8() {
        super("com.google.android.gms.location.internal.ILocationStatusCallback");
    }

    @Override // com.zepto.o88
    public final boolean c(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) bb8.a(parcel, Status.CREATOR);
        Location location = (Location) bb8.a(parcel, Location.CREATOR);
        bb8.b(parcel);
        x(status, location);
        return true;
    }
}
