package com.nic.mparivahan.Tax.Model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\bC\n\u0002\u0010\u000b\n\u0002\bX\b\u0087\b\u0018\u00002\u00020\u0001BË\u0003\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0002\u0012\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013\u0012\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u0006¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000b\u0010\bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013HÆ\u0003J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\bJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000eJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010\bJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b#\u0010\bJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b$\u0010\bJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b%\u0010\bJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b&\u0010\bJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b'\u0010\bJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b(\u0010\bJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b)\u0010\bJ\u000b\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b+\u0010\bJ\u0012\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b,\u0010\bJØ\u0003\u0010R\u001a\u00020\u00002\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00104\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u00109\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\u000e\b\u0002\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\bR\u0010SJ\t\u0010T\u001a\u00020\u0002HÖ\u0001J\t\u0010U\u001a\u00020\fHÖ\u0001J\u0013\u0010X\u001a\u00020W2\b\u0010V\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010-\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R$\u0010.\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010Y\u001a\u0004\b^\u0010[\"\u0004\b_\u0010]R$\u0010/\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010Y\u001a\u0004\b`\u0010[\"\u0004\ba\u0010]R$\u00100\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010b\u001a\u0004\bc\u0010\b\"\u0004\bd\u0010eR$\u00101\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010Y\u001a\u0004\bf\u0010[\"\u0004\bg\u0010]R$\u00102\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010Y\u001a\u0004\bh\u0010[\"\u0004\bi\u0010]R$\u00103\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010b\u001a\u0004\bj\u0010\b\"\u0004\bk\u0010eR$\u00104\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010l\u001a\u0004\bm\u0010\u000e\"\u0004\bn\u0010oR$\u00105\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010Y\u001a\u0004\bp\u0010[\"\u0004\bq\u0010]R$\u00106\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010Y\u001a\u0004\br\u0010[\"\u0004\bs\u0010]R$\u00107\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010Y\u001a\u0004\bt\u0010[\"\u0004\bu\u0010]R$\u00108\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010Y\u001a\u0004\bv\u0010[\"\u0004\bw\u0010]R(\u00109\u001a\b\u0012\u0004\u0012\u00020\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R$\u0010:\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010b\u001a\u0004\b}\u0010\b\"\u0004\b~\u0010eR%\u0010;\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\b;\u0010l\u001a\u0004\b\u007f\u0010\u000e\"\u0005\b\u0080\u0001\u0010oR&\u0010<\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b<\u0010Y\u001a\u0005\b\u0081\u0001\u0010[\"\u0005\b\u0082\u0001\u0010]R&\u0010=\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b=\u0010Y\u001a\u0005\b\u0083\u0001\u0010[\"\u0005\b\u0084\u0001\u0010]R&\u0010>\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b>\u0010Y\u001a\u0005\b\u0085\u0001\u0010[\"\u0005\b\u0086\u0001\u0010]R&\u0010?\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b?\u0010Y\u001a\u0005\b\u0087\u0001\u0010[\"\u0005\b\u0088\u0001\u0010]R&\u0010@\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b@\u0010Y\u001a\u0005\b\u0089\u0001\u0010[\"\u0005\b\u008a\u0001\u0010]R&\u0010A\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bA\u0010Y\u001a\u0005\b\u008b\u0001\u0010[\"\u0005\b\u008c\u0001\u0010]R*\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bB\u0010x\u001a\u0005\b\u008d\u0001\u0010z\"\u0005\b\u008e\u0001\u0010|R*\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bC\u0010x\u001a\u0005\b\u008f\u0001\u0010z\"\u0005\b\u0090\u0001\u0010|R&\u0010D\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bD\u0010Y\u001a\u0005\b\u0091\u0001\u0010[\"\u0005\b\u0092\u0001\u0010]R&\u0010E\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bE\u0010Y\u001a\u0005\b\u0093\u0001\u0010[\"\u0005\b\u0094\u0001\u0010]R&\u0010F\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bF\u0010Y\u001a\u0005\b\u0095\u0001\u0010[\"\u0005\b\u0096\u0001\u0010]R&\u0010G\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bG\u0010b\u001a\u0005\b\u0097\u0001\u0010\b\"\u0005\b\u0098\u0001\u0010eR&\u0010H\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bH\u0010b\u001a\u0005\b\u0099\u0001\u0010\b\"\u0005\b\u009a\u0001\u0010eR&\u0010I\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bI\u0010b\u001a\u0005\b\u009b\u0001\u0010\b\"\u0005\b\u009c\u0001\u0010eR&\u0010J\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bJ\u0010b\u001a\u0005\b\u009d\u0001\u0010\b\"\u0005\b\u009e\u0001\u0010eR&\u0010K\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bK\u0010b\u001a\u0005\b\u009f\u0001\u0010\b\"\u0005\b \u0001\u0010eR&\u0010L\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bL\u0010b\u001a\u0005\b¡\u0001\u0010\b\"\u0005\b¢\u0001\u0010eR&\u0010M\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bM\u0010b\u001a\u0005\b£\u0001\u0010\b\"\u0005\b¤\u0001\u0010eR&\u0010N\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bN\u0010b\u001a\u0005\b¥\u0001\u0010\b\"\u0005\b¦\u0001\u0010eR&\u0010O\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bO\u0010Y\u001a\u0005\b§\u0001\u0010[\"\u0005\b¨\u0001\u0010]R&\u0010P\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bP\u0010b\u001a\u0005\b©\u0001\u0010\b\"\u0005\bª\u0001\u0010eR&\u0010Q\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bQ\u0010b\u001a\u0005\b«\u0001\u0010\b\"\u0005\b¬\u0001\u0010e¨\u0006¯\u0001"}, d2 = {"Lcom/nic/mparivahan/Tax/Model/Beforepayment;", "", "", "component1", "component2", "component3", "", "component4", "()Ljava/lang/Double;", "component5", "component6", "component7", "", "component8", "()Ljava/lang/Integer;", "component9", "component10", "component11", "component12", "", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "applNo", "appl_no", "deal_cd", "finalTaxAmount", "finalTaxFrom", "finalTaxUpto", "no_adv_units", "off_cd", "op_dt", "ownerName", "payMode", "paymentMode", "paymntCollectionBean", "previousAdjustment", "pur_cd", "rcptDate", "rcptNo", "rcpt_dt", "regnNo", "state_cd", "status", "taxBreakDetails", "taxGroupDetails", "taxMode", "taxPurcdDesc", "taxhead", "totalAmount", "totalPaybaleInterest", "totalPaybalePenalty", "totalPaybaleRebate", "totalPaybaleSurcharge", "totalPaybaleTax", "totalPaybaleTax1", "totalPaybaleTax2", "userID", "vtTaxFinalFine", "vtTaxFinalTax", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)Lcom/nic/mparivahan/Tax/Model/Beforepayment;", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getApplNo", "()Ljava/lang/String;", "setApplNo", "(Ljava/lang/String;)V", "getAppl_no", "setAppl_no", "getDeal_cd", "setDeal_cd", "Ljava/lang/Double;", "getFinalTaxAmount", "setFinalTaxAmount", "(Ljava/lang/Double;)V", "getFinalTaxFrom", "setFinalTaxFrom", "getFinalTaxUpto", "setFinalTaxUpto", "getNo_adv_units", "setNo_adv_units", "Ljava/lang/Integer;", "getOff_cd", "setOff_cd", "(Ljava/lang/Integer;)V", "getOp_dt", "setOp_dt", "getOwnerName", "setOwnerName", "getPayMode", "setPayMode", "getPaymentMode", "setPaymentMode", "Ljava/util/List;", "getPaymntCollectionBean", "()Ljava/util/List;", "setPaymntCollectionBean", "(Ljava/util/List;)V", "getPreviousAdjustment", "setPreviousAdjustment", "getPur_cd", "setPur_cd", "getRcptDate", "setRcptDate", "getRcptNo", "setRcptNo", "getRcpt_dt", "setRcpt_dt", "getRegnNo", "setRegnNo", "getState_cd", "setState_cd", "getStatus", "setStatus", "getTaxBreakDetails", "setTaxBreakDetails", "getTaxGroupDetails", "setTaxGroupDetails", "getTaxMode", "setTaxMode", "getTaxPurcdDesc", "setTaxPurcdDesc", "getTaxhead", "setTaxhead", "getTotalAmount", "setTotalAmount", "getTotalPaybaleInterest", "setTotalPaybaleInterest", "getTotalPaybalePenalty", "setTotalPaybalePenalty", "getTotalPaybaleRebate", "setTotalPaybaleRebate", "getTotalPaybaleSurcharge", "setTotalPaybaleSurcharge", "getTotalPaybaleTax", "setTotalPaybaleTax", "getTotalPaybaleTax1", "setTotalPaybaleTax1", "getTotalPaybaleTax2", "setTotalPaybaleTax2", "getUserID", "setUserID", "getVtTaxFinalFine", "setVtTaxFinalFine", "getVtTaxFinalTax", "setVtTaxFinalTax", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V", "app_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class Beforepayment {
    private String applNo;
    private String appl_no;
    private String deal_cd;
    private Double finalTaxAmount;
    private String finalTaxFrom;
    private String finalTaxUpto;
    private Double no_adv_units;
    private Integer off_cd;
    private String op_dt;
    private String ownerName;
    private String payMode;
    private String paymentMode;
    private List<Object> paymntCollectionBean;
    private Double previousAdjustment;
    private Integer pur_cd;
    private String rcptDate;
    private String rcptNo;
    private String rcpt_dt;
    private String regnNo;
    private String state_cd;
    private String status;
    private List<Object> taxBreakDetails;
    private List<Object> taxGroupDetails;
    private String taxMode;
    private String taxPurcdDesc;
    private String taxhead;
    private Double totalAmount;
    private Double totalPaybaleInterest;
    private Double totalPaybalePenalty;
    private Double totalPaybaleRebate;
    private Double totalPaybaleSurcharge;
    private Double totalPaybaleTax;
    private Double totalPaybaleTax1;
    private Double totalPaybaleTax2;
    private String userID;
    private Double vtTaxFinalFine;
    private Double vtTaxFinalTax;

    public Beforepayment(String str, String str2, String str3, Double d, String str4, String str5, Double d2, Integer num, String str6, String str7, String str8, String str9, List<Object> paymntCollectionBean, Double d3, Integer num2, String str10, String str11, String str12, String str13, String str14, String str15, List<Object> taxBreakDetails, List<Object> taxGroupDetails, String str16, String str17, String str18, Double d4, Double d5, Double d6, Double d7, Double d8, Double d9, Double d10, Double d11, String str19, Double d12, Double d13) {
        Intrinsics.checkNotNullParameter(paymntCollectionBean, "paymntCollectionBean");
        Intrinsics.checkNotNullParameter(taxBreakDetails, "taxBreakDetails");
        Intrinsics.checkNotNullParameter(taxGroupDetails, "taxGroupDetails");
        this.applNo = str;
        this.appl_no = str2;
        this.deal_cd = str3;
        this.finalTaxAmount = d;
        this.finalTaxFrom = str4;
        this.finalTaxUpto = str5;
        this.no_adv_units = d2;
        this.off_cd = num;
        this.op_dt = str6;
        this.ownerName = str7;
        this.payMode = str8;
        this.paymentMode = str9;
        this.paymntCollectionBean = paymntCollectionBean;
        this.previousAdjustment = d3;
        this.pur_cd = num2;
        this.rcptDate = str10;
        this.rcptNo = str11;
        this.rcpt_dt = str12;
        this.regnNo = str13;
        this.state_cd = str14;
        this.status = str15;
        this.taxBreakDetails = taxBreakDetails;
        this.taxGroupDetails = taxGroupDetails;
        this.taxMode = str16;
        this.taxPurcdDesc = str17;
        this.taxhead = str18;
        this.totalAmount = d4;
        this.totalPaybaleInterest = d5;
        this.totalPaybalePenalty = d6;
        this.totalPaybaleRebate = d7;
        this.totalPaybaleSurcharge = d8;
        this.totalPaybaleTax = d9;
        this.totalPaybaleTax1 = d10;
        this.totalPaybaleTax2 = d11;
        this.userID = str19;
        this.vtTaxFinalFine = d12;
        this.vtTaxFinalTax = d13;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApplNo() {
        return this.applNo;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getOwnerName() {
        return this.ownerName;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getPayMode() {
        return this.payMode;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getPaymentMode() {
        return this.paymentMode;
    }

    public final List<Object> component13() {
        return this.paymntCollectionBean;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Double getPreviousAdjustment() {
        return this.previousAdjustment;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Integer getPur_cd() {
        return this.pur_cd;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getRcptDate() {
        return this.rcptDate;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getRcptNo() {
        return this.rcptNo;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getRcpt_dt() {
        return this.rcpt_dt;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getRegnNo() {
        return this.regnNo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAppl_no() {
        return this.appl_no;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getState_cd() {
        return this.state_cd;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final List<Object> component22() {
        return this.taxBreakDetails;
    }

    public final List<Object> component23() {
        return this.taxGroupDetails;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getTaxMode() {
        return this.taxMode;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getTaxPurcdDesc() {
        return this.taxPurcdDesc;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getTaxhead() {
        return this.taxhead;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final Double getTotalAmount() {
        return this.totalAmount;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final Double getTotalPaybaleInterest() {
        return this.totalPaybaleInterest;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final Double getTotalPaybalePenalty() {
        return this.totalPaybalePenalty;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDeal_cd() {
        return this.deal_cd;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final Double getTotalPaybaleRebate() {
        return this.totalPaybaleRebate;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final Double getTotalPaybaleSurcharge() {
        return this.totalPaybaleSurcharge;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final Double getTotalPaybaleTax() {
        return this.totalPaybaleTax;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final Double getTotalPaybaleTax1() {
        return this.totalPaybaleTax1;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final Double getTotalPaybaleTax2() {
        return this.totalPaybaleTax2;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final String getUserID() {
        return this.userID;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final Double getVtTaxFinalFine() {
        return this.vtTaxFinalFine;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final Double getVtTaxFinalTax() {
        return this.vtTaxFinalTax;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getFinalTaxAmount() {
        return this.finalTaxAmount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFinalTaxFrom() {
        return this.finalTaxFrom;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFinalTaxUpto() {
        return this.finalTaxUpto;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Double getNo_adv_units() {
        return this.no_adv_units;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getOff_cd() {
        return this.off_cd;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getOp_dt() {
        return this.op_dt;
    }

    public final Beforepayment copy(String applNo, String appl_no, String deal_cd, Double finalTaxAmount, String finalTaxFrom, String finalTaxUpto, Double no_adv_units, Integer off_cd, String op_dt, String ownerName, String payMode, String paymentMode, List<Object> paymntCollectionBean, Double previousAdjustment, Integer pur_cd, String rcptDate, String rcptNo, String rcpt_dt, String regnNo, String state_cd, String status, List<Object> taxBreakDetails, List<Object> taxGroupDetails, String taxMode, String taxPurcdDesc, String taxhead, Double totalAmount, Double totalPaybaleInterest, Double totalPaybalePenalty, Double totalPaybaleRebate, Double totalPaybaleSurcharge, Double totalPaybaleTax, Double totalPaybaleTax1, Double totalPaybaleTax2, String userID, Double vtTaxFinalFine, Double vtTaxFinalTax) {
        Intrinsics.checkNotNullParameter(paymntCollectionBean, "paymntCollectionBean");
        Intrinsics.checkNotNullParameter(taxBreakDetails, "taxBreakDetails");
        Intrinsics.checkNotNullParameter(taxGroupDetails, "taxGroupDetails");
        return new Beforepayment(applNo, appl_no, deal_cd, finalTaxAmount, finalTaxFrom, finalTaxUpto, no_adv_units, off_cd, op_dt, ownerName, payMode, paymentMode, paymntCollectionBean, previousAdjustment, pur_cd, rcptDate, rcptNo, rcpt_dt, regnNo, state_cd, status, taxBreakDetails, taxGroupDetails, taxMode, taxPurcdDesc, taxhead, totalAmount, totalPaybaleInterest, totalPaybalePenalty, totalPaybaleRebate, totalPaybaleSurcharge, totalPaybaleTax, totalPaybaleTax1, totalPaybaleTax2, userID, vtTaxFinalFine, vtTaxFinalTax);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Beforepayment)) {
            return false;
        }
        Beforepayment beforepayment = (Beforepayment) other;
        return Intrinsics.areEqual(this.applNo, beforepayment.applNo) && Intrinsics.areEqual(this.appl_no, beforepayment.appl_no) && Intrinsics.areEqual(this.deal_cd, beforepayment.deal_cd) && Intrinsics.areEqual((Object) this.finalTaxAmount, (Object) beforepayment.finalTaxAmount) && Intrinsics.areEqual(this.finalTaxFrom, beforepayment.finalTaxFrom) && Intrinsics.areEqual(this.finalTaxUpto, beforepayment.finalTaxUpto) && Intrinsics.areEqual((Object) this.no_adv_units, (Object) beforepayment.no_adv_units) && Intrinsics.areEqual(this.off_cd, beforepayment.off_cd) && Intrinsics.areEqual(this.op_dt, beforepayment.op_dt) && Intrinsics.areEqual(this.ownerName, beforepayment.ownerName) && Intrinsics.areEqual(this.payMode, beforepayment.payMode) && Intrinsics.areEqual(this.paymentMode, beforepayment.paymentMode) && Intrinsics.areEqual(this.paymntCollectionBean, beforepayment.paymntCollectionBean) && Intrinsics.areEqual((Object) this.previousAdjustment, (Object) beforepayment.previousAdjustment) && Intrinsics.areEqual(this.pur_cd, beforepayment.pur_cd) && Intrinsics.areEqual(this.rcptDate, beforepayment.rcptDate) && Intrinsics.areEqual(this.rcptNo, beforepayment.rcptNo) && Intrinsics.areEqual(this.rcpt_dt, beforepayment.rcpt_dt) && Intrinsics.areEqual(this.regnNo, beforepayment.regnNo) && Intrinsics.areEqual(this.state_cd, beforepayment.state_cd) && Intrinsics.areEqual(this.status, beforepayment.status) && Intrinsics.areEqual(this.taxBreakDetails, beforepayment.taxBreakDetails) && Intrinsics.areEqual(this.taxGroupDetails, beforepayment.taxGroupDetails) && Intrinsics.areEqual(this.taxMode, beforepayment.taxMode) && Intrinsics.areEqual(this.taxPurcdDesc, beforepayment.taxPurcdDesc) && Intrinsics.areEqual(this.taxhead, beforepayment.taxhead) && Intrinsics.areEqual((Object) this.totalAmount, (Object) beforepayment.totalAmount) && Intrinsics.areEqual((Object) this.totalPaybaleInterest, (Object) beforepayment.totalPaybaleInterest) && Intrinsics.areEqual((Object) this.totalPaybalePenalty, (Object) beforepayment.totalPaybalePenalty) && Intrinsics.areEqual((Object) this.totalPaybaleRebate, (Object) beforepayment.totalPaybaleRebate) && Intrinsics.areEqual((Object) this.totalPaybaleSurcharge, (Object) beforepayment.totalPaybaleSurcharge) && Intrinsics.areEqual((Object) this.totalPaybaleTax, (Object) beforepayment.totalPaybaleTax) && Intrinsics.areEqual((Object) this.totalPaybaleTax1, (Object) beforepayment.totalPaybaleTax1) && Intrinsics.areEqual((Object) this.totalPaybaleTax2, (Object) beforepayment.totalPaybaleTax2) && Intrinsics.areEqual(this.userID, beforepayment.userID) && Intrinsics.areEqual((Object) this.vtTaxFinalFine, (Object) beforepayment.vtTaxFinalFine) && Intrinsics.areEqual((Object) this.vtTaxFinalTax, (Object) beforepayment.vtTaxFinalTax);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final String getAppl_no() {
        return this.appl_no;
    }

    public final String getDeal_cd() {
        return this.deal_cd;
    }

    public final Double getFinalTaxAmount() {
        return this.finalTaxAmount;
    }

    public final String getFinalTaxFrom() {
        return this.finalTaxFrom;
    }

    public final String getFinalTaxUpto() {
        return this.finalTaxUpto;
    }

    public final Double getNo_adv_units() {
        return this.no_adv_units;
    }

    public final Integer getOff_cd() {
        return this.off_cd;
    }

    public final String getOp_dt() {
        return this.op_dt;
    }

    public final String getOwnerName() {
        return this.ownerName;
    }

    public final String getPayMode() {
        return this.payMode;
    }

    public final String getPaymentMode() {
        return this.paymentMode;
    }

    public final List<Object> getPaymntCollectionBean() {
        return this.paymntCollectionBean;
    }

    public final Double getPreviousAdjustment() {
        return this.previousAdjustment;
    }

    public final Integer getPur_cd() {
        return this.pur_cd;
    }

    public final String getRcptDate() {
        return this.rcptDate;
    }

    public final String getRcptNo() {
        return this.rcptNo;
    }

    public final String getRcpt_dt() {
        return this.rcpt_dt;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public final String getStatus() {
        return this.status;
    }

    public final List<Object> getTaxBreakDetails() {
        return this.taxBreakDetails;
    }

    public final List<Object> getTaxGroupDetails() {
        return this.taxGroupDetails;
    }

    public final String getTaxMode() {
        return this.taxMode;
    }

    public final String getTaxPurcdDesc() {
        return this.taxPurcdDesc;
    }

    public final String getTaxhead() {
        return this.taxhead;
    }

    public final Double getTotalAmount() {
        return this.totalAmount;
    }

    public final Double getTotalPaybaleInterest() {
        return this.totalPaybaleInterest;
    }

    public final Double getTotalPaybalePenalty() {
        return this.totalPaybalePenalty;
    }

    public final Double getTotalPaybaleRebate() {
        return this.totalPaybaleRebate;
    }

    public final Double getTotalPaybaleSurcharge() {
        return this.totalPaybaleSurcharge;
    }

    public final Double getTotalPaybaleTax() {
        return this.totalPaybaleTax;
    }

    public final Double getTotalPaybaleTax1() {
        return this.totalPaybaleTax1;
    }

    public final Double getTotalPaybaleTax2() {
        return this.totalPaybaleTax2;
    }

    public final String getUserID() {
        return this.userID;
    }

    public final Double getVtTaxFinalFine() {
        return this.vtTaxFinalFine;
    }

    public final Double getVtTaxFinalTax() {
        return this.vtTaxFinalTax;
    }

    public int hashCode() {
        String str = this.applNo;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.appl_no;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deal_cd;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d = this.finalTaxAmount;
        int iHashCode4 = (iHashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        String str4 = this.finalTaxFrom;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.finalTaxUpto;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Double d2 = this.no_adv_units;
        int iHashCode7 = (iHashCode6 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num = this.off_cd;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.op_dt;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.ownerName;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.payMode;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.paymentMode;
        int iHashCode12 = (((iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31) + this.paymntCollectionBean.hashCode()) * 31;
        Double d3 = this.previousAdjustment;
        int iHashCode13 = (iHashCode12 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Integer num2 = this.pur_cd;
        int iHashCode14 = (iHashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str10 = this.rcptDate;
        int iHashCode15 = (iHashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.rcptNo;
        int iHashCode16 = (iHashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.rcpt_dt;
        int iHashCode17 = (iHashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.regnNo;
        int iHashCode18 = (iHashCode17 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.state_cd;
        int iHashCode19 = (iHashCode18 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.status;
        int iHashCode20 = (((((iHashCode19 + (str15 == null ? 0 : str15.hashCode())) * 31) + this.taxBreakDetails.hashCode()) * 31) + this.taxGroupDetails.hashCode()) * 31;
        String str16 = this.taxMode;
        int iHashCode21 = (iHashCode20 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.taxPurcdDesc;
        int iHashCode22 = (iHashCode21 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.taxhead;
        int iHashCode23 = (iHashCode22 + (str18 == null ? 0 : str18.hashCode())) * 31;
        Double d4 = this.totalAmount;
        int iHashCode24 = (iHashCode23 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.totalPaybaleInterest;
        int iHashCode25 = (iHashCode24 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.totalPaybalePenalty;
        int iHashCode26 = (iHashCode25 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Double d7 = this.totalPaybaleRebate;
        int iHashCode27 = (iHashCode26 + (d7 == null ? 0 : d7.hashCode())) * 31;
        Double d8 = this.totalPaybaleSurcharge;
        int iHashCode28 = (iHashCode27 + (d8 == null ? 0 : d8.hashCode())) * 31;
        Double d9 = this.totalPaybaleTax;
        int iHashCode29 = (iHashCode28 + (d9 == null ? 0 : d9.hashCode())) * 31;
        Double d10 = this.totalPaybaleTax1;
        int iHashCode30 = (iHashCode29 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.totalPaybaleTax2;
        int iHashCode31 = (iHashCode30 + (d11 == null ? 0 : d11.hashCode())) * 31;
        String str19 = this.userID;
        int iHashCode32 = (iHashCode31 + (str19 == null ? 0 : str19.hashCode())) * 31;
        Double d12 = this.vtTaxFinalFine;
        int iHashCode33 = (iHashCode32 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Double d13 = this.vtTaxFinalTax;
        return iHashCode33 + (d13 != null ? d13.hashCode() : 0);
    }

    public final void setApplNo(String str) {
        this.applNo = str;
    }

    public final void setAppl_no(String str) {
        this.appl_no = str;
    }

    public final void setDeal_cd(String str) {
        this.deal_cd = str;
    }

    public final void setFinalTaxAmount(Double d) {
        this.finalTaxAmount = d;
    }

    public final void setFinalTaxFrom(String str) {
        this.finalTaxFrom = str;
    }

    public final void setFinalTaxUpto(String str) {
        this.finalTaxUpto = str;
    }

    public final void setNo_adv_units(Double d) {
        this.no_adv_units = d;
    }

    public final void setOff_cd(Integer num) {
        this.off_cd = num;
    }

    public final void setOp_dt(String str) {
        this.op_dt = str;
    }

    public final void setOwnerName(String str) {
        this.ownerName = str;
    }

    public final void setPayMode(String str) {
        this.payMode = str;
    }

    public final void setPaymentMode(String str) {
        this.paymentMode = str;
    }

    public final void setPaymntCollectionBean(List<Object> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.paymntCollectionBean = list;
    }

    public final void setPreviousAdjustment(Double d) {
        this.previousAdjustment = d;
    }

    public final void setPur_cd(Integer num) {
        this.pur_cd = num;
    }

    public final void setRcptDate(String str) {
        this.rcptDate = str;
    }

    public final void setRcptNo(String str) {
        this.rcptNo = str;
    }

    public final void setRcpt_dt(String str) {
        this.rcpt_dt = str;
    }

    public final void setRegnNo(String str) {
        this.regnNo = str;
    }

    public final void setState_cd(String str) {
        this.state_cd = str;
    }

    public final void setStatus(String str) {
        this.status = str;
    }

    public final void setTaxBreakDetails(List<Object> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.taxBreakDetails = list;
    }

    public final void setTaxGroupDetails(List<Object> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.taxGroupDetails = list;
    }

    public final void setTaxMode(String str) {
        this.taxMode = str;
    }

    public final void setTaxPurcdDesc(String str) {
        this.taxPurcdDesc = str;
    }

    public final void setTaxhead(String str) {
        this.taxhead = str;
    }

    public final void setTotalAmount(Double d) {
        this.totalAmount = d;
    }

    public final void setTotalPaybaleInterest(Double d) {
        this.totalPaybaleInterest = d;
    }

    public final void setTotalPaybalePenalty(Double d) {
        this.totalPaybalePenalty = d;
    }

    public final void setTotalPaybaleRebate(Double d) {
        this.totalPaybaleRebate = d;
    }

    public final void setTotalPaybaleSurcharge(Double d) {
        this.totalPaybaleSurcharge = d;
    }

    public final void setTotalPaybaleTax(Double d) {
        this.totalPaybaleTax = d;
    }

    public final void setTotalPaybaleTax1(Double d) {
        this.totalPaybaleTax1 = d;
    }

    public final void setTotalPaybaleTax2(Double d) {
        this.totalPaybaleTax2 = d;
    }

    public final void setUserID(String str) {
        this.userID = str;
    }

    public final void setVtTaxFinalFine(Double d) {
        this.vtTaxFinalFine = d;
    }

    public final void setVtTaxFinalTax(Double d) {
        this.vtTaxFinalTax = d;
    }

    public String toString() {
        return "Beforepayment(applNo=" + this.applNo + ", appl_no=" + this.appl_no + ", deal_cd=" + this.deal_cd + ", finalTaxAmount=" + this.finalTaxAmount + ", finalTaxFrom=" + this.finalTaxFrom + ", finalTaxUpto=" + this.finalTaxUpto + ", no_adv_units=" + this.no_adv_units + ", off_cd=" + this.off_cd + ", op_dt=" + this.op_dt + ", ownerName=" + this.ownerName + ", payMode=" + this.payMode + ", paymentMode=" + this.paymentMode + ", paymntCollectionBean=" + this.paymntCollectionBean + ", previousAdjustment=" + this.previousAdjustment + ", pur_cd=" + this.pur_cd + ", rcptDate=" + this.rcptDate + ", rcptNo=" + this.rcptNo + ", rcpt_dt=" + this.rcpt_dt + ", regnNo=" + this.regnNo + ", state_cd=" + this.state_cd + ", status=" + this.status + ", taxBreakDetails=" + this.taxBreakDetails + ", taxGroupDetails=" + this.taxGroupDetails + ", taxMode=" + this.taxMode + ", taxPurcdDesc=" + this.taxPurcdDesc + ", taxhead=" + this.taxhead + ", totalAmount=" + this.totalAmount + ", totalPaybaleInterest=" + this.totalPaybaleInterest + ", totalPaybalePenalty=" + this.totalPaybalePenalty + ", totalPaybaleRebate=" + this.totalPaybaleRebate + ", totalPaybaleSurcharge=" + this.totalPaybaleSurcharge + ", totalPaybaleTax=" + this.totalPaybaleTax + ", totalPaybaleTax1=" + this.totalPaybaleTax1 + ", totalPaybaleTax2=" + this.totalPaybaleTax2 + ", userID=" + this.userID + ", vtTaxFinalFine=" + this.vtTaxFinalFine + ", vtTaxFinalTax=" + this.vtTaxFinalTax + ')';
    }

    public /* synthetic */ Beforepayment(String str, String str2, String str3, Double d, String str4, String str5, Double d2, Integer num, String str6, String str7, String str8, String str9, List list, Double d3, Integer num2, String str10, String str11, String str12, String str13, String str14, String str15, List list2, List list3, String str16, String str17, String str18, Double d4, Double d5, Double d6, Double d7, Double d8, Double d9, Double d10, Double d11, String str19, Double d12, Double d13, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? Double.valueOf(0.0d) : d, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? Double.valueOf(0.0d) : d2, (i & 128) != 0 ? 0 : num, (i & 256) != 0 ? "" : str6, (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? "" : str7, (i & 1024) != 0 ? "" : str8, (i & 2048) != 0 ? "" : str9, list, (i & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? Double.valueOf(0.0d) : d3, (i & 16384) != 0 ? 0 : num2, (32768 & i) != 0 ? "" : str10, (65536 & i) != 0 ? "" : str11, (131072 & i) != 0 ? "" : str12, (262144 & i) != 0 ? "" : str13, (524288 & i) != 0 ? "" : str14, (1048576 & i) != 0 ? "" : str15, list2, list3, (8388608 & i) != 0 ? "" : str16, (16777216 & i) != 0 ? "" : str17, (33554432 & i) != 0 ? "" : str18, (67108864 & i) != 0 ? Double.valueOf(0.0d) : d4, (134217728 & i) != 0 ? Double.valueOf(0.0d) : d5, (268435456 & i) != 0 ? Double.valueOf(0.0d) : d6, (536870912 & i) != 0 ? Double.valueOf(0.0d) : d7, (1073741824 & i) != 0 ? Double.valueOf(0.0d) : d8, (i & IntCompanionObject.MIN_VALUE) != 0 ? Double.valueOf(0.0d) : d9, (i2 & 1) != 0 ? Double.valueOf(0.0d) : d10, (i2 & 2) != 0 ? Double.valueOf(0.0d) : d11, (i2 & 4) != 0 ? "" : str19, (i2 & 8) != 0 ? Double.valueOf(0.0d) : d12, (i2 & 16) != 0 ? Double.valueOf(0.0d) : d13);
    }
}
