package com.nic.mparivahan.fetchSarathiLog.FetchSarthiPojo;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b;\b\u0087\b\u0018\u00002\u00020\u0001B¥\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0001\u0012\u0006\u0010\r\u001a\u00020\u0001\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0001\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0004¢\u0006\u0002\u0010\u001aJ\t\u00104\u001a\u00020\u0001HÆ\u0003J\t\u00105\u001a\u00020\u0004HÆ\u0003J\t\u00106\u001a\u00020\u0004HÆ\u0003J\t\u00107\u001a\u00020\u0004HÆ\u0003J\t\u00108\u001a\u00020\u0012HÆ\u0003J\t\u00109\u001a\u00020\u0001HÆ\u0003J\t\u0010:\u001a\u00020\tHÆ\u0003J\t\u0010;\u001a\u00020\tHÆ\u0003J\t\u0010<\u001a\u00020\u0004HÆ\u0003J\t\u0010=\u001a\u00020\u0004HÆ\u0003J\t\u0010>\u001a\u00020\u0004HÆ\u0003J\t\u0010?\u001a\u00020\u0004HÆ\u0003J\t\u0010@\u001a\u00020\u0004HÆ\u0003J\t\u0010A\u001a\u00020\u0004HÆ\u0003J\t\u0010B\u001a\u00020\u0007HÆ\u0003J\t\u0010C\u001a\u00020\tHÆ\u0003J\t\u0010D\u001a\u00020\u0004HÆ\u0003J\t\u0010E\u001a\u00020\u0004HÆ\u0003J\t\u0010F\u001a\u00020\u0001HÆ\u0003J\t\u0010G\u001a\u00020\u0001HÆ\u0003JÑ\u0001\u0010H\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u0004HÆ\u0001J\u0013\u0010I\u001a\u00020\u00122\b\u0010J\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010K\u001a\u00020\tHÖ\u0001J\t\u0010L\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\n\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001eR\u0011\u0010\f\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0011\u0010\r\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001eR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0013\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001cR\u0011\u0010\u0014\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b.\u0010#R\u0011\u0010\u0015\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b/\u0010#R\u0011\u0010\u0016\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001eR\u0011\u0010\u0017\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001eR\u0011\u0010\u0018\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001eR\u0011\u0010\u0019\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001e¨\u0006M"}, d2 = {"Lcom/nic/mparivahan/fetchSarathiLog/FetchSarthiPojo/SarathiLog;", "", "sarlogAadhar4", "sarlogApplCat", "", "sarlogApplDate", "sarlogApplNo", "", "sarlogCtzId", "", "sarlogDlDob", "sarlogDlNumber", "sarlogDocUplDate", "sarlogFeeAmt", "sarlogFeeDate", "sarlogGender", "sarlogMobileNo", "sarlogOrgDonor", "", "sarlogPhotoUplDate", "sarlogPurCd", "sarlogRecordId", "sarlogRtoCd", "sarlogStateCd", "sarlog_eKYC", "sarlog_eSign", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Object;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSarlogAadhar4", "()Ljava/lang/Object;", "getSarlogApplCat", "()Ljava/lang/String;", "getSarlogApplDate", "getSarlogApplNo", "()J", "getSarlogCtzId", "()I", "getSarlogDlDob", "getSarlogDlNumber", "getSarlogDocUplDate", "getSarlogFeeAmt", "getSarlogFeeDate", "getSarlogGender", "getSarlogMobileNo", "getSarlogOrgDonor", "()Z", "getSarlogPhotoUplDate", "getSarlogPurCd", "getSarlogRecordId", "getSarlogRtoCd", "getSarlogStateCd", "getSarlog_eKYC", "getSarlog_eSign", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SarathiLog {
    private final Object sarlogAadhar4;
    private final String sarlogApplCat;
    private final String sarlogApplDate;
    private final long sarlogApplNo;
    private final int sarlogCtzId;
    private final String sarlogDlDob;
    private final String sarlogDlNumber;
    private final Object sarlogDocUplDate;
    private final Object sarlogFeeAmt;
    private final String sarlogFeeDate;
    private final String sarlogGender;
    private final String sarlogMobileNo;
    private final boolean sarlogOrgDonor;
    private final Object sarlogPhotoUplDate;
    private final int sarlogPurCd;
    private final int sarlogRecordId;
    private final String sarlogRtoCd;
    private final String sarlogStateCd;
    private final String sarlog_eKYC;
    private final String sarlog_eSign;

    public SarathiLog(Object sarlogAadhar4, String sarlogApplCat, String sarlogApplDate, long j, int i, String sarlogDlDob, String sarlogDlNumber, Object sarlogDocUplDate, Object sarlogFeeAmt, String sarlogFeeDate, String sarlogGender, String sarlogMobileNo, boolean z, Object sarlogPhotoUplDate, int i2, int i3, String sarlogRtoCd, String sarlogStateCd, String sarlog_eKYC, String sarlog_eSign) {
        Intrinsics.checkNotNullParameter(sarlogAadhar4, "sarlogAadhar4");
        Intrinsics.checkNotNullParameter(sarlogApplCat, "sarlogApplCat");
        Intrinsics.checkNotNullParameter(sarlogApplDate, "sarlogApplDate");
        Intrinsics.checkNotNullParameter(sarlogDlDob, "sarlogDlDob");
        Intrinsics.checkNotNullParameter(sarlogDlNumber, "sarlogDlNumber");
        Intrinsics.checkNotNullParameter(sarlogDocUplDate, "sarlogDocUplDate");
        Intrinsics.checkNotNullParameter(sarlogFeeAmt, "sarlogFeeAmt");
        Intrinsics.checkNotNullParameter(sarlogFeeDate, "sarlogFeeDate");
        Intrinsics.checkNotNullParameter(sarlogGender, "sarlogGender");
        Intrinsics.checkNotNullParameter(sarlogMobileNo, "sarlogMobileNo");
        Intrinsics.checkNotNullParameter(sarlogPhotoUplDate, "sarlogPhotoUplDate");
        Intrinsics.checkNotNullParameter(sarlogRtoCd, "sarlogRtoCd");
        Intrinsics.checkNotNullParameter(sarlogStateCd, "sarlogStateCd");
        Intrinsics.checkNotNullParameter(sarlog_eKYC, "sarlog_eKYC");
        Intrinsics.checkNotNullParameter(sarlog_eSign, "sarlog_eSign");
        this.sarlogAadhar4 = sarlogAadhar4;
        this.sarlogApplCat = sarlogApplCat;
        this.sarlogApplDate = sarlogApplDate;
        this.sarlogApplNo = j;
        this.sarlogCtzId = i;
        this.sarlogDlDob = sarlogDlDob;
        this.sarlogDlNumber = sarlogDlNumber;
        this.sarlogDocUplDate = sarlogDocUplDate;
        this.sarlogFeeAmt = sarlogFeeAmt;
        this.sarlogFeeDate = sarlogFeeDate;
        this.sarlogGender = sarlogGender;
        this.sarlogMobileNo = sarlogMobileNo;
        this.sarlogOrgDonor = z;
        this.sarlogPhotoUplDate = sarlogPhotoUplDate;
        this.sarlogPurCd = i2;
        this.sarlogRecordId = i3;
        this.sarlogRtoCd = sarlogRtoCd;
        this.sarlogStateCd = sarlogStateCd;
        this.sarlog_eKYC = sarlog_eKYC;
        this.sarlog_eSign = sarlog_eSign;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Object getSarlogAadhar4() {
        return this.sarlogAadhar4;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSarlogFeeDate() {
        return this.sarlogFeeDate;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getSarlogGender() {
        return this.sarlogGender;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getSarlogMobileNo() {
        return this.sarlogMobileNo;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getSarlogOrgDonor() {
        return this.sarlogOrgDonor;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Object getSarlogPhotoUplDate() {
        return this.sarlogPhotoUplDate;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getSarlogPurCd() {
        return this.sarlogPurCd;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getSarlogRecordId() {
        return this.sarlogRecordId;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getSarlogRtoCd() {
        return this.sarlogRtoCd;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getSarlogStateCd() {
        return this.sarlogStateCd;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getSarlog_eKYC() {
        return this.sarlog_eKYC;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSarlogApplCat() {
        return this.sarlogApplCat;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getSarlog_eSign() {
        return this.sarlog_eSign;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSarlogApplDate() {
        return this.sarlogApplDate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getSarlogApplNo() {
        return this.sarlogApplNo;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getSarlogCtzId() {
        return this.sarlogCtzId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSarlogDlDob() {
        return this.sarlogDlDob;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSarlogDlNumber() {
        return this.sarlogDlNumber;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Object getSarlogDocUplDate() {
        return this.sarlogDocUplDate;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Object getSarlogFeeAmt() {
        return this.sarlogFeeAmt;
    }

    public final SarathiLog copy(Object sarlogAadhar4, String sarlogApplCat, String sarlogApplDate, long sarlogApplNo, int sarlogCtzId, String sarlogDlDob, String sarlogDlNumber, Object sarlogDocUplDate, Object sarlogFeeAmt, String sarlogFeeDate, String sarlogGender, String sarlogMobileNo, boolean sarlogOrgDonor, Object sarlogPhotoUplDate, int sarlogPurCd, int sarlogRecordId, String sarlogRtoCd, String sarlogStateCd, String sarlog_eKYC, String sarlog_eSign) {
        Intrinsics.checkNotNullParameter(sarlogAadhar4, "sarlogAadhar4");
        Intrinsics.checkNotNullParameter(sarlogApplCat, "sarlogApplCat");
        Intrinsics.checkNotNullParameter(sarlogApplDate, "sarlogApplDate");
        Intrinsics.checkNotNullParameter(sarlogDlDob, "sarlogDlDob");
        Intrinsics.checkNotNullParameter(sarlogDlNumber, "sarlogDlNumber");
        Intrinsics.checkNotNullParameter(sarlogDocUplDate, "sarlogDocUplDate");
        Intrinsics.checkNotNullParameter(sarlogFeeAmt, "sarlogFeeAmt");
        Intrinsics.checkNotNullParameter(sarlogFeeDate, "sarlogFeeDate");
        Intrinsics.checkNotNullParameter(sarlogGender, "sarlogGender");
        Intrinsics.checkNotNullParameter(sarlogMobileNo, "sarlogMobileNo");
        Intrinsics.checkNotNullParameter(sarlogPhotoUplDate, "sarlogPhotoUplDate");
        Intrinsics.checkNotNullParameter(sarlogRtoCd, "sarlogRtoCd");
        Intrinsics.checkNotNullParameter(sarlogStateCd, "sarlogStateCd");
        Intrinsics.checkNotNullParameter(sarlog_eKYC, "sarlog_eKYC");
        Intrinsics.checkNotNullParameter(sarlog_eSign, "sarlog_eSign");
        return new SarathiLog(sarlogAadhar4, sarlogApplCat, sarlogApplDate, sarlogApplNo, sarlogCtzId, sarlogDlDob, sarlogDlNumber, sarlogDocUplDate, sarlogFeeAmt, sarlogFeeDate, sarlogGender, sarlogMobileNo, sarlogOrgDonor, sarlogPhotoUplDate, sarlogPurCd, sarlogRecordId, sarlogRtoCd, sarlogStateCd, sarlog_eKYC, sarlog_eSign);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SarathiLog)) {
            return false;
        }
        SarathiLog sarathiLog = (SarathiLog) other;
        return Intrinsics.areEqual(this.sarlogAadhar4, sarathiLog.sarlogAadhar4) && Intrinsics.areEqual(this.sarlogApplCat, sarathiLog.sarlogApplCat) && Intrinsics.areEqual(this.sarlogApplDate, sarathiLog.sarlogApplDate) && this.sarlogApplNo == sarathiLog.sarlogApplNo && this.sarlogCtzId == sarathiLog.sarlogCtzId && Intrinsics.areEqual(this.sarlogDlDob, sarathiLog.sarlogDlDob) && Intrinsics.areEqual(this.sarlogDlNumber, sarathiLog.sarlogDlNumber) && Intrinsics.areEqual(this.sarlogDocUplDate, sarathiLog.sarlogDocUplDate) && Intrinsics.areEqual(this.sarlogFeeAmt, sarathiLog.sarlogFeeAmt) && Intrinsics.areEqual(this.sarlogFeeDate, sarathiLog.sarlogFeeDate) && Intrinsics.areEqual(this.sarlogGender, sarathiLog.sarlogGender) && Intrinsics.areEqual(this.sarlogMobileNo, sarathiLog.sarlogMobileNo) && this.sarlogOrgDonor == sarathiLog.sarlogOrgDonor && Intrinsics.areEqual(this.sarlogPhotoUplDate, sarathiLog.sarlogPhotoUplDate) && this.sarlogPurCd == sarathiLog.sarlogPurCd && this.sarlogRecordId == sarathiLog.sarlogRecordId && Intrinsics.areEqual(this.sarlogRtoCd, sarathiLog.sarlogRtoCd) && Intrinsics.areEqual(this.sarlogStateCd, sarathiLog.sarlogStateCd) && Intrinsics.areEqual(this.sarlog_eKYC, sarathiLog.sarlog_eKYC) && Intrinsics.areEqual(this.sarlog_eSign, sarathiLog.sarlog_eSign);
    }

    public final Object getSarlogAadhar4() {
        return this.sarlogAadhar4;
    }

    public final String getSarlogApplCat() {
        return this.sarlogApplCat;
    }

    public final String getSarlogApplDate() {
        return this.sarlogApplDate;
    }

    public final long getSarlogApplNo() {
        return this.sarlogApplNo;
    }

    public final int getSarlogCtzId() {
        return this.sarlogCtzId;
    }

    public final String getSarlogDlDob() {
        return this.sarlogDlDob;
    }

    public final String getSarlogDlNumber() {
        return this.sarlogDlNumber;
    }

    public final Object getSarlogDocUplDate() {
        return this.sarlogDocUplDate;
    }

    public final Object getSarlogFeeAmt() {
        return this.sarlogFeeAmt;
    }

    public final String getSarlogFeeDate() {
        return this.sarlogFeeDate;
    }

    public final String getSarlogGender() {
        return this.sarlogGender;
    }

    public final String getSarlogMobileNo() {
        return this.sarlogMobileNo;
    }

    public final boolean getSarlogOrgDonor() {
        return this.sarlogOrgDonor;
    }

    public final Object getSarlogPhotoUplDate() {
        return this.sarlogPhotoUplDate;
    }

    public final int getSarlogPurCd() {
        return this.sarlogPurCd;
    }

    public final int getSarlogRecordId() {
        return this.sarlogRecordId;
    }

    public final String getSarlogRtoCd() {
        return this.sarlogRtoCd;
    }

    public final String getSarlogStateCd() {
        return this.sarlogStateCd;
    }

    public final String getSarlog_eKYC() {
        return this.sarlog_eKYC;
    }

    public final String getSarlog_eSign() {
        return this.sarlog_eSign;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v23, types: [int] */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((this.sarlogAadhar4.hashCode() * 31) + this.sarlogApplCat.hashCode()) * 31) + this.sarlogApplDate.hashCode()) * 31) + Long.hashCode(this.sarlogApplNo)) * 31) + Integer.hashCode(this.sarlogCtzId)) * 31) + this.sarlogDlDob.hashCode()) * 31) + this.sarlogDlNumber.hashCode()) * 31) + this.sarlogDocUplDate.hashCode()) * 31) + this.sarlogFeeAmt.hashCode()) * 31) + this.sarlogFeeDate.hashCode()) * 31) + this.sarlogGender.hashCode()) * 31) + this.sarlogMobileNo.hashCode()) * 31;
        boolean z = this.sarlogOrgDonor;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((((((((((((iHashCode + r1) * 31) + this.sarlogPhotoUplDate.hashCode()) * 31) + Integer.hashCode(this.sarlogPurCd)) * 31) + Integer.hashCode(this.sarlogRecordId)) * 31) + this.sarlogRtoCd.hashCode()) * 31) + this.sarlogStateCd.hashCode()) * 31) + this.sarlog_eKYC.hashCode()) * 31) + this.sarlog_eSign.hashCode();
    }

    public String toString() {
        return "SarathiLog(sarlogAadhar4=" + this.sarlogAadhar4 + ", sarlogApplCat=" + this.sarlogApplCat + ", sarlogApplDate=" + this.sarlogApplDate + ", sarlogApplNo=" + this.sarlogApplNo + ", sarlogCtzId=" + this.sarlogCtzId + ", sarlogDlDob=" + this.sarlogDlDob + ", sarlogDlNumber=" + this.sarlogDlNumber + ", sarlogDocUplDate=" + this.sarlogDocUplDate + ", sarlogFeeAmt=" + this.sarlogFeeAmt + ", sarlogFeeDate=" + this.sarlogFeeDate + ", sarlogGender=" + this.sarlogGender + ", sarlogMobileNo=" + this.sarlogMobileNo + ", sarlogOrgDonor=" + this.sarlogOrgDonor + ", sarlogPhotoUplDate=" + this.sarlogPhotoUplDate + ", sarlogPurCd=" + this.sarlogPurCd + ", sarlogRecordId=" + this.sarlogRecordId + ", sarlogRtoCd=" + this.sarlogRtoCd + ", sarlogStateCd=" + this.sarlogStateCd + ", sarlog_eKYC=" + this.sarlog_eKYC + ", sarlog_eSign=" + this.sarlog_eSign + ')';
    }
}
