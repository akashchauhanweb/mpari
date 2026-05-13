package com.zepto;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class ji5 {

    public static class a extends RuntimeException {
        public a(String str, Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    public static Bundle a(Parcel parcel, int i) {
        int iT = t(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iT == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iT);
        return bundle;
    }

    public static int[] b(Parcel parcel, int i) {
        int iT = t(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iT == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iT);
        return iArrCreateIntArray;
    }

    public static Parcelable c(Parcel parcel, int i, Parcelable.Creator creator) {
        int iT = t(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iT == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iT);
        return parcelable;
    }

    public static String d(Parcel parcel, int i) {
        int iT = t(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iT == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iT);
        return string;
    }

    public static ArrayList e(Parcel parcel, int i) {
        int iT = t(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iT == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iT);
        return arrayListCreateStringArrayList;
    }

    public static Object[] f(Parcel parcel, int i, Parcelable.Creator creator) {
        int iT = t(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iT == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iT);
        return objArrCreateTypedArray;
    }

    public static ArrayList g(Parcel parcel, int i, Parcelable.Creator creator) {
        int iT = t(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iT == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iT);
        return arrayListCreateTypedArrayList;
    }

    public static void h(Parcel parcel, int i) {
        if (parcel.dataPosition() == i) {
            return;
        }
        throw new a("Overread allowed size end=" + i, parcel);
    }

    public static int i(int i) {
        return (char) i;
    }

    public static boolean j(Parcel parcel, int i) {
        x(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static byte k(Parcel parcel, int i) {
        x(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    public static double l(Parcel parcel, int i) {
        x(parcel, i, 8);
        return parcel.readDouble();
    }

    public static float m(Parcel parcel, int i) {
        x(parcel, i, 4);
        return parcel.readFloat();
    }

    public static Float n(Parcel parcel, int i) {
        int iT = t(parcel, i);
        if (iT == 0) {
            return null;
        }
        w(parcel, i, iT, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int o(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder p(Parcel parcel, int i) {
        int iT = t(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iT == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iT);
        return strongBinder;
    }

    public static int q(Parcel parcel, int i) {
        x(parcel, i, 4);
        return parcel.readInt();
    }

    public static Integer r(Parcel parcel, int i) {
        int iT = t(parcel, i);
        if (iT == 0) {
            return null;
        }
        w(parcel, i, iT, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long s(Parcel parcel, int i) {
        x(parcel, i, 8);
        return parcel.readLong();
    }

    public static int t(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static void u(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + t(parcel, i));
    }

    public static int v(Parcel parcel) {
        int iO = o(parcel);
        int iT = t(parcel, iO);
        int iDataPosition = parcel.dataPosition();
        if (i(iO) != 20293) {
            throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(iO))), parcel);
        }
        int i = iT + iDataPosition;
        if (i >= iDataPosition && i <= parcel.dataSize()) {
            return i;
        }
        throw new a("Size read is invalid start=" + iDataPosition + " end=" + i, parcel);
    }

    public static void w(Parcel parcel, int i, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        throw new a("Expected size " + i3 + " got " + i2 + " (0x" + Integer.toHexString(i2) + ")", parcel);
    }

    public static void x(Parcel parcel, int i, int i2) {
        int iT = t(parcel, i);
        if (iT == i2) {
            return;
        }
        throw new a("Expected size " + i2 + " got " + iT + " (0x" + Integer.toHexString(iT) + ")", parcel);
    }
}
