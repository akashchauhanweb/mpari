package com.nic.mparivahan.Citizen.Models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b,\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0002\u0010\u0013J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\t\u0010-\u001a\u00020\bHÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0006HÆ\u0003J\t\u00102\u001a\u00020\u0006HÆ\u0003J\u0095\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u0006HÆ\u0001J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u00020\u0003HÖ\u0001J\t\u00108\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0011\u0010\u0010\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0011\u0010\u0011\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0011\u0010\u0012\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018¨\u00069"}, d2 = {"Lcom/nic/mparivahan/Citizen/Models/MparCitizenAccident;", "", "accdCitizenId", "", "accdDistId", "accdGaddr", "", "accdLatitude", "", "accdLocation", "accdLongitude", "accdRecordId", "accdRegnNo", "accdRemarks", "accdStateCd", "accdStatus", "accdSubmittedAt", "accdUpdatedAt", "accdUpdatedBy", "(IILjava/lang/String;DLjava/lang/String;DILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccdCitizenId", "()I", "getAccdDistId", "getAccdGaddr", "()Ljava/lang/String;", "getAccdLatitude", "()D", "getAccdLocation", "getAccdLongitude", "getAccdRecordId", "getAccdRegnNo", "getAccdRemarks", "getAccdStateCd", "getAccdStatus", "getAccdSubmittedAt", "getAccdUpdatedAt", "getAccdUpdatedBy", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class MparCitizenAccident {
    private final int accdCitizenId;
    private final int accdDistId;
    private final String accdGaddr;
    private final double accdLatitude;
    private final String accdLocation;
    private final double accdLongitude;
    private final int accdRecordId;
    private final String accdRegnNo;
    private final String accdRemarks;
    private final String accdStateCd;
    private final int accdStatus;
    private final String accdSubmittedAt;
    private final String accdUpdatedAt;
    private final String accdUpdatedBy;

    public MparCitizenAccident(int i, int i2, String accdGaddr, double d, String accdLocation, double d2, int i3, String accdRegnNo, String accdRemarks, String accdStateCd, int i4, String accdSubmittedAt, String accdUpdatedAt, String accdUpdatedBy) {
        Intrinsics.checkNotNullParameter(accdGaddr, "accdGaddr");
        Intrinsics.checkNotNullParameter(accdLocation, "accdLocation");
        Intrinsics.checkNotNullParameter(accdRegnNo, "accdRegnNo");
        Intrinsics.checkNotNullParameter(accdRemarks, "accdRemarks");
        Intrinsics.checkNotNullParameter(accdStateCd, "accdStateCd");
        Intrinsics.checkNotNullParameter(accdSubmittedAt, "accdSubmittedAt");
        Intrinsics.checkNotNullParameter(accdUpdatedAt, "accdUpdatedAt");
        Intrinsics.checkNotNullParameter(accdUpdatedBy, "accdUpdatedBy");
        this.accdCitizenId = i;
        this.accdDistId = i2;
        this.accdGaddr = accdGaddr;
        this.accdLatitude = d;
        this.accdLocation = accdLocation;
        this.accdLongitude = d2;
        this.accdRecordId = i3;
        this.accdRegnNo = accdRegnNo;
        this.accdRemarks = accdRemarks;
        this.accdStateCd = accdStateCd;
        this.accdStatus = i4;
        this.accdSubmittedAt = accdSubmittedAt;
        this.accdUpdatedAt = accdUpdatedAt;
        this.accdUpdatedBy = accdUpdatedBy;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAccdCitizenId() {
        return this.accdCitizenId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getAccdStateCd() {
        return this.accdStateCd;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getAccdStatus() {
        return this.accdStatus;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getAccdSubmittedAt() {
        return this.accdSubmittedAt;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getAccdUpdatedAt() {
        return this.accdUpdatedAt;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getAccdUpdatedBy() {
        return this.accdUpdatedBy;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAccdDistId() {
        return this.accdDistId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAccdGaddr() {
        return this.accdGaddr;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getAccdLatitude() {
        return this.accdLatitude;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAccdLocation() {
        return this.accdLocation;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getAccdLongitude() {
        return this.accdLongitude;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getAccdRecordId() {
        return this.accdRecordId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getAccdRegnNo() {
        return this.accdRegnNo;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getAccdRemarks() {
        return this.accdRemarks;
    }

    public final MparCitizenAccident copy(int accdCitizenId, int accdDistId, String accdGaddr, double accdLatitude, String accdLocation, double accdLongitude, int accdRecordId, String accdRegnNo, String accdRemarks, String accdStateCd, int accdStatus, String accdSubmittedAt, String accdUpdatedAt, String accdUpdatedBy) {
        Intrinsics.checkNotNullParameter(accdGaddr, "accdGaddr");
        Intrinsics.checkNotNullParameter(accdLocation, "accdLocation");
        Intrinsics.checkNotNullParameter(accdRegnNo, "accdRegnNo");
        Intrinsics.checkNotNullParameter(accdRemarks, "accdRemarks");
        Intrinsics.checkNotNullParameter(accdStateCd, "accdStateCd");
        Intrinsics.checkNotNullParameter(accdSubmittedAt, "accdSubmittedAt");
        Intrinsics.checkNotNullParameter(accdUpdatedAt, "accdUpdatedAt");
        Intrinsics.checkNotNullParameter(accdUpdatedBy, "accdUpdatedBy");
        return new MparCitizenAccident(accdCitizenId, accdDistId, accdGaddr, accdLatitude, accdLocation, accdLongitude, accdRecordId, accdRegnNo, accdRemarks, accdStateCd, accdStatus, accdSubmittedAt, accdUpdatedAt, accdUpdatedBy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MparCitizenAccident)) {
            return false;
        }
        MparCitizenAccident mparCitizenAccident = (MparCitizenAccident) other;
        return this.accdCitizenId == mparCitizenAccident.accdCitizenId && this.accdDistId == mparCitizenAccident.accdDistId && Intrinsics.areEqual(this.accdGaddr, mparCitizenAccident.accdGaddr) && Double.compare(this.accdLatitude, mparCitizenAccident.accdLatitude) == 0 && Intrinsics.areEqual(this.accdLocation, mparCitizenAccident.accdLocation) && Double.compare(this.accdLongitude, mparCitizenAccident.accdLongitude) == 0 && this.accdRecordId == mparCitizenAccident.accdRecordId && Intrinsics.areEqual(this.accdRegnNo, mparCitizenAccident.accdRegnNo) && Intrinsics.areEqual(this.accdRemarks, mparCitizenAccident.accdRemarks) && Intrinsics.areEqual(this.accdStateCd, mparCitizenAccident.accdStateCd) && this.accdStatus == mparCitizenAccident.accdStatus && Intrinsics.areEqual(this.accdSubmittedAt, mparCitizenAccident.accdSubmittedAt) && Intrinsics.areEqual(this.accdUpdatedAt, mparCitizenAccident.accdUpdatedAt) && Intrinsics.areEqual(this.accdUpdatedBy, mparCitizenAccident.accdUpdatedBy);
    }

    public final int getAccdCitizenId() {
        return this.accdCitizenId;
    }

    public final int getAccdDistId() {
        return this.accdDistId;
    }

    public final String getAccdGaddr() {
        return this.accdGaddr;
    }

    public final double getAccdLatitude() {
        return this.accdLatitude;
    }

    public final String getAccdLocation() {
        return this.accdLocation;
    }

    public final double getAccdLongitude() {
        return this.accdLongitude;
    }

    public final int getAccdRecordId() {
        return this.accdRecordId;
    }

    public final String getAccdRegnNo() {
        return this.accdRegnNo;
    }

    public final String getAccdRemarks() {
        return this.accdRemarks;
    }

    public final String getAccdStateCd() {
        return this.accdStateCd;
    }

    public final int getAccdStatus() {
        return this.accdStatus;
    }

    public final String getAccdSubmittedAt() {
        return this.accdSubmittedAt;
    }

    public final String getAccdUpdatedAt() {
        return this.accdUpdatedAt;
    }

    public final String getAccdUpdatedBy() {
        return this.accdUpdatedBy;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((Integer.hashCode(this.accdCitizenId) * 31) + Integer.hashCode(this.accdDistId)) * 31) + this.accdGaddr.hashCode()) * 31) + Double.hashCode(this.accdLatitude)) * 31) + this.accdLocation.hashCode()) * 31) + Double.hashCode(this.accdLongitude)) * 31) + Integer.hashCode(this.accdRecordId)) * 31) + this.accdRegnNo.hashCode()) * 31) + this.accdRemarks.hashCode()) * 31) + this.accdStateCd.hashCode()) * 31) + Integer.hashCode(this.accdStatus)) * 31) + this.accdSubmittedAt.hashCode()) * 31) + this.accdUpdatedAt.hashCode()) * 31) + this.accdUpdatedBy.hashCode();
    }

    public String toString() {
        return "MparCitizenAccident(accdCitizenId=" + this.accdCitizenId + ", accdDistId=" + this.accdDistId + ", accdGaddr=" + this.accdGaddr + ", accdLatitude=" + this.accdLatitude + ", accdLocation=" + this.accdLocation + ", accdLongitude=" + this.accdLongitude + ", accdRecordId=" + this.accdRecordId + ", accdRegnNo=" + this.accdRegnNo + ", accdRemarks=" + this.accdRemarks + ", accdStateCd=" + this.accdStateCd + ", accdStatus=" + this.accdStatus + ", accdSubmittedAt=" + this.accdSubmittedAt + ", accdUpdatedAt=" + this.accdUpdatedAt + ", accdUpdatedBy=" + this.accdUpdatedBy + ')';
    }
}
