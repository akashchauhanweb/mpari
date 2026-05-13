package com.zepto;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public class qe1 extends q40 {
    public static Logger m = Logger.getLogger(qe1.class.getName());
    public int d;
    public int e;
    public int f;
    public int g;
    public long h;
    public long i;
    public qz j;
    public List k = new ArrayList();
    public byte[] l;

    @Override // com.zepto.q40
    public void e(ByteBuffer byteBuffer) {
        int iA;
        this.d = m13.l(byteBuffer);
        int iL = m13.l(byteBuffer);
        this.e = iL >>> 2;
        this.f = (iL >> 1) & 1;
        this.g = m13.i(byteBuffer);
        this.h = m13.j(byteBuffer);
        this.i = m13.j(byteBuffer);
        if (byteBuffer.remaining() > 2) {
            int iPosition = byteBuffer.position();
            q40 q40VarA = ve4.a(this.d, byteBuffer);
            int iPosition2 = byteBuffer.position() - iPosition;
            Logger logger = m;
            StringBuilder sb = new StringBuilder();
            sb.append(q40VarA);
            sb.append(" - DecoderConfigDescr1 read: ");
            sb.append(iPosition2);
            sb.append(", size: ");
            sb.append(q40VarA != null ? Integer.valueOf(q40VarA.a()) : null);
            logger.finer(sb.toString());
            if (q40VarA != null && iPosition2 < (iA = q40VarA.a())) {
                byte[] bArr = new byte[iA - iPosition2];
                this.l = bArr;
                byteBuffer.get(bArr);
            }
            if (q40VarA instanceof qz) {
                this.j = (qz) q40VarA;
            }
        }
        while (byteBuffer.remaining() > 2) {
            long jPosition = byteBuffer.position();
            q40 q40VarA2 = ve4.a(this.d, byteBuffer);
            long jPosition2 = ((long) byteBuffer.position()) - jPosition;
            Logger logger2 = m;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(q40VarA2);
            sb2.append(" - DecoderConfigDescr2 read: ");
            sb2.append(jPosition2);
            sb2.append(", size: ");
            sb2.append(q40VarA2 != null ? Integer.valueOf(q40VarA2.a()) : null);
            logger2.finer(sb2.toString());
        }
    }

    public ByteBuffer f() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(g());
        n13.i(byteBufferAllocate, 4);
        n13.i(byteBufferAllocate, g() - 2);
        n13.i(byteBufferAllocate, this.d);
        n13.i(byteBufferAllocate, (this.e << 2) | (this.f << 1) | 1);
        n13.f(byteBufferAllocate, this.g);
        n13.g(byteBufferAllocate, this.h);
        n13.g(byteBufferAllocate, this.i);
        qz qzVar = this.j;
        if (qzVar != null) {
            byteBufferAllocate.put(qzVar.n().array());
        }
        return byteBufferAllocate;
    }

    public int g() {
        qz qzVar = this.j;
        return (qzVar == null ? 0 : qzVar.o()) + 15;
    }

    public void h(qz qzVar) {
        this.j = qzVar;
    }

    public void i(long j) {
        this.i = j;
    }

    public void j(int i) {
        this.g = i;
    }

    public void k(long j) {
        this.h = j;
    }

    public void l(int i) {
        this.d = i;
    }

    public void m(int i) {
        this.e = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DecoderConfigDescriptor");
        sb.append("{objectTypeIndication=");
        sb.append(this.d);
        sb.append(", streamType=");
        sb.append(this.e);
        sb.append(", upStream=");
        sb.append(this.f);
        sb.append(", bufferSizeDB=");
        sb.append(this.g);
        sb.append(", maxBitRate=");
        sb.append(this.h);
        sb.append(", avgBitRate=");
        sb.append(this.i);
        sb.append(", decoderSpecificInfo=");
        sb.append((Object) null);
        sb.append(", audioSpecificInfo=");
        sb.append(this.j);
        sb.append(", configDescriptorDeadBytes=");
        byte[] bArr = this.l;
        if (bArr == null) {
            bArr = new byte[0];
        }
        sb.append(dm2.a(bArr));
        sb.append(", profileLevelIndicationDescriptors=");
        List list = this.k;
        sb.append(list == null ? "null" : Arrays.asList(list).toString());
        sb.append('}');
        return sb.toString();
    }
}
