package com.nic.mparivahan.VahanServices.Model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/nic/mparivahan/VahanServices/Model/VTHypthEntityByid;", "", "off_cd", "", "regn_no", "", "sr_no", "state_cd", "(ILjava/lang/String;ILjava/lang/String;)V", "getOff_cd", "()I", "getRegn_no", "()Ljava/lang/String;", "getSr_no", "getState_cd", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class VTHypthEntityByid {
    private final int off_cd;
    private final String regn_no;
    private final int sr_no;
    private final String state_cd;

    public VTHypthEntityByid(int i, String regn_no, int i2, String state_cd) {
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        this.off_cd = i;
        this.regn_no = regn_no;
        this.sr_no = i2;
        this.state_cd = state_cd;
    }

    public static /* synthetic */ VTHypthEntityByid copy$default(VTHypthEntityByid vTHypthEntityByid, int i, String str, int i2, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = vTHypthEntityByid.off_cd;
        }
        if ((i3 & 2) != 0) {
            str = vTHypthEntityByid.regn_no;
        }
        if ((i3 & 4) != 0) {
            i2 = vTHypthEntityByid.sr_no;
        }
        if ((i3 & 8) != 0) {
            str2 = vTHypthEntityByid.state_cd;
        }
        return vTHypthEntityByid.copy(i, str, i2, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getOff_cd() {
        return this.off_cd;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRegn_no() {
        return this.regn_no;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSr_no() {
        return this.sr_no;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getState_cd() {
        return this.state_cd;
    }

    public final VTHypthEntityByid copy(int off_cd, String regn_no, int sr_no, String state_cd) {
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        return new VTHypthEntityByid(off_cd, regn_no, sr_no, state_cd);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VTHypthEntityByid)) {
            return false;
        }
        VTHypthEntityByid vTHypthEntityByid = (VTHypthEntityByid) other;
        return this.off_cd == vTHypthEntityByid.off_cd && Intrinsics.areEqual(this.regn_no, vTHypthEntityByid.regn_no) && this.sr_no == vTHypthEntityByid.sr_no && Intrinsics.areEqual(this.state_cd, vTHypthEntityByid.state_cd);
    }

    public final int getOff_cd() {
        return this.off_cd;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final int getSr_no() {
        return this.sr_no;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.off_cd) * 31) + this.regn_no.hashCode()) * 31) + Integer.hashCode(this.sr_no)) * 31) + this.state_cd.hashCode();
    }

    public String toString() {
        return "VTHypthEntityByid(off_cd=" + this.off_cd + ", regn_no=" + this.regn_no + ", sr_no=" + this.sr_no + ", state_cd=" + this.state_cd + ')';
    }
}
