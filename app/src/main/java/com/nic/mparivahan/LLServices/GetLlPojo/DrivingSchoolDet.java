package com.nic.mparivahan.LLServices.GetLlPojo;

import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003Je\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010¨\u0006)"}, d2 = {"Lcom/nic/mparivahan/LLServices/GetLlPojo/DrivingSchoolDet;", "Ljava/io/Serializable;", "certDate", "", "certNo", "covcd", "", "Lcom/nic/mparivahan/LLServices/GetLlPojo/Covcd;", "dsName", "Lcom/nic/mparivahan/LLServices/GetLlPojo/DsName;", "enrollDate", "enrollNo", "trainFrom", "trainTo", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCertDate", "()Ljava/lang/String;", "getCertNo", "getCovcd", "()Ljava/util/List;", "getDsName", "getEnrollDate", "getEnrollNo", "getTrainFrom", "getTrainTo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DrivingSchoolDet implements Serializable {
    private final String certDate;
    private final String certNo;
    private final List<Covcd> covcd;
    private final List<DsName> dsName;
    private final String enrollDate;
    private final String enrollNo;
    private final String trainFrom;
    private final String trainTo;

    public DrivingSchoolDet(String certDate, String certNo, List<Covcd> covcd, List<DsName> dsName, String enrollDate, String enrollNo, String trainFrom, String trainTo) {
        Intrinsics.checkNotNullParameter(certDate, "certDate");
        Intrinsics.checkNotNullParameter(certNo, "certNo");
        Intrinsics.checkNotNullParameter(covcd, "covcd");
        Intrinsics.checkNotNullParameter(dsName, "dsName");
        Intrinsics.checkNotNullParameter(enrollDate, "enrollDate");
        Intrinsics.checkNotNullParameter(enrollNo, "enrollNo");
        Intrinsics.checkNotNullParameter(trainFrom, "trainFrom");
        Intrinsics.checkNotNullParameter(trainTo, "trainTo");
        this.certDate = certDate;
        this.certNo = certNo;
        this.covcd = covcd;
        this.dsName = dsName;
        this.enrollDate = enrollDate;
        this.enrollNo = enrollNo;
        this.trainFrom = trainFrom;
        this.trainTo = trainTo;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCertDate() {
        return this.certDate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCertNo() {
        return this.certNo;
    }

    public final List<Covcd> component3() {
        return this.covcd;
    }

    public final List<DsName> component4() {
        return this.dsName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getEnrollDate() {
        return this.enrollDate;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getEnrollNo() {
        return this.enrollNo;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTrainFrom() {
        return this.trainFrom;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTrainTo() {
        return this.trainTo;
    }

    public final DrivingSchoolDet copy(String certDate, String certNo, List<Covcd> covcd, List<DsName> dsName, String enrollDate, String enrollNo, String trainFrom, String trainTo) {
        Intrinsics.checkNotNullParameter(certDate, "certDate");
        Intrinsics.checkNotNullParameter(certNo, "certNo");
        Intrinsics.checkNotNullParameter(covcd, "covcd");
        Intrinsics.checkNotNullParameter(dsName, "dsName");
        Intrinsics.checkNotNullParameter(enrollDate, "enrollDate");
        Intrinsics.checkNotNullParameter(enrollNo, "enrollNo");
        Intrinsics.checkNotNullParameter(trainFrom, "trainFrom");
        Intrinsics.checkNotNullParameter(trainTo, "trainTo");
        return new DrivingSchoolDet(certDate, certNo, covcd, dsName, enrollDate, enrollNo, trainFrom, trainTo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DrivingSchoolDet)) {
            return false;
        }
        DrivingSchoolDet drivingSchoolDet = (DrivingSchoolDet) other;
        return Intrinsics.areEqual(this.certDate, drivingSchoolDet.certDate) && Intrinsics.areEqual(this.certNo, drivingSchoolDet.certNo) && Intrinsics.areEqual(this.covcd, drivingSchoolDet.covcd) && Intrinsics.areEqual(this.dsName, drivingSchoolDet.dsName) && Intrinsics.areEqual(this.enrollDate, drivingSchoolDet.enrollDate) && Intrinsics.areEqual(this.enrollNo, drivingSchoolDet.enrollNo) && Intrinsics.areEqual(this.trainFrom, drivingSchoolDet.trainFrom) && Intrinsics.areEqual(this.trainTo, drivingSchoolDet.trainTo);
    }

    public final String getCertDate() {
        return this.certDate;
    }

    public final String getCertNo() {
        return this.certNo;
    }

    public final List<Covcd> getCovcd() {
        return this.covcd;
    }

    public final List<DsName> getDsName() {
        return this.dsName;
    }

    public final String getEnrollDate() {
        return this.enrollDate;
    }

    public final String getEnrollNo() {
        return this.enrollNo;
    }

    public final String getTrainFrom() {
        return this.trainFrom;
    }

    public final String getTrainTo() {
        return this.trainTo;
    }

    public int hashCode() {
        return (((((((((((((this.certDate.hashCode() * 31) + this.certNo.hashCode()) * 31) + this.covcd.hashCode()) * 31) + this.dsName.hashCode()) * 31) + this.enrollDate.hashCode()) * 31) + this.enrollNo.hashCode()) * 31) + this.trainFrom.hashCode()) * 31) + this.trainTo.hashCode();
    }

    public String toString() {
        return "DrivingSchoolDet(certDate=" + this.certDate + ", certNo=" + this.certNo + ", covcd=" + this.covcd + ", dsName=" + this.dsName + ", enrollDate=" + this.enrollDate + ", enrollNo=" + this.enrollNo + ", trainFrom=" + this.trainFrom + ", trainTo=" + this.trainTo + ')';
    }
}
