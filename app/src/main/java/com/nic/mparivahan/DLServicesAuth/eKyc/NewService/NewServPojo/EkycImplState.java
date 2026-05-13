package com.nic.mparivahan.DLServicesAuth.eKyc.NewService.NewServPojo;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/nic/mparivahan/DLServicesAuth/eKyc/NewService/NewServPojo/EkycImplState;", "", "ekycIsRtoCode", "", "ekycIsStCode", "ekycIsStatus", "ekycIsTrcd", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getEkycIsRtoCode", "()Ljava/lang/String;", "getEkycIsStCode", "getEkycIsStatus", "getEkycIsTrcd", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class EkycImplState {
    private final String ekycIsRtoCode;
    private final String ekycIsStCode;
    private final String ekycIsStatus;
    private final int ekycIsTrcd;

    public EkycImplState(String ekycIsRtoCode, String ekycIsStCode, String ekycIsStatus, int i) {
        Intrinsics.checkNotNullParameter(ekycIsRtoCode, "ekycIsRtoCode");
        Intrinsics.checkNotNullParameter(ekycIsStCode, "ekycIsStCode");
        Intrinsics.checkNotNullParameter(ekycIsStatus, "ekycIsStatus");
        this.ekycIsRtoCode = ekycIsRtoCode;
        this.ekycIsStCode = ekycIsStCode;
        this.ekycIsStatus = ekycIsStatus;
        this.ekycIsTrcd = i;
    }

    public static /* synthetic */ EkycImplState copy$default(EkycImplState ekycImplState, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = ekycImplState.ekycIsRtoCode;
        }
        if ((i2 & 2) != 0) {
            str2 = ekycImplState.ekycIsStCode;
        }
        if ((i2 & 4) != 0) {
            str3 = ekycImplState.ekycIsStatus;
        }
        if ((i2 & 8) != 0) {
            i = ekycImplState.ekycIsTrcd;
        }
        return ekycImplState.copy(str, str2, str3, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEkycIsRtoCode() {
        return this.ekycIsRtoCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEkycIsStCode() {
        return this.ekycIsStCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEkycIsStatus() {
        return this.ekycIsStatus;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getEkycIsTrcd() {
        return this.ekycIsTrcd;
    }

    public final EkycImplState copy(String ekycIsRtoCode, String ekycIsStCode, String ekycIsStatus, int ekycIsTrcd) {
        Intrinsics.checkNotNullParameter(ekycIsRtoCode, "ekycIsRtoCode");
        Intrinsics.checkNotNullParameter(ekycIsStCode, "ekycIsStCode");
        Intrinsics.checkNotNullParameter(ekycIsStatus, "ekycIsStatus");
        return new EkycImplState(ekycIsRtoCode, ekycIsStCode, ekycIsStatus, ekycIsTrcd);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EkycImplState)) {
            return false;
        }
        EkycImplState ekycImplState = (EkycImplState) other;
        return Intrinsics.areEqual(this.ekycIsRtoCode, ekycImplState.ekycIsRtoCode) && Intrinsics.areEqual(this.ekycIsStCode, ekycImplState.ekycIsStCode) && Intrinsics.areEqual(this.ekycIsStatus, ekycImplState.ekycIsStatus) && this.ekycIsTrcd == ekycImplState.ekycIsTrcd;
    }

    public final String getEkycIsRtoCode() {
        return this.ekycIsRtoCode;
    }

    public final String getEkycIsStCode() {
        return this.ekycIsStCode;
    }

    public final String getEkycIsStatus() {
        return this.ekycIsStatus;
    }

    public final int getEkycIsTrcd() {
        return this.ekycIsTrcd;
    }

    public int hashCode() {
        return (((((this.ekycIsRtoCode.hashCode() * 31) + this.ekycIsStCode.hashCode()) * 31) + this.ekycIsStatus.hashCode()) * 31) + Integer.hashCode(this.ekycIsTrcd);
    }

    public String toString() {
        return "EkycImplState(ekycIsRtoCode=" + this.ekycIsRtoCode + ", ekycIsStCode=" + this.ekycIsStCode + ", ekycIsStatus=" + this.ekycIsStatus + ", ekycIsTrcd=" + this.ekycIsTrcd + ')';
    }
}
