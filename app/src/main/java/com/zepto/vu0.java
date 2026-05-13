package com.zepto;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class vu0 {
    public final ByteArrayOutputStream a = new ByteArrayOutputStream();

    public static vu0 f() {
        return new vu0();
    }

    public vu0 a(boolean z) {
        this.a.write(z ? 1 : 0);
        return this;
    }

    public byte[] b() {
        return this.a.toByteArray();
    }

    public vu0 c(u12 u12Var) {
        try {
            this.a.write(u12Var.getEncoded());
            return this;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public vu0 d(byte[] bArr) {
        try {
            this.a.write(bArr);
            return this;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public vu0 e(byte[][] bArr) {
        try {
            for (byte[] bArr2 : bArr) {
                this.a.write(bArr2);
            }
            return this;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public vu0 g(int i, int i2) {
        while (this.a.size() < i2) {
            this.a.write(i);
        }
        return this;
    }

    public vu0 h(int i) {
        int i2 = i & 65535;
        this.a.write((byte) (i2 >>> 8));
        this.a.write((byte) i2);
        return this;
    }

    public vu0 i(int i) {
        this.a.write((byte) (i >>> 24));
        this.a.write((byte) (i >>> 16));
        this.a.write((byte) (i >>> 8));
        this.a.write((byte) i);
        return this;
    }

    public vu0 j(long j) {
        i((int) (j >>> 32));
        i((int) j);
        return this;
    }
}
