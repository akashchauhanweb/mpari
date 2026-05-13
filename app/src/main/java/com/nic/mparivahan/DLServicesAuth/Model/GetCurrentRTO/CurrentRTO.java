package com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/nic/mparivahan/DLServicesAuth/Model/GetCurrentRTO/CurrentRTO;", "", "RtosMaster", "", "Lcom/nic/mparivahan/DLServicesAuth/Model/GetCurrentRTO/RtosMaster;", "status_code", "", "status_desc", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getRtosMaster", "()Ljava/util/List;", "getStatus_code", "()Ljava/lang/String;", "getStatus_desc", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CurrentRTO {
    private final List<RtosMaster> RtosMaster;
    private final String status_code;
    private final String status_desc;

    public CurrentRTO(List<RtosMaster> RtosMaster, String status_code, String status_desc) {
        Intrinsics.checkNotNullParameter(RtosMaster, "RtosMaster");
        Intrinsics.checkNotNullParameter(status_code, "status_code");
        Intrinsics.checkNotNullParameter(status_desc, "status_desc");
        this.RtosMaster = RtosMaster;
        this.status_code = status_code;
        this.status_desc = status_desc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CurrentRTO copy$default(CurrentRTO currentRTO, List list, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = currentRTO.RtosMaster;
        }
        if ((i & 2) != 0) {
            str = currentRTO.status_code;
        }
        if ((i & 4) != 0) {
            str2 = currentRTO.status_desc;
        }
        return currentRTO.copy(list, str, str2);
    }

    public final List<RtosMaster> component1() {
        return this.RtosMaster;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatus_code() {
        return this.status_code;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatus_desc() {
        return this.status_desc;
    }

    public final CurrentRTO copy(List<RtosMaster> RtosMaster, String status_code, String status_desc) {
        Intrinsics.checkNotNullParameter(RtosMaster, "RtosMaster");
        Intrinsics.checkNotNullParameter(status_code, "status_code");
        Intrinsics.checkNotNullParameter(status_desc, "status_desc");
        return new CurrentRTO(RtosMaster, status_code, status_desc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrentRTO)) {
            return false;
        }
        CurrentRTO currentRTO = (CurrentRTO) other;
        return Intrinsics.areEqual(this.RtosMaster, currentRTO.RtosMaster) && Intrinsics.areEqual(this.status_code, currentRTO.status_code) && Intrinsics.areEqual(this.status_desc, currentRTO.status_desc);
    }

    public final List<RtosMaster> getRtosMaster() {
        return this.RtosMaster;
    }

    public final String getStatus_code() {
        return this.status_code;
    }

    public final String getStatus_desc() {
        return this.status_desc;
    }

    public int hashCode() {
        return (((this.RtosMaster.hashCode() * 31) + this.status_code.hashCode()) * 31) + this.status_desc.hashCode();
    }

    public String toString() {
        return "CurrentRTO(RtosMaster=" + this.RtosMaster + ", status_code=" + this.status_code + ", status_desc=" + this.status_desc + ')';
    }
}
