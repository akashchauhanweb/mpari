package com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails;

import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005¢\u0006\u0002\u0010\u0018J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\t\u0010:\u001a\u00020\fHÆ\u0003J\t\u0010;\u001a\u00020\u000eHÆ\u0003J\t\u0010<\u001a\u00020\u0005HÆ\u0003J\u000f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00110\bHÆ\u0003J«\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u0005HÆ\u0001J\u0013\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010BHÖ\u0003J\t\u0010C\u001a\u00020DHÖ\u0001J\t\u0010E\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001cR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010!R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001cR\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001cR\u0011\u0010\u0017\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001c¨\u0006F"}, d2 = {"Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "Ljava/io/Serializable;", "ApplicantAddress", "Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/ApplicantAddress;", "DateOfBirth", "", "FullName", "LLDetails", "", "Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/LLDetail;", "MobileNumber", "RTO", "Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/RTO;", "State", "Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/State;", "bloodgroup", "covobj", "Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/Covobj;", "dateOfIssue", "gender", "learningLicence", "photo", "rel", "signature", "(Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/ApplicantAddress;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/RTO;Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/State;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApplicantAddress", "()Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/ApplicantAddress;", "getDateOfBirth", "()Ljava/lang/String;", "setDateOfBirth", "(Ljava/lang/String;)V", "getFullName", "getLLDetails", "()Ljava/util/List;", "getMobileNumber", "getRTO", "()Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/RTO;", "getState", "()Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/State;", "getBloodgroup", "getCovobj", "getDateOfIssue", "getGender", "getLearningLicence", "getPhoto", "getRel", "getSignature", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class FetchLlDetails implements Serializable {
    private final ApplicantAddress ApplicantAddress;
    private String DateOfBirth;
    private final String FullName;
    private final List<LLDetail> LLDetails;
    private final String MobileNumber;
    private final RTO RTO;
    private final State State;
    private final String bloodgroup;
    private final List<Covobj> covobj;
    private final String dateOfIssue;
    private final String gender;
    private final String learningLicence;
    private final String photo;
    private final String rel;
    private final String signature;

    public FetchLlDetails(ApplicantAddress ApplicantAddress, String DateOfBirth, String FullName, List<LLDetail> LLDetails, String MobileNumber, RTO RTO, State State, String bloodgroup, List<Covobj> covobj, String dateOfIssue, String gender, String learningLicence, String photo, String rel, String signature) {
        Intrinsics.checkNotNullParameter(ApplicantAddress, "ApplicantAddress");
        Intrinsics.checkNotNullParameter(DateOfBirth, "DateOfBirth");
        Intrinsics.checkNotNullParameter(FullName, "FullName");
        Intrinsics.checkNotNullParameter(LLDetails, "LLDetails");
        Intrinsics.checkNotNullParameter(MobileNumber, "MobileNumber");
        Intrinsics.checkNotNullParameter(RTO, "RTO");
        Intrinsics.checkNotNullParameter(State, "State");
        Intrinsics.checkNotNullParameter(bloodgroup, "bloodgroup");
        Intrinsics.checkNotNullParameter(covobj, "covobj");
        Intrinsics.checkNotNullParameter(dateOfIssue, "dateOfIssue");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(learningLicence, "learningLicence");
        Intrinsics.checkNotNullParameter(photo, "photo");
        Intrinsics.checkNotNullParameter(rel, "rel");
        Intrinsics.checkNotNullParameter(signature, "signature");
        this.ApplicantAddress = ApplicantAddress;
        this.DateOfBirth = DateOfBirth;
        this.FullName = FullName;
        this.LLDetails = LLDetails;
        this.MobileNumber = MobileNumber;
        this.RTO = RTO;
        this.State = State;
        this.bloodgroup = bloodgroup;
        this.covobj = covobj;
        this.dateOfIssue = dateOfIssue;
        this.gender = gender;
        this.learningLicence = learningLicence;
        this.photo = photo;
        this.rel = rel;
        this.signature = signature;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ApplicantAddress getApplicantAddress() {
        return this.ApplicantAddress;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getDateOfIssue() {
        return this.dateOfIssue;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getGender() {
        return this.gender;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getLearningLicence() {
        return this.learningLicence;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getPhoto() {
        return this.photo;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getRel() {
        return this.rel;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getSignature() {
        return this.signature;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDateOfBirth() {
        return this.DateOfBirth;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFullName() {
        return this.FullName;
    }

    public final List<LLDetail> component4() {
        return this.LLDetails;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMobileNumber() {
        return this.MobileNumber;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final RTO getRTO() {
        return this.RTO;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final State getState() {
        return this.State;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getBloodgroup() {
        return this.bloodgroup;
    }

    public final List<Covobj> component9() {
        return this.covobj;
    }

    public final FetchLlDetails copy(ApplicantAddress ApplicantAddress, String DateOfBirth, String FullName, List<LLDetail> LLDetails, String MobileNumber, RTO RTO, State State, String bloodgroup, List<Covobj> covobj, String dateOfIssue, String gender, String learningLicence, String photo, String rel, String signature) {
        Intrinsics.checkNotNullParameter(ApplicantAddress, "ApplicantAddress");
        Intrinsics.checkNotNullParameter(DateOfBirth, "DateOfBirth");
        Intrinsics.checkNotNullParameter(FullName, "FullName");
        Intrinsics.checkNotNullParameter(LLDetails, "LLDetails");
        Intrinsics.checkNotNullParameter(MobileNumber, "MobileNumber");
        Intrinsics.checkNotNullParameter(RTO, "RTO");
        Intrinsics.checkNotNullParameter(State, "State");
        Intrinsics.checkNotNullParameter(bloodgroup, "bloodgroup");
        Intrinsics.checkNotNullParameter(covobj, "covobj");
        Intrinsics.checkNotNullParameter(dateOfIssue, "dateOfIssue");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(learningLicence, "learningLicence");
        Intrinsics.checkNotNullParameter(photo, "photo");
        Intrinsics.checkNotNullParameter(rel, "rel");
        Intrinsics.checkNotNullParameter(signature, "signature");
        return new FetchLlDetails(ApplicantAddress, DateOfBirth, FullName, LLDetails, MobileNumber, RTO, State, bloodgroup, covobj, dateOfIssue, gender, learningLicence, photo, rel, signature);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FetchLlDetails)) {
            return false;
        }
        FetchLlDetails fetchLlDetails = (FetchLlDetails) other;
        return Intrinsics.areEqual(this.ApplicantAddress, fetchLlDetails.ApplicantAddress) && Intrinsics.areEqual(this.DateOfBirth, fetchLlDetails.DateOfBirth) && Intrinsics.areEqual(this.FullName, fetchLlDetails.FullName) && Intrinsics.areEqual(this.LLDetails, fetchLlDetails.LLDetails) && Intrinsics.areEqual(this.MobileNumber, fetchLlDetails.MobileNumber) && Intrinsics.areEqual(this.RTO, fetchLlDetails.RTO) && Intrinsics.areEqual(this.State, fetchLlDetails.State) && Intrinsics.areEqual(this.bloodgroup, fetchLlDetails.bloodgroup) && Intrinsics.areEqual(this.covobj, fetchLlDetails.covobj) && Intrinsics.areEqual(this.dateOfIssue, fetchLlDetails.dateOfIssue) && Intrinsics.areEqual(this.gender, fetchLlDetails.gender) && Intrinsics.areEqual(this.learningLicence, fetchLlDetails.learningLicence) && Intrinsics.areEqual(this.photo, fetchLlDetails.photo) && Intrinsics.areEqual(this.rel, fetchLlDetails.rel) && Intrinsics.areEqual(this.signature, fetchLlDetails.signature);
    }

    public final ApplicantAddress getApplicantAddress() {
        return this.ApplicantAddress;
    }

    public final String getBloodgroup() {
        return this.bloodgroup;
    }

    public final List<Covobj> getCovobj() {
        return this.covobj;
    }

    public final String getDateOfBirth() {
        return this.DateOfBirth;
    }

    public final String getDateOfIssue() {
        return this.dateOfIssue;
    }

    public final String getFullName() {
        return this.FullName;
    }

    public final String getGender() {
        return this.gender;
    }

    public final List<LLDetail> getLLDetails() {
        return this.LLDetails;
    }

    public final String getLearningLicence() {
        return this.learningLicence;
    }

    public final String getMobileNumber() {
        return this.MobileNumber;
    }

    public final String getPhoto() {
        return this.photo;
    }

    public final RTO getRTO() {
        return this.RTO;
    }

    public final String getRel() {
        return this.rel;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final State getState() {
        return this.State;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((this.ApplicantAddress.hashCode() * 31) + this.DateOfBirth.hashCode()) * 31) + this.FullName.hashCode()) * 31) + this.LLDetails.hashCode()) * 31) + this.MobileNumber.hashCode()) * 31) + this.RTO.hashCode()) * 31) + this.State.hashCode()) * 31) + this.bloodgroup.hashCode()) * 31) + this.covobj.hashCode()) * 31) + this.dateOfIssue.hashCode()) * 31) + this.gender.hashCode()) * 31) + this.learningLicence.hashCode()) * 31) + this.photo.hashCode()) * 31) + this.rel.hashCode()) * 31) + this.signature.hashCode();
    }

    public final void setDateOfBirth(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.DateOfBirth = str;
    }

    public String toString() {
        return "FetchLlDetails(ApplicantAddress=" + this.ApplicantAddress + ", DateOfBirth=" + this.DateOfBirth + ", FullName=" + this.FullName + ", LLDetails=" + this.LLDetails + ", MobileNumber=" + this.MobileNumber + ", RTO=" + this.RTO + ", State=" + this.State + ", bloodgroup=" + this.bloodgroup + ", covobj=" + this.covobj + ", dateOfIssue=" + this.dateOfIssue + ", gender=" + this.gender + ", learningLicence=" + this.learningLicence + ", photo=" + this.photo + ", rel=" + this.rel + ", signature=" + this.signature + ')';
    }
}
