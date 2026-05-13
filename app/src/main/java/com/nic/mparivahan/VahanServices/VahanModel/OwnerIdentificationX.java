package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b5\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0001\u0012\u0006\u0010\u0014\u001a\u00020\u0001\u0012\u0006\u0010\u0015\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\u0003¢\u0006\u0002\u0010\u0017J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u000fHÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0001HÆ\u0003J\t\u00104\u001a\u00020\u0001HÆ\u0003J\t\u00105\u001a\u00020\rHÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0001HÆ\u0003J\t\u00108\u001a\u00020\u0006HÆ\u0003J\t\u00109\u001a\u00020\u0006HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0006HÆ\u0003J\t\u0010=\u001a\u00020\u0006HÆ\u0003J\t\u0010>\u001a\u00020\rHÆ\u0003J³\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\u0003HÆ\u0001J\u0013\u0010@\u001a\u00020\u00062\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010B\u001a\u00020\u000fHÖ\u0001J\t\u0010C\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0019R\u0011\u0010\u0013\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001bR\u0011\u0010\u0014\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001bR\u0011\u0010\u0015\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b,\u0010$R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0019¨\u0006D"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/OwnerIdentificationX;", "", "aadhar_no", "", "appl_no", "dlRequired", "", "dlValidationRequired", "dl_no", "email_id", "flag", "mobileNoEditable", "mobile_no", "", "ownerCatg", "", "pan_no", "passport_no", "ration_card_no", "regn_no", "state_cd", "verified_on", "voter_id", "(Ljava/lang/String;Ljava/lang/Object;ZZLjava/lang/String;Ljava/lang/String;ZZJILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;JLjava/lang/String;)V", "getAadhar_no", "()Ljava/lang/String;", "getAppl_no", "()Ljava/lang/Object;", "getDlRequired", "()Z", "getDlValidationRequired", "getDl_no", "getEmail_id", "getFlag", "getMobileNoEditable", "getMobile_no", "()J", "getOwnerCatg", "()I", "getPan_no", "getPassport_no", "getRation_card_no", "getRegn_no", "getState_cd", "getVerified_on", "getVoter_id", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class OwnerIdentificationX {
    private final String aadhar_no;
    private final Object appl_no;
    private final boolean dlRequired;
    private final boolean dlValidationRequired;
    private final String dl_no;
    private final String email_id;
    private final boolean flag;
    private final boolean mobileNoEditable;
    private final long mobile_no;
    private final int ownerCatg;
    private final String pan_no;
    private final String passport_no;
    private final String ration_card_no;
    private final Object regn_no;
    private final Object state_cd;
    private final long verified_on;
    private final String voter_id;

    public OwnerIdentificationX(String aadhar_no, Object appl_no, boolean z, boolean z2, String dl_no, String email_id, boolean z3, boolean z4, long j, int i, String pan_no, String passport_no, String ration_card_no, Object regn_no, Object state_cd, long j2, String voter_id) {
        Intrinsics.checkNotNullParameter(aadhar_no, "aadhar_no");
        Intrinsics.checkNotNullParameter(appl_no, "appl_no");
        Intrinsics.checkNotNullParameter(dl_no, "dl_no");
        Intrinsics.checkNotNullParameter(email_id, "email_id");
        Intrinsics.checkNotNullParameter(pan_no, "pan_no");
        Intrinsics.checkNotNullParameter(passport_no, "passport_no");
        Intrinsics.checkNotNullParameter(ration_card_no, "ration_card_no");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(voter_id, "voter_id");
        this.aadhar_no = aadhar_no;
        this.appl_no = appl_no;
        this.dlRequired = z;
        this.dlValidationRequired = z2;
        this.dl_no = dl_no;
        this.email_id = email_id;
        this.flag = z3;
        this.mobileNoEditable = z4;
        this.mobile_no = j;
        this.ownerCatg = i;
        this.pan_no = pan_no;
        this.passport_no = passport_no;
        this.ration_card_no = ration_card_no;
        this.regn_no = regn_no;
        this.state_cd = state_cd;
        this.verified_on = j2;
        this.voter_id = voter_id;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAadhar_no() {
        return this.aadhar_no;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getOwnerCatg() {
        return this.ownerCatg;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getPan_no() {
        return this.pan_no;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getPassport_no() {
        return this.passport_no;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getRation_card_no() {
        return this.ration_card_no;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Object getRegn_no() {
        return this.regn_no;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Object getState_cd() {
        return this.state_cd;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final long getVerified_on() {
        return this.verified_on;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getVoter_id() {
        return this.voter_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getAppl_no() {
        return this.appl_no;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getDlRequired() {
        return this.dlRequired;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getDlValidationRequired() {
        return this.dlValidationRequired;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDl_no() {
        return this.dl_no;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getEmail_id() {
        return this.email_id;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getFlag() {
        return this.flag;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getMobileNoEditable() {
        return this.mobileNoEditable;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getMobile_no() {
        return this.mobile_no;
    }

    public final OwnerIdentificationX copy(String aadhar_no, Object appl_no, boolean dlRequired, boolean dlValidationRequired, String dl_no, String email_id, boolean flag, boolean mobileNoEditable, long mobile_no, int ownerCatg, String pan_no, String passport_no, String ration_card_no, Object regn_no, Object state_cd, long verified_on, String voter_id) {
        Intrinsics.checkNotNullParameter(aadhar_no, "aadhar_no");
        Intrinsics.checkNotNullParameter(appl_no, "appl_no");
        Intrinsics.checkNotNullParameter(dl_no, "dl_no");
        Intrinsics.checkNotNullParameter(email_id, "email_id");
        Intrinsics.checkNotNullParameter(pan_no, "pan_no");
        Intrinsics.checkNotNullParameter(passport_no, "passport_no");
        Intrinsics.checkNotNullParameter(ration_card_no, "ration_card_no");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(voter_id, "voter_id");
        return new OwnerIdentificationX(aadhar_no, appl_no, dlRequired, dlValidationRequired, dl_no, email_id, flag, mobileNoEditable, mobile_no, ownerCatg, pan_no, passport_no, ration_card_no, regn_no, state_cd, verified_on, voter_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OwnerIdentificationX)) {
            return false;
        }
        OwnerIdentificationX ownerIdentificationX = (OwnerIdentificationX) other;
        return Intrinsics.areEqual(this.aadhar_no, ownerIdentificationX.aadhar_no) && Intrinsics.areEqual(this.appl_no, ownerIdentificationX.appl_no) && this.dlRequired == ownerIdentificationX.dlRequired && this.dlValidationRequired == ownerIdentificationX.dlValidationRequired && Intrinsics.areEqual(this.dl_no, ownerIdentificationX.dl_no) && Intrinsics.areEqual(this.email_id, ownerIdentificationX.email_id) && this.flag == ownerIdentificationX.flag && this.mobileNoEditable == ownerIdentificationX.mobileNoEditable && this.mobile_no == ownerIdentificationX.mobile_no && this.ownerCatg == ownerIdentificationX.ownerCatg && Intrinsics.areEqual(this.pan_no, ownerIdentificationX.pan_no) && Intrinsics.areEqual(this.passport_no, ownerIdentificationX.passport_no) && Intrinsics.areEqual(this.ration_card_no, ownerIdentificationX.ration_card_no) && Intrinsics.areEqual(this.regn_no, ownerIdentificationX.regn_no) && Intrinsics.areEqual(this.state_cd, ownerIdentificationX.state_cd) && this.verified_on == ownerIdentificationX.verified_on && Intrinsics.areEqual(this.voter_id, ownerIdentificationX.voter_id);
    }

    public final String getAadhar_no() {
        return this.aadhar_no;
    }

    public final Object getAppl_no() {
        return this.appl_no;
    }

    public final boolean getDlRequired() {
        return this.dlRequired;
    }

    public final boolean getDlValidationRequired() {
        return this.dlValidationRequired;
    }

    public final String getDl_no() {
        return this.dl_no;
    }

    public final String getEmail_id() {
        return this.email_id;
    }

    public final boolean getFlag() {
        return this.flag;
    }

    public final boolean getMobileNoEditable() {
        return this.mobileNoEditable;
    }

    public final long getMobile_no() {
        return this.mobile_no;
    }

    public final int getOwnerCatg() {
        return this.ownerCatg;
    }

    public final String getPan_no() {
        return this.pan_no;
    }

    public final String getPassport_no() {
        return this.passport_no;
    }

    public final String getRation_card_no() {
        return this.ration_card_no;
    }

    public final Object getRegn_no() {
        return this.regn_no;
    }

    public final Object getState_cd() {
        return this.state_cd;
    }

    public final long getVerified_on() {
        return this.verified_on;
    }

    public final String getVoter_id() {
        return this.voter_id;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((this.aadhar_no.hashCode() * 31) + this.appl_no.hashCode()) * 31;
        boolean z = this.dlRequired;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.dlValidationRequired;
        ?? r12 = z2;
        if (z2) {
            r12 = 1;
        }
        int iHashCode2 = (((((i + r12) * 31) + this.dl_no.hashCode()) * 31) + this.email_id.hashCode()) * 31;
        boolean z3 = this.flag;
        ?? r13 = z3;
        if (z3) {
            r13 = 1;
        }
        int i2 = (iHashCode2 + r13) * 31;
        boolean z4 = this.mobileNoEditable;
        return ((((((((((((((((((i2 + (z4 ? 1 : z4)) * 31) + Long.hashCode(this.mobile_no)) * 31) + Integer.hashCode(this.ownerCatg)) * 31) + this.pan_no.hashCode()) * 31) + this.passport_no.hashCode()) * 31) + this.ration_card_no.hashCode()) * 31) + this.regn_no.hashCode()) * 31) + this.state_cd.hashCode()) * 31) + Long.hashCode(this.verified_on)) * 31) + this.voter_id.hashCode();
    }

    public String toString() {
        return "OwnerIdentificationX(aadhar_no=" + this.aadhar_no + ", appl_no=" + this.appl_no + ", dlRequired=" + this.dlRequired + ", dlValidationRequired=" + this.dlValidationRequired + ", dl_no=" + this.dl_no + ", email_id=" + this.email_id + ", flag=" + this.flag + ", mobileNoEditable=" + this.mobileNoEditable + ", mobile_no=" + this.mobile_no + ", ownerCatg=" + this.ownerCatg + ", pan_no=" + this.pan_no + ", passport_no=" + this.passport_no + ", ration_card_no=" + this.ration_card_no + ", regn_no=" + this.regn_no + ", state_cd=" + this.state_cd + ", verified_on=" + this.verified_on + ", voter_id=" + this.voter_id + ')';
    }
}
