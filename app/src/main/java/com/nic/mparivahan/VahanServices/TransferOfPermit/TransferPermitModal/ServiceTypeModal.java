package com.nic.mparivahan.VahanServices.TransferOfPermit.TransferPermitModal;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/nic/mparivahan/VahanServices/TransferOfPermit/TransferPermitModal/ServiceTypeModal;", "", "serviceCode", "", "serviceDescription", "", "acFitted", "(ILjava/lang/String;Ljava/lang/String;)V", "getAcFitted", "()Ljava/lang/String;", "getServiceCode", "()I", "getServiceDescription", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ServiceTypeModal {
    private final String acFitted;
    private final int serviceCode;
    private final String serviceDescription;

    public ServiceTypeModal() {
        this(0, null, null, 7, null);
    }

    public static /* synthetic */ ServiceTypeModal copy$default(ServiceTypeModal serviceTypeModal, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = serviceTypeModal.serviceCode;
        }
        if ((i2 & 2) != 0) {
            str = serviceTypeModal.serviceDescription;
        }
        if ((i2 & 4) != 0) {
            str2 = serviceTypeModal.acFitted;
        }
        return serviceTypeModal.copy(i, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getServiceCode() {
        return this.serviceCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getServiceDescription() {
        return this.serviceDescription;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAcFitted() {
        return this.acFitted;
    }

    public final ServiceTypeModal copy(int serviceCode, String serviceDescription, String acFitted) {
        Intrinsics.checkNotNullParameter(serviceDescription, "serviceDescription");
        Intrinsics.checkNotNullParameter(acFitted, "acFitted");
        return new ServiceTypeModal(serviceCode, serviceDescription, acFitted);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServiceTypeModal)) {
            return false;
        }
        ServiceTypeModal serviceTypeModal = (ServiceTypeModal) other;
        return this.serviceCode == serviceTypeModal.serviceCode && Intrinsics.areEqual(this.serviceDescription, serviceTypeModal.serviceDescription) && Intrinsics.areEqual(this.acFitted, serviceTypeModal.acFitted);
    }

    public final String getAcFitted() {
        return this.acFitted;
    }

    public final int getServiceCode() {
        return this.serviceCode;
    }

    public final String getServiceDescription() {
        return this.serviceDescription;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.serviceCode) * 31) + this.serviceDescription.hashCode()) * 31) + this.acFitted.hashCode();
    }

    public String toString() {
        return "ServiceTypeModal(serviceCode=" + this.serviceCode + ", serviceDescription=" + this.serviceDescription + ", acFitted=" + this.acFitted + ')';
    }

    public ServiceTypeModal(int i, String serviceDescription, String acFitted) {
        Intrinsics.checkNotNullParameter(serviceDescription, "serviceDescription");
        Intrinsics.checkNotNullParameter(acFitted, "acFitted");
        this.serviceCode = i;
        this.serviceDescription = serviceDescription;
        this.acFitted = acFitted;
    }

    public /* synthetic */ ServiceTypeModal(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2);
    }
}
