package com.nic.mparivahan.Tax.Model;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0003\b\u0093\u0001\b\u0087\b\u0018\u00002\u00020\u0001:\u0002Ê\u0001Bñ\u0003\u0012\u0006\u0010C\u001a\u00020\u0002\u0012\u0006\u0010D\u001a\u00020\u0002\u0012\u0006\u0010E\u001a\u00020\u0002\u0012\u0006\u0010F\u001a\u00020\u0006\u0012\u0006\u0010G\u001a\u00020\u0002\u0012\u0006\u0010H\u001a\u00020\u0006\u0012\u0006\u0010I\u001a\u00020\u0006\u0012\u0006\u0010J\u001a\u00020\u0006\u0012\u0006\u0010K\u001a\u00020\u0006\u0012\u0006\u0010L\u001a\u00020\u0006\u0012\u0006\u0010M\u001a\u00020\u0006\u0012\u0006\u0010N\u001a\u00020\u0002\u0012\u0006\u0010O\u001a\u00020\u0006\u0012\u0006\u0010P\u001a\u00020\u0006\u0012\u0006\u0010Q\u001a\u00020\u0002\u0012\u0006\u0010R\u001a\u00020\u0002\u0012\u0006\u0010S\u001a\u00020\u0002\u0012\u0006\u0010T\u001a\u00020\u0006\u0012\u0006\u0010U\u001a\u00020\u0006\u0012\u0016\u0010V\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0017j\b\u0012\u0004\u0012\u00020\u0001`\u0018\u0012\u0006\u0010W\u001a\u00020\u0002\u0012\u0006\u0010X\u001a\u00020\u0006\u0012\u0006\u0010Y\u001a\u00020\u0006\u0012\u0006\u0010Z\u001a\u00020\u0006\u0012\u0006\u0010[\u001a\u00020\u0002\u0012\u0006\u0010\\\u001a\u00020\u0006\u0012\u0006\u0010]\u001a\u00020\u0002\u0012\u0006\u0010^\u001a\u00020\u0006\u0012\u0006\u0010_\u001a\u00020\u0002\u0012\u0006\u0010`\u001a\u00020\u0006\u0012\u0006\u0010a\u001a\u00020\u0006\u0012\u0006\u0010b\u001a\u00020\u0002\u0012\u0006\u0010c\u001a\u00020\u0002\u0012\u0006\u0010d\u001a\u00020\u0002\u0012\u0006\u0010e\u001a\u00020\u0002\u0012\u0006\u0010f\u001a\u00020\u0002\u0012\u0006\u0010g\u001a\u00020\u0002\u0012\u0006\u0010h\u001a\u00020\u0002\u0012\u0006\u0010i\u001a\u00020,\u0012\u0006\u0010j\u001a\u00020\u0002\u0012\u0006\u0010k\u001a\u00020\u0006\u0012\u0006\u0010l\u001a\u00020\u0006\u0012\u0006\u0010m\u001a\u00020\u0006\u0012\u0006\u0010n\u001a\u00020\u0006\u0012\u0006\u0010o\u001a\u00020\u0006\u0012\u0006\u0010p\u001a\u00020\u0006\u0012\u0006\u0010q\u001a\u00020\u0006\u0012\u0006\u0010r\u001a\u00020\u0002\u0012\u0006\u0010s\u001a\u00020,\u0012\u0006\u0010t\u001a\u000208\u0012\u0006\u0010u\u001a\u00020\u0006\u0012\u0006\u0010v\u001a\u00020\u0002\u0012\u0006\u0010w\u001a\u00020\u0002\u0012\u0006\u0010x\u001a\u00020\u0002\u0012\u0006\u0010y\u001a\u00020\u0002\u0012\u0006\u0010z\u001a\u00020\u0006\u0012\u0006\u0010{\u001a\u00020\u0002\u0012\u0006\u0010|\u001a\u00020\u0006\u0012\u0006\u0010}\u001a\u00020\u0006¢\u0006\u0006\bÈ\u0001\u0010É\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0006HÆ\u0003J\t\u0010\n\u001a\u00020\u0006HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0006HÆ\u0003J\t\u0010\f\u001a\u00020\u0006HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\u0019\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0017j\b\u0012\u0004\u0012\u00020\u0001`\u0018HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0002HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0002HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0002HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\u0002HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0002HÆ\u0003J\t\u0010&\u001a\u00020\u0002HÆ\u0003J\t\u0010'\u001a\u00020\u0002HÆ\u0003J\t\u0010(\u001a\u00020\u0002HÆ\u0003J\t\u0010)\u001a\u00020\u0002HÆ\u0003J\t\u0010*\u001a\u00020\u0002HÆ\u0003J\t\u0010+\u001a\u00020\u0002HÆ\u0003J\t\u0010-\u001a\u00020,HÆ\u0003J\t\u0010.\u001a\u00020\u0002HÆ\u0003J\t\u0010/\u001a\u00020\u0006HÆ\u0003J\t\u00100\u001a\u00020\u0006HÆ\u0003J\t\u00101\u001a\u00020\u0006HÆ\u0003J\t\u00102\u001a\u00020\u0006HÆ\u0003J\t\u00103\u001a\u00020\u0006HÆ\u0003J\t\u00104\u001a\u00020\u0006HÆ\u0003J\t\u00105\u001a\u00020\u0006HÆ\u0003J\t\u00106\u001a\u00020\u0002HÆ\u0003J\t\u00107\u001a\u00020,HÆ\u0003J\t\u00109\u001a\u000208HÆ\u0003J\t\u0010:\u001a\u00020\u0006HÆ\u0003J\t\u0010;\u001a\u00020\u0002HÆ\u0003J\t\u0010<\u001a\u00020\u0002HÆ\u0003J\t\u0010=\u001a\u00020\u0002HÆ\u0003J\t\u0010>\u001a\u00020\u0002HÆ\u0003J\t\u0010?\u001a\u00020\u0006HÆ\u0003J\t\u0010@\u001a\u00020\u0002HÆ\u0003J\t\u0010A\u001a\u00020\u0006HÆ\u0003J\t\u0010B\u001a\u00020\u0006HÆ\u0003Jç\u0004\u0010~\u001a\u00020\u00002\b\b\u0002\u0010C\u001a\u00020\u00022\b\b\u0002\u0010D\u001a\u00020\u00022\b\b\u0002\u0010E\u001a\u00020\u00022\b\b\u0002\u0010F\u001a\u00020\u00062\b\b\u0002\u0010G\u001a\u00020\u00022\b\b\u0002\u0010H\u001a\u00020\u00062\b\b\u0002\u0010I\u001a\u00020\u00062\b\b\u0002\u0010J\u001a\u00020\u00062\b\b\u0002\u0010K\u001a\u00020\u00062\b\b\u0002\u0010L\u001a\u00020\u00062\b\b\u0002\u0010M\u001a\u00020\u00062\b\b\u0002\u0010N\u001a\u00020\u00022\b\b\u0002\u0010O\u001a\u00020\u00062\b\b\u0002\u0010P\u001a\u00020\u00062\b\b\u0002\u0010Q\u001a\u00020\u00022\b\b\u0002\u0010R\u001a\u00020\u00022\b\b\u0002\u0010S\u001a\u00020\u00022\b\b\u0002\u0010T\u001a\u00020\u00062\b\b\u0002\u0010U\u001a\u00020\u00062\u0018\b\u0002\u0010V\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0017j\b\u0012\u0004\u0012\u00020\u0001`\u00182\b\b\u0002\u0010W\u001a\u00020\u00022\b\b\u0002\u0010X\u001a\u00020\u00062\b\b\u0002\u0010Y\u001a\u00020\u00062\b\b\u0002\u0010Z\u001a\u00020\u00062\b\b\u0002\u0010[\u001a\u00020\u00022\b\b\u0002\u0010\\\u001a\u00020\u00062\b\b\u0002\u0010]\u001a\u00020\u00022\b\b\u0002\u0010^\u001a\u00020\u00062\b\b\u0002\u0010_\u001a\u00020\u00022\b\b\u0002\u0010`\u001a\u00020\u00062\b\b\u0002\u0010a\u001a\u00020\u00062\b\b\u0002\u0010b\u001a\u00020\u00022\b\b\u0002\u0010c\u001a\u00020\u00022\b\b\u0002\u0010d\u001a\u00020\u00022\b\b\u0002\u0010e\u001a\u00020\u00022\b\b\u0002\u0010f\u001a\u00020\u00022\b\b\u0002\u0010g\u001a\u00020\u00022\b\b\u0002\u0010h\u001a\u00020\u00022\b\b\u0002\u0010i\u001a\u00020,2\b\b\u0002\u0010j\u001a\u00020\u00022\b\b\u0002\u0010k\u001a\u00020\u00062\b\b\u0002\u0010l\u001a\u00020\u00062\b\b\u0002\u0010m\u001a\u00020\u00062\b\b\u0002\u0010n\u001a\u00020\u00062\b\b\u0002\u0010o\u001a\u00020\u00062\b\b\u0002\u0010p\u001a\u00020\u00062\b\b\u0002\u0010q\u001a\u00020\u00062\b\b\u0002\u0010r\u001a\u00020\u00022\b\b\u0002\u0010s\u001a\u00020,2\b\b\u0002\u0010t\u001a\u0002082\b\b\u0002\u0010u\u001a\u00020\u00062\b\b\u0002\u0010v\u001a\u00020\u00022\b\b\u0002\u0010w\u001a\u00020\u00022\b\b\u0002\u0010x\u001a\u00020\u00022\b\b\u0002\u0010y\u001a\u00020\u00022\b\b\u0002\u0010z\u001a\u00020\u00062\b\b\u0002\u0010{\u001a\u00020\u00022\b\b\u0002\u0010|\u001a\u00020\u00062\b\b\u0002\u0010}\u001a\u00020\u0006HÆ\u0001J\t\u0010\u007f\u001a\u00020\u0002HÖ\u0001J\n\u0010\u0080\u0001\u001a\u00020\u0006HÖ\u0001J\u0015\u0010\u0082\u0001\u001a\u00020,2\t\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010C\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bC\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001a\u0010D\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bD\u0010\u0083\u0001\u001a\u0006\b\u0086\u0001\u0010\u0085\u0001R\u001a\u0010E\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bE\u0010\u0083\u0001\u001a\u0006\b\u0087\u0001\u0010\u0085\u0001R\u001a\u0010F\u001a\u00020\u00068\u0006¢\u0006\u000f\n\u0005\bF\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001a\u0010G\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bG\u0010\u0083\u0001\u001a\u0006\b\u008b\u0001\u0010\u0085\u0001R\u001a\u0010H\u001a\u00020\u00068\u0006¢\u0006\u000f\n\u0005\bH\u0010\u0088\u0001\u001a\u0006\b\u008c\u0001\u0010\u008a\u0001R\u001a\u0010I\u001a\u00020\u00068\u0006¢\u0006\u000f\n\u0005\bI\u0010\u0088\u0001\u001a\u0006\b\u008d\u0001\u0010\u008a\u0001R\u001a\u0010J\u001a\u00020\u00068\u0006¢\u0006\u000f\n\u0005\bJ\u0010\u0088\u0001\u001a\u0006\b\u008e\u0001\u0010\u008a\u0001R\u001a\u0010K\u001a\u00020\u00068\u0006¢\u0006\u000f\n\u0005\bK\u0010\u0088\u0001\u001a\u0006\b\u008f\u0001\u0010\u008a\u0001R\u001a\u0010L\u001a\u00020\u00068\u0006¢\u0006\u000f\n\u0005\bL\u0010\u0088\u0001\u001a\u0006\b\u0090\u0001\u0010\u008a\u0001R\u001a\u0010M\u001a\u00020\u00068\u0006¢\u0006\u000f\n\u0005\bM\u0010\u0088\u0001\u001a\u0006\b\u0091\u0001\u0010\u008a\u0001R\u001a\u0010N\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bN\u0010\u0083\u0001\u001a\u0006\b\u0092\u0001\u0010\u0085\u0001R\u001a\u0010O\u001a\u00020\u00068\u0006¢\u0006\u000f\n\u0005\bO\u0010\u0088\u0001\u001a\u0006\b\u0093\u0001\u0010\u008a\u0001R\u001a\u0010P\u001a\u00020\u00068\u0006¢\u0006\u000f\n\u0005\bP\u0010\u0088\u0001\u001a\u0006\b\u0094\u0001\u0010\u008a\u0001R\u001a\u0010Q\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bQ\u0010\u0083\u0001\u001a\u0006\b\u0095\u0001\u0010\u0085\u0001R\u001a\u0010R\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bR\u0010\u0083\u0001\u001a\u0006\b\u0096\u0001\u0010\u0085\u0001R\u001a\u0010S\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bS\u0010\u0083\u0001\u001a\u0006\b\u0097\u0001\u0010\u0085\u0001R\u001a\u0010T\u001a\u00020\u00068\u0006¢\u0006\u000f\n\u0005\bT\u0010\u0088\u0001\u001a\u0006\b\u0098\u0001\u0010\u008a\u0001R\u001a\u0010U\u001a\u00020\u00068\u0006¢\u0006\u000f\n\u0005\bU\u0010\u0088\u0001\u001a\u0006\b\u0099\u0001\u0010\u008a\u0001R*\u0010V\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0017j\b\u0012\u0004\u0012\u00020\u0001`\u00188\u0006¢\u0006\u000f\n\u0005\bV\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001a\u0010W\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bW\u0010\u0083\u0001\u001a\u0006\b\u009d\u0001\u0010\u0085\u0001R\u001a\u0010X\u001a\u00020\u00068\u0006¢\u0006\u000f\n\u0005\bX\u0010\u0088\u0001\u001a\u0006\b\u009e\u0001\u0010\u008a\u0001R\u001a\u0010Y\u001a\u00020\u00068\u0006¢\u0006\u000f\n\u0005\bY\u0010\u0088\u0001\u001a\u0006\b\u009f\u0001\u0010\u008a\u0001R\u001a\u0010Z\u001a\u00020\u00068\u0006¢\u0006\u000f\n\u0005\bZ\u0010\u0088\u0001\u001a\u0006\b \u0001\u0010\u008a\u0001R\u001a\u0010[\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b[\u0010\u0083\u0001\u001a\u0006\b¡\u0001\u0010\u0085\u0001R\u001a\u0010\\\u001a\u00020\u00068\u0006¢\u0006\u000f\n\u0005\b\\\u0010\u0088\u0001\u001a\u0006\b¢\u0001\u0010\u008a\u0001R\u001a\u0010]\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b]\u0010\u0083\u0001\u001a\u0006\b£\u0001\u0010\u0085\u0001R\u001a\u0010^\u001a\u00020\u00068\u0006¢\u0006\u000f\n\u0005\b^\u0010\u0088\u0001\u001a\u0006\b¤\u0001\u0010\u008a\u0001R\u001a\u0010_\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b_\u0010\u0083\u0001\u001a\u0006\b¥\u0001\u0010\u0085\u0001R\u001a\u0010`\u001a\u00020\u00068\u0006¢\u0006\u000f\n\u0005\b`\u0010\u0088\u0001\u001a\u0006\b¦\u0001\u0010\u008a\u0001R\u001a\u0010a\u001a\u00020\u00068\u0006¢\u0006\u000f\n\u0005\ba\u0010\u0088\u0001\u001a\u0006\b§\u0001\u0010\u008a\u0001R\u001a\u0010b\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bb\u0010\u0083\u0001\u001a\u0006\b¨\u0001\u0010\u0085\u0001R\u001a\u0010c\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bc\u0010\u0083\u0001\u001a\u0006\b©\u0001\u0010\u0085\u0001R\u001a\u0010d\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bd\u0010\u0083\u0001\u001a\u0006\bª\u0001\u0010\u0085\u0001R\u001a\u0010e\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\be\u0010\u0083\u0001\u001a\u0006\b«\u0001\u0010\u0085\u0001R\u001a\u0010f\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bf\u0010\u0083\u0001\u001a\u0006\b¬\u0001\u0010\u0085\u0001R\u001a\u0010g\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bg\u0010\u0083\u0001\u001a\u0006\b\u00ad\u0001\u0010\u0085\u0001R\u001a\u0010h\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bh\u0010\u0083\u0001\u001a\u0006\b®\u0001\u0010\u0085\u0001R\u001a\u0010i\u001a\u00020,8\u0006¢\u0006\u000f\n\u0005\bi\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001R\u001a\u0010j\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bj\u0010\u0083\u0001\u001a\u0006\b²\u0001\u0010\u0085\u0001R\u001a\u0010k\u001a\u00020\u00068\u0006¢\u0006\u000f\n\u0005\bk\u0010\u0088\u0001\u001a\u0006\b³\u0001\u0010\u008a\u0001R\u001a\u0010l\u001a\u00020\u00068\u0006¢\u0006\u000f\n\u0005\bl\u0010\u0088\u0001\u001a\u0006\b´\u0001\u0010\u008a\u0001R\u001a\u0010m\u001a\u00020\u00068\u0006¢\u0006\u000f\n\u0005\bm\u0010\u0088\u0001\u001a\u0006\bµ\u0001\u0010\u008a\u0001R\u001a\u0010n\u001a\u00020\u00068\u0006¢\u0006\u000f\n\u0005\bn\u0010\u0088\u0001\u001a\u0006\b¶\u0001\u0010\u008a\u0001R\u001a\u0010o\u001a\u00020\u00068\u0006¢\u0006\u000f\n\u0005\bo\u0010\u0088\u0001\u001a\u0006\b·\u0001\u0010\u008a\u0001R\u001a\u0010p\u001a\u00020\u00068\u0006¢\u0006\u000f\n\u0005\bp\u0010\u0088\u0001\u001a\u0006\b¸\u0001\u0010\u008a\u0001R\u001a\u0010q\u001a\u00020\u00068\u0006¢\u0006\u000f\n\u0005\bq\u0010\u0088\u0001\u001a\u0006\b¹\u0001\u0010\u008a\u0001R\u001a\u0010r\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\br\u0010\u0083\u0001\u001a\u0006\bº\u0001\u0010\u0085\u0001R\u001a\u0010s\u001a\u00020,8\u0006¢\u0006\u000f\n\u0005\bs\u0010¯\u0001\u001a\u0006\b»\u0001\u0010±\u0001R\u001a\u0010t\u001a\u0002088\u0006¢\u0006\u000f\n\u0005\bt\u0010¼\u0001\u001a\u0006\b½\u0001\u0010¾\u0001R\u001a\u0010u\u001a\u00020\u00068\u0006¢\u0006\u000f\n\u0005\bu\u0010\u0088\u0001\u001a\u0006\b¿\u0001\u0010\u008a\u0001R\u001a\u0010v\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bv\u0010\u0083\u0001\u001a\u0006\bÀ\u0001\u0010\u0085\u0001R\u001a\u0010w\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bw\u0010\u0083\u0001\u001a\u0006\bÁ\u0001\u0010\u0085\u0001R\u001a\u0010x\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bx\u0010\u0083\u0001\u001a\u0006\bÂ\u0001\u0010\u0085\u0001R\u001a\u0010y\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\by\u0010\u0083\u0001\u001a\u0006\bÃ\u0001\u0010\u0085\u0001R\u001a\u0010z\u001a\u00020\u00068\u0006¢\u0006\u000f\n\u0005\bz\u0010\u0088\u0001\u001a\u0006\bÄ\u0001\u0010\u008a\u0001R\u001a\u0010{\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b{\u0010\u0083\u0001\u001a\u0006\bÅ\u0001\u0010\u0085\u0001R\u001a\u0010|\u001a\u00020\u00068\u0006¢\u0006\u000f\n\u0005\b|\u0010\u0088\u0001\u001a\u0006\bÆ\u0001\u0010\u008a\u0001R\u001a\u0010}\u001a\u00020\u00068\u0006¢\u0006\u000f\n\u0005\b}\u0010\u0088\u0001\u001a\u0006\bÇ\u0001\u0010\u008a\u0001¨\u0006Ë\u0001"}, d2 = {"Lcom/nic/mparivahan/Tax/Model/TaxPurCdDesc;", "", "", "component1", "component2", "component3", "", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "Lcom/nic/mparivahan/Tax/Model/TaxPurCdDesc$a;", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "ac_fitted", "appl_no", "audio_fitted", "cubic_cap", "dialogValue", "distance_run_in_quarter", "domain_cd", "fin_yr_sale_amt", "floor_area", "fuel", "gcw", "goods_to_carry", "height", "hp", "imported_vch", "issue_dt", "jorney_purpose", "ld_wt", "length", "listTaxModes", "no_adv_units", "no_cyl", "no_of_trips", "off_cd", "op_dt", "other_criteria", "parking", "pmt_catg", "pmt_no", "pmt_type", "pur_cd", "pur_descr", "purchase_dt", "rcpt_no", "region_covered", "regn_no", "regn_type", "remarks", "renderForm", "replace_date", "route_class", "route_length", "sale_amt", "seat_cap", "service_type", "sleeper_cap", "stand_cap", "state_cd", "taxBased", "taxPurCdDescr", "unld_wt", "valid_from", "valid_upto", "vch_catg", "vch_purchase_as", "vh_class", "video_fitted", "wheelbase", "width", "copy", "toString", "hashCode", "other", "equals", "Ljava/lang/String;", "getAc_fitted", "()Ljava/lang/String;", "getAppl_no", "getAudio_fitted", "I", "getCubic_cap", "()I", "getDialogValue", "getDistance_run_in_quarter", "getDomain_cd", "getFin_yr_sale_amt", "getFloor_area", "getFuel", "getGcw", "getGoods_to_carry", "getHeight", "getHp", "getImported_vch", "getIssue_dt", "getJorney_purpose", "getLd_wt", "getLength", "Ljava/util/ArrayList;", "getListTaxModes", "()Ljava/util/ArrayList;", "getNo_adv_units", "getNo_cyl", "getNo_of_trips", "getOff_cd", "getOp_dt", "getOther_criteria", "getParking", "getPmt_catg", "getPmt_no", "getPmt_type", "getPur_cd", "getPur_descr", "getPurchase_dt", "getRcpt_no", "getRegion_covered", "getRegn_no", "getRegn_type", "getRemarks", "Z", "getRenderForm", "()Z", "getReplace_date", "getRoute_class", "getRoute_length", "getSale_amt", "getSeat_cap", "getService_type", "getSleeper_cap", "getStand_cap", "getState_cd", "getTaxBased", "Lcom/nic/mparivahan/Tax/Model/TaxPurCdDesc$a;", "getTaxPurCdDescr", "()Lcom/nic/mparivahan/Tax/Model/TaxPurCdDesc$a;", "getUnld_wt", "getValid_from", "getValid_upto", "getVch_catg", "getVch_purchase_as", "getVh_class", "getVideo_fitted", "getWheelbase", "getWidth", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IIIIIILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/util/ArrayList;Ljava/lang/String;IIILjava/lang/String;ILjava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;IIIIIIILjava/lang/String;ZLcom/nic/mparivahan/Tax/Model/TaxPurCdDesc$a;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;II)V", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class TaxPurCdDesc {
    private final String ac_fitted;
    private final String appl_no;
    private final String audio_fitted;
    private final int cubic_cap;
    private final String dialogValue;
    private final int distance_run_in_quarter;
    private final int domain_cd;
    private final int fin_yr_sale_amt;
    private final int floor_area;
    private final int fuel;
    private final int gcw;
    private final String goods_to_carry;
    private final int height;
    private final int hp;
    private final String imported_vch;
    private final String issue_dt;
    private final String jorney_purpose;
    private final int ld_wt;
    private final int length;
    private final ArrayList<Object> listTaxModes;
    private final String no_adv_units;
    private final int no_cyl;
    private final int no_of_trips;
    private final int off_cd;
    private final String op_dt;
    private final int other_criteria;
    private final String parking;
    private final int pmt_catg;
    private final String pmt_no;
    private final int pmt_type;
    private final int pur_cd;
    private final String pur_descr;
    private final String purchase_dt;
    private final String rcpt_no;
    private final String region_covered;
    private final String regn_no;
    private final String regn_type;
    private final String remarks;
    private final boolean renderForm;
    private final String replace_date;
    private final int route_class;
    private final int route_length;
    private final int sale_amt;
    private final int seat_cap;
    private final int service_type;
    private final int sleeper_cap;
    private final int stand_cap;
    private final String state_cd;
    private final boolean taxBased;
    private final a taxPurCdDescr;
    private final int unld_wt;
    private final String valid_from;
    private final String valid_upto;
    private final String vch_catg;
    private final String vch_purchase_as;
    private final int vh_class;
    private final String video_fitted;
    private final int wheelbase;
    private final int width;

    public static final class a {
    }

    public TaxPurCdDesc(String ac_fitted, String appl_no, String audio_fitted, int i, String dialogValue, int i2, int i3, int i4, int i5, int i6, int i7, String goods_to_carry, int i8, int i9, String imported_vch, String issue_dt, String jorney_purpose, int i10, int i11, ArrayList<Object> listTaxModes, String no_adv_units, int i12, int i13, int i14, String op_dt, int i15, String parking, int i16, String pmt_no, int i17, int i18, String pur_descr, String purchase_dt, String rcpt_no, String region_covered, String regn_no, String regn_type, String remarks, boolean z, String replace_date, int i19, int i20, int i21, int i22, int i23, int i24, int i25, String state_cd, boolean z2, a taxPurCdDescr, int i26, String valid_from, String valid_upto, String vch_catg, String vch_purchase_as, int i27, String video_fitted, int i28, int i29) {
        Intrinsics.checkNotNullParameter(ac_fitted, "ac_fitted");
        Intrinsics.checkNotNullParameter(appl_no, "appl_no");
        Intrinsics.checkNotNullParameter(audio_fitted, "audio_fitted");
        Intrinsics.checkNotNullParameter(dialogValue, "dialogValue");
        Intrinsics.checkNotNullParameter(goods_to_carry, "goods_to_carry");
        Intrinsics.checkNotNullParameter(imported_vch, "imported_vch");
        Intrinsics.checkNotNullParameter(issue_dt, "issue_dt");
        Intrinsics.checkNotNullParameter(jorney_purpose, "jorney_purpose");
        Intrinsics.checkNotNullParameter(listTaxModes, "listTaxModes");
        Intrinsics.checkNotNullParameter(no_adv_units, "no_adv_units");
        Intrinsics.checkNotNullParameter(op_dt, "op_dt");
        Intrinsics.checkNotNullParameter(parking, "parking");
        Intrinsics.checkNotNullParameter(pmt_no, "pmt_no");
        Intrinsics.checkNotNullParameter(pur_descr, "pur_descr");
        Intrinsics.checkNotNullParameter(purchase_dt, "purchase_dt");
        Intrinsics.checkNotNullParameter(rcpt_no, "rcpt_no");
        Intrinsics.checkNotNullParameter(region_covered, "region_covered");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(regn_type, "regn_type");
        Intrinsics.checkNotNullParameter(remarks, "remarks");
        Intrinsics.checkNotNullParameter(replace_date, "replace_date");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(taxPurCdDescr, "taxPurCdDescr");
        Intrinsics.checkNotNullParameter(valid_from, "valid_from");
        Intrinsics.checkNotNullParameter(valid_upto, "valid_upto");
        Intrinsics.checkNotNullParameter(vch_catg, "vch_catg");
        Intrinsics.checkNotNullParameter(vch_purchase_as, "vch_purchase_as");
        Intrinsics.checkNotNullParameter(video_fitted, "video_fitted");
        this.ac_fitted = ac_fitted;
        this.appl_no = appl_no;
        this.audio_fitted = audio_fitted;
        this.cubic_cap = i;
        this.dialogValue = dialogValue;
        this.distance_run_in_quarter = i2;
        this.domain_cd = i3;
        this.fin_yr_sale_amt = i4;
        this.floor_area = i5;
        this.fuel = i6;
        this.gcw = i7;
        this.goods_to_carry = goods_to_carry;
        this.height = i8;
        this.hp = i9;
        this.imported_vch = imported_vch;
        this.issue_dt = issue_dt;
        this.jorney_purpose = jorney_purpose;
        this.ld_wt = i10;
        this.length = i11;
        this.listTaxModes = listTaxModes;
        this.no_adv_units = no_adv_units;
        this.no_cyl = i12;
        this.no_of_trips = i13;
        this.off_cd = i14;
        this.op_dt = op_dt;
        this.other_criteria = i15;
        this.parking = parking;
        this.pmt_catg = i16;
        this.pmt_no = pmt_no;
        this.pmt_type = i17;
        this.pur_cd = i18;
        this.pur_descr = pur_descr;
        this.purchase_dt = purchase_dt;
        this.rcpt_no = rcpt_no;
        this.region_covered = region_covered;
        this.regn_no = regn_no;
        this.regn_type = regn_type;
        this.remarks = remarks;
        this.renderForm = z;
        this.replace_date = replace_date;
        this.route_class = i19;
        this.route_length = i20;
        this.sale_amt = i21;
        this.seat_cap = i22;
        this.service_type = i23;
        this.sleeper_cap = i24;
        this.stand_cap = i25;
        this.state_cd = state_cd;
        this.taxBased = z2;
        this.unld_wt = i26;
        this.valid_from = valid_from;
        this.valid_upto = valid_upto;
        this.vch_catg = vch_catg;
        this.vch_purchase_as = vch_purchase_as;
        this.vh_class = i27;
        this.video_fitted = video_fitted;
        this.wheelbase = i28;
        this.width = i29;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TaxPurCdDesc copy$default(TaxPurCdDesc taxPurCdDesc, String str, String str2, String str3, int i, String str4, int i2, int i3, int i4, int i5, int i6, int i7, String str5, int i8, int i9, String str6, String str7, String str8, int i10, int i11, ArrayList arrayList, String str9, int i12, int i13, int i14, String str10, int i15, String str11, int i16, String str12, int i17, int i18, String str13, String str14, String str15, String str16, String str17, String str18, String str19, boolean z, String str20, int i19, int i20, int i21, int i22, int i23, int i24, int i25, String str21, boolean z2, a aVar, int i26, String str22, String str23, String str24, String str25, int i27, String str26, int i28, int i29, int i30, int i31, Object obj) {
        a aVar2;
        String str27 = (i30 & 1) != 0 ? taxPurCdDesc.ac_fitted : str;
        String str28 = (i30 & 2) != 0 ? taxPurCdDesc.appl_no : str2;
        String str29 = (i30 & 4) != 0 ? taxPurCdDesc.audio_fitted : str3;
        int i32 = (i30 & 8) != 0 ? taxPurCdDesc.cubic_cap : i;
        String str30 = (i30 & 16) != 0 ? taxPurCdDesc.dialogValue : str4;
        int i33 = (i30 & 32) != 0 ? taxPurCdDesc.distance_run_in_quarter : i2;
        int i34 = (i30 & 64) != 0 ? taxPurCdDesc.domain_cd : i3;
        int i35 = (i30 & 128) != 0 ? taxPurCdDesc.fin_yr_sale_amt : i4;
        int i36 = (i30 & 256) != 0 ? taxPurCdDesc.floor_area : i5;
        int i37 = (i30 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? taxPurCdDesc.fuel : i6;
        int i38 = (i30 & 1024) != 0 ? taxPurCdDesc.gcw : i7;
        String str31 = (i30 & 2048) != 0 ? taxPurCdDesc.goods_to_carry : str5;
        int i39 = (i30 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? taxPurCdDesc.height : i8;
        int i40 = (i30 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? taxPurCdDesc.hp : i9;
        String str32 = (i30 & 16384) != 0 ? taxPurCdDesc.imported_vch : str6;
        String str33 = (i30 & 32768) != 0 ? taxPurCdDesc.issue_dt : str7;
        String str34 = (i30 & 65536) != 0 ? taxPurCdDesc.jorney_purpose : str8;
        int i41 = (i30 & 131072) != 0 ? taxPurCdDesc.ld_wt : i10;
        int i42 = (i30 & 262144) != 0 ? taxPurCdDesc.length : i11;
        ArrayList arrayList2 = (i30 & 524288) != 0 ? taxPurCdDesc.listTaxModes : arrayList;
        String str35 = (i30 & 1048576) != 0 ? taxPurCdDesc.no_adv_units : str9;
        int i43 = (i30 & 2097152) != 0 ? taxPurCdDesc.no_cyl : i12;
        int i44 = (i30 & 4194304) != 0 ? taxPurCdDesc.no_of_trips : i13;
        int i45 = (i30 & 8388608) != 0 ? taxPurCdDesc.off_cd : i14;
        String str36 = (i30 & 16777216) != 0 ? taxPurCdDesc.op_dt : str10;
        int i46 = (i30 & 33554432) != 0 ? taxPurCdDesc.other_criteria : i15;
        String str37 = (i30 & 67108864) != 0 ? taxPurCdDesc.parking : str11;
        int i47 = (i30 & 134217728) != 0 ? taxPurCdDesc.pmt_catg : i16;
        String str38 = (i30 & 268435456) != 0 ? taxPurCdDesc.pmt_no : str12;
        int i48 = (i30 & 536870912) != 0 ? taxPurCdDesc.pmt_type : i17;
        int i49 = (i30 & 1073741824) != 0 ? taxPurCdDesc.pur_cd : i18;
        String str39 = (i30 & IntCompanionObject.MIN_VALUE) != 0 ? taxPurCdDesc.pur_descr : str13;
        String str40 = (i31 & 1) != 0 ? taxPurCdDesc.purchase_dt : str14;
        String str41 = (i31 & 2) != 0 ? taxPurCdDesc.rcpt_no : str15;
        String str42 = (i31 & 4) != 0 ? taxPurCdDesc.region_covered : str16;
        String str43 = (i31 & 8) != 0 ? taxPurCdDesc.regn_no : str17;
        String str44 = (i31 & 16) != 0 ? taxPurCdDesc.regn_type : str18;
        String str45 = (i31 & 32) != 0 ? taxPurCdDesc.remarks : str19;
        boolean z3 = (i31 & 64) != 0 ? taxPurCdDesc.renderForm : z;
        String str46 = (i31 & 128) != 0 ? taxPurCdDesc.replace_date : str20;
        int i50 = (i31 & 256) != 0 ? taxPurCdDesc.route_class : i19;
        int i51 = (i31 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? taxPurCdDesc.route_length : i20;
        int i52 = (i31 & 1024) != 0 ? taxPurCdDesc.sale_amt : i21;
        int i53 = (i31 & 2048) != 0 ? taxPurCdDesc.seat_cap : i22;
        int i54 = (i31 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? taxPurCdDesc.service_type : i23;
        int i55 = (i31 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? taxPurCdDesc.sleeper_cap : i24;
        int i56 = (i31 & 16384) != 0 ? taxPurCdDesc.stand_cap : i25;
        String str47 = (i31 & 32768) != 0 ? taxPurCdDesc.state_cd : str21;
        boolean z4 = (i31 & 65536) != 0 ? taxPurCdDesc.taxBased : z2;
        if ((i31 & 131072) != 0) {
            taxPurCdDesc.getClass();
            aVar2 = null;
        } else {
            aVar2 = aVar;
        }
        return taxPurCdDesc.copy(str27, str28, str29, i32, str30, i33, i34, i35, i36, i37, i38, str31, i39, i40, str32, str33, str34, i41, i42, arrayList2, str35, i43, i44, i45, str36, i46, str37, i47, str38, i48, i49, str39, str40, str41, str42, str43, str44, str45, z3, str46, i50, i51, i52, i53, i54, i55, i56, str47, z4, aVar2, (i31 & 262144) != 0 ? taxPurCdDesc.unld_wt : i26, (i31 & 524288) != 0 ? taxPurCdDesc.valid_from : str22, (i31 & 1048576) != 0 ? taxPurCdDesc.valid_upto : str23, (i31 & 2097152) != 0 ? taxPurCdDesc.vch_catg : str24, (i31 & 4194304) != 0 ? taxPurCdDesc.vch_purchase_as : str25, (i31 & 8388608) != 0 ? taxPurCdDesc.vh_class : i27, (i31 & 16777216) != 0 ? taxPurCdDesc.video_fitted : str26, (i31 & 33554432) != 0 ? taxPurCdDesc.wheelbase : i28, (i31 & 67108864) != 0 ? taxPurCdDesc.width : i29);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAc_fitted() {
        return this.ac_fitted;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getFuel() {
        return this.fuel;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getGcw() {
        return this.gcw;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getGoods_to_carry() {
        return this.goods_to_carry;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getHp() {
        return this.hp;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getImported_vch() {
        return this.imported_vch;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getIssue_dt() {
        return this.issue_dt;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getJorney_purpose() {
        return this.jorney_purpose;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getLd_wt() {
        return this.ld_wt;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getLength() {
        return this.length;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAppl_no() {
        return this.appl_no;
    }

    public final ArrayList<Object> component20() {
        return this.listTaxModes;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getNo_adv_units() {
        return this.no_adv_units;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final int getNo_cyl() {
        return this.no_cyl;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final int getNo_of_trips() {
        return this.no_of_trips;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final int getOff_cd() {
        return this.off_cd;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getOp_dt() {
        return this.op_dt;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final int getOther_criteria() {
        return this.other_criteria;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getParking() {
        return this.parking;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final int getPmt_catg() {
        return this.pmt_catg;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getPmt_no() {
        return this.pmt_no;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAudio_fitted() {
        return this.audio_fitted;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final int getPmt_type() {
        return this.pmt_type;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final int getPur_cd() {
        return this.pur_cd;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getPur_descr() {
        return this.pur_descr;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getPurchase_dt() {
        return this.purchase_dt;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final String getRcpt_no() {
        return this.rcpt_no;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final String getRegion_covered() {
        return this.region_covered;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final String getRegn_no() {
        return this.regn_no;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final String getRegn_type() {
        return this.regn_type;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final String getRemarks() {
        return this.remarks;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final boolean getRenderForm() {
        return this.renderForm;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getCubic_cap() {
        return this.cubic_cap;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final String getReplace_date() {
        return this.replace_date;
    }

    /* JADX INFO: renamed from: component41, reason: from getter */
    public final int getRoute_class() {
        return this.route_class;
    }

    /* JADX INFO: renamed from: component42, reason: from getter */
    public final int getRoute_length() {
        return this.route_length;
    }

    /* JADX INFO: renamed from: component43, reason: from getter */
    public final int getSale_amt() {
        return this.sale_amt;
    }

    /* JADX INFO: renamed from: component44, reason: from getter */
    public final int getSeat_cap() {
        return this.seat_cap;
    }

    /* JADX INFO: renamed from: component45, reason: from getter */
    public final int getService_type() {
        return this.service_type;
    }

    /* JADX INFO: renamed from: component46, reason: from getter */
    public final int getSleeper_cap() {
        return this.sleeper_cap;
    }

    /* JADX INFO: renamed from: component47, reason: from getter */
    public final int getStand_cap() {
        return this.stand_cap;
    }

    /* JADX INFO: renamed from: component48, reason: from getter */
    public final String getState_cd() {
        return this.state_cd;
    }

    /* JADX INFO: renamed from: component49, reason: from getter */
    public final boolean getTaxBased() {
        return this.taxBased;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDialogValue() {
        return this.dialogValue;
    }

    public final a component50() {
        return null;
    }

    /* JADX INFO: renamed from: component51, reason: from getter */
    public final int getUnld_wt() {
        return this.unld_wt;
    }

    /* JADX INFO: renamed from: component52, reason: from getter */
    public final String getValid_from() {
        return this.valid_from;
    }

    /* JADX INFO: renamed from: component53, reason: from getter */
    public final String getValid_upto() {
        return this.valid_upto;
    }

    /* JADX INFO: renamed from: component54, reason: from getter */
    public final String getVch_catg() {
        return this.vch_catg;
    }

    /* JADX INFO: renamed from: component55, reason: from getter */
    public final String getVch_purchase_as() {
        return this.vch_purchase_as;
    }

    /* JADX INFO: renamed from: component56, reason: from getter */
    public final int getVh_class() {
        return this.vh_class;
    }

    /* JADX INFO: renamed from: component57, reason: from getter */
    public final String getVideo_fitted() {
        return this.video_fitted;
    }

    /* JADX INFO: renamed from: component58, reason: from getter */
    public final int getWheelbase() {
        return this.wheelbase;
    }

    /* JADX INFO: renamed from: component59, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getDistance_run_in_quarter() {
        return this.distance_run_in_quarter;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getDomain_cd() {
        return this.domain_cd;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getFin_yr_sale_amt() {
        return this.fin_yr_sale_amt;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getFloor_area() {
        return this.floor_area;
    }

    public final TaxPurCdDesc copy(String ac_fitted, String appl_no, String audio_fitted, int cubic_cap, String dialogValue, int distance_run_in_quarter, int domain_cd, int fin_yr_sale_amt, int floor_area, int fuel, int gcw, String goods_to_carry, int height, int hp, String imported_vch, String issue_dt, String jorney_purpose, int ld_wt, int length, ArrayList<Object> listTaxModes, String no_adv_units, int no_cyl, int no_of_trips, int off_cd, String op_dt, int other_criteria, String parking, int pmt_catg, String pmt_no, int pmt_type, int pur_cd, String pur_descr, String purchase_dt, String rcpt_no, String region_covered, String regn_no, String regn_type, String remarks, boolean renderForm, String replace_date, int route_class, int route_length, int sale_amt, int seat_cap, int service_type, int sleeper_cap, int stand_cap, String state_cd, boolean taxBased, a taxPurCdDescr, int unld_wt, String valid_from, String valid_upto, String vch_catg, String vch_purchase_as, int vh_class, String video_fitted, int wheelbase, int width) {
        Intrinsics.checkNotNullParameter(ac_fitted, "ac_fitted");
        Intrinsics.checkNotNullParameter(appl_no, "appl_no");
        Intrinsics.checkNotNullParameter(audio_fitted, "audio_fitted");
        Intrinsics.checkNotNullParameter(dialogValue, "dialogValue");
        Intrinsics.checkNotNullParameter(goods_to_carry, "goods_to_carry");
        Intrinsics.checkNotNullParameter(imported_vch, "imported_vch");
        Intrinsics.checkNotNullParameter(issue_dt, "issue_dt");
        Intrinsics.checkNotNullParameter(jorney_purpose, "jorney_purpose");
        Intrinsics.checkNotNullParameter(listTaxModes, "listTaxModes");
        Intrinsics.checkNotNullParameter(no_adv_units, "no_adv_units");
        Intrinsics.checkNotNullParameter(op_dt, "op_dt");
        Intrinsics.checkNotNullParameter(parking, "parking");
        Intrinsics.checkNotNullParameter(pmt_no, "pmt_no");
        Intrinsics.checkNotNullParameter(pur_descr, "pur_descr");
        Intrinsics.checkNotNullParameter(purchase_dt, "purchase_dt");
        Intrinsics.checkNotNullParameter(rcpt_no, "rcpt_no");
        Intrinsics.checkNotNullParameter(region_covered, "region_covered");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(regn_type, "regn_type");
        Intrinsics.checkNotNullParameter(remarks, "remarks");
        Intrinsics.checkNotNullParameter(replace_date, "replace_date");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(taxPurCdDescr, "taxPurCdDescr");
        Intrinsics.checkNotNullParameter(valid_from, "valid_from");
        Intrinsics.checkNotNullParameter(valid_upto, "valid_upto");
        Intrinsics.checkNotNullParameter(vch_catg, "vch_catg");
        Intrinsics.checkNotNullParameter(vch_purchase_as, "vch_purchase_as");
        Intrinsics.checkNotNullParameter(video_fitted, "video_fitted");
        return new TaxPurCdDesc(ac_fitted, appl_no, audio_fitted, cubic_cap, dialogValue, distance_run_in_quarter, domain_cd, fin_yr_sale_amt, floor_area, fuel, gcw, goods_to_carry, height, hp, imported_vch, issue_dt, jorney_purpose, ld_wt, length, listTaxModes, no_adv_units, no_cyl, no_of_trips, off_cd, op_dt, other_criteria, parking, pmt_catg, pmt_no, pmt_type, pur_cd, pur_descr, purchase_dt, rcpt_no, region_covered, regn_no, regn_type, remarks, renderForm, replace_date, route_class, route_length, sale_amt, seat_cap, service_type, sleeper_cap, stand_cap, state_cd, taxBased, taxPurCdDescr, unld_wt, valid_from, valid_upto, vch_catg, vch_purchase_as, vh_class, video_fitted, wheelbase, width);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaxPurCdDesc)) {
            return false;
        }
        TaxPurCdDesc taxPurCdDesc = (TaxPurCdDesc) other;
        return Intrinsics.areEqual(this.ac_fitted, taxPurCdDesc.ac_fitted) && Intrinsics.areEqual(this.appl_no, taxPurCdDesc.appl_no) && Intrinsics.areEqual(this.audio_fitted, taxPurCdDesc.audio_fitted) && this.cubic_cap == taxPurCdDesc.cubic_cap && Intrinsics.areEqual(this.dialogValue, taxPurCdDesc.dialogValue) && this.distance_run_in_quarter == taxPurCdDesc.distance_run_in_quarter && this.domain_cd == taxPurCdDesc.domain_cd && this.fin_yr_sale_amt == taxPurCdDesc.fin_yr_sale_amt && this.floor_area == taxPurCdDesc.floor_area && this.fuel == taxPurCdDesc.fuel && this.gcw == taxPurCdDesc.gcw && Intrinsics.areEqual(this.goods_to_carry, taxPurCdDesc.goods_to_carry) && this.height == taxPurCdDesc.height && this.hp == taxPurCdDesc.hp && Intrinsics.areEqual(this.imported_vch, taxPurCdDesc.imported_vch) && Intrinsics.areEqual(this.issue_dt, taxPurCdDesc.issue_dt) && Intrinsics.areEqual(this.jorney_purpose, taxPurCdDesc.jorney_purpose) && this.ld_wt == taxPurCdDesc.ld_wt && this.length == taxPurCdDesc.length && Intrinsics.areEqual(this.listTaxModes, taxPurCdDesc.listTaxModes) && Intrinsics.areEqual(this.no_adv_units, taxPurCdDesc.no_adv_units) && this.no_cyl == taxPurCdDesc.no_cyl && this.no_of_trips == taxPurCdDesc.no_of_trips && this.off_cd == taxPurCdDesc.off_cd && Intrinsics.areEqual(this.op_dt, taxPurCdDesc.op_dt) && this.other_criteria == taxPurCdDesc.other_criteria && Intrinsics.areEqual(this.parking, taxPurCdDesc.parking) && this.pmt_catg == taxPurCdDesc.pmt_catg && Intrinsics.areEqual(this.pmt_no, taxPurCdDesc.pmt_no) && this.pmt_type == taxPurCdDesc.pmt_type && this.pur_cd == taxPurCdDesc.pur_cd && Intrinsics.areEqual(this.pur_descr, taxPurCdDesc.pur_descr) && Intrinsics.areEqual(this.purchase_dt, taxPurCdDesc.purchase_dt) && Intrinsics.areEqual(this.rcpt_no, taxPurCdDesc.rcpt_no) && Intrinsics.areEqual(this.region_covered, taxPurCdDesc.region_covered) && Intrinsics.areEqual(this.regn_no, taxPurCdDesc.regn_no) && Intrinsics.areEqual(this.regn_type, taxPurCdDesc.regn_type) && Intrinsics.areEqual(this.remarks, taxPurCdDesc.remarks) && this.renderForm == taxPurCdDesc.renderForm && Intrinsics.areEqual(this.replace_date, taxPurCdDesc.replace_date) && this.route_class == taxPurCdDesc.route_class && this.route_length == taxPurCdDesc.route_length && this.sale_amt == taxPurCdDesc.sale_amt && this.seat_cap == taxPurCdDesc.seat_cap && this.service_type == taxPurCdDesc.service_type && this.sleeper_cap == taxPurCdDesc.sleeper_cap && this.stand_cap == taxPurCdDesc.stand_cap && Intrinsics.areEqual(this.state_cd, taxPurCdDesc.state_cd) && this.taxBased == taxPurCdDesc.taxBased && Intrinsics.areEqual((Object) null, (Object) null) && this.unld_wt == taxPurCdDesc.unld_wt && Intrinsics.areEqual(this.valid_from, taxPurCdDesc.valid_from) && Intrinsics.areEqual(this.valid_upto, taxPurCdDesc.valid_upto) && Intrinsics.areEqual(this.vch_catg, taxPurCdDesc.vch_catg) && Intrinsics.areEqual(this.vch_purchase_as, taxPurCdDesc.vch_purchase_as) && this.vh_class == taxPurCdDesc.vh_class && Intrinsics.areEqual(this.video_fitted, taxPurCdDesc.video_fitted) && this.wheelbase == taxPurCdDesc.wheelbase && this.width == taxPurCdDesc.width;
    }

    public final String getAc_fitted() {
        return this.ac_fitted;
    }

    public final String getAppl_no() {
        return this.appl_no;
    }

    public final String getAudio_fitted() {
        return this.audio_fitted;
    }

    public final int getCubic_cap() {
        return this.cubic_cap;
    }

    public final String getDialogValue() {
        return this.dialogValue;
    }

    public final int getDistance_run_in_quarter() {
        return this.distance_run_in_quarter;
    }

    public final int getDomain_cd() {
        return this.domain_cd;
    }

    public final int getFin_yr_sale_amt() {
        return this.fin_yr_sale_amt;
    }

    public final int getFloor_area() {
        return this.floor_area;
    }

    public final int getFuel() {
        return this.fuel;
    }

    public final int getGcw() {
        return this.gcw;
    }

    public final String getGoods_to_carry() {
        return this.goods_to_carry;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getHp() {
        return this.hp;
    }

    public final String getImported_vch() {
        return this.imported_vch;
    }

    public final String getIssue_dt() {
        return this.issue_dt;
    }

    public final String getJorney_purpose() {
        return this.jorney_purpose;
    }

    public final int getLd_wt() {
        return this.ld_wt;
    }

    public final int getLength() {
        return this.length;
    }

    public final ArrayList<Object> getListTaxModes() {
        return this.listTaxModes;
    }

    public final String getNo_adv_units() {
        return this.no_adv_units;
    }

    public final int getNo_cyl() {
        return this.no_cyl;
    }

    public final int getNo_of_trips() {
        return this.no_of_trips;
    }

    public final int getOff_cd() {
        return this.off_cd;
    }

    public final String getOp_dt() {
        return this.op_dt;
    }

    public final int getOther_criteria() {
        return this.other_criteria;
    }

    public final String getParking() {
        return this.parking;
    }

    public final int getPmt_catg() {
        return this.pmt_catg;
    }

    public final String getPmt_no() {
        return this.pmt_no;
    }

    public final int getPmt_type() {
        return this.pmt_type;
    }

    public final int getPur_cd() {
        return this.pur_cd;
    }

    public final String getPur_descr() {
        return this.pur_descr;
    }

    public final String getPurchase_dt() {
        return this.purchase_dt;
    }

    public final String getRcpt_no() {
        return this.rcpt_no;
    }

    public final String getRegion_covered() {
        return this.region_covered;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final String getRegn_type() {
        return this.regn_type;
    }

    public final String getRemarks() {
        return this.remarks;
    }

    public final boolean getRenderForm() {
        return this.renderForm;
    }

    public final String getReplace_date() {
        return this.replace_date;
    }

    public final int getRoute_class() {
        return this.route_class;
    }

    public final int getRoute_length() {
        return this.route_length;
    }

    public final int getSale_amt() {
        return this.sale_amt;
    }

    public final int getSeat_cap() {
        return this.seat_cap;
    }

    public final int getService_type() {
        return this.service_type;
    }

    public final int getSleeper_cap() {
        return this.sleeper_cap;
    }

    public final int getStand_cap() {
        return this.stand_cap;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public final boolean getTaxBased() {
        return this.taxBased;
    }

    public final a getTaxPurCdDescr() {
        return null;
    }

    public final int getUnld_wt() {
        return this.unld_wt;
    }

    public final String getValid_from() {
        return this.valid_from;
    }

    public final String getValid_upto() {
        return this.valid_upto;
    }

    public final String getVch_catg() {
        return this.vch_catg;
    }

    public final String getVch_purchase_as() {
        return this.vch_purchase_as;
    }

    public final int getVh_class() {
        return this.vh_class;
    }

    public final String getVideo_fitted() {
        return this.video_fitted;
    }

    public final int getWheelbase() {
        return this.wheelbase;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        this.ac_fitted.hashCode();
        this.appl_no.hashCode();
        this.audio_fitted.hashCode();
        Integer.hashCode(this.cubic_cap);
        this.dialogValue.hashCode();
        Integer.hashCode(this.distance_run_in_quarter);
        Integer.hashCode(this.domain_cd);
        Integer.hashCode(this.fin_yr_sale_amt);
        Integer.hashCode(this.floor_area);
        Integer.hashCode(this.fuel);
        Integer.hashCode(this.gcw);
        this.goods_to_carry.hashCode();
        Integer.hashCode(this.height);
        Integer.hashCode(this.hp);
        this.imported_vch.hashCode();
        this.issue_dt.hashCode();
        this.jorney_purpose.hashCode();
        Integer.hashCode(this.ld_wt);
        Integer.hashCode(this.length);
        this.listTaxModes.hashCode();
        this.no_adv_units.hashCode();
        Integer.hashCode(this.no_cyl);
        Integer.hashCode(this.no_of_trips);
        Integer.hashCode(this.off_cd);
        this.op_dt.hashCode();
        Integer.hashCode(this.other_criteria);
        this.parking.hashCode();
        Integer.hashCode(this.pmt_catg);
        this.pmt_no.hashCode();
        Integer.hashCode(this.pmt_type);
        Integer.hashCode(this.pur_cd);
        this.pur_descr.hashCode();
        this.purchase_dt.hashCode();
        this.rcpt_no.hashCode();
        this.region_covered.hashCode();
        this.regn_no.hashCode();
        this.regn_type.hashCode();
        this.remarks.hashCode();
        this.replace_date.hashCode();
        Integer.hashCode(this.route_class);
        Integer.hashCode(this.route_length);
        Integer.hashCode(this.sale_amt);
        Integer.hashCode(this.seat_cap);
        Integer.hashCode(this.service_type);
        Integer.hashCode(this.sleeper_cap);
        Integer.hashCode(this.stand_cap);
        this.state_cd.hashCode();
        throw null;
    }

    public String toString() {
        return "TaxPurCdDesc(ac_fitted=" + this.ac_fitted + ", appl_no=" + this.appl_no + ", audio_fitted=" + this.audio_fitted + ", cubic_cap=" + this.cubic_cap + ", dialogValue=" + this.dialogValue + ", distance_run_in_quarter=" + this.distance_run_in_quarter + ", domain_cd=" + this.domain_cd + ", fin_yr_sale_amt=" + this.fin_yr_sale_amt + ", floor_area=" + this.floor_area + ", fuel=" + this.fuel + ", gcw=" + this.gcw + ", goods_to_carry=" + this.goods_to_carry + ", height=" + this.height + ", hp=" + this.hp + ", imported_vch=" + this.imported_vch + ", issue_dt=" + this.issue_dt + ", jorney_purpose=" + this.jorney_purpose + ", ld_wt=" + this.ld_wt + ", length=" + this.length + ", listTaxModes=" + this.listTaxModes + ", no_adv_units=" + this.no_adv_units + ", no_cyl=" + this.no_cyl + ", no_of_trips=" + this.no_of_trips + ", off_cd=" + this.off_cd + ", op_dt=" + this.op_dt + ", other_criteria=" + this.other_criteria + ", parking=" + this.parking + ", pmt_catg=" + this.pmt_catg + ", pmt_no=" + this.pmt_no + ", pmt_type=" + this.pmt_type + ", pur_cd=" + this.pur_cd + ", pur_descr=" + this.pur_descr + ", purchase_dt=" + this.purchase_dt + ", rcpt_no=" + this.rcpt_no + ", region_covered=" + this.region_covered + ", regn_no=" + this.regn_no + ", regn_type=" + this.regn_type + ", remarks=" + this.remarks + ", renderForm=" + this.renderForm + ", replace_date=" + this.replace_date + ", route_class=" + this.route_class + ", route_length=" + this.route_length + ", sale_amt=" + this.sale_amt + ", seat_cap=" + this.seat_cap + ", service_type=" + this.service_type + ", sleeper_cap=" + this.sleeper_cap + ", stand_cap=" + this.stand_cap + ", state_cd=" + this.state_cd + ", taxBased=" + this.taxBased + ", taxPurCdDescr=" + ((Object) null) + ", unld_wt=" + this.unld_wt + ", valid_from=" + this.valid_from + ", valid_upto=" + this.valid_upto + ", vch_catg=" + this.vch_catg + ", vch_purchase_as=" + this.vch_purchase_as + ", vh_class=" + this.vh_class + ", video_fitted=" + this.video_fitted + ", wheelbase=" + this.wheelbase + ", width=" + this.width + ')';
    }
}
