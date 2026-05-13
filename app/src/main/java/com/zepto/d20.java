package com.zepto;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class d20 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public List f;
    public List g;
    public boolean h;
    public int i;
    public int j;
    public int k;
    public List l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;

    public d20() {
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = true;
        this.i = 1;
        this.j = 0;
        this.k = 0;
        this.l = new ArrayList();
        this.m = 63;
        this.n = 7;
        this.o = 31;
        this.p = 31;
        this.q = 31;
    }

    public void a(ByteBuffer byteBuffer) {
        n13.i(byteBuffer, this.a);
        n13.i(byteBuffer, this.b);
        n13.i(byteBuffer, this.c);
        n13.i(byteBuffer, this.d);
        o60 o60Var = new o60(byteBuffer);
        o60Var.a(this.m, 6);
        o60Var.a(this.e, 2);
        o60Var.a(this.n, 3);
        o60Var.a(this.g.size(), 5);
        for (byte[] bArr : this.f) {
            n13.e(byteBuffer, bArr.length);
            byteBuffer.put(bArr);
        }
        n13.i(byteBuffer, this.g.size());
        for (byte[] bArr2 : this.g) {
            n13.e(byteBuffer, bArr2.length);
            byteBuffer.put(bArr2);
        }
        if (this.h) {
            int i = this.b;
            if (i == 100 || i == 110 || i == 122 || i == 144) {
                o60 o60Var2 = new o60(byteBuffer);
                o60Var2.a(this.o, 6);
                o60Var2.a(this.i, 2);
                o60Var2.a(this.p, 5);
                o60Var2.a(this.j, 3);
                o60Var2.a(this.q, 5);
                o60Var2.a(this.k, 3);
                for (byte[] bArr3 : this.l) {
                    n13.e(byteBuffer, bArr3.length);
                    byteBuffer.put(bArr3);
                }
            }
        }
    }

    public long b() {
        int i;
        Iterator it = this.f.iterator();
        long length = 6;
        while (it.hasNext()) {
            length = length + 2 + ((long) ((byte[]) it.next()).length);
        }
        long length2 = length + 1;
        Iterator it2 = this.g.iterator();
        while (it2.hasNext()) {
            length2 = length2 + 2 + ((long) ((byte[]) it2.next()).length);
        }
        if (this.h && ((i = this.b) == 100 || i == 110 || i == 122 || i == 144)) {
            length2 += 4;
            Iterator it3 = this.l.iterator();
            while (it3.hasNext()) {
                length2 = length2 + 2 + ((long) ((byte[]) it3.next()).length);
            }
        }
        return length2;
    }

    public String toString() {
        return "AvcDecoderConfigurationRecord{configurationVersion=" + this.a + ", avcProfileIndication=" + this.b + ", profileCompatibility=" + this.c + ", avcLevelIndication=" + this.d + ", lengthSizeMinusOne=" + this.e + ", hasExts=" + this.h + ", chromaFormat=" + this.i + ", bitDepthLumaMinus8=" + this.j + ", bitDepthChromaMinus8=" + this.k + ", lengthSizeMinusOnePaddingBits=" + this.m + ", numberOfSequenceParameterSetsPaddingBits=" + this.n + ", chromaFormatPaddingBits=" + this.o + ", bitDepthLumaMinus8PaddingBits=" + this.p + ", bitDepthChromaMinus8PaddingBits=" + this.q + '}';
    }

    public d20(ByteBuffer byteBuffer) {
        int i;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = true;
        this.i = 1;
        this.j = 0;
        this.k = 0;
        this.l = new ArrayList();
        this.m = 63;
        this.n = 7;
        this.o = 31;
        this.p = 31;
        this.q = 31;
        this.a = m13.l(byteBuffer);
        this.b = m13.l(byteBuffer);
        this.c = m13.l(byteBuffer);
        this.d = m13.l(byteBuffer);
        m60 m60Var = new m60(byteBuffer);
        this.m = m60Var.a(6);
        this.e = m60Var.a(2);
        this.n = m60Var.a(3);
        int iA = m60Var.a(5);
        for (int i2 = 0; i2 < iA; i2++) {
            byte[] bArr = new byte[m13.h(byteBuffer)];
            byteBuffer.get(bArr);
            this.f.add(bArr);
        }
        long jL = m13.l(byteBuffer);
        for (int i3 = 0; i3 < jL; i3++) {
            byte[] bArr2 = new byte[m13.h(byteBuffer)];
            byteBuffer.get(bArr2);
            this.g.add(bArr2);
        }
        if (byteBuffer.remaining() < 4) {
            this.h = false;
        }
        if (!this.h || ((i = this.b) != 100 && i != 110 && i != 122 && i != 144)) {
            this.i = -1;
            this.j = -1;
            this.k = -1;
            return;
        }
        m60 m60Var2 = new m60(byteBuffer);
        this.o = m60Var2.a(6);
        this.i = m60Var2.a(2);
        this.p = m60Var2.a(5);
        this.j = m60Var2.a(3);
        this.q = m60Var2.a(5);
        this.k = m60Var2.a(3);
        long jL2 = m13.l(byteBuffer);
        for (int i4 = 0; i4 < jL2; i4++) {
            byte[] bArr3 = new byte[m13.h(byteBuffer)];
            byteBuffer.get(bArr3);
            this.l.add(bArr3);
        }
    }
}
