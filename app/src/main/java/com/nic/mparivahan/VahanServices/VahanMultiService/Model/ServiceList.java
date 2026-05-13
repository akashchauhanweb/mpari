package com.nic.mparivahan.VahanServices.VahanMultiService.Model;

import androidx.annotation.Keep;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/ServiceList;", "", "purposeCode", "", "selectService", "", "(IZ)V", "getPurposeCode", "()I", "getSelectService", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ServiceList {
    private final int purposeCode;
    private final boolean selectService;

    public ServiceList(int i, boolean z) {
        this.purposeCode = i;
        this.selectService = z;
    }

    public static /* synthetic */ ServiceList copy$default(ServiceList serviceList, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = serviceList.purposeCode;
        }
        if ((i2 & 2) != 0) {
            z = serviceList.selectService;
        }
        return serviceList.copy(i, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPurposeCode() {
        return this.purposeCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getSelectService() {
        return this.selectService;
    }

    public final ServiceList copy(int purposeCode, boolean selectService) {
        return new ServiceList(purposeCode, selectService);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServiceList)) {
            return false;
        }
        ServiceList serviceList = (ServiceList) other;
        return this.purposeCode == serviceList.purposeCode && this.selectService == serviceList.selectService;
    }

    public final int getPurposeCode() {
        return this.purposeCode;
    }

    public final boolean getSelectService() {
        return this.selectService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.purposeCode) * 31;
        boolean z = this.selectService;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public String toString() {
        return "ServiceList(purposeCode=" + this.purposeCode + ", selectService=" + this.selectService + ')';
    }
}
