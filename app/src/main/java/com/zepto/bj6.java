package com.zepto;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.support.v4.media.session.PlaybackStateCompat;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class bj6 {
    public long a;
    public final ArrayList b;
    public long c;
    public String d;
    public mi5 e;
    public LinkedList f;
    public int g;
    public final Date h;
    public int i;
    public int j;
    public float k;
    public final ArrayList l;
    public final boolean m;
    public Map n;
    public long o;
    public boolean p;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public bj6(int i, MediaFormat format, boolean z) {
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(format, "format");
        this.b = new ArrayList();
        this.h = new Date();
        ArrayList arrayList = new ArrayList();
        this.l = arrayList;
        this.m = z;
        this.n = new HashMap();
        this.p = true;
        this.n = MapsKt__MapsKt.mapOf(TuplesKt.to(96000, 0), TuplesKt.to(88200, 1), TuplesKt.to(64000, 2), TuplesKt.to(48000, 3), TuplesKt.to(44100, 4), TuplesKt.to(32000, 5), TuplesKt.to(24000, 6), TuplesKt.to(22050, 7), TuplesKt.to(16000, 8), TuplesKt.to(12000, 9), TuplesKt.to(11025, 10), TuplesKt.to(8000, 11));
        this.a = i;
        if (z) {
            arrayList.add(Long.valueOf(PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID));
            this.c = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
            this.k = 1.0f;
            this.g = format.getInteger("sample-rate");
            this.d = "soun";
            this.e = new mi5();
            pz pzVarO = o(new pz("mp4a"), format);
            ty1 ty1Var = new ty1();
            sy1 sy1Var = new sy1();
            sy1Var.i(0);
            mg5 mg5Var = new mg5();
            mg5Var.h(2);
            sy1Var.j(mg5Var);
            qe1 qe1VarP = p(new qe1());
            qz qzVar = new qz();
            qzVar.p(2);
            Object obj = this.n.get(Integer.valueOf((int) pzVarO.e0()));
            Intrinsics.checkNotNull(obj);
            qzVar.r(((Number) obj).intValue());
            qzVar.q(pzVarO.d0());
            qe1VarP.h(qzVar);
            sy1Var.h(qe1VarP);
            ByteBuffer byteBufferF = sy1Var.f();
            ty1Var.w(sy1Var);
            ty1Var.u(byteBufferF);
            pzVarO.m(ty1Var);
            this.e.m(pzVarO);
            return;
        }
        arrayList.add(3015L);
        this.c = 3015L;
        this.j = format.getInteger("width");
        this.i = format.getInteger("height");
        this.g = 90000;
        this.f = new LinkedList();
        this.d = "vide";
        this.e = new mi5();
        String string = format.getString("mime");
        if (!Intrinsics.areEqual(string, "video/avc")) {
            if (Intrinsics.areEqual(string, "video/mp4v")) {
                this.e.m(q(new zt7("mp4v"), this.j, this.i));
                return;
            }
            return;
        }
        zt7 zt7VarQ = q(new zt7("avc1"), this.j, this.i);
        c20 c20Var = new c20();
        if (format.getByteBuffer("csd-0") != null) {
            ArrayList arrayList2 = new ArrayList();
            ByteBuffer byteBuffer = format.getByteBuffer("csd-0");
            Intrinsics.checkNotNull(byteBuffer);
            byteBuffer.position(4);
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            arrayList2.add(bArr);
            ArrayList arrayList3 = new ArrayList();
            ByteBuffer byteBuffer2 = format.getByteBuffer("csd-1");
            if (byteBuffer2 != null) {
                byteBuffer2.position(4);
                byte[] bArr2 = new byte[byteBuffer2.remaining()];
                byteBuffer2.get(bArr2);
                arrayList3.add(bArr2);
                c20Var.x(arrayList2);
                c20Var.v(arrayList3);
            }
        }
        if (format.containsKey("level")) {
            int integer = format.getInteger("level");
            if (integer != 1) {
                if (integer != 2) {
                    switch (integer) {
                        case 4:
                            i2 = 3;
                            c20Var.o(11);
                            break;
                        case 8:
                            i2 = 3;
                            c20Var.o(12);
                            break;
                        case 16:
                            i2 = 3;
                            c20Var.o(13);
                            break;
                        case 32:
                            i2 = 3;
                            c20Var.o(2);
                            break;
                        case 64:
                            i2 = 3;
                            c20Var.o(21);
                            break;
                        case 128:
                            i2 = 3;
                            c20Var.o(22);
                            break;
                        case 256:
                            i2 = 3;
                            c20Var.o(3);
                            break;
                        case ConstantsKt.MINIMUM_BLOCK_SIZE /* 512 */:
                            c20Var.o(31);
                            i2 = 3;
                            break;
                        case 1024:
                            c20Var.o(32);
                            i2 = 3;
                            break;
                        case 2048:
                            c20Var.o(4);
                            i2 = 3;
                            break;
                        case ConstantsKt.DEFAULT_BLOCK_SIZE /* 4096 */:
                            c20Var.o(41);
                            i2 = 3;
                            break;
                        case ConstantsKt.DEFAULT_BUFFER_SIZE /* 8192 */:
                            c20Var.o(42);
                            i2 = 3;
                            break;
                        case 16384:
                            c20Var.o(5);
                            i2 = 3;
                            break;
                        case 32768:
                            c20Var.o(51);
                            i2 = 3;
                            break;
                        case 65536:
                            c20Var.o(52);
                            i2 = 3;
                            break;
                        default:
                            c20Var.o(13);
                            i2 = 3;
                            break;
                    }
                } else {
                    i2 = 3;
                    c20Var.o(27);
                }
                i3 = 1;
            } else {
                i3 = 1;
                i2 = 3;
                c20Var.o(1);
            }
        } else {
            i2 = 3;
            i3 = 1;
            c20Var.o(13);
        }
        c20Var.p(100);
        c20Var.r(-1);
        c20Var.q(-1);
        c20Var.s(-1);
        c20Var.t(i3);
        c20Var.u(i2);
        c20Var.w(0);
        zt7VarQ.m(c20Var);
        this.e.m(zt7VarQ);
    }

    public final void a(long j, MediaCodec.BufferInfo bufferInfo) {
        Intrinsics.checkNotNullParameter(bufferInfo, "bufferInfo");
        boolean z = (this.m || (bufferInfo.flags & 1) == 0) ? false : true;
        this.b.add(new li5(j, bufferInfo.size));
        LinkedList linkedList = this.f;
        if (linkedList != null && z && linkedList != null) {
            linkedList.add(Integer.valueOf(this.b.size()));
        }
        long j2 = bufferInfo.presentationTimeUs;
        long j3 = j2 - this.o;
        this.o = j2;
        long j4 = ((j3 * ((long) this.g)) + 500000) / 1000000;
        if (!this.p) {
            ArrayList arrayList = this.l;
            arrayList.add(arrayList.size() - 1, Long.valueOf(j4));
            this.c += j4;
        }
        this.p = false;
    }

    public final Date b() {
        return this.h;
    }

    public final long c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final int e() {
        return this.i;
    }

    public final mi5 f() {
        return this.e;
    }

    public final ArrayList g() {
        return this.l;
    }

    public final ArrayList h() {
        return this.b;
    }

    public final long[] i() {
        LinkedList linkedList = this.f;
        if (linkedList == null) {
            return null;
        }
        Intrinsics.checkNotNull(linkedList);
        if (linkedList.isEmpty()) {
            return null;
        }
        LinkedList linkedList2 = this.f;
        Intrinsics.checkNotNull(linkedList2);
        long[] jArr = new long[linkedList2.size()];
        LinkedList linkedList3 = this.f;
        Intrinsics.checkNotNull(linkedList3);
        int size = linkedList3.size();
        for (int i = 0; i < size; i++) {
            Intrinsics.checkNotNull(this.f);
            jArr[i] = ((Number) r3.get(i)).intValue();
        }
        return jArr;
    }

    public final int j() {
        return this.g;
    }

    public final long k() {
        return this.a;
    }

    public final float l() {
        return this.k;
    }

    public final int m() {
        return this.j;
    }

    public final boolean n() {
        return this.m;
    }

    public final pz o(pz pzVar, MediaFormat mediaFormat) {
        pzVar.k0(mediaFormat.getInteger("channel-count") == 1 ? 2 : mediaFormat.getInteger("channel-count"));
        pzVar.m0(mediaFormat.getInteger("sample-rate"));
        pzVar.U(1);
        pzVar.p0(16);
        return pzVar;
    }

    public final qe1 p(qe1 qe1Var) {
        qe1Var.l(64);
        qe1Var.m(5);
        qe1Var.j(1536);
        qe1Var.k(96000L);
        qe1Var.i(96000L);
        return qe1Var;
    }

    public final zt7 q(zt7 zt7Var, int i, int i2) {
        zt7Var.U(1);
        zt7Var.A0(24);
        zt7Var.B0(1);
        zt7Var.D0(72.0d);
        zt7Var.E0(72.0d);
        zt7Var.F0(i);
        zt7Var.C0(i2);
        zt7Var.z0("AVC Coding");
        return zt7Var;
    }
}
