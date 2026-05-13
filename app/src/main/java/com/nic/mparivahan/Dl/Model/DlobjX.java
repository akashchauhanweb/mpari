package com.nic.mparivahan.Dl.Model;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\bP\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BÛ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003¢\u0006\u0002\u0010\u001eJ\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0006HÆ\u0003J\t\u0010D\u001a\u00020\u0006HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0006HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\u0093\u0002\u0010U\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u0003HÆ\u0001J\u0013\u0010V\u001a\u00020W2\b\u0010X\u001a\u0004\u0018\u00010YHÖ\u0003J\t\u0010Z\u001a\u00020\u0006HÖ\u0001J\t\u0010[\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010 R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010 R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010 R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0011\u0010\u0014\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b.\u0010#R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010 R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010 R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010 R\u0011\u0010\u0015\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b2\u0010#R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010 R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010 R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010 R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010 R\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010 R\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010 R\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010 R\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010 ¨\u0006\\"}, d2 = {"Lcom/nic/mparivahan/Dl/Model/DlobjX;", "Ljava/io/Serializable;", "dlIssueauth", "", "dlIssuedt", "dlLatestTrcode", "", "dlLicno", "dlNtValdfrDt", "dlTrValdfrDt", "dlTrValdtoDate", "dlTrValdtoDt", "dlNtValdtoDt", "dlOldLicno", "dlPrintDate", "dlPrintStatus", "dlRecGenesis", "dlRtoCode", "dlSeqno", "dlStatus", "dlTokenId", "dlUsid", "enforceRemark", "olaName", "olacode", "omOfficeTownname", "omRtoFullname", "omRtoShortname", "stateName", "statecd", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDlIssueauth", "()Ljava/lang/String;", "getDlIssuedt", "getDlLatestTrcode", "()I", "getDlLicno", "getDlNtValdfrDt", "getDlNtValdtoDt", "getDlOldLicno", "getDlPrintDate", "getDlPrintStatus", "getDlRecGenesis", "getDlRtoCode", "getDlSeqno", "getDlStatus", "getDlTokenId", "getDlTrValdfrDt", "getDlTrValdtoDate", "getDlTrValdtoDt", "getDlUsid", "getEnforceRemark", "getOlaName", "getOlacode", "getOmOfficeTownname", "getOmRtoFullname", "getOmRtoShortname", "getStateName", "getStatecd", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DlobjX implements Serializable {
    private final String dlIssueauth;
    private final String dlIssuedt;
    private final int dlLatestTrcode;
    private final String dlLicno;
    private final String dlNtValdfrDt;
    private final String dlNtValdtoDt;
    private final String dlOldLicno;
    private final String dlPrintDate;
    private final String dlPrintStatus;
    private final String dlRecGenesis;
    private final String dlRtoCode;
    private final String dlSeqno;
    private final String dlStatus;
    private final int dlTokenId;
    private final String dlTrValdfrDt;
    private final String dlTrValdtoDate;
    private final String dlTrValdtoDt;
    private final int dlUsid;
    private final String enforceRemark;
    private final String olaName;
    private final String olacode;
    private final String omOfficeTownname;
    private final String omRtoFullname;
    private final String omRtoShortname;
    private final String stateName;
    private final String statecd;

    public DlobjX(String dlIssueauth, String dlIssuedt, int i, String dlLicno, String dlNtValdfrDt, String str, String str2, String str3, String dlNtValdtoDt, String dlOldLicno, String dlPrintDate, String dlPrintStatus, String dlRecGenesis, String dlRtoCode, String dlSeqno, String dlStatus, int i2, int i3, String enforceRemark, String olaName, String olacode, String omOfficeTownname, String omRtoFullname, String omRtoShortname, String stateName, String statecd) {
        Intrinsics.checkNotNullParameter(dlIssueauth, "dlIssueauth");
        Intrinsics.checkNotNullParameter(dlIssuedt, "dlIssuedt");
        Intrinsics.checkNotNullParameter(dlLicno, "dlLicno");
        Intrinsics.checkNotNullParameter(dlNtValdfrDt, "dlNtValdfrDt");
        Intrinsics.checkNotNullParameter(dlNtValdtoDt, "dlNtValdtoDt");
        Intrinsics.checkNotNullParameter(dlOldLicno, "dlOldLicno");
        Intrinsics.checkNotNullParameter(dlPrintDate, "dlPrintDate");
        Intrinsics.checkNotNullParameter(dlPrintStatus, "dlPrintStatus");
        Intrinsics.checkNotNullParameter(dlRecGenesis, "dlRecGenesis");
        Intrinsics.checkNotNullParameter(dlRtoCode, "dlRtoCode");
        Intrinsics.checkNotNullParameter(dlSeqno, "dlSeqno");
        Intrinsics.checkNotNullParameter(dlStatus, "dlStatus");
        Intrinsics.checkNotNullParameter(enforceRemark, "enforceRemark");
        Intrinsics.checkNotNullParameter(olaName, "olaName");
        Intrinsics.checkNotNullParameter(olacode, "olacode");
        Intrinsics.checkNotNullParameter(omOfficeTownname, "omOfficeTownname");
        Intrinsics.checkNotNullParameter(omRtoFullname, "omRtoFullname");
        Intrinsics.checkNotNullParameter(omRtoShortname, "omRtoShortname");
        Intrinsics.checkNotNullParameter(stateName, "stateName");
        Intrinsics.checkNotNullParameter(statecd, "statecd");
        this.dlIssueauth = dlIssueauth;
        this.dlIssuedt = dlIssuedt;
        this.dlLatestTrcode = i;
        this.dlLicno = dlLicno;
        this.dlNtValdfrDt = dlNtValdfrDt;
        this.dlTrValdfrDt = str;
        this.dlTrValdtoDate = str2;
        this.dlTrValdtoDt = str3;
        this.dlNtValdtoDt = dlNtValdtoDt;
        this.dlOldLicno = dlOldLicno;
        this.dlPrintDate = dlPrintDate;
        this.dlPrintStatus = dlPrintStatus;
        this.dlRecGenesis = dlRecGenesis;
        this.dlRtoCode = dlRtoCode;
        this.dlSeqno = dlSeqno;
        this.dlStatus = dlStatus;
        this.dlTokenId = i2;
        this.dlUsid = i3;
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
    public final String getDlIssueauth() {
        return this.dlIssueauth;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getDlOldLicno() {
        return this.dlOldLicno;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getDlPrintDate() {
        return this.dlPrintDate;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getDlPrintStatus() {
        return this.dlPrintStatus;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getDlRecGenesis() {
        return this.dlRecGenesis;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getDlRtoCode() {
        return this.dlRtoCode;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getDlSeqno() {
        return this.dlSeqno;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getDlStatus() {
        return this.dlStatus;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getDlTokenId() {
        return this.dlTokenId;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getDlUsid() {
        return this.dlUsid;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getEnforceRemark() {
        return this.enforceRemark;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDlIssuedt() {
        return this.dlIssuedt;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getOlaName() {
        return this.olaName;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getOlacode() {
        return this.olacode;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getOmOfficeTownname() {
        return this.omOfficeTownname;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getOmRtoFullname() {
        return this.omRtoFullname;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getOmRtoShortname() {
        return this.omRtoShortname;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getStateName() {
        return this.stateName;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getStatecd() {
        return this.statecd;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDlLatestTrcode() {
        return this.dlLatestTrcode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDlLicno() {
        return this.dlLicno;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDlNtValdfrDt() {
        return this.dlNtValdfrDt;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDlTrValdfrDt() {
        return this.dlTrValdfrDt;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDlTrValdtoDate() {
        return this.dlTrValdtoDate;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDlTrValdtoDt() {
        return this.dlTrValdtoDt;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDlNtValdtoDt() {
        return this.dlNtValdtoDt;
    }

    public final DlobjX copy(String dlIssueauth, String dlIssuedt, int dlLatestTrcode, String dlLicno, String dlNtValdfrDt, String dlTrValdfrDt, String dlTrValdtoDate, String dlTrValdtoDt, String dlNtValdtoDt, String dlOldLicno, String dlPrintDate, String dlPrintStatus, String dlRecGenesis, String dlRtoCode, String dlSeqno, String dlStatus, int dlTokenId, int dlUsid, String enforceRemark, String olaName, String olacode, String omOfficeTownname, String omRtoFullname, String omRtoShortname, String stateName, String statecd) {
        Intrinsics.checkNotNullParameter(dlIssueauth, "dlIssueauth");
        Intrinsics.checkNotNullParameter(dlIssuedt, "dlIssuedt");
        Intrinsics.checkNotNullParameter(dlLicno, "dlLicno");
        Intrinsics.checkNotNullParameter(dlNtValdfrDt, "dlNtValdfrDt");
        Intrinsics.checkNotNullParameter(dlNtValdtoDt, "dlNtValdtoDt");
        Intrinsics.checkNotNullParameter(dlOldLicno, "dlOldLicno");
        Intrinsics.checkNotNullParameter(dlPrintDate, "dlPrintDate");
        Intrinsics.checkNotNullParameter(dlPrintStatus, "dlPrintStatus");
        Intrinsics.checkNotNullParameter(dlRecGenesis, "dlRecGenesis");
        Intrinsics.checkNotNullParameter(dlRtoCode, "dlRtoCode");
        Intrinsics.checkNotNullParameter(dlSeqno, "dlSeqno");
        Intrinsics.checkNotNullParameter(dlStatus, "dlStatus");
        Intrinsics.checkNotNullParameter(enforceRemark, "enforceRemark");
        Intrinsics.checkNotNullParameter(olaName, "olaName");
        Intrinsics.checkNotNullParameter(olacode, "olacode");
        Intrinsics.checkNotNullParameter(omOfficeTownname, "omOfficeTownname");
        Intrinsics.checkNotNullParameter(omRtoFullname, "omRtoFullname");
        Intrinsics.checkNotNullParameter(omRtoShortname, "omRtoShortname");
        Intrinsics.checkNotNullParameter(stateName, "stateName");
        Intrinsics.checkNotNullParameter(statecd, "statecd");
        return new DlobjX(dlIssueauth, dlIssuedt, dlLatestTrcode, dlLicno, dlNtValdfrDt, dlTrValdfrDt, dlTrValdtoDate, dlTrValdtoDt, dlNtValdtoDt, dlOldLicno, dlPrintDate, dlPrintStatus, dlRecGenesis, dlRtoCode, dlSeqno, dlStatus, dlTokenId, dlUsid, enforceRemark, olaName, olacode, omOfficeTownname, omRtoFullname, omRtoShortname, stateName, statecd);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DlobjX)) {
            return false;
        }
        DlobjX dlobjX = (DlobjX) other;
        return Intrinsics.areEqual(this.dlIssueauth, dlobjX.dlIssueauth) && Intrinsics.areEqual(this.dlIssuedt, dlobjX.dlIssuedt) && this.dlLatestTrcode == dlobjX.dlLatestTrcode && Intrinsics.areEqual(this.dlLicno, dlobjX.dlLicno) && Intrinsics.areEqual(this.dlNtValdfrDt, dlobjX.dlNtValdfrDt) && Intrinsics.areEqual(this.dlTrValdfrDt, dlobjX.dlTrValdfrDt) && Intrinsics.areEqual(this.dlTrValdtoDate, dlobjX.dlTrValdtoDate) && Intrinsics.areEqual(this.dlTrValdtoDt, dlobjX.dlTrValdtoDt) && Intrinsics.areEqual(this.dlNtValdtoDt, dlobjX.dlNtValdtoDt) && Intrinsics.areEqual(this.dlOldLicno, dlobjX.dlOldLicno) && Intrinsics.areEqual(this.dlPrintDate, dlobjX.dlPrintDate) && Intrinsics.areEqual(this.dlPrintStatus, dlobjX.dlPrintStatus) && Intrinsics.areEqual(this.dlRecGenesis, dlobjX.dlRecGenesis) && Intrinsics.areEqual(this.dlRtoCode, dlobjX.dlRtoCode) && Intrinsics.areEqual(this.dlSeqno, dlobjX.dlSeqno) && Intrinsics.areEqual(this.dlStatus, dlobjX.dlStatus) && this.dlTokenId == dlobjX.dlTokenId && this.dlUsid == dlobjX.dlUsid && Intrinsics.areEqual(this.enforceRemark, dlobjX.enforceRemark) && Intrinsics.areEqual(this.olaName, dlobjX.olaName) && Intrinsics.areEqual(this.olacode, dlobjX.olacode) && Intrinsics.areEqual(this.omOfficeTownname, dlobjX.omOfficeTownname) && Intrinsics.areEqual(this.omRtoFullname, dlobjX.omRtoFullname) && Intrinsics.areEqual(this.omRtoShortname, dlobjX.omRtoShortname) && Intrinsics.areEqual(this.stateName, dlobjX.stateName) && Intrinsics.areEqual(this.statecd, dlobjX.statecd);
    }

    public final String getDlIssueauth() {
        return this.dlIssueauth;
    }

    public final String getDlIssuedt() {
        return this.dlIssuedt;
    }

    public final int getDlLatestTrcode() {
        return this.dlLatestTrcode;
    }

    public final String getDlLicno() {
        return this.dlLicno;
    }

    public final String getDlNtValdfrDt() {
        return this.dlNtValdfrDt;
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

    public final String getDlRtoCode() {
        return this.dlRtoCode;
    }

    public final String getDlSeqno() {
        return this.dlSeqno;
    }

    public final String getDlStatus() {
        return this.dlStatus;
    }

    public final int getDlTokenId() {
        return this.dlTokenId;
    }

    public final String getDlTrValdfrDt() {
        return this.dlTrValdfrDt;
    }

    public final String getDlTrValdtoDate() {
        return this.dlTrValdtoDate;
    }

    public final String getDlTrValdtoDt() {
        return this.dlTrValdtoDt;
    }

    public final int getDlUsid() {
        return this.dlUsid;
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
        int iHashCode = ((((((((this.dlIssueauth.hashCode() * 31) + this.dlIssuedt.hashCode()) * 31) + Integer.hashCode(this.dlLatestTrcode)) * 31) + this.dlLicno.hashCode()) * 31) + this.dlNtValdfrDt.hashCode()) * 31;
        String str = this.dlTrValdfrDt;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.dlTrValdtoDate;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dlTrValdtoDt;
        return ((((((((((((((((((((((((((((((((((((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.dlNtValdtoDt.hashCode()) * 31) + this.dlOldLicno.hashCode()) * 31) + this.dlPrintDate.hashCode()) * 31) + this.dlPrintStatus.hashCode()) * 31) + this.dlRecGenesis.hashCode()) * 31) + this.dlRtoCode.hashCode()) * 31) + this.dlSeqno.hashCode()) * 31) + this.dlStatus.hashCode()) * 31) + Integer.hashCode(this.dlTokenId)) * 31) + Integer.hashCode(this.dlUsid)) * 31) + this.enforceRemark.hashCode()) * 31) + this.olaName.hashCode()) * 31) + this.olacode.hashCode()) * 31) + this.omOfficeTownname.hashCode()) * 31) + this.omRtoFullname.hashCode()) * 31) + this.omRtoShortname.hashCode()) * 31) + this.stateName.hashCode()) * 31) + this.statecd.hashCode();
    }

    public String toString() {
        return "DlobjX(dlIssueauth=" + this.dlIssueauth + ", dlIssuedt=" + this.dlIssuedt + ", dlLatestTrcode=" + this.dlLatestTrcode + ", dlLicno=" + this.dlLicno + ", dlNtValdfrDt=" + this.dlNtValdfrDt + ", dlTrValdfrDt=" + this.dlTrValdfrDt + ", dlTrValdtoDate=" + this.dlTrValdtoDate + ", dlTrValdtoDt=" + this.dlTrValdtoDt + ", dlNtValdtoDt=" + this.dlNtValdtoDt + ", dlOldLicno=" + this.dlOldLicno + ", dlPrintDate=" + this.dlPrintDate + ", dlPrintStatus=" + this.dlPrintStatus + ", dlRecGenesis=" + this.dlRecGenesis + ", dlRtoCode=" + this.dlRtoCode + ", dlSeqno=" + this.dlSeqno + ", dlStatus=" + this.dlStatus + ", dlTokenId=" + this.dlTokenId + ", dlUsid=" + this.dlUsid + ", enforceRemark=" + this.enforceRemark + ", olaName=" + this.olaName + ", olacode=" + this.olacode + ", omOfficeTownname=" + this.omOfficeTownname + ", omRtoFullname=" + this.omRtoFullname + ", omRtoShortname=" + this.omRtoShortname + ", stateName=" + this.stateName + ", statecd=" + this.statecd + ')';
    }
}
