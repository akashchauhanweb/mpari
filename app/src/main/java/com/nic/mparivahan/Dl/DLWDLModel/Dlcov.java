package com.nic.mparivahan.Dl.DLWDLModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b_\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0001\u0012\u0006\u0010\u000b\u001a\u00020\u0001\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u0001\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u0006\u0010\u0015\u001a\u00020\u0001\u0012\u0006\u0010\u0016\u001a\u00020\u0001\u0012\u0006\u0010\u0017\u001a\u00020\u0001\u0012\u0006\u0010\u0018\u001a\u00020\b\u0012\u0006\u0010\u0019\u001a\u00020\b\u0012\u0006\u0010\u001a\u001a\u00020\u0001\u0012\u0006\u0010\u001b\u001a\u00020\u0001\u0012\u0006\u0010\u001c\u001a\u00020\u0001\u0012\u0006\u0010\u001d\u001a\u00020\u0001\u0012\u0006\u0010\u001e\u001a\u00020\u0001\u0012\u0006\u0010\u001f\u001a\u00020\r\u0012\u0006\u0010 \u001a\u00020\b\u0012\u0006\u0010!\u001a\u00020\b\u0012\u0006\u0010\"\u001a\u00020\u0001\u0012\u0006\u0010#\u001a\u00020\b\u0012\u0006\u0010$\u001a\u00020\b¢\u0006\u0002\u0010%J\t\u0010J\u001a\u00020\u0001HÆ\u0003J\t\u0010K\u001a\u00020\rHÆ\u0003J\t\u0010L\u001a\u00020\u0001HÆ\u0003J\t\u0010M\u001a\u00020\u0001HÆ\u0003J\t\u0010N\u001a\u00020\bHÆ\u0003J\t\u0010O\u001a\u00020\rHÆ\u0003J\t\u0010P\u001a\u00020\bHÆ\u0003J\t\u0010Q\u001a\u00020\bHÆ\u0003J\t\u0010R\u001a\u00020\bHÆ\u0003J\t\u0010S\u001a\u00020\u0001HÆ\u0003J\t\u0010T\u001a\u00020\u0001HÆ\u0003J\t\u0010U\u001a\u00020\u0001HÆ\u0003J\t\u0010V\u001a\u00020\u0001HÆ\u0003J\t\u0010W\u001a\u00020\bHÆ\u0003J\t\u0010X\u001a\u00020\bHÆ\u0003J\t\u0010Y\u001a\u00020\u0001HÆ\u0003J\t\u0010Z\u001a\u00020\u0001HÆ\u0003J\t\u0010[\u001a\u00020\u0001HÆ\u0003J\t\u0010\\\u001a\u00020\u0001HÆ\u0003J\t\u0010]\u001a\u00020\u0001HÆ\u0003J\t\u0010^\u001a\u00020\rHÆ\u0003J\t\u0010_\u001a\u00020\bHÆ\u0003J\t\u0010`\u001a\u00020\u0001HÆ\u0003J\t\u0010a\u001a\u00020\bHÆ\u0003J\t\u0010b\u001a\u00020\u0001HÆ\u0003J\t\u0010c\u001a\u00020\bHÆ\u0003J\t\u0010d\u001a\u00020\bHÆ\u0003J\t\u0010e\u001a\u00020\u0001HÆ\u0003J\t\u0010f\u001a\u00020\u0001HÆ\u0003J\t\u0010g\u001a\u00020\bHÆ\u0003J\t\u0010h\u001a\u00020\bHÆ\u0003J\t\u0010i\u001a\u00020\u0001HÆ\u0003J\t\u0010j\u001a\u00020\u0001HÆ\u0003JÓ\u0002\u0010k\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\u001d\u001a\u00020\u00012\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020\r2\b\b\u0002\u0010 \u001a\u00020\b2\b\b\u0002\u0010!\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020\u00012\b\b\u0002\u0010#\u001a\u00020\b2\b\b\u0002\u0010$\u001a\u00020\bHÆ\u0001J\u0013\u0010l\u001a\u00020m2\b\u0010n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010o\u001a\u00020\rHÖ\u0001J\t\u0010p\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0003\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b)\u0010'R\u0011\u0010\u0005\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b*\u0010'R\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b+\u0010'R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010-R\u0011\u0010\n\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b/\u0010'R\u0011\u0010\u000b\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b0\u0010'R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u000e\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b3\u0010'R\u0011\u0010\u000f\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b4\u0010'R\u0011\u0010\u0010\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b5\u0010-R\u0011\u0010\u0011\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b6\u00102R\u0011\u0010\u0012\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b7\u0010-R\u0011\u0010\u0013\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b8\u0010-R\u0011\u0010\u0014\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b9\u0010-R\u0011\u0010\u0015\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b:\u0010'R\u0011\u0010\u0016\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b;\u0010'R\u0011\u0010\u0017\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b<\u0010'R\u0011\u0010\u0018\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b=\u0010-R\u0011\u0010\u0019\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b>\u0010-R\u0011\u0010\u001a\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b?\u0010'R\u0011\u0010\u001b\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b@\u0010'R\u0011\u0010\u001c\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bA\u0010'R\u0011\u0010\u001d\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bB\u0010'R\u0011\u0010\u001e\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bC\u0010'R\u0011\u0010\u001f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\bD\u00102R\u0011\u0010 \u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bE\u0010-R\u0011\u0010!\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bF\u0010-R\u0011\u0010\"\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bG\u0010'R\u0011\u0010#\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bH\u0010-R\u0011\u0010$\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bI\u0010-¨\u0006q"}, d2 = {"Lcom/nic/mparivahan/Dl/DLWDLModel/Dlcov;", "", "badgeIssuedAuth", "badgeIssuedt", "badgeNo", "covIssueAuthCode", "covIssuedt", "covabbrv", "", "covdesc", "dbcImvDesig", "dbcImvName", "dcApplno", "", "dcAuthDt", "dcAuthNo", "dcCovStatus", "dcCovcd", "dcEndorseNo", "dcEndorsedt", "dcEndorsetime", "dcInvcrgNo", "dcInvrgdesc", "dcIssRtocode", "dcIssuedt", "dcLicno", "dcReflicNo", "dcReflicType", "dcTokenId", "dlBacklogCovEndtime", "dlTestdate", "endouserid", "olaName", "olacd", "veBadgeIssue", "veShortdesc", "vecatg", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V", "getBadgeIssuedAuth", "()Ljava/lang/Object;", "getBadgeIssuedt", "getBadgeNo", "getCovIssueAuthCode", "getCovIssuedt", "getCovabbrv", "()Ljava/lang/String;", "getCovdesc", "getDbcImvDesig", "getDbcImvName", "getDcApplno", "()I", "getDcAuthDt", "getDcAuthNo", "getDcCovStatus", "getDcCovcd", "getDcEndorseNo", "getDcEndorsedt", "getDcEndorsetime", "getDcInvcrgNo", "getDcInvrgdesc", "getDcIssRtocode", "getDcIssuedt", "getDcLicno", "getDcReflicNo", "getDcReflicType", "getDcTokenId", "getDlBacklogCovEndtime", "getDlTestdate", "getEndouserid", "getOlaName", "getOlacd", "getVeBadgeIssue", "getVeShortdesc", "getVecatg", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Dlcov {
    private final Object badgeIssuedAuth;
    private final Object badgeIssuedt;
    private final Object badgeNo;
    private final Object covIssueAuthCode;
    private final Object covIssuedt;
    private final String covabbrv;
    private final String covdesc;
    private final Object dbcImvDesig;
    private final Object dbcImvName;
    private final int dcApplno;
    private final Object dcAuthDt;
    private final Object dcAuthNo;
    private final String dcCovStatus;
    private final int dcCovcd;
    private final String dcEndorseNo;
    private final String dcEndorsedt;
    private final String dcEndorsetime;
    private final Object dcInvcrgNo;
    private final Object dcInvrgdesc;
    private final Object dcIssRtocode;
    private final String dcIssuedt;
    private final String dcLicno;
    private final Object dcReflicNo;
    private final Object dcReflicType;
    private final Object dcTokenId;
    private final Object dlBacklogCovEndtime;
    private final Object dlTestdate;
    private final int endouserid;
    private final String olaName;
    private final String olacd;
    private final Object veBadgeIssue;
    private final String veShortdesc;
    private final String vecatg;

    public Dlcov(Object badgeIssuedAuth, Object badgeIssuedt, Object badgeNo, Object covIssueAuthCode, Object covIssuedt, String covabbrv, String covdesc, Object dbcImvDesig, Object dbcImvName, int i, Object dcAuthDt, Object dcAuthNo, String dcCovStatus, int i2, String dcEndorseNo, String dcEndorsedt, String dcEndorsetime, Object dcInvcrgNo, Object dcInvrgdesc, Object dcIssRtocode, String dcIssuedt, String dcLicno, Object dcReflicNo, Object dcReflicType, Object dcTokenId, Object dlBacklogCovEndtime, Object dlTestdate, int i3, String olaName, String olacd, Object veBadgeIssue, String veShortdesc, String vecatg) {
        Intrinsics.checkNotNullParameter(badgeIssuedAuth, "badgeIssuedAuth");
        Intrinsics.checkNotNullParameter(badgeIssuedt, "badgeIssuedt");
        Intrinsics.checkNotNullParameter(badgeNo, "badgeNo");
        Intrinsics.checkNotNullParameter(covIssueAuthCode, "covIssueAuthCode");
        Intrinsics.checkNotNullParameter(covIssuedt, "covIssuedt");
        Intrinsics.checkNotNullParameter(covabbrv, "covabbrv");
        Intrinsics.checkNotNullParameter(covdesc, "covdesc");
        Intrinsics.checkNotNullParameter(dbcImvDesig, "dbcImvDesig");
        Intrinsics.checkNotNullParameter(dbcImvName, "dbcImvName");
        Intrinsics.checkNotNullParameter(dcAuthDt, "dcAuthDt");
        Intrinsics.checkNotNullParameter(dcAuthNo, "dcAuthNo");
        Intrinsics.checkNotNullParameter(dcCovStatus, "dcCovStatus");
        Intrinsics.checkNotNullParameter(dcEndorseNo, "dcEndorseNo");
        Intrinsics.checkNotNullParameter(dcEndorsedt, "dcEndorsedt");
        Intrinsics.checkNotNullParameter(dcEndorsetime, "dcEndorsetime");
        Intrinsics.checkNotNullParameter(dcInvcrgNo, "dcInvcrgNo");
        Intrinsics.checkNotNullParameter(dcInvrgdesc, "dcInvrgdesc");
        Intrinsics.checkNotNullParameter(dcIssRtocode, "dcIssRtocode");
        Intrinsics.checkNotNullParameter(dcIssuedt, "dcIssuedt");
        Intrinsics.checkNotNullParameter(dcLicno, "dcLicno");
        Intrinsics.checkNotNullParameter(dcReflicNo, "dcReflicNo");
        Intrinsics.checkNotNullParameter(dcReflicType, "dcReflicType");
        Intrinsics.checkNotNullParameter(dcTokenId, "dcTokenId");
        Intrinsics.checkNotNullParameter(dlBacklogCovEndtime, "dlBacklogCovEndtime");
        Intrinsics.checkNotNullParameter(dlTestdate, "dlTestdate");
        Intrinsics.checkNotNullParameter(olaName, "olaName");
        Intrinsics.checkNotNullParameter(olacd, "olacd");
        Intrinsics.checkNotNullParameter(veBadgeIssue, "veBadgeIssue");
        Intrinsics.checkNotNullParameter(veShortdesc, "veShortdesc");
        Intrinsics.checkNotNullParameter(vecatg, "vecatg");
        this.badgeIssuedAuth = badgeIssuedAuth;
        this.badgeIssuedt = badgeIssuedt;
        this.badgeNo = badgeNo;
        this.covIssueAuthCode = covIssueAuthCode;
        this.covIssuedt = covIssuedt;
        this.covabbrv = covabbrv;
        this.covdesc = covdesc;
        this.dbcImvDesig = dbcImvDesig;
        this.dbcImvName = dbcImvName;
        this.dcApplno = i;
        this.dcAuthDt = dcAuthDt;
        this.dcAuthNo = dcAuthNo;
        this.dcCovStatus = dcCovStatus;
        this.dcCovcd = i2;
        this.dcEndorseNo = dcEndorseNo;
        this.dcEndorsedt = dcEndorsedt;
        this.dcEndorsetime = dcEndorsetime;
        this.dcInvcrgNo = dcInvcrgNo;
        this.dcInvrgdesc = dcInvrgdesc;
        this.dcIssRtocode = dcIssRtocode;
        this.dcIssuedt = dcIssuedt;
        this.dcLicno = dcLicno;
        this.dcReflicNo = dcReflicNo;
        this.dcReflicType = dcReflicType;
        this.dcTokenId = dcTokenId;
        this.dlBacklogCovEndtime = dlBacklogCovEndtime;
        this.dlTestdate = dlTestdate;
        this.endouserid = i3;
        this.olaName = olaName;
        this.olacd = olacd;
        this.veBadgeIssue = veBadgeIssue;
        this.veShortdesc = veShortdesc;
        this.vecatg = vecatg;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Object getBadgeIssuedAuth() {
        return this.badgeIssuedAuth;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getDcApplno() {
        return this.dcApplno;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Object getDcAuthDt() {
        return this.dcAuthDt;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Object getDcAuthNo() {
        return this.dcAuthNo;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getDcCovStatus() {
        return this.dcCovStatus;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getDcCovcd() {
        return this.dcCovcd;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getDcEndorseNo() {
        return this.dcEndorseNo;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getDcEndorsedt() {
        return this.dcEndorsedt;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getDcEndorsetime() {
        return this.dcEndorsetime;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Object getDcInvcrgNo() {
        return this.dcInvcrgNo;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Object getDcInvrgdesc() {
        return this.dcInvrgdesc;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getBadgeIssuedt() {
        return this.badgeIssuedt;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Object getDcIssRtocode() {
        return this.dcIssRtocode;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getDcIssuedt() {
        return this.dcIssuedt;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getDcLicno() {
        return this.dcLicno;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Object getDcReflicNo() {
        return this.dcReflicNo;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Object getDcReflicType() {
        return this.dcReflicType;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Object getDcTokenId() {
        return this.dcTokenId;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final Object getDlBacklogCovEndtime() {
        return this.dlBacklogCovEndtime;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final Object getDlTestdate() {
        return this.dlTestdate;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final int getEndouserid() {
        return this.endouserid;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getOlaName() {
        return this.olaName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Object getBadgeNo() {
        return this.badgeNo;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getOlacd() {
        return this.olacd;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final Object getVeBadgeIssue() {
        return this.veBadgeIssue;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getVeShortdesc() {
        return this.veShortdesc;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getVecatg() {
        return this.vecatg;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Object getCovIssueAuthCode() {
        return this.covIssueAuthCode;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Object getCovIssuedt() {
        return this.covIssuedt;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCovabbrv() {
        return this.covabbrv;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCovdesc() {
        return this.covdesc;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Object getDbcImvDesig() {
        return this.dbcImvDesig;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Object getDbcImvName() {
        return this.dbcImvName;
    }

    public final Dlcov copy(Object badgeIssuedAuth, Object badgeIssuedt, Object badgeNo, Object covIssueAuthCode, Object covIssuedt, String covabbrv, String covdesc, Object dbcImvDesig, Object dbcImvName, int dcApplno, Object dcAuthDt, Object dcAuthNo, String dcCovStatus, int dcCovcd, String dcEndorseNo, String dcEndorsedt, String dcEndorsetime, Object dcInvcrgNo, Object dcInvrgdesc, Object dcIssRtocode, String dcIssuedt, String dcLicno, Object dcReflicNo, Object dcReflicType, Object dcTokenId, Object dlBacklogCovEndtime, Object dlTestdate, int endouserid, String olaName, String olacd, Object veBadgeIssue, String veShortdesc, String vecatg) {
        Intrinsics.checkNotNullParameter(badgeIssuedAuth, "badgeIssuedAuth");
        Intrinsics.checkNotNullParameter(badgeIssuedt, "badgeIssuedt");
        Intrinsics.checkNotNullParameter(badgeNo, "badgeNo");
        Intrinsics.checkNotNullParameter(covIssueAuthCode, "covIssueAuthCode");
        Intrinsics.checkNotNullParameter(covIssuedt, "covIssuedt");
        Intrinsics.checkNotNullParameter(covabbrv, "covabbrv");
        Intrinsics.checkNotNullParameter(covdesc, "covdesc");
        Intrinsics.checkNotNullParameter(dbcImvDesig, "dbcImvDesig");
        Intrinsics.checkNotNullParameter(dbcImvName, "dbcImvName");
        Intrinsics.checkNotNullParameter(dcAuthDt, "dcAuthDt");
        Intrinsics.checkNotNullParameter(dcAuthNo, "dcAuthNo");
        Intrinsics.checkNotNullParameter(dcCovStatus, "dcCovStatus");
        Intrinsics.checkNotNullParameter(dcEndorseNo, "dcEndorseNo");
        Intrinsics.checkNotNullParameter(dcEndorsedt, "dcEndorsedt");
        Intrinsics.checkNotNullParameter(dcEndorsetime, "dcEndorsetime");
        Intrinsics.checkNotNullParameter(dcInvcrgNo, "dcInvcrgNo");
        Intrinsics.checkNotNullParameter(dcInvrgdesc, "dcInvrgdesc");
        Intrinsics.checkNotNullParameter(dcIssRtocode, "dcIssRtocode");
        Intrinsics.checkNotNullParameter(dcIssuedt, "dcIssuedt");
        Intrinsics.checkNotNullParameter(dcLicno, "dcLicno");
        Intrinsics.checkNotNullParameter(dcReflicNo, "dcReflicNo");
        Intrinsics.checkNotNullParameter(dcReflicType, "dcReflicType");
        Intrinsics.checkNotNullParameter(dcTokenId, "dcTokenId");
        Intrinsics.checkNotNullParameter(dlBacklogCovEndtime, "dlBacklogCovEndtime");
        Intrinsics.checkNotNullParameter(dlTestdate, "dlTestdate");
        Intrinsics.checkNotNullParameter(olaName, "olaName");
        Intrinsics.checkNotNullParameter(olacd, "olacd");
        Intrinsics.checkNotNullParameter(veBadgeIssue, "veBadgeIssue");
        Intrinsics.checkNotNullParameter(veShortdesc, "veShortdesc");
        Intrinsics.checkNotNullParameter(vecatg, "vecatg");
        return new Dlcov(badgeIssuedAuth, badgeIssuedt, badgeNo, covIssueAuthCode, covIssuedt, covabbrv, covdesc, dbcImvDesig, dbcImvName, dcApplno, dcAuthDt, dcAuthNo, dcCovStatus, dcCovcd, dcEndorseNo, dcEndorsedt, dcEndorsetime, dcInvcrgNo, dcInvrgdesc, dcIssRtocode, dcIssuedt, dcLicno, dcReflicNo, dcReflicType, dcTokenId, dlBacklogCovEndtime, dlTestdate, endouserid, olaName, olacd, veBadgeIssue, veShortdesc, vecatg);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Dlcov)) {
            return false;
        }
        Dlcov dlcov = (Dlcov) other;
        return Intrinsics.areEqual(this.badgeIssuedAuth, dlcov.badgeIssuedAuth) && Intrinsics.areEqual(this.badgeIssuedt, dlcov.badgeIssuedt) && Intrinsics.areEqual(this.badgeNo, dlcov.badgeNo) && Intrinsics.areEqual(this.covIssueAuthCode, dlcov.covIssueAuthCode) && Intrinsics.areEqual(this.covIssuedt, dlcov.covIssuedt) && Intrinsics.areEqual(this.covabbrv, dlcov.covabbrv) && Intrinsics.areEqual(this.covdesc, dlcov.covdesc) && Intrinsics.areEqual(this.dbcImvDesig, dlcov.dbcImvDesig) && Intrinsics.areEqual(this.dbcImvName, dlcov.dbcImvName) && this.dcApplno == dlcov.dcApplno && Intrinsics.areEqual(this.dcAuthDt, dlcov.dcAuthDt) && Intrinsics.areEqual(this.dcAuthNo, dlcov.dcAuthNo) && Intrinsics.areEqual(this.dcCovStatus, dlcov.dcCovStatus) && this.dcCovcd == dlcov.dcCovcd && Intrinsics.areEqual(this.dcEndorseNo, dlcov.dcEndorseNo) && Intrinsics.areEqual(this.dcEndorsedt, dlcov.dcEndorsedt) && Intrinsics.areEqual(this.dcEndorsetime, dlcov.dcEndorsetime) && Intrinsics.areEqual(this.dcInvcrgNo, dlcov.dcInvcrgNo) && Intrinsics.areEqual(this.dcInvrgdesc, dlcov.dcInvrgdesc) && Intrinsics.areEqual(this.dcIssRtocode, dlcov.dcIssRtocode) && Intrinsics.areEqual(this.dcIssuedt, dlcov.dcIssuedt) && Intrinsics.areEqual(this.dcLicno, dlcov.dcLicno) && Intrinsics.areEqual(this.dcReflicNo, dlcov.dcReflicNo) && Intrinsics.areEqual(this.dcReflicType, dlcov.dcReflicType) && Intrinsics.areEqual(this.dcTokenId, dlcov.dcTokenId) && Intrinsics.areEqual(this.dlBacklogCovEndtime, dlcov.dlBacklogCovEndtime) && Intrinsics.areEqual(this.dlTestdate, dlcov.dlTestdate) && this.endouserid == dlcov.endouserid && Intrinsics.areEqual(this.olaName, dlcov.olaName) && Intrinsics.areEqual(this.olacd, dlcov.olacd) && Intrinsics.areEqual(this.veBadgeIssue, dlcov.veBadgeIssue) && Intrinsics.areEqual(this.veShortdesc, dlcov.veShortdesc) && Intrinsics.areEqual(this.vecatg, dlcov.vecatg);
    }

    public final Object getBadgeIssuedAuth() {
        return this.badgeIssuedAuth;
    }

    public final Object getBadgeIssuedt() {
        return this.badgeIssuedt;
    }

    public final Object getBadgeNo() {
        return this.badgeNo;
    }

    public final Object getCovIssueAuthCode() {
        return this.covIssueAuthCode;
    }

    public final Object getCovIssuedt() {
        return this.covIssuedt;
    }

    public final String getCovabbrv() {
        return this.covabbrv;
    }

    public final String getCovdesc() {
        return this.covdesc;
    }

    public final Object getDbcImvDesig() {
        return this.dbcImvDesig;
    }

    public final Object getDbcImvName() {
        return this.dbcImvName;
    }

    public final int getDcApplno() {
        return this.dcApplno;
    }

    public final Object getDcAuthDt() {
        return this.dcAuthDt;
    }

    public final Object getDcAuthNo() {
        return this.dcAuthNo;
    }

    public final String getDcCovStatus() {
        return this.dcCovStatus;
    }

    public final int getDcCovcd() {
        return this.dcCovcd;
    }

    public final String getDcEndorseNo() {
        return this.dcEndorseNo;
    }

    public final String getDcEndorsedt() {
        return this.dcEndorsedt;
    }

    public final String getDcEndorsetime() {
        return this.dcEndorsetime;
    }

    public final Object getDcInvcrgNo() {
        return this.dcInvcrgNo;
    }

    public final Object getDcInvrgdesc() {
        return this.dcInvrgdesc;
    }

    public final Object getDcIssRtocode() {
        return this.dcIssRtocode;
    }

    public final String getDcIssuedt() {
        return this.dcIssuedt;
    }

    public final String getDcLicno() {
        return this.dcLicno;
    }

    public final Object getDcReflicNo() {
        return this.dcReflicNo;
    }

    public final Object getDcReflicType() {
        return this.dcReflicType;
    }

    public final Object getDcTokenId() {
        return this.dcTokenId;
    }

    public final Object getDlBacklogCovEndtime() {
        return this.dlBacklogCovEndtime;
    }

    public final Object getDlTestdate() {
        return this.dlTestdate;
    }

    public final int getEndouserid() {
        return this.endouserid;
    }

    public final String getOlaName() {
        return this.olaName;
    }

    public final String getOlacd() {
        return this.olacd;
    }

    public final Object getVeBadgeIssue() {
        return this.veBadgeIssue;
    }

    public final String getVeShortdesc() {
        return this.veShortdesc;
    }

    public final String getVecatg() {
        return this.vecatg;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.badgeIssuedAuth.hashCode() * 31) + this.badgeIssuedt.hashCode()) * 31) + this.badgeNo.hashCode()) * 31) + this.covIssueAuthCode.hashCode()) * 31) + this.covIssuedt.hashCode()) * 31) + this.covabbrv.hashCode()) * 31) + this.covdesc.hashCode()) * 31) + this.dbcImvDesig.hashCode()) * 31) + this.dbcImvName.hashCode()) * 31) + Integer.hashCode(this.dcApplno)) * 31) + this.dcAuthDt.hashCode()) * 31) + this.dcAuthNo.hashCode()) * 31) + this.dcCovStatus.hashCode()) * 31) + Integer.hashCode(this.dcCovcd)) * 31) + this.dcEndorseNo.hashCode()) * 31) + this.dcEndorsedt.hashCode()) * 31) + this.dcEndorsetime.hashCode()) * 31) + this.dcInvcrgNo.hashCode()) * 31) + this.dcInvrgdesc.hashCode()) * 31) + this.dcIssRtocode.hashCode()) * 31) + this.dcIssuedt.hashCode()) * 31) + this.dcLicno.hashCode()) * 31) + this.dcReflicNo.hashCode()) * 31) + this.dcReflicType.hashCode()) * 31) + this.dcTokenId.hashCode()) * 31) + this.dlBacklogCovEndtime.hashCode()) * 31) + this.dlTestdate.hashCode()) * 31) + Integer.hashCode(this.endouserid)) * 31) + this.olaName.hashCode()) * 31) + this.olacd.hashCode()) * 31) + this.veBadgeIssue.hashCode()) * 31) + this.veShortdesc.hashCode()) * 31) + this.vecatg.hashCode();
    }

    public String toString() {
        return "Dlcov(badgeIssuedAuth=" + this.badgeIssuedAuth + ", badgeIssuedt=" + this.badgeIssuedt + ", badgeNo=" + this.badgeNo + ", covIssueAuthCode=" + this.covIssueAuthCode + ", covIssuedt=" + this.covIssuedt + ", covabbrv=" + this.covabbrv + ", covdesc=" + this.covdesc + ", dbcImvDesig=" + this.dbcImvDesig + ", dbcImvName=" + this.dbcImvName + ", dcApplno=" + this.dcApplno + ", dcAuthDt=" + this.dcAuthDt + ", dcAuthNo=" + this.dcAuthNo + ", dcCovStatus=" + this.dcCovStatus + ", dcCovcd=" + this.dcCovcd + ", dcEndorseNo=" + this.dcEndorseNo + ", dcEndorsedt=" + this.dcEndorsedt + ", dcEndorsetime=" + this.dcEndorsetime + ", dcInvcrgNo=" + this.dcInvcrgNo + ", dcInvrgdesc=" + this.dcInvrgdesc + ", dcIssRtocode=" + this.dcIssRtocode + ", dcIssuedt=" + this.dcIssuedt + ", dcLicno=" + this.dcLicno + ", dcReflicNo=" + this.dcReflicNo + ", dcReflicType=" + this.dcReflicType + ", dcTokenId=" + this.dcTokenId + ", dlBacklogCovEndtime=" + this.dlBacklogCovEndtime + ", dlTestdate=" + this.dlTestdate + ", endouserid=" + this.endouserid + ", olaName=" + this.olaName + ", olacd=" + this.olacd + ", veBadgeIssue=" + this.veBadgeIssue + ", veShortdesc=" + this.veShortdesc + ", vecatg=" + this.vecatg + ')';
    }
}
