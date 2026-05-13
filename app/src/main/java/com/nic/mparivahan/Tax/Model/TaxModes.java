package com.nic.mparivahan.Tax.Model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/nic/mparivahan/Tax/Model/TaxModes;", "", "descr", "", "tax_mode", "(Ljava/lang/String;Ljava/lang/String;)V", "getDescr", "()Ljava/lang/String;", "getTax_mode", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class TaxModes {
    private final String descr;
    private final String tax_mode;

    public TaxModes(String str, String str2) {
        this.descr = str;
        this.tax_mode = str2;
    }

    public static /* synthetic */ TaxModes copy$default(TaxModes taxModes, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taxModes.descr;
        }
        if ((i & 2) != 0) {
            str2 = taxModes.tax_mode;
        }
        return taxModes.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDescr() {
        return this.descr;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTax_mode() {
        return this.tax_mode;
    }

    public final TaxModes copy(String descr, String tax_mode) {
        return new TaxModes(descr, tax_mode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaxModes)) {
            return false;
        }
        TaxModes taxModes = (TaxModes) other;
        return Intrinsics.areEqual(this.descr, taxModes.descr) && Intrinsics.areEqual(this.tax_mode, taxModes.tax_mode);
    }

    public final String getDescr() {
        return this.descr;
    }

    public final String getTax_mode() {
        return this.tax_mode;
    }

    public int hashCode() {
        String str = this.descr;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tax_mode;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "TaxModes(descr=" + this.descr + ", tax_mode=" + this.tax_mode + ')';
    }
}
