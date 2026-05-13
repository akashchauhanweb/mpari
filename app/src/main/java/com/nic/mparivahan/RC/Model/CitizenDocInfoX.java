package com.nic.mparivahan.RC.Model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J>\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/nic/mparivahan/RC/Model/CitizenDocInfoX;", "", "docCtzId", "", "docId", "docNumber", "", "docType", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "getDocCtzId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDocId", "getDocNumber", "()Ljava/lang/String;", "getDocType", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lcom/nic/mparivahan/RC/Model/CitizenDocInfoX;", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CitizenDocInfoX {
    private final Long docCtzId;
    private final Long docId;
    private final String docNumber;
    private final String docType;

    public CitizenDocInfoX(Long l, Long l2, String str, String str2) {
        this.docCtzId = l;
        this.docId = l2;
        this.docNumber = str;
        this.docType = str2;
    }

    public static /* synthetic */ CitizenDocInfoX copy$default(CitizenDocInfoX citizenDocInfoX, Long l, Long l2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = citizenDocInfoX.docCtzId;
        }
        if ((i & 2) != 0) {
            l2 = citizenDocInfoX.docId;
        }
        if ((i & 4) != 0) {
            str = citizenDocInfoX.docNumber;
        }
        if ((i & 8) != 0) {
            str2 = citizenDocInfoX.docType;
        }
        return citizenDocInfoX.copy(l, l2, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getDocCtzId() {
        return this.docCtzId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getDocId() {
        return this.docId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDocNumber() {
        return this.docNumber;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDocType() {
        return this.docType;
    }

    public final CitizenDocInfoX copy(Long docCtzId, Long docId, String docNumber, String docType) {
        return new CitizenDocInfoX(docCtzId, docId, docNumber, docType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CitizenDocInfoX)) {
            return false;
        }
        CitizenDocInfoX citizenDocInfoX = (CitizenDocInfoX) other;
        return Intrinsics.areEqual(this.docCtzId, citizenDocInfoX.docCtzId) && Intrinsics.areEqual(this.docId, citizenDocInfoX.docId) && Intrinsics.areEqual(this.docNumber, citizenDocInfoX.docNumber) && Intrinsics.areEqual(this.docType, citizenDocInfoX.docType);
    }

    public final Long getDocCtzId() {
        return this.docCtzId;
    }

    public final Long getDocId() {
        return this.docId;
    }

    public final String getDocNumber() {
        return this.docNumber;
    }

    public final String getDocType() {
        return this.docType;
    }

    public int hashCode() {
        Long l = this.docCtzId;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.docId;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.docNumber;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.docType;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "CitizenDocInfoX(docCtzId=" + this.docCtzId + ", docId=" + this.docId + ", docNumber=" + this.docNumber + ", docType=" + this.docType + ')';
    }
}
