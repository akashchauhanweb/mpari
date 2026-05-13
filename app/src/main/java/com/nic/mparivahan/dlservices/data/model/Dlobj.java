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
@Metadata(d1 = {"\u0000)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0003\b¥\u0001\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0005\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u00106\u001a\u00020\u0005\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010:J\u000b\u0010s\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u0086\u0001\u001a\u00020\u0005HÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010 \u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010¡\u0001\u001a\u00020\u0005HÆ\u0003J\f\u0010¢\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010£\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¤\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010¥\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¦\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010§\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010¨\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u008e\u0005\u0010©\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00052\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u00106\u001a\u00020\u00052\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0016\u0010ª\u0001\u001a\u00030«\u00012\t\u0010¬\u0001\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\u000b\u0010\u00ad\u0001\u001a\u00030®\u0001HÖ\u0001J\n\u0010¯\u0001\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0013\u00104\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b=\u0010<R\u0013\u00101\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u0010?R\u0013\u0010,\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u0010?R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010?R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u0010?R\u0013\u00105\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u0010?R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bE\u0010<R\u0013\u0010&\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bF\u0010<R\u0013\u0010+\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bG\u0010<R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bH\u0010<R\u0013\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bI\u0010?R\u0013\u0010/\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010?R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bK\u0010?R\u0013\u0010$\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bL\u0010?R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bM\u0010?R\u0013\u0010%\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bN\u0010?R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bO\u0010?R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bP\u0010?R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010?R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bR\u0010<R\u0013\u0010-\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bS\u0010?R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bT\u0010<R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bU\u0010<R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bV\u0010<R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bW\u0010<R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bX\u0010?R\u0013\u00109\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bY\u0010<R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010<R\u0013\u00102\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b[\u0010<R\u0013\u00103\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010<R\u0013\u0010!\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b]\u0010<R\u0013\u0010 \u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b^\u0010<R\u0013\u00107\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b_\u0010<R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b`\u0010<R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\ba\u0010?R\u0013\u0010'\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bb\u0010<R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bc\u0010?R\u0011\u00106\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bd\u0010<R\u0013\u00100\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\be\u0010?R\u0011\u0010\u001e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bf\u0010<R\u0013\u0010*\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bg\u0010<R\u0013\u00108\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bh\u0010?R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bi\u0010?R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bj\u0010?R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bk\u0010<R\u0013\u0010(\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bl\u0010<R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bm\u0010<R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bn\u0010<R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bo\u0010<R\u0013\u0010.\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bp\u0010<R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bq\u0010<R\u0013\u0010)\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\br\u0010<¨\u0006°\u0001"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/Dlobj;", "Ljava/io/Serializable;", "enforceFromDate", "", "dlLicno", "", "dlDispatchStatus", "omRtoFullname", "dlTokenId", "dlStateCode", "enforceRemark", "dlIssueauth", "stateName", "dlBioId", "dlAuthNo", "dlNtValdtoDate", "dlHzValdtoDt", "dlLatestTrcode", "omOfficeTownname", "dlInvcrgNo", "dlIssuedt", "dlAuthDt", "dlHlValdtoDate", "dlEndorseno", "bioid", "olacode", "dlOldLicno", "dlHzValdfrDt", "dlIssueDate", "enforceEndDate", "dlTrValdtoDt", "dlSeqno", "dlRemarks", "dlRecGenesis", "dlNtValdfrDt", "dlEndorsetime", "dlHlValdtoDt", "dlHzValdtoDate", "dlEndorseAuth", "dlStatus", "olaName", "statecd", "dlUsid", "dlEndorsedt", "dlAuthIssauth", "dlIssuedesig", "omRtoShortname", "dlHlValdfrDt", "dlTrValdtoDate", "dlAuthCov", "dlPrintDate", "dlPrintStatus", "dlApplno", "dlDigest", "dlTrValdfrDt", "dlRtoCode", "dlolaCode", "dlNtValdtoDt", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V", "getBioid", "()Ljava/lang/String;", "getDlApplno", "getDlAuthCov", "()Ljava/lang/Object;", "getDlAuthDt", "getDlAuthIssauth", "getDlAuthNo", "getDlBioId", "getDlDigest", "getDlDispatchStatus", "getDlEndorseAuth", "getDlEndorsedt", "getDlEndorseno", "getDlEndorsetime", "getDlHlValdfrDt", "getDlHlValdtoDate", "getDlHlValdtoDt", "getDlHzValdfrDt", "getDlHzValdtoDate", "getDlHzValdtoDt", "getDlInvcrgNo", "getDlIssueDate", "getDlIssueauth", "getDlIssuedesig", "getDlIssuedt", "getDlLatestTrcode", "getDlLicno", "getDlNtValdfrDt", "getDlNtValdtoDate", "getDlNtValdtoDt", "getDlOldLicno", "getDlPrintDate", "getDlPrintStatus", "getDlRecGenesis", "getDlRemarks", "getDlRtoCode", "getDlSeqno", "getDlStateCode", "getDlStatus", "getDlTokenId", "getDlTrValdfrDt", "getDlTrValdtoDate", "getDlTrValdtoDt", "getDlUsid", "getDlolaCode", "getEnforceEndDate", "getEnforceFromDate", "getEnforceRemark", "getOlaName", "getOlacode", "getOmOfficeTownname", "getOmRtoFullname", "getOmRtoShortname", "getStateName", "getStatecd", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Dlobj implements Serializable {
    private final String bioid;
    private final String dlApplno;
    private final Object dlAuthCov;
    private final Object dlAuthDt;
    private final Object dlAuthIssauth;
    private final Object dlAuthNo;
    private final Object dlBioId;
    private final Object dlDigest;
    private final String dlDispatchStatus;
    private final String dlEndorseAuth;
    private final String dlEndorsedt;
    private final String dlEndorseno;
    private final Object dlEndorsetime;
    private final Object dlHlValdfrDt;
    private final Object dlHlValdtoDate;
    private final Object dlHlValdtoDt;
    private final Object dlHzValdfrDt;
    private final Object dlHzValdtoDate;
    private final Object dlHzValdtoDt;
    private final Object dlInvcrgNo;
    private final Object dlIssueDate;
    private final String dlIssueauth;
    private final Object dlIssuedesig;
    private final String dlIssuedt;
    private final String dlLatestTrcode;
    private final String dlLicno;
    private final String dlNtValdfrDt;
    private final Object dlNtValdtoDate;
    private final String dlNtValdtoDt;
    private final String dlOldLicno;
    private final String dlPrintDate;
    private final String dlPrintStatus;
    private final String dlRecGenesis;
    private final String dlRemarks;
    private final String dlRtoCode;
    private final String dlSeqno;
    private final Object dlStateCode;
    private final String dlStatus;
    private final Object dlTokenId;
    private final String dlTrValdfrDt;
    private final Object dlTrValdtoDate;
    private final String dlTrValdtoDt;
    private final String dlUsid;
    private final Object dlolaCode;
    private final Object enforceEndDate;
    private final Object enforceFromDate;
    private final String enforceRemark;
    private final String olaName;
    private final String olacode;
    private final String omOfficeTownname;
    private final String omRtoFullname;
    private final String omRtoShortname;
    private final String stateName;
    private final String statecd;

    public Dlobj() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 4194303, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Object getEnforceFromDate() {
        return this.enforceFromDate;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Object getDlBioId() {
        return this.dlBioId;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Object getDlAuthNo() {
        return this.dlAuthNo;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Object getDlNtValdtoDate() {
        return this.dlNtValdtoDate;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Object getDlHzValdtoDt() {
        return this.dlHzValdtoDt;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getDlLatestTrcode() {
        return this.dlLatestTrcode;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getOmOfficeTownname() {
        return this.omOfficeTownname;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Object getDlInvcrgNo() {
        return this.dlInvcrgNo;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getDlIssuedt() {
        return this.dlIssuedt;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Object getDlAuthDt() {
        return this.dlAuthDt;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Object getDlHlValdtoDate() {
        return this.dlHlValdtoDate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDlLicno() {
        return this.dlLicno;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getDlEndorseno() {
        return this.dlEndorseno;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getBioid() {
        return this.bioid;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getOlacode() {
        return this.olacode;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getDlOldLicno() {
        return this.dlOldLicno;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Object getDlHzValdfrDt() {
        return this.dlHzValdfrDt;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Object getDlIssueDate() {
        return this.dlIssueDate;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final Object getEnforceEndDate() {
        return this.enforceEndDate;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getDlTrValdtoDt() {
        return this.dlTrValdtoDt;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getDlSeqno() {
        return this.dlSeqno;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getDlRemarks() {
        return this.dlRemarks;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDlDispatchStatus() {
        return this.dlDispatchStatus;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getDlRecGenesis() {
        return this.dlRecGenesis;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getDlNtValdfrDt() {
        return this.dlNtValdfrDt;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final Object getDlEndorsetime() {
        return this.dlEndorsetime;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final Object getDlHlValdtoDt() {
        return this.dlHlValdtoDt;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final Object getDlHzValdtoDate() {
        return this.dlHzValdtoDate;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final String getDlEndorseAuth() {
        return this.dlEndorseAuth;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final String getDlStatus() {
        return this.dlStatus;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final String getOlaName() {
        return this.olaName;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final String getStatecd() {
        return this.statecd;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final String getDlUsid() {
        return this.dlUsid;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOmRtoFullname() {
        return this.omRtoFullname;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final String getDlEndorsedt() {
        return this.dlEndorsedt;
    }

    /* JADX INFO: renamed from: component41, reason: from getter */
    public final Object getDlAuthIssauth() {
        return this.dlAuthIssauth;
    }

    /* JADX INFO: renamed from: component42, reason: from getter */
    public final Object getDlIssuedesig() {
        return this.dlIssuedesig;
    }

    /* JADX INFO: renamed from: component43, reason: from getter */
    public final String getOmRtoShortname() {
        return this.omRtoShortname;
    }

    /* JADX INFO: renamed from: component44, reason: from getter */
    public final Object getDlHlValdfrDt() {
        return this.dlHlValdfrDt;
    }

    /* JADX INFO: renamed from: component45, reason: from getter */
    public final Object getDlTrValdtoDate() {
        return this.dlTrValdtoDate;
    }

    /* JADX INFO: renamed from: component46, reason: from getter */
    public final Object getDlAuthCov() {
        return this.dlAuthCov;
    }

    /* JADX INFO: renamed from: component47, reason: from getter */
    public final String getDlPrintDate() {
        return this.dlPrintDate;
    }

    /* JADX INFO: renamed from: component48, reason: from getter */
    public final String getDlPrintStatus() {
        return this.dlPrintStatus;
    }

    /* JADX INFO: renamed from: component49, reason: from getter */
    public final String getDlApplno() {
        return this.dlApplno;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Object getDlTokenId() {
        return this.dlTokenId;
    }

    /* JADX INFO: renamed from: component50, reason: from getter */
    public final Object getDlDigest() {
        return this.dlDigest;
    }

    /* JADX INFO: renamed from: component51, reason: from getter */
    public final String getDlTrValdfrDt() {
        return this.dlTrValdfrDt;
    }

    /* JADX INFO: renamed from: component52, reason: from getter */
    public final String getDlRtoCode() {
        return this.dlRtoCode;
    }

    /* JADX INFO: renamed from: component53, reason: from getter */
    public final Object getDlolaCode() {
        return this.dlolaCode;
    }

    /* JADX INFO: renamed from: component54, reason: from getter */
    public final String getDlNtValdtoDt() {
        return this.dlNtValdtoDt;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Object getDlStateCode() {
        return this.dlStateCode;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getEnforceRemark() {
        return this.enforceRemark;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDlIssueauth() {
        return this.dlIssueauth;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getStateName() {
        return this.stateName;
    }

    public final Dlobj copy(Object enforceFromDate, String dlLicno, String dlDispatchStatus, String omRtoFullname, Object dlTokenId, Object dlStateCode, String enforceRemark, String dlIssueauth, String stateName, Object dlBioId, Object dlAuthNo, Object dlNtValdtoDate, Object dlHzValdtoDt, String dlLatestTrcode, String omOfficeTownname, Object dlInvcrgNo, String dlIssuedt, Object dlAuthDt, Object dlHlValdtoDate, String dlEndorseno, String bioid, String olacode, String dlOldLicno, Object dlHzValdfrDt, Object dlIssueDate, Object enforceEndDate, String dlTrValdtoDt, String dlSeqno, String dlRemarks, String dlRecGenesis, String dlNtValdfrDt, Object dlEndorsetime, Object dlHlValdtoDt, Object dlHzValdtoDate, String dlEndorseAuth, String dlStatus, String olaName, String statecd, String dlUsid, String dlEndorsedt, Object dlAuthIssauth, Object dlIssuedesig, String omRtoShortname, Object dlHlValdfrDt, Object dlTrValdtoDate, Object dlAuthCov, String dlPrintDate, String dlPrintStatus, String dlApplno, Object dlDigest, String dlTrValdfrDt, String dlRtoCode, Object dlolaCode, String dlNtValdtoDt) {
        Intrinsics.checkNotNullParameter(dlTrValdtoDt, "dlTrValdtoDt");
        Intrinsics.checkNotNullParameter(dlTrValdfrDt, "dlTrValdfrDt");
        return new Dlobj(enforceFromDate, dlLicno, dlDispatchStatus, omRtoFullname, dlTokenId, dlStateCode, enforceRemark, dlIssueauth, stateName, dlBioId, dlAuthNo, dlNtValdtoDate, dlHzValdtoDt, dlLatestTrcode, omOfficeTownname, dlInvcrgNo, dlIssuedt, dlAuthDt, dlHlValdtoDate, dlEndorseno, bioid, olacode, dlOldLicno, dlHzValdfrDt, dlIssueDate, enforceEndDate, dlTrValdtoDt, dlSeqno, dlRemarks, dlRecGenesis, dlNtValdfrDt, dlEndorsetime, dlHlValdtoDt, dlHzValdtoDate, dlEndorseAuth, dlStatus, olaName, statecd, dlUsid, dlEndorsedt, dlAuthIssauth, dlIssuedesig, omRtoShortname, dlHlValdfrDt, dlTrValdtoDate, dlAuthCov, dlPrintDate, dlPrintStatus, dlApplno, dlDigest, dlTrValdfrDt, dlRtoCode, dlolaCode, dlNtValdtoDt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Dlobj)) {
            return false;
        }
        Dlobj dlobj = (Dlobj) other;
        return Intrinsics.areEqual(this.enforceFromDate, dlobj.enforceFromDate) && Intrinsics.areEqual(this.dlLicno, dlobj.dlLicno) && Intrinsics.areEqual(this.dlDispatchStatus, dlobj.dlDispatchStatus) && Intrinsics.areEqual(this.omRtoFullname, dlobj.omRtoFullname) && Intrinsics.areEqual(this.dlTokenId, dlobj.dlTokenId) && Intrinsics.areEqual(this.dlStateCode, dlobj.dlStateCode) && Intrinsics.areEqual(this.enforceRemark, dlobj.enforceRemark) && Intrinsics.areEqual(this.dlIssueauth, dlobj.dlIssueauth) && Intrinsics.areEqual(this.stateName, dlobj.stateName) && Intrinsics.areEqual(this.dlBioId, dlobj.dlBioId) && Intrinsics.areEqual(this.dlAuthNo, dlobj.dlAuthNo) && Intrinsics.areEqual(this.dlNtValdtoDate, dlobj.dlNtValdtoDate) && Intrinsics.areEqual(this.dlHzValdtoDt, dlobj.dlHzValdtoDt) && Intrinsics.areEqual(this.dlLatestTrcode, dlobj.dlLatestTrcode) && Intrinsics.areEqual(this.omOfficeTownname, dlobj.omOfficeTownname) && Intrinsics.areEqual(this.dlInvcrgNo, dlobj.dlInvcrgNo) && Intrinsics.areEqual(this.dlIssuedt, dlobj.dlIssuedt) && Intrinsics.areEqual(this.dlAuthDt, dlobj.dlAuthDt) && Intrinsics.areEqual(this.dlHlValdtoDate, dlobj.dlHlValdtoDate) && Intrinsics.areEqual(this.dlEndorseno, dlobj.dlEndorseno) && Intrinsics.areEqual(this.bioid, dlobj.bioid) && Intrinsics.areEqual(this.olacode, dlobj.olacode) && Intrinsics.areEqual(this.dlOldLicno, dlobj.dlOldLicno) && Intrinsics.areEqual(this.dlHzValdfrDt, dlobj.dlHzValdfrDt) && Intrinsics.areEqual(this.dlIssueDate, dlobj.dlIssueDate) && Intrinsics.areEqual(this.enforceEndDate, dlobj.enforceEndDate) && Intrinsics.areEqual(this.dlTrValdtoDt, dlobj.dlTrValdtoDt) && Intrinsics.areEqual(this.dlSeqno, dlobj.dlSeqno) && Intrinsics.areEqual(this.dlRemarks, dlobj.dlRemarks) && Intrinsics.areEqual(this.dlRecGenesis, dlobj.dlRecGenesis) && Intrinsics.areEqual(this.dlNtValdfrDt, dlobj.dlNtValdfrDt) && Intrinsics.areEqual(this.dlEndorsetime, dlobj.dlEndorsetime) && Intrinsics.areEqual(this.dlHlValdtoDt, dlobj.dlHlValdtoDt) && Intrinsics.areEqual(this.dlHzValdtoDate, dlobj.dlHzValdtoDate) && Intrinsics.areEqual(this.dlEndorseAuth, dlobj.dlEndorseAuth) && Intrinsics.areEqual(this.dlStatus, dlobj.dlStatus) && Intrinsics.areEqual(this.olaName, dlobj.olaName) && Intrinsics.areEqual(this.statecd, dlobj.statecd) && Intrinsics.areEqual(this.dlUsid, dlobj.dlUsid) && Intrinsics.areEqual(this.dlEndorsedt, dlobj.dlEndorsedt) && Intrinsics.areEqual(this.dlAuthIssauth, dlobj.dlAuthIssauth) && Intrinsics.areEqual(this.dlIssuedesig, dlobj.dlIssuedesig) && Intrinsics.areEqual(this.omRtoShortname, dlobj.omRtoShortname) && Intrinsics.areEqual(this.dlHlValdfrDt, dlobj.dlHlValdfrDt) && Intrinsics.areEqual(this.dlTrValdtoDate, dlobj.dlTrValdtoDate) && Intrinsics.areEqual(this.dlAuthCov, dlobj.dlAuthCov) && Intrinsics.areEqual(this.dlPrintDate, dlobj.dlPrintDate) && Intrinsics.areEqual(this.dlPrintStatus, dlobj.dlPrintStatus) && Intrinsics.areEqual(this.dlApplno, dlobj.dlApplno) && Intrinsics.areEqual(this.dlDigest, dlobj.dlDigest) && Intrinsics.areEqual(this.dlTrValdfrDt, dlobj.dlTrValdfrDt) && Intrinsics.areEqual(this.dlRtoCode, dlobj.dlRtoCode) && Intrinsics.areEqual(this.dlolaCode, dlobj.dlolaCode) && Intrinsics.areEqual(this.dlNtValdtoDt, dlobj.dlNtValdtoDt);
    }

    public final String getBioid() {
        return this.bioid;
    }

    public final String getDlApplno() {
        return this.dlApplno;
    }

    public final Object getDlAuthCov() {
        return this.dlAuthCov;
    }

    public final Object getDlAuthDt() {
        return this.dlAuthDt;
    }

    public final Object getDlAuthIssauth() {
        return this.dlAuthIssauth;
    }

    public final Object getDlAuthNo() {
        return this.dlAuthNo;
    }

    public final Object getDlBioId() {
        return this.dlBioId;
    }

    public final Object getDlDigest() {
        return this.dlDigest;
    }

    public final String getDlDispatchStatus() {
        return this.dlDispatchStatus;
    }

    public final String getDlEndorseAuth() {
        return this.dlEndorseAuth;
    }

    public final String getDlEndorsedt() {
        return this.dlEndorsedt;
    }

    public final String getDlEndorseno() {
        return this.dlEndorseno;
    }

    public final Object getDlEndorsetime() {
        return this.dlEndorsetime;
    }

    public final Object getDlHlValdfrDt() {
        return this.dlHlValdfrDt;
    }

    public final Object getDlHlValdtoDate() {
        return this.dlHlValdtoDate;
    }

    public final Object getDlHlValdtoDt() {
        return this.dlHlValdtoDt;
    }

    public final Object getDlHzValdfrDt() {
        return this.dlHzValdfrDt;
    }

    public final Object getDlHzValdtoDate() {
        return this.dlHzValdtoDate;
    }

    public final Object getDlHzValdtoDt() {
        return this.dlHzValdtoDt;
    }

    public final Object getDlInvcrgNo() {
        return this.dlInvcrgNo;
    }

    public final Object getDlIssueDate() {
        return this.dlIssueDate;
    }

    public final String getDlIssueauth() {
        return this.dlIssueauth;
    }

    public final Object getDlIssuedesig() {
        return this.dlIssuedesig;
    }

    public final String getDlIssuedt() {
        return this.dlIssuedt;
    }

    public final String getDlLatestTrcode() {
        return this.dlLatestTrcode;
    }

    public final String getDlLicno() {
        return this.dlLicno;
    }

    public final String getDlNtValdfrDt() {
        return this.dlNtValdfrDt;
    }

    public final Object getDlNtValdtoDate() {
        return this.dlNtValdtoDate;
    }

    public final String getDlNtValdtoDt() {
        return this.dlNtValdtoDt;
    }

    public final String getDlOldLicno() {
        return this.dlOldLicno;
    }

    public final String getDlPrintDate() {
        return this.dlPrintDate;
    }

    public final String getDlPrintStatus() {
        return this.dlPrintStatus;
    }

    public final String getDlRecGenesis() {
        return this.dlRecGenesis;
    }

    public final String getDlRemarks() {
        return this.dlRemarks;
    }

    public final String getDlRtoCode() {
        return this.dlRtoCode;
    }

    public final String getDlSeqno() {
        return this.dlSeqno;
    }

    public final Object getDlStateCode() {
        return this.dlStateCode;
    }

    public final String getDlStatus() {
        return this.dlStatus;
    }

    public final Object getDlTokenId() {
        return this.dlTokenId;
    }

    public final String getDlTrValdfrDt() {
        return this.dlTrValdfrDt;
    }

    public final Object getDlTrValdtoDate() {
        return this.dlTrValdtoDate;
    }

    public final String getDlTrValdtoDt() {
        return this.dlTrValdtoDt;
    }

    public final String getDlUsid() {
        return this.dlUsid;
    }

    public final Object getDlolaCode() {
        return this.dlolaCode;
    }

    public final Object getEnforceEndDate() {
        return this.enforceEndDate;
    }

    public final Object getEnforceFromDate() {
        return this.enforceFromDate;
    }

    public final String getEnforceRemark() {
        return this.enforceRemark;
    }

    public final String getOlaName() {
        return this.olaName;
    }

    public final String getOlacode() {
        return this.olacode;
    }

    public final String getOmOfficeTownname() {
        return this.omOfficeTownname;
    }

    public final String getOmRtoFullname() {
        return this.omRtoFullname;
    }

    public final String getOmRtoShortname() {
        return this.omRtoShortname;
    }

    public final String getStateName() {
        return this.stateName;
    }

    public final String getStatecd() {
        return this.statecd;
    }

    public int hashCode() {
        Object obj = this.enforceFromDate;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        String str = this.dlLicno;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.dlDispatchStatus;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.omRtoFullname;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Object obj2 = this.dlTokenId;
        int iHashCode5 = (iHashCode4 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.dlStateCode;
        int iHashCode6 = (iHashCode5 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        String str4 = this.enforceRemark;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.dlIssueauth;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.stateName;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Object obj4 = this.dlBioId;
        int iHashCode10 = (iHashCode9 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        Object obj5 = this.dlAuthNo;
        int iHashCode11 = (iHashCode10 + (obj5 == null ? 0 : obj5.hashCode())) * 31;
        Object obj6 = this.dlNtValdtoDate;
        int iHashCode12 = (iHashCode11 + (obj6 == null ? 0 : obj6.hashCode())) * 31;
        Object obj7 = this.dlHzValdtoDt;
        int iHashCode13 = (iHashCode12 + (obj7 == null ? 0 : obj7.hashCode())) * 31;
        String str7 = this.dlLatestTrcode;
        int iHashCode14 = (iHashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.omOfficeTownname;
        int iHashCode15 = (iHashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Object obj8 = this.dlInvcrgNo;
        int iHashCode16 = (iHashCode15 + (obj8 == null ? 0 : obj8.hashCode())) * 31;
        String str9 = this.dlIssuedt;
        int iHashCode17 = (iHashCode16 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Object obj9 = this.dlAuthDt;
        int iHashCode18 = (iHashCode17 + (obj9 == null ? 0 : obj9.hashCode())) * 31;
        Object obj10 = this.dlHlValdtoDate;
        int iHashCode19 = (iHashCode18 + (obj10 == null ? 0 : obj10.hashCode())) * 31;
        String str10 = this.dlEndorseno;
        int iHashCode20 = (iHashCode19 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.bioid;
        int iHashCode21 = (iHashCode20 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.olacode;
        int iHashCode22 = (iHashCode21 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.dlOldLicno;
        int iHashCode23 = (iHashCode22 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Object obj11 = this.dlHzValdfrDt;
        int iHashCode24 = (iHashCode23 + (obj11 == null ? 0 : obj11.hashCode())) * 31;
        Object obj12 = this.dlIssueDate;
        int iHashCode25 = (iHashCode24 + (obj12 == null ? 0 : obj12.hashCode())) * 31;
        Object obj13 = this.enforceEndDate;
        int iHashCode26 = (((iHashCode25 + (obj13 == null ? 0 : obj13.hashCode())) * 31) + this.dlTrValdtoDt.hashCode()) * 31;
        String str14 = this.dlSeqno;
        int iHashCode27 = (iHashCode26 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.dlRemarks;
        int iHashCode28 = (iHashCode27 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.dlRecGenesis;
        int iHashCode29 = (iHashCode28 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.dlNtValdfrDt;
        int iHashCode30 = (iHashCode29 + (str17 == null ? 0 : str17.hashCode())) * 31;
        Object obj14 = this.dlEndorsetime;
        int iHashCode31 = (iHashCode30 + (obj14 == null ? 0 : obj14.hashCode())) * 31;
        Object obj15 = this.dlHlValdtoDt;
        int iHashCode32 = (iHashCode31 + (obj15 == null ? 0 : obj15.hashCode())) * 31;
        Object obj16 = this.dlHzValdtoDate;
        int iHashCode33 = (iHashCode32 + (obj16 == null ? 0 : obj16.hashCode())) * 31;
        String str18 = this.dlEndorseAuth;
        int iHashCode34 = (iHashCode33 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.dlStatus;
        int iHashCode35 = (iHashCode34 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.olaName;
        int iHashCode36 = (iHashCode35 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.statecd;
        int iHashCode37 = (iHashCode36 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.dlUsid;
        int iHashCode38 = (iHashCode37 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.dlEndorsedt;
        int iHashCode39 = (iHashCode38 + (str23 == null ? 0 : str23.hashCode())) * 31;
        Object obj17 = this.dlAuthIssauth;
        int iHashCode40 = (iHashCode39 + (obj17 == null ? 0 : obj17.hashCode())) * 31;
        Object obj18 = this.dlIssuedesig;
        int iHashCode41 = (iHashCode40 + (obj18 == null ? 0 : obj18.hashCode())) * 31;
        String str24 = this.omRtoShortname;
        int iHashCode42 = (iHashCode41 + (str24 == null ? 0 : str24.hashCode())) * 31;
        Object obj19 = this.dlHlValdfrDt;
        int iHashCode43 = (iHashCode42 + (obj19 == null ? 0 : obj19.hashCode())) * 31;
        Object obj20 = this.dlTrValdtoDate;
        int iHashCode44 = (iHashCode43 + (obj20 == null ? 0 : obj20.hashCode())) * 31;
        Object obj21 = this.dlAuthCov;
        int iHashCode45 = (iHashCode44 + (obj21 == null ? 0 : obj21.hashCode())) * 31;
        String str25 = this.dlPrintDate;
        int iHashCode46 = (iHashCode45 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.dlPrintStatus;
        int iHashCode47 = (iHashCode46 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.dlApplno;
        int iHashCode48 = (iHashCode47 + (str27 == null ? 0 : str27.hashCode())) * 31;
        Object obj22 = this.dlDigest;
        int iHashCode49 = (((iHashCode48 + (obj22 == null ? 0 : obj22.hashCode())) * 31) + this.dlTrValdfrDt.hashCode()) * 31;
        String str28 = this.dlRtoCode;
        int iHashCode50 = (iHashCode49 + (str28 == null ? 0 : str28.hashCode())) * 31;
        Object obj23 = this.dlolaCode;
        int iHashCode51 = (iHashCode50 + (obj23 == null ? 0 : obj23.hashCode())) * 31;
        String str29 = this.dlNtValdtoDt;
        return iHashCode51 + (str29 != null ? str29.hashCode() : 0);
    }

    public String toString() {
        return "Dlobj(enforceFromDate=" + this.enforceFromDate + ", dlLicno=" + this.dlLicno + ", dlDispatchStatus=" + this.dlDispatchStatus + ", omRtoFullname=" + this.omRtoFullname + ", dlTokenId=" + this.dlTokenId + ", dlStateCode=" + this.dlStateCode + ", enforceRemark=" + this.enforceRemark + ", dlIssueauth=" + this.dlIssueauth + ", stateName=" + this.stateName + ", dlBioId=" + this.dlBioId + ", dlAuthNo=" + this.dlAuthNo + ", dlNtValdtoDate=" + this.dlNtValdtoDate + ", dlHzValdtoDt=" + this.dlHzValdtoDt + ", dlLatestTrcode=" + this.dlLatestTrcode + ", omOfficeTownname=" + this.omOfficeTownname + ", dlInvcrgNo=" + this.dlInvcrgNo + ", dlIssuedt=" + this.dlIssuedt + ", dlAuthDt=" + this.dlAuthDt + ", dlHlValdtoDate=" + this.dlHlValdtoDate + ", dlEndorseno=" + this.dlEndorseno + ", bioid=" + this.bioid + ", olacode=" + this.olacode + ", dlOldLicno=" + this.dlOldLicno + ", dlHzValdfrDt=" + this.dlHzValdfrDt + ", dlIssueDate=" + this.dlIssueDate + ", enforceEndDate=" + this.enforceEndDate + ", dlTrValdtoDt=" + this.dlTrValdtoDt + ", dlSeqno=" + this.dlSeqno + ", dlRemarks=" + this.dlRemarks + ", dlRecGenesis=" + this.dlRecGenesis + ", dlNtValdfrDt=" + this.dlNtValdfrDt + ", dlEndorsetime=" + this.dlEndorsetime + ", dlHlValdtoDt=" + this.dlHlValdtoDt + ", dlHzValdtoDate=" + this.dlHzValdtoDate + ", dlEndorseAuth=" + this.dlEndorseAuth + ", dlStatus=" + this.dlStatus + ", olaName=" + this.olaName + ", statecd=" + this.statecd + ", dlUsid=" + this.dlUsid + ", dlEndorsedt=" + this.dlEndorsedt + ", dlAuthIssauth=" + this.dlAuthIssauth + ", dlIssuedesig=" + this.dlIssuedesig + ", omRtoShortname=" + this.omRtoShortname + ", dlHlValdfrDt=" + this.dlHlValdfrDt + ", dlTrValdtoDate=" + this.dlTrValdtoDate + ", dlAuthCov=" + this.dlAuthCov + ", dlPrintDate=" + this.dlPrintDate + ", dlPrintStatus=" + this.dlPrintStatus + ", dlApplno=" + this.dlApplno + ", dlDigest=" + this.dlDigest + ", dlTrValdfrDt=" + this.dlTrValdfrDt + ", dlRtoCode=" + this.dlRtoCode + ", dlolaCode=" + this.dlolaCode + ", dlNtValdtoDt=" + this.dlNtValdtoDt + ')';
    }

    public Dlobj(Object obj, String str, String str2, String str3, Object obj2, Object obj3, String str4, String str5, String str6, Object obj4, Object obj5, Object obj6, Object obj7, String str7, String str8, Object obj8, String str9, Object obj9, Object obj10, String str10, String str11, String str12, String str13, Object obj11, Object obj12, Object obj13, String dlTrValdtoDt, String str14, String str15, String str16, String str17, Object obj14, Object obj15, Object obj16, String str18, String str19, String str20, String str21, String str22, String str23, Object obj17, Object obj18, String str24, Object obj19, Object obj20, Object obj21, String str25, String str26, String str27, Object obj22, String dlTrValdfrDt, String str28, Object obj23, String str29) {
        Intrinsics.checkNotNullParameter(dlTrValdtoDt, "dlTrValdtoDt");
        Intrinsics.checkNotNullParameter(dlTrValdfrDt, "dlTrValdfrDt");
        this.enforceFromDate = obj;
        this.dlLicno = str;
        this.dlDispatchStatus = str2;
        this.omRtoFullname = str3;
        this.dlTokenId = obj2;
        this.dlStateCode = obj3;
        this.enforceRemark = str4;
        this.dlIssueauth = str5;
        this.stateName = str6;
        this.dlBioId = obj4;
        this.dlAuthNo = obj5;
        this.dlNtValdtoDate = obj6;
        this.dlHzValdtoDt = obj7;
        this.dlLatestTrcode = str7;
        this.omOfficeTownname = str8;
        this.dlInvcrgNo = obj8;
        this.dlIssuedt = str9;
        this.dlAuthDt = obj9;
        this.dlHlValdtoDate = obj10;
        this.dlEndorseno = str10;
        this.bioid = str11;
        this.olacode = str12;
        this.dlOldLicno = str13;
        this.dlHzValdfrDt = obj11;
        this.dlIssueDate = obj12;
        this.enforceEndDate = obj13;
        this.dlTrValdtoDt = dlTrValdtoDt;
        this.dlSeqno = str14;
        this.dlRemarks = str15;
        this.dlRecGenesis = str16;
        this.dlNtValdfrDt = str17;
        this.dlEndorsetime = obj14;
        this.dlHlValdtoDt = obj15;
        this.dlHzValdtoDate = obj16;
        this.dlEndorseAuth = str18;
        this.dlStatus = str19;
        this.olaName = str20;
        this.statecd = str21;
        this.dlUsid = str22;
        this.dlEndorsedt = str23;
        this.dlAuthIssauth = obj17;
        this.dlIssuedesig = obj18;
        this.omRtoShortname = str24;
        this.dlHlValdfrDt = obj19;
        this.dlTrValdtoDate = obj20;
        this.dlAuthCov = obj21;
        this.dlPrintDate = str25;
        this.dlPrintStatus = str26;
        this.dlApplno = str27;
        this.dlDigest = obj22;
        this.dlTrValdfrDt = dlTrValdfrDt;
        this.dlRtoCode = str28;
        this.dlolaCode = obj23;
        this.dlNtValdtoDt = str29;
    }

    public /* synthetic */ Dlobj(Object obj, String str, String str2, String str3, Object obj2, Object obj3, String str4, String str5, String str6, Object obj4, Object obj5, Object obj6, Object obj7, String str7, String str8, Object obj8, String str9, Object obj9, Object obj10, String str10, String str11, String str12, String str13, Object obj11, Object obj12, Object obj13, String str14, String str15, String str16, String str17, String str18, Object obj14, Object obj15, Object obj16, String str19, String str20, String str21, String str22, String str23, String str24, Object obj17, Object obj18, String str25, Object obj19, Object obj20, Object obj21, String str26, String str27, String str28, Object obj22, String str29, String str30, Object obj23, String str31, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : obj2, (i & 32) != 0 ? null : obj3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : obj4, (i & 1024) != 0 ? null : obj5, (i & 2048) != 0 ? null : obj6, (i & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? null : obj7, (i & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? null : str7, (i & 16384) != 0 ? null : str8, (i & 32768) != 0 ? null : obj8, (i & 65536) != 0 ? null : str9, (i & 131072) != 0 ? null : obj9, (i & 262144) != 0 ? null : obj10, (i & 524288) != 0 ? null : str10, (i & 1048576) != 0 ? null : str11, (i & 2097152) != 0 ? null : str12, (i & 4194304) != 0 ? null : str13, (i & 8388608) != 0 ? null : obj11, (i & 16777216) != 0 ? null : obj12, (i & 33554432) != 0 ? null : obj13, (i & 67108864) != 0 ? "" : str14, (i & 134217728) != 0 ? null : str15, (i & 268435456) != 0 ? null : str16, (i & 536870912) != 0 ? null : str17, (i & 1073741824) != 0 ? null : str18, (i & IntCompanionObject.MIN_VALUE) != 0 ? null : obj14, (i2 & 1) != 0 ? null : obj15, (i2 & 2) != 0 ? null : obj16, (i2 & 4) != 0 ? null : str19, (i2 & 8) != 0 ? null : str20, (i2 & 16) != 0 ? null : str21, (i2 & 32) != 0 ? null : str22, (i2 & 64) != 0 ? null : str23, (i2 & 128) != 0 ? null : str24, (i2 & 256) != 0 ? null : obj17, (i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : obj18, (i2 & 1024) != 0 ? null : str25, (i2 & 2048) != 0 ? null : obj19, (i2 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? null : obj20, (i2 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? null : obj21, (i2 & 16384) != 0 ? null : str26, (i2 & 32768) != 0 ? null : str27, (i2 & 65536) != 0 ? null : str28, (i2 & 131072) != 0 ? null : obj22, (i2 & 262144) != 0 ? "" : str29, (i2 & 524288) != 0 ? null : str30, (i2 & 1048576) != 0 ? null : obj23, (i2 & 2097152) != 0 ? null : str31);
    }
}
