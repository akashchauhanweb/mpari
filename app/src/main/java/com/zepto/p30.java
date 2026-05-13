package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.h;
import com.zepto.dh2;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class p30 implements Parcelable {
    public static final Parcelable.Creator<p30> CREATOR = new a();
    public final int[] c;
    public final ArrayList e;
    public final int[] f;
    public final int[] g;
    public final int h;
    public final String i;
    public final int j;
    public final int k;
    public final CharSequence l;
    public final int m;
    public final CharSequence n;
    public final ArrayList o;
    public final ArrayList p;
    public final boolean q;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p30 createFromParcel(Parcel parcel) {
            return new p30(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public p30[] newArray(int i) {
            return new p30[i];
        }
    }

    public p30(o30 o30Var) {
        int size = o30Var.c.size();
        this.c = new int[size * 6];
        if (!o30Var.i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.e = new ArrayList(size);
        this.f = new int[size];
        this.g = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            dh2.a aVar = (dh2.a) o30Var.c.get(i2);
            int i3 = i + 1;
            this.c[i] = aVar.a;
            ArrayList arrayList = this.e;
            sf2 sf2Var = aVar.b;
            arrayList.add(sf2Var != null ? sf2Var.f : null);
            int[] iArr = this.c;
            iArr[i3] = aVar.c ? 1 : 0;
            iArr[i + 2] = aVar.d;
            iArr[i + 3] = aVar.e;
            int i4 = i + 5;
            iArr[i + 4] = aVar.f;
            i += 6;
            iArr[i4] = aVar.g;
            this.f[i2] = aVar.h.ordinal();
            this.g[i2] = aVar.i.ordinal();
        }
        this.h = o30Var.h;
        this.i = o30Var.k;
        this.j = o30Var.v;
        this.k = o30Var.l;
        this.l = o30Var.m;
        this.m = o30Var.n;
        this.n = o30Var.o;
        this.o = o30Var.p;
        this.p = o30Var.q;
        this.q = o30Var.r;
    }

    public final void c(o30 o30Var) {
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i >= this.c.length) {
                o30Var.h = this.h;
                o30Var.k = this.i;
                o30Var.i = true;
                o30Var.l = this.k;
                o30Var.m = this.l;
                o30Var.n = this.m;
                o30Var.o = this.n;
                o30Var.p = this.o;
                o30Var.q = this.p;
                o30Var.r = this.q;
                return;
            }
            dh2.a aVar = new dh2.a();
            int i3 = i + 1;
            aVar.a = this.c[i];
            if (mg2.J0(2)) {
                Log.v("FragmentManager", "Instantiate " + o30Var + " op #" + i2 + " base fragment #" + this.c[i3]);
            }
            aVar.h = h.b.values()[this.f[i2]];
            aVar.i = h.b.values()[this.g[i2]];
            int[] iArr = this.c;
            int i4 = i + 2;
            if (iArr[i3] == 0) {
                z = false;
            }
            aVar.c = z;
            int i5 = iArr[i4];
            aVar.d = i5;
            int i6 = iArr[i + 3];
            aVar.e = i6;
            int i7 = i + 5;
            int i8 = iArr[i + 4];
            aVar.f = i8;
            i += 6;
            int i9 = iArr[i7];
            aVar.g = i9;
            o30Var.d = i5;
            o30Var.e = i6;
            o30Var.f = i8;
            o30Var.g = i9;
            o30Var.f(aVar);
            i2++;
        }
    }

    public o30 d(mg2 mg2Var) {
        o30 o30Var = new o30(mg2Var);
        c(o30Var);
        o30Var.v = this.j;
        for (int i = 0; i < this.e.size(); i++) {
            String str = (String) this.e.get(i);
            if (str != null) {
                ((dh2.a) o30Var.c.get(i)).b = mg2Var.e0(str);
            }
        }
        o30Var.t(1);
        return o30Var;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public o30 e(mg2 mg2Var, Map map) {
        o30 o30Var = new o30(mg2Var);
        c(o30Var);
        for (int i = 0; i < this.e.size(); i++) {
            String str = (String) this.e.get(i);
            if (str != null) {
                sf2 sf2Var = (sf2) map.get(str);
                if (sf2Var == null) {
                    throw new IllegalStateException("Restoring FragmentTransaction " + this.i + " failed due to missing saved state for Fragment (" + str + ")");
                }
                ((dh2.a) o30Var.c.get(i)).b = sf2Var;
            }
        }
        return o30Var;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.c);
        parcel.writeStringList(this.e);
        parcel.writeIntArray(this.f);
        parcel.writeIntArray(this.g);
        parcel.writeInt(this.h);
        parcel.writeString(this.i);
        parcel.writeInt(this.j);
        parcel.writeInt(this.k);
        TextUtils.writeToParcel(this.l, parcel, 0);
        parcel.writeInt(this.m);
        TextUtils.writeToParcel(this.n, parcel, 0);
        parcel.writeStringList(this.o);
        parcel.writeStringList(this.p);
        parcel.writeInt(this.q ? 1 : 0);
    }

    public p30(Parcel parcel) {
        this.c = parcel.createIntArray();
        this.e = parcel.createStringArrayList();
        this.f = parcel.createIntArray();
        this.g = parcel.createIntArray();
        this.h = parcel.readInt();
        this.i = parcel.readString();
        this.j = parcel.readInt();
        this.k = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.l = (CharSequence) creator.createFromParcel(parcel);
        this.m = parcel.readInt();
        this.n = (CharSequence) creator.createFromParcel(parcel);
        this.o = parcel.createStringArrayList();
        this.p = parcel.createStringArrayList();
        this.q = parcel.readInt() != 0;
    }
}
