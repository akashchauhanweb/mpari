package com.nic.mparivahan.Tax.Model;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bHÆ\u0003J7\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bHÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR!\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/nic/mparivahan/Tax/Model/TaxPurCdDescr;", "", "Pur_code", "", "descr", "listTaxModes", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/Tax/Model/TaxModes;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "getPur_code", "()Ljava/lang/String;", "getDescr", "getListTaxModes", "()Ljava/util/ArrayList;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class TaxPurCdDescr {
    private final String Pur_code;
    private final String descr;
    private final ArrayList<TaxModes> listTaxModes;

    public TaxPurCdDescr(String Pur_code, String descr, ArrayList<TaxModes> listTaxModes) {
        Intrinsics.checkNotNullParameter(Pur_code, "Pur_code");
        Intrinsics.checkNotNullParameter(descr, "descr");
        Intrinsics.checkNotNullParameter(listTaxModes, "listTaxModes");
        this.Pur_code = Pur_code;
        this.descr = descr;
        this.listTaxModes = listTaxModes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TaxPurCdDescr copy$default(TaxPurCdDescr taxPurCdDescr, String str, String str2, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taxPurCdDescr.Pur_code;
        }
        if ((i & 2) != 0) {
            str2 = taxPurCdDescr.descr;
        }
        if ((i & 4) != 0) {
            arrayList = taxPurCdDescr.listTaxModes;
        }
        return taxPurCdDescr.copy(str, str2, arrayList);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPur_code() {
        return this.Pur_code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescr() {
        return this.descr;
    }

    public final ArrayList<TaxModes> component3() {
        return this.listTaxModes;
    }

    public final TaxPurCdDescr copy(String Pur_code, String descr, ArrayList<TaxModes> listTaxModes) {
        Intrinsics.checkNotNullParameter(Pur_code, "Pur_code");
        Intrinsics.checkNotNullParameter(descr, "descr");
        Intrinsics.checkNotNullParameter(listTaxModes, "listTaxModes");
        return new TaxPurCdDescr(Pur_code, descr, listTaxModes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaxPurCdDescr)) {
            return false;
        }
        TaxPurCdDescr taxPurCdDescr = (TaxPurCdDescr) other;
        return Intrinsics.areEqual(this.Pur_code, taxPurCdDescr.Pur_code) && Intrinsics.areEqual(this.descr, taxPurCdDescr.descr) && Intrinsics.areEqual(this.listTaxModes, taxPurCdDescr.listTaxModes);
    }

    public final String getDescr() {
        return this.descr;
    }

    public final ArrayList<TaxModes> getListTaxModes() {
        return this.listTaxModes;
    }

    public final String getPur_code() {
        return this.Pur_code;
    }

    public int hashCode() {
        return (((this.Pur_code.hashCode() * 31) + this.descr.hashCode()) * 31) + this.listTaxModes.hashCode();
    }

    public String toString() {
        return "TaxPurCdDescr(Pur_code=" + this.Pur_code + ", descr=" + this.descr + ", listTaxModes=" + this.listTaxModes + ')';
    }
}
