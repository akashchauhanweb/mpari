package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0081\u0001\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006*"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/LMV;", "", "psvBadgeElg", "", "covabbrv", "olaName", "dcIssuedt", "dcCovStatus", "dcIssRtocode", "vecatg", "covIssueAuthCode", "covdesc", "dcCovcd", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCovIssueAuthCode", "()Ljava/lang/String;", "getCovabbrv", "getCovdesc", "getDcCovStatus", "getDcCovcd", "getDcIssRtocode", "getDcIssuedt", "getOlaName", "getPsvBadgeElg", "getVecatg", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class LMV {

    @xy5("covIssueAuthCode")
    private final String covIssueAuthCode;

    @xy5("covabbrv")
    private final String covabbrv;

    @xy5("covdesc")
    private final String covdesc;

    @xy5("dcCovStatus")
    private final String dcCovStatus;

    @xy5("dcCovcd")
    private final String dcCovcd;

    @xy5("dcIssRtocode")
    private final String dcIssRtocode;

    @xy5("dcIssuedt")
    private final String dcIssuedt;

    @xy5("olaName")
    private final String olaName;

    @xy5("psvBadgeElg")
    private final String psvBadgeElg;

    @xy5("vecatg")
    private final String vecatg;

    public LMV() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPsvBadgeElg() {
        return this.psvBadgeElg;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getDcCovcd() {
        return this.dcCovcd;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCovabbrv() {
        return this.covabbrv;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOlaName() {
        return this.olaName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDcIssuedt() {
        return this.dcIssuedt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDcCovStatus() {
        return this.dcCovStatus;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDcIssRtocode() {
        return this.dcIssRtocode;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getVecatg() {
        return this.vecatg;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCovIssueAuthCode() {
        return this.covIssueAuthCode;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCovdesc() {
        return this.covdesc;
    }

    public final LMV copy(String psvBadgeElg, String covabbrv, String olaName, String dcIssuedt, String dcCovStatus, String dcIssRtocode, String vecatg, String covIssueAuthCode, String covdesc, String dcCovcd) {
        return new LMV(psvBadgeElg, covabbrv, olaName, dcIssuedt, dcCovStatus, dcIssRtocode, vecatg, covIssueAuthCode, covdesc, dcCovcd);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LMV)) {
            return false;
        }
        LMV lmv = (LMV) other;
        return Intrinsics.areEqual(this.psvBadgeElg, lmv.psvBadgeElg) && Intrinsics.areEqual(this.covabbrv, lmv.covabbrv) && Intrinsics.areEqual(this.olaName, lmv.olaName) && Intrinsics.areEqual(this.dcIssuedt, lmv.dcIssuedt) && Intrinsics.areEqual(this.dcCovStatus, lmv.dcCovStatus) && Intrinsics.areEqual(this.dcIssRtocode, lmv.dcIssRtocode) && Intrinsics.areEqual(this.vecatg, lmv.vecatg) && Intrinsics.areEqual(this.covIssueAuthCode, lmv.covIssueAuthCode) && Intrinsics.areEqual(this.covdesc, lmv.covdesc) && Intrinsics.areEqual(this.dcCovcd, lmv.dcCovcd);
    }

    public final String getCovIssueAuthCode() {
        return this.covIssueAuthCode;
    }

    public final String getCovabbrv() {
        return this.covabbrv;
    }

    public final String getCovdesc() {
        return this.covdesc;
    }

    public final String getDcCovStatus() {
        return this.dcCovStatus;
    }

    public final String getDcCovcd() {
        return this.dcCovcd;
    }

    public final String getDcIssRtocode() {
        return this.dcIssRtocode;
    }

    public final String getDcIssuedt() {
        return this.dcIssuedt;
    }

    public final String getOlaName() {
        return this.olaName;
    }

    public final String getPsvBadgeElg() {
        return this.psvBadgeElg;
    }

    public final String getVecatg() {
        return this.vecatg;
    }

    public int hashCode() {
        String str = this.psvBadgeElg;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.covabbrv;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.olaName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.dcIssuedt;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.dcCovStatus;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.dcIssRtocode;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.vecatg;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.covIssueAuthCode;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.covdesc;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.dcCovcd;
        return iHashCode9 + (str10 != null ? str10.hashCode() : 0);
    }

    public String toString() {
        return "LMV(psvBadgeElg=" + this.psvBadgeElg + ", covabbrv=" + this.covabbrv + ", olaName=" + this.olaName + ", dcIssuedt=" + this.dcIssuedt + ", dcCovStatus=" + this.dcCovStatus + ", dcIssRtocode=" + this.dcIssRtocode + ", vecatg=" + this.vecatg + ", covIssueAuthCode=" + this.covIssueAuthCode + ", covdesc=" + this.covdesc + ", dcCovcd=" + this.dcCovcd + ')';
    }

    public LMV(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.psvBadgeElg = str;
        this.covabbrv = str2;
        this.olaName = str3;
        this.dcIssuedt = str4;
        this.dcCovStatus = str5;
        this.dcIssRtocode = str6;
        this.vecatg = str7;
        this.covIssueAuthCode = str8;
        this.covdesc = str9;
        this.dcCovcd = str10;
    }

    public /* synthetic */ LMV(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0 ? str10 : null);
    }
}
