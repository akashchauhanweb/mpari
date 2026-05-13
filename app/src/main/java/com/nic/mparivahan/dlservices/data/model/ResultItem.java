package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\by\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u00101J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010d\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u00108J\u000b\u0010e\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010r\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u00108J\u0010\u0010s\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u00108J\u000b\u0010t\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u0010\u0010u\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u00108J\u000b\u0010v\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u008d\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u00108J\u0094\u0004\u0010\u008e\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0003\u0010\u008f\u0001J\u0016\u0010\u0090\u0001\u001a\u00030\u0091\u00012\t\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u0093\u0001\u001a\u00020\fHÖ\u0001J\n\u0010\u0094\u0001\u001a\u00020\u0003HÖ\u0001R\u0018\u0010(\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0018\u0010%\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00103R\u0018\u0010$\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00103R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00103R\u001a\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00109\u001a\u0004\b7\u00108R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u00103R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u00103R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u00103R\u001a\u0010\u001c\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00109\u001a\u0004\b=\u00108R\u001a\u0010\u001d\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00109\u001a\u0004\b>\u00108R\u0018\u0010,\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u00103R\u0018\u0010-\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010@R\u0018\u0010.\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u00103R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u00103R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010@R\u0018\u0010&\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u00103R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010@R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u00103R\u0018\u0010/\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u00103R\u0018\u0010*\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010@R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u00103R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u00103R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u00103R\u0018\u0010 \u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u00103R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010@R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u00103R\u0018\u0010#\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u00103R\u001a\u0010\u001f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00109\u001a\u0004\bT\u00108R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u00103R\u0018\u00100\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u00103R\u0018\u0010+\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u00103R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u00103R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bY\u00103R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u00103R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b[\u00103R\u0018\u0010!\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u00103R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b]\u0010^R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00109\u001a\u0004\b_\u00108R\u0018\u0010'\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b`\u0010@R\u0018\u0010)\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\ba\u0010@R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bb\u00103¨\u0006\u0095\u0001"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/ResultItem;", "", "relationType", "", "dlSeqno", "dlDispatchStatus", "dlRemarks", "dlRecGenesis", "biPhoto", "dlNtValdfrDt", "applFullName", "hazIssueinsttCode", "", "apdPermPin", "dlEndorsetime", "bloodGroup", "eligibleDLSerList", "Lcom/nic/mparivahan/dlservices/data/model/EligibleDLSerList;", "dlEndorseAuth", "dlStatus", "dlIssueauth", "bioId", "dLCOVList", "Lcom/nic/mparivahan/dlservices/data/model/DLCOVList;", "apdTempAdd2", "apdTempAdd3", "biPhotoBase64", "apdTempAdd1", "apdTempPin", "applEmpCatg", "biSignatureBase64", "dlLatestTrcode", "dlEndorsedt", "dlno", "apdPermAdd3", "dlIssuedt", "apdPermAdd2", "apdPermAdd1", "biSignature", "relFirstName", "apdNaturalName", "relLastName", "bioorgdonor", "dlPrintStatus", "applFirstName", "applLastName", "applQualName", "biocitizen", "dlNtValdtoDt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/String;Lcom/nic/mparivahan/dlservices/data/model/EligibleDLSerList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/dlservices/data/model/DLCOVList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApdNaturalName", "()Ljava/lang/String;", "getApdPermAdd1", "getApdPermAdd2", "getApdPermAdd3", "getApdPermPin", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getApdTempAdd1", "getApdTempAdd2", "getApdTempAdd3", "getApdTempPin", "getApplEmpCatg", "getApplFirstName", "()Ljava/lang/Object;", "getApplFullName", "getApplLastName", "getApplQualName", "getBiPhoto", "getBiPhotoBase64", "getBiSignature", "getBiSignatureBase64", "getBioId", "getBiocitizen", "getBioorgdonor", "getBloodGroup", "getDLCOVList", "()Lcom/nic/mparivahan/dlservices/data/model/DLCOVList;", "getDlDispatchStatus", "getDlEndorseAuth", "getDlEndorsedt", "getDlEndorsetime", "getDlIssueauth", "getDlIssuedt", "getDlLatestTrcode", "getDlNtValdfrDt", "getDlNtValdtoDt", "getDlPrintStatus", "getDlRecGenesis", "getDlRemarks", "getDlSeqno", "getDlStatus", "getDlno", "getEligibleDLSerList", "()Lcom/nic/mparivahan/dlservices/data/model/EligibleDLSerList;", "getHazIssueinsttCode", "getRelFirstName", "getRelLastName", "getRelationType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/String;Lcom/nic/mparivahan/dlservices/data/model/EligibleDLSerList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/dlservices/data/model/DLCOVList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/nic/mparivahan/dlservices/data/model/ResultItem;", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ResultItem {

    @xy5("apdNaturalName")
    private final String apdNaturalName;

    @xy5("apdPermAdd1")
    private final String apdPermAdd1;

    @xy5("apdPermAdd2")
    private final String apdPermAdd2;

    @xy5("apdPermAdd3")
    private final String apdPermAdd3;

    @xy5("apdPermPin")
    private final Integer apdPermPin;

    @xy5("apdTempAdd1")
    private final String apdTempAdd1;

    @xy5("apdTempAdd2")
    private final String apdTempAdd2;

    @xy5("apdTempAdd3")
    private final String apdTempAdd3;

    @xy5("apdTempPin")
    private final Integer apdTempPin;

    @xy5("applEmpCatg")
    private final Integer applEmpCatg;

    @xy5("applFirstName")
    private final Object applFirstName;

    @xy5("applFullName")
    private final String applFullName;

    @xy5("applLastName")
    private final Object applLastName;

    @xy5("applQualName")
    private final String applQualName;

    @xy5("biPhoto")
    private final String biPhoto;

    @xy5("biPhotoBase64")
    private final Object biPhotoBase64;

    @xy5("biSignature")
    private final String biSignature;

    @xy5("biSignatureBase64")
    private final Object biSignatureBase64;

    @xy5("bioId")
    private final String bioId;

    @xy5("biocitizen")
    private final String biocitizen;

    @xy5("bioorgdonor")
    private final Object bioorgdonor;

    @xy5("bloodGroup")
    private final String bloodGroup;

    @xy5("DLCOVList")
    private final DLCOVList dLCOVList;

    @xy5("dlDispatchStatus")
    private final String dlDispatchStatus;

    @xy5("dlEndorseAuth")
    private final String dlEndorseAuth;

    @xy5("dlEndorsedt")
    private final String dlEndorsedt;

    @xy5("dlEndorsetime")
    private final Object dlEndorsetime;

    @xy5("dlIssueauth")
    private final String dlIssueauth;

    @xy5("dlIssuedt")
    private final String dlIssuedt;

    @xy5("dlLatestTrcode")
    private final Integer dlLatestTrcode;

    @xy5("dlNtValdfrDt")
    private final String dlNtValdfrDt;

    @xy5("dlNtValdtoDt")
    private final String dlNtValdtoDt;

    @xy5("dlPrintStatus")
    private final String dlPrintStatus;

    @xy5("dlRecGenesis")
    private final String dlRecGenesis;

    @xy5("dlRemarks")
    private final String dlRemarks;

    @xy5("dlSeqno")
    private final String dlSeqno;

    @xy5("dlStatus")
    private final String dlStatus;

    @xy5("dlno")
    private final String dlno;

    @xy5("eligibleDLSerList")
    private final EligibleDLSerList eligibleDLSerList;

    @xy5("haz_issueinstt_code")
    private final Integer hazIssueinsttCode;

    @xy5("relFirstName")
    private final Object relFirstName;

    @xy5("relLastName")
    private final Object relLastName;

    @xy5("relationType")
    private final String relationType;

    public ResultItem() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 2047, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRelationType() {
        return this.relationType;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getApdPermPin() {
        return this.apdPermPin;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Object getDlEndorsetime() {
        return this.dlEndorsetime;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getBloodGroup() {
        return this.bloodGroup;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final EligibleDLSerList getEligibleDLSerList() {
        return this.eligibleDLSerList;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getDlEndorseAuth() {
        return this.dlEndorseAuth;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getDlStatus() {
        return this.dlStatus;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getDlIssueauth() {
        return this.dlIssueauth;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getBioId() {
        return this.bioId;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final DLCOVList getDLCOVList() {
        return this.dLCOVList;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getApdTempAdd2() {
        return this.apdTempAdd2;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDlSeqno() {
        return this.dlSeqno;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getApdTempAdd3() {
        return this.apdTempAdd3;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Object getBiPhotoBase64() {
        return this.biPhotoBase64;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getApdTempAdd1() {
        return this.apdTempAdd1;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Integer getApdTempPin() {
        return this.apdTempPin;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Integer getApplEmpCatg() {
        return this.applEmpCatg;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Object getBiSignatureBase64() {
        return this.biSignatureBase64;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final Integer getDlLatestTrcode() {
        return this.dlLatestTrcode;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getDlEndorsedt() {
        return this.dlEndorsedt;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getDlno() {
        return this.dlno;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getApdPermAdd3() {
        return this.apdPermAdd3;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDlDispatchStatus() {
        return this.dlDispatchStatus;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getDlIssuedt() {
        return this.dlIssuedt;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getApdPermAdd2() {
        return this.apdPermAdd2;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getApdPermAdd1() {
        return this.apdPermAdd1;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getBiSignature() {
        return this.biSignature;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final Object getRelFirstName() {
        return this.relFirstName;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final String getApdNaturalName() {
        return this.apdNaturalName;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final Object getRelLastName() {
        return this.relLastName;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final Object getBioorgdonor() {
        return this.bioorgdonor;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final String getDlPrintStatus() {
        return this.dlPrintStatus;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final Object getApplFirstName() {
        return this.applFirstName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDlRemarks() {
        return this.dlRemarks;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final Object getApplLastName() {
        return this.applLastName;
    }

    /* JADX INFO: renamed from: component41, reason: from getter */
    public final String getApplQualName() {
        return this.applQualName;
    }

    /* JADX INFO: renamed from: component42, reason: from getter */
    public final String getBiocitizen() {
        return this.biocitizen;
    }

    /* JADX INFO: renamed from: component43, reason: from getter */
    public final String getDlNtValdtoDt() {
        return this.dlNtValdtoDt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDlRecGenesis() {
        return this.dlRecGenesis;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBiPhoto() {
        return this.biPhoto;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDlNtValdfrDt() {
        return this.dlNtValdfrDt;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getApplFullName() {
        return this.applFullName;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getHazIssueinsttCode() {
        return this.hazIssueinsttCode;
    }

    public final ResultItem copy(String relationType, String dlSeqno, String dlDispatchStatus, String dlRemarks, String dlRecGenesis, String biPhoto, String dlNtValdfrDt, String applFullName, Integer hazIssueinsttCode, Integer apdPermPin, Object dlEndorsetime, String bloodGroup, EligibleDLSerList eligibleDLSerList, String dlEndorseAuth, String dlStatus, String dlIssueauth, String bioId, DLCOVList dLCOVList, String apdTempAdd2, String apdTempAdd3, Object biPhotoBase64, String apdTempAdd1, Integer apdTempPin, Integer applEmpCatg, Object biSignatureBase64, Integer dlLatestTrcode, String dlEndorsedt, String dlno, String apdPermAdd3, String dlIssuedt, String apdPermAdd2, String apdPermAdd1, String biSignature, Object relFirstName, String apdNaturalName, Object relLastName, Object bioorgdonor, String dlPrintStatus, Object applFirstName, Object applLastName, String applQualName, String biocitizen, String dlNtValdtoDt) {
        return new ResultItem(relationType, dlSeqno, dlDispatchStatus, dlRemarks, dlRecGenesis, biPhoto, dlNtValdfrDt, applFullName, hazIssueinsttCode, apdPermPin, dlEndorsetime, bloodGroup, eligibleDLSerList, dlEndorseAuth, dlStatus, dlIssueauth, bioId, dLCOVList, apdTempAdd2, apdTempAdd3, biPhotoBase64, apdTempAdd1, apdTempPin, applEmpCatg, biSignatureBase64, dlLatestTrcode, dlEndorsedt, dlno, apdPermAdd3, dlIssuedt, apdPermAdd2, apdPermAdd1, biSignature, relFirstName, apdNaturalName, relLastName, bioorgdonor, dlPrintStatus, applFirstName, applLastName, applQualName, biocitizen, dlNtValdtoDt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResultItem)) {
            return false;
        }
        ResultItem resultItem = (ResultItem) other;
        return Intrinsics.areEqual(this.relationType, resultItem.relationType) && Intrinsics.areEqual(this.dlSeqno, resultItem.dlSeqno) && Intrinsics.areEqual(this.dlDispatchStatus, resultItem.dlDispatchStatus) && Intrinsics.areEqual(this.dlRemarks, resultItem.dlRemarks) && Intrinsics.areEqual(this.dlRecGenesis, resultItem.dlRecGenesis) && Intrinsics.areEqual(this.biPhoto, resultItem.biPhoto) && Intrinsics.areEqual(this.dlNtValdfrDt, resultItem.dlNtValdfrDt) && Intrinsics.areEqual(this.applFullName, resultItem.applFullName) && Intrinsics.areEqual(this.hazIssueinsttCode, resultItem.hazIssueinsttCode) && Intrinsics.areEqual(this.apdPermPin, resultItem.apdPermPin) && Intrinsics.areEqual(this.dlEndorsetime, resultItem.dlEndorsetime) && Intrinsics.areEqual(this.bloodGroup, resultItem.bloodGroup) && Intrinsics.areEqual(this.eligibleDLSerList, resultItem.eligibleDLSerList) && Intrinsics.areEqual(this.dlEndorseAuth, resultItem.dlEndorseAuth) && Intrinsics.areEqual(this.dlStatus, resultItem.dlStatus) && Intrinsics.areEqual(this.dlIssueauth, resultItem.dlIssueauth) && Intrinsics.areEqual(this.bioId, resultItem.bioId) && Intrinsics.areEqual(this.dLCOVList, resultItem.dLCOVList) && Intrinsics.areEqual(this.apdTempAdd2, resultItem.apdTempAdd2) && Intrinsics.areEqual(this.apdTempAdd3, resultItem.apdTempAdd3) && Intrinsics.areEqual(this.biPhotoBase64, resultItem.biPhotoBase64) && Intrinsics.areEqual(this.apdTempAdd1, resultItem.apdTempAdd1) && Intrinsics.areEqual(this.apdTempPin, resultItem.apdTempPin) && Intrinsics.areEqual(this.applEmpCatg, resultItem.applEmpCatg) && Intrinsics.areEqual(this.biSignatureBase64, resultItem.biSignatureBase64) && Intrinsics.areEqual(this.dlLatestTrcode, resultItem.dlLatestTrcode) && Intrinsics.areEqual(this.dlEndorsedt, resultItem.dlEndorsedt) && Intrinsics.areEqual(this.dlno, resultItem.dlno) && Intrinsics.areEqual(this.apdPermAdd3, resultItem.apdPermAdd3) && Intrinsics.areEqual(this.dlIssuedt, resultItem.dlIssuedt) && Intrinsics.areEqual(this.apdPermAdd2, resultItem.apdPermAdd2) && Intrinsics.areEqual(this.apdPermAdd1, resultItem.apdPermAdd1) && Intrinsics.areEqual(this.biSignature, resultItem.biSignature) && Intrinsics.areEqual(this.relFirstName, resultItem.relFirstName) && Intrinsics.areEqual(this.apdNaturalName, resultItem.apdNaturalName) && Intrinsics.areEqual(this.relLastName, resultItem.relLastName) && Intrinsics.areEqual(this.bioorgdonor, resultItem.bioorgdonor) && Intrinsics.areEqual(this.dlPrintStatus, resultItem.dlPrintStatus) && Intrinsics.areEqual(this.applFirstName, resultItem.applFirstName) && Intrinsics.areEqual(this.applLastName, resultItem.applLastName) && Intrinsics.areEqual(this.applQualName, resultItem.applQualName) && Intrinsics.areEqual(this.biocitizen, resultItem.biocitizen) && Intrinsics.areEqual(this.dlNtValdtoDt, resultItem.dlNtValdtoDt);
    }

    public final String getApdNaturalName() {
        return this.apdNaturalName;
    }

    public final String getApdPermAdd1() {
        return this.apdPermAdd1;
    }

    public final String getApdPermAdd2() {
        return this.apdPermAdd2;
    }

    public final String getApdPermAdd3() {
        return this.apdPermAdd3;
    }

    public final Integer getApdPermPin() {
        return this.apdPermPin;
    }

    public final String getApdTempAdd1() {
        return this.apdTempAdd1;
    }

    public final String getApdTempAdd2() {
        return this.apdTempAdd2;
    }

    public final String getApdTempAdd3() {
        return this.apdTempAdd3;
    }

    public final Integer getApdTempPin() {
        return this.apdTempPin;
    }

    public final Integer getApplEmpCatg() {
        return this.applEmpCatg;
    }

    public final Object getApplFirstName() {
        return this.applFirstName;
    }

    public final String getApplFullName() {
        return this.applFullName;
    }

    public final Object getApplLastName() {
        return this.applLastName;
    }

    public final String getApplQualName() {
        return this.applQualName;
    }

    public final String getBiPhoto() {
        return this.biPhoto;
    }

    public final Object getBiPhotoBase64() {
        return this.biPhotoBase64;
    }

    public final String getBiSignature() {
        return this.biSignature;
    }

    public final Object getBiSignatureBase64() {
        return this.biSignatureBase64;
    }

    public final String getBioId() {
        return this.bioId;
    }

    public final String getBiocitizen() {
        return this.biocitizen;
    }

    public final Object getBioorgdonor() {
        return this.bioorgdonor;
    }

    public final String getBloodGroup() {
        return this.bloodGroup;
    }

    public final DLCOVList getDLCOVList() {
        return this.dLCOVList;
    }

    public final String getDlDispatchStatus() {
        return this.dlDispatchStatus;
    }

    public final String getDlEndorseAuth() {
        return this.dlEndorseAuth;
    }

    public final String getDlEndorsedt() {
        return this.dlEndorsedt;
    }

    public final Object getDlEndorsetime() {
        return this.dlEndorsetime;
    }

    public final String getDlIssueauth() {
        return this.dlIssueauth;
    }

    public final String getDlIssuedt() {
        return this.dlIssuedt;
    }

    public final Integer getDlLatestTrcode() {
        return this.dlLatestTrcode;
    }

    public final String getDlNtValdfrDt() {
        return this.dlNtValdfrDt;
    }

    public final String getDlNtValdtoDt() {
        return this.dlNtValdtoDt;
    }

    public final String getDlPrintStatus() {
        return this.dlPrintStatus;
    }

    public final String getDlRecGenesis() {
        return this.dlRecGenesis;
    }

    public final String getDlRemarks() {
        return this.dlRemarks;
    }

    public final String getDlSeqno() {
        return this.dlSeqno;
    }

    public final String getDlStatus() {
        return this.dlStatus;
    }

    public final String getDlno() {
        return this.dlno;
    }

    public final EligibleDLSerList getEligibleDLSerList() {
        return this.eligibleDLSerList;
    }

    public final Integer getHazIssueinsttCode() {
        return this.hazIssueinsttCode;
    }

    public final Object getRelFirstName() {
        return this.relFirstName;
    }

    public final Object getRelLastName() {
        return this.relLastName;
    }

    public final String getRelationType() {
        return this.relationType;
    }

    public int hashCode() {
        String str = this.relationType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dlSeqno;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dlDispatchStatus;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.dlRemarks;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.dlRecGenesis;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.biPhoto;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.dlNtValdfrDt;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.applFullName;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.hazIssueinsttCode;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.apdPermPin;
        int iHashCode10 = (iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Object obj = this.dlEndorsetime;
        int iHashCode11 = (iHashCode10 + (obj == null ? 0 : obj.hashCode())) * 31;
        String str9 = this.bloodGroup;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        EligibleDLSerList eligibleDLSerList = this.eligibleDLSerList;
        int iHashCode13 = (iHashCode12 + (eligibleDLSerList == null ? 0 : eligibleDLSerList.hashCode())) * 31;
        String str10 = this.dlEndorseAuth;
        int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.dlStatus;
        int iHashCode15 = (iHashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.dlIssueauth;
        int iHashCode16 = (iHashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.bioId;
        int iHashCode17 = (iHashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31;
        DLCOVList dLCOVList = this.dLCOVList;
        int iHashCode18 = (iHashCode17 + (dLCOVList == null ? 0 : dLCOVList.hashCode())) * 31;
        String str14 = this.apdTempAdd2;
        int iHashCode19 = (iHashCode18 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.apdTempAdd3;
        int iHashCode20 = (iHashCode19 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Object obj2 = this.biPhotoBase64;
        int iHashCode21 = (iHashCode20 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        String str16 = this.apdTempAdd1;
        int iHashCode22 = (iHashCode21 + (str16 == null ? 0 : str16.hashCode())) * 31;
        Integer num3 = this.apdTempPin;
        int iHashCode23 = (iHashCode22 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.applEmpCatg;
        int iHashCode24 = (iHashCode23 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Object obj3 = this.biSignatureBase64;
        int iHashCode25 = (iHashCode24 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Integer num5 = this.dlLatestTrcode;
        int iHashCode26 = (iHashCode25 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str17 = this.dlEndorsedt;
        int iHashCode27 = (iHashCode26 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.dlno;
        int iHashCode28 = (iHashCode27 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.apdPermAdd3;
        int iHashCode29 = (iHashCode28 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.dlIssuedt;
        int iHashCode30 = (iHashCode29 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.apdPermAdd2;
        int iHashCode31 = (iHashCode30 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.apdPermAdd1;
        int iHashCode32 = (iHashCode31 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.biSignature;
        int iHashCode33 = (iHashCode32 + (str23 == null ? 0 : str23.hashCode())) * 31;
        Object obj4 = this.relFirstName;
        int iHashCode34 = (iHashCode33 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        String str24 = this.apdNaturalName;
        int iHashCode35 = (iHashCode34 + (str24 == null ? 0 : str24.hashCode())) * 31;
        Object obj5 = this.relLastName;
        int iHashCode36 = (iHashCode35 + (obj5 == null ? 0 : obj5.hashCode())) * 31;
        Object obj6 = this.bioorgdonor;
        int iHashCode37 = (iHashCode36 + (obj6 == null ? 0 : obj6.hashCode())) * 31;
        String str25 = this.dlPrintStatus;
        int iHashCode38 = (iHashCode37 + (str25 == null ? 0 : str25.hashCode())) * 31;
        Object obj7 = this.applFirstName;
        int iHashCode39 = (iHashCode38 + (obj7 == null ? 0 : obj7.hashCode())) * 31;
        Object obj8 = this.applLastName;
        int iHashCode40 = (iHashCode39 + (obj8 == null ? 0 : obj8.hashCode())) * 31;
        String str26 = this.applQualName;
        int iHashCode41 = (iHashCode40 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.biocitizen;
        int iHashCode42 = (iHashCode41 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.dlNtValdtoDt;
        return iHashCode42 + (str28 != null ? str28.hashCode() : 0);
    }

    public String toString() {
        return "ResultItem(relationType=" + this.relationType + ", dlSeqno=" + this.dlSeqno + ", dlDispatchStatus=" + this.dlDispatchStatus + ", dlRemarks=" + this.dlRemarks + ", dlRecGenesis=" + this.dlRecGenesis + ", biPhoto=" + this.biPhoto + ", dlNtValdfrDt=" + this.dlNtValdfrDt + ", applFullName=" + this.applFullName + ", hazIssueinsttCode=" + this.hazIssueinsttCode + ", apdPermPin=" + this.apdPermPin + ", dlEndorsetime=" + this.dlEndorsetime + ", bloodGroup=" + this.bloodGroup + ", eligibleDLSerList=" + this.eligibleDLSerList + ", dlEndorseAuth=" + this.dlEndorseAuth + ", dlStatus=" + this.dlStatus + ", dlIssueauth=" + this.dlIssueauth + ", bioId=" + this.bioId + ", dLCOVList=" + this.dLCOVList + ", apdTempAdd2=" + this.apdTempAdd2 + ", apdTempAdd3=" + this.apdTempAdd3 + ", biPhotoBase64=" + this.biPhotoBase64 + ", apdTempAdd1=" + this.apdTempAdd1 + ", apdTempPin=" + this.apdTempPin + ", applEmpCatg=" + this.applEmpCatg + ", biSignatureBase64=" + this.biSignatureBase64 + ", dlLatestTrcode=" + this.dlLatestTrcode + ", dlEndorsedt=" + this.dlEndorsedt + ", dlno=" + this.dlno + ", apdPermAdd3=" + this.apdPermAdd3 + ", dlIssuedt=" + this.dlIssuedt + ", apdPermAdd2=" + this.apdPermAdd2 + ", apdPermAdd1=" + this.apdPermAdd1 + ", biSignature=" + this.biSignature + ", relFirstName=" + this.relFirstName + ", apdNaturalName=" + this.apdNaturalName + ", relLastName=" + this.relLastName + ", bioorgdonor=" + this.bioorgdonor + ", dlPrintStatus=" + this.dlPrintStatus + ", applFirstName=" + this.applFirstName + ", applLastName=" + this.applLastName + ", applQualName=" + this.applQualName + ", biocitizen=" + this.biocitizen + ", dlNtValdtoDt=" + this.dlNtValdtoDt + ')';
    }

    public ResultItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, Object obj, String str9, EligibleDLSerList eligibleDLSerList, String str10, String str11, String str12, String str13, DLCOVList dLCOVList, String str14, String str15, Object obj2, String str16, Integer num3, Integer num4, Object obj3, Integer num5, String str17, String str18, String str19, String str20, String str21, String str22, String str23, Object obj4, String str24, Object obj5, Object obj6, String str25, Object obj7, Object obj8, String str26, String str27, String str28) {
        this.relationType = str;
        this.dlSeqno = str2;
        this.dlDispatchStatus = str3;
        this.dlRemarks = str4;
        this.dlRecGenesis = str5;
        this.biPhoto = str6;
        this.dlNtValdfrDt = str7;
        this.applFullName = str8;
        this.hazIssueinsttCode = num;
        this.apdPermPin = num2;
        this.dlEndorsetime = obj;
        this.bloodGroup = str9;
        this.eligibleDLSerList = eligibleDLSerList;
        this.dlEndorseAuth = str10;
        this.dlStatus = str11;
        this.dlIssueauth = str12;
        this.bioId = str13;
        this.dLCOVList = dLCOVList;
        this.apdTempAdd2 = str14;
        this.apdTempAdd3 = str15;
        this.biPhotoBase64 = obj2;
        this.apdTempAdd1 = str16;
        this.apdTempPin = num3;
        this.applEmpCatg = num4;
        this.biSignatureBase64 = obj3;
        this.dlLatestTrcode = num5;
        this.dlEndorsedt = str17;
        this.dlno = str18;
        this.apdPermAdd3 = str19;
        this.dlIssuedt = str20;
        this.apdPermAdd2 = str21;
        this.apdPermAdd1 = str22;
        this.biSignature = str23;
        this.relFirstName = obj4;
        this.apdNaturalName = str24;
        this.relLastName = obj5;
        this.bioorgdonor = obj6;
        this.dlPrintStatus = str25;
        this.applFirstName = obj7;
        this.applLastName = obj8;
        this.applQualName = str26;
        this.biocitizen = str27;
        this.dlNtValdtoDt = str28;
    }

    public /* synthetic */ ResultItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, Object obj, String str9, EligibleDLSerList eligibleDLSerList, String str10, String str11, String str12, String str13, DLCOVList dLCOVList, String str14, String str15, Object obj2, String str16, Integer num3, Integer num4, Object obj3, Integer num5, String str17, String str18, String str19, String str20, String str21, String str22, String str23, Object obj4, String str24, Object obj5, Object obj6, String str25, Object obj7, Object obj8, String str26, String str27, String str28, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : num, (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : num2, (i & 1024) != 0 ? null : obj, (i & 2048) != 0 ? null : str9, (i & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? null : eligibleDLSerList, (i & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? null : str10, (i & 16384) != 0 ? null : str11, (i & 32768) != 0 ? null : str12, (i & 65536) != 0 ? null : str13, (i & 131072) != 0 ? null : dLCOVList, (i & 262144) != 0 ? null : str14, (i & 524288) != 0 ? null : str15, (i & 1048576) != 0 ? null : obj2, (i & 2097152) != 0 ? null : str16, (i & 4194304) != 0 ? null : num3, (i & 8388608) != 0 ? null : num4, (i & 16777216) != 0 ? null : obj3, (i & 33554432) != 0 ? null : num5, (i & 67108864) != 0 ? null : str17, (i & 134217728) != 0 ? null : str18, (i & 268435456) != 0 ? null : str19, (i & 536870912) != 0 ? null : str20, (i & 1073741824) != 0 ? null : str21, (i & IntCompanionObject.MIN_VALUE) != 0 ? null : str22, (i2 & 1) != 0 ? null : str23, (i2 & 2) != 0 ? null : obj4, (i2 & 4) != 0 ? null : str24, (i2 & 8) != 0 ? null : obj5, (i2 & 16) != 0 ? null : obj6, (i2 & 32) != 0 ? null : str25, (i2 & 64) != 0 ? null : obj7, (i2 & 128) != 0 ? null : obj8, (i2 & 256) != 0 ? null : str26, (i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : str27, (i2 & 1024) != 0 ? null : str28);
    }
}
