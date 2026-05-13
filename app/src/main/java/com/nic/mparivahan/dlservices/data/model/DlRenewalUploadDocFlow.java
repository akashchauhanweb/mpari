package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003JE\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\bHÖ\u0001J\b\u0010&\u001a\u00020\u0003H\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012¨\u0006'"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/DlRenewalUploadDocFlow;", "", "applNo", "", "transCode", "stateCode", "rtoCode", "acCode", "", "acStatus", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getAcCode", "()I", "setAcCode", "(I)V", "getAcStatus", "()Ljava/lang/String;", "setAcStatus", "(Ljava/lang/String;)V", "getApplNo", "setApplNo", "getRtoCode", "setRtoCode", "getStateCode", "setStateCode", "getTransCode", "setTransCode", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DlRenewalUploadDocFlow {
    private int acCode;
    private String acStatus;
    private String applNo;
    private String rtoCode;
    private String stateCode;
    private String transCode;

    public DlRenewalUploadDocFlow(String applNo, String transCode, String stateCode, String rtoCode, int i, String acStatus) {
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(transCode, "transCode");
        Intrinsics.checkNotNullParameter(stateCode, "stateCode");
        Intrinsics.checkNotNullParameter(rtoCode, "rtoCode");
        Intrinsics.checkNotNullParameter(acStatus, "acStatus");
        this.applNo = applNo;
        this.transCode = transCode;
        this.stateCode = stateCode;
        this.rtoCode = rtoCode;
        this.acCode = i;
        this.acStatus = acStatus;
    }

    public static /* synthetic */ DlRenewalUploadDocFlow copy$default(DlRenewalUploadDocFlow dlRenewalUploadDocFlow, String str, String str2, String str3, String str4, int i, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = dlRenewalUploadDocFlow.applNo;
        }
        if ((i2 & 2) != 0) {
            str2 = dlRenewalUploadDocFlow.transCode;
        }
        String str6 = str2;
        if ((i2 & 4) != 0) {
            str3 = dlRenewalUploadDocFlow.stateCode;
        }
        String str7 = str3;
        if ((i2 & 8) != 0) {
            str4 = dlRenewalUploadDocFlow.rtoCode;
        }
        String str8 = str4;
        if ((i2 & 16) != 0) {
            i = dlRenewalUploadDocFlow.acCode;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            str5 = dlRenewalUploadDocFlow.acStatus;
        }
        return dlRenewalUploadDocFlow.copy(str, str6, str7, str8, i3, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApplNo() {
        return this.applNo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTransCode() {
        return this.transCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStateCode() {
        return this.stateCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRtoCode() {
        return this.rtoCode;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getAcCode() {
        return this.acCode;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAcStatus() {
        return this.acStatus;
    }

    public final DlRenewalUploadDocFlow copy(String applNo, String transCode, String stateCode, String rtoCode, int acCode, String acStatus) {
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(transCode, "transCode");
        Intrinsics.checkNotNullParameter(stateCode, "stateCode");
        Intrinsics.checkNotNullParameter(rtoCode, "rtoCode");
        Intrinsics.checkNotNullParameter(acStatus, "acStatus");
        return new DlRenewalUploadDocFlow(applNo, transCode, stateCode, rtoCode, acCode, acStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DlRenewalUploadDocFlow)) {
            return false;
        }
        DlRenewalUploadDocFlow dlRenewalUploadDocFlow = (DlRenewalUploadDocFlow) other;
        return Intrinsics.areEqual(this.applNo, dlRenewalUploadDocFlow.applNo) && Intrinsics.areEqual(this.transCode, dlRenewalUploadDocFlow.transCode) && Intrinsics.areEqual(this.stateCode, dlRenewalUploadDocFlow.stateCode) && Intrinsics.areEqual(this.rtoCode, dlRenewalUploadDocFlow.rtoCode) && this.acCode == dlRenewalUploadDocFlow.acCode && Intrinsics.areEqual(this.acStatus, dlRenewalUploadDocFlow.acStatus);
    }

    public final int getAcCode() {
        return this.acCode;
    }

    public final String getAcStatus() {
        return this.acStatus;
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final String getRtoCode() {
        return this.rtoCode;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public final String getTransCode() {
        return this.transCode;
    }

    public int hashCode() {
        return (((((((((this.applNo.hashCode() * 31) + this.transCode.hashCode()) * 31) + this.stateCode.hashCode()) * 31) + this.rtoCode.hashCode()) * 31) + Integer.hashCode(this.acCode)) * 31) + this.acStatus.hashCode();
    }

    public final void setAcCode(int i) {
        this.acCode = i;
    }

    public final void setAcStatus(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.acStatus = str;
    }

    public final void setApplNo(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.applNo = str;
    }

    public final void setRtoCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rtoCode = str;
    }

    public final void setStateCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stateCode = str;
    }

    public final void setTransCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.transCode = str;
    }

    public String toString() {
        return "{\"applNo\":\"" + this.applNo + "\", \"transCode\":\"" + this.transCode + "\", \"stateCode\":\"" + this.stateCode + "\", \"acCode\":\"" + this.acCode + "\", \"rtoCode\":\"" + this.rtoCode + "\", \"acStatus\":\"" + this.acStatus + "\"}";
    }
}
