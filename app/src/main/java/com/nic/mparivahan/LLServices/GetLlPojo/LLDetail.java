package com.nic.mparivahan.LLServices.GetLlPojo;

import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bp\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0007\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0007\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0007\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010\"\u001a\u00020\u0003\u0012\u0006\u0010#\u001a\u00020\u0003\u0012\u0006\u0010$\u001a\u00020\u0011\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u0007\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u0007\u0012\u0006\u0010)\u001a\u00020\u0003\u0012\u0006\u0010*\u001a\u00020\u0003\u0012\u0006\u0010+\u001a\u00020\u0003\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u0007\u0012\u0006\u0010.\u001a\u00020\u0003\u0012\f\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u0007\u0012\u0006\u00101\u001a\u00020\u0003\u0012\f\u00102\u001a\b\u0012\u0004\u0012\u0002030\u0007\u0012\f\u00104\u001a\b\u0012\u0004\u0012\u0002050\u0007\u0012\u0006\u00106\u001a\u00020\u0003\u0012\u0006\u00107\u001a\u00020\u0003\u0012\u0006\u00108\u001a\u00020\u0003\u0012\u0006\u00109\u001a\u00020\u0003\u0012\f\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\u0007\u0012\u0006\u0010<\u001a\u00020\u0003\u0012\u0006\u0010=\u001a\u00020\u0003\u0012\u0006\u0010>\u001a\u00020\u0003\u0012\f\u0010?\u001a\b\u0012\u0004\u0012\u00020@0\u0007\u0012\u0006\u0010A\u001a\u00020\u0003\u0012\f\u0010B\u001a\b\u0012\u0004\u0012\u00020C0\u0007\u0012\u0006\u0010D\u001a\u00020\u0003\u0012\u0006\u0010E\u001a\u00020\u0003\u0012\u0006\u0010F\u001a\u00020\u0003\u0012\u0006\u0010G\u001a\u00020\u0003\u0012\u0006\u0010H\u001a\u00020\u0003¢\u0006\u0002\u0010IJ\t\u0010\u007f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\u00130\u0007HÆ\u0003J\n\u0010\u0081\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0082\u0001\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\u00170\u0007HÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0007HÆ\u0003J\u0010\u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0007HÆ\u0003J\u0010\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0007HÆ\u0003J\n\u0010\u0089\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008a\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008c\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008d\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008e\u0001\u001a\u00020\u0011HÆ\u0003J\u0010\u0010\u008f\u0001\u001a\b\u0012\u0004\u0012\u00020&0\u0007HÆ\u0003J\u0010\u0010\u0090\u0001\u001a\b\u0012\u0004\u0012\u00020(0\u0007HÆ\u0003J\n\u0010\u0091\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0092\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0093\u0001\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0094\u0001\u001a\b\u0012\u0004\u0012\u00020-0\u0007HÆ\u0003J\n\u0010\u0095\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0096\u0001\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0097\u0001\u001a\b\u0012\u0004\u0012\u0002000\u0007HÆ\u0003J\n\u0010\u0098\u0001\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0099\u0001\u001a\b\u0012\u0004\u0012\u0002030\u0007HÆ\u0003J\u0010\u0010\u009a\u0001\u001a\b\u0012\u0004\u0012\u0002050\u0007HÆ\u0003J\n\u0010\u009b\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009c\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009d\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009e\u0001\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u009f\u0001\u001a\b\u0012\u0004\u0012\u00020;0\u0007HÆ\u0003J\u0010\u0010 \u0001\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\n\u0010¡\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¢\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010£\u0001\u001a\u00020\u0003HÆ\u0003J\u0010\u0010¤\u0001\u001a\b\u0012\u0004\u0012\u00020@0\u0007HÆ\u0003J\n\u0010¥\u0001\u001a\u00020\u0003HÆ\u0003J\u0010\u0010¦\u0001\u001a\b\u0012\u0004\u0012\u00020C0\u0007HÆ\u0003J\n\u0010§\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¨\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010©\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ª\u0001\u001a\u00020\u0003HÆ\u0003J\u0010\u0010«\u0001\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003J\n\u0010¬\u0001\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u00ad\u0001\u001a\b\u0012\u0004\u0012\u00020\f0\u0007HÆ\u0003J\n\u0010®\u0001\u001a\u00020\u0003HÆ\u0003J\u0010\u0010¯\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0007HÆ\u0003J\n\u0010°\u0001\u001a\u00020\u0011HÆ\u0003Jê\u0004\u0010±\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\b\b\u0002\u0010\r\u001a\u00020\u00032\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00072\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00072\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00072\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u00112\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00072\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u00072\b\b\u0002\u0010)\u001a\u00020\u00032\b\b\u0002\u0010*\u001a\u00020\u00032\b\b\u0002\u0010+\u001a\u00020\u00032\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u00072\b\b\u0002\u0010.\u001a\u00020\u00032\u000e\b\u0002\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u00072\b\b\u0002\u00101\u001a\u00020\u00032\u000e\b\u0002\u00102\u001a\b\u0012\u0004\u0012\u0002030\u00072\u000e\b\u0002\u00104\u001a\b\u0012\u0004\u0012\u0002050\u00072\b\b\u0002\u00106\u001a\u00020\u00032\b\b\u0002\u00107\u001a\u00020\u00032\b\b\u0002\u00108\u001a\u00020\u00032\b\b\u0002\u00109\u001a\u00020\u00032\u000e\b\u0002\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\u00072\b\b\u0002\u0010<\u001a\u00020\u00032\b\b\u0002\u0010=\u001a\u00020\u00032\b\b\u0002\u0010>\u001a\u00020\u00032\u000e\b\u0002\u0010?\u001a\b\u0012\u0004\u0012\u00020@0\u00072\b\b\u0002\u0010A\u001a\u00020\u00032\u000e\b\u0002\u0010B\u001a\b\u0012\u0004\u0012\u00020C0\u00072\b\b\u0002\u0010D\u001a\u00020\u00032\b\b\u0002\u0010E\u001a\u00020\u00032\b\b\u0002\u0010F\u001a\u00020\u00032\b\b\u0002\u0010G\u001a\u00020\u00032\b\b\u0002\u0010H\u001a\u00020\u0003HÆ\u0001J\u0016\u0010²\u0001\u001a\u00020\u00112\n\u0010³\u0001\u001a\u0005\u0018\u00010´\u0001HÖ\u0003J\u000b\u0010µ\u0001\u001a\u00030¶\u0001HÖ\u0001J\n\u0010·\u0001\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bL\u0010KR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bM\u0010KR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\b\n\u0000\u001a\u0004\bP\u0010OR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010OR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bR\u0010KR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0007¢\u0006\b\n\u0000\u001a\u0004\bS\u0010OR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0007¢\u0006\b\n\u0000\u001a\u0004\bV\u0010OR\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bW\u0010KR\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bX\u0010KR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0007¢\u0006\b\n\u0000\u001a\u0004\bY\u0010OR\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010KR\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b[\u0010KR\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010OR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0007¢\u0006\b\n\u0000\u001a\u0004\b]\u0010OR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0007¢\u0006\b\n\u0000\u001a\u0004\b^\u0010OR\u0011\u0010 \u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b_\u0010KR\u0011\u0010!\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b`\u0010KR\u0011\u0010\"\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\ba\u0010KR\u0011\u0010#\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bb\u0010KR\u0011\u0010$\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\bc\u0010UR\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u0007¢\u0006\b\n\u0000\u001a\u0004\bd\u0010OR\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u0007¢\u0006\b\n\u0000\u001a\u0004\be\u0010OR\u0011\u0010)\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bf\u0010KR\u0011\u0010*\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bg\u0010KR\u0011\u0010+\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bh\u0010KR\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u0007¢\u0006\b\n\u0000\u001a\u0004\bi\u0010OR\u0011\u0010.\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bj\u0010KR\u0017\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u0007¢\u0006\b\n\u0000\u001a\u0004\bk\u0010OR\u0011\u00101\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bl\u0010KR\u0017\u00102\u001a\b\u0012\u0004\u0012\u0002030\u0007¢\u0006\b\n\u0000\u001a\u0004\bm\u0010OR\u0017\u00104\u001a\b\u0012\u0004\u0012\u0002050\u0007¢\u0006\b\n\u0000\u001a\u0004\bn\u0010OR\u0011\u00106\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bo\u0010KR\u0011\u00107\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bp\u0010KR\u0011\u00108\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bq\u0010KR\u0011\u00109\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\br\u0010KR\u0017\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\u0007¢\u0006\b\n\u0000\u001a\u0004\bs\u0010OR\u0011\u0010<\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bt\u0010KR\u0011\u0010=\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bu\u0010KR\u0011\u0010>\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bv\u0010KR\u0017\u0010?\u001a\b\u0012\u0004\u0012\u00020@0\u0007¢\u0006\b\n\u0000\u001a\u0004\bw\u0010OR\u0011\u0010A\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bx\u0010KR\u0017\u0010B\u001a\b\u0012\u0004\u0012\u00020C0\u0007¢\u0006\b\n\u0000\u001a\u0004\by\u0010OR\u0011\u0010D\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bz\u0010KR\u0011\u0010E\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b{\u0010KR\u0011\u0010F\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b|\u0010KR\u0011\u0010G\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b}\u0010KR\u0011\u0010H\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b~\u0010K¨\u0006¸\u0001"}, d2 = {"Lcom/nic/mparivahan/LLServices/GetLlPojo/LLDetail;", "Ljava/io/Serializable;", "PresVillageOrTown", "", "aadhaarNumber", "age", "bloodGroup", "", "Lcom/nic/mparivahan/LLServices/GetLlPojo/BloodGroup;", "checkCovs", "Lcom/nic/mparivahan/LLServices/GetLlPojo/CheckCov;", "countryOfBirth", "Lcom/nic/mparivahan/LLServices/GetLlPojo/CountryOfBirth;", "dateOfBirth", "drivingSchoolDet", "Lcom/nic/mparivahan/LLServices/GetLlPojo/DrivingSchoolDet;", "editAddressLL", "", "eduQual", "Lcom/nic/mparivahan/LLServices/GetLlPojo/EduQual;", "email", "fname", "gender", "Lcom/nic/mparivahan/LLServices/GetLlPojo/Gender;", "idMarks1", "idMarks2", "llFromRTO1", "Lcom/nic/mparivahan/LLServices/GetLlPojo/LlFromRTO1;", "llFromState1", "Lcom/nic/mparivahan/LLServices/GetLlPojo/LlFromState1;", "llstoDisplayMap", "Lcom/nic/mparivahan/LLServices/GetLlPojo/LlstoDisplayMap;", "lname", "mname", "mobileNumber", "newFullName", "onlyEditAddressLL", "permCity", "Lcom/nic/mparivahan/LLServices/GetLlPojo/PermCity;", "permDistrict", "Lcom/nic/mparivahan/LLServices/GetLlPojo/PermDistrict;", "permHouseNo", "permLocation", "permPinCode", "permState", "Lcom/nic/mparivahan/LLServices/GetLlPojo/PermState;", "permStreet", "permSubDistrict", "Lcom/nic/mparivahan/LLServices/GetLlPojo/PermSubDistrict;", "permVillageOrTown", "presCity", "Lcom/nic/mparivahan/LLServices/GetLlPojo/PresCity;", "presDistrict", "Lcom/nic/mparivahan/LLServices/GetLlPojo/PresDistrict;", "presHouseNo", "presLocation", "presPinCode", "presSameAsPerm", "presState", "Lcom/nic/mparivahan/LLServices/GetLlPojo/PresState;", "presStayMonths", "presStayYears", "presStreet", "presSubDistrict", "Lcom/nic/mparivahan/LLServices/GetLlPojo/PresSubDistrict;", "refStateEqiCovsMessage", "relationType", "Lcom/nic/mparivahan/LLServices/GetLlPojo/RelationType;", "selectAll", "selectedCovs", "swdfName", "swdlName", "swdmName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPresVillageOrTown", "()Ljava/lang/String;", "getAadhaarNumber", "getAge", "getBloodGroup", "()Ljava/util/List;", "getCheckCovs", "getCountryOfBirth", "getDateOfBirth", "getDrivingSchoolDet", "getEditAddressLL", "()Z", "getEduQual", "getEmail", "getFname", "getGender", "getIdMarks1", "getIdMarks2", "getLlFromRTO1", "getLlFromState1", "getLlstoDisplayMap", "getLname", "getMname", "getMobileNumber", "getNewFullName", "getOnlyEditAddressLL", "getPermCity", "getPermDistrict", "getPermHouseNo", "getPermLocation", "getPermPinCode", "getPermState", "getPermStreet", "getPermSubDistrict", "getPermVillageOrTown", "getPresCity", "getPresDistrict", "getPresHouseNo", "getPresLocation", "getPresPinCode", "getPresSameAsPerm", "getPresState", "getPresStayMonths", "getPresStayYears", "getPresStreet", "getPresSubDistrict", "getRefStateEqiCovsMessage", "getRelationType", "getSelectAll", "getSelectedCovs", "getSwdfName", "getSwdlName", "getSwdmName", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class LLDetail implements Serializable {
    private final String PresVillageOrTown;
    private final String aadhaarNumber;
    private final String age;
    private final List<BloodGroup> bloodGroup;
    private final List<CheckCov> checkCovs;
    private final List<CountryOfBirth> countryOfBirth;
    private final String dateOfBirth;
    private final List<DrivingSchoolDet> drivingSchoolDet;
    private final boolean editAddressLL;
    private final List<EduQual> eduQual;
    private final String email;
    private final String fname;
    private final List<Gender> gender;
    private final String idMarks1;
    private final String idMarks2;
    private final List<LlFromRTO1> llFromRTO1;
    private final List<LlFromState1> llFromState1;
    private final List<LlstoDisplayMap> llstoDisplayMap;
    private final String lname;
    private final String mname;
    private final String mobileNumber;
    private final String newFullName;
    private final boolean onlyEditAddressLL;
    private final List<PermCity> permCity;
    private final List<PermDistrict> permDistrict;
    private final String permHouseNo;
    private final String permLocation;
    private final String permPinCode;
    private final List<PermState> permState;
    private final String permStreet;
    private final List<PermSubDistrict> permSubDistrict;
    private final String permVillageOrTown;
    private final List<PresCity> presCity;
    private final List<PresDistrict> presDistrict;
    private final String presHouseNo;
    private final String presLocation;
    private final String presPinCode;
    private final String presSameAsPerm;
    private final List<PresState> presState;
    private final String presStayMonths;
    private final String presStayYears;
    private final String presStreet;
    private final List<PresSubDistrict> presSubDistrict;
    private final String refStateEqiCovsMessage;
    private final List<RelationType> relationType;
    private final String selectAll;
    private final String selectedCovs;
    private final String swdfName;
    private final String swdlName;
    private final String swdmName;

    public LLDetail(String PresVillageOrTown, String aadhaarNumber, String age, List<BloodGroup> bloodGroup, List<CheckCov> checkCovs, List<CountryOfBirth> countryOfBirth, String dateOfBirth, List<DrivingSchoolDet> drivingSchoolDet, boolean z, List<EduQual> eduQual, String email, String fname, List<Gender> gender, String idMarks1, String idMarks2, List<LlFromRTO1> llFromRTO1, List<LlFromState1> llFromState1, List<LlstoDisplayMap> llstoDisplayMap, String lname, String mname, String mobileNumber, String newFullName, boolean z2, List<PermCity> permCity, List<PermDistrict> permDistrict, String permHouseNo, String permLocation, String permPinCode, List<PermState> permState, String permStreet, List<PermSubDistrict> permSubDistrict, String permVillageOrTown, List<PresCity> presCity, List<PresDistrict> presDistrict, String presHouseNo, String presLocation, String presPinCode, String presSameAsPerm, List<PresState> presState, String presStayMonths, String presStayYears, String presStreet, List<PresSubDistrict> presSubDistrict, String refStateEqiCovsMessage, List<RelationType> relationType, String selectAll, String selectedCovs, String swdfName, String swdlName, String swdmName) {
        Intrinsics.checkNotNullParameter(PresVillageOrTown, "PresVillageOrTown");
        Intrinsics.checkNotNullParameter(aadhaarNumber, "aadhaarNumber");
        Intrinsics.checkNotNullParameter(age, "age");
        Intrinsics.checkNotNullParameter(bloodGroup, "bloodGroup");
        Intrinsics.checkNotNullParameter(checkCovs, "checkCovs");
        Intrinsics.checkNotNullParameter(countryOfBirth, "countryOfBirth");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(drivingSchoolDet, "drivingSchoolDet");
        Intrinsics.checkNotNullParameter(eduQual, "eduQual");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(fname, "fname");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(idMarks1, "idMarks1");
        Intrinsics.checkNotNullParameter(idMarks2, "idMarks2");
        Intrinsics.checkNotNullParameter(llFromRTO1, "llFromRTO1");
        Intrinsics.checkNotNullParameter(llFromState1, "llFromState1");
        Intrinsics.checkNotNullParameter(llstoDisplayMap, "llstoDisplayMap");
        Intrinsics.checkNotNullParameter(lname, "lname");
        Intrinsics.checkNotNullParameter(mname, "mname");
        Intrinsics.checkNotNullParameter(mobileNumber, "mobileNumber");
        Intrinsics.checkNotNullParameter(newFullName, "newFullName");
        Intrinsics.checkNotNullParameter(permCity, "permCity");
        Intrinsics.checkNotNullParameter(permDistrict, "permDistrict");
        Intrinsics.checkNotNullParameter(permHouseNo, "permHouseNo");
        Intrinsics.checkNotNullParameter(permLocation, "permLocation");
        Intrinsics.checkNotNullParameter(permPinCode, "permPinCode");
        Intrinsics.checkNotNullParameter(permState, "permState");
        Intrinsics.checkNotNullParameter(permStreet, "permStreet");
        Intrinsics.checkNotNullParameter(permSubDistrict, "permSubDistrict");
        Intrinsics.checkNotNullParameter(permVillageOrTown, "permVillageOrTown");
        Intrinsics.checkNotNullParameter(presCity, "presCity");
        Intrinsics.checkNotNullParameter(presDistrict, "presDistrict");
        Intrinsics.checkNotNullParameter(presHouseNo, "presHouseNo");
        Intrinsics.checkNotNullParameter(presLocation, "presLocation");
        Intrinsics.checkNotNullParameter(presPinCode, "presPinCode");
        Intrinsics.checkNotNullParameter(presSameAsPerm, "presSameAsPerm");
        Intrinsics.checkNotNullParameter(presState, "presState");
        Intrinsics.checkNotNullParameter(presStayMonths, "presStayMonths");
        Intrinsics.checkNotNullParameter(presStayYears, "presStayYears");
        Intrinsics.checkNotNullParameter(presStreet, "presStreet");
        Intrinsics.checkNotNullParameter(presSubDistrict, "presSubDistrict");
        Intrinsics.checkNotNullParameter(refStateEqiCovsMessage, "refStateEqiCovsMessage");
        Intrinsics.checkNotNullParameter(relationType, "relationType");
        Intrinsics.checkNotNullParameter(selectAll, "selectAll");
        Intrinsics.checkNotNullParameter(selectedCovs, "selectedCovs");
        Intrinsics.checkNotNullParameter(swdfName, "swdfName");
        Intrinsics.checkNotNullParameter(swdlName, "swdlName");
        Intrinsics.checkNotNullParameter(swdmName, "swdmName");
        this.PresVillageOrTown = PresVillageOrTown;
        this.aadhaarNumber = aadhaarNumber;
        this.age = age;
        this.bloodGroup = bloodGroup;
        this.checkCovs = checkCovs;
        this.countryOfBirth = countryOfBirth;
        this.dateOfBirth = dateOfBirth;
        this.drivingSchoolDet = drivingSchoolDet;
        this.editAddressLL = z;
        this.eduQual = eduQual;
        this.email = email;
        this.fname = fname;
        this.gender = gender;
        this.idMarks1 = idMarks1;
        this.idMarks2 = idMarks2;
        this.llFromRTO1 = llFromRTO1;
        this.llFromState1 = llFromState1;
        this.llstoDisplayMap = llstoDisplayMap;
        this.lname = lname;
        this.mname = mname;
        this.mobileNumber = mobileNumber;
        this.newFullName = newFullName;
        this.onlyEditAddressLL = z2;
        this.permCity = permCity;
        this.permDistrict = permDistrict;
        this.permHouseNo = permHouseNo;
        this.permLocation = permLocation;
        this.permPinCode = permPinCode;
        this.permState = permState;
        this.permStreet = permStreet;
        this.permSubDistrict = permSubDistrict;
        this.permVillageOrTown = permVillageOrTown;
        this.presCity = presCity;
        this.presDistrict = presDistrict;
        this.presHouseNo = presHouseNo;
        this.presLocation = presLocation;
        this.presPinCode = presPinCode;
        this.presSameAsPerm = presSameAsPerm;
        this.presState = presState;
        this.presStayMonths = presStayMonths;
        this.presStayYears = presStayYears;
        this.presStreet = presStreet;
        this.presSubDistrict = presSubDistrict;
        this.refStateEqiCovsMessage = refStateEqiCovsMessage;
        this.relationType = relationType;
        this.selectAll = selectAll;
        this.selectedCovs = selectedCovs;
        this.swdfName = swdfName;
        this.swdlName = swdlName;
        this.swdmName = swdmName;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPresVillageOrTown() {
        return this.PresVillageOrTown;
    }

    public final List<EduQual> component10() {
        return this.eduQual;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getFname() {
        return this.fname;
    }

    public final List<Gender> component13() {
        return this.gender;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getIdMarks1() {
        return this.idMarks1;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getIdMarks2() {
        return this.idMarks2;
    }

    public final List<LlFromRTO1> component16() {
        return this.llFromRTO1;
    }

    public final List<LlFromState1> component17() {
        return this.llFromState1;
    }

    public final List<LlstoDisplayMap> component18() {
        return this.llstoDisplayMap;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getLname() {
        return this.lname;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAadhaarNumber() {
        return this.aadhaarNumber;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getMname() {
        return this.mname;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getNewFullName() {
        return this.newFullName;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final boolean getOnlyEditAddressLL() {
        return this.onlyEditAddressLL;
    }

    public final List<PermCity> component24() {
        return this.permCity;
    }

    public final List<PermDistrict> component25() {
        return this.permDistrict;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getPermHouseNo() {
        return this.permHouseNo;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getPermLocation() {
        return this.permLocation;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getPermPinCode() {
        return this.permPinCode;
    }

    public final List<PermState> component29() {
        return this.permState;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAge() {
        return this.age;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getPermStreet() {
        return this.permStreet;
    }

    public final List<PermSubDistrict> component31() {
        return this.permSubDistrict;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getPermVillageOrTown() {
        return this.permVillageOrTown;
    }

    public final List<PresCity> component33() {
        return this.presCity;
    }

    public final List<PresDistrict> component34() {
        return this.presDistrict;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final String getPresHouseNo() {
        return this.presHouseNo;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final String getPresLocation() {
        return this.presLocation;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final String getPresPinCode() {
        return this.presPinCode;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final String getPresSameAsPerm() {
        return this.presSameAsPerm;
    }

    public final List<PresState> component39() {
        return this.presState;
    }

    public final List<BloodGroup> component4() {
        return this.bloodGroup;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final String getPresStayMonths() {
        return this.presStayMonths;
    }

    /* JADX INFO: renamed from: component41, reason: from getter */
    public final String getPresStayYears() {
        return this.presStayYears;
    }

    /* JADX INFO: renamed from: component42, reason: from getter */
    public final String getPresStreet() {
        return this.presStreet;
    }

    public final List<PresSubDistrict> component43() {
        return this.presSubDistrict;
    }

    /* JADX INFO: renamed from: component44, reason: from getter */
    public final String getRefStateEqiCovsMessage() {
        return this.refStateEqiCovsMessage;
    }

    public final List<RelationType> component45() {
        return this.relationType;
    }

    /* JADX INFO: renamed from: component46, reason: from getter */
    public final String getSelectAll() {
        return this.selectAll;
    }

    /* JADX INFO: renamed from: component47, reason: from getter */
    public final String getSelectedCovs() {
        return this.selectedCovs;
    }

    /* JADX INFO: renamed from: component48, reason: from getter */
    public final String getSwdfName() {
        return this.swdfName;
    }

    /* JADX INFO: renamed from: component49, reason: from getter */
    public final String getSwdlName() {
        return this.swdlName;
    }

    public final List<CheckCov> component5() {
        return this.checkCovs;
    }

    /* JADX INFO: renamed from: component50, reason: from getter */
    public final String getSwdmName() {
        return this.swdmName;
    }

    public final List<CountryOfBirth> component6() {
        return this.countryOfBirth;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final List<DrivingSchoolDet> component8() {
        return this.drivingSchoolDet;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getEditAddressLL() {
        return this.editAddressLL;
    }

    public final LLDetail copy(String PresVillageOrTown, String aadhaarNumber, String age, List<BloodGroup> bloodGroup, List<CheckCov> checkCovs, List<CountryOfBirth> countryOfBirth, String dateOfBirth, List<DrivingSchoolDet> drivingSchoolDet, boolean editAddressLL, List<EduQual> eduQual, String email, String fname, List<Gender> gender, String idMarks1, String idMarks2, List<LlFromRTO1> llFromRTO1, List<LlFromState1> llFromState1, List<LlstoDisplayMap> llstoDisplayMap, String lname, String mname, String mobileNumber, String newFullName, boolean onlyEditAddressLL, List<PermCity> permCity, List<PermDistrict> permDistrict, String permHouseNo, String permLocation, String permPinCode, List<PermState> permState, String permStreet, List<PermSubDistrict> permSubDistrict, String permVillageOrTown, List<PresCity> presCity, List<PresDistrict> presDistrict, String presHouseNo, String presLocation, String presPinCode, String presSameAsPerm, List<PresState> presState, String presStayMonths, String presStayYears, String presStreet, List<PresSubDistrict> presSubDistrict, String refStateEqiCovsMessage, List<RelationType> relationType, String selectAll, String selectedCovs, String swdfName, String swdlName, String swdmName) {
        Intrinsics.checkNotNullParameter(PresVillageOrTown, "PresVillageOrTown");
        Intrinsics.checkNotNullParameter(aadhaarNumber, "aadhaarNumber");
        Intrinsics.checkNotNullParameter(age, "age");
        Intrinsics.checkNotNullParameter(bloodGroup, "bloodGroup");
        Intrinsics.checkNotNullParameter(checkCovs, "checkCovs");
        Intrinsics.checkNotNullParameter(countryOfBirth, "countryOfBirth");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(drivingSchoolDet, "drivingSchoolDet");
        Intrinsics.checkNotNullParameter(eduQual, "eduQual");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(fname, "fname");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(idMarks1, "idMarks1");
        Intrinsics.checkNotNullParameter(idMarks2, "idMarks2");
        Intrinsics.checkNotNullParameter(llFromRTO1, "llFromRTO1");
        Intrinsics.checkNotNullParameter(llFromState1, "llFromState1");
        Intrinsics.checkNotNullParameter(llstoDisplayMap, "llstoDisplayMap");
        Intrinsics.checkNotNullParameter(lname, "lname");
        Intrinsics.checkNotNullParameter(mname, "mname");
        Intrinsics.checkNotNullParameter(mobileNumber, "mobileNumber");
        Intrinsics.checkNotNullParameter(newFullName, "newFullName");
        Intrinsics.checkNotNullParameter(permCity, "permCity");
        Intrinsics.checkNotNullParameter(permDistrict, "permDistrict");
        Intrinsics.checkNotNullParameter(permHouseNo, "permHouseNo");
        Intrinsics.checkNotNullParameter(permLocation, "permLocation");
        Intrinsics.checkNotNullParameter(permPinCode, "permPinCode");
        Intrinsics.checkNotNullParameter(permState, "permState");
        Intrinsics.checkNotNullParameter(permStreet, "permStreet");
        Intrinsics.checkNotNullParameter(permSubDistrict, "permSubDistrict");
        Intrinsics.checkNotNullParameter(permVillageOrTown, "permVillageOrTown");
        Intrinsics.checkNotNullParameter(presCity, "presCity");
        Intrinsics.checkNotNullParameter(presDistrict, "presDistrict");
        Intrinsics.checkNotNullParameter(presHouseNo, "presHouseNo");
        Intrinsics.checkNotNullParameter(presLocation, "presLocation");
        Intrinsics.checkNotNullParameter(presPinCode, "presPinCode");
        Intrinsics.checkNotNullParameter(presSameAsPerm, "presSameAsPerm");
        Intrinsics.checkNotNullParameter(presState, "presState");
        Intrinsics.checkNotNullParameter(presStayMonths, "presStayMonths");
        Intrinsics.checkNotNullParameter(presStayYears, "presStayYears");
        Intrinsics.checkNotNullParameter(presStreet, "presStreet");
        Intrinsics.checkNotNullParameter(presSubDistrict, "presSubDistrict");
        Intrinsics.checkNotNullParameter(refStateEqiCovsMessage, "refStateEqiCovsMessage");
        Intrinsics.checkNotNullParameter(relationType, "relationType");
        Intrinsics.checkNotNullParameter(selectAll, "selectAll");
        Intrinsics.checkNotNullParameter(selectedCovs, "selectedCovs");
        Intrinsics.checkNotNullParameter(swdfName, "swdfName");
        Intrinsics.checkNotNullParameter(swdlName, "swdlName");
        Intrinsics.checkNotNullParameter(swdmName, "swdmName");
        return new LLDetail(PresVillageOrTown, aadhaarNumber, age, bloodGroup, checkCovs, countryOfBirth, dateOfBirth, drivingSchoolDet, editAddressLL, eduQual, email, fname, gender, idMarks1, idMarks2, llFromRTO1, llFromState1, llstoDisplayMap, lname, mname, mobileNumber, newFullName, onlyEditAddressLL, permCity, permDistrict, permHouseNo, permLocation, permPinCode, permState, permStreet, permSubDistrict, permVillageOrTown, presCity, presDistrict, presHouseNo, presLocation, presPinCode, presSameAsPerm, presState, presStayMonths, presStayYears, presStreet, presSubDistrict, refStateEqiCovsMessage, relationType, selectAll, selectedCovs, swdfName, swdlName, swdmName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LLDetail)) {
            return false;
        }
        LLDetail lLDetail = (LLDetail) other;
        return Intrinsics.areEqual(this.PresVillageOrTown, lLDetail.PresVillageOrTown) && Intrinsics.areEqual(this.aadhaarNumber, lLDetail.aadhaarNumber) && Intrinsics.areEqual(this.age, lLDetail.age) && Intrinsics.areEqual(this.bloodGroup, lLDetail.bloodGroup) && Intrinsics.areEqual(this.checkCovs, lLDetail.checkCovs) && Intrinsics.areEqual(this.countryOfBirth, lLDetail.countryOfBirth) && Intrinsics.areEqual(this.dateOfBirth, lLDetail.dateOfBirth) && Intrinsics.areEqual(this.drivingSchoolDet, lLDetail.drivingSchoolDet) && this.editAddressLL == lLDetail.editAddressLL && Intrinsics.areEqual(this.eduQual, lLDetail.eduQual) && Intrinsics.areEqual(this.email, lLDetail.email) && Intrinsics.areEqual(this.fname, lLDetail.fname) && Intrinsics.areEqual(this.gender, lLDetail.gender) && Intrinsics.areEqual(this.idMarks1, lLDetail.idMarks1) && Intrinsics.areEqual(this.idMarks2, lLDetail.idMarks2) && Intrinsics.areEqual(this.llFromRTO1, lLDetail.llFromRTO1) && Intrinsics.areEqual(this.llFromState1, lLDetail.llFromState1) && Intrinsics.areEqual(this.llstoDisplayMap, lLDetail.llstoDisplayMap) && Intrinsics.areEqual(this.lname, lLDetail.lname) && Intrinsics.areEqual(this.mname, lLDetail.mname) && Intrinsics.areEqual(this.mobileNumber, lLDetail.mobileNumber) && Intrinsics.areEqual(this.newFullName, lLDetail.newFullName) && this.onlyEditAddressLL == lLDetail.onlyEditAddressLL && Intrinsics.areEqual(this.permCity, lLDetail.permCity) && Intrinsics.areEqual(this.permDistrict, lLDetail.permDistrict) && Intrinsics.areEqual(this.permHouseNo, lLDetail.permHouseNo) && Intrinsics.areEqual(this.permLocation, lLDetail.permLocation) && Intrinsics.areEqual(this.permPinCode, lLDetail.permPinCode) && Intrinsics.areEqual(this.permState, lLDetail.permState) && Intrinsics.areEqual(this.permStreet, lLDetail.permStreet) && Intrinsics.areEqual(this.permSubDistrict, lLDetail.permSubDistrict) && Intrinsics.areEqual(this.permVillageOrTown, lLDetail.permVillageOrTown) && Intrinsics.areEqual(this.presCity, lLDetail.presCity) && Intrinsics.areEqual(this.presDistrict, lLDetail.presDistrict) && Intrinsics.areEqual(this.presHouseNo, lLDetail.presHouseNo) && Intrinsics.areEqual(this.presLocation, lLDetail.presLocation) && Intrinsics.areEqual(this.presPinCode, lLDetail.presPinCode) && Intrinsics.areEqual(this.presSameAsPerm, lLDetail.presSameAsPerm) && Intrinsics.areEqual(this.presState, lLDetail.presState) && Intrinsics.areEqual(this.presStayMonths, lLDetail.presStayMonths) && Intrinsics.areEqual(this.presStayYears, lLDetail.presStayYears) && Intrinsics.areEqual(this.presStreet, lLDetail.presStreet) && Intrinsics.areEqual(this.presSubDistrict, lLDetail.presSubDistrict) && Intrinsics.areEqual(this.refStateEqiCovsMessage, lLDetail.refStateEqiCovsMessage) && Intrinsics.areEqual(this.relationType, lLDetail.relationType) && Intrinsics.areEqual(this.selectAll, lLDetail.selectAll) && Intrinsics.areEqual(this.selectedCovs, lLDetail.selectedCovs) && Intrinsics.areEqual(this.swdfName, lLDetail.swdfName) && Intrinsics.areEqual(this.swdlName, lLDetail.swdlName) && Intrinsics.areEqual(this.swdmName, lLDetail.swdmName);
    }

    public final String getAadhaarNumber() {
        return this.aadhaarNumber;
    }

    public final String getAge() {
        return this.age;
    }

    public final List<BloodGroup> getBloodGroup() {
        return this.bloodGroup;
    }

    public final List<CheckCov> getCheckCovs() {
        return this.checkCovs;
    }

    public final List<CountryOfBirth> getCountryOfBirth() {
        return this.countryOfBirth;
    }

    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final List<DrivingSchoolDet> getDrivingSchoolDet() {
        return this.drivingSchoolDet;
    }

    public final boolean getEditAddressLL() {
        return this.editAddressLL;
    }

    public final List<EduQual> getEduQual() {
        return this.eduQual;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getFname() {
        return this.fname;
    }

    public final List<Gender> getGender() {
        return this.gender;
    }

    public final String getIdMarks1() {
        return this.idMarks1;
    }

    public final String getIdMarks2() {
        return this.idMarks2;
    }

    public final List<LlFromRTO1> getLlFromRTO1() {
        return this.llFromRTO1;
    }

    public final List<LlFromState1> getLlFromState1() {
        return this.llFromState1;
    }

    public final List<LlstoDisplayMap> getLlstoDisplayMap() {
        return this.llstoDisplayMap;
    }

    public final String getLname() {
        return this.lname;
    }

    public final String getMname() {
        return this.mname;
    }

    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    public final String getNewFullName() {
        return this.newFullName;
    }

    public final boolean getOnlyEditAddressLL() {
        return this.onlyEditAddressLL;
    }

    public final List<PermCity> getPermCity() {
        return this.permCity;
    }

    public final List<PermDistrict> getPermDistrict() {
        return this.permDistrict;
    }

    public final String getPermHouseNo() {
        return this.permHouseNo;
    }

    public final String getPermLocation() {
        return this.permLocation;
    }

    public final String getPermPinCode() {
        return this.permPinCode;
    }

    public final List<PermState> getPermState() {
        return this.permState;
    }

    public final String getPermStreet() {
        return this.permStreet;
    }

    public final List<PermSubDistrict> getPermSubDistrict() {
        return this.permSubDistrict;
    }

    public final String getPermVillageOrTown() {
        return this.permVillageOrTown;
    }

    public final List<PresCity> getPresCity() {
        return this.presCity;
    }

    public final List<PresDistrict> getPresDistrict() {
        return this.presDistrict;
    }

    public final String getPresHouseNo() {
        return this.presHouseNo;
    }

    public final String getPresLocation() {
        return this.presLocation;
    }

    public final String getPresPinCode() {
        return this.presPinCode;
    }

    public final String getPresSameAsPerm() {
        return this.presSameAsPerm;
    }

    public final List<PresState> getPresState() {
        return this.presState;
    }

    public final String getPresStayMonths() {
        return this.presStayMonths;
    }

    public final String getPresStayYears() {
        return this.presStayYears;
    }

    public final String getPresStreet() {
        return this.presStreet;
    }

    public final List<PresSubDistrict> getPresSubDistrict() {
        return this.presSubDistrict;
    }

    public final String getPresVillageOrTown() {
        return this.PresVillageOrTown;
    }

    public final String getRefStateEqiCovsMessage() {
        return this.refStateEqiCovsMessage;
    }

    public final List<RelationType> getRelationType() {
        return this.relationType;
    }

    public final String getSelectAll() {
        return this.selectAll;
    }

    public final String getSelectedCovs() {
        return this.selectedCovs;
    }

    public final String getSwdfName() {
        return this.swdfName;
    }

    public final String getSwdlName() {
        return this.swdlName;
    }

    public final String getSwdmName() {
        return this.swdmName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v97 */
    /* JADX WARN: Type inference failed for: r1v98 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((((((((((((this.PresVillageOrTown.hashCode() * 31) + this.aadhaarNumber.hashCode()) * 31) + this.age.hashCode()) * 31) + this.bloodGroup.hashCode()) * 31) + this.checkCovs.hashCode()) * 31) + this.countryOfBirth.hashCode()) * 31) + this.dateOfBirth.hashCode()) * 31) + this.drivingSchoolDet.hashCode()) * 31;
        boolean z = this.editAddressLL;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iHashCode2 = (((((((((((((((((((((((((((iHashCode + r1) * 31) + this.eduQual.hashCode()) * 31) + this.email.hashCode()) * 31) + this.fname.hashCode()) * 31) + this.gender.hashCode()) * 31) + this.idMarks1.hashCode()) * 31) + this.idMarks2.hashCode()) * 31) + this.llFromRTO1.hashCode()) * 31) + this.llFromState1.hashCode()) * 31) + this.llstoDisplayMap.hashCode()) * 31) + this.lname.hashCode()) * 31) + this.mname.hashCode()) * 31) + this.mobileNumber.hashCode()) * 31) + this.newFullName.hashCode()) * 31;
        boolean z2 = this.onlyEditAddressLL;
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode2 + (z2 ? 1 : z2)) * 31) + this.permCity.hashCode()) * 31) + this.permDistrict.hashCode()) * 31) + this.permHouseNo.hashCode()) * 31) + this.permLocation.hashCode()) * 31) + this.permPinCode.hashCode()) * 31) + this.permState.hashCode()) * 31) + this.permStreet.hashCode()) * 31) + this.permSubDistrict.hashCode()) * 31) + this.permVillageOrTown.hashCode()) * 31) + this.presCity.hashCode()) * 31) + this.presDistrict.hashCode()) * 31) + this.presHouseNo.hashCode()) * 31) + this.presLocation.hashCode()) * 31) + this.presPinCode.hashCode()) * 31) + this.presSameAsPerm.hashCode()) * 31) + this.presState.hashCode()) * 31) + this.presStayMonths.hashCode()) * 31) + this.presStayYears.hashCode()) * 31) + this.presStreet.hashCode()) * 31) + this.presSubDistrict.hashCode()) * 31) + this.refStateEqiCovsMessage.hashCode()) * 31) + this.relationType.hashCode()) * 31) + this.selectAll.hashCode()) * 31) + this.selectedCovs.hashCode()) * 31) + this.swdfName.hashCode()) * 31) + this.swdlName.hashCode()) * 31) + this.swdmName.hashCode();
    }

    public String toString() {
        return "LLDetail(PresVillageOrTown=" + this.PresVillageOrTown + ", aadhaarNumber=" + this.aadhaarNumber + ", age=" + this.age + ", bloodGroup=" + this.bloodGroup + ", checkCovs=" + this.checkCovs + ", countryOfBirth=" + this.countryOfBirth + ", dateOfBirth=" + this.dateOfBirth + ", drivingSchoolDet=" + this.drivingSchoolDet + ", editAddressLL=" + this.editAddressLL + ", eduQual=" + this.eduQual + ", email=" + this.email + ", fname=" + this.fname + ", gender=" + this.gender + ", idMarks1=" + this.idMarks1 + ", idMarks2=" + this.idMarks2 + ", llFromRTO1=" + this.llFromRTO1 + ", llFromState1=" + this.llFromState1 + ", llstoDisplayMap=" + this.llstoDisplayMap + ", lname=" + this.lname + ", mname=" + this.mname + ", mobileNumber=" + this.mobileNumber + ", newFullName=" + this.newFullName + ", onlyEditAddressLL=" + this.onlyEditAddressLL + ", permCity=" + this.permCity + ", permDistrict=" + this.permDistrict + ", permHouseNo=" + this.permHouseNo + ", permLocation=" + this.permLocation + ", permPinCode=" + this.permPinCode + ", permState=" + this.permState + ", permStreet=" + this.permStreet + ", permSubDistrict=" + this.permSubDistrict + ", permVillageOrTown=" + this.permVillageOrTown + ", presCity=" + this.presCity + ", presDistrict=" + this.presDistrict + ", presHouseNo=" + this.presHouseNo + ", presLocation=" + this.presLocation + ", presPinCode=" + this.presPinCode + ", presSameAsPerm=" + this.presSameAsPerm + ", presState=" + this.presState + ", presStayMonths=" + this.presStayMonths + ", presStayYears=" + this.presStayYears + ", presStreet=" + this.presStreet + ", presSubDistrict=" + this.presSubDistrict + ", refStateEqiCovsMessage=" + this.refStateEqiCovsMessage + ", relationType=" + this.relationType + ", selectAll=" + this.selectAll + ", selectedCovs=" + this.selectedCovs + ", swdfName=" + this.swdfName + ", swdlName=" + this.swdlName + ", swdmName=" + this.swdmName + ')';
    }
}
