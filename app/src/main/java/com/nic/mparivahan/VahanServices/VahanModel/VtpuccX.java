package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/VtpuccX;", "", "op_dt", "", "pucc_centreno", "", "pucc_from", "pucc_no", "pucc_upto", "vtpuccid", "Lcom/nic/mparivahan/VahanServices/VahanModel/VtpuccidX;", "(JLjava/lang/String;JLjava/lang/String;JLcom/nic/mparivahan/VahanServices/VahanModel/VtpuccidX;)V", "getOp_dt", "()J", "getPucc_centreno", "()Ljava/lang/String;", "getPucc_from", "getPucc_no", "getPucc_upto", "getVtpuccid", "()Lcom/nic/mparivahan/VahanServices/VahanModel/VtpuccidX;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class VtpuccX {
    private final long op_dt;
    private final String pucc_centreno;
    private final long pucc_from;
    private final String pucc_no;
    private final long pucc_upto;
    private final VtpuccidX vtpuccid;

    public VtpuccX(long j, String pucc_centreno, long j2, String pucc_no, long j3, VtpuccidX vtpuccid) {
        Intrinsics.checkNotNullParameter(pucc_centreno, "pucc_centreno");
        Intrinsics.checkNotNullParameter(pucc_no, "pucc_no");
        Intrinsics.checkNotNullParameter(vtpuccid, "vtpuccid");
        this.op_dt = j;
        this.pucc_centreno = pucc_centreno;
        this.pucc_from = j2;
        this.pucc_no = pucc_no;
        this.pucc_upto = j3;
        this.vtpuccid = vtpuccid;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getOp_dt() {
        return this.op_dt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPucc_centreno() {
        return this.pucc_centreno;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getPucc_from() {
        return this.pucc_from;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPucc_no() {
        return this.pucc_no;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getPucc_upto() {
        return this.pucc_upto;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final VtpuccidX getVtpuccid() {
        return this.vtpuccid;
    }

    public final VtpuccX copy(long op_dt, String pucc_centreno, long pucc_from, String pucc_no, long pucc_upto, VtpuccidX vtpuccid) {
        Intrinsics.checkNotNullParameter(pucc_centreno, "pucc_centreno");
        Intrinsics.checkNotNullParameter(pucc_no, "pucc_no");
        Intrinsics.checkNotNullParameter(vtpuccid, "vtpuccid");
        return new VtpuccX(op_dt, pucc_centreno, pucc_from, pucc_no, pucc_upto, vtpuccid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VtpuccX)) {
            return false;
        }
        VtpuccX vtpuccX = (VtpuccX) other;
        return this.op_dt == vtpuccX.op_dt && Intrinsics.areEqual(this.pucc_centreno, vtpuccX.pucc_centreno) && this.pucc_from == vtpuccX.pucc_from && Intrinsics.areEqual(this.pucc_no, vtpuccX.pucc_no) && this.pucc_upto == vtpuccX.pucc_upto && Intrinsics.areEqual(this.vtpuccid, vtpuccX.vtpuccid);
    }

    public final long getOp_dt() {
        return this.op_dt;
    }

    public final String getPucc_centreno() {
        return this.pucc_centreno;
    }

    public final long getPucc_from() {
        return this.pucc_from;
    }

    public final String getPucc_no() {
        return this.pucc_no;
    }

    public final long getPucc_upto() {
        return this.pucc_upto;
    }

    public final VtpuccidX getVtpuccid() {
        return this.vtpuccid;
    }

    public int hashCode() {
        return (((((((((Long.hashCode(this.op_dt) * 31) + this.pucc_centreno.hashCode()) * 31) + Long.hashCode(this.pucc_from)) * 31) + this.pucc_no.hashCode()) * 31) + Long.hashCode(this.pucc_upto)) * 31) + this.vtpuccid.hashCode();
    }

    public String toString() {
        return "VtpuccX(op_dt=" + this.op_dt + ", pucc_centreno=" + this.pucc_centreno + ", pucc_from=" + this.pucc_from + ", pucc_no=" + this.pucc_no + ", pucc_upto=" + this.pucc_upto + ", vtpuccid=" + this.vtpuccid + ')';
    }
}
