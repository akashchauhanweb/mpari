package com.nic.mparivahan.Dl.Model;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0003\b¢\u0001\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00ad\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u0005\u0012\u0006\u0010\u001f\u001a\u00020\u0005\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0005\u0012\u0006\u0010\"\u001a\u00020\u0003\u0012\u0006\u0010#\u001a\u00020\u0003\u0012\u0006\u0010$\u001a\u00020\u0005\u0012\u0006\u0010%\u001a\u00020\u0003\u0012\u0006\u0010&\u001a\u00020\u0005\u0012\u0006\u0010'\u001a\u00020\u0005\u0012\u0006\u0010(\u001a\u00020\u0005\u0012\u0006\u0010)\u001a\u00020\u0005\u0012\u0006\u0010*\u001a\u00020\u0003\u0012\u0006\u0010+\u001a\u00020\u0005\u0012\u0006\u0010,\u001a\u00020\u0003\u0012\u0006\u0010-\u001a\u00020\u0003\u0012\u0006\u0010.\u001a\u00020\u0005\u0012\u0006\u0010/\u001a\u00020\u0005\u0012\u0006\u00100\u001a\u00020\u0005\u0012\u0006\u00101\u001a\u00020\u0003\u0012\u0006\u00102\u001a\u00020\u0003\u0012\u0006\u00103\u001a\u00020\u0003\u0012\u0006\u00104\u001a\u00020\u0003\u0012\u0006\u00105\u001a\u00020\u0003\u0012\u0006\u00106\u001a\u00020\u0003\u0012\u0006\u00107\u001a\u00020\u0003\u0012\u0006\u00108\u001a\u00020\u0003¢\u0006\u0002\u00109J\t\u0010q\u001a\u00020\u0003HÆ\u0003J\t\u0010r\u001a\u00020\u0005HÆ\u0003J\t\u0010s\u001a\u00020\u0003HÆ\u0003J\t\u0010t\u001a\u00020\u0005HÆ\u0003J\t\u0010u\u001a\u00020\u0005HÆ\u0003J\t\u0010v\u001a\u00020\u0005HÆ\u0003J\t\u0010w\u001a\u00020\u0005HÆ\u0003J\t\u0010x\u001a\u00020\u0005HÆ\u0003J\t\u0010y\u001a\u00020\u0005HÆ\u0003J\t\u0010z\u001a\u00020\u0005HÆ\u0003J\t\u0010{\u001a\u00020\u0005HÆ\u0003J\t\u0010|\u001a\u00020\u0005HÆ\u0003J\t\u0010}\u001a\u00020\u0005HÆ\u0003J\t\u0010~\u001a\u00020\u0003HÆ\u0003J\t\u0010\u007f\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0080\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0081\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0082\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0083\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0086\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0088\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0089\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008a\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u008c\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008d\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u008e\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u008f\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0090\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0091\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0092\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0093\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0094\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0095\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0096\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0097\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0098\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0099\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009a\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009b\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009c\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009d\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u009e\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009f\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010 \u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¡\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¢\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010£\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010¤\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¥\u0001\u001a\u00020\u0003HÆ\u0003J\u009c\u0004\u0010¦\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00052\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u00052\b\b\u0002\u0010%\u001a\u00020\u00032\b\b\u0002\u0010&\u001a\u00020\u00052\b\b\u0002\u0010'\u001a\u00020\u00052\b\b\u0002\u0010(\u001a\u00020\u00052\b\b\u0002\u0010)\u001a\u00020\u00052\b\b\u0002\u0010*\u001a\u00020\u00032\b\b\u0002\u0010+\u001a\u00020\u00052\b\b\u0002\u0010,\u001a\u00020\u00032\b\b\u0002\u0010-\u001a\u00020\u00032\b\b\u0002\u0010.\u001a\u00020\u00052\b\b\u0002\u0010/\u001a\u00020\u00052\b\b\u0002\u00100\u001a\u00020\u00052\b\b\u0002\u00101\u001a\u00020\u00032\b\b\u0002\u00102\u001a\u00020\u00032\b\b\u0002\u00103\u001a\u00020\u00032\b\b\u0002\u00104\u001a\u00020\u00032\b\b\u0002\u00105\u001a\u00020\u00032\b\b\u0002\u00106\u001a\u00020\u00032\b\b\u0002\u00107\u001a\u00020\u00032\b\b\u0002\u00108\u001a\u00020\u0003HÆ\u0001J\u0016\u0010§\u0001\u001a\u00030¨\u00012\t\u0010©\u0001\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\u000b\u0010ª\u0001\u001a\u00030«\u0001HÖ\u0001J\n\u0010¬\u0001\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b>\u0010=R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b?\u0010=R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b@\u0010=R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bA\u0010=R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bB\u0010=R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u0010;R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u0010;R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bE\u0010=R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u0010;R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bG\u0010=R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bH\u0010=R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bI\u0010=R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010=R\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bK\u0010=R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bL\u0010=R\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bM\u0010=R\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bN\u0010=R\u0011\u0010\u0017\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bO\u0010=R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bP\u0010;R\u0011\u0010\u0019\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010=R\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bR\u0010;R\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bS\u0010;R\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bT\u0010;R\u0011\u0010\u001d\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bU\u0010=R\u0011\u0010\u001e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bV\u0010=R\u0011\u0010\u001f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bW\u0010=R\u0011\u0010 \u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bX\u0010;R\u0011\u0010!\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bY\u0010=R\u0011\u0010\"\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010;R\u0011\u0010#\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b[\u0010;R\u0011\u0010$\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010=R\u0011\u0010%\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b]\u0010;R\u0011\u0010&\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b^\u0010=R\u0011\u0010'\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b_\u0010=R\u0011\u0010(\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b`\u0010=R\u0011\u0010)\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\ba\u0010=R\u0011\u0010*\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bb\u0010;R\u0011\u0010+\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bc\u0010=R\u0011\u0010,\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bd\u0010;R\u0011\u0010-\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\be\u0010;R\u0011\u0010.\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bf\u0010=R\u0011\u0010/\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bg\u0010=R\u0011\u00100\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bh\u0010=R\u0011\u00101\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bi\u0010;R\u0011\u00102\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bj\u0010;R\u0011\u00103\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bk\u0010;R\u0011\u00104\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bl\u0010;R\u0011\u00105\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bm\u0010;R\u0011\u00106\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bn\u0010;R\u0011\u00107\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bo\u0010;R\u0011\u00108\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bp\u0010;¨\u0006\u00ad\u0001"}, d2 = {"Lcom/nic/mparivahan/Dl/Model/Dlobj;", "Ljava/io/Serializable;", "bioid", "", "dlAuthCov", "", "dlAuthDt", "dlAuthIssauth", "dlAuthNo", "dlBioId", "dlDigest", "dlDispatchStatus", "dlEndorseAuth", "dlEndorsedt", "dlEndorseno", "dlEndorsetime", "dlHlValdfrDt", "dlHlValdtoDate", "dlHlValdtoDt", "dlHzValdfrDt", "dlHzValdtoDate", "dlHzValdtoDt", "dlInvcrgNo", "dlIssueDate", "dlIssueauth", "dlIssuedesig", "dlIssuedt", "dlLatestTrcode", "dlLicno", "dlNtValdfrDt", "dlNtValdtoDate", "dlNtValdtoDt", "dlOldLicno", "dlPrintDate", "dlPrintStatus", "dlRecGenesis", "dlRemarks", "dlRtoCode", "dlSeqno", "dlStateCode", "dlStatus", "dlTokenId", "dlTrValdfrDt", "dlTrValdtoDate", "dlTrValdtoDt", "dlUsid", "dlolaCode", "enforceEndDate", "enforceFromDate", "enforceRemark", "olaName", "olacode", "omOfficeTownname", "omRtoFullname", "omRtoShortname", "stateName", "statecd", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBioid", "()Ljava/lang/String;", "getDlAuthCov", "()Ljava/lang/Object;", "getDlAuthDt", "getDlAuthIssauth", "getDlAuthNo", "getDlBioId", "getDlDigest", "getDlDispatchStatus", "getDlEndorseAuth", "getDlEndorsedt", "getDlEndorseno", "getDlEndorsetime", "getDlHlValdfrDt", "getDlHlValdtoDate", "getDlHlValdtoDt", "getDlHzValdfrDt", "getDlHzValdtoDate", "getDlHzValdtoDt", "getDlInvcrgNo", "getDlIssueDate", "getDlIssueauth", "getDlIssuedesig", "getDlIssuedt", "getDlLatestTrcode", "getDlLicno", "getDlNtValdfrDt", "getDlNtValdtoDate", "getDlNtValdtoDt", "getDlOldLicno", "getDlPrintDate", "getDlPrintStatus", "getDlRecGenesis", "getDlRemarks", "getDlRtoCode", "getDlSeqno", "getDlStateCode", "getDlStatus", "getDlTokenId", "getDlTrValdfrDt", "getDlTrValdtoDate", "getDlTrValdtoDt", "getDlUsid", "getDlolaCode", "getEnforceEndDate", "getEnforceFromDate", "getEnforceRemark", "getOlaName", "getOlacode", "getOmOfficeTownname", "getOmRtoFullname", "getOmRtoShortname", "getStateName", "getStatecd", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Dlobj implements Serializable {
    private final String bioid;
    private final Object dlAuthCov;
    private final Object dlAuthDt;
    private final Object dlAuthIssauth;
    private final Object dlAuthNo;
    private final Object dlBioId;
    private final Object dlDigest;
    private final String dlDispatchStatus;
    private final String dlEndorseAuth;
    private final Object dlEndorsedt;
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
    private final Object dlNtValdfrDt;
    private final Object dlNtValdtoDate;
    private final Object dlNtValdtoDt;
    private final String dlOldLicno;
    private final Object dlPrintDate;
    private final String dlPrintStatus;
    private final String dlRecGenesis;
    private final Object dlRemarks;
    private final String dlRtoCode;
    private final Object dlSeqno;
    private final Object dlStateCode;
    private final Object dlStatus;
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

    public Dlobj(String bioid, Object dlAuthCov, Object dlAuthDt, Object dlAuthIssauth, Object dlAuthNo, Object dlBioId, Object dlDigest, String dlDispatchStatus, String dlEndorseAuth, Object dlEndorsedt, String dlEndorseno, Object dlEndorsetime, Object dlHlValdfrDt, Object dlHlValdtoDate, Object dlHlValdtoDt, Object dlHzValdfrDt, Object dlHzValdtoDate, Object dlHzValdtoDt, Object dlInvcrgNo, Object dlIssueDate, String dlIssueauth, Object dlIssuedesig, String dlIssuedt, String dlLatestTrcode, String dlLicno, Object dlNtValdfrDt, Object dlNtValdtoDate, Object dlNtValdtoDt, String dlOldLicno, Object dlPrintDate, String dlPrintStatus, String dlRecGenesis, Object dlRemarks, String dlRtoCode, Object dlSeqno, Object dlStateCode, Object dlStatus, Object dlTokenId, String dlTrValdfrDt, Object dlTrValdtoDate, String dlTrValdtoDt, String dlUsid, Object dlolaCode, Object enforceEndDate, Object enforceFromDate, String enforceRemark, String olaName, String olacode, String omOfficeTownname, String omRtoFullname, String omRtoShortname, String stateName, String statecd) {
        Intrinsics.checkNotNullParameter(bioid, "bioid");
        Intrinsics.checkNotNullParameter(dlAuthCov, "dlAuthCov");
        Intrinsics.checkNotNullParameter(dlAuthDt, "dlAuthDt");
        Intrinsics.checkNotNullParameter(dlAuthIssauth, "dlAuthIssauth");
        Intrinsics.checkNotNullParameter(dlAuthNo, "dlAuthNo");
        Intrinsics.checkNotNullParameter(dlBioId, "dlBioId");
        Intrinsics.checkNotNullParameter(dlDigest, "dlDigest");
        Intrinsics.checkNotNullParameter(dlDispatchStatus, "dlDispatchStatus");
        Intrinsics.checkNotNullParameter(dlEndorseAuth, "dlEndorseAuth");
        Intrinsics.checkNotNullParameter(dlEndorsedt, "dlEndorsedt");
        Intrinsics.checkNotNullParameter(dlEndorseno, "dlEndorseno");
        Intrinsics.checkNotNullParameter(dlEndorsetime, "dlEndorsetime");
        Intrinsics.checkNotNullParameter(dlHlValdfrDt, "dlHlValdfrDt");
        Intrinsics.checkNotNullParameter(dlHlValdtoDate, "dlHlValdtoDate");
        Intrinsics.checkNotNullParameter(dlHlValdtoDt, "dlHlValdtoDt");
        Intrinsics.checkNotNullParameter(dlHzValdfrDt, "dlHzValdfrDt");
        Intrinsics.checkNotNullParameter(dlHzValdtoDate, "dlHzValdtoDate");
        Intrinsics.checkNotNullParameter(dlHzValdtoDt, "dlHzValdtoDt");
        Intrinsics.checkNotNullParameter(dlInvcrgNo, "dlInvcrgNo");
        Intrinsics.checkNotNullParameter(dlIssueDate, "dlIssueDate");
        Intrinsics.checkNotNullParameter(dlIssueauth, "dlIssueauth");
        Intrinsics.checkNotNullParameter(dlIssuedesig, "dlIssuedesig");
        Intrinsics.checkNotNullParameter(dlIssuedt, "dlIssuedt");
        Intrinsics.checkNotNullParameter(dlLatestTrcode, "dlLatestTrcode");
        Intrinsics.checkNotNullParameter(dlLicno, "dlLicno");
        Intrinsics.checkNotNullParameter(dlNtValdfrDt, "dlNtValdfrDt");
        Intrinsics.checkNotNullParameter(dlNtValdtoDate, "dlNtValdtoDate");
        Intrinsics.checkNotNullParameter(dlNtValdtoDt, "dlNtValdtoDt");
        Intrinsics.checkNotNullParameter(dlOldLicno, "dlOldLicno");
        Intrinsics.checkNotNullParameter(dlPrintDate, "dlPrintDate");
        Intrinsics.checkNotNullParameter(dlPrintStatus, "dlPrintStatus");
        Intrinsics.checkNotNullParameter(dlRecGenesis, "dlRecGenesis");
        Intrinsics.checkNotNullParameter(dlRemarks, "dlRemarks");
        Intrinsics.checkNotNullParameter(dlRtoCode, "dlRtoCode");
        Intrinsics.checkNotNullParameter(dlSeqno, "dlSeqno");
        Intrinsics.checkNotNullParameter(dlStateCode, "dlStateCode");
        Intrinsics.checkNotNullParameter(dlStatus, "dlStatus");
        Intrinsics.checkNotNullParameter(dlTokenId, "dlTokenId");
        Intrinsics.checkNotNullParameter(dlTrValdfrDt, "dlTrValdfrDt");
        Intrinsics.checkNotNullParameter(dlTrValdtoDate, "dlTrValdtoDate");
        Intrinsics.checkNotNullParameter(dlTrValdtoDt, "dlTrValdtoDt");
        Intrinsics.checkNotNullParameter(dlUsid, "dlUsid");
        Intrinsics.checkNotNullParameter(dlolaCode, "dlolaCode");
        Intrinsics.checkNotNullParameter(enforceEndDate, "enforceEndDate");
        Intrinsics.checkNotNullParameter(enforceFromDate, "enforceFromDate");
        Intrinsics.checkNotNullParameter(enforceRemark, "enforceRemark");
        Intrinsics.checkNotNullParameter(olaName, "olaName");
        Intrinsics.checkNotNullParameter(olacode, "olacode");
        Intrinsics.checkNotNullParameter(omOfficeTownname, "omOfficeTownname");
        Intrinsics.checkNotNullParameter(omRtoFullname, "omRtoFullname");
        Intrinsics.checkNotNullParameter(omRtoShortname, "omRtoShortname");
        Intrinsics.checkNotNullParameter(stateName, "stateName");
        Intrinsics.checkNotNullParameter(statecd, "statecd");
        this.bioid = bioid;
        this.dlAuthCov = dlAuthCov;
        this.dlAuthDt = dlAuthDt;
        this.dlAuthIssauth = dlAuthIssauth;
        this.dlAuthNo = dlAuthNo;
        this.dlBioId = dlBioId;
        this.dlDigest = dlDigest;
        this.dlDispatchStatus = dlDispatchStatus;
        this.dlEndorseAuth = dlEndorseAuth;
        this.dlEndorsedt = dlEndorsedt;
        this.dlEndorseno = dlEndorseno;
        this.dlEndorsetime = dlEndorsetime;
        this.dlHlValdfrDt = dlHlValdfrDt;
        this.dlHlValdtoDate = dlHlValdtoDate;
        this.dlHlValdtoDt = dlHlValdtoDt;
        this.dlHzValdfrDt = dlHzValdfrDt;
        this.dlHzValdtoDate = dlHzValdtoDate;
        this.dlHzValdtoDt = dlHzValdtoDt;
        this.dlInvcrgNo = dlInvcrgNo;
        this.dlIssueDate = dlIssueDate;
        this.dlIssueauth = dlIssueauth;
        this.dlIssuedesig = dlIssuedesig;
        this.dlIssuedt = dlIssuedt;
        this.dlLatestTrcode = dlLatestTrcode;
        this.dlLicno = dlLicno;
        this.dlNtValdfrDt = dlNtValdfrDt;
        this.dlNtValdtoDate = dlNtValdtoDate;
        this.dlNtValdtoDt = dlNtValdtoDt;
        this.dlOldLicno = dlOldLicno;
        this.dlPrintDate = dlPrintDate;
        this.dlPrintStatus = dlPrintStatus;
        this.dlRecGenesis = dlRecGenesis;
        this.dlRemarks = dlRemarks;
        this.dlRtoCode = dlRtoCode;
        this.dlSeqno = dlSeqno;
        this.dlStateCode = dlStateCode;
        this.dlStatus = dlStatus;
        this.dlTokenId = dlTokenId;
        this.dlTrValdfrDt = dlTrValdfrDt;
        this.dlTrValdtoDate = dlTrValdtoDate;
        this.dlTrValdtoDt = dlTrValdtoDt;
        this.dlUsid = dlUsid;
        this.dlolaCode = dlolaCode;
        this.enforceEndDate = enforceEndDate;
        this.enforceFromDate = enforceFromDate;
        this.enforceRemark = enforceRemark;
        this.olaName = olaName;
        this.olacode = olacode;
        this.omOfficeTownname = omOfficeTownname;
        this.omRtoFullname = omRtoFullname;
        this.omRtoShortname = omRtoShortname;
        this.stateName = stateName;
        this.statecd = statecd;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBioid() {
        return this.bioid;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Object getDlEndorsedt() {
        return this.dlEndorsedt;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getDlEndorseno() {
        return this.dlEndorseno;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Object getDlEndorsetime() {
        return this.dlEndorsetime;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Object getDlHlValdfrDt() {
        return this.dlHlValdfrDt;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Object getDlHlValdtoDate() {
        return this.dlHlValdtoDate;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Object getDlHlValdtoDt() {
        return this.dlHlValdtoDt;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Object getDlHzValdfrDt() {
        return this.dlHzValdfrDt;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Object getDlHzValdtoDate() {
        return this.dlHzValdtoDate;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Object getDlHzValdtoDt() {
        return this.dlHzValdtoDt;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Object getDlInvcrgNo() {
        return this.dlInvcrgNo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getDlAuthCov() {
        return this.dlAuthCov;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Object getDlIssueDate() {
        return this.dlIssueDate;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getDlIssueauth() {
        return this.dlIssueauth;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Object getDlIssuedesig() {
        return this.dlIssuedesig;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getDlIssuedt() {
        return this.dlIssuedt;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getDlLatestTrcode() {
        return this.dlLatestTrcode;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getDlLicno() {
        return this.dlLicno;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final Object getDlNtValdfrDt() {
        return this.dlNtValdfrDt;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final Object getDlNtValdtoDate() {
        return this.dlNtValdtoDate;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final Object getDlNtValdtoDt() {
        return this.dlNtValdtoDt;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getDlOldLicno() {
        return this.dlOldLicno;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Object getDlAuthDt() {
        return this.dlAuthDt;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final Object getDlPrintDate() {
        return this.dlPrintDate;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getDlPrintStatus() {
        return this.dlPrintStatus;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getDlRecGenesis() {
        return this.dlRecGenesis;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final Object getDlRemarks() {
        return this.dlRemarks;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final String getDlRtoCode() {
        return this.dlRtoCode;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final Object getDlSeqno() {
        return this.dlSeqno;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final Object getDlStateCode() {
        return this.dlStateCode;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final Object getDlStatus() {
        return this.dlStatus;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final Object getDlTokenId() {
        return this.dlTokenId;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final String getDlTrValdfrDt() {
        return this.dlTrValdfrDt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Object getDlAuthIssauth() {
        return this.dlAuthIssauth;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final Object getDlTrValdtoDate() {
        return this.dlTrValdtoDate;
    }

    /* JADX INFO: renamed from: component41, reason: from getter */
    public final String getDlTrValdtoDt() {
        return this.dlTrValdtoDt;
    }

    /* JADX INFO: renamed from: component42, reason: from getter */
    public final String getDlUsid() {
        return this.dlUsid;
    }

    /* JADX INFO: renamed from: component43, reason: from getter */
    public final Object getDlolaCode() {
        return this.dlolaCode;
    }

    /* JADX INFO: renamed from: component44, reason: from getter */
    public final Object getEnforceEndDate() {
        return this.enforceEndDate;
    }

    /* JADX INFO: renamed from: component45, reason: from getter */
    public final Object getEnforceFromDate() {
        return this.enforceFromDate;
    }

    /* JADX INFO: renamed from: component46, reason: from getter */
    public final String getEnforceRemark() {
        return this.enforceRemark;
    }

    /* JADX INFO: renamed from: component47, reason: from getter */
    public final String getOlaName() {
        return this.olaName;
    }

    /* JADX INFO: renamed from: component48, reason: from getter */
    public final String getOlacode() {
        return this.olacode;
    }

    /* JADX INFO: renamed from: component49, reason: from getter */
    public final String getOmOfficeTownname() {
        return this.omOfficeTownname;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Object getDlAuthNo() {
        return this.dlAuthNo;
    }

    /* JADX INFO: renamed from: component50, reason: from getter */
    public final String getOmRtoFullname() {
        return this.omRtoFullname;
    }

    /* JADX INFO: renamed from: component51, reason: from getter */
    public final String getOmRtoShortname() {
        return this.omRtoShortname;
    }

    /* JADX INFO: renamed from: component52, reason: from getter */
    public final String getStateName() {
        return this.stateName;
    }

    /* JADX INFO: renamed from: component53, reason: from getter */
    public final String getStatecd() {
        return this.statecd;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Object getDlBioId() {
        return this.dlBioId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Object getDlDigest() {
        return this.dlDigest;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDlDispatchStatus() {
        return this.dlDispatchStatus;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDlEndorseAuth() {
        return this.dlEndorseAuth;
    }

    public final Dlobj copy(String bioid, Object dlAuthCov, Object dlAuthDt, Object dlAuthIssauth, Object dlAuthNo, Object dlBioId, Object dlDigest, String dlDispatchStatus, String dlEndorseAuth, Object dlEndorsedt, String dlEndorseno, Object dlEndorsetime, Object dlHlValdfrDt, Object dlHlValdtoDate, Object dlHlValdtoDt, Object dlHzValdfrDt, Object dlHzValdtoDate, Object dlHzValdtoDt, Object dlInvcrgNo, Object dlIssueDate, String dlIssueauth, Object dlIssuedesig, String dlIssuedt, String dlLatestTrcode, String dlLicno, Object dlNtValdfrDt, Object dlNtValdtoDate, Object dlNtValdtoDt, String dlOldLicno, Object dlPrintDate, String dlPrintStatus, String dlRecGenesis, Object dlRemarks, String dlRtoCode, Object dlSeqno, Object dlStateCode, Object dlStatus, Object dlTokenId, String dlTrValdfrDt, Object dlTrValdtoDate, String dlTrValdtoDt, String dlUsid, Object dlolaCode, Object enforceEndDate, Object enforceFromDate, String enforceRemark, String olaName, String olacode, String omOfficeTownname, String omRtoFullname, String omRtoShortname, String stateName, String statecd) {
        Intrinsics.checkNotNullParameter(bioid, "bioid");
        Intrinsics.checkNotNullParameter(dlAuthCov, "dlAuthCov");
        Intrinsics.checkNotNullParameter(dlAuthDt, "dlAuthDt");
        Intrinsics.checkNotNullParameter(dlAuthIssauth, "dlAuthIssauth");
        Intrinsics.checkNotNullParameter(dlAuthNo, "dlAuthNo");
        Intrinsics.checkNotNullParameter(dlBioId, "dlBioId");
        Intrinsics.checkNotNullParameter(dlDigest, "dlDigest");
        Intrinsics.checkNotNullParameter(dlDispatchStatus, "dlDispatchStatus");
        Intrinsics.checkNotNullParameter(dlEndorseAuth, "dlEndorseAuth");
        Intrinsics.checkNotNullParameter(dlEndorsedt, "dlEndorsedt");
        Intrinsics.checkNotNullParameter(dlEndorseno, "dlEndorseno");
        Intrinsics.checkNotNullParameter(dlEndorsetime, "dlEndorsetime");
        Intrinsics.checkNotNullParameter(dlHlValdfrDt, "dlHlValdfrDt");
        Intrinsics.checkNotNullParameter(dlHlValdtoDate, "dlHlValdtoDate");
        Intrinsics.checkNotNullParameter(dlHlValdtoDt, "dlHlValdtoDt");
        Intrinsics.checkNotNullParameter(dlHzValdfrDt, "dlHzValdfrDt");
        Intrinsics.checkNotNullParameter(dlHzValdtoDate, "dlHzValdtoDate");
        Intrinsics.checkNotNullParameter(dlHzValdtoDt, "dlHzValdtoDt");
        Intrinsics.checkNotNullParameter(dlInvcrgNo, "dlInvcrgNo");
        Intrinsics.checkNotNullParameter(dlIssueDate, "dlIssueDate");
        Intrinsics.checkNotNullParameter(dlIssueauth, "dlIssueauth");
        Intrinsics.checkNotNullParameter(dlIssuedesig, "dlIssuedesig");
        Intrinsics.checkNotNullParameter(dlIssuedt, "dlIssuedt");
        Intrinsics.checkNotNullParameter(dlLatestTrcode, "dlLatestTrcode");
        Intrinsics.checkNotNullParameter(dlLicno, "dlLicno");
        Intrinsics.checkNotNullParameter(dlNtValdfrDt, "dlNtValdfrDt");
        Intrinsics.checkNotNullParameter(dlNtValdtoDate, "dlNtValdtoDate");
        Intrinsics.checkNotNullParameter(dlNtValdtoDt, "dlNtValdtoDt");
        Intrinsics.checkNotNullParameter(dlOldLicno, "dlOldLicno");
        Intrinsics.checkNotNullParameter(dlPrintDate, "dlPrintDate");
        Intrinsics.checkNotNullParameter(dlPrintStatus, "dlPrintStatus");
        Intrinsics.checkNotNullParameter(dlRecGenesis, "dlRecGenesis");
        Intrinsics.checkNotNullParameter(dlRemarks, "dlRemarks");
        Intrinsics.checkNotNullParameter(dlRtoCode, "dlRtoCode");
        Intrinsics.checkNotNullParameter(dlSeqno, "dlSeqno");
        Intrinsics.checkNotNullParameter(dlStateCode, "dlStateCode");
        Intrinsics.checkNotNullParameter(dlStatus, "dlStatus");
        Intrinsics.checkNotNullParameter(dlTokenId, "dlTokenId");
        Intrinsics.checkNotNullParameter(dlTrValdfrDt, "dlTrValdfrDt");
        Intrinsics.checkNotNullParameter(dlTrValdtoDate, "dlTrValdtoDate");
        Intrinsics.checkNotNullParameter(dlTrValdtoDt, "dlTrValdtoDt");
        Intrinsics.checkNotNullParameter(dlUsid, "dlUsid");
        Intrinsics.checkNotNullParameter(dlolaCode, "dlolaCode");
        Intrinsics.checkNotNullParameter(enforceEndDate, "enforceEndDate");
        Intrinsics.checkNotNullParameter(enforceFromDate, "enforceFromDate");
        Intrinsics.checkNotNullParameter(enforceRemark, "enforceRemark");
        Intrinsics.checkNotNullParameter(olaName, "olaName");
        Intrinsics.checkNotNullParameter(olacode, "olacode");
        Intrinsics.checkNotNullParameter(omOfficeTownname, "omOfficeTownname");
        Intrinsics.checkNotNullParameter(omRtoFullname, "omRtoFullname");
        Intrinsics.checkNotNullParameter(omRtoShortname, "omRtoShortname");
        Intrinsics.checkNotNullParameter(stateName, "stateName");
        Intrinsics.checkNotNullParameter(statecd, "statecd");
        return new Dlobj(bioid, dlAuthCov, dlAuthDt, dlAuthIssauth, dlAuthNo, dlBioId, dlDigest, dlDispatchStatus, dlEndorseAuth, dlEndorsedt, dlEndorseno, dlEndorsetime, dlHlValdfrDt, dlHlValdtoDate, dlHlValdtoDt, dlHzValdfrDt, dlHzValdtoDate, dlHzValdtoDt, dlInvcrgNo, dlIssueDate, dlIssueauth, dlIssuedesig, dlIssuedt, dlLatestTrcode, dlLicno, dlNtValdfrDt, dlNtValdtoDate, dlNtValdtoDt, dlOldLicno, dlPrintDate, dlPrintStatus, dlRecGenesis, dlRemarks, dlRtoCode, dlSeqno, dlStateCode, dlStatus, dlTokenId, dlTrValdfrDt, dlTrValdtoDate, dlTrValdtoDt, dlUsid, dlolaCode, enforceEndDate, enforceFromDate, enforceRemark, olaName, olacode, omOfficeTownname, omRtoFullname, omRtoShortname, stateName, statecd);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Dlobj)) {
            return false;
        }
        Dlobj dlobj = (Dlobj) other;
        return Intrinsics.areEqual(this.bioid, dlobj.bioid) && Intrinsics.areEqual(this.dlAuthCov, dlobj.dlAuthCov) && Intrinsics.areEqual(this.dlAuthDt, dlobj.dlAuthDt) && Intrinsics.areEqual(this.dlAuthIssauth, dlobj.dlAuthIssauth) && Intrinsics.areEqual(this.dlAuthNo, dlobj.dlAuthNo) && Intrinsics.areEqual(this.dlBioId, dlobj.dlBioId) && Intrinsics.areEqual(this.dlDigest, dlobj.dlDigest) && Intrinsics.areEqual(this.dlDispatchStatus, dlobj.dlDispatchStatus) && Intrinsics.areEqual(this.dlEndorseAuth, dlobj.dlEndorseAuth) && Intrinsics.areEqual(this.dlEndorsedt, dlobj.dlEndorsedt) && Intrinsics.areEqual(this.dlEndorseno, dlobj.dlEndorseno) && Intrinsics.areEqual(this.dlEndorsetime, dlobj.dlEndorsetime) && Intrinsics.areEqual(this.dlHlValdfrDt, dlobj.dlHlValdfrDt) && Intrinsics.areEqual(this.dlHlValdtoDate, dlobj.dlHlValdtoDate) && Intrinsics.areEqual(this.dlHlValdtoDt, dlobj.dlHlValdtoDt) && Intrinsics.areEqual(this.dlHzValdfrDt, dlobj.dlHzValdfrDt) && Intrinsics.areEqual(this.dlHzValdtoDate, dlobj.dlHzValdtoDate) && Intrinsics.areEqual(this.dlHzValdtoDt, dlobj.dlHzValdtoDt) && Intrinsics.areEqual(this.dlInvcrgNo, dlobj.dlInvcrgNo) && Intrinsics.areEqual(this.dlIssueDate, dlobj.dlIssueDate) && Intrinsics.areEqual(this.dlIssueauth, dlobj.dlIssueauth) && Intrinsics.areEqual(this.dlIssuedesig, dlobj.dlIssuedesig) && Intrinsics.areEqual(this.dlIssuedt, dlobj.dlIssuedt) && Intrinsics.areEqual(this.dlLatestTrcode, dlobj.dlLatestTrcode) && Intrinsics.areEqual(this.dlLicno, dlobj.dlLicno) && Intrinsics.areEqual(this.dlNtValdfrDt, dlobj.dlNtValdfrDt) && Intrinsics.areEqual(this.dlNtValdtoDate, dlobj.dlNtValdtoDate) && Intrinsics.areEqual(this.dlNtValdtoDt, dlobj.dlNtValdtoDt) && Intrinsics.areEqual(this.dlOldLicno, dlobj.dlOldLicno) && Intrinsics.areEqual(this.dlPrintDate, dlobj.dlPrintDate) && Intrinsics.areEqual(this.dlPrintStatus, dlobj.dlPrintStatus) && Intrinsics.areEqual(this.dlRecGenesis, dlobj.dlRecGenesis) && Intrinsics.areEqual(this.dlRemarks, dlobj.dlRemarks) && Intrinsics.areEqual(this.dlRtoCode, dlobj.dlRtoCode) && Intrinsics.areEqual(this.dlSeqno, dlobj.dlSeqno) && Intrinsics.areEqual(this.dlStateCode, dlobj.dlStateCode) && Intrinsics.areEqual(this.dlStatus, dlobj.dlStatus) && Intrinsics.areEqual(this.dlTokenId, dlobj.dlTokenId) && Intrinsics.areEqual(this.dlTrValdfrDt, dlobj.dlTrValdfrDt) && Intrinsics.areEqual(this.dlTrValdtoDate, dlobj.dlTrValdtoDate) && Intrinsics.areEqual(this.dlTrValdtoDt, dlobj.dlTrValdtoDt) && Intrinsics.areEqual(this.dlUsid, dlobj.dlUsid) && Intrinsics.areEqual(this.dlolaCode, dlobj.dlolaCode) && Intrinsics.areEqual(this.enforceEndDate, dlobj.enforceEndDate) && Intrinsics.areEqual(this.enforceFromDate, dlobj.enforceFromDate) && Intrinsics.areEqual(this.enforceRemark, dlobj.enforceRemark) && Intrinsics.areEqual(this.olaName, dlobj.olaName) && Intrinsics.areEqual(this.olacode, dlobj.olacode) && Intrinsics.areEqual(this.omOfficeTownname, dlobj.omOfficeTownname) && Intrinsics.areEqual(this.omRtoFullname, dlobj.omRtoFullname) && Intrinsics.areEqual(this.omRtoShortname, dlobj.omRtoShortname) && Intrinsics.areEqual(this.stateName, dlobj.stateName) && Intrinsics.areEqual(this.statecd, dlobj.statecd);
    }

    public final String getBioid() {
        return this.bioid;
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

    public final Object getDlEndorsedt() {
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

    public final Object getDlNtValdfrDt() {
        return this.dlNtValdfrDt;
    }

    public final Object getDlNtValdtoDate() {
        return this.dlNtValdtoDate;
    }

    public final Object getDlNtValdtoDt() {
        return this.dlNtValdtoDt;
    }

    public final String getDlOldLicno() {
        return this.dlOldLicno;
    }

    public final Object getDlPrintDate() {
        return this.dlPrintDate;
    }

    public final String getDlPrintStatus() {
        return this.dlPrintStatus;
    }

    public final String getDlRecGenesis() {
        return this.dlRecGenesis;
    }

    public final Object getDlRemarks() {
        return this.dlRemarks;
    }

    public final String getDlRtoCode() {
        return this.dlRtoCode;
    }

    public final Object getDlSeqno() {
        return this.dlSeqno;
    }

    public final Object getDlStateCode() {
        return this.dlStateCode;
    }

    public final Object getDlStatus() {
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
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.bioid.hashCode() * 31) + this.dlAuthCov.hashCode()) * 31) + this.dlAuthDt.hashCode()) * 31) + this.dlAuthIssauth.hashCode()) * 31) + this.dlAuthNo.hashCode()) * 31) + this.dlBioId.hashCode()) * 31) + this.dlDigest.hashCode()) * 31) + this.dlDispatchStatus.hashCode()) * 31) + this.dlEndorseAuth.hashCode()) * 31) + this.dlEndorsedt.hashCode()) * 31) + this.dlEndorseno.hashCode()) * 31) + this.dlEndorsetime.hashCode()) * 31) + this.dlHlValdfrDt.hashCode()) * 31) + this.dlHlValdtoDate.hashCode()) * 31) + this.dlHlValdtoDt.hashCode()) * 31) + this.dlHzValdfrDt.hashCode()) * 31) + this.dlHzValdtoDate.hashCode()) * 31) + this.dlHzValdtoDt.hashCode()) * 31) + this.dlInvcrgNo.hashCode()) * 31) + this.dlIssueDate.hashCode()) * 31) + this.dlIssueauth.hashCode()) * 31) + this.dlIssuedesig.hashCode()) * 31) + this.dlIssuedt.hashCode()) * 31) + this.dlLatestTrcode.hashCode()) * 31) + this.dlLicno.hashCode()) * 31) + this.dlNtValdfrDt.hashCode()) * 31) + this.dlNtValdtoDate.hashCode()) * 31) + this.dlNtValdtoDt.hashCode()) * 31) + this.dlOldLicno.hashCode()) * 31) + this.dlPrintDate.hashCode()) * 31) + this.dlPrintStatus.hashCode()) * 31) + this.dlRecGenesis.hashCode()) * 31) + this.dlRemarks.hashCode()) * 31) + this.dlRtoCode.hashCode()) * 31) + this.dlSeqno.hashCode()) * 31) + this.dlStateCode.hashCode()) * 31) + this.dlStatus.hashCode()) * 31) + this.dlTokenId.hashCode()) * 31) + this.dlTrValdfrDt.hashCode()) * 31) + this.dlTrValdtoDate.hashCode()) * 31) + this.dlTrValdtoDt.hashCode()) * 31) + this.dlUsid.hashCode()) * 31) + this.dlolaCode.hashCode()) * 31) + this.enforceEndDate.hashCode()) * 31) + this.enforceFromDate.hashCode()) * 31) + this.enforceRemark.hashCode()) * 31) + this.olaName.hashCode()) * 31) + this.olacode.hashCode()) * 31) + this.omOfficeTownname.hashCode()) * 31) + this.omRtoFullname.hashCode()) * 31) + this.omRtoShortname.hashCode()) * 31) + this.stateName.hashCode()) * 31) + this.statecd.hashCode();
    }

    public String toString() {
        return "Dlobj(bioid=" + this.bioid + ", dlAuthCov=" + this.dlAuthCov + ", dlAuthDt=" + this.dlAuthDt + ", dlAuthIssauth=" + this.dlAuthIssauth + ", dlAuthNo=" + this.dlAuthNo + ", dlBioId=" + this.dlBioId + ", dlDigest=" + this.dlDigest + ", dlDispatchStatus=" + this.dlDispatchStatus + ", dlEndorseAuth=" + this.dlEndorseAuth + ", dlEndorsedt=" + this.dlEndorsedt + ", dlEndorseno=" + this.dlEndorseno + ", dlEndorsetime=" + this.dlEndorsetime + ", dlHlValdfrDt=" + this.dlHlValdfrDt + ", dlHlValdtoDate=" + this.dlHlValdtoDate + ", dlHlValdtoDt=" + this.dlHlValdtoDt + ", dlHzValdfrDt=" + this.dlHzValdfrDt + ", dlHzValdtoDate=" + this.dlHzValdtoDate + ", dlHzValdtoDt=" + this.dlHzValdtoDt + ", dlInvcrgNo=" + this.dlInvcrgNo + ", dlIssueDate=" + this.dlIssueDate + ", dlIssueauth=" + this.dlIssueauth + ", dlIssuedesig=" + this.dlIssuedesig + ", dlIssuedt=" + this.dlIssuedt + ", dlLatestTrcode=" + this.dlLatestTrcode + ", dlLicno=" + this.dlLicno + ", dlNtValdfrDt=" + this.dlNtValdfrDt + ", dlNtValdtoDate=" + this.dlNtValdtoDate + ", dlNtValdtoDt=" + this.dlNtValdtoDt + ", dlOldLicno=" + this.dlOldLicno + ", dlPrintDate=" + this.dlPrintDate + ", dlPrintStatus=" + this.dlPrintStatus + ", dlRecGenesis=" + this.dlRecGenesis + ", dlRemarks=" + this.dlRemarks + ", dlRtoCode=" + this.dlRtoCode + ", dlSeqno=" + this.dlSeqno + ", dlStateCode=" + this.dlStateCode + ", dlStatus=" + this.dlStatus + ", dlTokenId=" + this.dlTokenId + ", dlTrValdfrDt=" + this.dlTrValdfrDt + ", dlTrValdtoDate=" + this.dlTrValdtoDate + ", dlTrValdtoDt=" + this.dlTrValdtoDt + ", dlUsid=" + this.dlUsid + ", dlolaCode=" + this.dlolaCode + ", enforceEndDate=" + this.enforceEndDate + ", enforceFromDate=" + this.enforceFromDate + ", enforceRemark=" + this.enforceRemark + ", olaName=" + this.olaName + ", olacode=" + this.olacode + ", omOfficeTownname=" + this.omOfficeTownname + ", omRtoFullname=" + this.omRtoFullname + ", omRtoShortname=" + this.omRtoShortname + ", stateName=" + this.stateName + ", statecd=" + this.statecd + ')';
    }
}
