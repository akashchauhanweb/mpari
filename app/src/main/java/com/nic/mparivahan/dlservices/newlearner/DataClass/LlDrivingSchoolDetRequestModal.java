package com.nic.mparivahan.dlservices.newlearner.DataClass;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JY\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u001fHÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\u0019\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006+"}, d2 = {"Lcom/nic/mparivahan/dlservices/newlearner/DataClass/LlDrivingSchoolDetRequestModal;", "Landroid/os/Parcelable;", "enrolmentDate", "", "covcd", "dsTrainedToDate", "certificateDate", "certificateNo", "enrolmentNo", "dsTrainedFromDate", "dsName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCertificateDate", "()Ljava/lang/String;", "getCertificateNo", "getCovcd", "getDsName", "getDsTrainedFromDate", "getDsTrainedToDate", "getEnrolmentDate", "getEnrolmentNo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class LlDrivingSchoolDetRequestModal implements Parcelable {
    public static final Parcelable.Creator<LlDrivingSchoolDetRequestModal> CREATOR = new a();
    private final String certificateDate;
    private final String certificateNo;
    private final String covcd;
    private final String dsName;
    private final String dsTrainedFromDate;
    private final String dsTrainedToDate;
    private final String enrolmentDate;
    private final String enrolmentNo;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LlDrivingSchoolDetRequestModal createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LlDrivingSchoolDetRequestModal(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LlDrivingSchoolDetRequestModal[] newArray(int i) {
            return new LlDrivingSchoolDetRequestModal[i];
        }
    }

    public LlDrivingSchoolDetRequestModal(String enrolmentDate, String covcd, String dsTrainedToDate, String certificateDate, String certificateNo, String enrolmentNo, String dsTrainedFromDate, String dsName) {
        Intrinsics.checkNotNullParameter(enrolmentDate, "enrolmentDate");
        Intrinsics.checkNotNullParameter(covcd, "covcd");
        Intrinsics.checkNotNullParameter(dsTrainedToDate, "dsTrainedToDate");
        Intrinsics.checkNotNullParameter(certificateDate, "certificateDate");
        Intrinsics.checkNotNullParameter(certificateNo, "certificateNo");
        Intrinsics.checkNotNullParameter(enrolmentNo, "enrolmentNo");
        Intrinsics.checkNotNullParameter(dsTrainedFromDate, "dsTrainedFromDate");
        Intrinsics.checkNotNullParameter(dsName, "dsName");
        this.enrolmentDate = enrolmentDate;
        this.covcd = covcd;
        this.dsTrainedToDate = dsTrainedToDate;
        this.certificateDate = certificateDate;
        this.certificateNo = certificateNo;
        this.enrolmentNo = enrolmentNo;
        this.dsTrainedFromDate = dsTrainedFromDate;
        this.dsName = dsName;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEnrolmentDate() {
        return this.enrolmentDate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCovcd() {
        return this.covcd;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDsTrainedToDate() {
        return this.dsTrainedToDate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCertificateDate() {
        return this.certificateDate;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCertificateNo() {
        return this.certificateNo;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getEnrolmentNo() {
        return this.enrolmentNo;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDsTrainedFromDate() {
        return this.dsTrainedFromDate;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDsName() {
        return this.dsName;
    }

    public final LlDrivingSchoolDetRequestModal copy(String enrolmentDate, String covcd, String dsTrainedToDate, String certificateDate, String certificateNo, String enrolmentNo, String dsTrainedFromDate, String dsName) {
        Intrinsics.checkNotNullParameter(enrolmentDate, "enrolmentDate");
        Intrinsics.checkNotNullParameter(covcd, "covcd");
        Intrinsics.checkNotNullParameter(dsTrainedToDate, "dsTrainedToDate");
        Intrinsics.checkNotNullParameter(certificateDate, "certificateDate");
        Intrinsics.checkNotNullParameter(certificateNo, "certificateNo");
        Intrinsics.checkNotNullParameter(enrolmentNo, "enrolmentNo");
        Intrinsics.checkNotNullParameter(dsTrainedFromDate, "dsTrainedFromDate");
        Intrinsics.checkNotNullParameter(dsName, "dsName");
        return new LlDrivingSchoolDetRequestModal(enrolmentDate, covcd, dsTrainedToDate, certificateDate, certificateNo, enrolmentNo, dsTrainedFromDate, dsName);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LlDrivingSchoolDetRequestModal)) {
            return false;
        }
        LlDrivingSchoolDetRequestModal llDrivingSchoolDetRequestModal = (LlDrivingSchoolDetRequestModal) other;
        return Intrinsics.areEqual(this.enrolmentDate, llDrivingSchoolDetRequestModal.enrolmentDate) && Intrinsics.areEqual(this.covcd, llDrivingSchoolDetRequestModal.covcd) && Intrinsics.areEqual(this.dsTrainedToDate, llDrivingSchoolDetRequestModal.dsTrainedToDate) && Intrinsics.areEqual(this.certificateDate, llDrivingSchoolDetRequestModal.certificateDate) && Intrinsics.areEqual(this.certificateNo, llDrivingSchoolDetRequestModal.certificateNo) && Intrinsics.areEqual(this.enrolmentNo, llDrivingSchoolDetRequestModal.enrolmentNo) && Intrinsics.areEqual(this.dsTrainedFromDate, llDrivingSchoolDetRequestModal.dsTrainedFromDate) && Intrinsics.areEqual(this.dsName, llDrivingSchoolDetRequestModal.dsName);
    }

    public final String getCertificateDate() {
        return this.certificateDate;
    }

    public final String getCertificateNo() {
        return this.certificateNo;
    }

    public final String getCovcd() {
        return this.covcd;
    }

    public final String getDsName() {
        return this.dsName;
    }

    public final String getDsTrainedFromDate() {
        return this.dsTrainedFromDate;
    }

    public final String getDsTrainedToDate() {
        return this.dsTrainedToDate;
    }

    public final String getEnrolmentDate() {
        return this.enrolmentDate;
    }

    public final String getEnrolmentNo() {
        return this.enrolmentNo;
    }

    public int hashCode() {
        return (((((((((((((this.enrolmentDate.hashCode() * 31) + this.covcd.hashCode()) * 31) + this.dsTrainedToDate.hashCode()) * 31) + this.certificateDate.hashCode()) * 31) + this.certificateNo.hashCode()) * 31) + this.enrolmentNo.hashCode()) * 31) + this.dsTrainedFromDate.hashCode()) * 31) + this.dsName.hashCode();
    }

    public String toString() {
        return "LlDrivingSchoolDetRequestModal(enrolmentDate=" + this.enrolmentDate + ", covcd=" + this.covcd + ", dsTrainedToDate=" + this.dsTrainedToDate + ", certificateDate=" + this.certificateDate + ", certificateNo=" + this.certificateNo + ", enrolmentNo=" + this.enrolmentNo + ", dsTrainedFromDate=" + this.dsTrainedFromDate + ", dsName=" + this.dsName + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.enrolmentDate);
        parcel.writeString(this.covcd);
        parcel.writeString(this.dsTrainedToDate);
        parcel.writeString(this.certificateDate);
        parcel.writeString(this.certificateNo);
        parcel.writeString(this.enrolmentNo);
        parcel.writeString(this.dsTrainedFromDate);
        parcel.writeString(this.dsName);
    }
}
