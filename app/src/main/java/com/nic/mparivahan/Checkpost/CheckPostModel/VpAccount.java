package com.nic.mparivahan.Checkpost.CheckPostModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001a\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/nic/mparivahan/Checkpost/CheckPostModel/VpAccount;", "", "fees", "", "fine", "purCd", "", "purCdName", "", "(DDILjava/lang/String;)V", "getFees", "()D", "getFine", "getPurCd", "()I", "getPurCdName", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class VpAccount {
    private final double fees;
    private final double fine;
    private final int purCd;
    private final String purCdName;

    public VpAccount(double d, double d2, int i, String purCdName) {
        Intrinsics.checkNotNullParameter(purCdName, "purCdName");
        this.fees = d;
        this.fine = d2;
        this.purCd = i;
        this.purCdName = purCdName;
    }

    public static /* synthetic */ VpAccount copy$default(VpAccount vpAccount, double d, double d2, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            d = vpAccount.fees;
        }
        double d3 = d;
        if ((i2 & 2) != 0) {
            d2 = vpAccount.fine;
        }
        double d4 = d2;
        if ((i2 & 4) != 0) {
            i = vpAccount.purCd;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str = vpAccount.purCdName;
        }
        return vpAccount.copy(d3, d4, i3, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getFees() {
        return this.fees;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getFine() {
        return this.fine;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPurCd() {
        return this.purCd;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPurCdName() {
        return this.purCdName;
    }

    public final VpAccount copy(double fees, double fine, int purCd, String purCdName) {
        Intrinsics.checkNotNullParameter(purCdName, "purCdName");
        return new VpAccount(fees, fine, purCd, purCdName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VpAccount)) {
            return false;
        }
        VpAccount vpAccount = (VpAccount) other;
        return Double.compare(this.fees, vpAccount.fees) == 0 && Double.compare(this.fine, vpAccount.fine) == 0 && this.purCd == vpAccount.purCd && Intrinsics.areEqual(this.purCdName, vpAccount.purCdName);
    }

    public final double getFees() {
        return this.fees;
    }

    public final double getFine() {
        return this.fine;
    }

    public final int getPurCd() {
        return this.purCd;
    }

    public final String getPurCdName() {
        return this.purCdName;
    }

    public int hashCode() {
        return (((((Double.hashCode(this.fees) * 31) + Double.hashCode(this.fine)) * 31) + Integer.hashCode(this.purCd)) * 31) + this.purCdName.hashCode();
    }

    public String toString() {
        return "VpAccount(fees=" + this.fees + ", fine=" + this.fine + ", purCd=" + this.purCd + ", purCdName=" + this.purCdName + ')';
    }
}
