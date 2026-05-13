package com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\bB\n\u0002\u0018\u0002\n\u0003\bÏ\u0001\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BÏ\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010!\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0015\u0012\b\u00100\u001a\u0004\u0018\u00010\u0003\u0012\b\u00101\u001a\u0004\u0018\u00010\u0015\u0012\b\u00102\u001a\u0004\u0018\u00010\u0015\u0012\b\u00103\u001a\u0004\u0018\u00010\u0003\u0012\b\u00104\u001a\u0004\u0018\u00010\u0015\u0012\b\u00105\u001a\u0004\u0018\u00010\u0015\u0012\b\u00106\u001a\u0004\u0018\u00010\u0003\u0012\b\u00107\u001a\u0004\u0018\u00010\u0015\u0012\b\u00108\u001a\u0004\u0018\u00010\u0003\u0012\b\u00109\u001a\u0004\u0018\u00010!\u0012\b\u0010:\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010;\u001a\u0004\u0018\u00010!\u0012\b\u0010<\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010=\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010>\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010?\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010@\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010A\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010B\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010C\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010D\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010E\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010F\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010G\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010H\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010I\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010J\u001a\u0004\u0018\u00010!\u0012\b\u0010K\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010L\u001a\u0004\u0018\u00010!\u0012\b\u0010M\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010N\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010O\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010P\u001a\u0004\u0018\u00010!\u0012\b\u0010Q\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010R\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010S\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010T\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010U\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010V\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010W\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010X\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010Y\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010Z\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010[\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\\\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010]\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010^\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010_\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010`\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010c\u001a\u0004\u0018\u00010d\u0012\b\u0010e\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010f\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010gJ\f\u0010Ð\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ñ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ò\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ó\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ô\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Õ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ö\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010×\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ø\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010Ù\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010|J\f\u0010Ú\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Û\u0001\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\f\u0010Ü\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ý\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Þ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ß\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010à\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010á\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010â\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ã\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ä\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0012\u0010å\u0001\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0003\u0010\u0089\u0001J\f\u0010æ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ç\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010è\u0001\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\f\u0010é\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010ê\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010|J\f\u0010ë\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ì\u0001\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u0011\u0010í\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010|J\f\u0010î\u0001\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u0011\u0010ï\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010|J\f\u0010ð\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ñ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ò\u0001\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u0011\u0010ó\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010|J\f\u0010ô\u0001\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u0011\u0010õ\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010|J\f\u0010ö\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010÷\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010|J\u0011\u0010ø\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010|J\f\u0010ù\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010ú\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010|J\u0011\u0010û\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010|J\f\u0010ü\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ý\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010þ\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010|J\f\u0010ÿ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0012\u0010\u0080\u0002\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0003\u0010\u0089\u0001J\f\u0010\u0081\u0002\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u0012\u0010\u0082\u0002\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0003\u0010\u0089\u0001J\u0011\u0010\u0083\u0002\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010|J\f\u0010\u0084\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0085\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0086\u0002\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010|J\f\u0010\u0087\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0088\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0089\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008a\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u008b\u0002\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010|J\f\u0010\u008c\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u008d\u0002\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010|J\u0011\u0010\u008e\u0002\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010|J\f\u0010\u008f\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0090\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0091\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0092\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0012\u0010\u0093\u0002\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0003\u0010\u0089\u0001J\f\u0010\u0094\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0012\u0010\u0095\u0002\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0003\u0010\u0089\u0001J\f\u0010\u0096\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0097\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0098\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0012\u0010\u0099\u0002\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0003\u0010\u0089\u0001J\u0011\u0010\u009a\u0002\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010|J\u0011\u0010\u009b\u0002\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010|J\f\u0010\u009c\u0002\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\f\u0010\u009d\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009e\u0002\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\f\u0010\u009f\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010 \u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¡\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¢\u0002\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\f\u0010£\u0002\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u0011\u0010¤\u0002\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010|J\f\u0010¥\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¦\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010§\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¨\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010©\u0002\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010|J\f\u0010ª\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010«\u0002\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010|J\f\u0010¬\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u00ad\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010®\u0002\u001a\u0004\u0018\u00010dHÆ\u0003J\f\u0010¯\u0002\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\f\u0010°\u0002\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u009c\t\u0010±\u0002\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00109\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010J\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010L\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010P\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010]\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010^\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010_\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010`\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010c\u001a\u0004\u0018\u00010d2\n\b\u0002\u0010e\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010f\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0003\u0010²\u0002J\u0016\u0010³\u0002\u001a\u00030´\u00022\t\u0010µ\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010¶\u0002\u001a\u00020\u0015HÖ\u0001J\n\u0010·\u0002\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bh\u0010iR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\bj\u0010kR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bl\u0010iR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bm\u0010iR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bn\u0010iR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bo\u0010iR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bp\u0010iR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bq\u0010iR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\br\u0010iR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bs\u0010iR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bt\u0010iR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bu\u0010iR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bv\u0010iR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bw\u0010iR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bx\u0010iR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\by\u0010iR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bz\u0010iR\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010}\u001a\u0004\b{\u0010|R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b~\u0010iR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010iR\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010iR\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010iR\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010iR\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0083\u0001\u0010iR\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0084\u0001\u0010iR\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0085\u0001\u0010iR\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0086\u0001\u0010iR\u0014\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0087\u0001\u0010iR\u0018\u0010 \u001a\u0004\u0018\u00010!¢\u0006\r\n\u0003\u0010\u008a\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0014\u0010\"\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u008b\u0001\u0010iR\u0014\u0010#\u001a\u0004\u0018\u00010\u0001¢\u0006\t\n\u0000\u001a\u0005\b\u008c\u0001\u0010kR\u0014\u0010$\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u008d\u0001\u0010iR\u0016\u0010%\u001a\u0004\u0018\u00010\u0015¢\u0006\u000b\n\u0002\u0010}\u001a\u0005\b\u008e\u0001\u0010|R\u0014\u0010&\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u008f\u0001\u0010iR\u0014\u0010'\u001a\u0004\u0018\u00010\u0001¢\u0006\t\n\u0000\u001a\u0005\b\u0090\u0001\u0010kR\u0016\u0010(\u001a\u0004\u0018\u00010\u0015¢\u0006\u000b\n\u0002\u0010}\u001a\u0005\b\u0091\u0001\u0010|R\u0014\u0010)\u001a\u0004\u0018\u00010\u0001¢\u0006\t\n\u0000\u001a\u0005\b\u0092\u0001\u0010kR\u0016\u0010*\u001a\u0004\u0018\u00010\u0015¢\u0006\u000b\n\u0002\u0010}\u001a\u0005\b\u0093\u0001\u0010|R\u0014\u0010+\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0094\u0001\u0010iR\u0014\u0010,\u001a\u0004\u0018\u00010\u0001¢\u0006\t\n\u0000\u001a\u0005\b\u0095\u0001\u0010kR\u0016\u0010-\u001a\u0004\u0018\u00010\u0015¢\u0006\u000b\n\u0002\u0010}\u001a\u0005\b\u0096\u0001\u0010|R\u0014\u0010.\u001a\u0004\u0018\u00010\u0001¢\u0006\t\n\u0000\u001a\u0005\b\u0097\u0001\u0010kR\u0016\u0010/\u001a\u0004\u0018\u00010\u0015¢\u0006\u000b\n\u0002\u0010}\u001a\u0005\b\u0098\u0001\u0010|R\u0014\u00100\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0099\u0001\u0010iR\u0016\u00101\u001a\u0004\u0018\u00010\u0015¢\u0006\u000b\n\u0002\u0010}\u001a\u0005\b\u009a\u0001\u0010|R\u0016\u00102\u001a\u0004\u0018\u00010\u0015¢\u0006\u000b\n\u0002\u0010}\u001a\u0005\b\u009b\u0001\u0010|R\u0014\u00103\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u009c\u0001\u0010iR\u0016\u00104\u001a\u0004\u0018\u00010\u0015¢\u0006\u000b\n\u0002\u0010}\u001a\u0005\b\u009d\u0001\u0010|R\u0016\u00105\u001a\u0004\u0018\u00010\u0015¢\u0006\u000b\n\u0002\u0010}\u001a\u0005\b\u009e\u0001\u0010|R\u0014\u00106\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u009f\u0001\u0010iR\u0016\u00107\u001a\u0004\u0018\u00010\u0015¢\u0006\u000b\n\u0002\u0010}\u001a\u0005\b \u0001\u0010|R\u0014\u00108\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b¡\u0001\u0010iR\u0018\u00109\u001a\u0004\u0018\u00010!¢\u0006\r\n\u0003\u0010\u008a\u0001\u001a\u0006\b¢\u0001\u0010\u0089\u0001R\u0014\u0010:\u001a\u0004\u0018\u00010\u0001¢\u0006\t\n\u0000\u001a\u0005\b£\u0001\u0010kR\u0018\u0010;\u001a\u0004\u0018\u00010!¢\u0006\r\n\u0003\u0010\u008a\u0001\u001a\u0006\b¤\u0001\u0010\u0089\u0001R\u0016\u0010<\u001a\u0004\u0018\u00010\u0015¢\u0006\u000b\n\u0002\u0010}\u001a\u0005\b¥\u0001\u0010|R\u0014\u0010=\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b¦\u0001\u0010iR\u0014\u0010>\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b§\u0001\u0010iR\u0016\u0010?\u001a\u0004\u0018\u00010\u0015¢\u0006\u000b\n\u0002\u0010}\u001a\u0005\b¨\u0001\u0010|R\u0014\u0010@\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b©\u0001\u0010iR\u0014\u0010A\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bª\u0001\u0010iR\u0014\u0010B\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b«\u0001\u0010iR\u0016\u0010C\u001a\u0004\u0018\u00010\u0015¢\u0006\u000b\n\u0002\u0010}\u001a\u0005\b¬\u0001\u0010|R\u0014\u0010D\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u00ad\u0001\u0010iR\u0016\u0010E\u001a\u0004\u0018\u00010\u0015¢\u0006\u000b\n\u0002\u0010}\u001a\u0005\b®\u0001\u0010|R\u0016\u0010F\u001a\u0004\u0018\u00010\u0015¢\u0006\u000b\n\u0002\u0010}\u001a\u0005\b¯\u0001\u0010|R\u0014\u0010G\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b°\u0001\u0010iR\u0014\u0010H\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b±\u0001\u0010iR\u0014\u0010I\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b²\u0001\u0010iR\u0018\u0010J\u001a\u0004\u0018\u00010!¢\u0006\r\n\u0003\u0010\u008a\u0001\u001a\u0006\b³\u0001\u0010\u0089\u0001R\u0014\u0010K\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b´\u0001\u0010iR\u0018\u0010L\u001a\u0004\u0018\u00010!¢\u0006\r\n\u0003\u0010\u008a\u0001\u001a\u0006\bµ\u0001\u0010\u0089\u0001R\u0014\u0010M\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b¶\u0001\u0010iR\u0014\u0010N\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b·\u0001\u0010iR\u0014\u0010O\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b¸\u0001\u0010iR\u0018\u0010P\u001a\u0004\u0018\u00010!¢\u0006\r\n\u0003\u0010\u008a\u0001\u001a\u0006\b¹\u0001\u0010\u0089\u0001R\u0016\u0010Q\u001a\u0004\u0018\u00010\u0015¢\u0006\u000b\n\u0002\u0010}\u001a\u0005\bº\u0001\u0010|R\u0016\u0010R\u001a\u0004\u0018\u00010\u0015¢\u0006\u000b\n\u0002\u0010}\u001a\u0005\b»\u0001\u0010|R\u0014\u0010S\u001a\u0004\u0018\u00010\u0001¢\u0006\t\n\u0000\u001a\u0005\b¼\u0001\u0010kR\u0014\u0010T\u001a\u0004\u0018\u00010\u0001¢\u0006\t\n\u0000\u001a\u0005\b½\u0001\u0010kR\u0014\u0010U\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b¾\u0001\u0010iR\u0014\u0010V\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b¿\u0001\u0010iR\u0014\u0010W\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÀ\u0001\u0010iR\u0014\u0010X\u001a\u0004\u0018\u00010\u0001¢\u0006\t\n\u0000\u001a\u0005\bÁ\u0001\u0010kR\u0014\u0010Y\u001a\u0004\u0018\u00010\u0001¢\u0006\t\n\u0000\u001a\u0005\bÂ\u0001\u0010kR\u0016\u0010Z\u001a\u0004\u0018\u00010\u0015¢\u0006\u000b\n\u0002\u0010}\u001a\u0005\bÃ\u0001\u0010|R\u0014\u0010[\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÄ\u0001\u0010iR\u0014\u0010\\\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÅ\u0001\u0010iR\u0014\u0010]\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÆ\u0001\u0010iR\u0016\u0010^\u001a\u0004\u0018\u00010\u0015¢\u0006\u000b\n\u0002\u0010}\u001a\u0005\bÇ\u0001\u0010|R\u0014\u0010_\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÈ\u0001\u0010iR\u0016\u0010`\u001a\u0004\u0018\u00010\u0015¢\u0006\u000b\n\u0002\u0010}\u001a\u0005\bÉ\u0001\u0010|R\u0014\u0010a\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÊ\u0001\u0010iR\u0014\u0010b\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bË\u0001\u0010iR\u0015\u0010c\u001a\u0004\u0018\u00010d¢\u0006\n\n\u0000\u001a\u0006\bÌ\u0001\u0010Í\u0001R\u0014\u0010e\u001a\u0004\u0018\u00010\u0001¢\u0006\t\n\u0000\u001a\u0005\bÎ\u0001\u0010kR\u0014\u0010f\u001a\u0004\u0018\u00010\u0001¢\u0006\t\n\u0000\u001a\u0005\bÏ\u0001\u0010k¨\u0006¸\u0002"}, d2 = {"Lcom/nic/mparivahan/VahanServices/AlterationOfVehicle/AOVModel/OwnerInfo;", "", "acfitted", "", "annualincome", "audiofitted", "bodytype", "cadd1", "cadd2", "cadd3", "catgdescr", "cdistrict", "cdistrictname", "chasino", "chasinofull", "chasinooriginal", "color", "cpincode", "cstate", "cstatename", "cubiccap", "", "dealercd", "dlradd1", "dlradd2", "dlradd3", "dlrcity", "dlrdistrict", "dlrname", "dlrpincode", "engno", "engnofull", "fitupto", "", "fituptodescr", "floorarea", "fname", "fuel", "fueldescr", "garageadd", "gcw", "height", "hp", "importedvch", "lasercode", "ldwt", "length", "maker", "makermodel", "manumon", "manuyr", "modelcd", "nocyl", "norms", "normsdescr", "offcd", "offname", "opdt", "othercriteria", "ownerFrom", "ownercd", "ownercddescr", "ownername", "ownersr", "padd1", "padd2", "padd3", "pdistrict", "pdistrictname", "permitrtocd", "ppincode", "pstate", "pstatename", "purchasedt", "purchasedtasDate", "regndt", "regndtasdate", "regnno", "regntype", "regntypedescr", "regnupto", "saleamt", "seatcap", "sleepercap", "standcap", "statecd", "statename", "status", "taxmode", "transportcatg", "unldwt", "vchcatg", "vchpurchaseas", "vchpurchaseasCode", "vehTypeAsInt", "vehtype", "vhclass", "vhclassdescr", "videofitted", "vtOwnerIdentification", "Lcom/nic/mparivahan/VahanServices/AlterationOfVehicle/AOVModel/VtOwnerIdentification;", "wheelbase", "width", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Object;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/AlterationOfVehicle/AOVModel/VtOwnerIdentification;Ljava/lang/Object;Ljava/lang/Object;)V", "getAcfitted", "()Ljava/lang/String;", "getAnnualincome", "()Ljava/lang/Object;", "getAudiofitted", "getBodytype", "getCadd1", "getCadd2", "getCadd3", "getCatgdescr", "getCdistrict", "getCdistrictname", "getChasino", "getChasinofull", "getChasinooriginal", "getColor", "getCpincode", "getCstate", "getCstatename", "getCubiccap", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDealercd", "getDlradd1", "getDlradd2", "getDlradd3", "getDlrcity", "getDlrdistrict", "getDlrname", "getDlrpincode", "getEngno", "getEngnofull", "getFitupto", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getFituptodescr", "getFloorarea", "getFname", "getFuel", "getFueldescr", "getGarageadd", "getGcw", "getHeight", "getHp", "getImportedvch", "getLasercode", "getLdwt", "getLength", "getMaker", "getMakermodel", "getManumon", "getManuyr", "getModelcd", "getNocyl", "getNorms", "getNormsdescr", "getOffcd", "getOffname", "getOpdt", "getOthercriteria", "getOwnerFrom", "getOwnercd", "getOwnercddescr", "getOwnername", "getOwnersr", "getPadd1", "getPadd2", "getPadd3", "getPdistrict", "getPdistrictname", "getPermitrtocd", "getPpincode", "getPstate", "getPstatename", "getPurchasedt", "getPurchasedtasDate", "getRegndt", "getRegndtasdate", "getRegnno", "getRegntype", "getRegntypedescr", "getRegnupto", "getSaleamt", "getSeatcap", "getSleepercap", "getStandcap", "getStatecd", "getStatename", "getStatus", "getTaxmode", "getTransportcatg", "getUnldwt", "getVchcatg", "getVchpurchaseas", "getVchpurchaseasCode", "getVehTypeAsInt", "getVehtype", "getVhclass", "getVhclassdescr", "getVideofitted", "getVtOwnerIdentification", "()Lcom/nic/mparivahan/VahanServices/AlterationOfVehicle/AOVModel/VtOwnerIdentification;", "getWheelbase", "getWidth", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component6", "component60", "component61", "component62", "component63", "component64", "component65", "component66", "component67", "component68", "component69", "component7", "component70", "component71", "component72", "component73", "component74", "component75", "component76", "component77", "component78", "component79", "component8", "component80", "component81", "component82", "component83", "component84", "component85", "component86", "component87", "component88", "component89", "component9", "component90", "component91", "component92", "component93", "component94", "component95", "component96", "component97", "copy", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Object;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/AlterationOfVehicle/AOVModel/VtOwnerIdentification;Ljava/lang/Object;Ljava/lang/Object;)Lcom/nic/mparivahan/VahanServices/AlterationOfVehicle/AOVModel/OwnerInfo;", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class OwnerInfo {
    private final String acfitted;
    private final Object annualincome;
    private final String audiofitted;
    private final String bodytype;
    private final String cadd1;
    private final String cadd2;
    private final String cadd3;
    private final String catgdescr;
    private final String cdistrict;
    private final String cdistrictname;
    private final String chasino;
    private final String chasinofull;
    private final String chasinooriginal;
    private final String color;
    private final String cpincode;
    private final String cstate;
    private final String cstatename;
    private final Integer cubiccap;
    private final String dealercd;
    private final String dlradd1;
    private final String dlradd2;
    private final String dlradd3;
    private final String dlrcity;
    private final String dlrdistrict;
    private final String dlrname;
    private final String dlrpincode;
    private final String engno;
    private final String engnofull;
    private final Long fitupto;
    private final String fituptodescr;
    private final Object floorarea;
    private final String fname;
    private final Integer fuel;
    private final String fueldescr;
    private final Object garageadd;
    private final Integer gcw;
    private final Object height;
    private final Integer hp;
    private final String importedvch;
    private final Object lasercode;
    private final Integer ldwt;
    private final Object length;
    private final Integer maker;
    private final String makermodel;
    private final Integer manumon;
    private final Integer manuyr;
    private final String modelcd;
    private final Integer nocyl;
    private final Integer norms;
    private final String normsdescr;
    private final Integer offcd;
    private final String offname;
    private final Long opdt;
    private final Object othercriteria;
    private final Long ownerFrom;
    private final Integer ownercd;
    private final String ownercddescr;
    private final String ownername;
    private final Integer ownersr;
    private final String padd1;
    private final String padd2;
    private final String padd3;
    private final Integer pdistrict;
    private final String pdistrictname;
    private final Integer permitrtocd;
    private final Integer ppincode;
    private final String pstate;
    private final String pstatename;
    private final String purchasedt;
    private final Long purchasedtasDate;
    private final String regndt;
    private final Long regndtasdate;
    private final String regnno;
    private final String regntype;
    private final String regntypedescr;
    private final Long regnupto;
    private final Integer saleamt;
    private final Integer seatcap;
    private final Object sleepercap;
    private final Object standcap;
    private final String statecd;
    private final String statename;
    private final String status;
    private final Object taxmode;
    private final Object transportcatg;
    private final Integer unldwt;
    private final String vchcatg;
    private final String vchpurchaseas;
    private final String vchpurchaseasCode;
    private final Integer vehTypeAsInt;
    private final String vehtype;
    private final Integer vhclass;
    private final String vhclassdescr;
    private final String videofitted;
    private final VtOwnerIdentification vtOwnerIdentification;
    private final Object wheelbase;
    private final Object width;

    public OwnerInfo(String str, Object obj, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Integer num, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, Long l, String str27, Object obj2, String str28, Integer num2, String str29, Object obj3, Integer num3, Object obj4, Integer num4, String str30, Object obj5, Integer num5, Object obj6, Integer num6, String str31, Integer num7, Integer num8, String str32, Integer num9, Integer num10, String str33, Integer num11, String str34, Long l2, Object obj7, Long l3, Integer num12, String str35, String str36, Integer num13, String str37, String str38, String str39, Integer num14, String str40, Integer num15, Integer num16, String str41, String str42, String str43, Long l4, String str44, Long l5, String str45, String str46, String str47, Long l6, Integer num17, Integer num18, Object obj8, Object obj9, String str48, String str49, String str50, Object obj10, Object obj11, Integer num19, String str51, String str52, String str53, Integer num20, String str54, Integer num21, String str55, String str56, VtOwnerIdentification vtOwnerIdentification, Object obj12, Object obj13) {
        this.acfitted = str;
        this.annualincome = obj;
        this.audiofitted = str2;
        this.bodytype = str3;
        this.cadd1 = str4;
        this.cadd2 = str5;
        this.cadd3 = str6;
        this.catgdescr = str7;
        this.cdistrict = str8;
        this.cdistrictname = str9;
        this.chasino = str10;
        this.chasinofull = str11;
        this.chasinooriginal = str12;
        this.color = str13;
        this.cpincode = str14;
        this.cstate = str15;
        this.cstatename = str16;
        this.cubiccap = num;
        this.dealercd = str17;
        this.dlradd1 = str18;
        this.dlradd2 = str19;
        this.dlradd3 = str20;
        this.dlrcity = str21;
        this.dlrdistrict = str22;
        this.dlrname = str23;
        this.dlrpincode = str24;
        this.engno = str25;
        this.engnofull = str26;
        this.fitupto = l;
        this.fituptodescr = str27;
        this.floorarea = obj2;
        this.fname = str28;
        this.fuel = num2;
        this.fueldescr = str29;
        this.garageadd = obj3;
        this.gcw = num3;
        this.height = obj4;
        this.hp = num4;
        this.importedvch = str30;
        this.lasercode = obj5;
        this.ldwt = num5;
        this.length = obj6;
        this.maker = num6;
        this.makermodel = str31;
        this.manumon = num7;
        this.manuyr = num8;
        this.modelcd = str32;
        this.nocyl = num9;
        this.norms = num10;
        this.normsdescr = str33;
        this.offcd = num11;
        this.offname = str34;
        this.opdt = l2;
        this.othercriteria = obj7;
        this.ownerFrom = l3;
        this.ownercd = num12;
        this.ownercddescr = str35;
        this.ownername = str36;
        this.ownersr = num13;
        this.padd1 = str37;
        this.padd2 = str38;
        this.padd3 = str39;
        this.pdistrict = num14;
        this.pdistrictname = str40;
        this.permitrtocd = num15;
        this.ppincode = num16;
        this.pstate = str41;
        this.pstatename = str42;
        this.purchasedt = str43;
        this.purchasedtasDate = l4;
        this.regndt = str44;
        this.regndtasdate = l5;
        this.regnno = str45;
        this.regntype = str46;
        this.regntypedescr = str47;
        this.regnupto = l6;
        this.saleamt = num17;
        this.seatcap = num18;
        this.sleepercap = obj8;
        this.standcap = obj9;
        this.statecd = str48;
        this.statename = str49;
        this.status = str50;
        this.taxmode = obj10;
        this.transportcatg = obj11;
        this.unldwt = num19;
        this.vchcatg = str51;
        this.vchpurchaseas = str52;
        this.vchpurchaseasCode = str53;
        this.vehTypeAsInt = num20;
        this.vehtype = str54;
        this.vhclass = num21;
        this.vhclassdescr = str55;
        this.videofitted = str56;
        this.vtOwnerIdentification = vtOwnerIdentification;
        this.wheelbase = obj12;
        this.width = obj13;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAcfitted() {
        return this.acfitted;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getCdistrictname() {
        return this.cdistrictname;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getChasino() {
        return this.chasino;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getChasinofull() {
        return this.chasinofull;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getChasinooriginal() {
        return this.chasinooriginal;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getCpincode() {
        return this.cpincode;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getCstate() {
        return this.cstate;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getCstatename() {
        return this.cstatename;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Integer getCubiccap() {
        return this.cubiccap;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getDealercd() {
        return this.dealercd;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getAnnualincome() {
        return this.annualincome;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getDlradd1() {
        return this.dlradd1;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getDlradd2() {
        return this.dlradd2;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getDlradd3() {
        return this.dlradd3;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getDlrcity() {
        return this.dlrcity;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getDlrdistrict() {
        return this.dlrdistrict;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getDlrname() {
        return this.dlrname;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getDlrpincode() {
        return this.dlrpincode;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getEngno() {
        return this.engno;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getEngnofull() {
        return this.engnofull;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final Long getFitupto() {
        return this.fitupto;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAudiofitted() {
        return this.audiofitted;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getFituptodescr() {
        return this.fituptodescr;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final Object getFloorarea() {
        return this.floorarea;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getFname() {
        return this.fname;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final Integer getFuel() {
        return this.fuel;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final String getFueldescr() {
        return this.fueldescr;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final Object getGarageadd() {
        return this.garageadd;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final Integer getGcw() {
        return this.gcw;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final Object getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final Integer getHp() {
        return this.hp;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final String getImportedvch() {
        return this.importedvch;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBodytype() {
        return this.bodytype;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final Object getLasercode() {
        return this.lasercode;
    }

    /* JADX INFO: renamed from: component41, reason: from getter */
    public final Integer getLdwt() {
        return this.ldwt;
    }

    /* JADX INFO: renamed from: component42, reason: from getter */
    public final Object getLength() {
        return this.length;
    }

    /* JADX INFO: renamed from: component43, reason: from getter */
    public final Integer getMaker() {
        return this.maker;
    }

    /* JADX INFO: renamed from: component44, reason: from getter */
    public final String getMakermodel() {
        return this.makermodel;
    }

    /* JADX INFO: renamed from: component45, reason: from getter */
    public final Integer getManumon() {
        return this.manumon;
    }

    /* JADX INFO: renamed from: component46, reason: from getter */
    public final Integer getManuyr() {
        return this.manuyr;
    }

    /* JADX INFO: renamed from: component47, reason: from getter */
    public final String getModelcd() {
        return this.modelcd;
    }

    /* JADX INFO: renamed from: component48, reason: from getter */
    public final Integer getNocyl() {
        return this.nocyl;
    }

    /* JADX INFO: renamed from: component49, reason: from getter */
    public final Integer getNorms() {
        return this.norms;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCadd1() {
        return this.cadd1;
    }

    /* JADX INFO: renamed from: component50, reason: from getter */
    public final String getNormsdescr() {
        return this.normsdescr;
    }

    /* JADX INFO: renamed from: component51, reason: from getter */
    public final Integer getOffcd() {
        return this.offcd;
    }

    /* JADX INFO: renamed from: component52, reason: from getter */
    public final String getOffname() {
        return this.offname;
    }

    /* JADX INFO: renamed from: component53, reason: from getter */
    public final Long getOpdt() {
        return this.opdt;
    }

    /* JADX INFO: renamed from: component54, reason: from getter */
    public final Object getOthercriteria() {
        return this.othercriteria;
    }

    /* JADX INFO: renamed from: component55, reason: from getter */
    public final Long getOwnerFrom() {
        return this.ownerFrom;
    }

    /* JADX INFO: renamed from: component56, reason: from getter */
    public final Integer getOwnercd() {
        return this.ownercd;
    }

    /* JADX INFO: renamed from: component57, reason: from getter */
    public final String getOwnercddescr() {
        return this.ownercddescr;
    }

    /* JADX INFO: renamed from: component58, reason: from getter */
    public final String getOwnername() {
        return this.ownername;
    }

    /* JADX INFO: renamed from: component59, reason: from getter */
    public final Integer getOwnersr() {
        return this.ownersr;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCadd2() {
        return this.cadd2;
    }

    /* JADX INFO: renamed from: component60, reason: from getter */
    public final String getPadd1() {
        return this.padd1;
    }

    /* JADX INFO: renamed from: component61, reason: from getter */
    public final String getPadd2() {
        return this.padd2;
    }

    /* JADX INFO: renamed from: component62, reason: from getter */
    public final String getPadd3() {
        return this.padd3;
    }

    /* JADX INFO: renamed from: component63, reason: from getter */
    public final Integer getPdistrict() {
        return this.pdistrict;
    }

    /* JADX INFO: renamed from: component64, reason: from getter */
    public final String getPdistrictname() {
        return this.pdistrictname;
    }

    /* JADX INFO: renamed from: component65, reason: from getter */
    public final Integer getPermitrtocd() {
        return this.permitrtocd;
    }

    /* JADX INFO: renamed from: component66, reason: from getter */
    public final Integer getPpincode() {
        return this.ppincode;
    }

    /* JADX INFO: renamed from: component67, reason: from getter */
    public final String getPstate() {
        return this.pstate;
    }

    /* JADX INFO: renamed from: component68, reason: from getter */
    public final String getPstatename() {
        return this.pstatename;
    }

    /* JADX INFO: renamed from: component69, reason: from getter */
    public final String getPurchasedt() {
        return this.purchasedt;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCadd3() {
        return this.cadd3;
    }

    /* JADX INFO: renamed from: component70, reason: from getter */
    public final Long getPurchasedtasDate() {
        return this.purchasedtasDate;
    }

    /* JADX INFO: renamed from: component71, reason: from getter */
    public final String getRegndt() {
        return this.regndt;
    }

    /* JADX INFO: renamed from: component72, reason: from getter */
    public final Long getRegndtasdate() {
        return this.regndtasdate;
    }

    /* JADX INFO: renamed from: component73, reason: from getter */
    public final String getRegnno() {
        return this.regnno;
    }

    /* JADX INFO: renamed from: component74, reason: from getter */
    public final String getRegntype() {
        return this.regntype;
    }

    /* JADX INFO: renamed from: component75, reason: from getter */
    public final String getRegntypedescr() {
        return this.regntypedescr;
    }

    /* JADX INFO: renamed from: component76, reason: from getter */
    public final Long getRegnupto() {
        return this.regnupto;
    }

    /* JADX INFO: renamed from: component77, reason: from getter */
    public final Integer getSaleamt() {
        return this.saleamt;
    }

    /* JADX INFO: renamed from: component78, reason: from getter */
    public final Integer getSeatcap() {
        return this.seatcap;
    }

    /* JADX INFO: renamed from: component79, reason: from getter */
    public final Object getSleepercap() {
        return this.sleepercap;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCatgdescr() {
        return this.catgdescr;
    }

    /* JADX INFO: renamed from: component80, reason: from getter */
    public final Object getStandcap() {
        return this.standcap;
    }

    /* JADX INFO: renamed from: component81, reason: from getter */
    public final String getStatecd() {
        return this.statecd;
    }

    /* JADX INFO: renamed from: component82, reason: from getter */
    public final String getStatename() {
        return this.statename;
    }

    /* JADX INFO: renamed from: component83, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component84, reason: from getter */
    public final Object getTaxmode() {
        return this.taxmode;
    }

    /* JADX INFO: renamed from: component85, reason: from getter */
    public final Object getTransportcatg() {
        return this.transportcatg;
    }

    /* JADX INFO: renamed from: component86, reason: from getter */
    public final Integer getUnldwt() {
        return this.unldwt;
    }

    /* JADX INFO: renamed from: component87, reason: from getter */
    public final String getVchcatg() {
        return this.vchcatg;
    }

    /* JADX INFO: renamed from: component88, reason: from getter */
    public final String getVchpurchaseas() {
        return this.vchpurchaseas;
    }

    /* JADX INFO: renamed from: component89, reason: from getter */
    public final String getVchpurchaseasCode() {
        return this.vchpurchaseasCode;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCdistrict() {
        return this.cdistrict;
    }

    /* JADX INFO: renamed from: component90, reason: from getter */
    public final Integer getVehTypeAsInt() {
        return this.vehTypeAsInt;
    }

    /* JADX INFO: renamed from: component91, reason: from getter */
    public final String getVehtype() {
        return this.vehtype;
    }

    /* JADX INFO: renamed from: component92, reason: from getter */
    public final Integer getVhclass() {
        return this.vhclass;
    }

    /* JADX INFO: renamed from: component93, reason: from getter */
    public final String getVhclassdescr() {
        return this.vhclassdescr;
    }

    /* JADX INFO: renamed from: component94, reason: from getter */
    public final String getVideofitted() {
        return this.videofitted;
    }

    /* JADX INFO: renamed from: component95, reason: from getter */
    public final VtOwnerIdentification getVtOwnerIdentification() {
        return this.vtOwnerIdentification;
    }

    /* JADX INFO: renamed from: component96, reason: from getter */
    public final Object getWheelbase() {
        return this.wheelbase;
    }

    /* JADX INFO: renamed from: component97, reason: from getter */
    public final Object getWidth() {
        return this.width;
    }

    public final OwnerInfo copy(String acfitted, Object annualincome, String audiofitted, String bodytype, String cadd1, String cadd2, String cadd3, String catgdescr, String cdistrict, String cdistrictname, String chasino, String chasinofull, String chasinooriginal, String color, String cpincode, String cstate, String cstatename, Integer cubiccap, String dealercd, String dlradd1, String dlradd2, String dlradd3, String dlrcity, String dlrdistrict, String dlrname, String dlrpincode, String engno, String engnofull, Long fitupto, String fituptodescr, Object floorarea, String fname, Integer fuel, String fueldescr, Object garageadd, Integer gcw, Object height, Integer hp, String importedvch, Object lasercode, Integer ldwt, Object length, Integer maker, String makermodel, Integer manumon, Integer manuyr, String modelcd, Integer nocyl, Integer norms, String normsdescr, Integer offcd, String offname, Long opdt, Object othercriteria, Long ownerFrom, Integer ownercd, String ownercddescr, String ownername, Integer ownersr, String padd1, String padd2, String padd3, Integer pdistrict, String pdistrictname, Integer permitrtocd, Integer ppincode, String pstate, String pstatename, String purchasedt, Long purchasedtasDate, String regndt, Long regndtasdate, String regnno, String regntype, String regntypedescr, Long regnupto, Integer saleamt, Integer seatcap, Object sleepercap, Object standcap, String statecd, String statename, String status, Object taxmode, Object transportcatg, Integer unldwt, String vchcatg, String vchpurchaseas, String vchpurchaseasCode, Integer vehTypeAsInt, String vehtype, Integer vhclass, String vhclassdescr, String videofitted, VtOwnerIdentification vtOwnerIdentification, Object wheelbase, Object width) {
        return new OwnerInfo(acfitted, annualincome, audiofitted, bodytype, cadd1, cadd2, cadd3, catgdescr, cdistrict, cdistrictname, chasino, chasinofull, chasinooriginal, color, cpincode, cstate, cstatename, cubiccap, dealercd, dlradd1, dlradd2, dlradd3, dlrcity, dlrdistrict, dlrname, dlrpincode, engno, engnofull, fitupto, fituptodescr, floorarea, fname, fuel, fueldescr, garageadd, gcw, height, hp, importedvch, lasercode, ldwt, length, maker, makermodel, manumon, manuyr, modelcd, nocyl, norms, normsdescr, offcd, offname, opdt, othercriteria, ownerFrom, ownercd, ownercddescr, ownername, ownersr, padd1, padd2, padd3, pdistrict, pdistrictname, permitrtocd, ppincode, pstate, pstatename, purchasedt, purchasedtasDate, regndt, regndtasdate, regnno, regntype, regntypedescr, regnupto, saleamt, seatcap, sleepercap, standcap, statecd, statename, status, taxmode, transportcatg, unldwt, vchcatg, vchpurchaseas, vchpurchaseasCode, vehTypeAsInt, vehtype, vhclass, vhclassdescr, videofitted, vtOwnerIdentification, wheelbase, width);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OwnerInfo)) {
            return false;
        }
        OwnerInfo ownerInfo = (OwnerInfo) other;
        return Intrinsics.areEqual(this.acfitted, ownerInfo.acfitted) && Intrinsics.areEqual(this.annualincome, ownerInfo.annualincome) && Intrinsics.areEqual(this.audiofitted, ownerInfo.audiofitted) && Intrinsics.areEqual(this.bodytype, ownerInfo.bodytype) && Intrinsics.areEqual(this.cadd1, ownerInfo.cadd1) && Intrinsics.areEqual(this.cadd2, ownerInfo.cadd2) && Intrinsics.areEqual(this.cadd3, ownerInfo.cadd3) && Intrinsics.areEqual(this.catgdescr, ownerInfo.catgdescr) && Intrinsics.areEqual(this.cdistrict, ownerInfo.cdistrict) && Intrinsics.areEqual(this.cdistrictname, ownerInfo.cdistrictname) && Intrinsics.areEqual(this.chasino, ownerInfo.chasino) && Intrinsics.areEqual(this.chasinofull, ownerInfo.chasinofull) && Intrinsics.areEqual(this.chasinooriginal, ownerInfo.chasinooriginal) && Intrinsics.areEqual(this.color, ownerInfo.color) && Intrinsics.areEqual(this.cpincode, ownerInfo.cpincode) && Intrinsics.areEqual(this.cstate, ownerInfo.cstate) && Intrinsics.areEqual(this.cstatename, ownerInfo.cstatename) && Intrinsics.areEqual(this.cubiccap, ownerInfo.cubiccap) && Intrinsics.areEqual(this.dealercd, ownerInfo.dealercd) && Intrinsics.areEqual(this.dlradd1, ownerInfo.dlradd1) && Intrinsics.areEqual(this.dlradd2, ownerInfo.dlradd2) && Intrinsics.areEqual(this.dlradd3, ownerInfo.dlradd3) && Intrinsics.areEqual(this.dlrcity, ownerInfo.dlrcity) && Intrinsics.areEqual(this.dlrdistrict, ownerInfo.dlrdistrict) && Intrinsics.areEqual(this.dlrname, ownerInfo.dlrname) && Intrinsics.areEqual(this.dlrpincode, ownerInfo.dlrpincode) && Intrinsics.areEqual(this.engno, ownerInfo.engno) && Intrinsics.areEqual(this.engnofull, ownerInfo.engnofull) && Intrinsics.areEqual(this.fitupto, ownerInfo.fitupto) && Intrinsics.areEqual(this.fituptodescr, ownerInfo.fituptodescr) && Intrinsics.areEqual(this.floorarea, ownerInfo.floorarea) && Intrinsics.areEqual(this.fname, ownerInfo.fname) && Intrinsics.areEqual(this.fuel, ownerInfo.fuel) && Intrinsics.areEqual(this.fueldescr, ownerInfo.fueldescr) && Intrinsics.areEqual(this.garageadd, ownerInfo.garageadd) && Intrinsics.areEqual(this.gcw, ownerInfo.gcw) && Intrinsics.areEqual(this.height, ownerInfo.height) && Intrinsics.areEqual(this.hp, ownerInfo.hp) && Intrinsics.areEqual(this.importedvch, ownerInfo.importedvch) && Intrinsics.areEqual(this.lasercode, ownerInfo.lasercode) && Intrinsics.areEqual(this.ldwt, ownerInfo.ldwt) && Intrinsics.areEqual(this.length, ownerInfo.length) && Intrinsics.areEqual(this.maker, ownerInfo.maker) && Intrinsics.areEqual(this.makermodel, ownerInfo.makermodel) && Intrinsics.areEqual(this.manumon, ownerInfo.manumon) && Intrinsics.areEqual(this.manuyr, ownerInfo.manuyr) && Intrinsics.areEqual(this.modelcd, ownerInfo.modelcd) && Intrinsics.areEqual(this.nocyl, ownerInfo.nocyl) && Intrinsics.areEqual(this.norms, ownerInfo.norms) && Intrinsics.areEqual(this.normsdescr, ownerInfo.normsdescr) && Intrinsics.areEqual(this.offcd, ownerInfo.offcd) && Intrinsics.areEqual(this.offname, ownerInfo.offname) && Intrinsics.areEqual(this.opdt, ownerInfo.opdt) && Intrinsics.areEqual(this.othercriteria, ownerInfo.othercriteria) && Intrinsics.areEqual(this.ownerFrom, ownerInfo.ownerFrom) && Intrinsics.areEqual(this.ownercd, ownerInfo.ownercd) && Intrinsics.areEqual(this.ownercddescr, ownerInfo.ownercddescr) && Intrinsics.areEqual(this.ownername, ownerInfo.ownername) && Intrinsics.areEqual(this.ownersr, ownerInfo.ownersr) && Intrinsics.areEqual(this.padd1, ownerInfo.padd1) && Intrinsics.areEqual(this.padd2, ownerInfo.padd2) && Intrinsics.areEqual(this.padd3, ownerInfo.padd3) && Intrinsics.areEqual(this.pdistrict, ownerInfo.pdistrict) && Intrinsics.areEqual(this.pdistrictname, ownerInfo.pdistrictname) && Intrinsics.areEqual(this.permitrtocd, ownerInfo.permitrtocd) && Intrinsics.areEqual(this.ppincode, ownerInfo.ppincode) && Intrinsics.areEqual(this.pstate, ownerInfo.pstate) && Intrinsics.areEqual(this.pstatename, ownerInfo.pstatename) && Intrinsics.areEqual(this.purchasedt, ownerInfo.purchasedt) && Intrinsics.areEqual(this.purchasedtasDate, ownerInfo.purchasedtasDate) && Intrinsics.areEqual(this.regndt, ownerInfo.regndt) && Intrinsics.areEqual(this.regndtasdate, ownerInfo.regndtasdate) && Intrinsics.areEqual(this.regnno, ownerInfo.regnno) && Intrinsics.areEqual(this.regntype, ownerInfo.regntype) && Intrinsics.areEqual(this.regntypedescr, ownerInfo.regntypedescr) && Intrinsics.areEqual(this.regnupto, ownerInfo.regnupto) && Intrinsics.areEqual(this.saleamt, ownerInfo.saleamt) && Intrinsics.areEqual(this.seatcap, ownerInfo.seatcap) && Intrinsics.areEqual(this.sleepercap, ownerInfo.sleepercap) && Intrinsics.areEqual(this.standcap, ownerInfo.standcap) && Intrinsics.areEqual(this.statecd, ownerInfo.statecd) && Intrinsics.areEqual(this.statename, ownerInfo.statename) && Intrinsics.areEqual(this.status, ownerInfo.status) && Intrinsics.areEqual(this.taxmode, ownerInfo.taxmode) && Intrinsics.areEqual(this.transportcatg, ownerInfo.transportcatg) && Intrinsics.areEqual(this.unldwt, ownerInfo.unldwt) && Intrinsics.areEqual(this.vchcatg, ownerInfo.vchcatg) && Intrinsics.areEqual(this.vchpurchaseas, ownerInfo.vchpurchaseas) && Intrinsics.areEqual(this.vchpurchaseasCode, ownerInfo.vchpurchaseasCode) && Intrinsics.areEqual(this.vehTypeAsInt, ownerInfo.vehTypeAsInt) && Intrinsics.areEqual(this.vehtype, ownerInfo.vehtype) && Intrinsics.areEqual(this.vhclass, ownerInfo.vhclass) && Intrinsics.areEqual(this.vhclassdescr, ownerInfo.vhclassdescr) && Intrinsics.areEqual(this.videofitted, ownerInfo.videofitted) && Intrinsics.areEqual(this.vtOwnerIdentification, ownerInfo.vtOwnerIdentification) && Intrinsics.areEqual(this.wheelbase, ownerInfo.wheelbase) && Intrinsics.areEqual(this.width, ownerInfo.width);
    }

    public final String getAcfitted() {
        return this.acfitted;
    }

    public final Object getAnnualincome() {
        return this.annualincome;
    }

    public final String getAudiofitted() {
        return this.audiofitted;
    }

    public final String getBodytype() {
        return this.bodytype;
    }

    public final String getCadd1() {
        return this.cadd1;
    }

    public final String getCadd2() {
        return this.cadd2;
    }

    public final String getCadd3() {
        return this.cadd3;
    }

    public final String getCatgdescr() {
        return this.catgdescr;
    }

    public final String getCdistrict() {
        return this.cdistrict;
    }

    public final String getCdistrictname() {
        return this.cdistrictname;
    }

    public final String getChasino() {
        return this.chasino;
    }

    public final String getChasinofull() {
        return this.chasinofull;
    }

    public final String getChasinooriginal() {
        return this.chasinooriginal;
    }

    public final String getColor() {
        return this.color;
    }

    public final String getCpincode() {
        return this.cpincode;
    }

    public final String getCstate() {
        return this.cstate;
    }

    public final String getCstatename() {
        return this.cstatename;
    }

    public final Integer getCubiccap() {
        return this.cubiccap;
    }

    public final String getDealercd() {
        return this.dealercd;
    }

    public final String getDlradd1() {
        return this.dlradd1;
    }

    public final String getDlradd2() {
        return this.dlradd2;
    }

    public final String getDlradd3() {
        return this.dlradd3;
    }

    public final String getDlrcity() {
        return this.dlrcity;
    }

    public final String getDlrdistrict() {
        return this.dlrdistrict;
    }

    public final String getDlrname() {
        return this.dlrname;
    }

    public final String getDlrpincode() {
        return this.dlrpincode;
    }

    public final String getEngno() {
        return this.engno;
    }

    public final String getEngnofull() {
        return this.engnofull;
    }

    public final Long getFitupto() {
        return this.fitupto;
    }

    public final String getFituptodescr() {
        return this.fituptodescr;
    }

    public final Object getFloorarea() {
        return this.floorarea;
    }

    public final String getFname() {
        return this.fname;
    }

    public final Integer getFuel() {
        return this.fuel;
    }

    public final String getFueldescr() {
        return this.fueldescr;
    }

    public final Object getGarageadd() {
        return this.garageadd;
    }

    public final Integer getGcw() {
        return this.gcw;
    }

    public final Object getHeight() {
        return this.height;
    }

    public final Integer getHp() {
        return this.hp;
    }

    public final String getImportedvch() {
        return this.importedvch;
    }

    public final Object getLasercode() {
        return this.lasercode;
    }

    public final Integer getLdwt() {
        return this.ldwt;
    }

    public final Object getLength() {
        return this.length;
    }

    public final Integer getMaker() {
        return this.maker;
    }

    public final String getMakermodel() {
        return this.makermodel;
    }

    public final Integer getManumon() {
        return this.manumon;
    }

    public final Integer getManuyr() {
        return this.manuyr;
    }

    public final String getModelcd() {
        return this.modelcd;
    }

    public final Integer getNocyl() {
        return this.nocyl;
    }

    public final Integer getNorms() {
        return this.norms;
    }

    public final String getNormsdescr() {
        return this.normsdescr;
    }

    public final Integer getOffcd() {
        return this.offcd;
    }

    public final String getOffname() {
        return this.offname;
    }

    public final Long getOpdt() {
        return this.opdt;
    }

    public final Object getOthercriteria() {
        return this.othercriteria;
    }

    public final Long getOwnerFrom() {
        return this.ownerFrom;
    }

    public final Integer getOwnercd() {
        return this.ownercd;
    }

    public final String getOwnercddescr() {
        return this.ownercddescr;
    }

    public final String getOwnername() {
        return this.ownername;
    }

    public final Integer getOwnersr() {
        return this.ownersr;
    }

    public final String getPadd1() {
        return this.padd1;
    }

    public final String getPadd2() {
        return this.padd2;
    }

    public final String getPadd3() {
        return this.padd3;
    }

    public final Integer getPdistrict() {
        return this.pdistrict;
    }

    public final String getPdistrictname() {
        return this.pdistrictname;
    }

    public final Integer getPermitrtocd() {
        return this.permitrtocd;
    }

    public final Integer getPpincode() {
        return this.ppincode;
    }

    public final String getPstate() {
        return this.pstate;
    }

    public final String getPstatename() {
        return this.pstatename;
    }

    public final String getPurchasedt() {
        return this.purchasedt;
    }

    public final Long getPurchasedtasDate() {
        return this.purchasedtasDate;
    }

    public final String getRegndt() {
        return this.regndt;
    }

    public final Long getRegndtasdate() {
        return this.regndtasdate;
    }

    public final String getRegnno() {
        return this.regnno;
    }

    public final String getRegntype() {
        return this.regntype;
    }

    public final String getRegntypedescr() {
        return this.regntypedescr;
    }

    public final Long getRegnupto() {
        return this.regnupto;
    }

    public final Integer getSaleamt() {
        return this.saleamt;
    }

    public final Integer getSeatcap() {
        return this.seatcap;
    }

    public final Object getSleepercap() {
        return this.sleepercap;
    }

    public final Object getStandcap() {
        return this.standcap;
    }

    public final String getStatecd() {
        return this.statecd;
    }

    public final String getStatename() {
        return this.statename;
    }

    public final String getStatus() {
        return this.status;
    }

    public final Object getTaxmode() {
        return this.taxmode;
    }

    public final Object getTransportcatg() {
        return this.transportcatg;
    }

    public final Integer getUnldwt() {
        return this.unldwt;
    }

    public final String getVchcatg() {
        return this.vchcatg;
    }

    public final String getVchpurchaseas() {
        return this.vchpurchaseas;
    }

    public final String getVchpurchaseasCode() {
        return this.vchpurchaseasCode;
    }

    public final Integer getVehTypeAsInt() {
        return this.vehTypeAsInt;
    }

    public final String getVehtype() {
        return this.vehtype;
    }

    public final Integer getVhclass() {
        return this.vhclass;
    }

    public final String getVhclassdescr() {
        return this.vhclassdescr;
    }

    public final String getVideofitted() {
        return this.videofitted;
    }

    public final VtOwnerIdentification getVtOwnerIdentification() {
        return this.vtOwnerIdentification;
    }

    public final Object getWheelbase() {
        return this.wheelbase;
    }

    public final Object getWidth() {
        return this.width;
    }

    public int hashCode() {
        String str = this.acfitted;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Object obj = this.annualincome;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        String str2 = this.audiofitted;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bodytype;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cadd1;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.cadd2;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.cadd3;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.catgdescr;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.cdistrict;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.cdistrictname;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.chasino;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.chasinofull;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.chasinooriginal;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.color;
        int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.cpincode;
        int iHashCode15 = (iHashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.cstate;
        int iHashCode16 = (iHashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.cstatename;
        int iHashCode17 = (iHashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        Integer num = this.cubiccap;
        int iHashCode18 = (iHashCode17 + (num == null ? 0 : num.hashCode())) * 31;
        String str17 = this.dealercd;
        int iHashCode19 = (iHashCode18 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.dlradd1;
        int iHashCode20 = (iHashCode19 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.dlradd2;
        int iHashCode21 = (iHashCode20 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.dlradd3;
        int iHashCode22 = (iHashCode21 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.dlrcity;
        int iHashCode23 = (iHashCode22 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.dlrdistrict;
        int iHashCode24 = (iHashCode23 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.dlrname;
        int iHashCode25 = (iHashCode24 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.dlrpincode;
        int iHashCode26 = (iHashCode25 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.engno;
        int iHashCode27 = (iHashCode26 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.engnofull;
        int iHashCode28 = (iHashCode27 + (str26 == null ? 0 : str26.hashCode())) * 31;
        Long l = this.fitupto;
        int iHashCode29 = (iHashCode28 + (l == null ? 0 : l.hashCode())) * 31;
        String str27 = this.fituptodescr;
        int iHashCode30 = (iHashCode29 + (str27 == null ? 0 : str27.hashCode())) * 31;
        Object obj2 = this.floorarea;
        int iHashCode31 = (iHashCode30 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        String str28 = this.fname;
        int iHashCode32 = (iHashCode31 + (str28 == null ? 0 : str28.hashCode())) * 31;
        Integer num2 = this.fuel;
        int iHashCode33 = (iHashCode32 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str29 = this.fueldescr;
        int iHashCode34 = (iHashCode33 + (str29 == null ? 0 : str29.hashCode())) * 31;
        Object obj3 = this.garageadd;
        int iHashCode35 = (iHashCode34 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Integer num3 = this.gcw;
        int iHashCode36 = (iHashCode35 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Object obj4 = this.height;
        int iHashCode37 = (iHashCode36 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        Integer num4 = this.hp;
        int iHashCode38 = (iHashCode37 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str30 = this.importedvch;
        int iHashCode39 = (iHashCode38 + (str30 == null ? 0 : str30.hashCode())) * 31;
        Object obj5 = this.lasercode;
        int iHashCode40 = (iHashCode39 + (obj5 == null ? 0 : obj5.hashCode())) * 31;
        Integer num5 = this.ldwt;
        int iHashCode41 = (iHashCode40 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Object obj6 = this.length;
        int iHashCode42 = (iHashCode41 + (obj6 == null ? 0 : obj6.hashCode())) * 31;
        Integer num6 = this.maker;
        int iHashCode43 = (iHashCode42 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str31 = this.makermodel;
        int iHashCode44 = (iHashCode43 + (str31 == null ? 0 : str31.hashCode())) * 31;
        Integer num7 = this.manumon;
        int iHashCode45 = (iHashCode44 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.manuyr;
        int iHashCode46 = (iHashCode45 + (num8 == null ? 0 : num8.hashCode())) * 31;
        String str32 = this.modelcd;
        int iHashCode47 = (iHashCode46 + (str32 == null ? 0 : str32.hashCode())) * 31;
        Integer num9 = this.nocyl;
        int iHashCode48 = (iHashCode47 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.norms;
        int iHashCode49 = (iHashCode48 + (num10 == null ? 0 : num10.hashCode())) * 31;
        String str33 = this.normsdescr;
        int iHashCode50 = (iHashCode49 + (str33 == null ? 0 : str33.hashCode())) * 31;
        Integer num11 = this.offcd;
        int iHashCode51 = (iHashCode50 + (num11 == null ? 0 : num11.hashCode())) * 31;
        String str34 = this.offname;
        int iHashCode52 = (iHashCode51 + (str34 == null ? 0 : str34.hashCode())) * 31;
        Long l2 = this.opdt;
        int iHashCode53 = (iHashCode52 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Object obj7 = this.othercriteria;
        int iHashCode54 = (iHashCode53 + (obj7 == null ? 0 : obj7.hashCode())) * 31;
        Long l3 = this.ownerFrom;
        int iHashCode55 = (iHashCode54 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num12 = this.ownercd;
        int iHashCode56 = (iHashCode55 + (num12 == null ? 0 : num12.hashCode())) * 31;
        String str35 = this.ownercddescr;
        int iHashCode57 = (iHashCode56 + (str35 == null ? 0 : str35.hashCode())) * 31;
        String str36 = this.ownername;
        int iHashCode58 = (iHashCode57 + (str36 == null ? 0 : str36.hashCode())) * 31;
        Integer num13 = this.ownersr;
        int iHashCode59 = (iHashCode58 + (num13 == null ? 0 : num13.hashCode())) * 31;
        String str37 = this.padd1;
        int iHashCode60 = (iHashCode59 + (str37 == null ? 0 : str37.hashCode())) * 31;
        String str38 = this.padd2;
        int iHashCode61 = (iHashCode60 + (str38 == null ? 0 : str38.hashCode())) * 31;
        String str39 = this.padd3;
        int iHashCode62 = (iHashCode61 + (str39 == null ? 0 : str39.hashCode())) * 31;
        Integer num14 = this.pdistrict;
        int iHashCode63 = (iHashCode62 + (num14 == null ? 0 : num14.hashCode())) * 31;
        String str40 = this.pdistrictname;
        int iHashCode64 = (iHashCode63 + (str40 == null ? 0 : str40.hashCode())) * 31;
        Integer num15 = this.permitrtocd;
        int iHashCode65 = (iHashCode64 + (num15 == null ? 0 : num15.hashCode())) * 31;
        Integer num16 = this.ppincode;
        int iHashCode66 = (iHashCode65 + (num16 == null ? 0 : num16.hashCode())) * 31;
        String str41 = this.pstate;
        int iHashCode67 = (iHashCode66 + (str41 == null ? 0 : str41.hashCode())) * 31;
        String str42 = this.pstatename;
        int iHashCode68 = (iHashCode67 + (str42 == null ? 0 : str42.hashCode())) * 31;
        String str43 = this.purchasedt;
        int iHashCode69 = (iHashCode68 + (str43 == null ? 0 : str43.hashCode())) * 31;
        Long l4 = this.purchasedtasDate;
        int iHashCode70 = (iHashCode69 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str44 = this.regndt;
        int iHashCode71 = (iHashCode70 + (str44 == null ? 0 : str44.hashCode())) * 31;
        Long l5 = this.regndtasdate;
        int iHashCode72 = (iHashCode71 + (l5 == null ? 0 : l5.hashCode())) * 31;
        String str45 = this.regnno;
        int iHashCode73 = (iHashCode72 + (str45 == null ? 0 : str45.hashCode())) * 31;
        String str46 = this.regntype;
        int iHashCode74 = (iHashCode73 + (str46 == null ? 0 : str46.hashCode())) * 31;
        String str47 = this.regntypedescr;
        int iHashCode75 = (iHashCode74 + (str47 == null ? 0 : str47.hashCode())) * 31;
        Long l6 = this.regnupto;
        int iHashCode76 = (iHashCode75 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Integer num17 = this.saleamt;
        int iHashCode77 = (iHashCode76 + (num17 == null ? 0 : num17.hashCode())) * 31;
        Integer num18 = this.seatcap;
        int iHashCode78 = (iHashCode77 + (num18 == null ? 0 : num18.hashCode())) * 31;
        Object obj8 = this.sleepercap;
        int iHashCode79 = (iHashCode78 + (obj8 == null ? 0 : obj8.hashCode())) * 31;
        Object obj9 = this.standcap;
        int iHashCode80 = (iHashCode79 + (obj9 == null ? 0 : obj9.hashCode())) * 31;
        String str48 = this.statecd;
        int iHashCode81 = (iHashCode80 + (str48 == null ? 0 : str48.hashCode())) * 31;
        String str49 = this.statename;
        int iHashCode82 = (iHashCode81 + (str49 == null ? 0 : str49.hashCode())) * 31;
        String str50 = this.status;
        int iHashCode83 = (iHashCode82 + (str50 == null ? 0 : str50.hashCode())) * 31;
        Object obj10 = this.taxmode;
        int iHashCode84 = (iHashCode83 + (obj10 == null ? 0 : obj10.hashCode())) * 31;
        Object obj11 = this.transportcatg;
        int iHashCode85 = (iHashCode84 + (obj11 == null ? 0 : obj11.hashCode())) * 31;
        Integer num19 = this.unldwt;
        int iHashCode86 = (iHashCode85 + (num19 == null ? 0 : num19.hashCode())) * 31;
        String str51 = this.vchcatg;
        int iHashCode87 = (iHashCode86 + (str51 == null ? 0 : str51.hashCode())) * 31;
        String str52 = this.vchpurchaseas;
        int iHashCode88 = (iHashCode87 + (str52 == null ? 0 : str52.hashCode())) * 31;
        String str53 = this.vchpurchaseasCode;
        int iHashCode89 = (iHashCode88 + (str53 == null ? 0 : str53.hashCode())) * 31;
        Integer num20 = this.vehTypeAsInt;
        int iHashCode90 = (iHashCode89 + (num20 == null ? 0 : num20.hashCode())) * 31;
        String str54 = this.vehtype;
        int iHashCode91 = (iHashCode90 + (str54 == null ? 0 : str54.hashCode())) * 31;
        Integer num21 = this.vhclass;
        int iHashCode92 = (iHashCode91 + (num21 == null ? 0 : num21.hashCode())) * 31;
        String str55 = this.vhclassdescr;
        int iHashCode93 = (iHashCode92 + (str55 == null ? 0 : str55.hashCode())) * 31;
        String str56 = this.videofitted;
        int iHashCode94 = (iHashCode93 + (str56 == null ? 0 : str56.hashCode())) * 31;
        VtOwnerIdentification vtOwnerIdentification = this.vtOwnerIdentification;
        int iHashCode95 = (iHashCode94 + (vtOwnerIdentification == null ? 0 : vtOwnerIdentification.hashCode())) * 31;
        Object obj12 = this.wheelbase;
        int iHashCode96 = (iHashCode95 + (obj12 == null ? 0 : obj12.hashCode())) * 31;
        Object obj13 = this.width;
        return iHashCode96 + (obj13 != null ? obj13.hashCode() : 0);
    }

    public String toString() {
        return "OwnerInfo(acfitted=" + this.acfitted + ", annualincome=" + this.annualincome + ", audiofitted=" + this.audiofitted + ", bodytype=" + this.bodytype + ", cadd1=" + this.cadd1 + ", cadd2=" + this.cadd2 + ", cadd3=" + this.cadd3 + ", catgdescr=" + this.catgdescr + ", cdistrict=" + this.cdistrict + ", cdistrictname=" + this.cdistrictname + ", chasino=" + this.chasino + ", chasinofull=" + this.chasinofull + ", chasinooriginal=" + this.chasinooriginal + ", color=" + this.color + ", cpincode=" + this.cpincode + ", cstate=" + this.cstate + ", cstatename=" + this.cstatename + ", cubiccap=" + this.cubiccap + ", dealercd=" + this.dealercd + ", dlradd1=" + this.dlradd1 + ", dlradd2=" + this.dlradd2 + ", dlradd3=" + this.dlradd3 + ", dlrcity=" + this.dlrcity + ", dlrdistrict=" + this.dlrdistrict + ", dlrname=" + this.dlrname + ", dlrpincode=" + this.dlrpincode + ", engno=" + this.engno + ", engnofull=" + this.engnofull + ", fitupto=" + this.fitupto + ", fituptodescr=" + this.fituptodescr + ", floorarea=" + this.floorarea + ", fname=" + this.fname + ", fuel=" + this.fuel + ", fueldescr=" + this.fueldescr + ", garageadd=" + this.garageadd + ", gcw=" + this.gcw + ", height=" + this.height + ", hp=" + this.hp + ", importedvch=" + this.importedvch + ", lasercode=" + this.lasercode + ", ldwt=" + this.ldwt + ", length=" + this.length + ", maker=" + this.maker + ", makermodel=" + this.makermodel + ", manumon=" + this.manumon + ", manuyr=" + this.manuyr + ", modelcd=" + this.modelcd + ", nocyl=" + this.nocyl + ", norms=" + this.norms + ", normsdescr=" + this.normsdescr + ", offcd=" + this.offcd + ", offname=" + this.offname + ", opdt=" + this.opdt + ", othercriteria=" + this.othercriteria + ", ownerFrom=" + this.ownerFrom + ", ownercd=" + this.ownercd + ", ownercddescr=" + this.ownercddescr + ", ownername=" + this.ownername + ", ownersr=" + this.ownersr + ", padd1=" + this.padd1 + ", padd2=" + this.padd2 + ", padd3=" + this.padd3 + ", pdistrict=" + this.pdistrict + ", pdistrictname=" + this.pdistrictname + ", permitrtocd=" + this.permitrtocd + ", ppincode=" + this.ppincode + ", pstate=" + this.pstate + ", pstatename=" + this.pstatename + ", purchasedt=" + this.purchasedt + ", purchasedtasDate=" + this.purchasedtasDate + ", regndt=" + this.regndt + ", regndtasdate=" + this.regndtasdate + ", regnno=" + this.regnno + ", regntype=" + this.regntype + ", regntypedescr=" + this.regntypedescr + ", regnupto=" + this.regnupto + ", saleamt=" + this.saleamt + ", seatcap=" + this.seatcap + ", sleepercap=" + this.sleepercap + ", standcap=" + this.standcap + ", statecd=" + this.statecd + ", statename=" + this.statename + ", status=" + this.status + ", taxmode=" + this.taxmode + ", transportcatg=" + this.transportcatg + ", unldwt=" + this.unldwt + ", vchcatg=" + this.vchcatg + ", vchpurchaseas=" + this.vchpurchaseas + ", vchpurchaseasCode=" + this.vchpurchaseasCode + ", vehTypeAsInt=" + this.vehTypeAsInt + ", vehtype=" + this.vehtype + ", vhclass=" + this.vhclass + ", vhclassdescr=" + this.vhclassdescr + ", videofitted=" + this.videofitted + ", vtOwnerIdentification=" + this.vtOwnerIdentification + ", wheelbase=" + this.wheelbase + ", width=" + this.width + ')';
    }
}
