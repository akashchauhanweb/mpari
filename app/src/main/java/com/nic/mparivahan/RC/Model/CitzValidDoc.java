package com.nic.mparivahan.RC.Model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J9\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/nic/mparivahan/RC/Model/CitzValidDoc;", "", "citizenDocInfo", "Lcom/nic/mparivahan/RC/Model/CitizenDocInfoX;", "statusCode", "", "statusDesc", "param", "(Lcom/nic/mparivahan/RC/Model/CitizenDocInfoX;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCitizenDocInfo", "()Lcom/nic/mparivahan/RC/Model/CitizenDocInfoX;", "getParam", "()Ljava/lang/String;", "getStatusCode", "getStatusDesc", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CitzValidDoc {
    private final CitizenDocInfoX citizenDocInfo;
    private final String param;
    private final String statusCode;
    private final String statusDesc;

    public CitzValidDoc(CitizenDocInfoX citizenDocInfoX, String str, String str2, String str3) {
        this.citizenDocInfo = citizenDocInfoX;
        this.statusCode = str;
        this.statusDesc = str2;
        this.param = str3;
    }

    public static /* synthetic */ CitzValidDoc copy$default(CitzValidDoc citzValidDoc, CitizenDocInfoX citizenDocInfoX, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            citizenDocInfoX = citzValidDoc.citizenDocInfo;
        }
        if ((i & 2) != 0) {
            str = citzValidDoc.statusCode;
        }
        if ((i & 4) != 0) {
            str2 = citzValidDoc.statusDesc;
        }
        if ((i & 8) != 0) {
            str3 = citzValidDoc.param;
        }
        return citzValidDoc.copy(citizenDocInfoX, str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CitizenDocInfoX getCitizenDocInfo() {
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

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getParam() {
        return this.param;
    }

    public final CitzValidDoc copy(CitizenDocInfoX citizenDocInfo, String statusCode, String statusDesc, String param) {
        return new CitzValidDoc(citizenDocInfo, statusCode, statusDesc, param);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CitzValidDoc)) {
            return false;
        }
        CitzValidDoc citzValidDoc = (CitzValidDoc) other;
        return Intrinsics.areEqual(this.citizenDocInfo, citzValidDoc.citizenDocInfo) && Intrinsics.areEqual(this.statusCode, citzValidDoc.statusCode) && Intrinsics.areEqual(this.statusDesc, citzValidDoc.statusDesc) && Intrinsics.areEqual(this.param, citzValidDoc.param);
    }

    public final CitizenDocInfoX getCitizenDocInfo() {
        return this.citizenDocInfo;
    }

    public final String getParam() {
        return this.param;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        CitizenDocInfoX citizenDocInfoX = this.citizenDocInfo;
        int iHashCode = (citizenDocInfoX == null ? 0 : citizenDocInfoX.hashCode()) * 31;
        String str = this.statusCode;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.statusDesc;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.param;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "CitzValidDoc(citizenDocInfo=" + this.citizenDocInfo + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ", param=" + this.param + ')';
    }
}
