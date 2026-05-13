package com.nic.mparivahan.Dl.Model;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003Jm\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u0007HÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\u0007HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014¨\u0006,"}, d2 = {"Lcom/nic/mparivahan/Dl/Model/TransReqObj;", "Ljava/io/Serializable;", "olaCode", "", "olaOffName", "trAbbr", "trApplno", "", "trCovcd", "trEntrydt", "trName", "trSlNo", "trTrCd", "trVisitNo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;III)V", "getOlaCode", "()Ljava/lang/String;", "getOlaOffName", "getTrAbbr", "getTrApplno", "()I", "getTrCovcd", "getTrEntrydt", "getTrName", "getTrSlNo", "getTrTrCd", "getTrVisitNo", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class TransReqObj implements Serializable {
    private final String olaCode;
    private final String olaOffName;
    private final String trAbbr;
    private final int trApplno;
    private final int trCovcd;
    private final String trEntrydt;
    private final String trName;
    private final int trSlNo;
    private final int trTrCd;
    private final int trVisitNo;

    public TransReqObj(String olaCode, String olaOffName, String trAbbr, int i, int i2, String trEntrydt, String trName, int i3, int i4, int i5) {
        Intrinsics.checkNotNullParameter(olaCode, "olaCode");
        Intrinsics.checkNotNullParameter(olaOffName, "olaOffName");
        Intrinsics.checkNotNullParameter(trAbbr, "trAbbr");
        Intrinsics.checkNotNullParameter(trEntrydt, "trEntrydt");
        Intrinsics.checkNotNullParameter(trName, "trName");
        this.olaCode = olaCode;
        this.olaOffName = olaOffName;
        this.trAbbr = trAbbr;
        this.trApplno = i;
        this.trCovcd = i2;
        this.trEntrydt = trEntrydt;
        this.trName = trName;
        this.trSlNo = i3;
        this.trTrCd = i4;
        this.trVisitNo = i5;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOlaCode() {
        return this.olaCode;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getTrVisitNo() {
        return this.trVisitNo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOlaOffName() {
        return this.olaOffName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTrAbbr() {
        return this.trAbbr;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTrApplno() {
        return this.trApplno;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getTrCovcd() {
        return this.trCovcd;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTrEntrydt() {
        return this.trEntrydt;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTrName() {
        return this.trName;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getTrSlNo() {
        return this.trSlNo;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getTrTrCd() {
        return this.trTrCd;
    }

    public final TransReqObj copy(String olaCode, String olaOffName, String trAbbr, int trApplno, int trCovcd, String trEntrydt, String trName, int trSlNo, int trTrCd, int trVisitNo) {
        Intrinsics.checkNotNullParameter(olaCode, "olaCode");
        Intrinsics.checkNotNullParameter(olaOffName, "olaOffName");
        Intrinsics.checkNotNullParameter(trAbbr, "trAbbr");
        Intrinsics.checkNotNullParameter(trEntrydt, "trEntrydt");
        Intrinsics.checkNotNullParameter(trName, "trName");
        return new TransReqObj(olaCode, olaOffName, trAbbr, trApplno, trCovcd, trEntrydt, trName, trSlNo, trTrCd, trVisitNo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransReqObj)) {
            return false;
        }
        TransReqObj transReqObj = (TransReqObj) other;
        return Intrinsics.areEqual(this.olaCode, transReqObj.olaCode) && Intrinsics.areEqual(this.olaOffName, transReqObj.olaOffName) && Intrinsics.areEqual(this.trAbbr, transReqObj.trAbbr) && this.trApplno == transReqObj.trApplno && this.trCovcd == transReqObj.trCovcd && Intrinsics.areEqual(this.trEntrydt, transReqObj.trEntrydt) && Intrinsics.areEqual(this.trName, transReqObj.trName) && this.trSlNo == transReqObj.trSlNo && this.trTrCd == transReqObj.trTrCd && this.trVisitNo == transReqObj.trVisitNo;
    }

    public final String getOlaCode() {
        return this.olaCode;
    }

    public final String getOlaOffName() {
        return this.olaOffName;
    }

    public final String getTrAbbr() {
        return this.trAbbr;
    }

    public final int getTrApplno() {
        return this.trApplno;
    }

    public final int getTrCovcd() {
        return this.trCovcd;
    }

    public final String getTrEntrydt() {
        return this.trEntrydt;
    }

    public final String getTrName() {
        return this.trName;
    }

    public final int getTrSlNo() {
        return this.trSlNo;
    }

    public final int getTrTrCd() {
        return this.trTrCd;
    }

    public final int getTrVisitNo() {
        return this.trVisitNo;
    }

    public int hashCode() {
        return (((((((((((((((((this.olaCode.hashCode() * 31) + this.olaOffName.hashCode()) * 31) + this.trAbbr.hashCode()) * 31) + Integer.hashCode(this.trApplno)) * 31) + Integer.hashCode(this.trCovcd)) * 31) + this.trEntrydt.hashCode()) * 31) + this.trName.hashCode()) * 31) + Integer.hashCode(this.trSlNo)) * 31) + Integer.hashCode(this.trTrCd)) * 31) + Integer.hashCode(this.trVisitNo);
    }

    public String toString() {
        return "TransReqObj(olaCode=" + this.olaCode + ", olaOffName=" + this.olaOffName + ", trAbbr=" + this.trAbbr + ", trApplno=" + this.trApplno + ", trCovcd=" + this.trCovcd + ", trEntrydt=" + this.trEntrydt + ", trName=" + this.trName + ", trSlNo=" + this.trSlNo + ", trTrCd=" + this.trTrCd + ", trVisitNo=" + this.trVisitNo + ')';
    }
}
