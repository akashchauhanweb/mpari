package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b,\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010(\u001a\u00020\fHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00102\u001a\u00020\tHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00104\u001a\u00020\fHÆ\u0003J\t\u00105\u001a\u00020\fHÆ\u0003Jµ\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00107\u001a\u00020\t2\b\u00108\u001a\u0004\u0018\u000109HÖ\u0003J\t\u0010:\u001a\u00020\fHÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0016R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0016¨\u0006<"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/NocDraftResponse;", "Ljava/io/Serializable;", "appl_no", "", "dispatch_no", "issue_date", "ncrb_ref", "new_own_name", "nocRetention", "", "noc_dt", "off_cd", "", "off_to", "reason", "regn_no", "rto_to", "state_cd", "state_to", "aadhaartxno", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAadhaartxno", "()Ljava/lang/String;", "getAppl_no", "getDispatch_no", "getIssue_date", "getNcrb_ref", "getNew_own_name", "getNocRetention", "()Z", "getNoc_dt", "getOff_cd", "()I", "getOff_to", "getReason", "getRegn_no", "getRto_to", "getState_cd", "getState_to", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class NocDraftResponse implements Serializable {
    private final String aadhaartxno;
    private final String appl_no;
    private final String dispatch_no;
    private final String issue_date;
    private final String ncrb_ref;
    private final String new_own_name;
    private final boolean nocRetention;
    private final String noc_dt;
    private final int off_cd;
    private final int off_to;
    private final int reason;
    private final String regn_no;
    private final String rto_to;
    private final String state_cd;
    private final String state_to;

    public NocDraftResponse(String str, String str2, String str3, String str4, String str5, boolean z, String str6, int i, int i2, int i3, String str7, String str8, String str9, String str10, String str11) {
        this.appl_no = str;
        this.dispatch_no = str2;
        this.issue_date = str3;
        this.ncrb_ref = str4;
        this.new_own_name = str5;
        this.nocRetention = z;
        this.noc_dt = str6;
        this.off_cd = i;
        this.off_to = i2;
        this.reason = i3;
        this.regn_no = str7;
        this.rto_to = str8;
        this.state_cd = str9;
        this.state_to = str10;
        this.aadhaartxno = str11;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAppl_no() {
        return this.appl_no;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getRegn_no() {
        return this.regn_no;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getRto_to() {
        return this.rto_to;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getState_cd() {
        return this.state_cd;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getState_to() {
        return this.state_to;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getAadhaartxno() {
        return this.aadhaartxno;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDispatch_no() {
        return this.dispatch_no;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIssue_date() {
        return this.issue_date;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNcrb_ref() {
        return this.ncrb_ref;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNew_own_name() {
        return this.new_own_name;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getNocRetention() {
        return this.nocRetention;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getNoc_dt() {
        return this.noc_dt;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getOff_cd() {
        return this.off_cd;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getOff_to() {
        return this.off_to;
    }

    public final NocDraftResponse copy(String appl_no, String dispatch_no, String issue_date, String ncrb_ref, String new_own_name, boolean nocRetention, String noc_dt, int off_cd, int off_to, int reason, String regn_no, String rto_to, String state_cd, String state_to, String aadhaartxno) {
        return new NocDraftResponse(appl_no, dispatch_no, issue_date, ncrb_ref, new_own_name, nocRetention, noc_dt, off_cd, off_to, reason, regn_no, rto_to, state_cd, state_to, aadhaartxno);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NocDraftResponse)) {
            return false;
        }
        NocDraftResponse nocDraftResponse = (NocDraftResponse) other;
        return Intrinsics.areEqual(this.appl_no, nocDraftResponse.appl_no) && Intrinsics.areEqual(this.dispatch_no, nocDraftResponse.dispatch_no) && Intrinsics.areEqual(this.issue_date, nocDraftResponse.issue_date) && Intrinsics.areEqual(this.ncrb_ref, nocDraftResponse.ncrb_ref) && Intrinsics.areEqual(this.new_own_name, nocDraftResponse.new_own_name) && this.nocRetention == nocDraftResponse.nocRetention && Intrinsics.areEqual(this.noc_dt, nocDraftResponse.noc_dt) && this.off_cd == nocDraftResponse.off_cd && this.off_to == nocDraftResponse.off_to && this.reason == nocDraftResponse.reason && Intrinsics.areEqual(this.regn_no, nocDraftResponse.regn_no) && Intrinsics.areEqual(this.rto_to, nocDraftResponse.rto_to) && Intrinsics.areEqual(this.state_cd, nocDraftResponse.state_cd) && Intrinsics.areEqual(this.state_to, nocDraftResponse.state_to) && Intrinsics.areEqual(this.aadhaartxno, nocDraftResponse.aadhaartxno);
    }

    public final String getAadhaartxno() {
        return this.aadhaartxno;
    }

    public final String getAppl_no() {
        return this.appl_no;
    }

    public final String getDispatch_no() {
        return this.dispatch_no;
    }

    public final String getIssue_date() {
        return this.issue_date;
    }

    public final String getNcrb_ref() {
        return this.ncrb_ref;
    }

    public final String getNew_own_name() {
        return this.new_own_name;
    }

    public final boolean getNocRetention() {
        return this.nocRetention;
    }

    public final String getNoc_dt() {
        return this.noc_dt;
    }

    public final int getOff_cd() {
        return this.off_cd;
    }

    public final int getOff_to() {
        return this.off_to;
    }

    public final int getReason() {
        return this.reason;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final String getRto_to() {
        return this.rto_to;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public final String getState_to() {
        return this.state_to;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13, types: [int] */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v46 */
    public int hashCode() {
        String str = this.appl_no;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dispatch_no;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.issue_date;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.ncrb_ref;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.new_own_name;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        boolean z = this.nocRetention;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (iHashCode5 + r2) * 31;
        String str6 = this.noc_dt;
        int iHashCode6 = (((((((i + (str6 == null ? 0 : str6.hashCode())) * 31) + Integer.hashCode(this.off_cd)) * 31) + Integer.hashCode(this.off_to)) * 31) + Integer.hashCode(this.reason)) * 31;
        String str7 = this.regn_no;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.rto_to;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.state_cd;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.state_to;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.aadhaartxno;
        return iHashCode10 + (str11 != null ? str11.hashCode() : 0);
    }

    public String toString() {
        return "NocDraftResponse(appl_no=" + this.appl_no + ", dispatch_no=" + this.dispatch_no + ", issue_date=" + this.issue_date + ", ncrb_ref=" + this.ncrb_ref + ", new_own_name=" + this.new_own_name + ", nocRetention=" + this.nocRetention + ", noc_dt=" + this.noc_dt + ", off_cd=" + this.off_cd + ", off_to=" + this.off_to + ", reason=" + this.reason + ", regn_no=" + this.regn_no + ", rto_to=" + this.rto_to + ", state_cd=" + this.state_cd + ", state_to=" + this.state_to + ", aadhaartxno=" + this.aadhaartxno + ')';
    }
}
