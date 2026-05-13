package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/GetStateCode;", "", "offCd", "", "stateCd", "", "errorcode", "errorDesc", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getErrorDesc", "()Ljava/lang/String;", "getErrorcode", "getOffCd", "()I", "getStateCd", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class GetStateCode {
    private final String errorDesc;
    private final String errorcode;
    private final int offCd;
    private final String stateCd;

    public GetStateCode(int i, String stateCd, String str, String str2) {
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        this.offCd = i;
        this.stateCd = stateCd;
        this.errorcode = str;
        this.errorDesc = str2;
    }

    public static /* synthetic */ GetStateCode copy$default(GetStateCode getStateCode, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = getStateCode.offCd;
        }
        if ((i2 & 2) != 0) {
            str = getStateCode.stateCd;
        }
        if ((i2 & 4) != 0) {
            str2 = getStateCode.errorcode;
        }
        if ((i2 & 8) != 0) {
            str3 = getStateCode.errorDesc;
        }
        return getStateCode.copy(i, str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getOffCd() {
        return this.offCd;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStateCd() {
        return this.stateCd;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getErrorcode() {
        return this.errorcode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getErrorDesc() {
        return this.errorDesc;
    }

    public final GetStateCode copy(int offCd, String stateCd, String errorcode, String errorDesc) {
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        return new GetStateCode(offCd, stateCd, errorcode, errorDesc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetStateCode)) {
            return false;
        }
        GetStateCode getStateCode = (GetStateCode) other;
        return this.offCd == getStateCode.offCd && Intrinsics.areEqual(this.stateCd, getStateCode.stateCd) && Intrinsics.areEqual(this.errorcode, getStateCode.errorcode) && Intrinsics.areEqual(this.errorDesc, getStateCode.errorDesc);
    }

    public final String getErrorDesc() {
        return this.errorDesc;
    }

    public final String getErrorcode() {
        return this.errorcode;
    }

    public final int getOffCd() {
        return this.offCd;
    }

    public final String getStateCd() {
        return this.stateCd;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.offCd) * 31) + this.stateCd.hashCode()) * 31;
        String str = this.errorcode;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorDesc;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "GetStateCode(offCd=" + this.offCd + ", stateCd=" + this.stateCd + ", errorcode=" + this.errorcode + ", errorDesc=" + this.errorDesc + ')';
    }
}
