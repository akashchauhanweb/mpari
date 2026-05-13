package com.nic.mparivahan.VahanServices.ApplicationStatusModel;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b2\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003¢\u0006\u0002\u0010\u0017J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u000fHÆ\u0003J\t\u00100\u001a\u00020\u0011HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u000fHÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0006HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0006HÆ\u0003J\t\u0010;\u001a\u00020\u0006HÆ\u0003J\t\u0010<\u001a\u00020\u0006HÆ\u0003J\t\u0010=\u001a\u00020\u0006HÆ\u0003J³\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u0003HÆ\u0001J\u0013\u0010?\u001a\u00020\u00062\b\u0010@\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010A\u001a\u00020\u0011HÖ\u0001J\t\u0010B\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019R\u0011\u0010\u0013\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0019R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0019R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0019¨\u0006C"}, d2 = {"Lcom/nic/mparivahan/VahanServices/ApplicationStatusModel/Applnolist;", "Ljava/io/Serializable;", "appl_dt", "", "appl_no", "appointmentpending", "", "approvalStatus", "auth_mode", "facelesstransaction", "isdocuploadpending", "isdraftpending", "isrtorejection", "offName", "office", "", "purCd", "", "purCdDescr", "regnNo", "regno", "status", "statusDesc", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;Ljava/lang/Object;ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppl_dt", "()Ljava/lang/String;", "getAppl_no", "getAppointmentpending", "()Z", "getApprovalStatus", "getAuth_mode", "getFacelesstransaction", "getIsdocuploadpending", "getIsdraftpending", "getIsrtorejection", "getOffName", "getOffice", "()Ljava/lang/Object;", "getPurCd", "()I", "getPurCdDescr", "getRegnNo", "getRegno", "getStatus", "getStatusDesc", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Applnolist implements Serializable {
    private final String appl_dt;
    private final String appl_no;
    private final boolean appointmentpending;
    private final String approvalStatus;
    private final String auth_mode;
    private final boolean facelesstransaction;
    private final boolean isdocuploadpending;
    private final boolean isdraftpending;
    private final boolean isrtorejection;
    private final String offName;
    private final Object office;
    private final int purCd;
    private final String purCdDescr;
    private final Object regnNo;
    private final String regno;
    private final String status;
    private final String statusDesc;

    public Applnolist(String appl_dt, String appl_no, boolean z, String approvalStatus, String auth_mode, boolean z2, boolean z3, boolean z4, boolean z5, String offName, Object office, int i, String purCdDescr, Object regnNo, String regno, String status, String statusDesc) {
        Intrinsics.checkNotNullParameter(appl_dt, "appl_dt");
        Intrinsics.checkNotNullParameter(appl_no, "appl_no");
        Intrinsics.checkNotNullParameter(approvalStatus, "approvalStatus");
        Intrinsics.checkNotNullParameter(auth_mode, "auth_mode");
        Intrinsics.checkNotNullParameter(offName, "offName");
        Intrinsics.checkNotNullParameter(office, "office");
        Intrinsics.checkNotNullParameter(purCdDescr, "purCdDescr");
        Intrinsics.checkNotNullParameter(regnNo, "regnNo");
        Intrinsics.checkNotNullParameter(regno, "regno");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        this.appl_dt = appl_dt;
        this.appl_no = appl_no;
        this.appointmentpending = z;
        this.approvalStatus = approvalStatus;
        this.auth_mode = auth_mode;
        this.facelesstransaction = z2;
        this.isdocuploadpending = z3;
        this.isdraftpending = z4;
        this.isrtorejection = z5;
        this.offName = offName;
        this.office = office;
        this.purCd = i;
        this.purCdDescr = purCdDescr;
        this.regnNo = regnNo;
        this.regno = regno;
        this.status = status;
        this.statusDesc = statusDesc;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAppl_dt() {
        return this.appl_dt;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getOffName() {
        return this.offName;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Object getOffice() {
        return this.office;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getPurCd() {
        return this.purCd;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getPurCdDescr() {
        return this.purCdDescr;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Object getRegnNo() {
        return this.regnNo;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getRegno() {
        return this.regno;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getStatusDesc() {
        return this.statusDesc;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAppl_no() {
        return this.appl_no;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getAppointmentpending() {
        return this.appointmentpending;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getApprovalStatus() {
        return this.approvalStatus;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAuth_mode() {
        return this.auth_mode;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getFacelesstransaction() {
        return this.facelesstransaction;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsdocuploadpending() {
        return this.isdocuploadpending;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsdraftpending() {
        return this.isdraftpending;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsrtorejection() {
        return this.isrtorejection;
    }

    public final Applnolist copy(String appl_dt, String appl_no, boolean appointmentpending, String approvalStatus, String auth_mode, boolean facelesstransaction, boolean isdocuploadpending, boolean isdraftpending, boolean isrtorejection, String offName, Object office, int purCd, String purCdDescr, Object regnNo, String regno, String status, String statusDesc) {
        Intrinsics.checkNotNullParameter(appl_dt, "appl_dt");
        Intrinsics.checkNotNullParameter(appl_no, "appl_no");
        Intrinsics.checkNotNullParameter(approvalStatus, "approvalStatus");
        Intrinsics.checkNotNullParameter(auth_mode, "auth_mode");
        Intrinsics.checkNotNullParameter(offName, "offName");
        Intrinsics.checkNotNullParameter(office, "office");
        Intrinsics.checkNotNullParameter(purCdDescr, "purCdDescr");
        Intrinsics.checkNotNullParameter(regnNo, "regnNo");
        Intrinsics.checkNotNullParameter(regno, "regno");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        return new Applnolist(appl_dt, appl_no, appointmentpending, approvalStatus, auth_mode, facelesstransaction, isdocuploadpending, isdraftpending, isrtorejection, offName, office, purCd, purCdDescr, regnNo, regno, status, statusDesc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Applnolist)) {
            return false;
        }
        Applnolist applnolist = (Applnolist) other;
        return Intrinsics.areEqual(this.appl_dt, applnolist.appl_dt) && Intrinsics.areEqual(this.appl_no, applnolist.appl_no) && this.appointmentpending == applnolist.appointmentpending && Intrinsics.areEqual(this.approvalStatus, applnolist.approvalStatus) && Intrinsics.areEqual(this.auth_mode, applnolist.auth_mode) && this.facelesstransaction == applnolist.facelesstransaction && this.isdocuploadpending == applnolist.isdocuploadpending && this.isdraftpending == applnolist.isdraftpending && this.isrtorejection == applnolist.isrtorejection && Intrinsics.areEqual(this.offName, applnolist.offName) && Intrinsics.areEqual(this.office, applnolist.office) && this.purCd == applnolist.purCd && Intrinsics.areEqual(this.purCdDescr, applnolist.purCdDescr) && Intrinsics.areEqual(this.regnNo, applnolist.regnNo) && Intrinsics.areEqual(this.regno, applnolist.regno) && Intrinsics.areEqual(this.status, applnolist.status) && Intrinsics.areEqual(this.statusDesc, applnolist.statusDesc);
    }

    public final String getAppl_dt() {
        return this.appl_dt;
    }

    public final String getAppl_no() {
        return this.appl_no;
    }

    public final boolean getAppointmentpending() {
        return this.appointmentpending;
    }

    public final String getApprovalStatus() {
        return this.approvalStatus;
    }

    public final String getAuth_mode() {
        return this.auth_mode;
    }

    public final boolean getFacelesstransaction() {
        return this.facelesstransaction;
    }

    public final boolean getIsdocuploadpending() {
        return this.isdocuploadpending;
    }

    public final boolean getIsdraftpending() {
        return this.isdraftpending;
    }

    public final boolean getIsrtorejection() {
        return this.isrtorejection;
    }

    public final String getOffName() {
        return this.offName;
    }

    public final Object getOffice() {
        return this.office;
    }

    public final int getPurCd() {
        return this.purCd;
    }

    public final String getPurCdDescr() {
        return this.purCdDescr;
    }

    public final Object getRegnNo() {
        return this.regnNo;
    }

    public final String getRegno() {
        return this.regno;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((this.appl_dt.hashCode() * 31) + this.appl_no.hashCode()) * 31;
        boolean z = this.appointmentpending;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iHashCode2 = (((((iHashCode + r1) * 31) + this.approvalStatus.hashCode()) * 31) + this.auth_mode.hashCode()) * 31;
        boolean z2 = this.facelesstransaction;
        ?? r12 = z2;
        if (z2) {
            r12 = 1;
        }
        int i = (iHashCode2 + r12) * 31;
        boolean z3 = this.isdocuploadpending;
        ?? r13 = z3;
        if (z3) {
            r13 = 1;
        }
        int i2 = (i + r13) * 31;
        boolean z4 = this.isdraftpending;
        ?? r14 = z4;
        if (z4) {
            r14 = 1;
        }
        int i3 = (i2 + r14) * 31;
        boolean z5 = this.isrtorejection;
        return ((((((((((((((((i3 + (z5 ? 1 : z5)) * 31) + this.offName.hashCode()) * 31) + this.office.hashCode()) * 31) + Integer.hashCode(this.purCd)) * 31) + this.purCdDescr.hashCode()) * 31) + this.regnNo.hashCode()) * 31) + this.regno.hashCode()) * 31) + this.status.hashCode()) * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "Applnolist(appl_dt=" + this.appl_dt + ", appl_no=" + this.appl_no + ", appointmentpending=" + this.appointmentpending + ", approvalStatus=" + this.approvalStatus + ", auth_mode=" + this.auth_mode + ", facelesstransaction=" + this.facelesstransaction + ", isdocuploadpending=" + this.isdocuploadpending + ", isdraftpending=" + this.isdraftpending + ", isrtorejection=" + this.isrtorejection + ", offName=" + this.offName + ", office=" + this.office + ", purCd=" + this.purCd + ", purCdDescr=" + this.purCdDescr + ", regnNo=" + this.regnNo + ", regno=" + this.regno + ", status=" + this.status + ", statusDesc=" + this.statusDesc + ')';
    }
}
