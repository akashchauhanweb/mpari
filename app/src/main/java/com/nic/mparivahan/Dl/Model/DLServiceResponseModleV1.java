package com.nic.mparivahan.Dl.Model;

import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/nic/mparivahan/Dl/Model/DLServiceResponseModleV1;", "Ljava/io/Serializable;", "dldetobj", "", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "statusDesc", "", "statusCode", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getDldetobj", "()Ljava/util/List;", "getStatusCode", "()Ljava/lang/String;", "setStatusCode", "(Ljava/lang/String;)V", "getStatusDesc", "setStatusDesc", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DLServiceResponseModleV1 implements Serializable {
    private final List<DldetobjX> dldetobj;
    private String statusCode;
    private String statusDesc;

    public DLServiceResponseModleV1(List<DldetobjX> dldetobj, String str, String str2) {
        Intrinsics.checkNotNullParameter(dldetobj, "dldetobj");
        this.dldetobj = dldetobj;
        this.statusDesc = str;
        this.statusCode = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DLServiceResponseModleV1 copy$default(DLServiceResponseModleV1 dLServiceResponseModleV1, List list, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = dLServiceResponseModleV1.dldetobj;
        }
        if ((i & 2) != 0) {
            str = dLServiceResponseModleV1.statusDesc;
        }
        if ((i & 4) != 0) {
            str2 = dLServiceResponseModleV1.statusCode;
        }
        return dLServiceResponseModleV1.copy(list, str, str2);
    }

    public final List<DldetobjX> component1() {
        return this.dldetobj;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatusDesc() {
        return this.statusDesc;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatusCode() {
        return this.statusCode;
    }

    public final DLServiceResponseModleV1 copy(List<DldetobjX> dldetobj, String statusDesc, String statusCode) {
        Intrinsics.checkNotNullParameter(dldetobj, "dldetobj");
        return new DLServiceResponseModleV1(dldetobj, statusDesc, statusCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DLServiceResponseModleV1)) {
            return false;
        }
        DLServiceResponseModleV1 dLServiceResponseModleV1 = (DLServiceResponseModleV1) other;
        return Intrinsics.areEqual(this.dldetobj, dLServiceResponseModleV1.dldetobj) && Intrinsics.areEqual(this.statusDesc, dLServiceResponseModleV1.statusDesc) && Intrinsics.areEqual(this.statusCode, dLServiceResponseModleV1.statusCode);
    }

    public final List<DldetobjX> getDldetobj() {
        return this.dldetobj;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        int iHashCode = this.dldetobj.hashCode() * 31;
        String str = this.statusDesc;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.statusCode;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setStatusCode(String str) {
        this.statusCode = str;
    }

    public final void setStatusDesc(String str) {
        this.statusDesc = str;
    }

    public String toString() {
        return "DLServiceResponseModleV1(dldetobj=" + this.dldetobj + ", statusDesc=" + this.statusDesc + ", statusCode=" + this.statusCode + ')';
    }
}
