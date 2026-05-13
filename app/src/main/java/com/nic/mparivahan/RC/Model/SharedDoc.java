package com.nic.mparivahan.RC.Model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u0001¢\u0006\u0002\u0010\u0011J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\rHÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\t\u0010%\u001a\u00020\u0001HÆ\u0003J\t\u0010&\u001a\u00020\u0001HÆ\u0003J\t\u0010'\u001a\u00020\u0001HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003J\t\u0010,\u001a\u00020\nHÆ\u0003J\t\u0010-\u001a\u00020\rHÆ\u0003J\u0081\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u0001HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\rHÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0011\u0010\u0010\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015¨\u00064"}, d2 = {"Lcom/nic/mparivahan/RC/Model/SharedDoc;", "", "shrdCreatedAt", "", "shrdDelatedAt", "shrdDeletedBy", "shrdDocNumber", "shrdDocType", "shrdExpireOn", "shrdFromCtz", "", "shrdId", "shrdNdays", "", "shrdStatus", "shrdToCtz", "shrdUpdatedAt", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIIJLjava/lang/Object;)V", "getShrdCreatedAt", "()Ljava/lang/String;", "getShrdDelatedAt", "()Ljava/lang/Object;", "getShrdDeletedBy", "getShrdDocNumber", "getShrdDocType", "getShrdExpireOn", "getShrdFromCtz", "()J", "getShrdId", "getShrdNdays", "()I", "getShrdStatus", "getShrdToCtz", "getShrdUpdatedAt", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SharedDoc {
    private final String shrdCreatedAt;
    private final Object shrdDelatedAt;
    private final Object shrdDeletedBy;
    private final String shrdDocNumber;
    private final String shrdDocType;
    private final String shrdExpireOn;
    private final long shrdFromCtz;
    private final long shrdId;
    private final int shrdNdays;
    private final int shrdStatus;
    private final long shrdToCtz;
    private final Object shrdUpdatedAt;

    public SharedDoc(String shrdCreatedAt, Object shrdDelatedAt, Object shrdDeletedBy, String shrdDocNumber, String shrdDocType, String shrdExpireOn, long j, long j2, int i, int i2, long j3, Object shrdUpdatedAt) {
        Intrinsics.checkNotNullParameter(shrdCreatedAt, "shrdCreatedAt");
        Intrinsics.checkNotNullParameter(shrdDelatedAt, "shrdDelatedAt");
        Intrinsics.checkNotNullParameter(shrdDeletedBy, "shrdDeletedBy");
        Intrinsics.checkNotNullParameter(shrdDocNumber, "shrdDocNumber");
        Intrinsics.checkNotNullParameter(shrdDocType, "shrdDocType");
        Intrinsics.checkNotNullParameter(shrdExpireOn, "shrdExpireOn");
        Intrinsics.checkNotNullParameter(shrdUpdatedAt, "shrdUpdatedAt");
        this.shrdCreatedAt = shrdCreatedAt;
        this.shrdDelatedAt = shrdDelatedAt;
        this.shrdDeletedBy = shrdDeletedBy;
        this.shrdDocNumber = shrdDocNumber;
        this.shrdDocType = shrdDocType;
        this.shrdExpireOn = shrdExpireOn;
        this.shrdFromCtz = j;
        this.shrdId = j2;
        this.shrdNdays = i;
        this.shrdStatus = i2;
        this.shrdToCtz = j3;
        this.shrdUpdatedAt = shrdUpdatedAt;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getShrdCreatedAt() {
        return this.shrdCreatedAt;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getShrdStatus() {
        return this.shrdStatus;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getShrdToCtz() {
        return this.shrdToCtz;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Object getShrdUpdatedAt() {
        return this.shrdUpdatedAt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getShrdDelatedAt() {
        return this.shrdDelatedAt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Object getShrdDeletedBy() {
        return this.shrdDeletedBy;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getShrdDocNumber() {
        return this.shrdDocNumber;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getShrdDocType() {
        return this.shrdDocType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getShrdExpireOn() {
        return this.shrdExpireOn;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getShrdFromCtz() {
        return this.shrdFromCtz;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getShrdId() {
        return this.shrdId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getShrdNdays() {
        return this.shrdNdays;
    }

    public final SharedDoc copy(String shrdCreatedAt, Object shrdDelatedAt, Object shrdDeletedBy, String shrdDocNumber, String shrdDocType, String shrdExpireOn, long shrdFromCtz, long shrdId, int shrdNdays, int shrdStatus, long shrdToCtz, Object shrdUpdatedAt) {
        Intrinsics.checkNotNullParameter(shrdCreatedAt, "shrdCreatedAt");
        Intrinsics.checkNotNullParameter(shrdDelatedAt, "shrdDelatedAt");
        Intrinsics.checkNotNullParameter(shrdDeletedBy, "shrdDeletedBy");
        Intrinsics.checkNotNullParameter(shrdDocNumber, "shrdDocNumber");
        Intrinsics.checkNotNullParameter(shrdDocType, "shrdDocType");
        Intrinsics.checkNotNullParameter(shrdExpireOn, "shrdExpireOn");
        Intrinsics.checkNotNullParameter(shrdUpdatedAt, "shrdUpdatedAt");
        return new SharedDoc(shrdCreatedAt, shrdDelatedAt, shrdDeletedBy, shrdDocNumber, shrdDocType, shrdExpireOn, shrdFromCtz, shrdId, shrdNdays, shrdStatus, shrdToCtz, shrdUpdatedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SharedDoc)) {
            return false;
        }
        SharedDoc sharedDoc = (SharedDoc) other;
        return Intrinsics.areEqual(this.shrdCreatedAt, sharedDoc.shrdCreatedAt) && Intrinsics.areEqual(this.shrdDelatedAt, sharedDoc.shrdDelatedAt) && Intrinsics.areEqual(this.shrdDeletedBy, sharedDoc.shrdDeletedBy) && Intrinsics.areEqual(this.shrdDocNumber, sharedDoc.shrdDocNumber) && Intrinsics.areEqual(this.shrdDocType, sharedDoc.shrdDocType) && Intrinsics.areEqual(this.shrdExpireOn, sharedDoc.shrdExpireOn) && this.shrdFromCtz == sharedDoc.shrdFromCtz && this.shrdId == sharedDoc.shrdId && this.shrdNdays == sharedDoc.shrdNdays && this.shrdStatus == sharedDoc.shrdStatus && this.shrdToCtz == sharedDoc.shrdToCtz && Intrinsics.areEqual(this.shrdUpdatedAt, sharedDoc.shrdUpdatedAt);
    }

    public final String getShrdCreatedAt() {
        return this.shrdCreatedAt;
    }

    public final Object getShrdDelatedAt() {
        return this.shrdDelatedAt;
    }

    public final Object getShrdDeletedBy() {
        return this.shrdDeletedBy;
    }

    public final String getShrdDocNumber() {
        return this.shrdDocNumber;
    }

    public final String getShrdDocType() {
        return this.shrdDocType;
    }

    public final String getShrdExpireOn() {
        return this.shrdExpireOn;
    }

    public final long getShrdFromCtz() {
        return this.shrdFromCtz;
    }

    public final long getShrdId() {
        return this.shrdId;
    }

    public final int getShrdNdays() {
        return this.shrdNdays;
    }

    public final int getShrdStatus() {
        return this.shrdStatus;
    }

    public final long getShrdToCtz() {
        return this.shrdToCtz;
    }

    public final Object getShrdUpdatedAt() {
        return this.shrdUpdatedAt;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.shrdCreatedAt.hashCode() * 31) + this.shrdDelatedAt.hashCode()) * 31) + this.shrdDeletedBy.hashCode()) * 31) + this.shrdDocNumber.hashCode()) * 31) + this.shrdDocType.hashCode()) * 31) + this.shrdExpireOn.hashCode()) * 31) + Long.hashCode(this.shrdFromCtz)) * 31) + Long.hashCode(this.shrdId)) * 31) + Integer.hashCode(this.shrdNdays)) * 31) + Integer.hashCode(this.shrdStatus)) * 31) + Long.hashCode(this.shrdToCtz)) * 31) + this.shrdUpdatedAt.hashCode();
    }

    public String toString() {
        return "SharedDoc(shrdCreatedAt=" + this.shrdCreatedAt + ", shrdDelatedAt=" + this.shrdDelatedAt + ", shrdDeletedBy=" + this.shrdDeletedBy + ", shrdDocNumber=" + this.shrdDocNumber + ", shrdDocType=" + this.shrdDocType + ", shrdExpireOn=" + this.shrdExpireOn + ", shrdFromCtz=" + this.shrdFromCtz + ", shrdId=" + this.shrdId + ", shrdNdays=" + this.shrdNdays + ", shrdStatus=" + this.shrdStatus + ", shrdToCtz=" + this.shrdToCtz + ", shrdUpdatedAt=" + this.shrdUpdatedAt + ')';
    }
}
