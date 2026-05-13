package com.zepto;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ov0 {
    public static final ov0 a = new ov0();
    public static boolean b = true;

    public static final class a extends SuspendLambda implements Function2 {
        public int c;
        public /* synthetic */ Object e;
        public final /* synthetic */ Context f;
        public final /* synthetic */ Uri g;
        public final /* synthetic */ int h;
        public final /* synthetic */ xv0 i;
        public final /* synthetic */ String j;
        public final /* synthetic */ String k;
        public final /* synthetic */ kv0 l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, Uri uri, int i, xv0 xv0Var, String str, String str2, kv0 kv0Var, Continuation continuation) {
            super(2, continuation);
            this.f = context;
            this.g = uri;
            this.h = i;
            this.i = xv0Var;
            this.j = str;
            this.k = str2;
            this.l = kv0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((a) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(this.f, this.g, this.h, this.i, this.j, this.k, this.l, continuation);
            aVar.e = obj;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:54:0x012a  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r30) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 405
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zepto.ov0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final Object b(int i, Context context, Uri uri, String str, String str2, xv0 xv0Var, kv0 kv0Var, Continuation continuation) {
        return e80.e(qk1.a(), new a(context, uri, i, xv0Var, str, str2, kv0Var, null), continuation);
    }

    public final void c(int i, MediaCodec mediaCodec, MediaCodec mediaCodec2, hz2 hz2Var, uj4 uj4Var, MediaExtractor mediaExtractor) {
        mediaExtractor.unselectTrack(i);
        mediaCodec.stop();
        mediaCodec.release();
        mediaCodec2.stop();
        mediaCodec2.release();
        hz2Var.d();
        uj4Var.d();
    }

    public final MediaCodec d(MediaFormat mediaFormat, uj4 uj4Var) throws IOException {
        String string = mediaFormat.getString("mime");
        Intrinsics.checkNotNull(string);
        MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(string);
        Intrinsics.checkNotNullExpressionValue(mediaCodecCreateDecoderByType, "createDecoderByType(inpu…(MediaFormat.KEY_MIME)!!)");
        mediaCodecCreateDecoderByType.configure(mediaFormat, uj4Var.c(), (MediaCrypto) null, 0);
        return mediaCodecCreateDecoderByType;
    }

    public final MediaCodec e(MediaFormat mediaFormat, boolean z) {
        MediaCodec mediaCodecCreateByCodecName = z ? MediaCodec.createByCodecName("c2.android.avc.encoder") : MediaCodec.createEncoderByType("video/avc");
        Intrinsics.checkNotNullExpressionValue(mediaCodecCreateByCodecName, "if (hasQTI) {\n          …Type(MIME_TYPE)\n        }");
        mediaCodecCreateByCodecName.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
        return mediaCodecCreateByCodecName;
    }

    public final void f(so3 so3Var, MediaCodec.BufferInfo bufferInfo, boolean z, MediaExtractor mediaExtractor) throws IOException {
        int iA = pv0.a.a(mediaExtractor, false);
        if (iA < 0 || z) {
            return;
        }
        mediaExtractor.selectTrack(iA);
        MediaFormat trackFormat = mediaExtractor.getTrackFormat(iA);
        Intrinsics.checkNotNullExpressionValue(trackFormat, "extractor.getTrackFormat(audioIndex)");
        int iA2 = so3Var.a(trackFormat, true);
        int integer = trackFormat.getInteger("max-input-size");
        if (integer <= 0) {
            integer = 65536;
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(integer);
        Intrinsics.checkNotNullExpressionValue(byteBufferAllocateDirect, "allocateDirect(maxBufferSize)");
        if (Build.VERSION.SDK_INT >= 28) {
            long sampleSize = mediaExtractor.getSampleSize();
            if (sampleSize > integer) {
                byteBufferAllocateDirect = ByteBuffer.allocateDirect((int) (sampleSize + ((long) 1024)));
                Intrinsics.checkNotNullExpressionValue(byteBufferAllocateDirect, "allocateDirect(maxBufferSize)");
            }
        }
        mediaExtractor.seekTo(0L, 0);
        boolean z2 = false;
        while (!z2) {
            int sampleTrackIndex = mediaExtractor.getSampleTrackIndex();
            if (sampleTrackIndex == iA) {
                int sampleData = mediaExtractor.readSampleData(byteBufferAllocateDirect, 0);
                bufferInfo.size = sampleData;
                if (sampleData >= 0) {
                    bufferInfo.presentationTimeUs = mediaExtractor.getSampleTime();
                    bufferInfo.offset = 0;
                    bufferInfo.flags = 1;
                    so3Var.q(iA2, byteBufferAllocateDirect, bufferInfo, true);
                    mediaExtractor.advance();
                } else {
                    bufferInfo.size = 0;
                    z2 = true;
                }
            } else if (sampleTrackIndex == -1) {
                z2 = true;
            }
        }
        mediaExtractor.unselectTrack(iA);
    }

    public final void g(boolean z) {
        b = z;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:5|(5:157|6|160|7|8)|(4:10|(6:155|12|(2:14|(2:16|(2:18|19)(1:23)))(2:24|(2:28|19))|(3:172|139|(3:176|141|(1:143)))(1:150)|151|152)|30|(1:(3:164|35|(8:181|37|167|38|39|178|40|41)(8:46|171|47|(1:49)(4:(2:51|(2:53|54))(4:58|(1:(2:61|(6:63|(1:67)|68|(1:70)(1:72)|71|73)(3:183|75|76))(3:182|77|78))|74|54)|57|74|54)|(5:80|(1:82)(2:85|(1:109)(1:(6:90|(1:92)(1:93)|94|(3:174|96|97)(1:103)|104|(1:106))(3:184|107|108)))|83|186|84)(1:110)|111|187|84))))|180|114|162|115|116|117|169|118|119|(0)(0)|151|152) */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02a6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02a8, code lost:
    
        com.zepto.pv0.a.l(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02af, code lost:
    
        r5 = r13;
        r3 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02b2, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ec, code lost:
    
        r24 = r7;
        r10 = r10;
        r13 = r13;
        r15 = r15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.zepto.u76] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [com.zepto.kv0] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r5v9 */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.zepto.vd5 h(int r27, int r28, int r29, java.lang.String r30, int r31, java.lang.String r32, boolean r33, android.media.MediaExtractor r34, com.zepto.kv0 r35, long r36, int r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 840
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.ov0.h(int, int, int, java.lang.String, int, java.lang.String, boolean, android.media.MediaExtractor, com.zepto.kv0, long, int):com.zepto.vd5");
    }
}
