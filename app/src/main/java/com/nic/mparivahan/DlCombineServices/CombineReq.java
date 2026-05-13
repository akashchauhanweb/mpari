package com.nic.mparivahan.DlCombineServices;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000#\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0003\b¢\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bý\u0006\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010NJ\f\u0010ç\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010è\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010é\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ê\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ë\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010ì\u0001\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010jJ\f\u0010í\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010î\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ï\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ð\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ñ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ò\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ó\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ô\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010õ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ö\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010÷\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ø\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ù\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ú\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010û\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ü\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ý\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010þ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ÿ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0080\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0081\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0082\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0083\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0084\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0085\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0086\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0087\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0088\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0089\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008a\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008b\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008c\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008d\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008e\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008f\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0090\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0091\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0092\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0093\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0094\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0095\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0096\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0097\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0098\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0099\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009a\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009b\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009c\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009d\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009e\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009f\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010 \u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¡\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¢\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010£\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¤\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¥\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¦\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010§\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¨\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010©\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ª\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010«\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¬\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u00ad\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010®\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¯\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010°\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0088\u0007\u0010±\u0002\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0003\u0010²\u0002J\u0016\u0010³\u0002\u001a\u00030´\u00022\t\u0010µ\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010¶\u0002\u001a\u00020\u0011HÖ\u0001J\n\u0010·\u0002\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010P\"\u0004\bT\u0010RR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010P\"\u0004\bV\u0010RR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010P\"\u0004\bX\u0010RR\u001c\u0010-\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010P\"\u0004\bZ\u0010RR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010P\"\u0004\b\\\u0010RR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010P\"\u0004\b^\u0010RR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010P\"\u0004\b`\u0010RR\u001c\u0010H\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010P\"\u0004\bb\u0010RR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010P\"\u0004\bd\u0010RR\u001c\u0010/\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010P\"\u0004\bf\u0010RR\u001c\u0010.\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010P\"\u0004\bh\u0010RR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010m\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010P\"\u0004\bo\u0010RR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u0010P\"\u0004\bq\u0010RR\u001c\u00108\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\br\u0010P\"\u0004\bs\u0010RR\u001c\u0010?\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bt\u0010P\"\u0004\bu\u0010RR\u001c\u0010K\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u0010P\"\u0004\bw\u0010RR\u001c\u00100\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bx\u0010P\"\u0004\by\u0010RR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010P\"\u0004\b{\u0010RR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b|\u0010P\"\u0004\b}\u0010RR\u001c\u0010A\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b~\u0010P\"\u0004\b\u007f\u0010RR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0001\u0010P\"\u0005\b\u0081\u0001\u0010RR\u001e\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0001\u0010P\"\u0005\b\u0083\u0001\u0010RR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0001\u0010P\"\u0005\b\u0085\u0001\u0010RR\u001e\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0086\u0001\u0010P\"\u0005\b\u0087\u0001\u0010RR\u001e\u0010,\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0088\u0001\u0010P\"\u0005\b\u0089\u0001\u0010RR\u001e\u0010+\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008a\u0001\u0010P\"\u0005\b\u008b\u0001\u0010RR\u001e\u0010G\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008c\u0001\u0010P\"\u0005\b\u008d\u0001\u0010RR\u001e\u0010L\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008e\u0001\u0010P\"\u0005\b\u008f\u0001\u0010RR\u001e\u0010J\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0090\u0001\u0010P\"\u0005\b\u0091\u0001\u0010RR\u001e\u0010B\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0092\u0001\u0010P\"\u0005\b\u0093\u0001\u0010RR\u001e\u0010C\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0094\u0001\u0010P\"\u0005\b\u0095\u0001\u0010RR\u001e\u0010D\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0096\u0001\u0010P\"\u0005\b\u0097\u0001\u0010RR\u001e\u0010E\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0098\u0001\u0010P\"\u0005\b\u0099\u0001\u0010RR\u001e\u0010F\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009a\u0001\u0010P\"\u0005\b\u009b\u0001\u0010RR\u001e\u00101\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009c\u0001\u0010P\"\u0005\b\u009d\u0001\u0010RR\u001e\u00105\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009e\u0001\u0010P\"\u0005\b\u009f\u0001\u0010RR\u001e\u00106\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b \u0001\u0010P\"\u0005\b¡\u0001\u0010RR\u001e\u00102\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¢\u0001\u0010P\"\u0005\b£\u0001\u0010RR\u001e\u00103\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¤\u0001\u0010P\"\u0005\b¥\u0001\u0010RR\u001e\u00104\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¦\u0001\u0010P\"\u0005\b§\u0001\u0010RR\u001e\u0010M\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¨\u0001\u0010P\"\u0005\b©\u0001\u0010RR\u001e\u0010I\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bª\u0001\u0010P\"\u0005\b«\u0001\u0010RR\u001d\u0010@\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b@\u0010P\"\u0005\b¬\u0001\u0010RR\u001e\u0010>\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u00ad\u0001\u0010P\"\u0005\b®\u0001\u0010RR\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¯\u0001\u0010P\"\u0005\b°\u0001\u0010RR\u001e\u00109\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b±\u0001\u0010P\"\u0005\b²\u0001\u0010RR\u001e\u0010:\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b³\u0001\u0010P\"\u0005\b´\u0001\u0010RR\u001e\u0010 \u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bµ\u0001\u0010P\"\u0005\b¶\u0001\u0010RR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b·\u0001\u0010P\"\u0005\b¸\u0001\u0010RR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¹\u0001\u0010P\"\u0005\bº\u0001\u0010RR\u001e\u0010\"\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b»\u0001\u0010P\"\u0005\b¼\u0001\u0010RR\u001e\u0010!\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b½\u0001\u0010P\"\u0005\b¾\u0001\u0010RR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¿\u0001\u0010P\"\u0005\bÀ\u0001\u0010RR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÁ\u0001\u0010P\"\u0005\bÂ\u0001\u0010RR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÃ\u0001\u0010P\"\u0005\bÄ\u0001\u0010RR\u001e\u00107\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÅ\u0001\u0010P\"\u0005\bÆ\u0001\u0010RR\u001e\u0010(\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÇ\u0001\u0010P\"\u0005\bÈ\u0001\u0010RR\u001e\u0010#\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÉ\u0001\u0010P\"\u0005\bÊ\u0001\u0010RR\u001e\u0010%\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bË\u0001\u0010P\"\u0005\bÌ\u0001\u0010RR\u001e\u0010*\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÍ\u0001\u0010P\"\u0005\bÎ\u0001\u0010RR\u001e\u0010)\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÏ\u0001\u0010P\"\u0005\bÐ\u0001\u0010RR\u001e\u0010$\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÑ\u0001\u0010P\"\u0005\bÒ\u0001\u0010RR\u001e\u0010'\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÓ\u0001\u0010P\"\u0005\bÔ\u0001\u0010RR\u001e\u0010&\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÕ\u0001\u0010P\"\u0005\bÖ\u0001\u0010RR\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b×\u0001\u0010P\"\u0005\bØ\u0001\u0010RR\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÙ\u0001\u0010P\"\u0005\bÚ\u0001\u0010RR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÛ\u0001\u0010P\"\u0005\bÜ\u0001\u0010RR\u001e\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÝ\u0001\u0010P\"\u0005\bÞ\u0001\u0010RR\u001e\u0010=\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bß\u0001\u0010P\"\u0005\bà\u0001\u0010RR\u001e\u0010;\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bá\u0001\u0010P\"\u0005\bâ\u0001\u0010RR\u001e\u0010<\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bã\u0001\u0010P\"\u0005\bä\u0001\u0010RR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bå\u0001\u0010P\"\u0005\bæ\u0001\u0010R¨\u0006¸\u0002"}, d2 = {"Lcom/nic/mparivahan/DlCombineServices/CombineReq;", "", "agentId", "", "agentPwd", "agentIpAddress", "agentServiceName", "dleDlReasonCode", "dleDlReasonName", "applcatgDLserReq", "dlHolderAltMobMum", "dlno", "dob", "rtoCodeDLTr", "willtoDonateOrgans", "relationType", "conDlReasonCode", "", "conDlReasonName", "dlHolderNaturalName", "conEffdate", "applFirstName", "applLastName", "relFirstName", "relLastName", "mobileNumber", "changeOfAddReq", "perHouseNo", "perStreet", "perLocation", "permVillageOrTown", "perSubDistrict", "perDistrict", "perState", "perPinCode", "presHouseNo", "presStreet", "presLocation", "presVillageOrTown", "presSubDistrict", "presDistrict", "presState", "presPincode", "dupDlReasonName", "dupDlReasonCode", "applDateOfBirth", "codobDlReasonName", "codobDlReasonCode", "declaringcheck", "hillcertificate", "hillissueDate", "hillvalidFrom", "hillvalidTo", "hilldrivingschool", "hillissby", "pofbirth", "country", "passno", "passvaltill", "visano", "visavaltill", "tovisit", "iscountryrestricted", "countryRestrictedReason", "isDlSerdisqualified", "dlSerdisqualifiedReason", "forAdd1", "forAdd2", "forAdd3", "forAddPinCode", "forNationMobNum", "emailID", "appliedIdpfromIndEmb", "indEmbName", "embPlace", "dateOfVerifEmb", "embEndorseNo", "idpcountryapplyfrom", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAgentId", "()Ljava/lang/String;", "setAgentId", "(Ljava/lang/String;)V", "getAgentIpAddress", "setAgentIpAddress", "getAgentPwd", "setAgentPwd", "getAgentServiceName", "setAgentServiceName", "getApplDateOfBirth", "setApplDateOfBirth", "getApplFirstName", "setApplFirstName", "getApplLastName", "setApplLastName", "getApplcatgDLserReq", "setApplcatgDLserReq", "getAppliedIdpfromIndEmb", "setAppliedIdpfromIndEmb", "getChangeOfAddReq", "setChangeOfAddReq", "getCodobDlReasonCode", "setCodobDlReasonCode", "getCodobDlReasonName", "setCodobDlReasonName", "getConDlReasonCode", "()Ljava/lang/Integer;", "setConDlReasonCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getConDlReasonName", "setConDlReasonName", "getConEffdate", "setConEffdate", "getCountry", "setCountry", "getCountryRestrictedReason", "setCountryRestrictedReason", "getDateOfVerifEmb", "setDateOfVerifEmb", "getDeclaringcheck", "setDeclaringcheck", "getDlHolderAltMobMum", "setDlHolderAltMobMum", "getDlHolderNaturalName", "setDlHolderNaturalName", "getDlSerdisqualifiedReason", "setDlSerdisqualifiedReason", "getDleDlReasonCode", "setDleDlReasonCode", "getDleDlReasonName", "setDleDlReasonName", "getDlno", "setDlno", "getDob", "setDob", "getDupDlReasonCode", "setDupDlReasonCode", "getDupDlReasonName", "setDupDlReasonName", "getEmailID", "setEmailID", "getEmbEndorseNo", "setEmbEndorseNo", "getEmbPlace", "setEmbPlace", "getForAdd1", "setForAdd1", "getForAdd2", "setForAdd2", "getForAdd3", "setForAdd3", "getForAddPinCode", "setForAddPinCode", "getForNationMobNum", "setForNationMobNum", "getHillcertificate", "setHillcertificate", "getHilldrivingschool", "setHilldrivingschool", "getHillissby", "setHillissby", "getHillissueDate", "setHillissueDate", "getHillvalidFrom", "setHillvalidFrom", "getHillvalidTo", "setHillvalidTo", "getIdpcountryapplyfrom", "setIdpcountryapplyfrom", "getIndEmbName", "setIndEmbName", "setDlSerdisqualified", "getIscountryrestricted", "setIscountryrestricted", "getMobileNumber", "setMobileNumber", "getPassno", "setPassno", "getPassvaltill", "setPassvaltill", "getPerDistrict", "setPerDistrict", "getPerHouseNo", "setPerHouseNo", "getPerLocation", "setPerLocation", "getPerPinCode", "setPerPinCode", "getPerState", "setPerState", "getPerStreet", "setPerStreet", "getPerSubDistrict", "setPerSubDistrict", "getPermVillageOrTown", "setPermVillageOrTown", "getPofbirth", "setPofbirth", "getPresDistrict", "setPresDistrict", "getPresHouseNo", "setPresHouseNo", "getPresLocation", "setPresLocation", "getPresPincode", "setPresPincode", "getPresState", "setPresState", "getPresStreet", "setPresStreet", "getPresSubDistrict", "setPresSubDistrict", "getPresVillageOrTown", "setPresVillageOrTown", "getRelFirstName", "setRelFirstName", "getRelLastName", "setRelLastName", "getRelationType", "setRelationType", "getRtoCodeDLTr", "setRtoCodeDLTr", "getTovisit", "setTovisit", "getVisano", "setVisano", "getVisavaltill", "setVisavaltill", "getWilltoDonateOrgans", "setWilltoDonateOrgans", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component6", "component60", "component61", "component62", "component63", "component64", "component65", "component66", "component67", "component68", "component69", "component7", "component70", "component71", "component72", "component73", "component74", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/nic/mparivahan/DlCombineServices/CombineReq;", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CombineReq {
    private String agentId;
    private String agentIpAddress;
    private String agentPwd;
    private String agentServiceName;
    private String applDateOfBirth;
    private String applFirstName;
    private String applLastName;
    private String applcatgDLserReq;
    private String appliedIdpfromIndEmb;
    private String changeOfAddReq;
    private String codobDlReasonCode;
    private String codobDlReasonName;
    private Integer conDlReasonCode;
    private String conDlReasonName;
    private String conEffdate;
    private String country;
    private String countryRestrictedReason;
    private String dateOfVerifEmb;
    private String declaringcheck;
    private String dlHolderAltMobMum;
    private String dlHolderNaturalName;
    private String dlSerdisqualifiedReason;
    private String dleDlReasonCode;
    private String dleDlReasonName;
    private String dlno;
    private String dob;
    private String dupDlReasonCode;
    private String dupDlReasonName;
    private String emailID;
    private String embEndorseNo;
    private String embPlace;
    private String forAdd1;
    private String forAdd2;
    private String forAdd3;
    private String forAddPinCode;
    private String forNationMobNum;
    private String hillcertificate;
    private String hilldrivingschool;
    private String hillissby;
    private String hillissueDate;
    private String hillvalidFrom;
    private String hillvalidTo;
    private String idpcountryapplyfrom;
    private String indEmbName;
    private String isDlSerdisqualified;
    private String iscountryrestricted;
    private String mobileNumber;
    private String passno;
    private String passvaltill;
    private String perDistrict;
    private String perHouseNo;
    private String perLocation;
    private String perPinCode;
    private String perState;
    private String perStreet;
    private String perSubDistrict;
    private String permVillageOrTown;
    private String pofbirth;
    private String presDistrict;
    private String presHouseNo;
    private String presLocation;
    private String presPincode;
    private String presState;
    private String presStreet;
    private String presSubDistrict;
    private String presVillageOrTown;
    private String relFirstName;
    private String relLastName;
    private String relationType;
    private String rtoCodeDLTr;
    private String tovisit;
    private String visano;
    private String visavaltill;
    private String willtoDonateOrgans;

    public CombineReq() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 1023, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAgentId() {
        return this.agentId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getDob() {
        return this.dob;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getRtoCodeDLTr() {
        return this.rtoCodeDLTr;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getWilltoDonateOrgans() {
        return this.willtoDonateOrgans;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getRelationType() {
        return this.relationType;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Integer getConDlReasonCode() {
        return this.conDlReasonCode;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getConDlReasonName() {
        return this.conDlReasonName;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getDlHolderNaturalName() {
        return this.dlHolderNaturalName;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getConEffdate() {
        return this.conEffdate;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getApplFirstName() {
        return this.applFirstName;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getApplLastName() {
        return this.applLastName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAgentPwd() {
        return this.agentPwd;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getRelFirstName() {
        return this.relFirstName;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getRelLastName() {
        return this.relLastName;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getChangeOfAddReq() {
        return this.changeOfAddReq;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getPerHouseNo() {
        return this.perHouseNo;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getPerStreet() {
        return this.perStreet;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getPerLocation() {
        return this.perLocation;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getPermVillageOrTown() {
        return this.permVillageOrTown;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getPerSubDistrict() {
        return this.perSubDistrict;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getPerDistrict() {
        return this.perDistrict;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAgentIpAddress() {
        return this.agentIpAddress;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getPerState() {
        return this.perState;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getPerPinCode() {
        return this.perPinCode;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getPresHouseNo() {
        return this.presHouseNo;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getPresStreet() {
        return this.presStreet;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final String getPresLocation() {
        return this.presLocation;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final String getPresVillageOrTown() {
        return this.presVillageOrTown;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final String getPresSubDistrict() {
        return this.presSubDistrict;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final String getPresDistrict() {
        return this.presDistrict;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final String getPresState() {
        return this.presState;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final String getPresPincode() {
        return this.presPincode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAgentServiceName() {
        return this.agentServiceName;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final String getDupDlReasonName() {
        return this.dupDlReasonName;
    }

    /* JADX INFO: renamed from: component41, reason: from getter */
    public final String getDupDlReasonCode() {
        return this.dupDlReasonCode;
    }

    /* JADX INFO: renamed from: component42, reason: from getter */
    public final String getApplDateOfBirth() {
        return this.applDateOfBirth;
    }

    /* JADX INFO: renamed from: component43, reason: from getter */
    public final String getCodobDlReasonName() {
        return this.codobDlReasonName;
    }

    /* JADX INFO: renamed from: component44, reason: from getter */
    public final String getCodobDlReasonCode() {
        return this.codobDlReasonCode;
    }

    /* JADX INFO: renamed from: component45, reason: from getter */
    public final String getDeclaringcheck() {
        return this.declaringcheck;
    }

    /* JADX INFO: renamed from: component46, reason: from getter */
    public final String getHillcertificate() {
        return this.hillcertificate;
    }

    /* JADX INFO: renamed from: component47, reason: from getter */
    public final String getHillissueDate() {
        return this.hillissueDate;
    }

    /* JADX INFO: renamed from: component48, reason: from getter */
    public final String getHillvalidFrom() {
        return this.hillvalidFrom;
    }

    /* JADX INFO: renamed from: component49, reason: from getter */
    public final String getHillvalidTo() {
        return this.hillvalidTo;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDleDlReasonCode() {
        return this.dleDlReasonCode;
    }

    /* JADX INFO: renamed from: component50, reason: from getter */
    public final String getHilldrivingschool() {
        return this.hilldrivingschool;
    }

    /* JADX INFO: renamed from: component51, reason: from getter */
    public final String getHillissby() {
        return this.hillissby;
    }

    /* JADX INFO: renamed from: component52, reason: from getter */
    public final String getPofbirth() {
        return this.pofbirth;
    }

    /* JADX INFO: renamed from: component53, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: component54, reason: from getter */
    public final String getPassno() {
        return this.passno;
    }

    /* JADX INFO: renamed from: component55, reason: from getter */
    public final String getPassvaltill() {
        return this.passvaltill;
    }

    /* JADX INFO: renamed from: component56, reason: from getter */
    public final String getVisano() {
        return this.visano;
    }

    /* JADX INFO: renamed from: component57, reason: from getter */
    public final String getVisavaltill() {
        return this.visavaltill;
    }

    /* JADX INFO: renamed from: component58, reason: from getter */
    public final String getTovisit() {
        return this.tovisit;
    }

    /* JADX INFO: renamed from: component59, reason: from getter */
    public final String getIscountryrestricted() {
        return this.iscountryrestricted;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDleDlReasonName() {
        return this.dleDlReasonName;
    }

    /* JADX INFO: renamed from: component60, reason: from getter */
    public final String getCountryRestrictedReason() {
        return this.countryRestrictedReason;
    }

    /* JADX INFO: renamed from: component61, reason: from getter */
    public final String getIsDlSerdisqualified() {
        return this.isDlSerdisqualified;
    }

    /* JADX INFO: renamed from: component62, reason: from getter */
    public final String getDlSerdisqualifiedReason() {
        return this.dlSerdisqualifiedReason;
    }

    /* JADX INFO: renamed from: component63, reason: from getter */
    public final String getForAdd1() {
        return this.forAdd1;
    }

    /* JADX INFO: renamed from: component64, reason: from getter */
    public final String getForAdd2() {
        return this.forAdd2;
    }

    /* JADX INFO: renamed from: component65, reason: from getter */
    public final String getForAdd3() {
        return this.forAdd3;
    }

    /* JADX INFO: renamed from: component66, reason: from getter */
    public final String getForAddPinCode() {
        return this.forAddPinCode;
    }

    /* JADX INFO: renamed from: component67, reason: from getter */
    public final String getForNationMobNum() {
        return this.forNationMobNum;
    }

    /* JADX INFO: renamed from: component68, reason: from getter */
    public final String getEmailID() {
        return this.emailID;
    }

    /* JADX INFO: renamed from: component69, reason: from getter */
    public final String getAppliedIdpfromIndEmb() {
        return this.appliedIdpfromIndEmb;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getApplcatgDLserReq() {
        return this.applcatgDLserReq;
    }

    /* JADX INFO: renamed from: component70, reason: from getter */
    public final String getIndEmbName() {
        return this.indEmbName;
    }

    /* JADX INFO: renamed from: component71, reason: from getter */
    public final String getEmbPlace() {
        return this.embPlace;
    }

    /* JADX INFO: renamed from: component72, reason: from getter */
    public final String getDateOfVerifEmb() {
        return this.dateOfVerifEmb;
    }

    /* JADX INFO: renamed from: component73, reason: from getter */
    public final String getEmbEndorseNo() {
        return this.embEndorseNo;
    }

    /* JADX INFO: renamed from: component74, reason: from getter */
    public final String getIdpcountryapplyfrom() {
        return this.idpcountryapplyfrom;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDlHolderAltMobMum() {
        return this.dlHolderAltMobMum;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDlno() {
        return this.dlno;
    }

    public final CombineReq copy(String agentId, String agentPwd, String agentIpAddress, String agentServiceName, String dleDlReasonCode, String dleDlReasonName, String applcatgDLserReq, String dlHolderAltMobMum, String dlno, String dob, String rtoCodeDLTr, String willtoDonateOrgans, String relationType, Integer conDlReasonCode, String conDlReasonName, String dlHolderNaturalName, String conEffdate, String applFirstName, String applLastName, String relFirstName, String relLastName, String mobileNumber, String changeOfAddReq, String perHouseNo, String perStreet, String perLocation, String permVillageOrTown, String perSubDistrict, String perDistrict, String perState, String perPinCode, String presHouseNo, String presStreet, String presLocation, String presVillageOrTown, String presSubDistrict, String presDistrict, String presState, String presPincode, String dupDlReasonName, String dupDlReasonCode, String applDateOfBirth, String codobDlReasonName, String codobDlReasonCode, String declaringcheck, String hillcertificate, String hillissueDate, String hillvalidFrom, String hillvalidTo, String hilldrivingschool, String hillissby, String pofbirth, String country, String passno, String passvaltill, String visano, String visavaltill, String tovisit, String iscountryrestricted, String countryRestrictedReason, String isDlSerdisqualified, String dlSerdisqualifiedReason, String forAdd1, String forAdd2, String forAdd3, String forAddPinCode, String forNationMobNum, String emailID, String appliedIdpfromIndEmb, String indEmbName, String embPlace, String dateOfVerifEmb, String embEndorseNo, String idpcountryapplyfrom) {
        return new CombineReq(agentId, agentPwd, agentIpAddress, agentServiceName, dleDlReasonCode, dleDlReasonName, applcatgDLserReq, dlHolderAltMobMum, dlno, dob, rtoCodeDLTr, willtoDonateOrgans, relationType, conDlReasonCode, conDlReasonName, dlHolderNaturalName, conEffdate, applFirstName, applLastName, relFirstName, relLastName, mobileNumber, changeOfAddReq, perHouseNo, perStreet, perLocation, permVillageOrTown, perSubDistrict, perDistrict, perState, perPinCode, presHouseNo, presStreet, presLocation, presVillageOrTown, presSubDistrict, presDistrict, presState, presPincode, dupDlReasonName, dupDlReasonCode, applDateOfBirth, codobDlReasonName, codobDlReasonCode, declaringcheck, hillcertificate, hillissueDate, hillvalidFrom, hillvalidTo, hilldrivingschool, hillissby, pofbirth, country, passno, passvaltill, visano, visavaltill, tovisit, iscountryrestricted, countryRestrictedReason, isDlSerdisqualified, dlSerdisqualifiedReason, forAdd1, forAdd2, forAdd3, forAddPinCode, forNationMobNum, emailID, appliedIdpfromIndEmb, indEmbName, embPlace, dateOfVerifEmb, embEndorseNo, idpcountryapplyfrom);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CombineReq)) {
            return false;
        }
        CombineReq combineReq = (CombineReq) other;
        return Intrinsics.areEqual(this.agentId, combineReq.agentId) && Intrinsics.areEqual(this.agentPwd, combineReq.agentPwd) && Intrinsics.areEqual(this.agentIpAddress, combineReq.agentIpAddress) && Intrinsics.areEqual(this.agentServiceName, combineReq.agentServiceName) && Intrinsics.areEqual(this.dleDlReasonCode, combineReq.dleDlReasonCode) && Intrinsics.areEqual(this.dleDlReasonName, combineReq.dleDlReasonName) && Intrinsics.areEqual(this.applcatgDLserReq, combineReq.applcatgDLserReq) && Intrinsics.areEqual(this.dlHolderAltMobMum, combineReq.dlHolderAltMobMum) && Intrinsics.areEqual(this.dlno, combineReq.dlno) && Intrinsics.areEqual(this.dob, combineReq.dob) && Intrinsics.areEqual(this.rtoCodeDLTr, combineReq.rtoCodeDLTr) && Intrinsics.areEqual(this.willtoDonateOrgans, combineReq.willtoDonateOrgans) && Intrinsics.areEqual(this.relationType, combineReq.relationType) && Intrinsics.areEqual(this.conDlReasonCode, combineReq.conDlReasonCode) && Intrinsics.areEqual(this.conDlReasonName, combineReq.conDlReasonName) && Intrinsics.areEqual(this.dlHolderNaturalName, combineReq.dlHolderNaturalName) && Intrinsics.areEqual(this.conEffdate, combineReq.conEffdate) && Intrinsics.areEqual(this.applFirstName, combineReq.applFirstName) && Intrinsics.areEqual(this.applLastName, combineReq.applLastName) && Intrinsics.areEqual(this.relFirstName, combineReq.relFirstName) && Intrinsics.areEqual(this.relLastName, combineReq.relLastName) && Intrinsics.areEqual(this.mobileNumber, combineReq.mobileNumber) && Intrinsics.areEqual(this.changeOfAddReq, combineReq.changeOfAddReq) && Intrinsics.areEqual(this.perHouseNo, combineReq.perHouseNo) && Intrinsics.areEqual(this.perStreet, combineReq.perStreet) && Intrinsics.areEqual(this.perLocation, combineReq.perLocation) && Intrinsics.areEqual(this.permVillageOrTown, combineReq.permVillageOrTown) && Intrinsics.areEqual(this.perSubDistrict, combineReq.perSubDistrict) && Intrinsics.areEqual(this.perDistrict, combineReq.perDistrict) && Intrinsics.areEqual(this.perState, combineReq.perState) && Intrinsics.areEqual(this.perPinCode, combineReq.perPinCode) && Intrinsics.areEqual(this.presHouseNo, combineReq.presHouseNo) && Intrinsics.areEqual(this.presStreet, combineReq.presStreet) && Intrinsics.areEqual(this.presLocation, combineReq.presLocation) && Intrinsics.areEqual(this.presVillageOrTown, combineReq.presVillageOrTown) && Intrinsics.areEqual(this.presSubDistrict, combineReq.presSubDistrict) && Intrinsics.areEqual(this.presDistrict, combineReq.presDistrict) && Intrinsics.areEqual(this.presState, combineReq.presState) && Intrinsics.areEqual(this.presPincode, combineReq.presPincode) && Intrinsics.areEqual(this.dupDlReasonName, combineReq.dupDlReasonName) && Intrinsics.areEqual(this.dupDlReasonCode, combineReq.dupDlReasonCode) && Intrinsics.areEqual(this.applDateOfBirth, combineReq.applDateOfBirth) && Intrinsics.areEqual(this.codobDlReasonName, combineReq.codobDlReasonName) && Intrinsics.areEqual(this.codobDlReasonCode, combineReq.codobDlReasonCode) && Intrinsics.areEqual(this.declaringcheck, combineReq.declaringcheck) && Intrinsics.areEqual(this.hillcertificate, combineReq.hillcertificate) && Intrinsics.areEqual(this.hillissueDate, combineReq.hillissueDate) && Intrinsics.areEqual(this.hillvalidFrom, combineReq.hillvalidFrom) && Intrinsics.areEqual(this.hillvalidTo, combineReq.hillvalidTo) && Intrinsics.areEqual(this.hilldrivingschool, combineReq.hilldrivingschool) && Intrinsics.areEqual(this.hillissby, combineReq.hillissby) && Intrinsics.areEqual(this.pofbirth, combineReq.pofbirth) && Intrinsics.areEqual(this.country, combineReq.country) && Intrinsics.areEqual(this.passno, combineReq.passno) && Intrinsics.areEqual(this.passvaltill, combineReq.passvaltill) && Intrinsics.areEqual(this.visano, combineReq.visano) && Intrinsics.areEqual(this.visavaltill, combineReq.visavaltill) && Intrinsics.areEqual(this.tovisit, combineReq.tovisit) && Intrinsics.areEqual(this.iscountryrestricted, combineReq.iscountryrestricted) && Intrinsics.areEqual(this.countryRestrictedReason, combineReq.countryRestrictedReason) && Intrinsics.areEqual(this.isDlSerdisqualified, combineReq.isDlSerdisqualified) && Intrinsics.areEqual(this.dlSerdisqualifiedReason, combineReq.dlSerdisqualifiedReason) && Intrinsics.areEqual(this.forAdd1, combineReq.forAdd1) && Intrinsics.areEqual(this.forAdd2, combineReq.forAdd2) && Intrinsics.areEqual(this.forAdd3, combineReq.forAdd3) && Intrinsics.areEqual(this.forAddPinCode, combineReq.forAddPinCode) && Intrinsics.areEqual(this.forNationMobNum, combineReq.forNationMobNum) && Intrinsics.areEqual(this.emailID, combineReq.emailID) && Intrinsics.areEqual(this.appliedIdpfromIndEmb, combineReq.appliedIdpfromIndEmb) && Intrinsics.areEqual(this.indEmbName, combineReq.indEmbName) && Intrinsics.areEqual(this.embPlace, combineReq.embPlace) && Intrinsics.areEqual(this.dateOfVerifEmb, combineReq.dateOfVerifEmb) && Intrinsics.areEqual(this.embEndorseNo, combineReq.embEndorseNo) && Intrinsics.areEqual(this.idpcountryapplyfrom, combineReq.idpcountryapplyfrom);
    }

    public final String getAgentId() {
        return this.agentId;
    }

    public final String getAgentIpAddress() {
        return this.agentIpAddress;
    }

    public final String getAgentPwd() {
        return this.agentPwd;
    }

    public final String getAgentServiceName() {
        return this.agentServiceName;
    }

    public final String getApplDateOfBirth() {
        return this.applDateOfBirth;
    }

    public final String getApplFirstName() {
        return this.applFirstName;
    }

    public final String getApplLastName() {
        return this.applLastName;
    }

    public final String getApplcatgDLserReq() {
        return this.applcatgDLserReq;
    }

    public final String getAppliedIdpfromIndEmb() {
        return this.appliedIdpfromIndEmb;
    }

    public final String getChangeOfAddReq() {
        return this.changeOfAddReq;
    }

    public final String getCodobDlReasonCode() {
        return this.codobDlReasonCode;
    }

    public final String getCodobDlReasonName() {
        return this.codobDlReasonName;
    }

    public final Integer getConDlReasonCode() {
        return this.conDlReasonCode;
    }

    public final String getConDlReasonName() {
        return this.conDlReasonName;
    }

    public final String getConEffdate() {
        return this.conEffdate;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getCountryRestrictedReason() {
        return this.countryRestrictedReason;
    }

    public final String getDateOfVerifEmb() {
        return this.dateOfVerifEmb;
    }

    public final String getDeclaringcheck() {
        return this.declaringcheck;
    }

    public final String getDlHolderAltMobMum() {
        return this.dlHolderAltMobMum;
    }

    public final String getDlHolderNaturalName() {
        return this.dlHolderNaturalName;
    }

    public final String getDlSerdisqualifiedReason() {
        return this.dlSerdisqualifiedReason;
    }

    public final String getDleDlReasonCode() {
        return this.dleDlReasonCode;
    }

    public final String getDleDlReasonName() {
        return this.dleDlReasonName;
    }

    public final String getDlno() {
        return this.dlno;
    }

    public final String getDob() {
        return this.dob;
    }

    public final String getDupDlReasonCode() {
        return this.dupDlReasonCode;
    }

    public final String getDupDlReasonName() {
        return this.dupDlReasonName;
    }

    public final String getEmailID() {
        return this.emailID;
    }

    public final String getEmbEndorseNo() {
        return this.embEndorseNo;
    }

    public final String getEmbPlace() {
        return this.embPlace;
    }

    public final String getForAdd1() {
        return this.forAdd1;
    }

    public final String getForAdd2() {
        return this.forAdd2;
    }

    public final String getForAdd3() {
        return this.forAdd3;
    }

    public final String getForAddPinCode() {
        return this.forAddPinCode;
    }

    public final String getForNationMobNum() {
        return this.forNationMobNum;
    }

    public final String getHillcertificate() {
        return this.hillcertificate;
    }

    public final String getHilldrivingschool() {
        return this.hilldrivingschool;
    }

    public final String getHillissby() {
        return this.hillissby;
    }

    public final String getHillissueDate() {
        return this.hillissueDate;
    }

    public final String getHillvalidFrom() {
        return this.hillvalidFrom;
    }

    public final String getHillvalidTo() {
        return this.hillvalidTo;
    }

    public final String getIdpcountryapplyfrom() {
        return this.idpcountryapplyfrom;
    }

    public final String getIndEmbName() {
        return this.indEmbName;
    }

    public final String getIscountryrestricted() {
        return this.iscountryrestricted;
    }

    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    public final String getPassno() {
        return this.passno;
    }

    public final String getPassvaltill() {
        return this.passvaltill;
    }

    public final String getPerDistrict() {
        return this.perDistrict;
    }

    public final String getPerHouseNo() {
        return this.perHouseNo;
    }

    public final String getPerLocation() {
        return this.perLocation;
    }

    public final String getPerPinCode() {
        return this.perPinCode;
    }

    public final String getPerState() {
        return this.perState;
    }

    public final String getPerStreet() {
        return this.perStreet;
    }

    public final String getPerSubDistrict() {
        return this.perSubDistrict;
    }

    public final String getPermVillageOrTown() {
        return this.permVillageOrTown;
    }

    public final String getPofbirth() {
        return this.pofbirth;
    }

    public final String getPresDistrict() {
        return this.presDistrict;
    }

    public final String getPresHouseNo() {
        return this.presHouseNo;
    }

    public final String getPresLocation() {
        return this.presLocation;
    }

    public final String getPresPincode() {
        return this.presPincode;
    }

    public final String getPresState() {
        return this.presState;
    }

    public final String getPresStreet() {
        return this.presStreet;
    }

    public final String getPresSubDistrict() {
        return this.presSubDistrict;
    }

    public final String getPresVillageOrTown() {
        return this.presVillageOrTown;
    }

    public final String getRelFirstName() {
        return this.relFirstName;
    }

    public final String getRelLastName() {
        return this.relLastName;
    }

    public final String getRelationType() {
        return this.relationType;
    }

    public final String getRtoCodeDLTr() {
        return this.rtoCodeDLTr;
    }

    public final String getTovisit() {
        return this.tovisit;
    }

    public final String getVisano() {
        return this.visano;
    }

    public final String getVisavaltill() {
        return this.visavaltill;
    }

    public final String getWilltoDonateOrgans() {
        return this.willtoDonateOrgans;
    }

    public int hashCode() {
        String str = this.agentId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.agentPwd;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.agentIpAddress;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.agentServiceName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.dleDlReasonCode;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.dleDlReasonName;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.applcatgDLserReq;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.dlHolderAltMobMum;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.dlno;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.dob;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.rtoCodeDLTr;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.willtoDonateOrgans;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.relationType;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Integer num = this.conDlReasonCode;
        int iHashCode14 = (iHashCode13 + (num == null ? 0 : num.hashCode())) * 31;
        String str14 = this.conDlReasonName;
        int iHashCode15 = (iHashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.dlHolderNaturalName;
        int iHashCode16 = (iHashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.conEffdate;
        int iHashCode17 = (iHashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.applFirstName;
        int iHashCode18 = (iHashCode17 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.applLastName;
        int iHashCode19 = (iHashCode18 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.relFirstName;
        int iHashCode20 = (iHashCode19 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.relLastName;
        int iHashCode21 = (iHashCode20 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.mobileNumber;
        int iHashCode22 = (iHashCode21 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.changeOfAddReq;
        int iHashCode23 = (iHashCode22 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.perHouseNo;
        int iHashCode24 = (iHashCode23 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.perStreet;
        int iHashCode25 = (iHashCode24 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.perLocation;
        int iHashCode26 = (iHashCode25 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.permVillageOrTown;
        int iHashCode27 = (iHashCode26 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.perSubDistrict;
        int iHashCode28 = (iHashCode27 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.perDistrict;
        int iHashCode29 = (iHashCode28 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.perState;
        int iHashCode30 = (iHashCode29 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.perPinCode;
        int iHashCode31 = (iHashCode30 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.presHouseNo;
        int iHashCode32 = (iHashCode31 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.presStreet;
        int iHashCode33 = (iHashCode32 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.presLocation;
        int iHashCode34 = (iHashCode33 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.presVillageOrTown;
        int iHashCode35 = (iHashCode34 + (str34 == null ? 0 : str34.hashCode())) * 31;
        String str35 = this.presSubDistrict;
        int iHashCode36 = (iHashCode35 + (str35 == null ? 0 : str35.hashCode())) * 31;
        String str36 = this.presDistrict;
        int iHashCode37 = (iHashCode36 + (str36 == null ? 0 : str36.hashCode())) * 31;
        String str37 = this.presState;
        int iHashCode38 = (iHashCode37 + (str37 == null ? 0 : str37.hashCode())) * 31;
        String str38 = this.presPincode;
        int iHashCode39 = (iHashCode38 + (str38 == null ? 0 : str38.hashCode())) * 31;
        String str39 = this.dupDlReasonName;
        int iHashCode40 = (iHashCode39 + (str39 == null ? 0 : str39.hashCode())) * 31;
        String str40 = this.dupDlReasonCode;
        int iHashCode41 = (iHashCode40 + (str40 == null ? 0 : str40.hashCode())) * 31;
        String str41 = this.applDateOfBirth;
        int iHashCode42 = (iHashCode41 + (str41 == null ? 0 : str41.hashCode())) * 31;
        String str42 = this.codobDlReasonName;
        int iHashCode43 = (iHashCode42 + (str42 == null ? 0 : str42.hashCode())) * 31;
        String str43 = this.codobDlReasonCode;
        int iHashCode44 = (iHashCode43 + (str43 == null ? 0 : str43.hashCode())) * 31;
        String str44 = this.declaringcheck;
        int iHashCode45 = (iHashCode44 + (str44 == null ? 0 : str44.hashCode())) * 31;
        String str45 = this.hillcertificate;
        int iHashCode46 = (iHashCode45 + (str45 == null ? 0 : str45.hashCode())) * 31;
        String str46 = this.hillissueDate;
        int iHashCode47 = (iHashCode46 + (str46 == null ? 0 : str46.hashCode())) * 31;
        String str47 = this.hillvalidFrom;
        int iHashCode48 = (iHashCode47 + (str47 == null ? 0 : str47.hashCode())) * 31;
        String str48 = this.hillvalidTo;
        int iHashCode49 = (iHashCode48 + (str48 == null ? 0 : str48.hashCode())) * 31;
        String str49 = this.hilldrivingschool;
        int iHashCode50 = (iHashCode49 + (str49 == null ? 0 : str49.hashCode())) * 31;
        String str50 = this.hillissby;
        int iHashCode51 = (iHashCode50 + (str50 == null ? 0 : str50.hashCode())) * 31;
        String str51 = this.pofbirth;
        int iHashCode52 = (iHashCode51 + (str51 == null ? 0 : str51.hashCode())) * 31;
        String str52 = this.country;
        int iHashCode53 = (iHashCode52 + (str52 == null ? 0 : str52.hashCode())) * 31;
        String str53 = this.passno;
        int iHashCode54 = (iHashCode53 + (str53 == null ? 0 : str53.hashCode())) * 31;
        String str54 = this.passvaltill;
        int iHashCode55 = (iHashCode54 + (str54 == null ? 0 : str54.hashCode())) * 31;
        String str55 = this.visano;
        int iHashCode56 = (iHashCode55 + (str55 == null ? 0 : str55.hashCode())) * 31;
        String str56 = this.visavaltill;
        int iHashCode57 = (iHashCode56 + (str56 == null ? 0 : str56.hashCode())) * 31;
        String str57 = this.tovisit;
        int iHashCode58 = (iHashCode57 + (str57 == null ? 0 : str57.hashCode())) * 31;
        String str58 = this.iscountryrestricted;
        int iHashCode59 = (iHashCode58 + (str58 == null ? 0 : str58.hashCode())) * 31;
        String str59 = this.countryRestrictedReason;
        int iHashCode60 = (iHashCode59 + (str59 == null ? 0 : str59.hashCode())) * 31;
        String str60 = this.isDlSerdisqualified;
        int iHashCode61 = (iHashCode60 + (str60 == null ? 0 : str60.hashCode())) * 31;
        String str61 = this.dlSerdisqualifiedReason;
        int iHashCode62 = (iHashCode61 + (str61 == null ? 0 : str61.hashCode())) * 31;
        String str62 = this.forAdd1;
        int iHashCode63 = (iHashCode62 + (str62 == null ? 0 : str62.hashCode())) * 31;
        String str63 = this.forAdd2;
        int iHashCode64 = (iHashCode63 + (str63 == null ? 0 : str63.hashCode())) * 31;
        String str64 = this.forAdd3;
        int iHashCode65 = (iHashCode64 + (str64 == null ? 0 : str64.hashCode())) * 31;
        String str65 = this.forAddPinCode;
        int iHashCode66 = (iHashCode65 + (str65 == null ? 0 : str65.hashCode())) * 31;
        String str66 = this.forNationMobNum;
        int iHashCode67 = (iHashCode66 + (str66 == null ? 0 : str66.hashCode())) * 31;
        String str67 = this.emailID;
        int iHashCode68 = (iHashCode67 + (str67 == null ? 0 : str67.hashCode())) * 31;
        String str68 = this.appliedIdpfromIndEmb;
        int iHashCode69 = (iHashCode68 + (str68 == null ? 0 : str68.hashCode())) * 31;
        String str69 = this.indEmbName;
        int iHashCode70 = (iHashCode69 + (str69 == null ? 0 : str69.hashCode())) * 31;
        String str70 = this.embPlace;
        int iHashCode71 = (iHashCode70 + (str70 == null ? 0 : str70.hashCode())) * 31;
        String str71 = this.dateOfVerifEmb;
        int iHashCode72 = (iHashCode71 + (str71 == null ? 0 : str71.hashCode())) * 31;
        String str72 = this.embEndorseNo;
        int iHashCode73 = (iHashCode72 + (str72 == null ? 0 : str72.hashCode())) * 31;
        String str73 = this.idpcountryapplyfrom;
        return iHashCode73 + (str73 != null ? str73.hashCode() : 0);
    }

    public final String isDlSerdisqualified() {
        return this.isDlSerdisqualified;
    }

    public final void setAgentId(String str) {
        this.agentId = str;
    }

    public final void setAgentIpAddress(String str) {
        this.agentIpAddress = str;
    }

    public final void setAgentPwd(String str) {
        this.agentPwd = str;
    }

    public final void setAgentServiceName(String str) {
        this.agentServiceName = str;
    }

    public final void setApplDateOfBirth(String str) {
        this.applDateOfBirth = str;
    }

    public final void setApplFirstName(String str) {
        this.applFirstName = str;
    }

    public final void setApplLastName(String str) {
        this.applLastName = str;
    }

    public final void setApplcatgDLserReq(String str) {
        this.applcatgDLserReq = str;
    }

    public final void setAppliedIdpfromIndEmb(String str) {
        this.appliedIdpfromIndEmb = str;
    }

    public final void setChangeOfAddReq(String str) {
        this.changeOfAddReq = str;
    }

    public final void setCodobDlReasonCode(String str) {
        this.codobDlReasonCode = str;
    }

    public final void setCodobDlReasonName(String str) {
        this.codobDlReasonName = str;
    }

    public final void setConDlReasonCode(Integer num) {
        this.conDlReasonCode = num;
    }

    public final void setConDlReasonName(String str) {
        this.conDlReasonName = str;
    }

    public final void setConEffdate(String str) {
        this.conEffdate = str;
    }

    public final void setCountry(String str) {
        this.country = str;
    }

    public final void setCountryRestrictedReason(String str) {
        this.countryRestrictedReason = str;
    }

    public final void setDateOfVerifEmb(String str) {
        this.dateOfVerifEmb = str;
    }

    public final void setDeclaringcheck(String str) {
        this.declaringcheck = str;
    }

    public final void setDlHolderAltMobMum(String str) {
        this.dlHolderAltMobMum = str;
    }

    public final void setDlHolderNaturalName(String str) {
        this.dlHolderNaturalName = str;
    }

    public final void setDlSerdisqualified(String str) {
        this.isDlSerdisqualified = str;
    }

    public final void setDlSerdisqualifiedReason(String str) {
        this.dlSerdisqualifiedReason = str;
    }

    public final void setDleDlReasonCode(String str) {
        this.dleDlReasonCode = str;
    }

    public final void setDleDlReasonName(String str) {
        this.dleDlReasonName = str;
    }

    public final void setDlno(String str) {
        this.dlno = str;
    }

    public final void setDob(String str) {
        this.dob = str;
    }

    public final void setDupDlReasonCode(String str) {
        this.dupDlReasonCode = str;
    }

    public final void setDupDlReasonName(String str) {
        this.dupDlReasonName = str;
    }

    public final void setEmailID(String str) {
        this.emailID = str;
    }

    public final void setEmbEndorseNo(String str) {
        this.embEndorseNo = str;
    }

    public final void setEmbPlace(String str) {
        this.embPlace = str;
    }

    public final void setForAdd1(String str) {
        this.forAdd1 = str;
    }

    public final void setForAdd2(String str) {
        this.forAdd2 = str;
    }

    public final void setForAdd3(String str) {
        this.forAdd3 = str;
    }

    public final void setForAddPinCode(String str) {
        this.forAddPinCode = str;
    }

    public final void setForNationMobNum(String str) {
        this.forNationMobNum = str;
    }

    public final void setHillcertificate(String str) {
        this.hillcertificate = str;
    }

    public final void setHilldrivingschool(String str) {
        this.hilldrivingschool = str;
    }

    public final void setHillissby(String str) {
        this.hillissby = str;
    }

    public final void setHillissueDate(String str) {
        this.hillissueDate = str;
    }

    public final void setHillvalidFrom(String str) {
        this.hillvalidFrom = str;
    }

    public final void setHillvalidTo(String str) {
        this.hillvalidTo = str;
    }

    public final void setIdpcountryapplyfrom(String str) {
        this.idpcountryapplyfrom = str;
    }

    public final void setIndEmbName(String str) {
        this.indEmbName = str;
    }

    public final void setIscountryrestricted(String str) {
        this.iscountryrestricted = str;
    }

    public final void setMobileNumber(String str) {
        this.mobileNumber = str;
    }

    public final void setPassno(String str) {
        this.passno = str;
    }

    public final void setPassvaltill(String str) {
        this.passvaltill = str;
    }

    public final void setPerDistrict(String str) {
        this.perDistrict = str;
    }

    public final void setPerHouseNo(String str) {
        this.perHouseNo = str;
    }

    public final void setPerLocation(String str) {
        this.perLocation = str;
    }

    public final void setPerPinCode(String str) {
        this.perPinCode = str;
    }

    public final void setPerState(String str) {
        this.perState = str;
    }

    public final void setPerStreet(String str) {
        this.perStreet = str;
    }

    public final void setPerSubDistrict(String str) {
        this.perSubDistrict = str;
    }

    public final void setPermVillageOrTown(String str) {
        this.permVillageOrTown = str;
    }

    public final void setPofbirth(String str) {
        this.pofbirth = str;
    }

    public final void setPresDistrict(String str) {
        this.presDistrict = str;
    }

    public final void setPresHouseNo(String str) {
        this.presHouseNo = str;
    }

    public final void setPresLocation(String str) {
        this.presLocation = str;
    }

    public final void setPresPincode(String str) {
        this.presPincode = str;
    }

    public final void setPresState(String str) {
        this.presState = str;
    }

    public final void setPresStreet(String str) {
        this.presStreet = str;
    }

    public final void setPresSubDistrict(String str) {
        this.presSubDistrict = str;
    }

    public final void setPresVillageOrTown(String str) {
        this.presVillageOrTown = str;
    }

    public final void setRelFirstName(String str) {
        this.relFirstName = str;
    }

    public final void setRelLastName(String str) {
        this.relLastName = str;
    }

    public final void setRelationType(String str) {
        this.relationType = str;
    }

    public final void setRtoCodeDLTr(String str) {
        this.rtoCodeDLTr = str;
    }

    public final void setTovisit(String str) {
        this.tovisit = str;
    }

    public final void setVisano(String str) {
        this.visano = str;
    }

    public final void setVisavaltill(String str) {
        this.visavaltill = str;
    }

    public final void setWilltoDonateOrgans(String str) {
        this.willtoDonateOrgans = str;
    }

    public String toString() {
        return "CombineReq(agentId=" + this.agentId + ", agentPwd=" + this.agentPwd + ", agentIpAddress=" + this.agentIpAddress + ", agentServiceName=" + this.agentServiceName + ", dleDlReasonCode=" + this.dleDlReasonCode + ", dleDlReasonName=" + this.dleDlReasonName + ", applcatgDLserReq=" + this.applcatgDLserReq + ", dlHolderAltMobMum=" + this.dlHolderAltMobMum + ", dlno=" + this.dlno + ", dob=" + this.dob + ", rtoCodeDLTr=" + this.rtoCodeDLTr + ", willtoDonateOrgans=" + this.willtoDonateOrgans + ", relationType=" + this.relationType + ", conDlReasonCode=" + this.conDlReasonCode + ", conDlReasonName=" + this.conDlReasonName + ", dlHolderNaturalName=" + this.dlHolderNaturalName + ", conEffdate=" + this.conEffdate + ", applFirstName=" + this.applFirstName + ", applLastName=" + this.applLastName + ", relFirstName=" + this.relFirstName + ", relLastName=" + this.relLastName + ", mobileNumber=" + this.mobileNumber + ", changeOfAddReq=" + this.changeOfAddReq + ", perHouseNo=" + this.perHouseNo + ", perStreet=" + this.perStreet + ", perLocation=" + this.perLocation + ", permVillageOrTown=" + this.permVillageOrTown + ", perSubDistrict=" + this.perSubDistrict + ", perDistrict=" + this.perDistrict + ", perState=" + this.perState + ", perPinCode=" + this.perPinCode + ", presHouseNo=" + this.presHouseNo + ", presStreet=" + this.presStreet + ", presLocation=" + this.presLocation + ", presVillageOrTown=" + this.presVillageOrTown + ", presSubDistrict=" + this.presSubDistrict + ", presDistrict=" + this.presDistrict + ", presState=" + this.presState + ", presPincode=" + this.presPincode + ", dupDlReasonName=" + this.dupDlReasonName + ", dupDlReasonCode=" + this.dupDlReasonCode + ", applDateOfBirth=" + this.applDateOfBirth + ", codobDlReasonName=" + this.codobDlReasonName + ", codobDlReasonCode=" + this.codobDlReasonCode + ", declaringcheck=" + this.declaringcheck + ", hillcertificate=" + this.hillcertificate + ", hillissueDate=" + this.hillissueDate + ", hillvalidFrom=" + this.hillvalidFrom + ", hillvalidTo=" + this.hillvalidTo + ", hilldrivingschool=" + this.hilldrivingschool + ", hillissby=" + this.hillissby + ", pofbirth=" + this.pofbirth + ", country=" + this.country + ", passno=" + this.passno + ", passvaltill=" + this.passvaltill + ", visano=" + this.visano + ", visavaltill=" + this.visavaltill + ", tovisit=" + this.tovisit + ", iscountryrestricted=" + this.iscountryrestricted + ", countryRestrictedReason=" + this.countryRestrictedReason + ", isDlSerdisqualified=" + this.isDlSerdisqualified + ", dlSerdisqualifiedReason=" + this.dlSerdisqualifiedReason + ", forAdd1=" + this.forAdd1 + ", forAdd2=" + this.forAdd2 + ", forAdd3=" + this.forAdd3 + ", forAddPinCode=" + this.forAddPinCode + ", forNationMobNum=" + this.forNationMobNum + ", emailID=" + this.emailID + ", appliedIdpfromIndEmb=" + this.appliedIdpfromIndEmb + ", indEmbName=" + this.indEmbName + ", embPlace=" + this.embPlace + ", dateOfVerifEmb=" + this.dateOfVerifEmb + ", embEndorseNo=" + this.embEndorseNo + ", idpcountryapplyfrom=" + this.idpcountryapplyfrom + ')';
    }

    public CombineReq(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Integer num, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58, String str59, String str60, String str61, String str62, String str63, String str64, String str65, String str66, String str67, String str68, String str69, String str70, String str71, String str72, String str73) {
        this.agentId = str;
        this.agentPwd = str2;
        this.agentIpAddress = str3;
        this.agentServiceName = str4;
        this.dleDlReasonCode = str5;
        this.dleDlReasonName = str6;
        this.applcatgDLserReq = str7;
        this.dlHolderAltMobMum = str8;
        this.dlno = str9;
        this.dob = str10;
        this.rtoCodeDLTr = str11;
        this.willtoDonateOrgans = str12;
        this.relationType = str13;
        this.conDlReasonCode = num;
        this.conDlReasonName = str14;
        this.dlHolderNaturalName = str15;
        this.conEffdate = str16;
        this.applFirstName = str17;
        this.applLastName = str18;
        this.relFirstName = str19;
        this.relLastName = str20;
        this.mobileNumber = str21;
        this.changeOfAddReq = str22;
        this.perHouseNo = str23;
        this.perStreet = str24;
        this.perLocation = str25;
        this.permVillageOrTown = str26;
        this.perSubDistrict = str27;
        this.perDistrict = str28;
        this.perState = str29;
        this.perPinCode = str30;
        this.presHouseNo = str31;
        this.presStreet = str32;
        this.presLocation = str33;
        this.presVillageOrTown = str34;
        this.presSubDistrict = str35;
        this.presDistrict = str36;
        this.presState = str37;
        this.presPincode = str38;
        this.dupDlReasonName = str39;
        this.dupDlReasonCode = str40;
        this.applDateOfBirth = str41;
        this.codobDlReasonName = str42;
        this.codobDlReasonCode = str43;
        this.declaringcheck = str44;
        this.hillcertificate = str45;
        this.hillissueDate = str46;
        this.hillvalidFrom = str47;
        this.hillvalidTo = str48;
        this.hilldrivingschool = str49;
        this.hillissby = str50;
        this.pofbirth = str51;
        this.country = str52;
        this.passno = str53;
        this.passvaltill = str54;
        this.visano = str55;
        this.visavaltill = str56;
        this.tovisit = str57;
        this.iscountryrestricted = str58;
        this.countryRestrictedReason = str59;
        this.isDlSerdisqualified = str60;
        this.dlSerdisqualifiedReason = str61;
        this.forAdd1 = str62;
        this.forAdd2 = str63;
        this.forAdd3 = str64;
        this.forAddPinCode = str65;
        this.forNationMobNum = str66;
        this.emailID = str67;
        this.appliedIdpfromIndEmb = str68;
        this.indEmbName = str69;
        this.embPlace = str70;
        this.dateOfVerifEmb = str71;
        this.embEndorseNo = str72;
        this.idpcountryapplyfrom = str73;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CombineReq(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Integer num, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58, String str59, String str60, String str61, String str62, String str63, String str64, String str65, String str66, String str67, String str68, String str69, String str70, String str71, String str72, String str73, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        String str74 = (i & 1) != 0 ? "" : str;
        String str75 = (i & 2) != 0 ? "" : str2;
        String str76 = (i & 4) != 0 ? "" : str3;
        String str77 = (i & 8) != 0 ? "" : str4;
        String str78 = (i & 16) != 0 ? "" : str5;
        String str79 = (i & 32) != 0 ? "" : str6;
        String str80 = (i & 64) != 0 ? "" : str7;
        String str81 = (i & 128) != 0 ? "" : str8;
        String str82 = (i & 256) != 0 ? "" : str9;
        String str83 = (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? "" : str10;
        String str84 = (i & 1024) != 0 ? "" : str11;
        String str85 = (i & 2048) != 0 ? "" : str12;
        String str86 = (i & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? "" : str13;
        Integer num2 = (i & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? -1 : num;
        String str87 = (i & 16384) != 0 ? "" : str14;
        String str88 = (i & 32768) != 0 ? "" : str15;
        String str89 = (i & 65536) != 0 ? "" : str16;
        String str90 = (i & 131072) != 0 ? "" : str17;
        String str91 = (i & 262144) != 0 ? "" : str18;
        String str92 = (i & 524288) != 0 ? "" : str19;
        String str93 = (i & 1048576) != 0 ? "" : str20;
        String str94 = (i & 2097152) != 0 ? "" : str21;
        String str95 = (i & 4194304) != 0 ? "" : str22;
        String str96 = (i & 8388608) != 0 ? "" : str23;
        String str97 = (i & 16777216) != 0 ? "" : str24;
        String str98 = (i & 33554432) != 0 ? "" : str25;
        String str99 = (i & 67108864) != 0 ? "" : str26;
        String str100 = (i & 134217728) != 0 ? "" : str27;
        String str101 = (i & 268435456) != 0 ? "" : str28;
        String str102 = (i & 536870912) != 0 ? "" : str29;
        String str103 = (i & 1073741824) != 0 ? "" : str30;
        String str104 = (i & IntCompanionObject.MIN_VALUE) != 0 ? "" : str31;
        this(str74, str75, str76, str77, str78, str79, str80, str81, str82, str83, str84, str85, str86, num2, str87, str88, str89, str90, str91, str92, str93, str94, str95, str96, str97, str98, str99, str100, str101, str102, str103, str104, (i2 & 1) != 0 ? "" : str32, (i2 & 2) != 0 ? "" : str33, (i2 & 4) != 0 ? "" : str34, (i2 & 8) != 0 ? "" : str35, (i2 & 16) != 0 ? "" : str36, (i2 & 32) != 0 ? "" : str37, (i2 & 64) != 0 ? "" : str38, (i2 & 128) != 0 ? "" : str39, (i2 & 256) != 0 ? "" : str40, (i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? "" : str41, (i2 & 1024) != 0 ? "" : str42, (i2 & 2048) != 0 ? "" : str43, (i2 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? "" : str44, (i2 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? "" : str45, (i2 & 16384) != 0 ? "" : str46, (i2 & 32768) != 0 ? "" : str47, (i2 & 65536) != 0 ? "" : str48, (i2 & 131072) != 0 ? "" : str49, (i2 & 262144) != 0 ? "" : str50, (i2 & 524288) != 0 ? "" : str51, (i2 & 1048576) != 0 ? "" : str52, (i2 & 2097152) != 0 ? "" : str53, (i2 & 4194304) != 0 ? "" : str54, (i2 & 8388608) != 0 ? "" : str55, (i2 & 16777216) != 0 ? "" : str56, (i2 & 33554432) != 0 ? "" : str57, (i2 & 67108864) != 0 ? "" : str58, (i2 & 134217728) != 0 ? "" : str59, (i2 & 268435456) != 0 ? "" : str60, (i2 & 536870912) != 0 ? "" : str61, (i2 & 1073741824) != 0 ? "" : str62, (i2 & IntCompanionObject.MIN_VALUE) != 0 ? "" : str63, (i3 & 1) != 0 ? "" : str64, (i3 & 2) != 0 ? "" : str65, (i3 & 4) != 0 ? "" : str66, (i3 & 8) != 0 ? "" : str67, (i3 & 16) != 0 ? "" : str68, (i3 & 32) != 0 ? "" : str69, (i3 & 64) != 0 ? "" : str70, (i3 & 128) != 0 ? "" : str71, (i3 & 256) != 0 ? "" : str72, (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? "" : str73);
    }
}
