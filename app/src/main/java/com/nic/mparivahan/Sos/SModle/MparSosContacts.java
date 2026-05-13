package com.nic.mparivahan.Sos.SModle;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JY\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006%"}, d2 = {"Lcom/nic/mparivahan/Sos/SModle/MparSosContacts;", "", "soscCreatedAt", "", "soscCtzId", "", "soscMobile", "soscName", "soscRecordId", "soscRelation", "soscStatus", "soscUpdatedAt", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;)V", "getSoscCreatedAt", "()Ljava/lang/String;", "getSoscCtzId", "()I", "getSoscMobile", "getSoscName", "getSoscRecordId", "getSoscRelation", "getSoscStatus", "getSoscUpdatedAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class MparSosContacts {
    private final String soscCreatedAt;
    private final int soscCtzId;
    private final String soscMobile;
    private final String soscName;
    private final int soscRecordId;
    private final int soscRelation;
    private final int soscStatus;
    private final String soscUpdatedAt;

    public MparSosContacts(String soscCreatedAt, int i, String soscMobile, String soscName, int i2, int i3, int i4, String soscUpdatedAt) {
        Intrinsics.checkNotNullParameter(soscCreatedAt, "soscCreatedAt");
        Intrinsics.checkNotNullParameter(soscMobile, "soscMobile");
        Intrinsics.checkNotNullParameter(soscName, "soscName");
        Intrinsics.checkNotNullParameter(soscUpdatedAt, "soscUpdatedAt");
        this.soscCreatedAt = soscCreatedAt;
        this.soscCtzId = i;
        this.soscMobile = soscMobile;
        this.soscName = soscName;
        this.soscRecordId = i2;
        this.soscRelation = i3;
        this.soscStatus = i4;
        this.soscUpdatedAt = soscUpdatedAt;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSoscCreatedAt() {
        return this.soscCreatedAt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSoscCtzId() {
        return this.soscCtzId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSoscMobile() {
        return this.soscMobile;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSoscName() {
        return this.soscName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getSoscRecordId() {
        return this.soscRecordId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getSoscRelation() {
        return this.soscRelation;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getSoscStatus() {
        return this.soscStatus;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSoscUpdatedAt() {
        return this.soscUpdatedAt;
    }

    public final MparSosContacts copy(String soscCreatedAt, int soscCtzId, String soscMobile, String soscName, int soscRecordId, int soscRelation, int soscStatus, String soscUpdatedAt) {
        Intrinsics.checkNotNullParameter(soscCreatedAt, "soscCreatedAt");
        Intrinsics.checkNotNullParameter(soscMobile, "soscMobile");
        Intrinsics.checkNotNullParameter(soscName, "soscName");
        Intrinsics.checkNotNullParameter(soscUpdatedAt, "soscUpdatedAt");
        return new MparSosContacts(soscCreatedAt, soscCtzId, soscMobile, soscName, soscRecordId, soscRelation, soscStatus, soscUpdatedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MparSosContacts)) {
            return false;
        }
        MparSosContacts mparSosContacts = (MparSosContacts) other;
        return Intrinsics.areEqual(this.soscCreatedAt, mparSosContacts.soscCreatedAt) && this.soscCtzId == mparSosContacts.soscCtzId && Intrinsics.areEqual(this.soscMobile, mparSosContacts.soscMobile) && Intrinsics.areEqual(this.soscName, mparSosContacts.soscName) && this.soscRecordId == mparSosContacts.soscRecordId && this.soscRelation == mparSosContacts.soscRelation && this.soscStatus == mparSosContacts.soscStatus && Intrinsics.areEqual(this.soscUpdatedAt, mparSosContacts.soscUpdatedAt);
    }

    public final String getSoscCreatedAt() {
        return this.soscCreatedAt;
    }

    public final int getSoscCtzId() {
        return this.soscCtzId;
    }

    public final String getSoscMobile() {
        return this.soscMobile;
    }

    public final String getSoscName() {
        return this.soscName;
    }

    public final int getSoscRecordId() {
        return this.soscRecordId;
    }

    public final int getSoscRelation() {
        return this.soscRelation;
    }

    public final int getSoscStatus() {
        return this.soscStatus;
    }

    public final String getSoscUpdatedAt() {
        return this.soscUpdatedAt;
    }

    public int hashCode() {
        return (((((((((((((this.soscCreatedAt.hashCode() * 31) + Integer.hashCode(this.soscCtzId)) * 31) + this.soscMobile.hashCode()) * 31) + this.soscName.hashCode()) * 31) + Integer.hashCode(this.soscRecordId)) * 31) + Integer.hashCode(this.soscRelation)) * 31) + Integer.hashCode(this.soscStatus)) * 31) + this.soscUpdatedAt.hashCode();
    }

    public String toString() {
        return "MparSosContacts(soscCreatedAt=" + this.soscCreatedAt + ", soscCtzId=" + this.soscCtzId + ", soscMobile=" + this.soscMobile + ", soscName=" + this.soscName + ", soscRecordId=" + this.soscRecordId + ", soscRelation=" + this.soscRelation + ", soscStatus=" + this.soscStatus + ", soscUpdatedAt=" + this.soscUpdatedAt + ')';
    }
}
