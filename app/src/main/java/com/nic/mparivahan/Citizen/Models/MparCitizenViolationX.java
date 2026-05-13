package com.nic.mparivahan.Citizen.Models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b0\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0001¢\u0006\u0002\u0010\u0014J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\t\u0010.\u001a\u00020\u0001HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0006HÆ\u0003J\t\u00101\u001a\u00020\bHÆ\u0003J\t\u00102\u001a\u00020\u0006HÆ\u0003J\t\u00103\u001a\u00020\bHÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0006HÆ\u0003J\u009f\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0001HÆ\u0001J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020\u0003HÖ\u0001J\t\u0010<\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0011\u0010\u0011\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0011\u0010\u0012\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0011\u0010\u0013\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006="}, d2 = {"Lcom/nic/mparivahan/Citizen/Models/MparCitizenViolationX;", "", "violCitizenId", "", "violDistId", "violGaddr", "", "violLatitude", "", "violLocation", "violLongitude", "violOffenceId", "violRecordId", "violRegnNo", "violRemarks", "violStateCd", "violStatus", "violSubmittedAt", "violUpdatedAt", "violUpdatedBy", "(IILjava/lang/String;DLjava/lang/String;DIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "getViolCitizenId", "()I", "getViolDistId", "getViolGaddr", "()Ljava/lang/String;", "getViolLatitude", "()D", "getViolLocation", "getViolLongitude", "getViolOffenceId", "getViolRecordId", "getViolRegnNo", "getViolRemarks", "getViolStateCd", "getViolStatus", "getViolSubmittedAt", "getViolUpdatedAt", "getViolUpdatedBy", "()Ljava/lang/Object;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class MparCitizenViolationX {
    private final int violCitizenId;
    private final int violDistId;
    private final String violGaddr;
    private final double violLatitude;
    private final String violLocation;
    private final double violLongitude;
    private final int violOffenceId;
    private final int violRecordId;
    private final String violRegnNo;
    private final String violRemarks;
    private final String violStateCd;
    private final int violStatus;
    private final String violSubmittedAt;
    private final String violUpdatedAt;
    private final Object violUpdatedBy;

    public MparCitizenViolationX(int i, int i2, String violGaddr, double d, String violLocation, double d2, int i3, int i4, String violRegnNo, String violRemarks, String violStateCd, int i5, String violSubmittedAt, String violUpdatedAt, Object violUpdatedBy) {
        Intrinsics.checkNotNullParameter(violGaddr, "violGaddr");
        Intrinsics.checkNotNullParameter(violLocation, "violLocation");
        Intrinsics.checkNotNullParameter(violRegnNo, "violRegnNo");
        Intrinsics.checkNotNullParameter(violRemarks, "violRemarks");
        Intrinsics.checkNotNullParameter(violStateCd, "violStateCd");
        Intrinsics.checkNotNullParameter(violSubmittedAt, "violSubmittedAt");
        Intrinsics.checkNotNullParameter(violUpdatedAt, "violUpdatedAt");
        Intrinsics.checkNotNullParameter(violUpdatedBy, "violUpdatedBy");
        this.violCitizenId = i;
        this.violDistId = i2;
        this.violGaddr = violGaddr;
        this.violLatitude = d;
        this.violLocation = violLocation;
        this.violLongitude = d2;
        this.violOffenceId = i3;
        this.violRecordId = i4;
        this.violRegnNo = violRegnNo;
        this.violRemarks = violRemarks;
        this.violStateCd = violStateCd;
        this.violStatus = i5;
        this.violSubmittedAt = violSubmittedAt;
        this.violUpdatedAt = violUpdatedAt;
        this.violUpdatedBy = violUpdatedBy;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getViolCitizenId() {
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
    public final Object getViolUpdatedBy() {
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
    public final double getViolLatitude() {
        return this.violLatitude;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getViolLocation() {
        return this.violLocation;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getViolLongitude() {
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

    public final MparCitizenViolationX copy(int violCitizenId, int violDistId, String violGaddr, double violLatitude, String violLocation, double violLongitude, int violOffenceId, int violRecordId, String violRegnNo, String violRemarks, String violStateCd, int violStatus, String violSubmittedAt, String violUpdatedAt, Object violUpdatedBy) {
        Intrinsics.checkNotNullParameter(violGaddr, "violGaddr");
        Intrinsics.checkNotNullParameter(violLocation, "violLocation");
        Intrinsics.checkNotNullParameter(violRegnNo, "violRegnNo");
        Intrinsics.checkNotNullParameter(violRemarks, "violRemarks");
        Intrinsics.checkNotNullParameter(violStateCd, "violStateCd");
        Intrinsics.checkNotNullParameter(violSubmittedAt, "violSubmittedAt");
        Intrinsics.checkNotNullParameter(violUpdatedAt, "violUpdatedAt");
        Intrinsics.checkNotNullParameter(violUpdatedBy, "violUpdatedBy");
        return new MparCitizenViolationX(violCitizenId, violDistId, violGaddr, violLatitude, violLocation, violLongitude, violOffenceId, violRecordId, violRegnNo, violRemarks, violStateCd, violStatus, violSubmittedAt, violUpdatedAt, violUpdatedBy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MparCitizenViolationX)) {
            return false;
        }
        MparCitizenViolationX mparCitizenViolationX = (MparCitizenViolationX) other;
        return this.violCitizenId == mparCitizenViolationX.violCitizenId && this.violDistId == mparCitizenViolationX.violDistId && Intrinsics.areEqual(this.violGaddr, mparCitizenViolationX.violGaddr) && Double.compare(this.violLatitude, mparCitizenViolationX.violLatitude) == 0 && Intrinsics.areEqual(this.violLocation, mparCitizenViolationX.violLocation) && Double.compare(this.violLongitude, mparCitizenViolationX.violLongitude) == 0 && this.violOffenceId == mparCitizenViolationX.violOffenceId && this.violRecordId == mparCitizenViolationX.violRecordId && Intrinsics.areEqual(this.violRegnNo, mparCitizenViolationX.violRegnNo) && Intrinsics.areEqual(this.violRemarks, mparCitizenViolationX.violRemarks) && Intrinsics.areEqual(this.violStateCd, mparCitizenViolationX.violStateCd) && this.violStatus == mparCitizenViolationX.violStatus && Intrinsics.areEqual(this.violSubmittedAt, mparCitizenViolationX.violSubmittedAt) && Intrinsics.areEqual(this.violUpdatedAt, mparCitizenViolationX.violUpdatedAt) && Intrinsics.areEqual(this.violUpdatedBy, mparCitizenViolationX.violUpdatedBy);
    }

    public final int getViolCitizenId() {
        return this.violCitizenId;
    }

    public final int getViolDistId() {
        return this.violDistId;
    }

    public final String getViolGaddr() {
        return this.violGaddr;
    }

    public final double getViolLatitude() {
        return this.violLatitude;
    }

    public final String getViolLocation() {
        return this.violLocation;
    }

    public final double getViolLongitude() {
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

    public final Object getViolUpdatedBy() {
        return this.violUpdatedBy;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((Integer.hashCode(this.violCitizenId) * 31) + Integer.hashCode(this.violDistId)) * 31) + this.violGaddr.hashCode()) * 31) + Double.hashCode(this.violLatitude)) * 31) + this.violLocation.hashCode()) * 31) + Double.hashCode(this.violLongitude)) * 31) + Integer.hashCode(this.violOffenceId)) * 31) + Integer.hashCode(this.violRecordId)) * 31) + this.violRegnNo.hashCode()) * 31) + this.violRemarks.hashCode()) * 31) + this.violStateCd.hashCode()) * 31) + Integer.hashCode(this.violStatus)) * 31) + this.violSubmittedAt.hashCode()) * 31) + this.violUpdatedAt.hashCode()) * 31) + this.violUpdatedBy.hashCode();
    }

    public String toString() {
        return "MparCitizenViolationX(violCitizenId=" + this.violCitizenId + ", violDistId=" + this.violDistId + ", violGaddr=" + this.violGaddr + ", violLatitude=" + this.violLatitude + ", violLocation=" + this.violLocation + ", violLongitude=" + this.violLongitude + ", violOffenceId=" + this.violOffenceId + ", violRecordId=" + this.violRecordId + ", violRegnNo=" + this.violRegnNo + ", violRemarks=" + this.violRemarks + ", violStateCd=" + this.violStateCd + ", violStatus=" + this.violStatus + ", violSubmittedAt=" + this.violSubmittedAt + ", violUpdatedAt=" + this.violUpdatedAt + ", violUpdatedBy=" + this.violUpdatedBy + ')';
    }
}
