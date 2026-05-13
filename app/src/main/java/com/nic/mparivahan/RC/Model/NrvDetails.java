package com.nic.mparivahan.RC.Model;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000'\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0003\bÓ\u0001\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B£\u0005\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\b\u00100\u001a\u0004\u0018\u00010\u0003\u0012\b\u00101\u001a\u0004\u0018\u00010\u0003\u0012\b\u00102\u001a\u0004\u0018\u00010\u0003\u0012\b\u00103\u001a\u0004\u0018\u00010\u0003\u0012\b\u00104\u001a\u0004\u0018\u00010\u0003\u0012\b\u00105\u001a\u0004\u0018\u00010\u0003\u0012\b\u00106\u001a\u0004\u0018\u00010\u0003\u0012\b\u00107\u001a\u0004\u0018\u00010\u0003\u0012\b\u00108\u001a\u0004\u0018\u00010\u0003\u0012\b\u00109\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010:\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010;\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010<\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010=\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010>\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010?\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010@\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010A\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010B\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010C\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010D\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010E\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010FJ\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010 \u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¡\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¢\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010£\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¤\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¥\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¦\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010§\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¨\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010©\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ª\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010«\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¬\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010®\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¯\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010°\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010±\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010²\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010³\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010´\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010µ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¶\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010·\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¸\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¹\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010º\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010»\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¼\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010½\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¾\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¿\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010À\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Á\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Â\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ã\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ä\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Å\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Æ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ç\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010È\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010É\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ê\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ë\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ì\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Í\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Î\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ï\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ð\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ñ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ò\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ó\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ô\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J®\u0006\u0010Õ\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0017\u0010Ö\u0001\u001a\u00030×\u00012\n\u0010Ø\u0001\u001a\u0005\u0018\u00010Ù\u0001HÖ\u0003J\u000b\u0010Ú\u0001\u001a\u00030Û\u0001HÖ\u0001J\n\u0010Ü\u0001\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bI\u0010HR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010HR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bK\u0010HR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bL\u0010HR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bM\u0010HR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bN\u0010HR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bO\u0010HR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bP\u0010HR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010HR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bR\u0010HR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010H\"\u0004\bT\u0010UR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bV\u0010HR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bW\u0010HR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bX\u0010HR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bY\u0010HR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010HR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010H\"\u0004\b\\\u0010UR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b]\u0010HR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b^\u0010HR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b_\u0010HR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b`\u0010HR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\ba\u0010HR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bb\u0010HR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bc\u0010HR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bd\u0010HR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\be\u0010HR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bf\u0010HR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bg\u0010HR\u0013\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bh\u0010HR\u0013\u0010!\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bi\u0010HR\u0013\u0010\"\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bj\u0010HR\u0013\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bk\u0010HR\u0013\u0010$\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bl\u0010HR\u0013\u0010%\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bm\u0010HR\u001c\u0010&\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010H\"\u0004\bo\u0010UR\u0013\u0010'\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bp\u0010HR\u0013\u0010D\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bq\u0010HR\u0013\u0010(\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\br\u0010HR\u0013\u0010)\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bs\u0010HR\u0013\u0010*\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bt\u0010HR\u0013\u0010+\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bu\u0010HR\u0013\u0010,\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bv\u0010HR\u0013\u0010-\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bw\u0010HR\u0013\u0010.\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bx\u0010HR\u001c\u0010/\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\by\u0010H\"\u0004\bz\u0010UR\u0013\u00100\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b{\u0010HR\u0013\u00101\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b|\u0010HR\u001c\u00102\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b}\u0010H\"\u0004\b~\u0010UR\u0013\u00103\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010HR\u0014\u00104\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010HR\u0014\u00105\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010HR\u0014\u00106\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010HR\u0014\u00107\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0083\u0001\u0010HR\u0014\u00108\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0084\u0001\u0010HR\u0014\u00109\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0085\u0001\u0010HR\u0014\u0010:\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0086\u0001\u0010HR\u0014\u0010;\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0087\u0001\u0010HR\u001e\u0010<\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0088\u0001\u0010H\"\u0005\b\u0089\u0001\u0010UR\u0014\u0010=\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u008a\u0001\u0010HR\u0014\u0010>\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u008b\u0001\u0010HR\u0014\u0010?\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u008c\u0001\u0010HR\u0014\u0010@\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u008d\u0001\u0010HR\u0014\u0010A\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u008e\u0001\u0010HR\u0014\u0010B\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u008f\u0001\u0010HR\u0014\u0010C\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0090\u0001\u0010HR\u0014\u0010E\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0091\u0001\u0010H¨\u0006Ý\u0001"}, d2 = {"Lcom/nic/mparivahan/RC/Model/NrvDetails;", "Ljava/io/Serializable;", "rc_blacklist_status", "", "rc_body_type_desc", "rc_c_state", "rc_chasi_no", "rc_color", "rc_cubic_cap", "rc_email_id", "rc_eng_no", "rc_f_name", "rc_financed_from", "rc_financer", "rc_fit_upto", "rc_fuel_cd", "rc_fuel_desc", "rc_gvw", "rc_insurance_comp", "rc_insurance_policy_no", "rc_insurance_upto", "rc_maker_cd", "rc_maker_desc", "rc_maker_model", "rc_manu_month", "rc_manu_month_yr", "rc_manu_yr", "rc_mobile_no", "rc_ncrb_status", "rc_no_cyl", "rc_noc_details", "rc_non_use_from", "rc_non_use_status", "rc_non_use_to", "rc_norms_cd", "rc_norms_desc", "rc_np_issued_by", "rc_np_no", "rc_np_upto", "rc_off_cd", "rc_owner_name", "rc_owner_sr", "rc_permanent_address", "rc_permit_issue_dt", "rc_permit_no", "rc_permit_type", "rc_permit_valid_from", "rc_permit_valid_upto", "rc_present_address", "rc_pucc_no", "rc_pucc_upto", "rc_registered_at", "rc_regn_dt", "rc_regn_no", "rc_regn_type", "rc_seat_cap", "rc_sleeper_cap", "rc_stand_cap", "rc_status", "rc_status_as_on", "rc_tax_upto", "rc_unld_wt", "rc_vch_catg", "rc_vch_catg_desc", "rc_vh_class_cd", "rc_vh_class_desc", "rc_wheelbase", "state_cd", "rc_owner_desc", "stautsMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRc_blacklist_status", "()Ljava/lang/String;", "getRc_body_type_desc", "getRc_c_state", "getRc_chasi_no", "getRc_color", "getRc_cubic_cap", "getRc_email_id", "getRc_eng_no", "getRc_f_name", "getRc_financed_from", "getRc_financer", "getRc_fit_upto", "setRc_fit_upto", "(Ljava/lang/String;)V", "getRc_fuel_cd", "getRc_fuel_desc", "getRc_gvw", "getRc_insurance_comp", "getRc_insurance_policy_no", "getRc_insurance_upto", "setRc_insurance_upto", "getRc_maker_cd", "getRc_maker_desc", "getRc_maker_model", "getRc_manu_month", "getRc_manu_month_yr", "getRc_manu_yr", "getRc_mobile_no", "getRc_ncrb_status", "getRc_no_cyl", "getRc_noc_details", "getRc_non_use_from", "getRc_non_use_status", "getRc_non_use_to", "getRc_norms_cd", "getRc_norms_desc", "getRc_np_issued_by", "getRc_np_no", "getRc_np_upto", "setRc_np_upto", "getRc_off_cd", "getRc_owner_desc", "getRc_owner_name", "getRc_owner_sr", "getRc_permanent_address", "getRc_permit_issue_dt", "getRc_permit_no", "getRc_permit_type", "getRc_permit_valid_from", "getRc_permit_valid_upto", "setRc_permit_valid_upto", "getRc_present_address", "getRc_pucc_no", "getRc_pucc_upto", "setRc_pucc_upto", "getRc_registered_at", "getRc_regn_dt", "getRc_regn_no", "getRc_regn_type", "getRc_seat_cap", "getRc_sleeper_cap", "getRc_stand_cap", "getRc_status", "getRc_status_as_on", "getRc_tax_upto", "setRc_tax_upto", "getRc_unld_wt", "getRc_vch_catg", "getRc_vch_catg_desc", "getRc_vh_class_cd", "getRc_vh_class_desc", "getRc_wheelbase", "getState_cd", "getStautsMessage", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component6", "component60", "component61", "component62", "component63", "component64", "component65", "component66", "component67", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class NrvDetails implements Serializable {
    private final String rc_blacklist_status;
    private final String rc_body_type_desc;
    private final String rc_c_state;
    private final String rc_chasi_no;
    private final String rc_color;
    private final String rc_cubic_cap;
    private final String rc_email_id;
    private final String rc_eng_no;
    private final String rc_f_name;
    private final String rc_financed_from;
    private final String rc_financer;
    private String rc_fit_upto;
    private final String rc_fuel_cd;
    private final String rc_fuel_desc;
    private final String rc_gvw;
    private final String rc_insurance_comp;
    private final String rc_insurance_policy_no;
    private String rc_insurance_upto;
    private final String rc_maker_cd;
    private final String rc_maker_desc;
    private final String rc_maker_model;
    private final String rc_manu_month;
    private final String rc_manu_month_yr;
    private final String rc_manu_yr;
    private final String rc_mobile_no;
    private final String rc_ncrb_status;
    private final String rc_no_cyl;
    private final String rc_noc_details;
    private final String rc_non_use_from;
    private final String rc_non_use_status;
    private final String rc_non_use_to;
    private final String rc_norms_cd;
    private final String rc_norms_desc;
    private final String rc_np_issued_by;
    private final String rc_np_no;
    private String rc_np_upto;
    private final String rc_off_cd;
    private final String rc_owner_desc;
    private final String rc_owner_name;
    private final String rc_owner_sr;
    private final String rc_permanent_address;
    private final String rc_permit_issue_dt;
    private final String rc_permit_no;
    private final String rc_permit_type;
    private final String rc_permit_valid_from;
    private String rc_permit_valid_upto;
    private final String rc_present_address;
    private final String rc_pucc_no;
    private String rc_pucc_upto;
    private final String rc_registered_at;
    private final String rc_regn_dt;
    private final String rc_regn_no;
    private final String rc_regn_type;
    private final String rc_seat_cap;
    private final String rc_sleeper_cap;
    private final String rc_stand_cap;
    private final String rc_status;
    private final String rc_status_as_on;
    private String rc_tax_upto;
    private final String rc_unld_wt;
    private final String rc_vch_catg;
    private final String rc_vch_catg_desc;
    private final String rc_vh_class_cd;
    private final String rc_vh_class_desc;
    private final String rc_wheelbase;
    private final String state_cd;
    private final String stautsMessage;

    public NrvDetails(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58, String str59, String str60, String str61, String str62, String str63, String str64, String str65, String str66, String str67) {
        this.rc_blacklist_status = str;
        this.rc_body_type_desc = str2;
        this.rc_c_state = str3;
        this.rc_chasi_no = str4;
        this.rc_color = str5;
        this.rc_cubic_cap = str6;
        this.rc_email_id = str7;
        this.rc_eng_no = str8;
        this.rc_f_name = str9;
        this.rc_financed_from = str10;
        this.rc_financer = str11;
        this.rc_fit_upto = str12;
        this.rc_fuel_cd = str13;
        this.rc_fuel_desc = str14;
        this.rc_gvw = str15;
        this.rc_insurance_comp = str16;
        this.rc_insurance_policy_no = str17;
        this.rc_insurance_upto = str18;
        this.rc_maker_cd = str19;
        this.rc_maker_desc = str20;
        this.rc_maker_model = str21;
        this.rc_manu_month = str22;
        this.rc_manu_month_yr = str23;
        this.rc_manu_yr = str24;
        this.rc_mobile_no = str25;
        this.rc_ncrb_status = str26;
        this.rc_no_cyl = str27;
        this.rc_noc_details = str28;
        this.rc_non_use_from = str29;
        this.rc_non_use_status = str30;
        this.rc_non_use_to = str31;
        this.rc_norms_cd = str32;
        this.rc_norms_desc = str33;
        this.rc_np_issued_by = str34;
        this.rc_np_no = str35;
        this.rc_np_upto = str36;
        this.rc_off_cd = str37;
        this.rc_owner_name = str38;
        this.rc_owner_sr = str39;
        this.rc_permanent_address = str40;
        this.rc_permit_issue_dt = str41;
        this.rc_permit_no = str42;
        this.rc_permit_type = str43;
        this.rc_permit_valid_from = str44;
        this.rc_permit_valid_upto = str45;
        this.rc_present_address = str46;
        this.rc_pucc_no = str47;
        this.rc_pucc_upto = str48;
        this.rc_registered_at = str49;
        this.rc_regn_dt = str50;
        this.rc_regn_no = str51;
        this.rc_regn_type = str52;
        this.rc_seat_cap = str53;
        this.rc_sleeper_cap = str54;
        this.rc_stand_cap = str55;
        this.rc_status = str56;
        this.rc_status_as_on = str57;
        this.rc_tax_upto = str58;
        this.rc_unld_wt = str59;
        this.rc_vch_catg = str60;
        this.rc_vch_catg_desc = str61;
        this.rc_vh_class_cd = str62;
        this.rc_vh_class_desc = str63;
        this.rc_wheelbase = str64;
        this.state_cd = str65;
        this.rc_owner_desc = str66;
        this.stautsMessage = str67;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRc_blacklist_status() {
        return this.rc_blacklist_status;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getRc_financed_from() {
        return this.rc_financed_from;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getRc_financer() {
        return this.rc_financer;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getRc_fit_upto() {
        return this.rc_fit_upto;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getRc_fuel_cd() {
        return this.rc_fuel_cd;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getRc_fuel_desc() {
        return this.rc_fuel_desc;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getRc_gvw() {
        return this.rc_gvw;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getRc_insurance_comp() {
        return this.rc_insurance_comp;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getRc_insurance_policy_no() {
        return this.rc_insurance_policy_no;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getRc_insurance_upto() {
        return this.rc_insurance_upto;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getRc_maker_cd() {
        return this.rc_maker_cd;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRc_body_type_desc() {
        return this.rc_body_type_desc;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getRc_maker_desc() {
        return this.rc_maker_desc;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getRc_maker_model() {
        return this.rc_maker_model;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getRc_manu_month() {
        return this.rc_manu_month;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getRc_manu_month_yr() {
        return this.rc_manu_month_yr;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getRc_manu_yr() {
        return this.rc_manu_yr;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getRc_mobile_no() {
        return this.rc_mobile_no;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getRc_ncrb_status() {
        return this.rc_ncrb_status;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getRc_no_cyl() {
        return this.rc_no_cyl;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getRc_noc_details() {
        return this.rc_noc_details;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getRc_non_use_from() {
        return this.rc_non_use_from;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRc_c_state() {
        return this.rc_c_state;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getRc_non_use_status() {
        return this.rc_non_use_status;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getRc_non_use_to() {
        return this.rc_non_use_to;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getRc_norms_cd() {
        return this.rc_norms_cd;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getRc_norms_desc() {
        return this.rc_norms_desc;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final String getRc_np_issued_by() {
        return this.rc_np_issued_by;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final String getRc_np_no() {
        return this.rc_np_no;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final String getRc_np_upto() {
        return this.rc_np_upto;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final String getRc_off_cd() {
        return this.rc_off_cd;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final String getRc_owner_name() {
        return this.rc_owner_name;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final String getRc_owner_sr() {
        return this.rc_owner_sr;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRc_chasi_no() {
        return this.rc_chasi_no;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final String getRc_permanent_address() {
        return this.rc_permanent_address;
    }

    /* JADX INFO: renamed from: component41, reason: from getter */
    public final String getRc_permit_issue_dt() {
        return this.rc_permit_issue_dt;
    }

    /* JADX INFO: renamed from: component42, reason: from getter */
    public final String getRc_permit_no() {
        return this.rc_permit_no;
    }

    /* JADX INFO: renamed from: component43, reason: from getter */
    public final String getRc_permit_type() {
        return this.rc_permit_type;
    }

    /* JADX INFO: renamed from: component44, reason: from getter */
    public final String getRc_permit_valid_from() {
        return this.rc_permit_valid_from;
    }

    /* JADX INFO: renamed from: component45, reason: from getter */
    public final String getRc_permit_valid_upto() {
        return this.rc_permit_valid_upto;
    }

    /* JADX INFO: renamed from: component46, reason: from getter */
    public final String getRc_present_address() {
        return this.rc_present_address;
    }

    /* JADX INFO: renamed from: component47, reason: from getter */
    public final String getRc_pucc_no() {
        return this.rc_pucc_no;
    }

    /* JADX INFO: renamed from: component48, reason: from getter */
    public final String getRc_pucc_upto() {
        return this.rc_pucc_upto;
    }

    /* JADX INFO: renamed from: component49, reason: from getter */
    public final String getRc_registered_at() {
        return this.rc_registered_at;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRc_color() {
        return this.rc_color;
    }

    /* JADX INFO: renamed from: component50, reason: from getter */
    public final String getRc_regn_dt() {
        return this.rc_regn_dt;
    }

    /* JADX INFO: renamed from: component51, reason: from getter */
    public final String getRc_regn_no() {
        return this.rc_regn_no;
    }

    /* JADX INFO: renamed from: component52, reason: from getter */
    public final String getRc_regn_type() {
        return this.rc_regn_type;
    }

    /* JADX INFO: renamed from: component53, reason: from getter */
    public final String getRc_seat_cap() {
        return this.rc_seat_cap;
    }

    /* JADX INFO: renamed from: component54, reason: from getter */
    public final String getRc_sleeper_cap() {
        return this.rc_sleeper_cap;
    }

    /* JADX INFO: renamed from: component55, reason: from getter */
    public final String getRc_stand_cap() {
        return this.rc_stand_cap;
    }

    /* JADX INFO: renamed from: component56, reason: from getter */
    public final String getRc_status() {
        return this.rc_status;
    }

    /* JADX INFO: renamed from: component57, reason: from getter */
    public final String getRc_status_as_on() {
        return this.rc_status_as_on;
    }

    /* JADX INFO: renamed from: component58, reason: from getter */
    public final String getRc_tax_upto() {
        return this.rc_tax_upto;
    }

    /* JADX INFO: renamed from: component59, reason: from getter */
    public final String getRc_unld_wt() {
        return this.rc_unld_wt;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getRc_cubic_cap() {
        return this.rc_cubic_cap;
    }

    /* JADX INFO: renamed from: component60, reason: from getter */
    public final String getRc_vch_catg() {
        return this.rc_vch_catg;
    }

    /* JADX INFO: renamed from: component61, reason: from getter */
    public final String getRc_vch_catg_desc() {
        return this.rc_vch_catg_desc;
    }

    /* JADX INFO: renamed from: component62, reason: from getter */
    public final String getRc_vh_class_cd() {
        return this.rc_vh_class_cd;
    }

    /* JADX INFO: renamed from: component63, reason: from getter */
    public final String getRc_vh_class_desc() {
        return this.rc_vh_class_desc;
    }

    /* JADX INFO: renamed from: component64, reason: from getter */
    public final String getRc_wheelbase() {
        return this.rc_wheelbase;
    }

    /* JADX INFO: renamed from: component65, reason: from getter */
    public final String getState_cd() {
        return this.state_cd;
    }

    /* JADX INFO: renamed from: component66, reason: from getter */
    public final String getRc_owner_desc() {
        return this.rc_owner_desc;
    }

    /* JADX INFO: renamed from: component67, reason: from getter */
    public final String getStautsMessage() {
        return this.stautsMessage;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getRc_email_id() {
        return this.rc_email_id;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getRc_eng_no() {
        return this.rc_eng_no;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getRc_f_name() {
        return this.rc_f_name;
    }

    public final NrvDetails copy(String rc_blacklist_status, String rc_body_type_desc, String rc_c_state, String rc_chasi_no, String rc_color, String rc_cubic_cap, String rc_email_id, String rc_eng_no, String rc_f_name, String rc_financed_from, String rc_financer, String rc_fit_upto, String rc_fuel_cd, String rc_fuel_desc, String rc_gvw, String rc_insurance_comp, String rc_insurance_policy_no, String rc_insurance_upto, String rc_maker_cd, String rc_maker_desc, String rc_maker_model, String rc_manu_month, String rc_manu_month_yr, String rc_manu_yr, String rc_mobile_no, String rc_ncrb_status, String rc_no_cyl, String rc_noc_details, String rc_non_use_from, String rc_non_use_status, String rc_non_use_to, String rc_norms_cd, String rc_norms_desc, String rc_np_issued_by, String rc_np_no, String rc_np_upto, String rc_off_cd, String rc_owner_name, String rc_owner_sr, String rc_permanent_address, String rc_permit_issue_dt, String rc_permit_no, String rc_permit_type, String rc_permit_valid_from, String rc_permit_valid_upto, String rc_present_address, String rc_pucc_no, String rc_pucc_upto, String rc_registered_at, String rc_regn_dt, String rc_regn_no, String rc_regn_type, String rc_seat_cap, String rc_sleeper_cap, String rc_stand_cap, String rc_status, String rc_status_as_on, String rc_tax_upto, String rc_unld_wt, String rc_vch_catg, String rc_vch_catg_desc, String rc_vh_class_cd, String rc_vh_class_desc, String rc_wheelbase, String state_cd, String rc_owner_desc, String stautsMessage) {
        return new NrvDetails(rc_blacklist_status, rc_body_type_desc, rc_c_state, rc_chasi_no, rc_color, rc_cubic_cap, rc_email_id, rc_eng_no, rc_f_name, rc_financed_from, rc_financer, rc_fit_upto, rc_fuel_cd, rc_fuel_desc, rc_gvw, rc_insurance_comp, rc_insurance_policy_no, rc_insurance_upto, rc_maker_cd, rc_maker_desc, rc_maker_model, rc_manu_month, rc_manu_month_yr, rc_manu_yr, rc_mobile_no, rc_ncrb_status, rc_no_cyl, rc_noc_details, rc_non_use_from, rc_non_use_status, rc_non_use_to, rc_norms_cd, rc_norms_desc, rc_np_issued_by, rc_np_no, rc_np_upto, rc_off_cd, rc_owner_name, rc_owner_sr, rc_permanent_address, rc_permit_issue_dt, rc_permit_no, rc_permit_type, rc_permit_valid_from, rc_permit_valid_upto, rc_present_address, rc_pucc_no, rc_pucc_upto, rc_registered_at, rc_regn_dt, rc_regn_no, rc_regn_type, rc_seat_cap, rc_sleeper_cap, rc_stand_cap, rc_status, rc_status_as_on, rc_tax_upto, rc_unld_wt, rc_vch_catg, rc_vch_catg_desc, rc_vh_class_cd, rc_vh_class_desc, rc_wheelbase, state_cd, rc_owner_desc, stautsMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NrvDetails)) {
            return false;
        }
        NrvDetails nrvDetails = (NrvDetails) other;
        return Intrinsics.areEqual(this.rc_blacklist_status, nrvDetails.rc_blacklist_status) && Intrinsics.areEqual(this.rc_body_type_desc, nrvDetails.rc_body_type_desc) && Intrinsics.areEqual(this.rc_c_state, nrvDetails.rc_c_state) && Intrinsics.areEqual(this.rc_chasi_no, nrvDetails.rc_chasi_no) && Intrinsics.areEqual(this.rc_color, nrvDetails.rc_color) && Intrinsics.areEqual(this.rc_cubic_cap, nrvDetails.rc_cubic_cap) && Intrinsics.areEqual(this.rc_email_id, nrvDetails.rc_email_id) && Intrinsics.areEqual(this.rc_eng_no, nrvDetails.rc_eng_no) && Intrinsics.areEqual(this.rc_f_name, nrvDetails.rc_f_name) && Intrinsics.areEqual(this.rc_financed_from, nrvDetails.rc_financed_from) && Intrinsics.areEqual(this.rc_financer, nrvDetails.rc_financer) && Intrinsics.areEqual(this.rc_fit_upto, nrvDetails.rc_fit_upto) && Intrinsics.areEqual(this.rc_fuel_cd, nrvDetails.rc_fuel_cd) && Intrinsics.areEqual(this.rc_fuel_desc, nrvDetails.rc_fuel_desc) && Intrinsics.areEqual(this.rc_gvw, nrvDetails.rc_gvw) && Intrinsics.areEqual(this.rc_insurance_comp, nrvDetails.rc_insurance_comp) && Intrinsics.areEqual(this.rc_insurance_policy_no, nrvDetails.rc_insurance_policy_no) && Intrinsics.areEqual(this.rc_insurance_upto, nrvDetails.rc_insurance_upto) && Intrinsics.areEqual(this.rc_maker_cd, nrvDetails.rc_maker_cd) && Intrinsics.areEqual(this.rc_maker_desc, nrvDetails.rc_maker_desc) && Intrinsics.areEqual(this.rc_maker_model, nrvDetails.rc_maker_model) && Intrinsics.areEqual(this.rc_manu_month, nrvDetails.rc_manu_month) && Intrinsics.areEqual(this.rc_manu_month_yr, nrvDetails.rc_manu_month_yr) && Intrinsics.areEqual(this.rc_manu_yr, nrvDetails.rc_manu_yr) && Intrinsics.areEqual(this.rc_mobile_no, nrvDetails.rc_mobile_no) && Intrinsics.areEqual(this.rc_ncrb_status, nrvDetails.rc_ncrb_status) && Intrinsics.areEqual(this.rc_no_cyl, nrvDetails.rc_no_cyl) && Intrinsics.areEqual(this.rc_noc_details, nrvDetails.rc_noc_details) && Intrinsics.areEqual(this.rc_non_use_from, nrvDetails.rc_non_use_from) && Intrinsics.areEqual(this.rc_non_use_status, nrvDetails.rc_non_use_status) && Intrinsics.areEqual(this.rc_non_use_to, nrvDetails.rc_non_use_to) && Intrinsics.areEqual(this.rc_norms_cd, nrvDetails.rc_norms_cd) && Intrinsics.areEqual(this.rc_norms_desc, nrvDetails.rc_norms_desc) && Intrinsics.areEqual(this.rc_np_issued_by, nrvDetails.rc_np_issued_by) && Intrinsics.areEqual(this.rc_np_no, nrvDetails.rc_np_no) && Intrinsics.areEqual(this.rc_np_upto, nrvDetails.rc_np_upto) && Intrinsics.areEqual(this.rc_off_cd, nrvDetails.rc_off_cd) && Intrinsics.areEqual(this.rc_owner_name, nrvDetails.rc_owner_name) && Intrinsics.areEqual(this.rc_owner_sr, nrvDetails.rc_owner_sr) && Intrinsics.areEqual(this.rc_permanent_address, nrvDetails.rc_permanent_address) && Intrinsics.areEqual(this.rc_permit_issue_dt, nrvDetails.rc_permit_issue_dt) && Intrinsics.areEqual(this.rc_permit_no, nrvDetails.rc_permit_no) && Intrinsics.areEqual(this.rc_permit_type, nrvDetails.rc_permit_type) && Intrinsics.areEqual(this.rc_permit_valid_from, nrvDetails.rc_permit_valid_from) && Intrinsics.areEqual(this.rc_permit_valid_upto, nrvDetails.rc_permit_valid_upto) && Intrinsics.areEqual(this.rc_present_address, nrvDetails.rc_present_address) && Intrinsics.areEqual(this.rc_pucc_no, nrvDetails.rc_pucc_no) && Intrinsics.areEqual(this.rc_pucc_upto, nrvDetails.rc_pucc_upto) && Intrinsics.areEqual(this.rc_registered_at, nrvDetails.rc_registered_at) && Intrinsics.areEqual(this.rc_regn_dt, nrvDetails.rc_regn_dt) && Intrinsics.areEqual(this.rc_regn_no, nrvDetails.rc_regn_no) && Intrinsics.areEqual(this.rc_regn_type, nrvDetails.rc_regn_type) && Intrinsics.areEqual(this.rc_seat_cap, nrvDetails.rc_seat_cap) && Intrinsics.areEqual(this.rc_sleeper_cap, nrvDetails.rc_sleeper_cap) && Intrinsics.areEqual(this.rc_stand_cap, nrvDetails.rc_stand_cap) && Intrinsics.areEqual(this.rc_status, nrvDetails.rc_status) && Intrinsics.areEqual(this.rc_status_as_on, nrvDetails.rc_status_as_on) && Intrinsics.areEqual(this.rc_tax_upto, nrvDetails.rc_tax_upto) && Intrinsics.areEqual(this.rc_unld_wt, nrvDetails.rc_unld_wt) && Intrinsics.areEqual(this.rc_vch_catg, nrvDetails.rc_vch_catg) && Intrinsics.areEqual(this.rc_vch_catg_desc, nrvDetails.rc_vch_catg_desc) && Intrinsics.areEqual(this.rc_vh_class_cd, nrvDetails.rc_vh_class_cd) && Intrinsics.areEqual(this.rc_vh_class_desc, nrvDetails.rc_vh_class_desc) && Intrinsics.areEqual(this.rc_wheelbase, nrvDetails.rc_wheelbase) && Intrinsics.areEqual(this.state_cd, nrvDetails.state_cd) && Intrinsics.areEqual(this.rc_owner_desc, nrvDetails.rc_owner_desc) && Intrinsics.areEqual(this.stautsMessage, nrvDetails.stautsMessage);
    }

    public final String getRc_blacklist_status() {
        return this.rc_blacklist_status;
    }

    public final String getRc_body_type_desc() {
        return this.rc_body_type_desc;
    }

    public final String getRc_c_state() {
        return this.rc_c_state;
    }

    public final String getRc_chasi_no() {
        return this.rc_chasi_no;
    }

    public final String getRc_color() {
        return this.rc_color;
    }

    public final String getRc_cubic_cap() {
        return this.rc_cubic_cap;
    }

    public final String getRc_email_id() {
        return this.rc_email_id;
    }

    public final String getRc_eng_no() {
        return this.rc_eng_no;
    }

    public final String getRc_f_name() {
        return this.rc_f_name;
    }

    public final String getRc_financed_from() {
        return this.rc_financed_from;
    }

    public final String getRc_financer() {
        return this.rc_financer;
    }

    public final String getRc_fit_upto() {
        return this.rc_fit_upto;
    }

    public final String getRc_fuel_cd() {
        return this.rc_fuel_cd;
    }

    public final String getRc_fuel_desc() {
        return this.rc_fuel_desc;
    }

    public final String getRc_gvw() {
        return this.rc_gvw;
    }

    public final String getRc_insurance_comp() {
        return this.rc_insurance_comp;
    }

    public final String getRc_insurance_policy_no() {
        return this.rc_insurance_policy_no;
    }

    public final String getRc_insurance_upto() {
        return this.rc_insurance_upto;
    }

    public final String getRc_maker_cd() {
        return this.rc_maker_cd;
    }

    public final String getRc_maker_desc() {
        return this.rc_maker_desc;
    }

    public final String getRc_maker_model() {
        return this.rc_maker_model;
    }

    public final String getRc_manu_month() {
        return this.rc_manu_month;
    }

    public final String getRc_manu_month_yr() {
        return this.rc_manu_month_yr;
    }

    public final String getRc_manu_yr() {
        return this.rc_manu_yr;
    }

    public final String getRc_mobile_no() {
        return this.rc_mobile_no;
    }

    public final String getRc_ncrb_status() {
        return this.rc_ncrb_status;
    }

    public final String getRc_no_cyl() {
        return this.rc_no_cyl;
    }

    public final String getRc_noc_details() {
        return this.rc_noc_details;
    }

    public final String getRc_non_use_from() {
        return this.rc_non_use_from;
    }

    public final String getRc_non_use_status() {
        return this.rc_non_use_status;
    }

    public final String getRc_non_use_to() {
        return this.rc_non_use_to;
    }

    public final String getRc_norms_cd() {
        return this.rc_norms_cd;
    }

    public final String getRc_norms_desc() {
        return this.rc_norms_desc;
    }

    public final String getRc_np_issued_by() {
        return this.rc_np_issued_by;
    }

    public final String getRc_np_no() {
        return this.rc_np_no;
    }

    public final String getRc_np_upto() {
        return this.rc_np_upto;
    }

    public final String getRc_off_cd() {
        return this.rc_off_cd;
    }

    public final String getRc_owner_desc() {
        return this.rc_owner_desc;
    }

    public final String getRc_owner_name() {
        return this.rc_owner_name;
    }

    public final String getRc_owner_sr() {
        return this.rc_owner_sr;
    }

    public final String getRc_permanent_address() {
        return this.rc_permanent_address;
    }

    public final String getRc_permit_issue_dt() {
        return this.rc_permit_issue_dt;
    }

    public final String getRc_permit_no() {
        return this.rc_permit_no;
    }

    public final String getRc_permit_type() {
        return this.rc_permit_type;
    }

    public final String getRc_permit_valid_from() {
        return this.rc_permit_valid_from;
    }

    public final String getRc_permit_valid_upto() {
        return this.rc_permit_valid_upto;
    }

    public final String getRc_present_address() {
        return this.rc_present_address;
    }

    public final String getRc_pucc_no() {
        return this.rc_pucc_no;
    }

    public final String getRc_pucc_upto() {
        return this.rc_pucc_upto;
    }

    public final String getRc_registered_at() {
        return this.rc_registered_at;
    }

    public final String getRc_regn_dt() {
        return this.rc_regn_dt;
    }

    public final String getRc_regn_no() {
        return this.rc_regn_no;
    }

    public final String getRc_regn_type() {
        return this.rc_regn_type;
    }

    public final String getRc_seat_cap() {
        return this.rc_seat_cap;
    }

    public final String getRc_sleeper_cap() {
        return this.rc_sleeper_cap;
    }

    public final String getRc_stand_cap() {
        return this.rc_stand_cap;
    }

    public final String getRc_status() {
        return this.rc_status;
    }

    public final String getRc_status_as_on() {
        return this.rc_status_as_on;
    }

    public final String getRc_tax_upto() {
        return this.rc_tax_upto;
    }

    public final String getRc_unld_wt() {
        return this.rc_unld_wt;
    }

    public final String getRc_vch_catg() {
        return this.rc_vch_catg;
    }

    public final String getRc_vch_catg_desc() {
        return this.rc_vch_catg_desc;
    }

    public final String getRc_vh_class_cd() {
        return this.rc_vh_class_cd;
    }

    public final String getRc_vh_class_desc() {
        return this.rc_vh_class_desc;
    }

    public final String getRc_wheelbase() {
        return this.rc_wheelbase;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public final String getStautsMessage() {
        return this.stautsMessage;
    }

    public int hashCode() {
        String str = this.rc_blacklist_status;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.rc_body_type_desc;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.rc_c_state;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.rc_chasi_no;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.rc_color;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.rc_cubic_cap;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.rc_email_id;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.rc_eng_no;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.rc_f_name;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.rc_financed_from;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.rc_financer;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.rc_fit_upto;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.rc_fuel_cd;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.rc_fuel_desc;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.rc_gvw;
        int iHashCode15 = (iHashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.rc_insurance_comp;
        int iHashCode16 = (iHashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.rc_insurance_policy_no;
        int iHashCode17 = (iHashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.rc_insurance_upto;
        int iHashCode18 = (iHashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.rc_maker_cd;
        int iHashCode19 = (iHashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.rc_maker_desc;
        int iHashCode20 = (iHashCode19 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.rc_maker_model;
        int iHashCode21 = (iHashCode20 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.rc_manu_month;
        int iHashCode22 = (iHashCode21 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.rc_manu_month_yr;
        int iHashCode23 = (iHashCode22 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.rc_manu_yr;
        int iHashCode24 = (iHashCode23 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.rc_mobile_no;
        int iHashCode25 = (iHashCode24 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.rc_ncrb_status;
        int iHashCode26 = (iHashCode25 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.rc_no_cyl;
        int iHashCode27 = (iHashCode26 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.rc_noc_details;
        int iHashCode28 = (iHashCode27 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.rc_non_use_from;
        int iHashCode29 = (iHashCode28 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.rc_non_use_status;
        int iHashCode30 = (iHashCode29 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.rc_non_use_to;
        int iHashCode31 = (iHashCode30 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.rc_norms_cd;
        int iHashCode32 = (iHashCode31 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.rc_norms_desc;
        int iHashCode33 = (iHashCode32 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.rc_np_issued_by;
        int iHashCode34 = (iHashCode33 + (str34 == null ? 0 : str34.hashCode())) * 31;
        String str35 = this.rc_np_no;
        int iHashCode35 = (iHashCode34 + (str35 == null ? 0 : str35.hashCode())) * 31;
        String str36 = this.rc_np_upto;
        int iHashCode36 = (iHashCode35 + (str36 == null ? 0 : str36.hashCode())) * 31;
        String str37 = this.rc_off_cd;
        int iHashCode37 = (iHashCode36 + (str37 == null ? 0 : str37.hashCode())) * 31;
        String str38 = this.rc_owner_name;
        int iHashCode38 = (iHashCode37 + (str38 == null ? 0 : str38.hashCode())) * 31;
        String str39 = this.rc_owner_sr;
        int iHashCode39 = (iHashCode38 + (str39 == null ? 0 : str39.hashCode())) * 31;
        String str40 = this.rc_permanent_address;
        int iHashCode40 = (iHashCode39 + (str40 == null ? 0 : str40.hashCode())) * 31;
        String str41 = this.rc_permit_issue_dt;
        int iHashCode41 = (iHashCode40 + (str41 == null ? 0 : str41.hashCode())) * 31;
        String str42 = this.rc_permit_no;
        int iHashCode42 = (iHashCode41 + (str42 == null ? 0 : str42.hashCode())) * 31;
        String str43 = this.rc_permit_type;
        int iHashCode43 = (iHashCode42 + (str43 == null ? 0 : str43.hashCode())) * 31;
        String str44 = this.rc_permit_valid_from;
        int iHashCode44 = (iHashCode43 + (str44 == null ? 0 : str44.hashCode())) * 31;
        String str45 = this.rc_permit_valid_upto;
        int iHashCode45 = (iHashCode44 + (str45 == null ? 0 : str45.hashCode())) * 31;
        String str46 = this.rc_present_address;
        int iHashCode46 = (iHashCode45 + (str46 == null ? 0 : str46.hashCode())) * 31;
        String str47 = this.rc_pucc_no;
        int iHashCode47 = (iHashCode46 + (str47 == null ? 0 : str47.hashCode())) * 31;
        String str48 = this.rc_pucc_upto;
        int iHashCode48 = (iHashCode47 + (str48 == null ? 0 : str48.hashCode())) * 31;
        String str49 = this.rc_registered_at;
        int iHashCode49 = (iHashCode48 + (str49 == null ? 0 : str49.hashCode())) * 31;
        String str50 = this.rc_regn_dt;
        int iHashCode50 = (iHashCode49 + (str50 == null ? 0 : str50.hashCode())) * 31;
        String str51 = this.rc_regn_no;
        int iHashCode51 = (iHashCode50 + (str51 == null ? 0 : str51.hashCode())) * 31;
        String str52 = this.rc_regn_type;
        int iHashCode52 = (iHashCode51 + (str52 == null ? 0 : str52.hashCode())) * 31;
        String str53 = this.rc_seat_cap;
        int iHashCode53 = (iHashCode52 + (str53 == null ? 0 : str53.hashCode())) * 31;
        String str54 = this.rc_sleeper_cap;
        int iHashCode54 = (iHashCode53 + (str54 == null ? 0 : str54.hashCode())) * 31;
        String str55 = this.rc_stand_cap;
        int iHashCode55 = (iHashCode54 + (str55 == null ? 0 : str55.hashCode())) * 31;
        String str56 = this.rc_status;
        int iHashCode56 = (iHashCode55 + (str56 == null ? 0 : str56.hashCode())) * 31;
        String str57 = this.rc_status_as_on;
        int iHashCode57 = (iHashCode56 + (str57 == null ? 0 : str57.hashCode())) * 31;
        String str58 = this.rc_tax_upto;
        int iHashCode58 = (iHashCode57 + (str58 == null ? 0 : str58.hashCode())) * 31;
        String str59 = this.rc_unld_wt;
        int iHashCode59 = (iHashCode58 + (str59 == null ? 0 : str59.hashCode())) * 31;
        String str60 = this.rc_vch_catg;
        int iHashCode60 = (iHashCode59 + (str60 == null ? 0 : str60.hashCode())) * 31;
        String str61 = this.rc_vch_catg_desc;
        int iHashCode61 = (iHashCode60 + (str61 == null ? 0 : str61.hashCode())) * 31;
        String str62 = this.rc_vh_class_cd;
        int iHashCode62 = (iHashCode61 + (str62 == null ? 0 : str62.hashCode())) * 31;
        String str63 = this.rc_vh_class_desc;
        int iHashCode63 = (iHashCode62 + (str63 == null ? 0 : str63.hashCode())) * 31;
        String str64 = this.rc_wheelbase;
        int iHashCode64 = (iHashCode63 + (str64 == null ? 0 : str64.hashCode())) * 31;
        String str65 = this.state_cd;
        int iHashCode65 = (iHashCode64 + (str65 == null ? 0 : str65.hashCode())) * 31;
        String str66 = this.rc_owner_desc;
        int iHashCode66 = (iHashCode65 + (str66 == null ? 0 : str66.hashCode())) * 31;
        String str67 = this.stautsMessage;
        return iHashCode66 + (str67 != null ? str67.hashCode() : 0);
    }

    public final void setRc_fit_upto(String str) {
        this.rc_fit_upto = str;
    }

    public final void setRc_insurance_upto(String str) {
        this.rc_insurance_upto = str;
    }

    public final void setRc_np_upto(String str) {
        this.rc_np_upto = str;
    }

    public final void setRc_permit_valid_upto(String str) {
        this.rc_permit_valid_upto = str;
    }

    public final void setRc_pucc_upto(String str) {
        this.rc_pucc_upto = str;
    }

    public final void setRc_tax_upto(String str) {
        this.rc_tax_upto = str;
    }

    public String toString() {
        return "NrvDetails(rc_blacklist_status=" + this.rc_blacklist_status + ", rc_body_type_desc=" + this.rc_body_type_desc + ", rc_c_state=" + this.rc_c_state + ", rc_chasi_no=" + this.rc_chasi_no + ", rc_color=" + this.rc_color + ", rc_cubic_cap=" + this.rc_cubic_cap + ", rc_email_id=" + this.rc_email_id + ", rc_eng_no=" + this.rc_eng_no + ", rc_f_name=" + this.rc_f_name + ", rc_financed_from=" + this.rc_financed_from + ", rc_financer=" + this.rc_financer + ", rc_fit_upto=" + this.rc_fit_upto + ", rc_fuel_cd=" + this.rc_fuel_cd + ", rc_fuel_desc=" + this.rc_fuel_desc + ", rc_gvw=" + this.rc_gvw + ", rc_insurance_comp=" + this.rc_insurance_comp + ", rc_insurance_policy_no=" + this.rc_insurance_policy_no + ", rc_insurance_upto=" + this.rc_insurance_upto + ", rc_maker_cd=" + this.rc_maker_cd + ", rc_maker_desc=" + this.rc_maker_desc + ", rc_maker_model=" + this.rc_maker_model + ", rc_manu_month=" + this.rc_manu_month + ", rc_manu_month_yr=" + this.rc_manu_month_yr + ", rc_manu_yr=" + this.rc_manu_yr + ", rc_mobile_no=" + this.rc_mobile_no + ", rc_ncrb_status=" + this.rc_ncrb_status + ", rc_no_cyl=" + this.rc_no_cyl + ", rc_noc_details=" + this.rc_noc_details + ", rc_non_use_from=" + this.rc_non_use_from + ", rc_non_use_status=" + this.rc_non_use_status + ", rc_non_use_to=" + this.rc_non_use_to + ", rc_norms_cd=" + this.rc_norms_cd + ", rc_norms_desc=" + this.rc_norms_desc + ", rc_np_issued_by=" + this.rc_np_issued_by + ", rc_np_no=" + this.rc_np_no + ", rc_np_upto=" + this.rc_np_upto + ", rc_off_cd=" + this.rc_off_cd + ", rc_owner_name=" + this.rc_owner_name + ", rc_owner_sr=" + this.rc_owner_sr + ", rc_permanent_address=" + this.rc_permanent_address + ", rc_permit_issue_dt=" + this.rc_permit_issue_dt + ", rc_permit_no=" + this.rc_permit_no + ", rc_permit_type=" + this.rc_permit_type + ", rc_permit_valid_from=" + this.rc_permit_valid_from + ", rc_permit_valid_upto=" + this.rc_permit_valid_upto + ", rc_present_address=" + this.rc_present_address + ", rc_pucc_no=" + this.rc_pucc_no + ", rc_pucc_upto=" + this.rc_pucc_upto + ", rc_registered_at=" + this.rc_registered_at + ", rc_regn_dt=" + this.rc_regn_dt + ", rc_regn_no=" + this.rc_regn_no + ", rc_regn_type=" + this.rc_regn_type + ", rc_seat_cap=" + this.rc_seat_cap + ", rc_sleeper_cap=" + this.rc_sleeper_cap + ", rc_stand_cap=" + this.rc_stand_cap + ", rc_status=" + this.rc_status + ", rc_status_as_on=" + this.rc_status_as_on + ", rc_tax_upto=" + this.rc_tax_upto + ", rc_unld_wt=" + this.rc_unld_wt + ", rc_vch_catg=" + this.rc_vch_catg + ", rc_vch_catg_desc=" + this.rc_vch_catg_desc + ", rc_vh_class_cd=" + this.rc_vh_class_cd + ", rc_vh_class_desc=" + this.rc_vh_class_desc + ", rc_wheelbase=" + this.rc_wheelbase + ", state_cd=" + this.state_cd + ", rc_owner_desc=" + this.rc_owner_desc + ", stautsMessage=" + this.stautsMessage + ')';
    }
}
