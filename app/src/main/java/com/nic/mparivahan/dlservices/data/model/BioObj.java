package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0003\bÖ\u0001\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÙ\u0006\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010KJ\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010 \u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¡\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¢\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010£\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¤\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¥\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¦\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010§\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010¨\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010©\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ª\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010«\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¬\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010®\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010¯\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010°\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010±\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010²\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010³\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010´\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010µ\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010¶\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010·\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010¸\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¹\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010º\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010»\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010¼\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010½\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¾\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¿\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010À\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Á\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010Â\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010Ã\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ä\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010Å\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Æ\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010Ç\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010È\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010É\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010Ê\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ë\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010Ì\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Í\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010Î\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ï\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ð\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010Ñ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ò\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010Ó\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ô\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010Õ\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010Ö\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010×\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010Ø\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ù\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010Ú\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Û\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003JÞ\u0006\u0010Ü\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0016\u0010Ý\u0001\u001a\u00030Þ\u00012\t\u0010ß\u0001\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\u000b\u0010à\u0001\u001a\u00030á\u0001HÖ\u0001J\n\u0010â\u0001\u001a\u00020\u0007HÖ\u0001R\u0013\u00101\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0013\u0010,\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bN\u0010MR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bO\u0010MR\u0013\u00108\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bP\u0010MR\u0013\u0010*\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0013\u0010+\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bS\u0010RR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bT\u0010MR\u0013\u00102\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bU\u0010MR\u0013\u0010F\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bV\u0010RR\u0013\u0010#\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bW\u0010RR\u0013\u0010D\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bX\u0010RR\u0013\u0010J\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bY\u0010RR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010MR\u0013\u0010I\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b[\u0010MR\u0013\u0010)\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010RR\u0013\u0010-\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b]\u0010MR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b^\u0010MR\u0013\u0010A\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b_\u0010MR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b`\u0010MR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\ba\u0010RR\u0013\u0010<\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bb\u0010RR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bc\u0010RR\u0013\u0010;\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bd\u0010RR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\be\u0010MR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bf\u0010MR\u0013\u00109\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bg\u0010RR\u0013\u00103\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bh\u0010MR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bi\u0010MR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bj\u0010RR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bk\u0010MR\u0013\u0010!\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bl\u0010RR\u0013\u0010=\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bm\u0010MR\u0013\u00107\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bn\u0010RR\u0013\u0010:\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bo\u0010RR\u0013\u00105\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bp\u0010RR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bq\u0010MR\u0013\u00104\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\br\u0010MR\u0013\u0010&\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bs\u0010RR\u0013\u0010G\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bt\u0010RR\u0013\u0010/\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bu\u0010RR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bv\u0010MR\u0013\u0010'\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bw\u0010RR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bx\u0010MR\u0013\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\by\u0010MR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bz\u0010MR\u0013\u0010.\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b{\u0010MR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b|\u0010RR\u0013\u0010@\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b}\u0010MR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b~\u0010RR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010MR\u0014\u0010>\u001a\u0004\u0018\u00010\u0007¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010RR\u0014\u0010B\u001a\u0004\u0018\u00010\u0007¢\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010RR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010RR\u0014\u0010E\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0083\u0001\u0010MR\u0014\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\t\n\u0000\u001a\u0005\b\u0084\u0001\u0010RR\u0014\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\t\n\u0000\u001a\u0005\b\u0085\u0001\u0010RR\u0014\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\t\n\u0000\u001a\u0005\b\u0086\u0001\u0010RR\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0087\u0001\u0010MR\u0014\u0010C\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0088\u0001\u0010MR\u0014\u00100\u001a\u0004\u0018\u00010\u0007¢\u0006\t\n\u0000\u001a\u0005\b\u0089\u0001\u0010RR\u0014\u0010$\u001a\u0004\u0018\u00010\u0007¢\u0006\t\n\u0000\u001a\u0005\b\u008a\u0001\u0010RR\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\t\n\u0000\u001a\u0005\b\u008b\u0001\u0010RR\u0014\u0010\"\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u008c\u0001\u0010MR\u0014\u0010?\u001a\u0004\u0018\u00010\u0007¢\u0006\t\n\u0000\u001a\u0005\b\u008d\u0001\u0010RR\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u008e\u0001\u0010MR\u0014\u00106\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u008f\u0001\u0010MR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0090\u0001\u0010MR\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0007¢\u0006\t\n\u0000\u001a\u0005\b\u0091\u0001\u0010RR\u0014\u0010%\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0092\u0001\u0010MR\u0014\u0010(\u001a\u0004\u0018\u00010\u0007¢\u0006\t\n\u0000\u001a\u0005\b\u0093\u0001\u0010RR\u0014\u0010H\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0094\u0001\u0010M¨\u0006ã\u0001"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/BioObj;", "Ljava/io/Serializable;", "bioPermSdName", "", "bioDigest", "bioStayperiodPresentAddr", "bioTempPin", "", "bioTempAdd2", "bioBioidSearch", "bioTempAdd1", "bioTokenId", "bioTempAdd3", "bioEndorsedt", "bioSwdLname", "bioRecGenesis", "bioPermVillTownCd", "bioIdentityMark1", "bioUserId", "bioIdentityMark2", "bioQmQualcd", "bioNatName", "bioNprNo", "bioAadhaarNo", "bioGender", "bioPermDistCd", "bioTempDistCd", "bioPhoneNo", "bioTempVillTownCd", "bioFirstName", "bioMobileNo", "bioEndorsetime", "bioPermVillTownName", "bioOrganDonor", "bioTempSdName", "bioBloodGroupname", "bioTempLocal", "dob", "bioPermLocType", "bioPermSdcode", "fullAddress", "bioDob", "bioApplno", "bioBioId", "bioAadhaarName", "bioEmailId", "bioPoliceStncd", "bioPermPin", "bioTempLocType", "biPhoto", "bioBirthplace", "bioMiddleName", "bioPermDistName", "bioPermAdd3", "bioTempVillTownName", "bioPermAdd1", "bioAltMobileNo", "bioLastName", "bioPermAdd2", "bioGenderDesc", "bioFullName", "bioPerDetAadhaar", "bioSwdFname", "bioTempSdcode", "bioQmQualdesc", "bioEndorsementNo", "bioSwdFullName", "bioTempDistName", "bioCitiZen", "bioSwdMname", "bioBloodGroup", "bioPermLocal", "pht", "bioDlno", "bioDependentRelation", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V", "getBiPhoto", "()Ljava/lang/Object;", "getBioAadhaarName", "getBioAadhaarNo", "getBioAltMobileNo", "getBioApplno", "()Ljava/lang/String;", "getBioBioId", "getBioBioidSearch", "getBioBirthplace", "getBioBloodGroup", "getBioBloodGroupname", "getBioCitiZen", "getBioDependentRelation", "getBioDigest", "getBioDlno", "getBioDob", "getBioEmailId", "getBioEndorsedt", "getBioEndorsementNo", "getBioEndorsetime", "getBioFirstName", "getBioFullName", "getBioGender", "getBioGenderDesc", "getBioIdentityMark1", "getBioIdentityMark2", "getBioLastName", "getBioMiddleName", "getBioMobileNo", "getBioNatName", "getBioNprNo", "getBioOrganDonor", "getBioPerDetAadhaar", "getBioPermAdd1", "getBioPermAdd2", "getBioPermAdd3", "getBioPermDistCd", "getBioPermDistName", "getBioPermLocType", "getBioPermLocal", "getBioPermPin", "getBioPermSdName", "getBioPermSdcode", "getBioPermVillTownCd", "getBioPermVillTownName", "getBioPhoneNo", "getBioPoliceStncd", "getBioQmQualcd", "getBioQmQualdesc", "getBioRecGenesis", "getBioStayperiodPresentAddr", "getBioSwdFname", "getBioSwdFullName", "getBioSwdLname", "getBioSwdMname", "getBioTempAdd1", "getBioTempAdd2", "getBioTempAdd3", "getBioTempDistCd", "getBioTempDistName", "getBioTempLocType", "getBioTempLocal", "getBioTempPin", "getBioTempSdName", "getBioTempSdcode", "getBioTempVillTownCd", "getBioTempVillTownName", "getBioTokenId", "getBioUserId", "getDob", "getFullAddress", "getPht", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component6", "component60", "component61", "component62", "component63", "component64", "component65", "component66", "component67", "component68", "component69", "component7", "component70", "component71", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class BioObj implements Serializable {
    private final Object biPhoto;
    private final Object bioAadhaarName;
    private final Object bioAadhaarNo;
    private final Object bioAltMobileNo;
    private final String bioApplno;
    private final String bioBioId;
    private final Object bioBioidSearch;
    private final Object bioBirthplace;
    private final String bioBloodGroup;
    private final String bioBloodGroupname;
    private final String bioCitiZen;
    private final String bioDependentRelation;
    private final Object bioDigest;
    private final Object bioDlno;
    private final String bioDob;
    private final Object bioEmailId;
    private final Object bioEndorsedt;
    private final Object bioEndorsementNo;
    private final Object bioEndorsetime;
    private final String bioFirstName;
    private final String bioFullName;
    private final String bioGender;
    private final String bioGenderDesc;
    private final Object bioIdentityMark1;
    private final Object bioIdentityMark2;
    private final String bioLastName;
    private final Object bioMiddleName;
    private final Object bioMobileNo;
    private final String bioNatName;
    private final Object bioNprNo;
    private final String bioOrganDonor;
    private final Object bioPerDetAadhaar;
    private final String bioPermAdd1;
    private final String bioPermAdd2;
    private final String bioPermAdd3;
    private final Object bioPermDistCd;
    private final Object bioPermDistName;
    private final String bioPermLocType;
    private final String bioPermLocal;
    private final String bioPermPin;
    private final Object bioPermSdName;
    private final String bioPermSdcode;
    private final Object bioPermVillTownCd;
    private final Object bioPermVillTownName;
    private final Object bioPhoneNo;
    private final Object bioPoliceStncd;
    private final String bioQmQualcd;
    private final Object bioQmQualdesc;
    private final String bioRecGenesis;
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
    private final String bioTempLocType;
    private final String bioTempLocal;
    private final String bioTempPin;
    private final Object bioTempSdName;
    private final String bioTempSdcode;
    private final Object bioTempVillTownCd;
    private final Object bioTempVillTownName;
    private final Object bioTokenId;
    private final String bioUserId;
    private final Object dob;
    private final String fullAddress;
    private final Object pht;

    public BioObj() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 127, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Object getBioPermSdName() {
        return this.bioPermSdName;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Object getBioEndorsedt() {
        return this.bioEndorsedt;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getBioSwdLname() {
        return this.bioSwdLname;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getBioRecGenesis() {
        return this.bioRecGenesis;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Object getBioPermVillTownCd() {
        return this.bioPermVillTownCd;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Object getBioIdentityMark1() {
        return this.bioIdentityMark1;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getBioUserId() {
        return this.bioUserId;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Object getBioIdentityMark2() {
        return this.bioIdentityMark2;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getBioQmQualcd() {
        return this.bioQmQualcd;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getBioNatName() {
        return this.bioNatName;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Object getBioNprNo() {
        return this.bioNprNo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getBioDigest() {
        return this.bioDigest;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Object getBioAadhaarNo() {
        return this.bioAadhaarNo;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getBioGender() {
        return this.bioGender;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Object getBioPermDistCd() {
        return this.bioPermDistCd;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Object getBioTempDistCd() {
        return this.bioTempDistCd;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Object getBioPhoneNo() {
        return this.bioPhoneNo;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Object getBioTempVillTownCd() {
        return this.bioTempVillTownCd;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getBioFirstName() {
        return this.bioFirstName;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final Object getBioMobileNo() {
        return this.bioMobileNo;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final Object getBioEndorsetime() {
        return this.bioEndorsetime;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final Object getBioPermVillTownName() {
        return this.bioPermVillTownName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Object getBioStayperiodPresentAddr() {
        return this.bioStayperiodPresentAddr;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getBioOrganDonor() {
        return this.bioOrganDonor;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final Object getBioTempSdName() {
        return this.bioTempSdName;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getBioBloodGroupname() {
        return this.bioBloodGroupname;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getBioTempLocal() {
        return this.bioTempLocal;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final Object getDob() {
        return this.dob;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final String getBioPermLocType() {
        return this.bioPermLocType;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final String getBioPermSdcode() {
        return this.bioPermSdcode;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final String getFullAddress() {
        return this.fullAddress;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final String getBioDob() {
        return this.bioDob;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final String getBioApplno() {
        return this.bioApplno;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBioTempPin() {
        return this.bioTempPin;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final String getBioBioId() {
        return this.bioBioId;
    }

    /* JADX INFO: renamed from: component41, reason: from getter */
    public final Object getBioAadhaarName() {
        return this.bioAadhaarName;
    }

    /* JADX INFO: renamed from: component42, reason: from getter */
    public final Object getBioEmailId() {
        return this.bioEmailId;
    }

    /* JADX INFO: renamed from: component43, reason: from getter */
    public final Object getBioPoliceStncd() {
        return this.bioPoliceStncd;
    }

    /* JADX INFO: renamed from: component44, reason: from getter */
    public final String getBioPermPin() {
        return this.bioPermPin;
    }

    /* JADX INFO: renamed from: component45, reason: from getter */
    public final String getBioTempLocType() {
        return this.bioTempLocType;
    }

    /* JADX INFO: renamed from: component46, reason: from getter */
    public final Object getBiPhoto() {
        return this.biPhoto;
    }

    /* JADX INFO: renamed from: component47, reason: from getter */
    public final Object getBioBirthplace() {
        return this.bioBirthplace;
    }

    /* JADX INFO: renamed from: component48, reason: from getter */
    public final Object getBioMiddleName() {
        return this.bioMiddleName;
    }

    /* JADX INFO: renamed from: component49, reason: from getter */
    public final Object getBioPermDistName() {
        return this.bioPermDistName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBioTempAdd2() {
        return this.bioTempAdd2;
    }

    /* JADX INFO: renamed from: component50, reason: from getter */
    public final String getBioPermAdd3() {
        return this.bioPermAdd3;
    }

    /* JADX INFO: renamed from: component51, reason: from getter */
    public final Object getBioTempVillTownName() {
        return this.bioTempVillTownName;
    }

    /* JADX INFO: renamed from: component52, reason: from getter */
    public final String getBioPermAdd1() {
        return this.bioPermAdd1;
    }

    /* JADX INFO: renamed from: component53, reason: from getter */
    public final Object getBioAltMobileNo() {
        return this.bioAltMobileNo;
    }

    /* JADX INFO: renamed from: component54, reason: from getter */
    public final String getBioLastName() {
        return this.bioLastName;
    }

    /* JADX INFO: renamed from: component55, reason: from getter */
    public final String getBioPermAdd2() {
        return this.bioPermAdd2;
    }

    /* JADX INFO: renamed from: component56, reason: from getter */
    public final String getBioGenderDesc() {
        return this.bioGenderDesc;
    }

    /* JADX INFO: renamed from: component57, reason: from getter */
    public final String getBioFullName() {
        return this.bioFullName;
    }

    /* JADX INFO: renamed from: component58, reason: from getter */
    public final Object getBioPerDetAadhaar() {
        return this.bioPerDetAadhaar;
    }

    /* JADX INFO: renamed from: component59, reason: from getter */
    public final String getBioSwdFname() {
        return this.bioSwdFname;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Object getBioBioidSearch() {
        return this.bioBioidSearch;
    }

    /* JADX INFO: renamed from: component60, reason: from getter */
    public final String getBioTempSdcode() {
        return this.bioTempSdcode;
    }

    /* JADX INFO: renamed from: component61, reason: from getter */
    public final Object getBioQmQualdesc() {
        return this.bioQmQualdesc;
    }

    /* JADX INFO: renamed from: component62, reason: from getter */
    public final Object getBioEndorsementNo() {
        return this.bioEndorsementNo;
    }

    /* JADX INFO: renamed from: component63, reason: from getter */
    public final String getBioSwdFullName() {
        return this.bioSwdFullName;
    }

    /* JADX INFO: renamed from: component64, reason: from getter */
    public final Object getBioTempDistName() {
        return this.bioTempDistName;
    }

    /* JADX INFO: renamed from: component65, reason: from getter */
    public final String getBioCitiZen() {
        return this.bioCitiZen;
    }

    /* JADX INFO: renamed from: component66, reason: from getter */
    public final Object getBioSwdMname() {
        return this.bioSwdMname;
    }

    /* JADX INFO: renamed from: component67, reason: from getter */
    public final String getBioBloodGroup() {
        return this.bioBloodGroup;
    }

    /* JADX INFO: renamed from: component68, reason: from getter */
    public final String getBioPermLocal() {
        return this.bioPermLocal;
    }

    /* JADX INFO: renamed from: component69, reason: from getter */
    public final Object getPht() {
        return this.pht;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getBioTempAdd1() {
        return this.bioTempAdd1;
    }

    /* JADX INFO: renamed from: component70, reason: from getter */
    public final Object getBioDlno() {
        return this.bioDlno;
    }

    /* JADX INFO: renamed from: component71, reason: from getter */
    public final String getBioDependentRelation() {
        return this.bioDependentRelation;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Object getBioTokenId() {
        return this.bioTokenId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getBioTempAdd3() {
        return this.bioTempAdd3;
    }

    public final BioObj copy(Object bioPermSdName, Object bioDigest, Object bioStayperiodPresentAddr, String bioTempPin, String bioTempAdd2, Object bioBioidSearch, String bioTempAdd1, Object bioTokenId, String bioTempAdd3, Object bioEndorsedt, String bioSwdLname, String bioRecGenesis, Object bioPermVillTownCd, Object bioIdentityMark1, String bioUserId, Object bioIdentityMark2, String bioQmQualcd, String bioNatName, Object bioNprNo, Object bioAadhaarNo, String bioGender, Object bioPermDistCd, Object bioTempDistCd, Object bioPhoneNo, Object bioTempVillTownCd, String bioFirstName, Object bioMobileNo, Object bioEndorsetime, Object bioPermVillTownName, String bioOrganDonor, Object bioTempSdName, String bioBloodGroupname, String bioTempLocal, Object dob, String bioPermLocType, String bioPermSdcode, String fullAddress, String bioDob, String bioApplno, String bioBioId, Object bioAadhaarName, Object bioEmailId, Object bioPoliceStncd, String bioPermPin, String bioTempLocType, Object biPhoto, Object bioBirthplace, Object bioMiddleName, Object bioPermDistName, String bioPermAdd3, Object bioTempVillTownName, String bioPermAdd1, Object bioAltMobileNo, String bioLastName, String bioPermAdd2, String bioGenderDesc, String bioFullName, Object bioPerDetAadhaar, String bioSwdFname, String bioTempSdcode, Object bioQmQualdesc, Object bioEndorsementNo, String bioSwdFullName, Object bioTempDistName, String bioCitiZen, Object bioSwdMname, String bioBloodGroup, String bioPermLocal, Object pht, Object bioDlno, String bioDependentRelation) {
        return new BioObj(bioPermSdName, bioDigest, bioStayperiodPresentAddr, bioTempPin, bioTempAdd2, bioBioidSearch, bioTempAdd1, bioTokenId, bioTempAdd3, bioEndorsedt, bioSwdLname, bioRecGenesis, bioPermVillTownCd, bioIdentityMark1, bioUserId, bioIdentityMark2, bioQmQualcd, bioNatName, bioNprNo, bioAadhaarNo, bioGender, bioPermDistCd, bioTempDistCd, bioPhoneNo, bioTempVillTownCd, bioFirstName, bioMobileNo, bioEndorsetime, bioPermVillTownName, bioOrganDonor, bioTempSdName, bioBloodGroupname, bioTempLocal, dob, bioPermLocType, bioPermSdcode, fullAddress, bioDob, bioApplno, bioBioId, bioAadhaarName, bioEmailId, bioPoliceStncd, bioPermPin, bioTempLocType, biPhoto, bioBirthplace, bioMiddleName, bioPermDistName, bioPermAdd3, bioTempVillTownName, bioPermAdd1, bioAltMobileNo, bioLastName, bioPermAdd2, bioGenderDesc, bioFullName, bioPerDetAadhaar, bioSwdFname, bioTempSdcode, bioQmQualdesc, bioEndorsementNo, bioSwdFullName, bioTempDistName, bioCitiZen, bioSwdMname, bioBloodGroup, bioPermLocal, pht, bioDlno, bioDependentRelation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BioObj)) {
            return false;
        }
        BioObj bioObj = (BioObj) other;
        return Intrinsics.areEqual(this.bioPermSdName, bioObj.bioPermSdName) && Intrinsics.areEqual(this.bioDigest, bioObj.bioDigest) && Intrinsics.areEqual(this.bioStayperiodPresentAddr, bioObj.bioStayperiodPresentAddr) && Intrinsics.areEqual(this.bioTempPin, bioObj.bioTempPin) && Intrinsics.areEqual(this.bioTempAdd2, bioObj.bioTempAdd2) && Intrinsics.areEqual(this.bioBioidSearch, bioObj.bioBioidSearch) && Intrinsics.areEqual(this.bioTempAdd1, bioObj.bioTempAdd1) && Intrinsics.areEqual(this.bioTokenId, bioObj.bioTokenId) && Intrinsics.areEqual(this.bioTempAdd3, bioObj.bioTempAdd3) && Intrinsics.areEqual(this.bioEndorsedt, bioObj.bioEndorsedt) && Intrinsics.areEqual(this.bioSwdLname, bioObj.bioSwdLname) && Intrinsics.areEqual(this.bioRecGenesis, bioObj.bioRecGenesis) && Intrinsics.areEqual(this.bioPermVillTownCd, bioObj.bioPermVillTownCd) && Intrinsics.areEqual(this.bioIdentityMark1, bioObj.bioIdentityMark1) && Intrinsics.areEqual(this.bioUserId, bioObj.bioUserId) && Intrinsics.areEqual(this.bioIdentityMark2, bioObj.bioIdentityMark2) && Intrinsics.areEqual(this.bioQmQualcd, bioObj.bioQmQualcd) && Intrinsics.areEqual(this.bioNatName, bioObj.bioNatName) && Intrinsics.areEqual(this.bioNprNo, bioObj.bioNprNo) && Intrinsics.areEqual(this.bioAadhaarNo, bioObj.bioAadhaarNo) && Intrinsics.areEqual(this.bioGender, bioObj.bioGender) && Intrinsics.areEqual(this.bioPermDistCd, bioObj.bioPermDistCd) && Intrinsics.areEqual(this.bioTempDistCd, bioObj.bioTempDistCd) && Intrinsics.areEqual(this.bioPhoneNo, bioObj.bioPhoneNo) && Intrinsics.areEqual(this.bioTempVillTownCd, bioObj.bioTempVillTownCd) && Intrinsics.areEqual(this.bioFirstName, bioObj.bioFirstName) && Intrinsics.areEqual(this.bioMobileNo, bioObj.bioMobileNo) && Intrinsics.areEqual(this.bioEndorsetime, bioObj.bioEndorsetime) && Intrinsics.areEqual(this.bioPermVillTownName, bioObj.bioPermVillTownName) && Intrinsics.areEqual(this.bioOrganDonor, bioObj.bioOrganDonor) && Intrinsics.areEqual(this.bioTempSdName, bioObj.bioTempSdName) && Intrinsics.areEqual(this.bioBloodGroupname, bioObj.bioBloodGroupname) && Intrinsics.areEqual(this.bioTempLocal, bioObj.bioTempLocal) && Intrinsics.areEqual(this.dob, bioObj.dob) && Intrinsics.areEqual(this.bioPermLocType, bioObj.bioPermLocType) && Intrinsics.areEqual(this.bioPermSdcode, bioObj.bioPermSdcode) && Intrinsics.areEqual(this.fullAddress, bioObj.fullAddress) && Intrinsics.areEqual(this.bioDob, bioObj.bioDob) && Intrinsics.areEqual(this.bioApplno, bioObj.bioApplno) && Intrinsics.areEqual(this.bioBioId, bioObj.bioBioId) && Intrinsics.areEqual(this.bioAadhaarName, bioObj.bioAadhaarName) && Intrinsics.areEqual(this.bioEmailId, bioObj.bioEmailId) && Intrinsics.areEqual(this.bioPoliceStncd, bioObj.bioPoliceStncd) && Intrinsics.areEqual(this.bioPermPin, bioObj.bioPermPin) && Intrinsics.areEqual(this.bioTempLocType, bioObj.bioTempLocType) && Intrinsics.areEqual(this.biPhoto, bioObj.biPhoto) && Intrinsics.areEqual(this.bioBirthplace, bioObj.bioBirthplace) && Intrinsics.areEqual(this.bioMiddleName, bioObj.bioMiddleName) && Intrinsics.areEqual(this.bioPermDistName, bioObj.bioPermDistName) && Intrinsics.areEqual(this.bioPermAdd3, bioObj.bioPermAdd3) && Intrinsics.areEqual(this.bioTempVillTownName, bioObj.bioTempVillTownName) && Intrinsics.areEqual(this.bioPermAdd1, bioObj.bioPermAdd1) && Intrinsics.areEqual(this.bioAltMobileNo, bioObj.bioAltMobileNo) && Intrinsics.areEqual(this.bioLastName, bioObj.bioLastName) && Intrinsics.areEqual(this.bioPermAdd2, bioObj.bioPermAdd2) && Intrinsics.areEqual(this.bioGenderDesc, bioObj.bioGenderDesc) && Intrinsics.areEqual(this.bioFullName, bioObj.bioFullName) && Intrinsics.areEqual(this.bioPerDetAadhaar, bioObj.bioPerDetAadhaar) && Intrinsics.areEqual(this.bioSwdFname, bioObj.bioSwdFname) && Intrinsics.areEqual(this.bioTempSdcode, bioObj.bioTempSdcode) && Intrinsics.areEqual(this.bioQmQualdesc, bioObj.bioQmQualdesc) && Intrinsics.areEqual(this.bioEndorsementNo, bioObj.bioEndorsementNo) && Intrinsics.areEqual(this.bioSwdFullName, bioObj.bioSwdFullName) && Intrinsics.areEqual(this.bioTempDistName, bioObj.bioTempDistName) && Intrinsics.areEqual(this.bioCitiZen, bioObj.bioCitiZen) && Intrinsics.areEqual(this.bioSwdMname, bioObj.bioSwdMname) && Intrinsics.areEqual(this.bioBloodGroup, bioObj.bioBloodGroup) && Intrinsics.areEqual(this.bioPermLocal, bioObj.bioPermLocal) && Intrinsics.areEqual(this.pht, bioObj.pht) && Intrinsics.areEqual(this.bioDlno, bioObj.bioDlno) && Intrinsics.areEqual(this.bioDependentRelation, bioObj.bioDependentRelation);
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

    public final Object getBioAltMobileNo() {
        return this.bioAltMobileNo;
    }

    public final String getBioApplno() {
        return this.bioApplno;
    }

    public final String getBioBioId() {
        return this.bioBioId;
    }

    public final Object getBioBioidSearch() {
        return this.bioBioidSearch;
    }

    public final Object getBioBirthplace() {
        return this.bioBirthplace;
    }

    public final String getBioBloodGroup() {
        return this.bioBloodGroup;
    }

    public final String getBioBloodGroupname() {
        return this.bioBloodGroupname;
    }

    public final String getBioCitiZen() {
        return this.bioCitiZen;
    }

    public final String getBioDependentRelation() {
        return this.bioDependentRelation;
    }

    public final Object getBioDigest() {
        return this.bioDigest;
    }

    public final Object getBioDlno() {
        return this.bioDlno;
    }

    public final String getBioDob() {
        return this.bioDob;
    }

    public final Object getBioEmailId() {
        return this.bioEmailId;
    }

    public final Object getBioEndorsedt() {
        return this.bioEndorsedt;
    }

    public final Object getBioEndorsementNo() {
        return this.bioEndorsementNo;
    }

    public final Object getBioEndorsetime() {
        return this.bioEndorsetime;
    }

    public final String getBioFirstName() {
        return this.bioFirstName;
    }

    public final String getBioFullName() {
        return this.bioFullName;
    }

    public final String getBioGender() {
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

    public final Object getBioMiddleName() {
        return this.bioMiddleName;
    }

    public final Object getBioMobileNo() {
        return this.bioMobileNo;
    }

    public final String getBioNatName() {
        return this.bioNatName;
    }

    public final Object getBioNprNo() {
        return this.bioNprNo;
    }

    public final String getBioOrganDonor() {
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

    public final String getBioPermLocType() {
        return this.bioPermLocType;
    }

    public final String getBioPermLocal() {
        return this.bioPermLocal;
    }

    public final String getBioPermPin() {
        return this.bioPermPin;
    }

    public final Object getBioPermSdName() {
        return this.bioPermSdName;
    }

    public final String getBioPermSdcode() {
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

    public final String getBioQmQualcd() {
        return this.bioQmQualcd;
    }

    public final Object getBioQmQualdesc() {
        return this.bioQmQualdesc;
    }

    public final String getBioRecGenesis() {
        return this.bioRecGenesis;
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

    public final String getBioTempLocType() {
        return this.bioTempLocType;
    }

    public final String getBioTempLocal() {
        return this.bioTempLocal;
    }

    public final String getBioTempPin() {
        return this.bioTempPin;
    }

    public final Object getBioTempSdName() {
        return this.bioTempSdName;
    }

    public final String getBioTempSdcode() {
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

    public final String getBioUserId() {
        return this.bioUserId;
    }

    public final Object getDob() {
        return this.dob;
    }

    public final String getFullAddress() {
        return this.fullAddress;
    }

    public final Object getPht() {
        return this.pht;
    }

    public int hashCode() {
        Object obj = this.bioPermSdName;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.bioDigest;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.bioStayperiodPresentAddr;
        int iHashCode3 = (iHashCode2 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        String str = this.bioTempPin;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bioTempAdd2;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Object obj4 = this.bioBioidSearch;
        int iHashCode6 = (iHashCode5 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        String str3 = this.bioTempAdd1;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Object obj5 = this.bioTokenId;
        int iHashCode8 = (iHashCode7 + (obj5 == null ? 0 : obj5.hashCode())) * 31;
        String str4 = this.bioTempAdd3;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Object obj6 = this.bioEndorsedt;
        int iHashCode10 = (iHashCode9 + (obj6 == null ? 0 : obj6.hashCode())) * 31;
        String str5 = this.bioSwdLname;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.bioRecGenesis;
        int iHashCode12 = (iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Object obj7 = this.bioPermVillTownCd;
        int iHashCode13 = (iHashCode12 + (obj7 == null ? 0 : obj7.hashCode())) * 31;
        Object obj8 = this.bioIdentityMark1;
        int iHashCode14 = (iHashCode13 + (obj8 == null ? 0 : obj8.hashCode())) * 31;
        String str7 = this.bioUserId;
        int iHashCode15 = (iHashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Object obj9 = this.bioIdentityMark2;
        int iHashCode16 = (iHashCode15 + (obj9 == null ? 0 : obj9.hashCode())) * 31;
        String str8 = this.bioQmQualcd;
        int iHashCode17 = (iHashCode16 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.bioNatName;
        int iHashCode18 = (iHashCode17 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Object obj10 = this.bioNprNo;
        int iHashCode19 = (iHashCode18 + (obj10 == null ? 0 : obj10.hashCode())) * 31;
        Object obj11 = this.bioAadhaarNo;
        int iHashCode20 = (iHashCode19 + (obj11 == null ? 0 : obj11.hashCode())) * 31;
        String str10 = this.bioGender;
        int iHashCode21 = (iHashCode20 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Object obj12 = this.bioPermDistCd;
        int iHashCode22 = (iHashCode21 + (obj12 == null ? 0 : obj12.hashCode())) * 31;
        Object obj13 = this.bioTempDistCd;
        int iHashCode23 = (iHashCode22 + (obj13 == null ? 0 : obj13.hashCode())) * 31;
        Object obj14 = this.bioPhoneNo;
        int iHashCode24 = (iHashCode23 + (obj14 == null ? 0 : obj14.hashCode())) * 31;
        Object obj15 = this.bioTempVillTownCd;
        int iHashCode25 = (iHashCode24 + (obj15 == null ? 0 : obj15.hashCode())) * 31;
        String str11 = this.bioFirstName;
        int iHashCode26 = (iHashCode25 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Object obj16 = this.bioMobileNo;
        int iHashCode27 = (iHashCode26 + (obj16 == null ? 0 : obj16.hashCode())) * 31;
        Object obj17 = this.bioEndorsetime;
        int iHashCode28 = (iHashCode27 + (obj17 == null ? 0 : obj17.hashCode())) * 31;
        Object obj18 = this.bioPermVillTownName;
        int iHashCode29 = (iHashCode28 + (obj18 == null ? 0 : obj18.hashCode())) * 31;
        String str12 = this.bioOrganDonor;
        int iHashCode30 = (iHashCode29 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Object obj19 = this.bioTempSdName;
        int iHashCode31 = (iHashCode30 + (obj19 == null ? 0 : obj19.hashCode())) * 31;
        String str13 = this.bioBloodGroupname;
        int iHashCode32 = (iHashCode31 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.bioTempLocal;
        int iHashCode33 = (iHashCode32 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Object obj20 = this.dob;
        int iHashCode34 = (iHashCode33 + (obj20 == null ? 0 : obj20.hashCode())) * 31;
        String str15 = this.bioPermLocType;
        int iHashCode35 = (iHashCode34 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.bioPermSdcode;
        int iHashCode36 = (iHashCode35 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.fullAddress;
        int iHashCode37 = (iHashCode36 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.bioDob;
        int iHashCode38 = (iHashCode37 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.bioApplno;
        int iHashCode39 = (iHashCode38 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.bioBioId;
        int iHashCode40 = (iHashCode39 + (str20 == null ? 0 : str20.hashCode())) * 31;
        Object obj21 = this.bioAadhaarName;
        int iHashCode41 = (iHashCode40 + (obj21 == null ? 0 : obj21.hashCode())) * 31;
        Object obj22 = this.bioEmailId;
        int iHashCode42 = (iHashCode41 + (obj22 == null ? 0 : obj22.hashCode())) * 31;
        Object obj23 = this.bioPoliceStncd;
        int iHashCode43 = (iHashCode42 + (obj23 == null ? 0 : obj23.hashCode())) * 31;
        String str21 = this.bioPermPin;
        int iHashCode44 = (iHashCode43 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.bioTempLocType;
        int iHashCode45 = (iHashCode44 + (str22 == null ? 0 : str22.hashCode())) * 31;
        Object obj24 = this.biPhoto;
        int iHashCode46 = (iHashCode45 + (obj24 == null ? 0 : obj24.hashCode())) * 31;
        Object obj25 = this.bioBirthplace;
        int iHashCode47 = (iHashCode46 + (obj25 == null ? 0 : obj25.hashCode())) * 31;
        Object obj26 = this.bioMiddleName;
        int iHashCode48 = (iHashCode47 + (obj26 == null ? 0 : obj26.hashCode())) * 31;
        Object obj27 = this.bioPermDistName;
        int iHashCode49 = (iHashCode48 + (obj27 == null ? 0 : obj27.hashCode())) * 31;
        String str23 = this.bioPermAdd3;
        int iHashCode50 = (iHashCode49 + (str23 == null ? 0 : str23.hashCode())) * 31;
        Object obj28 = this.bioTempVillTownName;
        int iHashCode51 = (iHashCode50 + (obj28 == null ? 0 : obj28.hashCode())) * 31;
        String str24 = this.bioPermAdd1;
        int iHashCode52 = (iHashCode51 + (str24 == null ? 0 : str24.hashCode())) * 31;
        Object obj29 = this.bioAltMobileNo;
        int iHashCode53 = (iHashCode52 + (obj29 == null ? 0 : obj29.hashCode())) * 31;
        String str25 = this.bioLastName;
        int iHashCode54 = (iHashCode53 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.bioPermAdd2;
        int iHashCode55 = (iHashCode54 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.bioGenderDesc;
        int iHashCode56 = (iHashCode55 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.bioFullName;
        int iHashCode57 = (iHashCode56 + (str28 == null ? 0 : str28.hashCode())) * 31;
        Object obj30 = this.bioPerDetAadhaar;
        int iHashCode58 = (iHashCode57 + (obj30 == null ? 0 : obj30.hashCode())) * 31;
        String str29 = this.bioSwdFname;
        int iHashCode59 = (iHashCode58 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.bioTempSdcode;
        int iHashCode60 = (iHashCode59 + (str30 == null ? 0 : str30.hashCode())) * 31;
        Object obj31 = this.bioQmQualdesc;
        int iHashCode61 = (iHashCode60 + (obj31 == null ? 0 : obj31.hashCode())) * 31;
        Object obj32 = this.bioEndorsementNo;
        int iHashCode62 = (iHashCode61 + (obj32 == null ? 0 : obj32.hashCode())) * 31;
        String str31 = this.bioSwdFullName;
        int iHashCode63 = (iHashCode62 + (str31 == null ? 0 : str31.hashCode())) * 31;
        Object obj33 = this.bioTempDistName;
        int iHashCode64 = (iHashCode63 + (obj33 == null ? 0 : obj33.hashCode())) * 31;
        String str32 = this.bioCitiZen;
        int iHashCode65 = (iHashCode64 + (str32 == null ? 0 : str32.hashCode())) * 31;
        Object obj34 = this.bioSwdMname;
        int iHashCode66 = (iHashCode65 + (obj34 == null ? 0 : obj34.hashCode())) * 31;
        String str33 = this.bioBloodGroup;
        int iHashCode67 = (iHashCode66 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.bioPermLocal;
        int iHashCode68 = (iHashCode67 + (str34 == null ? 0 : str34.hashCode())) * 31;
        Object obj35 = this.pht;
        int iHashCode69 = (iHashCode68 + (obj35 == null ? 0 : obj35.hashCode())) * 31;
        Object obj36 = this.bioDlno;
        int iHashCode70 = (iHashCode69 + (obj36 == null ? 0 : obj36.hashCode())) * 31;
        String str35 = this.bioDependentRelation;
        return iHashCode70 + (str35 != null ? str35.hashCode() : 0);
    }

    public String toString() {
        return "BioObj(bioPermSdName=" + this.bioPermSdName + ", bioDigest=" + this.bioDigest + ", bioStayperiodPresentAddr=" + this.bioStayperiodPresentAddr + ", bioTempPin=" + this.bioTempPin + ", bioTempAdd2=" + this.bioTempAdd2 + ", bioBioidSearch=" + this.bioBioidSearch + ", bioTempAdd1=" + this.bioTempAdd1 + ", bioTokenId=" + this.bioTokenId + ", bioTempAdd3=" + this.bioTempAdd3 + ", bioEndorsedt=" + this.bioEndorsedt + ", bioSwdLname=" + this.bioSwdLname + ", bioRecGenesis=" + this.bioRecGenesis + ", bioPermVillTownCd=" + this.bioPermVillTownCd + ", bioIdentityMark1=" + this.bioIdentityMark1 + ", bioUserId=" + this.bioUserId + ", bioIdentityMark2=" + this.bioIdentityMark2 + ", bioQmQualcd=" + this.bioQmQualcd + ", bioNatName=" + this.bioNatName + ", bioNprNo=" + this.bioNprNo + ", bioAadhaarNo=" + this.bioAadhaarNo + ", bioGender=" + this.bioGender + ", bioPermDistCd=" + this.bioPermDistCd + ", bioTempDistCd=" + this.bioTempDistCd + ", bioPhoneNo=" + this.bioPhoneNo + ", bioTempVillTownCd=" + this.bioTempVillTownCd + ", bioFirstName=" + this.bioFirstName + ", bioMobileNo=" + this.bioMobileNo + ", bioEndorsetime=" + this.bioEndorsetime + ", bioPermVillTownName=" + this.bioPermVillTownName + ", bioOrganDonor=" + this.bioOrganDonor + ", bioTempSdName=" + this.bioTempSdName + ", bioBloodGroupname=" + this.bioBloodGroupname + ", bioTempLocal=" + this.bioTempLocal + ", dob=" + this.dob + ", bioPermLocType=" + this.bioPermLocType + ", bioPermSdcode=" + this.bioPermSdcode + ", fullAddress=" + this.fullAddress + ", bioDob=" + this.bioDob + ", bioApplno=" + this.bioApplno + ", bioBioId=" + this.bioBioId + ", bioAadhaarName=" + this.bioAadhaarName + ", bioEmailId=" + this.bioEmailId + ", bioPoliceStncd=" + this.bioPoliceStncd + ", bioPermPin=" + this.bioPermPin + ", bioTempLocType=" + this.bioTempLocType + ", biPhoto=" + this.biPhoto + ", bioBirthplace=" + this.bioBirthplace + ", bioMiddleName=" + this.bioMiddleName + ", bioPermDistName=" + this.bioPermDistName + ", bioPermAdd3=" + this.bioPermAdd3 + ", bioTempVillTownName=" + this.bioTempVillTownName + ", bioPermAdd1=" + this.bioPermAdd1 + ", bioAltMobileNo=" + this.bioAltMobileNo + ", bioLastName=" + this.bioLastName + ", bioPermAdd2=" + this.bioPermAdd2 + ", bioGenderDesc=" + this.bioGenderDesc + ", bioFullName=" + this.bioFullName + ", bioPerDetAadhaar=" + this.bioPerDetAadhaar + ", bioSwdFname=" + this.bioSwdFname + ", bioTempSdcode=" + this.bioTempSdcode + ", bioQmQualdesc=" + this.bioQmQualdesc + ", bioEndorsementNo=" + this.bioEndorsementNo + ", bioSwdFullName=" + this.bioSwdFullName + ", bioTempDistName=" + this.bioTempDistName + ", bioCitiZen=" + this.bioCitiZen + ", bioSwdMname=" + this.bioSwdMname + ", bioBloodGroup=" + this.bioBloodGroup + ", bioPermLocal=" + this.bioPermLocal + ", pht=" + this.pht + ", bioDlno=" + this.bioDlno + ", bioDependentRelation=" + this.bioDependentRelation + ')';
    }

    public BioObj(Object obj, Object obj2, Object obj3, String str, String str2, Object obj4, String str3, Object obj5, String str4, Object obj6, String str5, String str6, Object obj7, Object obj8, String str7, Object obj9, String str8, String str9, Object obj10, Object obj11, String str10, Object obj12, Object obj13, Object obj14, Object obj15, String str11, Object obj16, Object obj17, Object obj18, String str12, Object obj19, String str13, String str14, Object obj20, String str15, String str16, String str17, String str18, String str19, String str20, Object obj21, Object obj22, Object obj23, String str21, String str22, Object obj24, Object obj25, Object obj26, Object obj27, String str23, Object obj28, String str24, Object obj29, String str25, String str26, String str27, String str28, Object obj30, String str29, String str30, Object obj31, Object obj32, String str31, Object obj33, String str32, Object obj34, String str33, String str34, Object obj35, Object obj36, String str35) {
        this.bioPermSdName = obj;
        this.bioDigest = obj2;
        this.bioStayperiodPresentAddr = obj3;
        this.bioTempPin = str;
        this.bioTempAdd2 = str2;
        this.bioBioidSearch = obj4;
        this.bioTempAdd1 = str3;
        this.bioTokenId = obj5;
        this.bioTempAdd3 = str4;
        this.bioEndorsedt = obj6;
        this.bioSwdLname = str5;
        this.bioRecGenesis = str6;
        this.bioPermVillTownCd = obj7;
        this.bioIdentityMark1 = obj8;
        this.bioUserId = str7;
        this.bioIdentityMark2 = obj9;
        this.bioQmQualcd = str8;
        this.bioNatName = str9;
        this.bioNprNo = obj10;
        this.bioAadhaarNo = obj11;
        this.bioGender = str10;
        this.bioPermDistCd = obj12;
        this.bioTempDistCd = obj13;
        this.bioPhoneNo = obj14;
        this.bioTempVillTownCd = obj15;
        this.bioFirstName = str11;
        this.bioMobileNo = obj16;
        this.bioEndorsetime = obj17;
        this.bioPermVillTownName = obj18;
        this.bioOrganDonor = str12;
        this.bioTempSdName = obj19;
        this.bioBloodGroupname = str13;
        this.bioTempLocal = str14;
        this.dob = obj20;
        this.bioPermLocType = str15;
        this.bioPermSdcode = str16;
        this.fullAddress = str17;
        this.bioDob = str18;
        this.bioApplno = str19;
        this.bioBioId = str20;
        this.bioAadhaarName = obj21;
        this.bioEmailId = obj22;
        this.bioPoliceStncd = obj23;
        this.bioPermPin = str21;
        this.bioTempLocType = str22;
        this.biPhoto = obj24;
        this.bioBirthplace = obj25;
        this.bioMiddleName = obj26;
        this.bioPermDistName = obj27;
        this.bioPermAdd3 = str23;
        this.bioTempVillTownName = obj28;
        this.bioPermAdd1 = str24;
        this.bioAltMobileNo = obj29;
        this.bioLastName = str25;
        this.bioPermAdd2 = str26;
        this.bioGenderDesc = str27;
        this.bioFullName = str28;
        this.bioPerDetAadhaar = obj30;
        this.bioSwdFname = str29;
        this.bioTempSdcode = str30;
        this.bioQmQualdesc = obj31;
        this.bioEndorsementNo = obj32;
        this.bioSwdFullName = str31;
        this.bioTempDistName = obj33;
        this.bioCitiZen = str32;
        this.bioSwdMname = obj34;
        this.bioBloodGroup = str33;
        this.bioPermLocal = str34;
        this.pht = obj35;
        this.bioDlno = obj36;
        this.bioDependentRelation = str35;
    }

    public /* synthetic */ BioObj(Object obj, Object obj2, Object obj3, String str, String str2, Object obj4, String str3, Object obj5, String str4, Object obj6, String str5, String str6, Object obj7, Object obj8, String str7, Object obj9, String str8, String str9, Object obj10, Object obj11, String str10, Object obj12, Object obj13, Object obj14, Object obj15, String str11, Object obj16, Object obj17, Object obj18, String str12, Object obj19, String str13, String str14, Object obj20, String str15, String str16, String str17, String str18, String str19, String str20, Object obj21, Object obj22, Object obj23, String str21, String str22, Object obj24, Object obj25, Object obj26, Object obj27, String str23, Object obj28, String str24, Object obj29, String str25, String str26, String str27, String str28, Object obj30, String str29, String str30, Object obj31, Object obj32, String str31, Object obj33, String str32, Object obj34, String str33, String str34, Object obj35, Object obj36, String str35, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? null : obj2, (i & 4) != 0 ? null : obj3, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : obj4, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : obj5, (i & 256) != 0 ? null : str4, (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : obj6, (i & 1024) != 0 ? null : str5, (i & 2048) != 0 ? null : str6, (i & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? null : obj7, (i & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? null : obj8, (i & 16384) != 0 ? null : str7, (i & 32768) != 0 ? null : obj9, (i & 65536) != 0 ? null : str8, (i & 131072) != 0 ? null : str9, (i & 262144) != 0 ? null : obj10, (i & 524288) != 0 ? null : obj11, (i & 1048576) != 0 ? null : str10, (i & 2097152) != 0 ? null : obj12, (i & 4194304) != 0 ? null : obj13, (i & 8388608) != 0 ? null : obj14, (i & 16777216) != 0 ? null : obj15, (i & 33554432) != 0 ? null : str11, (i & 67108864) != 0 ? null : obj16, (i & 134217728) != 0 ? null : obj17, (i & 268435456) != 0 ? null : obj18, (i & 536870912) != 0 ? null : str12, (i & 1073741824) != 0 ? null : obj19, (i & IntCompanionObject.MIN_VALUE) != 0 ? null : str13, (i2 & 1) != 0 ? null : str14, (i2 & 2) != 0 ? null : obj20, (i2 & 4) != 0 ? null : str15, (i2 & 8) != 0 ? null : str16, (i2 & 16) != 0 ? null : str17, (i2 & 32) != 0 ? null : str18, (i2 & 64) != 0 ? null : str19, (i2 & 128) != 0 ? null : str20, (i2 & 256) != 0 ? null : obj21, (i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : obj22, (i2 & 1024) != 0 ? null : obj23, (i2 & 2048) != 0 ? null : str21, (i2 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? null : str22, (i2 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? null : obj24, (i2 & 16384) != 0 ? null : obj25, (i2 & 32768) != 0 ? null : obj26, (i2 & 65536) != 0 ? null : obj27, (i2 & 131072) != 0 ? null : str23, (i2 & 262144) != 0 ? null : obj28, (i2 & 524288) != 0 ? null : str24, (i2 & 1048576) != 0 ? null : obj29, (i2 & 2097152) != 0 ? null : str25, (i2 & 4194304) != 0 ? null : str26, (i2 & 8388608) != 0 ? null : str27, (i2 & 16777216) != 0 ? null : str28, (i2 & 33554432) != 0 ? null : obj30, (i2 & 67108864) != 0 ? null : str29, (i2 & 134217728) != 0 ? null : str30, (i2 & 268435456) != 0 ? null : obj31, (i2 & 536870912) != 0 ? null : obj32, (i2 & 1073741824) != 0 ? null : str31, (i2 & IntCompanionObject.MIN_VALUE) != 0 ? null : obj33, (i3 & 1) != 0 ? null : str32, (i3 & 2) != 0 ? null : obj34, (i3 & 4) != 0 ? null : str33, (i3 & 8) != 0 ? null : str34, (i3 & 16) != 0 ? null : obj35, (i3 & 32) != 0 ? null : obj36, (i3 & 64) != 0 ? null : str35);
    }
}
