package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/Vtpucc;", "Ljava/io/Serializable;", "pucc_from", "", "pucc_no", "pucc_upto", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPucc_from", "()Ljava/lang/String;", "getPucc_no", "getPucc_upto", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Vtpucc implements Serializable {
    private final String pucc_from;
    private final String pucc_no;
    private final String pucc_upto;

    public Vtpucc(String str, String str2, String str3) {
        this.pucc_from = str;
        this.pucc_no = str2;
        this.pucc_upto = str3;
    }

    public static /* synthetic */ Vtpucc copy$default(Vtpucc vtpucc, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vtpucc.pucc_from;
        }
        if ((i & 2) != 0) {
            str2 = vtpucc.pucc_no;
        }
        if ((i & 4) != 0) {
            str3 = vtpucc.pucc_upto;
        }
        return vtpucc.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPucc_from() {
        return this.pucc_from;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPucc_no() {
        return this.pucc_no;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPucc_upto() {
        return this.pucc_upto;
    }

    public final Vtpucc copy(String pucc_from, String pucc_no, String pucc_upto) {
        return new Vtpucc(pucc_from, pucc_no, pucc_upto);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Vtpucc)) {
            return false;
        }
        Vtpucc vtpucc = (Vtpucc) other;
        return Intrinsics.areEqual(this.pucc_from, vtpucc.pucc_from) && Intrinsics.areEqual(this.pucc_no, vtpucc.pucc_no) && Intrinsics.areEqual(this.pucc_upto, vtpucc.pucc_upto);
    }

    public final String getPucc_from() {
        return this.pucc_from;
    }

    public final String getPucc_no() {
        return this.pucc_no;
    }

    public final String getPucc_upto() {
        return this.pucc_upto;
    }

    public int hashCode() {
        String str = this.pucc_from;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.pucc_no;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.pucc_upto;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "Vtpucc(pucc_from=" + this.pucc_from + ", pucc_no=" + this.pucc_no + ", pucc_upto=" + this.pucc_upto + ')';
    }
}
