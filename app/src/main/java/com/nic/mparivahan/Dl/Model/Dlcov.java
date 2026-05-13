package com.nic.mparivahan.Dl.Model;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b)\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003¢\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\tHÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u0095\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0003HÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105HÖ\u0003J\t\u00106\u001a\u00020\tHÖ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\r\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014¨\u00068"}, d2 = {"Lcom/nic/mparivahan/Dl/Model/Dlcov;", "Ljava/io/Serializable;", "covIssueAuthCode", "", "covabbrv", "covdesc", "dcApplno", "dcCovStatus", "dcCovcd", "", "dcEndorsetime", "dcIssuedt", "dcLicno", "endouserid", "olaName", "olacd", "veShortdesc", "vecatg", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCovIssueAuthCode", "()Ljava/lang/String;", "getCovabbrv", "getCovdesc", "getDcApplno", "getDcCovStatus", "getDcCovcd", "()I", "getDcEndorsetime", "getDcIssuedt", "getDcLicno", "getEndouserid", "getOlaName", "getOlacd", "getVeShortdesc", "getVecatg", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Dlcov implements Serializable {
    private final String covIssueAuthCode;
    private final String covabbrv;
    private final String covdesc;
    private final String dcApplno;
    private final String dcCovStatus;
    private final int dcCovcd;
    private final String dcEndorsetime;
    private final String dcIssuedt;
    private final String dcLicno;
    private final int endouserid;
    private final String olaName;
    private final String olacd;
    private final String veShortdesc;
    private final String vecatg;

    public Dlcov(String covIssueAuthCode, String covabbrv, String covdesc, String dcApplno, String dcCovStatus, int i, String dcEndorsetime, String dcIssuedt, String dcLicno, int i2, String olaName, String olacd, String veShortdesc, String vecatg) {
        Intrinsics.checkNotNullParameter(covIssueAuthCode, "covIssueAuthCode");
        Intrinsics.checkNotNullParameter(covabbrv, "covabbrv");
        Intrinsics.checkNotNullParameter(covdesc, "covdesc");
        Intrinsics.checkNotNullParameter(dcApplno, "dcApplno");
        Intrinsics.checkNotNullParameter(dcCovStatus, "dcCovStatus");
        Intrinsics.checkNotNullParameter(dcEndorsetime, "dcEndorsetime");
        Intrinsics.checkNotNullParameter(dcIssuedt, "dcIssuedt");
        Intrinsics.checkNotNullParameter(dcLicno, "dcLicno");
        Intrinsics.checkNotNullParameter(olaName, "olaName");
        Intrinsics.checkNotNullParameter(olacd, "olacd");
        Intrinsics.checkNotNullParameter(veShortdesc, "veShortdesc");
        Intrinsics.checkNotNullParameter(vecatg, "vecatg");
        this.covIssueAuthCode = covIssueAuthCode;
        this.covabbrv = covabbrv;
        this.covdesc = covdesc;
        this.dcApplno = dcApplno;
        this.dcCovStatus = dcCovStatus;
        this.dcCovcd = i;
        this.dcEndorsetime = dcEndorsetime;
        this.dcIssuedt = dcIssuedt;
        this.dcLicno = dcLicno;
        this.endouserid = i2;
        this.olaName = olaName;
        this.olacd = olacd;
        this.veShortdesc = veShortdesc;
        this.vecatg = vecatg;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCovIssueAuthCode() {
        return this.covIssueAuthCode;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getEndouserid() {
        return this.endouserid;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getOlaName() {
        return this.olaName;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getOlacd() {
        return this.olacd;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getVeShortdesc() {
        return this.veShortdesc;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getVecatg() {
        return this.vecatg;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCovabbrv() {
        return this.covabbrv;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCovdesc() {
        return this.covdesc;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDcApplno() {
        return this.dcApplno;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDcCovStatus() {
        return this.dcCovStatus;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getDcCovcd() {
        return this.dcCovcd;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDcEndorsetime() {
        return this.dcEndorsetime;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDcIssuedt() {
        return this.dcIssuedt;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDcLicno() {
        return this.dcLicno;
    }

    public final Dlcov copy(String covIssueAuthCode, String covabbrv, String covdesc, String dcApplno, String dcCovStatus, int dcCovcd, String dcEndorsetime, String dcIssuedt, String dcLicno, int endouserid, String olaName, String olacd, String veShortdesc, String vecatg) {
        Intrinsics.checkNotNullParameter(covIssueAuthCode, "covIssueAuthCode");
        Intrinsics.checkNotNullParameter(covabbrv, "covabbrv");
        Intrinsics.checkNotNullParameter(covdesc, "covdesc");
        Intrinsics.checkNotNullParameter(dcApplno, "dcApplno");
        Intrinsics.checkNotNullParameter(dcCovStatus, "dcCovStatus");
        Intrinsics.checkNotNullParameter(dcEndorsetime, "dcEndorsetime");
        Intrinsics.checkNotNullParameter(dcIssuedt, "dcIssuedt");
        Intrinsics.checkNotNullParameter(dcLicno, "dcLicno");
        Intrinsics.checkNotNullParameter(olaName, "olaName");
        Intrinsics.checkNotNullParameter(olacd, "olacd");
        Intrinsics.checkNotNullParameter(veShortdesc, "veShortdesc");
        Intrinsics.checkNotNullParameter(vecatg, "vecatg");
        return new Dlcov(covIssueAuthCode, covabbrv, covdesc, dcApplno, dcCovStatus, dcCovcd, dcEndorsetime, dcIssuedt, dcLicno, endouserid, olaName, olacd, veShortdesc, vecatg);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Dlcov)) {
            return false;
        }
        Dlcov dlcov = (Dlcov) other;
        return Intrinsics.areEqual(this.covIssueAuthCode, dlcov.covIssueAuthCode) && Intrinsics.areEqual(this.covabbrv, dlcov.covabbrv) && Intrinsics.areEqual(this.covdesc, dlcov.covdesc) && Intrinsics.areEqual(this.dcApplno, dlcov.dcApplno) && Intrinsics.areEqual(this.dcCovStatus, dlcov.dcCovStatus) && this.dcCovcd == dlcov.dcCovcd && Intrinsics.areEqual(this.dcEndorsetime, dlcov.dcEndorsetime) && Intrinsics.areEqual(this.dcIssuedt, dlcov.dcIssuedt) && Intrinsics.areEqual(this.dcLicno, dlcov.dcLicno) && this.endouserid == dlcov.endouserid && Intrinsics.areEqual(this.olaName, dlcov.olaName) && Intrinsics.areEqual(this.olacd, dlcov.olacd) && Intrinsics.areEqual(this.veShortdesc, dlcov.veShortdesc) && Intrinsics.areEqual(this.vecatg, dlcov.vecatg);
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

    public final String getDcApplno() {
        return this.dcApplno;
    }

    public final String getDcCovStatus() {
        return this.dcCovStatus;
    }

    public final int getDcCovcd() {
        return this.dcCovcd;
    }

    public final String getDcEndorsetime() {
        return this.dcEndorsetime;
    }

    public final String getDcIssuedt() {
        return this.dcIssuedt;
    }

    public final String getDcLicno() {
        return this.dcLicno;
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

    public final String getVeShortdesc() {
        return this.veShortdesc;
    }

    public final String getVecatg() {
        return this.vecatg;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.covIssueAuthCode.hashCode() * 31) + this.covabbrv.hashCode()) * 31) + this.covdesc.hashCode()) * 31) + this.dcApplno.hashCode()) * 31) + this.dcCovStatus.hashCode()) * 31) + Integer.hashCode(this.dcCovcd)) * 31) + this.dcEndorsetime.hashCode()) * 31) + this.dcIssuedt.hashCode()) * 31) + this.dcLicno.hashCode()) * 31) + Integer.hashCode(this.endouserid)) * 31) + this.olaName.hashCode()) * 31) + this.olacd.hashCode()) * 31) + this.veShortdesc.hashCode()) * 31) + this.vecatg.hashCode();
    }

    public String toString() {
        return "Dlcov(covIssueAuthCode=" + this.covIssueAuthCode + ", covabbrv=" + this.covabbrv + ", covdesc=" + this.covdesc + ", dcApplno=" + this.dcApplno + ", dcCovStatus=" + this.dcCovStatus + ", dcCovcd=" + this.dcCovcd + ", dcEndorsetime=" + this.dcEndorsetime + ", dcIssuedt=" + this.dcIssuedt + ", dcLicno=" + this.dcLicno + ", endouserid=" + this.endouserid + ", olaName=" + this.olaName + ", olacd=" + this.olacd + ", veShortdesc=" + this.veShortdesc + ", vecatg=" + this.vecatg + ')';
    }
}
