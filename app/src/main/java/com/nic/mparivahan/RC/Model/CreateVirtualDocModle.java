package com.nic.mparivahan.RC.Model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/nic/mparivahan/RC/Model/CreateVirtualDocModle;", "", "statusCode", "", "statusDesc", "citizenDocInfo", "Lcom/nic/mparivahan/RC/Model/CitizenDocInfo;", "(Ljava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/RC/Model/CitizenDocInfo;)V", "getCitizenDocInfo", "()Lcom/nic/mparivahan/RC/Model/CitizenDocInfo;", "getStatusCode", "()Ljava/lang/String;", "getStatusDesc", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CreateVirtualDocModle {
    private final CitizenDocInfo citizenDocInfo;
    private final String statusCode;
    private final String statusDesc;

    public CreateVirtualDocModle(String statusCode, String statusDesc, CitizenDocInfo citizenDocInfo) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        Intrinsics.checkNotNullParameter(citizenDocInfo, "citizenDocInfo");
        this.statusCode = statusCode;
        this.statusDesc = statusDesc;
        this.citizenDocInfo = citizenDocInfo;
    }

    public static /* synthetic */ CreateVirtualDocModle copy$default(CreateVirtualDocModle createVirtualDocModle, String str, String str2, CitizenDocInfo citizenDocInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createVirtualDocModle.statusCode;
        }
        if ((i & 2) != 0) {
            str2 = createVirtualDocModle.statusDesc;
        }
        if ((i & 4) != 0) {
            citizenDocInfo = createVirtualDocModle.citizenDocInfo;
        }
        return createVirtualDocModle.copy(str, str2, citizenDocInfo);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatusCode() {
        return this.statusCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatusDesc() {
        return this.statusDesc;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CitizenDocInfo getCitizenDocInfo() {
        return this.citizenDocInfo;
    }

    public final CreateVirtualDocModle copy(String statusCode, String statusDesc, CitizenDocInfo citizenDocInfo) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        Intrinsics.checkNotNullParameter(citizenDocInfo, "citizenDocInfo");
        return new CreateVirtualDocModle(statusCode, statusDesc, citizenDocInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateVirtualDocModle)) {
            return false;
        }
        CreateVirtualDocModle createVirtualDocModle = (CreateVirtualDocModle) other;
        return Intrinsics.areEqual(this.statusCode, createVirtualDocModle.statusCode) && Intrinsics.areEqual(this.statusDesc, createVirtualDocModle.statusDesc) && Intrinsics.areEqual(this.citizenDocInfo, createVirtualDocModle.citizenDocInfo);
    }

    public final CitizenDocInfo getCitizenDocInfo() {
        return this.citizenDocInfo;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (((this.statusCode.hashCode() * 31) + this.statusDesc.hashCode()) * 31) + this.citizenDocInfo.hashCode();
    }

    public String toString() {
        return "CreateVirtualDocModle(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ", citizenDocInfo=" + this.citizenDocInfo + ')';
    }
}
