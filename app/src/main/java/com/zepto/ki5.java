package com.zepto;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ki5 {
    public static int a(Parcel parcel) {
        return s(parcel, 20293);
    }

    public static void b(Parcel parcel, int i) {
        t(parcel, i);
    }

    public static void c(Parcel parcel, int i, boolean z) {
        u(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void d(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle == null) {
            if (z) {
                u(parcel, i, 0);
            }
        } else {
            int iS = s(parcel, i);
            parcel.writeBundle(bundle);
            t(parcel, iS);
        }
    }

    public static void e(Parcel parcel, int i, byte b) {
        u(parcel, i, 4);
        parcel.writeInt(b);
    }

    public static void f(Parcel parcel, int i, double d) {
        u(parcel, i, 8);
        parcel.writeDouble(d);
    }

    public static void g(Parcel parcel, int i, float f) {
        u(parcel, i, 4);
        parcel.writeFloat(f);
    }

    public static void h(Parcel parcel, int i, Float f, boolean z) {
        if (f != null) {
            u(parcel, i, 4);
            parcel.writeFloat(f.floatValue());
        } else if (z) {
            u(parcel, i, 0);
        }
    }

    public static void i(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder == null) {
            if (z) {
                u(parcel, i, 0);
            }
        } else {
            int iS = s(parcel, i);
            parcel.writeStrongBinder(iBinder);
            t(parcel, iS);
        }
    }

    public static void j(Parcel parcel, int i, int i2) {
        u(parcel, i, 4);
        parcel.writeInt(i2);
    }

    public static void k(Parcel parcel, int i, int[] iArr, boolean z) {
        if (iArr == null) {
            if (z) {
                u(parcel, i, 0);
            }
        } else {
            int iS = s(parcel, i);
            parcel.writeIntArray(iArr);
            t(parcel, iS);
        }
    }

    public static void l(Parcel parcel, int i, Integer num, boolean z) {
        if (num != null) {
            u(parcel, i, 4);
            parcel.writeInt(num.intValue());
        } else if (z) {
            u(parcel, i, 0);
        }
    }

    public static void m(Parcel parcel, int i, long j) {
        u(parcel, i, 8);
        parcel.writeLong(j);
    }

    public static void n(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable == null) {
            if (z) {
                u(parcel, i, 0);
            }
        } else {
            int iS = s(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            t(parcel, iS);
        }
    }

    public static void o(Parcel parcel, int i, String str, boolean z) {
        if (str == null) {
            if (z) {
                u(parcel, i, 0);
            }
        } else {
            int iS = s(parcel, i);
            parcel.writeString(str);
            t(parcel, iS);
        }
    }

    public static void p(Parcel parcel, int i, List list, boolean z) {
        if (list == null) {
            if (z) {
                u(parcel, i, 0);
            }
        } else {
            int iS = s(parcel, i);
            parcel.writeStringList(list);
            t(parcel, iS);
        }
    }

    public static void q(Parcel parcel, int i, Parcelable[] parcelableArr, int i2, boolean z) {
        if (parcelableArr == null) {
            if (z) {
                u(parcel, i, 0);
                return;
            }
            return;
        }
        int iS = s(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                v(parcel, parcelable, i2);
            }
        }
        t(parcel, iS);
    }

    public static void r(Parcel parcel, int i, List list, boolean z) {
        if (list == null) {
            if (z) {
                u(parcel, i, 0);
                return;
            }
            return;
        }
        int iS = s(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                v(parcel, parcelable, 0);
            }
        }
        t(parcel, iS);
    }

    public static int s(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void t(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    public static void u(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    public static void v(Parcel parcel, Parcelable parcelable, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }
}
