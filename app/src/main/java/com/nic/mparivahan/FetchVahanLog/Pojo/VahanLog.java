package com.nic.mparivahan.FetchVahanLog.Pojo;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\bB\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B±\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005¢\u0006\u0002\u0010\u0019J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\t\u0010:\u001a\u00020\u0005HÆ\u0003J\t\u0010;\u001a\u00020\u0005HÆ\u0003J\t\u0010<\u001a\u00020\u0005HÆ\u0003J\t\u0010=\u001a\u00020\u0005HÆ\u0003J\t\u0010>\u001a\u00020\u0005HÆ\u0003J\t\u0010?\u001a\u00020\u0005HÆ\u0003J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0005HÆ\u0003J\t\u0010C\u001a\u00020\u0005HÆ\u0003J\t\u0010D\u001a\u00020\u0005HÆ\u0003J\t\u0010E\u001a\u00020\u0005HÆ\u0003JÝ\u0001\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u0005HÆ\u0001J\u0013\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010J\u001a\u00020\u0003HÖ\u0001J\t\u0010K\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0011\u0010\u0017\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0011\u0010\u0018\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001dR\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001dR\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001dR\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001d¨\u0006L"}, d2 = {"Lcom/nic/mparivahan/FetchVahanLog/Pojo/VahanLog;", "", "vahlogAadhar4", "", "vahlogApplDate", "", "vahlogApplNo", "vahlogChassis5", "vahlogCtzId", "vahlogEngine5", "vahlogDocUplDate", "vahlogFeeDate", "vahlogMobileNo", "vahlogPurCd", "vahlogRcNumber", "vahlogRecordId", "vahlogReptDate", "vahlogReptNo", "vahlogRtoCd", "vahlogStateCd", "vahlogVhClass", "vahlog_eKYC", "vahlog_eSign", "vahlogFeeAmt", "vahlogPhotoUplDate", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getVahlogAadhar4", "()I", "getVahlogApplDate", "()Ljava/lang/String;", "getVahlogApplNo", "getVahlogChassis5", "getVahlogCtzId", "getVahlogDocUplDate", "getVahlogEngine5", "getVahlogFeeAmt", "getVahlogFeeDate", "getVahlogMobileNo", "getVahlogPhotoUplDate", "getVahlogPurCd", "getVahlogRcNumber", "getVahlogRecordId", "getVahlogReptDate", "getVahlogReptNo", "getVahlogRtoCd", "getVahlogStateCd", "getVahlogVhClass", "getVahlog_eKYC", "getVahlog_eSign", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class VahanLog {
    private final int vahlogAadhar4;
    private final String vahlogApplDate;
    private final String vahlogApplNo;
    private final String vahlogChassis5;
    private final int vahlogCtzId;
    private final String vahlogDocUplDate;
    private final String vahlogEngine5;
    private final String vahlogFeeAmt;
    private final String vahlogFeeDate;
    private final String vahlogMobileNo;
    private final String vahlogPhotoUplDate;
    private final int vahlogPurCd;
    private final String vahlogRcNumber;
    private final int vahlogRecordId;
    private final String vahlogReptDate;
    private final String vahlogReptNo;
    private final String vahlogRtoCd;
    private final String vahlogStateCd;
    private final String vahlogVhClass;
    private final String vahlog_eKYC;
    private final String vahlog_eSign;

    public VahanLog(int i, String vahlogApplDate, String vahlogApplNo, String vahlogChassis5, int i2, String vahlogEngine5, String vahlogDocUplDate, String vahlogFeeDate, String vahlogMobileNo, int i3, String vahlogRcNumber, int i4, String str, String vahlogReptNo, String vahlogRtoCd, String vahlogStateCd, String vahlogVhClass, String vahlog_eKYC, String vahlog_eSign, String vahlogFeeAmt, String vahlogPhotoUplDate) {
        Intrinsics.checkNotNullParameter(vahlogApplDate, "vahlogApplDate");
        Intrinsics.checkNotNullParameter(vahlogApplNo, "vahlogApplNo");
        Intrinsics.checkNotNullParameter(vahlogChassis5, "vahlogChassis5");
        Intrinsics.checkNotNullParameter(vahlogEngine5, "vahlogEngine5");
        Intrinsics.checkNotNullParameter(vahlogDocUplDate, "vahlogDocUplDate");
        Intrinsics.checkNotNullParameter(vahlogFeeDate, "vahlogFeeDate");
        Intrinsics.checkNotNullParameter(vahlogMobileNo, "vahlogMobileNo");
        Intrinsics.checkNotNullParameter(vahlogRcNumber, "vahlogRcNumber");
        Intrinsics.checkNotNullParameter(vahlogReptNo, "vahlogReptNo");
        Intrinsics.checkNotNullParameter(vahlogRtoCd, "vahlogRtoCd");
        Intrinsics.checkNotNullParameter(vahlogStateCd, "vahlogStateCd");
        Intrinsics.checkNotNullParameter(vahlogVhClass, "vahlogVhClass");
        Intrinsics.checkNotNullParameter(vahlog_eKYC, "vahlog_eKYC");
        Intrinsics.checkNotNullParameter(vahlog_eSign, "vahlog_eSign");
        Intrinsics.checkNotNullParameter(vahlogFeeAmt, "vahlogFeeAmt");
        Intrinsics.checkNotNullParameter(vahlogPhotoUplDate, "vahlogPhotoUplDate");
        this.vahlogAadhar4 = i;
        this.vahlogApplDate = vahlogApplDate;
        this.vahlogApplNo = vahlogApplNo;
        this.vahlogChassis5 = vahlogChassis5;
        this.vahlogCtzId = i2;
        this.vahlogEngine5 = vahlogEngine5;
        this.vahlogDocUplDate = vahlogDocUplDate;
        this.vahlogFeeDate = vahlogFeeDate;
        this.vahlogMobileNo = vahlogMobileNo;
        this.vahlogPurCd = i3;
        this.vahlogRcNumber = vahlogRcNumber;
        this.vahlogRecordId = i4;
        this.vahlogReptDate = str;
        this.vahlogReptNo = vahlogReptNo;
        this.vahlogRtoCd = vahlogRtoCd;
        this.vahlogStateCd = vahlogStateCd;
        this.vahlogVhClass = vahlogVhClass;
        this.vahlog_eKYC = vahlog_eKYC;
        this.vahlog_eSign = vahlog_eSign;
        this.vahlogFeeAmt = vahlogFeeAmt;
        this.vahlogPhotoUplDate = vahlogPhotoUplDate;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getVahlogAadhar4() {
        return this.vahlogAadhar4;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getVahlogPurCd() {
        return this.vahlogPurCd;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getVahlogRcNumber() {
        return this.vahlogRcNumber;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getVahlogRecordId() {
        return this.vahlogRecordId;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getVahlogReptDate() {
        return this.vahlogReptDate;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getVahlogReptNo() {
        return this.vahlogReptNo;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getVahlogRtoCd() {
        return this.vahlogRtoCd;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getVahlogStateCd() {
        return this.vahlogStateCd;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getVahlogVhClass() {
        return this.vahlogVhClass;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getVahlog_eKYC() {
        return this.vahlog_eKYC;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getVahlog_eSign() {
        return this.vahlog_eSign;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVahlogApplDate() {
        return this.vahlogApplDate;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getVahlogFeeAmt() {
        return this.vahlogFeeAmt;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getVahlogPhotoUplDate() {
        return this.vahlogPhotoUplDate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getVahlogApplNo() {
        return this.vahlogApplNo;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getVahlogChassis5() {
        return this.vahlogChassis5;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getVahlogCtzId() {
        return this.vahlogCtzId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getVahlogEngine5() {
        return this.vahlogEngine5;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getVahlogDocUplDate() {
        return this.vahlogDocUplDate;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getVahlogFeeDate() {
        return this.vahlogFeeDate;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getVahlogMobileNo() {
        return this.vahlogMobileNo;
    }

    public final VahanLog copy(int vahlogAadhar4, String vahlogApplDate, String vahlogApplNo, String vahlogChassis5, int vahlogCtzId, String vahlogEngine5, String vahlogDocUplDate, String vahlogFeeDate, String vahlogMobileNo, int vahlogPurCd, String vahlogRcNumber, int vahlogRecordId, String vahlogReptDate, String vahlogReptNo, String vahlogRtoCd, String vahlogStateCd, String vahlogVhClass, String vahlog_eKYC, String vahlog_eSign, String vahlogFeeAmt, String vahlogPhotoUplDate) {
        Intrinsics.checkNotNullParameter(vahlogApplDate, "vahlogApplDate");
        Intrinsics.checkNotNullParameter(vahlogApplNo, "vahlogApplNo");
        Intrinsics.checkNotNullParameter(vahlogChassis5, "vahlogChassis5");
        Intrinsics.checkNotNullParameter(vahlogEngine5, "vahlogEngine5");
        Intrinsics.checkNotNullParameter(vahlogDocUplDate, "vahlogDocUplDate");
        Intrinsics.checkNotNullParameter(vahlogFeeDate, "vahlogFeeDate");
        Intrinsics.checkNotNullParameter(vahlogMobileNo, "vahlogMobileNo");
        Intrinsics.checkNotNullParameter(vahlogRcNumber, "vahlogRcNumber");
        Intrinsics.checkNotNullParameter(vahlogReptNo, "vahlogReptNo");
        Intrinsics.checkNotNullParameter(vahlogRtoCd, "vahlogRtoCd");
        Intrinsics.checkNotNullParameter(vahlogStateCd, "vahlogStateCd");
        Intrinsics.checkNotNullParameter(vahlogVhClass, "vahlogVhClass");
        Intrinsics.checkNotNullParameter(vahlog_eKYC, "vahlog_eKYC");
        Intrinsics.checkNotNullParameter(vahlog_eSign, "vahlog_eSign");
        Intrinsics.checkNotNullParameter(vahlogFeeAmt, "vahlogFeeAmt");
        Intrinsics.checkNotNullParameter(vahlogPhotoUplDate, "vahlogPhotoUplDate");
        return new VahanLog(vahlogAadhar4, vahlogApplDate, vahlogApplNo, vahlogChassis5, vahlogCtzId, vahlogEngine5, vahlogDocUplDate, vahlogFeeDate, vahlogMobileNo, vahlogPurCd, vahlogRcNumber, vahlogRecordId, vahlogReptDate, vahlogReptNo, vahlogRtoCd, vahlogStateCd, vahlogVhClass, vahlog_eKYC, vahlog_eSign, vahlogFeeAmt, vahlogPhotoUplDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VahanLog)) {
            return false;
        }
        VahanLog vahanLog = (VahanLog) other;
        return this.vahlogAadhar4 == vahanLog.vahlogAadhar4 && Intrinsics.areEqual(this.vahlogApplDate, vahanLog.vahlogApplDate) && Intrinsics.areEqual(this.vahlogApplNo, vahanLog.vahlogApplNo) && Intrinsics.areEqual(this.vahlogChassis5, vahanLog.vahlogChassis5) && this.vahlogCtzId == vahanLog.vahlogCtzId && Intrinsics.areEqual(this.vahlogEngine5, vahanLog.vahlogEngine5) && Intrinsics.areEqual(this.vahlogDocUplDate, vahanLog.vahlogDocUplDate) && Intrinsics.areEqual(this.vahlogFeeDate, vahanLog.vahlogFeeDate) && Intrinsics.areEqual(this.vahlogMobileNo, vahanLog.vahlogMobileNo) && this.vahlogPurCd == vahanLog.vahlogPurCd && Intrinsics.areEqual(this.vahlogRcNumber, vahanLog.vahlogRcNumber) && this.vahlogRecordId == vahanLog.vahlogRecordId && Intrinsics.areEqual(this.vahlogReptDate, vahanLog.vahlogReptDate) && Intrinsics.areEqual(this.vahlogReptNo, vahanLog.vahlogReptNo) && Intrinsics.areEqual(this.vahlogRtoCd, vahanLog.vahlogRtoCd) && Intrinsics.areEqual(this.vahlogStateCd, vahanLog.vahlogStateCd) && Intrinsics.areEqual(this.vahlogVhClass, vahanLog.vahlogVhClass) && Intrinsics.areEqual(this.vahlog_eKYC, vahanLog.vahlog_eKYC) && Intrinsics.areEqual(this.vahlog_eSign, vahanLog.vahlog_eSign) && Intrinsics.areEqual(this.vahlogFeeAmt, vahanLog.vahlogFeeAmt) && Intrinsics.areEqual(this.vahlogPhotoUplDate, vahanLog.vahlogPhotoUplDate);
    }

    public final int getVahlogAadhar4() {
        return this.vahlogAadhar4;
    }

    public final String getVahlogApplDate() {
        return this.vahlogApplDate;
    }

    public final String getVahlogApplNo() {
        return this.vahlogApplNo;
    }

    public final String getVahlogChassis5() {
        return this.vahlogChassis5;
    }

    public final int getVahlogCtzId() {
        return this.vahlogCtzId;
    }

    public final String getVahlogDocUplDate() {
        return this.vahlogDocUplDate;
    }

    public final String getVahlogEngine5() {
        return this.vahlogEngine5;
    }

    public final String getVahlogFeeAmt() {
        return this.vahlogFeeAmt;
    }

    public final String getVahlogFeeDate() {
        return this.vahlogFeeDate;
    }

    public final String getVahlogMobileNo() {
        return this.vahlogMobileNo;
    }

    public final String getVahlogPhotoUplDate() {
        return this.vahlogPhotoUplDate;
    }

    public final int getVahlogPurCd() {
        return this.vahlogPurCd;
    }

    public final String getVahlogRcNumber() {
        return this.vahlogRcNumber;
    }

    public final int getVahlogRecordId() {
        return this.vahlogRecordId;
    }

    public final String getVahlogReptDate() {
        return this.vahlogReptDate;
    }

    public final String getVahlogReptNo() {
        return this.vahlogReptNo;
    }

    public final String getVahlogRtoCd() {
        return this.vahlogRtoCd;
    }

    public final String getVahlogStateCd() {
        return this.vahlogStateCd;
    }

    public final String getVahlogVhClass() {
        return this.vahlogVhClass;
    }

    public final String getVahlog_eKYC() {
        return this.vahlog_eKYC;
    }

    public final String getVahlog_eSign() {
        return this.vahlog_eSign;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((Integer.hashCode(this.vahlogAadhar4) * 31) + this.vahlogApplDate.hashCode()) * 31) + this.vahlogApplNo.hashCode()) * 31) + this.vahlogChassis5.hashCode()) * 31) + Integer.hashCode(this.vahlogCtzId)) * 31) + this.vahlogEngine5.hashCode()) * 31) + this.vahlogDocUplDate.hashCode()) * 31) + this.vahlogFeeDate.hashCode()) * 31) + this.vahlogMobileNo.hashCode()) * 31) + Integer.hashCode(this.vahlogPurCd)) * 31) + this.vahlogRcNumber.hashCode()) * 31) + Integer.hashCode(this.vahlogRecordId)) * 31;
        String str = this.vahlogReptDate;
        return ((((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.vahlogReptNo.hashCode()) * 31) + this.vahlogRtoCd.hashCode()) * 31) + this.vahlogStateCd.hashCode()) * 31) + this.vahlogVhClass.hashCode()) * 31) + this.vahlog_eKYC.hashCode()) * 31) + this.vahlog_eSign.hashCode()) * 31) + this.vahlogFeeAmt.hashCode()) * 31) + this.vahlogPhotoUplDate.hashCode();
    }

    public String toString() {
        return "VahanLog(vahlogAadhar4=" + this.vahlogAadhar4 + ", vahlogApplDate=" + this.vahlogApplDate + ", vahlogApplNo=" + this.vahlogApplNo + ", vahlogChassis5=" + this.vahlogChassis5 + ", vahlogCtzId=" + this.vahlogCtzId + ", vahlogEngine5=" + this.vahlogEngine5 + ", vahlogDocUplDate=" + this.vahlogDocUplDate + ", vahlogFeeDate=" + this.vahlogFeeDate + ", vahlogMobileNo=" + this.vahlogMobileNo + ", vahlogPurCd=" + this.vahlogPurCd + ", vahlogRcNumber=" + this.vahlogRcNumber + ", vahlogRecordId=" + this.vahlogRecordId + ", vahlogReptDate=" + this.vahlogReptDate + ", vahlogReptNo=" + this.vahlogReptNo + ", vahlogRtoCd=" + this.vahlogRtoCd + ", vahlogStateCd=" + this.vahlogStateCd + ", vahlogVhClass=" + this.vahlogVhClass + ", vahlog_eKYC=" + this.vahlog_eKYC + ", vahlog_eSign=" + this.vahlog_eSign + ", vahlogFeeAmt=" + this.vahlogFeeAmt + ", vahlogPhotoUplDate=" + this.vahlogPhotoUplDate + ')';
    }

    public /* synthetic */ VahanLog(int i, String str, String str2, String str3, int i2, String str4, String str5, String str6, String str7, int i3, String str8, int i4, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, str3, i2, str4, str5, str6, str7, i3, str8, i4, (i5 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? "" : str9, str10, str11, str12, str13, str14, str15, str16, str17);
    }
}
