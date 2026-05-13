package com.nic.mparivahan.NewDlScreen.Modal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003Jm\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020%HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001J\u0019\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020%HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u00061"}, d2 = {"Lcom/nic/mparivahan/NewDlScreen/Modal/DrivingSchoolDetRequestModal;", "Landroid/os/Parcelable;", "enrollDate", "", "covcd", "trainTo", "certDate", "certNo", "enrollNo", "dschoolCode", "trainFrom", "vehicleClassName", "drivingSchoolName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCertDate", "()Ljava/lang/String;", "getCertNo", "getCovcd", "getDrivingSchoolName", "getDschoolCode", "getEnrollDate", "getEnrollNo", "getTrainFrom", "getTrainTo", "getVehicleClassName", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DrivingSchoolDetRequestModal implements Parcelable {
    public static final Parcelable.Creator<DrivingSchoolDetRequestModal> CREATOR = new a();
    private final String certDate;
    private final String certNo;
    private final String covcd;
    private final String drivingSchoolName;
    private final String dschoolCode;
    private final String enrollDate;
    private final String enrollNo;
    private final String trainFrom;
    private final String trainTo;
    private final String vehicleClassName;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DrivingSchoolDetRequestModal createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DrivingSchoolDetRequestModal(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DrivingSchoolDetRequestModal[] newArray(int i) {
            return new DrivingSchoolDetRequestModal[i];
        }
    }

    public DrivingSchoolDetRequestModal(String enrollDate, String covcd, String trainTo, String certDate, String certNo, String enrollNo, String dschoolCode, String trainFrom, String vehicleClassName, String drivingSchoolName) {
        Intrinsics.checkNotNullParameter(enrollDate, "enrollDate");
        Intrinsics.checkNotNullParameter(covcd, "covcd");
        Intrinsics.checkNotNullParameter(trainTo, "trainTo");
        Intrinsics.checkNotNullParameter(certDate, "certDate");
        Intrinsics.checkNotNullParameter(certNo, "certNo");
        Intrinsics.checkNotNullParameter(enrollNo, "enrollNo");
        Intrinsics.checkNotNullParameter(dschoolCode, "dschoolCode");
        Intrinsics.checkNotNullParameter(trainFrom, "trainFrom");
        Intrinsics.checkNotNullParameter(vehicleClassName, "vehicleClassName");
        Intrinsics.checkNotNullParameter(drivingSchoolName, "drivingSchoolName");
        this.enrollDate = enrollDate;
        this.covcd = covcd;
        this.trainTo = trainTo;
        this.certDate = certDate;
        this.certNo = certNo;
        this.enrollNo = enrollNo;
        this.dschoolCode = dschoolCode;
        this.trainFrom = trainFrom;
        this.vehicleClassName = vehicleClassName;
        this.drivingSchoolName = drivingSchoolName;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEnrollDate() {
        return this.enrollDate;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getDrivingSchoolName() {
        return this.drivingSchoolName;
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

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getVehicleClassName() {
        return this.vehicleClassName;
    }

    public final DrivingSchoolDetRequestModal copy(String enrollDate, String covcd, String trainTo, String certDate, String certNo, String enrollNo, String dschoolCode, String trainFrom, String vehicleClassName, String drivingSchoolName) {
        Intrinsics.checkNotNullParameter(enrollDate, "enrollDate");
        Intrinsics.checkNotNullParameter(covcd, "covcd");
        Intrinsics.checkNotNullParameter(trainTo, "trainTo");
        Intrinsics.checkNotNullParameter(certDate, "certDate");
        Intrinsics.checkNotNullParameter(certNo, "certNo");
        Intrinsics.checkNotNullParameter(enrollNo, "enrollNo");
        Intrinsics.checkNotNullParameter(dschoolCode, "dschoolCode");
        Intrinsics.checkNotNullParameter(trainFrom, "trainFrom");
        Intrinsics.checkNotNullParameter(vehicleClassName, "vehicleClassName");
        Intrinsics.checkNotNullParameter(drivingSchoolName, "drivingSchoolName");
        return new DrivingSchoolDetRequestModal(enrollDate, covcd, trainTo, certDate, certNo, enrollNo, dschoolCode, trainFrom, vehicleClassName, drivingSchoolName);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DrivingSchoolDetRequestModal)) {
            return false;
        }
        DrivingSchoolDetRequestModal drivingSchoolDetRequestModal = (DrivingSchoolDetRequestModal) other;
        return Intrinsics.areEqual(this.enrollDate, drivingSchoolDetRequestModal.enrollDate) && Intrinsics.areEqual(this.covcd, drivingSchoolDetRequestModal.covcd) && Intrinsics.areEqual(this.trainTo, drivingSchoolDetRequestModal.trainTo) && Intrinsics.areEqual(this.certDate, drivingSchoolDetRequestModal.certDate) && Intrinsics.areEqual(this.certNo, drivingSchoolDetRequestModal.certNo) && Intrinsics.areEqual(this.enrollNo, drivingSchoolDetRequestModal.enrollNo) && Intrinsics.areEqual(this.dschoolCode, drivingSchoolDetRequestModal.dschoolCode) && Intrinsics.areEqual(this.trainFrom, drivingSchoolDetRequestModal.trainFrom) && Intrinsics.areEqual(this.vehicleClassName, drivingSchoolDetRequestModal.vehicleClassName) && Intrinsics.areEqual(this.drivingSchoolName, drivingSchoolDetRequestModal.drivingSchoolName);
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

    public final String getDrivingSchoolName() {
        return this.drivingSchoolName;
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

    public final String getVehicleClassName() {
        return this.vehicleClassName;
    }

    public int hashCode() {
        return (((((((((((((((((this.enrollDate.hashCode() * 31) + this.covcd.hashCode()) * 31) + this.trainTo.hashCode()) * 31) + this.certDate.hashCode()) * 31) + this.certNo.hashCode()) * 31) + this.enrollNo.hashCode()) * 31) + this.dschoolCode.hashCode()) * 31) + this.trainFrom.hashCode()) * 31) + this.vehicleClassName.hashCode()) * 31) + this.drivingSchoolName.hashCode();
    }

    public String toString() {
        return "DrivingSchoolDetRequestModal(enrollDate=" + this.enrollDate + ", covcd=" + this.covcd + ", trainTo=" + this.trainTo + ", certDate=" + this.certDate + ", certNo=" + this.certNo + ", enrollNo=" + this.enrollNo + ", dschoolCode=" + this.dschoolCode + ", trainFrom=" + this.trainFrom + ", vehicleClassName=" + this.vehicleClassName + ", drivingSchoolName=" + this.drivingSchoolName + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.enrollDate);
        parcel.writeString(this.covcd);
        parcel.writeString(this.trainTo);
        parcel.writeString(this.certDate);
        parcel.writeString(this.certNo);
        parcel.writeString(this.enrollNo);
        parcel.writeString(this.dschoolCode);
        parcel.writeString(this.trainFrom);
        parcel.writeString(this.vehicleClassName);
        parcel.writeString(this.drivingSchoolName);
    }
}
