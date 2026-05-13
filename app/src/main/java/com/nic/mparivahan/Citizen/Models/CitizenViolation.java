package com.nic.mparivahan.Citizen.Models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b0\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0007¢\u0006\u0002\u0010\u0014J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\t\u0010,\u001a\u00020\u0007HÆ\u0003J\t\u0010-\u001a\u00020\u0007HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0007HÆ\u0003J\t\u00100\u001a\u00020\u0007HÆ\u0003J\t\u00101\u001a\u00020\u0007HÆ\u0003J\t\u00102\u001a\u00020\u0007HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0007HÆ\u0003J\u009f\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u0007HÆ\u0001J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020\u0005HÖ\u0001J\t\u0010;\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0011\u0010\u0011\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0011\u0010\u0012\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0011\u0010\u0013\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001a¨\u0006<"}, d2 = {"Lcom/nic/mparivahan/Citizen/Models/CitizenViolation;", "", "violCitizenId", "", "violDistId", "", "violGaddr", "", "violLatitude", "violLocation", "violLongitude", "violOffenceId", "violRecordId", "violRegnNo", "violRemarks", "violStateCd", "violStatus", "violSubmittedAt", "violUpdatedAt", "violUpdatedBy", "(JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getViolCitizenId", "()J", "getViolDistId", "()I", "getViolGaddr", "()Ljava/lang/String;", "getViolLatitude", "getViolLocation", "getViolLongitude", "getViolOffenceId", "getViolRecordId", "getViolRegnNo", "getViolRemarks", "getViolStateCd", "getViolStatus", "getViolSubmittedAt", "getViolUpdatedAt", "getViolUpdatedBy", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CitizenViolation {
    private final long violCitizenId;
    private final int violDistId;
    private final String violGaddr;
    private final String violLatitude;
    private final String violLocation;
    private final String violLongitude;
    private final int violOffenceId;
    private final int violRecordId;
    private final String violRegnNo;
    private final String violRemarks;
    private final String violStateCd;
    private final int violStatus;
    private final String violSubmittedAt;
    private final String violUpdatedAt;
    private final String violUpdatedBy;

    public CitizenViolation(long j, int i, String violGaddr, String violLatitude, String violLocation, String violLongitude, int i2, int i3, String violRegnNo, String violRemarks, String violStateCd, int i4, String violSubmittedAt, String violUpdatedAt, String violUpdatedBy) {
        Intrinsics.checkNotNullParameter(violGaddr, "violGaddr");
        Intrinsics.checkNotNullParameter(violLatitude, "violLatitude");
        Intrinsics.checkNotNullParameter(violLocation, "violLocation");
        Intrinsics.checkNotNullParameter(violLongitude, "violLongitude");
        Intrinsics.checkNotNullParameter(violRegnNo, "violRegnNo");
        Intrinsics.checkNotNullParameter(violRemarks, "violRemarks");
        Intrinsics.checkNotNullParameter(violStateCd, "violStateCd");
        Intrinsics.checkNotNullParameter(violSubmittedAt, "violSubmittedAt");
        Intrinsics.checkNotNullParameter(violUpdatedAt, "violUpdatedAt");
        Intrinsics.checkNotNullParameter(violUpdatedBy, "violUpdatedBy");
        this.violCitizenId = j;
        this.violDistId = i;
        this.violGaddr = violGaddr;
        this.violLatitude = violLatitude;
        this.violLocation = violLocation;
        this.violLongitude = violLongitude;
        this.violOffenceId = i2;
        this.violRecordId = i3;
        this.violRegnNo = violRegnNo;
        this.violRemarks = violRemarks;
        this.violStateCd = violStateCd;
        this.violStatus = i4;
        this.violSubmittedAt = violSubmittedAt;
        this.violUpdatedAt = violUpdatedAt;
        this.violUpdatedBy = violUpdatedBy;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getViolCitizenId() {
        return this.violCitizenId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getViolRemarks() {
        return this.violRemarks;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getViolStateCd() {
        return this.violStateCd;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getViolStatus() {
        return this.violStatus;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getViolSubmittedAt() {
        return this.violSubmittedAt;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getViolUpdatedAt() {
        return this.violUpdatedAt;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getViolUpdatedBy() {
        return this.violUpdatedBy;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getViolDistId() {
        return this.violDistId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getViolGaddr() {
        return this.violGaddr;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getViolLatitude() {
        return this.violLatitude;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getViolLocation() {
        return this.violLocation;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getViolLongitude() {
        return this.violLongitude;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getViolOffenceId() {
        return this.violOffenceId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getViolRecordId() {
        return this.violRecordId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getViolRegnNo() {
        return this.violRegnNo;
    }

    public final CitizenViolation copy(long violCitizenId, int violDistId, String violGaddr, String violLatitude, String violLocation, String violLongitude, int violOffenceId, int violRecordId, String violRegnNo, String violRemarks, String violStateCd, int violStatus, String violSubmittedAt, String violUpdatedAt, String violUpdatedBy) {
        Intrinsics.checkNotNullParameter(violGaddr, "violGaddr");
        Intrinsics.checkNotNullParameter(violLatitude, "violLatitude");
        Intrinsics.checkNotNullParameter(violLocation, "violLocation");
        Intrinsics.checkNotNullParameter(violLongitude, "violLongitude");
        Intrinsics.checkNotNullParameter(violRegnNo, "violRegnNo");
        Intrinsics.checkNotNullParameter(violRemarks, "violRemarks");
        Intrinsics.checkNotNullParameter(violStateCd, "violStateCd");
        Intrinsics.checkNotNullParameter(violSubmittedAt, "violSubmittedAt");
        Intrinsics.checkNotNullParameter(violUpdatedAt, "violUpdatedAt");
        Intrinsics.checkNotNullParameter(violUpdatedBy, "violUpdatedBy");
        return new CitizenViolation(violCitizenId, violDistId, violGaddr, violLatitude, violLocation, violLongitude, violOffenceId, violRecordId, violRegnNo, violRemarks, violStateCd, violStatus, violSubmittedAt, violUpdatedAt, violUpdatedBy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CitizenViolation)) {
            return false;
        }
        CitizenViolation citizenViolation = (CitizenViolation) other;
        return this.violCitizenId == citizenViolation.violCitizenId && this.violDistId == citizenViolation.violDistId && Intrinsics.areEqual(this.violGaddr, citizenViolation.violGaddr) && Intrinsics.areEqual(this.violLatitude, citizenViolation.violLatitude) && Intrinsics.areEqual(this.violLocation, citizenViolation.violLocation) && Intrinsics.areEqual(this.violLongitude, citizenViolation.violLongitude) && this.violOffenceId == citizenViolation.violOffenceId && this.violRecordId == citizenViolation.violRecordId && Intrinsics.areEqual(this.violRegnNo, citizenViolation.violRegnNo) && Intrinsics.areEqual(this.violRemarks, citizenViolation.violRemarks) && Intrinsics.areEqual(this.violStateCd, citizenViolation.violStateCd) && this.violStatus == citizenViolation.violStatus && Intrinsics.areEqual(this.violSubmittedAt, citizenViolation.violSubmittedAt) && Intrinsics.areEqual(this.violUpdatedAt, citizenViolation.violUpdatedAt) && Intrinsics.areEqual(this.violUpdatedBy, citizenViolation.violUpdatedBy);
    }

    public final long getViolCitizenId() {
        return this.violCitizenId;
    }

    public final int getViolDistId() {
        return this.violDistId;
    }

    public final String getViolGaddr() {
        return this.violGaddr;
    }

    public final String getViolLatitude() {
        return this.violLatitude;
    }

    public final String getViolLocation() {
        return this.violLocation;
    }

    public final String getViolLongitude() {
        return this.violLongitude;
    }

    public final int getViolOffenceId() {
        return this.violOffenceId;
    }

    public final int getViolRecordId() {
        return this.violRecordId;
    }

    public final String getViolRegnNo() {
        return this.violRegnNo;
    }

    public final String getViolRemarks() {
        return this.violRemarks;
    }

    public final String getViolStateCd() {
        return this.violStateCd;
    }

    public final int getViolStatus() {
        return this.violStatus;
    }

    public final String getViolSubmittedAt() {
        return this.violSubmittedAt;
    }

    public final String getViolUpdatedAt() {
        return this.violUpdatedAt;
    }

    public final String getViolUpdatedBy() {
        return this.violUpdatedBy;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((Long.hashCode(this.violCitizenId) * 31) + Integer.hashCode(this.violDistId)) * 31) + this.violGaddr.hashCode()) * 31) + this.violLatitude.hashCode()) * 31) + this.violLocation.hashCode()) * 31) + this.violLongitude.hashCode()) * 31) + Integer.hashCode(this.violOffenceId)) * 31) + Integer.hashCode(this.violRecordId)) * 31) + this.violRegnNo.hashCode()) * 31) + this.violRemarks.hashCode()) * 31) + this.violStateCd.hashCode()) * 31) + Integer.hashCode(this.violStatus)) * 31) + this.violSubmittedAt.hashCode()) * 31) + this.violUpdatedAt.hashCode()) * 31) + this.violUpdatedBy.hashCode();
    }

    public String toString() {
        return "CitizenViolation(violCitizenId=" + this.violCitizenId + ", violDistId=" + this.violDistId + ", violGaddr=" + this.violGaddr + ", violLatitude=" + this.violLatitude + ", violLocation=" + this.violLocation + ", violLongitude=" + this.violLongitude + ", violOffenceId=" + this.violOffenceId + ", violRecordId=" + this.violRecordId + ", violRegnNo=" + this.violRegnNo + ", violRemarks=" + this.violRemarks + ", violStateCd=" + this.violStateCd + ", violStatus=" + this.violStatus + ", violSubmittedAt=" + this.violSubmittedAt + ", violUpdatedAt=" + this.violUpdatedAt + ", violUpdatedBy=" + this.violUpdatedBy + ')';
    }
}
