package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000W\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0003\b\u0092\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0001\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0001\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0006\u0012\u0006\u0010\u001c\u001a\u00020\u0001\u0012\u0006\u0010\u001d\u001a\u00020\u0001\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010\"\u001a\u00020\u0003\u0012\u0006\u0010#\u001a\u00020\u0003\u0012\u0006\u0010$\u001a\u00020\u0003\u0012\u0006\u0010%\u001a\u00020\u0003\u0012\u0006\u0010&\u001a\u00020\u0003\u0012\u0006\u0010'\u001a\u00020\u0003\u0012\u0006\u0010(\u001a\u00020\u0001\u0012\u0006\u0010)\u001a\u00020\u0001\u0012\u0006\u0010*\u001a\u00020\u0003\u0012\u0006\u0010+\u001a\u00020\u0003\u0012\u0006\u0010,\u001a\u00020\u0001\u0012\u0006\u0010-\u001a\u00020\u0001\u0012\u0006\u0010.\u001a\u00020\u0001\u0012\u0006\u0010/\u001a\u00020\u0019\u0012\u0006\u00100\u001a\u00020\u0001\u0012\u0006\u00101\u001a\u00020\u0006\u0012\u0006\u00102\u001a\u00020\u0003\u0012\u0006\u00103\u001a\u00020\u0003\u0012\u0006\u00104\u001a\u00020\u0006\u0012\u0006\u00105\u001a\u00020\u0006\u0012\u0006\u00106\u001a\u00020\u0019\u0012\u0006\u00107\u001a\u00020\u0003\u0012\u0006\u00108\u001a\u00020\u0003\u0012\u0006\u00109\u001a\u00020:\u0012\u0006\u0010;\u001a\u00020\u0006\u0012\u0006\u0010<\u001a\u00020\u0006\u0012\u0006\u0010=\u001a\u00020\u0006\u0012\u0006\u0010>\u001a\u00020\u0003\u0012\u0006\u0010?\u001a\u00020\u0006\u0012\u0006\u0010@\u001a\u00020\u0006\u0012\u0006\u0010A\u001a\u00020\u0001\u0012\u0006\u0010B\u001a\u00020C\u0012\u0006\u0010D\u001a\u00020\u0003\u0012\u0006\u0010E\u001a\u00020\u0003\u0012\u0006\u0010F\u001a\u00020\u0006\u0012\u0006\u0010G\u001a\u00020\u0001\u0012\u0006\u0010H\u001a\u00020\u0006\u0012\u0006\u0010I\u001a\u00020\u0003\u0012\u0006\u0010J\u001a\u00020\u0001\u0012\u0006\u0010K\u001a\u00020\u0006\u0012\u0006\u0010L\u001a\u00020\u0003\u0012\u0006\u0010M\u001a\u00020\u0003\u0012\u0006\u0010N\u001a\u00020\u0006\u0012\u0006\u0010O\u001a\u00020\u0001\u0012\u0006\u0010P\u001a\u00020Q\u0012\u0006\u0010R\u001a\u00020\u0006\u0012\u0006\u0010S\u001a\u00020\u0003\u0012\u0006\u0010T\u001a\u00020\u0006\u0012\u0006\u0010U\u001a\u00020\u0003\u0012\u0006\u0010V\u001a\u00020\u0006\u0012\u0006\u0010W\u001a\u00020\u0003\u0012\u0006\u0010X\u001a\u00020\u0003\u0012\u0006\u0010Y\u001a\u00020\u0003\u0012\u0006\u0010Z\u001a\u00020\u0006\u0012\u0006\u0010[\u001a\u00020\u0003\u0012\u0006\u0010\\\u001a\u00020\u0006\u0012\u0006\u0010]\u001a\u00020\u0003\u0012\u0006\u0010^\u001a\u00020\u0003\u0012\u0006\u0010_\u001a\u00020\u0003\u0012\u0006\u0010`\u001a\u00020\u0003\u0012\u0006\u0010a\u001a\u00020b\u0012\u0006\u0010c\u001a\u00020\u0001\u0012\u0006\u0010d\u001a\u00020\u0001\u0012\u0006\u0010e\u001a\u00020\u0001\u0012\u0006\u0010f\u001a\u00020\u0003\u0012\u0006\u0010g\u001a\u00020\u0003\u0012\u0006\u0010h\u001a\u00020\u0003\u0012\u0006\u0010i\u001a\u00020\u0001\u0012\u0006\u0010j\u001a\u00020\u0003\u0012\u0006\u0010k\u001a\u00020\u0003\u0012\u0006\u0010l\u001a\u00020\u0003\u0012\u0006\u0010m\u001a\u00020\u0003\u0012\u0006\u0010n\u001a\u00020\u0001\u0012\u0006\u0010o\u001a\u00020\u0001\u0012\u0006\u0010p\u001a\u00020\u0006\u0012\u0006\u0010q\u001a\u00020\u0006\u0012\u0006\u0010r\u001a\u00020\u0006\u0012\u0006\u0010s\u001a\u00020\u0006\u0012\u0006\u0010t\u001a\u00020\u0003\u0012\u0006\u0010u\u001a\u00020\u0003\u0012\u0006\u0010v\u001a\u00020\u0003\u0012\u0006\u0010w\u001a\u00020\u0003\u0012\u0006\u0010x\u001a\u00020\u0001\u0012\u0006\u0010y\u001a\u00020\u0006\u0012\u0006\u0010z\u001a\u00020\u0003\u0012\u0006\u0010{\u001a\u00020\u0001\u0012\u0006\u0010|\u001a\u00020\u0003\u0012\u0006\u0010}\u001a\u00020\u0001\u0012\u0006\u0010~\u001a\u00020\u0003\u0012\u0006\u0010\u007f\u001a\u00020\u0006\u0012\u0007\u0010\u0080\u0001\u001a\u00020C\u0012\u0007\u0010\u0081\u0001\u001a\u00020\u0006\u0012\u0007\u0010\u0082\u0001\u001a\u00020\u0003\u0012\u0007\u0010\u0083\u0001\u001a\u00020\u0003\u0012\u0007\u0010\u0084\u0001\u001a\u00020\u0003\u0012\b\u0010\u0085\u0001\u001a\u00030\u0086\u0001\u0012\b\u0010\u0087\u0001\u001a\u00030\u0088\u0001\u0012\u0007\u0010\u0089\u0001\u001a\u00020\u0006\u0012\u0007\u0010\u008a\u0001\u001a\u00020\u0006¢\u0006\u0003\u0010\u008b\u0001J\n\u0010\u0096\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0097\u0002\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0098\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0099\u0002\u001a\u00020\u0001HÆ\u0003J\n\u0010\u009a\u0002\u001a\u00020\u0001HÆ\u0003J\n\u0010\u009b\u0002\u001a\u00020\u0006HÆ\u0003J\n\u0010\u009c\u0002\u001a\u00020\u0006HÆ\u0003J\n\u0010\u009d\u0002\u001a\u00020\u0006HÆ\u0003J\n\u0010\u009e\u0002\u001a\u00020\u0006HÆ\u0003J\n\u0010\u009f\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010 \u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010¡\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010¢\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010£\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010¤\u0002\u001a\u00020\u0001HÆ\u0003J\n\u0010¥\u0002\u001a\u00020\u0006HÆ\u0003J\n\u0010¦\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010§\u0002\u001a\u00020\u0001HÆ\u0003J\n\u0010¨\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010©\u0002\u001a\u00020\u0001HÆ\u0003J\n\u0010ª\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010«\u0002\u001a\u00020\u0006HÆ\u0003J\n\u0010¬\u0002\u001a\u00020CHÆ\u0003J\n\u0010\u00ad\u0002\u001a\u00020\u0001HÆ\u0003J\n\u0010®\u0002\u001a\u00020\u0006HÆ\u0003J\n\u0010¯\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010°\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010±\u0002\u001a\u00020\u0003HÆ\u0003J\u000b\u0010²\u0002\u001a\u00030\u0086\u0001HÆ\u0003J\u000b\u0010³\u0002\u001a\u00030\u0088\u0001HÆ\u0003J\n\u0010´\u0002\u001a\u00020\u0006HÆ\u0003J\n\u0010µ\u0002\u001a\u00020\u0006HÆ\u0003J\n\u0010¶\u0002\u001a\u00020\u0006HÆ\u0003J\n\u0010·\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010¸\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010¹\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010º\u0002\u001a\u00020\u0001HÆ\u0003J\n\u0010»\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010¼\u0002\u001a\u00020\u0017HÆ\u0003J\n\u0010½\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010¾\u0002\u001a\u00020\u0019HÆ\u0003J\n\u0010¿\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010À\u0002\u001a\u00020\u0006HÆ\u0003J\n\u0010Á\u0002\u001a\u00020\u0001HÆ\u0003J\n\u0010Â\u0002\u001a\u00020\u0001HÆ\u0003J\n\u0010Ã\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010Ä\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010Å\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010Æ\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010Ç\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010È\u0002\u001a\u00020\u0006HÆ\u0003J\n\u0010É\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010Ê\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010Ë\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010Ì\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010Í\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010Î\u0002\u001a\u00020\u0001HÆ\u0003J\n\u0010Ï\u0002\u001a\u00020\u0001HÆ\u0003J\n\u0010Ð\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010Ñ\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010Ò\u0002\u001a\u00020\u0001HÆ\u0003J\n\u0010Ó\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010Ô\u0002\u001a\u00020\u0001HÆ\u0003J\n\u0010Õ\u0002\u001a\u00020\u0001HÆ\u0003J\n\u0010Ö\u0002\u001a\u00020\u0019HÆ\u0003J\n\u0010×\u0002\u001a\u00020\u0001HÆ\u0003J\n\u0010Ø\u0002\u001a\u00020\u0006HÆ\u0003J\n\u0010Ù\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010Ú\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010Û\u0002\u001a\u00020\u0006HÆ\u0003J\n\u0010Ü\u0002\u001a\u00020\u0006HÆ\u0003J\n\u0010Ý\u0002\u001a\u00020\u0019HÆ\u0003J\n\u0010Þ\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010ß\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010à\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010á\u0002\u001a\u00020:HÆ\u0003J\n\u0010â\u0002\u001a\u00020\u0006HÆ\u0003J\n\u0010ã\u0002\u001a\u00020\u0006HÆ\u0003J\n\u0010ä\u0002\u001a\u00020\u0006HÆ\u0003J\n\u0010å\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010æ\u0002\u001a\u00020\u0006HÆ\u0003J\n\u0010ç\u0002\u001a\u00020\u0006HÆ\u0003J\n\u0010è\u0002\u001a\u00020\u0001HÆ\u0003J\n\u0010é\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010ê\u0002\u001a\u00020CHÆ\u0003J\n\u0010ë\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010ì\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010í\u0002\u001a\u00020\u0006HÆ\u0003J\n\u0010î\u0002\u001a\u00020\u0001HÆ\u0003J\n\u0010ï\u0002\u001a\u00020\u0006HÆ\u0003J\n\u0010ð\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010ñ\u0002\u001a\u00020\u0001HÆ\u0003J\n\u0010ò\u0002\u001a\u00020\u0006HÆ\u0003J\n\u0010ó\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010ô\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010õ\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010ö\u0002\u001a\u00020\u0006HÆ\u0003J\n\u0010÷\u0002\u001a\u00020\u0001HÆ\u0003J\n\u0010ø\u0002\u001a\u00020QHÆ\u0003J\n\u0010ù\u0002\u001a\u00020\u0006HÆ\u0003J\n\u0010ú\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010û\u0002\u001a\u00020\u0006HÆ\u0003J\n\u0010ü\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010ý\u0002\u001a\u00020\u0006HÆ\u0003J\n\u0010þ\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010ÿ\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0080\u0003\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0081\u0003\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0082\u0003\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0083\u0003\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0084\u0003\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0085\u0003\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0086\u0003\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0087\u0003\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0088\u0003\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0089\u0003\u001a\u00020bHÆ\u0003J\n\u0010\u008a\u0003\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008b\u0003\u001a\u00020\u0001HÆ\u0003J\n\u0010\u008c\u0003\u001a\u00020\u0001HÆ\u0003J\n\u0010\u008d\u0003\u001a\u00020\u0001HÆ\u0003J\n\u0010\u008e\u0003\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008f\u0003\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0090\u0003\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0091\u0003\u001a\u00020\u0001HÆ\u0003J\n\u0010\u0092\u0003\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0093\u0003\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0094\u0003\u001a\u00020\u0003HÆ\u0003J\u008b\n\u0010\u0095\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\u001d\u001a\u00020\u00012\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\u00032\b\b\u0002\u0010&\u001a\u00020\u00032\b\b\u0002\u0010'\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020\u00012\b\b\u0002\u0010)\u001a\u00020\u00012\b\b\u0002\u0010*\u001a\u00020\u00032\b\b\u0002\u0010+\u001a\u00020\u00032\b\b\u0002\u0010,\u001a\u00020\u00012\b\b\u0002\u0010-\u001a\u00020\u00012\b\b\u0002\u0010.\u001a\u00020\u00012\b\b\u0002\u0010/\u001a\u00020\u00192\b\b\u0002\u00100\u001a\u00020\u00012\b\b\u0002\u00101\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u00032\b\b\u0002\u00103\u001a\u00020\u00032\b\b\u0002\u00104\u001a\u00020\u00062\b\b\u0002\u00105\u001a\u00020\u00062\b\b\u0002\u00106\u001a\u00020\u00192\b\b\u0002\u00107\u001a\u00020\u00032\b\b\u0002\u00108\u001a\u00020\u00032\b\b\u0002\u00109\u001a\u00020:2\b\b\u0002\u0010;\u001a\u00020\u00062\b\b\u0002\u0010<\u001a\u00020\u00062\b\b\u0002\u0010=\u001a\u00020\u00062\b\b\u0002\u0010>\u001a\u00020\u00032\b\b\u0002\u0010?\u001a\u00020\u00062\b\b\u0002\u0010@\u001a\u00020\u00062\b\b\u0002\u0010A\u001a\u00020\u00012\b\b\u0002\u0010B\u001a\u00020C2\b\b\u0002\u0010D\u001a\u00020\u00032\b\b\u0002\u0010E\u001a\u00020\u00032\b\b\u0002\u0010F\u001a\u00020\u00062\b\b\u0002\u0010G\u001a\u00020\u00012\b\b\u0002\u0010H\u001a\u00020\u00062\b\b\u0002\u0010I\u001a\u00020\u00032\b\b\u0002\u0010J\u001a\u00020\u00012\b\b\u0002\u0010K\u001a\u00020\u00062\b\b\u0002\u0010L\u001a\u00020\u00032\b\b\u0002\u0010M\u001a\u00020\u00032\b\b\u0002\u0010N\u001a\u00020\u00062\b\b\u0002\u0010O\u001a\u00020\u00012\b\b\u0002\u0010P\u001a\u00020Q2\b\b\u0002\u0010R\u001a\u00020\u00062\b\b\u0002\u0010S\u001a\u00020\u00032\b\b\u0002\u0010T\u001a\u00020\u00062\b\b\u0002\u0010U\u001a\u00020\u00032\b\b\u0002\u0010V\u001a\u00020\u00062\b\b\u0002\u0010W\u001a\u00020\u00032\b\b\u0002\u0010X\u001a\u00020\u00032\b\b\u0002\u0010Y\u001a\u00020\u00032\b\b\u0002\u0010Z\u001a\u00020\u00062\b\b\u0002\u0010[\u001a\u00020\u00032\b\b\u0002\u0010\\\u001a\u00020\u00062\b\b\u0002\u0010]\u001a\u00020\u00032\b\b\u0002\u0010^\u001a\u00020\u00032\b\b\u0002\u0010_\u001a\u00020\u00032\b\b\u0002\u0010`\u001a\u00020\u00032\b\b\u0002\u0010a\u001a\u00020b2\b\b\u0002\u0010c\u001a\u00020\u00012\b\b\u0002\u0010d\u001a\u00020\u00012\b\b\u0002\u0010e\u001a\u00020\u00012\b\b\u0002\u0010f\u001a\u00020\u00032\b\b\u0002\u0010g\u001a\u00020\u00032\b\b\u0002\u0010h\u001a\u00020\u00032\b\b\u0002\u0010i\u001a\u00020\u00012\b\b\u0002\u0010j\u001a\u00020\u00032\b\b\u0002\u0010k\u001a\u00020\u00032\b\b\u0002\u0010l\u001a\u00020\u00032\b\b\u0002\u0010m\u001a\u00020\u00032\b\b\u0002\u0010n\u001a\u00020\u00012\b\b\u0002\u0010o\u001a\u00020\u00012\b\b\u0002\u0010p\u001a\u00020\u00062\b\b\u0002\u0010q\u001a\u00020\u00062\b\b\u0002\u0010r\u001a\u00020\u00062\b\b\u0002\u0010s\u001a\u00020\u00062\b\b\u0002\u0010t\u001a\u00020\u00032\b\b\u0002\u0010u\u001a\u00020\u00032\b\b\u0002\u0010v\u001a\u00020\u00032\b\b\u0002\u0010w\u001a\u00020\u00032\b\b\u0002\u0010x\u001a\u00020\u00012\b\b\u0002\u0010y\u001a\u00020\u00062\b\b\u0002\u0010z\u001a\u00020\u00032\b\b\u0002\u0010{\u001a\u00020\u00012\b\b\u0002\u0010|\u001a\u00020\u00032\b\b\u0002\u0010}\u001a\u00020\u00012\b\b\u0002\u0010~\u001a\u00020\u00032\b\b\u0002\u0010\u007f\u001a\u00020\u00062\t\b\u0002\u0010\u0080\u0001\u001a\u00020C2\t\b\u0002\u0010\u0081\u0001\u001a\u00020\u00062\t\b\u0002\u0010\u0082\u0001\u001a\u00020\u00032\t\b\u0002\u0010\u0083\u0001\u001a\u00020\u00032\t\b\u0002\u0010\u0084\u0001\u001a\u00020\u00032\n\b\u0002\u0010\u0085\u0001\u001a\u00030\u0086\u00012\n\b\u0002\u0010\u0087\u0001\u001a\u00030\u0088\u00012\t\b\u0002\u0010\u0089\u0001\u001a\u00020\u00062\t\b\u0002\u0010\u008a\u0001\u001a\u00020\u0006HÆ\u0001J\u0015\u0010\u0096\u0003\u001a\u00020\u00172\t\u0010\u0097\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u0098\u0003\u001a\u00020\u0006HÖ\u0001J\n\u0010\u0099\u0003\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\b\u008e\u0001\u0010\u008d\u0001R\u0013\u0010\u0005\u001a\u00020\u0006¢\u0006\n\n\u0000\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0013\u0010\u0007\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\b\u0091\u0001\u0010\u008d\u0001R\u0013\u0010\b\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\b\u0092\u0001\u0010\u008d\u0001R\u0013\u0010\t\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\b\u0093\u0001\u0010\u008d\u0001R\u0013\u0010\n\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\b\u0094\u0001\u0010\u008d\u0001R\u0013\u0010\u000b\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\b\u0095\u0001\u0010\u008d\u0001R\u0013\u0010\f\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\b\u0096\u0001\u0010\u008d\u0001R\u0013\u0010\r\u001a\u00020\u0006¢\u0006\n\n\u0000\u001a\u0006\b\u0097\u0001\u0010\u0090\u0001R\u0013\u0010\u000e\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\b\u0098\u0001\u0010\u008d\u0001R\u0013\u0010\u000f\u001a\u00020\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0013\u0010\u0010\u001a\u00020\u0006¢\u0006\n\n\u0000\u001a\u0006\b\u009b\u0001\u0010\u0090\u0001R\u0013\u0010\u0011\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\b\u009c\u0001\u0010\u008d\u0001R\u0013\u0010\u0012\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\b\u009d\u0001\u0010\u008d\u0001R\u0013\u0010\u0013\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\b\u009e\u0001\u0010\u008d\u0001R\u0013\u0010\u0014\u001a\u00020\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u009f\u0001\u0010\u009a\u0001R\u0013\u0010\u0015\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\b \u0001\u0010\u008d\u0001R\u0013\u0010\u0016\u001a\u00020\u0017¢\u0006\n\n\u0000\u001a\u0006\b¡\u0001\u0010¢\u0001R\u0013\u0010\u0018\u001a\u00020\u0019¢\u0006\n\n\u0000\u001a\u0006\b£\u0001\u0010¤\u0001R\u0013\u0010\u001a\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\b¥\u0001\u0010\u008d\u0001R\u0013\u0010\u001b\u001a\u00020\u0006¢\u0006\n\n\u0000\u001a\u0006\b¦\u0001\u0010\u0090\u0001R\u0013\u0010\u001c\u001a\u00020\u0001¢\u0006\n\n\u0000\u001a\u0006\b§\u0001\u0010\u009a\u0001R\u0013\u0010\u001d\u001a\u00020\u0001¢\u0006\n\n\u0000\u001a\u0006\b¨\u0001\u0010\u009a\u0001R\u0013\u0010\u001e\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\b©\u0001\u0010\u008d\u0001R\u0013\u0010\u001f\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\bª\u0001\u0010\u008d\u0001R\u0013\u0010 \u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\b«\u0001\u0010\u008d\u0001R\u0013\u0010!\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\b¬\u0001\u0010\u008d\u0001R\u0013\u0010\"\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\b\u00ad\u0001\u0010\u008d\u0001R\u0013\u0010#\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\b®\u0001\u0010\u008d\u0001R\u0013\u0010$\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\b¯\u0001\u0010\u008d\u0001R\u0013\u0010%\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\b°\u0001\u0010\u008d\u0001R\u0013\u0010&\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\b±\u0001\u0010\u008d\u0001R\u0013\u0010'\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\b²\u0001\u0010\u008d\u0001R\u0013\u0010(\u001a\u00020\u0001¢\u0006\n\n\u0000\u001a\u0006\b³\u0001\u0010\u009a\u0001R\u0013\u0010)\u001a\u00020\u0001¢\u0006\n\n\u0000\u001a\u0006\b´\u0001\u0010\u009a\u0001R\u0013\u0010*\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\bµ\u0001\u0010\u008d\u0001R\u0013\u0010+\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\b¶\u0001\u0010\u008d\u0001R\u0013\u0010,\u001a\u00020\u0001¢\u0006\n\n\u0000\u001a\u0006\b·\u0001\u0010\u009a\u0001R\u0013\u0010-\u001a\u00020\u0001¢\u0006\n\n\u0000\u001a\u0006\b¸\u0001\u0010\u009a\u0001R\u0013\u0010.\u001a\u00020\u0001¢\u0006\n\n\u0000\u001a\u0006\b¹\u0001\u0010\u009a\u0001R\u0013\u0010/\u001a\u00020\u0019¢\u0006\n\n\u0000\u001a\u0006\bº\u0001\u0010¤\u0001R\u0013\u00100\u001a\u00020\u0001¢\u0006\n\n\u0000\u001a\u0006\b»\u0001\u0010\u009a\u0001R\u0013\u00101\u001a\u00020\u0006¢\u0006\n\n\u0000\u001a\u0006\b¼\u0001\u0010\u0090\u0001R\u0013\u00102\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\b½\u0001\u0010\u008d\u0001R\u0013\u00103\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\b¾\u0001\u0010\u008d\u0001R\u0013\u00104\u001a\u00020\u0006¢\u0006\n\n\u0000\u001a\u0006\b¿\u0001\u0010\u0090\u0001R\u0013\u00105\u001a\u00020\u0006¢\u0006\n\n\u0000\u001a\u0006\bÀ\u0001\u0010\u0090\u0001R\u0013\u00106\u001a\u00020\u0019¢\u0006\n\n\u0000\u001a\u0006\bÁ\u0001\u0010¤\u0001R\u0013\u00107\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\bÂ\u0001\u0010\u008d\u0001R\u0013\u00108\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\bÃ\u0001\u0010\u008d\u0001R\u0013\u00109\u001a\u00020:¢\u0006\n\n\u0000\u001a\u0006\bÄ\u0001\u0010Å\u0001R\u0013\u0010;\u001a\u00020\u0006¢\u0006\n\n\u0000\u001a\u0006\bÆ\u0001\u0010\u0090\u0001R\u0013\u0010<\u001a\u00020\u0006¢\u0006\n\n\u0000\u001a\u0006\bÇ\u0001\u0010\u0090\u0001R\u0013\u0010=\u001a\u00020\u0006¢\u0006\n\n\u0000\u001a\u0006\bÈ\u0001\u0010\u0090\u0001R\u0013\u0010>\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\bÉ\u0001\u0010\u008d\u0001R\u0013\u0010?\u001a\u00020\u0006¢\u0006\n\n\u0000\u001a\u0006\bÊ\u0001\u0010\u0090\u0001R\u0013\u0010@\u001a\u00020\u0006¢\u0006\n\n\u0000\u001a\u0006\bË\u0001\u0010\u0090\u0001R\u0013\u0010A\u001a\u00020\u0001¢\u0006\n\n\u0000\u001a\u0006\bÌ\u0001\u0010\u009a\u0001R\u0013\u0010B\u001a\u00020C¢\u0006\n\n\u0000\u001a\u0006\bÍ\u0001\u0010Î\u0001R\u0013\u0010D\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\bÏ\u0001\u0010\u008d\u0001R\u0013\u0010E\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\bÐ\u0001\u0010\u008d\u0001R\u0013\u0010F\u001a\u00020\u0006¢\u0006\n\n\u0000\u001a\u0006\bÑ\u0001\u0010\u0090\u0001R\u0013\u0010G\u001a\u00020\u0001¢\u0006\n\n\u0000\u001a\u0006\bÒ\u0001\u0010\u009a\u0001R\u0013\u0010H\u001a\u00020\u0006¢\u0006\n\n\u0000\u001a\u0006\bÓ\u0001\u0010\u0090\u0001R\u0013\u0010I\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\bÔ\u0001\u0010\u008d\u0001R\u0013\u0010J\u001a\u00020\u0001¢\u0006\n\n\u0000\u001a\u0006\bÕ\u0001\u0010\u009a\u0001R\u0013\u0010K\u001a\u00020\u0006¢\u0006\n\n\u0000\u001a\u0006\bÖ\u0001\u0010\u0090\u0001R\u0013\u0010L\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\b×\u0001\u0010\u008d\u0001R\u0013\u0010M\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\bØ\u0001\u0010\u008d\u0001R\u0013\u0010N\u001a\u00020\u0006¢\u0006\n\n\u0000\u001a\u0006\bÙ\u0001\u0010\u0090\u0001R\u0013\u0010O\u001a\u00020\u0001¢\u0006\n\n\u0000\u001a\u0006\bÚ\u0001\u0010\u009a\u0001R\u0013\u0010P\u001a\u00020Q¢\u0006\n\n\u0000\u001a\u0006\bÛ\u0001\u0010Ü\u0001R\u0013\u0010R\u001a\u00020\u0006¢\u0006\n\n\u0000\u001a\u0006\bÝ\u0001\u0010\u0090\u0001R\u0013\u0010S\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\bÞ\u0001\u0010\u008d\u0001R\u0013\u0010T\u001a\u00020\u0006¢\u0006\n\n\u0000\u001a\u0006\bß\u0001\u0010\u0090\u0001R\u0013\u0010U\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\bà\u0001\u0010\u008d\u0001R\u0013\u0010V\u001a\u00020\u0006¢\u0006\n\n\u0000\u001a\u0006\bá\u0001\u0010\u0090\u0001R\u0013\u0010W\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\bâ\u0001\u0010\u008d\u0001R\u0013\u0010X\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\bã\u0001\u0010\u008d\u0001R\u0013\u0010Y\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\bä\u0001\u0010\u008d\u0001R\u0013\u0010Z\u001a\u00020\u0006¢\u0006\n\n\u0000\u001a\u0006\bå\u0001\u0010\u0090\u0001R\u0013\u0010[\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\bæ\u0001\u0010\u008d\u0001R\u0013\u0010\\\u001a\u00020\u0006¢\u0006\n\n\u0000\u001a\u0006\bç\u0001\u0010\u0090\u0001R\u0013\u0010]\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\bè\u0001\u0010\u008d\u0001R\u0013\u0010^\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\bé\u0001\u0010\u008d\u0001R\u0013\u0010_\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\bê\u0001\u0010\u008d\u0001R\u0013\u0010`\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\bë\u0001\u0010\u008d\u0001R\u0013\u0010a\u001a\u00020b¢\u0006\n\n\u0000\u001a\u0006\bì\u0001\u0010í\u0001R\u0013\u0010c\u001a\u00020\u0001¢\u0006\n\n\u0000\u001a\u0006\bî\u0001\u0010\u009a\u0001R\u0013\u0010d\u001a\u00020\u0001¢\u0006\n\n\u0000\u001a\u0006\bï\u0001\u0010\u009a\u0001R\u0013\u0010e\u001a\u00020\u0001¢\u0006\n\n\u0000\u001a\u0006\bð\u0001\u0010\u009a\u0001R\u0013\u0010f\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\bñ\u0001\u0010\u008d\u0001R\u0013\u0010g\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\bò\u0001\u0010\u008d\u0001R\u0013\u0010h\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\bó\u0001\u0010\u008d\u0001R\u0013\u0010i\u001a\u00020\u0001¢\u0006\n\n\u0000\u001a\u0006\bô\u0001\u0010\u009a\u0001R\u0013\u0010j\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\bõ\u0001\u0010\u008d\u0001R\u0013\u0010k\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\bö\u0001\u0010\u008d\u0001R\u0013\u0010l\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\b÷\u0001\u0010\u008d\u0001R\u0013\u0010m\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\bø\u0001\u0010\u008d\u0001R\u0013\u0010n\u001a\u00020\u0001¢\u0006\n\n\u0000\u001a\u0006\bù\u0001\u0010\u009a\u0001R\u0013\u0010o\u001a\u00020\u0001¢\u0006\n\n\u0000\u001a\u0006\bú\u0001\u0010\u009a\u0001R\u0013\u0010p\u001a\u00020\u0006¢\u0006\n\n\u0000\u001a\u0006\bû\u0001\u0010\u0090\u0001R\u0013\u0010q\u001a\u00020\u0006¢\u0006\n\n\u0000\u001a\u0006\bü\u0001\u0010\u0090\u0001R\u0013\u0010r\u001a\u00020\u0006¢\u0006\n\n\u0000\u001a\u0006\bý\u0001\u0010\u0090\u0001R\u0013\u0010s\u001a\u00020\u0006¢\u0006\n\n\u0000\u001a\u0006\bþ\u0001\u0010\u0090\u0001R\u0013\u0010t\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\bÿ\u0001\u0010\u008d\u0001R\u0013\u0010u\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\b\u0080\u0002\u0010\u008d\u0001R\u0013\u0010v\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\b\u0081\u0002\u0010\u008d\u0001R\u0013\u0010w\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\b\u0082\u0002\u0010\u008d\u0001R\u0013\u0010x\u001a\u00020\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u0083\u0002\u0010\u009a\u0001R\u0013\u0010y\u001a\u00020\u0006¢\u0006\n\n\u0000\u001a\u0006\b\u0084\u0002\u0010\u0090\u0001R\u0013\u0010z\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\b\u0085\u0002\u0010\u008d\u0001R\u0013\u0010{\u001a\u00020\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u0086\u0002\u0010\u009a\u0001R\u0013\u0010|\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\b\u0087\u0002\u0010\u008d\u0001R\u0013\u0010}\u001a\u00020\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u0088\u0002\u0010\u009a\u0001R\u0013\u0010~\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\b\u0089\u0002\u0010\u008d\u0001R\u0013\u0010\u007f\u001a\u00020\u0006¢\u0006\n\n\u0000\u001a\u0006\b\u008a\u0002\u0010\u0090\u0001R\u0014\u0010\u0080\u0001\u001a\u00020C¢\u0006\n\n\u0000\u001a\u0006\b\u008b\u0002\u0010Î\u0001R\u0014\u0010\u0081\u0001\u001a\u00020\u0006¢\u0006\n\n\u0000\u001a\u0006\b\u008c\u0002\u0010\u0090\u0001R\u0014\u0010\u0082\u0001\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\b\u008d\u0002\u0010\u008d\u0001R\u0014\u0010\u0083\u0001\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\b\u008e\u0002\u0010\u008d\u0001R\u0014\u0010\u0084\u0001\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\b\u008f\u0002\u0010\u008d\u0001R\u0015\u0010\u0085\u0001\u001a\u00030\u0086\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u0090\u0002\u0010\u0091\u0002R\u0015\u0010\u0087\u0001\u001a\u00030\u0088\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u0092\u0002\u0010\u0093\u0002R\u0014\u0010\u0089\u0001\u001a\u00020\u0006¢\u0006\n\n\u0000\u001a\u0006\b\u0094\u0002\u0010\u0090\u0001R\u0014\u0010\u008a\u0001\u001a\u00020\u0006¢\u0006\n\n\u0000\u001a\u0006\b\u0095\u0002\u0010\u0090\u0001¨\u0006\u009a\u0003"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/RcVivkeji;", "", "aadhar_no", "", "ac_fitted", "annual_income", "", "appl_no", "audio_fitted", "body_type", "c_add1", "c_add2", "c_add3", "c_district", "c_district_name", "c_off_cd", "c_pincode", "c_state", "c_state_name", "chasi_no", "chasi_no_original", "color", "conditionstatus", "", "cubic_cap", "", "dealer_cd", "dept_cd", "dlRequired", "dlValidationRequired", "dl_no", "dlr_add1", "dlr_add2", "dlr_add3", "dlr_city", "dlr_district", "dlr_name", "dlr_pincode", "email_id", "eng_no", "eng_no_original", "eng_no_orignal", "f_name", "fit_upto", "fit_uptoAsDate", "fit_upto_desc", "flag", "floor_area", "formatRegn_dt", "fuel", "fuel_descr", "garage_add", "gcw", "height", "hp", "imported_vch", "laser_code", "latesttaxdetails", "Lcom/nic/mparivahan/VahanServices/VahanModel/Latesttaxdetails;", "ld_wt", "length", "maker", "maker_name", "manu_mon", "manu_yr", "mobileNoEditable", "mobile_no", "", "model_cd", "model_name", "no_cyl", "no_of_axles", "norms", "norms_descr", "numberOfTyres", "off_cd", "off_name", "op_dt", "other_criteria", "ownerCatg", "ownerIdentification", "Lcom/nic/mparivahan/VahanServices/VahanModel/OwnerIdentificationX;", "owner_cd", "owner_cd_descr", "owner_ctg", "owner_name", "owner_sr", "p_add1", "p_add2", "p_add3", "p_district", "p_district_name", "p_pincode", "p_state", "p_state_name", "pan_no", "passport_no", "permitDetailDto", "Lcom/nic/mparivahan/VahanServices/VahanModel/PermitDetailDto;", "permitDetailEntity", "permit_rto_cd", "purchase_date", "purchase_dt", "ration_card_no", "regn_dt", "regn_dtAsDate", "regn_no", "regn_type", "regn_type_descr", "regn_upto", "regn_uptoAsDate", "returnMessge", "sale_amt", "seat_cap", "sleeper_cap", "stand_cap", "state_cd", "state_name", "status", "tax_mode", "transport_catg", "unld_wt", "vch_catg", "vch_catg_desc", "vch_purchase_as", "vch_purchase_asCode", "vehType", "vehTypeAsInt", "verified_on", "vh_class", "vh_class_desc", "video_fitted", "voter_id", "vtInsuranceCommonDto", "Lcom/nic/mparivahan/VahanServices/VahanModel/VtInsuranceCommonDtoX;", "vtpucc", "Lcom/nic/mparivahan/VahanServices/VahanModel/VtpuccX;", "wheelbase", "width", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Object;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZDLjava/lang/String;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;DLjava/lang/Object;ILjava/lang/String;Ljava/lang/String;IIDLjava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/VahanModel/Latesttaxdetails;IIILjava/lang/String;IILjava/lang/Object;JLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;ILjava/lang/String;Ljava/lang/Object;ILjava/lang/String;Ljava/lang/String;ILjava/lang/Object;Lcom/nic/mparivahan/VahanServices/VahanModel/OwnerIdentificationX;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/VahanModel/PermitDetailDto;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;IIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;IJILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/VahanModel/VtInsuranceCommonDtoX;Lcom/nic/mparivahan/VahanServices/VahanModel/VtpuccX;II)V", "getAadhar_no", "()Ljava/lang/String;", "getAc_fitted", "getAnnual_income", "()I", "getAppl_no", "getAudio_fitted", "getBody_type", "getC_add1", "getC_add2", "getC_add3", "getC_district", "getC_district_name", "getC_off_cd", "()Ljava/lang/Object;", "getC_pincode", "getC_state", "getC_state_name", "getChasi_no", "getChasi_no_original", "getColor", "getConditionstatus", "()Z", "getCubic_cap", "()D", "getDealer_cd", "getDept_cd", "getDlRequired", "getDlValidationRequired", "getDl_no", "getDlr_add1", "getDlr_add2", "getDlr_add3", "getDlr_city", "getDlr_district", "getDlr_name", "getDlr_pincode", "getEmail_id", "getEng_no", "getEng_no_original", "getEng_no_orignal", "getF_name", "getFit_upto", "getFit_uptoAsDate", "getFit_upto_desc", "getFlag", "getFloor_area", "getFormatRegn_dt", "getFuel", "getFuel_descr", "getGarage_add", "getGcw", "getHeight", "getHp", "getImported_vch", "getLaser_code", "getLatesttaxdetails", "()Lcom/nic/mparivahan/VahanServices/VahanModel/Latesttaxdetails;", "getLd_wt", "getLength", "getMaker", "getMaker_name", "getManu_mon", "getManu_yr", "getMobileNoEditable", "getMobile_no", "()J", "getModel_cd", "getModel_name", "getNo_cyl", "getNo_of_axles", "getNorms", "getNorms_descr", "getNumberOfTyres", "getOff_cd", "getOff_name", "getOp_dt", "getOther_criteria", "getOwnerCatg", "getOwnerIdentification", "()Lcom/nic/mparivahan/VahanServices/VahanModel/OwnerIdentificationX;", "getOwner_cd", "getOwner_cd_descr", "getOwner_ctg", "getOwner_name", "getOwner_sr", "getP_add1", "getP_add2", "getP_add3", "getP_district", "getP_district_name", "getP_pincode", "getP_state", "getP_state_name", "getPan_no", "getPassport_no", "getPermitDetailDto", "()Lcom/nic/mparivahan/VahanServices/VahanModel/PermitDetailDto;", "getPermitDetailEntity", "getPermit_rto_cd", "getPurchase_date", "getPurchase_dt", "getRation_card_no", "getRegn_dt", "getRegn_dtAsDate", "getRegn_no", "getRegn_type", "getRegn_type_descr", "getRegn_upto", "getRegn_uptoAsDate", "getReturnMessge", "getSale_amt", "getSeat_cap", "getSleeper_cap", "getStand_cap", "getState_cd", "getState_name", "getStatus", "getTax_mode", "getTransport_catg", "getUnld_wt", "getVch_catg", "getVch_catg_desc", "getVch_purchase_as", "getVch_purchase_asCode", "getVehType", "getVehTypeAsInt", "getVerified_on", "getVh_class", "getVh_class_desc", "getVideo_fitted", "getVoter_id", "getVtInsuranceCommonDto", "()Lcom/nic/mparivahan/VahanServices/VahanModel/VtInsuranceCommonDtoX;", "getVtpucc", "()Lcom/nic/mparivahan/VahanServices/VahanModel/VtpuccX;", "getWheelbase", "getWidth", "component1", "component10", "component100", "component101", "component102", "component103", "component104", "component105", "component106", "component107", "component108", "component109", "component11", "component110", "component111", "component112", "component113", "component114", "component115", "component116", "component117", "component118", "component119", "component12", "component120", "component121", "component122", "component123", "component124", "component125", "component126", "component127", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component6", "component60", "component61", "component62", "component63", "component64", "component65", "component66", "component67", "component68", "component69", "component7", "component70", "component71", "component72", "component73", "component74", "component75", "component76", "component77", "component78", "component79", "component8", "component80", "component81", "component82", "component83", "component84", "component85", "component86", "component87", "component88", "component89", "component9", "component90", "component91", "component92", "component93", "component94", "component95", "component96", "component97", "component98", "component99", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class RcVivkeji {
    private final String aadhar_no;
    private final String ac_fitted;
    private final int annual_income;
    private final String appl_no;
    private final String audio_fitted;
    private final String body_type;
    private final String c_add1;
    private final String c_add2;
    private final String c_add3;
    private final int c_district;
    private final String c_district_name;
    private final Object c_off_cd;
    private final int c_pincode;
    private final String c_state;
    private final String c_state_name;
    private final String chasi_no;
    private final Object chasi_no_original;
    private final String color;
    private final boolean conditionstatus;
    private final double cubic_cap;
    private final String dealer_cd;
    private final int dept_cd;
    private final Object dlRequired;
    private final Object dlValidationRequired;
    private final String dl_no;
    private final String dlr_add1;
    private final String dlr_add2;
    private final String dlr_add3;
    private final String dlr_city;
    private final String dlr_district;
    private final String dlr_name;
    private final String dlr_pincode;
    private final String email_id;
    private final String eng_no;
    private final Object eng_no_original;
    private final Object eng_no_orignal;
    private final String f_name;
    private final String fit_upto;
    private final Object fit_uptoAsDate;
    private final Object fit_upto_desc;
    private final Object flag;
    private final double floor_area;
    private final Object formatRegn_dt;
    private final int fuel;
    private final String fuel_descr;
    private final String garage_add;
    private final int gcw;
    private final int height;
    private final double hp;
    private final String imported_vch;
    private final String laser_code;
    private final Latesttaxdetails latesttaxdetails;
    private final int ld_wt;
    private final int length;
    private final int maker;
    private final String maker_name;
    private final int manu_mon;
    private final int manu_yr;
    private final Object mobileNoEditable;
    private final long mobile_no;
    private final String model_cd;
    private final String model_name;
    private final int no_cyl;
    private final Object no_of_axles;
    private final int norms;
    private final String norms_descr;
    private final Object numberOfTyres;
    private final int off_cd;
    private final String off_name;
    private final String op_dt;
    private final int other_criteria;
    private final Object ownerCatg;
    private final OwnerIdentificationX ownerIdentification;
    private final int owner_cd;
    private final String owner_cd_descr;
    private final int owner_ctg;
    private final String owner_name;
    private final int owner_sr;
    private final String p_add1;
    private final String p_add2;
    private final String p_add3;
    private final int p_district;
    private final String p_district_name;
    private final int p_pincode;
    private final String p_state;
    private final String p_state_name;
    private final String pan_no;
    private final String passport_no;
    private final PermitDetailDto permitDetailDto;
    private final Object permitDetailEntity;
    private final Object permit_rto_cd;
    private final Object purchase_date;
    private final String purchase_dt;
    private final String ration_card_no;
    private final String regn_dt;
    private final Object regn_dtAsDate;
    private final String regn_no;
    private final String regn_type;
    private final String regn_type_descr;
    private final String regn_upto;
    private final Object regn_uptoAsDate;
    private final Object returnMessge;
    private final int sale_amt;
    private final int seat_cap;
    private final int sleeper_cap;
    private final int stand_cap;
    private final String state_cd;
    private final String state_name;
    private final String status;
    private final String tax_mode;
    private final Object transport_catg;
    private final int unld_wt;
    private final String vch_catg;
    private final Object vch_catg_desc;
    private final String vch_purchase_as;
    private final Object vch_purchase_asCode;
    private final String vehType;
    private final int vehTypeAsInt;
    private final long verified_on;
    private final int vh_class;
    private final String vh_class_desc;
    private final String video_fitted;
    private final String voter_id;
    private final VtInsuranceCommonDtoX vtInsuranceCommonDto;
    private final VtpuccX vtpucc;
    private final int wheelbase;
    private final int width;

    public RcVivkeji(String aadhar_no, String ac_fitted, int i, String appl_no, String audio_fitted, String body_type, String c_add1, String c_add2, String c_add3, int i2, String c_district_name, Object c_off_cd, int i3, String c_state, String c_state_name, String chasi_no, Object chasi_no_original, String color, boolean z, double d, String dealer_cd, int i4, Object dlRequired, Object dlValidationRequired, String dl_no, String dlr_add1, String dlr_add2, String dlr_add3, String dlr_city, String dlr_district, String dlr_name, String dlr_pincode, String email_id, String eng_no, Object eng_no_original, Object eng_no_orignal, String f_name, String fit_upto, Object fit_uptoAsDate, Object fit_upto_desc, Object flag, double d2, Object formatRegn_dt, int i5, String fuel_descr, String garage_add, int i6, int i7, double d3, String imported_vch, String laser_code, Latesttaxdetails latesttaxdetails, int i8, int i9, int i10, String maker_name, int i11, int i12, Object mobileNoEditable, long j, String model_cd, String model_name, int i13, Object no_of_axles, int i14, String norms_descr, Object numberOfTyres, int i15, String off_name, String op_dt, int i16, Object ownerCatg, OwnerIdentificationX ownerIdentification, int i17, String owner_cd_descr, int i18, String owner_name, int i19, String p_add1, String p_add2, String p_add3, int i20, String p_district_name, int i21, String p_state, String p_state_name, String pan_no, String passport_no, PermitDetailDto permitDetailDto, Object permitDetailEntity, Object permit_rto_cd, Object purchase_date, String purchase_dt, String ration_card_no, String regn_dt, Object regn_dtAsDate, String regn_no, String regn_type, String regn_type_descr, String regn_upto, Object regn_uptoAsDate, Object returnMessge, int i22, int i23, int i24, int i25, String state_cd, String state_name, String status, String tax_mode, Object transport_catg, int i26, String vch_catg, Object vch_catg_desc, String vch_purchase_as, Object vch_purchase_asCode, String vehType, int i27, long j2, int i28, String vh_class_desc, String video_fitted, String voter_id, VtInsuranceCommonDtoX vtInsuranceCommonDto, VtpuccX vtpucc, int i29, int i30) {
        Intrinsics.checkNotNullParameter(aadhar_no, "aadhar_no");
        Intrinsics.checkNotNullParameter(ac_fitted, "ac_fitted");
        Intrinsics.checkNotNullParameter(appl_no, "appl_no");
        Intrinsics.checkNotNullParameter(audio_fitted, "audio_fitted");
        Intrinsics.checkNotNullParameter(body_type, "body_type");
        Intrinsics.checkNotNullParameter(c_add1, "c_add1");
        Intrinsics.checkNotNullParameter(c_add2, "c_add2");
        Intrinsics.checkNotNullParameter(c_add3, "c_add3");
        Intrinsics.checkNotNullParameter(c_district_name, "c_district_name");
        Intrinsics.checkNotNullParameter(c_off_cd, "c_off_cd");
        Intrinsics.checkNotNullParameter(c_state, "c_state");
        Intrinsics.checkNotNullParameter(c_state_name, "c_state_name");
        Intrinsics.checkNotNullParameter(chasi_no, "chasi_no");
        Intrinsics.checkNotNullParameter(chasi_no_original, "chasi_no_original");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(dealer_cd, "dealer_cd");
        Intrinsics.checkNotNullParameter(dlRequired, "dlRequired");
        Intrinsics.checkNotNullParameter(dlValidationRequired, "dlValidationRequired");
        Intrinsics.checkNotNullParameter(dl_no, "dl_no");
        Intrinsics.checkNotNullParameter(dlr_add1, "dlr_add1");
        Intrinsics.checkNotNullParameter(dlr_add2, "dlr_add2");
        Intrinsics.checkNotNullParameter(dlr_add3, "dlr_add3");
        Intrinsics.checkNotNullParameter(dlr_city, "dlr_city");
        Intrinsics.checkNotNullParameter(dlr_district, "dlr_district");
        Intrinsics.checkNotNullParameter(dlr_name, "dlr_name");
        Intrinsics.checkNotNullParameter(dlr_pincode, "dlr_pincode");
        Intrinsics.checkNotNullParameter(email_id, "email_id");
        Intrinsics.checkNotNullParameter(eng_no, "eng_no");
        Intrinsics.checkNotNullParameter(eng_no_original, "eng_no_original");
        Intrinsics.checkNotNullParameter(eng_no_orignal, "eng_no_orignal");
        Intrinsics.checkNotNullParameter(f_name, "f_name");
        Intrinsics.checkNotNullParameter(fit_upto, "fit_upto");
        Intrinsics.checkNotNullParameter(fit_uptoAsDate, "fit_uptoAsDate");
        Intrinsics.checkNotNullParameter(fit_upto_desc, "fit_upto_desc");
        Intrinsics.checkNotNullParameter(flag, "flag");
        Intrinsics.checkNotNullParameter(formatRegn_dt, "formatRegn_dt");
        Intrinsics.checkNotNullParameter(fuel_descr, "fuel_descr");
        Intrinsics.checkNotNullParameter(garage_add, "garage_add");
        Intrinsics.checkNotNullParameter(imported_vch, "imported_vch");
        Intrinsics.checkNotNullParameter(laser_code, "laser_code");
        Intrinsics.checkNotNullParameter(latesttaxdetails, "latesttaxdetails");
        Intrinsics.checkNotNullParameter(maker_name, "maker_name");
        Intrinsics.checkNotNullParameter(mobileNoEditable, "mobileNoEditable");
        Intrinsics.checkNotNullParameter(model_cd, "model_cd");
        Intrinsics.checkNotNullParameter(model_name, "model_name");
        Intrinsics.checkNotNullParameter(no_of_axles, "no_of_axles");
        Intrinsics.checkNotNullParameter(norms_descr, "norms_descr");
        Intrinsics.checkNotNullParameter(numberOfTyres, "numberOfTyres");
        Intrinsics.checkNotNullParameter(off_name, "off_name");
        Intrinsics.checkNotNullParameter(op_dt, "op_dt");
        Intrinsics.checkNotNullParameter(ownerCatg, "ownerCatg");
        Intrinsics.checkNotNullParameter(ownerIdentification, "ownerIdentification");
        Intrinsics.checkNotNullParameter(owner_cd_descr, "owner_cd_descr");
        Intrinsics.checkNotNullParameter(owner_name, "owner_name");
        Intrinsics.checkNotNullParameter(p_add1, "p_add1");
        Intrinsics.checkNotNullParameter(p_add2, "p_add2");
        Intrinsics.checkNotNullParameter(p_add3, "p_add3");
        Intrinsics.checkNotNullParameter(p_district_name, "p_district_name");
        Intrinsics.checkNotNullParameter(p_state, "p_state");
        Intrinsics.checkNotNullParameter(p_state_name, "p_state_name");
        Intrinsics.checkNotNullParameter(pan_no, "pan_no");
        Intrinsics.checkNotNullParameter(passport_no, "passport_no");
        Intrinsics.checkNotNullParameter(permitDetailDto, "permitDetailDto");
        Intrinsics.checkNotNullParameter(permitDetailEntity, "permitDetailEntity");
        Intrinsics.checkNotNullParameter(permit_rto_cd, "permit_rto_cd");
        Intrinsics.checkNotNullParameter(purchase_date, "purchase_date");
        Intrinsics.checkNotNullParameter(purchase_dt, "purchase_dt");
        Intrinsics.checkNotNullParameter(ration_card_no, "ration_card_no");
        Intrinsics.checkNotNullParameter(regn_dt, "regn_dt");
        Intrinsics.checkNotNullParameter(regn_dtAsDate, "regn_dtAsDate");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(regn_type, "regn_type");
        Intrinsics.checkNotNullParameter(regn_type_descr, "regn_type_descr");
        Intrinsics.checkNotNullParameter(regn_upto, "regn_upto");
        Intrinsics.checkNotNullParameter(regn_uptoAsDate, "regn_uptoAsDate");
        Intrinsics.checkNotNullParameter(returnMessge, "returnMessge");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(state_name, "state_name");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(tax_mode, "tax_mode");
        Intrinsics.checkNotNullParameter(transport_catg, "transport_catg");
        Intrinsics.checkNotNullParameter(vch_catg, "vch_catg");
        Intrinsics.checkNotNullParameter(vch_catg_desc, "vch_catg_desc");
        Intrinsics.checkNotNullParameter(vch_purchase_as, "vch_purchase_as");
        Intrinsics.checkNotNullParameter(vch_purchase_asCode, "vch_purchase_asCode");
        Intrinsics.checkNotNullParameter(vehType, "vehType");
        Intrinsics.checkNotNullParameter(vh_class_desc, "vh_class_desc");
        Intrinsics.checkNotNullParameter(video_fitted, "video_fitted");
        Intrinsics.checkNotNullParameter(voter_id, "voter_id");
        Intrinsics.checkNotNullParameter(vtInsuranceCommonDto, "vtInsuranceCommonDto");
        Intrinsics.checkNotNullParameter(vtpucc, "vtpucc");
        this.aadhar_no = aadhar_no;
        this.ac_fitted = ac_fitted;
        this.annual_income = i;
        this.appl_no = appl_no;
        this.audio_fitted = audio_fitted;
        this.body_type = body_type;
        this.c_add1 = c_add1;
        this.c_add2 = c_add2;
        this.c_add3 = c_add3;
        this.c_district = i2;
        this.c_district_name = c_district_name;
        this.c_off_cd = c_off_cd;
        this.c_pincode = i3;
        this.c_state = c_state;
        this.c_state_name = c_state_name;
        this.chasi_no = chasi_no;
        this.chasi_no_original = chasi_no_original;
        this.color = color;
        this.conditionstatus = z;
        this.cubic_cap = d;
        this.dealer_cd = dealer_cd;
        this.dept_cd = i4;
        this.dlRequired = dlRequired;
        this.dlValidationRequired = dlValidationRequired;
        this.dl_no = dl_no;
        this.dlr_add1 = dlr_add1;
        this.dlr_add2 = dlr_add2;
        this.dlr_add3 = dlr_add3;
        this.dlr_city = dlr_city;
        this.dlr_district = dlr_district;
        this.dlr_name = dlr_name;
        this.dlr_pincode = dlr_pincode;
        this.email_id = email_id;
        this.eng_no = eng_no;
        this.eng_no_original = eng_no_original;
        this.eng_no_orignal = eng_no_orignal;
        this.f_name = f_name;
        this.fit_upto = fit_upto;
        this.fit_uptoAsDate = fit_uptoAsDate;
        this.fit_upto_desc = fit_upto_desc;
        this.flag = flag;
        this.floor_area = d2;
        this.formatRegn_dt = formatRegn_dt;
        this.fuel = i5;
        this.fuel_descr = fuel_descr;
        this.garage_add = garage_add;
        this.gcw = i6;
        this.height = i7;
        this.hp = d3;
        this.imported_vch = imported_vch;
        this.laser_code = laser_code;
        this.latesttaxdetails = latesttaxdetails;
        this.ld_wt = i8;
        this.length = i9;
        this.maker = i10;
        this.maker_name = maker_name;
        this.manu_mon = i11;
        this.manu_yr = i12;
        this.mobileNoEditable = mobileNoEditable;
        this.mobile_no = j;
        this.model_cd = model_cd;
        this.model_name = model_name;
        this.no_cyl = i13;
        this.no_of_axles = no_of_axles;
        this.norms = i14;
        this.norms_descr = norms_descr;
        this.numberOfTyres = numberOfTyres;
        this.off_cd = i15;
        this.off_name = off_name;
        this.op_dt = op_dt;
        this.other_criteria = i16;
        this.ownerCatg = ownerCatg;
        this.ownerIdentification = ownerIdentification;
        this.owner_cd = i17;
        this.owner_cd_descr = owner_cd_descr;
        this.owner_ctg = i18;
        this.owner_name = owner_name;
        this.owner_sr = i19;
        this.p_add1 = p_add1;
        this.p_add2 = p_add2;
        this.p_add3 = p_add3;
        this.p_district = i20;
        this.p_district_name = p_district_name;
        this.p_pincode = i21;
        this.p_state = p_state;
        this.p_state_name = p_state_name;
        this.pan_no = pan_no;
        this.passport_no = passport_no;
        this.permitDetailDto = permitDetailDto;
        this.permitDetailEntity = permitDetailEntity;
        this.permit_rto_cd = permit_rto_cd;
        this.purchase_date = purchase_date;
        this.purchase_dt = purchase_dt;
        this.ration_card_no = ration_card_no;
        this.regn_dt = regn_dt;
        this.regn_dtAsDate = regn_dtAsDate;
        this.regn_no = regn_no;
        this.regn_type = regn_type;
        this.regn_type_descr = regn_type_descr;
        this.regn_upto = regn_upto;
        this.regn_uptoAsDate = regn_uptoAsDate;
        this.returnMessge = returnMessge;
        this.sale_amt = i22;
        this.seat_cap = i23;
        this.sleeper_cap = i24;
        this.stand_cap = i25;
        this.state_cd = state_cd;
        this.state_name = state_name;
        this.status = status;
        this.tax_mode = tax_mode;
        this.transport_catg = transport_catg;
        this.unld_wt = i26;
        this.vch_catg = vch_catg;
        this.vch_catg_desc = vch_catg_desc;
        this.vch_purchase_as = vch_purchase_as;
        this.vch_purchase_asCode = vch_purchase_asCode;
        this.vehType = vehType;
        this.vehTypeAsInt = i27;
        this.verified_on = j2;
        this.vh_class = i28;
        this.vh_class_desc = vh_class_desc;
        this.video_fitted = video_fitted;
        this.voter_id = voter_id;
        this.vtInsuranceCommonDto = vtInsuranceCommonDto;
        this.vtpucc = vtpucc;
        this.wheelbase = i29;
        this.width = i30;
    }

    public static /* synthetic */ RcVivkeji copy$default(RcVivkeji rcVivkeji, String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, int i2, String str9, Object obj, int i3, String str10, String str11, String str12, Object obj2, String str13, boolean z, double d, String str14, int i4, Object obj3, Object obj4, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, Object obj5, Object obj6, String str25, String str26, Object obj7, Object obj8, Object obj9, double d2, Object obj10, int i5, String str27, String str28, int i6, int i7, double d3, String str29, String str30, Latesttaxdetails latesttaxdetails, int i8, int i9, int i10, String str31, int i11, int i12, Object obj11, long j, String str32, String str33, int i13, Object obj12, int i14, String str34, Object obj13, int i15, String str35, String str36, int i16, Object obj14, OwnerIdentificationX ownerIdentificationX, int i17, String str37, int i18, String str38, int i19, String str39, String str40, String str41, int i20, String str42, int i21, String str43, String str44, String str45, String str46, PermitDetailDto permitDetailDto, Object obj15, Object obj16, Object obj17, String str47, String str48, String str49, Object obj18, String str50, String str51, String str52, String str53, Object obj19, Object obj20, int i22, int i23, int i24, int i25, String str54, String str55, String str56, String str57, Object obj21, int i26, String str58, Object obj22, String str59, Object obj23, String str60, int i27, long j2, int i28, String str61, String str62, String str63, VtInsuranceCommonDtoX vtInsuranceCommonDtoX, VtpuccX vtpuccX, int i29, int i30, int i31, int i32, int i33, int i34, Object obj24) {
        String str64 = (i31 & 1) != 0 ? rcVivkeji.aadhar_no : str;
        String str65 = (i31 & 2) != 0 ? rcVivkeji.ac_fitted : str2;
        int i35 = (i31 & 4) != 0 ? rcVivkeji.annual_income : i;
        String str66 = (i31 & 8) != 0 ? rcVivkeji.appl_no : str3;
        String str67 = (i31 & 16) != 0 ? rcVivkeji.audio_fitted : str4;
        String str68 = (i31 & 32) != 0 ? rcVivkeji.body_type : str5;
        String str69 = (i31 & 64) != 0 ? rcVivkeji.c_add1 : str6;
        String str70 = (i31 & 128) != 0 ? rcVivkeji.c_add2 : str7;
        String str71 = (i31 & 256) != 0 ? rcVivkeji.c_add3 : str8;
        int i36 = (i31 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? rcVivkeji.c_district : i2;
        String str72 = (i31 & 1024) != 0 ? rcVivkeji.c_district_name : str9;
        Object obj25 = (i31 & 2048) != 0 ? rcVivkeji.c_off_cd : obj;
        int i37 = (i31 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? rcVivkeji.c_pincode : i3;
        String str73 = (i31 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? rcVivkeji.c_state : str10;
        String str74 = (i31 & 16384) != 0 ? rcVivkeji.c_state_name : str11;
        String str75 = (i31 & 32768) != 0 ? rcVivkeji.chasi_no : str12;
        Object obj26 = (i31 & 65536) != 0 ? rcVivkeji.chasi_no_original : obj2;
        String str76 = (i31 & 131072) != 0 ? rcVivkeji.color : str13;
        int i38 = i36;
        boolean z2 = (i31 & 262144) != 0 ? rcVivkeji.conditionstatus : z;
        double d4 = (i31 & 524288) != 0 ? rcVivkeji.cubic_cap : d;
        String str77 = (i31 & 1048576) != 0 ? rcVivkeji.dealer_cd : str14;
        int i39 = (i31 & 2097152) != 0 ? rcVivkeji.dept_cd : i4;
        Object obj27 = (i31 & 4194304) != 0 ? rcVivkeji.dlRequired : obj3;
        Object obj28 = (i31 & 8388608) != 0 ? rcVivkeji.dlValidationRequired : obj4;
        String str78 = (i31 & 16777216) != 0 ? rcVivkeji.dl_no : str15;
        String str79 = (i31 & 33554432) != 0 ? rcVivkeji.dlr_add1 : str16;
        String str80 = (i31 & 67108864) != 0 ? rcVivkeji.dlr_add2 : str17;
        String str81 = (i31 & 134217728) != 0 ? rcVivkeji.dlr_add3 : str18;
        String str82 = (i31 & 268435456) != 0 ? rcVivkeji.dlr_city : str19;
        String str83 = (i31 & 536870912) != 0 ? rcVivkeji.dlr_district : str20;
        String str84 = (i31 & 1073741824) != 0 ? rcVivkeji.dlr_name : str21;
        String str85 = (i31 & IntCompanionObject.MIN_VALUE) != 0 ? rcVivkeji.dlr_pincode : str22;
        String str86 = (i32 & 1) != 0 ? rcVivkeji.email_id : str23;
        String str87 = (i32 & 2) != 0 ? rcVivkeji.eng_no : str24;
        Object obj29 = (i32 & 4) != 0 ? rcVivkeji.eng_no_original : obj5;
        Object obj30 = (i32 & 8) != 0 ? rcVivkeji.eng_no_orignal : obj6;
        String str88 = (i32 & 16) != 0 ? rcVivkeji.f_name : str25;
        String str89 = (i32 & 32) != 0 ? rcVivkeji.fit_upto : str26;
        Object obj31 = (i32 & 64) != 0 ? rcVivkeji.fit_uptoAsDate : obj7;
        Object obj32 = (i32 & 128) != 0 ? rcVivkeji.fit_upto_desc : obj8;
        Object obj33 = (i32 & 256) != 0 ? rcVivkeji.flag : obj9;
        String str90 = str77;
        String str91 = str84;
        double d5 = (i32 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? rcVivkeji.floor_area : d2;
        Object obj34 = (i32 & 1024) != 0 ? rcVivkeji.formatRegn_dt : obj10;
        int i40 = (i32 & 2048) != 0 ? rcVivkeji.fuel : i5;
        String str92 = (i32 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? rcVivkeji.fuel_descr : str27;
        String str93 = (i32 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? rcVivkeji.garage_add : str28;
        int i41 = (i32 & 16384) != 0 ? rcVivkeji.gcw : i6;
        int i42 = (i32 & 32768) != 0 ? rcVivkeji.height : i7;
        double d6 = d5;
        double d7 = (i32 & 65536) != 0 ? rcVivkeji.hp : d3;
        String str94 = (i32 & 131072) != 0 ? rcVivkeji.imported_vch : str29;
        return rcVivkeji.copy(str64, str65, i35, str66, str67, str68, str69, str70, str71, i38, str72, obj25, i37, str73, str74, str75, obj26, str76, z2, d4, str90, i39, obj27, obj28, str78, str79, str80, str81, str82, str83, str91, str85, str86, str87, obj29, obj30, str88, str89, obj31, obj32, obj33, d6, obj34, i40, str92, str93, i41, i42, d7, str94, (i32 & 262144) != 0 ? rcVivkeji.laser_code : str30, (i32 & 524288) != 0 ? rcVivkeji.latesttaxdetails : latesttaxdetails, (i32 & 1048576) != 0 ? rcVivkeji.ld_wt : i8, (i32 & 2097152) != 0 ? rcVivkeji.length : i9, (i32 & 4194304) != 0 ? rcVivkeji.maker : i10, (i32 & 8388608) != 0 ? rcVivkeji.maker_name : str31, (i32 & 16777216) != 0 ? rcVivkeji.manu_mon : i11, (i32 & 33554432) != 0 ? rcVivkeji.manu_yr : i12, (i32 & 67108864) != 0 ? rcVivkeji.mobileNoEditable : obj11, (i32 & 134217728) != 0 ? rcVivkeji.mobile_no : j, (i32 & 268435456) != 0 ? rcVivkeji.model_cd : str32, (536870912 & i32) != 0 ? rcVivkeji.model_name : str33, (i32 & 1073741824) != 0 ? rcVivkeji.no_cyl : i13, (i32 & IntCompanionObject.MIN_VALUE) != 0 ? rcVivkeji.no_of_axles : obj12, (i33 & 1) != 0 ? rcVivkeji.norms : i14, (i33 & 2) != 0 ? rcVivkeji.norms_descr : str34, (i33 & 4) != 0 ? rcVivkeji.numberOfTyres : obj13, (i33 & 8) != 0 ? rcVivkeji.off_cd : i15, (i33 & 16) != 0 ? rcVivkeji.off_name : str35, (i33 & 32) != 0 ? rcVivkeji.op_dt : str36, (i33 & 64) != 0 ? rcVivkeji.other_criteria : i16, (i33 & 128) != 0 ? rcVivkeji.ownerCatg : obj14, (i33 & 256) != 0 ? rcVivkeji.ownerIdentification : ownerIdentificationX, (i33 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? rcVivkeji.owner_cd : i17, (i33 & 1024) != 0 ? rcVivkeji.owner_cd_descr : str37, (i33 & 2048) != 0 ? rcVivkeji.owner_ctg : i18, (i33 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? rcVivkeji.owner_name : str38, (i33 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? rcVivkeji.owner_sr : i19, (i33 & 16384) != 0 ? rcVivkeji.p_add1 : str39, (i33 & 32768) != 0 ? rcVivkeji.p_add2 : str40, (i33 & 65536) != 0 ? rcVivkeji.p_add3 : str41, (i33 & 131072) != 0 ? rcVivkeji.p_district : i20, (i33 & 262144) != 0 ? rcVivkeji.p_district_name : str42, (i33 & 524288) != 0 ? rcVivkeji.p_pincode : i21, (i33 & 1048576) != 0 ? rcVivkeji.p_state : str43, (i33 & 2097152) != 0 ? rcVivkeji.p_state_name : str44, (i33 & 4194304) != 0 ? rcVivkeji.pan_no : str45, (i33 & 8388608) != 0 ? rcVivkeji.passport_no : str46, (i33 & 16777216) != 0 ? rcVivkeji.permitDetailDto : permitDetailDto, (i33 & 33554432) != 0 ? rcVivkeji.permitDetailEntity : obj15, (i33 & 67108864) != 0 ? rcVivkeji.permit_rto_cd : obj16, (i33 & 134217728) != 0 ? rcVivkeji.purchase_date : obj17, (i33 & 268435456) != 0 ? rcVivkeji.purchase_dt : str47, (i33 & 536870912) != 0 ? rcVivkeji.ration_card_no : str48, (i33 & 1073741824) != 0 ? rcVivkeji.regn_dt : str49, (i33 & IntCompanionObject.MIN_VALUE) != 0 ? rcVivkeji.regn_dtAsDate : obj18, (i34 & 1) != 0 ? rcVivkeji.regn_no : str50, (i34 & 2) != 0 ? rcVivkeji.regn_type : str51, (i34 & 4) != 0 ? rcVivkeji.regn_type_descr : str52, (i34 & 8) != 0 ? rcVivkeji.regn_upto : str53, (i34 & 16) != 0 ? rcVivkeji.regn_uptoAsDate : obj19, (i34 & 32) != 0 ? rcVivkeji.returnMessge : obj20, (i34 & 64) != 0 ? rcVivkeji.sale_amt : i22, (i34 & 128) != 0 ? rcVivkeji.seat_cap : i23, (i34 & 256) != 0 ? rcVivkeji.sleeper_cap : i24, (i34 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? rcVivkeji.stand_cap : i25, (i34 & 1024) != 0 ? rcVivkeji.state_cd : str54, (i34 & 2048) != 0 ? rcVivkeji.state_name : str55, (i34 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? rcVivkeji.status : str56, (i34 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? rcVivkeji.tax_mode : str57, (i34 & 16384) != 0 ? rcVivkeji.transport_catg : obj21, (i34 & 32768) != 0 ? rcVivkeji.unld_wt : i26, (i34 & 65536) != 0 ? rcVivkeji.vch_catg : str58, (i34 & 131072) != 0 ? rcVivkeji.vch_catg_desc : obj22, (i34 & 262144) != 0 ? rcVivkeji.vch_purchase_as : str59, (i34 & 524288) != 0 ? rcVivkeji.vch_purchase_asCode : obj23, (i34 & 1048576) != 0 ? rcVivkeji.vehType : str60, (i34 & 2097152) != 0 ? rcVivkeji.vehTypeAsInt : i27, (i34 & 4194304) != 0 ? rcVivkeji.verified_on : j2, (i34 & 8388608) != 0 ? rcVivkeji.vh_class : i28, (16777216 & i34) != 0 ? rcVivkeji.vh_class_desc : str61, (i34 & 33554432) != 0 ? rcVivkeji.video_fitted : str62, (i34 & 67108864) != 0 ? rcVivkeji.voter_id : str63, (i34 & 134217728) != 0 ? rcVivkeji.vtInsuranceCommonDto : vtInsuranceCommonDtoX, (i34 & 268435456) != 0 ? rcVivkeji.vtpucc : vtpuccX, (i34 & 536870912) != 0 ? rcVivkeji.wheelbase : i29, (i34 & 1073741824) != 0 ? rcVivkeji.width : i30);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAadhar_no() {
        return this.aadhar_no;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getC_district() {
        return this.c_district;
    }

    /* JADX INFO: renamed from: component100, reason: from getter */
    public final String getRegn_upto() {
        return this.regn_upto;
    }

    /* JADX INFO: renamed from: component101, reason: from getter */
    public final Object getRegn_uptoAsDate() {
        return this.regn_uptoAsDate;
    }

    /* JADX INFO: renamed from: component102, reason: from getter */
    public final Object getReturnMessge() {
        return this.returnMessge;
    }

    /* JADX INFO: renamed from: component103, reason: from getter */
    public final int getSale_amt() {
        return this.sale_amt;
    }

    /* JADX INFO: renamed from: component104, reason: from getter */
    public final int getSeat_cap() {
        return this.seat_cap;
    }

    /* JADX INFO: renamed from: component105, reason: from getter */
    public final int getSleeper_cap() {
        return this.sleeper_cap;
    }

    /* JADX INFO: renamed from: component106, reason: from getter */
    public final int getStand_cap() {
        return this.stand_cap;
    }

    /* JADX INFO: renamed from: component107, reason: from getter */
    public final String getState_cd() {
        return this.state_cd;
    }

    /* JADX INFO: renamed from: component108, reason: from getter */
    public final String getState_name() {
        return this.state_name;
    }

    /* JADX INFO: renamed from: component109, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getC_district_name() {
        return this.c_district_name;
    }

    /* JADX INFO: renamed from: component110, reason: from getter */
    public final String getTax_mode() {
        return this.tax_mode;
    }

    /* JADX INFO: renamed from: component111, reason: from getter */
    public final Object getTransport_catg() {
        return this.transport_catg;
    }

    /* JADX INFO: renamed from: component112, reason: from getter */
    public final int getUnld_wt() {
        return this.unld_wt;
    }

    /* JADX INFO: renamed from: component113, reason: from getter */
    public final String getVch_catg() {
        return this.vch_catg;
    }

    /* JADX INFO: renamed from: component114, reason: from getter */
    public final Object getVch_catg_desc() {
        return this.vch_catg_desc;
    }

    /* JADX INFO: renamed from: component115, reason: from getter */
    public final String getVch_purchase_as() {
        return this.vch_purchase_as;
    }

    /* JADX INFO: renamed from: component116, reason: from getter */
    public final Object getVch_purchase_asCode() {
        return this.vch_purchase_asCode;
    }

    /* JADX INFO: renamed from: component117, reason: from getter */
    public final String getVehType() {
        return this.vehType;
    }

    /* JADX INFO: renamed from: component118, reason: from getter */
    public final int getVehTypeAsInt() {
        return this.vehTypeAsInt;
    }

    /* JADX INFO: renamed from: component119, reason: from getter */
    public final long getVerified_on() {
        return this.verified_on;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Object getC_off_cd() {
        return this.c_off_cd;
    }

    /* JADX INFO: renamed from: component120, reason: from getter */
    public final int getVh_class() {
        return this.vh_class;
    }

    /* JADX INFO: renamed from: component121, reason: from getter */
    public final String getVh_class_desc() {
        return this.vh_class_desc;
    }

    /* JADX INFO: renamed from: component122, reason: from getter */
    public final String getVideo_fitted() {
        return this.video_fitted;
    }

    /* JADX INFO: renamed from: component123, reason: from getter */
    public final String getVoter_id() {
        return this.voter_id;
    }

    /* JADX INFO: renamed from: component124, reason: from getter */
    public final VtInsuranceCommonDtoX getVtInsuranceCommonDto() {
        return this.vtInsuranceCommonDto;
    }

    /* JADX INFO: renamed from: component125, reason: from getter */
    public final VtpuccX getVtpucc() {
        return this.vtpucc;
    }

    /* JADX INFO: renamed from: component126, reason: from getter */
    public final int getWheelbase() {
        return this.wheelbase;
    }

    /* JADX INFO: renamed from: component127, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getC_pincode() {
        return this.c_pincode;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getC_state() {
        return this.c_state;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getC_state_name() {
        return this.c_state_name;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getChasi_no() {
        return this.chasi_no;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Object getChasi_no_original() {
        return this.chasi_no_original;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final boolean getConditionstatus() {
        return this.conditionstatus;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAc_fitted() {
        return this.ac_fitted;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final double getCubic_cap() {
        return this.cubic_cap;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getDealer_cd() {
        return this.dealer_cd;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final int getDept_cd() {
        return this.dept_cd;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Object getDlRequired() {
        return this.dlRequired;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Object getDlValidationRequired() {
        return this.dlValidationRequired;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getDl_no() {
        return this.dl_no;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getDlr_add1() {
        return this.dlr_add1;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getDlr_add2() {
        return this.dlr_add2;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getDlr_add3() {
        return this.dlr_add3;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getDlr_city() {
        return this.dlr_city;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getAnnual_income() {
        return this.annual_income;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getDlr_district() {
        return this.dlr_district;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getDlr_name() {
        return this.dlr_name;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getDlr_pincode() {
        return this.dlr_pincode;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getEmail_id() {
        return this.email_id;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final String getEng_no() {
        return this.eng_no;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final Object getEng_no_original() {
        return this.eng_no_original;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final Object getEng_no_orignal() {
        return this.eng_no_orignal;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final String getF_name() {
        return this.f_name;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final String getFit_upto() {
        return this.fit_upto;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final Object getFit_uptoAsDate() {
        return this.fit_uptoAsDate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAppl_no() {
        return this.appl_no;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final Object getFit_upto_desc() {
        return this.fit_upto_desc;
    }

    /* JADX INFO: renamed from: component41, reason: from getter */
    public final Object getFlag() {
        return this.flag;
    }

    /* JADX INFO: renamed from: component42, reason: from getter */
    public final double getFloor_area() {
        return this.floor_area;
    }

    /* JADX INFO: renamed from: component43, reason: from getter */
    public final Object getFormatRegn_dt() {
        return this.formatRegn_dt;
    }

    /* JADX INFO: renamed from: component44, reason: from getter */
    public final int getFuel() {
        return this.fuel;
    }

    /* JADX INFO: renamed from: component45, reason: from getter */
    public final String getFuel_descr() {
        return this.fuel_descr;
    }

    /* JADX INFO: renamed from: component46, reason: from getter */
    public final String getGarage_add() {
        return this.garage_add;
    }

    /* JADX INFO: renamed from: component47, reason: from getter */
    public final int getGcw() {
        return this.gcw;
    }

    /* JADX INFO: renamed from: component48, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component49, reason: from getter */
    public final double getHp() {
        return this.hp;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAudio_fitted() {
        return this.audio_fitted;
    }

    /* JADX INFO: renamed from: component50, reason: from getter */
    public final String getImported_vch() {
        return this.imported_vch;
    }

    /* JADX INFO: renamed from: component51, reason: from getter */
    public final String getLaser_code() {
        return this.laser_code;
    }

    /* JADX INFO: renamed from: component52, reason: from getter */
    public final Latesttaxdetails getLatesttaxdetails() {
        return this.latesttaxdetails;
    }

    /* JADX INFO: renamed from: component53, reason: from getter */
    public final int getLd_wt() {
        return this.ld_wt;
    }

    /* JADX INFO: renamed from: component54, reason: from getter */
    public final int getLength() {
        return this.length;
    }

    /* JADX INFO: renamed from: component55, reason: from getter */
    public final int getMaker() {
        return this.maker;
    }

    /* JADX INFO: renamed from: component56, reason: from getter */
    public final String getMaker_name() {
        return this.maker_name;
    }

    /* JADX INFO: renamed from: component57, reason: from getter */
    public final int getManu_mon() {
        return this.manu_mon;
    }

    /* JADX INFO: renamed from: component58, reason: from getter */
    public final int getManu_yr() {
        return this.manu_yr;
    }

    /* JADX INFO: renamed from: component59, reason: from getter */
    public final Object getMobileNoEditable() {
        return this.mobileNoEditable;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBody_type() {
        return this.body_type;
    }

    /* JADX INFO: renamed from: component60, reason: from getter */
    public final long getMobile_no() {
        return this.mobile_no;
    }

    /* JADX INFO: renamed from: component61, reason: from getter */
    public final String getModel_cd() {
        return this.model_cd;
    }

    /* JADX INFO: renamed from: component62, reason: from getter */
    public final String getModel_name() {
        return this.model_name;
    }

    /* JADX INFO: renamed from: component63, reason: from getter */
    public final int getNo_cyl() {
        return this.no_cyl;
    }

    /* JADX INFO: renamed from: component64, reason: from getter */
    public final Object getNo_of_axles() {
        return this.no_of_axles;
    }

    /* JADX INFO: renamed from: component65, reason: from getter */
    public final int getNorms() {
        return this.norms;
    }

    /* JADX INFO: renamed from: component66, reason: from getter */
    public final String getNorms_descr() {
        return this.norms_descr;
    }

    /* JADX INFO: renamed from: component67, reason: from getter */
    public final Object getNumberOfTyres() {
        return this.numberOfTyres;
    }

    /* JADX INFO: renamed from: component68, reason: from getter */
    public final int getOff_cd() {
        return this.off_cd;
    }

    /* JADX INFO: renamed from: component69, reason: from getter */
    public final String getOff_name() {
        return this.off_name;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getC_add1() {
        return this.c_add1;
    }

    /* JADX INFO: renamed from: component70, reason: from getter */
    public final String getOp_dt() {
        return this.op_dt;
    }

    /* JADX INFO: renamed from: component71, reason: from getter */
    public final int getOther_criteria() {
        return this.other_criteria;
    }

    /* JADX INFO: renamed from: component72, reason: from getter */
    public final Object getOwnerCatg() {
        return this.ownerCatg;
    }

    /* JADX INFO: renamed from: component73, reason: from getter */
    public final OwnerIdentificationX getOwnerIdentification() {
        return this.ownerIdentification;
    }

    /* JADX INFO: renamed from: component74, reason: from getter */
    public final int getOwner_cd() {
        return this.owner_cd;
    }

    /* JADX INFO: renamed from: component75, reason: from getter */
    public final String getOwner_cd_descr() {
        return this.owner_cd_descr;
    }

    /* JADX INFO: renamed from: component76, reason: from getter */
    public final int getOwner_ctg() {
        return this.owner_ctg;
    }

    /* JADX INFO: renamed from: component77, reason: from getter */
    public final String getOwner_name() {
        return this.owner_name;
    }

    /* JADX INFO: renamed from: component78, reason: from getter */
    public final int getOwner_sr() {
        return this.owner_sr;
    }

    /* JADX INFO: renamed from: component79, reason: from getter */
    public final String getP_add1() {
        return this.p_add1;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getC_add2() {
        return this.c_add2;
    }

    /* JADX INFO: renamed from: component80, reason: from getter */
    public final String getP_add2() {
        return this.p_add2;
    }

    /* JADX INFO: renamed from: component81, reason: from getter */
    public final String getP_add3() {
        return this.p_add3;
    }

    /* JADX INFO: renamed from: component82, reason: from getter */
    public final int getP_district() {
        return this.p_district;
    }

    /* JADX INFO: renamed from: component83, reason: from getter */
    public final String getP_district_name() {
        return this.p_district_name;
    }

    /* JADX INFO: renamed from: component84, reason: from getter */
    public final int getP_pincode() {
        return this.p_pincode;
    }

    /* JADX INFO: renamed from: component85, reason: from getter */
    public final String getP_state() {
        return this.p_state;
    }

    /* JADX INFO: renamed from: component86, reason: from getter */
    public final String getP_state_name() {
        return this.p_state_name;
    }

    /* JADX INFO: renamed from: component87, reason: from getter */
    public final String getPan_no() {
        return this.pan_no;
    }

    /* JADX INFO: renamed from: component88, reason: from getter */
    public final String getPassport_no() {
        return this.passport_no;
    }

    /* JADX INFO: renamed from: component89, reason: from getter */
    public final PermitDetailDto getPermitDetailDto() {
        return this.permitDetailDto;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getC_add3() {
        return this.c_add3;
    }

    /* JADX INFO: renamed from: component90, reason: from getter */
    public final Object getPermitDetailEntity() {
        return this.permitDetailEntity;
    }

    /* JADX INFO: renamed from: component91, reason: from getter */
    public final Object getPermit_rto_cd() {
        return this.permit_rto_cd;
    }

    /* JADX INFO: renamed from: component92, reason: from getter */
    public final Object getPurchase_date() {
        return this.purchase_date;
    }

    /* JADX INFO: renamed from: component93, reason: from getter */
    public final String getPurchase_dt() {
        return this.purchase_dt;
    }

    /* JADX INFO: renamed from: component94, reason: from getter */
    public final String getRation_card_no() {
        return this.ration_card_no;
    }

    /* JADX INFO: renamed from: component95, reason: from getter */
    public final String getRegn_dt() {
        return this.regn_dt;
    }

    /* JADX INFO: renamed from: component96, reason: from getter */
    public final Object getRegn_dtAsDate() {
        return this.regn_dtAsDate;
    }

    /* JADX INFO: renamed from: component97, reason: from getter */
    public final String getRegn_no() {
        return this.regn_no;
    }

    /* JADX INFO: renamed from: component98, reason: from getter */
    public final String getRegn_type() {
        return this.regn_type;
    }

    /* JADX INFO: renamed from: component99, reason: from getter */
    public final String getRegn_type_descr() {
        return this.regn_type_descr;
    }

    public final RcVivkeji copy(String aadhar_no, String ac_fitted, int annual_income, String appl_no, String audio_fitted, String body_type, String c_add1, String c_add2, String c_add3, int c_district, String c_district_name, Object c_off_cd, int c_pincode, String c_state, String c_state_name, String chasi_no, Object chasi_no_original, String color, boolean conditionstatus, double cubic_cap, String dealer_cd, int dept_cd, Object dlRequired, Object dlValidationRequired, String dl_no, String dlr_add1, String dlr_add2, String dlr_add3, String dlr_city, String dlr_district, String dlr_name, String dlr_pincode, String email_id, String eng_no, Object eng_no_original, Object eng_no_orignal, String f_name, String fit_upto, Object fit_uptoAsDate, Object fit_upto_desc, Object flag, double floor_area, Object formatRegn_dt, int fuel, String fuel_descr, String garage_add, int gcw, int height, double hp, String imported_vch, String laser_code, Latesttaxdetails latesttaxdetails, int ld_wt, int length, int maker, String maker_name, int manu_mon, int manu_yr, Object mobileNoEditable, long mobile_no, String model_cd, String model_name, int no_cyl, Object no_of_axles, int norms, String norms_descr, Object numberOfTyres, int off_cd, String off_name, String op_dt, int other_criteria, Object ownerCatg, OwnerIdentificationX ownerIdentification, int owner_cd, String owner_cd_descr, int owner_ctg, String owner_name, int owner_sr, String p_add1, String p_add2, String p_add3, int p_district, String p_district_name, int p_pincode, String p_state, String p_state_name, String pan_no, String passport_no, PermitDetailDto permitDetailDto, Object permitDetailEntity, Object permit_rto_cd, Object purchase_date, String purchase_dt, String ration_card_no, String regn_dt, Object regn_dtAsDate, String regn_no, String regn_type, String regn_type_descr, String regn_upto, Object regn_uptoAsDate, Object returnMessge, int sale_amt, int seat_cap, int sleeper_cap, int stand_cap, String state_cd, String state_name, String status, String tax_mode, Object transport_catg, int unld_wt, String vch_catg, Object vch_catg_desc, String vch_purchase_as, Object vch_purchase_asCode, String vehType, int vehTypeAsInt, long verified_on, int vh_class, String vh_class_desc, String video_fitted, String voter_id, VtInsuranceCommonDtoX vtInsuranceCommonDto, VtpuccX vtpucc, int wheelbase, int width) {
        Intrinsics.checkNotNullParameter(aadhar_no, "aadhar_no");
        Intrinsics.checkNotNullParameter(ac_fitted, "ac_fitted");
        Intrinsics.checkNotNullParameter(appl_no, "appl_no");
        Intrinsics.checkNotNullParameter(audio_fitted, "audio_fitted");
        Intrinsics.checkNotNullParameter(body_type, "body_type");
        Intrinsics.checkNotNullParameter(c_add1, "c_add1");
        Intrinsics.checkNotNullParameter(c_add2, "c_add2");
        Intrinsics.checkNotNullParameter(c_add3, "c_add3");
        Intrinsics.checkNotNullParameter(c_district_name, "c_district_name");
        Intrinsics.checkNotNullParameter(c_off_cd, "c_off_cd");
        Intrinsics.checkNotNullParameter(c_state, "c_state");
        Intrinsics.checkNotNullParameter(c_state_name, "c_state_name");
        Intrinsics.checkNotNullParameter(chasi_no, "chasi_no");
        Intrinsics.checkNotNullParameter(chasi_no_original, "chasi_no_original");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(dealer_cd, "dealer_cd");
        Intrinsics.checkNotNullParameter(dlRequired, "dlRequired");
        Intrinsics.checkNotNullParameter(dlValidationRequired, "dlValidationRequired");
        Intrinsics.checkNotNullParameter(dl_no, "dl_no");
        Intrinsics.checkNotNullParameter(dlr_add1, "dlr_add1");
        Intrinsics.checkNotNullParameter(dlr_add2, "dlr_add2");
        Intrinsics.checkNotNullParameter(dlr_add3, "dlr_add3");
        Intrinsics.checkNotNullParameter(dlr_city, "dlr_city");
        Intrinsics.checkNotNullParameter(dlr_district, "dlr_district");
        Intrinsics.checkNotNullParameter(dlr_name, "dlr_name");
        Intrinsics.checkNotNullParameter(dlr_pincode, "dlr_pincode");
        Intrinsics.checkNotNullParameter(email_id, "email_id");
        Intrinsics.checkNotNullParameter(eng_no, "eng_no");
        Intrinsics.checkNotNullParameter(eng_no_original, "eng_no_original");
        Intrinsics.checkNotNullParameter(eng_no_orignal, "eng_no_orignal");
        Intrinsics.checkNotNullParameter(f_name, "f_name");
        Intrinsics.checkNotNullParameter(fit_upto, "fit_upto");
        Intrinsics.checkNotNullParameter(fit_uptoAsDate, "fit_uptoAsDate");
        Intrinsics.checkNotNullParameter(fit_upto_desc, "fit_upto_desc");
        Intrinsics.checkNotNullParameter(flag, "flag");
        Intrinsics.checkNotNullParameter(formatRegn_dt, "formatRegn_dt");
        Intrinsics.checkNotNullParameter(fuel_descr, "fuel_descr");
        Intrinsics.checkNotNullParameter(garage_add, "garage_add");
        Intrinsics.checkNotNullParameter(imported_vch, "imported_vch");
        Intrinsics.checkNotNullParameter(laser_code, "laser_code");
        Intrinsics.checkNotNullParameter(latesttaxdetails, "latesttaxdetails");
        Intrinsics.checkNotNullParameter(maker_name, "maker_name");
        Intrinsics.checkNotNullParameter(mobileNoEditable, "mobileNoEditable");
        Intrinsics.checkNotNullParameter(model_cd, "model_cd");
        Intrinsics.checkNotNullParameter(model_name, "model_name");
        Intrinsics.checkNotNullParameter(no_of_axles, "no_of_axles");
        Intrinsics.checkNotNullParameter(norms_descr, "norms_descr");
        Intrinsics.checkNotNullParameter(numberOfTyres, "numberOfTyres");
        Intrinsics.checkNotNullParameter(off_name, "off_name");
        Intrinsics.checkNotNullParameter(op_dt, "op_dt");
        Intrinsics.checkNotNullParameter(ownerCatg, "ownerCatg");
        Intrinsics.checkNotNullParameter(ownerIdentification, "ownerIdentification");
        Intrinsics.checkNotNullParameter(owner_cd_descr, "owner_cd_descr");
        Intrinsics.checkNotNullParameter(owner_name, "owner_name");
        Intrinsics.checkNotNullParameter(p_add1, "p_add1");
        Intrinsics.checkNotNullParameter(p_add2, "p_add2");
        Intrinsics.checkNotNullParameter(p_add3, "p_add3");
        Intrinsics.checkNotNullParameter(p_district_name, "p_district_name");
        Intrinsics.checkNotNullParameter(p_state, "p_state");
        Intrinsics.checkNotNullParameter(p_state_name, "p_state_name");
        Intrinsics.checkNotNullParameter(pan_no, "pan_no");
        Intrinsics.checkNotNullParameter(passport_no, "passport_no");
        Intrinsics.checkNotNullParameter(permitDetailDto, "permitDetailDto");
        Intrinsics.checkNotNullParameter(permitDetailEntity, "permitDetailEntity");
        Intrinsics.checkNotNullParameter(permit_rto_cd, "permit_rto_cd");
        Intrinsics.checkNotNullParameter(purchase_date, "purchase_date");
        Intrinsics.checkNotNullParameter(purchase_dt, "purchase_dt");
        Intrinsics.checkNotNullParameter(ration_card_no, "ration_card_no");
        Intrinsics.checkNotNullParameter(regn_dt, "regn_dt");
        Intrinsics.checkNotNullParameter(regn_dtAsDate, "regn_dtAsDate");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(regn_type, "regn_type");
        Intrinsics.checkNotNullParameter(regn_type_descr, "regn_type_descr");
        Intrinsics.checkNotNullParameter(regn_upto, "regn_upto");
        Intrinsics.checkNotNullParameter(regn_uptoAsDate, "regn_uptoAsDate");
        Intrinsics.checkNotNullParameter(returnMessge, "returnMessge");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(state_name, "state_name");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(tax_mode, "tax_mode");
        Intrinsics.checkNotNullParameter(transport_catg, "transport_catg");
        Intrinsics.checkNotNullParameter(vch_catg, "vch_catg");
        Intrinsics.checkNotNullParameter(vch_catg_desc, "vch_catg_desc");
        Intrinsics.checkNotNullParameter(vch_purchase_as, "vch_purchase_as");
        Intrinsics.checkNotNullParameter(vch_purchase_asCode, "vch_purchase_asCode");
        Intrinsics.checkNotNullParameter(vehType, "vehType");
        Intrinsics.checkNotNullParameter(vh_class_desc, "vh_class_desc");
        Intrinsics.checkNotNullParameter(video_fitted, "video_fitted");
        Intrinsics.checkNotNullParameter(voter_id, "voter_id");
        Intrinsics.checkNotNullParameter(vtInsuranceCommonDto, "vtInsuranceCommonDto");
        Intrinsics.checkNotNullParameter(vtpucc, "vtpucc");
        return new RcVivkeji(aadhar_no, ac_fitted, annual_income, appl_no, audio_fitted, body_type, c_add1, c_add2, c_add3, c_district, c_district_name, c_off_cd, c_pincode, c_state, c_state_name, chasi_no, chasi_no_original, color, conditionstatus, cubic_cap, dealer_cd, dept_cd, dlRequired, dlValidationRequired, dl_no, dlr_add1, dlr_add2, dlr_add3, dlr_city, dlr_district, dlr_name, dlr_pincode, email_id, eng_no, eng_no_original, eng_no_orignal, f_name, fit_upto, fit_uptoAsDate, fit_upto_desc, flag, floor_area, formatRegn_dt, fuel, fuel_descr, garage_add, gcw, height, hp, imported_vch, laser_code, latesttaxdetails, ld_wt, length, maker, maker_name, manu_mon, manu_yr, mobileNoEditable, mobile_no, model_cd, model_name, no_cyl, no_of_axles, norms, norms_descr, numberOfTyres, off_cd, off_name, op_dt, other_criteria, ownerCatg, ownerIdentification, owner_cd, owner_cd_descr, owner_ctg, owner_name, owner_sr, p_add1, p_add2, p_add3, p_district, p_district_name, p_pincode, p_state, p_state_name, pan_no, passport_no, permitDetailDto, permitDetailEntity, permit_rto_cd, purchase_date, purchase_dt, ration_card_no, regn_dt, regn_dtAsDate, regn_no, regn_type, regn_type_descr, regn_upto, regn_uptoAsDate, returnMessge, sale_amt, seat_cap, sleeper_cap, stand_cap, state_cd, state_name, status, tax_mode, transport_catg, unld_wt, vch_catg, vch_catg_desc, vch_purchase_as, vch_purchase_asCode, vehType, vehTypeAsInt, verified_on, vh_class, vh_class_desc, video_fitted, voter_id, vtInsuranceCommonDto, vtpucc, wheelbase, width);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RcVivkeji)) {
            return false;
        }
        RcVivkeji rcVivkeji = (RcVivkeji) other;
        return Intrinsics.areEqual(this.aadhar_no, rcVivkeji.aadhar_no) && Intrinsics.areEqual(this.ac_fitted, rcVivkeji.ac_fitted) && this.annual_income == rcVivkeji.annual_income && Intrinsics.areEqual(this.appl_no, rcVivkeji.appl_no) && Intrinsics.areEqual(this.audio_fitted, rcVivkeji.audio_fitted) && Intrinsics.areEqual(this.body_type, rcVivkeji.body_type) && Intrinsics.areEqual(this.c_add1, rcVivkeji.c_add1) && Intrinsics.areEqual(this.c_add2, rcVivkeji.c_add2) && Intrinsics.areEqual(this.c_add3, rcVivkeji.c_add3) && this.c_district == rcVivkeji.c_district && Intrinsics.areEqual(this.c_district_name, rcVivkeji.c_district_name) && Intrinsics.areEqual(this.c_off_cd, rcVivkeji.c_off_cd) && this.c_pincode == rcVivkeji.c_pincode && Intrinsics.areEqual(this.c_state, rcVivkeji.c_state) && Intrinsics.areEqual(this.c_state_name, rcVivkeji.c_state_name) && Intrinsics.areEqual(this.chasi_no, rcVivkeji.chasi_no) && Intrinsics.areEqual(this.chasi_no_original, rcVivkeji.chasi_no_original) && Intrinsics.areEqual(this.color, rcVivkeji.color) && this.conditionstatus == rcVivkeji.conditionstatus && Double.compare(this.cubic_cap, rcVivkeji.cubic_cap) == 0 && Intrinsics.areEqual(this.dealer_cd, rcVivkeji.dealer_cd) && this.dept_cd == rcVivkeji.dept_cd && Intrinsics.areEqual(this.dlRequired, rcVivkeji.dlRequired) && Intrinsics.areEqual(this.dlValidationRequired, rcVivkeji.dlValidationRequired) && Intrinsics.areEqual(this.dl_no, rcVivkeji.dl_no) && Intrinsics.areEqual(this.dlr_add1, rcVivkeji.dlr_add1) && Intrinsics.areEqual(this.dlr_add2, rcVivkeji.dlr_add2) && Intrinsics.areEqual(this.dlr_add3, rcVivkeji.dlr_add3) && Intrinsics.areEqual(this.dlr_city, rcVivkeji.dlr_city) && Intrinsics.areEqual(this.dlr_district, rcVivkeji.dlr_district) && Intrinsics.areEqual(this.dlr_name, rcVivkeji.dlr_name) && Intrinsics.areEqual(this.dlr_pincode, rcVivkeji.dlr_pincode) && Intrinsics.areEqual(this.email_id, rcVivkeji.email_id) && Intrinsics.areEqual(this.eng_no, rcVivkeji.eng_no) && Intrinsics.areEqual(this.eng_no_original, rcVivkeji.eng_no_original) && Intrinsics.areEqual(this.eng_no_orignal, rcVivkeji.eng_no_orignal) && Intrinsics.areEqual(this.f_name, rcVivkeji.f_name) && Intrinsics.areEqual(this.fit_upto, rcVivkeji.fit_upto) && Intrinsics.areEqual(this.fit_uptoAsDate, rcVivkeji.fit_uptoAsDate) && Intrinsics.areEqual(this.fit_upto_desc, rcVivkeji.fit_upto_desc) && Intrinsics.areEqual(this.flag, rcVivkeji.flag) && Double.compare(this.floor_area, rcVivkeji.floor_area) == 0 && Intrinsics.areEqual(this.formatRegn_dt, rcVivkeji.formatRegn_dt) && this.fuel == rcVivkeji.fuel && Intrinsics.areEqual(this.fuel_descr, rcVivkeji.fuel_descr) && Intrinsics.areEqual(this.garage_add, rcVivkeji.garage_add) && this.gcw == rcVivkeji.gcw && this.height == rcVivkeji.height && Double.compare(this.hp, rcVivkeji.hp) == 0 && Intrinsics.areEqual(this.imported_vch, rcVivkeji.imported_vch) && Intrinsics.areEqual(this.laser_code, rcVivkeji.laser_code) && Intrinsics.areEqual(this.latesttaxdetails, rcVivkeji.latesttaxdetails) && this.ld_wt == rcVivkeji.ld_wt && this.length == rcVivkeji.length && this.maker == rcVivkeji.maker && Intrinsics.areEqual(this.maker_name, rcVivkeji.maker_name) && this.manu_mon == rcVivkeji.manu_mon && this.manu_yr == rcVivkeji.manu_yr && Intrinsics.areEqual(this.mobileNoEditable, rcVivkeji.mobileNoEditable) && this.mobile_no == rcVivkeji.mobile_no && Intrinsics.areEqual(this.model_cd, rcVivkeji.model_cd) && Intrinsics.areEqual(this.model_name, rcVivkeji.model_name) && this.no_cyl == rcVivkeji.no_cyl && Intrinsics.areEqual(this.no_of_axles, rcVivkeji.no_of_axles) && this.norms == rcVivkeji.norms && Intrinsics.areEqual(this.norms_descr, rcVivkeji.norms_descr) && Intrinsics.areEqual(this.numberOfTyres, rcVivkeji.numberOfTyres) && this.off_cd == rcVivkeji.off_cd && Intrinsics.areEqual(this.off_name, rcVivkeji.off_name) && Intrinsics.areEqual(this.op_dt, rcVivkeji.op_dt) && this.other_criteria == rcVivkeji.other_criteria && Intrinsics.areEqual(this.ownerCatg, rcVivkeji.ownerCatg) && Intrinsics.areEqual(this.ownerIdentification, rcVivkeji.ownerIdentification) && this.owner_cd == rcVivkeji.owner_cd && Intrinsics.areEqual(this.owner_cd_descr, rcVivkeji.owner_cd_descr) && this.owner_ctg == rcVivkeji.owner_ctg && Intrinsics.areEqual(this.owner_name, rcVivkeji.owner_name) && this.owner_sr == rcVivkeji.owner_sr && Intrinsics.areEqual(this.p_add1, rcVivkeji.p_add1) && Intrinsics.areEqual(this.p_add2, rcVivkeji.p_add2) && Intrinsics.areEqual(this.p_add3, rcVivkeji.p_add3) && this.p_district == rcVivkeji.p_district && Intrinsics.areEqual(this.p_district_name, rcVivkeji.p_district_name) && this.p_pincode == rcVivkeji.p_pincode && Intrinsics.areEqual(this.p_state, rcVivkeji.p_state) && Intrinsics.areEqual(this.p_state_name, rcVivkeji.p_state_name) && Intrinsics.areEqual(this.pan_no, rcVivkeji.pan_no) && Intrinsics.areEqual(this.passport_no, rcVivkeji.passport_no) && Intrinsics.areEqual(this.permitDetailDto, rcVivkeji.permitDetailDto) && Intrinsics.areEqual(this.permitDetailEntity, rcVivkeji.permitDetailEntity) && Intrinsics.areEqual(this.permit_rto_cd, rcVivkeji.permit_rto_cd) && Intrinsics.areEqual(this.purchase_date, rcVivkeji.purchase_date) && Intrinsics.areEqual(this.purchase_dt, rcVivkeji.purchase_dt) && Intrinsics.areEqual(this.ration_card_no, rcVivkeji.ration_card_no) && Intrinsics.areEqual(this.regn_dt, rcVivkeji.regn_dt) && Intrinsics.areEqual(this.regn_dtAsDate, rcVivkeji.regn_dtAsDate) && Intrinsics.areEqual(this.regn_no, rcVivkeji.regn_no) && Intrinsics.areEqual(this.regn_type, rcVivkeji.regn_type) && Intrinsics.areEqual(this.regn_type_descr, rcVivkeji.regn_type_descr) && Intrinsics.areEqual(this.regn_upto, rcVivkeji.regn_upto) && Intrinsics.areEqual(this.regn_uptoAsDate, rcVivkeji.regn_uptoAsDate) && Intrinsics.areEqual(this.returnMessge, rcVivkeji.returnMessge) && this.sale_amt == rcVivkeji.sale_amt && this.seat_cap == rcVivkeji.seat_cap && this.sleeper_cap == rcVivkeji.sleeper_cap && this.stand_cap == rcVivkeji.stand_cap && Intrinsics.areEqual(this.state_cd, rcVivkeji.state_cd) && Intrinsics.areEqual(this.state_name, rcVivkeji.state_name) && Intrinsics.areEqual(this.status, rcVivkeji.status) && Intrinsics.areEqual(this.tax_mode, rcVivkeji.tax_mode) && Intrinsics.areEqual(this.transport_catg, rcVivkeji.transport_catg) && this.unld_wt == rcVivkeji.unld_wt && Intrinsics.areEqual(this.vch_catg, rcVivkeji.vch_catg) && Intrinsics.areEqual(this.vch_catg_desc, rcVivkeji.vch_catg_desc) && Intrinsics.areEqual(this.vch_purchase_as, rcVivkeji.vch_purchase_as) && Intrinsics.areEqual(this.vch_purchase_asCode, rcVivkeji.vch_purchase_asCode) && Intrinsics.areEqual(this.vehType, rcVivkeji.vehType) && this.vehTypeAsInt == rcVivkeji.vehTypeAsInt && this.verified_on == rcVivkeji.verified_on && this.vh_class == rcVivkeji.vh_class && Intrinsics.areEqual(this.vh_class_desc, rcVivkeji.vh_class_desc) && Intrinsics.areEqual(this.video_fitted, rcVivkeji.video_fitted) && Intrinsics.areEqual(this.voter_id, rcVivkeji.voter_id) && Intrinsics.areEqual(this.vtInsuranceCommonDto, rcVivkeji.vtInsuranceCommonDto) && Intrinsics.areEqual(this.vtpucc, rcVivkeji.vtpucc) && this.wheelbase == rcVivkeji.wheelbase && this.width == rcVivkeji.width;
    }

    public final String getAadhar_no() {
        return this.aadhar_no;
    }

    public final String getAc_fitted() {
        return this.ac_fitted;
    }

    public final int getAnnual_income() {
        return this.annual_income;
    }

    public final String getAppl_no() {
        return this.appl_no;
    }

    public final String getAudio_fitted() {
        return this.audio_fitted;
    }

    public final String getBody_type() {
        return this.body_type;
    }

    public final String getC_add1() {
        return this.c_add1;
    }

    public final String getC_add2() {
        return this.c_add2;
    }

    public final String getC_add3() {
        return this.c_add3;
    }

    public final int getC_district() {
        return this.c_district;
    }

    public final String getC_district_name() {
        return this.c_district_name;
    }

    public final Object getC_off_cd() {
        return this.c_off_cd;
    }

    public final int getC_pincode() {
        return this.c_pincode;
    }

    public final String getC_state() {
        return this.c_state;
    }

    public final String getC_state_name() {
        return this.c_state_name;
    }

    public final String getChasi_no() {
        return this.chasi_no;
    }

    public final Object getChasi_no_original() {
        return this.chasi_no_original;
    }

    public final String getColor() {
        return this.color;
    }

    public final boolean getConditionstatus() {
        return this.conditionstatus;
    }

    public final double getCubic_cap() {
        return this.cubic_cap;
    }

    public final String getDealer_cd() {
        return this.dealer_cd;
    }

    public final int getDept_cd() {
        return this.dept_cd;
    }

    public final Object getDlRequired() {
        return this.dlRequired;
    }

    public final Object getDlValidationRequired() {
        return this.dlValidationRequired;
    }

    public final String getDl_no() {
        return this.dl_no;
    }

    public final String getDlr_add1() {
        return this.dlr_add1;
    }

    public final String getDlr_add2() {
        return this.dlr_add2;
    }

    public final String getDlr_add3() {
        return this.dlr_add3;
    }

    public final String getDlr_city() {
        return this.dlr_city;
    }

    public final String getDlr_district() {
        return this.dlr_district;
    }

    public final String getDlr_name() {
        return this.dlr_name;
    }

    public final String getDlr_pincode() {
        return this.dlr_pincode;
    }

    public final String getEmail_id() {
        return this.email_id;
    }

    public final String getEng_no() {
        return this.eng_no;
    }

    public final Object getEng_no_original() {
        return this.eng_no_original;
    }

    public final Object getEng_no_orignal() {
        return this.eng_no_orignal;
    }

    public final String getF_name() {
        return this.f_name;
    }

    public final String getFit_upto() {
        return this.fit_upto;
    }

    public final Object getFit_uptoAsDate() {
        return this.fit_uptoAsDate;
    }

    public final Object getFit_upto_desc() {
        return this.fit_upto_desc;
    }

    public final Object getFlag() {
        return this.flag;
    }

    public final double getFloor_area() {
        return this.floor_area;
    }

    public final Object getFormatRegn_dt() {
        return this.formatRegn_dt;
    }

    public final int getFuel() {
        return this.fuel;
    }

    public final String getFuel_descr() {
        return this.fuel_descr;
    }

    public final String getGarage_add() {
        return this.garage_add;
    }

    public final int getGcw() {
        return this.gcw;
    }

    public final int getHeight() {
        return this.height;
    }

    public final double getHp() {
        return this.hp;
    }

    public final String getImported_vch() {
        return this.imported_vch;
    }

    public final String getLaser_code() {
        return this.laser_code;
    }

    public final Latesttaxdetails getLatesttaxdetails() {
        return this.latesttaxdetails;
    }

    public final int getLd_wt() {
        return this.ld_wt;
    }

    public final int getLength() {
        return this.length;
    }

    public final int getMaker() {
        return this.maker;
    }

    public final String getMaker_name() {
        return this.maker_name;
    }

    public final int getManu_mon() {
        return this.manu_mon;
    }

    public final int getManu_yr() {
        return this.manu_yr;
    }

    public final Object getMobileNoEditable() {
        return this.mobileNoEditable;
    }

    public final long getMobile_no() {
        return this.mobile_no;
    }

    public final String getModel_cd() {
        return this.model_cd;
    }

    public final String getModel_name() {
        return this.model_name;
    }

    public final int getNo_cyl() {
        return this.no_cyl;
    }

    public final Object getNo_of_axles() {
        return this.no_of_axles;
    }

    public final int getNorms() {
        return this.norms;
    }

    public final String getNorms_descr() {
        return this.norms_descr;
    }

    public final Object getNumberOfTyres() {
        return this.numberOfTyres;
    }

    public final int getOff_cd() {
        return this.off_cd;
    }

    public final String getOff_name() {
        return this.off_name;
    }

    public final String getOp_dt() {
        return this.op_dt;
    }

    public final int getOther_criteria() {
        return this.other_criteria;
    }

    public final Object getOwnerCatg() {
        return this.ownerCatg;
    }

    public final OwnerIdentificationX getOwnerIdentification() {
        return this.ownerIdentification;
    }

    public final int getOwner_cd() {
        return this.owner_cd;
    }

    public final String getOwner_cd_descr() {
        return this.owner_cd_descr;
    }

    public final int getOwner_ctg() {
        return this.owner_ctg;
    }

    public final String getOwner_name() {
        return this.owner_name;
    }

    public final int getOwner_sr() {
        return this.owner_sr;
    }

    public final String getP_add1() {
        return this.p_add1;
    }

    public final String getP_add2() {
        return this.p_add2;
    }

    public final String getP_add3() {
        return this.p_add3;
    }

    public final int getP_district() {
        return this.p_district;
    }

    public final String getP_district_name() {
        return this.p_district_name;
    }

    public final int getP_pincode() {
        return this.p_pincode;
    }

    public final String getP_state() {
        return this.p_state;
    }

    public final String getP_state_name() {
        return this.p_state_name;
    }

    public final String getPan_no() {
        return this.pan_no;
    }

    public final String getPassport_no() {
        return this.passport_no;
    }

    public final PermitDetailDto getPermitDetailDto() {
        return this.permitDetailDto;
    }

    public final Object getPermitDetailEntity() {
        return this.permitDetailEntity;
    }

    public final Object getPermit_rto_cd() {
        return this.permit_rto_cd;
    }

    public final Object getPurchase_date() {
        return this.purchase_date;
    }

    public final String getPurchase_dt() {
        return this.purchase_dt;
    }

    public final String getRation_card_no() {
        return this.ration_card_no;
    }

    public final String getRegn_dt() {
        return this.regn_dt;
    }

    public final Object getRegn_dtAsDate() {
        return this.regn_dtAsDate;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final String getRegn_type() {
        return this.regn_type;
    }

    public final String getRegn_type_descr() {
        return this.regn_type_descr;
    }

    public final String getRegn_upto() {
        return this.regn_upto;
    }

    public final Object getRegn_uptoAsDate() {
        return this.regn_uptoAsDate;
    }

    public final Object getReturnMessge() {
        return this.returnMessge;
    }

    public final int getSale_amt() {
        return this.sale_amt;
    }

    public final int getSeat_cap() {
        return this.seat_cap;
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

    public final String getState_name() {
        return this.state_name;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTax_mode() {
        return this.tax_mode;
    }

    public final Object getTransport_catg() {
        return this.transport_catg;
    }

    public final int getUnld_wt() {
        return this.unld_wt;
    }

    public final String getVch_catg() {
        return this.vch_catg;
    }

    public final Object getVch_catg_desc() {
        return this.vch_catg_desc;
    }

    public final String getVch_purchase_as() {
        return this.vch_purchase_as;
    }

    public final Object getVch_purchase_asCode() {
        return this.vch_purchase_asCode;
    }

    public final String getVehType() {
        return this.vehType;
    }

    public final int getVehTypeAsInt() {
        return this.vehTypeAsInt;
    }

    public final long getVerified_on() {
        return this.verified_on;
    }

    public final int getVh_class() {
        return this.vh_class;
    }

    public final String getVh_class_desc() {
        return this.vh_class_desc;
    }

    public final String getVideo_fitted() {
        return this.video_fitted;
    }

    public final String getVoter_id() {
        return this.voter_id;
    }

    public final VtInsuranceCommonDtoX getVtInsuranceCommonDto() {
        return this.vtInsuranceCommonDto;
    }

    public final VtpuccX getVtpucc() {
        return this.vtpucc;
    }

    public final int getWheelbase() {
        return this.wheelbase;
    }

    public final int getWidth() {
        return this.width;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v252 */
    /* JADX WARN: Type inference failed for: r1v253 */
    /* JADX WARN: Type inference failed for: r1v35, types: [int] */
    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((((this.aadhar_no.hashCode() * 31) + this.ac_fitted.hashCode()) * 31) + Integer.hashCode(this.annual_income)) * 31) + this.appl_no.hashCode()) * 31) + this.audio_fitted.hashCode()) * 31) + this.body_type.hashCode()) * 31) + this.c_add1.hashCode()) * 31) + this.c_add2.hashCode()) * 31) + this.c_add3.hashCode()) * 31) + Integer.hashCode(this.c_district)) * 31) + this.c_district_name.hashCode()) * 31) + this.c_off_cd.hashCode()) * 31) + Integer.hashCode(this.c_pincode)) * 31) + this.c_state.hashCode()) * 31) + this.c_state_name.hashCode()) * 31) + this.chasi_no.hashCode()) * 31) + this.chasi_no_original.hashCode()) * 31) + this.color.hashCode()) * 31;
        boolean z = this.conditionstatus;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode + r1) * 31) + Double.hashCode(this.cubic_cap)) * 31) + this.dealer_cd.hashCode()) * 31) + Integer.hashCode(this.dept_cd)) * 31) + this.dlRequired.hashCode()) * 31) + this.dlValidationRequired.hashCode()) * 31) + this.dl_no.hashCode()) * 31) + this.dlr_add1.hashCode()) * 31) + this.dlr_add2.hashCode()) * 31) + this.dlr_add3.hashCode()) * 31) + this.dlr_city.hashCode()) * 31) + this.dlr_district.hashCode()) * 31) + this.dlr_name.hashCode()) * 31) + this.dlr_pincode.hashCode()) * 31) + this.email_id.hashCode()) * 31) + this.eng_no.hashCode()) * 31) + this.eng_no_original.hashCode()) * 31) + this.eng_no_orignal.hashCode()) * 31) + this.f_name.hashCode()) * 31) + this.fit_upto.hashCode()) * 31) + this.fit_uptoAsDate.hashCode()) * 31) + this.fit_upto_desc.hashCode()) * 31) + this.flag.hashCode()) * 31) + Double.hashCode(this.floor_area)) * 31) + this.formatRegn_dt.hashCode()) * 31) + Integer.hashCode(this.fuel)) * 31) + this.fuel_descr.hashCode()) * 31) + this.garage_add.hashCode()) * 31) + Integer.hashCode(this.gcw)) * 31) + Integer.hashCode(this.height)) * 31) + Double.hashCode(this.hp)) * 31) + this.imported_vch.hashCode()) * 31) + this.laser_code.hashCode()) * 31) + this.latesttaxdetails.hashCode()) * 31) + Integer.hashCode(this.ld_wt)) * 31) + Integer.hashCode(this.length)) * 31) + Integer.hashCode(this.maker)) * 31) + this.maker_name.hashCode()) * 31) + Integer.hashCode(this.manu_mon)) * 31) + Integer.hashCode(this.manu_yr)) * 31) + this.mobileNoEditable.hashCode()) * 31) + Long.hashCode(this.mobile_no)) * 31) + this.model_cd.hashCode()) * 31) + this.model_name.hashCode()) * 31) + Integer.hashCode(this.no_cyl)) * 31) + this.no_of_axles.hashCode()) * 31) + Integer.hashCode(this.norms)) * 31) + this.norms_descr.hashCode()) * 31) + this.numberOfTyres.hashCode()) * 31) + Integer.hashCode(this.off_cd)) * 31) + this.off_name.hashCode()) * 31) + this.op_dt.hashCode()) * 31) + Integer.hashCode(this.other_criteria)) * 31) + this.ownerCatg.hashCode()) * 31) + this.ownerIdentification.hashCode()) * 31) + Integer.hashCode(this.owner_cd)) * 31) + this.owner_cd_descr.hashCode()) * 31) + Integer.hashCode(this.owner_ctg)) * 31) + this.owner_name.hashCode()) * 31) + Integer.hashCode(this.owner_sr)) * 31) + this.p_add1.hashCode()) * 31) + this.p_add2.hashCode()) * 31) + this.p_add3.hashCode()) * 31) + Integer.hashCode(this.p_district)) * 31) + this.p_district_name.hashCode()) * 31) + Integer.hashCode(this.p_pincode)) * 31) + this.p_state.hashCode()) * 31) + this.p_state_name.hashCode()) * 31) + this.pan_no.hashCode()) * 31) + this.passport_no.hashCode()) * 31) + this.permitDetailDto.hashCode()) * 31) + this.permitDetailEntity.hashCode()) * 31) + this.permit_rto_cd.hashCode()) * 31) + this.purchase_date.hashCode()) * 31) + this.purchase_dt.hashCode()) * 31) + this.ration_card_no.hashCode()) * 31) + this.regn_dt.hashCode()) * 31) + this.regn_dtAsDate.hashCode()) * 31) + this.regn_no.hashCode()) * 31) + this.regn_type.hashCode()) * 31) + this.regn_type_descr.hashCode()) * 31) + this.regn_upto.hashCode()) * 31) + this.regn_uptoAsDate.hashCode()) * 31) + this.returnMessge.hashCode()) * 31) + Integer.hashCode(this.sale_amt)) * 31) + Integer.hashCode(this.seat_cap)) * 31) + Integer.hashCode(this.sleeper_cap)) * 31) + Integer.hashCode(this.stand_cap)) * 31) + this.state_cd.hashCode()) * 31) + this.state_name.hashCode()) * 31) + this.status.hashCode()) * 31) + this.tax_mode.hashCode()) * 31) + this.transport_catg.hashCode()) * 31) + Integer.hashCode(this.unld_wt)) * 31) + this.vch_catg.hashCode()) * 31) + this.vch_catg_desc.hashCode()) * 31) + this.vch_purchase_as.hashCode()) * 31) + this.vch_purchase_asCode.hashCode()) * 31) + this.vehType.hashCode()) * 31) + Integer.hashCode(this.vehTypeAsInt)) * 31) + Long.hashCode(this.verified_on)) * 31) + Integer.hashCode(this.vh_class)) * 31) + this.vh_class_desc.hashCode()) * 31) + this.video_fitted.hashCode()) * 31) + this.voter_id.hashCode()) * 31) + this.vtInsuranceCommonDto.hashCode()) * 31) + this.vtpucc.hashCode()) * 31) + Integer.hashCode(this.wheelbase)) * 31) + Integer.hashCode(this.width);
    }

    public String toString() {
        return "RcVivkeji(aadhar_no=" + this.aadhar_no + ", ac_fitted=" + this.ac_fitted + ", annual_income=" + this.annual_income + ", appl_no=" + this.appl_no + ", audio_fitted=" + this.audio_fitted + ", body_type=" + this.body_type + ", c_add1=" + this.c_add1 + ", c_add2=" + this.c_add2 + ", c_add3=" + this.c_add3 + ", c_district=" + this.c_district + ", c_district_name=" + this.c_district_name + ", c_off_cd=" + this.c_off_cd + ", c_pincode=" + this.c_pincode + ", c_state=" + this.c_state + ", c_state_name=" + this.c_state_name + ", chasi_no=" + this.chasi_no + ", chasi_no_original=" + this.chasi_no_original + ", color=" + this.color + ", conditionstatus=" + this.conditionstatus + ", cubic_cap=" + this.cubic_cap + ", dealer_cd=" + this.dealer_cd + ", dept_cd=" + this.dept_cd + ", dlRequired=" + this.dlRequired + ", dlValidationRequired=" + this.dlValidationRequired + ", dl_no=" + this.dl_no + ", dlr_add1=" + this.dlr_add1 + ", dlr_add2=" + this.dlr_add2 + ", dlr_add3=" + this.dlr_add3 + ", dlr_city=" + this.dlr_city + ", dlr_district=" + this.dlr_district + ", dlr_name=" + this.dlr_name + ", dlr_pincode=" + this.dlr_pincode + ", email_id=" + this.email_id + ", eng_no=" + this.eng_no + ", eng_no_original=" + this.eng_no_original + ", eng_no_orignal=" + this.eng_no_orignal + ", f_name=" + this.f_name + ", fit_upto=" + this.fit_upto + ", fit_uptoAsDate=" + this.fit_uptoAsDate + ", fit_upto_desc=" + this.fit_upto_desc + ", flag=" + this.flag + ", floor_area=" + this.floor_area + ", formatRegn_dt=" + this.formatRegn_dt + ", fuel=" + this.fuel + ", fuel_descr=" + this.fuel_descr + ", garage_add=" + this.garage_add + ", gcw=" + this.gcw + ", height=" + this.height + ", hp=" + this.hp + ", imported_vch=" + this.imported_vch + ", laser_code=" + this.laser_code + ", latesttaxdetails=" + this.latesttaxdetails + ", ld_wt=" + this.ld_wt + ", length=" + this.length + ", maker=" + this.maker + ", maker_name=" + this.maker_name + ", manu_mon=" + this.manu_mon + ", manu_yr=" + this.manu_yr + ", mobileNoEditable=" + this.mobileNoEditable + ", mobile_no=" + this.mobile_no + ", model_cd=" + this.model_cd + ", model_name=" + this.model_name + ", no_cyl=" + this.no_cyl + ", no_of_axles=" + this.no_of_axles + ", norms=" + this.norms + ", norms_descr=" + this.norms_descr + ", numberOfTyres=" + this.numberOfTyres + ", off_cd=" + this.off_cd + ", off_name=" + this.off_name + ", op_dt=" + this.op_dt + ", other_criteria=" + this.other_criteria + ", ownerCatg=" + this.ownerCatg + ", ownerIdentification=" + this.ownerIdentification + ", owner_cd=" + this.owner_cd + ", owner_cd_descr=" + this.owner_cd_descr + ", owner_ctg=" + this.owner_ctg + ", owner_name=" + this.owner_name + ", owner_sr=" + this.owner_sr + ", p_add1=" + this.p_add1 + ", p_add2=" + this.p_add2 + ", p_add3=" + this.p_add3 + ", p_district=" + this.p_district + ", p_district_name=" + this.p_district_name + ", p_pincode=" + this.p_pincode + ", p_state=" + this.p_state + ", p_state_name=" + this.p_state_name + ", pan_no=" + this.pan_no + ", passport_no=" + this.passport_no + ", permitDetailDto=" + this.permitDetailDto + ", permitDetailEntity=" + this.permitDetailEntity + ", permit_rto_cd=" + this.permit_rto_cd + ", purchase_date=" + this.purchase_date + ", purchase_dt=" + this.purchase_dt + ", ration_card_no=" + this.ration_card_no + ", regn_dt=" + this.regn_dt + ", regn_dtAsDate=" + this.regn_dtAsDate + ", regn_no=" + this.regn_no + ", regn_type=" + this.regn_type + ", regn_type_descr=" + this.regn_type_descr + ", regn_upto=" + this.regn_upto + ", regn_uptoAsDate=" + this.regn_uptoAsDate + ", returnMessge=" + this.returnMessge + ", sale_amt=" + this.sale_amt + ", seat_cap=" + this.seat_cap + ", sleeper_cap=" + this.sleeper_cap + ", stand_cap=" + this.stand_cap + ", state_cd=" + this.state_cd + ", state_name=" + this.state_name + ", status=" + this.status + ", tax_mode=" + this.tax_mode + ", transport_catg=" + this.transport_catg + ", unld_wt=" + this.unld_wt + ", vch_catg=" + this.vch_catg + ", vch_catg_desc=" + this.vch_catg_desc + ", vch_purchase_as=" + this.vch_purchase_as + ", vch_purchase_asCode=" + this.vch_purchase_asCode + ", vehType=" + this.vehType + ", vehTypeAsInt=" + this.vehTypeAsInt + ", verified_on=" + this.verified_on + ", vh_class=" + this.vh_class + ", vh_class_desc=" + this.vh_class_desc + ", video_fitted=" + this.video_fitted + ", voter_id=" + this.voter_id + ", vtInsuranceCommonDto=" + this.vtInsuranceCommonDto + ", vtpucc=" + this.vtpucc + ", wheelbase=" + this.wheelbase + ", width=" + this.width + ')';
    }
}
