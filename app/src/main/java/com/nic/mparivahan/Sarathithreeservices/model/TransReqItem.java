package com.nic.mparivahan.Sarathithreeservices.model;

import androidx.annotation.Keep;
import com.zepto.xy5;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bé\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\u0002\u0010\u001bJ\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010*J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010?\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010*J\u000b\u0010@\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010*J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010E\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010*J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jò\u0001\u0010I\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÆ\u0001¢\u0006\u0002\u0010JJ\u0013\u0010K\u001a\u00020L2\b\u0010M\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010N\u001a\u00020\bHÖ\u0001J\t\u0010O\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\"R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001fR\u001a\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010+\u001a\u0004\b-\u0010*R\u001a\u0010\u0017\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010+\u001a\u0004\b.\u0010*R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010+\u001a\u0004\b/\u0010*R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001fR\u001a\u0010\u0018\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010+\u001a\u0004\b1\u0010*R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105¨\u0006P"}, d2 = {"Lcom/nic/mparivahan/Sarathithreeservices/model/TransReqItem;", "Ljava/io/Serializable;", "trRefLicvalidDt", "", "trLlNo", "", "trCheckUsertoken", "trSlNo", "", "trEntrydt", "trTokenId", "trRefLictype", "trStatus", "trApplno", "trDigest", "reasonMast", "Lcom/nic/mparivahan/Sarathithreeservices/model/ReasonMast;", "trRefLicno", "veclass", "Lcom/nic/mparivahan/Sarathithreeservices/model/Veclass;", "trServiceWitdraw", "trUserId", "trVehRegNo", "trTrCd", "trVisitNo", "trans", "Lcom/nic/mparivahan/Sarathithreeservices/model/Trans;", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Lcom/nic/mparivahan/Sarathithreeservices/model/ReasonMast;Ljava/lang/String;Lcom/nic/mparivahan/Sarathithreeservices/model/Veclass;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/nic/mparivahan/Sarathithreeservices/model/Trans;)V", "getReasonMast", "()Lcom/nic/mparivahan/Sarathithreeservices/model/ReasonMast;", "getTrApplno", "()Ljava/lang/Object;", "getTrCheckUsertoken", "getTrDigest", "()Ljava/lang/String;", "getTrEntrydt", "getTrLlNo", "getTrRefLicno", "getTrRefLictype", "getTrRefLicvalidDt", "getTrServiceWitdraw", "getTrSlNo", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTrStatus", "getTrTokenId", "getTrTrCd", "getTrUserId", "getTrVehRegNo", "getTrVisitNo", "getTrans", "()Lcom/nic/mparivahan/Sarathithreeservices/model/Trans;", "getVeclass", "()Lcom/nic/mparivahan/Sarathithreeservices/model/Veclass;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Lcom/nic/mparivahan/Sarathithreeservices/model/ReasonMast;Ljava/lang/String;Lcom/nic/mparivahan/Sarathithreeservices/model/Veclass;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/nic/mparivahan/Sarathithreeservices/model/Trans;)Lcom/nic/mparivahan/Sarathithreeservices/model/TransReqItem;", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class TransReqItem implements Serializable {

    @xy5("reasonMast")
    private final ReasonMast reasonMast;

    @xy5("trApplno")
    private final Object trApplno;

    @xy5("trCheckUsertoken")
    private final Object trCheckUsertoken;

    @xy5("trDigest")
    private final String trDigest;

    @xy5("trEntrydt")
    private final String trEntrydt;

    @xy5("trLlNo")
    private final Object trLlNo;

    @xy5("trRefLicno")
    private final String trRefLicno;

    @xy5("trRefLictype")
    private final String trRefLictype;

    @xy5("trRefLicvalidDt")
    private final String trRefLicvalidDt;

    @xy5("trServiceWitdraw")
    private final Object trServiceWitdraw;

    @xy5("trSlNo")
    private final Integer trSlNo;

    @xy5("trStatus")
    private final Object trStatus;

    @xy5("trTokenId")
    private final Integer trTokenId;

    @xy5("trTrCd")
    private final Integer trTrCd;

    @xy5("trUserId")
    private final Integer trUserId;

    @xy5("trVehRegNo")
    private final Object trVehRegNo;

    @xy5("trVisitNo")
    private final Integer trVisitNo;

    @xy5("trans")
    private final Trans trans;

    @xy5("veclass")
    private final Veclass veclass;

    public TransReqItem() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTrRefLicvalidDt() {
        return this.trRefLicvalidDt;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTrDigest() {
        return this.trDigest;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final ReasonMast getReasonMast() {
        return this.reasonMast;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getTrRefLicno() {
        return this.trRefLicno;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Veclass getVeclass() {
        return this.veclass;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Object getTrServiceWitdraw() {
        return this.trServiceWitdraw;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Integer getTrUserId() {
        return this.trUserId;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Object getTrVehRegNo() {
        return this.trVehRegNo;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Integer getTrTrCd() {
        return this.trTrCd;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Integer getTrVisitNo() {
        return this.trVisitNo;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Trans getTrans() {
        return this.trans;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getTrLlNo() {
        return this.trLlNo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Object getTrCheckUsertoken() {
        return this.trCheckUsertoken;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getTrSlNo() {
        return this.trSlNo;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTrEntrydt() {
        return this.trEntrydt;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getTrTokenId() {
        return this.trTokenId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTrRefLictype() {
        return this.trRefLictype;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Object getTrStatus() {
        return this.trStatus;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Object getTrApplno() {
        return this.trApplno;
    }

    public final TransReqItem copy(String trRefLicvalidDt, Object trLlNo, Object trCheckUsertoken, Integer trSlNo, String trEntrydt, Integer trTokenId, String trRefLictype, Object trStatus, Object trApplno, String trDigest, ReasonMast reasonMast, String trRefLicno, Veclass veclass, Object trServiceWitdraw, Integer trUserId, Object trVehRegNo, Integer trTrCd, Integer trVisitNo, Trans trans) {
        return new TransReqItem(trRefLicvalidDt, trLlNo, trCheckUsertoken, trSlNo, trEntrydt, trTokenId, trRefLictype, trStatus, trApplno, trDigest, reasonMast, trRefLicno, veclass, trServiceWitdraw, trUserId, trVehRegNo, trTrCd, trVisitNo, trans);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransReqItem)) {
            return false;
        }
        TransReqItem transReqItem = (TransReqItem) other;
        return Intrinsics.areEqual(this.trRefLicvalidDt, transReqItem.trRefLicvalidDt) && Intrinsics.areEqual(this.trLlNo, transReqItem.trLlNo) && Intrinsics.areEqual(this.trCheckUsertoken, transReqItem.trCheckUsertoken) && Intrinsics.areEqual(this.trSlNo, transReqItem.trSlNo) && Intrinsics.areEqual(this.trEntrydt, transReqItem.trEntrydt) && Intrinsics.areEqual(this.trTokenId, transReqItem.trTokenId) && Intrinsics.areEqual(this.trRefLictype, transReqItem.trRefLictype) && Intrinsics.areEqual(this.trStatus, transReqItem.trStatus) && Intrinsics.areEqual(this.trApplno, transReqItem.trApplno) && Intrinsics.areEqual(this.trDigest, transReqItem.trDigest) && Intrinsics.areEqual(this.reasonMast, transReqItem.reasonMast) && Intrinsics.areEqual(this.trRefLicno, transReqItem.trRefLicno) && Intrinsics.areEqual(this.veclass, transReqItem.veclass) && Intrinsics.areEqual(this.trServiceWitdraw, transReqItem.trServiceWitdraw) && Intrinsics.areEqual(this.trUserId, transReqItem.trUserId) && Intrinsics.areEqual(this.trVehRegNo, transReqItem.trVehRegNo) && Intrinsics.areEqual(this.trTrCd, transReqItem.trTrCd) && Intrinsics.areEqual(this.trVisitNo, transReqItem.trVisitNo) && Intrinsics.areEqual(this.trans, transReqItem.trans);
    }

    public final ReasonMast getReasonMast() {
        return this.reasonMast;
    }

    public final Object getTrApplno() {
        return this.trApplno;
    }

    public final Object getTrCheckUsertoken() {
        return this.trCheckUsertoken;
    }

    public final String getTrDigest() {
        return this.trDigest;
    }

    public final String getTrEntrydt() {
        return this.trEntrydt;
    }

    public final Object getTrLlNo() {
        return this.trLlNo;
    }

    public final String getTrRefLicno() {
        return this.trRefLicno;
    }

    public final String getTrRefLictype() {
        return this.trRefLictype;
    }

    public final String getTrRefLicvalidDt() {
        return this.trRefLicvalidDt;
    }

    public final Object getTrServiceWitdraw() {
        return this.trServiceWitdraw;
    }

    public final Integer getTrSlNo() {
        return this.trSlNo;
    }

    public final Object getTrStatus() {
        return this.trStatus;
    }

    public final Integer getTrTokenId() {
        return this.trTokenId;
    }

    public final Integer getTrTrCd() {
        return this.trTrCd;
    }

    public final Integer getTrUserId() {
        return this.trUserId;
    }

    public final Object getTrVehRegNo() {
        return this.trVehRegNo;
    }

    public final Integer getTrVisitNo() {
        return this.trVisitNo;
    }

    public final Trans getTrans() {
        return this.trans;
    }

    public final Veclass getVeclass() {
        return this.veclass;
    }

    public int hashCode() {
        String str = this.trRefLicvalidDt;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Object obj = this.trLlNo;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.trCheckUsertoken;
        int iHashCode3 = (iHashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Integer num = this.trSlNo;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.trEntrydt;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.trTokenId;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.trRefLictype;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Object obj3 = this.trStatus;
        int iHashCode8 = (iHashCode7 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.trApplno;
        int iHashCode9 = (iHashCode8 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        String str4 = this.trDigest;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ReasonMast reasonMast = this.reasonMast;
        int iHashCode11 = (iHashCode10 + (reasonMast == null ? 0 : reasonMast.hashCode())) * 31;
        String str5 = this.trRefLicno;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Veclass veclass = this.veclass;
        int iHashCode13 = (iHashCode12 + (veclass == null ? 0 : veclass.hashCode())) * 31;
        Object obj5 = this.trServiceWitdraw;
        int iHashCode14 = (iHashCode13 + (obj5 == null ? 0 : obj5.hashCode())) * 31;
        Integer num3 = this.trUserId;
        int iHashCode15 = (iHashCode14 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Object obj6 = this.trVehRegNo;
        int iHashCode16 = (iHashCode15 + (obj6 == null ? 0 : obj6.hashCode())) * 31;
        Integer num4 = this.trTrCd;
        int iHashCode17 = (iHashCode16 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.trVisitNo;
        int iHashCode18 = (iHashCode17 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Trans trans = this.trans;
        return iHashCode18 + (trans != null ? trans.hashCode() : 0);
    }

    public String toString() {
        return "TransReqItem(trRefLicvalidDt=" + this.trRefLicvalidDt + ", trLlNo=" + this.trLlNo + ", trCheckUsertoken=" + this.trCheckUsertoken + ", trSlNo=" + this.trSlNo + ", trEntrydt=" + this.trEntrydt + ", trTokenId=" + this.trTokenId + ", trRefLictype=" + this.trRefLictype + ", trStatus=" + this.trStatus + ", trApplno=" + this.trApplno + ", trDigest=" + this.trDigest + ", reasonMast=" + this.reasonMast + ", trRefLicno=" + this.trRefLicno + ", veclass=" + this.veclass + ", trServiceWitdraw=" + this.trServiceWitdraw + ", trUserId=" + this.trUserId + ", trVehRegNo=" + this.trVehRegNo + ", trTrCd=" + this.trTrCd + ", trVisitNo=" + this.trVisitNo + ", trans=" + this.trans + ')';
    }

    public TransReqItem(String str, Object obj, Object obj2, Integer num, String str2, Integer num2, String str3, Object obj3, Object obj4, String str4, ReasonMast reasonMast, String str5, Veclass veclass, Object obj5, Integer num3, Object obj6, Integer num4, Integer num5, Trans trans) {
        this.trRefLicvalidDt = str;
        this.trLlNo = obj;
        this.trCheckUsertoken = obj2;
        this.trSlNo = num;
        this.trEntrydt = str2;
        this.trTokenId = num2;
        this.trRefLictype = str3;
        this.trStatus = obj3;
        this.trApplno = obj4;
        this.trDigest = str4;
        this.reasonMast = reasonMast;
        this.trRefLicno = str5;
        this.veclass = veclass;
        this.trServiceWitdraw = obj5;
        this.trUserId = num3;
        this.trVehRegNo = obj6;
        this.trTrCd = num4;
        this.trVisitNo = num5;
        this.trans = trans;
    }

    public /* synthetic */ TransReqItem(String str, Object obj, Object obj2, Integer num, String str2, Integer num2, String str3, Object obj3, Object obj4, String str4, ReasonMast reasonMast, String str5, Veclass veclass, Object obj5, Integer num3, Object obj6, Integer num4, Integer num5, Trans trans, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : obj, (i & 4) != 0 ? null : obj2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : obj3, (i & 256) != 0 ? null : obj4, (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : str4, (i & 1024) != 0 ? null : reasonMast, (i & 2048) != 0 ? null : str5, (i & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? null : veclass, (i & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? null : obj5, (i & 16384) != 0 ? null : num3, (i & 32768) != 0 ? null : obj6, (i & 65536) != 0 ? null : num4, (i & 131072) != 0 ? null : num5, (i & 262144) != 0 ? null : trans);
    }
}
