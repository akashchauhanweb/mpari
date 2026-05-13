package com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVModel;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003Ji\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006)"}, d2 = {"Lcom/nic/mparivahan/VahanServices/AlterationOfVehicle/AOVModel/AlertReqBeforePayment;", "Ljava/io/Serializable;", "aadhaartxno", "", "aadharauth", "appl_no", "application_status", "", "off_cd", "pur_cd", "regn_no", "state_cd", "status", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAadhaartxno", "()Ljava/lang/String;", "getAadharauth", "getAppl_no", "getApplication_status", "()Z", "getOff_cd", "getPur_cd", "getRegn_no", "getState_cd", "getStatus", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AlertReqBeforePayment implements Serializable {
    private final String aadhaartxno;
    private final String aadharauth;
    private final String appl_no;
    private final boolean application_status;
    private final String off_cd;
    private final String pur_cd;
    private final String regn_no;
    private final String state_cd;
    private final String status;

    public AlertReqBeforePayment(String str, String str2, String str3, boolean z, String off_cd, String pur_cd, String regn_no, String state_cd, String status) {
        Intrinsics.checkNotNullParameter(off_cd, "off_cd");
        Intrinsics.checkNotNullParameter(pur_cd, "pur_cd");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(status, "status");
        this.aadhaartxno = str;
        this.aadharauth = str2;
        this.appl_no = str3;
        this.application_status = z;
        this.off_cd = off_cd;
        this.pur_cd = pur_cd;
        this.regn_no = regn_no;
        this.state_cd = state_cd;
        this.status = status;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAadhaartxno() {
        return this.aadhaartxno;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAadharauth() {
        return this.aadharauth;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAppl_no() {
        return this.appl_no;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getApplication_status() {
        return this.application_status;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOff_cd() {
        return this.off_cd;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPur_cd() {
        return this.pur_cd;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getRegn_no() {
        return this.regn_no;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getState_cd() {
        return this.state_cd;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final AlertReqBeforePayment copy(String aadhaartxno, String aadharauth, String appl_no, boolean application_status, String off_cd, String pur_cd, String regn_no, String state_cd, String status) {
        Intrinsics.checkNotNullParameter(off_cd, "off_cd");
        Intrinsics.checkNotNullParameter(pur_cd, "pur_cd");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(status, "status");
        return new AlertReqBeforePayment(aadhaartxno, aadharauth, appl_no, application_status, off_cd, pur_cd, regn_no, state_cd, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlertReqBeforePayment)) {
            return false;
        }
        AlertReqBeforePayment alertReqBeforePayment = (AlertReqBeforePayment) other;
        return Intrinsics.areEqual(this.aadhaartxno, alertReqBeforePayment.aadhaartxno) && Intrinsics.areEqual(this.aadharauth, alertReqBeforePayment.aadharauth) && Intrinsics.areEqual(this.appl_no, alertReqBeforePayment.appl_no) && this.application_status == alertReqBeforePayment.application_status && Intrinsics.areEqual(this.off_cd, alertReqBeforePayment.off_cd) && Intrinsics.areEqual(this.pur_cd, alertReqBeforePayment.pur_cd) && Intrinsics.areEqual(this.regn_no, alertReqBeforePayment.regn_no) && Intrinsics.areEqual(this.state_cd, alertReqBeforePayment.state_cd) && Intrinsics.areEqual(this.status, alertReqBeforePayment.status);
    }

    public final String getAadhaartxno() {
        return this.aadhaartxno;
    }

    public final String getAadharauth() {
        return this.aadharauth;
    }

    public final String getAppl_no() {
        return this.appl_no;
    }

    public final boolean getApplication_status() {
        return this.application_status;
    }

    public final String getOff_cd() {
        return this.off_cd;
    }

    public final String getPur_cd() {
        return this.pur_cd;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public final String getStatus() {
        return this.status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    public int hashCode() {
        String str = this.aadhaartxno;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.aadharauth;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.appl_no;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z = this.application_status;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((((((((iHashCode3 + r1) * 31) + this.off_cd.hashCode()) * 31) + this.pur_cd.hashCode()) * 31) + this.regn_no.hashCode()) * 31) + this.state_cd.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "AlertReqBeforePayment(aadhaartxno=" + this.aadhaartxno + ", aadharauth=" + this.aadharauth + ", appl_no=" + this.appl_no + ", application_status=" + this.application_status + ", off_cd=" + this.off_cd + ", pur_cd=" + this.pur_cd + ", regn_no=" + this.regn_no + ", state_cd=" + this.state_cd + ", status=" + this.status + ')';
    }
}
