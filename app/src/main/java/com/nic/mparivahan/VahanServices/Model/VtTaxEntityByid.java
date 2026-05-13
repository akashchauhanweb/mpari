package com.nic.mparivahan.VahanServices.Model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/nic/mparivahan/VahanServices/Model/VtTaxEntityByid;", "", "off_cd", "", "pur_cd", "rcpt_no", "", "state_cd", "(IILjava/lang/String;Ljava/lang/String;)V", "getOff_cd", "()I", "getPur_cd", "getRcpt_no", "()Ljava/lang/String;", "getState_cd", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class VtTaxEntityByid {
    private final int off_cd;
    private final int pur_cd;
    private final String rcpt_no;
    private final String state_cd;

    public VtTaxEntityByid(int i, int i2, String rcpt_no, String state_cd) {
        Intrinsics.checkNotNullParameter(rcpt_no, "rcpt_no");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        this.off_cd = i;
        this.pur_cd = i2;
        this.rcpt_no = rcpt_no;
        this.state_cd = state_cd;
    }

    public static /* synthetic */ VtTaxEntityByid copy$default(VtTaxEntityByid vtTaxEntityByid, int i, int i2, String str, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = vtTaxEntityByid.off_cd;
        }
        if ((i3 & 2) != 0) {
            i2 = vtTaxEntityByid.pur_cd;
        }
        if ((i3 & 4) != 0) {
            str = vtTaxEntityByid.rcpt_no;
        }
        if ((i3 & 8) != 0) {
            str2 = vtTaxEntityByid.state_cd;
        }
        return vtTaxEntityByid.copy(i, i2, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getOff_cd() {
        return this.off_cd;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPur_cd() {
        return this.pur_cd;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRcpt_no() {
        return this.rcpt_no;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getState_cd() {
        return this.state_cd;
    }

    public final VtTaxEntityByid copy(int off_cd, int pur_cd, String rcpt_no, String state_cd) {
        Intrinsics.checkNotNullParameter(rcpt_no, "rcpt_no");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        return new VtTaxEntityByid(off_cd, pur_cd, rcpt_no, state_cd);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VtTaxEntityByid)) {
            return false;
        }
        VtTaxEntityByid vtTaxEntityByid = (VtTaxEntityByid) other;
        return this.off_cd == vtTaxEntityByid.off_cd && this.pur_cd == vtTaxEntityByid.pur_cd && Intrinsics.areEqual(this.rcpt_no, vtTaxEntityByid.rcpt_no) && Intrinsics.areEqual(this.state_cd, vtTaxEntityByid.state_cd);
    }

    public final int getOff_cd() {
        return this.off_cd;
    }

    public final int getPur_cd() {
        return this.pur_cd;
    }

    public final String getRcpt_no() {
        return this.rcpt_no;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.off_cd) * 31) + Integer.hashCode(this.pur_cd)) * 31) + this.rcpt_no.hashCode()) * 31) + this.state_cd.hashCode();
    }

    public String toString() {
        return "VtTaxEntityByid(off_cd=" + this.off_cd + ", pur_cd=" + this.pur_cd + ", rcpt_no=" + this.rcpt_no + ", state_cd=" + this.state_cd + ')';
    }
}
