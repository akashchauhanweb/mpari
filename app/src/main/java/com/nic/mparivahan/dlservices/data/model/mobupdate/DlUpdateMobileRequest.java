package com.nic.mparivahan.dlservices.data.model.mobupdate;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003JV\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013¨\u0006*"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/mobupdate/DlUpdateMobileRequest;", "Ljava/io/Serializable;", "p2Dob", "", "p3Type", "p4OldMob", "enc", "", "p1DlNumber", "p5NewMob", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getEnc", "()Ljava/lang/Boolean;", "setEnc", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getP1DlNumber", "()Ljava/lang/String;", "setP1DlNumber", "(Ljava/lang/String;)V", "getP2Dob", "setP2Dob", "getP3Type", "setP3Type", "getP4OldMob", "setP4OldMob", "getP5NewMob", "setP5NewMob", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/nic/mparivahan/dlservices/data/model/mobupdate/DlUpdateMobileRequest;", "equals", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DlUpdateMobileRequest implements Serializable {
    private Boolean enc;
    private String p1DlNumber;
    private String p2Dob;
    private String p3Type;
    private String p4OldMob;
    private String p5NewMob;

    public DlUpdateMobileRequest(String str, String str2, String str3, Boolean bool, String str4, String str5) {
        this.p2Dob = str;
        this.p3Type = str2;
        this.p4OldMob = str3;
        this.enc = bool;
        this.p1DlNumber = str4;
        this.p5NewMob = str5;
    }

    public static /* synthetic */ DlUpdateMobileRequest copy$default(DlUpdateMobileRequest dlUpdateMobileRequest, String str, String str2, String str3, Boolean bool, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dlUpdateMobileRequest.p2Dob;
        }
        if ((i & 2) != 0) {
            str2 = dlUpdateMobileRequest.p3Type;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = dlUpdateMobileRequest.p4OldMob;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            bool = dlUpdateMobileRequest.enc;
        }
        Boolean bool2 = bool;
        if ((i & 16) != 0) {
            str4 = dlUpdateMobileRequest.p1DlNumber;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = dlUpdateMobileRequest.p5NewMob;
        }
        return dlUpdateMobileRequest.copy(str, str6, str7, bool2, str8, str5);
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
    public final String getP4OldMob() {
        return this.p4OldMob;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getEnc() {
        return this.enc;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getP1DlNumber() {
        return this.p1DlNumber;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getP5NewMob() {
        return this.p5NewMob;
    }

    public final DlUpdateMobileRequest copy(String p2Dob, String p3Type, String p4OldMob, Boolean enc, String p1DlNumber, String p5NewMob) {
        return new DlUpdateMobileRequest(p2Dob, p3Type, p4OldMob, enc, p1DlNumber, p5NewMob);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DlUpdateMobileRequest)) {
            return false;
        }
        DlUpdateMobileRequest dlUpdateMobileRequest = (DlUpdateMobileRequest) other;
        return Intrinsics.areEqual(this.p2Dob, dlUpdateMobileRequest.p2Dob) && Intrinsics.areEqual(this.p3Type, dlUpdateMobileRequest.p3Type) && Intrinsics.areEqual(this.p4OldMob, dlUpdateMobileRequest.p4OldMob) && Intrinsics.areEqual(this.enc, dlUpdateMobileRequest.enc) && Intrinsics.areEqual(this.p1DlNumber, dlUpdateMobileRequest.p1DlNumber) && Intrinsics.areEqual(this.p5NewMob, dlUpdateMobileRequest.p5NewMob);
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

    public final String getP4OldMob() {
        return this.p4OldMob;
    }

    public final String getP5NewMob() {
        return this.p5NewMob;
    }

    public int hashCode() {
        String str = this.p2Dob;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.p3Type;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.p4OldMob;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.enc;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.p1DlNumber;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.p5NewMob;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
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

    public final void setP4OldMob(String str) {
        this.p4OldMob = str;
    }

    public final void setP5NewMob(String str) {
        this.p5NewMob = str;
    }

    public String toString() {
        return "DlUpdateMobileRequest(p2Dob=" + this.p2Dob + ", p3Type=" + this.p3Type + ", p4OldMob=" + this.p4OldMob + ", enc=" + this.enc + ", p1DlNumber=" + this.p1DlNumber + ", p5NewMob=" + this.p5NewMob + ')';
    }
}
