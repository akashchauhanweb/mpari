package com.zepto;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public final class p80 {
    public final byte[][] a;
    public final int b;
    public final int c;

    public p80(int i, int i2) {
        this.a = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i, i2);
        this.b = i;
        this.c = i2;
    }

    public void a(byte b) {
        for (int i = 0; i < this.b; i++) {
            for (int i2 = 0; i2 < this.c; i2++) {
                this.a[i][i2] = b;
            }
        }
    }

    public byte b(int i, int i2) {
        return this.a[i][i2];
    }

    public byte[][] c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public void e(int i, int i2, int i3) {
        this.a[i][i2] = (byte) i3;
    }

    public int f() {
        return this.c;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < this.b; i++) {
            for (int i2 = 0; i2 < this.c; i2++) {
                byte b = this.a[i][i2];
                if (b == 0) {
                    stringBuffer.append(" 0");
                } else if (b != 1) {
                    stringBuffer.append("  ");
                } else {
                    stringBuffer.append(" 1");
                }
            }
            stringBuffer.append('\n');
        }
        return stringBuffer.toString();
    }
}
