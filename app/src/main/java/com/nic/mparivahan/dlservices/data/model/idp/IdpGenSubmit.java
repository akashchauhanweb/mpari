package com.nic.mparivahan.dlservices.data.model.idp;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0003\bÇ\u0001\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÛ\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000fj\b\u0012\u0004\u0012\u00020\u0003`\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010%\u001a\u00020\u0003\u0012\u0006\u0010&\u001a\u00020\u0003\u0012\u0006\u0010'\u001a\u00020\u0003\u0012\u0006\u0010(\u001a\u00020\u0003\u0012\u0006\u0010)\u001a\u00020\u0003\u0012\u0006\u0010*\u001a\u00020\u0003\u0012\u0006\u0010+\u001a\u00020\u0003\u0012\u0006\u0010,\u001a\u00020\u0003\u0012\u0006\u0010-\u001a\u00020\u0003\u0012\u0006\u0010.\u001a\u00020\u0003\u0012\u0006\u0010/\u001a\u00020\u0003\u0012\u0006\u00100\u001a\u00020\u0003\u0012\u0006\u00101\u001a\u00020\u0003\u0012\u0006\u00102\u001a\u00020\u0003\u0012\u0006\u00103\u001a\u00020\u0003\u0012\u0006\u00104\u001a\u00020\u0003\u0012\u0006\u00105\u001a\u00020\u0003\u0012\u0006\u00106\u001a\u00020\u0003\u0012\u0006\u00107\u001a\u00020\u0003\u0012\u0006\u00108\u001a\u00020\u0003\u0012\u0006\u00109\u001a\u00020\u0003\u0012\u0006\u0010:\u001a\u00020\u0003¢\u0006\u0002\u0010;J\n\u0010¡\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¢\u0001\u001a\u00020\u0003HÆ\u0003J\u001a\u0010£\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000fj\b\u0012\u0004\u0012\u00020\u0003`\u0010HÆ\u0003J\n\u0010¤\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¥\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¦\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010§\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¨\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010©\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ª\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010«\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010¬\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010®\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¯\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010°\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010±\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010²\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010³\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010´\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010µ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¶\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010·\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010¸\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¹\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010º\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010»\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¼\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010½\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¾\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¿\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010À\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Á\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Â\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010Ã\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ä\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Å\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Æ\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ç\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010È\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010É\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ê\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ë\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ì\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Í\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Î\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ï\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ð\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ñ\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ò\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ó\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ô\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Õ\u0001\u001a\u00020\u0003HÆ\u0003JÊ\u0004\u0010Ö\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\u0018\b\u0002\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000fj\b\u0012\u0004\u0012\u00020\u0003`\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010%\u001a\u00020\u00032\b\b\u0002\u0010&\u001a\u00020\u00032\b\b\u0002\u0010'\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020\u00032\b\b\u0002\u0010)\u001a\u00020\u00032\b\b\u0002\u0010*\u001a\u00020\u00032\b\b\u0002\u0010+\u001a\u00020\u00032\b\b\u0002\u0010,\u001a\u00020\u00032\b\b\u0002\u0010-\u001a\u00020\u00032\b\b\u0002\u0010.\u001a\u00020\u00032\b\b\u0002\u0010/\u001a\u00020\u00032\b\b\u0002\u00100\u001a\u00020\u00032\b\b\u0002\u00101\u001a\u00020\u00032\b\b\u0002\u00102\u001a\u00020\u00032\b\b\u0002\u00103\u001a\u00020\u00032\b\b\u0002\u00104\u001a\u00020\u00032\b\b\u0002\u00105\u001a\u00020\u00032\b\b\u0002\u00106\u001a\u00020\u00032\b\b\u0002\u00107\u001a\u00020\u00032\b\b\u0002\u00108\u001a\u00020\u00032\b\b\u0002\u00109\u001a\u00020\u00032\b\b\u0002\u0010:\u001a\u00020\u0003HÆ\u0001J\u0016\u0010×\u0001\u001a\u00030Ø\u00012\t\u0010Ù\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010Ú\u0001\u001a\u00030Û\u0001HÖ\u0001J\n\u0010Ü\u0001\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\"\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001c\u0010$\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010=\"\u0004\bA\u0010?R\u001c\u0010#\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010=\"\u0004\bC\u0010?R\u001a\u0010%\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010=\"\u0004\bE\u0010?R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010=\"\u0004\bG\u0010?R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bH\u0010=R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bI\u0010=R!\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000fj\b\u0012\u0004\u0012\u00020\u0003`\u0010¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010=\"\u0004\bM\u0010?R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bN\u0010=R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010=\"\u0004\bP\u0010?R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010=\"\u0004\bR\u0010?R\u001a\u00109\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010=\"\u0004\bT\u0010?R\u001a\u00107\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010=\"\u0004\bV\u0010?R\u001a\u00108\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010=\"\u0004\bX\u0010?R\u001a\u0010:\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010=\"\u0004\bZ\u0010?R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010=\"\u0004\b\\\u0010?R\u001c\u0010 \u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010=\"\u0004\b^\u0010?R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b_\u0010=R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b`\u0010=R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010=\"\u0004\bb\u0010?R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010=\"\u0004\bd\u0010?R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\be\u0010=R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010=\"\u0004\bg\u0010?R\u001c\u0010!\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010=\"\u0004\bi\u0010?R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010=\"\u0004\bk\u0010?R\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010=\"\u0004\bl\u0010?R\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010=\"\u0004\bn\u0010?R\u001a\u00106\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010=\"\u0004\bp\u0010?R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010=\"\u0004\br\u0010?R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bs\u0010=R\u001a\u00103\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bt\u0010=\"\u0004\bu\u0010?R\u001a\u0010.\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u0010=\"\u0004\bw\u0010?R\u001a\u00100\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bx\u0010=\"\u0004\by\u0010?R\u001a\u00105\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010=\"\u0004\b{\u0010?R\u001a\u00104\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b|\u0010=\"\u0004\b}\u0010?R\u001a\u0010/\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b~\u0010=\"\u0004\b\u007f\u0010?R\u001c\u00102\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0001\u0010=\"\u0005\b\u0081\u0001\u0010?R\u001c\u00101\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0001\u0010=\"\u0005\b\u0083\u0001\u0010?R\u001c\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0001\u0010=\"\u0005\b\u0085\u0001\u0010?R\u001c\u0010+\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0086\u0001\u0010=\"\u0005\b\u0087\u0001\u0010?R\u001c\u0010&\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0088\u0001\u0010=\"\u0005\b\u0089\u0001\u0010?R\u001c\u0010(\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008a\u0001\u0010=\"\u0005\b\u008b\u0001\u0010?R\u001c\u0010-\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008c\u0001\u0010=\"\u0005\b\u008d\u0001\u0010?R\u001c\u0010,\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008e\u0001\u0010=\"\u0005\b\u008f\u0001\u0010?R\u001c\u0010'\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0090\u0001\u0010=\"\u0005\b\u0091\u0001\u0010?R\u001c\u0010*\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0092\u0001\u0010=\"\u0005\b\u0093\u0001\u0010?R\u001c\u0010)\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0094\u0001\u0010=\"\u0005\b\u0095\u0001\u0010?R\u0012\u0010\u0005\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0096\u0001\u0010=R\u001e\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001c\u0010\u0011\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009b\u0001\u0010=\"\u0005\b\u009c\u0001\u0010?R\u001c\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009d\u0001\u0010=\"\u0005\b\u009e\u0001\u0010?R\u001c\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009f\u0001\u0010=\"\u0005\b \u0001\u0010?¨\u0006Ý\u0001"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/idp/IdpGenSubmit;", "", "dlno", "", "dob", "rtoCodeDLTr", "selectedDLSerList", "Lcom/nic/mparivahan/dlservices/data/model/idp/selectDLlist;", "pofbirth", "country", "passno", "passvaltill", "visano", "visavaltill", "cov_req", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "tovisit", "iscountryrestricted", "countryRestrictedReason", "isDlSerdisqualified", "dlSerdisqualifiedReason", "forAdd1", "forAdd2", "forAdd3", "forAddPinCode", "forNationMobNum", "emailID", "appliedIdpfromIndEmb", "indEmbName", "embPlace", "dateOfVerifEmb", "embEndorseNo", "idpcountryapplyfrom", "agentId", "agentPwd", "agentIpAddress", "agentServiceName", "presHouseNo", "presStreet", "presLocation", "presVillageOrTown", "presSubDistrict", "presDistrict", "presState", "presPincode", "perHouseNo", "perStreet", "perLocation", "permVillageOrTown", "perSubDistrict", "perDistrict", "perState", "perPinCode", "mobileNumber", "eKYCId", "eKYCOpted", "eKYCGender", "eKYCapplicantPhoto", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/dlservices/data/model/idp/selectDLlist;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAgentId", "()Ljava/lang/String;", "setAgentId", "(Ljava/lang/String;)V", "getAgentIpAddress", "setAgentIpAddress", "getAgentPwd", "setAgentPwd", "getAgentServiceName", "setAgentServiceName", "getAppliedIdpfromIndEmb", "setAppliedIdpfromIndEmb", "getCountry", "getCountryRestrictedReason", "getCov_req", "()Ljava/util/ArrayList;", "getDateOfVerifEmb", "setDateOfVerifEmb", "getDlSerdisqualifiedReason", "getDlno", "setDlno", "getDob", "setDob", "getEKYCGender", "setEKYCGender", "getEKYCId", "setEKYCId", "getEKYCOpted", "setEKYCOpted", "getEKYCapplicantPhoto", "setEKYCapplicantPhoto", "getEmailID", "setEmailID", "getEmbEndorseNo", "setEmbEndorseNo", "getEmbPlace", "getForAdd1", "getForAdd2", "setForAdd2", "getForAdd3", "setForAdd3", "getForAddPinCode", "getForNationMobNum", "setForNationMobNum", "getIdpcountryapplyfrom", "setIdpcountryapplyfrom", "getIndEmbName", "setIndEmbName", "setDlSerdisqualified", "getIscountryrestricted", "setIscountryrestricted", "getMobileNumber", "setMobileNumber", "getPassno", "setPassno", "getPassvaltill", "getPerDistrict", "setPerDistrict", "getPerHouseNo", "setPerHouseNo", "getPerLocation", "setPerLocation", "getPerPinCode", "setPerPinCode", "getPerState", "setPerState", "getPerStreet", "setPerStreet", "getPerSubDistrict", "setPerSubDistrict", "getPermVillageOrTown", "setPermVillageOrTown", "getPofbirth", "setPofbirth", "getPresDistrict", "setPresDistrict", "getPresHouseNo", "setPresHouseNo", "getPresLocation", "setPresLocation", "getPresPincode", "setPresPincode", "getPresState", "setPresState", "getPresStreet", "setPresStreet", "getPresSubDistrict", "setPresSubDistrict", "getPresVillageOrTown", "setPresVillageOrTown", "getRtoCodeDLTr", "getSelectedDLSerList", "()Lcom/nic/mparivahan/dlservices/data/model/idp/selectDLlist;", "setSelectedDLSerList", "(Lcom/nic/mparivahan/dlservices/data/model/idp/selectDLlist;)V", "getTovisit", "setTovisit", "getVisano", "setVisano", "getVisavaltill", "setVisavaltill", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class IdpGenSubmit {
    private String agentId;
    private String agentIpAddress;
    private String agentPwd;
    private String agentServiceName;
    private String appliedIdpfromIndEmb;
    private final String country;
    private final String countryRestrictedReason;
    private final ArrayList<String> cov_req;
    private String dateOfVerifEmb;
    private final String dlSerdisqualifiedReason;
    private String dlno;
    private String dob;
    private String eKYCGender;
    private String eKYCId;
    private String eKYCOpted;
    private String eKYCapplicantPhoto;
    private String emailID;
    private String embEndorseNo;
    private final String embPlace;
    private final String forAdd1;
    private String forAdd2;
    private String forAdd3;
    private final String forAddPinCode;
    private String forNationMobNum;
    private String idpcountryapplyfrom;
    private String indEmbName;
    private String isDlSerdisqualified;
    private String iscountryrestricted;
    private String mobileNumber;
    private String passno;
    private final String passvaltill;
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
    private final String rtoCodeDLTr;
    private selectDLlist selectedDLSerList;
    private String tovisit;
    private String visano;
    private String visavaltill;

    public IdpGenSubmit(String dlno, String dob, String rtoCodeDLTr, selectDLlist selectedDLSerList, String pofbirth, String country, String passno, String passvaltill, String visano, String visavaltill, ArrayList<String> cov_req, String tovisit, String iscountryrestricted, String countryRestrictedReason, String isDlSerdisqualified, String dlSerdisqualifiedReason, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String agentServiceName, String presHouseNo, String presStreet, String presLocation, String presVillageOrTown, String presSubDistrict, String presDistrict, String presState, String presPincode, String perHouseNo, String perStreet, String perLocation, String permVillageOrTown, String perSubDistrict, String perDistrict, String perState, String perPinCode, String mobileNumber, String eKYCId, String eKYCOpted, String eKYCGender, String eKYCapplicantPhoto) {
        Intrinsics.checkNotNullParameter(dlno, "dlno");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(rtoCodeDLTr, "rtoCodeDLTr");
        Intrinsics.checkNotNullParameter(selectedDLSerList, "selectedDLSerList");
        Intrinsics.checkNotNullParameter(pofbirth, "pofbirth");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(passno, "passno");
        Intrinsics.checkNotNullParameter(passvaltill, "passvaltill");
        Intrinsics.checkNotNullParameter(visano, "visano");
        Intrinsics.checkNotNullParameter(visavaltill, "visavaltill");
        Intrinsics.checkNotNullParameter(cov_req, "cov_req");
        Intrinsics.checkNotNullParameter(tovisit, "tovisit");
        Intrinsics.checkNotNullParameter(iscountryrestricted, "iscountryrestricted");
        Intrinsics.checkNotNullParameter(countryRestrictedReason, "countryRestrictedReason");
        Intrinsics.checkNotNullParameter(isDlSerdisqualified, "isDlSerdisqualified");
        Intrinsics.checkNotNullParameter(dlSerdisqualifiedReason, "dlSerdisqualifiedReason");
        Intrinsics.checkNotNullParameter(agentServiceName, "agentServiceName");
        Intrinsics.checkNotNullParameter(presHouseNo, "presHouseNo");
        Intrinsics.checkNotNullParameter(presStreet, "presStreet");
        Intrinsics.checkNotNullParameter(presLocation, "presLocation");
        Intrinsics.checkNotNullParameter(presVillageOrTown, "presVillageOrTown");
        Intrinsics.checkNotNullParameter(presSubDistrict, "presSubDistrict");
        Intrinsics.checkNotNullParameter(presDistrict, "presDistrict");
        Intrinsics.checkNotNullParameter(presState, "presState");
        Intrinsics.checkNotNullParameter(presPincode, "presPincode");
        Intrinsics.checkNotNullParameter(perHouseNo, "perHouseNo");
        Intrinsics.checkNotNullParameter(perStreet, "perStreet");
        Intrinsics.checkNotNullParameter(perLocation, "perLocation");
        Intrinsics.checkNotNullParameter(permVillageOrTown, "permVillageOrTown");
        Intrinsics.checkNotNullParameter(perSubDistrict, "perSubDistrict");
        Intrinsics.checkNotNullParameter(perDistrict, "perDistrict");
        Intrinsics.checkNotNullParameter(perState, "perState");
        Intrinsics.checkNotNullParameter(perPinCode, "perPinCode");
        Intrinsics.checkNotNullParameter(mobileNumber, "mobileNumber");
        Intrinsics.checkNotNullParameter(eKYCId, "eKYCId");
        Intrinsics.checkNotNullParameter(eKYCOpted, "eKYCOpted");
        Intrinsics.checkNotNullParameter(eKYCGender, "eKYCGender");
        Intrinsics.checkNotNullParameter(eKYCapplicantPhoto, "eKYCapplicantPhoto");
        this.dlno = dlno;
        this.dob = dob;
        this.rtoCodeDLTr = rtoCodeDLTr;
        this.selectedDLSerList = selectedDLSerList;
        this.pofbirth = pofbirth;
        this.country = country;
        this.passno = passno;
        this.passvaltill = passvaltill;
        this.visano = visano;
        this.visavaltill = visavaltill;
        this.cov_req = cov_req;
        this.tovisit = tovisit;
        this.iscountryrestricted = iscountryrestricted;
        this.countryRestrictedReason = countryRestrictedReason;
        this.isDlSerdisqualified = isDlSerdisqualified;
        this.dlSerdisqualifiedReason = dlSerdisqualifiedReason;
        this.forAdd1 = str;
        this.forAdd2 = str2;
        this.forAdd3 = str3;
        this.forAddPinCode = str4;
        this.forNationMobNum = str5;
        this.emailID = str6;
        this.appliedIdpfromIndEmb = str7;
        this.indEmbName = str8;
        this.embPlace = str9;
        this.dateOfVerifEmb = str10;
        this.embEndorseNo = str11;
        this.idpcountryapplyfrom = str12;
        this.agentId = str13;
        this.agentPwd = str14;
        this.agentIpAddress = str15;
        this.agentServiceName = agentServiceName;
        this.presHouseNo = presHouseNo;
        this.presStreet = presStreet;
        this.presLocation = presLocation;
        this.presVillageOrTown = presVillageOrTown;
        this.presSubDistrict = presSubDistrict;
        this.presDistrict = presDistrict;
        this.presState = presState;
        this.presPincode = presPincode;
        this.perHouseNo = perHouseNo;
        this.perStreet = perStreet;
        this.perLocation = perLocation;
        this.permVillageOrTown = permVillageOrTown;
        this.perSubDistrict = perSubDistrict;
        this.perDistrict = perDistrict;
        this.perState = perState;
        this.perPinCode = perPinCode;
        this.mobileNumber = mobileNumber;
        this.eKYCId = eKYCId;
        this.eKYCOpted = eKYCOpted;
        this.eKYCGender = eKYCGender;
        this.eKYCapplicantPhoto = eKYCapplicantPhoto;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDlno() {
        return this.dlno;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getVisavaltill() {
        return this.visavaltill;
    }

    public final ArrayList<String> component11() {
        return this.cov_req;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getTovisit() {
        return this.tovisit;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getIscountryrestricted() {
        return this.iscountryrestricted;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getCountryRestrictedReason() {
        return this.countryRestrictedReason;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getIsDlSerdisqualified() {
        return this.isDlSerdisqualified;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getDlSerdisqualifiedReason() {
        return this.dlSerdisqualifiedReason;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getForAdd1() {
        return this.forAdd1;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getForAdd2() {
        return this.forAdd2;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getForAdd3() {
        return this.forAdd3;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDob() {
        return this.dob;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getForAddPinCode() {
        return this.forAddPinCode;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getForNationMobNum() {
        return this.forNationMobNum;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getEmailID() {
        return this.emailID;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getAppliedIdpfromIndEmb() {
        return this.appliedIdpfromIndEmb;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getIndEmbName() {
        return this.indEmbName;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getEmbPlace() {
        return this.embPlace;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getDateOfVerifEmb() {
        return this.dateOfVerifEmb;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getEmbEndorseNo() {
        return this.embEndorseNo;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getIdpcountryapplyfrom() {
        return this.idpcountryapplyfrom;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getAgentId() {
        return this.agentId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRtoCodeDLTr() {
        return this.rtoCodeDLTr;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getAgentPwd() {
        return this.agentPwd;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getAgentIpAddress() {
        return this.agentIpAddress;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getAgentServiceName() {
        return this.agentServiceName;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getPresHouseNo() {
        return this.presHouseNo;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final String getPresStreet() {
        return this.presStreet;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final String getPresLocation() {
        return this.presLocation;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final String getPresVillageOrTown() {
        return this.presVillageOrTown;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final String getPresSubDistrict() {
        return this.presSubDistrict;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final String getPresDistrict() {
        return this.presDistrict;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final String getPresState() {
        return this.presState;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final selectDLlist getSelectedDLSerList() {
        return this.selectedDLSerList;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final String getPresPincode() {
        return this.presPincode;
    }

    /* JADX INFO: renamed from: component41, reason: from getter */
    public final String getPerHouseNo() {
        return this.perHouseNo;
    }

    /* JADX INFO: renamed from: component42, reason: from getter */
    public final String getPerStreet() {
        return this.perStreet;
    }

    /* JADX INFO: renamed from: component43, reason: from getter */
    public final String getPerLocation() {
        return this.perLocation;
    }

    /* JADX INFO: renamed from: component44, reason: from getter */
    public final String getPermVillageOrTown() {
        return this.permVillageOrTown;
    }

    /* JADX INFO: renamed from: component45, reason: from getter */
    public final String getPerSubDistrict() {
        return this.perSubDistrict;
    }

    /* JADX INFO: renamed from: component46, reason: from getter */
    public final String getPerDistrict() {
        return this.perDistrict;
    }

    /* JADX INFO: renamed from: component47, reason: from getter */
    public final String getPerState() {
        return this.perState;
    }

    /* JADX INFO: renamed from: component48, reason: from getter */
    public final String getPerPinCode() {
        return this.perPinCode;
    }

    /* JADX INFO: renamed from: component49, reason: from getter */
    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPofbirth() {
        return this.pofbirth;
    }

    /* JADX INFO: renamed from: component50, reason: from getter */
    public final String getEKYCId() {
        return this.eKYCId;
    }

    /* JADX INFO: renamed from: component51, reason: from getter */
    public final String getEKYCOpted() {
        return this.eKYCOpted;
    }

    /* JADX INFO: renamed from: component52, reason: from getter */
    public final String getEKYCGender() {
        return this.eKYCGender;
    }

    /* JADX INFO: renamed from: component53, reason: from getter */
    public final String getEKYCapplicantPhoto() {
        return this.eKYCapplicantPhoto;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPassno() {
        return this.passno;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPassvaltill() {
        return this.passvaltill;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getVisano() {
        return this.visano;
    }

    public final IdpGenSubmit copy(String dlno, String dob, String rtoCodeDLTr, selectDLlist selectedDLSerList, String pofbirth, String country, String passno, String passvaltill, String visano, String visavaltill, ArrayList<String> cov_req, String tovisit, String iscountryrestricted, String countryRestrictedReason, String isDlSerdisqualified, String dlSerdisqualifiedReason, String forAdd1, String forAdd2, String forAdd3, String forAddPinCode, String forNationMobNum, String emailID, String appliedIdpfromIndEmb, String indEmbName, String embPlace, String dateOfVerifEmb, String embEndorseNo, String idpcountryapplyfrom, String agentId, String agentPwd, String agentIpAddress, String agentServiceName, String presHouseNo, String presStreet, String presLocation, String presVillageOrTown, String presSubDistrict, String presDistrict, String presState, String presPincode, String perHouseNo, String perStreet, String perLocation, String permVillageOrTown, String perSubDistrict, String perDistrict, String perState, String perPinCode, String mobileNumber, String eKYCId, String eKYCOpted, String eKYCGender, String eKYCapplicantPhoto) {
        Intrinsics.checkNotNullParameter(dlno, "dlno");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(rtoCodeDLTr, "rtoCodeDLTr");
        Intrinsics.checkNotNullParameter(selectedDLSerList, "selectedDLSerList");
        Intrinsics.checkNotNullParameter(pofbirth, "pofbirth");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(passno, "passno");
        Intrinsics.checkNotNullParameter(passvaltill, "passvaltill");
        Intrinsics.checkNotNullParameter(visano, "visano");
        Intrinsics.checkNotNullParameter(visavaltill, "visavaltill");
        Intrinsics.checkNotNullParameter(cov_req, "cov_req");
        Intrinsics.checkNotNullParameter(tovisit, "tovisit");
        Intrinsics.checkNotNullParameter(iscountryrestricted, "iscountryrestricted");
        Intrinsics.checkNotNullParameter(countryRestrictedReason, "countryRestrictedReason");
        Intrinsics.checkNotNullParameter(isDlSerdisqualified, "isDlSerdisqualified");
        Intrinsics.checkNotNullParameter(dlSerdisqualifiedReason, "dlSerdisqualifiedReason");
        Intrinsics.checkNotNullParameter(agentServiceName, "agentServiceName");
        Intrinsics.checkNotNullParameter(presHouseNo, "presHouseNo");
        Intrinsics.checkNotNullParameter(presStreet, "presStreet");
        Intrinsics.checkNotNullParameter(presLocation, "presLocation");
        Intrinsics.checkNotNullParameter(presVillageOrTown, "presVillageOrTown");
        Intrinsics.checkNotNullParameter(presSubDistrict, "presSubDistrict");
        Intrinsics.checkNotNullParameter(presDistrict, "presDistrict");
        Intrinsics.checkNotNullParameter(presState, "presState");
        Intrinsics.checkNotNullParameter(presPincode, "presPincode");
        Intrinsics.checkNotNullParameter(perHouseNo, "perHouseNo");
        Intrinsics.checkNotNullParameter(perStreet, "perStreet");
        Intrinsics.checkNotNullParameter(perLocation, "perLocation");
        Intrinsics.checkNotNullParameter(permVillageOrTown, "permVillageOrTown");
        Intrinsics.checkNotNullParameter(perSubDistrict, "perSubDistrict");
        Intrinsics.checkNotNullParameter(perDistrict, "perDistrict");
        Intrinsics.checkNotNullParameter(perState, "perState");
        Intrinsics.checkNotNullParameter(perPinCode, "perPinCode");
        Intrinsics.checkNotNullParameter(mobileNumber, "mobileNumber");
        Intrinsics.checkNotNullParameter(eKYCId, "eKYCId");
        Intrinsics.checkNotNullParameter(eKYCOpted, "eKYCOpted");
        Intrinsics.checkNotNullParameter(eKYCGender, "eKYCGender");
        Intrinsics.checkNotNullParameter(eKYCapplicantPhoto, "eKYCapplicantPhoto");
        return new IdpGenSubmit(dlno, dob, rtoCodeDLTr, selectedDLSerList, pofbirth, country, passno, passvaltill, visano, visavaltill, cov_req, tovisit, iscountryrestricted, countryRestrictedReason, isDlSerdisqualified, dlSerdisqualifiedReason, forAdd1, forAdd2, forAdd3, forAddPinCode, forNationMobNum, emailID, appliedIdpfromIndEmb, indEmbName, embPlace, dateOfVerifEmb, embEndorseNo, idpcountryapplyfrom, agentId, agentPwd, agentIpAddress, agentServiceName, presHouseNo, presStreet, presLocation, presVillageOrTown, presSubDistrict, presDistrict, presState, presPincode, perHouseNo, perStreet, perLocation, permVillageOrTown, perSubDistrict, perDistrict, perState, perPinCode, mobileNumber, eKYCId, eKYCOpted, eKYCGender, eKYCapplicantPhoto);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdpGenSubmit)) {
            return false;
        }
        IdpGenSubmit idpGenSubmit = (IdpGenSubmit) other;
        return Intrinsics.areEqual(this.dlno, idpGenSubmit.dlno) && Intrinsics.areEqual(this.dob, idpGenSubmit.dob) && Intrinsics.areEqual(this.rtoCodeDLTr, idpGenSubmit.rtoCodeDLTr) && Intrinsics.areEqual(this.selectedDLSerList, idpGenSubmit.selectedDLSerList) && Intrinsics.areEqual(this.pofbirth, idpGenSubmit.pofbirth) && Intrinsics.areEqual(this.country, idpGenSubmit.country) && Intrinsics.areEqual(this.passno, idpGenSubmit.passno) && Intrinsics.areEqual(this.passvaltill, idpGenSubmit.passvaltill) && Intrinsics.areEqual(this.visano, idpGenSubmit.visano) && Intrinsics.areEqual(this.visavaltill, idpGenSubmit.visavaltill) && Intrinsics.areEqual(this.cov_req, idpGenSubmit.cov_req) && Intrinsics.areEqual(this.tovisit, idpGenSubmit.tovisit) && Intrinsics.areEqual(this.iscountryrestricted, idpGenSubmit.iscountryrestricted) && Intrinsics.areEqual(this.countryRestrictedReason, idpGenSubmit.countryRestrictedReason) && Intrinsics.areEqual(this.isDlSerdisqualified, idpGenSubmit.isDlSerdisqualified) && Intrinsics.areEqual(this.dlSerdisqualifiedReason, idpGenSubmit.dlSerdisqualifiedReason) && Intrinsics.areEqual(this.forAdd1, idpGenSubmit.forAdd1) && Intrinsics.areEqual(this.forAdd2, idpGenSubmit.forAdd2) && Intrinsics.areEqual(this.forAdd3, idpGenSubmit.forAdd3) && Intrinsics.areEqual(this.forAddPinCode, idpGenSubmit.forAddPinCode) && Intrinsics.areEqual(this.forNationMobNum, idpGenSubmit.forNationMobNum) && Intrinsics.areEqual(this.emailID, idpGenSubmit.emailID) && Intrinsics.areEqual(this.appliedIdpfromIndEmb, idpGenSubmit.appliedIdpfromIndEmb) && Intrinsics.areEqual(this.indEmbName, idpGenSubmit.indEmbName) && Intrinsics.areEqual(this.embPlace, idpGenSubmit.embPlace) && Intrinsics.areEqual(this.dateOfVerifEmb, idpGenSubmit.dateOfVerifEmb) && Intrinsics.areEqual(this.embEndorseNo, idpGenSubmit.embEndorseNo) && Intrinsics.areEqual(this.idpcountryapplyfrom, idpGenSubmit.idpcountryapplyfrom) && Intrinsics.areEqual(this.agentId, idpGenSubmit.agentId) && Intrinsics.areEqual(this.agentPwd, idpGenSubmit.agentPwd) && Intrinsics.areEqual(this.agentIpAddress, idpGenSubmit.agentIpAddress) && Intrinsics.areEqual(this.agentServiceName, idpGenSubmit.agentServiceName) && Intrinsics.areEqual(this.presHouseNo, idpGenSubmit.presHouseNo) && Intrinsics.areEqual(this.presStreet, idpGenSubmit.presStreet) && Intrinsics.areEqual(this.presLocation, idpGenSubmit.presLocation) && Intrinsics.areEqual(this.presVillageOrTown, idpGenSubmit.presVillageOrTown) && Intrinsics.areEqual(this.presSubDistrict, idpGenSubmit.presSubDistrict) && Intrinsics.areEqual(this.presDistrict, idpGenSubmit.presDistrict) && Intrinsics.areEqual(this.presState, idpGenSubmit.presState) && Intrinsics.areEqual(this.presPincode, idpGenSubmit.presPincode) && Intrinsics.areEqual(this.perHouseNo, idpGenSubmit.perHouseNo) && Intrinsics.areEqual(this.perStreet, idpGenSubmit.perStreet) && Intrinsics.areEqual(this.perLocation, idpGenSubmit.perLocation) && Intrinsics.areEqual(this.permVillageOrTown, idpGenSubmit.permVillageOrTown) && Intrinsics.areEqual(this.perSubDistrict, idpGenSubmit.perSubDistrict) && Intrinsics.areEqual(this.perDistrict, idpGenSubmit.perDistrict) && Intrinsics.areEqual(this.perState, idpGenSubmit.perState) && Intrinsics.areEqual(this.perPinCode, idpGenSubmit.perPinCode) && Intrinsics.areEqual(this.mobileNumber, idpGenSubmit.mobileNumber) && Intrinsics.areEqual(this.eKYCId, idpGenSubmit.eKYCId) && Intrinsics.areEqual(this.eKYCOpted, idpGenSubmit.eKYCOpted) && Intrinsics.areEqual(this.eKYCGender, idpGenSubmit.eKYCGender) && Intrinsics.areEqual(this.eKYCapplicantPhoto, idpGenSubmit.eKYCapplicantPhoto);
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

    public final String getAppliedIdpfromIndEmb() {
        return this.appliedIdpfromIndEmb;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getCountryRestrictedReason() {
        return this.countryRestrictedReason;
    }

    public final ArrayList<String> getCov_req() {
        return this.cov_req;
    }

    public final String getDateOfVerifEmb() {
        return this.dateOfVerifEmb;
    }

    public final String getDlSerdisqualifiedReason() {
        return this.dlSerdisqualifiedReason;
    }

    public final String getDlno() {
        return this.dlno;
    }

    public final String getDob() {
        return this.dob;
    }

    public final String getEKYCGender() {
        return this.eKYCGender;
    }

    public final String getEKYCId() {
        return this.eKYCId;
    }

    public final String getEKYCOpted() {
        return this.eKYCOpted;
    }

    public final String getEKYCapplicantPhoto() {
        return this.eKYCapplicantPhoto;
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

    public final String getRtoCodeDLTr() {
        return this.rtoCodeDLTr;
    }

    public final selectDLlist getSelectedDLSerList() {
        return this.selectedDLSerList;
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

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((this.dlno.hashCode() * 31) + this.dob.hashCode()) * 31) + this.rtoCodeDLTr.hashCode()) * 31) + this.selectedDLSerList.hashCode()) * 31) + this.pofbirth.hashCode()) * 31) + this.country.hashCode()) * 31) + this.passno.hashCode()) * 31) + this.passvaltill.hashCode()) * 31) + this.visano.hashCode()) * 31) + this.visavaltill.hashCode()) * 31) + this.cov_req.hashCode()) * 31) + this.tovisit.hashCode()) * 31) + this.iscountryrestricted.hashCode()) * 31) + this.countryRestrictedReason.hashCode()) * 31) + this.isDlSerdisqualified.hashCode()) * 31) + this.dlSerdisqualifiedReason.hashCode()) * 31;
        String str = this.forAdd1;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.forAdd2;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.forAdd3;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.forAddPinCode;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.forNationMobNum;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.emailID;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.appliedIdpfromIndEmb;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.indEmbName;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.embPlace;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.dateOfVerifEmb;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.embEndorseNo;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.idpcountryapplyfrom;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.agentId;
        int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.agentPwd;
        int iHashCode15 = (iHashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.agentIpAddress;
        return ((((((((((((((((((((((((((((((((((((((((((((iHashCode15 + (str15 != null ? str15.hashCode() : 0)) * 31) + this.agentServiceName.hashCode()) * 31) + this.presHouseNo.hashCode()) * 31) + this.presStreet.hashCode()) * 31) + this.presLocation.hashCode()) * 31) + this.presVillageOrTown.hashCode()) * 31) + this.presSubDistrict.hashCode()) * 31) + this.presDistrict.hashCode()) * 31) + this.presState.hashCode()) * 31) + this.presPincode.hashCode()) * 31) + this.perHouseNo.hashCode()) * 31) + this.perStreet.hashCode()) * 31) + this.perLocation.hashCode()) * 31) + this.permVillageOrTown.hashCode()) * 31) + this.perSubDistrict.hashCode()) * 31) + this.perDistrict.hashCode()) * 31) + this.perState.hashCode()) * 31) + this.perPinCode.hashCode()) * 31) + this.mobileNumber.hashCode()) * 31) + this.eKYCId.hashCode()) * 31) + this.eKYCOpted.hashCode()) * 31) + this.eKYCGender.hashCode()) * 31) + this.eKYCapplicantPhoto.hashCode();
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
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.agentServiceName = str;
    }

    public final void setAppliedIdpfromIndEmb(String str) {
        this.appliedIdpfromIndEmb = str;
    }

    public final void setDateOfVerifEmb(String str) {
        this.dateOfVerifEmb = str;
    }

    public final void setDlSerdisqualified(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.isDlSerdisqualified = str;
    }

    public final void setDlno(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dlno = str;
    }

    public final void setDob(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dob = str;
    }

    public final void setEKYCGender(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.eKYCGender = str;
    }

    public final void setEKYCId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.eKYCId = str;
    }

    public final void setEKYCOpted(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.eKYCOpted = str;
    }

    public final void setEKYCapplicantPhoto(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.eKYCapplicantPhoto = str;
    }

    public final void setEmailID(String str) {
        this.emailID = str;
    }

    public final void setEmbEndorseNo(String str) {
        this.embEndorseNo = str;
    }

    public final void setForAdd2(String str) {
        this.forAdd2 = str;
    }

    public final void setForAdd3(String str) {
        this.forAdd3 = str;
    }

    public final void setForNationMobNum(String str) {
        this.forNationMobNum = str;
    }

    public final void setIdpcountryapplyfrom(String str) {
        this.idpcountryapplyfrom = str;
    }

    public final void setIndEmbName(String str) {
        this.indEmbName = str;
    }

    public final void setIscountryrestricted(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.iscountryrestricted = str;
    }

    public final void setMobileNumber(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mobileNumber = str;
    }

    public final void setPassno(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.passno = str;
    }

    public final void setPerDistrict(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.perDistrict = str;
    }

    public final void setPerHouseNo(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.perHouseNo = str;
    }

    public final void setPerLocation(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.perLocation = str;
    }

    public final void setPerPinCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.perPinCode = str;
    }

    public final void setPerState(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.perState = str;
    }

    public final void setPerStreet(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.perStreet = str;
    }

    public final void setPerSubDistrict(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.perSubDistrict = str;
    }

    public final void setPermVillageOrTown(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.permVillageOrTown = str;
    }

    public final void setPofbirth(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pofbirth = str;
    }

    public final void setPresDistrict(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.presDistrict = str;
    }

    public final void setPresHouseNo(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.presHouseNo = str;
    }

    public final void setPresLocation(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.presLocation = str;
    }

    public final void setPresPincode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.presPincode = str;
    }

    public final void setPresState(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.presState = str;
    }

    public final void setPresStreet(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.presStreet = str;
    }

    public final void setPresSubDistrict(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.presSubDistrict = str;
    }

    public final void setPresVillageOrTown(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.presVillageOrTown = str;
    }

    public final void setSelectedDLSerList(selectDLlist selectdllist) {
        Intrinsics.checkNotNullParameter(selectdllist, "<set-?>");
        this.selectedDLSerList = selectdllist;
    }

    public final void setTovisit(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.tovisit = str;
    }

    public final void setVisano(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.visano = str;
    }

    public final void setVisavaltill(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.visavaltill = str;
    }

    public String toString() {
        return "IdpGenSubmit(dlno=" + this.dlno + ", dob=" + this.dob + ", rtoCodeDLTr=" + this.rtoCodeDLTr + ", selectedDLSerList=" + this.selectedDLSerList + ", pofbirth=" + this.pofbirth + ", country=" + this.country + ", passno=" + this.passno + ", passvaltill=" + this.passvaltill + ", visano=" + this.visano + ", visavaltill=" + this.visavaltill + ", cov_req=" + this.cov_req + ", tovisit=" + this.tovisit + ", iscountryrestricted=" + this.iscountryrestricted + ", countryRestrictedReason=" + this.countryRestrictedReason + ", isDlSerdisqualified=" + this.isDlSerdisqualified + ", dlSerdisqualifiedReason=" + this.dlSerdisqualifiedReason + ", forAdd1=" + this.forAdd1 + ", forAdd2=" + this.forAdd2 + ", forAdd3=" + this.forAdd3 + ", forAddPinCode=" + this.forAddPinCode + ", forNationMobNum=" + this.forNationMobNum + ", emailID=" + this.emailID + ", appliedIdpfromIndEmb=" + this.appliedIdpfromIndEmb + ", indEmbName=" + this.indEmbName + ", embPlace=" + this.embPlace + ", dateOfVerifEmb=" + this.dateOfVerifEmb + ", embEndorseNo=" + this.embEndorseNo + ", idpcountryapplyfrom=" + this.idpcountryapplyfrom + ", agentId=" + this.agentId + ", agentPwd=" + this.agentPwd + ", agentIpAddress=" + this.agentIpAddress + ", agentServiceName=" + this.agentServiceName + ", presHouseNo=" + this.presHouseNo + ", presStreet=" + this.presStreet + ", presLocation=" + this.presLocation + ", presVillageOrTown=" + this.presVillageOrTown + ", presSubDistrict=" + this.presSubDistrict + ", presDistrict=" + this.presDistrict + ", presState=" + this.presState + ", presPincode=" + this.presPincode + ", perHouseNo=" + this.perHouseNo + ", perStreet=" + this.perStreet + ", perLocation=" + this.perLocation + ", permVillageOrTown=" + this.permVillageOrTown + ", perSubDistrict=" + this.perSubDistrict + ", perDistrict=" + this.perDistrict + ", perState=" + this.perState + ", perPinCode=" + this.perPinCode + ", mobileNumber=" + this.mobileNumber + ", eKYCId=" + this.eKYCId + ", eKYCOpted=" + this.eKYCOpted + ", eKYCGender=" + this.eKYCGender + ", eKYCapplicantPhoto=" + this.eKYCapplicantPhoto + ')';
    }
}
