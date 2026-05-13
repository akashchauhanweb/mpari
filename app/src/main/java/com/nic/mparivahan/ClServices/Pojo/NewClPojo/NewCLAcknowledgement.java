package com.nic.mparivahan.ClServices.Pojo.NewClPojo;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006!"}, d2 = {"Lcom/nic/mparivahan/ClServices/Pojo/NewClPojo/NewCLAcknowledgement;", "", "applicantGender", "", "applicationDate", "applicationNo", "bloodGroup", "dateofBirth", "fatherName", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApplicantGender", "()Ljava/lang/String;", "getApplicationDate", "getApplicationNo", "getBloodGroup", "getDateofBirth", "getFatherName", "getName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class NewCLAcknowledgement {
    private final String applicantGender;
    private final String applicationDate;
    private final String applicationNo;
    private final String bloodGroup;
    private final String dateofBirth;
    private final String fatherName;
    private final String name;

    public NewCLAcknowledgement(String applicantGender, String applicationDate, String applicationNo, String bloodGroup, String dateofBirth, String fatherName, String name) {
        Intrinsics.checkNotNullParameter(applicantGender, "applicantGender");
        Intrinsics.checkNotNullParameter(applicationDate, "applicationDate");
        Intrinsics.checkNotNullParameter(applicationNo, "applicationNo");
        Intrinsics.checkNotNullParameter(bloodGroup, "bloodGroup");
        Intrinsics.checkNotNullParameter(dateofBirth, "dateofBirth");
        Intrinsics.checkNotNullParameter(fatherName, "fatherName");
        Intrinsics.checkNotNullParameter(name, "name");
        this.applicantGender = applicantGender;
        this.applicationDate = applicationDate;
        this.applicationNo = applicationNo;
        this.bloodGroup = bloodGroup;
        this.dateofBirth = dateofBirth;
        this.fatherName = fatherName;
        this.name = name;
    }

    public static /* synthetic */ NewCLAcknowledgement copy$default(NewCLAcknowledgement newCLAcknowledgement, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = newCLAcknowledgement.applicantGender;
        }
        if ((i & 2) != 0) {
            str2 = newCLAcknowledgement.applicationDate;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = newCLAcknowledgement.applicationNo;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = newCLAcknowledgement.bloodGroup;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = newCLAcknowledgement.dateofBirth;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = newCLAcknowledgement.fatherName;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = newCLAcknowledgement.name;
        }
        return newCLAcknowledgement.copy(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApplicantGender() {
        return this.applicantGender;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getApplicationDate() {
        return this.applicationDate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getApplicationNo() {
        return this.applicationNo;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBloodGroup() {
        return this.bloodGroup;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDateofBirth() {
        return this.dateofBirth;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFatherName() {
        return this.fatherName;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final NewCLAcknowledgement copy(String applicantGender, String applicationDate, String applicationNo, String bloodGroup, String dateofBirth, String fatherName, String name) {
        Intrinsics.checkNotNullParameter(applicantGender, "applicantGender");
        Intrinsics.checkNotNullParameter(applicationDate, "applicationDate");
        Intrinsics.checkNotNullParameter(applicationNo, "applicationNo");
        Intrinsics.checkNotNullParameter(bloodGroup, "bloodGroup");
        Intrinsics.checkNotNullParameter(dateofBirth, "dateofBirth");
        Intrinsics.checkNotNullParameter(fatherName, "fatherName");
        Intrinsics.checkNotNullParameter(name, "name");
        return new NewCLAcknowledgement(applicantGender, applicationDate, applicationNo, bloodGroup, dateofBirth, fatherName, name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewCLAcknowledgement)) {
            return false;
        }
        NewCLAcknowledgement newCLAcknowledgement = (NewCLAcknowledgement) other;
        return Intrinsics.areEqual(this.applicantGender, newCLAcknowledgement.applicantGender) && Intrinsics.areEqual(this.applicationDate, newCLAcknowledgement.applicationDate) && Intrinsics.areEqual(this.applicationNo, newCLAcknowledgement.applicationNo) && Intrinsics.areEqual(this.bloodGroup, newCLAcknowledgement.bloodGroup) && Intrinsics.areEqual(this.dateofBirth, newCLAcknowledgement.dateofBirth) && Intrinsics.areEqual(this.fatherName, newCLAcknowledgement.fatherName) && Intrinsics.areEqual(this.name, newCLAcknowledgement.name);
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

    public final String getDateofBirth() {
        return this.dateofBirth;
    }

    public final String getFatherName() {
        return this.fatherName;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((((((((((this.applicantGender.hashCode() * 31) + this.applicationDate.hashCode()) * 31) + this.applicationNo.hashCode()) * 31) + this.bloodGroup.hashCode()) * 31) + this.dateofBirth.hashCode()) * 31) + this.fatherName.hashCode()) * 31) + this.name.hashCode();
    }

    public String toString() {
        return "NewCLAcknowledgement(applicantGender=" + this.applicantGender + ", applicationDate=" + this.applicationDate + ", applicationNo=" + this.applicationNo + ", bloodGroup=" + this.bloodGroup + ", dateofBirth=" + this.dateofBirth + ", fatherName=" + this.fatherName + ", name=" + this.name + ')';
    }
}
