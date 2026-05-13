package com.zepto;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.UShort;

/* JADX INFO: loaded from: classes.dex */
public abstract class qt3 {

    public static class a implements c {
        public final ByteBuffer a;

        public a(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.zepto.qt3.c
        public void a(int i) {
            ByteBuffer byteBuffer = this.a;
            byteBuffer.position(byteBuffer.position() + i);
        }

        @Override // com.zepto.qt3.c
        public long b() {
            return qt3.c(this.a.getInt());
        }

        @Override // com.zepto.qt3.c
        public int c() {
            return this.a.getInt();
        }

        @Override // com.zepto.qt3.c
        public long getPosition() {
            return this.a.position();
        }

        @Override // com.zepto.qt3.c
        public int readUnsignedShort() {
            return qt3.d(this.a.getShort());
        }
    }

    public static class b {
        public final long a;
        public final long b;

        public b(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public long a() {
            return this.a;
        }
    }

    public interface c {
        void a(int i);

        long b();

        int c();

        long getPosition();

        int readUnsignedShort();
    }

    public static b a(c cVar) throws IOException {
        long jB;
        cVar.a(4);
        int unsignedShort = cVar.readUnsignedShort();
        if (unsignedShort > 100) {
            throw new IOException("Cannot read metadata.");
        }
        cVar.a(6);
        int i = 0;
        while (true) {
            if (i >= unsignedShort) {
                jB = -1;
                break;
            }
            int iC = cVar.c();
            cVar.a(4);
            jB = cVar.b();
            cVar.a(4);
            if (1835365473 == iC) {
                break;
            }
            i++;
        }
        if (jB != -1) {
            cVar.a((int) (jB - cVar.getPosition()));
            cVar.a(12);
            long jB2 = cVar.b();
            for (int i2 = 0; i2 < jB2; i2++) {
                int iC2 = cVar.c();
                long jB3 = cVar.b();
                long jB4 = cVar.b();
                if (1164798569 == iC2 || 1701669481 == iC2) {
                    return new b(jB3 + jB, jB4);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static pt3 b(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position((int) a(new a(byteBufferDuplicate)).a());
        return pt3.h(byteBufferDuplicate);
    }

    public static long c(int i) {
        return ((long) i) & 4294967295L;
    }

    public static int d(short s) {
        return s & UShort.MAX_VALUE;
    }
}
