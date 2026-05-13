package com.nic.mparivahan.Checkpost.CheckPostModel;

import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b^\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B¯\u0003\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.\u0012\b\u00100\u001a\u0004\u0018\u000101¢\u0006\u0002\u00102J\u0010\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00104J\u000b\u0010d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0010\u0010h\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00104J\u000b\u0010i\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010k\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00104J\u000b\u0010l\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00104J\u000b\u0010s\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0010\u0010u\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00104J\u000b\u0010v\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010z\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00104J\u000b\u0010{\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010~\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00104J\u0010\u0010\u007f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00104J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00104J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00104J\u0012\u0010\u0086\u0001\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.HÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u000101HÆ\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u008e\u0004\u0010\u008d\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.2\n\b\u0002\u00100\u001a\u0004\u0018\u000101HÆ\u0001¢\u0006\u0003\u0010\u008e\u0001J\u0016\u0010\u008f\u0001\u001a\u00030\u0090\u00012\t\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\n\u0010\u0092\u0001\u001a\u00020\u0003HÖ\u0001J\n\u0010\u0093\u0001\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00105\u001a\u0004\b3\u00104R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b8\u00107R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b9\u00107R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b:\u00107R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b;\u00107R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b<\u00107R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b=\u00107R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b>\u00107R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b?\u00107R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b@\u00107R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bA\u00107R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00105\u001a\u0004\bD\u00104R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bE\u00107R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bF\u00107R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00105\u001a\u0004\bG\u00104R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bH\u00107R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bI\u00107R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bJ\u00107R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bK\u00107R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bL\u00107R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00105\u001a\u0004\bM\u00104R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\bN\u0010CR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\bO\u0010CR\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00105\u001a\u0004\bP\u00104R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bQ\u00107R\u0013\u0010 \u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bR\u00107R\u0013\u0010!\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bS\u00107R\u0015\u0010\"\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00105\u001a\u0004\bT\u00104R\u0013\u0010#\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bU\u00107R\u0013\u0010$\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bV\u00107R\u0013\u0010%\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bW\u00107R\u0015\u0010&\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00105\u001a\u0004\bX\u00104R\u0015\u0010'\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00105\u001a\u0004\bY\u00104R\u0013\u0010(\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bZ\u00107R\u0013\u0010)\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b[\u00107R\u0015\u0010*\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00105\u001a\u0004\b\\\u00104R\u0013\u0010+\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b]\u00107R\u0015\u0010,\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00105\u001a\u0004\b^\u00104R\u0019\u0010-\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.¢\u0006\b\n\u0000\u001a\u0004\b_\u0010`R\u0013\u00100\u001a\u0004\u0018\u000101¢\u0006\b\n\u0000\u001a\u0004\ba\u0010b¨\u0006\u0094\u0001"}, d2 = {"Lcom/nic/mparivahan/Checkpost/CheckPostModel/CheckPostReceiptModel;", "Ljava/io/Serializable;", "amount", "", "chassisNo", "", "checkpostName", "checkpostNameCd", "districtCd", "districtCode", "fitnessValidity", "fromDate", "greenTaxUpto", "insValidity", "mobileNo", "ownerName", "permitCategory", "", "permitCategoryCd", "permitNo", "permitType", "permitTypeCd", "permitUpto", "puccValidity", "rcptDate", "rcptNo", "regnNo", "seatingCap", "serviceType", "serviceTypeCd", "sleeperCap", "stateCd", "stateCode", "taxMode", "taxModeCd", "uptoDate", "userId", "userName", "vchUlWt", "vchWt", "vehicleCatg", "vehicleClass", "vehicleClassCd", "vehicleType", "vehicleTypeCd", "vpAccount", "", "Lcom/nic/mparivahan/Checkpost/CheckPostModel/VpAccount;", "vpDetails", "Lcom/nic/mparivahan/Checkpost/CheckPostModel/VpDetails;", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lcom/nic/mparivahan/Checkpost/CheckPostModel/VpDetails;)V", "getAmount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getChassisNo", "()Ljava/lang/String;", "getCheckpostName", "getCheckpostNameCd", "getDistrictCd", "getDistrictCode", "getFitnessValidity", "getFromDate", "getGreenTaxUpto", "getInsValidity", "getMobileNo", "getOwnerName", "getPermitCategory", "()Ljava/lang/Object;", "getPermitCategoryCd", "getPermitNo", "getPermitType", "getPermitTypeCd", "getPermitUpto", "getPuccValidity", "getRcptDate", "getRcptNo", "getRegnNo", "getSeatingCap", "getServiceType", "getServiceTypeCd", "getSleeperCap", "getStateCd", "getStateCode", "getTaxMode", "getTaxModeCd", "getUptoDate", "getUserId", "getUserName", "getVchUlWt", "getVchWt", "getVehicleCatg", "getVehicleClass", "getVehicleClassCd", "getVehicleType", "getVehicleTypeCd", "getVpAccount", "()Ljava/util/List;", "getVpDetails", "()Lcom/nic/mparivahan/Checkpost/CheckPostModel/VpDetails;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lcom/nic/mparivahan/Checkpost/CheckPostModel/VpDetails;)Lcom/nic/mparivahan/Checkpost/CheckPostModel/CheckPostReceiptModel;", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CheckPostReceiptModel implements Serializable {
    private final Integer amount;
    private final String chassisNo;
    private final String checkpostName;
    private final String checkpostNameCd;
    private final String districtCd;
    private final String districtCode;
    private final String fitnessValidity;
    private final String fromDate;
    private final String greenTaxUpto;
    private final String insValidity;
    private final String mobileNo;
    private final String ownerName;
    private final Object permitCategory;
    private final Integer permitCategoryCd;
    private final String permitNo;
    private final String permitType;
    private final Integer permitTypeCd;
    private final String permitUpto;
    private final String puccValidity;
    private final String rcptDate;
    private final String rcptNo;
    private final String regnNo;
    private final Integer seatingCap;
    private final Object serviceType;
    private final Object serviceTypeCd;
    private final Integer sleeperCap;
    private final String stateCd;
    private final String stateCode;
    private final String taxMode;
    private final Integer taxModeCd;
    private final String uptoDate;
    private final String userId;
    private final String userName;
    private final Integer vchUlWt;
    private final Integer vchWt;
    private final String vehicleCatg;
    private final String vehicleClass;
    private final Integer vehicleClassCd;
    private final String vehicleType;
    private final Integer vehicleTypeCd;
    private final List<VpAccount> vpAccount;
    private final VpDetails vpDetails;

    public CheckPostReceiptModel(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Object obj, Integer num2, String str12, String str13, Integer num3, String str14, String str15, String str16, String str17, String str18, Integer num4, Object obj2, Object obj3, Integer num5, String str19, String str20, String str21, Integer num6, String str22, String str23, String str24, Integer num7, Integer num8, String str25, String str26, Integer num9, String str27, Integer num10, List<VpAccount> list, VpDetails vpDetails) {
        this.amount = num;
        this.chassisNo = str;
        this.checkpostName = str2;
        this.checkpostNameCd = str3;
        this.districtCd = str4;
        this.districtCode = str5;
        this.fitnessValidity = str6;
        this.fromDate = str7;
        this.greenTaxUpto = str8;
        this.insValidity = str9;
        this.mobileNo = str10;
        this.ownerName = str11;
        this.permitCategory = obj;
        this.permitCategoryCd = num2;
        this.permitNo = str12;
        this.permitType = str13;
        this.permitTypeCd = num3;
        this.permitUpto = str14;
        this.puccValidity = str15;
        this.rcptDate = str16;
        this.rcptNo = str17;
        this.regnNo = str18;
        this.seatingCap = num4;
        this.serviceType = obj2;
        this.serviceTypeCd = obj3;
        this.sleeperCap = num5;
        this.stateCd = str19;
        this.stateCode = str20;
        this.taxMode = str21;
        this.taxModeCd = num6;
        this.uptoDate = str22;
        this.userId = str23;
        this.userName = str24;
        this.vchUlWt = num7;
        this.vchWt = num8;
        this.vehicleCatg = str25;
        this.vehicleClass = str26;
        this.vehicleClassCd = num9;
        this.vehicleType = str27;
        this.vehicleTypeCd = num10;
        this.vpAccount = list;
        this.vpDetails = vpDetails;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getInsValidity() {
        return this.insValidity;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getMobileNo() {
        return this.mobileNo;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getOwnerName() {
        return this.ownerName;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Object getPermitCategory() {
        return this.permitCategory;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Integer getPermitCategoryCd() {
        return this.permitCategoryCd;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getPermitNo() {
        return this.permitNo;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getPermitType() {
        return this.permitType;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Integer getPermitTypeCd() {
        return this.permitTypeCd;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getPermitUpto() {
        return this.permitUpto;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getPuccValidity() {
        return this.puccValidity;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChassisNo() {
        return this.chassisNo;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getRcptDate() {
        return this.rcptDate;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getRcptNo() {
        return this.rcptNo;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getRegnNo() {
        return this.regnNo;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Integer getSeatingCap() {
        return this.seatingCap;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Object getServiceType() {
        return this.serviceType;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Object getServiceTypeCd() {
        return this.serviceTypeCd;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final Integer getSleeperCap() {
        return this.sleeperCap;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getStateCd() {
        return this.stateCd;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getStateCode() {
        return this.stateCode;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getTaxMode() {
        return this.taxMode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCheckpostName() {
        return this.checkpostName;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final Integer getTaxModeCd() {
        return this.taxModeCd;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getUptoDate() {
        return this.uptoDate;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final Integer getVchUlWt() {
        return this.vchUlWt;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final Integer getVchWt() {
        return this.vchWt;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final String getVehicleCatg() {
        return this.vehicleCatg;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final String getVehicleClass() {
        return this.vehicleClass;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final Integer getVehicleClassCd() {
        return this.vehicleClassCd;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final String getVehicleType() {
        return this.vehicleType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCheckpostNameCd() {
        return this.checkpostNameCd;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final Integer getVehicleTypeCd() {
        return this.vehicleTypeCd;
    }

    public final List<VpAccount> component41() {
        return this.vpAccount;
    }

    /* JADX INFO: renamed from: component42, reason: from getter */
    public final VpDetails getVpDetails() {
        return this.vpDetails;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDistrictCd() {
        return this.districtCd;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDistrictCode() {
        return this.districtCode;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getFitnessValidity() {
        return this.fitnessValidity;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getFromDate() {
        return this.fromDate;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getGreenTaxUpto() {
        return this.greenTaxUpto;
    }

    public final CheckPostReceiptModel copy(Integer amount, String chassisNo, String checkpostName, String checkpostNameCd, String districtCd, String districtCode, String fitnessValidity, String fromDate, String greenTaxUpto, String insValidity, String mobileNo, String ownerName, Object permitCategory, Integer permitCategoryCd, String permitNo, String permitType, Integer permitTypeCd, String permitUpto, String puccValidity, String rcptDate, String rcptNo, String regnNo, Integer seatingCap, Object serviceType, Object serviceTypeCd, Integer sleeperCap, String stateCd, String stateCode, String taxMode, Integer taxModeCd, String uptoDate, String userId, String userName, Integer vchUlWt, Integer vchWt, String vehicleCatg, String vehicleClass, Integer vehicleClassCd, String vehicleType, Integer vehicleTypeCd, List<VpAccount> vpAccount, VpDetails vpDetails) {
        return new CheckPostReceiptModel(amount, chassisNo, checkpostName, checkpostNameCd, districtCd, districtCode, fitnessValidity, fromDate, greenTaxUpto, insValidity, mobileNo, ownerName, permitCategory, permitCategoryCd, permitNo, permitType, permitTypeCd, permitUpto, puccValidity, rcptDate, rcptNo, regnNo, seatingCap, serviceType, serviceTypeCd, sleeperCap, stateCd, stateCode, taxMode, taxModeCd, uptoDate, userId, userName, vchUlWt, vchWt, vehicleCatg, vehicleClass, vehicleClassCd, vehicleType, vehicleTypeCd, vpAccount, vpDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckPostReceiptModel)) {
            return false;
        }
        CheckPostReceiptModel checkPostReceiptModel = (CheckPostReceiptModel) other;
        return Intrinsics.areEqual(this.amount, checkPostReceiptModel.amount) && Intrinsics.areEqual(this.chassisNo, checkPostReceiptModel.chassisNo) && Intrinsics.areEqual(this.checkpostName, checkPostReceiptModel.checkpostName) && Intrinsics.areEqual(this.checkpostNameCd, checkPostReceiptModel.checkpostNameCd) && Intrinsics.areEqual(this.districtCd, checkPostReceiptModel.districtCd) && Intrinsics.areEqual(this.districtCode, checkPostReceiptModel.districtCode) && Intrinsics.areEqual(this.fitnessValidity, checkPostReceiptModel.fitnessValidity) && Intrinsics.areEqual(this.fromDate, checkPostReceiptModel.fromDate) && Intrinsics.areEqual(this.greenTaxUpto, checkPostReceiptModel.greenTaxUpto) && Intrinsics.areEqual(this.insValidity, checkPostReceiptModel.insValidity) && Intrinsics.areEqual(this.mobileNo, checkPostReceiptModel.mobileNo) && Intrinsics.areEqual(this.ownerName, checkPostReceiptModel.ownerName) && Intrinsics.areEqual(this.permitCategory, checkPostReceiptModel.permitCategory) && Intrinsics.areEqual(this.permitCategoryCd, checkPostReceiptModel.permitCategoryCd) && Intrinsics.areEqual(this.permitNo, checkPostReceiptModel.permitNo) && Intrinsics.areEqual(this.permitType, checkPostReceiptModel.permitType) && Intrinsics.areEqual(this.permitTypeCd, checkPostReceiptModel.permitTypeCd) && Intrinsics.areEqual(this.permitUpto, checkPostReceiptModel.permitUpto) && Intrinsics.areEqual(this.puccValidity, checkPostReceiptModel.puccValidity) && Intrinsics.areEqual(this.rcptDate, checkPostReceiptModel.rcptDate) && Intrinsics.areEqual(this.rcptNo, checkPostReceiptModel.rcptNo) && Intrinsics.areEqual(this.regnNo, checkPostReceiptModel.regnNo) && Intrinsics.areEqual(this.seatingCap, checkPostReceiptModel.seatingCap) && Intrinsics.areEqual(this.serviceType, checkPostReceiptModel.serviceType) && Intrinsics.areEqual(this.serviceTypeCd, checkPostReceiptModel.serviceTypeCd) && Intrinsics.areEqual(this.sleeperCap, checkPostReceiptModel.sleeperCap) && Intrinsics.areEqual(this.stateCd, checkPostReceiptModel.stateCd) && Intrinsics.areEqual(this.stateCode, checkPostReceiptModel.stateCode) && Intrinsics.areEqual(this.taxMode, checkPostReceiptModel.taxMode) && Intrinsics.areEqual(this.taxModeCd, checkPostReceiptModel.taxModeCd) && Intrinsics.areEqual(this.uptoDate, checkPostReceiptModel.uptoDate) && Intrinsics.areEqual(this.userId, checkPostReceiptModel.userId) && Intrinsics.areEqual(this.userName, checkPostReceiptModel.userName) && Intrinsics.areEqual(this.vchUlWt, checkPostReceiptModel.vchUlWt) && Intrinsics.areEqual(this.vchWt, checkPostReceiptModel.vchWt) && Intrinsics.areEqual(this.vehicleCatg, checkPostReceiptModel.vehicleCatg) && Intrinsics.areEqual(this.vehicleClass, checkPostReceiptModel.vehicleClass) && Intrinsics.areEqual(this.vehicleClassCd, checkPostReceiptModel.vehicleClassCd) && Intrinsics.areEqual(this.vehicleType, checkPostReceiptModel.vehicleType) && Intrinsics.areEqual(this.vehicleTypeCd, checkPostReceiptModel.vehicleTypeCd) && Intrinsics.areEqual(this.vpAccount, checkPostReceiptModel.vpAccount) && Intrinsics.areEqual(this.vpDetails, checkPostReceiptModel.vpDetails);
    }

    public final Integer getAmount() {
        return this.amount;
    }

    public final String getChassisNo() {
        return this.chassisNo;
    }

    public final String getCheckpostName() {
        return this.checkpostName;
    }

    public final String getCheckpostNameCd() {
        return this.checkpostNameCd;
    }

    public final String getDistrictCd() {
        return this.districtCd;
    }

    public final String getDistrictCode() {
        return this.districtCode;
    }

    public final String getFitnessValidity() {
        return this.fitnessValidity;
    }

    public final String getFromDate() {
        return this.fromDate;
    }

    public final String getGreenTaxUpto() {
        return this.greenTaxUpto;
    }

    public final String getInsValidity() {
        return this.insValidity;
    }

    public final String getMobileNo() {
        return this.mobileNo;
    }

    public final String getOwnerName() {
        return this.ownerName;
    }

    public final Object getPermitCategory() {
        return this.permitCategory;
    }

    public final Integer getPermitCategoryCd() {
        return this.permitCategoryCd;
    }

    public final String getPermitNo() {
        return this.permitNo;
    }

    public final String getPermitType() {
        return this.permitType;
    }

    public final Integer getPermitTypeCd() {
        return this.permitTypeCd;
    }

    public final String getPermitUpto() {
        return this.permitUpto;
    }

    public final String getPuccValidity() {
        return this.puccValidity;
    }

    public final String getRcptDate() {
        return this.rcptDate;
    }

    public final String getRcptNo() {
        return this.rcptNo;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final Integer getSeatingCap() {
        return this.seatingCap;
    }

    public final Object getServiceType() {
        return this.serviceType;
    }

    public final Object getServiceTypeCd() {
        return this.serviceTypeCd;
    }

    public final Integer getSleeperCap() {
        return this.sleeperCap;
    }

    public final String getStateCd() {
        return this.stateCd;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public final String getTaxMode() {
        return this.taxMode;
    }

    public final Integer getTaxModeCd() {
        return this.taxModeCd;
    }

    public final String getUptoDate() {
        return this.uptoDate;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final Integer getVchUlWt() {
        return this.vchUlWt;
    }

    public final Integer getVchWt() {
        return this.vchWt;
    }

    public final String getVehicleCatg() {
        return this.vehicleCatg;
    }

    public final String getVehicleClass() {
        return this.vehicleClass;
    }

    public final Integer getVehicleClassCd() {
        return this.vehicleClassCd;
    }

    public final String getVehicleType() {
        return this.vehicleType;
    }

    public final Integer getVehicleTypeCd() {
        return this.vehicleTypeCd;
    }

    public final List<VpAccount> getVpAccount() {
        return this.vpAccount;
    }

    public final VpDetails getVpDetails() {
        return this.vpDetails;
    }

    public int hashCode() {
        Integer num = this.amount;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.chassisNo;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.checkpostName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.checkpostNameCd;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.districtCd;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.districtCode;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.fitnessValidity;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.fromDate;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.greenTaxUpto;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.insValidity;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.mobileNo;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.ownerName;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Object obj = this.permitCategory;
        int iHashCode13 = (iHashCode12 + (obj == null ? 0 : obj.hashCode())) * 31;
        Integer num2 = this.permitCategoryCd;
        int iHashCode14 = (iHashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str12 = this.permitNo;
        int iHashCode15 = (iHashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.permitType;
        int iHashCode16 = (iHashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Integer num3 = this.permitTypeCd;
        int iHashCode17 = (iHashCode16 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str14 = this.permitUpto;
        int iHashCode18 = (iHashCode17 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.puccValidity;
        int iHashCode19 = (iHashCode18 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.rcptDate;
        int iHashCode20 = (iHashCode19 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.rcptNo;
        int iHashCode21 = (iHashCode20 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.regnNo;
        int iHashCode22 = (iHashCode21 + (str18 == null ? 0 : str18.hashCode())) * 31;
        Integer num4 = this.seatingCap;
        int iHashCode23 = (iHashCode22 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Object obj2 = this.serviceType;
        int iHashCode24 = (iHashCode23 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.serviceTypeCd;
        int iHashCode25 = (iHashCode24 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Integer num5 = this.sleeperCap;
        int iHashCode26 = (iHashCode25 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str19 = this.stateCd;
        int iHashCode27 = (iHashCode26 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.stateCode;
        int iHashCode28 = (iHashCode27 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.taxMode;
        int iHashCode29 = (iHashCode28 + (str21 == null ? 0 : str21.hashCode())) * 31;
        Integer num6 = this.taxModeCd;
        int iHashCode30 = (iHashCode29 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str22 = this.uptoDate;
        int iHashCode31 = (iHashCode30 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.userId;
        int iHashCode32 = (iHashCode31 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.userName;
        int iHashCode33 = (iHashCode32 + (str24 == null ? 0 : str24.hashCode())) * 31;
        Integer num7 = this.vchUlWt;
        int iHashCode34 = (iHashCode33 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.vchWt;
        int iHashCode35 = (iHashCode34 + (num8 == null ? 0 : num8.hashCode())) * 31;
        String str25 = this.vehicleCatg;
        int iHashCode36 = (iHashCode35 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.vehicleClass;
        int iHashCode37 = (iHashCode36 + (str26 == null ? 0 : str26.hashCode())) * 31;
        Integer num9 = this.vehicleClassCd;
        int iHashCode38 = (iHashCode37 + (num9 == null ? 0 : num9.hashCode())) * 31;
        String str27 = this.vehicleType;
        int iHashCode39 = (iHashCode38 + (str27 == null ? 0 : str27.hashCode())) * 31;
        Integer num10 = this.vehicleTypeCd;
        int iHashCode40 = (iHashCode39 + (num10 == null ? 0 : num10.hashCode())) * 31;
        List<VpAccount> list = this.vpAccount;
        int iHashCode41 = (iHashCode40 + (list == null ? 0 : list.hashCode())) * 31;
        VpDetails vpDetails = this.vpDetails;
        return iHashCode41 + (vpDetails != null ? vpDetails.hashCode() : 0);
    }

    public String toString() {
        return "CheckPostReceiptModel(amount=" + this.amount + ", chassisNo=" + this.chassisNo + ", checkpostName=" + this.checkpostName + ", checkpostNameCd=" + this.checkpostNameCd + ", districtCd=" + this.districtCd + ", districtCode=" + this.districtCode + ", fitnessValidity=" + this.fitnessValidity + ", fromDate=" + this.fromDate + ", greenTaxUpto=" + this.greenTaxUpto + ", insValidity=" + this.insValidity + ", mobileNo=" + this.mobileNo + ", ownerName=" + this.ownerName + ", permitCategory=" + this.permitCategory + ", permitCategoryCd=" + this.permitCategoryCd + ", permitNo=" + this.permitNo + ", permitType=" + this.permitType + ", permitTypeCd=" + this.permitTypeCd + ", permitUpto=" + this.permitUpto + ", puccValidity=" + this.puccValidity + ", rcptDate=" + this.rcptDate + ", rcptNo=" + this.rcptNo + ", regnNo=" + this.regnNo + ", seatingCap=" + this.seatingCap + ", serviceType=" + this.serviceType + ", serviceTypeCd=" + this.serviceTypeCd + ", sleeperCap=" + this.sleeperCap + ", stateCd=" + this.stateCd + ", stateCode=" + this.stateCode + ", taxMode=" + this.taxMode + ", taxModeCd=" + this.taxModeCd + ", uptoDate=" + this.uptoDate + ", userId=" + this.userId + ", userName=" + this.userName + ", vchUlWt=" + this.vchUlWt + ", vchWt=" + this.vchWt + ", vehicleCatg=" + this.vehicleCatg + ", vehicleClass=" + this.vehicleClass + ", vehicleClassCd=" + this.vehicleClassCd + ", vehicleType=" + this.vehicleType + ", vehicleTypeCd=" + this.vehicleTypeCd + ", vpAccount=" + this.vpAccount + ", vpDetails=" + this.vpDetails + ')';
    }
}
