package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public class pp7 extends op7 {
    public final SparseIntArray d;
    public final Parcel e;
    public final int f;
    public final int g;
    public final String h;
    public int i;
    public int j;
    public int k;

    public pp7(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new nx(), new nx(), new nx());
    }

    @Override // com.zepto.op7
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.e.writeInt(-1);
        } else {
            this.e.writeInt(bArr.length);
            this.e.writeByteArray(bArr);
        }
    }

    @Override // com.zepto.op7
    public void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.e, 0);
    }

    @Override // com.zepto.op7
    public void E(int i) {
        this.e.writeInt(i);
    }

    @Override // com.zepto.op7
    public void G(Parcelable parcelable) {
        this.e.writeParcelable(parcelable, 0);
    }

    @Override // com.zepto.op7
    public void I(String str) {
        this.e.writeString(str);
    }

    @Override // com.zepto.op7
    public void a() {
        int i = this.i;
        if (i >= 0) {
            int i2 = this.d.get(i);
            int iDataPosition = this.e.dataPosition();
            this.e.setDataPosition(i2);
            this.e.writeInt(iDataPosition - i2);
            this.e.setDataPosition(iDataPosition);
        }
    }

    @Override // com.zepto.op7
    public op7 b() {
        Parcel parcel = this.e;
        int iDataPosition = parcel.dataPosition();
        int i = this.j;
        if (i == this.f) {
            i = this.g;
        }
        return new pp7(parcel, iDataPosition, i, this.h + "  ", this.a, this.b, this.c);
    }

    @Override // com.zepto.op7
    public boolean g() {
        return this.e.readInt() != 0;
    }

    @Override // com.zepto.op7
    public byte[] i() {
        int i = this.e.readInt();
        if (i < 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        this.e.readByteArray(bArr);
        return bArr;
    }

    @Override // com.zepto.op7
    public CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.e);
    }

    @Override // com.zepto.op7
    public boolean m(int i) {
        while (this.j < this.g) {
            int i2 = this.k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.e.setDataPosition(this.j);
            int i3 = this.e.readInt();
            this.k = this.e.readInt();
            this.j += i3;
        }
        return this.k == i;
    }

    @Override // com.zepto.op7
    public int o() {
        return this.e.readInt();
    }

    @Override // com.zepto.op7
    public Parcelable q() {
        return this.e.readParcelable(getClass().getClassLoader());
    }

    @Override // com.zepto.op7
    public String s() {
        return this.e.readString();
    }

    @Override // com.zepto.op7
    public void w(int i) {
        a();
        this.i = i;
        this.d.put(i, this.e.dataPosition());
        E(0);
        E(i);
    }

    @Override // com.zepto.op7
    public void y(boolean z) {
        this.e.writeInt(z ? 1 : 0);
    }

    public pp7(Parcel parcel, int i, int i2, String str, nx nxVar, nx nxVar2, nx nxVar3) {
        super(nxVar, nxVar2, nxVar3);
        this.d = new SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.e = parcel;
        this.f = i;
        this.g = i2;
        this.j = i;
        this.h = str;
    }
}
