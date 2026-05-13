package com.zepto;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.support.v4.media.session.PlaybackStateCompat;
import com.zepto.zf6;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class so3 {
    public xr3 a;
    public jx3 b;
    public FileOutputStream c;
    public FileChannel d;
    public long e;
    public long f;
    public boolean g = true;
    public final HashMap h = new HashMap();
    public ByteBuffer i;

    public final int a(MediaFormat mediaFormat, boolean z) {
        Intrinsics.checkNotNullParameter(mediaFormat, "mediaFormat");
        jx3 jx3Var = this.b;
        if (jx3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentMp4Movie");
            jx3Var = null;
        }
        return jx3Var.b(mediaFormat, z);
    }

    public final vb2 b() {
        return new vb2("isom", 0L, CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"isom", "iso2", "mp41"}));
    }

    public final so3 c(jx3 mp4Movie) throws IOException {
        Intrinsics.checkNotNullParameter(mp4Movie, "mp4Movie");
        this.b = mp4Movie;
        FileOutputStream fileOutputStream = new FileOutputStream(mp4Movie.c());
        this.c = fileOutputStream;
        FileChannel channel = fileOutputStream.getChannel();
        Intrinsics.checkNotNullExpressionValue(channel, "fos.channel");
        this.d = channel;
        vb2 vb2VarB = b();
        FileChannel fileChannel = this.d;
        if (fileChannel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fc");
            fileChannel = null;
        }
        vb2VarB.e(fileChannel);
        long j = this.e + vb2VarB.j();
        this.e = j;
        this.f = j;
        this.a = new xr3();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(4);
        Intrinsics.checkNotNullExpressionValue(byteBufferAllocateDirect, "allocateDirect(4)");
        this.i = byteBufferAllocateDirect;
        return this;
    }

    public final hx3 d(jx3 jx3Var) {
        hx3 hx3Var = new hx3();
        ix3 ix3Var = new ix3();
        ix3Var.B(new Date());
        ix3Var.E(new Date());
        ix3Var.D(gr3.j);
        long jP = p(jx3Var);
        long j = 0;
        for (bj6 bj6Var : jx3Var.e()) {
            long jC = (bj6Var.c() * jP) / ((long) bj6Var.j());
            if (jC > j) {
                j = jC;
            }
        }
        ix3Var.C(j);
        ix3Var.G(jP);
        ix3Var.F(jx3Var.e().size() + 1);
        hx3Var.m(ix3Var);
        for (bj6 track : jx3Var.e()) {
            Intrinsics.checkNotNullExpressionValue(track, "track");
            hx3Var.m(l(track, jx3Var));
        }
        return hx3Var;
    }

    public final p70 e(bj6 bj6Var) {
        oi5 oi5Var = new oi5();
        h(bj6Var, oi5Var);
        k(bj6Var, oi5Var);
        i(bj6Var, oi5Var);
        g(bj6Var, oi5Var);
        j(bj6Var, oi5Var);
        f(bj6Var, oi5Var);
        return oi5Var;
    }

    public final void f(bj6 bj6Var, oi5 oi5Var) {
        ArrayList arrayList = new ArrayList();
        long jB = -1;
        for (li5 li5Var : bj6Var.h()) {
            long jA = li5Var.a();
            if (jB != -1 && jB != jA) {
                jB = -1;
            }
            if (jB == -1) {
                arrayList.add(Long.valueOf(jA));
            }
            jB = li5Var.b() + jA;
        }
        long[] jArr = new long[arrayList.size()];
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            Intrinsics.checkNotNullExpressionValue(obj, "chunksOffsets[a]");
            jArr[i] = ((Number) obj).longValue();
        }
        c76 c76Var = new c76();
        c76Var.v(jArr);
        oi5Var.m(c76Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(com.zepto.bj6 r17, com.zepto.oi5 r18) {
        /*
            r16 = this;
            com.zepto.pi5 r0 = new com.zepto.pi5
            r0.<init>()
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r0.v(r1)
            java.util.ArrayList r1 = r17.h()
            int r1 = r1.size()
            r2 = 1
            r3 = 0
            r4 = -1
            r7 = r2
            r5 = r3
            r6 = r5
        L1b:
            if (r5 >= r1) goto L6d
            java.util.ArrayList r8 = r17.h()
            java.lang.Object r8 = r8.get(r5)
            java.lang.String r9 = "track.getSamples()[a]"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r9)
            com.zepto.li5 r8 = (com.zepto.li5) r8
            long r9 = r8.a()
            long r11 = r8.b()
            long r9 = r9 + r11
            int r6 = r6 + r2
            int r8 = r1 + (-1)
            if (r5 == r8) goto L53
            java.util.ArrayList r8 = r17.h()
            int r11 = r5 + 1
            java.lang.Object r8 = r8.get(r11)
            java.lang.String r11 = "track.getSamples()[a + 1]"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r11)
            com.zepto.li5 r8 = (com.zepto.li5) r8
            long r11 = r8.a()
            int r8 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r8 == 0) goto L6a
        L53:
            if (r4 == r6) goto L67
            java.util.List r4 = r0.u()
            com.zepto.pi5$a r15 = new com.zepto.pi5$a
            long r9 = (long) r7
            long r11 = (long) r6
            r13 = 1
            r8 = r15
            r8.<init>(r9, r11, r13)
            r4.add(r15)
            r4 = r6
        L67:
            int r7 = r7 + 1
            r6 = r3
        L6a:
            int r5 = r5 + 1
            goto L1b
        L6d:
            r4 = r18
            r4.m(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.so3.g(com.zepto.bj6, com.zepto.oi5):void");
    }

    public final void h(bj6 bj6Var, oi5 oi5Var) {
        oi5Var.m(bj6Var.f());
    }

    public final void i(bj6 bj6Var, oi5 oi5Var) {
        long[] jArrI = bj6Var.i();
        if (jArrI != null) {
            if (!(jArrI.length == 0)) {
                t96 t96Var = new t96();
                t96Var.u(jArrI);
                oi5Var.m(t96Var);
            }
        }
    }

    public final void j(bj6 bj6Var, oi5 oi5Var) {
        ni5 ni5Var = new ni5();
        ni5Var.w((long[]) this.h.get(bj6Var));
        oi5Var.m(ni5Var);
    }

    public final void k(bj6 bj6Var, oi5 oi5Var) {
        ArrayList arrayList = new ArrayList();
        zf6.a aVar = null;
        for (Long delta : bj6Var.g()) {
            if (aVar != null) {
                long jB = aVar.b();
                if (delta != null && jB == delta.longValue()) {
                    aVar.c(aVar.a() + 1);
                }
            }
            Intrinsics.checkNotNullExpressionValue(delta, "delta");
            aVar = new zf6.a(1L, delta.longValue());
            arrayList.add(aVar);
        }
        zf6 zf6Var = new zf6();
        zf6Var.u(arrayList);
        oi5Var.m(zf6Var);
    }

    public final cj6 l(bj6 bj6Var, jx3 jx3Var) {
        cj6 cj6Var = new cj6();
        dj6 dj6Var = new dj6();
        dj6Var.G(true);
        dj6Var.J(true);
        dj6Var.I(true);
        dj6Var.L(bj6Var.n() ? gr3.j : jx3Var.d());
        dj6Var.D(0);
        dj6Var.E(bj6Var.b());
        dj6Var.F((bj6Var.c() * p(jx3Var)) / ((long) bj6Var.j()));
        dj6Var.H(bj6Var.e());
        dj6Var.P(bj6Var.m());
        dj6Var.K(0);
        dj6Var.M(new Date());
        dj6Var.N(bj6Var.k() + 1);
        dj6Var.O(bj6Var.l());
        cj6Var.m(dj6Var);
        yr3 yr3Var = new yr3();
        cj6Var.m(yr3Var);
        bs3 bs3Var = new bs3();
        bs3Var.z(bj6Var.b());
        bs3Var.A(bj6Var.c());
        bs3Var.C(bj6Var.j());
        bs3Var.B("eng");
        yr3Var.m(bs3Var);
        al2 al2Var = new al2();
        al2Var.x(bj6Var.n() ? "SoundHandle" : "VideoHandle");
        al2Var.w(bj6Var.d());
        yr3Var.m(al2Var);
        cs3 cs3Var = new cs3();
        if (Intrinsics.areEqual(bj6Var.d(), "vide")) {
            cs3Var.m(new up7());
        } else if (Intrinsics.areEqual(bj6Var.d(), "soun")) {
            cs3Var.m(new w46());
        } else if (Intrinsics.areEqual(bj6Var.d(), "text")) {
            cs3Var.m(new ge4());
        } else if (Intrinsics.areEqual(bj6Var.d(), "subt")) {
            cs3Var.m(new v86());
        } else if (Intrinsics.areEqual(bj6Var.d(), "hint")) {
            cs3Var.m(new zm2());
        } else if (Intrinsics.areEqual(bj6Var.d(), "sbtl")) {
            cs3Var.m(new ge4());
        }
        qd1 qd1Var = new qd1();
        td1 td1Var = new td1();
        qd1Var.m(td1Var);
        od1 od1Var = new od1();
        od1Var.r(1);
        td1Var.m(od1Var);
        cs3Var.m(qd1Var);
        cs3Var.m(e(bj6Var));
        yr3Var.m(cs3Var);
        return cj6Var;
    }

    public final void m() throws IOException {
        xr3 xr3Var = this.a;
        FileOutputStream fileOutputStream = null;
        if (xr3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mdat");
            xr3Var = null;
        }
        if (xr3Var.a() != 0) {
            n();
        }
        jx3 jx3Var = this.b;
        if (jx3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentMp4Movie");
            jx3Var = null;
        }
        for (bj6 track : jx3Var.e()) {
            ArrayList arrayListH = track.h();
            int size = arrayListH.size();
            long[] jArr = new long[size];
            for (int i = 0; i < size; i++) {
                jArr[i] = ((li5) arrayListH.get(i)).b();
            }
            HashMap map = this.h;
            Intrinsics.checkNotNullExpressionValue(track, "track");
            map.put(track, jArr);
        }
        jx3 jx3Var2 = this.b;
        if (jx3Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentMp4Movie");
            jx3Var2 = null;
        }
        hx3 hx3VarD = d(jx3Var2);
        FileChannel fileChannel = this.d;
        if (fileChannel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fc");
            fileChannel = null;
        }
        hx3VarD.e(fileChannel);
        FileOutputStream fileOutputStream2 = this.c;
        if (fileOutputStream2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fos");
            fileOutputStream2 = null;
        }
        fileOutputStream2.flush();
        FileChannel fileChannel2 = this.d;
        if (fileChannel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fc");
            fileChannel2 = null;
        }
        fileChannel2.close();
        FileOutputStream fileOutputStream3 = this.c;
        if (fileOutputStream3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fos");
        } else {
            fileOutputStream = fileOutputStream3;
        }
        fileOutputStream.close();
    }

    public final void n() throws IOException {
        FileChannel fileChannel = this.d;
        FileOutputStream fileOutputStream = null;
        if (fileChannel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fc");
            fileChannel = null;
        }
        long jPosition = fileChannel.position();
        FileChannel fileChannel2 = this.d;
        if (fileChannel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fc");
            fileChannel2 = null;
        }
        xr3 xr3Var = this.a;
        if (xr3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mdat");
            xr3Var = null;
        }
        fileChannel2.position(xr3Var.b());
        xr3 xr3Var2 = this.a;
        if (xr3Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mdat");
            xr3Var2 = null;
        }
        FileChannel fileChannel3 = this.d;
        if (fileChannel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fc");
            fileChannel3 = null;
        }
        xr3Var2.e(fileChannel3);
        FileChannel fileChannel4 = this.d;
        if (fileChannel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fc");
            fileChannel4 = null;
        }
        fileChannel4.position(jPosition);
        xr3 xr3Var3 = this.a;
        if (xr3Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mdat");
            xr3Var3 = null;
        }
        xr3Var3.g(0L);
        xr3 xr3Var4 = this.a;
        if (xr3Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mdat");
            xr3Var4 = null;
        }
        xr3Var4.f(0L);
        FileOutputStream fileOutputStream2 = this.c;
        if (fileOutputStream2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fos");
        } else {
            fileOutputStream = fileOutputStream2;
        }
        fileOutputStream.flush();
    }

    public final long o(long j, long j2) {
        return j2 == 0 ? j : o(j2, j % j2);
    }

    public final long p(jx3 jx3Var) {
        long j = jx3Var.e().isEmpty() ^ true ? ((bj6) jx3Var.e().iterator().next()).j() : 0L;
        Iterator it = jx3Var.e().iterator();
        while (it.hasNext()) {
            j = o(((bj6) it.next()).j(), j);
        }
        return j;
    }

    public final void q(int i, ByteBuffer byteBuf, MediaCodec.BufferInfo bufferInfo, boolean z) throws IOException {
        boolean z2;
        Intrinsics.checkNotNullParameter(byteBuf, "byteBuf");
        Intrinsics.checkNotNullParameter(bufferInfo, "bufferInfo");
        FileOutputStream fileOutputStream = null;
        if (this.g) {
            xr3 xr3Var = this.a;
            if (xr3Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mdat");
                xr3Var = null;
            }
            xr3Var.f(0L);
            FileChannel fileChannel = this.d;
            if (fileChannel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fc");
                fileChannel = null;
            }
            xr3Var.e(fileChannel);
            xr3Var.g(this.e);
            long j = 16;
            this.e += j;
            this.f += j;
            this.g = false;
        }
        xr3 xr3Var2 = this.a;
        if (xr3Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mdat");
            xr3Var2 = null;
        }
        xr3 xr3Var3 = this.a;
        if (xr3Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mdat");
            xr3Var3 = null;
        }
        xr3Var2.f(xr3Var3.a() + ((long) bufferInfo.size));
        long j2 = this.f + ((long) bufferInfo.size);
        this.f = j2;
        if (j2 >= PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID) {
            n();
            z2 = true;
            this.g = true;
            this.f = 0L;
        } else {
            z2 = false;
        }
        jx3 jx3Var = this.b;
        if (jx3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentMp4Movie");
            jx3Var = null;
        }
        jx3Var.a(i, this.e, bufferInfo);
        if (z) {
            byteBuf.position(bufferInfo.offset);
            byteBuf.limit(bufferInfo.offset + bufferInfo.size);
        } else {
            byteBuf.position(bufferInfo.offset + 4);
            byteBuf.limit(bufferInfo.offset + bufferInfo.size);
            ByteBuffer byteBuffer = this.i;
            if (byteBuffer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sizeBuffer");
                byteBuffer = null;
            }
            byteBuffer.position(0);
            ByteBuffer byteBuffer2 = this.i;
            if (byteBuffer2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sizeBuffer");
                byteBuffer2 = null;
            }
            byteBuffer2.putInt(bufferInfo.size - 4);
            ByteBuffer byteBuffer3 = this.i;
            if (byteBuffer3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sizeBuffer");
                byteBuffer3 = null;
            }
            byteBuffer3.position(0);
            FileChannel fileChannel2 = this.d;
            if (fileChannel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fc");
                fileChannel2 = null;
            }
            ByteBuffer byteBuffer4 = this.i;
            if (byteBuffer4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sizeBuffer");
                byteBuffer4 = null;
            }
            fileChannel2.write(byteBuffer4);
        }
        FileChannel fileChannel3 = this.d;
        if (fileChannel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fc");
            fileChannel3 = null;
        }
        fileChannel3.write(byteBuf);
        this.e += (long) bufferInfo.size;
        if (z2) {
            FileOutputStream fileOutputStream2 = this.c;
            if (fileOutputStream2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fos");
            } else {
                fileOutputStream = fileOutputStream2;
            }
            fileOutputStream.flush();
        }
    }
}
