package com.nic.mparivahan.NewDlScreen.Modal;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JY\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006$"}, d2 = {"Lcom/nic/mparivahan/NewDlScreen/Modal/DrivingClassRequestModal;", "", "enrollDate", "", "covcd", "trainTo", "certDate", "certNo", "enrollNo", "dschoolCode", "trainFrom", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCertDate", "()Ljava/lang/String;", "getCertNo", "getCovcd", "getDschoolCode", "getEnrollDate", "getEnrollNo", "getTrainFrom", "getTrainTo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DrivingClassRequestModal {
    private final String certDate;
    private final String certNo;
    private final String covcd;
    private final String dschoolCode;
    private final String enrollDate;
    private final String enrollNo;
    private final String trainFrom;
    private final String trainTo;

    public DrivingClassRequestModal(String enrollDate, String covcd, String trainTo, String certDate, String certNo, String enrollNo, String dschoolCode, String trainFrom) {
        Intrinsics.checkNotNullParameter(enrollDate, "enrollDate");
        Intrinsics.checkNotNullParameter(covcd, "covcd");
        Intrinsics.checkNotNullParameter(trainTo, "trainTo");
        Intrinsics.checkNotNullParameter(certDate, "certDate");
        Intrinsics.checkNotNullParameter(certNo, "certNo");
        Intrinsics.checkNotNullParameter(enrollNo, "enrollNo");
        Intrinsics.checkNotNullParameter(dschoolCode, "dschoolCode");
        Intrinsics.checkNotNullParameter(trainFrom, "trainFrom");
        this.enrollDate = enrollDate;
        this.covcd = covcd;
        this.trainTo = trainTo;
        this.certDate = certDate;
        this.certNo = certNo;
        this.enrollNo = enrollNo;
        this.dschoolCode = dschoolCode;
        this.trainFrom = trainFrom;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEnrollDate() {
        return this.enrollDate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCovcd() {
        return this.covcd;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTrainTo() {
        return this.trainTo;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCertDate() {
        return this.certDate;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCertNo() {
        return this.certNo;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getEnrollNo() {
        return this.enrollNo;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDschoolCode() {
        return this.dschoolCode;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTrainFrom() {
        return this.trainFrom;
    }

    public final DrivingClassRequestModal copy(String enrollDate, String covcd, String trainTo, String certDate, String certNo, String enrollNo, String dschoolCode, String trainFrom) {
        Intrinsics.checkNotNullParameter(enrollDate, "enrollDate");
        Intrinsics.checkNotNullParameter(covcd, "covcd");
        Intrinsics.checkNotNullParameter(trainTo, "trainTo");
        Intrinsics.checkNotNullParameter(certDate, "certDate");
        Intrinsics.checkNotNullParameter(certNo, "certNo");
        Intrinsics.checkNotNullParameter(enrollNo, "enrollNo");
        Intrinsics.checkNotNullParameter(dschoolCode, "dschoolCode");
        Intrinsics.checkNotNullParameter(trainFrom, "trainFrom");
        return new DrivingClassRequestModal(enrollDate, covcd, trainTo, certDate, certNo, enrollNo, dschoolCode, trainFrom);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DrivingClassRequestModal)) {
            return false;
        }
        DrivingClassRequestModal drivingClassRequestModal = (DrivingClassRequestModal) other;
        return Intrinsics.areEqual(this.enrollDate, drivingClassRequestModal.enrollDate) && Intrinsics.areEqual(this.covcd, drivingClassRequestModal.covcd) && Intrinsics.areEqual(this.trainTo, drivingClassRequestModal.trainTo) && Intrinsics.areEqual(this.certDate, drivingClassRequestModal.certDate) && Intrinsics.areEqual(this.certNo, drivingClassRequestModal.certNo) && Intrinsics.areEqual(this.enrollNo, drivingClassRequestModal.enrollNo) && Intrinsics.areEqual(this.dschoolCode, drivingClassRequestModal.dschoolCode) && Intrinsics.areEqual(this.trainFrom, drivingClassRequestModal.trainFrom);
    }

    public final String getCertDate() {
        return this.certDate;
    }

    public final String getCertNo() {
        return this.certNo;
    }

    public final String getCovcd() {
        return this.covcd;
    }

    public final String getDschoolCode() {
        return this.dschoolCode;
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
        return (((((((((((((this.enrollDate.hashCode() * 31) + this.covcd.hashCode()) * 31) + this.trainTo.hashCode()) * 31) + this.certDate.hashCode()) * 31) + this.certNo.hashCode()) * 31) + this.enrollNo.hashCode()) * 31) + this.dschoolCode.hashCode()) * 31) + this.trainFrom.hashCode();
    }

    public String toString() {
        return "DrivingClassRequestModal(enrollDate=" + this.enrollDate + ", covcd=" + this.covcd + ", trainTo=" + this.trainTo + ", certDate=" + this.certDate + ", certNo=" + this.certNo + ", enrollNo=" + this.enrollNo + ", dschoolCode=" + this.dschoolCode + ", trainFrom=" + this.trainFrom + ')';
    }
}
