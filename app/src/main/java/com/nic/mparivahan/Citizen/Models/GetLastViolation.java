package com.nic.mparivahan.Citizen.Models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/nic/mparivahan/Citizen/Models/GetLastViolation;", "", "citizenViolation", "Lcom/nic/mparivahan/Citizen/Models/CitizenViolation;", "statusCode", "", "statusDesc", "(Lcom/nic/mparivahan/Citizen/Models/CitizenViolation;Ljava/lang/String;Ljava/lang/String;)V", "getCitizenViolation", "()Lcom/nic/mparivahan/Citizen/Models/CitizenViolation;", "getStatusCode", "()Ljava/lang/String;", "getStatusDesc", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class GetLastViolation {
    private final CitizenViolation citizenViolation;
    private final String statusCode;
    private final String statusDesc;

    public GetLastViolation(CitizenViolation citizenViolation, String statusCode, String statusDesc) {
        Intrinsics.checkNotNullParameter(citizenViolation, "citizenViolation");
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        this.citizenViolation = citizenViolation;
        this.statusCode = statusCode;
        this.statusDesc = statusDesc;
    }

    public static /* synthetic */ GetLastViolation copy$default(GetLastViolation getLastViolation, CitizenViolation citizenViolation, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            citizenViolation = getLastViolation.citizenViolation;
        }
        if ((i & 2) != 0) {
            str = getLastViolation.statusCode;
        }
        if ((i & 4) != 0) {
            str2 = getLastViolation.statusDesc;
        }
        return getLastViolation.copy(citizenViolation, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CitizenViolation getCitizenViolation() {
        return this.citizenViolation;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatusCode() {
        return this.statusCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final GetLastViolation copy(CitizenViolation citizenViolation, String statusCode, String statusDesc) {
        Intrinsics.checkNotNullParameter(citizenViolation, "citizenViolation");
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        return new GetLastViolation(citizenViolation, statusCode, statusDesc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetLastViolation)) {
            return false;
        }
        GetLastViolation getLastViolation = (GetLastViolation) other;
        return Intrinsics.areEqual(this.citizenViolation, getLastViolation.citizenViolation) && Intrinsics.areEqual(this.statusCode, getLastViolation.statusCode) && Intrinsics.areEqual(this.statusDesc, getLastViolation.statusDesc);
    }

    public final CitizenViolation getCitizenViolation() {
        return this.citizenViolation;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (((this.citizenViolation.hashCode() * 31) + this.statusCode.hashCode()) * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "GetLastViolation(citizenViolation=" + this.citizenViolation + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
