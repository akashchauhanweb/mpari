package com.nic.mparivahan.dlservices.newlearner.DataClass;

import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\bB\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B×\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003¢\u0006\u0002\u0010\u0018J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003JÛ\u0001\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u0003HÆ\u0001J\u0013\u0010E\u001a\u00020F2\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010H\u001a\u00020IHÖ\u0001J\t\u0010J\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0016\u0010\u0017\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0016\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0016\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001aR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001aR\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001aR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001aR\u0016\u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001aR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001a¨\u0006K"}, d2 = {"Lcom/nic/mparivahan/dlservices/newlearner/DataClass/NewLLAcknowledgement;", "", "validLocationError", "", "vehicleClassError", "bloodGroupError", "mobileError", "fatherName", "dob", "applicationNo", "applicantAddress", "smsConfirmation", "referenceLink", "bloodGroup", "applicantGender", "servicesRequested", "smsToMobile", "documentaryProofsRequired", "rtoLocation", "name", "applicationDate", "nameMismatchError", "validSubDistrictInPermanent", "freshLLNotSaved", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApplicantAddress", "()Ljava/lang/String;", "getApplicantGender", "getApplicationDate", "getApplicationNo", "getBloodGroup", "getBloodGroupError", "getDob", "getDocumentaryProofsRequired", "getFatherName", "getFreshLLNotSaved", "getMobileError", "getName", "getNameMismatchError", "getReferenceLink", "getRtoLocation", "getServicesRequested", "getSmsConfirmation", "getSmsToMobile", "getValidLocationError", "getValidSubDistrictInPermanent", "getVehicleClassError", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class NewLLAcknowledgement {

    @xy5("applicantAddress")
    private final String applicantAddress;

    @xy5("applicantGender")
    private final String applicantGender;

    @xy5("applicationDate")
    private final String applicationDate;

    @xy5("applicationNo")
    private final String applicationNo;

    @xy5("bloodGroup")
    private final String bloodGroup;

    @xy5("UC01-E150")
    private final String bloodGroupError;

    @xy5("dateofBirth")
    private final String dob;

    @xy5("documentaryProofsRequired")
    private final String documentaryProofsRequired;

    @xy5("fatherName")
    private final String fatherName;

    @xy5("UC01-E219")
    private final String freshLLNotSaved;

    @xy5("UC01-E288")
    private final String mobileError;

    @xy5("name")
    private final String name;

    @xy5("UC01-E287")
    private final String nameMismatchError;

    @xy5("referenceLink")
    private final String referenceLink;

    @xy5("rtoLocation")
    private final String rtoLocation;

    @xy5("servicesRequested")
    private final String servicesRequested;

    @xy5("smsConfirmation")
    private final String smsConfirmation;

    @xy5("smsToMobile")
    private final String smsToMobile;

    @xy5("UC01-E167")
    private final String validLocationError;

    @xy5("UC01-E164")
    private final String validSubDistrictInPermanent;

    @xy5("UC01-E205")
    private final String vehicleClassError;

    public NewLLAcknowledgement() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097151, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getValidLocationError() {
        return this.validLocationError;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getReferenceLink() {
        return this.referenceLink;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getBloodGroup() {
        return this.bloodGroup;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getApplicantGender() {
        return this.applicantGender;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getServicesRequested() {
        return this.servicesRequested;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getSmsToMobile() {
        return this.smsToMobile;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getDocumentaryProofsRequired() {
        return this.documentaryProofsRequired;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getRtoLocation() {
        return this.rtoLocation;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getApplicationDate() {
        return this.applicationDate;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getNameMismatchError() {
        return this.nameMismatchError;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVehicleClassError() {
        return this.vehicleClassError;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getValidSubDistrictInPermanent() {
        return this.validSubDistrictInPermanent;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getFreshLLNotSaved() {
        return this.freshLLNotSaved;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBloodGroupError() {
        return this.bloodGroupError;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMobileError() {
        return this.mobileError;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFatherName() {
        return this.fatherName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDob() {
        return this.dob;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getApplicationNo() {
        return this.applicationNo;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getApplicantAddress() {
        return this.applicantAddress;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSmsConfirmation() {
        return this.smsConfirmation;
    }

    public final NewLLAcknowledgement copy(String validLocationError, String vehicleClassError, String bloodGroupError, String mobileError, String fatherName, String dob, String applicationNo, String applicantAddress, String smsConfirmation, String referenceLink, String bloodGroup, String applicantGender, String servicesRequested, String smsToMobile, String documentaryProofsRequired, String rtoLocation, String name, String applicationDate, String nameMismatchError, String validSubDistrictInPermanent, String freshLLNotSaved) {
        Intrinsics.checkNotNullParameter(validLocationError, "validLocationError");
        Intrinsics.checkNotNullParameter(vehicleClassError, "vehicleClassError");
        Intrinsics.checkNotNullParameter(bloodGroupError, "bloodGroupError");
        Intrinsics.checkNotNullParameter(mobileError, "mobileError");
        Intrinsics.checkNotNullParameter(fatherName, "fatherName");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(applicationNo, "applicationNo");
        Intrinsics.checkNotNullParameter(applicantAddress, "applicantAddress");
        Intrinsics.checkNotNullParameter(smsConfirmation, "smsConfirmation");
        Intrinsics.checkNotNullParameter(referenceLink, "referenceLink");
        Intrinsics.checkNotNullParameter(bloodGroup, "bloodGroup");
        Intrinsics.checkNotNullParameter(applicantGender, "applicantGender");
        Intrinsics.checkNotNullParameter(servicesRequested, "servicesRequested");
        Intrinsics.checkNotNullParameter(smsToMobile, "smsToMobile");
        Intrinsics.checkNotNullParameter(documentaryProofsRequired, "documentaryProofsRequired");
        Intrinsics.checkNotNullParameter(rtoLocation, "rtoLocation");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(applicationDate, "applicationDate");
        Intrinsics.checkNotNullParameter(nameMismatchError, "nameMismatchError");
        Intrinsics.checkNotNullParameter(validSubDistrictInPermanent, "validSubDistrictInPermanent");
        Intrinsics.checkNotNullParameter(freshLLNotSaved, "freshLLNotSaved");
        return new NewLLAcknowledgement(validLocationError, vehicleClassError, bloodGroupError, mobileError, fatherName, dob, applicationNo, applicantAddress, smsConfirmation, referenceLink, bloodGroup, applicantGender, servicesRequested, smsToMobile, documentaryProofsRequired, rtoLocation, name, applicationDate, nameMismatchError, validSubDistrictInPermanent, freshLLNotSaved);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewLLAcknowledgement)) {
            return false;
        }
        NewLLAcknowledgement newLLAcknowledgement = (NewLLAcknowledgement) other;
        return Intrinsics.areEqual(this.validLocationError, newLLAcknowledgement.validLocationError) && Intrinsics.areEqual(this.vehicleClassError, newLLAcknowledgement.vehicleClassError) && Intrinsics.areEqual(this.bloodGroupError, newLLAcknowledgement.bloodGroupError) && Intrinsics.areEqual(this.mobileError, newLLAcknowledgement.mobileError) && Intrinsics.areEqual(this.fatherName, newLLAcknowledgement.fatherName) && Intrinsics.areEqual(this.dob, newLLAcknowledgement.dob) && Intrinsics.areEqual(this.applicationNo, newLLAcknowledgement.applicationNo) && Intrinsics.areEqual(this.applicantAddress, newLLAcknowledgement.applicantAddress) && Intrinsics.areEqual(this.smsConfirmation, newLLAcknowledgement.smsConfirmation) && Intrinsics.areEqual(this.referenceLink, newLLAcknowledgement.referenceLink) && Intrinsics.areEqual(this.bloodGroup, newLLAcknowledgement.bloodGroup) && Intrinsics.areEqual(this.applicantGender, newLLAcknowledgement.applicantGender) && Intrinsics.areEqual(this.servicesRequested, newLLAcknowledgement.servicesRequested) && Intrinsics.areEqual(this.smsToMobile, newLLAcknowledgement.smsToMobile) && Intrinsics.areEqual(this.documentaryProofsRequired, newLLAcknowledgement.documentaryProofsRequired) && Intrinsics.areEqual(this.rtoLocation, newLLAcknowledgement.rtoLocation) && Intrinsics.areEqual(this.name, newLLAcknowledgement.name) && Intrinsics.areEqual(this.applicationDate, newLLAcknowledgement.applicationDate) && Intrinsics.areEqual(this.nameMismatchError, newLLAcknowledgement.nameMismatchError) && Intrinsics.areEqual(this.validSubDistrictInPermanent, newLLAcknowledgement.validSubDistrictInPermanent) && Intrinsics.areEqual(this.freshLLNotSaved, newLLAcknowledgement.freshLLNotSaved);
    }

    public final String getApplicantAddress() {
        return this.applicantAddress;
    }

    public final String getApplicantGender() {
        return this.applicantGender;
    }

    public final String getApplicationDate() {
        return this.applicationDate;
    }

    public final String getApplicationNo() {
        return this.applicationNo;
    }

    public final String getBloodGroup() {
        return this.bloodGroup;
    }

    public final String getBloodGroupError() {
        return this.bloodGroupError;
    }

    public final String getDob() {
        return this.dob;
    }

    public final String getDocumentaryProofsRequired() {
        return this.documentaryProofsRequired;
    }

    public final String getFatherName() {
        return this.fatherName;
    }

    public final String getFreshLLNotSaved() {
        return this.freshLLNotSaved;
    }

    public final String getMobileError() {
        return this.mobileError;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNameMismatchError() {
        return this.nameMismatchError;
    }

    public final String getReferenceLink() {
        return this.referenceLink;
    }

    public final String getRtoLocation() {
        return this.rtoLocation;
    }

    public final String getServicesRequested() {
        return this.servicesRequested;
    }

    public final String getSmsConfirmation() {
        return this.smsConfirmation;
    }

    public final String getSmsToMobile() {
        return this.smsToMobile;
    }

    public final String getValidLocationError() {
        return this.validLocationError;
    }

    public final String getValidSubDistrictInPermanent() {
        return this.validSubDistrictInPermanent;
    }

    public final String getVehicleClassError() {
        return this.vehicleClassError;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((this.validLocationError.hashCode() * 31) + this.vehicleClassError.hashCode()) * 31) + this.bloodGroupError.hashCode()) * 31) + this.mobileError.hashCode()) * 31) + this.fatherName.hashCode()) * 31) + this.dob.hashCode()) * 31) + this.applicationNo.hashCode()) * 31) + this.applicantAddress.hashCode()) * 31) + this.smsConfirmation.hashCode()) * 31) + this.referenceLink.hashCode()) * 31) + this.bloodGroup.hashCode()) * 31) + this.applicantGender.hashCode()) * 31) + this.servicesRequested.hashCode()) * 31) + this.smsToMobile.hashCode()) * 31) + this.documentaryProofsRequired.hashCode()) * 31) + this.rtoLocation.hashCode()) * 31) + this.name.hashCode()) * 31) + this.applicationDate.hashCode()) * 31) + this.nameMismatchError.hashCode()) * 31) + this.validSubDistrictInPermanent.hashCode()) * 31) + this.freshLLNotSaved.hashCode();
    }

    public String toString() {
        return "NewLLAcknowledgement(validLocationError=" + this.validLocationError + ", vehicleClassError=" + this.vehicleClassError + ", bloodGroupError=" + this.bloodGroupError + ", mobileError=" + this.mobileError + ", fatherName=" + this.fatherName + ", dob=" + this.dob + ", applicationNo=" + this.applicationNo + ", applicantAddress=" + this.applicantAddress + ", smsConfirmation=" + this.smsConfirmation + ", referenceLink=" + this.referenceLink + ", bloodGroup=" + this.bloodGroup + ", applicantGender=" + this.applicantGender + ", servicesRequested=" + this.servicesRequested + ", smsToMobile=" + this.smsToMobile + ", documentaryProofsRequired=" + this.documentaryProofsRequired + ", rtoLocation=" + this.rtoLocation + ", name=" + this.name + ", applicationDate=" + this.applicationDate + ", nameMismatchError=" + this.nameMismatchError + ", validSubDistrictInPermanent=" + this.validSubDistrictInPermanent + ", freshLLNotSaved=" + this.freshLLNotSaved + ')';
    }

    public NewLLAcknowledgement(String validLocationError, String vehicleClassError, String bloodGroupError, String mobileError, String fatherName, String dob, String applicationNo, String applicantAddress, String smsConfirmation, String referenceLink, String bloodGroup, String applicantGender, String servicesRequested, String smsToMobile, String documentaryProofsRequired, String rtoLocation, String name, String applicationDate, String nameMismatchError, String validSubDistrictInPermanent, String freshLLNotSaved) {
        Intrinsics.checkNotNullParameter(validLocationError, "validLocationError");
        Intrinsics.checkNotNullParameter(vehicleClassError, "vehicleClassError");
        Intrinsics.checkNotNullParameter(bloodGroupError, "bloodGroupError");
        Intrinsics.checkNotNullParameter(mobileError, "mobileError");
        Intrinsics.checkNotNullParameter(fatherName, "fatherName");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(applicationNo, "applicationNo");
        Intrinsics.checkNotNullParameter(applicantAddress, "applicantAddress");
        Intrinsics.checkNotNullParameter(smsConfirmation, "smsConfirmation");
        Intrinsics.checkNotNullParameter(referenceLink, "referenceLink");
        Intrinsics.checkNotNullParameter(bloodGroup, "bloodGroup");
        Intrinsics.checkNotNullParameter(applicantGender, "applicantGender");
        Intrinsics.checkNotNullParameter(servicesRequested, "servicesRequested");
        Intrinsics.checkNotNullParameter(smsToMobile, "smsToMobile");
        Intrinsics.checkNotNullParameter(documentaryProofsRequired, "documentaryProofsRequired");
        Intrinsics.checkNotNullParameter(rtoLocation, "rtoLocation");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(applicationDate, "applicationDate");
        Intrinsics.checkNotNullParameter(nameMismatchError, "nameMismatchError");
        Intrinsics.checkNotNullParameter(validSubDistrictInPermanent, "validSubDistrictInPermanent");
        Intrinsics.checkNotNullParameter(freshLLNotSaved, "freshLLNotSaved");
        this.validLocationError = validLocationError;
        this.vehicleClassError = vehicleClassError;
        this.bloodGroupError = bloodGroupError;
        this.mobileError = mobileError;
        this.fatherName = fatherName;
        this.dob = dob;
        this.applicationNo = applicationNo;
        this.applicantAddress = applicantAddress;
        this.smsConfirmation = smsConfirmation;
        this.referenceLink = referenceLink;
        this.bloodGroup = bloodGroup;
        this.applicantGender = applicantGender;
        this.servicesRequested = servicesRequested;
        this.smsToMobile = smsToMobile;
        this.documentaryProofsRequired = documentaryProofsRequired;
        this.rtoLocation = rtoLocation;
        this.name = name;
        this.applicationDate = applicationDate;
        this.nameMismatchError = nameMismatchError;
        this.validSubDistrictInPermanent = validSubDistrictInPermanent;
        this.freshLLNotSaved = freshLLNotSaved;
    }

    public /* synthetic */ NewLLAcknowledgement(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? "" : str13, (i & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17, (i & 131072) != 0 ? "" : str18, (i & 262144) != 0 ? "" : str19, (i & 524288) != 0 ? "" : str20, (i & 1048576) != 0 ? "" : str21);
    }
}
