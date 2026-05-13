package com.nic.mparivahan.ProfileDetails.Model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\""}, d2 = {"Lcom/nic/mparivahan/ProfileDetails/Model/MparCitizenProfile;", "", "cpBloodGrp", "", "cpCtzId", "", "cpDob", "cpGender", "cpHeight", "cpRecordId", "cpWeight", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;III)V", "getCpBloodGrp", "()Ljava/lang/String;", "getCpCtzId", "()I", "getCpDob", "getCpGender", "getCpHeight", "getCpRecordId", "getCpWeight", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class MparCitizenProfile {
    private final String cpBloodGrp;
    private final int cpCtzId;
    private final String cpDob;
    private final String cpGender;
    private final int cpHeight;
    private final int cpRecordId;
    private final int cpWeight;

    public MparCitizenProfile(String cpBloodGrp, int i, String cpDob, String cpGender, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(cpBloodGrp, "cpBloodGrp");
        Intrinsics.checkNotNullParameter(cpDob, "cpDob");
        Intrinsics.checkNotNullParameter(cpGender, "cpGender");
        this.cpBloodGrp = cpBloodGrp;
        this.cpCtzId = i;
        this.cpDob = cpDob;
        this.cpGender = cpGender;
        this.cpHeight = i2;
        this.cpRecordId = i3;
        this.cpWeight = i4;
    }

    public static /* synthetic */ MparCitizenProfile copy$default(MparCitizenProfile mparCitizenProfile, String str, int i, String str2, String str3, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = mparCitizenProfile.cpBloodGrp;
        }
        if ((i5 & 2) != 0) {
            i = mparCitizenProfile.cpCtzId;
        }
        int i6 = i;
        if ((i5 & 4) != 0) {
            str2 = mparCitizenProfile.cpDob;
        }
        String str4 = str2;
        if ((i5 & 8) != 0) {
            str3 = mparCitizenProfile.cpGender;
        }
        String str5 = str3;
        if ((i5 & 16) != 0) {
            i2 = mparCitizenProfile.cpHeight;
        }
        int i7 = i2;
        if ((i5 & 32) != 0) {
            i3 = mparCitizenProfile.cpRecordId;
        }
        int i8 = i3;
        if ((i5 & 64) != 0) {
            i4 = mparCitizenProfile.cpWeight;
        }
        return mparCitizenProfile.copy(str, i6, str4, str5, i7, i8, i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCpBloodGrp() {
        return this.cpBloodGrp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCpCtzId() {
        return this.cpCtzId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCpDob() {
        return this.cpDob;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCpGender() {
        return this.cpGender;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getCpHeight() {
        return this.cpHeight;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getCpRecordId() {
        return this.cpRecordId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getCpWeight() {
        return this.cpWeight;
    }

    public final MparCitizenProfile copy(String cpBloodGrp, int cpCtzId, String cpDob, String cpGender, int cpHeight, int cpRecordId, int cpWeight) {
        Intrinsics.checkNotNullParameter(cpBloodGrp, "cpBloodGrp");
        Intrinsics.checkNotNullParameter(cpDob, "cpDob");
        Intrinsics.checkNotNullParameter(cpGender, "cpGender");
        return new MparCitizenProfile(cpBloodGrp, cpCtzId, cpDob, cpGender, cpHeight, cpRecordId, cpWeight);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MparCitizenProfile)) {
            return false;
        }
        MparCitizenProfile mparCitizenProfile = (MparCitizenProfile) other;
        return Intrinsics.areEqual(this.cpBloodGrp, mparCitizenProfile.cpBloodGrp) && this.cpCtzId == mparCitizenProfile.cpCtzId && Intrinsics.areEqual(this.cpDob, mparCitizenProfile.cpDob) && Intrinsics.areEqual(this.cpGender, mparCitizenProfile.cpGender) && this.cpHeight == mparCitizenProfile.cpHeight && this.cpRecordId == mparCitizenProfile.cpRecordId && this.cpWeight == mparCitizenProfile.cpWeight;
    }

    public final String getCpBloodGrp() {
        return this.cpBloodGrp;
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

    public final int getCpWeight() {
        return this.cpWeight;
    }

    public int hashCode() {
        return (((((((((((this.cpBloodGrp.hashCode() * 31) + Integer.hashCode(this.cpCtzId)) * 31) + this.cpDob.hashCode()) * 31) + this.cpGender.hashCode()) * 31) + Integer.hashCode(this.cpHeight)) * 31) + Integer.hashCode(this.cpRecordId)) * 31) + Integer.hashCode(this.cpWeight);
    }

    public String toString() {
        return "MparCitizenProfile(cpBloodGrp=" + this.cpBloodGrp + ", cpCtzId=" + this.cpCtzId + ", cpDob=" + this.cpDob + ", cpGender=" + this.cpGender + ", cpHeight=" + this.cpHeight + ", cpRecordId=" + this.cpRecordId + ", cpWeight=" + this.cpWeight + ')';
    }
}
