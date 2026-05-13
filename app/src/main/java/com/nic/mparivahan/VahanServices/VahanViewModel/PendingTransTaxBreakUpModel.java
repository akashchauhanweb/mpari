package com.nic.mparivahan.VahanServices.VahanViewModel;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\u0019\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003JA\u0010\u0015\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanViewModel/PendingTransTaxBreakUpModel;", "", "tax_pay_dobj", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/VahanServices/VahanViewModel/PendingTransTaxBreakListModel;", "Lkotlin/collections/ArrayList;", "renderChckBtn", "", "renderFeeTable", "renderTaxTable", "(Ljava/util/ArrayList;ZZZ)V", "getRenderChckBtn", "()Z", "getRenderFeeTable", "getRenderTaxTable", "getTax_pay_dobj", "()Ljava/util/ArrayList;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PendingTransTaxBreakUpModel {
    private final boolean renderChckBtn;
    private final boolean renderFeeTable;
    private final boolean renderTaxTable;
    private final ArrayList<PendingTransTaxBreakListModel> tax_pay_dobj;

    public PendingTransTaxBreakUpModel(ArrayList<PendingTransTaxBreakListModel> tax_pay_dobj, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(tax_pay_dobj, "tax_pay_dobj");
        this.tax_pay_dobj = tax_pay_dobj;
        this.renderChckBtn = z;
        this.renderFeeTable = z2;
        this.renderTaxTable = z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PendingTransTaxBreakUpModel copy$default(PendingTransTaxBreakUpModel pendingTransTaxBreakUpModel, ArrayList arrayList, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = pendingTransTaxBreakUpModel.tax_pay_dobj;
        }
        if ((i & 2) != 0) {
            z = pendingTransTaxBreakUpModel.renderChckBtn;
        }
        if ((i & 4) != 0) {
            z2 = pendingTransTaxBreakUpModel.renderFeeTable;
        }
        if ((i & 8) != 0) {
            z3 = pendingTransTaxBreakUpModel.renderTaxTable;
        }
        return pendingTransTaxBreakUpModel.copy(arrayList, z, z2, z3);
    }

    public final ArrayList<PendingTransTaxBreakListModel> component1() {
        return this.tax_pay_dobj;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getRenderChckBtn() {
        return this.renderChckBtn;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getRenderFeeTable() {
        return this.renderFeeTable;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getRenderTaxTable() {
        return this.renderTaxTable;
    }

    public final PendingTransTaxBreakUpModel copy(ArrayList<PendingTransTaxBreakListModel> tax_pay_dobj, boolean renderChckBtn, boolean renderFeeTable, boolean renderTaxTable) {
        Intrinsics.checkNotNullParameter(tax_pay_dobj, "tax_pay_dobj");
        return new PendingTransTaxBreakUpModel(tax_pay_dobj, renderChckBtn, renderFeeTable, renderTaxTable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PendingTransTaxBreakUpModel)) {
            return false;
        }
        PendingTransTaxBreakUpModel pendingTransTaxBreakUpModel = (PendingTransTaxBreakUpModel) other;
        return Intrinsics.areEqual(this.tax_pay_dobj, pendingTransTaxBreakUpModel.tax_pay_dobj) && this.renderChckBtn == pendingTransTaxBreakUpModel.renderChckBtn && this.renderFeeTable == pendingTransTaxBreakUpModel.renderFeeTable && this.renderTaxTable == pendingTransTaxBreakUpModel.renderTaxTable;
    }

    public final boolean getRenderChckBtn() {
        return this.renderChckBtn;
    }

    public final boolean getRenderFeeTable() {
        return this.renderFeeTable;
    }

    public final boolean getRenderTaxTable() {
        return this.renderTaxTable;
    }

    public final ArrayList<PendingTransTaxBreakListModel> getTax_pay_dobj() {
        return this.tax_pay_dobj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = this.tax_pay_dobj.hashCode() * 31;
        boolean z = this.renderChckBtn;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.renderFeeTable;
        ?? r12 = z2;
        if (z2) {
            r12 = 1;
        }
        int i2 = (i + r12) * 31;
        boolean z3 = this.renderTaxTable;
        return i2 + (z3 ? 1 : z3);
    }

    public String toString() {
        return "PendingTransTaxBreakUpModel(tax_pay_dobj=" + this.tax_pay_dobj + ", renderChckBtn=" + this.renderChckBtn + ", renderFeeTable=" + this.renderFeeTable + ", renderTaxTable=" + this.renderTaxTable + ')';
    }
}
