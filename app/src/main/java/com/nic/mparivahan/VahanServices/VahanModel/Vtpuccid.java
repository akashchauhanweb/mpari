package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/Vtpuccid;", "", "off_cd", "", "regn_no", "state_cd", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOff_cd", "()Ljava/lang/String;", "getRegn_no", "getState_cd", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Vtpuccid {
    private final String off_cd;
    private final String regn_no;
    private final String state_cd;

    public Vtpuccid(String off_cd, String regn_no, String state_cd) {
        Intrinsics.checkNotNullParameter(off_cd, "off_cd");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        this.off_cd = off_cd;
        this.regn_no = regn_no;
        this.state_cd = state_cd;
    }

    public static /* synthetic */ Vtpuccid copy$default(Vtpuccid vtpuccid, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vtpuccid.off_cd;
        }
        if ((i & 2) != 0) {
            str2 = vtpuccid.regn_no;
        }
        if ((i & 4) != 0) {
            str3 = vtpuccid.state_cd;
        }
        return vtpuccid.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOff_cd() {
        return this.off_cd;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRegn_no() {
        return this.regn_no;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getState_cd() {
        return this.state_cd;
    }

    public final Vtpuccid copy(String off_cd, String regn_no, String state_cd) {
        Intrinsics.checkNotNullParameter(off_cd, "off_cd");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        return new Vtpuccid(off_cd, regn_no, state_cd);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Vtpuccid)) {
            return false;
        }
        Vtpuccid vtpuccid = (Vtpuccid) other;
        return Intrinsics.areEqual(this.off_cd, vtpuccid.off_cd) && Intrinsics.areEqual(this.regn_no, vtpuccid.regn_no) && Intrinsics.areEqual(this.state_cd, vtpuccid.state_cd);
    }

    public final String getOff_cd() {
        return this.off_cd;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public int hashCode() {
        return (((this.off_cd.hashCode() * 31) + this.regn_no.hashCode()) * 31) + this.state_cd.hashCode();
    }

    public String toString() {
        return "Vtpuccid(off_cd=" + this.off_cd + ", regn_no=" + this.regn_no + ", state_cd=" + this.state_cd + ')';
    }
}
