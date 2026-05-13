package com.nic.mparivahan.RC.Model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/nic/mparivahan/RC/Model/Citizendoc;", "", "citizenDocInfo", "Lcom/nic/mparivahan/RC/Model/CitizenDocInfo;", "statusCode", "", "statusDesc", "(Lcom/nic/mparivahan/RC/Model/CitizenDocInfo;Ljava/lang/String;Ljava/lang/String;)V", "getCitizenDocInfo", "()Lcom/nic/mparivahan/RC/Model/CitizenDocInfo;", "getStatusCode", "()Ljava/lang/String;", "getStatusDesc", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Citizendoc {
    private final CitizenDocInfo citizenDocInfo;
    private final String statusCode;
    private final String statusDesc;

    public Citizendoc(CitizenDocInfo citizenDocInfo, String statusCode, String statusDesc) {
        Intrinsics.checkNotNullParameter(citizenDocInfo, "citizenDocInfo");
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        this.citizenDocInfo = citizenDocInfo;
        this.statusCode = statusCode;
        this.statusDesc = statusDesc;
    }

    public static /* synthetic */ Citizendoc copy$default(Citizendoc citizendoc, CitizenDocInfo citizenDocInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            citizenDocInfo = citizendoc.citizenDocInfo;
        }
        if ((i & 2) != 0) {
            str = citizendoc.statusCode;
        }
        if ((i & 4) != 0) {
            str2 = citizendoc.statusDesc;
        }
        return citizendoc.copy(citizenDocInfo, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CitizenDocInfo getCitizenDocInfo() {
        return this.citizenDocInfo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatusCode() {
        return this.statusCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final Citizendoc copy(CitizenDocInfo citizenDocInfo, String statusCode, String statusDesc) {
        Intrinsics.checkNotNullParameter(citizenDocInfo, "citizenDocInfo");
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        return new Citizendoc(citizenDocInfo, statusCode, statusDesc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Citizendoc)) {
            return false;
        }
        Citizendoc citizendoc = (Citizendoc) other;
        return Intrinsics.areEqual(this.citizenDocInfo, citizendoc.citizenDocInfo) && Intrinsics.areEqual(this.statusCode, citizendoc.statusCode) && Intrinsics.areEqual(this.statusDesc, citizendoc.statusDesc);
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
        return (((this.citizenDocInfo.hashCode() * 31) + this.statusCode.hashCode()) * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "Citizendoc(citizenDocInfo=" + this.citizenDocInfo + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
