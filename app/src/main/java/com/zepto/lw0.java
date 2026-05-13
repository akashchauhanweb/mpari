package com.zepto;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.zepto.if4;

/* JADX INFO: loaded from: classes.dex */
public final class lw0 extends p2 {
    public final int c;
    public final int e;
    public final PendingIntent f;
    public final String g;
    public static final lw0 h = new lw0(0);
    public static final Parcelable.Creator<lw0> CREATOR = new y88();

    public lw0(int i, int i2, PendingIntent pendingIntent, String str) {
        this.c = i;
        this.e = i2;
        this.f = pendingIntent;
        this.g = str;
    }

    public static String h(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i + ")";
                }
        }
    }

    public int c() {
        return this.e;
    }

    public String d() {
        return this.g;
    }

    public PendingIntent e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lw0)) {
            return false;
        }
        lw0 lw0Var = (lw0) obj;
        return this.e == lw0Var.e && if4.a(this.f, lw0Var.f) && if4.a(this.g, lw0Var.g);
    }

    public boolean f() {
        return (this.e == 0 || this.f == null) ? false : true;
    }

    public boolean g() {
        return this.e == 0;
    }

    public int hashCode() {
        return if4.b(Integer.valueOf(this.e), this.f, this.g);
    }

    public String toString() {
        if4.a aVarC = if4.c(this);
        aVarC.a("statusCode", h(this.e));
        aVarC.a("resolution", this.f);
        aVarC.a("message", this.g);
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iA = ki5.a(parcel);
        ki5.j(parcel, 1, this.c);
        ki5.j(parcel, 2, c());
        ki5.n(parcel, 3, e(), i, false);
        ki5.o(parcel, 4, d(), false);
        ki5.b(parcel, iA);
    }

    public lw0(int i) {
        this(i, null, null);
    }

    public lw0(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    public lw0(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }
}
