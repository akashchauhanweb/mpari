package com.nic.mparivahan.DLServicesAuth.Model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000!\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0003\b\u0090\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÝ\u0005\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0001\u0012\u0006\u0010\b\u001a\u00020\u0001\u0012\u0006\u0010\t\u001a\u00020\u0001\u0012\u0006\u0010\n\u001a\u00020\u0001\u0012\u0006\u0010\u000b\u001a\u00020\u0001\u0012\u0006\u0010\f\u001a\u00020\u0001\u0012\u0006\u0010\r\u001a\u00020\u0001\u0012\u0006\u0010\u000e\u001a\u00020\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0001\u0012\u0006\u0010\u0014\u001a\u00020\u0001\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0001\u0012\u0006\u0010\u0017\u001a\u00020\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0001\u0012\u0006\u0010\u0019\u001a\u00020\u0001\u0012\u0006\u0010\u001a\u001a\u00020\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0001\u0012\u0006\u0010\u001c\u001a\u00020\u0010\u0012\u0006\u0010\u001d\u001a\u00020\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u0001\u0012\u0006\u0010\u001f\u001a\u00020\u0001\u0012\u0006\u0010 \u001a\u00020\u0001\u0012\u0006\u0010!\u001a\u00020\u0010\u0012\u0006\u0010\"\u001a\u00020\u0010\u0012\u0006\u0010#\u001a\u00020\u0010\u0012\u0006\u0010$\u001a\u00020\u0001\u0012\u0006\u0010%\u001a\u00020\u0010\u0012\u0006\u0010&\u001a\u00020\u0010\u0012\u0006\u0010'\u001a\u00020\u0005\u0012\u0006\u0010(\u001a\u00020\u0010\u0012\u0006\u0010)\u001a\u00020\u0001\u0012\u0006\u0010*\u001a\u00020\u0001\u0012\u0006\u0010+\u001a\u00020\u0010\u0012\u0006\u0010,\u001a\u00020\u0001\u0012\u0006\u0010-\u001a\u00020\u0001\u0012\u0006\u0010.\u001a\u00020\u0001\u0012\u0006\u0010/\u001a\u00020\u0001\u0012\u0006\u00100\u001a\u00020\u0001\u0012\u0006\u00101\u001a\u00020\u0001\u0012\u0006\u00102\u001a\u00020\u0001\u0012\u0006\u00103\u001a\u00020\u0010\u0012\u0006\u00104\u001a\u00020\u0001\u0012\u0006\u00105\u001a\u00020\u0001\u0012\u0006\u00106\u001a\u00020\u0001\u0012\u0006\u00107\u001a\u00020\u0010\u0012\u0006\u00108\u001a\u00020\u0010\u0012\u0006\u00109\u001a\u00020\u0010\u0012\u0006\u0010:\u001a\u00020\u0001\u0012\u0006\u0010;\u001a\u00020\u0001\u0012\u0006\u0010<\u001a\u00020\u0001\u0012\u0006\u0010=\u001a\u00020\u0001\u0012\u0006\u0010>\u001a\u00020\u0001\u0012\u0006\u0010?\u001a\u00020\u0001\u0012\u0006\u0010@\u001a\u00020\u0005\u0012\u0006\u0010A\u001a\u00020\u0001\u0012\u0006\u0010B\u001a\u00020\u0001\u0012\u0006\u0010C\u001a\u00020\u0001\u0012\u0006\u0010D\u001a\u00020\u0001\u0012\u0006\u0010E\u001a\u00020\u0005\u0012\u0006\u0010F\u001a\u00020\u0010\u0012\u0006\u0010G\u001a\u00020\u0001\u0012\u0006\u0010H\u001a\u00020\u0001\u0012\u0006\u0010I\u001a\u00020\u0001\u0012\u0006\u0010J\u001a\u00020\u0010\u0012\u0006\u0010K\u001a\u00020\u0010\u0012\u0006\u0010L\u001a\u00020\u0010\u0012\u0006\u0010M\u001a\u00020\u0001\u0012\u0006\u0010N\u001a\u00020\u0010\u0012\u0006\u0010O\u001a\u00020\u0010\u0012\u0006\u0010P\u001a\u00020\u0010\u0012\u0006\u0010Q\u001a\u00020\u0001\u0012\u0006\u0010R\u001a\u00020\u0001\u0012\u0006\u0010S\u001a\u00020\u0001\u0012\u0006\u0010T\u001a\u00020\u0001\u0012\u0006\u0010U\u001a\u00020\u0001\u0012\u0006\u0010V\u001a\u00020\u0001\u0012\u0006\u0010W\u001a\u00020\u0005\u0012\u0006\u0010X\u001a\u00020\u0001\u0012\u0006\u0010Y\u001a\u00020\u0001\u0012\u0006\u0010Z\u001a\u00020\u0001\u0012\u0006\u0010[\u001a\u00020\u0001\u0012\u0006\u0010\\\u001a\u00020\u0005\u0012\u0006\u0010]\u001a\u00020\u0001\u0012\u0006\u0010^\u001a\u00020\u0001\u0012\u0006\u0010_\u001a\u00020\u0001¢\u0006\u0002\u0010`J\n\u0010À\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Á\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010Â\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010Ã\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010Ä\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010Å\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010Æ\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010Ç\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010È\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010É\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010Ê\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010Ë\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010Ì\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010Í\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010Î\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010Ï\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010Ð\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010Ñ\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010Ò\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010Ó\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010Ô\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010Õ\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010Ö\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010×\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010Ø\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010Ù\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010Ú\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010Û\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010Ü\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010Ý\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010Þ\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010ß\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010à\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010á\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010â\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010ã\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010ä\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010å\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010æ\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010ç\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010è\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010é\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010ê\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010ë\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010ì\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010í\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010î\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010ï\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010ð\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010ñ\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010ò\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010ó\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010ô\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010õ\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010ö\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010÷\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010ø\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010ù\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010ú\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010û\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010ü\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010ý\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010þ\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010ÿ\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010\u0080\u0002\u001a\u00020\u0001HÆ\u0003J\n\u0010\u0081\u0002\u001a\u00020\u0001HÆ\u0003J\n\u0010\u0082\u0002\u001a\u00020\u0001HÆ\u0003J\n\u0010\u0083\u0002\u001a\u00020\u0010HÆ\u0003J\n\u0010\u0084\u0002\u001a\u00020\u0010HÆ\u0003J\n\u0010\u0085\u0002\u001a\u00020\u0010HÆ\u0003J\n\u0010\u0086\u0002\u001a\u00020\u0001HÆ\u0003J\n\u0010\u0087\u0002\u001a\u00020\u0010HÆ\u0003J\n\u0010\u0088\u0002\u001a\u00020\u0010HÆ\u0003J\n\u0010\u0089\u0002\u001a\u00020\u0010HÆ\u0003J\n\u0010\u008a\u0002\u001a\u00020\u0001HÆ\u0003J\n\u0010\u008b\u0002\u001a\u00020\u0001HÆ\u0003J\n\u0010\u008c\u0002\u001a\u00020\u0001HÆ\u0003J\n\u0010\u008d\u0002\u001a\u00020\u0001HÆ\u0003J\n\u0010\u008e\u0002\u001a\u00020\u0001HÆ\u0003J\n\u0010\u008f\u0002\u001a\u00020\u0001HÆ\u0003J\n\u0010\u0090\u0002\u001a\u00020\u0001HÆ\u0003J\n\u0010\u0091\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0092\u0002\u001a\u00020\u0001HÆ\u0003J\n\u0010\u0093\u0002\u001a\u00020\u0001HÆ\u0003J\n\u0010\u0094\u0002\u001a\u00020\u0001HÆ\u0003J\n\u0010\u0095\u0002\u001a\u00020\u0001HÆ\u0003J\n\u0010\u0096\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0097\u0002\u001a\u00020\u0001HÆ\u0003J\n\u0010\u0098\u0002\u001a\u00020\u0001HÆ\u0003J\n\u0010\u0099\u0002\u001a\u00020\u0001HÆ\u0003J\n\u0010\u009a\u0002\u001a\u00020\u0001HÆ\u0003J\u0098\u0007\u0010\u009b\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u001a\u001a\u00020\u00102\b\b\u0002\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010\u001c\u001a\u00020\u00102\b\b\u0002\u0010\u001d\u001a\u00020\u00102\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020\u00012\b\b\u0002\u0010!\u001a\u00020\u00102\b\b\u0002\u0010\"\u001a\u00020\u00102\b\b\u0002\u0010#\u001a\u00020\u00102\b\b\u0002\u0010$\u001a\u00020\u00012\b\b\u0002\u0010%\u001a\u00020\u00102\b\b\u0002\u0010&\u001a\u00020\u00102\b\b\u0002\u0010'\u001a\u00020\u00052\b\b\u0002\u0010(\u001a\u00020\u00102\b\b\u0002\u0010)\u001a\u00020\u00012\b\b\u0002\u0010*\u001a\u00020\u00012\b\b\u0002\u0010+\u001a\u00020\u00102\b\b\u0002\u0010,\u001a\u00020\u00012\b\b\u0002\u0010-\u001a\u00020\u00012\b\b\u0002\u0010.\u001a\u00020\u00012\b\b\u0002\u0010/\u001a\u00020\u00012\b\b\u0002\u00100\u001a\u00020\u00012\b\b\u0002\u00101\u001a\u00020\u00012\b\b\u0002\u00102\u001a\u00020\u00012\b\b\u0002\u00103\u001a\u00020\u00102\b\b\u0002\u00104\u001a\u00020\u00012\b\b\u0002\u00105\u001a\u00020\u00012\b\b\u0002\u00106\u001a\u00020\u00012\b\b\u0002\u00107\u001a\u00020\u00102\b\b\u0002\u00108\u001a\u00020\u00102\b\b\u0002\u00109\u001a\u00020\u00102\b\b\u0002\u0010:\u001a\u00020\u00012\b\b\u0002\u0010;\u001a\u00020\u00012\b\b\u0002\u0010<\u001a\u00020\u00012\b\b\u0002\u0010=\u001a\u00020\u00012\b\b\u0002\u0010>\u001a\u00020\u00012\b\b\u0002\u0010?\u001a\u00020\u00012\b\b\u0002\u0010@\u001a\u00020\u00052\b\b\u0002\u0010A\u001a\u00020\u00012\b\b\u0002\u0010B\u001a\u00020\u00012\b\b\u0002\u0010C\u001a\u00020\u00012\b\b\u0002\u0010D\u001a\u00020\u00012\b\b\u0002\u0010E\u001a\u00020\u00052\b\b\u0002\u0010F\u001a\u00020\u00102\b\b\u0002\u0010G\u001a\u00020\u00012\b\b\u0002\u0010H\u001a\u00020\u00012\b\b\u0002\u0010I\u001a\u00020\u00012\b\b\u0002\u0010J\u001a\u00020\u00102\b\b\u0002\u0010K\u001a\u00020\u00102\b\b\u0002\u0010L\u001a\u00020\u00102\b\b\u0002\u0010M\u001a\u00020\u00012\b\b\u0002\u0010N\u001a\u00020\u00102\b\b\u0002\u0010O\u001a\u00020\u00102\b\b\u0002\u0010P\u001a\u00020\u00102\b\b\u0002\u0010Q\u001a\u00020\u00012\b\b\u0002\u0010R\u001a\u00020\u00012\b\b\u0002\u0010S\u001a\u00020\u00012\b\b\u0002\u0010T\u001a\u00020\u00012\b\b\u0002\u0010U\u001a\u00020\u00012\b\b\u0002\u0010V\u001a\u00020\u00012\b\b\u0002\u0010W\u001a\u00020\u00052\b\b\u0002\u0010X\u001a\u00020\u00012\b\b\u0002\u0010Y\u001a\u00020\u00012\b\b\u0002\u0010Z\u001a\u00020\u00012\b\b\u0002\u0010[\u001a\u00020\u00012\b\b\u0002\u0010\\\u001a\u00020\u00052\b\b\u0002\u0010]\u001a\u00020\u00012\b\b\u0002\u0010^\u001a\u00020\u00012\b\b\u0002\u0010_\u001a\u00020\u0001HÆ\u0001J\u0015\u0010\u009c\u0002\u001a\u00020\u00032\t\u0010\u009d\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u009e\u0002\u001a\u00020\u0005HÖ\u0001J\n\u0010\u009f\u0002\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\ba\u0010bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bc\u0010dR\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\be\u0010fR\u0011\u0010\u0007\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bg\u0010fR\u0011\u0010\b\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bh\u0010fR\u0011\u0010\t\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bi\u0010fR\u0011\u0010\n\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bj\u0010fR\u0011\u0010\u000b\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bk\u0010fR\u0011\u0010\f\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bl\u0010fR\u0011\u0010\r\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bm\u0010fR\u0011\u0010\u000e\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bn\u0010fR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\bo\u0010pR\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\bq\u0010pR\u0011\u0010\u0012\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\br\u0010pR\u0011\u0010\u0013\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bs\u0010fR\u0011\u0010\u0014\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bt\u0010fR\u0011\u0010\u0015\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\bu\u0010pR\u0011\u0010\u0016\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bv\u0010fR\u0011\u0010\u0017\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\bw\u0010pR\u0011\u0010\u0018\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bx\u0010fR\u0011\u0010\u0019\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\by\u0010fR\u0011\u0010\u001a\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\bz\u0010pR\u0011\u0010\u001b\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b{\u0010fR\u0011\u0010\u001c\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b|\u0010pR\u0011\u0010\u001d\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b}\u0010pR\u0011\u0010\u001e\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b~\u0010fR\u0011\u0010\u001f\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010fR\u0012\u0010 \u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010fR\u0012\u0010!\u001a\u00020\u0010¢\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010pR\u0012\u0010\"\u001a\u00020\u0010¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010pR\u0012\u0010#\u001a\u00020\u0010¢\u0006\t\n\u0000\u001a\u0005\b\u0083\u0001\u0010pR\u0012\u0010$\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\b\u0084\u0001\u0010fR\u0012\u0010%\u001a\u00020\u0010¢\u0006\t\n\u0000\u001a\u0005\b\u0085\u0001\u0010pR\u0012\u0010&\u001a\u00020\u0010¢\u0006\t\n\u0000\u001a\u0005\b\u0086\u0001\u0010pR\u0012\u0010'\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b\u0087\u0001\u0010dR\u0012\u0010(\u001a\u00020\u0010¢\u0006\t\n\u0000\u001a\u0005\b\u0088\u0001\u0010pR\u0012\u0010)\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\b\u0089\u0001\u0010fR\u0012\u0010*\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\b\u008a\u0001\u0010fR\u0012\u0010+\u001a\u00020\u0010¢\u0006\t\n\u0000\u001a\u0005\b\u008b\u0001\u0010pR\u0012\u0010,\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\b\u008c\u0001\u0010fR\u0012\u0010-\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\b\u008d\u0001\u0010fR\u0012\u0010.\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\b\u008e\u0001\u0010fR\u0012\u0010/\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\b\u008f\u0001\u0010fR\u0012\u00100\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\b\u0090\u0001\u0010fR\u0012\u00101\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\b\u0091\u0001\u0010fR\u0012\u00102\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\b\u0092\u0001\u0010fR\u0012\u00103\u001a\u00020\u0010¢\u0006\t\n\u0000\u001a\u0005\b\u0093\u0001\u0010pR\u0012\u00104\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\b\u0094\u0001\u0010fR\u0012\u00105\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\b\u0095\u0001\u0010fR\u0012\u00106\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\b\u0096\u0001\u0010fR\u0012\u00107\u001a\u00020\u0010¢\u0006\t\n\u0000\u001a\u0005\b\u0097\u0001\u0010pR\u0012\u00108\u001a\u00020\u0010¢\u0006\t\n\u0000\u001a\u0005\b\u0098\u0001\u0010pR\u0012\u00109\u001a\u00020\u0010¢\u0006\t\n\u0000\u001a\u0005\b\u0099\u0001\u0010pR\u0012\u0010:\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\b\u009a\u0001\u0010fR\u0012\u0010;\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\b\u009b\u0001\u0010fR\u0012\u0010<\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\b\u009c\u0001\u0010fR\u0012\u0010=\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\b\u009d\u0001\u0010fR\u0012\u0010>\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\b\u009e\u0001\u0010fR\u0012\u0010?\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\b\u009f\u0001\u0010fR\u0012\u0010@\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b \u0001\u0010dR\u0012\u0010A\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\b¡\u0001\u0010fR\u0012\u0010B\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\b¢\u0001\u0010fR\u0012\u0010C\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\b£\u0001\u0010fR\u0012\u0010D\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\b¤\u0001\u0010fR\u0012\u0010E\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b¥\u0001\u0010dR\u0012\u0010F\u001a\u00020\u0010¢\u0006\t\n\u0000\u001a\u0005\b¦\u0001\u0010pR\u0012\u0010G\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\b§\u0001\u0010fR\u0012\u0010H\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\b¨\u0001\u0010fR\u0012\u0010I\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\b©\u0001\u0010fR\u0012\u0010J\u001a\u00020\u0010¢\u0006\t\n\u0000\u001a\u0005\bª\u0001\u0010pR\u0012\u0010K\u001a\u00020\u0010¢\u0006\t\n\u0000\u001a\u0005\b«\u0001\u0010pR\u0012\u0010L\u001a\u00020\u0010¢\u0006\t\n\u0000\u001a\u0005\b¬\u0001\u0010pR\u0012\u0010M\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\b\u00ad\u0001\u0010fR\u0012\u0010N\u001a\u00020\u0010¢\u0006\t\n\u0000\u001a\u0005\b®\u0001\u0010pR\u0012\u0010O\u001a\u00020\u0010¢\u0006\t\n\u0000\u001a\u0005\b¯\u0001\u0010pR\u0012\u0010P\u001a\u00020\u0010¢\u0006\t\n\u0000\u001a\u0005\b°\u0001\u0010pR\u0012\u0010Q\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\b±\u0001\u0010fR\u0012\u0010R\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\b²\u0001\u0010fR\u0012\u0010S\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\b³\u0001\u0010fR\u0012\u0010T\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\b´\u0001\u0010fR\u0012\u0010U\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\bµ\u0001\u0010fR\u0012\u0010V\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\b¶\u0001\u0010fR\u0012\u0010W\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b·\u0001\u0010dR\u0012\u0010X\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\b¸\u0001\u0010fR\u0012\u0010Y\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\b¹\u0001\u0010fR\u0012\u0010Z\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\bº\u0001\u0010fR\u0012\u0010[\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\b»\u0001\u0010fR\u0012\u0010\\\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b¼\u0001\u0010dR\u0012\u0010]\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\b½\u0001\u0010fR\u0012\u0010^\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\b¾\u0001\u0010fR\u0012\u0010_\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\b¿\u0001\u0010f¨\u0006 \u0002"}, d2 = {"Lcom/nic/mparivahan/DLServicesAuth/Model/BioObj;", "", "aadharAuthenticated", "", "applEmpcatg", "", "biPhoto", "bioAadhaarName", "bioAadhaarNo", "bioAadharEnrollNo", "bioAddclm1", "bioAddclm2", "bioAddclm3", "bioAltMobileNo", "bioApplicantCatg", "bioApplno", "", "bioBioId", "bioBioidSearch", "bioBirthplace", "bioBloodGroup", "bioBloodGroupname", "bioCategory", "bioCitiZen", "bioCommunityCd", "bioCriminalHistory", "bioDependentRelation", "bioDigest", "bioDlno", "bioDob", "bioEkycid", "bioEkycopted", "bioEmailId", "bioEndorsedt", "bioEndorsementNo", "bioEndorsetime", "bioFamilyId", "bioFirstName", "bioFullName", "bioGender", "bioGenderDesc", "bioIdentityMark1", "bioIdentityMark2", "bioLastName", "bioMaritalStatus", "bioMemberId", "bioMiddleName", "bioMobileNo", "bioMotherFname", "bioMotherLname", "bioMotherMname", "bioNatName", "bioNprNo", "bioOrganDonor", "bioPerDetAadhaar", "bioPermAdd1", "bioPermAdd2", "bioPermAdd3", "bioPermDistCd", "bioPermDistName", "bioPermLocType", "bioPermLocal", "bioPermPin", "bioPermSdName", "bioPermSdcode", "bioPermVillTownCd", "bioPermVillTownName", "bioPhoneNo", "bioPoliceStncd", "bioQmQualcd", "bioRecGenesis", "bioReligion", "bioStateCd", "bioStayperiodPresentAddr", "bioSwdFname", "bioSwdFullName", "bioSwdLname", "bioSwdMname", "bioTempAdd1", "bioTempAdd2", "bioTempAdd3", "bioTempDistCd", "bioTempDistName", "bioTempLocType", "bioTempLocal", "bioTempPin", "bioTempSdName", "bioTempSdcode", "bioTempVillTownCd", "bioTempVillTownName", "bioTokenId", "bioTransType", "bioUserId", "dob", "fullAddress", "pht", "(ZILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "getAadharAuthenticated", "()Z", "getApplEmpcatg", "()I", "getBiPhoto", "()Ljava/lang/Object;", "getBioAadhaarName", "getBioAadhaarNo", "getBioAadharEnrollNo", "getBioAddclm1", "getBioAddclm2", "getBioAddclm3", "getBioAltMobileNo", "getBioApplicantCatg", "getBioApplno", "()Ljava/lang/String;", "getBioBioId", "getBioBioidSearch", "getBioBirthplace", "getBioBloodGroup", "getBioBloodGroupname", "getBioCategory", "getBioCitiZen", "getBioCommunityCd", "getBioCriminalHistory", "getBioDependentRelation", "getBioDigest", "getBioDlno", "getBioDob", "getBioEkycid", "getBioEkycopted", "getBioEmailId", "getBioEndorsedt", "getBioEndorsementNo", "getBioEndorsetime", "getBioFamilyId", "getBioFirstName", "getBioFullName", "getBioGender", "getBioGenderDesc", "getBioIdentityMark1", "getBioIdentityMark2", "getBioLastName", "getBioMaritalStatus", "getBioMemberId", "getBioMiddleName", "getBioMobileNo", "getBioMotherFname", "getBioMotherLname", "getBioMotherMname", "getBioNatName", "getBioNprNo", "getBioOrganDonor", "getBioPerDetAadhaar", "getBioPermAdd1", "getBioPermAdd2", "getBioPermAdd3", "getBioPermDistCd", "getBioPermDistName", "getBioPermLocType", "getBioPermLocal", "getBioPermPin", "getBioPermSdName", "getBioPermSdcode", "getBioPermVillTownCd", "getBioPermVillTownName", "getBioPhoneNo", "getBioPoliceStncd", "getBioQmQualcd", "getBioRecGenesis", "getBioReligion", "getBioStateCd", "getBioStayperiodPresentAddr", "getBioSwdFname", "getBioSwdFullName", "getBioSwdLname", "getBioSwdMname", "getBioTempAdd1", "getBioTempAdd2", "getBioTempAdd3", "getBioTempDistCd", "getBioTempDistName", "getBioTempLocType", "getBioTempLocal", "getBioTempPin", "getBioTempSdName", "getBioTempSdcode", "getBioTempVillTownCd", "getBioTempVillTownName", "getBioTokenId", "getBioTransType", "getBioUserId", "getDob", "getFullAddress", "getPht", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component6", "component60", "component61", "component62", "component63", "component64", "component65", "component66", "component67", "component68", "component69", "component7", "component70", "component71", "component72", "component73", "component74", "component75", "component76", "component77", "component78", "component79", "component8", "component80", "component81", "component82", "component83", "component84", "component85", "component86", "component87", "component88", "component89", "component9", "component90", "component91", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class BioObj {
    private final boolean aadharAuthenticated;
    private final int applEmpcatg;
    private final Object biPhoto;
    private final Object bioAadhaarName;
    private final Object bioAadhaarNo;
    private final Object bioAadharEnrollNo;
    private final Object bioAddclm1;
    private final Object bioAddclm2;
    private final Object bioAddclm3;
    private final Object bioAltMobileNo;
    private final Object bioApplicantCatg;
    private final String bioApplno;
    private final String bioBioId;
    private final String bioBioidSearch;
    private final Object bioBirthplace;
    private final Object bioBloodGroup;
    private final String bioBloodGroupname;
    private final Object bioCategory;
    private final String bioCitiZen;
    private final Object bioCommunityCd;
    private final Object bioCriminalHistory;
    private final String bioDependentRelation;
    private final Object bioDigest;
    private final String bioDlno;
    private final String bioDob;
    private final Object bioEkycid;
    private final Object bioEkycopted;
    private final Object bioEmailId;
    private final String bioEndorsedt;
    private final String bioEndorsementNo;
    private final String bioEndorsetime;
    private final Object bioFamilyId;
    private final String bioFirstName;
    private final String bioFullName;
    private final int bioGender;
    private final String bioGenderDesc;
    private final Object bioIdentityMark1;
    private final Object bioIdentityMark2;
    private final String bioLastName;
    private final Object bioMaritalStatus;
    private final Object bioMemberId;
    private final Object bioMiddleName;
    private final Object bioMobileNo;
    private final Object bioMotherFname;
    private final Object bioMotherLname;
    private final Object bioMotherMname;
    private final String bioNatName;
    private final Object bioNprNo;
    private final Object bioOrganDonor;
    private final Object bioPerDetAadhaar;
    private final String bioPermAdd1;
    private final String bioPermAdd2;
    private final String bioPermAdd3;
    private final Object bioPermDistCd;
    private final Object bioPermDistName;
    private final Object bioPermLocType;
    private final Object bioPermLocal;
    private final Object bioPermPin;
    private final Object bioPermSdName;
    private final int bioPermSdcode;
    private final Object bioPermVillTownCd;
    private final Object bioPermVillTownName;
    private final Object bioPhoneNo;
    private final Object bioPoliceStncd;
    private final int bioQmQualcd;
    private final String bioRecGenesis;
    private final Object bioReligion;
    private final Object bioStateCd;
    private final Object bioStayperiodPresentAddr;
    private final String bioSwdFname;
    private final String bioSwdFullName;
    private final String bioSwdLname;
    private final Object bioSwdMname;
    private final String bioTempAdd1;
    private final String bioTempAdd2;
    private final String bioTempAdd3;
    private final Object bioTempDistCd;
    private final Object bioTempDistName;
    private final Object bioTempLocType;
    private final Object bioTempLocal;
    private final Object bioTempPin;
    private final Object bioTempSdName;
    private final int bioTempSdcode;
    private final Object bioTempVillTownCd;
    private final Object bioTempVillTownName;
    private final Object bioTokenId;
    private final Object bioTransType;
    private final int bioUserId;
    private final Object dob;
    private final Object fullAddress;
    private final Object pht;

    public BioObj(boolean z, int i, Object biPhoto, Object bioAadhaarName, Object bioAadhaarNo, Object bioAadharEnrollNo, Object bioAddclm1, Object bioAddclm2, Object bioAddclm3, Object bioAltMobileNo, Object bioApplicantCatg, String bioApplno, String bioBioId, String bioBioidSearch, Object bioBirthplace, Object bioBloodGroup, String bioBloodGroupname, Object bioCategory, String bioCitiZen, Object bioCommunityCd, Object bioCriminalHistory, String bioDependentRelation, Object bioDigest, String bioDlno, String bioDob, Object bioEkycid, Object bioEkycopted, Object bioEmailId, String bioEndorsedt, String bioEndorsementNo, String bioEndorsetime, Object bioFamilyId, String bioFirstName, String bioFullName, int i2, String bioGenderDesc, Object bioIdentityMark1, Object bioIdentityMark2, String bioLastName, Object bioMaritalStatus, Object bioMemberId, Object bioMiddleName, Object bioMobileNo, Object bioMotherFname, Object bioMotherLname, Object bioMotherMname, String bioNatName, Object bioNprNo, Object bioOrganDonor, Object bioPerDetAadhaar, String bioPermAdd1, String bioPermAdd2, String bioPermAdd3, Object bioPermDistCd, Object bioPermDistName, Object bioPermLocType, Object bioPermLocal, Object bioPermPin, Object bioPermSdName, int i3, Object bioPermVillTownCd, Object bioPermVillTownName, Object bioPhoneNo, Object bioPoliceStncd, int i4, String bioRecGenesis, Object bioReligion, Object bioStateCd, Object bioStayperiodPresentAddr, String bioSwdFname, String bioSwdFullName, String bioSwdLname, Object bioSwdMname, String bioTempAdd1, String bioTempAdd2, String bioTempAdd3, Object bioTempDistCd, Object bioTempDistName, Object bioTempLocType, Object bioTempLocal, Object bioTempPin, Object bioTempSdName, int i5, Object bioTempVillTownCd, Object bioTempVillTownName, Object bioTokenId, Object bioTransType, int i6, Object dob, Object fullAddress, Object pht) {
        Intrinsics.checkNotNullParameter(biPhoto, "biPhoto");
        Intrinsics.checkNotNullParameter(bioAadhaarName, "bioAadhaarName");
        Intrinsics.checkNotNullParameter(bioAadhaarNo, "bioAadhaarNo");
        Intrinsics.checkNotNullParameter(bioAadharEnrollNo, "bioAadharEnrollNo");
        Intrinsics.checkNotNullParameter(bioAddclm1, "bioAddclm1");
        Intrinsics.checkNotNullParameter(bioAddclm2, "bioAddclm2");
        Intrinsics.checkNotNullParameter(bioAddclm3, "bioAddclm3");
        Intrinsics.checkNotNullParameter(bioAltMobileNo, "bioAltMobileNo");
        Intrinsics.checkNotNullParameter(bioApplicantCatg, "bioApplicantCatg");
        Intrinsics.checkNotNullParameter(bioApplno, "bioApplno");
        Intrinsics.checkNotNullParameter(bioBioId, "bioBioId");
        Intrinsics.checkNotNullParameter(bioBioidSearch, "bioBioidSearch");
        Intrinsics.checkNotNullParameter(bioBirthplace, "bioBirthplace");
        Intrinsics.checkNotNullParameter(bioBloodGroup, "bioBloodGroup");
        Intrinsics.checkNotNullParameter(bioBloodGroupname, "bioBloodGroupname");
        Intrinsics.checkNotNullParameter(bioCategory, "bioCategory");
        Intrinsics.checkNotNullParameter(bioCitiZen, "bioCitiZen");
        Intrinsics.checkNotNullParameter(bioCommunityCd, "bioCommunityCd");
        Intrinsics.checkNotNullParameter(bioCriminalHistory, "bioCriminalHistory");
        Intrinsics.checkNotNullParameter(bioDependentRelation, "bioDependentRelation");
        Intrinsics.checkNotNullParameter(bioDigest, "bioDigest");
        Intrinsics.checkNotNullParameter(bioDlno, "bioDlno");
        Intrinsics.checkNotNullParameter(bioDob, "bioDob");
        Intrinsics.checkNotNullParameter(bioEkycid, "bioEkycid");
        Intrinsics.checkNotNullParameter(bioEkycopted, "bioEkycopted");
        Intrinsics.checkNotNullParameter(bioEmailId, "bioEmailId");
        Intrinsics.checkNotNullParameter(bioEndorsedt, "bioEndorsedt");
        Intrinsics.checkNotNullParameter(bioEndorsementNo, "bioEndorsementNo");
        Intrinsics.checkNotNullParameter(bioEndorsetime, "bioEndorsetime");
        Intrinsics.checkNotNullParameter(bioFamilyId, "bioFamilyId");
        Intrinsics.checkNotNullParameter(bioFirstName, "bioFirstName");
        Intrinsics.checkNotNullParameter(bioFullName, "bioFullName");
        Intrinsics.checkNotNullParameter(bioGenderDesc, "bioGenderDesc");
        Intrinsics.checkNotNullParameter(bioIdentityMark1, "bioIdentityMark1");
        Intrinsics.checkNotNullParameter(bioIdentityMark2, "bioIdentityMark2");
        Intrinsics.checkNotNullParameter(bioLastName, "bioLastName");
        Intrinsics.checkNotNullParameter(bioMaritalStatus, "bioMaritalStatus");
        Intrinsics.checkNotNullParameter(bioMemberId, "bioMemberId");
        Intrinsics.checkNotNullParameter(bioMiddleName, "bioMiddleName");
        Intrinsics.checkNotNullParameter(bioMobileNo, "bioMobileNo");
        Intrinsics.checkNotNullParameter(bioMotherFname, "bioMotherFname");
        Intrinsics.checkNotNullParameter(bioMotherLname, "bioMotherLname");
        Intrinsics.checkNotNullParameter(bioMotherMname, "bioMotherMname");
        Intrinsics.checkNotNullParameter(bioNatName, "bioNatName");
        Intrinsics.checkNotNullParameter(bioNprNo, "bioNprNo");
        Intrinsics.checkNotNullParameter(bioOrganDonor, "bioOrganDonor");
        Intrinsics.checkNotNullParameter(bioPerDetAadhaar, "bioPerDetAadhaar");
        Intrinsics.checkNotNullParameter(bioPermAdd1, "bioPermAdd1");
        Intrinsics.checkNotNullParameter(bioPermAdd2, "bioPermAdd2");
        Intrinsics.checkNotNullParameter(bioPermAdd3, "bioPermAdd3");
        Intrinsics.checkNotNullParameter(bioPermDistCd, "bioPermDistCd");
        Intrinsics.checkNotNullParameter(bioPermDistName, "bioPermDistName");
        Intrinsics.checkNotNullParameter(bioPermLocType, "bioPermLocType");
        Intrinsics.checkNotNullParameter(bioPermLocal, "bioPermLocal");
        Intrinsics.checkNotNullParameter(bioPermPin, "bioPermPin");
        Intrinsics.checkNotNullParameter(bioPermSdName, "bioPermSdName");
        Intrinsics.checkNotNullParameter(bioPermVillTownCd, "bioPermVillTownCd");
        Intrinsics.checkNotNullParameter(bioPermVillTownName, "bioPermVillTownName");
        Intrinsics.checkNotNullParameter(bioPhoneNo, "bioPhoneNo");
        Intrinsics.checkNotNullParameter(bioPoliceStncd, "bioPoliceStncd");
        Intrinsics.checkNotNullParameter(bioRecGenesis, "bioRecGenesis");
        Intrinsics.checkNotNullParameter(bioReligion, "bioReligion");
        Intrinsics.checkNotNullParameter(bioStateCd, "bioStateCd");
        Intrinsics.checkNotNullParameter(bioStayperiodPresentAddr, "bioStayperiodPresentAddr");
        Intrinsics.checkNotNullParameter(bioSwdFname, "bioSwdFname");
        Intrinsics.checkNotNullParameter(bioSwdFullName, "bioSwdFullName");
        Intrinsics.checkNotNullParameter(bioSwdLname, "bioSwdLname");
        Intrinsics.checkNotNullParameter(bioSwdMname, "bioSwdMname");
        Intrinsics.checkNotNullParameter(bioTempAdd1, "bioTempAdd1");
        Intrinsics.checkNotNullParameter(bioTempAdd2, "bioTempAdd2");
        Intrinsics.checkNotNullParameter(bioTempAdd3, "bioTempAdd3");
        Intrinsics.checkNotNullParameter(bioTempDistCd, "bioTempDistCd");
        Intrinsics.checkNotNullParameter(bioTempDistName, "bioTempDistName");
        Intrinsics.checkNotNullParameter(bioTempLocType, "bioTempLocType");
        Intrinsics.checkNotNullParameter(bioTempLocal, "bioTempLocal");
        Intrinsics.checkNotNullParameter(bioTempPin, "bioTempPin");
        Intrinsics.checkNotNullParameter(bioTempSdName, "bioTempSdName");
        Intrinsics.checkNotNullParameter(bioTempVillTownCd, "bioTempVillTownCd");
        Intrinsics.checkNotNullParameter(bioTempVillTownName, "bioTempVillTownName");
        Intrinsics.checkNotNullParameter(bioTokenId, "bioTokenId");
        Intrinsics.checkNotNullParameter(bioTransType, "bioTransType");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(fullAddress, "fullAddress");
        Intrinsics.checkNotNullParameter(pht, "pht");
        this.aadharAuthenticated = z;
        this.applEmpcatg = i;
        this.biPhoto = biPhoto;
        this.bioAadhaarName = bioAadhaarName;
        this.bioAadhaarNo = bioAadhaarNo;
        this.bioAadharEnrollNo = bioAadharEnrollNo;
        this.bioAddclm1 = bioAddclm1;
        this.bioAddclm2 = bioAddclm2;
        this.bioAddclm3 = bioAddclm3;
        this.bioAltMobileNo = bioAltMobileNo;
        this.bioApplicantCatg = bioApplicantCatg;
        this.bioApplno = bioApplno;
        this.bioBioId = bioBioId;
        this.bioBioidSearch = bioBioidSearch;
        this.bioBirthplace = bioBirthplace;
        this.bioBloodGroup = bioBloodGroup;
        this.bioBloodGroupname = bioBloodGroupname;
        this.bioCategory = bioCategory;
        this.bioCitiZen = bioCitiZen;
        this.bioCommunityCd = bioCommunityCd;
        this.bioCriminalHistory = bioCriminalHistory;
        this.bioDependentRelation = bioDependentRelation;
        this.bioDigest = bioDigest;
        this.bioDlno = bioDlno;
        this.bioDob = bioDob;
        this.bioEkycid = bioEkycid;
        this.bioEkycopted = bioEkycopted;
        this.bioEmailId = bioEmailId;
        this.bioEndorsedt = bioEndorsedt;
        this.bioEndorsementNo = bioEndorsementNo;
        this.bioEndorsetime = bioEndorsetime;
        this.bioFamilyId = bioFamilyId;
        this.bioFirstName = bioFirstName;
        this.bioFullName = bioFullName;
        this.bioGender = i2;
        this.bioGenderDesc = bioGenderDesc;
        this.bioIdentityMark1 = bioIdentityMark1;
        this.bioIdentityMark2 = bioIdentityMark2;
        this.bioLastName = bioLastName;
        this.bioMaritalStatus = bioMaritalStatus;
        this.bioMemberId = bioMemberId;
        this.bioMiddleName = bioMiddleName;
        this.bioMobileNo = bioMobileNo;
        this.bioMotherFname = bioMotherFname;
        this.bioMotherLname = bioMotherLname;
        this.bioMotherMname = bioMotherMname;
        this.bioNatName = bioNatName;
        this.bioNprNo = bioNprNo;
        this.bioOrganDonor = bioOrganDonor;
        this.bioPerDetAadhaar = bioPerDetAadhaar;
        this.bioPermAdd1 = bioPermAdd1;
        this.bioPermAdd2 = bioPermAdd2;
        this.bioPermAdd3 = bioPermAdd3;
        this.bioPermDistCd = bioPermDistCd;
        this.bioPermDistName = bioPermDistName;
        this.bioPermLocType = bioPermLocType;
        this.bioPermLocal = bioPermLocal;
        this.bioPermPin = bioPermPin;
        this.bioPermSdName = bioPermSdName;
        this.bioPermSdcode = i3;
        this.bioPermVillTownCd = bioPermVillTownCd;
        this.bioPermVillTownName = bioPermVillTownName;
        this.bioPhoneNo = bioPhoneNo;
        this.bioPoliceStncd = bioPoliceStncd;
        this.bioQmQualcd = i4;
        this.bioRecGenesis = bioRecGenesis;
        this.bioReligion = bioReligion;
        this.bioStateCd = bioStateCd;
        this.bioStayperiodPresentAddr = bioStayperiodPresentAddr;
        this.bioSwdFname = bioSwdFname;
        this.bioSwdFullName = bioSwdFullName;
        this.bioSwdLname = bioSwdLname;
        this.bioSwdMname = bioSwdMname;
        this.bioTempAdd1 = bioTempAdd1;
        this.bioTempAdd2 = bioTempAdd2;
        this.bioTempAdd3 = bioTempAdd3;
        this.bioTempDistCd = bioTempDistCd;
        this.bioTempDistName = bioTempDistName;
        this.bioTempLocType = bioTempLocType;
        this.bioTempLocal = bioTempLocal;
        this.bioTempPin = bioTempPin;
        this.bioTempSdName = bioTempSdName;
        this.bioTempSdcode = i5;
        this.bioTempVillTownCd = bioTempVillTownCd;
        this.bioTempVillTownName = bioTempVillTownName;
        this.bioTokenId = bioTokenId;
        this.bioTransType = bioTransType;
        this.bioUserId = i6;
        this.dob = dob;
        this.fullAddress = fullAddress;
        this.pht = pht;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getAadharAuthenticated() {
        return this.aadharAuthenticated;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Object getBioAltMobileNo() {
        return this.bioAltMobileNo;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Object getBioApplicantCatg() {
        return this.bioApplicantCatg;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getBioApplno() {
        return this.bioApplno;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getBioBioId() {
        return this.bioBioId;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getBioBioidSearch() {
        return this.bioBioidSearch;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Object getBioBirthplace() {
        return this.bioBirthplace;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Object getBioBloodGroup() {
        return this.bioBloodGroup;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getBioBloodGroupname() {
        return this.bioBloodGroupname;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Object getBioCategory() {
        return this.bioCategory;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getBioCitiZen() {
        return this.bioCitiZen;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getApplEmpcatg() {
        return this.applEmpcatg;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Object getBioCommunityCd() {
        return this.bioCommunityCd;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Object getBioCriminalHistory() {
        return this.bioCriminalHistory;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getBioDependentRelation() {
        return this.bioDependentRelation;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Object getBioDigest() {
        return this.bioDigest;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getBioDlno() {
        return this.bioDlno;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getBioDob() {
        return this.bioDob;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final Object getBioEkycid() {
        return this.bioEkycid;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final Object getBioEkycopted() {
        return this.bioEkycopted;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final Object getBioEmailId() {
        return this.bioEmailId;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getBioEndorsedt() {
        return this.bioEndorsedt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Object getBiPhoto() {
        return this.biPhoto;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getBioEndorsementNo() {
        return this.bioEndorsementNo;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getBioEndorsetime() {
        return this.bioEndorsetime;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final Object getBioFamilyId() {
        return this.bioFamilyId;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getBioFirstName() {
        return this.bioFirstName;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final String getBioFullName() {
        return this.bioFullName;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final int getBioGender() {
        return this.bioGender;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final String getBioGenderDesc() {
        return this.bioGenderDesc;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final Object getBioIdentityMark1() {
        return this.bioIdentityMark1;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final Object getBioIdentityMark2() {
        return this.bioIdentityMark2;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final String getBioLastName() {
        return this.bioLastName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Object getBioAadhaarName() {
        return this.bioAadhaarName;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final Object getBioMaritalStatus() {
        return this.bioMaritalStatus;
    }

    /* JADX INFO: renamed from: component41, reason: from getter */
    public final Object getBioMemberId() {
        return this.bioMemberId;
    }

    /* JADX INFO: renamed from: component42, reason: from getter */
    public final Object getBioMiddleName() {
        return this.bioMiddleName;
    }

    /* JADX INFO: renamed from: component43, reason: from getter */
    public final Object getBioMobileNo() {
        return this.bioMobileNo;
    }

    /* JADX INFO: renamed from: component44, reason: from getter */
    public final Object getBioMotherFname() {
        return this.bioMotherFname;
    }

    /* JADX INFO: renamed from: component45, reason: from getter */
    public final Object getBioMotherLname() {
        return this.bioMotherLname;
    }

    /* JADX INFO: renamed from: component46, reason: from getter */
    public final Object getBioMotherMname() {
        return this.bioMotherMname;
    }

    /* JADX INFO: renamed from: component47, reason: from getter */
    public final String getBioNatName() {
        return this.bioNatName;
    }

    /* JADX INFO: renamed from: component48, reason: from getter */
    public final Object getBioNprNo() {
        return this.bioNprNo;
    }

    /* JADX INFO: renamed from: component49, reason: from getter */
    public final Object getBioOrganDonor() {
        return this.bioOrganDonor;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Object getBioAadhaarNo() {
        return this.bioAadhaarNo;
    }

    /* JADX INFO: renamed from: component50, reason: from getter */
    public final Object getBioPerDetAadhaar() {
        return this.bioPerDetAadhaar;
    }

    /* JADX INFO: renamed from: component51, reason: from getter */
    public final String getBioPermAdd1() {
        return this.bioPermAdd1;
    }

    /* JADX INFO: renamed from: component52, reason: from getter */
    public final String getBioPermAdd2() {
        return this.bioPermAdd2;
    }

    /* JADX INFO: renamed from: component53, reason: from getter */
    public final String getBioPermAdd3() {
        return this.bioPermAdd3;
    }

    /* JADX INFO: renamed from: component54, reason: from getter */
    public final Object getBioPermDistCd() {
        return this.bioPermDistCd;
    }

    /* JADX INFO: renamed from: component55, reason: from getter */
    public final Object getBioPermDistName() {
        return this.bioPermDistName;
    }

    /* JADX INFO: renamed from: component56, reason: from getter */
    public final Object getBioPermLocType() {
        return this.bioPermLocType;
    }

    /* JADX INFO: renamed from: component57, reason: from getter */
    public final Object getBioPermLocal() {
        return this.bioPermLocal;
    }

    /* JADX INFO: renamed from: component58, reason: from getter */
    public final Object getBioPermPin() {
        return this.bioPermPin;
    }

    /* JADX INFO: renamed from: component59, reason: from getter */
    public final Object getBioPermSdName() {
        return this.bioPermSdName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Object getBioAadharEnrollNo() {
        return this.bioAadharEnrollNo;
    }

    /* JADX INFO: renamed from: component60, reason: from getter */
    public final int getBioPermSdcode() {
        return this.bioPermSdcode;
    }

    /* JADX INFO: renamed from: component61, reason: from getter */
    public final Object getBioPermVillTownCd() {
        return this.bioPermVillTownCd;
    }

    /* JADX INFO: renamed from: component62, reason: from getter */
    public final Object getBioPermVillTownName() {
        return this.bioPermVillTownName;
    }

    /* JADX INFO: renamed from: component63, reason: from getter */
    public final Object getBioPhoneNo() {
        return this.bioPhoneNo;
    }

    /* JADX INFO: renamed from: component64, reason: from getter */
    public final Object getBioPoliceStncd() {
        return this.bioPoliceStncd;
    }

    /* JADX INFO: renamed from: component65, reason: from getter */
    public final int getBioQmQualcd() {
        return this.bioQmQualcd;
    }

    /* JADX INFO: renamed from: component66, reason: from getter */
    public final String getBioRecGenesis() {
        return this.bioRecGenesis;
    }

    /* JADX INFO: renamed from: component67, reason: from getter */
    public final Object getBioReligion() {
        return this.bioReligion;
    }

    /* JADX INFO: renamed from: component68, reason: from getter */
    public final Object getBioStateCd() {
        return this.bioStateCd;
    }

    /* JADX INFO: renamed from: component69, reason: from getter */
    public final Object getBioStayperiodPresentAddr() {
        return this.bioStayperiodPresentAddr;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Object getBioAddclm1() {
        return this.bioAddclm1;
    }

    /* JADX INFO: renamed from: component70, reason: from getter */
    public final String getBioSwdFname() {
        return this.bioSwdFname;
    }

    /* JADX INFO: renamed from: component71, reason: from getter */
    public final String getBioSwdFullName() {
        return this.bioSwdFullName;
    }

    /* JADX INFO: renamed from: component72, reason: from getter */
    public final String getBioSwdLname() {
        return this.bioSwdLname;
    }

    /* JADX INFO: renamed from: component73, reason: from getter */
    public final Object getBioSwdMname() {
        return this.bioSwdMname;
    }

    /* JADX INFO: renamed from: component74, reason: from getter */
    public final String getBioTempAdd1() {
        return this.bioTempAdd1;
    }

    /* JADX INFO: renamed from: component75, reason: from getter */
    public final String getBioTempAdd2() {
        return this.bioTempAdd2;
    }

    /* JADX INFO: renamed from: component76, reason: from getter */
    public final String getBioTempAdd3() {
        return this.bioTempAdd3;
    }

    /* JADX INFO: renamed from: component77, reason: from getter */
    public final Object getBioTempDistCd() {
        return this.bioTempDistCd;
    }

    /* JADX INFO: renamed from: component78, reason: from getter */
    public final Object getBioTempDistName() {
        return this.bioTempDistName;
    }

    /* JADX INFO: renamed from: component79, reason: from getter */
    public final Object getBioTempLocType() {
        return this.bioTempLocType;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Object getBioAddclm2() {
        return this.bioAddclm2;
    }

    /* JADX INFO: renamed from: component80, reason: from getter */
    public final Object getBioTempLocal() {
        return this.bioTempLocal;
    }

    /* JADX INFO: renamed from: component81, reason: from getter */
    public final Object getBioTempPin() {
        return this.bioTempPin;
    }

    /* JADX INFO: renamed from: component82, reason: from getter */
    public final Object getBioTempSdName() {
        return this.bioTempSdName;
    }

    /* JADX INFO: renamed from: component83, reason: from getter */
    public final int getBioTempSdcode() {
        return this.bioTempSdcode;
    }

    /* JADX INFO: renamed from: component84, reason: from getter */
    public final Object getBioTempVillTownCd() {
        return this.bioTempVillTownCd;
    }

    /* JADX INFO: renamed from: component85, reason: from getter */
    public final Object getBioTempVillTownName() {
        return this.bioTempVillTownName;
    }

    /* JADX INFO: renamed from: component86, reason: from getter */
    public final Object getBioTokenId() {
        return this.bioTokenId;
    }

    /* JADX INFO: renamed from: component87, reason: from getter */
    public final Object getBioTransType() {
        return this.bioTransType;
    }

    /* JADX INFO: renamed from: component88, reason: from getter */
    public final int getBioUserId() {
        return this.bioUserId;
    }

    /* JADX INFO: renamed from: component89, reason: from getter */
    public final Object getDob() {
        return this.dob;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Object getBioAddclm3() {
        return this.bioAddclm3;
    }

    /* JADX INFO: renamed from: component90, reason: from getter */
    public final Object getFullAddress() {
        return this.fullAddress;
    }

    /* JADX INFO: renamed from: component91, reason: from getter */
    public final Object getPht() {
        return this.pht;
    }

    public final BioObj copy(boolean aadharAuthenticated, int applEmpcatg, Object biPhoto, Object bioAadhaarName, Object bioAadhaarNo, Object bioAadharEnrollNo, Object bioAddclm1, Object bioAddclm2, Object bioAddclm3, Object bioAltMobileNo, Object bioApplicantCatg, String bioApplno, String bioBioId, String bioBioidSearch, Object bioBirthplace, Object bioBloodGroup, String bioBloodGroupname, Object bioCategory, String bioCitiZen, Object bioCommunityCd, Object bioCriminalHistory, String bioDependentRelation, Object bioDigest, String bioDlno, String bioDob, Object bioEkycid, Object bioEkycopted, Object bioEmailId, String bioEndorsedt, String bioEndorsementNo, String bioEndorsetime, Object bioFamilyId, String bioFirstName, String bioFullName, int bioGender, String bioGenderDesc, Object bioIdentityMark1, Object bioIdentityMark2, String bioLastName, Object bioMaritalStatus, Object bioMemberId, Object bioMiddleName, Object bioMobileNo, Object bioMotherFname, Object bioMotherLname, Object bioMotherMname, String bioNatName, Object bioNprNo, Object bioOrganDonor, Object bioPerDetAadhaar, String bioPermAdd1, String bioPermAdd2, String bioPermAdd3, Object bioPermDistCd, Object bioPermDistName, Object bioPermLocType, Object bioPermLocal, Object bioPermPin, Object bioPermSdName, int bioPermSdcode, Object bioPermVillTownCd, Object bioPermVillTownName, Object bioPhoneNo, Object bioPoliceStncd, int bioQmQualcd, String bioRecGenesis, Object bioReligion, Object bioStateCd, Object bioStayperiodPresentAddr, String bioSwdFname, String bioSwdFullName, String bioSwdLname, Object bioSwdMname, String bioTempAdd1, String bioTempAdd2, String bioTempAdd3, Object bioTempDistCd, Object bioTempDistName, Object bioTempLocType, Object bioTempLocal, Object bioTempPin, Object bioTempSdName, int bioTempSdcode, Object bioTempVillTownCd, Object bioTempVillTownName, Object bioTokenId, Object bioTransType, int bioUserId, Object dob, Object fullAddress, Object pht) {
        Intrinsics.checkNotNullParameter(biPhoto, "biPhoto");
        Intrinsics.checkNotNullParameter(bioAadhaarName, "bioAadhaarName");
        Intrinsics.checkNotNullParameter(bioAadhaarNo, "bioAadhaarNo");
        Intrinsics.checkNotNullParameter(bioAadharEnrollNo, "bioAadharEnrollNo");
        Intrinsics.checkNotNullParameter(bioAddclm1, "bioAddclm1");
        Intrinsics.checkNotNullParameter(bioAddclm2, "bioAddclm2");
        Intrinsics.checkNotNullParameter(bioAddclm3, "bioAddclm3");
        Intrinsics.checkNotNullParameter(bioAltMobileNo, "bioAltMobileNo");
        Intrinsics.checkNotNullParameter(bioApplicantCatg, "bioApplicantCatg");
        Intrinsics.checkNotNullParameter(bioApplno, "bioApplno");
        Intrinsics.checkNotNullParameter(bioBioId, "bioBioId");
        Intrinsics.checkNotNullParameter(bioBioidSearch, "bioBioidSearch");
        Intrinsics.checkNotNullParameter(bioBirthplace, "bioBirthplace");
        Intrinsics.checkNotNullParameter(bioBloodGroup, "bioBloodGroup");
        Intrinsics.checkNotNullParameter(bioBloodGroupname, "bioBloodGroupname");
        Intrinsics.checkNotNullParameter(bioCategory, "bioCategory");
        Intrinsics.checkNotNullParameter(bioCitiZen, "bioCitiZen");
        Intrinsics.checkNotNullParameter(bioCommunityCd, "bioCommunityCd");
        Intrinsics.checkNotNullParameter(bioCriminalHistory, "bioCriminalHistory");
        Intrinsics.checkNotNullParameter(bioDependentRelation, "bioDependentRelation");
        Intrinsics.checkNotNullParameter(bioDigest, "bioDigest");
        Intrinsics.checkNotNullParameter(bioDlno, "bioDlno");
        Intrinsics.checkNotNullParameter(bioDob, "bioDob");
        Intrinsics.checkNotNullParameter(bioEkycid, "bioEkycid");
        Intrinsics.checkNotNullParameter(bioEkycopted, "bioEkycopted");
        Intrinsics.checkNotNullParameter(bioEmailId, "bioEmailId");
        Intrinsics.checkNotNullParameter(bioEndorsedt, "bioEndorsedt");
        Intrinsics.checkNotNullParameter(bioEndorsementNo, "bioEndorsementNo");
        Intrinsics.checkNotNullParameter(bioEndorsetime, "bioEndorsetime");
        Intrinsics.checkNotNullParameter(bioFamilyId, "bioFamilyId");
        Intrinsics.checkNotNullParameter(bioFirstName, "bioFirstName");
        Intrinsics.checkNotNullParameter(bioFullName, "bioFullName");
        Intrinsics.checkNotNullParameter(bioGenderDesc, "bioGenderDesc");
        Intrinsics.checkNotNullParameter(bioIdentityMark1, "bioIdentityMark1");
        Intrinsics.checkNotNullParameter(bioIdentityMark2, "bioIdentityMark2");
        Intrinsics.checkNotNullParameter(bioLastName, "bioLastName");
        Intrinsics.checkNotNullParameter(bioMaritalStatus, "bioMaritalStatus");
        Intrinsics.checkNotNullParameter(bioMemberId, "bioMemberId");
        Intrinsics.checkNotNullParameter(bioMiddleName, "bioMiddleName");
        Intrinsics.checkNotNullParameter(bioMobileNo, "bioMobileNo");
        Intrinsics.checkNotNullParameter(bioMotherFname, "bioMotherFname");
        Intrinsics.checkNotNullParameter(bioMotherLname, "bioMotherLname");
        Intrinsics.checkNotNullParameter(bioMotherMname, "bioMotherMname");
        Intrinsics.checkNotNullParameter(bioNatName, "bioNatName");
        Intrinsics.checkNotNullParameter(bioNprNo, "bioNprNo");
        Intrinsics.checkNotNullParameter(bioOrganDonor, "bioOrganDonor");
        Intrinsics.checkNotNullParameter(bioPerDetAadhaar, "bioPerDetAadhaar");
        Intrinsics.checkNotNullParameter(bioPermAdd1, "bioPermAdd1");
        Intrinsics.checkNotNullParameter(bioPermAdd2, "bioPermAdd2");
        Intrinsics.checkNotNullParameter(bioPermAdd3, "bioPermAdd3");
        Intrinsics.checkNotNullParameter(bioPermDistCd, "bioPermDistCd");
        Intrinsics.checkNotNullParameter(bioPermDistName, "bioPermDistName");
        Intrinsics.checkNotNullParameter(bioPermLocType, "bioPermLocType");
        Intrinsics.checkNotNullParameter(bioPermLocal, "bioPermLocal");
        Intrinsics.checkNotNullParameter(bioPermPin, "bioPermPin");
        Intrinsics.checkNotNullParameter(bioPermSdName, "bioPermSdName");
        Intrinsics.checkNotNullParameter(bioPermVillTownCd, "bioPermVillTownCd");
        Intrinsics.checkNotNullParameter(bioPermVillTownName, "bioPermVillTownName");
        Intrinsics.checkNotNullParameter(bioPhoneNo, "bioPhoneNo");
        Intrinsics.checkNotNullParameter(bioPoliceStncd, "bioPoliceStncd");
        Intrinsics.checkNotNullParameter(bioRecGenesis, "bioRecGenesis");
        Intrinsics.checkNotNullParameter(bioReligion, "bioReligion");
        Intrinsics.checkNotNullParameter(bioStateCd, "bioStateCd");
        Intrinsics.checkNotNullParameter(bioStayperiodPresentAddr, "bioStayperiodPresentAddr");
        Intrinsics.checkNotNullParameter(bioSwdFname, "bioSwdFname");
        Intrinsics.checkNotNullParameter(bioSwdFullName, "bioSwdFullName");
        Intrinsics.checkNotNullParameter(bioSwdLname, "bioSwdLname");
        Intrinsics.checkNotNullParameter(bioSwdMname, "bioSwdMname");
        Intrinsics.checkNotNullParameter(bioTempAdd1, "bioTempAdd1");
        Intrinsics.checkNotNullParameter(bioTempAdd2, "bioTempAdd2");
        Intrinsics.checkNotNullParameter(bioTempAdd3, "bioTempAdd3");
        Intrinsics.checkNotNullParameter(bioTempDistCd, "bioTempDistCd");
        Intrinsics.checkNotNullParameter(bioTempDistName, "bioTempDistName");
        Intrinsics.checkNotNullParameter(bioTempLocType, "bioTempLocType");
        Intrinsics.checkNotNullParameter(bioTempLocal, "bioTempLocal");
        Intrinsics.checkNotNullParameter(bioTempPin, "bioTempPin");
        Intrinsics.checkNotNullParameter(bioTempSdName, "bioTempSdName");
        Intrinsics.checkNotNullParameter(bioTempVillTownCd, "bioTempVillTownCd");
        Intrinsics.checkNotNullParameter(bioTempVillTownName, "bioTempVillTownName");
        Intrinsics.checkNotNullParameter(bioTokenId, "bioTokenId");
        Intrinsics.checkNotNullParameter(bioTransType, "bioTransType");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(fullAddress, "fullAddress");
        Intrinsics.checkNotNullParameter(pht, "pht");
        return new BioObj(aadharAuthenticated, applEmpcatg, biPhoto, bioAadhaarName, bioAadhaarNo, bioAadharEnrollNo, bioAddclm1, bioAddclm2, bioAddclm3, bioAltMobileNo, bioApplicantCatg, bioApplno, bioBioId, bioBioidSearch, bioBirthplace, bioBloodGroup, bioBloodGroupname, bioCategory, bioCitiZen, bioCommunityCd, bioCriminalHistory, bioDependentRelation, bioDigest, bioDlno, bioDob, bioEkycid, bioEkycopted, bioEmailId, bioEndorsedt, bioEndorsementNo, bioEndorsetime, bioFamilyId, bioFirstName, bioFullName, bioGender, bioGenderDesc, bioIdentityMark1, bioIdentityMark2, bioLastName, bioMaritalStatus, bioMemberId, bioMiddleName, bioMobileNo, bioMotherFname, bioMotherLname, bioMotherMname, bioNatName, bioNprNo, bioOrganDonor, bioPerDetAadhaar, bioPermAdd1, bioPermAdd2, bioPermAdd3, bioPermDistCd, bioPermDistName, bioPermLocType, bioPermLocal, bioPermPin, bioPermSdName, bioPermSdcode, bioPermVillTownCd, bioPermVillTownName, bioPhoneNo, bioPoliceStncd, bioQmQualcd, bioRecGenesis, bioReligion, bioStateCd, bioStayperiodPresentAddr, bioSwdFname, bioSwdFullName, bioSwdLname, bioSwdMname, bioTempAdd1, bioTempAdd2, bioTempAdd3, bioTempDistCd, bioTempDistName, bioTempLocType, bioTempLocal, bioTempPin, bioTempSdName, bioTempSdcode, bioTempVillTownCd, bioTempVillTownName, bioTokenId, bioTransType, bioUserId, dob, fullAddress, pht);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BioObj)) {
            return false;
        }
        BioObj bioObj = (BioObj) other;
        return this.aadharAuthenticated == bioObj.aadharAuthenticated && this.applEmpcatg == bioObj.applEmpcatg && Intrinsics.areEqual(this.biPhoto, bioObj.biPhoto) && Intrinsics.areEqual(this.bioAadhaarName, bioObj.bioAadhaarName) && Intrinsics.areEqual(this.bioAadhaarNo, bioObj.bioAadhaarNo) && Intrinsics.areEqual(this.bioAadharEnrollNo, bioObj.bioAadharEnrollNo) && Intrinsics.areEqual(this.bioAddclm1, bioObj.bioAddclm1) && Intrinsics.areEqual(this.bioAddclm2, bioObj.bioAddclm2) && Intrinsics.areEqual(this.bioAddclm3, bioObj.bioAddclm3) && Intrinsics.areEqual(this.bioAltMobileNo, bioObj.bioAltMobileNo) && Intrinsics.areEqual(this.bioApplicantCatg, bioObj.bioApplicantCatg) && Intrinsics.areEqual(this.bioApplno, bioObj.bioApplno) && Intrinsics.areEqual(this.bioBioId, bioObj.bioBioId) && Intrinsics.areEqual(this.bioBioidSearch, bioObj.bioBioidSearch) && Intrinsics.areEqual(this.bioBirthplace, bioObj.bioBirthplace) && Intrinsics.areEqual(this.bioBloodGroup, bioObj.bioBloodGroup) && Intrinsics.areEqual(this.bioBloodGroupname, bioObj.bioBloodGroupname) && Intrinsics.areEqual(this.bioCategory, bioObj.bioCategory) && Intrinsics.areEqual(this.bioCitiZen, bioObj.bioCitiZen) && Intrinsics.areEqual(this.bioCommunityCd, bioObj.bioCommunityCd) && Intrinsics.areEqual(this.bioCriminalHistory, bioObj.bioCriminalHistory) && Intrinsics.areEqual(this.bioDependentRelation, bioObj.bioDependentRelation) && Intrinsics.areEqual(this.bioDigest, bioObj.bioDigest) && Intrinsics.areEqual(this.bioDlno, bioObj.bioDlno) && Intrinsics.areEqual(this.bioDob, bioObj.bioDob) && Intrinsics.areEqual(this.bioEkycid, bioObj.bioEkycid) && Intrinsics.areEqual(this.bioEkycopted, bioObj.bioEkycopted) && Intrinsics.areEqual(this.bioEmailId, bioObj.bioEmailId) && Intrinsics.areEqual(this.bioEndorsedt, bioObj.bioEndorsedt) && Intrinsics.areEqual(this.bioEndorsementNo, bioObj.bioEndorsementNo) && Intrinsics.areEqual(this.bioEndorsetime, bioObj.bioEndorsetime) && Intrinsics.areEqual(this.bioFamilyId, bioObj.bioFamilyId) && Intrinsics.areEqual(this.bioFirstName, bioObj.bioFirstName) && Intrinsics.areEqual(this.bioFullName, bioObj.bioFullName) && this.bioGender == bioObj.bioGender && Intrinsics.areEqual(this.bioGenderDesc, bioObj.bioGenderDesc) && Intrinsics.areEqual(this.bioIdentityMark1, bioObj.bioIdentityMark1) && Intrinsics.areEqual(this.bioIdentityMark2, bioObj.bioIdentityMark2) && Intrinsics.areEqual(this.bioLastName, bioObj.bioLastName) && Intrinsics.areEqual(this.bioMaritalStatus, bioObj.bioMaritalStatus) && Intrinsics.areEqual(this.bioMemberId, bioObj.bioMemberId) && Intrinsics.areEqual(this.bioMiddleName, bioObj.bioMiddleName) && Intrinsics.areEqual(this.bioMobileNo, bioObj.bioMobileNo) && Intrinsics.areEqual(this.bioMotherFname, bioObj.bioMotherFname) && Intrinsics.areEqual(this.bioMotherLname, bioObj.bioMotherLname) && Intrinsics.areEqual(this.bioMotherMname, bioObj.bioMotherMname) && Intrinsics.areEqual(this.bioNatName, bioObj.bioNatName) && Intrinsics.areEqual(this.bioNprNo, bioObj.bioNprNo) && Intrinsics.areEqual(this.bioOrganDonor, bioObj.bioOrganDonor) && Intrinsics.areEqual(this.bioPerDetAadhaar, bioObj.bioPerDetAadhaar) && Intrinsics.areEqual(this.bioPermAdd1, bioObj.bioPermAdd1) && Intrinsics.areEqual(this.bioPermAdd2, bioObj.bioPermAdd2) && Intrinsics.areEqual(this.bioPermAdd3, bioObj.bioPermAdd3) && Intrinsics.areEqual(this.bioPermDistCd, bioObj.bioPermDistCd) && Intrinsics.areEqual(this.bioPermDistName, bioObj.bioPermDistName) && Intrinsics.areEqual(this.bioPermLocType, bioObj.bioPermLocType) && Intrinsics.areEqual(this.bioPermLocal, bioObj.bioPermLocal) && Intrinsics.areEqual(this.bioPermPin, bioObj.bioPermPin) && Intrinsics.areEqual(this.bioPermSdName, bioObj.bioPermSdName) && this.bioPermSdcode == bioObj.bioPermSdcode && Intrinsics.areEqual(this.bioPermVillTownCd, bioObj.bioPermVillTownCd) && Intrinsics.areEqual(this.bioPermVillTownName, bioObj.bioPermVillTownName) && Intrinsics.areEqual(this.bioPhoneNo, bioObj.bioPhoneNo) && Intrinsics.areEqual(this.bioPoliceStncd, bioObj.bioPoliceStncd) && this.bioQmQualcd == bioObj.bioQmQualcd && Intrinsics.areEqual(this.bioRecGenesis, bioObj.bioRecGenesis) && Intrinsics.areEqual(this.bioReligion, bioObj.bioReligion) && Intrinsics.areEqual(this.bioStateCd, bioObj.bioStateCd) && Intrinsics.areEqual(this.bioStayperiodPresentAddr, bioObj.bioStayperiodPresentAddr) && Intrinsics.areEqual(this.bioSwdFname, bioObj.bioSwdFname) && Intrinsics.areEqual(this.bioSwdFullName, bioObj.bioSwdFullName) && Intrinsics.areEqual(this.bioSwdLname, bioObj.bioSwdLname) && Intrinsics.areEqual(this.bioSwdMname, bioObj.bioSwdMname) && Intrinsics.areEqual(this.bioTempAdd1, bioObj.bioTempAdd1) && Intrinsics.areEqual(this.bioTempAdd2, bioObj.bioTempAdd2) && Intrinsics.areEqual(this.bioTempAdd3, bioObj.bioTempAdd3) && Intrinsics.areEqual(this.bioTempDistCd, bioObj.bioTempDistCd) && Intrinsics.areEqual(this.bioTempDistName, bioObj.bioTempDistName) && Intrinsics.areEqual(this.bioTempLocType, bioObj.bioTempLocType) && Intrinsics.areEqual(this.bioTempLocal, bioObj.bioTempLocal) && Intrinsics.areEqual(this.bioTempPin, bioObj.bioTempPin) && Intrinsics.areEqual(this.bioTempSdName, bioObj.bioTempSdName) && this.bioTempSdcode == bioObj.bioTempSdcode && Intrinsics.areEqual(this.bioTempVillTownCd, bioObj.bioTempVillTownCd) && Intrinsics.areEqual(this.bioTempVillTownName, bioObj.bioTempVillTownName) && Intrinsics.areEqual(this.bioTokenId, bioObj.bioTokenId) && Intrinsics.areEqual(this.bioTransType, bioObj.bioTransType) && this.bioUserId == bioObj.bioUserId && Intrinsics.areEqual(this.dob, bioObj.dob) && Intrinsics.areEqual(this.fullAddress, bioObj.fullAddress) && Intrinsics.areEqual(this.pht, bioObj.pht);
    }

    public final boolean getAadharAuthenticated() {
        return this.aadharAuthenticated;
    }

    public final int getApplEmpcatg() {
        return this.applEmpcatg;
    }

    public final Object getBiPhoto() {
        return this.biPhoto;
    }

    public final Object getBioAadhaarName() {
        return this.bioAadhaarName;
    }

    public final Object getBioAadhaarNo() {
        return this.bioAadhaarNo;
    }

    public final Object getBioAadharEnrollNo() {
        return this.bioAadharEnrollNo;
    }

    public final Object getBioAddclm1() {
        return this.bioAddclm1;
    }

    public final Object getBioAddclm2() {
        return this.bioAddclm2;
    }

    public final Object getBioAddclm3() {
        return this.bioAddclm3;
    }

    public final Object getBioAltMobileNo() {
        return this.bioAltMobileNo;
    }

    public final Object getBioApplicantCatg() {
        return this.bioApplicantCatg;
    }

    public final String getBioApplno() {
        return this.bioApplno;
    }

    public final String getBioBioId() {
        return this.bioBioId;
    }

    public final String getBioBioidSearch() {
        return this.bioBioidSearch;
    }

    public final Object getBioBirthplace() {
        return this.bioBirthplace;
    }

    public final Object getBioBloodGroup() {
        return this.bioBloodGroup;
    }

    public final String getBioBloodGroupname() {
        return this.bioBloodGroupname;
    }

    public final Object getBioCategory() {
        return this.bioCategory;
    }

    public final String getBioCitiZen() {
        return this.bioCitiZen;
    }

    public final Object getBioCommunityCd() {
        return this.bioCommunityCd;
    }

    public final Object getBioCriminalHistory() {
        return this.bioCriminalHistory;
    }

    public final String getBioDependentRelation() {
        return this.bioDependentRelation;
    }

    public final Object getBioDigest() {
        return this.bioDigest;
    }

    public final String getBioDlno() {
        return this.bioDlno;
    }

    public final String getBioDob() {
        return this.bioDob;
    }

    public final Object getBioEkycid() {
        return this.bioEkycid;
    }

    public final Object getBioEkycopted() {
        return this.bioEkycopted;
    }

    public final Object getBioEmailId() {
        return this.bioEmailId;
    }

    public final String getBioEndorsedt() {
        return this.bioEndorsedt;
    }

    public final String getBioEndorsementNo() {
        return this.bioEndorsementNo;
    }

    public final String getBioEndorsetime() {
        return this.bioEndorsetime;
    }

    public final Object getBioFamilyId() {
        return this.bioFamilyId;
    }

    public final String getBioFirstName() {
        return this.bioFirstName;
    }

    public final String getBioFullName() {
        return this.bioFullName;
    }

    public final int getBioGender() {
        return this.bioGender;
    }

    public final String getBioGenderDesc() {
        return this.bioGenderDesc;
    }

    public final Object getBioIdentityMark1() {
        return this.bioIdentityMark1;
    }

    public final Object getBioIdentityMark2() {
        return this.bioIdentityMark2;
    }

    public final String getBioLastName() {
        return this.bioLastName;
    }

    public final Object getBioMaritalStatus() {
        return this.bioMaritalStatus;
    }

    public final Object getBioMemberId() {
        return this.bioMemberId;
    }

    public final Object getBioMiddleName() {
        return this.bioMiddleName;
    }

    public final Object getBioMobileNo() {
        return this.bioMobileNo;
    }

    public final Object getBioMotherFname() {
        return this.bioMotherFname;
    }

    public final Object getBioMotherLname() {
        return this.bioMotherLname;
    }

    public final Object getBioMotherMname() {
        return this.bioMotherMname;
    }

    public final String getBioNatName() {
        return this.bioNatName;
    }

    public final Object getBioNprNo() {
        return this.bioNprNo;
    }

    public final Object getBioOrganDonor() {
        return this.bioOrganDonor;
    }

    public final Object getBioPerDetAadhaar() {
        return this.bioPerDetAadhaar;
    }

    public final String getBioPermAdd1() {
        return this.bioPermAdd1;
    }

    public final String getBioPermAdd2() {
        return this.bioPermAdd2;
    }

    public final String getBioPermAdd3() {
        return this.bioPermAdd3;
    }

    public final Object getBioPermDistCd() {
        return this.bioPermDistCd;
    }

    public final Object getBioPermDistName() {
        return this.bioPermDistName;
    }

    public final Object getBioPermLocType() {
        return this.bioPermLocType;
    }

    public final Object getBioPermLocal() {
        return this.bioPermLocal;
    }

    public final Object getBioPermPin() {
        return this.bioPermPin;
    }

    public final Object getBioPermSdName() {
        return this.bioPermSdName;
    }

    public final int getBioPermSdcode() {
        return this.bioPermSdcode;
    }

    public final Object getBioPermVillTownCd() {
        return this.bioPermVillTownCd;
    }

    public final Object getBioPermVillTownName() {
        return this.bioPermVillTownName;
    }

    public final Object getBioPhoneNo() {
        return this.bioPhoneNo;
    }

    public final Object getBioPoliceStncd() {
        return this.bioPoliceStncd;
    }

    public final int getBioQmQualcd() {
        return this.bioQmQualcd;
    }

    public final String getBioRecGenesis() {
        return this.bioRecGenesis;
    }

    public final Object getBioReligion() {
        return this.bioReligion;
    }

    public final Object getBioStateCd() {
        return this.bioStateCd;
    }

    public final Object getBioStayperiodPresentAddr() {
        return this.bioStayperiodPresentAddr;
    }

    public final String getBioSwdFname() {
        return this.bioSwdFname;
    }

    public final String getBioSwdFullName() {
        return this.bioSwdFullName;
    }

    public final String getBioSwdLname() {
        return this.bioSwdLname;
    }

    public final Object getBioSwdMname() {
        return this.bioSwdMname;
    }

    public final String getBioTempAdd1() {
        return this.bioTempAdd1;
    }

    public final String getBioTempAdd2() {
        return this.bioTempAdd2;
    }

    public final String getBioTempAdd3() {
        return this.bioTempAdd3;
    }

    public final Object getBioTempDistCd() {
        return this.bioTempDistCd;
    }

    public final Object getBioTempDistName() {
        return this.bioTempDistName;
    }

    public final Object getBioTempLocType() {
        return this.bioTempLocType;
    }

    public final Object getBioTempLocal() {
        return this.bioTempLocal;
    }

    public final Object getBioTempPin() {
        return this.bioTempPin;
    }

    public final Object getBioTempSdName() {
        return this.bioTempSdName;
    }

    public final int getBioTempSdcode() {
        return this.bioTempSdcode;
    }

    public final Object getBioTempVillTownCd() {
        return this.bioTempVillTownCd;
    }

    public final Object getBioTempVillTownName() {
        return this.bioTempVillTownName;
    }

    public final Object getBioTokenId() {
        return this.bioTokenId;
    }

    public final Object getBioTransType() {
        return this.bioTransType;
    }

    public final int getBioUserId() {
        return this.bioUserId;
    }

    public final Object getDob() {
        return this.dob;
    }

    public final Object getFullAddress() {
        return this.fullAddress;
    }

    public final Object getPht() {
        return this.pht;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v182 */
    /* JADX WARN: Type inference failed for: r0v183 */
    public int hashCode() {
        boolean z = this.aadharAuthenticated;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((r0 * 31) + Integer.hashCode(this.applEmpcatg)) * 31) + this.biPhoto.hashCode()) * 31) + this.bioAadhaarName.hashCode()) * 31) + this.bioAadhaarNo.hashCode()) * 31) + this.bioAadharEnrollNo.hashCode()) * 31) + this.bioAddclm1.hashCode()) * 31) + this.bioAddclm2.hashCode()) * 31) + this.bioAddclm3.hashCode()) * 31) + this.bioAltMobileNo.hashCode()) * 31) + this.bioApplicantCatg.hashCode()) * 31) + this.bioApplno.hashCode()) * 31) + this.bioBioId.hashCode()) * 31) + this.bioBioidSearch.hashCode()) * 31) + this.bioBirthplace.hashCode()) * 31) + this.bioBloodGroup.hashCode()) * 31) + this.bioBloodGroupname.hashCode()) * 31) + this.bioCategory.hashCode()) * 31) + this.bioCitiZen.hashCode()) * 31) + this.bioCommunityCd.hashCode()) * 31) + this.bioCriminalHistory.hashCode()) * 31) + this.bioDependentRelation.hashCode()) * 31) + this.bioDigest.hashCode()) * 31) + this.bioDlno.hashCode()) * 31) + this.bioDob.hashCode()) * 31) + this.bioEkycid.hashCode()) * 31) + this.bioEkycopted.hashCode()) * 31) + this.bioEmailId.hashCode()) * 31) + this.bioEndorsedt.hashCode()) * 31) + this.bioEndorsementNo.hashCode()) * 31) + this.bioEndorsetime.hashCode()) * 31) + this.bioFamilyId.hashCode()) * 31) + this.bioFirstName.hashCode()) * 31) + this.bioFullName.hashCode()) * 31) + Integer.hashCode(this.bioGender)) * 31) + this.bioGenderDesc.hashCode()) * 31) + this.bioIdentityMark1.hashCode()) * 31) + this.bioIdentityMark2.hashCode()) * 31) + this.bioLastName.hashCode()) * 31) + this.bioMaritalStatus.hashCode()) * 31) + this.bioMemberId.hashCode()) * 31) + this.bioMiddleName.hashCode()) * 31) + this.bioMobileNo.hashCode()) * 31) + this.bioMotherFname.hashCode()) * 31) + this.bioMotherLname.hashCode()) * 31) + this.bioMotherMname.hashCode()) * 31) + this.bioNatName.hashCode()) * 31) + this.bioNprNo.hashCode()) * 31) + this.bioOrganDonor.hashCode()) * 31) + this.bioPerDetAadhaar.hashCode()) * 31) + this.bioPermAdd1.hashCode()) * 31) + this.bioPermAdd2.hashCode()) * 31) + this.bioPermAdd3.hashCode()) * 31) + this.bioPermDistCd.hashCode()) * 31) + this.bioPermDistName.hashCode()) * 31) + this.bioPermLocType.hashCode()) * 31) + this.bioPermLocal.hashCode()) * 31) + this.bioPermPin.hashCode()) * 31) + this.bioPermSdName.hashCode()) * 31) + Integer.hashCode(this.bioPermSdcode)) * 31) + this.bioPermVillTownCd.hashCode()) * 31) + this.bioPermVillTownName.hashCode()) * 31) + this.bioPhoneNo.hashCode()) * 31) + this.bioPoliceStncd.hashCode()) * 31) + Integer.hashCode(this.bioQmQualcd)) * 31) + this.bioRecGenesis.hashCode()) * 31) + this.bioReligion.hashCode()) * 31) + this.bioStateCd.hashCode()) * 31) + this.bioStayperiodPresentAddr.hashCode()) * 31) + this.bioSwdFname.hashCode()) * 31) + this.bioSwdFullName.hashCode()) * 31) + this.bioSwdLname.hashCode()) * 31) + this.bioSwdMname.hashCode()) * 31) + this.bioTempAdd1.hashCode()) * 31) + this.bioTempAdd2.hashCode()) * 31) + this.bioTempAdd3.hashCode()) * 31) + this.bioTempDistCd.hashCode()) * 31) + this.bioTempDistName.hashCode()) * 31) + this.bioTempLocType.hashCode()) * 31) + this.bioTempLocal.hashCode()) * 31) + this.bioTempPin.hashCode()) * 31) + this.bioTempSdName.hashCode()) * 31) + Integer.hashCode(this.bioTempSdcode)) * 31) + this.bioTempVillTownCd.hashCode()) * 31) + this.bioTempVillTownName.hashCode()) * 31) + this.bioTokenId.hashCode()) * 31) + this.bioTransType.hashCode()) * 31) + Integer.hashCode(this.bioUserId)) * 31) + this.dob.hashCode()) * 31) + this.fullAddress.hashCode()) * 31) + this.pht.hashCode();
    }

    public String toString() {
        return "BioObj(aadharAuthenticated=" + this.aadharAuthenticated + ", applEmpcatg=" + this.applEmpcatg + ", biPhoto=" + this.biPhoto + ", bioAadhaarName=" + this.bioAadhaarName + ", bioAadhaarNo=" + this.bioAadhaarNo + ", bioAadharEnrollNo=" + this.bioAadharEnrollNo + ", bioAddclm1=" + this.bioAddclm1 + ", bioAddclm2=" + this.bioAddclm2 + ", bioAddclm3=" + this.bioAddclm3 + ", bioAltMobileNo=" + this.bioAltMobileNo + ", bioApplicantCatg=" + this.bioApplicantCatg + ", bioApplno=" + this.bioApplno + ", bioBioId=" + this.bioBioId + ", bioBioidSearch=" + this.bioBioidSearch + ", bioBirthplace=" + this.bioBirthplace + ", bioBloodGroup=" + this.bioBloodGroup + ", bioBloodGroupname=" + this.bioBloodGroupname + ", bioCategory=" + this.bioCategory + ", bioCitiZen=" + this.bioCitiZen + ", bioCommunityCd=" + this.bioCommunityCd + ", bioCriminalHistory=" + this.bioCriminalHistory + ", bioDependentRelation=" + this.bioDependentRelation + ", bioDigest=" + this.bioDigest + ", bioDlno=" + this.bioDlno + ", bioDob=" + this.bioDob + ", bioEkycid=" + this.bioEkycid + ", bioEkycopted=" + this.bioEkycopted + ", bioEmailId=" + this.bioEmailId + ", bioEndorsedt=" + this.bioEndorsedt + ", bioEndorsementNo=" + this.bioEndorsementNo + ", bioEndorsetime=" + this.bioEndorsetime + ", bioFamilyId=" + this.bioFamilyId + ", bioFirstName=" + this.bioFirstName + ", bioFullName=" + this.bioFullName + ", bioGender=" + this.bioGender + ", bioGenderDesc=" + this.bioGenderDesc + ", bioIdentityMark1=" + this.bioIdentityMark1 + ", bioIdentityMark2=" + this.bioIdentityMark2 + ", bioLastName=" + this.bioLastName + ", bioMaritalStatus=" + this.bioMaritalStatus + ", bioMemberId=" + this.bioMemberId + ", bioMiddleName=" + this.bioMiddleName + ", bioMobileNo=" + this.bioMobileNo + ", bioMotherFname=" + this.bioMotherFname + ", bioMotherLname=" + this.bioMotherLname + ", bioMotherMname=" + this.bioMotherMname + ", bioNatName=" + this.bioNatName + ", bioNprNo=" + this.bioNprNo + ", bioOrganDonor=" + this.bioOrganDonor + ", bioPerDetAadhaar=" + this.bioPerDetAadhaar + ", bioPermAdd1=" + this.bioPermAdd1 + ", bioPermAdd2=" + this.bioPermAdd2 + ", bioPermAdd3=" + this.bioPermAdd3 + ", bioPermDistCd=" + this.bioPermDistCd + ", bioPermDistName=" + this.bioPermDistName + ", bioPermLocType=" + this.bioPermLocType + ", bioPermLocal=" + this.bioPermLocal + ", bioPermPin=" + this.bioPermPin + ", bioPermSdName=" + this.bioPermSdName + ", bioPermSdcode=" + this.bioPermSdcode + ", bioPermVillTownCd=" + this.bioPermVillTownCd + ", bioPermVillTownName=" + this.bioPermVillTownName + ", bioPhoneNo=" + this.bioPhoneNo + ", bioPoliceStncd=" + this.bioPoliceStncd + ", bioQmQualcd=" + this.bioQmQualcd + ", bioRecGenesis=" + this.bioRecGenesis + ", bioReligion=" + this.bioReligion + ", bioStateCd=" + this.bioStateCd + ", bioStayperiodPresentAddr=" + this.bioStayperiodPresentAddr + ", bioSwdFname=" + this.bioSwdFname + ", bioSwdFullName=" + this.bioSwdFullName + ", bioSwdLname=" + this.bioSwdLname + ", bioSwdMname=" + this.bioSwdMname + ", bioTempAdd1=" + this.bioTempAdd1 + ", bioTempAdd2=" + this.bioTempAdd2 + ", bioTempAdd3=" + this.bioTempAdd3 + ", bioTempDistCd=" + this.bioTempDistCd + ", bioTempDistName=" + this.bioTempDistName + ", bioTempLocType=" + this.bioTempLocType + ", bioTempLocal=" + this.bioTempLocal + ", bioTempPin=" + this.bioTempPin + ", bioTempSdName=" + this.bioTempSdName + ", bioTempSdcode=" + this.bioTempSdcode + ", bioTempVillTownCd=" + this.bioTempVillTownCd + ", bioTempVillTownName=" + this.bioTempVillTownName + ", bioTokenId=" + this.bioTokenId + ", bioTransType=" + this.bioTransType + ", bioUserId=" + this.bioUserId + ", dob=" + this.dob + ", fullAddress=" + this.fullAddress + ", pht=" + this.pht + ')';
    }
}
