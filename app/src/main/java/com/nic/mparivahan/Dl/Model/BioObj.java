package com.nic.mparivahan.Dl.Model;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0003\bÕ\u0001\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¿\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\b\u0012\u0006\u0010\u0018\u001a\u00020\b\u0012\u0006\u0010\u0019\u001a\u00020\b\u0012\u0006\u0010\u001a\u001a\u00020\b\u0012\u0006\u0010\u001b\u001a\u00020\b\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\b\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\b\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010\"\u001a\u00020\u0003\u0012\u0006\u0010#\u001a\u00020\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010%\u001a\u00020\b\u0012\u0006\u0010&\u001a\u00020\u0003\u0012\u0006\u0010'\u001a\u00020\u0003\u0012\u0006\u0010(\u001a\u00020\u0003\u0012\u0006\u0010)\u001a\u00020\u0003\u0012\u0006\u0010*\u001a\u00020\u0003\u0012\u0006\u0010+\u001a\u00020\b\u0012\u0006\u0010,\u001a\u00020\u0003\u0012\u0006\u0010-\u001a\u00020\b\u0012\u0006\u0010.\u001a\u00020\u0003\u0012\u0006\u0010/\u001a\u00020\u0003\u0012\u0006\u00100\u001a\u00020\u0003\u0012\u0006\u00101\u001a\u00020\u0003\u0012\u0006\u00102\u001a\u00020\b\u0012\u0006\u00103\u001a\u00020\u0003\u0012\u0006\u00104\u001a\u00020\b\u0012\u0006\u00105\u001a\u00020\u0003\u0012\u0006\u00106\u001a\u00020\b\u0012\u0006\u00107\u001a\u00020\b\u0012\u0006\u00108\u001a\u00020\u0003\u0012\u0006\u00109\u001a\u00020\b\u0012\u0006\u0010:\u001a\u00020\b\u0012\u0006\u0010;\u001a\u00020\b\u0012\u0006\u0010<\u001a\u00020\u0003\u0012\u0006\u0010=\u001a\u00020\u0003\u0012\u0006\u0010>\u001a\u00020\u0003\u0012\u0006\u0010?\u001a\u00020\u0003\u0012\u0006\u0010@\u001a\u00020\u0003\u0012\u0006\u0010A\u001a\u00020\b\u0012\u0006\u0010B\u001a\u00020\u0003\u0012\u0006\u0010C\u001a\u00020\b\u0012\u0006\u0010D\u001a\u00020\u0003\u0012\u0006\u0010E\u001a\u00020\u0003\u0012\u0006\u0010F\u001a\u00020\u0003\u0012\u0006\u0010G\u001a\u00020\b\u0012\u0006\u0010H\u001a\u00020\u0003\u0012\u0006\u0010I\u001a\u00020\u0003\u0012\u0006\u0010J\u001a\u00020\u0003¢\u0006\u0002\u0010KJ\n\u0010\u0095\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0096\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u0097\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u0098\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u0099\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009a\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u009b\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u009c\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009d\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009e\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009f\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010 \u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¡\u0001\u001a\u00020\bHÆ\u0003J\n\u0010¢\u0001\u001a\u00020\bHÆ\u0003J\n\u0010£\u0001\u001a\u00020\bHÆ\u0003J\n\u0010¤\u0001\u001a\u00020\bHÆ\u0003J\n\u0010¥\u0001\u001a\u00020\bHÆ\u0003J\n\u0010¦\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010§\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¨\u0001\u001a\u00020\bHÆ\u0003J\n\u0010©\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ª\u0001\u001a\u00020\bHÆ\u0003J\n\u0010«\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¬\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u00ad\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010®\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010¯\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\n\u0010°\u0001\u001a\u00020\bHÆ\u0003J\n\u0010±\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010²\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010³\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010´\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010µ\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¶\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010·\u0001\u001a\u00020\bHÆ\u0003J\n\u0010¸\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¹\u0001\u001a\u00020\bHÆ\u0003J\n\u0010º\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010»\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¼\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010½\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¾\u0001\u001a\u00020\bHÆ\u0003J\n\u0010¿\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010À\u0001\u001a\u00020\bHÆ\u0003J\n\u0010Á\u0001\u001a\u00020\bHÆ\u0003J\n\u0010Â\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ã\u0001\u001a\u00020\bHÆ\u0003J\n\u0010Ä\u0001\u001a\u00020\bHÆ\u0003J\n\u0010Å\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Æ\u0001\u001a\u00020\bHÆ\u0003J\n\u0010Ç\u0001\u001a\u00020\bHÆ\u0003J\n\u0010È\u0001\u001a\u00020\bHÆ\u0003J\n\u0010É\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ê\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ë\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ì\u0001\u001a\u00020\bHÆ\u0003J\n\u0010Í\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Î\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ï\u0001\u001a\u00020\bHÆ\u0003J\n\u0010Ð\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ñ\u0001\u001a\u00020\bHÆ\u0003J\n\u0010Ò\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ó\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ô\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Õ\u0001\u001a\u00020\bHÆ\u0003J\n\u0010Ö\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010×\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ø\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ù\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ú\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Û\u0001\u001a\u00020\bHÆ\u0003JÒ\u0005\u0010Ü\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\b2\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\b2\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010%\u001a\u00020\b2\b\b\u0002\u0010&\u001a\u00020\u00032\b\b\u0002\u0010'\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020\u00032\b\b\u0002\u0010)\u001a\u00020\u00032\b\b\u0002\u0010*\u001a\u00020\u00032\b\b\u0002\u0010+\u001a\u00020\b2\b\b\u0002\u0010,\u001a\u00020\u00032\b\b\u0002\u0010-\u001a\u00020\b2\b\b\u0002\u0010.\u001a\u00020\u00032\b\b\u0002\u0010/\u001a\u00020\u00032\b\b\u0002\u00100\u001a\u00020\u00032\b\b\u0002\u00101\u001a\u00020\u00032\b\b\u0002\u00102\u001a\u00020\b2\b\b\u0002\u00103\u001a\u00020\u00032\b\b\u0002\u00104\u001a\u00020\b2\b\b\u0002\u00105\u001a\u00020\u00032\b\b\u0002\u00106\u001a\u00020\b2\b\b\u0002\u00107\u001a\u00020\b2\b\b\u0002\u00108\u001a\u00020\u00032\b\b\u0002\u00109\u001a\u00020\b2\b\b\u0002\u0010:\u001a\u00020\b2\b\b\u0002\u0010;\u001a\u00020\b2\b\b\u0002\u0010<\u001a\u00020\u00032\b\b\u0002\u0010=\u001a\u00020\u00032\b\b\u0002\u0010>\u001a\u00020\u00032\b\b\u0002\u0010?\u001a\u00020\u00032\b\b\u0002\u0010@\u001a\u00020\u00032\b\b\u0002\u0010A\u001a\u00020\b2\b\b\u0002\u0010B\u001a\u00020\u00032\b\b\u0002\u0010C\u001a\u00020\b2\b\b\u0002\u0010D\u001a\u00020\u00032\b\b\u0002\u0010E\u001a\u00020\u00032\b\b\u0002\u0010F\u001a\u00020\u00032\b\b\u0002\u0010G\u001a\u00020\b2\b\b\u0002\u0010H\u001a\u00020\u00032\b\b\u0002\u0010I\u001a\u00020\u00032\b\b\u0002\u0010J\u001a\u00020\u0003HÆ\u0001J\u0016\u0010Ý\u0001\u001a\u00030Þ\u00012\t\u0010ß\u0001\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\u000b\u0010à\u0001\u001a\u00030á\u0001HÖ\u0001J\n\u0010â\u0001\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bN\u0010MR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bO\u0010MR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bP\u0010MR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bS\u0010RR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bT\u0010MR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bU\u0010MR\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bV\u0010RR\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bW\u0010RR\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bX\u0010RR\u0011\u0010\u000f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bY\u0010RR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010MR\u0011\u0010\u0011\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b[\u0010RR\u0011\u0010\u0012\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010RR\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b]\u0010MR\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b^\u0010MR\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b_\u0010MR\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b`\u0010MR\u0011\u0010\u0017\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\ba\u0010RR\u0011\u0010\u0018\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bb\u0010RR\u0011\u0010\u0019\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bc\u0010RR\u0011\u0010\u001a\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bd\u0010RR\u0011\u0010\u001b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\be\u0010RR\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bf\u0010MR\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bg\u0010MR\u0011\u0010\u001e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bh\u0010RR\u0011\u0010\u001f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bi\u0010MR\u0011\u0010 \u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bj\u0010RR\u0011\u0010!\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bk\u0010MR\u0011\u0010\"\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bl\u0010MR\u0011\u0010#\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bm\u0010MR\u0013\u0010$\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\bn\u0010RR\u0011\u0010%\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bo\u0010RR\u0011\u0010&\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bp\u0010MR\u0011\u0010'\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bq\u0010MR\u0011\u0010(\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\br\u0010MR\u0011\u0010)\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bs\u0010MR\u0011\u0010*\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bt\u0010MR\u0011\u0010+\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bu\u0010RR\u0011\u0010,\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bv\u0010MR\u0011\u0010-\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bw\u0010RR\u0011\u0010.\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bx\u0010MR\u0011\u0010/\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\by\u0010MR\u0011\u00100\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bz\u0010MR\u0011\u00101\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b{\u0010MR\u0011\u00102\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b|\u0010RR\u0011\u00103\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b}\u0010MR\u0011\u00104\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b~\u0010RR\u0011\u00105\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010MR\u0012\u00106\u001a\u00020\b¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010RR\u0012\u00107\u001a\u00020\b¢\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010RR\u0012\u00108\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010MR\u0012\u00109\u001a\u00020\b¢\u0006\t\n\u0000\u001a\u0005\b\u0083\u0001\u0010RR\u0012\u0010:\u001a\u00020\b¢\u0006\t\n\u0000\u001a\u0005\b\u0084\u0001\u0010RR\u0012\u0010;\u001a\u00020\b¢\u0006\t\n\u0000\u001a\u0005\b\u0085\u0001\u0010RR\u0012\u0010<\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0086\u0001\u0010MR\u0012\u0010=\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0087\u0001\u0010MR\u0012\u0010>\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0088\u0001\u0010MR\u0012\u0010?\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0089\u0001\u0010MR\u0012\u0010@\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u008a\u0001\u0010MR\u0012\u0010A\u001a\u00020\b¢\u0006\t\n\u0000\u001a\u0005\b\u008b\u0001\u0010RR\u0012\u0010B\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u008c\u0001\u0010MR\u0012\u0010C\u001a\u00020\b¢\u0006\t\n\u0000\u001a\u0005\b\u008d\u0001\u0010RR\u0012\u0010D\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u008e\u0001\u0010MR\u0012\u0010E\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u008f\u0001\u0010MR\u0012\u0010F\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0090\u0001\u0010MR\u0012\u0010G\u001a\u00020\b¢\u0006\t\n\u0000\u001a\u0005\b\u0091\u0001\u0010RR\u0012\u0010H\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0092\u0001\u0010MR\u0012\u0010I\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0093\u0001\u0010MR\u0012\u0010J\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0094\u0001\u0010M¨\u0006ã\u0001"}, d2 = {"Lcom/nic/mparivahan/Dl/Model/BioObj;", "Ljava/io/Serializable;", "biPhoto", "", "bioAadhaarName", "bioAadhaarNo", "bioAltMobileNo", "bioApplno", "", "bioBioId", "bioBioidSearch", "bioBirthplace", "bioBloodGroup", "bioBloodGroupname", "bioCitiZen", "bioDependentRelation", "bioDigest", "bioDlno", "bioDob", "bioEmailId", "bioEndorsedt", "bioEndorsementNo", "bioEndorsetime", "bioFirstName", "bioFullName", "bioGender", "bioGenderDesc", "bioIdentityMark1", "bioIdentityMark2", "bioLastName", "bioMiddleName", "bioMobileNo", "bioNatName", "bioNprNo", "bioOrganDonor", "bioPerDetAadhaar", "bioPermAdd1", "bioPermAdd2", "bioPermAdd3", "bioPermDistCd", "bioPermDistName", "bioPermLocType", "bioPermLocal", "bioPermPin", "bioPermSdName", "bioPermSdcode", "bioPermVillTownCd", "bioPermVillTownName", "bioPhoneNo", "bioPoliceStncd", "bioQmQualcd", "bioQmQualdesc", "bioRecGenesis", "bioStayperiodPresentAddr", "bioSwdFname", "bioSwdFullName", "bioSwdLname", "bioSwdMname", "bioTempAdd1", "bioTempAdd2", "bioTempAdd3", "bioTempDistCd", "bioTempDistName", "bioTempLocType", "bioTempLocal", "bioTempPin", "bioTempSdName", "bioTempSdcode", "bioTempVillTownCd", "bioTempVillTownName", "bioTokenId", "bioUserId", "dob", "fullAddress", "pht", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "getBiPhoto", "()Ljava/lang/Object;", "getBioAadhaarName", "getBioAadhaarNo", "getBioAltMobileNo", "getBioApplno", "()Ljava/lang/String;", "getBioBioId", "getBioBioidSearch", "getBioBirthplace", "getBioBloodGroup", "getBioBloodGroupname", "getBioCitiZen", "getBioDependentRelation", "getBioDigest", "getBioDlno", "getBioDob", "getBioEmailId", "getBioEndorsedt", "getBioEndorsementNo", "getBioEndorsetime", "getBioFirstName", "getBioFullName", "getBioGender", "getBioGenderDesc", "getBioIdentityMark1", "getBioIdentityMark2", "getBioLastName", "getBioMiddleName", "getBioMobileNo", "getBioNatName", "getBioNprNo", "getBioOrganDonor", "getBioPerDetAadhaar", "getBioPermAdd1", "getBioPermAdd2", "getBioPermAdd3", "getBioPermDistCd", "getBioPermDistName", "getBioPermLocType", "getBioPermLocal", "getBioPermPin", "getBioPermSdName", "getBioPermSdcode", "getBioPermVillTownCd", "getBioPermVillTownName", "getBioPhoneNo", "getBioPoliceStncd", "getBioQmQualcd", "getBioQmQualdesc", "getBioRecGenesis", "getBioStayperiodPresentAddr", "getBioSwdFname", "getBioSwdFullName", "getBioSwdLname", "getBioSwdMname", "getBioTempAdd1", "getBioTempAdd2", "getBioTempAdd3", "getBioTempDistCd", "getBioTempDistName", "getBioTempLocType", "getBioTempLocal", "getBioTempPin", "getBioTempSdName", "getBioTempSdcode", "getBioTempVillTownCd", "getBioTempVillTownName", "getBioTokenId", "getBioUserId", "getDob", "getFullAddress", "getPht", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component6", "component60", "component61", "component62", "component63", "component64", "component65", "component66", "component67", "component68", "component69", "component7", "component70", "component71", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    private final String bioDlno;
    private final String bioDob;
    private final Object bioEmailId;
    private final Object bioEndorsedt;
    private final Object bioEndorsementNo;
    private final Object bioEndorsetime;
    private final String bioFirstName;
    private final String bioFullName;
    private final String bioGender;
    private final String bioGenderDesc;
    private final String bioIdentityMark1;
    private final Object bioIdentityMark2;
    private final Object bioLastName;
    private final String bioMiddleName;
    private final Object bioMobileNo;
    private final String bioNatName;
    private final Object bioNprNo;
    private final Object bioOrganDonor;
    private final Object bioPerDetAadhaar;
    private final String bioPermAdd1;
    private final String bioPermAdd2;
    private final Object bioPermAdd3;
    private final Object bioPermDistCd;
    private final Object bioPermDistName;
    private final Object bioPermLocType;
    private final Object bioPermLocal;
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
    private final Object bioSwdLname;
    private final String bioSwdMname;
    private final String bioTempAdd1;
    private final String bioTempAdd2;
    private final Object bioTempAdd3;
    private final Object bioTempDistCd;
    private final Object bioTempDistName;
    private final Object bioTempLocType;
    private final Object bioTempLocal;
    private final String bioTempPin;
    private final Object bioTempSdName;
    private final String bioTempSdcode;
    private final Object bioTempVillTownCd;
    private final Object bioTempVillTownName;
    private final Object bioTokenId;
    private final String bioUserId;
    private final Object dob;
    private final Object fullAddress;
    private final Object pht;

    public BioObj(Object biPhoto, Object bioAadhaarName, Object bioAadhaarNo, Object bioAltMobileNo, String bioApplno, String bioBioId, Object bioBioidSearch, Object bioBirthplace, String bioBloodGroup, String bioBloodGroupname, String bioCitiZen, String bioDependentRelation, Object bioDigest, String bioDlno, String bioDob, Object bioEmailId, Object bioEndorsedt, Object bioEndorsementNo, Object bioEndorsetime, String bioFirstName, String bioFullName, String bioGender, String bioGenderDesc, String bioIdentityMark1, Object bioIdentityMark2, Object bioLastName, String bioMiddleName, Object bioMobileNo, String bioNatName, Object bioNprNo, Object bioOrganDonor, Object bioPerDetAadhaar, String str, String bioPermAdd2, Object bioPermAdd3, Object bioPermDistCd, Object bioPermDistName, Object bioPermLocType, Object bioPermLocal, String bioPermPin, Object bioPermSdName, String bioPermSdcode, Object bioPermVillTownCd, Object bioPermVillTownName, Object bioPhoneNo, Object bioPoliceStncd, String bioQmQualcd, Object bioQmQualdesc, String bioRecGenesis, Object bioStayperiodPresentAddr, String bioSwdFname, String bioSwdFullName, Object bioSwdLname, String bioSwdMname, String bioTempAdd1, String bioTempAdd2, Object bioTempAdd3, Object bioTempDistCd, Object bioTempDistName, Object bioTempLocType, Object bioTempLocal, String bioTempPin, Object bioTempSdName, String bioTempSdcode, Object bioTempVillTownCd, Object bioTempVillTownName, Object bioTokenId, String bioUserId, Object dob, Object fullAddress, Object pht) {
        Intrinsics.checkNotNullParameter(biPhoto, "biPhoto");
        Intrinsics.checkNotNullParameter(bioAadhaarName, "bioAadhaarName");
        Intrinsics.checkNotNullParameter(bioAadhaarNo, "bioAadhaarNo");
        Intrinsics.checkNotNullParameter(bioAltMobileNo, "bioAltMobileNo");
        Intrinsics.checkNotNullParameter(bioApplno, "bioApplno");
        Intrinsics.checkNotNullParameter(bioBioId, "bioBioId");
        Intrinsics.checkNotNullParameter(bioBioidSearch, "bioBioidSearch");
        Intrinsics.checkNotNullParameter(bioBirthplace, "bioBirthplace");
        Intrinsics.checkNotNullParameter(bioBloodGroup, "bioBloodGroup");
        Intrinsics.checkNotNullParameter(bioBloodGroupname, "bioBloodGroupname");
        Intrinsics.checkNotNullParameter(bioCitiZen, "bioCitiZen");
        Intrinsics.checkNotNullParameter(bioDependentRelation, "bioDependentRelation");
        Intrinsics.checkNotNullParameter(bioDigest, "bioDigest");
        Intrinsics.checkNotNullParameter(bioDlno, "bioDlno");
        Intrinsics.checkNotNullParameter(bioDob, "bioDob");
        Intrinsics.checkNotNullParameter(bioEmailId, "bioEmailId");
        Intrinsics.checkNotNullParameter(bioEndorsedt, "bioEndorsedt");
        Intrinsics.checkNotNullParameter(bioEndorsementNo, "bioEndorsementNo");
        Intrinsics.checkNotNullParameter(bioEndorsetime, "bioEndorsetime");
        Intrinsics.checkNotNullParameter(bioFirstName, "bioFirstName");
        Intrinsics.checkNotNullParameter(bioFullName, "bioFullName");
        Intrinsics.checkNotNullParameter(bioGender, "bioGender");
        Intrinsics.checkNotNullParameter(bioGenderDesc, "bioGenderDesc");
        Intrinsics.checkNotNullParameter(bioIdentityMark1, "bioIdentityMark1");
        Intrinsics.checkNotNullParameter(bioIdentityMark2, "bioIdentityMark2");
        Intrinsics.checkNotNullParameter(bioLastName, "bioLastName");
        Intrinsics.checkNotNullParameter(bioMiddleName, "bioMiddleName");
        Intrinsics.checkNotNullParameter(bioMobileNo, "bioMobileNo");
        Intrinsics.checkNotNullParameter(bioNatName, "bioNatName");
        Intrinsics.checkNotNullParameter(bioNprNo, "bioNprNo");
        Intrinsics.checkNotNullParameter(bioOrganDonor, "bioOrganDonor");
        Intrinsics.checkNotNullParameter(bioPerDetAadhaar, "bioPerDetAadhaar");
        Intrinsics.checkNotNullParameter(bioPermAdd2, "bioPermAdd2");
        Intrinsics.checkNotNullParameter(bioPermAdd3, "bioPermAdd3");
        Intrinsics.checkNotNullParameter(bioPermDistCd, "bioPermDistCd");
        Intrinsics.checkNotNullParameter(bioPermDistName, "bioPermDistName");
        Intrinsics.checkNotNullParameter(bioPermLocType, "bioPermLocType");
        Intrinsics.checkNotNullParameter(bioPermLocal, "bioPermLocal");
        Intrinsics.checkNotNullParameter(bioPermPin, "bioPermPin");
        Intrinsics.checkNotNullParameter(bioPermSdName, "bioPermSdName");
        Intrinsics.checkNotNullParameter(bioPermSdcode, "bioPermSdcode");
        Intrinsics.checkNotNullParameter(bioPermVillTownCd, "bioPermVillTownCd");
        Intrinsics.checkNotNullParameter(bioPermVillTownName, "bioPermVillTownName");
        Intrinsics.checkNotNullParameter(bioPhoneNo, "bioPhoneNo");
        Intrinsics.checkNotNullParameter(bioPoliceStncd, "bioPoliceStncd");
        Intrinsics.checkNotNullParameter(bioQmQualcd, "bioQmQualcd");
        Intrinsics.checkNotNullParameter(bioQmQualdesc, "bioQmQualdesc");
        Intrinsics.checkNotNullParameter(bioRecGenesis, "bioRecGenesis");
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
        Intrinsics.checkNotNullParameter(bioTempSdcode, "bioTempSdcode");
        Intrinsics.checkNotNullParameter(bioTempVillTownCd, "bioTempVillTownCd");
        Intrinsics.checkNotNullParameter(bioTempVillTownName, "bioTempVillTownName");
        Intrinsics.checkNotNullParameter(bioTokenId, "bioTokenId");
        Intrinsics.checkNotNullParameter(bioUserId, "bioUserId");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(fullAddress, "fullAddress");
        Intrinsics.checkNotNullParameter(pht, "pht");
        this.biPhoto = biPhoto;
        this.bioAadhaarName = bioAadhaarName;
        this.bioAadhaarNo = bioAadhaarNo;
        this.bioAltMobileNo = bioAltMobileNo;
        this.bioApplno = bioApplno;
        this.bioBioId = bioBioId;
        this.bioBioidSearch = bioBioidSearch;
        this.bioBirthplace = bioBirthplace;
        this.bioBloodGroup = bioBloodGroup;
        this.bioBloodGroupname = bioBloodGroupname;
        this.bioCitiZen = bioCitiZen;
        this.bioDependentRelation = bioDependentRelation;
        this.bioDigest = bioDigest;
        this.bioDlno = bioDlno;
        this.bioDob = bioDob;
        this.bioEmailId = bioEmailId;
        this.bioEndorsedt = bioEndorsedt;
        this.bioEndorsementNo = bioEndorsementNo;
        this.bioEndorsetime = bioEndorsetime;
        this.bioFirstName = bioFirstName;
        this.bioFullName = bioFullName;
        this.bioGender = bioGender;
        this.bioGenderDesc = bioGenderDesc;
        this.bioIdentityMark1 = bioIdentityMark1;
        this.bioIdentityMark2 = bioIdentityMark2;
        this.bioLastName = bioLastName;
        this.bioMiddleName = bioMiddleName;
        this.bioMobileNo = bioMobileNo;
        this.bioNatName = bioNatName;
        this.bioNprNo = bioNprNo;
        this.bioOrganDonor = bioOrganDonor;
        this.bioPerDetAadhaar = bioPerDetAadhaar;
        this.bioPermAdd1 = str;
        this.bioPermAdd2 = bioPermAdd2;
        this.bioPermAdd3 = bioPermAdd3;
        this.bioPermDistCd = bioPermDistCd;
        this.bioPermDistName = bioPermDistName;
        this.bioPermLocType = bioPermLocType;
        this.bioPermLocal = bioPermLocal;
        this.bioPermPin = bioPermPin;
        this.bioPermSdName = bioPermSdName;
        this.bioPermSdcode = bioPermSdcode;
        this.bioPermVillTownCd = bioPermVillTownCd;
        this.bioPermVillTownName = bioPermVillTownName;
        this.bioPhoneNo = bioPhoneNo;
        this.bioPoliceStncd = bioPoliceStncd;
        this.bioQmQualcd = bioQmQualcd;
        this.bioQmQualdesc = bioQmQualdesc;
        this.bioRecGenesis = bioRecGenesis;
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
        this.bioTempSdcode = bioTempSdcode;
        this.bioTempVillTownCd = bioTempVillTownCd;
        this.bioTempVillTownName = bioTempVillTownName;
        this.bioTokenId = bioTokenId;
        this.bioUserId = bioUserId;
        this.dob = dob;
        this.fullAddress = fullAddress;
        this.pht = pht;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Object getBiPhoto() {
        return this.biPhoto;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getBioBloodGroupname() {
        return this.bioBloodGroupname;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getBioCitiZen() {
        return this.bioCitiZen;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getBioDependentRelation() {
        return this.bioDependentRelation;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Object getBioDigest() {
        return this.bioDigest;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getBioDlno() {
        return this.bioDlno;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getBioDob() {
        return this.bioDob;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Object getBioEmailId() {
        return this.bioEmailId;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Object getBioEndorsedt() {
        return this.bioEndorsedt;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Object getBioEndorsementNo() {
        return this.bioEndorsementNo;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Object getBioEndorsetime() {
        return this.bioEndorsetime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getBioAadhaarName() {
        return this.bioAadhaarName;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getBioFirstName() {
        return this.bioFirstName;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getBioFullName() {
        return this.bioFullName;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getBioGender() {
        return this.bioGender;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getBioGenderDesc() {
        return this.bioGenderDesc;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getBioIdentityMark1() {
        return this.bioIdentityMark1;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Object getBioIdentityMark2() {
        return this.bioIdentityMark2;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final Object getBioLastName() {
        return this.bioLastName;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getBioMiddleName() {
        return this.bioMiddleName;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final Object getBioMobileNo() {
        return this.bioMobileNo;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getBioNatName() {
        return this.bioNatName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Object getBioAadhaarNo() {
        return this.bioAadhaarNo;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final Object getBioNprNo() {
        return this.bioNprNo;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final Object getBioOrganDonor() {
        return this.bioOrganDonor;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final Object getBioPerDetAadhaar() {
        return this.bioPerDetAadhaar;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getBioPermAdd1() {
        return this.bioPermAdd1;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final String getBioPermAdd2() {
        return this.bioPermAdd2;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final Object getBioPermAdd3() {
        return this.bioPermAdd3;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final Object getBioPermDistCd() {
        return this.bioPermDistCd;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final Object getBioPermDistName() {
        return this.bioPermDistName;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final Object getBioPermLocType() {
        return this.bioPermLocType;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final Object getBioPermLocal() {
        return this.bioPermLocal;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Object getBioAltMobileNo() {
        return this.bioAltMobileNo;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final String getBioPermPin() {
        return this.bioPermPin;
    }

    /* JADX INFO: renamed from: component41, reason: from getter */
    public final Object getBioPermSdName() {
        return this.bioPermSdName;
    }

    /* JADX INFO: renamed from: component42, reason: from getter */
    public final String getBioPermSdcode() {
        return this.bioPermSdcode;
    }

    /* JADX INFO: renamed from: component43, reason: from getter */
    public final Object getBioPermVillTownCd() {
        return this.bioPermVillTownCd;
    }

    /* JADX INFO: renamed from: component44, reason: from getter */
    public final Object getBioPermVillTownName() {
        return this.bioPermVillTownName;
    }

    /* JADX INFO: renamed from: component45, reason: from getter */
    public final Object getBioPhoneNo() {
        return this.bioPhoneNo;
    }

    /* JADX INFO: renamed from: component46, reason: from getter */
    public final Object getBioPoliceStncd() {
        return this.bioPoliceStncd;
    }

    /* JADX INFO: renamed from: component47, reason: from getter */
    public final String getBioQmQualcd() {
        return this.bioQmQualcd;
    }

    /* JADX INFO: renamed from: component48, reason: from getter */
    public final Object getBioQmQualdesc() {
        return this.bioQmQualdesc;
    }

    /* JADX INFO: renamed from: component49, reason: from getter */
    public final String getBioRecGenesis() {
        return this.bioRecGenesis;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBioApplno() {
        return this.bioApplno;
    }

    /* JADX INFO: renamed from: component50, reason: from getter */
    public final Object getBioStayperiodPresentAddr() {
        return this.bioStayperiodPresentAddr;
    }

    /* JADX INFO: renamed from: component51, reason: from getter */
    public final String getBioSwdFname() {
        return this.bioSwdFname;
    }

    /* JADX INFO: renamed from: component52, reason: from getter */
    public final String getBioSwdFullName() {
        return this.bioSwdFullName;
    }

    /* JADX INFO: renamed from: component53, reason: from getter */
    public final Object getBioSwdLname() {
        return this.bioSwdLname;
    }

    /* JADX INFO: renamed from: component54, reason: from getter */
    public final String getBioSwdMname() {
        return this.bioSwdMname;
    }

    /* JADX INFO: renamed from: component55, reason: from getter */
    public final String getBioTempAdd1() {
        return this.bioTempAdd1;
    }

    /* JADX INFO: renamed from: component56, reason: from getter */
    public final String getBioTempAdd2() {
        return this.bioTempAdd2;
    }

    /* JADX INFO: renamed from: component57, reason: from getter */
    public final Object getBioTempAdd3() {
        return this.bioTempAdd3;
    }

    /* JADX INFO: renamed from: component58, reason: from getter */
    public final Object getBioTempDistCd() {
        return this.bioTempDistCd;
    }

    /* JADX INFO: renamed from: component59, reason: from getter */
    public final Object getBioTempDistName() {
        return this.bioTempDistName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBioBioId() {
        return this.bioBioId;
    }

    /* JADX INFO: renamed from: component60, reason: from getter */
    public final Object getBioTempLocType() {
        return this.bioTempLocType;
    }

    /* JADX INFO: renamed from: component61, reason: from getter */
    public final Object getBioTempLocal() {
        return this.bioTempLocal;
    }

    /* JADX INFO: renamed from: component62, reason: from getter */
    public final String getBioTempPin() {
        return this.bioTempPin;
    }

    /* JADX INFO: renamed from: component63, reason: from getter */
    public final Object getBioTempSdName() {
        return this.bioTempSdName;
    }

    /* JADX INFO: renamed from: component64, reason: from getter */
    public final String getBioTempSdcode() {
        return this.bioTempSdcode;
    }

    /* JADX INFO: renamed from: component65, reason: from getter */
    public final Object getBioTempVillTownCd() {
        return this.bioTempVillTownCd;
    }

    /* JADX INFO: renamed from: component66, reason: from getter */
    public final Object getBioTempVillTownName() {
        return this.bioTempVillTownName;
    }

    /* JADX INFO: renamed from: component67, reason: from getter */
    public final Object getBioTokenId() {
        return this.bioTokenId;
    }

    /* JADX INFO: renamed from: component68, reason: from getter */
    public final String getBioUserId() {
        return this.bioUserId;
    }

    /* JADX INFO: renamed from: component69, reason: from getter */
    public final Object getDob() {
        return this.dob;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Object getBioBioidSearch() {
        return this.bioBioidSearch;
    }

    /* JADX INFO: renamed from: component70, reason: from getter */
    public final Object getFullAddress() {
        return this.fullAddress;
    }

    /* JADX INFO: renamed from: component71, reason: from getter */
    public final Object getPht() {
        return this.pht;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Object getBioBirthplace() {
        return this.bioBirthplace;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getBioBloodGroup() {
        return this.bioBloodGroup;
    }

    public final BioObj copy(Object biPhoto, Object bioAadhaarName, Object bioAadhaarNo, Object bioAltMobileNo, String bioApplno, String bioBioId, Object bioBioidSearch, Object bioBirthplace, String bioBloodGroup, String bioBloodGroupname, String bioCitiZen, String bioDependentRelation, Object bioDigest, String bioDlno, String bioDob, Object bioEmailId, Object bioEndorsedt, Object bioEndorsementNo, Object bioEndorsetime, String bioFirstName, String bioFullName, String bioGender, String bioGenderDesc, String bioIdentityMark1, Object bioIdentityMark2, Object bioLastName, String bioMiddleName, Object bioMobileNo, String bioNatName, Object bioNprNo, Object bioOrganDonor, Object bioPerDetAadhaar, String bioPermAdd1, String bioPermAdd2, Object bioPermAdd3, Object bioPermDistCd, Object bioPermDistName, Object bioPermLocType, Object bioPermLocal, String bioPermPin, Object bioPermSdName, String bioPermSdcode, Object bioPermVillTownCd, Object bioPermVillTownName, Object bioPhoneNo, Object bioPoliceStncd, String bioQmQualcd, Object bioQmQualdesc, String bioRecGenesis, Object bioStayperiodPresentAddr, String bioSwdFname, String bioSwdFullName, Object bioSwdLname, String bioSwdMname, String bioTempAdd1, String bioTempAdd2, Object bioTempAdd3, Object bioTempDistCd, Object bioTempDistName, Object bioTempLocType, Object bioTempLocal, String bioTempPin, Object bioTempSdName, String bioTempSdcode, Object bioTempVillTownCd, Object bioTempVillTownName, Object bioTokenId, String bioUserId, Object dob, Object fullAddress, Object pht) {
        Intrinsics.checkNotNullParameter(biPhoto, "biPhoto");
        Intrinsics.checkNotNullParameter(bioAadhaarName, "bioAadhaarName");
        Intrinsics.checkNotNullParameter(bioAadhaarNo, "bioAadhaarNo");
        Intrinsics.checkNotNullParameter(bioAltMobileNo, "bioAltMobileNo");
        Intrinsics.checkNotNullParameter(bioApplno, "bioApplno");
        Intrinsics.checkNotNullParameter(bioBioId, "bioBioId");
        Intrinsics.checkNotNullParameter(bioBioidSearch, "bioBioidSearch");
        Intrinsics.checkNotNullParameter(bioBirthplace, "bioBirthplace");
        Intrinsics.checkNotNullParameter(bioBloodGroup, "bioBloodGroup");
        Intrinsics.checkNotNullParameter(bioBloodGroupname, "bioBloodGroupname");
        Intrinsics.checkNotNullParameter(bioCitiZen, "bioCitiZen");
        Intrinsics.checkNotNullParameter(bioDependentRelation, "bioDependentRelation");
        Intrinsics.checkNotNullParameter(bioDigest, "bioDigest");
        Intrinsics.checkNotNullParameter(bioDlno, "bioDlno");
        Intrinsics.checkNotNullParameter(bioDob, "bioDob");
        Intrinsics.checkNotNullParameter(bioEmailId, "bioEmailId");
        Intrinsics.checkNotNullParameter(bioEndorsedt, "bioEndorsedt");
        Intrinsics.checkNotNullParameter(bioEndorsementNo, "bioEndorsementNo");
        Intrinsics.checkNotNullParameter(bioEndorsetime, "bioEndorsetime");
        Intrinsics.checkNotNullParameter(bioFirstName, "bioFirstName");
        Intrinsics.checkNotNullParameter(bioFullName, "bioFullName");
        Intrinsics.checkNotNullParameter(bioGender, "bioGender");
        Intrinsics.checkNotNullParameter(bioGenderDesc, "bioGenderDesc");
        Intrinsics.checkNotNullParameter(bioIdentityMark1, "bioIdentityMark1");
        Intrinsics.checkNotNullParameter(bioIdentityMark2, "bioIdentityMark2");
        Intrinsics.checkNotNullParameter(bioLastName, "bioLastName");
        Intrinsics.checkNotNullParameter(bioMiddleName, "bioMiddleName");
        Intrinsics.checkNotNullParameter(bioMobileNo, "bioMobileNo");
        Intrinsics.checkNotNullParameter(bioNatName, "bioNatName");
        Intrinsics.checkNotNullParameter(bioNprNo, "bioNprNo");
        Intrinsics.checkNotNullParameter(bioOrganDonor, "bioOrganDonor");
        Intrinsics.checkNotNullParameter(bioPerDetAadhaar, "bioPerDetAadhaar");
        Intrinsics.checkNotNullParameter(bioPermAdd2, "bioPermAdd2");
        Intrinsics.checkNotNullParameter(bioPermAdd3, "bioPermAdd3");
        Intrinsics.checkNotNullParameter(bioPermDistCd, "bioPermDistCd");
        Intrinsics.checkNotNullParameter(bioPermDistName, "bioPermDistName");
        Intrinsics.checkNotNullParameter(bioPermLocType, "bioPermLocType");
        Intrinsics.checkNotNullParameter(bioPermLocal, "bioPermLocal");
        Intrinsics.checkNotNullParameter(bioPermPin, "bioPermPin");
        Intrinsics.checkNotNullParameter(bioPermSdName, "bioPermSdName");
        Intrinsics.checkNotNullParameter(bioPermSdcode, "bioPermSdcode");
        Intrinsics.checkNotNullParameter(bioPermVillTownCd, "bioPermVillTownCd");
        Intrinsics.checkNotNullParameter(bioPermVillTownName, "bioPermVillTownName");
        Intrinsics.checkNotNullParameter(bioPhoneNo, "bioPhoneNo");
        Intrinsics.checkNotNullParameter(bioPoliceStncd, "bioPoliceStncd");
        Intrinsics.checkNotNullParameter(bioQmQualcd, "bioQmQualcd");
        Intrinsics.checkNotNullParameter(bioQmQualdesc, "bioQmQualdesc");
        Intrinsics.checkNotNullParameter(bioRecGenesis, "bioRecGenesis");
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
        Intrinsics.checkNotNullParameter(bioTempSdcode, "bioTempSdcode");
        Intrinsics.checkNotNullParameter(bioTempVillTownCd, "bioTempVillTownCd");
        Intrinsics.checkNotNullParameter(bioTempVillTownName, "bioTempVillTownName");
        Intrinsics.checkNotNullParameter(bioTokenId, "bioTokenId");
        Intrinsics.checkNotNullParameter(bioUserId, "bioUserId");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(fullAddress, "fullAddress");
        Intrinsics.checkNotNullParameter(pht, "pht");
        return new BioObj(biPhoto, bioAadhaarName, bioAadhaarNo, bioAltMobileNo, bioApplno, bioBioId, bioBioidSearch, bioBirthplace, bioBloodGroup, bioBloodGroupname, bioCitiZen, bioDependentRelation, bioDigest, bioDlno, bioDob, bioEmailId, bioEndorsedt, bioEndorsementNo, bioEndorsetime, bioFirstName, bioFullName, bioGender, bioGenderDesc, bioIdentityMark1, bioIdentityMark2, bioLastName, bioMiddleName, bioMobileNo, bioNatName, bioNprNo, bioOrganDonor, bioPerDetAadhaar, bioPermAdd1, bioPermAdd2, bioPermAdd3, bioPermDistCd, bioPermDistName, bioPermLocType, bioPermLocal, bioPermPin, bioPermSdName, bioPermSdcode, bioPermVillTownCd, bioPermVillTownName, bioPhoneNo, bioPoliceStncd, bioQmQualcd, bioQmQualdesc, bioRecGenesis, bioStayperiodPresentAddr, bioSwdFname, bioSwdFullName, bioSwdLname, bioSwdMname, bioTempAdd1, bioTempAdd2, bioTempAdd3, bioTempDistCd, bioTempDistName, bioTempLocType, bioTempLocal, bioTempPin, bioTempSdName, bioTempSdcode, bioTempVillTownCd, bioTempVillTownName, bioTokenId, bioUserId, dob, fullAddress, pht);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BioObj)) {
            return false;
        }
        BioObj bioObj = (BioObj) other;
        return Intrinsics.areEqual(this.biPhoto, bioObj.biPhoto) && Intrinsics.areEqual(this.bioAadhaarName, bioObj.bioAadhaarName) && Intrinsics.areEqual(this.bioAadhaarNo, bioObj.bioAadhaarNo) && Intrinsics.areEqual(this.bioAltMobileNo, bioObj.bioAltMobileNo) && Intrinsics.areEqual(this.bioApplno, bioObj.bioApplno) && Intrinsics.areEqual(this.bioBioId, bioObj.bioBioId) && Intrinsics.areEqual(this.bioBioidSearch, bioObj.bioBioidSearch) && Intrinsics.areEqual(this.bioBirthplace, bioObj.bioBirthplace) && Intrinsics.areEqual(this.bioBloodGroup, bioObj.bioBloodGroup) && Intrinsics.areEqual(this.bioBloodGroupname, bioObj.bioBloodGroupname) && Intrinsics.areEqual(this.bioCitiZen, bioObj.bioCitiZen) && Intrinsics.areEqual(this.bioDependentRelation, bioObj.bioDependentRelation) && Intrinsics.areEqual(this.bioDigest, bioObj.bioDigest) && Intrinsics.areEqual(this.bioDlno, bioObj.bioDlno) && Intrinsics.areEqual(this.bioDob, bioObj.bioDob) && Intrinsics.areEqual(this.bioEmailId, bioObj.bioEmailId) && Intrinsics.areEqual(this.bioEndorsedt, bioObj.bioEndorsedt) && Intrinsics.areEqual(this.bioEndorsementNo, bioObj.bioEndorsementNo) && Intrinsics.areEqual(this.bioEndorsetime, bioObj.bioEndorsetime) && Intrinsics.areEqual(this.bioFirstName, bioObj.bioFirstName) && Intrinsics.areEqual(this.bioFullName, bioObj.bioFullName) && Intrinsics.areEqual(this.bioGender, bioObj.bioGender) && Intrinsics.areEqual(this.bioGenderDesc, bioObj.bioGenderDesc) && Intrinsics.areEqual(this.bioIdentityMark1, bioObj.bioIdentityMark1) && Intrinsics.areEqual(this.bioIdentityMark2, bioObj.bioIdentityMark2) && Intrinsics.areEqual(this.bioLastName, bioObj.bioLastName) && Intrinsics.areEqual(this.bioMiddleName, bioObj.bioMiddleName) && Intrinsics.areEqual(this.bioMobileNo, bioObj.bioMobileNo) && Intrinsics.areEqual(this.bioNatName, bioObj.bioNatName) && Intrinsics.areEqual(this.bioNprNo, bioObj.bioNprNo) && Intrinsics.areEqual(this.bioOrganDonor, bioObj.bioOrganDonor) && Intrinsics.areEqual(this.bioPerDetAadhaar, bioObj.bioPerDetAadhaar) && Intrinsics.areEqual(this.bioPermAdd1, bioObj.bioPermAdd1) && Intrinsics.areEqual(this.bioPermAdd2, bioObj.bioPermAdd2) && Intrinsics.areEqual(this.bioPermAdd3, bioObj.bioPermAdd3) && Intrinsics.areEqual(this.bioPermDistCd, bioObj.bioPermDistCd) && Intrinsics.areEqual(this.bioPermDistName, bioObj.bioPermDistName) && Intrinsics.areEqual(this.bioPermLocType, bioObj.bioPermLocType) && Intrinsics.areEqual(this.bioPermLocal, bioObj.bioPermLocal) && Intrinsics.areEqual(this.bioPermPin, bioObj.bioPermPin) && Intrinsics.areEqual(this.bioPermSdName, bioObj.bioPermSdName) && Intrinsics.areEqual(this.bioPermSdcode, bioObj.bioPermSdcode) && Intrinsics.areEqual(this.bioPermVillTownCd, bioObj.bioPermVillTownCd) && Intrinsics.areEqual(this.bioPermVillTownName, bioObj.bioPermVillTownName) && Intrinsics.areEqual(this.bioPhoneNo, bioObj.bioPhoneNo) && Intrinsics.areEqual(this.bioPoliceStncd, bioObj.bioPoliceStncd) && Intrinsics.areEqual(this.bioQmQualcd, bioObj.bioQmQualcd) && Intrinsics.areEqual(this.bioQmQualdesc, bioObj.bioQmQualdesc) && Intrinsics.areEqual(this.bioRecGenesis, bioObj.bioRecGenesis) && Intrinsics.areEqual(this.bioStayperiodPresentAddr, bioObj.bioStayperiodPresentAddr) && Intrinsics.areEqual(this.bioSwdFname, bioObj.bioSwdFname) && Intrinsics.areEqual(this.bioSwdFullName, bioObj.bioSwdFullName) && Intrinsics.areEqual(this.bioSwdLname, bioObj.bioSwdLname) && Intrinsics.areEqual(this.bioSwdMname, bioObj.bioSwdMname) && Intrinsics.areEqual(this.bioTempAdd1, bioObj.bioTempAdd1) && Intrinsics.areEqual(this.bioTempAdd2, bioObj.bioTempAdd2) && Intrinsics.areEqual(this.bioTempAdd3, bioObj.bioTempAdd3) && Intrinsics.areEqual(this.bioTempDistCd, bioObj.bioTempDistCd) && Intrinsics.areEqual(this.bioTempDistName, bioObj.bioTempDistName) && Intrinsics.areEqual(this.bioTempLocType, bioObj.bioTempLocType) && Intrinsics.areEqual(this.bioTempLocal, bioObj.bioTempLocal) && Intrinsics.areEqual(this.bioTempPin, bioObj.bioTempPin) && Intrinsics.areEqual(this.bioTempSdName, bioObj.bioTempSdName) && Intrinsics.areEqual(this.bioTempSdcode, bioObj.bioTempSdcode) && Intrinsics.areEqual(this.bioTempVillTownCd, bioObj.bioTempVillTownCd) && Intrinsics.areEqual(this.bioTempVillTownName, bioObj.bioTempVillTownName) && Intrinsics.areEqual(this.bioTokenId, bioObj.bioTokenId) && Intrinsics.areEqual(this.bioUserId, bioObj.bioUserId) && Intrinsics.areEqual(this.dob, bioObj.dob) && Intrinsics.areEqual(this.fullAddress, bioObj.fullAddress) && Intrinsics.areEqual(this.pht, bioObj.pht);
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

    public final String getBioDlno() {
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

    public final String getBioIdentityMark1() {
        return this.bioIdentityMark1;
    }

    public final Object getBioIdentityMark2() {
        return this.bioIdentityMark2;
    }

    public final Object getBioLastName() {
        return this.bioLastName;
    }

    public final String getBioMiddleName() {
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

    public final Object getBioPermAdd3() {
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

    public final Object getBioSwdLname() {
        return this.bioSwdLname;
    }

    public final String getBioSwdMname() {
        return this.bioSwdMname;
    }

    public final String getBioTempAdd1() {
        return this.bioTempAdd1;
    }

    public final String getBioTempAdd2() {
        return this.bioTempAdd2;
    }

    public final Object getBioTempAdd3() {
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

    public final Object getFullAddress() {
        return this.fullAddress;
    }

    public final Object getPht() {
        return this.pht;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.biPhoto.hashCode() * 31) + this.bioAadhaarName.hashCode()) * 31) + this.bioAadhaarNo.hashCode()) * 31) + this.bioAltMobileNo.hashCode()) * 31) + this.bioApplno.hashCode()) * 31) + this.bioBioId.hashCode()) * 31) + this.bioBioidSearch.hashCode()) * 31) + this.bioBirthplace.hashCode()) * 31) + this.bioBloodGroup.hashCode()) * 31) + this.bioBloodGroupname.hashCode()) * 31) + this.bioCitiZen.hashCode()) * 31) + this.bioDependentRelation.hashCode()) * 31) + this.bioDigest.hashCode()) * 31) + this.bioDlno.hashCode()) * 31) + this.bioDob.hashCode()) * 31) + this.bioEmailId.hashCode()) * 31) + this.bioEndorsedt.hashCode()) * 31) + this.bioEndorsementNo.hashCode()) * 31) + this.bioEndorsetime.hashCode()) * 31) + this.bioFirstName.hashCode()) * 31) + this.bioFullName.hashCode()) * 31) + this.bioGender.hashCode()) * 31) + this.bioGenderDesc.hashCode()) * 31) + this.bioIdentityMark1.hashCode()) * 31) + this.bioIdentityMark2.hashCode()) * 31) + this.bioLastName.hashCode()) * 31) + this.bioMiddleName.hashCode()) * 31) + this.bioMobileNo.hashCode()) * 31) + this.bioNatName.hashCode()) * 31) + this.bioNprNo.hashCode()) * 31) + this.bioOrganDonor.hashCode()) * 31) + this.bioPerDetAadhaar.hashCode()) * 31;
        String str = this.bioPermAdd1;
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.bioPermAdd2.hashCode()) * 31) + this.bioPermAdd3.hashCode()) * 31) + this.bioPermDistCd.hashCode()) * 31) + this.bioPermDistName.hashCode()) * 31) + this.bioPermLocType.hashCode()) * 31) + this.bioPermLocal.hashCode()) * 31) + this.bioPermPin.hashCode()) * 31) + this.bioPermSdName.hashCode()) * 31) + this.bioPermSdcode.hashCode()) * 31) + this.bioPermVillTownCd.hashCode()) * 31) + this.bioPermVillTownName.hashCode()) * 31) + this.bioPhoneNo.hashCode()) * 31) + this.bioPoliceStncd.hashCode()) * 31) + this.bioQmQualcd.hashCode()) * 31) + this.bioQmQualdesc.hashCode()) * 31) + this.bioRecGenesis.hashCode()) * 31) + this.bioStayperiodPresentAddr.hashCode()) * 31) + this.bioSwdFname.hashCode()) * 31) + this.bioSwdFullName.hashCode()) * 31) + this.bioSwdLname.hashCode()) * 31) + this.bioSwdMname.hashCode()) * 31) + this.bioTempAdd1.hashCode()) * 31) + this.bioTempAdd2.hashCode()) * 31) + this.bioTempAdd3.hashCode()) * 31) + this.bioTempDistCd.hashCode()) * 31) + this.bioTempDistName.hashCode()) * 31) + this.bioTempLocType.hashCode()) * 31) + this.bioTempLocal.hashCode()) * 31) + this.bioTempPin.hashCode()) * 31) + this.bioTempSdName.hashCode()) * 31) + this.bioTempSdcode.hashCode()) * 31) + this.bioTempVillTownCd.hashCode()) * 31) + this.bioTempVillTownName.hashCode()) * 31) + this.bioTokenId.hashCode()) * 31) + this.bioUserId.hashCode()) * 31) + this.dob.hashCode()) * 31) + this.fullAddress.hashCode()) * 31) + this.pht.hashCode();
    }

    public String toString() {
        return "BioObj(biPhoto=" + this.biPhoto + ", bioAadhaarName=" + this.bioAadhaarName + ", bioAadhaarNo=" + this.bioAadhaarNo + ", bioAltMobileNo=" + this.bioAltMobileNo + ", bioApplno=" + this.bioApplno + ", bioBioId=" + this.bioBioId + ", bioBioidSearch=" + this.bioBioidSearch + ", bioBirthplace=" + this.bioBirthplace + ", bioBloodGroup=" + this.bioBloodGroup + ", bioBloodGroupname=" + this.bioBloodGroupname + ", bioCitiZen=" + this.bioCitiZen + ", bioDependentRelation=" + this.bioDependentRelation + ", bioDigest=" + this.bioDigest + ", bioDlno=" + this.bioDlno + ", bioDob=" + this.bioDob + ", bioEmailId=" + this.bioEmailId + ", bioEndorsedt=" + this.bioEndorsedt + ", bioEndorsementNo=" + this.bioEndorsementNo + ", bioEndorsetime=" + this.bioEndorsetime + ", bioFirstName=" + this.bioFirstName + ", bioFullName=" + this.bioFullName + ", bioGender=" + this.bioGender + ", bioGenderDesc=" + this.bioGenderDesc + ", bioIdentityMark1=" + this.bioIdentityMark1 + ", bioIdentityMark2=" + this.bioIdentityMark2 + ", bioLastName=" + this.bioLastName + ", bioMiddleName=" + this.bioMiddleName + ", bioMobileNo=" + this.bioMobileNo + ", bioNatName=" + this.bioNatName + ", bioNprNo=" + this.bioNprNo + ", bioOrganDonor=" + this.bioOrganDonor + ", bioPerDetAadhaar=" + this.bioPerDetAadhaar + ", bioPermAdd1=" + this.bioPermAdd1 + ", bioPermAdd2=" + this.bioPermAdd2 + ", bioPermAdd3=" + this.bioPermAdd3 + ", bioPermDistCd=" + this.bioPermDistCd + ", bioPermDistName=" + this.bioPermDistName + ", bioPermLocType=" + this.bioPermLocType + ", bioPermLocal=" + this.bioPermLocal + ", bioPermPin=" + this.bioPermPin + ", bioPermSdName=" + this.bioPermSdName + ", bioPermSdcode=" + this.bioPermSdcode + ", bioPermVillTownCd=" + this.bioPermVillTownCd + ", bioPermVillTownName=" + this.bioPermVillTownName + ", bioPhoneNo=" + this.bioPhoneNo + ", bioPoliceStncd=" + this.bioPoliceStncd + ", bioQmQualcd=" + this.bioQmQualcd + ", bioQmQualdesc=" + this.bioQmQualdesc + ", bioRecGenesis=" + this.bioRecGenesis + ", bioStayperiodPresentAddr=" + this.bioStayperiodPresentAddr + ", bioSwdFname=" + this.bioSwdFname + ", bioSwdFullName=" + this.bioSwdFullName + ", bioSwdLname=" + this.bioSwdLname + ", bioSwdMname=" + this.bioSwdMname + ", bioTempAdd1=" + this.bioTempAdd1 + ", bioTempAdd2=" + this.bioTempAdd2 + ", bioTempAdd3=" + this.bioTempAdd3 + ", bioTempDistCd=" + this.bioTempDistCd + ", bioTempDistName=" + this.bioTempDistName + ", bioTempLocType=" + this.bioTempLocType + ", bioTempLocal=" + this.bioTempLocal + ", bioTempPin=" + this.bioTempPin + ", bioTempSdName=" + this.bioTempSdName + ", bioTempSdcode=" + this.bioTempSdcode + ", bioTempVillTownCd=" + this.bioTempVillTownCd + ", bioTempVillTownName=" + this.bioTempVillTownName + ", bioTokenId=" + this.bioTokenId + ", bioUserId=" + this.bioUserId + ", dob=" + this.dob + ", fullAddress=" + this.fullAddress + ", pht=" + this.pht + ')';
    }
}
