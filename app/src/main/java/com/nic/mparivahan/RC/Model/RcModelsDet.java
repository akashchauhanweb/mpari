package com.nic.mparivahan.RC.Model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/nic/mparivahan/RC/Model/RcModelsDet;", "", "nrvDetails", "Lcom/nic/mparivahan/RC/Model/NrvDetails;", "statusCode", "", "statusDesc", "(Lcom/nic/mparivahan/RC/Model/NrvDetails;Ljava/lang/String;Ljava/lang/String;)V", "getNrvDetails", "()Lcom/nic/mparivahan/RC/Model/NrvDetails;", "setNrvDetails", "(Lcom/nic/mparivahan/RC/Model/NrvDetails;)V", "getStatusCode", "()Ljava/lang/String;", "getStatusDesc", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class RcModelsDet {
    private NrvDetails nrvDetails;
    private final String statusCode;
    private final String statusDesc;

    public RcModelsDet(NrvDetails nrvDetails, String statusCode, String statusDesc) {
        Intrinsics.checkNotNullParameter(nrvDetails, "nrvDetails");
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        this.nrvDetails = nrvDetails;
        this.statusCode = statusCode;
        this.statusDesc = statusDesc;
    }

    public static /* synthetic */ RcModelsDet copy$default(RcModelsDet rcModelsDet, NrvDetails nrvDetails, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            nrvDetails = rcModelsDet.nrvDetails;
        }
        if ((i & 2) != 0) {
            str = rcModelsDet.statusCode;
        }
        if ((i & 4) != 0) {
            str2 = rcModelsDet.statusDesc;
        }
        return rcModelsDet.copy(nrvDetails, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NrvDetails getNrvDetails() {
        return this.nrvDetails;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatusCode() {
        return this.statusCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final RcModelsDet copy(NrvDetails nrvDetails, String statusCode, String statusDesc) {
        Intrinsics.checkNotNullParameter(nrvDetails, "nrvDetails");
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        return new RcModelsDet(nrvDetails, statusCode, statusDesc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RcModelsDet)) {
            return false;
        }
        RcModelsDet rcModelsDet = (RcModelsDet) other;
        return Intrinsics.areEqual(this.nrvDetails, rcModelsDet.nrvDetails) && Intrinsics.areEqual(this.statusCode, rcModelsDet.statusCode) && Intrinsics.areEqual(this.statusDesc, rcModelsDet.statusDesc);
    }

    public final NrvDetails getNrvDetails() {
        return this.nrvDetails;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (((this.nrvDetails.hashCode() * 31) + this.statusCode.hashCode()) * 31) + this.statusDesc.hashCode();
    }

    public final void setNrvDetails(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.nrvDetails = nrvDetails;
    }

    public String toString() {
        return "RcModelsDet(nrvDetails=" + this.nrvDetails + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
