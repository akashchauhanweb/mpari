package com.nic.mparivahan.Sarathithreeservices.model.app_status;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/nic/mparivahan/Sarathithreeservices/model/app_status/ApplFlowStatus;", "", "acCd", "", "acDesc", "", "flowSlno", "status", "trCd", "trName", "(ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;)V", "getAcCd", "()I", "getAcDesc", "()Ljava/lang/String;", "getFlowSlno", "getStatus", "getTrCd", "getTrName", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ApplFlowStatus {
    private final int acCd;
    private final String acDesc;
    private final int flowSlno;
    private final String status;
    private final int trCd;
    private final String trName;

    public ApplFlowStatus(int i, String acDesc, int i2, String status, int i3, String trName) {
        Intrinsics.checkNotNullParameter(acDesc, "acDesc");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(trName, "trName");
        this.acCd = i;
        this.acDesc = acDesc;
        this.flowSlno = i2;
        this.status = status;
        this.trCd = i3;
        this.trName = trName;
    }

    public static /* synthetic */ ApplFlowStatus copy$default(ApplFlowStatus applFlowStatus, int i, String str, int i2, String str2, int i3, String str3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = applFlowStatus.acCd;
        }
        if ((i4 & 2) != 0) {
            str = applFlowStatus.acDesc;
        }
        String str4 = str;
        if ((i4 & 4) != 0) {
            i2 = applFlowStatus.flowSlno;
        }
        int i5 = i2;
        if ((i4 & 8) != 0) {
            str2 = applFlowStatus.status;
        }
        String str5 = str2;
        if ((i4 & 16) != 0) {
            i3 = applFlowStatus.trCd;
        }
        int i6 = i3;
        if ((i4 & 32) != 0) {
            str3 = applFlowStatus.trName;
        }
        return applFlowStatus.copy(i, str4, i5, str5, i6, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAcCd() {
        return this.acCd;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAcDesc() {
        return this.acDesc;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getFlowSlno() {
        return this.flowSlno;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getTrCd() {
        return this.trCd;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTrName() {
        return this.trName;
    }

    public final ApplFlowStatus copy(int acCd, String acDesc, int flowSlno, String status, int trCd, String trName) {
        Intrinsics.checkNotNullParameter(acDesc, "acDesc");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(trName, "trName");
        return new ApplFlowStatus(acCd, acDesc, flowSlno, status, trCd, trName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApplFlowStatus)) {
            return false;
        }
        ApplFlowStatus applFlowStatus = (ApplFlowStatus) other;
        return this.acCd == applFlowStatus.acCd && Intrinsics.areEqual(this.acDesc, applFlowStatus.acDesc) && this.flowSlno == applFlowStatus.flowSlno && Intrinsics.areEqual(this.status, applFlowStatus.status) && this.trCd == applFlowStatus.trCd && Intrinsics.areEqual(this.trName, applFlowStatus.trName);
    }

    public final int getAcCd() {
        return this.acCd;
    }

    public final String getAcDesc() {
        return this.acDesc;
    }

    public final int getFlowSlno() {
        return this.flowSlno;
    }

    public final String getStatus() {
        return this.status;
    }

    public final int getTrCd() {
        return this.trCd;
    }

    public final String getTrName() {
        return this.trName;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.acCd) * 31) + this.acDesc.hashCode()) * 31) + Integer.hashCode(this.flowSlno)) * 31) + this.status.hashCode()) * 31) + Integer.hashCode(this.trCd)) * 31) + this.trName.hashCode();
    }

    public String toString() {
        return "ApplFlowStatus(acCd=" + this.acCd + ", acDesc=" + this.acDesc + ", flowSlno=" + this.flowSlno + ", status=" + this.status + ", trCd=" + this.trCd + ", trName=" + this.trName + ')';
    }
}
