package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000#\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\bq\n\u0002\u0010\b\n\u0003\bý\u0001\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bµ\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\b\u00100\u001a\u0004\u0018\u00010\u0003\u0012\b\u00101\u001a\u0004\u0018\u00010\u0003\u0012\b\u00102\u001a\u0004\u0018\u00010\u0003\u0012\b\u00103\u001a\u0004\u0018\u00010\u0003\u0012\b\u00104\u001a\u0004\u0018\u00010\u0003\u0012\b\u00105\u001a\u0004\u0018\u00010\u0003\u0012\b\u00106\u001a\u0004\u0018\u00010\u0003\u0012\b\u00107\u001a\u0004\u0018\u00010\u0003\u0012\b\u00108\u001a\u0004\u0018\u00010\u0003\u0012\b\u00109\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010:\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010;\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010<\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010=\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010>\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010?\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010@\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010A\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010B\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010C\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010D\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010E\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010F\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010G\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010H\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010I\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010J\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010K\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010L\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010M\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010N\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010O\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010P\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010Q\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010R\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010S\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010T\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010U\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010V\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010W\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010X\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010Y\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010Z\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010[\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\\\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010]\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010^\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010_\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010`\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010g\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010h\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010i\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010j\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010k\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010l\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010m\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010o\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010p\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010q\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010s\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010t\u001a\u0004\u0018\u00010u\u0012\b\u0010v\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010w\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010x\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010y\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010z\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010{\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010|J\f\u0010ø\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ù\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ú\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010û\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ü\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ý\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010þ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ÿ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0080\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0081\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0082\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0083\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0084\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0085\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0086\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0087\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0088\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0012\u0010\u0089\u0002\u001a\u0004\u0018\u00010uHÆ\u0003¢\u0006\u0003\u0010ð\u0001J\f\u0010\u008a\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008b\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008c\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008d\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008e\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008f\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0090\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0091\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0092\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0093\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0094\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0095\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0096\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0097\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0098\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0099\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009a\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009b\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009c\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009d\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009e\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009f\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010 \u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¡\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¢\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010£\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¤\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¥\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¦\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010§\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¨\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010©\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ª\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010«\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¬\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u00ad\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010®\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¯\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010°\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010±\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010²\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010³\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010´\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010µ\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¶\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010·\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¸\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¹\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010º\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010»\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¼\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010½\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¾\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¿\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010À\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Á\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Â\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ã\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ä\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Å\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Æ\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ç\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010È\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010É\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ê\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ë\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ì\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Í\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Î\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ï\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ð\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ñ\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ò\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ó\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ô\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Õ\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ö\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010×\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ø\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ù\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ú\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Û\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ü\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ý\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Þ\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ß\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010à\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010á\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010â\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ã\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ä\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010å\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010æ\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ç\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010è\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010é\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ê\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ë\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ì\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010í\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010î\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ï\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J°\u000b\u0010ð\u0002\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010]\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010^\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010_\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010`\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010g\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010h\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010i\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010j\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010k\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010l\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010m\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010o\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010p\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010q\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010s\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010t\u001a\u0004\u0018\u00010u2\n\b\u0002\u0010v\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010w\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010x\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010y\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010z\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010{\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0003\u0010ñ\u0002J\u0016\u0010ò\u0002\u001a\u00030ó\u00022\t\u0010ô\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010õ\u0002\u001a\u00020uHÖ\u0001J\n\u0010ö\u0002\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b}\u0010~R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010~R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010~R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010~R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010~R\u0014\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0083\u0001\u0010~R\u0014\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0084\u0001\u0010~R\u0014\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0085\u0001\u0010~R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0086\u0001\u0010~R\u0014\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0087\u0001\u0010~R\u0014\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0088\u0001\u0010~R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0089\u0001\u0010~R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u008a\u0001\u0010~R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u008b\u0001\u0010~R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u008c\u0001\u0010~R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u008d\u0001\u0010~R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u008e\u0001\u0010~R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u008f\u0001\u0010~R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0090\u0001\u0010~R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0091\u0001\u0010~R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0092\u0001\u0010~R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0093\u0001\u0010~R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0094\u0001\u0010~R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0095\u0001\u0010~R\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0096\u0001\u0010~R\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0097\u0001\u0010~R\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0098\u0001\u0010~R\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0099\u0001\u0010~R\u0014\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u009a\u0001\u0010~R\u0014\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u009b\u0001\u0010~R\u0014\u0010!\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u009c\u0001\u0010~R\u0014\u0010\"\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u009d\u0001\u0010~R\u0014\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u009e\u0001\u0010~R\u0014\u0010$\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u009f\u0001\u0010~R\u0014\u0010%\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b \u0001\u0010~R\u0014\u0010&\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b¡\u0001\u0010~R\u0014\u0010'\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b¢\u0001\u0010~R\u0014\u0010(\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b£\u0001\u0010~R\u0014\u0010)\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b¤\u0001\u0010~R\u0014\u0010*\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b¥\u0001\u0010~R\u0014\u0010+\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b¦\u0001\u0010~R\u0014\u0010-\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b§\u0001\u0010~R\u0014\u0010.\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b¨\u0001\u0010~R\u0014\u0010/\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b©\u0001\u0010~R\u0014\u00100\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bª\u0001\u0010~R\u0014\u00101\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b«\u0001\u0010~R\u0014\u00102\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b¬\u0001\u0010~R\u0014\u00103\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u00ad\u0001\u0010~R\u0014\u00104\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b®\u0001\u0010~R\u0014\u00105\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b¯\u0001\u0010~R\u0014\u00106\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b°\u0001\u0010~R\u0014\u00107\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b±\u0001\u0010~R\u0014\u00108\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b²\u0001\u0010~R\u0014\u00109\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b³\u0001\u0010~R\u0014\u0010:\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b´\u0001\u0010~R\u0014\u0010;\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bµ\u0001\u0010~R\u0014\u0010<\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b¶\u0001\u0010~R\u0014\u0010=\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b·\u0001\u0010~R\u0014\u0010>\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b¸\u0001\u0010~R\u0014\u0010?\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b¹\u0001\u0010~R\u0014\u0010@\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bº\u0001\u0010~R\u0014\u0010A\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b»\u0001\u0010~R\u0014\u0010B\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b¼\u0001\u0010~R\u0014\u0010C\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b½\u0001\u0010~R\u0014\u0010D\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b¾\u0001\u0010~R\u0014\u0010E\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b¿\u0001\u0010~R\u0014\u0010F\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÀ\u0001\u0010~R\u0014\u0010G\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÁ\u0001\u0010~R\u0014\u0010H\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÂ\u0001\u0010~R\u0014\u0010I\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÃ\u0001\u0010~R\u0014\u0010J\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÄ\u0001\u0010~R\u0014\u0010K\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÅ\u0001\u0010~R\u0014\u0010L\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÆ\u0001\u0010~R\u0014\u0010M\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÇ\u0001\u0010~R\u0014\u0010N\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÈ\u0001\u0010~R\u0014\u0010O\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÉ\u0001\u0010~R\u0014\u0010P\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÊ\u0001\u0010~R\u0014\u0010Q\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bË\u0001\u0010~R\u0014\u0010R\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÌ\u0001\u0010~R\u0014\u0010S\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÍ\u0001\u0010~R\u0014\u0010T\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÎ\u0001\u0010~R\u0014\u0010U\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÏ\u0001\u0010~R\u0014\u0010V\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÐ\u0001\u0010~R\u0014\u0010W\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÑ\u0001\u0010~R\u0014\u0010X\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÒ\u0001\u0010~R\u0014\u0010Y\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÓ\u0001\u0010~R\u0014\u0010Z\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÔ\u0001\u0010~R\u0014\u0010[\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÕ\u0001\u0010~R\u0014\u0010\\\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÖ\u0001\u0010~R\u0014\u0010,\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b×\u0001\u0010~R\u0014\u0010]\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bØ\u0001\u0010~R\u0014\u0010^\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÙ\u0001\u0010~R\u0014\u0010_\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÚ\u0001\u0010~R\u0014\u0010`\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÛ\u0001\u0010~R\u0014\u0010a\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÜ\u0001\u0010~R\u0014\u0010b\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÝ\u0001\u0010~R\u0014\u0010c\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÞ\u0001\u0010~R\u0014\u0010d\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bß\u0001\u0010~R\u0014\u0010e\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bà\u0001\u0010~R\u0014\u0010f\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bá\u0001\u0010~R\u0014\u0010g\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bâ\u0001\u0010~R\u0014\u0010h\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bã\u0001\u0010~R\u0014\u0010i\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bä\u0001\u0010~R\u0014\u0010j\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bå\u0001\u0010~R\u0014\u0010k\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bæ\u0001\u0010~R\u0014\u0010l\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bç\u0001\u0010~R\u0014\u0010m\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bè\u0001\u0010~R\u0014\u0010n\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bé\u0001\u0010~R\u0014\u0010o\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bê\u0001\u0010~R\u0014\u0010p\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bë\u0001\u0010~R\u0014\u0010q\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bì\u0001\u0010~R\u0014\u0010r\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bí\u0001\u0010~R\u0014\u0010s\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bî\u0001\u0010~R\u0018\u0010t\u001a\u0004\u0018\u00010u¢\u0006\r\n\u0003\u0010ñ\u0001\u001a\u0006\bï\u0001\u0010ð\u0001R\u0014\u0010v\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bò\u0001\u0010~R\u0014\u0010w\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bó\u0001\u0010~R\u0014\u0010x\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bô\u0001\u0010~R\u0014\u0010y\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bõ\u0001\u0010~R\u0014\u0010z\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bö\u0001\u0010~R\u0014\u0010{\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b÷\u0001\u0010~¨\u0006÷\u0002"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/VahanOwnerDetails;", "", "aadhar_no", "", "ac_fitted", "annual_income", "appl_no", "audio_fitted", "body_type", "c_add1", "c_add2", "c_add3", "c_district", "c_district_name", "c_off_cd", "c_pincode", "c_state", "c_state_name", "chasi_no", "chasi_no_original", "color", "conditionstatus", "cubic_cap", "dealer_cd", "dept_cd", "dlRequired", "dlValidationRequired", "dl_no", "dlr_add1", "dlr_add2", "dlr_add3", "dlr_city", "dlr_district", "dlr_name", "dlr_pincode", "email_id", "eng_no", "eng_no_original", "eng_no_orignal", "f_name", "fit_upto", "fit_uptoAsDate", "fit_upto_desc", "flag", "regnNo", "floor_area", "formatRegn_dt", "fuel", "fuel_descr", "garage_add", "gcw", "height", "hp", "imported_vch", "laser_code", "ld_wt", "length", "maker", "maker_name", "manu_mon", "manu_yr", "mobileNoEditable", "mobile_no", "model_cd", "model_name", "no_cyl", "no_of_axles", "norms", "norms_descr", "numberOfTyres", "off_cd", "off_name", "op_dt", "other_criteria", "ownerCatg", "owner_cd", "owner_cd_descr", "owner_ctg", "owner_name", "owner_sr", "p_add1", "p_add2", "p_add3", "p_district", "p_district_name", "p_pincode", "p_state", "p_state_name", "pan_no", "passport_no", "permit_rto_cd", "purchase_dt", "ration_card_no", "regn_dt", "regn_dtAsDate", "regn_no", "regn_type", "regn_type_descr", "regn_upto", "regn_uptoAsDate", "returnMessge", "sale_amt", "seat_cap", "sleeper_cap", "stand_cap", "state_cd", "state_name", "status", "tax_mode", "transport_catg", "unld_wt", "vch_catg", "vch_catg_desc", "vch_purchase_as", "vch_purchase_asCode", "vehType", "vehTypeAsInt", "", "vh_class", "vh_class_desc", "video_fitted", "voter_id", "wheelbase", "width", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAadhar_no", "()Ljava/lang/String;", "getAc_fitted", "getAnnual_income", "getAppl_no", "getAudio_fitted", "getBody_type", "getC_add1", "getC_add2", "getC_add3", "getC_district", "getC_district_name", "getC_off_cd", "getC_pincode", "getC_state", "getC_state_name", "getChasi_no", "getChasi_no_original", "getColor", "getConditionstatus", "getCubic_cap", "getDealer_cd", "getDept_cd", "getDlRequired", "getDlValidationRequired", "getDl_no", "getDlr_add1", "getDlr_add2", "getDlr_add3", "getDlr_city", "getDlr_district", "getDlr_name", "getDlr_pincode", "getEmail_id", "getEng_no", "getEng_no_original", "getEng_no_orignal", "getF_name", "getFit_upto", "getFit_uptoAsDate", "getFit_upto_desc", "getFlag", "getFloor_area", "getFormatRegn_dt", "getFuel", "getFuel_descr", "getGarage_add", "getGcw", "getHeight", "getHp", "getImported_vch", "getLaser_code", "getLd_wt", "getLength", "getMaker", "getMaker_name", "getManu_mon", "getManu_yr", "getMobileNoEditable", "getMobile_no", "getModel_cd", "getModel_name", "getNo_cyl", "getNo_of_axles", "getNorms", "getNorms_descr", "getNumberOfTyres", "getOff_cd", "getOff_name", "getOp_dt", "getOther_criteria", "getOwnerCatg", "getOwner_cd", "getOwner_cd_descr", "getOwner_ctg", "getOwner_name", "getOwner_sr", "getP_add1", "getP_add2", "getP_add3", "getP_district", "getP_district_name", "getP_pincode", "getP_state", "getP_state_name", "getPan_no", "getPassport_no", "getPermit_rto_cd", "getPurchase_dt", "getRation_card_no", "getRegnNo", "getRegn_dt", "getRegn_dtAsDate", "getRegn_no", "getRegn_type", "getRegn_type_descr", "getRegn_upto", "getRegn_uptoAsDate", "getReturnMessge", "getSale_amt", "getSeat_cap", "getSleeper_cap", "getStand_cap", "getState_cd", "getState_name", "getStatus", "getTax_mode", "getTransport_catg", "getUnld_wt", "getVch_catg", "getVch_catg_desc", "getVch_purchase_as", "getVch_purchase_asCode", "getVehType", "getVehTypeAsInt", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getVh_class", "getVh_class_desc", "getVideo_fitted", "getVoter_id", "getWheelbase", "getWidth", "component1", "component10", "component100", "component101", "component102", "component103", "component104", "component105", "component106", "component107", "component108", "component109", "component11", "component110", "component111", "component112", "component113", "component114", "component115", "component116", "component117", "component118", "component119", "component12", "component120", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component6", "component60", "component61", "component62", "component63", "component64", "component65", "component66", "component67", "component68", "component69", "component7", "component70", "component71", "component72", "component73", "component74", "component75", "component76", "component77", "component78", "component79", "component8", "component80", "component81", "component82", "component83", "component84", "component85", "component86", "component87", "component88", "component89", "component9", "component90", "component91", "component92", "component93", "component94", "component95", "component96", "component97", "component98", "component99", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/nic/mparivahan/VahanServices/VahanModel/VahanOwnerDetails;", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class VahanOwnerDetails {
    private final String aadhar_no;
    private final String ac_fitted;
    private final String annual_income;
    private final String appl_no;
    private final String audio_fitted;
    private final String body_type;
    private final String c_add1;
    private final String c_add2;
    private final String c_add3;
    private final String c_district;
    private final String c_district_name;
    private final String c_off_cd;
    private final String c_pincode;
    private final String c_state;
    private final String c_state_name;
    private final String chasi_no;
    private final String chasi_no_original;
    private final String color;
    private final String conditionstatus;
    private final String cubic_cap;
    private final String dealer_cd;
    private final String dept_cd;
    private final String dlRequired;
    private final String dlValidationRequired;
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
    private final String eng_no_original;
    private final String eng_no_orignal;
    private final String f_name;
    private final String fit_upto;
    private final String fit_uptoAsDate;
    private final String fit_upto_desc;
    private final String flag;
    private final String floor_area;
    private final String formatRegn_dt;
    private final String fuel;
    private final String fuel_descr;
    private final String garage_add;
    private final String gcw;
    private final String height;
    private final String hp;
    private final String imported_vch;
    private final String laser_code;
    private final String ld_wt;
    private final String length;
    private final String maker;
    private final String maker_name;
    private final String manu_mon;
    private final String manu_yr;
    private final String mobileNoEditable;
    private final String mobile_no;
    private final String model_cd;
    private final String model_name;
    private final String no_cyl;
    private final String no_of_axles;
    private final String norms;
    private final String norms_descr;
    private final String numberOfTyres;
    private final String off_cd;
    private final String off_name;
    private final String op_dt;
    private final String other_criteria;
    private final String ownerCatg;
    private final String owner_cd;
    private final String owner_cd_descr;
    private final String owner_ctg;
    private final String owner_name;
    private final String owner_sr;
    private final String p_add1;
    private final String p_add2;
    private final String p_add3;
    private final String p_district;
    private final String p_district_name;
    private final String p_pincode;
    private final String p_state;
    private final String p_state_name;
    private final String pan_no;
    private final String passport_no;
    private final String permit_rto_cd;
    private final String purchase_dt;
    private final String ration_card_no;
    private final String regnNo;
    private final String regn_dt;
    private final String regn_dtAsDate;
    private final String regn_no;
    private final String regn_type;
    private final String regn_type_descr;
    private final String regn_upto;
    private final String regn_uptoAsDate;
    private final String returnMessge;
    private final String sale_amt;
    private final String seat_cap;
    private final String sleeper_cap;
    private final String stand_cap;
    private final String state_cd;
    private final String state_name;
    private final String status;
    private final String tax_mode;
    private final String transport_catg;
    private final String unld_wt;
    private final String vch_catg;
    private final String vch_catg_desc;
    private final String vch_purchase_as;
    private final String vch_purchase_asCode;
    private final String vehType;
    private final Integer vehTypeAsInt;
    private final String vh_class;
    private final String vh_class_desc;
    private final String video_fitted;
    private final String voter_id;
    private final String wheelbase;
    private final String width;

    public VahanOwnerDetails(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58, String str59, String str60, String str61, String str62, String str63, String str64, String str65, String str66, String str67, String str68, String str69, String str70, String str71, String str72, String str73, String str74, String str75, String str76, String str77, String str78, String str79, String str80, String str81, String str82, String str83, String str84, String str85, String str86, String str87, String str88, String str89, String str90, String str91, String str92, String str93, String str94, String str95, String str96, String str97, String str98, String str99, String str100, String str101, String str102, String str103, String str104, String str105, String str106, String str107, String str108, String str109, String str110, String str111, String str112, String str113, Integer num, String str114, String str115, String str116, String str117, String str118, String str119) {
        this.aadhar_no = str;
        this.ac_fitted = str2;
        this.annual_income = str3;
        this.appl_no = str4;
        this.audio_fitted = str5;
        this.body_type = str6;
        this.c_add1 = str7;
        this.c_add2 = str8;
        this.c_add3 = str9;
        this.c_district = str10;
        this.c_district_name = str11;
        this.c_off_cd = str12;
        this.c_pincode = str13;
        this.c_state = str14;
        this.c_state_name = str15;
        this.chasi_no = str16;
        this.chasi_no_original = str17;
        this.color = str18;
        this.conditionstatus = str19;
        this.cubic_cap = str20;
        this.dealer_cd = str21;
        this.dept_cd = str22;
        this.dlRequired = str23;
        this.dlValidationRequired = str24;
        this.dl_no = str25;
        this.dlr_add1 = str26;
        this.dlr_add2 = str27;
        this.dlr_add3 = str28;
        this.dlr_city = str29;
        this.dlr_district = str30;
        this.dlr_name = str31;
        this.dlr_pincode = str32;
        this.email_id = str33;
        this.eng_no = str34;
        this.eng_no_original = str35;
        this.eng_no_orignal = str36;
        this.f_name = str37;
        this.fit_upto = str38;
        this.fit_uptoAsDate = str39;
        this.fit_upto_desc = str40;
        this.flag = str41;
        this.regnNo = str42;
        this.floor_area = str43;
        this.formatRegn_dt = str44;
        this.fuel = str45;
        this.fuel_descr = str46;
        this.garage_add = str47;
        this.gcw = str48;
        this.height = str49;
        this.hp = str50;
        this.imported_vch = str51;
        this.laser_code = str52;
        this.ld_wt = str53;
        this.length = str54;
        this.maker = str55;
        this.maker_name = str56;
        this.manu_mon = str57;
        this.manu_yr = str58;
        this.mobileNoEditable = str59;
        this.mobile_no = str60;
        this.model_cd = str61;
        this.model_name = str62;
        this.no_cyl = str63;
        this.no_of_axles = str64;
        this.norms = str65;
        this.norms_descr = str66;
        this.numberOfTyres = str67;
        this.off_cd = str68;
        this.off_name = str69;
        this.op_dt = str70;
        this.other_criteria = str71;
        this.ownerCatg = str72;
        this.owner_cd = str73;
        this.owner_cd_descr = str74;
        this.owner_ctg = str75;
        this.owner_name = str76;
        this.owner_sr = str77;
        this.p_add1 = str78;
        this.p_add2 = str79;
        this.p_add3 = str80;
        this.p_district = str81;
        this.p_district_name = str82;
        this.p_pincode = str83;
        this.p_state = str84;
        this.p_state_name = str85;
        this.pan_no = str86;
        this.passport_no = str87;
        this.permit_rto_cd = str88;
        this.purchase_dt = str89;
        this.ration_card_no = str90;
        this.regn_dt = str91;
        this.regn_dtAsDate = str92;
        this.regn_no = str93;
        this.regn_type = str94;
        this.regn_type_descr = str95;
        this.regn_upto = str96;
        this.regn_uptoAsDate = str97;
        this.returnMessge = str98;
        this.sale_amt = str99;
        this.seat_cap = str100;
        this.sleeper_cap = str101;
        this.stand_cap = str102;
        this.state_cd = str103;
        this.state_name = str104;
        this.status = str105;
        this.tax_mode = str106;
        this.transport_catg = str107;
        this.unld_wt = str108;
        this.vch_catg = str109;
        this.vch_catg_desc = str110;
        this.vch_purchase_as = str111;
        this.vch_purchase_asCode = str112;
        this.vehType = str113;
        this.vehTypeAsInt = num;
        this.vh_class = str114;
        this.vh_class_desc = str115;
        this.video_fitted = str116;
        this.voter_id = str117;
        this.wheelbase = str118;
        this.width = str119;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAadhar_no() {
        return this.aadhar_no;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getC_district() {
        return this.c_district;
    }

    /* JADX INFO: renamed from: component100, reason: from getter */
    public final String getSeat_cap() {
        return this.seat_cap;
    }

    /* JADX INFO: renamed from: component101, reason: from getter */
    public final String getSleeper_cap() {
        return this.sleeper_cap;
    }

    /* JADX INFO: renamed from: component102, reason: from getter */
    public final String getStand_cap() {
        return this.stand_cap;
    }

    /* JADX INFO: renamed from: component103, reason: from getter */
    public final String getState_cd() {
        return this.state_cd;
    }

    /* JADX INFO: renamed from: component104, reason: from getter */
    public final String getState_name() {
        return this.state_name;
    }

    /* JADX INFO: renamed from: component105, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component106, reason: from getter */
    public final String getTax_mode() {
        return this.tax_mode;
    }

    /* JADX INFO: renamed from: component107, reason: from getter */
    public final String getTransport_catg() {
        return this.transport_catg;
    }

    /* JADX INFO: renamed from: component108, reason: from getter */
    public final String getUnld_wt() {
        return this.unld_wt;
    }

    /* JADX INFO: renamed from: component109, reason: from getter */
    public final String getVch_catg() {
        return this.vch_catg;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getC_district_name() {
        return this.c_district_name;
    }

    /* JADX INFO: renamed from: component110, reason: from getter */
    public final String getVch_catg_desc() {
        return this.vch_catg_desc;
    }

    /* JADX INFO: renamed from: component111, reason: from getter */
    public final String getVch_purchase_as() {
        return this.vch_purchase_as;
    }

    /* JADX INFO: renamed from: component112, reason: from getter */
    public final String getVch_purchase_asCode() {
        return this.vch_purchase_asCode;
    }

    /* JADX INFO: renamed from: component113, reason: from getter */
    public final String getVehType() {
        return this.vehType;
    }

    /* JADX INFO: renamed from: component114, reason: from getter */
    public final Integer getVehTypeAsInt() {
        return this.vehTypeAsInt;
    }

    /* JADX INFO: renamed from: component115, reason: from getter */
    public final String getVh_class() {
        return this.vh_class;
    }

    /* JADX INFO: renamed from: component116, reason: from getter */
    public final String getVh_class_desc() {
        return this.vh_class_desc;
    }

    /* JADX INFO: renamed from: component117, reason: from getter */
    public final String getVideo_fitted() {
        return this.video_fitted;
    }

    /* JADX INFO: renamed from: component118, reason: from getter */
    public final String getVoter_id() {
        return this.voter_id;
    }

    /* JADX INFO: renamed from: component119, reason: from getter */
    public final String getWheelbase() {
        return this.wheelbase;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getC_off_cd() {
        return this.c_off_cd;
    }

    /* JADX INFO: renamed from: component120, reason: from getter */
    public final String getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getC_pincode() {
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
    public final String getChasi_no_original() {
        return this.chasi_no_original;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getConditionstatus() {
        return this.conditionstatus;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAc_fitted() {
        return this.ac_fitted;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getCubic_cap() {
        return this.cubic_cap;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getDealer_cd() {
        return this.dealer_cd;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getDept_cd() {
        return this.dept_cd;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getDlRequired() {
        return this.dlRequired;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getDlValidationRequired() {
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
    public final String getAnnual_income() {
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
    public final String getEng_no_original() {
        return this.eng_no_original;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final String getEng_no_orignal() {
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
    public final String getFit_uptoAsDate() {
        return this.fit_uptoAsDate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAppl_no() {
        return this.appl_no;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final String getFit_upto_desc() {
        return this.fit_upto_desc;
    }

    /* JADX INFO: renamed from: component41, reason: from getter */
    public final String getFlag() {
        return this.flag;
    }

    /* JADX INFO: renamed from: component42, reason: from getter */
    public final String getRegnNo() {
        return this.regnNo;
    }

    /* JADX INFO: renamed from: component43, reason: from getter */
    public final String getFloor_area() {
        return this.floor_area;
    }

    /* JADX INFO: renamed from: component44, reason: from getter */
    public final String getFormatRegn_dt() {
        return this.formatRegn_dt;
    }

    /* JADX INFO: renamed from: component45, reason: from getter */
    public final String getFuel() {
        return this.fuel;
    }

    /* JADX INFO: renamed from: component46, reason: from getter */
    public final String getFuel_descr() {
        return this.fuel_descr;
    }

    /* JADX INFO: renamed from: component47, reason: from getter */
    public final String getGarage_add() {
        return this.garage_add;
    }

    /* JADX INFO: renamed from: component48, reason: from getter */
    public final String getGcw() {
        return this.gcw;
    }

    /* JADX INFO: renamed from: component49, reason: from getter */
    public final String getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAudio_fitted() {
        return this.audio_fitted;
    }

    /* JADX INFO: renamed from: component50, reason: from getter */
    public final String getHp() {
        return this.hp;
    }

    /* JADX INFO: renamed from: component51, reason: from getter */
    public final String getImported_vch() {
        return this.imported_vch;
    }

    /* JADX INFO: renamed from: component52, reason: from getter */
    public final String getLaser_code() {
        return this.laser_code;
    }

    /* JADX INFO: renamed from: component53, reason: from getter */
    public final String getLd_wt() {
        return this.ld_wt;
    }

    /* JADX INFO: renamed from: component54, reason: from getter */
    public final String getLength() {
        return this.length;
    }

    /* JADX INFO: renamed from: component55, reason: from getter */
    public final String getMaker() {
        return this.maker;
    }

    /* JADX INFO: renamed from: component56, reason: from getter */
    public final String getMaker_name() {
        return this.maker_name;
    }

    /* JADX INFO: renamed from: component57, reason: from getter */
    public final String getManu_mon() {
        return this.manu_mon;
    }

    /* JADX INFO: renamed from: component58, reason: from getter */
    public final String getManu_yr() {
        return this.manu_yr;
    }

    /* JADX INFO: renamed from: component59, reason: from getter */
    public final String getMobileNoEditable() {
        return this.mobileNoEditable;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBody_type() {
        return this.body_type;
    }

    /* JADX INFO: renamed from: component60, reason: from getter */
    public final String getMobile_no() {
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
    public final String getNo_cyl() {
        return this.no_cyl;
    }

    /* JADX INFO: renamed from: component64, reason: from getter */
    public final String getNo_of_axles() {
        return this.no_of_axles;
    }

    /* JADX INFO: renamed from: component65, reason: from getter */
    public final String getNorms() {
        return this.norms;
    }

    /* JADX INFO: renamed from: component66, reason: from getter */
    public final String getNorms_descr() {
        return this.norms_descr;
    }

    /* JADX INFO: renamed from: component67, reason: from getter */
    public final String getNumberOfTyres() {
        return this.numberOfTyres;
    }

    /* JADX INFO: renamed from: component68, reason: from getter */
    public final String getOff_cd() {
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
    public final String getOther_criteria() {
        return this.other_criteria;
    }

    /* JADX INFO: renamed from: component72, reason: from getter */
    public final String getOwnerCatg() {
        return this.ownerCatg;
    }

    /* JADX INFO: renamed from: component73, reason: from getter */
    public final String getOwner_cd() {
        return this.owner_cd;
    }

    /* JADX INFO: renamed from: component74, reason: from getter */
    public final String getOwner_cd_descr() {
        return this.owner_cd_descr;
    }

    /* JADX INFO: renamed from: component75, reason: from getter */
    public final String getOwner_ctg() {
        return this.owner_ctg;
    }

    /* JADX INFO: renamed from: component76, reason: from getter */
    public final String getOwner_name() {
        return this.owner_name;
    }

    /* JADX INFO: renamed from: component77, reason: from getter */
    public final String getOwner_sr() {
        return this.owner_sr;
    }

    /* JADX INFO: renamed from: component78, reason: from getter */
    public final String getP_add1() {
        return this.p_add1;
    }

    /* JADX INFO: renamed from: component79, reason: from getter */
    public final String getP_add2() {
        return this.p_add2;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getC_add2() {
        return this.c_add2;
    }

    /* JADX INFO: renamed from: component80, reason: from getter */
    public final String getP_add3() {
        return this.p_add3;
    }

    /* JADX INFO: renamed from: component81, reason: from getter */
    public final String getP_district() {
        return this.p_district;
    }

    /* JADX INFO: renamed from: component82, reason: from getter */
    public final String getP_district_name() {
        return this.p_district_name;
    }

    /* JADX INFO: renamed from: component83, reason: from getter */
    public final String getP_pincode() {
        return this.p_pincode;
    }

    /* JADX INFO: renamed from: component84, reason: from getter */
    public final String getP_state() {
        return this.p_state;
    }

    /* JADX INFO: renamed from: component85, reason: from getter */
    public final String getP_state_name() {
        return this.p_state_name;
    }

    /* JADX INFO: renamed from: component86, reason: from getter */
    public final String getPan_no() {
        return this.pan_no;
    }

    /* JADX INFO: renamed from: component87, reason: from getter */
    public final String getPassport_no() {
        return this.passport_no;
    }

    /* JADX INFO: renamed from: component88, reason: from getter */
    public final String getPermit_rto_cd() {
        return this.permit_rto_cd;
    }

    /* JADX INFO: renamed from: component89, reason: from getter */
    public final String getPurchase_dt() {
        return this.purchase_dt;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getC_add3() {
        return this.c_add3;
    }

    /* JADX INFO: renamed from: component90, reason: from getter */
    public final String getRation_card_no() {
        return this.ration_card_no;
    }

    /* JADX INFO: renamed from: component91, reason: from getter */
    public final String getRegn_dt() {
        return this.regn_dt;
    }

    /* JADX INFO: renamed from: component92, reason: from getter */
    public final String getRegn_dtAsDate() {
        return this.regn_dtAsDate;
    }

    /* JADX INFO: renamed from: component93, reason: from getter */
    public final String getRegn_no() {
        return this.regn_no;
    }

    /* JADX INFO: renamed from: component94, reason: from getter */
    public final String getRegn_type() {
        return this.regn_type;
    }

    /* JADX INFO: renamed from: component95, reason: from getter */
    public final String getRegn_type_descr() {
        return this.regn_type_descr;
    }

    /* JADX INFO: renamed from: component96, reason: from getter */
    public final String getRegn_upto() {
        return this.regn_upto;
    }

    /* JADX INFO: renamed from: component97, reason: from getter */
    public final String getRegn_uptoAsDate() {
        return this.regn_uptoAsDate;
    }

    /* JADX INFO: renamed from: component98, reason: from getter */
    public final String getReturnMessge() {
        return this.returnMessge;
    }

    /* JADX INFO: renamed from: component99, reason: from getter */
    public final String getSale_amt() {
        return this.sale_amt;
    }

    public final VahanOwnerDetails copy(String aadhar_no, String ac_fitted, String annual_income, String appl_no, String audio_fitted, String body_type, String c_add1, String c_add2, String c_add3, String c_district, String c_district_name, String c_off_cd, String c_pincode, String c_state, String c_state_name, String chasi_no, String chasi_no_original, String color, String conditionstatus, String cubic_cap, String dealer_cd, String dept_cd, String dlRequired, String dlValidationRequired, String dl_no, String dlr_add1, String dlr_add2, String dlr_add3, String dlr_city, String dlr_district, String dlr_name, String dlr_pincode, String email_id, String eng_no, String eng_no_original, String eng_no_orignal, String f_name, String fit_upto, String fit_uptoAsDate, String fit_upto_desc, String flag, String regnNo, String floor_area, String formatRegn_dt, String fuel, String fuel_descr, String garage_add, String gcw, String height, String hp, String imported_vch, String laser_code, String ld_wt, String length, String maker, String maker_name, String manu_mon, String manu_yr, String mobileNoEditable, String mobile_no, String model_cd, String model_name, String no_cyl, String no_of_axles, String norms, String norms_descr, String numberOfTyres, String off_cd, String off_name, String op_dt, String other_criteria, String ownerCatg, String owner_cd, String owner_cd_descr, String owner_ctg, String owner_name, String owner_sr, String p_add1, String p_add2, String p_add3, String p_district, String p_district_name, String p_pincode, String p_state, String p_state_name, String pan_no, String passport_no, String permit_rto_cd, String purchase_dt, String ration_card_no, String regn_dt, String regn_dtAsDate, String regn_no, String regn_type, String regn_type_descr, String regn_upto, String regn_uptoAsDate, String returnMessge, String sale_amt, String seat_cap, String sleeper_cap, String stand_cap, String state_cd, String state_name, String status, String tax_mode, String transport_catg, String unld_wt, String vch_catg, String vch_catg_desc, String vch_purchase_as, String vch_purchase_asCode, String vehType, Integer vehTypeAsInt, String vh_class, String vh_class_desc, String video_fitted, String voter_id, String wheelbase, String width) {
        return new VahanOwnerDetails(aadhar_no, ac_fitted, annual_income, appl_no, audio_fitted, body_type, c_add1, c_add2, c_add3, c_district, c_district_name, c_off_cd, c_pincode, c_state, c_state_name, chasi_no, chasi_no_original, color, conditionstatus, cubic_cap, dealer_cd, dept_cd, dlRequired, dlValidationRequired, dl_no, dlr_add1, dlr_add2, dlr_add3, dlr_city, dlr_district, dlr_name, dlr_pincode, email_id, eng_no, eng_no_original, eng_no_orignal, f_name, fit_upto, fit_uptoAsDate, fit_upto_desc, flag, regnNo, floor_area, formatRegn_dt, fuel, fuel_descr, garage_add, gcw, height, hp, imported_vch, laser_code, ld_wt, length, maker, maker_name, manu_mon, manu_yr, mobileNoEditable, mobile_no, model_cd, model_name, no_cyl, no_of_axles, norms, norms_descr, numberOfTyres, off_cd, off_name, op_dt, other_criteria, ownerCatg, owner_cd, owner_cd_descr, owner_ctg, owner_name, owner_sr, p_add1, p_add2, p_add3, p_district, p_district_name, p_pincode, p_state, p_state_name, pan_no, passport_no, permit_rto_cd, purchase_dt, ration_card_no, regn_dt, regn_dtAsDate, regn_no, regn_type, regn_type_descr, regn_upto, regn_uptoAsDate, returnMessge, sale_amt, seat_cap, sleeper_cap, stand_cap, state_cd, state_name, status, tax_mode, transport_catg, unld_wt, vch_catg, vch_catg_desc, vch_purchase_as, vch_purchase_asCode, vehType, vehTypeAsInt, vh_class, vh_class_desc, video_fitted, voter_id, wheelbase, width);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VahanOwnerDetails)) {
            return false;
        }
        VahanOwnerDetails vahanOwnerDetails = (VahanOwnerDetails) other;
        return Intrinsics.areEqual(this.aadhar_no, vahanOwnerDetails.aadhar_no) && Intrinsics.areEqual(this.ac_fitted, vahanOwnerDetails.ac_fitted) && Intrinsics.areEqual(this.annual_income, vahanOwnerDetails.annual_income) && Intrinsics.areEqual(this.appl_no, vahanOwnerDetails.appl_no) && Intrinsics.areEqual(this.audio_fitted, vahanOwnerDetails.audio_fitted) && Intrinsics.areEqual(this.body_type, vahanOwnerDetails.body_type) && Intrinsics.areEqual(this.c_add1, vahanOwnerDetails.c_add1) && Intrinsics.areEqual(this.c_add2, vahanOwnerDetails.c_add2) && Intrinsics.areEqual(this.c_add3, vahanOwnerDetails.c_add3) && Intrinsics.areEqual(this.c_district, vahanOwnerDetails.c_district) && Intrinsics.areEqual(this.c_district_name, vahanOwnerDetails.c_district_name) && Intrinsics.areEqual(this.c_off_cd, vahanOwnerDetails.c_off_cd) && Intrinsics.areEqual(this.c_pincode, vahanOwnerDetails.c_pincode) && Intrinsics.areEqual(this.c_state, vahanOwnerDetails.c_state) && Intrinsics.areEqual(this.c_state_name, vahanOwnerDetails.c_state_name) && Intrinsics.areEqual(this.chasi_no, vahanOwnerDetails.chasi_no) && Intrinsics.areEqual(this.chasi_no_original, vahanOwnerDetails.chasi_no_original) && Intrinsics.areEqual(this.color, vahanOwnerDetails.color) && Intrinsics.areEqual(this.conditionstatus, vahanOwnerDetails.conditionstatus) && Intrinsics.areEqual(this.cubic_cap, vahanOwnerDetails.cubic_cap) && Intrinsics.areEqual(this.dealer_cd, vahanOwnerDetails.dealer_cd) && Intrinsics.areEqual(this.dept_cd, vahanOwnerDetails.dept_cd) && Intrinsics.areEqual(this.dlRequired, vahanOwnerDetails.dlRequired) && Intrinsics.areEqual(this.dlValidationRequired, vahanOwnerDetails.dlValidationRequired) && Intrinsics.areEqual(this.dl_no, vahanOwnerDetails.dl_no) && Intrinsics.areEqual(this.dlr_add1, vahanOwnerDetails.dlr_add1) && Intrinsics.areEqual(this.dlr_add2, vahanOwnerDetails.dlr_add2) && Intrinsics.areEqual(this.dlr_add3, vahanOwnerDetails.dlr_add3) && Intrinsics.areEqual(this.dlr_city, vahanOwnerDetails.dlr_city) && Intrinsics.areEqual(this.dlr_district, vahanOwnerDetails.dlr_district) && Intrinsics.areEqual(this.dlr_name, vahanOwnerDetails.dlr_name) && Intrinsics.areEqual(this.dlr_pincode, vahanOwnerDetails.dlr_pincode) && Intrinsics.areEqual(this.email_id, vahanOwnerDetails.email_id) && Intrinsics.areEqual(this.eng_no, vahanOwnerDetails.eng_no) && Intrinsics.areEqual(this.eng_no_original, vahanOwnerDetails.eng_no_original) && Intrinsics.areEqual(this.eng_no_orignal, vahanOwnerDetails.eng_no_orignal) && Intrinsics.areEqual(this.f_name, vahanOwnerDetails.f_name) && Intrinsics.areEqual(this.fit_upto, vahanOwnerDetails.fit_upto) && Intrinsics.areEqual(this.fit_uptoAsDate, vahanOwnerDetails.fit_uptoAsDate) && Intrinsics.areEqual(this.fit_upto_desc, vahanOwnerDetails.fit_upto_desc) && Intrinsics.areEqual(this.flag, vahanOwnerDetails.flag) && Intrinsics.areEqual(this.regnNo, vahanOwnerDetails.regnNo) && Intrinsics.areEqual(this.floor_area, vahanOwnerDetails.floor_area) && Intrinsics.areEqual(this.formatRegn_dt, vahanOwnerDetails.formatRegn_dt) && Intrinsics.areEqual(this.fuel, vahanOwnerDetails.fuel) && Intrinsics.areEqual(this.fuel_descr, vahanOwnerDetails.fuel_descr) && Intrinsics.areEqual(this.garage_add, vahanOwnerDetails.garage_add) && Intrinsics.areEqual(this.gcw, vahanOwnerDetails.gcw) && Intrinsics.areEqual(this.height, vahanOwnerDetails.height) && Intrinsics.areEqual(this.hp, vahanOwnerDetails.hp) && Intrinsics.areEqual(this.imported_vch, vahanOwnerDetails.imported_vch) && Intrinsics.areEqual(this.laser_code, vahanOwnerDetails.laser_code) && Intrinsics.areEqual(this.ld_wt, vahanOwnerDetails.ld_wt) && Intrinsics.areEqual(this.length, vahanOwnerDetails.length) && Intrinsics.areEqual(this.maker, vahanOwnerDetails.maker) && Intrinsics.areEqual(this.maker_name, vahanOwnerDetails.maker_name) && Intrinsics.areEqual(this.manu_mon, vahanOwnerDetails.manu_mon) && Intrinsics.areEqual(this.manu_yr, vahanOwnerDetails.manu_yr) && Intrinsics.areEqual(this.mobileNoEditable, vahanOwnerDetails.mobileNoEditable) && Intrinsics.areEqual(this.mobile_no, vahanOwnerDetails.mobile_no) && Intrinsics.areEqual(this.model_cd, vahanOwnerDetails.model_cd) && Intrinsics.areEqual(this.model_name, vahanOwnerDetails.model_name) && Intrinsics.areEqual(this.no_cyl, vahanOwnerDetails.no_cyl) && Intrinsics.areEqual(this.no_of_axles, vahanOwnerDetails.no_of_axles) && Intrinsics.areEqual(this.norms, vahanOwnerDetails.norms) && Intrinsics.areEqual(this.norms_descr, vahanOwnerDetails.norms_descr) && Intrinsics.areEqual(this.numberOfTyres, vahanOwnerDetails.numberOfTyres) && Intrinsics.areEqual(this.off_cd, vahanOwnerDetails.off_cd) && Intrinsics.areEqual(this.off_name, vahanOwnerDetails.off_name) && Intrinsics.areEqual(this.op_dt, vahanOwnerDetails.op_dt) && Intrinsics.areEqual(this.other_criteria, vahanOwnerDetails.other_criteria) && Intrinsics.areEqual(this.ownerCatg, vahanOwnerDetails.ownerCatg) && Intrinsics.areEqual(this.owner_cd, vahanOwnerDetails.owner_cd) && Intrinsics.areEqual(this.owner_cd_descr, vahanOwnerDetails.owner_cd_descr) && Intrinsics.areEqual(this.owner_ctg, vahanOwnerDetails.owner_ctg) && Intrinsics.areEqual(this.owner_name, vahanOwnerDetails.owner_name) && Intrinsics.areEqual(this.owner_sr, vahanOwnerDetails.owner_sr) && Intrinsics.areEqual(this.p_add1, vahanOwnerDetails.p_add1) && Intrinsics.areEqual(this.p_add2, vahanOwnerDetails.p_add2) && Intrinsics.areEqual(this.p_add3, vahanOwnerDetails.p_add3) && Intrinsics.areEqual(this.p_district, vahanOwnerDetails.p_district) && Intrinsics.areEqual(this.p_district_name, vahanOwnerDetails.p_district_name) && Intrinsics.areEqual(this.p_pincode, vahanOwnerDetails.p_pincode) && Intrinsics.areEqual(this.p_state, vahanOwnerDetails.p_state) && Intrinsics.areEqual(this.p_state_name, vahanOwnerDetails.p_state_name) && Intrinsics.areEqual(this.pan_no, vahanOwnerDetails.pan_no) && Intrinsics.areEqual(this.passport_no, vahanOwnerDetails.passport_no) && Intrinsics.areEqual(this.permit_rto_cd, vahanOwnerDetails.permit_rto_cd) && Intrinsics.areEqual(this.purchase_dt, vahanOwnerDetails.purchase_dt) && Intrinsics.areEqual(this.ration_card_no, vahanOwnerDetails.ration_card_no) && Intrinsics.areEqual(this.regn_dt, vahanOwnerDetails.regn_dt) && Intrinsics.areEqual(this.regn_dtAsDate, vahanOwnerDetails.regn_dtAsDate) && Intrinsics.areEqual(this.regn_no, vahanOwnerDetails.regn_no) && Intrinsics.areEqual(this.regn_type, vahanOwnerDetails.regn_type) && Intrinsics.areEqual(this.regn_type_descr, vahanOwnerDetails.regn_type_descr) && Intrinsics.areEqual(this.regn_upto, vahanOwnerDetails.regn_upto) && Intrinsics.areEqual(this.regn_uptoAsDate, vahanOwnerDetails.regn_uptoAsDate) && Intrinsics.areEqual(this.returnMessge, vahanOwnerDetails.returnMessge) && Intrinsics.areEqual(this.sale_amt, vahanOwnerDetails.sale_amt) && Intrinsics.areEqual(this.seat_cap, vahanOwnerDetails.seat_cap) && Intrinsics.areEqual(this.sleeper_cap, vahanOwnerDetails.sleeper_cap) && Intrinsics.areEqual(this.stand_cap, vahanOwnerDetails.stand_cap) && Intrinsics.areEqual(this.state_cd, vahanOwnerDetails.state_cd) && Intrinsics.areEqual(this.state_name, vahanOwnerDetails.state_name) && Intrinsics.areEqual(this.status, vahanOwnerDetails.status) && Intrinsics.areEqual(this.tax_mode, vahanOwnerDetails.tax_mode) && Intrinsics.areEqual(this.transport_catg, vahanOwnerDetails.transport_catg) && Intrinsics.areEqual(this.unld_wt, vahanOwnerDetails.unld_wt) && Intrinsics.areEqual(this.vch_catg, vahanOwnerDetails.vch_catg) && Intrinsics.areEqual(this.vch_catg_desc, vahanOwnerDetails.vch_catg_desc) && Intrinsics.areEqual(this.vch_purchase_as, vahanOwnerDetails.vch_purchase_as) && Intrinsics.areEqual(this.vch_purchase_asCode, vahanOwnerDetails.vch_purchase_asCode) && Intrinsics.areEqual(this.vehType, vahanOwnerDetails.vehType) && Intrinsics.areEqual(this.vehTypeAsInt, vahanOwnerDetails.vehTypeAsInt) && Intrinsics.areEqual(this.vh_class, vahanOwnerDetails.vh_class) && Intrinsics.areEqual(this.vh_class_desc, vahanOwnerDetails.vh_class_desc) && Intrinsics.areEqual(this.video_fitted, vahanOwnerDetails.video_fitted) && Intrinsics.areEqual(this.voter_id, vahanOwnerDetails.voter_id) && Intrinsics.areEqual(this.wheelbase, vahanOwnerDetails.wheelbase) && Intrinsics.areEqual(this.width, vahanOwnerDetails.width);
    }

    public final String getAadhar_no() {
        return this.aadhar_no;
    }

    public final String getAc_fitted() {
        return this.ac_fitted;
    }

    public final String getAnnual_income() {
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

    public final String getC_district() {
        return this.c_district;
    }

    public final String getC_district_name() {
        return this.c_district_name;
    }

    public final String getC_off_cd() {
        return this.c_off_cd;
    }

    public final String getC_pincode() {
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

    public final String getChasi_no_original() {
        return this.chasi_no_original;
    }

    public final String getColor() {
        return this.color;
    }

    public final String getConditionstatus() {
        return this.conditionstatus;
    }

    public final String getCubic_cap() {
        return this.cubic_cap;
    }

    public final String getDealer_cd() {
        return this.dealer_cd;
    }

    public final String getDept_cd() {
        return this.dept_cd;
    }

    public final String getDlRequired() {
        return this.dlRequired;
    }

    public final String getDlValidationRequired() {
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

    public final String getEng_no_original() {
        return this.eng_no_original;
    }

    public final String getEng_no_orignal() {
        return this.eng_no_orignal;
    }

    public final String getF_name() {
        return this.f_name;
    }

    public final String getFit_upto() {
        return this.fit_upto;
    }

    public final String getFit_uptoAsDate() {
        return this.fit_uptoAsDate;
    }

    public final String getFit_upto_desc() {
        return this.fit_upto_desc;
    }

    public final String getFlag() {
        return this.flag;
    }

    public final String getFloor_area() {
        return this.floor_area;
    }

    public final String getFormatRegn_dt() {
        return this.formatRegn_dt;
    }

    public final String getFuel() {
        return this.fuel;
    }

    public final String getFuel_descr() {
        return this.fuel_descr;
    }

    public final String getGarage_add() {
        return this.garage_add;
    }

    public final String getGcw() {
        return this.gcw;
    }

    public final String getHeight() {
        return this.height;
    }

    public final String getHp() {
        return this.hp;
    }

    public final String getImported_vch() {
        return this.imported_vch;
    }

    public final String getLaser_code() {
        return this.laser_code;
    }

    public final String getLd_wt() {
        return this.ld_wt;
    }

    public final String getLength() {
        return this.length;
    }

    public final String getMaker() {
        return this.maker;
    }

    public final String getMaker_name() {
        return this.maker_name;
    }

    public final String getManu_mon() {
        return this.manu_mon;
    }

    public final String getManu_yr() {
        return this.manu_yr;
    }

    public final String getMobileNoEditable() {
        return this.mobileNoEditable;
    }

    public final String getMobile_no() {
        return this.mobile_no;
    }

    public final String getModel_cd() {
        return this.model_cd;
    }

    public final String getModel_name() {
        return this.model_name;
    }

    public final String getNo_cyl() {
        return this.no_cyl;
    }

    public final String getNo_of_axles() {
        return this.no_of_axles;
    }

    public final String getNorms() {
        return this.norms;
    }

    public final String getNorms_descr() {
        return this.norms_descr;
    }

    public final String getNumberOfTyres() {
        return this.numberOfTyres;
    }

    public final String getOff_cd() {
        return this.off_cd;
    }

    public final String getOff_name() {
        return this.off_name;
    }

    public final String getOp_dt() {
        return this.op_dt;
    }

    public final String getOther_criteria() {
        return this.other_criteria;
    }

    public final String getOwnerCatg() {
        return this.ownerCatg;
    }

    public final String getOwner_cd() {
        return this.owner_cd;
    }

    public final String getOwner_cd_descr() {
        return this.owner_cd_descr;
    }

    public final String getOwner_ctg() {
        return this.owner_ctg;
    }

    public final String getOwner_name() {
        return this.owner_name;
    }

    public final String getOwner_sr() {
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

    public final String getP_district() {
        return this.p_district;
    }

    public final String getP_district_name() {
        return this.p_district_name;
    }

    public final String getP_pincode() {
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

    public final String getPermit_rto_cd() {
        return this.permit_rto_cd;
    }

    public final String getPurchase_dt() {
        return this.purchase_dt;
    }

    public final String getRation_card_no() {
        return this.ration_card_no;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final String getRegn_dt() {
        return this.regn_dt;
    }

    public final String getRegn_dtAsDate() {
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

    public final String getRegn_uptoAsDate() {
        return this.regn_uptoAsDate;
    }

    public final String getReturnMessge() {
        return this.returnMessge;
    }

    public final String getSale_amt() {
        return this.sale_amt;
    }

    public final String getSeat_cap() {
        return this.seat_cap;
    }

    public final String getSleeper_cap() {
        return this.sleeper_cap;
    }

    public final String getStand_cap() {
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

    public final String getTransport_catg() {
        return this.transport_catg;
    }

    public final String getUnld_wt() {
        return this.unld_wt;
    }

    public final String getVch_catg() {
        return this.vch_catg;
    }

    public final String getVch_catg_desc() {
        return this.vch_catg_desc;
    }

    public final String getVch_purchase_as() {
        return this.vch_purchase_as;
    }

    public final String getVch_purchase_asCode() {
        return this.vch_purchase_asCode;
    }

    public final String getVehType() {
        return this.vehType;
    }

    public final Integer getVehTypeAsInt() {
        return this.vehTypeAsInt;
    }

    public final String getVh_class() {
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

    public final String getWheelbase() {
        return this.wheelbase;
    }

    public final String getWidth() {
        return this.width;
    }

    public int hashCode() {
        String str = this.aadhar_no;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.ac_fitted;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.annual_income;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.appl_no;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.audio_fitted;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.body_type;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.c_add1;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.c_add2;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.c_add3;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.c_district;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.c_district_name;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.c_off_cd;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.c_pincode;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.c_state;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.c_state_name;
        int iHashCode15 = (iHashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.chasi_no;
        int iHashCode16 = (iHashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.chasi_no_original;
        int iHashCode17 = (iHashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.color;
        int iHashCode18 = (iHashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.conditionstatus;
        int iHashCode19 = (iHashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.cubic_cap;
        int iHashCode20 = (iHashCode19 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.dealer_cd;
        int iHashCode21 = (iHashCode20 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.dept_cd;
        int iHashCode22 = (iHashCode21 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.dlRequired;
        int iHashCode23 = (iHashCode22 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.dlValidationRequired;
        int iHashCode24 = (iHashCode23 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.dl_no;
        int iHashCode25 = (iHashCode24 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.dlr_add1;
        int iHashCode26 = (iHashCode25 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.dlr_add2;
        int iHashCode27 = (iHashCode26 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.dlr_add3;
        int iHashCode28 = (iHashCode27 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.dlr_city;
        int iHashCode29 = (iHashCode28 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.dlr_district;
        int iHashCode30 = (iHashCode29 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.dlr_name;
        int iHashCode31 = (iHashCode30 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.dlr_pincode;
        int iHashCode32 = (iHashCode31 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.email_id;
        int iHashCode33 = (iHashCode32 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.eng_no;
        int iHashCode34 = (iHashCode33 + (str34 == null ? 0 : str34.hashCode())) * 31;
        String str35 = this.eng_no_original;
        int iHashCode35 = (iHashCode34 + (str35 == null ? 0 : str35.hashCode())) * 31;
        String str36 = this.eng_no_orignal;
        int iHashCode36 = (iHashCode35 + (str36 == null ? 0 : str36.hashCode())) * 31;
        String str37 = this.f_name;
        int iHashCode37 = (iHashCode36 + (str37 == null ? 0 : str37.hashCode())) * 31;
        String str38 = this.fit_upto;
        int iHashCode38 = (iHashCode37 + (str38 == null ? 0 : str38.hashCode())) * 31;
        String str39 = this.fit_uptoAsDate;
        int iHashCode39 = (iHashCode38 + (str39 == null ? 0 : str39.hashCode())) * 31;
        String str40 = this.fit_upto_desc;
        int iHashCode40 = (iHashCode39 + (str40 == null ? 0 : str40.hashCode())) * 31;
        String str41 = this.flag;
        int iHashCode41 = (iHashCode40 + (str41 == null ? 0 : str41.hashCode())) * 31;
        String str42 = this.regnNo;
        int iHashCode42 = (iHashCode41 + (str42 == null ? 0 : str42.hashCode())) * 31;
        String str43 = this.floor_area;
        int iHashCode43 = (iHashCode42 + (str43 == null ? 0 : str43.hashCode())) * 31;
        String str44 = this.formatRegn_dt;
        int iHashCode44 = (iHashCode43 + (str44 == null ? 0 : str44.hashCode())) * 31;
        String str45 = this.fuel;
        int iHashCode45 = (iHashCode44 + (str45 == null ? 0 : str45.hashCode())) * 31;
        String str46 = this.fuel_descr;
        int iHashCode46 = (iHashCode45 + (str46 == null ? 0 : str46.hashCode())) * 31;
        String str47 = this.garage_add;
        int iHashCode47 = (iHashCode46 + (str47 == null ? 0 : str47.hashCode())) * 31;
        String str48 = this.gcw;
        int iHashCode48 = (iHashCode47 + (str48 == null ? 0 : str48.hashCode())) * 31;
        String str49 = this.height;
        int iHashCode49 = (iHashCode48 + (str49 == null ? 0 : str49.hashCode())) * 31;
        String str50 = this.hp;
        int iHashCode50 = (iHashCode49 + (str50 == null ? 0 : str50.hashCode())) * 31;
        String str51 = this.imported_vch;
        int iHashCode51 = (iHashCode50 + (str51 == null ? 0 : str51.hashCode())) * 31;
        String str52 = this.laser_code;
        int iHashCode52 = (iHashCode51 + (str52 == null ? 0 : str52.hashCode())) * 31;
        String str53 = this.ld_wt;
        int iHashCode53 = (iHashCode52 + (str53 == null ? 0 : str53.hashCode())) * 31;
        String str54 = this.length;
        int iHashCode54 = (iHashCode53 + (str54 == null ? 0 : str54.hashCode())) * 31;
        String str55 = this.maker;
        int iHashCode55 = (iHashCode54 + (str55 == null ? 0 : str55.hashCode())) * 31;
        String str56 = this.maker_name;
        int iHashCode56 = (iHashCode55 + (str56 == null ? 0 : str56.hashCode())) * 31;
        String str57 = this.manu_mon;
        int iHashCode57 = (iHashCode56 + (str57 == null ? 0 : str57.hashCode())) * 31;
        String str58 = this.manu_yr;
        int iHashCode58 = (iHashCode57 + (str58 == null ? 0 : str58.hashCode())) * 31;
        String str59 = this.mobileNoEditable;
        int iHashCode59 = (iHashCode58 + (str59 == null ? 0 : str59.hashCode())) * 31;
        String str60 = this.mobile_no;
        int iHashCode60 = (iHashCode59 + (str60 == null ? 0 : str60.hashCode())) * 31;
        String str61 = this.model_cd;
        int iHashCode61 = (iHashCode60 + (str61 == null ? 0 : str61.hashCode())) * 31;
        String str62 = this.model_name;
        int iHashCode62 = (iHashCode61 + (str62 == null ? 0 : str62.hashCode())) * 31;
        String str63 = this.no_cyl;
        int iHashCode63 = (iHashCode62 + (str63 == null ? 0 : str63.hashCode())) * 31;
        String str64 = this.no_of_axles;
        int iHashCode64 = (iHashCode63 + (str64 == null ? 0 : str64.hashCode())) * 31;
        String str65 = this.norms;
        int iHashCode65 = (iHashCode64 + (str65 == null ? 0 : str65.hashCode())) * 31;
        String str66 = this.norms_descr;
        int iHashCode66 = (iHashCode65 + (str66 == null ? 0 : str66.hashCode())) * 31;
        String str67 = this.numberOfTyres;
        int iHashCode67 = (iHashCode66 + (str67 == null ? 0 : str67.hashCode())) * 31;
        String str68 = this.off_cd;
        int iHashCode68 = (iHashCode67 + (str68 == null ? 0 : str68.hashCode())) * 31;
        String str69 = this.off_name;
        int iHashCode69 = (iHashCode68 + (str69 == null ? 0 : str69.hashCode())) * 31;
        String str70 = this.op_dt;
        int iHashCode70 = (iHashCode69 + (str70 == null ? 0 : str70.hashCode())) * 31;
        String str71 = this.other_criteria;
        int iHashCode71 = (iHashCode70 + (str71 == null ? 0 : str71.hashCode())) * 31;
        String str72 = this.ownerCatg;
        int iHashCode72 = (iHashCode71 + (str72 == null ? 0 : str72.hashCode())) * 31;
        String str73 = this.owner_cd;
        int iHashCode73 = (iHashCode72 + (str73 == null ? 0 : str73.hashCode())) * 31;
        String str74 = this.owner_cd_descr;
        int iHashCode74 = (iHashCode73 + (str74 == null ? 0 : str74.hashCode())) * 31;
        String str75 = this.owner_ctg;
        int iHashCode75 = (iHashCode74 + (str75 == null ? 0 : str75.hashCode())) * 31;
        String str76 = this.owner_name;
        int iHashCode76 = (iHashCode75 + (str76 == null ? 0 : str76.hashCode())) * 31;
        String str77 = this.owner_sr;
        int iHashCode77 = (iHashCode76 + (str77 == null ? 0 : str77.hashCode())) * 31;
        String str78 = this.p_add1;
        int iHashCode78 = (iHashCode77 + (str78 == null ? 0 : str78.hashCode())) * 31;
        String str79 = this.p_add2;
        int iHashCode79 = (iHashCode78 + (str79 == null ? 0 : str79.hashCode())) * 31;
        String str80 = this.p_add3;
        int iHashCode80 = (iHashCode79 + (str80 == null ? 0 : str80.hashCode())) * 31;
        String str81 = this.p_district;
        int iHashCode81 = (iHashCode80 + (str81 == null ? 0 : str81.hashCode())) * 31;
        String str82 = this.p_district_name;
        int iHashCode82 = (iHashCode81 + (str82 == null ? 0 : str82.hashCode())) * 31;
        String str83 = this.p_pincode;
        int iHashCode83 = (iHashCode82 + (str83 == null ? 0 : str83.hashCode())) * 31;
        String str84 = this.p_state;
        int iHashCode84 = (iHashCode83 + (str84 == null ? 0 : str84.hashCode())) * 31;
        String str85 = this.p_state_name;
        int iHashCode85 = (iHashCode84 + (str85 == null ? 0 : str85.hashCode())) * 31;
        String str86 = this.pan_no;
        int iHashCode86 = (iHashCode85 + (str86 == null ? 0 : str86.hashCode())) * 31;
        String str87 = this.passport_no;
        int iHashCode87 = (iHashCode86 + (str87 == null ? 0 : str87.hashCode())) * 31;
        String str88 = this.permit_rto_cd;
        int iHashCode88 = (iHashCode87 + (str88 == null ? 0 : str88.hashCode())) * 31;
        String str89 = this.purchase_dt;
        int iHashCode89 = (iHashCode88 + (str89 == null ? 0 : str89.hashCode())) * 31;
        String str90 = this.ration_card_no;
        int iHashCode90 = (iHashCode89 + (str90 == null ? 0 : str90.hashCode())) * 31;
        String str91 = this.regn_dt;
        int iHashCode91 = (iHashCode90 + (str91 == null ? 0 : str91.hashCode())) * 31;
        String str92 = this.regn_dtAsDate;
        int iHashCode92 = (iHashCode91 + (str92 == null ? 0 : str92.hashCode())) * 31;
        String str93 = this.regn_no;
        int iHashCode93 = (iHashCode92 + (str93 == null ? 0 : str93.hashCode())) * 31;
        String str94 = this.regn_type;
        int iHashCode94 = (iHashCode93 + (str94 == null ? 0 : str94.hashCode())) * 31;
        String str95 = this.regn_type_descr;
        int iHashCode95 = (iHashCode94 + (str95 == null ? 0 : str95.hashCode())) * 31;
        String str96 = this.regn_upto;
        int iHashCode96 = (iHashCode95 + (str96 == null ? 0 : str96.hashCode())) * 31;
        String str97 = this.regn_uptoAsDate;
        int iHashCode97 = (iHashCode96 + (str97 == null ? 0 : str97.hashCode())) * 31;
        String str98 = this.returnMessge;
        int iHashCode98 = (iHashCode97 + (str98 == null ? 0 : str98.hashCode())) * 31;
        String str99 = this.sale_amt;
        int iHashCode99 = (iHashCode98 + (str99 == null ? 0 : str99.hashCode())) * 31;
        String str100 = this.seat_cap;
        int iHashCode100 = (iHashCode99 + (str100 == null ? 0 : str100.hashCode())) * 31;
        String str101 = this.sleeper_cap;
        int iHashCode101 = (iHashCode100 + (str101 == null ? 0 : str101.hashCode())) * 31;
        String str102 = this.stand_cap;
        int iHashCode102 = (iHashCode101 + (str102 == null ? 0 : str102.hashCode())) * 31;
        String str103 = this.state_cd;
        int iHashCode103 = (iHashCode102 + (str103 == null ? 0 : str103.hashCode())) * 31;
        String str104 = this.state_name;
        int iHashCode104 = (iHashCode103 + (str104 == null ? 0 : str104.hashCode())) * 31;
        String str105 = this.status;
        int iHashCode105 = (iHashCode104 + (str105 == null ? 0 : str105.hashCode())) * 31;
        String str106 = this.tax_mode;
        int iHashCode106 = (iHashCode105 + (str106 == null ? 0 : str106.hashCode())) * 31;
        String str107 = this.transport_catg;
        int iHashCode107 = (iHashCode106 + (str107 == null ? 0 : str107.hashCode())) * 31;
        String str108 = this.unld_wt;
        int iHashCode108 = (iHashCode107 + (str108 == null ? 0 : str108.hashCode())) * 31;
        String str109 = this.vch_catg;
        int iHashCode109 = (iHashCode108 + (str109 == null ? 0 : str109.hashCode())) * 31;
        String str110 = this.vch_catg_desc;
        int iHashCode110 = (iHashCode109 + (str110 == null ? 0 : str110.hashCode())) * 31;
        String str111 = this.vch_purchase_as;
        int iHashCode111 = (iHashCode110 + (str111 == null ? 0 : str111.hashCode())) * 31;
        String str112 = this.vch_purchase_asCode;
        int iHashCode112 = (iHashCode111 + (str112 == null ? 0 : str112.hashCode())) * 31;
        String str113 = this.vehType;
        int iHashCode113 = (iHashCode112 + (str113 == null ? 0 : str113.hashCode())) * 31;
        Integer num = this.vehTypeAsInt;
        int iHashCode114 = (iHashCode113 + (num == null ? 0 : num.hashCode())) * 31;
        String str114 = this.vh_class;
        int iHashCode115 = (iHashCode114 + (str114 == null ? 0 : str114.hashCode())) * 31;
        String str115 = this.vh_class_desc;
        int iHashCode116 = (iHashCode115 + (str115 == null ? 0 : str115.hashCode())) * 31;
        String str116 = this.video_fitted;
        int iHashCode117 = (iHashCode116 + (str116 == null ? 0 : str116.hashCode())) * 31;
        String str117 = this.voter_id;
        int iHashCode118 = (iHashCode117 + (str117 == null ? 0 : str117.hashCode())) * 31;
        String str118 = this.wheelbase;
        int iHashCode119 = (iHashCode118 + (str118 == null ? 0 : str118.hashCode())) * 31;
        String str119 = this.width;
        return iHashCode119 + (str119 != null ? str119.hashCode() : 0);
    }

    public String toString() {
        return "VahanOwnerDetails(aadhar_no=" + this.aadhar_no + ", ac_fitted=" + this.ac_fitted + ", annual_income=" + this.annual_income + ", appl_no=" + this.appl_no + ", audio_fitted=" + this.audio_fitted + ", body_type=" + this.body_type + ", c_add1=" + this.c_add1 + ", c_add2=" + this.c_add2 + ", c_add3=" + this.c_add3 + ", c_district=" + this.c_district + ", c_district_name=" + this.c_district_name + ", c_off_cd=" + this.c_off_cd + ", c_pincode=" + this.c_pincode + ", c_state=" + this.c_state + ", c_state_name=" + this.c_state_name + ", chasi_no=" + this.chasi_no + ", chasi_no_original=" + this.chasi_no_original + ", color=" + this.color + ", conditionstatus=" + this.conditionstatus + ", cubic_cap=" + this.cubic_cap + ", dealer_cd=" + this.dealer_cd + ", dept_cd=" + this.dept_cd + ", dlRequired=" + this.dlRequired + ", dlValidationRequired=" + this.dlValidationRequired + ", dl_no=" + this.dl_no + ", dlr_add1=" + this.dlr_add1 + ", dlr_add2=" + this.dlr_add2 + ", dlr_add3=" + this.dlr_add3 + ", dlr_city=" + this.dlr_city + ", dlr_district=" + this.dlr_district + ", dlr_name=" + this.dlr_name + ", dlr_pincode=" + this.dlr_pincode + ", email_id=" + this.email_id + ", eng_no=" + this.eng_no + ", eng_no_original=" + this.eng_no_original + ", eng_no_orignal=" + this.eng_no_orignal + ", f_name=" + this.f_name + ", fit_upto=" + this.fit_upto + ", fit_uptoAsDate=" + this.fit_uptoAsDate + ", fit_upto_desc=" + this.fit_upto_desc + ", flag=" + this.flag + ", regnNo=" + this.regnNo + ", floor_area=" + this.floor_area + ", formatRegn_dt=" + this.formatRegn_dt + ", fuel=" + this.fuel + ", fuel_descr=" + this.fuel_descr + ", garage_add=" + this.garage_add + ", gcw=" + this.gcw + ", height=" + this.height + ", hp=" + this.hp + ", imported_vch=" + this.imported_vch + ", laser_code=" + this.laser_code + ", ld_wt=" + this.ld_wt + ", length=" + this.length + ", maker=" + this.maker + ", maker_name=" + this.maker_name + ", manu_mon=" + this.manu_mon + ", manu_yr=" + this.manu_yr + ", mobileNoEditable=" + this.mobileNoEditable + ", mobile_no=" + this.mobile_no + ", model_cd=" + this.model_cd + ", model_name=" + this.model_name + ", no_cyl=" + this.no_cyl + ", no_of_axles=" + this.no_of_axles + ", norms=" + this.norms + ", norms_descr=" + this.norms_descr + ", numberOfTyres=" + this.numberOfTyres + ", off_cd=" + this.off_cd + ", off_name=" + this.off_name + ", op_dt=" + this.op_dt + ", other_criteria=" + this.other_criteria + ", ownerCatg=" + this.ownerCatg + ", owner_cd=" + this.owner_cd + ", owner_cd_descr=" + this.owner_cd_descr + ", owner_ctg=" + this.owner_ctg + ", owner_name=" + this.owner_name + ", owner_sr=" + this.owner_sr + ", p_add1=" + this.p_add1 + ", p_add2=" + this.p_add2 + ", p_add3=" + this.p_add3 + ", p_district=" + this.p_district + ", p_district_name=" + this.p_district_name + ", p_pincode=" + this.p_pincode + ", p_state=" + this.p_state + ", p_state_name=" + this.p_state_name + ", pan_no=" + this.pan_no + ", passport_no=" + this.passport_no + ", permit_rto_cd=" + this.permit_rto_cd + ", purchase_dt=" + this.purchase_dt + ", ration_card_no=" + this.ration_card_no + ", regn_dt=" + this.regn_dt + ", regn_dtAsDate=" + this.regn_dtAsDate + ", regn_no=" + this.regn_no + ", regn_type=" + this.regn_type + ", regn_type_descr=" + this.regn_type_descr + ", regn_upto=" + this.regn_upto + ", regn_uptoAsDate=" + this.regn_uptoAsDate + ", returnMessge=" + this.returnMessge + ", sale_amt=" + this.sale_amt + ", seat_cap=" + this.seat_cap + ", sleeper_cap=" + this.sleeper_cap + ", stand_cap=" + this.stand_cap + ", state_cd=" + this.state_cd + ", state_name=" + this.state_name + ", status=" + this.status + ", tax_mode=" + this.tax_mode + ", transport_catg=" + this.transport_catg + ", unld_wt=" + this.unld_wt + ", vch_catg=" + this.vch_catg + ", vch_catg_desc=" + this.vch_catg_desc + ", vch_purchase_as=" + this.vch_purchase_as + ", vch_purchase_asCode=" + this.vch_purchase_asCode + ", vehType=" + this.vehType + ", vehTypeAsInt=" + this.vehTypeAsInt + ", vh_class=" + this.vh_class + ", vh_class_desc=" + this.vh_class_desc + ", video_fitted=" + this.video_fitted + ", voter_id=" + this.voter_id + ", wheelbase=" + this.wheelbase + ", width=" + this.width + ')';
    }
}
