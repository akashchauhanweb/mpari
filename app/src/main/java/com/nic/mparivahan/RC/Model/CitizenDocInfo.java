package com.nic.mparivahan.RC.Model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\bHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/nic/mparivahan/RC/Model/CitizenDocInfo;", "", "docCtzId", "", "docId", "docNumber", "", "docStatus", "", "docType", "(JJLjava/lang/String;ILjava/lang/String;)V", "getDocCtzId", "()J", "getDocId", "getDocNumber", "()Ljava/lang/String;", "getDocStatus", "()I", "getDocType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CitizenDocInfo {
    private final long docCtzId;
    private final long docId;
    private final String docNumber;
    private final int docStatus;
    private final String docType;

    public CitizenDocInfo(long j, long j2, String docNumber, int i, String docType) {
        Intrinsics.checkNotNullParameter(docNumber, "docNumber");
        Intrinsics.checkNotNullParameter(docType, "docType");
        this.docCtzId = j;
        this.docId = j2;
        this.docNumber = docNumber;
        this.docStatus = i;
        this.docType = docType;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getDocCtzId() {
        return this.docCtzId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getDocId() {
        return this.docId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDocNumber() {
        return this.docNumber;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDocStatus() {
        return this.docStatus;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDocType() {
        return this.docType;
    }

    public final CitizenDocInfo copy(long docCtzId, long docId, String docNumber, int docStatus, String docType) {
        Intrinsics.checkNotNullParameter(docNumber, "docNumber");
        Intrinsics.checkNotNullParameter(docType, "docType");
        return new CitizenDocInfo(docCtzId, docId, docNumber, docStatus, docType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CitizenDocInfo)) {
            return false;
        }
        CitizenDocInfo citizenDocInfo = (CitizenDocInfo) other;
        return this.docCtzId == citizenDocInfo.docCtzId && this.docId == citizenDocInfo.docId && Intrinsics.areEqual(this.docNumber, citizenDocInfo.docNumber) && this.docStatus == citizenDocInfo.docStatus && Intrinsics.areEqual(this.docType, citizenDocInfo.docType);
    }

    public final long getDocCtzId() {
        return this.docCtzId;
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

    public int hashCode() {
        return (((((((Long.hashCode(this.docCtzId) * 31) + Long.hashCode(this.docId)) * 31) + this.docNumber.hashCode()) * 31) + Integer.hashCode(this.docStatus)) * 31) + this.docType.hashCode();
    }

    public String toString() {
        return "CitizenDocInfo(docCtzId=" + this.docCtzId + ", docId=" + this.docId + ", docNumber=" + this.docNumber + ", docStatus=" + this.docStatus + ", docType=" + this.docType + ')';
    }
}
