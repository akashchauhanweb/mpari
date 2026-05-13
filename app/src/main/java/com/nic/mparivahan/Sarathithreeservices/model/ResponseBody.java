package com.nic.mparivahan.Sarathithreeservices.model;

import androidx.annotation.Keep;
import com.zepto.xy5;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000I\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0003\bÙ\u0001\b\u0087\b\u0018\u00002\u00020\u0001Bù\u0006\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\u0012\b\u0002\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010TJ\f\u0010¨\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010©\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\f\u0010ª\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010«\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0011\u0010¬\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010}J\f\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010®\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010¯\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010°\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010rJ\u0011\u0010±\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010rJ\f\u0010²\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010³\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010rJ\f\u0010´\u0001\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\f\u0010µ\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010¶\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010rJ\f\u0010·\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010¸\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010¹\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010º\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\f\u0010»\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010¼\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010½\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010¾\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010¿\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\f\u0010À\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010Á\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010Â\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\f\u0010Ã\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010Ä\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010Å\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010Æ\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\f\u0010Ç\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010È\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010rJ\u0011\u0010É\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010rJ\f\u0010Ê\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010Ë\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0011\u0010Ì\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010rJ\u0011\u0010Í\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010rJ\f\u0010Î\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010Ï\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\f\u0010Ð\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\f\u0010Ñ\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\f\u0010Ò\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\f\u0010Ó\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\f\u0010Ô\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0011\u0010Õ\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010rJ\f\u0010Ö\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\f\u0010×\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010Ø\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0011\u0010Ù\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010rJ\f\u0010Ú\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\f\u0010Û\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010Ü\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\f\u0010Ý\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\f\u0010Þ\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010ß\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\f\u0010à\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010á\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010rJ\f\u0010â\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010ã\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010ä\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010å\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0011\u0010æ\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010rJ\f\u0010ç\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010è\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010é\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010ê\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010ë\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010ì\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010rJ\f\u0010í\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010î\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\f\u0010ï\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0014\u0010ð\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u0010HÆ\u0003J\u0084\u0007\u0010ñ\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0012\b\u0002\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00103\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00107\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00109\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0003\u0010ò\u0001J\u0015\u0010ó\u0001\u001a\u00020\u00162\t\u0010ô\u0001\u001a\u0004\u0018\u00010\fHÖ\u0003J\n\u0010õ\u0001\u001a\u00020\u0005HÖ\u0001J\n\u0010ö\u0001\u001a\u00020\u0007HÖ\u0001R\u0018\u00103\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u0010VR\u0018\u0010:\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u0010VR\u0018\u0010A\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bY\u0010VR\u0018\u0010?\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010VR\u0018\u0010=\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b[\u0010VR\u0018\u0010K\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010VR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b]\u0010^R\u0018\u0010>\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b_\u0010^R\u0018\u0010P\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b`\u0010^R\u0018\u00100\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\ba\u0010^R\u0018\u0010/\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bb\u0010VR\u0018\u0010!\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bc\u0010^R\u0018\u0010J\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bd\u0010^R\u0018\u0010)\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\be\u0010^R\u0018\u0010+\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bf\u0010VR\u0018\u00102\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bg\u0010^R\u0018\u0010B\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bh\u0010^R\u0018\u0010-\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bi\u0010^R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bj\u0010VR\u0018\u00107\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bk\u0010VR\u0018\u0010.\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bl\u0010^R\u0018\u0010&\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bm\u0010^R\u0018\u0010E\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bn\u0010^R\u0018\u0010;\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bo\u0010VR\u0018\u00109\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bp\u0010VR\u001a\u0010 \u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010s\u001a\u0004\bq\u0010rR\u0018\u0010#\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bt\u0010^R\u0018\u0010M\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bu\u0010^R\u0018\u0010N\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bv\u0010^R\u0018\u0010S\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bw\u0010VR\u0018\u0010'\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bx\u0010^R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\by\u0010^R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bz\u0010VR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b{\u0010^R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010~\u001a\u0004\b|\u0010}R\u0018\u0010R\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010^R\u0019\u0010%\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010^R\u0019\u0010$\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010VR\u0019\u0010\"\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010^R\u001b\u0010<\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000b\n\u0002\u0010s\u001a\u0005\b\u0083\u0001\u0010rR\u0019\u0010I\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0084\u0001\u0010^R\u001b\u00105\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000b\n\u0002\u0010s\u001a\u0005\b\u0085\u0001\u0010rR\u001b\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000b\n\u0002\u0010s\u001a\u0005\b\u0086\u0001\u0010rR\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000b\n\u0002\u0010s\u001a\u0005\b\u0087\u0001\u0010rR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0088\u0001\u0010VR\u001b\u0010L\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000b\n\u0002\u0010s\u001a\u0005\b\u0089\u0001\u0010rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008a\u0001\u0010^R\u0019\u0010*\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008b\u0001\u0010^R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008c\u0001\u0010^R\u0019\u00106\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008d\u0001\u0010^R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008e\u0001\u0010^R\u001b\u00101\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000b\n\u0002\u0010s\u001a\u0005\b\u008f\u0001\u0010rR\u0019\u0010,\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0090\u0001\u0010^R\u0019\u0010O\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0091\u0001\u0010^R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0092\u0001\u0010^R\u0019\u0010(\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0093\u0001\u0010VR\u0019\u0010H\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0094\u0001\u0010^R\u0019\u0010D\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0095\u0001\u0010VR\u0019\u0010F\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0096\u0001\u0010^R\u001b\u0010Q\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000b\n\u0002\u0010s\u001a\u0005\b\u0097\u0001\u0010rR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0098\u0001\u0010^R\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000b\n\u0002\u0010s\u001a\u0005\b\u0099\u0001\u0010rR\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000b\n\u0002\u0010s\u001a\u0005\b\u009a\u0001\u0010rR\u001b\u0010@\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000b\n\u0002\u0010s\u001a\u0005\b\u009b\u0001\u0010rR\u001b\u0010G\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000b\n\u0002\u0010s\u001a\u0005\b\u009c\u0001\u0010rR\u0019\u0010C\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009d\u0001\u0010VR\u001b\u00104\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000b\n\u0002\u0010s\u001a\u0005\b\u009e\u0001\u0010rR\u0019\u00108\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009f\u0001\u0010VR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b \u0001\u0010¡\u0001R\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b¢\u0001\u0010£\u0001R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b¤\u0001\u0010¥\u0001R\"\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b¦\u0001\u0010§\u0001¨\u0006÷\u0001"}, d2 = {"Lcom/nic/mparivahan/Sarathithreeservices/model/ResponseBody;", "Ljava/io/Serializable;", "genderIndicators", "Lcom/nic/mparivahan/Sarathithreeservices/model/GenderIndicators;", "apdPermVillTownCd", "", "apdReasons", "", "apdPermSdcode", "qualmast", "Lcom/nic/mparivahan/Sarathithreeservices/model/Qualmast;", "apdNprNo", "", "apdOptFaceless", "apdAadhaarName", "transReq", "", "Lcom/nic/mparivahan/Sarathithreeservices/model/TransReqItem;", "apdPhoneNo", "apdNewaddrReq", "apdEffectDate", "apdOrganDonor", "", "apdAppldt", "apdTempLocType", "apdSwdLname", "apdTempPin", "apdTempSdcode", "apdRefLicNo", "olaMast", "Lcom/nic/mparivahan/Sarathithreeservices/model/OlaMast;", "apdStateCd", "apdJuris", "apdBloodGrp", "apdPermAdd3", "apdLastName", "apdPermAdd2", "apdPermAdd1", "apdFirstName", "apdNaturalName", "apdSwdMname", "apdCitizen", "apdRecvdMode", "apdCommunityCd", "apdSwdFname", "apdDob", "apdEsignReqd", "apdBirthplace", "apdBiometricMand", "apdStayperiod", "apdDependentRelation", "Any", "apdUserId", "apdPermPin", "apdRefLicType", "apdEmailId", "apdekycopted", "apdIdentityMark2", "apdAadhaarNo", "apdIdentityMark1", "apdPermDistCd", "apdAddclm3", "apdApplicantCatg", "apdAddclm2", "apdTempVillTownCd", "apdAddclm1", "apdDigest", "apdTransType", "apdTempAdd2", "apdFullName", "apdTempAdd3", "apdTokenId", "apdTempAdd1", "apdPermLocType", "apdCheckUsertoken", "apdAltMobileNo", "apdReasonCd", "apdLltestMand", "apdMiddleName", "apdSwdFullName", "apdBioidSearch", "apdTempDistCd", "apdPerDetAadhaar", "apdMobileNo", "(Lcom/nic/mparivahan/Sarathithreeservices/model/GenderIndicators;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Lcom/nic/mparivahan/Sarathithreeservices/model/Qualmast;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/util/List;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/nic/mparivahan/Sarathithreeservices/model/OlaMast;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Object;)V", "getAny", "()Ljava/lang/Object;", "getApdAadhaarName", "getApdAadhaarNo", "getApdAddclm1", "getApdAddclm2", "getApdAddclm3", "getApdAltMobileNo", "getApdAppldt", "()Ljava/lang/String;", "getApdApplicantCatg", "getApdBioidSearch", "getApdBiometricMand", "getApdBirthplace", "getApdBloodGrp", "getApdCheckUsertoken", "getApdCitizen", "getApdCommunityCd", "getApdDependentRelation", "getApdDigest", "getApdDob", "getApdEffectDate", "getApdEmailId", "getApdEsignReqd", "getApdFirstName", "getApdFullName", "getApdIdentityMark1", "getApdIdentityMark2", "getApdJuris", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getApdLastName", "getApdLltestMand", "getApdMiddleName", "getApdMobileNo", "getApdNaturalName", "getApdNewaddrReq", "getApdNprNo", "getApdOptFaceless", "getApdOrganDonor", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getApdPerDetAadhaar", "getApdPermAdd1", "getApdPermAdd2", "getApdPermAdd3", "getApdPermDistCd", "getApdPermLocType", "getApdPermPin", "getApdPermSdcode", "getApdPermVillTownCd", "getApdPhoneNo", "getApdReasonCd", "getApdReasons", "getApdRecvdMode", "getApdRefLicNo", "getApdRefLicType", "getApdStateCd", "getApdStayperiod", "getApdSwdFname", "getApdSwdFullName", "getApdSwdLname", "getApdSwdMname", "getApdTempAdd1", "getApdTempAdd2", "getApdTempAdd3", "getApdTempDistCd", "getApdTempLocType", "getApdTempPin", "getApdTempSdcode", "getApdTempVillTownCd", "getApdTokenId", "getApdTransType", "getApdUserId", "getApdekycopted", "getGenderIndicators", "()Lcom/nic/mparivahan/Sarathithreeservices/model/GenderIndicators;", "getOlaMast", "()Lcom/nic/mparivahan/Sarathithreeservices/model/OlaMast;", "getQualmast", "()Lcom/nic/mparivahan/Sarathithreeservices/model/Qualmast;", "getTransReq", "()Ljava/util/List;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component6", "component60", "component61", "component62", "component63", "component64", "component65", "component66", "component67", "component68", "component69", "component7", "component70", "component71", "component72", "component73", "component8", "component9", "copy", "(Lcom/nic/mparivahan/Sarathithreeservices/model/GenderIndicators;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Lcom/nic/mparivahan/Sarathithreeservices/model/Qualmast;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/util/List;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/nic/mparivahan/Sarathithreeservices/model/OlaMast;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Object;)Lcom/nic/mparivahan/Sarathithreeservices/model/ResponseBody;", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ResponseBody implements Serializable {

    @xy5("apdApplno")
    private final Object Any;

    @xy5("apdAadhaarName")
    private final Object apdAadhaarName;

    @xy5("apdAadhaarNo")
    private final Object apdAadhaarNo;

    @xy5("apdAddclm1")
    private final Object apdAddclm1;

    @xy5("apdAddclm2")
    private final Object apdAddclm2;

    @xy5("apdAddclm3")
    private final Object apdAddclm3;

    @xy5("apdAltMobileNo")
    private final Object apdAltMobileNo;

    @xy5("apdAppldt")
    private final String apdAppldt;

    @xy5("apdApplicantCatg")
    private final String apdApplicantCatg;

    @xy5("apdBioidSearch")
    private final String apdBioidSearch;

    @xy5("apdBiometricMand")
    private final String apdBiometricMand;

    @xy5("apdBirthplace")
    private final Object apdBirthplace;

    @xy5("apdBloodGrp")
    private final String apdBloodGrp;

    @xy5("apdCheckUsertoken")
    private final String apdCheckUsertoken;

    @xy5("apdCitizen")
    private final String apdCitizen;

    @xy5("apdCommunityCd")
    private final Object apdCommunityCd;

    @xy5("apdDependentRelation")
    private final String apdDependentRelation;

    @xy5("apdDigest")
    private final String apdDigest;

    @xy5("apdDob")
    private final String apdDob;

    @xy5("apdEffectDate")
    private final Object apdEffectDate;

    @xy5("apdEmailId")
    private final Object apdEmailId;

    @xy5("apdEsignReqd")
    private final String apdEsignReqd;

    @xy5("apdFirstName")
    private final String apdFirstName;

    @xy5("apdFullName")
    private final String apdFullName;

    @xy5("apdIdentityMark1")
    private final Object apdIdentityMark1;

    @xy5("apdIdentityMark2")
    private final Object apdIdentityMark2;

    @xy5("apdJuris")
    private final Integer apdJuris;

    @xy5("apdLastName")
    private final String apdLastName;

    @xy5("apdLltestMand")
    private final String apdLltestMand;

    @xy5("apdMiddleName")
    private final String apdMiddleName;

    @xy5("apdMobileNo")
    private final Object apdMobileNo;

    @xy5("apdNaturalName")
    private final String apdNaturalName;

    @xy5("apdNewaddrReq")
    private final String apdNewaddrReq;

    @xy5("apdNprNo")
    private final Object apdNprNo;

    @xy5("apdOptFaceless")
    private final String apdOptFaceless;

    @xy5("apdOrganDonor")
    private final Boolean apdOrganDonor;

    @xy5("apdPerDetAadhaar")
    private final String apdPerDetAadhaar;

    @xy5("apdPermAdd1")
    private final String apdPermAdd1;

    @xy5("apdPermAdd2")
    private final Object apdPermAdd2;

    @xy5("apdPermAdd3")
    private final String apdPermAdd3;

    @xy5("apdPermDistCd")
    private final Integer apdPermDistCd;

    @xy5("apdPermLocType")
    private final String apdPermLocType;

    @xy5("apdPermPin")
    private final Integer apdPermPin;

    @xy5("apdPermSdcode")
    private final Integer apdPermSdcode;

    @xy5("apdPermVillTownCd")
    private final Integer apdPermVillTownCd;

    @xy5("apdPhoneNo")
    private final Object apdPhoneNo;

    @xy5("apdReasonCd")
    private final Integer apdReasonCd;

    @xy5("apdReasons")
    private final String apdReasons;

    @xy5("apdRecvdMode")
    private final String apdRecvdMode;

    @xy5("apdRefLicNo")
    private final String apdRefLicNo;

    @xy5("apdRefLicType")
    private final String apdRefLicType;

    @xy5("apdStateCd")
    private final String apdStateCd;

    @xy5("apdStayperiod")
    private final Integer apdStayperiod;

    @xy5("apdSwdFname")
    private final String apdSwdFname;

    @xy5("apdSwdFullName")
    private final String apdSwdFullName;

    @xy5("apdSwdLname")
    private final String apdSwdLname;

    @xy5("apdSwdMname")
    private final Object apdSwdMname;

    @xy5("apdTempAdd1")
    private final String apdTempAdd1;

    @xy5("apdTempAdd2")
    private final Object apdTempAdd2;

    @xy5("apdTempAdd3")
    private final String apdTempAdd3;

    @xy5("apdTempDistCd")
    private final Integer apdTempDistCd;

    @xy5("apdTempLocType")
    private final String apdTempLocType;

    @xy5("apdTempPin")
    private final Integer apdTempPin;

    @xy5("apdTempSdcode")
    private final Integer apdTempSdcode;

    @xy5("apdTempVillTownCd")
    private final Integer apdTempVillTownCd;

    @xy5("apdTokenId")
    private final Integer apdTokenId;

    @xy5("apdTransType")
    private final Object apdTransType;

    @xy5("apdUserId")
    private final Integer apdUserId;

    @xy5("apdekycopted")
    private final Object apdekycopted;

    @xy5("genderIndicators")
    private final GenderIndicators genderIndicators;

    @xy5("olaMast")
    private final OlaMast olaMast;

    @xy5("qualmast")
    private final Qualmast qualmast;

    @xy5("transReq")
    private final List<TransReqItem> transReq;

    public ResponseBody() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 511, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final GenderIndicators getGenderIndicators() {
        return this.genderIndicators;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Object getApdPhoneNo() {
        return this.apdPhoneNo;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getApdNewaddrReq() {
        return this.apdNewaddrReq;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Object getApdEffectDate() {
        return this.apdEffectDate;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Boolean getApdOrganDonor() {
        return this.apdOrganDonor;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getApdAppldt() {
        return this.apdAppldt;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getApdTempLocType() {
        return this.apdTempLocType;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getApdSwdLname() {
        return this.apdSwdLname;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Integer getApdTempPin() {
        return this.apdTempPin;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Integer getApdTempSdcode() {
        return this.apdTempSdcode;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getApdRefLicNo() {
        return this.apdRefLicNo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getApdPermVillTownCd() {
        return this.apdPermVillTownCd;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final OlaMast getOlaMast() {
        return this.olaMast;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getApdStateCd() {
        return this.apdStateCd;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Integer getApdJuris() {
        return this.apdJuris;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getApdBloodGrp() {
        return this.apdBloodGrp;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getApdPermAdd3() {
        return this.apdPermAdd3;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getApdLastName() {
        return this.apdLastName;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final Object getApdPermAdd2() {
        return this.apdPermAdd2;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getApdPermAdd1() {
        return this.apdPermAdd1;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getApdFirstName() {
        return this.apdFirstName;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getApdNaturalName() {
        return this.apdNaturalName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getApdReasons() {
        return this.apdReasons;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final Object getApdSwdMname() {
        return this.apdSwdMname;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getApdCitizen() {
        return this.apdCitizen;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getApdRecvdMode() {
        return this.apdRecvdMode;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final Object getApdCommunityCd() {
        return this.apdCommunityCd;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final String getApdSwdFname() {
        return this.apdSwdFname;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final String getApdDob() {
        return this.apdDob;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final String getApdEsignReqd() {
        return this.apdEsignReqd;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final Object getApdBirthplace() {
        return this.apdBirthplace;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final String getApdBiometricMand() {
        return this.apdBiometricMand;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final Integer getApdStayperiod() {
        return this.apdStayperiod;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getApdPermSdcode() {
        return this.apdPermSdcode;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final String getApdDependentRelation() {
        return this.apdDependentRelation;
    }

    /* JADX INFO: renamed from: component41, reason: from getter */
    public final Object getAny() {
        return this.Any;
    }

    /* JADX INFO: renamed from: component42, reason: from getter */
    public final Integer getApdUserId() {
        return this.apdUserId;
    }

    /* JADX INFO: renamed from: component43, reason: from getter */
    public final Integer getApdPermPin() {
        return this.apdPermPin;
    }

    /* JADX INFO: renamed from: component44, reason: from getter */
    public final String getApdRefLicType() {
        return this.apdRefLicType;
    }

    /* JADX INFO: renamed from: component45, reason: from getter */
    public final Object getApdEmailId() {
        return this.apdEmailId;
    }

    /* JADX INFO: renamed from: component46, reason: from getter */
    public final Object getApdekycopted() {
        return this.apdekycopted;
    }

    /* JADX INFO: renamed from: component47, reason: from getter */
    public final Object getApdIdentityMark2() {
        return this.apdIdentityMark2;
    }

    /* JADX INFO: renamed from: component48, reason: from getter */
    public final Object getApdAadhaarNo() {
        return this.apdAadhaarNo;
    }

    /* JADX INFO: renamed from: component49, reason: from getter */
    public final Object getApdIdentityMark1() {
        return this.apdIdentityMark1;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Qualmast getQualmast() {
        return this.qualmast;
    }

    /* JADX INFO: renamed from: component50, reason: from getter */
    public final Integer getApdPermDistCd() {
        return this.apdPermDistCd;
    }

    /* JADX INFO: renamed from: component51, reason: from getter */
    public final Object getApdAddclm3() {
        return this.apdAddclm3;
    }

    /* JADX INFO: renamed from: component52, reason: from getter */
    public final String getApdApplicantCatg() {
        return this.apdApplicantCatg;
    }

    /* JADX INFO: renamed from: component53, reason: from getter */
    public final Object getApdAddclm2() {
        return this.apdAddclm2;
    }

    /* JADX INFO: renamed from: component54, reason: from getter */
    public final Integer getApdTempVillTownCd() {
        return this.apdTempVillTownCd;
    }

    /* JADX INFO: renamed from: component55, reason: from getter */
    public final Object getApdAddclm1() {
        return this.apdAddclm1;
    }

    /* JADX INFO: renamed from: component56, reason: from getter */
    public final String getApdDigest() {
        return this.apdDigest;
    }

    /* JADX INFO: renamed from: component57, reason: from getter */
    public final Object getApdTransType() {
        return this.apdTransType;
    }

    /* JADX INFO: renamed from: component58, reason: from getter */
    public final Object getApdTempAdd2() {
        return this.apdTempAdd2;
    }

    /* JADX INFO: renamed from: component59, reason: from getter */
    public final String getApdFullName() {
        return this.apdFullName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Object getApdNprNo() {
        return this.apdNprNo;
    }

    /* JADX INFO: renamed from: component60, reason: from getter */
    public final String getApdTempAdd3() {
        return this.apdTempAdd3;
    }

    /* JADX INFO: renamed from: component61, reason: from getter */
    public final Integer getApdTokenId() {
        return this.apdTokenId;
    }

    /* JADX INFO: renamed from: component62, reason: from getter */
    public final String getApdTempAdd1() {
        return this.apdTempAdd1;
    }

    /* JADX INFO: renamed from: component63, reason: from getter */
    public final String getApdPermLocType() {
        return this.apdPermLocType;
    }

    /* JADX INFO: renamed from: component64, reason: from getter */
    public final String getApdCheckUsertoken() {
        return this.apdCheckUsertoken;
    }

    /* JADX INFO: renamed from: component65, reason: from getter */
    public final Object getApdAltMobileNo() {
        return this.apdAltMobileNo;
    }

    /* JADX INFO: renamed from: component66, reason: from getter */
    public final Integer getApdReasonCd() {
        return this.apdReasonCd;
    }

    /* JADX INFO: renamed from: component67, reason: from getter */
    public final String getApdLltestMand() {
        return this.apdLltestMand;
    }

    /* JADX INFO: renamed from: component68, reason: from getter */
    public final String getApdMiddleName() {
        return this.apdMiddleName;
    }

    /* JADX INFO: renamed from: component69, reason: from getter */
    public final String getApdSwdFullName() {
        return this.apdSwdFullName;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getApdOptFaceless() {
        return this.apdOptFaceless;
    }

    /* JADX INFO: renamed from: component70, reason: from getter */
    public final String getApdBioidSearch() {
        return this.apdBioidSearch;
    }

    /* JADX INFO: renamed from: component71, reason: from getter */
    public final Integer getApdTempDistCd() {
        return this.apdTempDistCd;
    }

    /* JADX INFO: renamed from: component72, reason: from getter */
    public final String getApdPerDetAadhaar() {
        return this.apdPerDetAadhaar;
    }

    /* JADX INFO: renamed from: component73, reason: from getter */
    public final Object getApdMobileNo() {
        return this.apdMobileNo;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Object getApdAadhaarName() {
        return this.apdAadhaarName;
    }

    public final List<TransReqItem> component9() {
        return this.transReq;
    }

    public final ResponseBody copy(GenderIndicators genderIndicators, Integer apdPermVillTownCd, String apdReasons, Integer apdPermSdcode, Qualmast qualmast, Object apdNprNo, String apdOptFaceless, Object apdAadhaarName, List<TransReqItem> transReq, Object apdPhoneNo, String apdNewaddrReq, Object apdEffectDate, Boolean apdOrganDonor, String apdAppldt, String apdTempLocType, String apdSwdLname, Integer apdTempPin, Integer apdTempSdcode, String apdRefLicNo, OlaMast olaMast, String apdStateCd, Integer apdJuris, String apdBloodGrp, String apdPermAdd3, String apdLastName, Object apdPermAdd2, String apdPermAdd1, String apdFirstName, String apdNaturalName, Object apdSwdMname, String apdCitizen, String apdRecvdMode, Object apdCommunityCd, String apdSwdFname, String apdDob, String apdEsignReqd, Object apdBirthplace, String apdBiometricMand, Integer apdStayperiod, String apdDependentRelation, Object Any, Integer apdUserId, Integer apdPermPin, String apdRefLicType, Object apdEmailId, Object apdekycopted, Object apdIdentityMark2, Object apdAadhaarNo, Object apdIdentityMark1, Integer apdPermDistCd, Object apdAddclm3, String apdApplicantCatg, Object apdAddclm2, Integer apdTempVillTownCd, Object apdAddclm1, String apdDigest, Object apdTransType, Object apdTempAdd2, String apdFullName, String apdTempAdd3, Integer apdTokenId, String apdTempAdd1, String apdPermLocType, String apdCheckUsertoken, Object apdAltMobileNo, Integer apdReasonCd, String apdLltestMand, String apdMiddleName, String apdSwdFullName, String apdBioidSearch, Integer apdTempDistCd, String apdPerDetAadhaar, Object apdMobileNo) {
        return new ResponseBody(genderIndicators, apdPermVillTownCd, apdReasons, apdPermSdcode, qualmast, apdNprNo, apdOptFaceless, apdAadhaarName, transReq, apdPhoneNo, apdNewaddrReq, apdEffectDate, apdOrganDonor, apdAppldt, apdTempLocType, apdSwdLname, apdTempPin, apdTempSdcode, apdRefLicNo, olaMast, apdStateCd, apdJuris, apdBloodGrp, apdPermAdd3, apdLastName, apdPermAdd2, apdPermAdd1, apdFirstName, apdNaturalName, apdSwdMname, apdCitizen, apdRecvdMode, apdCommunityCd, apdSwdFname, apdDob, apdEsignReqd, apdBirthplace, apdBiometricMand, apdStayperiod, apdDependentRelation, Any, apdUserId, apdPermPin, apdRefLicType, apdEmailId, apdekycopted, apdIdentityMark2, apdAadhaarNo, apdIdentityMark1, apdPermDistCd, apdAddclm3, apdApplicantCatg, apdAddclm2, apdTempVillTownCd, apdAddclm1, apdDigest, apdTransType, apdTempAdd2, apdFullName, apdTempAdd3, apdTokenId, apdTempAdd1, apdPermLocType, apdCheckUsertoken, apdAltMobileNo, apdReasonCd, apdLltestMand, apdMiddleName, apdSwdFullName, apdBioidSearch, apdTempDistCd, apdPerDetAadhaar, apdMobileNo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResponseBody)) {
            return false;
        }
        ResponseBody responseBody = (ResponseBody) other;
        return Intrinsics.areEqual(this.genderIndicators, responseBody.genderIndicators) && Intrinsics.areEqual(this.apdPermVillTownCd, responseBody.apdPermVillTownCd) && Intrinsics.areEqual(this.apdReasons, responseBody.apdReasons) && Intrinsics.areEqual(this.apdPermSdcode, responseBody.apdPermSdcode) && Intrinsics.areEqual(this.qualmast, responseBody.qualmast) && Intrinsics.areEqual(this.apdNprNo, responseBody.apdNprNo) && Intrinsics.areEqual(this.apdOptFaceless, responseBody.apdOptFaceless) && Intrinsics.areEqual(this.apdAadhaarName, responseBody.apdAadhaarName) && Intrinsics.areEqual(this.transReq, responseBody.transReq) && Intrinsics.areEqual(this.apdPhoneNo, responseBody.apdPhoneNo) && Intrinsics.areEqual(this.apdNewaddrReq, responseBody.apdNewaddrReq) && Intrinsics.areEqual(this.apdEffectDate, responseBody.apdEffectDate) && Intrinsics.areEqual(this.apdOrganDonor, responseBody.apdOrganDonor) && Intrinsics.areEqual(this.apdAppldt, responseBody.apdAppldt) && Intrinsics.areEqual(this.apdTempLocType, responseBody.apdTempLocType) && Intrinsics.areEqual(this.apdSwdLname, responseBody.apdSwdLname) && Intrinsics.areEqual(this.apdTempPin, responseBody.apdTempPin) && Intrinsics.areEqual(this.apdTempSdcode, responseBody.apdTempSdcode) && Intrinsics.areEqual(this.apdRefLicNo, responseBody.apdRefLicNo) && Intrinsics.areEqual(this.olaMast, responseBody.olaMast) && Intrinsics.areEqual(this.apdStateCd, responseBody.apdStateCd) && Intrinsics.areEqual(this.apdJuris, responseBody.apdJuris) && Intrinsics.areEqual(this.apdBloodGrp, responseBody.apdBloodGrp) && Intrinsics.areEqual(this.apdPermAdd3, responseBody.apdPermAdd3) && Intrinsics.areEqual(this.apdLastName, responseBody.apdLastName) && Intrinsics.areEqual(this.apdPermAdd2, responseBody.apdPermAdd2) && Intrinsics.areEqual(this.apdPermAdd1, responseBody.apdPermAdd1) && Intrinsics.areEqual(this.apdFirstName, responseBody.apdFirstName) && Intrinsics.areEqual(this.apdNaturalName, responseBody.apdNaturalName) && Intrinsics.areEqual(this.apdSwdMname, responseBody.apdSwdMname) && Intrinsics.areEqual(this.apdCitizen, responseBody.apdCitizen) && Intrinsics.areEqual(this.apdRecvdMode, responseBody.apdRecvdMode) && Intrinsics.areEqual(this.apdCommunityCd, responseBody.apdCommunityCd) && Intrinsics.areEqual(this.apdSwdFname, responseBody.apdSwdFname) && Intrinsics.areEqual(this.apdDob, responseBody.apdDob) && Intrinsics.areEqual(this.apdEsignReqd, responseBody.apdEsignReqd) && Intrinsics.areEqual(this.apdBirthplace, responseBody.apdBirthplace) && Intrinsics.areEqual(this.apdBiometricMand, responseBody.apdBiometricMand) && Intrinsics.areEqual(this.apdStayperiod, responseBody.apdStayperiod) && Intrinsics.areEqual(this.apdDependentRelation, responseBody.apdDependentRelation) && Intrinsics.areEqual(this.Any, responseBody.Any) && Intrinsics.areEqual(this.apdUserId, responseBody.apdUserId) && Intrinsics.areEqual(this.apdPermPin, responseBody.apdPermPin) && Intrinsics.areEqual(this.apdRefLicType, responseBody.apdRefLicType) && Intrinsics.areEqual(this.apdEmailId, responseBody.apdEmailId) && Intrinsics.areEqual(this.apdekycopted, responseBody.apdekycopted) && Intrinsics.areEqual(this.apdIdentityMark2, responseBody.apdIdentityMark2) && Intrinsics.areEqual(this.apdAadhaarNo, responseBody.apdAadhaarNo) && Intrinsics.areEqual(this.apdIdentityMark1, responseBody.apdIdentityMark1) && Intrinsics.areEqual(this.apdPermDistCd, responseBody.apdPermDistCd) && Intrinsics.areEqual(this.apdAddclm3, responseBody.apdAddclm3) && Intrinsics.areEqual(this.apdApplicantCatg, responseBody.apdApplicantCatg) && Intrinsics.areEqual(this.apdAddclm2, responseBody.apdAddclm2) && Intrinsics.areEqual(this.apdTempVillTownCd, responseBody.apdTempVillTownCd) && Intrinsics.areEqual(this.apdAddclm1, responseBody.apdAddclm1) && Intrinsics.areEqual(this.apdDigest, responseBody.apdDigest) && Intrinsics.areEqual(this.apdTransType, responseBody.apdTransType) && Intrinsics.areEqual(this.apdTempAdd2, responseBody.apdTempAdd2) && Intrinsics.areEqual(this.apdFullName, responseBody.apdFullName) && Intrinsics.areEqual(this.apdTempAdd3, responseBody.apdTempAdd3) && Intrinsics.areEqual(this.apdTokenId, responseBody.apdTokenId) && Intrinsics.areEqual(this.apdTempAdd1, responseBody.apdTempAdd1) && Intrinsics.areEqual(this.apdPermLocType, responseBody.apdPermLocType) && Intrinsics.areEqual(this.apdCheckUsertoken, responseBody.apdCheckUsertoken) && Intrinsics.areEqual(this.apdAltMobileNo, responseBody.apdAltMobileNo) && Intrinsics.areEqual(this.apdReasonCd, responseBody.apdReasonCd) && Intrinsics.areEqual(this.apdLltestMand, responseBody.apdLltestMand) && Intrinsics.areEqual(this.apdMiddleName, responseBody.apdMiddleName) && Intrinsics.areEqual(this.apdSwdFullName, responseBody.apdSwdFullName) && Intrinsics.areEqual(this.apdBioidSearch, responseBody.apdBioidSearch) && Intrinsics.areEqual(this.apdTempDistCd, responseBody.apdTempDistCd) && Intrinsics.areEqual(this.apdPerDetAadhaar, responseBody.apdPerDetAadhaar) && Intrinsics.areEqual(this.apdMobileNo, responseBody.apdMobileNo);
    }

    public final Object getAny() {
        return this.Any;
    }

    public final Object getApdAadhaarName() {
        return this.apdAadhaarName;
    }

    public final Object getApdAadhaarNo() {
        return this.apdAadhaarNo;
    }

    public final Object getApdAddclm1() {
        return this.apdAddclm1;
    }

    public final Object getApdAddclm2() {
        return this.apdAddclm2;
    }

    public final Object getApdAddclm3() {
        return this.apdAddclm3;
    }

    public final Object getApdAltMobileNo() {
        return this.apdAltMobileNo;
    }

    public final String getApdAppldt() {
        return this.apdAppldt;
    }

    public final String getApdApplicantCatg() {
        return this.apdApplicantCatg;
    }

    public final String getApdBioidSearch() {
        return this.apdBioidSearch;
    }

    public final String getApdBiometricMand() {
        return this.apdBiometricMand;
    }

    public final Object getApdBirthplace() {
        return this.apdBirthplace;
    }

    public final String getApdBloodGrp() {
        return this.apdBloodGrp;
    }

    public final String getApdCheckUsertoken() {
        return this.apdCheckUsertoken;
    }

    public final String getApdCitizen() {
        return this.apdCitizen;
    }

    public final Object getApdCommunityCd() {
        return this.apdCommunityCd;
    }

    public final String getApdDependentRelation() {
        return this.apdDependentRelation;
    }

    public final String getApdDigest() {
        return this.apdDigest;
    }

    public final String getApdDob() {
        return this.apdDob;
    }

    public final Object getApdEffectDate() {
        return this.apdEffectDate;
    }

    public final Object getApdEmailId() {
        return this.apdEmailId;
    }

    public final String getApdEsignReqd() {
        return this.apdEsignReqd;
    }

    public final String getApdFirstName() {
        return this.apdFirstName;
    }

    public final String getApdFullName() {
        return this.apdFullName;
    }

    public final Object getApdIdentityMark1() {
        return this.apdIdentityMark1;
    }

    public final Object getApdIdentityMark2() {
        return this.apdIdentityMark2;
    }

    public final Integer getApdJuris() {
        return this.apdJuris;
    }

    public final String getApdLastName() {
        return this.apdLastName;
    }

    public final String getApdLltestMand() {
        return this.apdLltestMand;
    }

    public final String getApdMiddleName() {
        return this.apdMiddleName;
    }

    public final Object getApdMobileNo() {
        return this.apdMobileNo;
    }

    public final String getApdNaturalName() {
        return this.apdNaturalName;
    }

    public final String getApdNewaddrReq() {
        return this.apdNewaddrReq;
    }

    public final Object getApdNprNo() {
        return this.apdNprNo;
    }

    public final String getApdOptFaceless() {
        return this.apdOptFaceless;
    }

    public final Boolean getApdOrganDonor() {
        return this.apdOrganDonor;
    }

    public final String getApdPerDetAadhaar() {
        return this.apdPerDetAadhaar;
    }

    public final String getApdPermAdd1() {
        return this.apdPermAdd1;
    }

    public final Object getApdPermAdd2() {
        return this.apdPermAdd2;
    }

    public final String getApdPermAdd3() {
        return this.apdPermAdd3;
    }

    public final Integer getApdPermDistCd() {
        return this.apdPermDistCd;
    }

    public final String getApdPermLocType() {
        return this.apdPermLocType;
    }

    public final Integer getApdPermPin() {
        return this.apdPermPin;
    }

    public final Integer getApdPermSdcode() {
        return this.apdPermSdcode;
    }

    public final Integer getApdPermVillTownCd() {
        return this.apdPermVillTownCd;
    }

    public final Object getApdPhoneNo() {
        return this.apdPhoneNo;
    }

    public final Integer getApdReasonCd() {
        return this.apdReasonCd;
    }

    public final String getApdReasons() {
        return this.apdReasons;
    }

    public final String getApdRecvdMode() {
        return this.apdRecvdMode;
    }

    public final String getApdRefLicNo() {
        return this.apdRefLicNo;
    }

    public final String getApdRefLicType() {
        return this.apdRefLicType;
    }

    public final String getApdStateCd() {
        return this.apdStateCd;
    }

    public final Integer getApdStayperiod() {
        return this.apdStayperiod;
    }

    public final String getApdSwdFname() {
        return this.apdSwdFname;
    }

    public final String getApdSwdFullName() {
        return this.apdSwdFullName;
    }

    public final String getApdSwdLname() {
        return this.apdSwdLname;
    }

    public final Object getApdSwdMname() {
        return this.apdSwdMname;
    }

    public final String getApdTempAdd1() {
        return this.apdTempAdd1;
    }

    public final Object getApdTempAdd2() {
        return this.apdTempAdd2;
    }

    public final String getApdTempAdd3() {
        return this.apdTempAdd3;
    }

    public final Integer getApdTempDistCd() {
        return this.apdTempDistCd;
    }

    public final String getApdTempLocType() {
        return this.apdTempLocType;
    }

    public final Integer getApdTempPin() {
        return this.apdTempPin;
    }

    public final Integer getApdTempSdcode() {
        return this.apdTempSdcode;
    }

    public final Integer getApdTempVillTownCd() {
        return this.apdTempVillTownCd;
    }

    public final Integer getApdTokenId() {
        return this.apdTokenId;
    }

    public final Object getApdTransType() {
        return this.apdTransType;
    }

    public final Integer getApdUserId() {
        return this.apdUserId;
    }

    public final Object getApdekycopted() {
        return this.apdekycopted;
    }

    public final GenderIndicators getGenderIndicators() {
        return this.genderIndicators;
    }

    public final OlaMast getOlaMast() {
        return this.olaMast;
    }

    public final Qualmast getQualmast() {
        return this.qualmast;
    }

    public final List<TransReqItem> getTransReq() {
        return this.transReq;
    }

    public int hashCode() {
        GenderIndicators genderIndicators = this.genderIndicators;
        int iHashCode = (genderIndicators == null ? 0 : genderIndicators.hashCode()) * 31;
        Integer num = this.apdPermVillTownCd;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.apdReasons;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.apdPermSdcode;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Qualmast qualmast = this.qualmast;
        int iHashCode5 = (iHashCode4 + (qualmast == null ? 0 : qualmast.hashCode())) * 31;
        Object obj = this.apdNprNo;
        int iHashCode6 = (iHashCode5 + (obj == null ? 0 : obj.hashCode())) * 31;
        String str2 = this.apdOptFaceless;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Object obj2 = this.apdAadhaarName;
        int iHashCode8 = (iHashCode7 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        List<TransReqItem> list = this.transReq;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        Object obj3 = this.apdPhoneNo;
        int iHashCode10 = (iHashCode9 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        String str3 = this.apdNewaddrReq;
        int iHashCode11 = (iHashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Object obj4 = this.apdEffectDate;
        int iHashCode12 = (iHashCode11 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        Boolean bool = this.apdOrganDonor;
        int iHashCode13 = (iHashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.apdAppldt;
        int iHashCode14 = (iHashCode13 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.apdTempLocType;
        int iHashCode15 = (iHashCode14 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.apdSwdLname;
        int iHashCode16 = (iHashCode15 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num3 = this.apdTempPin;
        int iHashCode17 = (iHashCode16 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.apdTempSdcode;
        int iHashCode18 = (iHashCode17 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str7 = this.apdRefLicNo;
        int iHashCode19 = (iHashCode18 + (str7 == null ? 0 : str7.hashCode())) * 31;
        OlaMast olaMast = this.olaMast;
        int iHashCode20 = (iHashCode19 + (olaMast == null ? 0 : olaMast.hashCode())) * 31;
        String str8 = this.apdStateCd;
        int iHashCode21 = (iHashCode20 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num5 = this.apdJuris;
        int iHashCode22 = (iHashCode21 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str9 = this.apdBloodGrp;
        int iHashCode23 = (iHashCode22 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.apdPermAdd3;
        int iHashCode24 = (iHashCode23 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.apdLastName;
        int iHashCode25 = (iHashCode24 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Object obj5 = this.apdPermAdd2;
        int iHashCode26 = (iHashCode25 + (obj5 == null ? 0 : obj5.hashCode())) * 31;
        String str12 = this.apdPermAdd1;
        int iHashCode27 = (iHashCode26 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.apdFirstName;
        int iHashCode28 = (iHashCode27 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.apdNaturalName;
        int iHashCode29 = (iHashCode28 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Object obj6 = this.apdSwdMname;
        int iHashCode30 = (iHashCode29 + (obj6 == null ? 0 : obj6.hashCode())) * 31;
        String str15 = this.apdCitizen;
        int iHashCode31 = (iHashCode30 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.apdRecvdMode;
        int iHashCode32 = (iHashCode31 + (str16 == null ? 0 : str16.hashCode())) * 31;
        Object obj7 = this.apdCommunityCd;
        int iHashCode33 = (iHashCode32 + (obj7 == null ? 0 : obj7.hashCode())) * 31;
        String str17 = this.apdSwdFname;
        int iHashCode34 = (iHashCode33 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.apdDob;
        int iHashCode35 = (iHashCode34 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.apdEsignReqd;
        int iHashCode36 = (iHashCode35 + (str19 == null ? 0 : str19.hashCode())) * 31;
        Object obj8 = this.apdBirthplace;
        int iHashCode37 = (iHashCode36 + (obj8 == null ? 0 : obj8.hashCode())) * 31;
        String str20 = this.apdBiometricMand;
        int iHashCode38 = (iHashCode37 + (str20 == null ? 0 : str20.hashCode())) * 31;
        Integer num6 = this.apdStayperiod;
        int iHashCode39 = (iHashCode38 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str21 = this.apdDependentRelation;
        int iHashCode40 = (iHashCode39 + (str21 == null ? 0 : str21.hashCode())) * 31;
        Object obj9 = this.Any;
        int iHashCode41 = (iHashCode40 + (obj9 == null ? 0 : obj9.hashCode())) * 31;
        Integer num7 = this.apdUserId;
        int iHashCode42 = (iHashCode41 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.apdPermPin;
        int iHashCode43 = (iHashCode42 + (num8 == null ? 0 : num8.hashCode())) * 31;
        String str22 = this.apdRefLicType;
        int iHashCode44 = (iHashCode43 + (str22 == null ? 0 : str22.hashCode())) * 31;
        Object obj10 = this.apdEmailId;
        int iHashCode45 = (iHashCode44 + (obj10 == null ? 0 : obj10.hashCode())) * 31;
        Object obj11 = this.apdekycopted;
        int iHashCode46 = (iHashCode45 + (obj11 == null ? 0 : obj11.hashCode())) * 31;
        Object obj12 = this.apdIdentityMark2;
        int iHashCode47 = (iHashCode46 + (obj12 == null ? 0 : obj12.hashCode())) * 31;
        Object obj13 = this.apdAadhaarNo;
        int iHashCode48 = (iHashCode47 + (obj13 == null ? 0 : obj13.hashCode())) * 31;
        Object obj14 = this.apdIdentityMark1;
        int iHashCode49 = (iHashCode48 + (obj14 == null ? 0 : obj14.hashCode())) * 31;
        Integer num9 = this.apdPermDistCd;
        int iHashCode50 = (iHashCode49 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Object obj15 = this.apdAddclm3;
        int iHashCode51 = (iHashCode50 + (obj15 == null ? 0 : obj15.hashCode())) * 31;
        String str23 = this.apdApplicantCatg;
        int iHashCode52 = (iHashCode51 + (str23 == null ? 0 : str23.hashCode())) * 31;
        Object obj16 = this.apdAddclm2;
        int iHashCode53 = (iHashCode52 + (obj16 == null ? 0 : obj16.hashCode())) * 31;
        Integer num10 = this.apdTempVillTownCd;
        int iHashCode54 = (iHashCode53 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Object obj17 = this.apdAddclm1;
        int iHashCode55 = (iHashCode54 + (obj17 == null ? 0 : obj17.hashCode())) * 31;
        String str24 = this.apdDigest;
        int iHashCode56 = (iHashCode55 + (str24 == null ? 0 : str24.hashCode())) * 31;
        Object obj18 = this.apdTransType;
        int iHashCode57 = (iHashCode56 + (obj18 == null ? 0 : obj18.hashCode())) * 31;
        Object obj19 = this.apdTempAdd2;
        int iHashCode58 = (iHashCode57 + (obj19 == null ? 0 : obj19.hashCode())) * 31;
        String str25 = this.apdFullName;
        int iHashCode59 = (iHashCode58 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.apdTempAdd3;
        int iHashCode60 = (iHashCode59 + (str26 == null ? 0 : str26.hashCode())) * 31;
        Integer num11 = this.apdTokenId;
        int iHashCode61 = (iHashCode60 + (num11 == null ? 0 : num11.hashCode())) * 31;
        String str27 = this.apdTempAdd1;
        int iHashCode62 = (iHashCode61 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.apdPermLocType;
        int iHashCode63 = (iHashCode62 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.apdCheckUsertoken;
        int iHashCode64 = (iHashCode63 + (str29 == null ? 0 : str29.hashCode())) * 31;
        Object obj20 = this.apdAltMobileNo;
        int iHashCode65 = (iHashCode64 + (obj20 == null ? 0 : obj20.hashCode())) * 31;
        Integer num12 = this.apdReasonCd;
        int iHashCode66 = (iHashCode65 + (num12 == null ? 0 : num12.hashCode())) * 31;
        String str30 = this.apdLltestMand;
        int iHashCode67 = (iHashCode66 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.apdMiddleName;
        int iHashCode68 = (iHashCode67 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.apdSwdFullName;
        int iHashCode69 = (iHashCode68 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.apdBioidSearch;
        int iHashCode70 = (iHashCode69 + (str33 == null ? 0 : str33.hashCode())) * 31;
        Integer num13 = this.apdTempDistCd;
        int iHashCode71 = (iHashCode70 + (num13 == null ? 0 : num13.hashCode())) * 31;
        String str34 = this.apdPerDetAadhaar;
        int iHashCode72 = (iHashCode71 + (str34 == null ? 0 : str34.hashCode())) * 31;
        Object obj21 = this.apdMobileNo;
        return iHashCode72 + (obj21 != null ? obj21.hashCode() : 0);
    }

    public String toString() {
        return "ResponseBody(genderIndicators=" + this.genderIndicators + ", apdPermVillTownCd=" + this.apdPermVillTownCd + ", apdReasons=" + this.apdReasons + ", apdPermSdcode=" + this.apdPermSdcode + ", qualmast=" + this.qualmast + ", apdNprNo=" + this.apdNprNo + ", apdOptFaceless=" + this.apdOptFaceless + ", apdAadhaarName=" + this.apdAadhaarName + ", transReq=" + this.transReq + ", apdPhoneNo=" + this.apdPhoneNo + ", apdNewaddrReq=" + this.apdNewaddrReq + ", apdEffectDate=" + this.apdEffectDate + ", apdOrganDonor=" + this.apdOrganDonor + ", apdAppldt=" + this.apdAppldt + ", apdTempLocType=" + this.apdTempLocType + ", apdSwdLname=" + this.apdSwdLname + ", apdTempPin=" + this.apdTempPin + ", apdTempSdcode=" + this.apdTempSdcode + ", apdRefLicNo=" + this.apdRefLicNo + ", olaMast=" + this.olaMast + ", apdStateCd=" + this.apdStateCd + ", apdJuris=" + this.apdJuris + ", apdBloodGrp=" + this.apdBloodGrp + ", apdPermAdd3=" + this.apdPermAdd3 + ", apdLastName=" + this.apdLastName + ", apdPermAdd2=" + this.apdPermAdd2 + ", apdPermAdd1=" + this.apdPermAdd1 + ", apdFirstName=" + this.apdFirstName + ", apdNaturalName=" + this.apdNaturalName + ", apdSwdMname=" + this.apdSwdMname + ", apdCitizen=" + this.apdCitizen + ", apdRecvdMode=" + this.apdRecvdMode + ", apdCommunityCd=" + this.apdCommunityCd + ", apdSwdFname=" + this.apdSwdFname + ", apdDob=" + this.apdDob + ", apdEsignReqd=" + this.apdEsignReqd + ", apdBirthplace=" + this.apdBirthplace + ", apdBiometricMand=" + this.apdBiometricMand + ", apdStayperiod=" + this.apdStayperiod + ", apdDependentRelation=" + this.apdDependentRelation + ", Any=" + this.Any + ", apdUserId=" + this.apdUserId + ", apdPermPin=" + this.apdPermPin + ", apdRefLicType=" + this.apdRefLicType + ", apdEmailId=" + this.apdEmailId + ", apdekycopted=" + this.apdekycopted + ", apdIdentityMark2=" + this.apdIdentityMark2 + ", apdAadhaarNo=" + this.apdAadhaarNo + ", apdIdentityMark1=" + this.apdIdentityMark1 + ", apdPermDistCd=" + this.apdPermDistCd + ", apdAddclm3=" + this.apdAddclm3 + ", apdApplicantCatg=" + this.apdApplicantCatg + ", apdAddclm2=" + this.apdAddclm2 + ", apdTempVillTownCd=" + this.apdTempVillTownCd + ", apdAddclm1=" + this.apdAddclm1 + ", apdDigest=" + this.apdDigest + ", apdTransType=" + this.apdTransType + ", apdTempAdd2=" + this.apdTempAdd2 + ", apdFullName=" + this.apdFullName + ", apdTempAdd3=" + this.apdTempAdd3 + ", apdTokenId=" + this.apdTokenId + ", apdTempAdd1=" + this.apdTempAdd1 + ", apdPermLocType=" + this.apdPermLocType + ", apdCheckUsertoken=" + this.apdCheckUsertoken + ", apdAltMobileNo=" + this.apdAltMobileNo + ", apdReasonCd=" + this.apdReasonCd + ", apdLltestMand=" + this.apdLltestMand + ", apdMiddleName=" + this.apdMiddleName + ", apdSwdFullName=" + this.apdSwdFullName + ", apdBioidSearch=" + this.apdBioidSearch + ", apdTempDistCd=" + this.apdTempDistCd + ", apdPerDetAadhaar=" + this.apdPerDetAadhaar + ", apdMobileNo=" + this.apdMobileNo + ')';
    }

    public ResponseBody(GenderIndicators genderIndicators, Integer num, String str, Integer num2, Qualmast qualmast, Object obj, String str2, Object obj2, List<TransReqItem> list, Object obj3, String str3, Object obj4, Boolean bool, String str4, String str5, String str6, Integer num3, Integer num4, String str7, OlaMast olaMast, String str8, Integer num5, String str9, String str10, String str11, Object obj5, String str12, String str13, String str14, Object obj6, String str15, String str16, Object obj7, String str17, String str18, String str19, Object obj8, String str20, Integer num6, String str21, Object obj9, Integer num7, Integer num8, String str22, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Integer num9, Object obj15, String str23, Object obj16, Integer num10, Object obj17, String str24, Object obj18, Object obj19, String str25, String str26, Integer num11, String str27, String str28, String str29, Object obj20, Integer num12, String str30, String str31, String str32, String str33, Integer num13, String str34, Object obj21) {
        this.genderIndicators = genderIndicators;
        this.apdPermVillTownCd = num;
        this.apdReasons = str;
        this.apdPermSdcode = num2;
        this.qualmast = qualmast;
        this.apdNprNo = obj;
        this.apdOptFaceless = str2;
        this.apdAadhaarName = obj2;
        this.transReq = list;
        this.apdPhoneNo = obj3;
        this.apdNewaddrReq = str3;
        this.apdEffectDate = obj4;
        this.apdOrganDonor = bool;
        this.apdAppldt = str4;
        this.apdTempLocType = str5;
        this.apdSwdLname = str6;
        this.apdTempPin = num3;
        this.apdTempSdcode = num4;
        this.apdRefLicNo = str7;
        this.olaMast = olaMast;
        this.apdStateCd = str8;
        this.apdJuris = num5;
        this.apdBloodGrp = str9;
        this.apdPermAdd3 = str10;
        this.apdLastName = str11;
        this.apdPermAdd2 = obj5;
        this.apdPermAdd1 = str12;
        this.apdFirstName = str13;
        this.apdNaturalName = str14;
        this.apdSwdMname = obj6;
        this.apdCitizen = str15;
        this.apdRecvdMode = str16;
        this.apdCommunityCd = obj7;
        this.apdSwdFname = str17;
        this.apdDob = str18;
        this.apdEsignReqd = str19;
        this.apdBirthplace = obj8;
        this.apdBiometricMand = str20;
        this.apdStayperiod = num6;
        this.apdDependentRelation = str21;
        this.Any = obj9;
        this.apdUserId = num7;
        this.apdPermPin = num8;
        this.apdRefLicType = str22;
        this.apdEmailId = obj10;
        this.apdekycopted = obj11;
        this.apdIdentityMark2 = obj12;
        this.apdAadhaarNo = obj13;
        this.apdIdentityMark1 = obj14;
        this.apdPermDistCd = num9;
        this.apdAddclm3 = obj15;
        this.apdApplicantCatg = str23;
        this.apdAddclm2 = obj16;
        this.apdTempVillTownCd = num10;
        this.apdAddclm1 = obj17;
        this.apdDigest = str24;
        this.apdTransType = obj18;
        this.apdTempAdd2 = obj19;
        this.apdFullName = str25;
        this.apdTempAdd3 = str26;
        this.apdTokenId = num11;
        this.apdTempAdd1 = str27;
        this.apdPermLocType = str28;
        this.apdCheckUsertoken = str29;
        this.apdAltMobileNo = obj20;
        this.apdReasonCd = num12;
        this.apdLltestMand = str30;
        this.apdMiddleName = str31;
        this.apdSwdFullName = str32;
        this.apdBioidSearch = str33;
        this.apdTempDistCd = num13;
        this.apdPerDetAadhaar = str34;
        this.apdMobileNo = obj21;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ResponseBody(GenderIndicators genderIndicators, Integer num, String str, Integer num2, Qualmast qualmast, Object obj, String str2, Object obj2, List list, Object obj3, String str3, Object obj4, Boolean bool, String str4, String str5, String str6, Integer num3, Integer num4, String str7, OlaMast olaMast, String str8, Integer num5, String str9, String str10, String str11, Object obj5, String str12, String str13, String str14, Object obj6, String str15, String str16, Object obj7, String str17, String str18, String str19, Object obj8, String str20, Integer num6, String str21, Object obj9, Integer num7, Integer num8, String str22, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Integer num9, Object obj15, String str23, Object obj16, Integer num10, Object obj17, String str24, Object obj18, Object obj19, String str25, String str26, Integer num11, String str27, String str28, String str29, Object obj20, Integer num12, String str30, String str31, String str32, String str33, Integer num13, String str34, Object obj21, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        GenderIndicators genderIndicators2 = (i & 1) != 0 ? null : genderIndicators;
        Integer num14 = (i & 2) != 0 ? null : num;
        String str35 = (i & 4) != 0 ? null : str;
        Integer num15 = (i & 8) != 0 ? null : num2;
        Qualmast qualmast2 = (i & 16) != 0 ? null : qualmast;
        Object obj22 = (i & 32) != 0 ? null : obj;
        String str36 = (i & 64) != 0 ? null : str2;
        Object obj23 = (i & 128) != 0 ? null : obj2;
        List list2 = (i & 256) != 0 ? null : list;
        Object obj24 = (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : obj3;
        String str37 = (i & 1024) != 0 ? null : str3;
        Object obj25 = (i & 2048) != 0 ? null : obj4;
        Boolean bool2 = (i & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? null : bool;
        String str38 = (i & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? null : str4;
        String str39 = (i & 16384) != 0 ? null : str5;
        String str40 = (i & 32768) != 0 ? null : str6;
        Integer num16 = (i & 65536) != 0 ? null : num3;
        Integer num17 = (i & 131072) != 0 ? null : num4;
        String str41 = (i & 262144) != 0 ? null : str7;
        OlaMast olaMast2 = (i & 524288) != 0 ? null : olaMast;
        String str42 = (i & 1048576) != 0 ? null : str8;
        Integer num18 = (i & 2097152) != 0 ? null : num5;
        String str43 = (i & 4194304) != 0 ? null : str9;
        String str44 = (i & 8388608) != 0 ? "" : str10;
        String str45 = (i & 16777216) != 0 ? null : str11;
        Object obj26 = (i & 33554432) != 0 ? "" : obj5;
        String str46 = (i & 67108864) == 0 ? str12 : "";
        String str47 = (i & 134217728) != 0 ? null : str13;
        String str48 = (i & 268435456) != 0 ? null : str14;
        Object obj27 = (i & 536870912) != 0 ? null : obj6;
        String str49 = (i & 1073741824) != 0 ? null : str15;
        String str50 = (i & IntCompanionObject.MIN_VALUE) != 0 ? null : str16;
        this(genderIndicators2, num14, str35, num15, qualmast2, obj22, str36, obj23, list2, obj24, str37, obj25, bool2, str38, str39, str40, num16, num17, str41, olaMast2, str42, num18, str43, str44, str45, obj26, str46, str47, str48, obj27, str49, str50, (i2 & 1) != 0 ? null : obj7, (i2 & 2) != 0 ? null : str17, (i2 & 4) != 0 ? null : str18, (i2 & 8) != 0 ? null : str19, (i2 & 16) != 0 ? null : obj8, (i2 & 32) != 0 ? null : str20, (i2 & 64) != 0 ? null : num6, (i2 & 128) != 0 ? null : str21, (i2 & 256) != 0 ? null : obj9, (i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : num7, (i2 & 1024) != 0 ? null : num8, (i2 & 2048) != 0 ? null : str22, (i2 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? null : obj10, (i2 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? null : obj11, (i2 & 16384) != 0 ? null : obj12, (i2 & 32768) != 0 ? null : obj13, (i2 & 65536) != 0 ? null : obj14, (i2 & 131072) != 0 ? null : num9, (i2 & 262144) != 0 ? null : obj15, (i2 & 524288) != 0 ? null : str23, (i2 & 1048576) != 0 ? null : obj16, (i2 & 2097152) != 0 ? null : num10, (i2 & 4194304) != 0 ? null : obj17, (i2 & 8388608) != 0 ? null : str24, (i2 & 16777216) != 0 ? null : obj18, (i2 & 33554432) != 0 ? null : obj19, (i2 & 67108864) != 0 ? null : str25, (i2 & 134217728) != 0 ? null : str26, (i2 & 268435456) != 0 ? null : num11, (i2 & 536870912) != 0 ? null : str27, (i2 & 1073741824) != 0 ? null : str28, (i2 & IntCompanionObject.MIN_VALUE) != 0 ? null : str29, (i3 & 1) != 0 ? null : obj20, (i3 & 2) != 0 ? null : num12, (i3 & 4) != 0 ? null : str30, (i3 & 8) != 0 ? null : str31, (i3 & 16) != 0 ? null : str32, (i3 & 32) != 0 ? null : str33, (i3 & 64) != 0 ? null : num13, (i3 & 128) != 0 ? null : str34, (i3 & 256) != 0 ? null : obj21);
    }
}
