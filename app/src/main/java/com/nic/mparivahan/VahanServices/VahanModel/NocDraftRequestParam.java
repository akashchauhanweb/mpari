package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b(\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0002\u0010\u0013J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\tHÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\rHÆ\u0003J\u0095\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u0003HÆ\u0001J\u0013\u00104\u001a\u00020\t2\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u00020\rHÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0015¨\u00069"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/NocDraftRequestParam;", "Ljava/io/Serializable;", "appl_no", "", "dispatch_no", "issue_date", "ncrb_ref", "new_own_name", "nocRetention", "", "noc_dt", "off_cd", "off_to", "", "reason", "regn_no", "rto_to", "state_cd", "state_to", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppl_no", "()Ljava/lang/String;", "getDispatch_no", "getIssue_date", "getNcrb_ref", "getNew_own_name", "getNocRetention", "()Z", "getNoc_dt", "getOff_cd", "getOff_to", "()I", "getReason", "getRegn_no", "getRto_to", "getState_cd", "getState_to", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class NocDraftRequestParam implements Serializable {
    private final String appl_no;
    private final String dispatch_no;
    private final String issue_date;
    private final String ncrb_ref;
    private final String new_own_name;
    private final boolean nocRetention;
    private final String noc_dt;
    private final String off_cd;
    private final int off_to;
    private final int reason;
    private final String regn_no;
    private final String rto_to;
    private final String state_cd;
    private final String state_to;

    public NocDraftRequestParam(String appl_no, String dispatch_no, String issue_date, String ncrb_ref, String new_own_name, boolean z, String noc_dt, String off_cd, int i, int i2, String regn_no, String rto_to, String state_cd, String state_to) {
        Intrinsics.checkNotNullParameter(appl_no, "appl_no");
        Intrinsics.checkNotNullParameter(dispatch_no, "dispatch_no");
        Intrinsics.checkNotNullParameter(issue_date, "issue_date");
        Intrinsics.checkNotNullParameter(ncrb_ref, "ncrb_ref");
        Intrinsics.checkNotNullParameter(new_own_name, "new_own_name");
        Intrinsics.checkNotNullParameter(noc_dt, "noc_dt");
        Intrinsics.checkNotNullParameter(off_cd, "off_cd");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(rto_to, "rto_to");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(state_to, "state_to");
        this.appl_no = appl_no;
        this.dispatch_no = dispatch_no;
        this.issue_date = issue_date;
        this.ncrb_ref = ncrb_ref;
        this.new_own_name = new_own_name;
        this.nocRetention = z;
        this.noc_dt = noc_dt;
        this.off_cd = off_cd;
        this.off_to = i;
        this.reason = i2;
        this.regn_no = regn_no;
        this.rto_to = rto_to;
        this.state_cd = state_cd;
        this.state_to = state_to;
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
    public final String getOff_cd() {
        return this.off_cd;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getOff_to() {
        return this.off_to;
    }

    public final NocDraftRequestParam copy(String appl_no, String dispatch_no, String issue_date, String ncrb_ref, String new_own_name, boolean nocRetention, String noc_dt, String off_cd, int off_to, int reason, String regn_no, String rto_to, String state_cd, String state_to) {
        Intrinsics.checkNotNullParameter(appl_no, "appl_no");
        Intrinsics.checkNotNullParameter(dispatch_no, "dispatch_no");
        Intrinsics.checkNotNullParameter(issue_date, "issue_date");
        Intrinsics.checkNotNullParameter(ncrb_ref, "ncrb_ref");
        Intrinsics.checkNotNullParameter(new_own_name, "new_own_name");
        Intrinsics.checkNotNullParameter(noc_dt, "noc_dt");
        Intrinsics.checkNotNullParameter(off_cd, "off_cd");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(rto_to, "rto_to");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(state_to, "state_to");
        return new NocDraftRequestParam(appl_no, dispatch_no, issue_date, ncrb_ref, new_own_name, nocRetention, noc_dt, off_cd, off_to, reason, regn_no, rto_to, state_cd, state_to);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NocDraftRequestParam)) {
            return false;
        }
        NocDraftRequestParam nocDraftRequestParam = (NocDraftRequestParam) other;
        return Intrinsics.areEqual(this.appl_no, nocDraftRequestParam.appl_no) && Intrinsics.areEqual(this.dispatch_no, nocDraftRequestParam.dispatch_no) && Intrinsics.areEqual(this.issue_date, nocDraftRequestParam.issue_date) && Intrinsics.areEqual(this.ncrb_ref, nocDraftRequestParam.ncrb_ref) && Intrinsics.areEqual(this.new_own_name, nocDraftRequestParam.new_own_name) && this.nocRetention == nocDraftRequestParam.nocRetention && Intrinsics.areEqual(this.noc_dt, nocDraftRequestParam.noc_dt) && Intrinsics.areEqual(this.off_cd, nocDraftRequestParam.off_cd) && this.off_to == nocDraftRequestParam.off_to && this.reason == nocDraftRequestParam.reason && Intrinsics.areEqual(this.regn_no, nocDraftRequestParam.regn_no) && Intrinsics.areEqual(this.rto_to, nocDraftRequestParam.rto_to) && Intrinsics.areEqual(this.state_cd, nocDraftRequestParam.state_cd) && Intrinsics.areEqual(this.state_to, nocDraftRequestParam.state_to);
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

    public final String getOff_cd() {
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
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    public int hashCode() {
        int iHashCode = ((((((((this.appl_no.hashCode() * 31) + this.dispatch_no.hashCode()) * 31) + this.issue_date.hashCode()) * 31) + this.ncrb_ref.hashCode()) * 31) + this.new_own_name.hashCode()) * 31;
        boolean z = this.nocRetention;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((((((((((((((iHashCode + r1) * 31) + this.noc_dt.hashCode()) * 31) + this.off_cd.hashCode()) * 31) + Integer.hashCode(this.off_to)) * 31) + Integer.hashCode(this.reason)) * 31) + this.regn_no.hashCode()) * 31) + this.rto_to.hashCode()) * 31) + this.state_cd.hashCode()) * 31) + this.state_to.hashCode();
    }

    public String toString() {
        return "NocDraftRequestParam(appl_no=" + this.appl_no + ", dispatch_no=" + this.dispatch_no + ", issue_date=" + this.issue_date + ", ncrb_ref=" + this.ncrb_ref + ", new_own_name=" + this.new_own_name + ", nocRetention=" + this.nocRetention + ", noc_dt=" + this.noc_dt + ", off_cd=" + this.off_cd + ", off_to=" + this.off_to + ", reason=" + this.reason + ", regn_no=" + this.regn_no + ", rto_to=" + this.rto_to + ", state_cd=" + this.state_cd + ", state_to=" + this.state_to + ')';
    }
}
