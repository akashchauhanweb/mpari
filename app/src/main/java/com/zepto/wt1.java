package com.zepto;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class wt1 implements tt1 {
    public i65 a;
    public bu1 b;
    public sj4 c;
    public boolean d = false;
    public boolean e = false;
    public boolean f = true;

    public wt1(bu1 bu1Var, OutputStream outputStream) {
        this.b = bu1Var;
        this.c = new sj4(new BufferedOutputStream(outputStream));
    }

    public static final byte[] f(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }

    @Override // com.zepto.tt1
    public void a() {
        this.d = true;
    }

    @Override // com.zepto.tt1
    public boolean b() {
        return this.d;
    }

    @Override // com.zepto.tt1
    public boolean c(float f, float f2, float f3, float f4) {
        return false;
    }

    @Override // com.zepto.tt1
    public void close() {
        this.d = false;
        try {
            this.c.flush();
            if (this.f) {
                this.c.close();
            }
        } catch (IOException e) {
            throw new p52(e);
        }
    }

    @Override // com.zepto.r02
    public boolean d(f02 f02Var) {
        return false;
    }

    @Override // com.zepto.tt1
    public boolean e(i65 i65Var) {
        this.a = i65Var;
        return true;
    }

    public boolean g() {
        return this.e;
    }
}
