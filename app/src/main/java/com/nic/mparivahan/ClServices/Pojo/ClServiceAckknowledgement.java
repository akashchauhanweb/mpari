package com.nic.mparivahan.ClServices.Pojo;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/nic/mparivahan/ClServices/Pojo/ClServiceAckknowledgement;", "", "applicationDate", "", "applicationNo", "dateofBirth", "fatherName", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApplicationDate", "()Ljava/lang/String;", "getApplicationNo", "getDateofBirth", "getFatherName", "getName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ClServiceAckknowledgement {
    private final String applicationDate;
    private final String applicationNo;
    private final String dateofBirth;
    private final String fatherName;
    private final String name;

    public ClServiceAckknowledgement(String applicationDate, String applicationNo, String dateofBirth, String fatherName, String name) {
        Intrinsics.checkNotNullParameter(applicationDate, "applicationDate");
        Intrinsics.checkNotNullParameter(applicationNo, "applicationNo");
        Intrinsics.checkNotNullParameter(dateofBirth, "dateofBirth");
        Intrinsics.checkNotNullParameter(fatherName, "fatherName");
        Intrinsics.checkNotNullParameter(name, "name");
        this.applicationDate = applicationDate;
        this.applicationNo = applicationNo;
        this.dateofBirth = dateofBirth;
        this.fatherName = fatherName;
        this.name = name;
    }

    public static /* synthetic */ ClServiceAckknowledgement copy$default(ClServiceAckknowledgement clServiceAckknowledgement, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = clServiceAckknowledgement.applicationDate;
        }
        if ((i & 2) != 0) {
            str2 = clServiceAckknowledgement.applicationNo;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = clServiceAckknowledgement.dateofBirth;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = clServiceAckknowledgement.fatherName;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = clServiceAckknowledgement.name;
        }
        return clServiceAckknowledgement.copy(str, str6, str7, str8, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApplicationDate() {
        return this.applicationDate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getApplicationNo() {
        return this.applicationNo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDateofBirth() {
        return this.dateofBirth;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFatherName() {
        return this.fatherName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final ClServiceAckknowledgement copy(String applicationDate, String applicationNo, String dateofBirth, String fatherName, String name) {
        Intrinsics.checkNotNullParameter(applicationDate, "applicationDate");
        Intrinsics.checkNotNullParameter(applicationNo, "applicationNo");
        Intrinsics.checkNotNullParameter(dateofBirth, "dateofBirth");
        Intrinsics.checkNotNullParameter(fatherName, "fatherName");
        Intrinsics.checkNotNullParameter(name, "name");
        return new ClServiceAckknowledgement(applicationDate, applicationNo, dateofBirth, fatherName, name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClServiceAckknowledgement)) {
            return false;
        }
        ClServiceAckknowledgement clServiceAckknowledgement = (ClServiceAckknowledgement) other;
        return Intrinsics.areEqual(this.applicationDate, clServiceAckknowledgement.applicationDate) && Intrinsics.areEqual(this.applicationNo, clServiceAckknowledgement.applicationNo) && Intrinsics.areEqual(this.dateofBirth, clServiceAckknowledgement.dateofBirth) && Intrinsics.areEqual(this.fatherName, clServiceAckknowledgement.fatherName) && Intrinsics.areEqual(this.name, clServiceAckknowledgement.name);
    }

    public final String getApplicationDate() {
        return this.applicationDate;
    }

    public final String getApplicationNo() {
        return this.applicationNo;
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
        return (((((((this.applicationDate.hashCode() * 31) + this.applicationNo.hashCode()) * 31) + this.dateofBirth.hashCode()) * 31) + this.fatherName.hashCode()) * 31) + this.name.hashCode();
    }

    public String toString() {
        return "ClServiceAckknowledgement(applicationDate=" + this.applicationDate + ", applicationNo=" + this.applicationNo + ", dateofBirth=" + this.dateofBirth + ", fatherName=" + this.fatherName + ", name=" + this.name + ')';
    }
}
