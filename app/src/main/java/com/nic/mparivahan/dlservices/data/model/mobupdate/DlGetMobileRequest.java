package com.nic.mparivahan.dlservices.data.model.mobupdate;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J>\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011¨\u0006\""}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/mobupdate/DlGetMobileRequest;", "Ljava/io/Serializable;", "p2Dob", "", "p3Type", "enc", "", "p1DlNumber", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getEnc", "()Ljava/lang/Boolean;", "setEnc", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getP1DlNumber", "()Ljava/lang/String;", "setP1DlNumber", "(Ljava/lang/String;)V", "getP2Dob", "setP2Dob", "getP3Type", "setP3Type", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/nic/mparivahan/dlservices/data/model/mobupdate/DlGetMobileRequest;", "equals", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DlGetMobileRequest implements Serializable {
    private Boolean enc;
    private String p1DlNumber;
    private String p2Dob;
    private String p3Type;

    public DlGetMobileRequest(String str, String str2, Boolean bool, String str3) {
        this.p2Dob = str;
        this.p3Type = str2;
        this.enc = bool;
        this.p1DlNumber = str3;
    }

    public static /* synthetic */ DlGetMobileRequest copy$default(DlGetMobileRequest dlGetMobileRequest, String str, String str2, Boolean bool, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dlGetMobileRequest.p2Dob;
        }
        if ((i & 2) != 0) {
            str2 = dlGetMobileRequest.p3Type;
        }
        if ((i & 4) != 0) {
            bool = dlGetMobileRequest.enc;
        }
        if ((i & 8) != 0) {
            str3 = dlGetMobileRequest.p1DlNumber;
        }
        return dlGetMobileRequest.copy(str, str2, bool, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getP2Dob() {
        return this.p2Dob;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getP3Type() {
        return this.p3Type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getEnc() {
        return this.enc;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getP1DlNumber() {
        return this.p1DlNumber;
    }

    public final DlGetMobileRequest copy(String p2Dob, String p3Type, Boolean enc, String p1DlNumber) {
        return new DlGetMobileRequest(p2Dob, p3Type, enc, p1DlNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DlGetMobileRequest)) {
            return false;
        }
        DlGetMobileRequest dlGetMobileRequest = (DlGetMobileRequest) other;
        return Intrinsics.areEqual(this.p2Dob, dlGetMobileRequest.p2Dob) && Intrinsics.areEqual(this.p3Type, dlGetMobileRequest.p3Type) && Intrinsics.areEqual(this.enc, dlGetMobileRequest.enc) && Intrinsics.areEqual(this.p1DlNumber, dlGetMobileRequest.p1DlNumber);
    }

    public final Boolean getEnc() {
        return this.enc;
    }

    public final String getP1DlNumber() {
        return this.p1DlNumber;
    }

    public final String getP2Dob() {
        return this.p2Dob;
    }

    public final String getP3Type() {
        return this.p3Type;
    }

    public int hashCode() {
        String str = this.p2Dob;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.p3Type;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.enc;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.p1DlNumber;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setEnc(Boolean bool) {
        this.enc = bool;
    }

    public final void setP1DlNumber(String str) {
        this.p1DlNumber = str;
    }

    public final void setP2Dob(String str) {
        this.p2Dob = str;
    }

    public final void setP3Type(String str) {
        this.p3Type = str;
    }

    public String toString() {
        return "DlGetMobileRequest(p2Dob=" + this.p2Dob + ", p3Type=" + this.p3Type + ", enc=" + this.enc + ", p1DlNumber=" + this.p1DlNumber + ')';
    }
}
