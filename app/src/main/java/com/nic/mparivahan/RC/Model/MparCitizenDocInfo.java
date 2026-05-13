package com.nic.mparivahan.RC.Model;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J_\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\tHÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006("}, d2 = {"Lcom/nic/mparivahan/RC/Model/MparCitizenDocInfo;", "Ljava/io/Serializable;", "docCreatedAt", "", "docCtzId", "", "docId", "docNumber", "docStatus", "", "docType", "docDob", "docUpdatedAt", "(Ljava/lang/String;JJLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDocCreatedAt", "()Ljava/lang/String;", "getDocCtzId", "()J", "getDocDob", "getDocId", "getDocNumber", "getDocStatus", "()I", "getDocType", "getDocUpdatedAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class MparCitizenDocInfo implements Serializable {
    private final String docCreatedAt;
    private final long docCtzId;
    private final String docDob;
    private final long docId;
    private final String docNumber;
    private final int docStatus;
    private final String docType;
    private final String docUpdatedAt;

    public MparCitizenDocInfo(String str, long j, long j2, String docNumber, int i, String docType, String str2, String str3) {
        Intrinsics.checkNotNullParameter(docNumber, "docNumber");
        Intrinsics.checkNotNullParameter(docType, "docType");
        this.docCreatedAt = str;
        this.docCtzId = j;
        this.docId = j2;
        this.docNumber = docNumber;
        this.docStatus = i;
        this.docType = docType;
        this.docDob = str2;
        this.docUpdatedAt = str3;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDocCreatedAt() {
        return this.docCreatedAt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getDocCtzId() {
        return this.docCtzId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getDocId() {
        return this.docId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDocNumber() {
        return this.docNumber;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getDocStatus() {
        return this.docStatus;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDocType() {
        return this.docType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDocDob() {
        return this.docDob;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDocUpdatedAt() {
        return this.docUpdatedAt;
    }

    public final MparCitizenDocInfo copy(String docCreatedAt, long docCtzId, long docId, String docNumber, int docStatus, String docType, String docDob, String docUpdatedAt) {
        Intrinsics.checkNotNullParameter(docNumber, "docNumber");
        Intrinsics.checkNotNullParameter(docType, "docType");
        return new MparCitizenDocInfo(docCreatedAt, docCtzId, docId, docNumber, docStatus, docType, docDob, docUpdatedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MparCitizenDocInfo)) {
            return false;
        }
        MparCitizenDocInfo mparCitizenDocInfo = (MparCitizenDocInfo) other;
        return Intrinsics.areEqual(this.docCreatedAt, mparCitizenDocInfo.docCreatedAt) && this.docCtzId == mparCitizenDocInfo.docCtzId && this.docId == mparCitizenDocInfo.docId && Intrinsics.areEqual(this.docNumber, mparCitizenDocInfo.docNumber) && this.docStatus == mparCitizenDocInfo.docStatus && Intrinsics.areEqual(this.docType, mparCitizenDocInfo.docType) && Intrinsics.areEqual(this.docDob, mparCitizenDocInfo.docDob) && Intrinsics.areEqual(this.docUpdatedAt, mparCitizenDocInfo.docUpdatedAt);
    }

    public final String getDocCreatedAt() {
        return this.docCreatedAt;
    }

    public final long getDocCtzId() {
        return this.docCtzId;
    }

    public final String getDocDob() {
        return this.docDob;
    }

    public final long getDocId() {
        return this.docId;
    }

    public final String getDocNumber() {
        return this.docNumber;
    }

    public final int getDocStatus() {
        return this.docStatus;
    }

    public final String getDocType() {
        return this.docType;
    }

    public final String getDocUpdatedAt() {
        return this.docUpdatedAt;
    }

    public int hashCode() {
        String str = this.docCreatedAt;
        int iHashCode = (((((((((((str == null ? 0 : str.hashCode()) * 31) + Long.hashCode(this.docCtzId)) * 31) + Long.hashCode(this.docId)) * 31) + this.docNumber.hashCode()) * 31) + Integer.hashCode(this.docStatus)) * 31) + this.docType.hashCode()) * 31;
        String str2 = this.docDob;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.docUpdatedAt;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "MparCitizenDocInfo(docCreatedAt=" + this.docCreatedAt + ", docCtzId=" + this.docCtzId + ", docId=" + this.docId + ", docNumber=" + this.docNumber + ", docStatus=" + this.docStatus + ", docType=" + this.docType + ", docDob=" + this.docDob + ", docUpdatedAt=" + this.docUpdatedAt + ')';
    }
}
