package com.nic.mparivahan.VahanServices.FancyServices.AvailableFancyModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/nic/mparivahan/VahanServices/FancyServices/AvailableFancyModel/AvailableFancyRequest2;", "", "pageNumber", "", "pageSize", "rtoCode", "stateCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPageNumber", "()Ljava/lang/String;", "getPageSize", "getRtoCode", "getStateCode", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AvailableFancyRequest2 {
    private final String pageNumber;
    private final String pageSize;
    private final String rtoCode;
    private final String stateCode;

    public AvailableFancyRequest2(String pageNumber, String pageSize, String rtoCode, String stateCode) {
        Intrinsics.checkNotNullParameter(pageNumber, "pageNumber");
        Intrinsics.checkNotNullParameter(pageSize, "pageSize");
        Intrinsics.checkNotNullParameter(rtoCode, "rtoCode");
        Intrinsics.checkNotNullParameter(stateCode, "stateCode");
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.rtoCode = rtoCode;
        this.stateCode = stateCode;
    }

    public static /* synthetic */ AvailableFancyRequest2 copy$default(AvailableFancyRequest2 availableFancyRequest2, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = availableFancyRequest2.pageNumber;
        }
        if ((i & 2) != 0) {
            str2 = availableFancyRequest2.pageSize;
        }
        if ((i & 4) != 0) {
            str3 = availableFancyRequest2.rtoCode;
        }
        if ((i & 8) != 0) {
            str4 = availableFancyRequest2.stateCode;
        }
        return availableFancyRequest2.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPageNumber() {
        return this.pageNumber;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPageSize() {
        return this.pageSize;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRtoCode() {
        return this.rtoCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStateCode() {
        return this.stateCode;
    }

    public final AvailableFancyRequest2 copy(String pageNumber, String pageSize, String rtoCode, String stateCode) {
        Intrinsics.checkNotNullParameter(pageNumber, "pageNumber");
        Intrinsics.checkNotNullParameter(pageSize, "pageSize");
        Intrinsics.checkNotNullParameter(rtoCode, "rtoCode");
        Intrinsics.checkNotNullParameter(stateCode, "stateCode");
        return new AvailableFancyRequest2(pageNumber, pageSize, rtoCode, stateCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvailableFancyRequest2)) {
            return false;
        }
        AvailableFancyRequest2 availableFancyRequest2 = (AvailableFancyRequest2) other;
        return Intrinsics.areEqual(this.pageNumber, availableFancyRequest2.pageNumber) && Intrinsics.areEqual(this.pageSize, availableFancyRequest2.pageSize) && Intrinsics.areEqual(this.rtoCode, availableFancyRequest2.rtoCode) && Intrinsics.areEqual(this.stateCode, availableFancyRequest2.stateCode);
    }

    public final String getPageNumber() {
        return this.pageNumber;
    }

    public final String getPageSize() {
        return this.pageSize;
    }

    public final String getRtoCode() {
        return this.rtoCode;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public int hashCode() {
        return (((((this.pageNumber.hashCode() * 31) + this.pageSize.hashCode()) * 31) + this.rtoCode.hashCode()) * 31) + this.stateCode.hashCode();
    }

    public String toString() {
        return "AvailableFancyRequest2(pageNumber=" + this.pageNumber + ", pageSize=" + this.pageSize + ", rtoCode=" + this.rtoCode + ", stateCode=" + this.stateCode + ')';
    }
}
