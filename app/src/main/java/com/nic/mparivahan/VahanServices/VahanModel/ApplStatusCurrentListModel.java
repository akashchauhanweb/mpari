package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b?\b\u0087\b\u0018\u00002\u00020\u0001Bµ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0001\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u000f\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003¢\u0006\u0002\u0010\u001aJ\t\u00104\u001a\u00020\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00106\u001a\u00020\u000fHÆ\u0003J\t\u00107\u001a\u00020\u000fHÆ\u0003J\t\u00108\u001a\u00020\u000fHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u000fHÆ\u0003J\t\u0010<\u001a\u00020\u000fHÆ\u0003J\t\u0010=\u001a\u00020\u000fHÆ\u0003J\t\u0010>\u001a\u00020\u000fHÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0007HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0001HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003Jã\u0001\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u000f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u0003HÆ\u0001J\u0013\u0010J\u001a\u00020\u000f2\b\u0010K\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010L\u001a\u00020\u0007HÖ\u0001J\t\u0010M\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u0016\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0011\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0011\u0010\n\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0011\u0010\u0017\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u0011\u0010\u0015\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0011\u0010\u0014\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001cR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001cR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001cR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001c¨\u0006N"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/ApplStatusCurrentListModel;", "", "appl_no", "", "appl_dt", "regno", "purCd", "", "purCdDescr", "currentstatus", "curr_off_cd", "statusDesc", "registeredAt", "offName", "facelesstransaction", "", "isdocuploadpending", "appointmentpending", "receiptNo", "chassisNo", "isrtorejection", "isdraftpending", "appointmentRequired", "documentsRequired", "publicRemark", "auth_mode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;Ljava/lang/String;)V", "getAppl_dt", "()Ljava/lang/String;", "getAppl_no", "getAppointmentRequired", "()Z", "getAppointmentpending", "getAuth_mode", "getChassisNo", "getCurr_off_cd", "()Ljava/lang/Object;", "getCurrentstatus", "getDocumentsRequired", "getFacelesstransaction", "getIsdocuploadpending", "getIsdraftpending", "getIsrtorejection", "getOffName", "getPublicRemark", "getPurCd", "()I", "getPurCdDescr", "getReceiptNo", "getRegisteredAt", "getRegno", "getStatusDesc", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ApplStatusCurrentListModel {
    private final String appl_dt;
    private final String appl_no;
    private final boolean appointmentRequired;
    private final boolean appointmentpending;
    private final String auth_mode;
    private final String chassisNo;
    private final Object curr_off_cd;
    private final String currentstatus;
    private final boolean documentsRequired;
    private final boolean facelesstransaction;
    private final boolean isdocuploadpending;
    private final boolean isdraftpending;
    private final boolean isrtorejection;
    private final String offName;
    private final String publicRemark;
    private final int purCd;
    private final String purCdDescr;
    private final String receiptNo;
    private final String registeredAt;
    private final String regno;
    private final String statusDesc;

    public ApplStatusCurrentListModel(String appl_no, String appl_dt, String regno, int i, String purCdDescr, String currentstatus, Object curr_off_cd, String statusDesc, String registeredAt, String str, boolean z, boolean z2, boolean z3, String str2, String str3, boolean z4, boolean z5, boolean z6, boolean z7, String str4, String auth_mode) {
        Intrinsics.checkNotNullParameter(appl_no, "appl_no");
        Intrinsics.checkNotNullParameter(appl_dt, "appl_dt");
        Intrinsics.checkNotNullParameter(regno, "regno");
        Intrinsics.checkNotNullParameter(purCdDescr, "purCdDescr");
        Intrinsics.checkNotNullParameter(currentstatus, "currentstatus");
        Intrinsics.checkNotNullParameter(curr_off_cd, "curr_off_cd");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        Intrinsics.checkNotNullParameter(registeredAt, "registeredAt");
        Intrinsics.checkNotNullParameter(auth_mode, "auth_mode");
        this.appl_no = appl_no;
        this.appl_dt = appl_dt;
        this.regno = regno;
        this.purCd = i;
        this.purCdDescr = purCdDescr;
        this.currentstatus = currentstatus;
        this.curr_off_cd = curr_off_cd;
        this.statusDesc = statusDesc;
        this.registeredAt = registeredAt;
        this.offName = str;
        this.facelesstransaction = z;
        this.isdocuploadpending = z2;
        this.appointmentpending = z3;
        this.receiptNo = str2;
        this.chassisNo = str3;
        this.isrtorejection = z4;
        this.isdraftpending = z5;
        this.appointmentRequired = z6;
        this.documentsRequired = z7;
        this.publicRemark = str4;
        this.auth_mode = auth_mode;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAppl_no() {
        return this.appl_no;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getOffName() {
        return this.offName;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getFacelesstransaction() {
        return this.facelesstransaction;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getIsdocuploadpending() {
        return this.isdocuploadpending;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getAppointmentpending() {
        return this.appointmentpending;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getReceiptNo() {
        return this.receiptNo;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getChassisNo() {
        return this.chassisNo;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getIsrtorejection() {
        return this.isrtorejection;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final boolean getIsdraftpending() {
        return this.isdraftpending;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final boolean getAppointmentRequired() {
        return this.appointmentRequired;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final boolean getDocumentsRequired() {
        return this.documentsRequired;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAppl_dt() {
        return this.appl_dt;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getPublicRemark() {
        return this.publicRemark;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getAuth_mode() {
        return this.auth_mode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRegno() {
        return this.regno;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getPurCd() {
        return this.purCd;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPurCdDescr() {
        return this.purCdDescr;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCurrentstatus() {
        return this.currentstatus;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Object getCurr_off_cd() {
        return this.curr_off_cd;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getStatusDesc() {
        return this.statusDesc;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getRegisteredAt() {
        return this.registeredAt;
    }

    public final ApplStatusCurrentListModel copy(String appl_no, String appl_dt, String regno, int purCd, String purCdDescr, String currentstatus, Object curr_off_cd, String statusDesc, String registeredAt, String offName, boolean facelesstransaction, boolean isdocuploadpending, boolean appointmentpending, String receiptNo, String chassisNo, boolean isrtorejection, boolean isdraftpending, boolean appointmentRequired, boolean documentsRequired, String publicRemark, String auth_mode) {
        Intrinsics.checkNotNullParameter(appl_no, "appl_no");
        Intrinsics.checkNotNullParameter(appl_dt, "appl_dt");
        Intrinsics.checkNotNullParameter(regno, "regno");
        Intrinsics.checkNotNullParameter(purCdDescr, "purCdDescr");
        Intrinsics.checkNotNullParameter(currentstatus, "currentstatus");
        Intrinsics.checkNotNullParameter(curr_off_cd, "curr_off_cd");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        Intrinsics.checkNotNullParameter(registeredAt, "registeredAt");
        Intrinsics.checkNotNullParameter(auth_mode, "auth_mode");
        return new ApplStatusCurrentListModel(appl_no, appl_dt, regno, purCd, purCdDescr, currentstatus, curr_off_cd, statusDesc, registeredAt, offName, facelesstransaction, isdocuploadpending, appointmentpending, receiptNo, chassisNo, isrtorejection, isdraftpending, appointmentRequired, documentsRequired, publicRemark, auth_mode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApplStatusCurrentListModel)) {
            return false;
        }
        ApplStatusCurrentListModel applStatusCurrentListModel = (ApplStatusCurrentListModel) other;
        return Intrinsics.areEqual(this.appl_no, applStatusCurrentListModel.appl_no) && Intrinsics.areEqual(this.appl_dt, applStatusCurrentListModel.appl_dt) && Intrinsics.areEqual(this.regno, applStatusCurrentListModel.regno) && this.purCd == applStatusCurrentListModel.purCd && Intrinsics.areEqual(this.purCdDescr, applStatusCurrentListModel.purCdDescr) && Intrinsics.areEqual(this.currentstatus, applStatusCurrentListModel.currentstatus) && Intrinsics.areEqual(this.curr_off_cd, applStatusCurrentListModel.curr_off_cd) && Intrinsics.areEqual(this.statusDesc, applStatusCurrentListModel.statusDesc) && Intrinsics.areEqual(this.registeredAt, applStatusCurrentListModel.registeredAt) && Intrinsics.areEqual(this.offName, applStatusCurrentListModel.offName) && this.facelesstransaction == applStatusCurrentListModel.facelesstransaction && this.isdocuploadpending == applStatusCurrentListModel.isdocuploadpending && this.appointmentpending == applStatusCurrentListModel.appointmentpending && Intrinsics.areEqual(this.receiptNo, applStatusCurrentListModel.receiptNo) && Intrinsics.areEqual(this.chassisNo, applStatusCurrentListModel.chassisNo) && this.isrtorejection == applStatusCurrentListModel.isrtorejection && this.isdraftpending == applStatusCurrentListModel.isdraftpending && this.appointmentRequired == applStatusCurrentListModel.appointmentRequired && this.documentsRequired == applStatusCurrentListModel.documentsRequired && Intrinsics.areEqual(this.publicRemark, applStatusCurrentListModel.publicRemark) && Intrinsics.areEqual(this.auth_mode, applStatusCurrentListModel.auth_mode);
    }

    public final String getAppl_dt() {
        return this.appl_dt;
    }

    public final String getAppl_no() {
        return this.appl_no;
    }

    public final boolean getAppointmentRequired() {
        return this.appointmentRequired;
    }

    public final boolean getAppointmentpending() {
        return this.appointmentpending;
    }

    public final String getAuth_mode() {
        return this.auth_mode;
    }

    public final String getChassisNo() {
        return this.chassisNo;
    }

    public final Object getCurr_off_cd() {
        return this.curr_off_cd;
    }

    public final String getCurrentstatus() {
        return this.currentstatus;
    }

    public final boolean getDocumentsRequired() {
        return this.documentsRequired;
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

    public final String getPublicRemark() {
        return this.publicRemark;
    }

    public final int getPurCd() {
        return this.purCd;
    }

    public final String getPurCdDescr() {
        return this.purCdDescr;
    }

    public final String getReceiptNo() {
        return this.receiptNo;
    }

    public final String getRegisteredAt() {
        return this.registeredAt;
    }

    public final String getRegno() {
        return this.regno;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v20, types: [int] */
    /* JADX WARN: Type inference failed for: r1v22, types: [int] */
    /* JADX WARN: Type inference failed for: r1v24, types: [int] */
    /* JADX WARN: Type inference failed for: r1v32, types: [int] */
    /* JADX WARN: Type inference failed for: r1v34, types: [int] */
    /* JADX WARN: Type inference failed for: r1v36, types: [int] */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r1v54 */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public int hashCode() {
        int iHashCode = ((((((((((((((((this.appl_no.hashCode() * 31) + this.appl_dt.hashCode()) * 31) + this.regno.hashCode()) * 31) + Integer.hashCode(this.purCd)) * 31) + this.purCdDescr.hashCode()) * 31) + this.currentstatus.hashCode()) * 31) + this.curr_off_cd.hashCode()) * 31) + this.statusDesc.hashCode()) * 31) + this.registeredAt.hashCode()) * 31;
        String str = this.offName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.facelesstransaction;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode2 + r1) * 31;
        boolean z2 = this.isdocuploadpending;
        ?? r12 = z2;
        if (z2) {
            r12 = 1;
        }
        int i2 = (i + r12) * 31;
        boolean z3 = this.appointmentpending;
        ?? r13 = z3;
        if (z3) {
            r13 = 1;
        }
        int i3 = (i2 + r13) * 31;
        String str2 = this.receiptNo;
        int iHashCode3 = (i3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.chassisNo;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z4 = this.isrtorejection;
        ?? r14 = z4;
        if (z4) {
            r14 = 1;
        }
        int i4 = (iHashCode4 + r14) * 31;
        boolean z5 = this.isdraftpending;
        ?? r15 = z5;
        if (z5) {
            r15 = 1;
        }
        int i5 = (i4 + r15) * 31;
        boolean z6 = this.appointmentRequired;
        ?? r16 = z6;
        if (z6) {
            r16 = 1;
        }
        int i6 = (i5 + r16) * 31;
        boolean z7 = this.documentsRequired;
        int i7 = (i6 + (z7 ? 1 : z7)) * 31;
        String str4 = this.publicRemark;
        return ((i7 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.auth_mode.hashCode();
    }

    public String toString() {
        return "ApplStatusCurrentListModel(appl_no=" + this.appl_no + ", appl_dt=" + this.appl_dt + ", regno=" + this.regno + ", purCd=" + this.purCd + ", purCdDescr=" + this.purCdDescr + ", currentstatus=" + this.currentstatus + ", curr_off_cd=" + this.curr_off_cd + ", statusDesc=" + this.statusDesc + ", registeredAt=" + this.registeredAt + ", offName=" + this.offName + ", facelesstransaction=" + this.facelesstransaction + ", isdocuploadpending=" + this.isdocuploadpending + ", appointmentpending=" + this.appointmentpending + ", receiptNo=" + this.receiptNo + ", chassisNo=" + this.chassisNo + ", isrtorejection=" + this.isrtorejection + ", isdraftpending=" + this.isdraftpending + ", appointmentRequired=" + this.appointmentRequired + ", documentsRequired=" + this.documentsRequired + ", publicRemark=" + this.publicRemark + ", auth_mode=" + this.auth_mode + ')';
    }
}
