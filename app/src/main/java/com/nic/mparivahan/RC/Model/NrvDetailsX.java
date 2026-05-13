package com.nic.mparivahan.RC.Model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000#\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0003\bÊ\u0001\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0001\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0001\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0001\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0001\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0001\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0001\u0012\u0006\u0010\u001b\u001a\u00020\u0001\u0012\u0006\u0010\u001c\u001a\u00020\u0001\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0001\u0012\u0006\u0010 \u001a\u00020\u0001\u0012\u0006\u0010!\u001a\u00020\u0001\u0012\u0006\u0010\"\u001a\u00020\u0001\u0012\u0006\u0010#\u001a\u00020\u0003\u0012\u0006\u0010$\u001a\u00020\u0001\u0012\u0006\u0010%\u001a\u00020\u0001\u0012\u0006\u0010&\u001a\u00020\u0001\u0012\u0006\u0010'\u001a\u00020\u0001\u0012\u0006\u0010(\u001a\u00020\u0003\u0012\u0006\u0010)\u001a\u00020\u0003\u0012\u0006\u0010*\u001a\u00020\u0003\u0012\u0006\u0010+\u001a\u00020\u0001\u0012\u0006\u0010,\u001a\u00020\u0001\u0012\u0006\u0010-\u001a\u00020\u0001\u0012\u0006\u0010.\u001a\u00020\u0001\u0012\u0006\u0010/\u001a\u00020\u0001\u0012\u0006\u00100\u001a\u00020\u0003\u0012\u0006\u00101\u001a\u00020\u0003\u0012\u0006\u00102\u001a\u00020\u0003\u0012\u0006\u00103\u001a\u00020\u0003\u0012\u0006\u00104\u001a\u00020\u0003\u0012\u0006\u00105\u001a\u00020\u0003\u0012\u0006\u00106\u001a\u00020\u0001\u0012\u0006\u00107\u001a\u00020\u0003\u0012\u0006\u00108\u001a\u00020\u0003\u0012\u0006\u00109\u001a\u00020\u0003\u0012\u0006\u0010:\u001a\u00020\u0003\u0012\u0006\u0010;\u001a\u00020\u0003\u0012\u0006\u0010<\u001a\u00020\u0003\u0012\u0006\u0010=\u001a\u00020\u0003\u0012\u0006\u0010>\u001a\u00020\u0003\u0012\u0006\u0010?\u001a\u00020\u0001\u0012\u0006\u0010@\u001a\u00020\u0001\u0012\u0006\u0010A\u001a\u00020\u0003\u0012\u0006\u0010B\u001a\u00020\u0003\u0012\u0006\u0010C\u001a\u00020\u0003\u0012\u0006\u0010D\u001a\u00020\u0003¢\u0006\u0002\u0010EJ\n\u0010\u008a\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010\u008c\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008d\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008e\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010\u008f\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0090\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0091\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0092\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0093\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0094\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010\u0095\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0096\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0097\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0098\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010\u0099\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009a\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010\u009b\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010\u009c\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010\u009d\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009e\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009f\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010 \u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010¡\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010¢\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010£\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010¤\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¥\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010¦\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010§\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010¨\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010©\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ª\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010«\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¬\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u00ad\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010®\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010¯\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010°\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010±\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010²\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010³\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010´\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010µ\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¶\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010·\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¸\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¹\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010º\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010»\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¼\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010½\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¾\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¿\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010À\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Á\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Â\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ã\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010Ä\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010Å\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Æ\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ç\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010È\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010É\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010Ê\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ë\u0001\u001a\u00020\u0003HÆ\u0003J\u009e\u0005\u0010Ì\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020\u00012\b\b\u0002\u0010!\u001a\u00020\u00012\b\b\u0002\u0010\"\u001a\u00020\u00012\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u00012\b\b\u0002\u0010%\u001a\u00020\u00012\b\b\u0002\u0010&\u001a\u00020\u00012\b\b\u0002\u0010'\u001a\u00020\u00012\b\b\u0002\u0010(\u001a\u00020\u00032\b\b\u0002\u0010)\u001a\u00020\u00032\b\b\u0002\u0010*\u001a\u00020\u00032\b\b\u0002\u0010+\u001a\u00020\u00012\b\b\u0002\u0010,\u001a\u00020\u00012\b\b\u0002\u0010-\u001a\u00020\u00012\b\b\u0002\u0010.\u001a\u00020\u00012\b\b\u0002\u0010/\u001a\u00020\u00012\b\b\u0002\u00100\u001a\u00020\u00032\b\b\u0002\u00101\u001a\u00020\u00032\b\b\u0002\u00102\u001a\u00020\u00032\b\b\u0002\u00103\u001a\u00020\u00032\b\b\u0002\u00104\u001a\u00020\u00032\b\b\u0002\u00105\u001a\u00020\u00032\b\b\u0002\u00106\u001a\u00020\u00012\b\b\u0002\u00107\u001a\u00020\u00032\b\b\u0002\u00108\u001a\u00020\u00032\b\b\u0002\u00109\u001a\u00020\u00032\b\b\u0002\u0010:\u001a\u00020\u00032\b\b\u0002\u0010;\u001a\u00020\u00032\b\b\u0002\u0010<\u001a\u00020\u00032\b\b\u0002\u0010=\u001a\u00020\u00032\b\b\u0002\u0010>\u001a\u00020\u00032\b\b\u0002\u0010?\u001a\u00020\u00012\b\b\u0002\u0010@\u001a\u00020\u00012\b\b\u0002\u0010A\u001a\u00020\u00032\b\b\u0002\u0010B\u001a\u00020\u00032\b\b\u0002\u0010C\u001a\u00020\u00032\b\b\u0002\u0010D\u001a\u00020\u0003HÆ\u0001J\u0016\u0010Í\u0001\u001a\u00030Î\u00012\t\u0010Ï\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010Ð\u0001\u001a\u00030Ñ\u0001HÖ\u0001J\n\u0010Ò\u0001\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bH\u0010GR\u0011\u0010\u0005\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bK\u0010GR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bL\u0010GR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bM\u0010GR\u0011\u0010\t\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bN\u0010JR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bO\u0010GR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bP\u0010GR\u0011\u0010\f\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010JR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bR\u0010GR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bS\u0010GR\u0011\u0010\u000f\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bT\u0010JR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bU\u0010GR\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bV\u0010GR\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bW\u0010GR\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bX\u0010GR\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bY\u0010GR\u0011\u0010\u0015\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010JR\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b[\u0010GR\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010GR\u0011\u0010\u0018\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b]\u0010JR\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b^\u0010GR\u0011\u0010\u001a\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b_\u0010JR\u0011\u0010\u001b\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b`\u0010JR\u0011\u0010\u001c\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\ba\u0010JR\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bb\u0010GR\u0011\u0010\u001e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bc\u0010GR\u0011\u0010\u001f\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bd\u0010JR\u0011\u0010 \u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\be\u0010JR\u0011\u0010!\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bf\u0010JR\u0011\u0010\"\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bg\u0010JR\u0011\u0010#\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bh\u0010GR\u0011\u0010$\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bi\u0010JR\u0011\u0010%\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bj\u0010JR\u0011\u0010&\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bk\u0010JR\u0011\u0010'\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bl\u0010JR\u0011\u0010(\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bm\u0010GR\u0011\u0010)\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bn\u0010GR\u0011\u0010*\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bo\u0010GR\u0011\u0010+\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bp\u0010JR\u0011\u0010,\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bq\u0010JR\u0011\u0010-\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\br\u0010JR\u0011\u0010.\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bs\u0010JR\u0011\u0010/\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bt\u0010JR\u0011\u00100\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bu\u0010GR\u0011\u00101\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bv\u0010GR\u0011\u00102\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bw\u0010GR\u0011\u00103\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bx\u0010GR\u0011\u00104\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\by\u0010GR\u0011\u00105\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bz\u0010GR\u0011\u00106\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b{\u0010JR\u0011\u00107\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b|\u0010GR\u0011\u00108\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b}\u0010GR\u0011\u00109\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b~\u0010GR\u0011\u0010:\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010GR\u0012\u0010;\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010GR\u0012\u0010<\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010GR\u0012\u0010=\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010GR\u0012\u0010>\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0083\u0001\u0010GR\u0012\u0010?\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\b\u0084\u0001\u0010JR\u0012\u0010@\u001a\u00020\u0001¢\u0006\t\n\u0000\u001a\u0005\b\u0085\u0001\u0010JR\u0012\u0010A\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0086\u0001\u0010GR\u0012\u0010B\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0087\u0001\u0010GR\u0012\u0010C\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0088\u0001\u0010GR\u0012\u0010D\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0089\u0001\u0010G¨\u0006Ó\u0001"}, d2 = {"Lcom/nic/mparivahan/RC/Model/NrvDetailsX;", "", "rc_blacklist_status", "", "rc_body_type_desc", "rc_c_state", "rc_chasi_no", "rc_color", "rc_cubic_cap", "rc_email_id", "rc_eng_no", "rc_f_name", "rc_financed_from", "rc_financer", "rc_fit_upto", "rc_fuel_cd", "rc_fuel_desc", "rc_gvw", "rc_insurance_comp", "rc_insurance_policy_no", "rc_insurance_upto", "rc_maker_cd", "rc_maker_desc", "rc_maker_model", "rc_manu_month", "rc_manu_month_yr", "rc_manu_yr", "rc_mobile_no", "rc_ncrb_status", "rc_no_cyl", "rc_noc_details", "rc_non_use_from", "rc_non_use_status", "rc_non_use_to", "rc_norms_cd", "rc_norms_desc", "rc_np_issued_by", "rc_np_no", "rc_np_upto", "rc_off_cd", "rc_owner_name", "rc_owner_sr", "rc_permanent_address", "rc_permit_issue_dt", "rc_permit_no", "rc_permit_type", "rc_permit_valid_from", "rc_permit_valid_upto", "rc_present_address", "rc_pucc_no", "rc_pucc_upto", "rc_registered_at", "rc_regn_dt", "rc_regn_no", "rc_regn_type", "rc_seat_cap", "rc_sleeper_cap", "rc_stand_cap", "rc_status", "rc_status_as_on", "rc_tax_upto", "rc_unld_wt", "rc_vch_catg", "rc_vch_catg_desc", "rc_vh_class_cd", "rc_vh_class_desc", "rc_wheelbase", "state_cd", "stautsMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRc_blacklist_status", "()Ljava/lang/String;", "getRc_body_type_desc", "getRc_c_state", "()Ljava/lang/Object;", "getRc_chasi_no", "getRc_color", "getRc_cubic_cap", "getRc_email_id", "getRc_eng_no", "getRc_f_name", "getRc_financed_from", "getRc_financer", "getRc_fit_upto", "getRc_fuel_cd", "getRc_fuel_desc", "getRc_gvw", "getRc_insurance_comp", "getRc_insurance_policy_no", "getRc_insurance_upto", "getRc_maker_cd", "getRc_maker_desc", "getRc_maker_model", "getRc_manu_month", "getRc_manu_month_yr", "getRc_manu_yr", "getRc_mobile_no", "getRc_ncrb_status", "getRc_no_cyl", "getRc_noc_details", "getRc_non_use_from", "getRc_non_use_status", "getRc_non_use_to", "getRc_norms_cd", "getRc_norms_desc", "getRc_np_issued_by", "getRc_np_no", "getRc_np_upto", "getRc_off_cd", "getRc_owner_name", "getRc_owner_sr", "getRc_permanent_address", "getRc_permit_issue_dt", "getRc_permit_no", "getRc_permit_type", "getRc_permit_valid_from", "getRc_permit_valid_upto", "getRc_present_address", "getRc_pucc_no", "getRc_pucc_upto", "getRc_registered_at", "getRc_regn_dt", "getRc_regn_no", "getRc_regn_type", "getRc_seat_cap", "getRc_sleeper_cap", "getRc_stand_cap", "getRc_status", "getRc_status_as_on", "getRc_tax_upto", "getRc_unld_wt", "getRc_vch_catg", "getRc_vch_catg_desc", "getRc_vh_class_cd", "getRc_vh_class_desc", "getRc_wheelbase", "getState_cd", "getStautsMessage", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component6", "component60", "component61", "component62", "component63", "component64", "component65", "component66", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class NrvDetailsX {
    private final String rc_blacklist_status;
    private final String rc_body_type_desc;
    private final Object rc_c_state;
    private final String rc_chasi_no;
    private final String rc_color;
    private final String rc_cubic_cap;
    private final Object rc_email_id;
    private final String rc_eng_no;
    private final String rc_f_name;
    private final Object rc_financed_from;
    private final String rc_financer;
    private final String rc_fit_upto;
    private final Object rc_fuel_cd;
    private final String rc_fuel_desc;
    private final String rc_gvw;
    private final String rc_insurance_comp;
    private final String rc_insurance_policy_no;
    private final String rc_insurance_upto;
    private final Object rc_maker_cd;
    private final String rc_maker_desc;
    private final String rc_maker_model;
    private final Object rc_manu_month;
    private final String rc_manu_month_yr;
    private final Object rc_manu_yr;
    private final Object rc_mobile_no;
    private final Object rc_ncrb_status;
    private final String rc_no_cyl;
    private final String rc_noc_details;
    private final Object rc_non_use_from;
    private final Object rc_non_use_status;
    private final Object rc_non_use_to;
    private final Object rc_norms_cd;
    private final String rc_norms_desc;
    private final Object rc_np_issued_by;
    private final Object rc_np_no;
    private final Object rc_np_upto;
    private final Object rc_off_cd;
    private final String rc_owner_name;
    private final String rc_owner_sr;
    private final String rc_permanent_address;
    private final Object rc_permit_issue_dt;
    private final Object rc_permit_no;
    private final Object rc_permit_type;
    private final Object rc_permit_valid_from;
    private final Object rc_permit_valid_upto;
    private final String rc_present_address;
    private final String rc_pucc_no;
    private final String rc_pucc_upto;
    private final String rc_registered_at;
    private final String rc_regn_dt;
    private final String rc_regn_no;
    private final Object rc_regn_type;
    private final String rc_seat_cap;
    private final String rc_sleeper_cap;
    private final String rc_stand_cap;
    private final String rc_status;
    private final String rc_status_as_on;
    private final String rc_tax_upto;
    private final String rc_unld_wt;
    private final String rc_vch_catg;
    private final Object rc_vch_catg_desc;
    private final Object rc_vh_class_cd;
    private final String rc_vh_class_desc;
    private final String rc_wheelbase;
    private final String state_cd;
    private final String stautsMessage;

    public NrvDetailsX(String rc_blacklist_status, String rc_body_type_desc, Object rc_c_state, String rc_chasi_no, String rc_color, String rc_cubic_cap, Object rc_email_id, String rc_eng_no, String rc_f_name, Object rc_financed_from, String rc_financer, String rc_fit_upto, Object rc_fuel_cd, String rc_fuel_desc, String rc_gvw, String rc_insurance_comp, String rc_insurance_policy_no, String rc_insurance_upto, Object rc_maker_cd, String rc_maker_desc, String rc_maker_model, Object rc_manu_month, String rc_manu_month_yr, Object rc_manu_yr, Object rc_mobile_no, Object rc_ncrb_status, String rc_no_cyl, String rc_noc_details, Object rc_non_use_from, Object rc_non_use_status, Object rc_non_use_to, Object rc_norms_cd, String rc_norms_desc, Object rc_np_issued_by, Object rc_np_no, Object rc_np_upto, Object rc_off_cd, String rc_owner_name, String rc_owner_sr, String rc_permanent_address, Object rc_permit_issue_dt, Object rc_permit_no, Object rc_permit_type, Object rc_permit_valid_from, Object rc_permit_valid_upto, String rc_present_address, String rc_pucc_no, String rc_pucc_upto, String rc_registered_at, String rc_regn_dt, String rc_regn_no, Object rc_regn_type, String rc_seat_cap, String rc_sleeper_cap, String rc_stand_cap, String rc_status, String rc_status_as_on, String rc_tax_upto, String rc_unld_wt, String rc_vch_catg, Object rc_vch_catg_desc, Object rc_vh_class_cd, String rc_vh_class_desc, String rc_wheelbase, String state_cd, String stautsMessage) {
        Intrinsics.checkNotNullParameter(rc_blacklist_status, "rc_blacklist_status");
        Intrinsics.checkNotNullParameter(rc_body_type_desc, "rc_body_type_desc");
        Intrinsics.checkNotNullParameter(rc_c_state, "rc_c_state");
        Intrinsics.checkNotNullParameter(rc_chasi_no, "rc_chasi_no");
        Intrinsics.checkNotNullParameter(rc_color, "rc_color");
        Intrinsics.checkNotNullParameter(rc_cubic_cap, "rc_cubic_cap");
        Intrinsics.checkNotNullParameter(rc_email_id, "rc_email_id");
        Intrinsics.checkNotNullParameter(rc_eng_no, "rc_eng_no");
        Intrinsics.checkNotNullParameter(rc_f_name, "rc_f_name");
        Intrinsics.checkNotNullParameter(rc_financed_from, "rc_financed_from");
        Intrinsics.checkNotNullParameter(rc_financer, "rc_financer");
        Intrinsics.checkNotNullParameter(rc_fit_upto, "rc_fit_upto");
        Intrinsics.checkNotNullParameter(rc_fuel_cd, "rc_fuel_cd");
        Intrinsics.checkNotNullParameter(rc_fuel_desc, "rc_fuel_desc");
        Intrinsics.checkNotNullParameter(rc_gvw, "rc_gvw");
        Intrinsics.checkNotNullParameter(rc_insurance_comp, "rc_insurance_comp");
        Intrinsics.checkNotNullParameter(rc_insurance_policy_no, "rc_insurance_policy_no");
        Intrinsics.checkNotNullParameter(rc_insurance_upto, "rc_insurance_upto");
        Intrinsics.checkNotNullParameter(rc_maker_cd, "rc_maker_cd");
        Intrinsics.checkNotNullParameter(rc_maker_desc, "rc_maker_desc");
        Intrinsics.checkNotNullParameter(rc_maker_model, "rc_maker_model");
        Intrinsics.checkNotNullParameter(rc_manu_month, "rc_manu_month");
        Intrinsics.checkNotNullParameter(rc_manu_month_yr, "rc_manu_month_yr");
        Intrinsics.checkNotNullParameter(rc_manu_yr, "rc_manu_yr");
        Intrinsics.checkNotNullParameter(rc_mobile_no, "rc_mobile_no");
        Intrinsics.checkNotNullParameter(rc_ncrb_status, "rc_ncrb_status");
        Intrinsics.checkNotNullParameter(rc_no_cyl, "rc_no_cyl");
        Intrinsics.checkNotNullParameter(rc_noc_details, "rc_noc_details");
        Intrinsics.checkNotNullParameter(rc_non_use_from, "rc_non_use_from");
        Intrinsics.checkNotNullParameter(rc_non_use_status, "rc_non_use_status");
        Intrinsics.checkNotNullParameter(rc_non_use_to, "rc_non_use_to");
        Intrinsics.checkNotNullParameter(rc_norms_cd, "rc_norms_cd");
        Intrinsics.checkNotNullParameter(rc_norms_desc, "rc_norms_desc");
        Intrinsics.checkNotNullParameter(rc_np_issued_by, "rc_np_issued_by");
        Intrinsics.checkNotNullParameter(rc_np_no, "rc_np_no");
        Intrinsics.checkNotNullParameter(rc_np_upto, "rc_np_upto");
        Intrinsics.checkNotNullParameter(rc_off_cd, "rc_off_cd");
        Intrinsics.checkNotNullParameter(rc_owner_name, "rc_owner_name");
        Intrinsics.checkNotNullParameter(rc_owner_sr, "rc_owner_sr");
        Intrinsics.checkNotNullParameter(rc_permanent_address, "rc_permanent_address");
        Intrinsics.checkNotNullParameter(rc_permit_issue_dt, "rc_permit_issue_dt");
        Intrinsics.checkNotNullParameter(rc_permit_no, "rc_permit_no");
        Intrinsics.checkNotNullParameter(rc_permit_type, "rc_permit_type");
        Intrinsics.checkNotNullParameter(rc_permit_valid_from, "rc_permit_valid_from");
        Intrinsics.checkNotNullParameter(rc_permit_valid_upto, "rc_permit_valid_upto");
        Intrinsics.checkNotNullParameter(rc_present_address, "rc_present_address");
        Intrinsics.checkNotNullParameter(rc_pucc_no, "rc_pucc_no");
        Intrinsics.checkNotNullParameter(rc_pucc_upto, "rc_pucc_upto");
        Intrinsics.checkNotNullParameter(rc_registered_at, "rc_registered_at");
        Intrinsics.checkNotNullParameter(rc_regn_dt, "rc_regn_dt");
        Intrinsics.checkNotNullParameter(rc_regn_no, "rc_regn_no");
        Intrinsics.checkNotNullParameter(rc_regn_type, "rc_regn_type");
        Intrinsics.checkNotNullParameter(rc_seat_cap, "rc_seat_cap");
        Intrinsics.checkNotNullParameter(rc_sleeper_cap, "rc_sleeper_cap");
        Intrinsics.checkNotNullParameter(rc_stand_cap, "rc_stand_cap");
        Intrinsics.checkNotNullParameter(rc_status, "rc_status");
        Intrinsics.checkNotNullParameter(rc_status_as_on, "rc_status_as_on");
        Intrinsics.checkNotNullParameter(rc_tax_upto, "rc_tax_upto");
        Intrinsics.checkNotNullParameter(rc_unld_wt, "rc_unld_wt");
        Intrinsics.checkNotNullParameter(rc_vch_catg, "rc_vch_catg");
        Intrinsics.checkNotNullParameter(rc_vch_catg_desc, "rc_vch_catg_desc");
        Intrinsics.checkNotNullParameter(rc_vh_class_cd, "rc_vh_class_cd");
        Intrinsics.checkNotNullParameter(rc_vh_class_desc, "rc_vh_class_desc");
        Intrinsics.checkNotNullParameter(rc_wheelbase, "rc_wheelbase");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(stautsMessage, "stautsMessage");
        this.rc_blacklist_status = rc_blacklist_status;
        this.rc_body_type_desc = rc_body_type_desc;
        this.rc_c_state = rc_c_state;
        this.rc_chasi_no = rc_chasi_no;
        this.rc_color = rc_color;
        this.rc_cubic_cap = rc_cubic_cap;
        this.rc_email_id = rc_email_id;
        this.rc_eng_no = rc_eng_no;
        this.rc_f_name = rc_f_name;
        this.rc_financed_from = rc_financed_from;
        this.rc_financer = rc_financer;
        this.rc_fit_upto = rc_fit_upto;
        this.rc_fuel_cd = rc_fuel_cd;
        this.rc_fuel_desc = rc_fuel_desc;
        this.rc_gvw = rc_gvw;
        this.rc_insurance_comp = rc_insurance_comp;
        this.rc_insurance_policy_no = rc_insurance_policy_no;
        this.rc_insurance_upto = rc_insurance_upto;
        this.rc_maker_cd = rc_maker_cd;
        this.rc_maker_desc = rc_maker_desc;
        this.rc_maker_model = rc_maker_model;
        this.rc_manu_month = rc_manu_month;
        this.rc_manu_month_yr = rc_manu_month_yr;
        this.rc_manu_yr = rc_manu_yr;
        this.rc_mobile_no = rc_mobile_no;
        this.rc_ncrb_status = rc_ncrb_status;
        this.rc_no_cyl = rc_no_cyl;
        this.rc_noc_details = rc_noc_details;
        this.rc_non_use_from = rc_non_use_from;
        this.rc_non_use_status = rc_non_use_status;
        this.rc_non_use_to = rc_non_use_to;
        this.rc_norms_cd = rc_norms_cd;
        this.rc_norms_desc = rc_norms_desc;
        this.rc_np_issued_by = rc_np_issued_by;
        this.rc_np_no = rc_np_no;
        this.rc_np_upto = rc_np_upto;
        this.rc_off_cd = rc_off_cd;
        this.rc_owner_name = rc_owner_name;
        this.rc_owner_sr = rc_owner_sr;
        this.rc_permanent_address = rc_permanent_address;
        this.rc_permit_issue_dt = rc_permit_issue_dt;
        this.rc_permit_no = rc_permit_no;
        this.rc_permit_type = rc_permit_type;
        this.rc_permit_valid_from = rc_permit_valid_from;
        this.rc_permit_valid_upto = rc_permit_valid_upto;
        this.rc_present_address = rc_present_address;
        this.rc_pucc_no = rc_pucc_no;
        this.rc_pucc_upto = rc_pucc_upto;
        this.rc_registered_at = rc_registered_at;
        this.rc_regn_dt = rc_regn_dt;
        this.rc_regn_no = rc_regn_no;
        this.rc_regn_type = rc_regn_type;
        this.rc_seat_cap = rc_seat_cap;
        this.rc_sleeper_cap = rc_sleeper_cap;
        this.rc_stand_cap = rc_stand_cap;
        this.rc_status = rc_status;
        this.rc_status_as_on = rc_status_as_on;
        this.rc_tax_upto = rc_tax_upto;
        this.rc_unld_wt = rc_unld_wt;
        this.rc_vch_catg = rc_vch_catg;
        this.rc_vch_catg_desc = rc_vch_catg_desc;
        this.rc_vh_class_cd = rc_vh_class_cd;
        this.rc_vh_class_desc = rc_vh_class_desc;
        this.rc_wheelbase = rc_wheelbase;
        this.state_cd = state_cd;
        this.stautsMessage = stautsMessage;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRc_blacklist_status() {
        return this.rc_blacklist_status;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Object getRc_financed_from() {
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
    public final Object getRc_fuel_cd() {
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
    public final Object getRc_maker_cd() {
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
    public final Object getRc_manu_month() {
        return this.rc_manu_month;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getRc_manu_month_yr() {
        return this.rc_manu_month_yr;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Object getRc_manu_yr() {
        return this.rc_manu_yr;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Object getRc_mobile_no() {
        return this.rc_mobile_no;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final Object getRc_ncrb_status() {
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
    public final Object getRc_non_use_from() {
        return this.rc_non_use_from;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Object getRc_c_state() {
        return this.rc_c_state;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final Object getRc_non_use_status() {
        return this.rc_non_use_status;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final Object getRc_non_use_to() {
        return this.rc_non_use_to;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final Object getRc_norms_cd() {
        return this.rc_norms_cd;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getRc_norms_desc() {
        return this.rc_norms_desc;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final Object getRc_np_issued_by() {
        return this.rc_np_issued_by;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final Object getRc_np_no() {
        return this.rc_np_no;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final Object getRc_np_upto() {
        return this.rc_np_upto;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final Object getRc_off_cd() {
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
    public final Object getRc_permit_issue_dt() {
        return this.rc_permit_issue_dt;
    }

    /* JADX INFO: renamed from: component42, reason: from getter */
    public final Object getRc_permit_no() {
        return this.rc_permit_no;
    }

    /* JADX INFO: renamed from: component43, reason: from getter */
    public final Object getRc_permit_type() {
        return this.rc_permit_type;
    }

    /* JADX INFO: renamed from: component44, reason: from getter */
    public final Object getRc_permit_valid_from() {
        return this.rc_permit_valid_from;
    }

    /* JADX INFO: renamed from: component45, reason: from getter */
    public final Object getRc_permit_valid_upto() {
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
    public final Object getRc_regn_type() {
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
    public final Object getRc_vch_catg_desc() {
        return this.rc_vch_catg_desc;
    }

    /* JADX INFO: renamed from: component62, reason: from getter */
    public final Object getRc_vh_class_cd() {
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
    public final String getStautsMessage() {
        return this.stautsMessage;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Object getRc_email_id() {
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

    public final NrvDetailsX copy(String rc_blacklist_status, String rc_body_type_desc, Object rc_c_state, String rc_chasi_no, String rc_color, String rc_cubic_cap, Object rc_email_id, String rc_eng_no, String rc_f_name, Object rc_financed_from, String rc_financer, String rc_fit_upto, Object rc_fuel_cd, String rc_fuel_desc, String rc_gvw, String rc_insurance_comp, String rc_insurance_policy_no, String rc_insurance_upto, Object rc_maker_cd, String rc_maker_desc, String rc_maker_model, Object rc_manu_month, String rc_manu_month_yr, Object rc_manu_yr, Object rc_mobile_no, Object rc_ncrb_status, String rc_no_cyl, String rc_noc_details, Object rc_non_use_from, Object rc_non_use_status, Object rc_non_use_to, Object rc_norms_cd, String rc_norms_desc, Object rc_np_issued_by, Object rc_np_no, Object rc_np_upto, Object rc_off_cd, String rc_owner_name, String rc_owner_sr, String rc_permanent_address, Object rc_permit_issue_dt, Object rc_permit_no, Object rc_permit_type, Object rc_permit_valid_from, Object rc_permit_valid_upto, String rc_present_address, String rc_pucc_no, String rc_pucc_upto, String rc_registered_at, String rc_regn_dt, String rc_regn_no, Object rc_regn_type, String rc_seat_cap, String rc_sleeper_cap, String rc_stand_cap, String rc_status, String rc_status_as_on, String rc_tax_upto, String rc_unld_wt, String rc_vch_catg, Object rc_vch_catg_desc, Object rc_vh_class_cd, String rc_vh_class_desc, String rc_wheelbase, String state_cd, String stautsMessage) {
        Intrinsics.checkNotNullParameter(rc_blacklist_status, "rc_blacklist_status");
        Intrinsics.checkNotNullParameter(rc_body_type_desc, "rc_body_type_desc");
        Intrinsics.checkNotNullParameter(rc_c_state, "rc_c_state");
        Intrinsics.checkNotNullParameter(rc_chasi_no, "rc_chasi_no");
        Intrinsics.checkNotNullParameter(rc_color, "rc_color");
        Intrinsics.checkNotNullParameter(rc_cubic_cap, "rc_cubic_cap");
        Intrinsics.checkNotNullParameter(rc_email_id, "rc_email_id");
        Intrinsics.checkNotNullParameter(rc_eng_no, "rc_eng_no");
        Intrinsics.checkNotNullParameter(rc_f_name, "rc_f_name");
        Intrinsics.checkNotNullParameter(rc_financed_from, "rc_financed_from");
        Intrinsics.checkNotNullParameter(rc_financer, "rc_financer");
        Intrinsics.checkNotNullParameter(rc_fit_upto, "rc_fit_upto");
        Intrinsics.checkNotNullParameter(rc_fuel_cd, "rc_fuel_cd");
        Intrinsics.checkNotNullParameter(rc_fuel_desc, "rc_fuel_desc");
        Intrinsics.checkNotNullParameter(rc_gvw, "rc_gvw");
        Intrinsics.checkNotNullParameter(rc_insurance_comp, "rc_insurance_comp");
        Intrinsics.checkNotNullParameter(rc_insurance_policy_no, "rc_insurance_policy_no");
        Intrinsics.checkNotNullParameter(rc_insurance_upto, "rc_insurance_upto");
        Intrinsics.checkNotNullParameter(rc_maker_cd, "rc_maker_cd");
        Intrinsics.checkNotNullParameter(rc_maker_desc, "rc_maker_desc");
        Intrinsics.checkNotNullParameter(rc_maker_model, "rc_maker_model");
        Intrinsics.checkNotNullParameter(rc_manu_month, "rc_manu_month");
        Intrinsics.checkNotNullParameter(rc_manu_month_yr, "rc_manu_month_yr");
        Intrinsics.checkNotNullParameter(rc_manu_yr, "rc_manu_yr");
        Intrinsics.checkNotNullParameter(rc_mobile_no, "rc_mobile_no");
        Intrinsics.checkNotNullParameter(rc_ncrb_status, "rc_ncrb_status");
        Intrinsics.checkNotNullParameter(rc_no_cyl, "rc_no_cyl");
        Intrinsics.checkNotNullParameter(rc_noc_details, "rc_noc_details");
        Intrinsics.checkNotNullParameter(rc_non_use_from, "rc_non_use_from");
        Intrinsics.checkNotNullParameter(rc_non_use_status, "rc_non_use_status");
        Intrinsics.checkNotNullParameter(rc_non_use_to, "rc_non_use_to");
        Intrinsics.checkNotNullParameter(rc_norms_cd, "rc_norms_cd");
        Intrinsics.checkNotNullParameter(rc_norms_desc, "rc_norms_desc");
        Intrinsics.checkNotNullParameter(rc_np_issued_by, "rc_np_issued_by");
        Intrinsics.checkNotNullParameter(rc_np_no, "rc_np_no");
        Intrinsics.checkNotNullParameter(rc_np_upto, "rc_np_upto");
        Intrinsics.checkNotNullParameter(rc_off_cd, "rc_off_cd");
        Intrinsics.checkNotNullParameter(rc_owner_name, "rc_owner_name");
        Intrinsics.checkNotNullParameter(rc_owner_sr, "rc_owner_sr");
        Intrinsics.checkNotNullParameter(rc_permanent_address, "rc_permanent_address");
        Intrinsics.checkNotNullParameter(rc_permit_issue_dt, "rc_permit_issue_dt");
        Intrinsics.checkNotNullParameter(rc_permit_no, "rc_permit_no");
        Intrinsics.checkNotNullParameter(rc_permit_type, "rc_permit_type");
        Intrinsics.checkNotNullParameter(rc_permit_valid_from, "rc_permit_valid_from");
        Intrinsics.checkNotNullParameter(rc_permit_valid_upto, "rc_permit_valid_upto");
        Intrinsics.checkNotNullParameter(rc_present_address, "rc_present_address");
        Intrinsics.checkNotNullParameter(rc_pucc_no, "rc_pucc_no");
        Intrinsics.checkNotNullParameter(rc_pucc_upto, "rc_pucc_upto");
        Intrinsics.checkNotNullParameter(rc_registered_at, "rc_registered_at");
        Intrinsics.checkNotNullParameter(rc_regn_dt, "rc_regn_dt");
        Intrinsics.checkNotNullParameter(rc_regn_no, "rc_regn_no");
        Intrinsics.checkNotNullParameter(rc_regn_type, "rc_regn_type");
        Intrinsics.checkNotNullParameter(rc_seat_cap, "rc_seat_cap");
        Intrinsics.checkNotNullParameter(rc_sleeper_cap, "rc_sleeper_cap");
        Intrinsics.checkNotNullParameter(rc_stand_cap, "rc_stand_cap");
        Intrinsics.checkNotNullParameter(rc_status, "rc_status");
        Intrinsics.checkNotNullParameter(rc_status_as_on, "rc_status_as_on");
        Intrinsics.checkNotNullParameter(rc_tax_upto, "rc_tax_upto");
        Intrinsics.checkNotNullParameter(rc_unld_wt, "rc_unld_wt");
        Intrinsics.checkNotNullParameter(rc_vch_catg, "rc_vch_catg");
        Intrinsics.checkNotNullParameter(rc_vch_catg_desc, "rc_vch_catg_desc");
        Intrinsics.checkNotNullParameter(rc_vh_class_cd, "rc_vh_class_cd");
        Intrinsics.checkNotNullParameter(rc_vh_class_desc, "rc_vh_class_desc");
        Intrinsics.checkNotNullParameter(rc_wheelbase, "rc_wheelbase");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(stautsMessage, "stautsMessage");
        return new NrvDetailsX(rc_blacklist_status, rc_body_type_desc, rc_c_state, rc_chasi_no, rc_color, rc_cubic_cap, rc_email_id, rc_eng_no, rc_f_name, rc_financed_from, rc_financer, rc_fit_upto, rc_fuel_cd, rc_fuel_desc, rc_gvw, rc_insurance_comp, rc_insurance_policy_no, rc_insurance_upto, rc_maker_cd, rc_maker_desc, rc_maker_model, rc_manu_month, rc_manu_month_yr, rc_manu_yr, rc_mobile_no, rc_ncrb_status, rc_no_cyl, rc_noc_details, rc_non_use_from, rc_non_use_status, rc_non_use_to, rc_norms_cd, rc_norms_desc, rc_np_issued_by, rc_np_no, rc_np_upto, rc_off_cd, rc_owner_name, rc_owner_sr, rc_permanent_address, rc_permit_issue_dt, rc_permit_no, rc_permit_type, rc_permit_valid_from, rc_permit_valid_upto, rc_present_address, rc_pucc_no, rc_pucc_upto, rc_registered_at, rc_regn_dt, rc_regn_no, rc_regn_type, rc_seat_cap, rc_sleeper_cap, rc_stand_cap, rc_status, rc_status_as_on, rc_tax_upto, rc_unld_wt, rc_vch_catg, rc_vch_catg_desc, rc_vh_class_cd, rc_vh_class_desc, rc_wheelbase, state_cd, stautsMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NrvDetailsX)) {
            return false;
        }
        NrvDetailsX nrvDetailsX = (NrvDetailsX) other;
        return Intrinsics.areEqual(this.rc_blacklist_status, nrvDetailsX.rc_blacklist_status) && Intrinsics.areEqual(this.rc_body_type_desc, nrvDetailsX.rc_body_type_desc) && Intrinsics.areEqual(this.rc_c_state, nrvDetailsX.rc_c_state) && Intrinsics.areEqual(this.rc_chasi_no, nrvDetailsX.rc_chasi_no) && Intrinsics.areEqual(this.rc_color, nrvDetailsX.rc_color) && Intrinsics.areEqual(this.rc_cubic_cap, nrvDetailsX.rc_cubic_cap) && Intrinsics.areEqual(this.rc_email_id, nrvDetailsX.rc_email_id) && Intrinsics.areEqual(this.rc_eng_no, nrvDetailsX.rc_eng_no) && Intrinsics.areEqual(this.rc_f_name, nrvDetailsX.rc_f_name) && Intrinsics.areEqual(this.rc_financed_from, nrvDetailsX.rc_financed_from) && Intrinsics.areEqual(this.rc_financer, nrvDetailsX.rc_financer) && Intrinsics.areEqual(this.rc_fit_upto, nrvDetailsX.rc_fit_upto) && Intrinsics.areEqual(this.rc_fuel_cd, nrvDetailsX.rc_fuel_cd) && Intrinsics.areEqual(this.rc_fuel_desc, nrvDetailsX.rc_fuel_desc) && Intrinsics.areEqual(this.rc_gvw, nrvDetailsX.rc_gvw) && Intrinsics.areEqual(this.rc_insurance_comp, nrvDetailsX.rc_insurance_comp) && Intrinsics.areEqual(this.rc_insurance_policy_no, nrvDetailsX.rc_insurance_policy_no) && Intrinsics.areEqual(this.rc_insurance_upto, nrvDetailsX.rc_insurance_upto) && Intrinsics.areEqual(this.rc_maker_cd, nrvDetailsX.rc_maker_cd) && Intrinsics.areEqual(this.rc_maker_desc, nrvDetailsX.rc_maker_desc) && Intrinsics.areEqual(this.rc_maker_model, nrvDetailsX.rc_maker_model) && Intrinsics.areEqual(this.rc_manu_month, nrvDetailsX.rc_manu_month) && Intrinsics.areEqual(this.rc_manu_month_yr, nrvDetailsX.rc_manu_month_yr) && Intrinsics.areEqual(this.rc_manu_yr, nrvDetailsX.rc_manu_yr) && Intrinsics.areEqual(this.rc_mobile_no, nrvDetailsX.rc_mobile_no) && Intrinsics.areEqual(this.rc_ncrb_status, nrvDetailsX.rc_ncrb_status) && Intrinsics.areEqual(this.rc_no_cyl, nrvDetailsX.rc_no_cyl) && Intrinsics.areEqual(this.rc_noc_details, nrvDetailsX.rc_noc_details) && Intrinsics.areEqual(this.rc_non_use_from, nrvDetailsX.rc_non_use_from) && Intrinsics.areEqual(this.rc_non_use_status, nrvDetailsX.rc_non_use_status) && Intrinsics.areEqual(this.rc_non_use_to, nrvDetailsX.rc_non_use_to) && Intrinsics.areEqual(this.rc_norms_cd, nrvDetailsX.rc_norms_cd) && Intrinsics.areEqual(this.rc_norms_desc, nrvDetailsX.rc_norms_desc) && Intrinsics.areEqual(this.rc_np_issued_by, nrvDetailsX.rc_np_issued_by) && Intrinsics.areEqual(this.rc_np_no, nrvDetailsX.rc_np_no) && Intrinsics.areEqual(this.rc_np_upto, nrvDetailsX.rc_np_upto) && Intrinsics.areEqual(this.rc_off_cd, nrvDetailsX.rc_off_cd) && Intrinsics.areEqual(this.rc_owner_name, nrvDetailsX.rc_owner_name) && Intrinsics.areEqual(this.rc_owner_sr, nrvDetailsX.rc_owner_sr) && Intrinsics.areEqual(this.rc_permanent_address, nrvDetailsX.rc_permanent_address) && Intrinsics.areEqual(this.rc_permit_issue_dt, nrvDetailsX.rc_permit_issue_dt) && Intrinsics.areEqual(this.rc_permit_no, nrvDetailsX.rc_permit_no) && Intrinsics.areEqual(this.rc_permit_type, nrvDetailsX.rc_permit_type) && Intrinsics.areEqual(this.rc_permit_valid_from, nrvDetailsX.rc_permit_valid_from) && Intrinsics.areEqual(this.rc_permit_valid_upto, nrvDetailsX.rc_permit_valid_upto) && Intrinsics.areEqual(this.rc_present_address, nrvDetailsX.rc_present_address) && Intrinsics.areEqual(this.rc_pucc_no, nrvDetailsX.rc_pucc_no) && Intrinsics.areEqual(this.rc_pucc_upto, nrvDetailsX.rc_pucc_upto) && Intrinsics.areEqual(this.rc_registered_at, nrvDetailsX.rc_registered_at) && Intrinsics.areEqual(this.rc_regn_dt, nrvDetailsX.rc_regn_dt) && Intrinsics.areEqual(this.rc_regn_no, nrvDetailsX.rc_regn_no) && Intrinsics.areEqual(this.rc_regn_type, nrvDetailsX.rc_regn_type) && Intrinsics.areEqual(this.rc_seat_cap, nrvDetailsX.rc_seat_cap) && Intrinsics.areEqual(this.rc_sleeper_cap, nrvDetailsX.rc_sleeper_cap) && Intrinsics.areEqual(this.rc_stand_cap, nrvDetailsX.rc_stand_cap) && Intrinsics.areEqual(this.rc_status, nrvDetailsX.rc_status) && Intrinsics.areEqual(this.rc_status_as_on, nrvDetailsX.rc_status_as_on) && Intrinsics.areEqual(this.rc_tax_upto, nrvDetailsX.rc_tax_upto) && Intrinsics.areEqual(this.rc_unld_wt, nrvDetailsX.rc_unld_wt) && Intrinsics.areEqual(this.rc_vch_catg, nrvDetailsX.rc_vch_catg) && Intrinsics.areEqual(this.rc_vch_catg_desc, nrvDetailsX.rc_vch_catg_desc) && Intrinsics.areEqual(this.rc_vh_class_cd, nrvDetailsX.rc_vh_class_cd) && Intrinsics.areEqual(this.rc_vh_class_desc, nrvDetailsX.rc_vh_class_desc) && Intrinsics.areEqual(this.rc_wheelbase, nrvDetailsX.rc_wheelbase) && Intrinsics.areEqual(this.state_cd, nrvDetailsX.state_cd) && Intrinsics.areEqual(this.stautsMessage, nrvDetailsX.stautsMessage);
    }

    public final String getRc_blacklist_status() {
        return this.rc_blacklist_status;
    }

    public final String getRc_body_type_desc() {
        return this.rc_body_type_desc;
    }

    public final Object getRc_c_state() {
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

    public final Object getRc_email_id() {
        return this.rc_email_id;
    }

    public final String getRc_eng_no() {
        return this.rc_eng_no;
    }

    public final String getRc_f_name() {
        return this.rc_f_name;
    }

    public final Object getRc_financed_from() {
        return this.rc_financed_from;
    }

    public final String getRc_financer() {
        return this.rc_financer;
    }

    public final String getRc_fit_upto() {
        return this.rc_fit_upto;
    }

    public final Object getRc_fuel_cd() {
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

    public final Object getRc_maker_cd() {
        return this.rc_maker_cd;
    }

    public final String getRc_maker_desc() {
        return this.rc_maker_desc;
    }

    public final String getRc_maker_model() {
        return this.rc_maker_model;
    }

    public final Object getRc_manu_month() {
        return this.rc_manu_month;
    }

    public final String getRc_manu_month_yr() {
        return this.rc_manu_month_yr;
    }

    public final Object getRc_manu_yr() {
        return this.rc_manu_yr;
    }

    public final Object getRc_mobile_no() {
        return this.rc_mobile_no;
    }

    public final Object getRc_ncrb_status() {
        return this.rc_ncrb_status;
    }

    public final String getRc_no_cyl() {
        return this.rc_no_cyl;
    }

    public final String getRc_noc_details() {
        return this.rc_noc_details;
    }

    public final Object getRc_non_use_from() {
        return this.rc_non_use_from;
    }

    public final Object getRc_non_use_status() {
        return this.rc_non_use_status;
    }

    public final Object getRc_non_use_to() {
        return this.rc_non_use_to;
    }

    public final Object getRc_norms_cd() {
        return this.rc_norms_cd;
    }

    public final String getRc_norms_desc() {
        return this.rc_norms_desc;
    }

    public final Object getRc_np_issued_by() {
        return this.rc_np_issued_by;
    }

    public final Object getRc_np_no() {
        return this.rc_np_no;
    }

    public final Object getRc_np_upto() {
        return this.rc_np_upto;
    }

    public final Object getRc_off_cd() {
        return this.rc_off_cd;
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

    public final Object getRc_permit_issue_dt() {
        return this.rc_permit_issue_dt;
    }

    public final Object getRc_permit_no() {
        return this.rc_permit_no;
    }

    public final Object getRc_permit_type() {
        return this.rc_permit_type;
    }

    public final Object getRc_permit_valid_from() {
        return this.rc_permit_valid_from;
    }

    public final Object getRc_permit_valid_upto() {
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

    public final Object getRc_regn_type() {
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

    public final Object getRc_vch_catg_desc() {
        return this.rc_vch_catg_desc;
    }

    public final Object getRc_vh_class_cd() {
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
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.rc_blacklist_status.hashCode() * 31) + this.rc_body_type_desc.hashCode()) * 31) + this.rc_c_state.hashCode()) * 31) + this.rc_chasi_no.hashCode()) * 31) + this.rc_color.hashCode()) * 31) + this.rc_cubic_cap.hashCode()) * 31) + this.rc_email_id.hashCode()) * 31) + this.rc_eng_no.hashCode()) * 31) + this.rc_f_name.hashCode()) * 31) + this.rc_financed_from.hashCode()) * 31) + this.rc_financer.hashCode()) * 31) + this.rc_fit_upto.hashCode()) * 31) + this.rc_fuel_cd.hashCode()) * 31) + this.rc_fuel_desc.hashCode()) * 31) + this.rc_gvw.hashCode()) * 31) + this.rc_insurance_comp.hashCode()) * 31) + this.rc_insurance_policy_no.hashCode()) * 31) + this.rc_insurance_upto.hashCode()) * 31) + this.rc_maker_cd.hashCode()) * 31) + this.rc_maker_desc.hashCode()) * 31) + this.rc_maker_model.hashCode()) * 31) + this.rc_manu_month.hashCode()) * 31) + this.rc_manu_month_yr.hashCode()) * 31) + this.rc_manu_yr.hashCode()) * 31) + this.rc_mobile_no.hashCode()) * 31) + this.rc_ncrb_status.hashCode()) * 31) + this.rc_no_cyl.hashCode()) * 31) + this.rc_noc_details.hashCode()) * 31) + this.rc_non_use_from.hashCode()) * 31) + this.rc_non_use_status.hashCode()) * 31) + this.rc_non_use_to.hashCode()) * 31) + this.rc_norms_cd.hashCode()) * 31) + this.rc_norms_desc.hashCode()) * 31) + this.rc_np_issued_by.hashCode()) * 31) + this.rc_np_no.hashCode()) * 31) + this.rc_np_upto.hashCode()) * 31) + this.rc_off_cd.hashCode()) * 31) + this.rc_owner_name.hashCode()) * 31) + this.rc_owner_sr.hashCode()) * 31) + this.rc_permanent_address.hashCode()) * 31) + this.rc_permit_issue_dt.hashCode()) * 31) + this.rc_permit_no.hashCode()) * 31) + this.rc_permit_type.hashCode()) * 31) + this.rc_permit_valid_from.hashCode()) * 31) + this.rc_permit_valid_upto.hashCode()) * 31) + this.rc_present_address.hashCode()) * 31) + this.rc_pucc_no.hashCode()) * 31) + this.rc_pucc_upto.hashCode()) * 31) + this.rc_registered_at.hashCode()) * 31) + this.rc_regn_dt.hashCode()) * 31) + this.rc_regn_no.hashCode()) * 31) + this.rc_regn_type.hashCode()) * 31) + this.rc_seat_cap.hashCode()) * 31) + this.rc_sleeper_cap.hashCode()) * 31) + this.rc_stand_cap.hashCode()) * 31) + this.rc_status.hashCode()) * 31) + this.rc_status_as_on.hashCode()) * 31) + this.rc_tax_upto.hashCode()) * 31) + this.rc_unld_wt.hashCode()) * 31) + this.rc_vch_catg.hashCode()) * 31) + this.rc_vch_catg_desc.hashCode()) * 31) + this.rc_vh_class_cd.hashCode()) * 31) + this.rc_vh_class_desc.hashCode()) * 31) + this.rc_wheelbase.hashCode()) * 31) + this.state_cd.hashCode()) * 31) + this.stautsMessage.hashCode();
    }

    public String toString() {
        return "NrvDetailsX(rc_blacklist_status=" + this.rc_blacklist_status + ", rc_body_type_desc=" + this.rc_body_type_desc + ", rc_c_state=" + this.rc_c_state + ", rc_chasi_no=" + this.rc_chasi_no + ", rc_color=" + this.rc_color + ", rc_cubic_cap=" + this.rc_cubic_cap + ", rc_email_id=" + this.rc_email_id + ", rc_eng_no=" + this.rc_eng_no + ", rc_f_name=" + this.rc_f_name + ", rc_financed_from=" + this.rc_financed_from + ", rc_financer=" + this.rc_financer + ", rc_fit_upto=" + this.rc_fit_upto + ", rc_fuel_cd=" + this.rc_fuel_cd + ", rc_fuel_desc=" + this.rc_fuel_desc + ", rc_gvw=" + this.rc_gvw + ", rc_insurance_comp=" + this.rc_insurance_comp + ", rc_insurance_policy_no=" + this.rc_insurance_policy_no + ", rc_insurance_upto=" + this.rc_insurance_upto + ", rc_maker_cd=" + this.rc_maker_cd + ", rc_maker_desc=" + this.rc_maker_desc + ", rc_maker_model=" + this.rc_maker_model + ", rc_manu_month=" + this.rc_manu_month + ", rc_manu_month_yr=" + this.rc_manu_month_yr + ", rc_manu_yr=" + this.rc_manu_yr + ", rc_mobile_no=" + this.rc_mobile_no + ", rc_ncrb_status=" + this.rc_ncrb_status + ", rc_no_cyl=" + this.rc_no_cyl + ", rc_noc_details=" + this.rc_noc_details + ", rc_non_use_from=" + this.rc_non_use_from + ", rc_non_use_status=" + this.rc_non_use_status + ", rc_non_use_to=" + this.rc_non_use_to + ", rc_norms_cd=" + this.rc_norms_cd + ", rc_norms_desc=" + this.rc_norms_desc + ", rc_np_issued_by=" + this.rc_np_issued_by + ", rc_np_no=" + this.rc_np_no + ", rc_np_upto=" + this.rc_np_upto + ", rc_off_cd=" + this.rc_off_cd + ", rc_owner_name=" + this.rc_owner_name + ", rc_owner_sr=" + this.rc_owner_sr + ", rc_permanent_address=" + this.rc_permanent_address + ", rc_permit_issue_dt=" + this.rc_permit_issue_dt + ", rc_permit_no=" + this.rc_permit_no + ", rc_permit_type=" + this.rc_permit_type + ", rc_permit_valid_from=" + this.rc_permit_valid_from + ", rc_permit_valid_upto=" + this.rc_permit_valid_upto + ", rc_present_address=" + this.rc_present_address + ", rc_pucc_no=" + this.rc_pucc_no + ", rc_pucc_upto=" + this.rc_pucc_upto + ", rc_registered_at=" + this.rc_registered_at + ", rc_regn_dt=" + this.rc_regn_dt + ", rc_regn_no=" + this.rc_regn_no + ", rc_regn_type=" + this.rc_regn_type + ", rc_seat_cap=" + this.rc_seat_cap + ", rc_sleeper_cap=" + this.rc_sleeper_cap + ", rc_stand_cap=" + this.rc_stand_cap + ", rc_status=" + this.rc_status + ", rc_status_as_on=" + this.rc_status_as_on + ", rc_tax_upto=" + this.rc_tax_upto + ", rc_unld_wt=" + this.rc_unld_wt + ", rc_vch_catg=" + this.rc_vch_catg + ", rc_vch_catg_desc=" + this.rc_vch_catg_desc + ", rc_vh_class_cd=" + this.rc_vh_class_cd + ", rc_vh_class_desc=" + this.rc_vh_class_desc + ", rc_wheelbase=" + this.rc_wheelbase + ", state_cd=" + this.state_cd + ", stautsMessage=" + this.stautsMessage + ')';
    }
}
