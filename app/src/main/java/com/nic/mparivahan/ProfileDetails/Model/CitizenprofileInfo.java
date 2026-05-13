package com.nic.mparivahan.ProfileDetails.Model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003Jc\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0006HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0006HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012¨\u0006("}, d2 = {"Lcom/nic/mparivahan/ProfileDetails/Model/CitizenprofileInfo;", "", "cpBloodGrp", "", "cpCreatedAt", "cpCtzId", "", "cpDob", "cpGender", "cpHeight", "cpRecordId", "cpUpdatedAt", "cpWeight", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;I)V", "getCpBloodGrp", "()Ljava/lang/String;", "getCpCreatedAt", "getCpCtzId", "()I", "getCpDob", "getCpGender", "getCpHeight", "getCpRecordId", "getCpUpdatedAt", "getCpWeight", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CitizenprofileInfo {
    private final String cpBloodGrp;
    private final String cpCreatedAt;
    private final int cpCtzId;
    private final String cpDob;
    private final String cpGender;
    private final int cpHeight;
    private final int cpRecordId;
    private final String cpUpdatedAt;
    private final int cpWeight;

    public CitizenprofileInfo(String cpBloodGrp, String cpCreatedAt, int i, String cpDob, String cpGender, int i2, int i3, String cpUpdatedAt, int i4) {
        Intrinsics.checkNotNullParameter(cpBloodGrp, "cpBloodGrp");
        Intrinsics.checkNotNullParameter(cpCreatedAt, "cpCreatedAt");
        Intrinsics.checkNotNullParameter(cpDob, "cpDob");
        Intrinsics.checkNotNullParameter(cpGender, "cpGender");
        Intrinsics.checkNotNullParameter(cpUpdatedAt, "cpUpdatedAt");
        this.cpBloodGrp = cpBloodGrp;
        this.cpCreatedAt = cpCreatedAt;
        this.cpCtzId = i;
        this.cpDob = cpDob;
        this.cpGender = cpGender;
        this.cpHeight = i2;
        this.cpRecordId = i3;
        this.cpUpdatedAt = cpUpdatedAt;
        this.cpWeight = i4;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCpBloodGrp() {
        return this.cpBloodGrp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCpCreatedAt() {
        return this.cpCreatedAt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCpCtzId() {
        return this.cpCtzId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCpDob() {
        return this.cpDob;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCpGender() {
        return this.cpGender;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getCpHeight() {
        return this.cpHeight;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getCpRecordId() {
        return this.cpRecordId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCpUpdatedAt() {
        return this.cpUpdatedAt;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getCpWeight() {
        return this.cpWeight;
    }

    public final CitizenprofileInfo copy(String cpBloodGrp, String cpCreatedAt, int cpCtzId, String cpDob, String cpGender, int cpHeight, int cpRecordId, String cpUpdatedAt, int cpWeight) {
        Intrinsics.checkNotNullParameter(cpBloodGrp, "cpBloodGrp");
        Intrinsics.checkNotNullParameter(cpCreatedAt, "cpCreatedAt");
        Intrinsics.checkNotNullParameter(cpDob, "cpDob");
        Intrinsics.checkNotNullParameter(cpGender, "cpGender");
        Intrinsics.checkNotNullParameter(cpUpdatedAt, "cpUpdatedAt");
        return new CitizenprofileInfo(cpBloodGrp, cpCreatedAt, cpCtzId, cpDob, cpGender, cpHeight, cpRecordId, cpUpdatedAt, cpWeight);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CitizenprofileInfo)) {
            return false;
        }
        CitizenprofileInfo citizenprofileInfo = (CitizenprofileInfo) other;
        return Intrinsics.areEqual(this.cpBloodGrp, citizenprofileInfo.cpBloodGrp) && Intrinsics.areEqual(this.cpCreatedAt, citizenprofileInfo.cpCreatedAt) && this.cpCtzId == citizenprofileInfo.cpCtzId && Intrinsics.areEqual(this.cpDob, citizenprofileInfo.cpDob) && Intrinsics.areEqual(this.cpGender, citizenprofileInfo.cpGender) && this.cpHeight == citizenprofileInfo.cpHeight && this.cpRecordId == citizenprofileInfo.cpRecordId && Intrinsics.areEqual(this.cpUpdatedAt, citizenprofileInfo.cpUpdatedAt) && this.cpWeight == citizenprofileInfo.cpWeight;
    }

    public final String getCpBloodGrp() {
        return this.cpBloodGrp;
    }

    public final String getCpCreatedAt() {
        return this.cpCreatedAt;
    }

    public final int getCpCtzId() {
        return this.cpCtzId;
    }

    public final String getCpDob() {
        return this.cpDob;
    }

    public final String getCpGender() {
        return this.cpGender;
    }

    public final int getCpHeight() {
        return this.cpHeight;
    }

    public final int getCpRecordId() {
        return this.cpRecordId;
    }

    public final String getCpUpdatedAt() {
        return this.cpUpdatedAt;
    }

    public final int getCpWeight() {
        return this.cpWeight;
    }

    public int hashCode() {
        return (((((((((((((((this.cpBloodGrp.hashCode() * 31) + this.cpCreatedAt.hashCode()) * 31) + Integer.hashCode(this.cpCtzId)) * 31) + this.cpDob.hashCode()) * 31) + this.cpGender.hashCode()) * 31) + Integer.hashCode(this.cpHeight)) * 31) + Integer.hashCode(this.cpRecordId)) * 31) + this.cpUpdatedAt.hashCode()) * 31) + Integer.hashCode(this.cpWeight);
    }

    public String toString() {
        return "CitizenprofileInfo(cpBloodGrp=" + this.cpBloodGrp + ", cpCreatedAt=" + this.cpCreatedAt + ", cpCtzId=" + this.cpCtzId + ", cpDob=" + this.cpDob + ", cpGender=" + this.cpGender + ", cpHeight=" + this.cpHeight + ", cpRecordId=" + this.cpRecordId + ", cpUpdatedAt=" + this.cpUpdatedAt + ", cpWeight=" + this.cpWeight + ')';
    }
}
