package com.nic.mparivahan.Tax.Model;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000G\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0003\b\u008d\u0001\b\u0087\b\u0018\u00002\u00020\u0001B«\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0001\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0007\u0012\u001a\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018j\n\u0012\u0004\u0012\u00020\u0019\u0018\u0001`\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u0007\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\u0006\u0010!\u001a\u00020\u0007\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010#\u001a\u00020\u0007\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010%\u001a\u00020\u0007\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010(\u001a\u00020 \u0012\b\u0010)\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010.\u001a\u00020/\u0012\b\u00100\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u00101\u001a\u00020\u0007\u0012\u0006\u00102\u001a\u00020\u0007\u0012\u0006\u00103\u001a\u00020\u0007\u0012\u0006\u00104\u001a\u00020\u0007\u0012\u0006\u00105\u001a\u00020\u0007\u0012\u0006\u00106\u001a\u00020\u0007\u0012\u0006\u00107\u001a\u00020\u0007\u0012\b\u00108\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u00109\u001a\u00020/\u0012\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020<\u0018\u00010;\u0012\u0006\u0010=\u001a\u00020\u0007\u0012\b\u0010>\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010?\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010@\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010A\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010B\u001a\u00020\u0007\u0012\b\u0010C\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010D\u001a\u00020\u0007\u0012\u0006\u0010E\u001a\u00020\u0007¢\u0006\u0002\u0010FJ\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u008a\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u008c\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010\u008d\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u008e\u0001\u001a\u00020\u0007HÆ\u0003J\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\n\u0010\u0092\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u0093\u0001\u001a\u00020\u0007HÆ\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u001e\u0010\u0095\u0001\u001a\u0016\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018j\n\u0012\u0004\u0012\u00020\u0019\u0018\u0001`\u001aHÆ\u0003J\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u0097\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u0098\u0001\u001a\u00020\u0007HÆ\u0003J\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\n\u0010\u009a\u0001\u001a\u00020 HÆ\u0003J\n\u0010\u009b\u0001\u001a\u00020\u0007HÆ\u0003J\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\n\u0010\u009d\u0001\u001a\u00020\u0007HÆ\u0003J\f\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\f\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010 \u0001\u001a\u00020\u0007HÆ\u0003J\f\u0010¡\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¢\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010£\u0001\u001a\u00020 HÆ\u0003J\f\u0010¤\u0001\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\f\u0010¥\u0001\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\f\u0010¦\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010§\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¨\u0001\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\n\u0010©\u0001\u001a\u00020/HÆ\u0003J\n\u0010ª\u0001\u001a\u00020\u0007HÆ\u0003J\f\u0010«\u0001\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\n\u0010¬\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u00ad\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010®\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010¯\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010°\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010±\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010²\u0001\u001a\u00020\u0007HÆ\u0003J\f\u0010³\u0001\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\n\u0010´\u0001\u001a\u00020/HÆ\u0003J\f\u0010µ\u0001\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u0012\u0010¶\u0001\u001a\n\u0012\u0004\u0012\u00020<\u0018\u00010;HÆ\u0003J\n\u0010·\u0001\u001a\u00020\u0007HÆ\u0003J\f\u0010¸\u0001\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\f\u0010¹\u0001\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\f\u0010º\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010»\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010¼\u0001\u001a\u00020\u0007HÆ\u0003J\f\u0010½\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010¾\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010¿\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010À\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010Á\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010Â\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010Ã\u0001\u001a\u00020\u0007HÆ\u0003J¦\u0005\u0010Ä\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00072\u001c\b\u0002\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018j\n\u0012\u0004\u0012\u00020\u0019\u0018\u0001`\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00072\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\u00072\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010#\u001a\u00020\u00072\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010%\u001a\u00020\u00072\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010(\u001a\u00020 2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010.\u001a\u00020/2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u00101\u001a\u00020\u00072\b\b\u0002\u00102\u001a\u00020\u00072\b\b\u0002\u00103\u001a\u00020\u00072\b\b\u0002\u00104\u001a\u00020\u00072\b\b\u0002\u00105\u001a\u00020\u00072\b\b\u0002\u00106\u001a\u00020\u00072\b\b\u0002\u00107\u001a\u00020\u00072\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u00109\u001a\u00020/2\u0010\b\u0002\u0010:\u001a\n\u0012\u0004\u0012\u00020<\u0018\u00010;2\b\b\u0002\u0010=\u001a\u00020\u00072\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010B\u001a\u00020\u00072\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010D\u001a\u00020\u00072\b\b\u0002\u0010E\u001a\u00020\u0007HÆ\u0001J\u0015\u0010Å\u0001\u001a\u00020/2\t\u0010Æ\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010Ç\u0001\u001a\u00020\u0007HÖ\u0001J\n\u0010È\u0001\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bK\u0010HR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\bN\u0010JR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bO\u0010MR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bP\u0010MR\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010MR\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bR\u0010MR\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bS\u0010MR\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bT\u0010MR\u0011\u0010\u000f\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bU\u0010JR\u0011\u0010\u0010\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bV\u0010MR\u0011\u0010\u0011\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bW\u0010MR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bX\u0010HR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\bY\u0010JR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010JR\u0011\u0010\u0015\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b[\u0010MR\u0011\u0010\u0016\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010MR%\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018j\n\u0012\u0004\u0012\u00020\u0019\u0018\u0001`\u001a¢\u0006\b\n\u0000\u001a\u0004\b]\u0010^R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b_\u0010HR\u0011\u0010\u001c\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b`\u0010MR\u0011\u0010\u001d\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\ba\u0010MR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\bb\u0010JR\u0011\u0010\u001f\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\bc\u0010dR\u0011\u0010!\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\be\u0010MR\u0013\u0010\"\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\bf\u0010JR\u0011\u0010#\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bg\u0010MR\u0013\u0010$\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\bh\u0010JR\u0011\u0010%\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bi\u0010MR\u0013\u0010&\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bj\u0010HR\u0013\u0010'\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bk\u0010HR\u0011\u0010(\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\bl\u0010dR\u0013\u0010)\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\bm\u0010JR\u0013\u0010*\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\bn\u0010JR\u0013\u0010+\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bo\u0010HR\u0013\u0010,\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bp\u0010HR\u0013\u0010-\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\bq\u0010JR\u0011\u0010.\u001a\u00020/¢\u0006\b\n\u0000\u001a\u0004\br\u0010sR\u0013\u00100\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\bt\u0010JR\u0011\u00101\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bu\u0010MR\u0011\u00102\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bv\u0010MR\u0011\u00103\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bw\u0010MR\u0011\u00104\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bx\u0010MR\u0011\u00105\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\by\u0010MR\u0011\u00106\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bz\u0010MR\u0011\u00107\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b{\u0010MR\u0013\u00108\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b|\u0010JR\u0011\u00109\u001a\u00020/¢\u0006\b\n\u0000\u001a\u0004\b}\u0010sR\u0019\u0010:\u001a\n\u0012\u0004\u0012\u00020<\u0018\u00010;¢\u0006\b\n\u0000\u001a\u0004\b~\u0010\u007fR\u0012\u0010=\u001a\u00020\u0007¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010MR\u0014\u0010>\u001a\u0004\u0018\u00010\u0001¢\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010JR\u0014\u0010?\u001a\u0004\u0018\u00010\u0001¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010JR\u0014\u0010@\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0083\u0001\u0010HR\u0014\u0010A\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0084\u0001\u0010HR\u0012\u0010B\u001a\u00020\u0007¢\u0006\t\n\u0000\u001a\u0005\b\u0085\u0001\u0010MR\u0014\u0010C\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0086\u0001\u0010HR\u0012\u0010D\u001a\u00020\u0007¢\u0006\t\n\u0000\u001a\u0005\b\u0087\u0001\u0010MR\u0012\u0010E\u001a\u00020\u0007¢\u0006\t\n\u0000\u001a\u0005\b\u0088\u0001\u0010M¨\u0006É\u0001"}, d2 = {"Lcom/nic/mparivahan/Tax/Model/TaxDataFormat;", "", "ac_fitted", "", "appl_no", "audio_fitted", "cubic_cap", "", "dialogValue", "distance_run_in_quarter", "domain_cd", "fin_yr_sale_amt", "floor_area", "fuel", "gcw", "goods_to_carry", "height", "hp", "imported_vch", "issue_dt", "jorney_purpose", "ld_wt", "length", "listTaxModes", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/Tax/Model/TaxModes;", "Lkotlin/collections/ArrayList;", "no_adv_units", "no_cyl", "no_of_trips", "off_cd", "op_dt", "", "other_criteria", "parking", "pmt_catg", "pmt_no", "pmt_type", "pur_cd", "pur_descr", "purchase_dt", "rcpt_no", "region_covered", "regn_no", "regn_type", "remarks", "renderForm", "", "replace_date", "route_class", "route_length", "sale_amt", "seat_cap", "service_type", "sleeper_cap", "stand_cap", "state_cd", "taxBased", "taxPurCdDesc", "", "Lcom/nic/mparivahan/Tax/Model/TaxPurCdDescr;", "unld_wt", "valid_from", "valid_upto", "vch_catg", "vch_purchase_as", "vh_class", "video_fitted", "wheelbase", "width", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;ILjava/lang/Object;IIIIIILjava/lang/Object;IILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;IILjava/util/ArrayList;Ljava/lang/String;IILjava/lang/Object;JILjava/lang/Object;ILjava/lang/Object;ILjava/lang/String;Ljava/lang/String;JLjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZLjava/lang/Object;IIIIIIILjava/lang/Object;ZLjava/util/List;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;II)V", "getAc_fitted", "()Ljava/lang/String;", "getAppl_no", "()Ljava/lang/Object;", "getAudio_fitted", "getCubic_cap", "()I", "getDialogValue", "getDistance_run_in_quarter", "getDomain_cd", "getFin_yr_sale_amt", "getFloor_area", "getFuel", "getGcw", "getGoods_to_carry", "getHeight", "getHp", "getImported_vch", "getIssue_dt", "getJorney_purpose", "getLd_wt", "getLength", "getListTaxModes", "()Ljava/util/ArrayList;", "getNo_adv_units", "getNo_cyl", "getNo_of_trips", "getOff_cd", "getOp_dt", "()J", "getOther_criteria", "getParking", "getPmt_catg", "getPmt_no", "getPmt_type", "getPur_cd", "getPur_descr", "getPurchase_dt", "getRcpt_no", "getRegion_covered", "getRegn_no", "getRegn_type", "getRemarks", "getRenderForm", "()Z", "getReplace_date", "getRoute_class", "getRoute_length", "getSale_amt", "getSeat_cap", "getService_type", "getSleeper_cap", "getStand_cap", "getState_cd", "getTaxBased", "getTaxPurCdDesc", "()Ljava/util/List;", "getUnld_wt", "getValid_from", "getValid_upto", "getVch_catg", "getVch_purchase_as", "getVh_class", "getVideo_fitted", "getWheelbase", "getWidth", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class TaxDataFormat {
    private final String ac_fitted;
    private final Object appl_no;
    private final String audio_fitted;
    private final int cubic_cap;
    private final Object dialogValue;
    private final int distance_run_in_quarter;
    private final int domain_cd;
    private final int fin_yr_sale_amt;
    private final int floor_area;
    private final int fuel;
    private final int gcw;
    private final Object goods_to_carry;
    private final int height;
    private final int hp;
    private final String imported_vch;
    private final Object issue_dt;
    private final Object jorney_purpose;
    private final int ld_wt;
    private final int length;
    private final ArrayList<TaxModes> listTaxModes;
    private final String no_adv_units;
    private final int no_cyl;
    private final int no_of_trips;
    private final Object off_cd;
    private final long op_dt;
    private final int other_criteria;
    private final Object parking;
    private final int pmt_catg;
    private final Object pmt_no;
    private final int pmt_type;
    private final String pur_cd;
    private final String pur_descr;
    private final long purchase_dt;
    private final Object rcpt_no;
    private final Object region_covered;
    private final String regn_no;
    private final String regn_type;
    private final Object remarks;
    private final boolean renderForm;
    private final Object replace_date;
    private final int route_class;
    private final int route_length;
    private final int sale_amt;
    private final int seat_cap;
    private final int service_type;
    private final int sleeper_cap;
    private final int stand_cap;
    private final Object state_cd;
    private final boolean taxBased;
    private final List<TaxPurCdDescr> taxPurCdDesc;
    private final int unld_wt;
    private final Object valid_from;
    private final Object valid_upto;
    private final String vch_catg;
    private final String vch_purchase_as;
    private final int vh_class;
    private final String video_fitted;
    private final int wheelbase;
    private final int width;

    public TaxDataFormat(String str, Object obj, String str2, int i, Object obj2, int i2, int i3, int i4, int i5, int i6, int i7, Object goods_to_carry, int i8, int i9, String str3, Object obj3, Object obj4, int i10, int i11, ArrayList<TaxModes> arrayList, String str4, int i12, int i13, Object obj5, long j, int i14, Object obj6, int i15, Object obj7, int i16, String str5, String str6, long j2, Object obj8, Object obj9, String str7, String str8, Object obj10, boolean z, Object obj11, int i17, int i18, int i19, int i20, int i21, int i22, int i23, Object obj12, boolean z2, List<TaxPurCdDescr> list, int i24, Object obj13, Object obj14, String str9, String str10, int i25, String str11, int i26, int i27) {
        Intrinsics.checkNotNullParameter(goods_to_carry, "goods_to_carry");
        this.ac_fitted = str;
        this.appl_no = obj;
        this.audio_fitted = str2;
        this.cubic_cap = i;
        this.dialogValue = obj2;
        this.distance_run_in_quarter = i2;
        this.domain_cd = i3;
        this.fin_yr_sale_amt = i4;
        this.floor_area = i5;
        this.fuel = i6;
        this.gcw = i7;
        this.goods_to_carry = goods_to_carry;
        this.height = i8;
        this.hp = i9;
        this.imported_vch = str3;
        this.issue_dt = obj3;
        this.jorney_purpose = obj4;
        this.ld_wt = i10;
        this.length = i11;
        this.listTaxModes = arrayList;
        this.no_adv_units = str4;
        this.no_cyl = i12;
        this.no_of_trips = i13;
        this.off_cd = obj5;
        this.op_dt = j;
        this.other_criteria = i14;
        this.parking = obj6;
        this.pmt_catg = i15;
        this.pmt_no = obj7;
        this.pmt_type = i16;
        this.pur_cd = str5;
        this.pur_descr = str6;
        this.purchase_dt = j2;
        this.rcpt_no = obj8;
        this.region_covered = obj9;
        this.regn_no = str7;
        this.regn_type = str8;
        this.remarks = obj10;
        this.renderForm = z;
        this.replace_date = obj11;
        this.route_class = i17;
        this.route_length = i18;
        this.sale_amt = i19;
        this.seat_cap = i20;
        this.service_type = i21;
        this.sleeper_cap = i22;
        this.stand_cap = i23;
        this.state_cd = obj12;
        this.taxBased = z2;
        this.taxPurCdDesc = list;
        this.unld_wt = i24;
        this.valid_from = obj13;
        this.valid_upto = obj14;
        this.vch_catg = str9;
        this.vch_purchase_as = str10;
        this.vh_class = i25;
        this.video_fitted = str11;
        this.wheelbase = i26;
        this.width = i27;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TaxDataFormat copy$default(TaxDataFormat taxDataFormat, String str, Object obj, String str2, int i, Object obj2, int i2, int i3, int i4, int i5, int i6, int i7, Object obj3, int i8, int i9, String str3, Object obj4, Object obj5, int i10, int i11, ArrayList arrayList, String str4, int i12, int i13, Object obj6, long j, int i14, Object obj7, int i15, Object obj8, int i16, String str5, String str6, long j2, Object obj9, Object obj10, String str7, String str8, Object obj11, boolean z, Object obj12, int i17, int i18, int i19, int i20, int i21, int i22, int i23, Object obj13, boolean z2, List list, int i24, Object obj14, Object obj15, String str9, String str10, int i25, String str11, int i26, int i27, int i28, int i29, Object obj16) {
        String str12 = (i28 & 1) != 0 ? taxDataFormat.ac_fitted : str;
        Object obj17 = (i28 & 2) != 0 ? taxDataFormat.appl_no : obj;
        String str13 = (i28 & 4) != 0 ? taxDataFormat.audio_fitted : str2;
        int i30 = (i28 & 8) != 0 ? taxDataFormat.cubic_cap : i;
        Object obj18 = (i28 & 16) != 0 ? taxDataFormat.dialogValue : obj2;
        int i31 = (i28 & 32) != 0 ? taxDataFormat.distance_run_in_quarter : i2;
        int i32 = (i28 & 64) != 0 ? taxDataFormat.domain_cd : i3;
        int i33 = (i28 & 128) != 0 ? taxDataFormat.fin_yr_sale_amt : i4;
        int i34 = (i28 & 256) != 0 ? taxDataFormat.floor_area : i5;
        int i35 = (i28 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? taxDataFormat.fuel : i6;
        int i36 = (i28 & 1024) != 0 ? taxDataFormat.gcw : i7;
        Object obj19 = (i28 & 2048) != 0 ? taxDataFormat.goods_to_carry : obj3;
        return taxDataFormat.copy(str12, obj17, str13, i30, obj18, i31, i32, i33, i34, i35, i36, obj19, (i28 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? taxDataFormat.height : i8, (i28 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? taxDataFormat.hp : i9, (i28 & 16384) != 0 ? taxDataFormat.imported_vch : str3, (i28 & 32768) != 0 ? taxDataFormat.issue_dt : obj4, (i28 & 65536) != 0 ? taxDataFormat.jorney_purpose : obj5, (i28 & 131072) != 0 ? taxDataFormat.ld_wt : i10, (i28 & 262144) != 0 ? taxDataFormat.length : i11, (i28 & 524288) != 0 ? taxDataFormat.listTaxModes : arrayList, (i28 & 1048576) != 0 ? taxDataFormat.no_adv_units : str4, (i28 & 2097152) != 0 ? taxDataFormat.no_cyl : i12, (i28 & 4194304) != 0 ? taxDataFormat.no_of_trips : i13, (i28 & 8388608) != 0 ? taxDataFormat.off_cd : obj6, (i28 & 16777216) != 0 ? taxDataFormat.op_dt : j, (i28 & 33554432) != 0 ? taxDataFormat.other_criteria : i14, (67108864 & i28) != 0 ? taxDataFormat.parking : obj7, (i28 & 134217728) != 0 ? taxDataFormat.pmt_catg : i15, (i28 & 268435456) != 0 ? taxDataFormat.pmt_no : obj8, (i28 & 536870912) != 0 ? taxDataFormat.pmt_type : i16, (i28 & 1073741824) != 0 ? taxDataFormat.pur_cd : str5, (i28 & IntCompanionObject.MIN_VALUE) != 0 ? taxDataFormat.pur_descr : str6, (i29 & 1) != 0 ? taxDataFormat.purchase_dt : j2, (i29 & 2) != 0 ? taxDataFormat.rcpt_no : obj9, (i29 & 4) != 0 ? taxDataFormat.region_covered : obj10, (i29 & 8) != 0 ? taxDataFormat.regn_no : str7, (i29 & 16) != 0 ? taxDataFormat.regn_type : str8, (i29 & 32) != 0 ? taxDataFormat.remarks : obj11, (i29 & 64) != 0 ? taxDataFormat.renderForm : z, (i29 & 128) != 0 ? taxDataFormat.replace_date : obj12, (i29 & 256) != 0 ? taxDataFormat.route_class : i17, (i29 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? taxDataFormat.route_length : i18, (i29 & 1024) != 0 ? taxDataFormat.sale_amt : i19, (i29 & 2048) != 0 ? taxDataFormat.seat_cap : i20, (i29 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? taxDataFormat.service_type : i21, (i29 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? taxDataFormat.sleeper_cap : i22, (i29 & 16384) != 0 ? taxDataFormat.stand_cap : i23, (i29 & 32768) != 0 ? taxDataFormat.state_cd : obj13, (i29 & 65536) != 0 ? taxDataFormat.taxBased : z2, (i29 & 131072) != 0 ? taxDataFormat.taxPurCdDesc : list, (i29 & 262144) != 0 ? taxDataFormat.unld_wt : i24, (i29 & 524288) != 0 ? taxDataFormat.valid_from : obj14, (i29 & 1048576) != 0 ? taxDataFormat.valid_upto : obj15, (i29 & 2097152) != 0 ? taxDataFormat.vch_catg : str9, (i29 & 4194304) != 0 ? taxDataFormat.vch_purchase_as : str10, (i29 & 8388608) != 0 ? taxDataFormat.vh_class : i25, (i29 & 16777216) != 0 ? taxDataFormat.video_fitted : str11, (i29 & 33554432) != 0 ? taxDataFormat.wheelbase : i26, (i29 & 67108864) != 0 ? taxDataFormat.width : i27);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAc_fitted() {
        return this.ac_fitted;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getFuel() {
        return this.fuel;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getGcw() {
        return this.gcw;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Object getGoods_to_carry() {
        return this.goods_to_carry;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getHp() {
        return this.hp;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getImported_vch() {
        return this.imported_vch;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Object getIssue_dt() {
        return this.issue_dt;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Object getJorney_purpose() {
        return this.jorney_purpose;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getLd_wt() {
        return this.ld_wt;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getLength() {
        return this.length;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getAppl_no() {
        return this.appl_no;
    }

    public final ArrayList<TaxModes> component20() {
        return this.listTaxModes;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getNo_adv_units() {
        return this.no_adv_units;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final int getNo_cyl() {
        return this.no_cyl;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final int getNo_of_trips() {
        return this.no_of_trips;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Object getOff_cd() {
        return this.off_cd;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final long getOp_dt() {
        return this.op_dt;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final int getOther_criteria() {
        return this.other_criteria;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final Object getParking() {
        return this.parking;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final int getPmt_catg() {
        return this.pmt_catg;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final Object getPmt_no() {
        return this.pmt_no;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAudio_fitted() {
        return this.audio_fitted;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final int getPmt_type() {
        return this.pmt_type;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getPur_cd() {
        return this.pur_cd;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getPur_descr() {
        return this.pur_descr;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final long getPurchase_dt() {
        return this.purchase_dt;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final Object getRcpt_no() {
        return this.rcpt_no;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final Object getRegion_covered() {
        return this.region_covered;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final String getRegn_no() {
        return this.regn_no;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final String getRegn_type() {
        return this.regn_type;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final Object getRemarks() {
        return this.remarks;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final boolean getRenderForm() {
        return this.renderForm;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getCubic_cap() {
        return this.cubic_cap;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final Object getReplace_date() {
        return this.replace_date;
    }

    /* JADX INFO: renamed from: component41, reason: from getter */
    public final int getRoute_class() {
        return this.route_class;
    }

    /* JADX INFO: renamed from: component42, reason: from getter */
    public final int getRoute_length() {
        return this.route_length;
    }

    /* JADX INFO: renamed from: component43, reason: from getter */
    public final int getSale_amt() {
        return this.sale_amt;
    }

    /* JADX INFO: renamed from: component44, reason: from getter */
    public final int getSeat_cap() {
        return this.seat_cap;
    }

    /* JADX INFO: renamed from: component45, reason: from getter */
    public final int getService_type() {
        return this.service_type;
    }

    /* JADX INFO: renamed from: component46, reason: from getter */
    public final int getSleeper_cap() {
        return this.sleeper_cap;
    }

    /* JADX INFO: renamed from: component47, reason: from getter */
    public final int getStand_cap() {
        return this.stand_cap;
    }

    /* JADX INFO: renamed from: component48, reason: from getter */
    public final Object getState_cd() {
        return this.state_cd;
    }

    /* JADX INFO: renamed from: component49, reason: from getter */
    public final boolean getTaxBased() {
        return this.taxBased;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Object getDialogValue() {
        return this.dialogValue;
    }

    public final List<TaxPurCdDescr> component50() {
        return this.taxPurCdDesc;
    }

    /* JADX INFO: renamed from: component51, reason: from getter */
    public final int getUnld_wt() {
        return this.unld_wt;
    }

    /* JADX INFO: renamed from: component52, reason: from getter */
    public final Object getValid_from() {
        return this.valid_from;
    }

    /* JADX INFO: renamed from: component53, reason: from getter */
    public final Object getValid_upto() {
        return this.valid_upto;
    }

    /* JADX INFO: renamed from: component54, reason: from getter */
    public final String getVch_catg() {
        return this.vch_catg;
    }

    /* JADX INFO: renamed from: component55, reason: from getter */
    public final String getVch_purchase_as() {
        return this.vch_purchase_as;
    }

    /* JADX INFO: renamed from: component56, reason: from getter */
    public final int getVh_class() {
        return this.vh_class;
    }

    /* JADX INFO: renamed from: component57, reason: from getter */
    public final String getVideo_fitted() {
        return this.video_fitted;
    }

    /* JADX INFO: renamed from: component58, reason: from getter */
    public final int getWheelbase() {
        return this.wheelbase;
    }

    /* JADX INFO: renamed from: component59, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getDistance_run_in_quarter() {
        return this.distance_run_in_quarter;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getDomain_cd() {
        return this.domain_cd;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getFin_yr_sale_amt() {
        return this.fin_yr_sale_amt;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getFloor_area() {
        return this.floor_area;
    }

    public final TaxDataFormat copy(String ac_fitted, Object appl_no, String audio_fitted, int cubic_cap, Object dialogValue, int distance_run_in_quarter, int domain_cd, int fin_yr_sale_amt, int floor_area, int fuel, int gcw, Object goods_to_carry, int height, int hp, String imported_vch, Object issue_dt, Object jorney_purpose, int ld_wt, int length, ArrayList<TaxModes> listTaxModes, String no_adv_units, int no_cyl, int no_of_trips, Object off_cd, long op_dt, int other_criteria, Object parking, int pmt_catg, Object pmt_no, int pmt_type, String pur_cd, String pur_descr, long purchase_dt, Object rcpt_no, Object region_covered, String regn_no, String regn_type, Object remarks, boolean renderForm, Object replace_date, int route_class, int route_length, int sale_amt, int seat_cap, int service_type, int sleeper_cap, int stand_cap, Object state_cd, boolean taxBased, List<TaxPurCdDescr> taxPurCdDesc, int unld_wt, Object valid_from, Object valid_upto, String vch_catg, String vch_purchase_as, int vh_class, String video_fitted, int wheelbase, int width) {
        Intrinsics.checkNotNullParameter(goods_to_carry, "goods_to_carry");
        return new TaxDataFormat(ac_fitted, appl_no, audio_fitted, cubic_cap, dialogValue, distance_run_in_quarter, domain_cd, fin_yr_sale_amt, floor_area, fuel, gcw, goods_to_carry, height, hp, imported_vch, issue_dt, jorney_purpose, ld_wt, length, listTaxModes, no_adv_units, no_cyl, no_of_trips, off_cd, op_dt, other_criteria, parking, pmt_catg, pmt_no, pmt_type, pur_cd, pur_descr, purchase_dt, rcpt_no, region_covered, regn_no, regn_type, remarks, renderForm, replace_date, route_class, route_length, sale_amt, seat_cap, service_type, sleeper_cap, stand_cap, state_cd, taxBased, taxPurCdDesc, unld_wt, valid_from, valid_upto, vch_catg, vch_purchase_as, vh_class, video_fitted, wheelbase, width);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaxDataFormat)) {
            return false;
        }
        TaxDataFormat taxDataFormat = (TaxDataFormat) other;
        return Intrinsics.areEqual(this.ac_fitted, taxDataFormat.ac_fitted) && Intrinsics.areEqual(this.appl_no, taxDataFormat.appl_no) && Intrinsics.areEqual(this.audio_fitted, taxDataFormat.audio_fitted) && this.cubic_cap == taxDataFormat.cubic_cap && Intrinsics.areEqual(this.dialogValue, taxDataFormat.dialogValue) && this.distance_run_in_quarter == taxDataFormat.distance_run_in_quarter && this.domain_cd == taxDataFormat.domain_cd && this.fin_yr_sale_amt == taxDataFormat.fin_yr_sale_amt && this.floor_area == taxDataFormat.floor_area && this.fuel == taxDataFormat.fuel && this.gcw == taxDataFormat.gcw && Intrinsics.areEqual(this.goods_to_carry, taxDataFormat.goods_to_carry) && this.height == taxDataFormat.height && this.hp == taxDataFormat.hp && Intrinsics.areEqual(this.imported_vch, taxDataFormat.imported_vch) && Intrinsics.areEqual(this.issue_dt, taxDataFormat.issue_dt) && Intrinsics.areEqual(this.jorney_purpose, taxDataFormat.jorney_purpose) && this.ld_wt == taxDataFormat.ld_wt && this.length == taxDataFormat.length && Intrinsics.areEqual(this.listTaxModes, taxDataFormat.listTaxModes) && Intrinsics.areEqual(this.no_adv_units, taxDataFormat.no_adv_units) && this.no_cyl == taxDataFormat.no_cyl && this.no_of_trips == taxDataFormat.no_of_trips && Intrinsics.areEqual(this.off_cd, taxDataFormat.off_cd) && this.op_dt == taxDataFormat.op_dt && this.other_criteria == taxDataFormat.other_criteria && Intrinsics.areEqual(this.parking, taxDataFormat.parking) && this.pmt_catg == taxDataFormat.pmt_catg && Intrinsics.areEqual(this.pmt_no, taxDataFormat.pmt_no) && this.pmt_type == taxDataFormat.pmt_type && Intrinsics.areEqual(this.pur_cd, taxDataFormat.pur_cd) && Intrinsics.areEqual(this.pur_descr, taxDataFormat.pur_descr) && this.purchase_dt == taxDataFormat.purchase_dt && Intrinsics.areEqual(this.rcpt_no, taxDataFormat.rcpt_no) && Intrinsics.areEqual(this.region_covered, taxDataFormat.region_covered) && Intrinsics.areEqual(this.regn_no, taxDataFormat.regn_no) && Intrinsics.areEqual(this.regn_type, taxDataFormat.regn_type) && Intrinsics.areEqual(this.remarks, taxDataFormat.remarks) && this.renderForm == taxDataFormat.renderForm && Intrinsics.areEqual(this.replace_date, taxDataFormat.replace_date) && this.route_class == taxDataFormat.route_class && this.route_length == taxDataFormat.route_length && this.sale_amt == taxDataFormat.sale_amt && this.seat_cap == taxDataFormat.seat_cap && this.service_type == taxDataFormat.service_type && this.sleeper_cap == taxDataFormat.sleeper_cap && this.stand_cap == taxDataFormat.stand_cap && Intrinsics.areEqual(this.state_cd, taxDataFormat.state_cd) && this.taxBased == taxDataFormat.taxBased && Intrinsics.areEqual(this.taxPurCdDesc, taxDataFormat.taxPurCdDesc) && this.unld_wt == taxDataFormat.unld_wt && Intrinsics.areEqual(this.valid_from, taxDataFormat.valid_from) && Intrinsics.areEqual(this.valid_upto, taxDataFormat.valid_upto) && Intrinsics.areEqual(this.vch_catg, taxDataFormat.vch_catg) && Intrinsics.areEqual(this.vch_purchase_as, taxDataFormat.vch_purchase_as) && this.vh_class == taxDataFormat.vh_class && Intrinsics.areEqual(this.video_fitted, taxDataFormat.video_fitted) && this.wheelbase == taxDataFormat.wheelbase && this.width == taxDataFormat.width;
    }

    public final String getAc_fitted() {
        return this.ac_fitted;
    }

    public final Object getAppl_no() {
        return this.appl_no;
    }

    public final String getAudio_fitted() {
        return this.audio_fitted;
    }

    public final int getCubic_cap() {
        return this.cubic_cap;
    }

    public final Object getDialogValue() {
        return this.dialogValue;
    }

    public final int getDistance_run_in_quarter() {
        return this.distance_run_in_quarter;
    }

    public final int getDomain_cd() {
        return this.domain_cd;
    }

    public final int getFin_yr_sale_amt() {
        return this.fin_yr_sale_amt;
    }

    public final int getFloor_area() {
        return this.floor_area;
    }

    public final int getFuel() {
        return this.fuel;
    }

    public final int getGcw() {
        return this.gcw;
    }

    public final Object getGoods_to_carry() {
        return this.goods_to_carry;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getHp() {
        return this.hp;
    }

    public final String getImported_vch() {
        return this.imported_vch;
    }

    public final Object getIssue_dt() {
        return this.issue_dt;
    }

    public final Object getJorney_purpose() {
        return this.jorney_purpose;
    }

    public final int getLd_wt() {
        return this.ld_wt;
    }

    public final int getLength() {
        return this.length;
    }

    public final ArrayList<TaxModes> getListTaxModes() {
        return this.listTaxModes;
    }

    public final String getNo_adv_units() {
        return this.no_adv_units;
    }

    public final int getNo_cyl() {
        return this.no_cyl;
    }

    public final int getNo_of_trips() {
        return this.no_of_trips;
    }

    public final Object getOff_cd() {
        return this.off_cd;
    }

    public final long getOp_dt() {
        return this.op_dt;
    }

    public final int getOther_criteria() {
        return this.other_criteria;
    }

    public final Object getParking() {
        return this.parking;
    }

    public final int getPmt_catg() {
        return this.pmt_catg;
    }

    public final Object getPmt_no() {
        return this.pmt_no;
    }

    public final int getPmt_type() {
        return this.pmt_type;
    }

    public final String getPur_cd() {
        return this.pur_cd;
    }

    public final String getPur_descr() {
        return this.pur_descr;
    }

    public final long getPurchase_dt() {
        return this.purchase_dt;
    }

    public final Object getRcpt_no() {
        return this.rcpt_no;
    }

    public final Object getRegion_covered() {
        return this.region_covered;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final String getRegn_type() {
        return this.regn_type;
    }

    public final Object getRemarks() {
        return this.remarks;
    }

    public final boolean getRenderForm() {
        return this.renderForm;
    }

    public final Object getReplace_date() {
        return this.replace_date;
    }

    public final int getRoute_class() {
        return this.route_class;
    }

    public final int getRoute_length() {
        return this.route_length;
    }

    public final int getSale_amt() {
        return this.sale_amt;
    }

    public final int getSeat_cap() {
        return this.seat_cap;
    }

    public final int getService_type() {
        return this.service_type;
    }

    public final int getSleeper_cap() {
        return this.sleeper_cap;
    }

    public final int getStand_cap() {
        return this.stand_cap;
    }

    public final Object getState_cd() {
        return this.state_cd;
    }

    public final boolean getTaxBased() {
        return this.taxBased;
    }

    public final List<TaxPurCdDescr> getTaxPurCdDesc() {
        return this.taxPurCdDesc;
    }

    public final int getUnld_wt() {
        return this.unld_wt;
    }

    public final Object getValid_from() {
        return this.valid_from;
    }

    public final Object getValid_upto() {
        return this.valid_upto;
    }

    public final String getVch_catg() {
        return this.vch_catg;
    }

    public final String getVch_purchase_as() {
        return this.vch_purchase_as;
    }

    public final int getVh_class() {
        return this.vh_class;
    }

    public final String getVideo_fitted() {
        return this.video_fitted;
    }

    public final int getWheelbase() {
        return this.wheelbase;
    }

    public final int getWidth() {
        return this.width;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v142 */
    /* JADX WARN: Type inference failed for: r2v161 */
    /* JADX WARN: Type inference failed for: r2v93, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public int hashCode() {
        String str = this.ac_fitted;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Object obj = this.appl_no;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        String str2 = this.audio_fitted;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.cubic_cap)) * 31;
        Object obj2 = this.dialogValue;
        int iHashCode4 = (((((((((((((((((((iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31) + Integer.hashCode(this.distance_run_in_quarter)) * 31) + Integer.hashCode(this.domain_cd)) * 31) + Integer.hashCode(this.fin_yr_sale_amt)) * 31) + Integer.hashCode(this.floor_area)) * 31) + Integer.hashCode(this.fuel)) * 31) + Integer.hashCode(this.gcw)) * 31) + this.goods_to_carry.hashCode()) * 31) + Integer.hashCode(this.height)) * 31) + Integer.hashCode(this.hp)) * 31;
        String str3 = this.imported_vch;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Object obj3 = this.issue_dt;
        int iHashCode6 = (iHashCode5 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.jorney_purpose;
        int iHashCode7 = (((((iHashCode6 + (obj4 == null ? 0 : obj4.hashCode())) * 31) + Integer.hashCode(this.ld_wt)) * 31) + Integer.hashCode(this.length)) * 31;
        ArrayList<TaxModes> arrayList = this.listTaxModes;
        int iHashCode8 = (iHashCode7 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        String str4 = this.no_adv_units;
        int iHashCode9 = (((((iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31) + Integer.hashCode(this.no_cyl)) * 31) + Integer.hashCode(this.no_of_trips)) * 31;
        Object obj5 = this.off_cd;
        int iHashCode10 = (((((iHashCode9 + (obj5 == null ? 0 : obj5.hashCode())) * 31) + Long.hashCode(this.op_dt)) * 31) + Integer.hashCode(this.other_criteria)) * 31;
        Object obj6 = this.parking;
        int iHashCode11 = (((iHashCode10 + (obj6 == null ? 0 : obj6.hashCode())) * 31) + Integer.hashCode(this.pmt_catg)) * 31;
        Object obj7 = this.pmt_no;
        int iHashCode12 = (((iHashCode11 + (obj7 == null ? 0 : obj7.hashCode())) * 31) + Integer.hashCode(this.pmt_type)) * 31;
        String str5 = this.pur_cd;
        int iHashCode13 = (iHashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.pur_descr;
        int iHashCode14 = (((iHashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31) + Long.hashCode(this.purchase_dt)) * 31;
        Object obj8 = this.rcpt_no;
        int iHashCode15 = (iHashCode14 + (obj8 == null ? 0 : obj8.hashCode())) * 31;
        Object obj9 = this.region_covered;
        int iHashCode16 = (iHashCode15 + (obj9 == null ? 0 : obj9.hashCode())) * 31;
        String str7 = this.regn_no;
        int iHashCode17 = (iHashCode16 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.regn_type;
        int iHashCode18 = (iHashCode17 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Object obj10 = this.remarks;
        int iHashCode19 = (iHashCode18 + (obj10 == null ? 0 : obj10.hashCode())) * 31;
        boolean z = this.renderForm;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (iHashCode19 + r2) * 31;
        Object obj11 = this.replace_date;
        int iHashCode20 = (((((((((((((((i + (obj11 == null ? 0 : obj11.hashCode())) * 31) + Integer.hashCode(this.route_class)) * 31) + Integer.hashCode(this.route_length)) * 31) + Integer.hashCode(this.sale_amt)) * 31) + Integer.hashCode(this.seat_cap)) * 31) + Integer.hashCode(this.service_type)) * 31) + Integer.hashCode(this.sleeper_cap)) * 31) + Integer.hashCode(this.stand_cap)) * 31;
        Object obj12 = this.state_cd;
        int iHashCode21 = (iHashCode20 + (obj12 == null ? 0 : obj12.hashCode())) * 31;
        boolean z2 = this.taxBased;
        int i2 = (iHashCode21 + (z2 ? 1 : z2)) * 31;
        List<TaxPurCdDescr> list = this.taxPurCdDesc;
        int iHashCode22 = (((i2 + (list == null ? 0 : list.hashCode())) * 31) + Integer.hashCode(this.unld_wt)) * 31;
        Object obj13 = this.valid_from;
        int iHashCode23 = (iHashCode22 + (obj13 == null ? 0 : obj13.hashCode())) * 31;
        Object obj14 = this.valid_upto;
        int iHashCode24 = (iHashCode23 + (obj14 == null ? 0 : obj14.hashCode())) * 31;
        String str9 = this.vch_catg;
        int iHashCode25 = (iHashCode24 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.vch_purchase_as;
        int iHashCode26 = (((iHashCode25 + (str10 == null ? 0 : str10.hashCode())) * 31) + Integer.hashCode(this.vh_class)) * 31;
        String str11 = this.video_fitted;
        return ((((iHashCode26 + (str11 != null ? str11.hashCode() : 0)) * 31) + Integer.hashCode(this.wheelbase)) * 31) + Integer.hashCode(this.width);
    }

    public String toString() {
        return "TaxDataFormat(ac_fitted=" + this.ac_fitted + ", appl_no=" + this.appl_no + ", audio_fitted=" + this.audio_fitted + ", cubic_cap=" + this.cubic_cap + ", dialogValue=" + this.dialogValue + ", distance_run_in_quarter=" + this.distance_run_in_quarter + ", domain_cd=" + this.domain_cd + ", fin_yr_sale_amt=" + this.fin_yr_sale_amt + ", floor_area=" + this.floor_area + ", fuel=" + this.fuel + ", gcw=" + this.gcw + ", goods_to_carry=" + this.goods_to_carry + ", height=" + this.height + ", hp=" + this.hp + ", imported_vch=" + this.imported_vch + ", issue_dt=" + this.issue_dt + ", jorney_purpose=" + this.jorney_purpose + ", ld_wt=" + this.ld_wt + ", length=" + this.length + ", listTaxModes=" + this.listTaxModes + ", no_adv_units=" + this.no_adv_units + ", no_cyl=" + this.no_cyl + ", no_of_trips=" + this.no_of_trips + ", off_cd=" + this.off_cd + ", op_dt=" + this.op_dt + ", other_criteria=" + this.other_criteria + ", parking=" + this.parking + ", pmt_catg=" + this.pmt_catg + ", pmt_no=" + this.pmt_no + ", pmt_type=" + this.pmt_type + ", pur_cd=" + this.pur_cd + ", pur_descr=" + this.pur_descr + ", purchase_dt=" + this.purchase_dt + ", rcpt_no=" + this.rcpt_no + ", region_covered=" + this.region_covered + ", regn_no=" + this.regn_no + ", regn_type=" + this.regn_type + ", remarks=" + this.remarks + ", renderForm=" + this.renderForm + ", replace_date=" + this.replace_date + ", route_class=" + this.route_class + ", route_length=" + this.route_length + ", sale_amt=" + this.sale_amt + ", seat_cap=" + this.seat_cap + ", service_type=" + this.service_type + ", sleeper_cap=" + this.sleeper_cap + ", stand_cap=" + this.stand_cap + ", state_cd=" + this.state_cd + ", taxBased=" + this.taxBased + ", taxPurCdDesc=" + this.taxPurCdDesc + ", unld_wt=" + this.unld_wt + ", valid_from=" + this.valid_from + ", valid_upto=" + this.valid_upto + ", vch_catg=" + this.vch_catg + ", vch_purchase_as=" + this.vch_purchase_as + ", vh_class=" + this.vh_class + ", video_fitted=" + this.video_fitted + ", wheelbase=" + this.wheelbase + ", width=" + this.width + ')';
    }
}
