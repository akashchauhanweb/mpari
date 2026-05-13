package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public class gp4 extends rp4 {
    public int f;
    public int g;

    public gp4(int i, int i2, int i3) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(i2);
        stringBuffer.append(" ");
        stringBuffer.append(i3);
        stringBuffer.append(" R");
        super(0, stringBuffer.toString());
        this.f = i2;
        this.g = i3;
    }

    public int m() {
        return this.f;
    }

    @Override // com.zepto.rp4
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f);
        stringBuffer.append(" ");
        stringBuffer.append(this.g);
        stringBuffer.append(" R");
        return stringBuffer.toString();
    }

    public gp4(int i, int i2) {
        this(i, i2, 0);
    }
}
