package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000-\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b=\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0003\bÍ\u0001\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0006\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0001\u0012\u0006\u0010\f\u001a\u00020\u0001\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u0001\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u0006\u0010\u0015\u001a\u00020\u0001\u0012\u0006\u0010\u0016\u001a\u00020\u0001\u0012\u0006\u0010\u0017\u001a\u00020\u0001\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\b\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u001b\u001a\u00020\b\u0012\u0006\u0010\u001c\u001a\u00020\u0004\u0012\u0006\u0010\u001d\u001a\u00020\b\u0012\u0006\u0010\u001e\u001a\u00020\u0001\u0012\u0006\u0010\u001f\u001a\u00020\u0004\u0012\u0006\u0010 \u001a\u00020\u0004\u0012\u0006\u0010!\u001a\u00020\u0004\u0012\u0006\u0010\"\u001a\u00020\b\u0012\u0006\u0010#\u001a\u00020\u0004\u0012\u0006\u0010$\u001a\u00020\u0004\u0012\u0006\u0010%\u001a\u00020\u0004\u0012\u0006\u0010&\u001a\u00020\u0004\u0012\u0006\u0010'\u001a\u00020\u0004\u0012\u0006\u0010(\u001a\u00020\u0004\u0012\u0006\u0010)\u001a\u00020\u0004\u0012\u0006\u0010*\u001a\u00020\u0004\u0012\u0006\u0010+\u001a\u00020\u0004\u0012\u0006\u0010,\u001a\u00020\u0004\u0012\u0006\u0010-\u001a\u00020\u0004\u0012\u0006\u0010.\u001a\u00020\u0004\u0012\u0006\u0010/\u001a\u00020\u0004\u0012\u0006\u00100\u001a\u00020\u0004\u0012\u0006\u00101\u001a\u00020\b\u0012\u0006\u00102\u001a\u00020\u0004\u0012\u0006\u00103\u001a\u00020\u0004\u0012\u0006\u00104\u001a\u00020\u0004\u0012\u0006\u00105\u001a\u00020\u0004\u0012\u0006\u00106\u001a\u00020\u0001\u0012\u0006\u00107\u001a\u00020\u0004\u0012\u0006\u00108\u001a\u00020\u0004\u0012\u0006\u00109\u001a\u00020\u0004\u0012\u0006\u0010:\u001a\u00020\u0004\u0012\u0006\u0010;\u001a\u00020\u0004\u0012\u0006\u0010<\u001a\u00020\u0004\u0012\u0006\u0010=\u001a\u00020\u0004\u0012\u0006\u0010>\u001a\u00020\u0004\u0012\u0006\u0010?\u001a\u00020\u0004\u0012\u0006\u0010@\u001a\u00020\u0004\u0012\u0006\u0010A\u001a\u00020\b\u0012\u0006\u0010B\u001a\u00020\u0001\u0012\u0006\u0010C\u001a\u00020\u0004\u0012\u0006\u0010D\u001a\u00020\u0004\u0012\u0006\u0010E\u001a\u00020F\u0012\u0006\u0010G\u001a\u00020\u0004\u0012\u0006\u0010H\u001a\u00020\u0004\u0012\u0006\u0010I\u001a\u00020\u0004\u0012\u0006\u0010J\u001a\u00020\u0001\u0012\u0006\u0010K\u001a\u00020\u0001\u0012\u0006\u0010L\u001a\u00020\u0001\u0012\u0006\u0010M\u001a\u00020\u0004\u0012\u0006\u0010N\u001a\u00020\u0004\u0012\u0006\u0010O\u001a\u00020\u0001\u0012\u0006\u0010P\u001a\u00020\u0004\u0012\u0006\u0010Q\u001a\u00020\u0004\u0012\u0006\u0010R\u001a\u00020F\u0012\u0006\u0010S\u001a\u00020\u0004\u0012\u0006\u0010T\u001a\u00020\b\u0012\u0006\u0010U\u001a\u00020\b\u0012\u0006\u0010V\u001a\u00020F\u0012\u0006\u0010W\u001a\u00020\u0001\u0012\u0006\u0010X\u001a\u00020\u0004\u0012\u0006\u0010Y\u001a\u00020\u0001\u0012\u0006\u0010Z\u001a\u00020\u0001\u0012\u0006\u0010[\u001a\u00020\u0001\u0012\u0006\u0010\\\u001a\u00020\b\u0012\u0006\u0010]\u001a\u00020\b\u0012\u0006\u0010^\u001a\u00020\u0001\u0012\u0006\u0010_\u001a\u00020\b\u0012\u0006\u0010`\u001a\u00020\b\u0012\u0006\u0010a\u001a\u00020\b\u0012\u0006\u0010b\u001a\u00020\u0004\u0012\u0006\u0010c\u001a\u00020\u0004\u0012\u0006\u0010d\u001a\u00020e\u0012\u0006\u0010f\u001a\u00020\u0004¢\u0006\u0002\u0010gJ\n\u0010Ì\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010Í\u0001\u001a\u00020\bHÆ\u0003J\n\u0010Î\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010Ï\u0001\u001a\u00020\bHÆ\u0003J\n\u0010Ð\u0001\u001a\u00020\bHÆ\u0003J\n\u0010Ñ\u0001\u001a\u00020\bHÆ\u0003J\n\u0010Ò\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010Ó\u0001\u001a\u00020\bHÆ\u0003J\n\u0010Ô\u0001\u001a\u00020\bHÆ\u0003J\n\u0010Õ\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010Ö\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010×\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010Ø\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010Ù\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010Ú\u0001\u001a\u00020\bHÆ\u0003J\f\u0010Û\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\n\u0010Ü\u0001\u001a\u00020\bHÆ\u0003J\n\u0010Ý\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010Þ\u0001\u001a\u00020\bHÆ\u0003J\n\u0010ß\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010à\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010á\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010â\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010ã\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010ä\u0001\u001a\u00020\bHÆ\u0003J\n\u0010å\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010æ\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010ç\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010è\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010é\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010ê\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010ë\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010ì\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010í\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010î\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010ï\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010ð\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010ñ\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010ò\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010ó\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010ô\u0001\u001a\u00020\bHÆ\u0003J\n\u0010õ\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010ö\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010÷\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010ø\u0001\u001a\u00020\bHÆ\u0003J\n\u0010ù\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010ú\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010û\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010ü\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010ý\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010þ\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010ÿ\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010\u0080\u0002\u001a\u00020\u0004HÆ\u0003J\n\u0010\u0081\u0002\u001a\u00020\u0004HÆ\u0003J\n\u0010\u0082\u0002\u001a\u00020\u0004HÆ\u0003J\n\u0010\u0083\u0002\u001a\u00020\bHÆ\u0003J\n\u0010\u0084\u0002\u001a\u00020\u0004HÆ\u0003J\n\u0010\u0085\u0002\u001a\u00020\u0004HÆ\u0003J\n\u0010\u0086\u0002\u001a\u00020\bHÆ\u0003J\n\u0010\u0087\u0002\u001a\u00020\u0001HÆ\u0003J\n\u0010\u0088\u0002\u001a\u00020\u0004HÆ\u0003J\n\u0010\u0089\u0002\u001a\u00020\u0004HÆ\u0003J\n\u0010\u008a\u0002\u001a\u00020FHÆ\u0003J\n\u0010\u008b\u0002\u001a\u00020\u0004HÆ\u0003J\n\u0010\u008c\u0002\u001a\u00020\u0004HÆ\u0003J\n\u0010\u008d\u0002\u001a\u00020\u0004HÆ\u0003J\n\u0010\u008e\u0002\u001a\u00020\u0004HÆ\u0003J\n\u0010\u008f\u0002\u001a\u00020\u0001HÆ\u0003J\n\u0010\u0090\u0002\u001a\u00020\u0001HÆ\u0003J\n\u0010\u0091\u0002\u001a\u00020\u0001HÆ\u0003J\n\u0010\u0092\u0002\u001a\u00020\u0004HÆ\u0003J\n\u0010\u0093\u0002\u001a\u00020\u0004HÆ\u0003J\n\u0010\u0094\u0002\u001a\u00020\u0001HÆ\u0003J\n\u0010\u0095\u0002\u001a\u00020\u0004HÆ\u0003J\n\u0010\u0096\u0002\u001a\u00020\u0004HÆ\u0003J\n\u0010\u0097\u0002\u001a\u00020FHÆ\u0003J\n\u0010\u0098\u0002\u001a\u00020\u0004HÆ\u0003J\n\u0010\u0099\u0002\u001a\u00020\u0001HÆ\u0003J\n\u0010\u009a\u0002\u001a\u00020\bHÆ\u0003J\n\u0010\u009b\u0002\u001a\u00020\bHÆ\u0003J\n\u0010\u009c\u0002\u001a\u00020FHÆ\u0003J\n\u0010\u009d\u0002\u001a\u00020\u0001HÆ\u0003J\n\u0010\u009e\u0002\u001a\u00020\u0004HÆ\u0003J\n\u0010\u009f\u0002\u001a\u00020\u0001HÆ\u0003J\n\u0010 \u0002\u001a\u00020\u0001HÆ\u0003J\n\u0010¡\u0002\u001a\u00020\u0001HÆ\u0003J\n\u0010¢\u0002\u001a\u00020\bHÆ\u0003J\n\u0010£\u0002\u001a\u00020\bHÆ\u0003J\n\u0010¤\u0002\u001a\u00020\u0001HÆ\u0003J\n\u0010¥\u0002\u001a\u00020\u0001HÆ\u0003J\n\u0010¦\u0002\u001a\u00020\bHÆ\u0003J\n\u0010§\u0002\u001a\u00020\bHÆ\u0003J\n\u0010¨\u0002\u001a\u00020\bHÆ\u0003J\n\u0010©\u0002\u001a\u00020\u0004HÆ\u0003J\n\u0010ª\u0002\u001a\u00020\u0004HÆ\u0003J\n\u0010«\u0002\u001a\u00020eHÆ\u0003J\n\u0010¬\u0002\u001a\u00020\u0004HÆ\u0003JÖ\u0007\u0010\u00ad\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\b2\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020\u00042\b\b\u0002\u0010&\u001a\u00020\u00042\b\b\u0002\u0010'\u001a\u00020\u00042\b\b\u0002\u0010(\u001a\u00020\u00042\b\b\u0002\u0010)\u001a\u00020\u00042\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u00042\b\b\u0002\u0010,\u001a\u00020\u00042\b\b\u0002\u0010-\u001a\u00020\u00042\b\b\u0002\u0010.\u001a\u00020\u00042\b\b\u0002\u0010/\u001a\u00020\u00042\b\b\u0002\u00100\u001a\u00020\u00042\b\b\u0002\u00101\u001a\u00020\b2\b\b\u0002\u00102\u001a\u00020\u00042\b\b\u0002\u00103\u001a\u00020\u00042\b\b\u0002\u00104\u001a\u00020\u00042\b\b\u0002\u00105\u001a\u00020\u00042\b\b\u0002\u00106\u001a\u00020\u00012\b\b\u0002\u00107\u001a\u00020\u00042\b\b\u0002\u00108\u001a\u00020\u00042\b\b\u0002\u00109\u001a\u00020\u00042\b\b\u0002\u0010:\u001a\u00020\u00042\b\b\u0002\u0010;\u001a\u00020\u00042\b\b\u0002\u0010<\u001a\u00020\u00042\b\b\u0002\u0010=\u001a\u00020\u00042\b\b\u0002\u0010>\u001a\u00020\u00042\b\b\u0002\u0010?\u001a\u00020\u00042\b\b\u0002\u0010@\u001a\u00020\u00042\b\b\u0002\u0010A\u001a\u00020\b2\b\b\u0002\u0010B\u001a\u00020\u00012\b\b\u0002\u0010C\u001a\u00020\u00042\b\b\u0002\u0010D\u001a\u00020\u00042\b\b\u0002\u0010E\u001a\u00020F2\b\b\u0002\u0010G\u001a\u00020\u00042\b\b\u0002\u0010H\u001a\u00020\u00042\b\b\u0002\u0010I\u001a\u00020\u00042\b\b\u0002\u0010J\u001a\u00020\u00012\b\b\u0002\u0010K\u001a\u00020\u00012\b\b\u0002\u0010L\u001a\u00020\u00012\b\b\u0002\u0010M\u001a\u00020\u00042\b\b\u0002\u0010N\u001a\u00020\u00042\b\b\u0002\u0010O\u001a\u00020\u00012\b\b\u0002\u0010P\u001a\u00020\u00042\b\b\u0002\u0010Q\u001a\u00020\u00042\b\b\u0002\u0010R\u001a\u00020F2\b\b\u0002\u0010S\u001a\u00020\u00042\b\b\u0002\u0010T\u001a\u00020\b2\b\b\u0002\u0010U\u001a\u00020\b2\b\b\u0002\u0010V\u001a\u00020F2\b\b\u0002\u0010W\u001a\u00020\u00012\b\b\u0002\u0010X\u001a\u00020\u00042\b\b\u0002\u0010Y\u001a\u00020\u00012\b\b\u0002\u0010Z\u001a\u00020\u00012\b\b\u0002\u0010[\u001a\u00020\u00012\b\b\u0002\u0010\\\u001a\u00020\b2\b\b\u0002\u0010]\u001a\u00020\b2\b\b\u0002\u0010^\u001a\u00020\u00012\b\b\u0002\u0010_\u001a\u00020\b2\b\b\u0002\u0010`\u001a\u00020\b2\b\b\u0002\u0010a\u001a\u00020\b2\b\b\u0002\u0010b\u001a\u00020\u00042\b\b\u0002\u0010c\u001a\u00020\u00042\b\b\u0002\u0010d\u001a\u00020e2\b\b\u0002\u0010f\u001a\u00020\u0004HÆ\u0001J\u0015\u0010®\u0002\u001a\u00020\u00042\t\u0010¯\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010°\u0002\u001a\u00020FHÖ\u0001J\n\u0010±\u0002\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bh\u0010iR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bj\u0010kR\u0011\u0010\u0005\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bl\u0010iR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bm\u0010kR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bn\u0010oR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bp\u0010oR\u0011\u0010\n\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bq\u0010kR\u0011\u0010\u000b\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\br\u0010iR\u0011\u0010\f\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bs\u0010iR\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bt\u0010oR\u0011\u0010\u000e\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bu\u0010iR\u0011\u0010\u000f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bv\u0010oR\u0011\u0010\u0010\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bw\u0010oR\u0011\u0010\u0011\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bx\u0010oR\u0011\u0010\u0012\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\by\u0010kR\u0011\u0010\u0013\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bz\u0010oR\u0011\u0010\u0014\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b{\u0010oR\u0011\u0010\u0015\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b|\u0010iR\u0011\u0010\u0016\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b}\u0010iR\u0011\u0010\u0017\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b~\u0010iR\u0011\u0010\u0018\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010kR\u0012\u0010\u0019\u001a\u00020\b¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010oR\u0014\u0010\u001a\u001a\u0004\u0018\u00010\b¢\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010oR\u0012\u0010\u001b\u001a\u00020\b¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010oR\u0012\u0010\u001c\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0083\u0001\u0010kR\u0012\u0010\u001d\u001a\u00020\b¢\u0006\t\n\u0000\u001a\u0005\b\u0084\u0001\u0010oR\u0012\u0010\u001e\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\b\u0085\u0001\u0010iR\u0012\u0010\u001f\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0086\u0001\u0010kR\u0012\u0010 \u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0087\u0001\u0010kR\u0012\u0010!\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0088\u0001\u0010kR\u0012\u0010\"\u001a\u00020\b¢\u0006\t\n\u0000\u001a\u0005\b\u0089\u0001\u0010oR\u0011\u0010#\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010kR\u0011\u0010$\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010kR\u0012\u0010%\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008a\u0001\u0010kR\u0012\u0010&\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008b\u0001\u0010kR\u0012\u0010'\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008c\u0001\u0010kR\u0012\u0010(\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008d\u0001\u0010kR\u0012\u0010)\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008e\u0001\u0010kR\u0012\u0010*\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008f\u0001\u0010kR\u0012\u0010+\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0090\u0001\u0010kR\u0012\u0010,\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0091\u0001\u0010kR\u0012\u0010-\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0092\u0001\u0010kR\u0012\u0010.\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0093\u0001\u0010kR\u0012\u0010/\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0094\u0001\u0010kR\u0012\u00100\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0095\u0001\u0010kR\u0012\u00101\u001a\u00020\b¢\u0006\t\n\u0000\u001a\u0005\b\u0096\u0001\u0010oR\u0012\u00102\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0097\u0001\u0010kR\u0012\u00103\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0098\u0001\u0010kR\u0012\u00104\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0099\u0001\u0010kR\u0012\u00105\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009a\u0001\u0010kR\u0012\u00106\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\b\u009b\u0001\u0010iR\u0012\u00107\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009c\u0001\u0010kR\u0012\u00108\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009d\u0001\u0010kR\u0012\u00109\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009e\u0001\u0010kR\u0012\u0010:\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009f\u0001\u0010kR\u0012\u0010;\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b \u0001\u0010kR\u0012\u0010<\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b¡\u0001\u0010kR\u0012\u0010=\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b¢\u0001\u0010kR\u0012\u0010>\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b£\u0001\u0010kR\u0012\u0010?\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b¤\u0001\u0010kR\u0012\u0010@\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b¥\u0001\u0010kR\u0012\u0010A\u001a\u00020\b¢\u0006\t\n\u0000\u001a\u0005\b¦\u0001\u0010oR\u0012\u0010B\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\b§\u0001\u0010iR\u0012\u0010C\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b¨\u0001\u0010kR\u0012\u0010D\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b©\u0001\u0010kR\u0013\u0010E\u001a\u00020F¢\u0006\n\n\u0000\u001a\u0006\bª\u0001\u0010«\u0001R\u0012\u0010G\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b¬\u0001\u0010kR\u0012\u0010H\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u00ad\u0001\u0010kR\u0012\u0010I\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b®\u0001\u0010kR\u0012\u0010J\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\b¯\u0001\u0010iR\u0012\u0010K\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\b°\u0001\u0010iR\u0012\u0010L\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\b±\u0001\u0010iR\u0012\u0010M\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b²\u0001\u0010kR\u0012\u0010N\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b³\u0001\u0010kR\u0012\u0010O\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\b´\u0001\u0010iR\u0012\u0010P\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bµ\u0001\u0010kR\u0012\u0010Q\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b¶\u0001\u0010kR\u0013\u0010R\u001a\u00020F¢\u0006\n\n\u0000\u001a\u0006\b·\u0001\u0010«\u0001R\u0012\u0010S\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b¸\u0001\u0010kR\u0012\u0010T\u001a\u00020\b¢\u0006\t\n\u0000\u001a\u0005\b¹\u0001\u0010oR\u0012\u0010U\u001a\u00020\b¢\u0006\t\n\u0000\u001a\u0005\bº\u0001\u0010oR\u0013\u0010V\u001a\u00020F¢\u0006\n\n\u0000\u001a\u0006\b»\u0001\u0010«\u0001R\u0012\u0010W\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\b¼\u0001\u0010iR\u0012\u0010X\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b½\u0001\u0010kR\u0012\u0010Y\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\b¾\u0001\u0010iR\u0012\u0010Z\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\b¿\u0001\u0010iR\u0012\u0010[\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\bÀ\u0001\u0010iR\u0012\u0010\\\u001a\u00020\b¢\u0006\t\n\u0000\u001a\u0005\bÁ\u0001\u0010oR\u0012\u0010]\u001a\u00020\b¢\u0006\t\n\u0000\u001a\u0005\bÂ\u0001\u0010oR\u0012\u0010^\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\bÃ\u0001\u0010iR\u0012\u0010_\u001a\u00020\b¢\u0006\t\n\u0000\u001a\u0005\bÄ\u0001\u0010oR\u0012\u0010`\u001a\u00020\b¢\u0006\t\n\u0000\u001a\u0005\bÅ\u0001\u0010oR\u0012\u0010a\u001a\u00020\b¢\u0006\t\n\u0000\u001a\u0005\bÆ\u0001\u0010oR\u0012\u0010b\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bÇ\u0001\u0010kR\u0012\u0010c\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bÈ\u0001\u0010kR\u0013\u0010d\u001a\u00020e¢\u0006\n\n\u0000\u001a\u0006\bÉ\u0001\u0010Ê\u0001R\u0012\u0010f\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bË\u0001\u0010k¨\u0006²\u0002"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/StateCostForDms;", "", "aadhar_based_autoapproval_purcd", "aadharfailexempt", "", "adv_vhclass", "allow_fitness_all_rto", "allowaapplinnonuse", "", "allowapplinpendingchallan", "appt_bfr_payment", "autoapproval_purcd", "blacklistcondformula", "blacklistedpur", "blacklistrestrictpur_cd", "book_app", "challanpndingrestrictpur_cd", "combination_service_allowed_anywhere", "conversion_check", "directinwardpurcode", "dms_url", "dmsurl", "doc_exemp_from", "doc_exemp_upto", "doc_merge", "esign_pur_cd", "faceless_service_purcd", "fee_exempt_owner_cd", "fit_fine_due_nid", "fitness_nt_vehicle", "fitnesscenterlist", "fitnessexpirymsgappt", "form23", "form23printwithvahantrans", "insuranceret", "is_penalty_applicable", "is_tax_installment", "isaadhaarmobileupdate", "isallowfitnesscertificatefeeafterfitnessfail", "isconversionallowttont", "isdirectinward", "isesign", "isfitnessallow", "isfitnessdirectallow", "ishptwithto_or_cainothr_rto", "isinschkrcsurr", "isinsurance", "isinsuranceentryrestricted", "ismandate_docs_bfr_rcpt", "ismobileregistered", "ismultiple_app", "isncrbblacklist", "isnocprint", "isotpmobileto", "ispermitallowservice", "ispgitestpage", "isprintrc", "isprintrcpartcert", "isprinttaxtoken", "isrechkfailedtran", "isrmaallowed", "isrrcwithbasicservices", "istaxallow", "istdsenable", "istemprc", "modify_doc_dms_url", "modifydmsurl", "mul_hpa", "multiple_state_action", "nid_days", "", "nidfitexempt", "noc_ret", "nochpthpccheck", "offline", "offlistforrrc", "offlistrrc", "other_state_fitness", "otpskip", "payment_complaint_type", "payment_compounding_fee", "paymentsch", "pgiamount", "printfit_inspection", "printfitdays", "pur_cd", "rc_print_days_allowed", "rcprint_restriction", "regnrenewalcheck", "restrictapplinchallanpnd", "restrictedfitnessblacklistcodes", "restrictedfitnesscenteroffcd", "state_cd", "state_header", "stateauthtype", "tax_nt_vehicle", "tax_restrict_transprt_veh", "tax_stopping_msg", "taxaddrecovery", "taxexemptionconv", "tmState", "Lcom/nic/mparivahan/VahanServices/VahanModel/TmState;", "upload_doc", "(Ljava/lang/Object;ZLjava/lang/Object;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Object;ZZZLjava/lang/String;ZZZZZZZZZZZZZZLjava/lang/String;ZZZZLjava/lang/Object;ZZZZZZZZZZLjava/lang/String;Ljava/lang/Object;ZZIZZZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZZLjava/lang/Object;ZZIZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLcom/nic/mparivahan/VahanServices/VahanModel/TmState;Z)V", "getAadhar_based_autoapproval_purcd", "()Ljava/lang/Object;", "getAadharfailexempt", "()Z", "getAdv_vhclass", "getAllow_fitness_all_rto", "getAllowaapplinnonuse", "()Ljava/lang/String;", "getAllowapplinpendingchallan", "getAppt_bfr_payment", "getAutoapproval_purcd", "getBlacklistcondformula", "getBlacklistedpur", "getBlacklistrestrictpur_cd", "getBook_app", "getChallanpndingrestrictpur_cd", "getCombination_service_allowed_anywhere", "getConversion_check", "getDirectinwardpurcode", "getDms_url", "getDmsurl", "getDoc_exemp_from", "getDoc_exemp_upto", "getDoc_merge", "getEsign_pur_cd", "getFaceless_service_purcd", "getFee_exempt_owner_cd", "getFit_fine_due_nid", "getFitness_nt_vehicle", "getFitnesscenterlist", "getFitnessexpirymsgappt", "getForm23", "getForm23printwithvahantrans", "getInsuranceret", "getIsaadhaarmobileupdate", "getIsallowfitnesscertificatefeeafterfitnessfail", "getIsconversionallowttont", "getIsdirectinward", "getIsesign", "getIsfitnessallow", "getIsfitnessdirectallow", "getIshptwithto_or_cainothr_rto", "getIsinschkrcsurr", "getIsinsurance", "getIsinsuranceentryrestricted", "getIsmandate_docs_bfr_rcpt", "getIsmobileregistered", "getIsmultiple_app", "getIsncrbblacklist", "getIsnocprint", "getIsotpmobileto", "getIspermitallowservice", "getIspgitestpage", "getIsprintrc", "getIsprintrcpartcert", "getIsprinttaxtoken", "getIsrechkfailedtran", "getIsrmaallowed", "getIsrrcwithbasicservices", "getIstaxallow", "getIstdsenable", "getIstemprc", "getModify_doc_dms_url", "getModifydmsurl", "getMul_hpa", "getMultiple_state_action", "getNid_days", "()I", "getNidfitexempt", "getNoc_ret", "getNochpthpccheck", "getOffline", "getOfflistforrrc", "getOfflistrrc", "getOther_state_fitness", "getOtpskip", "getPayment_complaint_type", "getPayment_compounding_fee", "getPaymentsch", "getPgiamount", "getPrintfit_inspection", "getPrintfitdays", "getPur_cd", "getRc_print_days_allowed", "getRcprint_restriction", "getRegnrenewalcheck", "getRestrictapplinchallanpnd", "getRestrictedfitnessblacklistcodes", "getRestrictedfitnesscenteroffcd", "getState_cd", "getState_header", "getStateauthtype", "getTax_nt_vehicle", "getTax_restrict_transprt_veh", "getTax_stopping_msg", "getTaxaddrecovery", "getTaxexemptionconv", "getTmState", "()Lcom/nic/mparivahan/VahanServices/VahanModel/TmState;", "getUpload_doc", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component6", "component60", "component61", "component62", "component63", "component64", "component65", "component66", "component67", "component68", "component69", "component7", "component70", "component71", "component72", "component73", "component74", "component75", "component76", "component77", "component78", "component79", "component8", "component80", "component81", "component82", "component83", "component84", "component85", "component86", "component87", "component88", "component89", "component9", "component90", "component91", "component92", "component93", "component94", "component95", "component96", "component97", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class StateCostForDms {
    private final Object aadhar_based_autoapproval_purcd;
    private final boolean aadharfailexempt;
    private final Object adv_vhclass;
    private final boolean allow_fitness_all_rto;
    private final String allowaapplinnonuse;
    private final String allowapplinpendingchallan;
    private final boolean appt_bfr_payment;
    private final Object autoapproval_purcd;
    private final Object blacklistcondformula;
    private final String blacklistedpur;
    private final Object blacklistrestrictpur_cd;
    private final String book_app;
    private final String challanpndingrestrictpur_cd;
    private final String combination_service_allowed_anywhere;
    private final boolean conversion_check;
    private final String directinwardpurcode;
    private final String dms_url;
    private final Object dmsurl;
    private final Object doc_exemp_from;
    private final Object doc_exemp_upto;
    private final boolean doc_merge;
    private final String esign_pur_cd;
    private final String faceless_service_purcd;
    private final String fee_exempt_owner_cd;
    private final boolean fit_fine_due_nid;
    private final String fitness_nt_vehicle;
    private final Object fitnesscenterlist;
    private final boolean fitnessexpirymsgappt;
    private final boolean form23;
    private final boolean form23printwithvahantrans;
    private final String insuranceret;
    private final boolean is_penalty_applicable;
    private final boolean is_tax_installment;
    private final boolean isaadhaarmobileupdate;
    private final boolean isallowfitnesscertificatefeeafterfitnessfail;
    private final boolean isconversionallowttont;
    private final boolean isdirectinward;
    private final boolean isesign;
    private final boolean isfitnessallow;
    private final boolean isfitnessdirectallow;
    private final boolean ishptwithto_or_cainothr_rto;
    private final boolean isinschkrcsurr;
    private final boolean isinsurance;
    private final boolean isinsuranceentryrestricted;
    private final boolean ismandate_docs_bfr_rcpt;
    private final String ismobileregistered;
    private final boolean ismultiple_app;
    private final boolean isncrbblacklist;
    private final boolean isnocprint;
    private final boolean isotpmobileto;
    private final Object ispermitallowservice;
    private final boolean ispgitestpage;
    private final boolean isprintrc;
    private final boolean isprintrcpartcert;
    private final boolean isprinttaxtoken;
    private final boolean isrechkfailedtran;
    private final boolean isrmaallowed;
    private final boolean isrrcwithbasicservices;
    private final boolean istaxallow;
    private final boolean istdsenable;
    private final boolean istemprc;
    private final String modify_doc_dms_url;
    private final Object modifydmsurl;
    private final boolean mul_hpa;
    private final boolean multiple_state_action;
    private final int nid_days;
    private final boolean nidfitexempt;
    private final boolean noc_ret;
    private final boolean nochpthpccheck;
    private final Object offline;
    private final Object offlistforrrc;
    private final Object offlistrrc;
    private final boolean other_state_fitness;
    private final boolean otpskip;
    private final Object payment_complaint_type;
    private final boolean payment_compounding_fee;
    private final boolean paymentsch;
    private final int pgiamount;
    private final boolean printfit_inspection;
    private final String printfitdays;
    private final String pur_cd;
    private final int rc_print_days_allowed;
    private final Object rcprint_restriction;
    private final boolean regnrenewalcheck;
    private final Object restrictapplinchallanpnd;
    private final Object restrictedfitnessblacklistcodes;
    private final Object restrictedfitnesscenteroffcd;
    private final String state_cd;
    private final String state_header;
    private final Object stateauthtype;
    private final String tax_nt_vehicle;
    private final String tax_restrict_transprt_veh;
    private final String tax_stopping_msg;
    private final boolean taxaddrecovery;
    private final boolean taxexemptionconv;
    private final TmState tmState;
    private final boolean upload_doc;

    public StateCostForDms(Object aadhar_based_autoapproval_purcd, boolean z, Object adv_vhclass, boolean z2, String allowaapplinnonuse, String allowapplinpendingchallan, boolean z3, Object autoapproval_purcd, Object blacklistcondformula, String blacklistedpur, Object blacklistrestrictpur_cd, String book_app, String challanpndingrestrictpur_cd, String combination_service_allowed_anywhere, boolean z4, String directinwardpurcode, String dms_url, Object dmsurl, Object doc_exemp_from, Object doc_exemp_upto, boolean z5, String esign_pur_cd, String str, String fee_exempt_owner_cd, boolean z6, String fitness_nt_vehicle, Object fitnesscenterlist, boolean z7, boolean z8, boolean z9, String insuranceret, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, String ismobileregistered, boolean z24, boolean z25, boolean z26, boolean z27, Object ispermitallowservice, boolean z28, boolean z29, boolean z30, boolean z31, boolean z32, boolean z33, boolean z34, boolean z35, boolean z36, boolean z37, String modify_doc_dms_url, Object modifydmsurl, boolean z38, boolean z39, int i, boolean z40, boolean z41, boolean z42, Object offline, Object offlistforrrc, Object offlistrrc, boolean z43, boolean z44, Object payment_complaint_type, boolean z45, boolean z46, int i2, boolean z47, String printfitdays, String pur_cd, int i3, Object rcprint_restriction, boolean z48, Object restrictapplinchallanpnd, Object restrictedfitnessblacklistcodes, Object restrictedfitnesscenteroffcd, String state_cd, String state_header, Object stateauthtype, String tax_nt_vehicle, String tax_restrict_transprt_veh, String tax_stopping_msg, boolean z49, boolean z50, TmState tmState, boolean z51) {
        Intrinsics.checkNotNullParameter(aadhar_based_autoapproval_purcd, "aadhar_based_autoapproval_purcd");
        Intrinsics.checkNotNullParameter(adv_vhclass, "adv_vhclass");
        Intrinsics.checkNotNullParameter(allowaapplinnonuse, "allowaapplinnonuse");
        Intrinsics.checkNotNullParameter(allowapplinpendingchallan, "allowapplinpendingchallan");
        Intrinsics.checkNotNullParameter(autoapproval_purcd, "autoapproval_purcd");
        Intrinsics.checkNotNullParameter(blacklistcondformula, "blacklistcondformula");
        Intrinsics.checkNotNullParameter(blacklistedpur, "blacklistedpur");
        Intrinsics.checkNotNullParameter(blacklistrestrictpur_cd, "blacklistrestrictpur_cd");
        Intrinsics.checkNotNullParameter(book_app, "book_app");
        Intrinsics.checkNotNullParameter(challanpndingrestrictpur_cd, "challanpndingrestrictpur_cd");
        Intrinsics.checkNotNullParameter(combination_service_allowed_anywhere, "combination_service_allowed_anywhere");
        Intrinsics.checkNotNullParameter(directinwardpurcode, "directinwardpurcode");
        Intrinsics.checkNotNullParameter(dms_url, "dms_url");
        Intrinsics.checkNotNullParameter(dmsurl, "dmsurl");
        Intrinsics.checkNotNullParameter(doc_exemp_from, "doc_exemp_from");
        Intrinsics.checkNotNullParameter(doc_exemp_upto, "doc_exemp_upto");
        Intrinsics.checkNotNullParameter(esign_pur_cd, "esign_pur_cd");
        Intrinsics.checkNotNullParameter(fee_exempt_owner_cd, "fee_exempt_owner_cd");
        Intrinsics.checkNotNullParameter(fitness_nt_vehicle, "fitness_nt_vehicle");
        Intrinsics.checkNotNullParameter(fitnesscenterlist, "fitnesscenterlist");
        Intrinsics.checkNotNullParameter(insuranceret, "insuranceret");
        Intrinsics.checkNotNullParameter(ismobileregistered, "ismobileregistered");
        Intrinsics.checkNotNullParameter(ispermitallowservice, "ispermitallowservice");
        Intrinsics.checkNotNullParameter(modify_doc_dms_url, "modify_doc_dms_url");
        Intrinsics.checkNotNullParameter(modifydmsurl, "modifydmsurl");
        Intrinsics.checkNotNullParameter(offline, "offline");
        Intrinsics.checkNotNullParameter(offlistforrrc, "offlistforrrc");
        Intrinsics.checkNotNullParameter(offlistrrc, "offlistrrc");
        Intrinsics.checkNotNullParameter(payment_complaint_type, "payment_complaint_type");
        Intrinsics.checkNotNullParameter(printfitdays, "printfitdays");
        Intrinsics.checkNotNullParameter(pur_cd, "pur_cd");
        Intrinsics.checkNotNullParameter(rcprint_restriction, "rcprint_restriction");
        Intrinsics.checkNotNullParameter(restrictapplinchallanpnd, "restrictapplinchallanpnd");
        Intrinsics.checkNotNullParameter(restrictedfitnessblacklistcodes, "restrictedfitnessblacklistcodes");
        Intrinsics.checkNotNullParameter(restrictedfitnesscenteroffcd, "restrictedfitnesscenteroffcd");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(state_header, "state_header");
        Intrinsics.checkNotNullParameter(stateauthtype, "stateauthtype");
        Intrinsics.checkNotNullParameter(tax_nt_vehicle, "tax_nt_vehicle");
        Intrinsics.checkNotNullParameter(tax_restrict_transprt_veh, "tax_restrict_transprt_veh");
        Intrinsics.checkNotNullParameter(tax_stopping_msg, "tax_stopping_msg");
        Intrinsics.checkNotNullParameter(tmState, "tmState");
        this.aadhar_based_autoapproval_purcd = aadhar_based_autoapproval_purcd;
        this.aadharfailexempt = z;
        this.adv_vhclass = adv_vhclass;
        this.allow_fitness_all_rto = z2;
        this.allowaapplinnonuse = allowaapplinnonuse;
        this.allowapplinpendingchallan = allowapplinpendingchallan;
        this.appt_bfr_payment = z3;
        this.autoapproval_purcd = autoapproval_purcd;
        this.blacklistcondformula = blacklistcondformula;
        this.blacklistedpur = blacklistedpur;
        this.blacklistrestrictpur_cd = blacklistrestrictpur_cd;
        this.book_app = book_app;
        this.challanpndingrestrictpur_cd = challanpndingrestrictpur_cd;
        this.combination_service_allowed_anywhere = combination_service_allowed_anywhere;
        this.conversion_check = z4;
        this.directinwardpurcode = directinwardpurcode;
        this.dms_url = dms_url;
        this.dmsurl = dmsurl;
        this.doc_exemp_from = doc_exemp_from;
        this.doc_exemp_upto = doc_exemp_upto;
        this.doc_merge = z5;
        this.esign_pur_cd = esign_pur_cd;
        this.faceless_service_purcd = str;
        this.fee_exempt_owner_cd = fee_exempt_owner_cd;
        this.fit_fine_due_nid = z6;
        this.fitness_nt_vehicle = fitness_nt_vehicle;
        this.fitnesscenterlist = fitnesscenterlist;
        this.fitnessexpirymsgappt = z7;
        this.form23 = z8;
        this.form23printwithvahantrans = z9;
        this.insuranceret = insuranceret;
        this.is_penalty_applicable = z10;
        this.is_tax_installment = z11;
        this.isaadhaarmobileupdate = z12;
        this.isallowfitnesscertificatefeeafterfitnessfail = z13;
        this.isconversionallowttont = z14;
        this.isdirectinward = z15;
        this.isesign = z16;
        this.isfitnessallow = z17;
        this.isfitnessdirectallow = z18;
        this.ishptwithto_or_cainothr_rto = z19;
        this.isinschkrcsurr = z20;
        this.isinsurance = z21;
        this.isinsuranceentryrestricted = z22;
        this.ismandate_docs_bfr_rcpt = z23;
        this.ismobileregistered = ismobileregistered;
        this.ismultiple_app = z24;
        this.isncrbblacklist = z25;
        this.isnocprint = z26;
        this.isotpmobileto = z27;
        this.ispermitallowservice = ispermitallowservice;
        this.ispgitestpage = z28;
        this.isprintrc = z29;
        this.isprintrcpartcert = z30;
        this.isprinttaxtoken = z31;
        this.isrechkfailedtran = z32;
        this.isrmaallowed = z33;
        this.isrrcwithbasicservices = z34;
        this.istaxallow = z35;
        this.istdsenable = z36;
        this.istemprc = z37;
        this.modify_doc_dms_url = modify_doc_dms_url;
        this.modifydmsurl = modifydmsurl;
        this.mul_hpa = z38;
        this.multiple_state_action = z39;
        this.nid_days = i;
        this.nidfitexempt = z40;
        this.noc_ret = z41;
        this.nochpthpccheck = z42;
        this.offline = offline;
        this.offlistforrrc = offlistforrrc;
        this.offlistrrc = offlistrrc;
        this.other_state_fitness = z43;
        this.otpskip = z44;
        this.payment_complaint_type = payment_complaint_type;
        this.payment_compounding_fee = z45;
        this.paymentsch = z46;
        this.pgiamount = i2;
        this.printfit_inspection = z47;
        this.printfitdays = printfitdays;
        this.pur_cd = pur_cd;
        this.rc_print_days_allowed = i3;
        this.rcprint_restriction = rcprint_restriction;
        this.regnrenewalcheck = z48;
        this.restrictapplinchallanpnd = restrictapplinchallanpnd;
        this.restrictedfitnessblacklistcodes = restrictedfitnessblacklistcodes;
        this.restrictedfitnesscenteroffcd = restrictedfitnesscenteroffcd;
        this.state_cd = state_cd;
        this.state_header = state_header;
        this.stateauthtype = stateauthtype;
        this.tax_nt_vehicle = tax_nt_vehicle;
        this.tax_restrict_transprt_veh = tax_restrict_transprt_veh;
        this.tax_stopping_msg = tax_stopping_msg;
        this.taxaddrecovery = z49;
        this.taxexemptionconv = z50;
        this.tmState = tmState;
        this.upload_doc = z51;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Object getAadhar_based_autoapproval_purcd() {
        return this.aadhar_based_autoapproval_purcd;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getBlacklistedpur() {
        return this.blacklistedpur;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Object getBlacklistrestrictpur_cd() {
        return this.blacklistrestrictpur_cd;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getBook_app() {
        return this.book_app;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getChallanpndingrestrictpur_cd() {
        return this.challanpndingrestrictpur_cd;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getCombination_service_allowed_anywhere() {
        return this.combination_service_allowed_anywhere;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getConversion_check() {
        return this.conversion_check;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getDirectinwardpurcode() {
        return this.directinwardpurcode;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getDms_url() {
        return this.dms_url;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Object getDmsurl() {
        return this.dmsurl;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Object getDoc_exemp_from() {
        return this.doc_exemp_from;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getAadharfailexempt() {
        return this.aadharfailexempt;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Object getDoc_exemp_upto() {
        return this.doc_exemp_upto;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final boolean getDoc_merge() {
        return this.doc_merge;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getEsign_pur_cd() {
        return this.esign_pur_cd;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getFaceless_service_purcd() {
        return this.faceless_service_purcd;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getFee_exempt_owner_cd() {
        return this.fee_exempt_owner_cd;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final boolean getFit_fine_due_nid() {
        return this.fit_fine_due_nid;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getFitness_nt_vehicle() {
        return this.fitness_nt_vehicle;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final Object getFitnesscenterlist() {
        return this.fitnesscenterlist;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final boolean getFitnessexpirymsgappt() {
        return this.fitnessexpirymsgappt;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final boolean getForm23() {
        return this.form23;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Object getAdv_vhclass() {
        return this.adv_vhclass;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final boolean getForm23printwithvahantrans() {
        return this.form23printwithvahantrans;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getInsuranceret() {
        return this.insuranceret;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final boolean getIs_penalty_applicable() {
        return this.is_penalty_applicable;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final boolean getIs_tax_installment() {
        return this.is_tax_installment;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final boolean getIsaadhaarmobileupdate() {
        return this.isaadhaarmobileupdate;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final boolean getIsallowfitnesscertificatefeeafterfitnessfail() {
        return this.isallowfitnesscertificatefeeafterfitnessfail;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final boolean getIsconversionallowttont() {
        return this.isconversionallowttont;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final boolean getIsdirectinward() {
        return this.isdirectinward;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final boolean getIsesign() {
        return this.isesign;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final boolean getIsfitnessallow() {
        return this.isfitnessallow;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getAllow_fitness_all_rto() {
        return this.allow_fitness_all_rto;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final boolean getIsfitnessdirectallow() {
        return this.isfitnessdirectallow;
    }

    /* JADX INFO: renamed from: component41, reason: from getter */
    public final boolean getIshptwithto_or_cainothr_rto() {
        return this.ishptwithto_or_cainothr_rto;
    }

    /* JADX INFO: renamed from: component42, reason: from getter */
    public final boolean getIsinschkrcsurr() {
        return this.isinschkrcsurr;
    }

    /* JADX INFO: renamed from: component43, reason: from getter */
    public final boolean getIsinsurance() {
        return this.isinsurance;
    }

    /* JADX INFO: renamed from: component44, reason: from getter */
    public final boolean getIsinsuranceentryrestricted() {
        return this.isinsuranceentryrestricted;
    }

    /* JADX INFO: renamed from: component45, reason: from getter */
    public final boolean getIsmandate_docs_bfr_rcpt() {
        return this.ismandate_docs_bfr_rcpt;
    }

    /* JADX INFO: renamed from: component46, reason: from getter */
    public final String getIsmobileregistered() {
        return this.ismobileregistered;
    }

    /* JADX INFO: renamed from: component47, reason: from getter */
    public final boolean getIsmultiple_app() {
        return this.ismultiple_app;
    }

    /* JADX INFO: renamed from: component48, reason: from getter */
    public final boolean getIsncrbblacklist() {
        return this.isncrbblacklist;
    }

    /* JADX INFO: renamed from: component49, reason: from getter */
    public final boolean getIsnocprint() {
        return this.isnocprint;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAllowaapplinnonuse() {
        return this.allowaapplinnonuse;
    }

    /* JADX INFO: renamed from: component50, reason: from getter */
    public final boolean getIsotpmobileto() {
        return this.isotpmobileto;
    }

    /* JADX INFO: renamed from: component51, reason: from getter */
    public final Object getIspermitallowservice() {
        return this.ispermitallowservice;
    }

    /* JADX INFO: renamed from: component52, reason: from getter */
    public final boolean getIspgitestpage() {
        return this.ispgitestpage;
    }

    /* JADX INFO: renamed from: component53, reason: from getter */
    public final boolean getIsprintrc() {
        return this.isprintrc;
    }

    /* JADX INFO: renamed from: component54, reason: from getter */
    public final boolean getIsprintrcpartcert() {
        return this.isprintrcpartcert;
    }

    /* JADX INFO: renamed from: component55, reason: from getter */
    public final boolean getIsprinttaxtoken() {
        return this.isprinttaxtoken;
    }

    /* JADX INFO: renamed from: component56, reason: from getter */
    public final boolean getIsrechkfailedtran() {
        return this.isrechkfailedtran;
    }

    /* JADX INFO: renamed from: component57, reason: from getter */
    public final boolean getIsrmaallowed() {
        return this.isrmaallowed;
    }

    /* JADX INFO: renamed from: component58, reason: from getter */
    public final boolean getIsrrcwithbasicservices() {
        return this.isrrcwithbasicservices;
    }

    /* JADX INFO: renamed from: component59, reason: from getter */
    public final boolean getIstaxallow() {
        return this.istaxallow;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAllowapplinpendingchallan() {
        return this.allowapplinpendingchallan;
    }

    /* JADX INFO: renamed from: component60, reason: from getter */
    public final boolean getIstdsenable() {
        return this.istdsenable;
    }

    /* JADX INFO: renamed from: component61, reason: from getter */
    public final boolean getIstemprc() {
        return this.istemprc;
    }

    /* JADX INFO: renamed from: component62, reason: from getter */
    public final String getModify_doc_dms_url() {
        return this.modify_doc_dms_url;
    }

    /* JADX INFO: renamed from: component63, reason: from getter */
    public final Object getModifydmsurl() {
        return this.modifydmsurl;
    }

    /* JADX INFO: renamed from: component64, reason: from getter */
    public final boolean getMul_hpa() {
        return this.mul_hpa;
    }

    /* JADX INFO: renamed from: component65, reason: from getter */
    public final boolean getMultiple_state_action() {
        return this.multiple_state_action;
    }

    /* JADX INFO: renamed from: component66, reason: from getter */
    public final int getNid_days() {
        return this.nid_days;
    }

    /* JADX INFO: renamed from: component67, reason: from getter */
    public final boolean getNidfitexempt() {
        return this.nidfitexempt;
    }

    /* JADX INFO: renamed from: component68, reason: from getter */
    public final boolean getNoc_ret() {
        return this.noc_ret;
    }

    /* JADX INFO: renamed from: component69, reason: from getter */
    public final boolean getNochpthpccheck() {
        return this.nochpthpccheck;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getAppt_bfr_payment() {
        return this.appt_bfr_payment;
    }

    /* JADX INFO: renamed from: component70, reason: from getter */
    public final Object getOffline() {
        return this.offline;
    }

    /* JADX INFO: renamed from: component71, reason: from getter */
    public final Object getOfflistforrrc() {
        return this.offlistforrrc;
    }

    /* JADX INFO: renamed from: component72, reason: from getter */
    public final Object getOfflistrrc() {
        return this.offlistrrc;
    }

    /* JADX INFO: renamed from: component73, reason: from getter */
    public final boolean getOther_state_fitness() {
        return this.other_state_fitness;
    }

    /* JADX INFO: renamed from: component74, reason: from getter */
    public final boolean getOtpskip() {
        return this.otpskip;
    }

    /* JADX INFO: renamed from: component75, reason: from getter */
    public final Object getPayment_complaint_type() {
        return this.payment_complaint_type;
    }

    /* JADX INFO: renamed from: component76, reason: from getter */
    public final boolean getPayment_compounding_fee() {
        return this.payment_compounding_fee;
    }

    /* JADX INFO: renamed from: component77, reason: from getter */
    public final boolean getPaymentsch() {
        return this.paymentsch;
    }

    /* JADX INFO: renamed from: component78, reason: from getter */
    public final int getPgiamount() {
        return this.pgiamount;
    }

    /* JADX INFO: renamed from: component79, reason: from getter */
    public final boolean getPrintfit_inspection() {
        return this.printfit_inspection;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Object getAutoapproval_purcd() {
        return this.autoapproval_purcd;
    }

    /* JADX INFO: renamed from: component80, reason: from getter */
    public final String getPrintfitdays() {
        return this.printfitdays;
    }

    /* JADX INFO: renamed from: component81, reason: from getter */
    public final String getPur_cd() {
        return this.pur_cd;
    }

    /* JADX INFO: renamed from: component82, reason: from getter */
    public final int getRc_print_days_allowed() {
        return this.rc_print_days_allowed;
    }

    /* JADX INFO: renamed from: component83, reason: from getter */
    public final Object getRcprint_restriction() {
        return this.rcprint_restriction;
    }

    /* JADX INFO: renamed from: component84, reason: from getter */
    public final boolean getRegnrenewalcheck() {
        return this.regnrenewalcheck;
    }

    /* JADX INFO: renamed from: component85, reason: from getter */
    public final Object getRestrictapplinchallanpnd() {
        return this.restrictapplinchallanpnd;
    }

    /* JADX INFO: renamed from: component86, reason: from getter */
    public final Object getRestrictedfitnessblacklistcodes() {
        return this.restrictedfitnessblacklistcodes;
    }

    /* JADX INFO: renamed from: component87, reason: from getter */
    public final Object getRestrictedfitnesscenteroffcd() {
        return this.restrictedfitnesscenteroffcd;
    }

    /* JADX INFO: renamed from: component88, reason: from getter */
    public final String getState_cd() {
        return this.state_cd;
    }

    /* JADX INFO: renamed from: component89, reason: from getter */
    public final String getState_header() {
        return this.state_header;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Object getBlacklistcondformula() {
        return this.blacklistcondformula;
    }

    /* JADX INFO: renamed from: component90, reason: from getter */
    public final Object getStateauthtype() {
        return this.stateauthtype;
    }

    /* JADX INFO: renamed from: component91, reason: from getter */
    public final String getTax_nt_vehicle() {
        return this.tax_nt_vehicle;
    }

    /* JADX INFO: renamed from: component92, reason: from getter */
    public final String getTax_restrict_transprt_veh() {
        return this.tax_restrict_transprt_veh;
    }

    /* JADX INFO: renamed from: component93, reason: from getter */
    public final String getTax_stopping_msg() {
        return this.tax_stopping_msg;
    }

    /* JADX INFO: renamed from: component94, reason: from getter */
    public final boolean getTaxaddrecovery() {
        return this.taxaddrecovery;
    }

    /* JADX INFO: renamed from: component95, reason: from getter */
    public final boolean getTaxexemptionconv() {
        return this.taxexemptionconv;
    }

    /* JADX INFO: renamed from: component96, reason: from getter */
    public final TmState getTmState() {
        return this.tmState;
    }

    /* JADX INFO: renamed from: component97, reason: from getter */
    public final boolean getUpload_doc() {
        return this.upload_doc;
    }

    public final StateCostForDms copy(Object aadhar_based_autoapproval_purcd, boolean aadharfailexempt, Object adv_vhclass, boolean allow_fitness_all_rto, String allowaapplinnonuse, String allowapplinpendingchallan, boolean appt_bfr_payment, Object autoapproval_purcd, Object blacklistcondformula, String blacklistedpur, Object blacklistrestrictpur_cd, String book_app, String challanpndingrestrictpur_cd, String combination_service_allowed_anywhere, boolean conversion_check, String directinwardpurcode, String dms_url, Object dmsurl, Object doc_exemp_from, Object doc_exemp_upto, boolean doc_merge, String esign_pur_cd, String faceless_service_purcd, String fee_exempt_owner_cd, boolean fit_fine_due_nid, String fitness_nt_vehicle, Object fitnesscenterlist, boolean fitnessexpirymsgappt, boolean form23, boolean form23printwithvahantrans, String insuranceret, boolean is_penalty_applicable, boolean is_tax_installment, boolean isaadhaarmobileupdate, boolean isallowfitnesscertificatefeeafterfitnessfail, boolean isconversionallowttont, boolean isdirectinward, boolean isesign, boolean isfitnessallow, boolean isfitnessdirectallow, boolean ishptwithto_or_cainothr_rto, boolean isinschkrcsurr, boolean isinsurance, boolean isinsuranceentryrestricted, boolean ismandate_docs_bfr_rcpt, String ismobileregistered, boolean ismultiple_app, boolean isncrbblacklist, boolean isnocprint, boolean isotpmobileto, Object ispermitallowservice, boolean ispgitestpage, boolean isprintrc, boolean isprintrcpartcert, boolean isprinttaxtoken, boolean isrechkfailedtran, boolean isrmaallowed, boolean isrrcwithbasicservices, boolean istaxallow, boolean istdsenable, boolean istemprc, String modify_doc_dms_url, Object modifydmsurl, boolean mul_hpa, boolean multiple_state_action, int nid_days, boolean nidfitexempt, boolean noc_ret, boolean nochpthpccheck, Object offline, Object offlistforrrc, Object offlistrrc, boolean other_state_fitness, boolean otpskip, Object payment_complaint_type, boolean payment_compounding_fee, boolean paymentsch, int pgiamount, boolean printfit_inspection, String printfitdays, String pur_cd, int rc_print_days_allowed, Object rcprint_restriction, boolean regnrenewalcheck, Object restrictapplinchallanpnd, Object restrictedfitnessblacklistcodes, Object restrictedfitnesscenteroffcd, String state_cd, String state_header, Object stateauthtype, String tax_nt_vehicle, String tax_restrict_transprt_veh, String tax_stopping_msg, boolean taxaddrecovery, boolean taxexemptionconv, TmState tmState, boolean upload_doc) {
        Intrinsics.checkNotNullParameter(aadhar_based_autoapproval_purcd, "aadhar_based_autoapproval_purcd");
        Intrinsics.checkNotNullParameter(adv_vhclass, "adv_vhclass");
        Intrinsics.checkNotNullParameter(allowaapplinnonuse, "allowaapplinnonuse");
        Intrinsics.checkNotNullParameter(allowapplinpendingchallan, "allowapplinpendingchallan");
        Intrinsics.checkNotNullParameter(autoapproval_purcd, "autoapproval_purcd");
        Intrinsics.checkNotNullParameter(blacklistcondformula, "blacklistcondformula");
        Intrinsics.checkNotNullParameter(blacklistedpur, "blacklistedpur");
        Intrinsics.checkNotNullParameter(blacklistrestrictpur_cd, "blacklistrestrictpur_cd");
        Intrinsics.checkNotNullParameter(book_app, "book_app");
        Intrinsics.checkNotNullParameter(challanpndingrestrictpur_cd, "challanpndingrestrictpur_cd");
        Intrinsics.checkNotNullParameter(combination_service_allowed_anywhere, "combination_service_allowed_anywhere");
        Intrinsics.checkNotNullParameter(directinwardpurcode, "directinwardpurcode");
        Intrinsics.checkNotNullParameter(dms_url, "dms_url");
        Intrinsics.checkNotNullParameter(dmsurl, "dmsurl");
        Intrinsics.checkNotNullParameter(doc_exemp_from, "doc_exemp_from");
        Intrinsics.checkNotNullParameter(doc_exemp_upto, "doc_exemp_upto");
        Intrinsics.checkNotNullParameter(esign_pur_cd, "esign_pur_cd");
        Intrinsics.checkNotNullParameter(fee_exempt_owner_cd, "fee_exempt_owner_cd");
        Intrinsics.checkNotNullParameter(fitness_nt_vehicle, "fitness_nt_vehicle");
        Intrinsics.checkNotNullParameter(fitnesscenterlist, "fitnesscenterlist");
        Intrinsics.checkNotNullParameter(insuranceret, "insuranceret");
        Intrinsics.checkNotNullParameter(ismobileregistered, "ismobileregistered");
        Intrinsics.checkNotNullParameter(ispermitallowservice, "ispermitallowservice");
        Intrinsics.checkNotNullParameter(modify_doc_dms_url, "modify_doc_dms_url");
        Intrinsics.checkNotNullParameter(modifydmsurl, "modifydmsurl");
        Intrinsics.checkNotNullParameter(offline, "offline");
        Intrinsics.checkNotNullParameter(offlistforrrc, "offlistforrrc");
        Intrinsics.checkNotNullParameter(offlistrrc, "offlistrrc");
        Intrinsics.checkNotNullParameter(payment_complaint_type, "payment_complaint_type");
        Intrinsics.checkNotNullParameter(printfitdays, "printfitdays");
        Intrinsics.checkNotNullParameter(pur_cd, "pur_cd");
        Intrinsics.checkNotNullParameter(rcprint_restriction, "rcprint_restriction");
        Intrinsics.checkNotNullParameter(restrictapplinchallanpnd, "restrictapplinchallanpnd");
        Intrinsics.checkNotNullParameter(restrictedfitnessblacklistcodes, "restrictedfitnessblacklistcodes");
        Intrinsics.checkNotNullParameter(restrictedfitnesscenteroffcd, "restrictedfitnesscenteroffcd");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(state_header, "state_header");
        Intrinsics.checkNotNullParameter(stateauthtype, "stateauthtype");
        Intrinsics.checkNotNullParameter(tax_nt_vehicle, "tax_nt_vehicle");
        Intrinsics.checkNotNullParameter(tax_restrict_transprt_veh, "tax_restrict_transprt_veh");
        Intrinsics.checkNotNullParameter(tax_stopping_msg, "tax_stopping_msg");
        Intrinsics.checkNotNullParameter(tmState, "tmState");
        return new StateCostForDms(aadhar_based_autoapproval_purcd, aadharfailexempt, adv_vhclass, allow_fitness_all_rto, allowaapplinnonuse, allowapplinpendingchallan, appt_bfr_payment, autoapproval_purcd, blacklistcondformula, blacklistedpur, blacklistrestrictpur_cd, book_app, challanpndingrestrictpur_cd, combination_service_allowed_anywhere, conversion_check, directinwardpurcode, dms_url, dmsurl, doc_exemp_from, doc_exemp_upto, doc_merge, esign_pur_cd, faceless_service_purcd, fee_exempt_owner_cd, fit_fine_due_nid, fitness_nt_vehicle, fitnesscenterlist, fitnessexpirymsgappt, form23, form23printwithvahantrans, insuranceret, is_penalty_applicable, is_tax_installment, isaadhaarmobileupdate, isallowfitnesscertificatefeeafterfitnessfail, isconversionallowttont, isdirectinward, isesign, isfitnessallow, isfitnessdirectallow, ishptwithto_or_cainothr_rto, isinschkrcsurr, isinsurance, isinsuranceentryrestricted, ismandate_docs_bfr_rcpt, ismobileregistered, ismultiple_app, isncrbblacklist, isnocprint, isotpmobileto, ispermitallowservice, ispgitestpage, isprintrc, isprintrcpartcert, isprinttaxtoken, isrechkfailedtran, isrmaallowed, isrrcwithbasicservices, istaxallow, istdsenable, istemprc, modify_doc_dms_url, modifydmsurl, mul_hpa, multiple_state_action, nid_days, nidfitexempt, noc_ret, nochpthpccheck, offline, offlistforrrc, offlistrrc, other_state_fitness, otpskip, payment_complaint_type, payment_compounding_fee, paymentsch, pgiamount, printfit_inspection, printfitdays, pur_cd, rc_print_days_allowed, rcprint_restriction, regnrenewalcheck, restrictapplinchallanpnd, restrictedfitnessblacklistcodes, restrictedfitnesscenteroffcd, state_cd, state_header, stateauthtype, tax_nt_vehicle, tax_restrict_transprt_veh, tax_stopping_msg, taxaddrecovery, taxexemptionconv, tmState, upload_doc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StateCostForDms)) {
            return false;
        }
        StateCostForDms stateCostForDms = (StateCostForDms) other;
        return Intrinsics.areEqual(this.aadhar_based_autoapproval_purcd, stateCostForDms.aadhar_based_autoapproval_purcd) && this.aadharfailexempt == stateCostForDms.aadharfailexempt && Intrinsics.areEqual(this.adv_vhclass, stateCostForDms.adv_vhclass) && this.allow_fitness_all_rto == stateCostForDms.allow_fitness_all_rto && Intrinsics.areEqual(this.allowaapplinnonuse, stateCostForDms.allowaapplinnonuse) && Intrinsics.areEqual(this.allowapplinpendingchallan, stateCostForDms.allowapplinpendingchallan) && this.appt_bfr_payment == stateCostForDms.appt_bfr_payment && Intrinsics.areEqual(this.autoapproval_purcd, stateCostForDms.autoapproval_purcd) && Intrinsics.areEqual(this.blacklistcondformula, stateCostForDms.blacklistcondformula) && Intrinsics.areEqual(this.blacklistedpur, stateCostForDms.blacklistedpur) && Intrinsics.areEqual(this.blacklistrestrictpur_cd, stateCostForDms.blacklistrestrictpur_cd) && Intrinsics.areEqual(this.book_app, stateCostForDms.book_app) && Intrinsics.areEqual(this.challanpndingrestrictpur_cd, stateCostForDms.challanpndingrestrictpur_cd) && Intrinsics.areEqual(this.combination_service_allowed_anywhere, stateCostForDms.combination_service_allowed_anywhere) && this.conversion_check == stateCostForDms.conversion_check && Intrinsics.areEqual(this.directinwardpurcode, stateCostForDms.directinwardpurcode) && Intrinsics.areEqual(this.dms_url, stateCostForDms.dms_url) && Intrinsics.areEqual(this.dmsurl, stateCostForDms.dmsurl) && Intrinsics.areEqual(this.doc_exemp_from, stateCostForDms.doc_exemp_from) && Intrinsics.areEqual(this.doc_exemp_upto, stateCostForDms.doc_exemp_upto) && this.doc_merge == stateCostForDms.doc_merge && Intrinsics.areEqual(this.esign_pur_cd, stateCostForDms.esign_pur_cd) && Intrinsics.areEqual(this.faceless_service_purcd, stateCostForDms.faceless_service_purcd) && Intrinsics.areEqual(this.fee_exempt_owner_cd, stateCostForDms.fee_exempt_owner_cd) && this.fit_fine_due_nid == stateCostForDms.fit_fine_due_nid && Intrinsics.areEqual(this.fitness_nt_vehicle, stateCostForDms.fitness_nt_vehicle) && Intrinsics.areEqual(this.fitnesscenterlist, stateCostForDms.fitnesscenterlist) && this.fitnessexpirymsgappt == stateCostForDms.fitnessexpirymsgappt && this.form23 == stateCostForDms.form23 && this.form23printwithvahantrans == stateCostForDms.form23printwithvahantrans && Intrinsics.areEqual(this.insuranceret, stateCostForDms.insuranceret) && this.is_penalty_applicable == stateCostForDms.is_penalty_applicable && this.is_tax_installment == stateCostForDms.is_tax_installment && this.isaadhaarmobileupdate == stateCostForDms.isaadhaarmobileupdate && this.isallowfitnesscertificatefeeafterfitnessfail == stateCostForDms.isallowfitnesscertificatefeeafterfitnessfail && this.isconversionallowttont == stateCostForDms.isconversionallowttont && this.isdirectinward == stateCostForDms.isdirectinward && this.isesign == stateCostForDms.isesign && this.isfitnessallow == stateCostForDms.isfitnessallow && this.isfitnessdirectallow == stateCostForDms.isfitnessdirectallow && this.ishptwithto_or_cainothr_rto == stateCostForDms.ishptwithto_or_cainothr_rto && this.isinschkrcsurr == stateCostForDms.isinschkrcsurr && this.isinsurance == stateCostForDms.isinsurance && this.isinsuranceentryrestricted == stateCostForDms.isinsuranceentryrestricted && this.ismandate_docs_bfr_rcpt == stateCostForDms.ismandate_docs_bfr_rcpt && Intrinsics.areEqual(this.ismobileregistered, stateCostForDms.ismobileregistered) && this.ismultiple_app == stateCostForDms.ismultiple_app && this.isncrbblacklist == stateCostForDms.isncrbblacklist && this.isnocprint == stateCostForDms.isnocprint && this.isotpmobileto == stateCostForDms.isotpmobileto && Intrinsics.areEqual(this.ispermitallowservice, stateCostForDms.ispermitallowservice) && this.ispgitestpage == stateCostForDms.ispgitestpage && this.isprintrc == stateCostForDms.isprintrc && this.isprintrcpartcert == stateCostForDms.isprintrcpartcert && this.isprinttaxtoken == stateCostForDms.isprinttaxtoken && this.isrechkfailedtran == stateCostForDms.isrechkfailedtran && this.isrmaallowed == stateCostForDms.isrmaallowed && this.isrrcwithbasicservices == stateCostForDms.isrrcwithbasicservices && this.istaxallow == stateCostForDms.istaxallow && this.istdsenable == stateCostForDms.istdsenable && this.istemprc == stateCostForDms.istemprc && Intrinsics.areEqual(this.modify_doc_dms_url, stateCostForDms.modify_doc_dms_url) && Intrinsics.areEqual(this.modifydmsurl, stateCostForDms.modifydmsurl) && this.mul_hpa == stateCostForDms.mul_hpa && this.multiple_state_action == stateCostForDms.multiple_state_action && this.nid_days == stateCostForDms.nid_days && this.nidfitexempt == stateCostForDms.nidfitexempt && this.noc_ret == stateCostForDms.noc_ret && this.nochpthpccheck == stateCostForDms.nochpthpccheck && Intrinsics.areEqual(this.offline, stateCostForDms.offline) && Intrinsics.areEqual(this.offlistforrrc, stateCostForDms.offlistforrrc) && Intrinsics.areEqual(this.offlistrrc, stateCostForDms.offlistrrc) && this.other_state_fitness == stateCostForDms.other_state_fitness && this.otpskip == stateCostForDms.otpskip && Intrinsics.areEqual(this.payment_complaint_type, stateCostForDms.payment_complaint_type) && this.payment_compounding_fee == stateCostForDms.payment_compounding_fee && this.paymentsch == stateCostForDms.paymentsch && this.pgiamount == stateCostForDms.pgiamount && this.printfit_inspection == stateCostForDms.printfit_inspection && Intrinsics.areEqual(this.printfitdays, stateCostForDms.printfitdays) && Intrinsics.areEqual(this.pur_cd, stateCostForDms.pur_cd) && this.rc_print_days_allowed == stateCostForDms.rc_print_days_allowed && Intrinsics.areEqual(this.rcprint_restriction, stateCostForDms.rcprint_restriction) && this.regnrenewalcheck == stateCostForDms.regnrenewalcheck && Intrinsics.areEqual(this.restrictapplinchallanpnd, stateCostForDms.restrictapplinchallanpnd) && Intrinsics.areEqual(this.restrictedfitnessblacklistcodes, stateCostForDms.restrictedfitnessblacklistcodes) && Intrinsics.areEqual(this.restrictedfitnesscenteroffcd, stateCostForDms.restrictedfitnesscenteroffcd) && Intrinsics.areEqual(this.state_cd, stateCostForDms.state_cd) && Intrinsics.areEqual(this.state_header, stateCostForDms.state_header) && Intrinsics.areEqual(this.stateauthtype, stateCostForDms.stateauthtype) && Intrinsics.areEqual(this.tax_nt_vehicle, stateCostForDms.tax_nt_vehicle) && Intrinsics.areEqual(this.tax_restrict_transprt_veh, stateCostForDms.tax_restrict_transprt_veh) && Intrinsics.areEqual(this.tax_stopping_msg, stateCostForDms.tax_stopping_msg) && this.taxaddrecovery == stateCostForDms.taxaddrecovery && this.taxexemptionconv == stateCostForDms.taxexemptionconv && Intrinsics.areEqual(this.tmState, stateCostForDms.tmState) && this.upload_doc == stateCostForDms.upload_doc;
    }

    public final Object getAadhar_based_autoapproval_purcd() {
        return this.aadhar_based_autoapproval_purcd;
    }

    public final boolean getAadharfailexempt() {
        return this.aadharfailexempt;
    }

    public final Object getAdv_vhclass() {
        return this.adv_vhclass;
    }

    public final boolean getAllow_fitness_all_rto() {
        return this.allow_fitness_all_rto;
    }

    public final String getAllowaapplinnonuse() {
        return this.allowaapplinnonuse;
    }

    public final String getAllowapplinpendingchallan() {
        return this.allowapplinpendingchallan;
    }

    public final boolean getAppt_bfr_payment() {
        return this.appt_bfr_payment;
    }

    public final Object getAutoapproval_purcd() {
        return this.autoapproval_purcd;
    }

    public final Object getBlacklistcondformula() {
        return this.blacklistcondformula;
    }

    public final String getBlacklistedpur() {
        return this.blacklistedpur;
    }

    public final Object getBlacklistrestrictpur_cd() {
        return this.blacklistrestrictpur_cd;
    }

    public final String getBook_app() {
        return this.book_app;
    }

    public final String getChallanpndingrestrictpur_cd() {
        return this.challanpndingrestrictpur_cd;
    }

    public final String getCombination_service_allowed_anywhere() {
        return this.combination_service_allowed_anywhere;
    }

    public final boolean getConversion_check() {
        return this.conversion_check;
    }

    public final String getDirectinwardpurcode() {
        return this.directinwardpurcode;
    }

    public final String getDms_url() {
        return this.dms_url;
    }

    public final Object getDmsurl() {
        return this.dmsurl;
    }

    public final Object getDoc_exemp_from() {
        return this.doc_exemp_from;
    }

    public final Object getDoc_exemp_upto() {
        return this.doc_exemp_upto;
    }

    public final boolean getDoc_merge() {
        return this.doc_merge;
    }

    public final String getEsign_pur_cd() {
        return this.esign_pur_cd;
    }

    public final String getFaceless_service_purcd() {
        return this.faceless_service_purcd;
    }

    public final String getFee_exempt_owner_cd() {
        return this.fee_exempt_owner_cd;
    }

    public final boolean getFit_fine_due_nid() {
        return this.fit_fine_due_nid;
    }

    public final String getFitness_nt_vehicle() {
        return this.fitness_nt_vehicle;
    }

    public final Object getFitnesscenterlist() {
        return this.fitnesscenterlist;
    }

    public final boolean getFitnessexpirymsgappt() {
        return this.fitnessexpirymsgappt;
    }

    public final boolean getForm23() {
        return this.form23;
    }

    public final boolean getForm23printwithvahantrans() {
        return this.form23printwithvahantrans;
    }

    public final String getInsuranceret() {
        return this.insuranceret;
    }

    public final boolean getIsaadhaarmobileupdate() {
        return this.isaadhaarmobileupdate;
    }

    public final boolean getIsallowfitnesscertificatefeeafterfitnessfail() {
        return this.isallowfitnesscertificatefeeafterfitnessfail;
    }

    public final boolean getIsconversionallowttont() {
        return this.isconversionallowttont;
    }

    public final boolean getIsdirectinward() {
        return this.isdirectinward;
    }

    public final boolean getIsesign() {
        return this.isesign;
    }

    public final boolean getIsfitnessallow() {
        return this.isfitnessallow;
    }

    public final boolean getIsfitnessdirectallow() {
        return this.isfitnessdirectallow;
    }

    public final boolean getIshptwithto_or_cainothr_rto() {
        return this.ishptwithto_or_cainothr_rto;
    }

    public final boolean getIsinschkrcsurr() {
        return this.isinschkrcsurr;
    }

    public final boolean getIsinsurance() {
        return this.isinsurance;
    }

    public final boolean getIsinsuranceentryrestricted() {
        return this.isinsuranceentryrestricted;
    }

    public final boolean getIsmandate_docs_bfr_rcpt() {
        return this.ismandate_docs_bfr_rcpt;
    }

    public final String getIsmobileregistered() {
        return this.ismobileregistered;
    }

    public final boolean getIsmultiple_app() {
        return this.ismultiple_app;
    }

    public final boolean getIsncrbblacklist() {
        return this.isncrbblacklist;
    }

    public final boolean getIsnocprint() {
        return this.isnocprint;
    }

    public final boolean getIsotpmobileto() {
        return this.isotpmobileto;
    }

    public final Object getIspermitallowservice() {
        return this.ispermitallowservice;
    }

    public final boolean getIspgitestpage() {
        return this.ispgitestpage;
    }

    public final boolean getIsprintrc() {
        return this.isprintrc;
    }

    public final boolean getIsprintrcpartcert() {
        return this.isprintrcpartcert;
    }

    public final boolean getIsprinttaxtoken() {
        return this.isprinttaxtoken;
    }

    public final boolean getIsrechkfailedtran() {
        return this.isrechkfailedtran;
    }

    public final boolean getIsrmaallowed() {
        return this.isrmaallowed;
    }

    public final boolean getIsrrcwithbasicservices() {
        return this.isrrcwithbasicservices;
    }

    public final boolean getIstaxallow() {
        return this.istaxallow;
    }

    public final boolean getIstdsenable() {
        return this.istdsenable;
    }

    public final boolean getIstemprc() {
        return this.istemprc;
    }

    public final String getModify_doc_dms_url() {
        return this.modify_doc_dms_url;
    }

    public final Object getModifydmsurl() {
        return this.modifydmsurl;
    }

    public final boolean getMul_hpa() {
        return this.mul_hpa;
    }

    public final boolean getMultiple_state_action() {
        return this.multiple_state_action;
    }

    public final int getNid_days() {
        return this.nid_days;
    }

    public final boolean getNidfitexempt() {
        return this.nidfitexempt;
    }

    public final boolean getNoc_ret() {
        return this.noc_ret;
    }

    public final boolean getNochpthpccheck() {
        return this.nochpthpccheck;
    }

    public final Object getOffline() {
        return this.offline;
    }

    public final Object getOfflistforrrc() {
        return this.offlistforrrc;
    }

    public final Object getOfflistrrc() {
        return this.offlistrrc;
    }

    public final boolean getOther_state_fitness() {
        return this.other_state_fitness;
    }

    public final boolean getOtpskip() {
        return this.otpskip;
    }

    public final Object getPayment_complaint_type() {
        return this.payment_complaint_type;
    }

    public final boolean getPayment_compounding_fee() {
        return this.payment_compounding_fee;
    }

    public final boolean getPaymentsch() {
        return this.paymentsch;
    }

    public final int getPgiamount() {
        return this.pgiamount;
    }

    public final boolean getPrintfit_inspection() {
        return this.printfit_inspection;
    }

    public final String getPrintfitdays() {
        return this.printfitdays;
    }

    public final String getPur_cd() {
        return this.pur_cd;
    }

    public final int getRc_print_days_allowed() {
        return this.rc_print_days_allowed;
    }

    public final Object getRcprint_restriction() {
        return this.rcprint_restriction;
    }

    public final boolean getRegnrenewalcheck() {
        return this.regnrenewalcheck;
    }

    public final Object getRestrictapplinchallanpnd() {
        return this.restrictapplinchallanpnd;
    }

    public final Object getRestrictedfitnessblacklistcodes() {
        return this.restrictedfitnessblacklistcodes;
    }

    public final Object getRestrictedfitnesscenteroffcd() {
        return this.restrictedfitnesscenteroffcd;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public final String getState_header() {
        return this.state_header;
    }

    public final Object getStateauthtype() {
        return this.stateauthtype;
    }

    public final String getTax_nt_vehicle() {
        return this.tax_nt_vehicle;
    }

    public final String getTax_restrict_transprt_veh() {
        return this.tax_restrict_transprt_veh;
    }

    public final String getTax_stopping_msg() {
        return this.tax_stopping_msg;
    }

    public final boolean getTaxaddrecovery() {
        return this.taxaddrecovery;
    }

    public final boolean getTaxexemptionconv() {
        return this.taxexemptionconv;
    }

    public final TmState getTmState() {
        return this.tmState;
    }

    public final boolean getUpload_doc() {
        return this.upload_doc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v102, types: [int] */
    /* JADX WARN: Type inference failed for: r1v104, types: [int] */
    /* JADX WARN: Type inference failed for: r1v106, types: [int] */
    /* JADX WARN: Type inference failed for: r1v108, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v110, types: [int] */
    /* JADX WARN: Type inference failed for: r1v112, types: [int] */
    /* JADX WARN: Type inference failed for: r1v114, types: [int] */
    /* JADX WARN: Type inference failed for: r1v116, types: [int] */
    /* JADX WARN: Type inference failed for: r1v118, types: [int] */
    /* JADX WARN: Type inference failed for: r1v120, types: [int] */
    /* JADX WARN: Type inference failed for: r1v126, types: [int] */
    /* JADX WARN: Type inference failed for: r1v128, types: [int] */
    /* JADX WARN: Type inference failed for: r1v132, types: [int] */
    /* JADX WARN: Type inference failed for: r1v134, types: [int] */
    /* JADX WARN: Type inference failed for: r1v136, types: [int] */
    /* JADX WARN: Type inference failed for: r1v144, types: [int] */
    /* JADX WARN: Type inference failed for: r1v146, types: [int] */
    /* JADX WARN: Type inference failed for: r1v150, types: [int] */
    /* JADX WARN: Type inference failed for: r1v152, types: [int] */
    /* JADX WARN: Type inference failed for: r1v156, types: [int] */
    /* JADX WARN: Type inference failed for: r1v166, types: [int] */
    /* JADX WARN: Type inference failed for: r1v186, types: [int] */
    /* JADX WARN: Type inference failed for: r1v188, types: [int] */
    /* JADX WARN: Type inference failed for: r1v192 */
    /* JADX WARN: Type inference failed for: r1v193 */
    /* JADX WARN: Type inference failed for: r1v194 */
    /* JADX WARN: Type inference failed for: r1v195 */
    /* JADX WARN: Type inference failed for: r1v196 */
    /* JADX WARN: Type inference failed for: r1v197 */
    /* JADX WARN: Type inference failed for: r1v198 */
    /* JADX WARN: Type inference failed for: r1v199 */
    /* JADX WARN: Type inference failed for: r1v200 */
    /* JADX WARN: Type inference failed for: r1v201 */
    /* JADX WARN: Type inference failed for: r1v202 */
    /* JADX WARN: Type inference failed for: r1v203 */
    /* JADX WARN: Type inference failed for: r1v204 */
    /* JADX WARN: Type inference failed for: r1v205 */
    /* JADX WARN: Type inference failed for: r1v206 */
    /* JADX WARN: Type inference failed for: r1v207 */
    /* JADX WARN: Type inference failed for: r1v208 */
    /* JADX WARN: Type inference failed for: r1v209 */
    /* JADX WARN: Type inference failed for: r1v210 */
    /* JADX WARN: Type inference failed for: r1v211 */
    /* JADX WARN: Type inference failed for: r1v212 */
    /* JADX WARN: Type inference failed for: r1v213 */
    /* JADX WARN: Type inference failed for: r1v214 */
    /* JADX WARN: Type inference failed for: r1v215 */
    /* JADX WARN: Type inference failed for: r1v216 */
    /* JADX WARN: Type inference failed for: r1v217 */
    /* JADX WARN: Type inference failed for: r1v218 */
    /* JADX WARN: Type inference failed for: r1v219 */
    /* JADX WARN: Type inference failed for: r1v220 */
    /* JADX WARN: Type inference failed for: r1v221 */
    /* JADX WARN: Type inference failed for: r1v222 */
    /* JADX WARN: Type inference failed for: r1v223 */
    /* JADX WARN: Type inference failed for: r1v224 */
    /* JADX WARN: Type inference failed for: r1v225 */
    /* JADX WARN: Type inference failed for: r1v226 */
    /* JADX WARN: Type inference failed for: r1v227 */
    /* JADX WARN: Type inference failed for: r1v228 */
    /* JADX WARN: Type inference failed for: r1v229 */
    /* JADX WARN: Type inference failed for: r1v230 */
    /* JADX WARN: Type inference failed for: r1v231 */
    /* JADX WARN: Type inference failed for: r1v232 */
    /* JADX WARN: Type inference failed for: r1v233 */
    /* JADX WARN: Type inference failed for: r1v234 */
    /* JADX WARN: Type inference failed for: r1v235 */
    /* JADX WARN: Type inference failed for: r1v236 */
    /* JADX WARN: Type inference failed for: r1v238 */
    /* JADX WARN: Type inference failed for: r1v239 */
    /* JADX WARN: Type inference failed for: r1v240 */
    /* JADX WARN: Type inference failed for: r1v241 */
    /* JADX WARN: Type inference failed for: r1v242 */
    /* JADX WARN: Type inference failed for: r1v243 */
    /* JADX WARN: Type inference failed for: r1v244 */
    /* JADX WARN: Type inference failed for: r1v245 */
    /* JADX WARN: Type inference failed for: r1v246 */
    /* JADX WARN: Type inference failed for: r1v247 */
    /* JADX WARN: Type inference failed for: r1v248 */
    /* JADX WARN: Type inference failed for: r1v249 */
    /* JADX WARN: Type inference failed for: r1v250 */
    /* JADX WARN: Type inference failed for: r1v251 */
    /* JADX WARN: Type inference failed for: r1v252 */
    /* JADX WARN: Type inference failed for: r1v253 */
    /* JADX WARN: Type inference failed for: r1v254 */
    /* JADX WARN: Type inference failed for: r1v255 */
    /* JADX WARN: Type inference failed for: r1v256 */
    /* JADX WARN: Type inference failed for: r1v257 */
    /* JADX WARN: Type inference failed for: r1v258 */
    /* JADX WARN: Type inference failed for: r1v259 */
    /* JADX WARN: Type inference failed for: r1v260 */
    /* JADX WARN: Type inference failed for: r1v261 */
    /* JADX WARN: Type inference failed for: r1v262 */
    /* JADX WARN: Type inference failed for: r1v263 */
    /* JADX WARN: Type inference failed for: r1v264 */
    /* JADX WARN: Type inference failed for: r1v265 */
    /* JADX WARN: Type inference failed for: r1v266 */
    /* JADX WARN: Type inference failed for: r1v267 */
    /* JADX WARN: Type inference failed for: r1v268 */
    /* JADX WARN: Type inference failed for: r1v269 */
    /* JADX WARN: Type inference failed for: r1v27, types: [int] */
    /* JADX WARN: Type inference failed for: r1v270 */
    /* JADX WARN: Type inference failed for: r1v271 */
    /* JADX WARN: Type inference failed for: r1v272 */
    /* JADX WARN: Type inference failed for: r1v273 */
    /* JADX WARN: Type inference failed for: r1v274 */
    /* JADX WARN: Type inference failed for: r1v275 */
    /* JADX WARN: Type inference failed for: r1v276 */
    /* JADX WARN: Type inference failed for: r1v277 */
    /* JADX WARN: Type inference failed for: r1v278 */
    /* JADX WARN: Type inference failed for: r1v279 */
    /* JADX WARN: Type inference failed for: r1v280 */
    /* JADX WARN: Type inference failed for: r1v281 */
    /* JADX WARN: Type inference failed for: r1v282 */
    /* JADX WARN: Type inference failed for: r1v283 */
    /* JADX WARN: Type inference failed for: r1v284 */
    /* JADX WARN: Type inference failed for: r1v285 */
    /* JADX WARN: Type inference failed for: r1v286 */
    /* JADX WARN: Type inference failed for: r1v287 */
    /* JADX WARN: Type inference failed for: r1v288 */
    /* JADX WARN: Type inference failed for: r1v289 */
    /* JADX WARN: Type inference failed for: r1v290 */
    /* JADX WARN: Type inference failed for: r1v291 */
    /* JADX WARN: Type inference failed for: r1v292 */
    /* JADX WARN: Type inference failed for: r1v39, types: [int] */
    /* JADX WARN: Type inference failed for: r1v48, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v54, types: [int] */
    /* JADX WARN: Type inference failed for: r1v56, types: [int] */
    /* JADX WARN: Type inference failed for: r1v58, types: [int] */
    /* JADX WARN: Type inference failed for: r1v62, types: [int] */
    /* JADX WARN: Type inference failed for: r1v64, types: [int] */
    /* JADX WARN: Type inference failed for: r1v66, types: [int] */
    /* JADX WARN: Type inference failed for: r1v68, types: [int] */
    /* JADX WARN: Type inference failed for: r1v70, types: [int] */
    /* JADX WARN: Type inference failed for: r1v72, types: [int] */
    /* JADX WARN: Type inference failed for: r1v74, types: [int] */
    /* JADX WARN: Type inference failed for: r1v76, types: [int] */
    /* JADX WARN: Type inference failed for: r1v78, types: [int] */
    /* JADX WARN: Type inference failed for: r1v80, types: [int] */
    /* JADX WARN: Type inference failed for: r1v82, types: [int] */
    /* JADX WARN: Type inference failed for: r1v84, types: [int] */
    /* JADX WARN: Type inference failed for: r1v86, types: [int] */
    /* JADX WARN: Type inference failed for: r1v88, types: [int] */
    /* JADX WARN: Type inference failed for: r1v92, types: [int] */
    /* JADX WARN: Type inference failed for: r1v94, types: [int] */
    /* JADX WARN: Type inference failed for: r1v96, types: [int] */
    /* JADX WARN: Type inference failed for: r1v98, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = this.aadhar_based_autoapproval_purcd.hashCode() * 31;
        boolean z = this.aadharfailexempt;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iHashCode2 = (((iHashCode + r1) * 31) + this.adv_vhclass.hashCode()) * 31;
        boolean z2 = this.allow_fitness_all_rto;
        ?? r12 = z2;
        if (z2) {
            r12 = 1;
        }
        int iHashCode3 = (((((iHashCode2 + r12) * 31) + this.allowaapplinnonuse.hashCode()) * 31) + this.allowapplinpendingchallan.hashCode()) * 31;
        boolean z3 = this.appt_bfr_payment;
        ?? r13 = z3;
        if (z3) {
            r13 = 1;
        }
        int iHashCode4 = (((((((((((((((iHashCode3 + r13) * 31) + this.autoapproval_purcd.hashCode()) * 31) + this.blacklistcondformula.hashCode()) * 31) + this.blacklistedpur.hashCode()) * 31) + this.blacklistrestrictpur_cd.hashCode()) * 31) + this.book_app.hashCode()) * 31) + this.challanpndingrestrictpur_cd.hashCode()) * 31) + this.combination_service_allowed_anywhere.hashCode()) * 31;
        boolean z4 = this.conversion_check;
        ?? r14 = z4;
        if (z4) {
            r14 = 1;
        }
        int iHashCode5 = (((((((((((iHashCode4 + r14) * 31) + this.directinwardpurcode.hashCode()) * 31) + this.dms_url.hashCode()) * 31) + this.dmsurl.hashCode()) * 31) + this.doc_exemp_from.hashCode()) * 31) + this.doc_exemp_upto.hashCode()) * 31;
        boolean z5 = this.doc_merge;
        ?? r15 = z5;
        if (z5) {
            r15 = 1;
        }
        int iHashCode6 = (((iHashCode5 + r15) * 31) + this.esign_pur_cd.hashCode()) * 31;
        String str = this.faceless_service_purcd;
        int iHashCode7 = (((iHashCode6 + (str == null ? 0 : str.hashCode())) * 31) + this.fee_exempt_owner_cd.hashCode()) * 31;
        boolean z6 = this.fit_fine_due_nid;
        ?? r16 = z6;
        if (z6) {
            r16 = 1;
        }
        int iHashCode8 = (((((iHashCode7 + r16) * 31) + this.fitness_nt_vehicle.hashCode()) * 31) + this.fitnesscenterlist.hashCode()) * 31;
        boolean z7 = this.fitnessexpirymsgappt;
        ?? r17 = z7;
        if (z7) {
            r17 = 1;
        }
        int i = (iHashCode8 + r17) * 31;
        boolean z8 = this.form23;
        ?? r18 = z8;
        if (z8) {
            r18 = 1;
        }
        int i2 = (i + r18) * 31;
        boolean z9 = this.form23printwithvahantrans;
        ?? r19 = z9;
        if (z9) {
            r19 = 1;
        }
        int iHashCode9 = (((i2 + r19) * 31) + this.insuranceret.hashCode()) * 31;
        boolean z10 = this.is_penalty_applicable;
        ?? r110 = z10;
        if (z10) {
            r110 = 1;
        }
        int i3 = (iHashCode9 + r110) * 31;
        boolean z11 = this.is_tax_installment;
        ?? r111 = z11;
        if (z11) {
            r111 = 1;
        }
        int i4 = (i3 + r111) * 31;
        boolean z12 = this.isaadhaarmobileupdate;
        ?? r112 = z12;
        if (z12) {
            r112 = 1;
        }
        int i5 = (i4 + r112) * 31;
        boolean z13 = this.isallowfitnesscertificatefeeafterfitnessfail;
        ?? r113 = z13;
        if (z13) {
            r113 = 1;
        }
        int i6 = (i5 + r113) * 31;
        boolean z14 = this.isconversionallowttont;
        ?? r114 = z14;
        if (z14) {
            r114 = 1;
        }
        int i7 = (i6 + r114) * 31;
        boolean z15 = this.isdirectinward;
        ?? r115 = z15;
        if (z15) {
            r115 = 1;
        }
        int i8 = (i7 + r115) * 31;
        boolean z16 = this.isesign;
        ?? r116 = z16;
        if (z16) {
            r116 = 1;
        }
        int i9 = (i8 + r116) * 31;
        boolean z17 = this.isfitnessallow;
        ?? r117 = z17;
        if (z17) {
            r117 = 1;
        }
        int i10 = (i9 + r117) * 31;
        boolean z18 = this.isfitnessdirectallow;
        ?? r118 = z18;
        if (z18) {
            r118 = 1;
        }
        int i11 = (i10 + r118) * 31;
        boolean z19 = this.ishptwithto_or_cainothr_rto;
        ?? r119 = z19;
        if (z19) {
            r119 = 1;
        }
        int i12 = (i11 + r119) * 31;
        boolean z20 = this.isinschkrcsurr;
        ?? r120 = z20;
        if (z20) {
            r120 = 1;
        }
        int i13 = (i12 + r120) * 31;
        boolean z21 = this.isinsurance;
        ?? r121 = z21;
        if (z21) {
            r121 = 1;
        }
        int i14 = (i13 + r121) * 31;
        boolean z22 = this.isinsuranceentryrestricted;
        ?? r122 = z22;
        if (z22) {
            r122 = 1;
        }
        int i15 = (i14 + r122) * 31;
        boolean z23 = this.ismandate_docs_bfr_rcpt;
        ?? r123 = z23;
        if (z23) {
            r123 = 1;
        }
        int iHashCode10 = (((i15 + r123) * 31) + this.ismobileregistered.hashCode()) * 31;
        boolean z24 = this.ismultiple_app;
        ?? r124 = z24;
        if (z24) {
            r124 = 1;
        }
        int i16 = (iHashCode10 + r124) * 31;
        boolean z25 = this.isncrbblacklist;
        ?? r125 = z25;
        if (z25) {
            r125 = 1;
        }
        int i17 = (i16 + r125) * 31;
        boolean z26 = this.isnocprint;
        ?? r126 = z26;
        if (z26) {
            r126 = 1;
        }
        int i18 = (i17 + r126) * 31;
        boolean z27 = this.isotpmobileto;
        ?? r127 = z27;
        if (z27) {
            r127 = 1;
        }
        int iHashCode11 = (((i18 + r127) * 31) + this.ispermitallowservice.hashCode()) * 31;
        boolean z28 = this.ispgitestpage;
        ?? r128 = z28;
        if (z28) {
            r128 = 1;
        }
        int i19 = (iHashCode11 + r128) * 31;
        boolean z29 = this.isprintrc;
        ?? r129 = z29;
        if (z29) {
            r129 = 1;
        }
        int i20 = (i19 + r129) * 31;
        boolean z30 = this.isprintrcpartcert;
        ?? r130 = z30;
        if (z30) {
            r130 = 1;
        }
        int i21 = (i20 + r130) * 31;
        boolean z31 = this.isprinttaxtoken;
        ?? r131 = z31;
        if (z31) {
            r131 = 1;
        }
        int i22 = (i21 + r131) * 31;
        boolean z32 = this.isrechkfailedtran;
        ?? r132 = z32;
        if (z32) {
            r132 = 1;
        }
        int i23 = (i22 + r132) * 31;
        boolean z33 = this.isrmaallowed;
        ?? r133 = z33;
        if (z33) {
            r133 = 1;
        }
        int i24 = (i23 + r133) * 31;
        boolean z34 = this.isrrcwithbasicservices;
        ?? r134 = z34;
        if (z34) {
            r134 = 1;
        }
        int i25 = (i24 + r134) * 31;
        boolean z35 = this.istaxallow;
        ?? r135 = z35;
        if (z35) {
            r135 = 1;
        }
        int i26 = (i25 + r135) * 31;
        boolean z36 = this.istdsenable;
        ?? r136 = z36;
        if (z36) {
            r136 = 1;
        }
        int i27 = (i26 + r136) * 31;
        boolean z37 = this.istemprc;
        ?? r137 = z37;
        if (z37) {
            r137 = 1;
        }
        int iHashCode12 = (((((i27 + r137) * 31) + this.modify_doc_dms_url.hashCode()) * 31) + this.modifydmsurl.hashCode()) * 31;
        boolean z38 = this.mul_hpa;
        ?? r138 = z38;
        if (z38) {
            r138 = 1;
        }
        int i28 = (iHashCode12 + r138) * 31;
        boolean z39 = this.multiple_state_action;
        ?? r139 = z39;
        if (z39) {
            r139 = 1;
        }
        int iHashCode13 = (((i28 + r139) * 31) + Integer.hashCode(this.nid_days)) * 31;
        boolean z40 = this.nidfitexempt;
        ?? r140 = z40;
        if (z40) {
            r140 = 1;
        }
        int i29 = (iHashCode13 + r140) * 31;
        boolean z41 = this.noc_ret;
        ?? r141 = z41;
        if (z41) {
            r141 = 1;
        }
        int i30 = (i29 + r141) * 31;
        boolean z42 = this.nochpthpccheck;
        ?? r142 = z42;
        if (z42) {
            r142 = 1;
        }
        int iHashCode14 = (((((((i30 + r142) * 31) + this.offline.hashCode()) * 31) + this.offlistforrrc.hashCode()) * 31) + this.offlistrrc.hashCode()) * 31;
        boolean z43 = this.other_state_fitness;
        ?? r143 = z43;
        if (z43) {
            r143 = 1;
        }
        int i31 = (iHashCode14 + r143) * 31;
        boolean z44 = this.otpskip;
        ?? r144 = z44;
        if (z44) {
            r144 = 1;
        }
        int iHashCode15 = (((i31 + r144) * 31) + this.payment_complaint_type.hashCode()) * 31;
        boolean z45 = this.payment_compounding_fee;
        ?? r145 = z45;
        if (z45) {
            r145 = 1;
        }
        int i32 = (iHashCode15 + r145) * 31;
        boolean z46 = this.paymentsch;
        ?? r146 = z46;
        if (z46) {
            r146 = 1;
        }
        int iHashCode16 = (((i32 + r146) * 31) + Integer.hashCode(this.pgiamount)) * 31;
        boolean z47 = this.printfit_inspection;
        ?? r147 = z47;
        if (z47) {
            r147 = 1;
        }
        int iHashCode17 = (((((((((iHashCode16 + r147) * 31) + this.printfitdays.hashCode()) * 31) + this.pur_cd.hashCode()) * 31) + Integer.hashCode(this.rc_print_days_allowed)) * 31) + this.rcprint_restriction.hashCode()) * 31;
        boolean z48 = this.regnrenewalcheck;
        ?? r148 = z48;
        if (z48) {
            r148 = 1;
        }
        int iHashCode18 = (((((((((((((((((((iHashCode17 + r148) * 31) + this.restrictapplinchallanpnd.hashCode()) * 31) + this.restrictedfitnessblacklistcodes.hashCode()) * 31) + this.restrictedfitnesscenteroffcd.hashCode()) * 31) + this.state_cd.hashCode()) * 31) + this.state_header.hashCode()) * 31) + this.stateauthtype.hashCode()) * 31) + this.tax_nt_vehicle.hashCode()) * 31) + this.tax_restrict_transprt_veh.hashCode()) * 31) + this.tax_stopping_msg.hashCode()) * 31;
        boolean z49 = this.taxaddrecovery;
        ?? r149 = z49;
        if (z49) {
            r149 = 1;
        }
        int i33 = (iHashCode18 + r149) * 31;
        boolean z50 = this.taxexemptionconv;
        ?? r150 = z50;
        if (z50) {
            r150 = 1;
        }
        int iHashCode19 = (((i33 + r150) * 31) + this.tmState.hashCode()) * 31;
        boolean z51 = this.upload_doc;
        return iHashCode19 + (z51 ? 1 : z51);
    }

    public final boolean is_penalty_applicable() {
        return this.is_penalty_applicable;
    }

    public final boolean is_tax_installment() {
        return this.is_tax_installment;
    }

    public String toString() {
        return "StateCostForDms(aadhar_based_autoapproval_purcd=" + this.aadhar_based_autoapproval_purcd + ", aadharfailexempt=" + this.aadharfailexempt + ", adv_vhclass=" + this.adv_vhclass + ", allow_fitness_all_rto=" + this.allow_fitness_all_rto + ", allowaapplinnonuse=" + this.allowaapplinnonuse + ", allowapplinpendingchallan=" + this.allowapplinpendingchallan + ", appt_bfr_payment=" + this.appt_bfr_payment + ", autoapproval_purcd=" + this.autoapproval_purcd + ", blacklistcondformula=" + this.blacklistcondformula + ", blacklistedpur=" + this.blacklistedpur + ", blacklistrestrictpur_cd=" + this.blacklistrestrictpur_cd + ", book_app=" + this.book_app + ", challanpndingrestrictpur_cd=" + this.challanpndingrestrictpur_cd + ", combination_service_allowed_anywhere=" + this.combination_service_allowed_anywhere + ", conversion_check=" + this.conversion_check + ", directinwardpurcode=" + this.directinwardpurcode + ", dms_url=" + this.dms_url + ", dmsurl=" + this.dmsurl + ", doc_exemp_from=" + this.doc_exemp_from + ", doc_exemp_upto=" + this.doc_exemp_upto + ", doc_merge=" + this.doc_merge + ", esign_pur_cd=" + this.esign_pur_cd + ", faceless_service_purcd=" + this.faceless_service_purcd + ", fee_exempt_owner_cd=" + this.fee_exempt_owner_cd + ", fit_fine_due_nid=" + this.fit_fine_due_nid + ", fitness_nt_vehicle=" + this.fitness_nt_vehicle + ", fitnesscenterlist=" + this.fitnesscenterlist + ", fitnessexpirymsgappt=" + this.fitnessexpirymsgappt + ", form23=" + this.form23 + ", form23printwithvahantrans=" + this.form23printwithvahantrans + ", insuranceret=" + this.insuranceret + ", is_penalty_applicable=" + this.is_penalty_applicable + ", is_tax_installment=" + this.is_tax_installment + ", isaadhaarmobileupdate=" + this.isaadhaarmobileupdate + ", isallowfitnesscertificatefeeafterfitnessfail=" + this.isallowfitnesscertificatefeeafterfitnessfail + ", isconversionallowttont=" + this.isconversionallowttont + ", isdirectinward=" + this.isdirectinward + ", isesign=" + this.isesign + ", isfitnessallow=" + this.isfitnessallow + ", isfitnessdirectallow=" + this.isfitnessdirectallow + ", ishptwithto_or_cainothr_rto=" + this.ishptwithto_or_cainothr_rto + ", isinschkrcsurr=" + this.isinschkrcsurr + ", isinsurance=" + this.isinsurance + ", isinsuranceentryrestricted=" + this.isinsuranceentryrestricted + ", ismandate_docs_bfr_rcpt=" + this.ismandate_docs_bfr_rcpt + ", ismobileregistered=" + this.ismobileregistered + ", ismultiple_app=" + this.ismultiple_app + ", isncrbblacklist=" + this.isncrbblacklist + ", isnocprint=" + this.isnocprint + ", isotpmobileto=" + this.isotpmobileto + ", ispermitallowservice=" + this.ispermitallowservice + ", ispgitestpage=" + this.ispgitestpage + ", isprintrc=" + this.isprintrc + ", isprintrcpartcert=" + this.isprintrcpartcert + ", isprinttaxtoken=" + this.isprinttaxtoken + ", isrechkfailedtran=" + this.isrechkfailedtran + ", isrmaallowed=" + this.isrmaallowed + ", isrrcwithbasicservices=" + this.isrrcwithbasicservices + ", istaxallow=" + this.istaxallow + ", istdsenable=" + this.istdsenable + ", istemprc=" + this.istemprc + ", modify_doc_dms_url=" + this.modify_doc_dms_url + ", modifydmsurl=" + this.modifydmsurl + ", mul_hpa=" + this.mul_hpa + ", multiple_state_action=" + this.multiple_state_action + ", nid_days=" + this.nid_days + ", nidfitexempt=" + this.nidfitexempt + ", noc_ret=" + this.noc_ret + ", nochpthpccheck=" + this.nochpthpccheck + ", offline=" + this.offline + ", offlistforrrc=" + this.offlistforrrc + ", offlistrrc=" + this.offlistrrc + ", other_state_fitness=" + this.other_state_fitness + ", otpskip=" + this.otpskip + ", payment_complaint_type=" + this.payment_complaint_type + ", payment_compounding_fee=" + this.payment_compounding_fee + ", paymentsch=" + this.paymentsch + ", pgiamount=" + this.pgiamount + ", printfit_inspection=" + this.printfit_inspection + ", printfitdays=" + this.printfitdays + ", pur_cd=" + this.pur_cd + ", rc_print_days_allowed=" + this.rc_print_days_allowed + ", rcprint_restriction=" + this.rcprint_restriction + ", regnrenewalcheck=" + this.regnrenewalcheck + ", restrictapplinchallanpnd=" + this.restrictapplinchallanpnd + ", restrictedfitnessblacklistcodes=" + this.restrictedfitnessblacklistcodes + ", restrictedfitnesscenteroffcd=" + this.restrictedfitnesscenteroffcd + ", state_cd=" + this.state_cd + ", state_header=" + this.state_header + ", stateauthtype=" + this.stateauthtype + ", tax_nt_vehicle=" + this.tax_nt_vehicle + ", tax_restrict_transprt_veh=" + this.tax_restrict_transprt_veh + ", tax_stopping_msg=" + this.tax_stopping_msg + ", taxaddrecovery=" + this.taxaddrecovery + ", taxexemptionconv=" + this.taxexemptionconv + ", tmState=" + this.tmState + ", upload_doc=" + this.upload_doc + ')';
    }
}
