package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0003j\b\u0012\u0004\u0012\u00020\u0007`\u0005¢\u0006\u0002\u0010\bJ\u0019\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J\u0019\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0003j\b\u0012\u0004\u0012\u00020\u0007`\u0005HÆ\u0003J=\u0010\u000e\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0003j\b\u0012\u0004\u0012\u00020\u0007`\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R!\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0003j\b\u0012\u0004\u0012\u00020\u0007`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/ApplStatusTransListModel;", "Ljava/io/Serializable;", "detaillist", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/VahanServices/VahanModel/ApplStatusDetailsListModel;", "Lkotlin/collections/ArrayList;", "currentlist", "Lcom/nic/mparivahan/VahanServices/VahanModel/ApplStatusCurrentListModel;", "(Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "getCurrentlist", "()Ljava/util/ArrayList;", "getDetaillist", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ApplStatusTransListModel implements Serializable {
    private final ArrayList<ApplStatusCurrentListModel> currentlist;
    private final ArrayList<ApplStatusDetailsListModel> detaillist;

    public ApplStatusTransListModel(ArrayList<ApplStatusDetailsListModel> detaillist, ArrayList<ApplStatusCurrentListModel> currentlist) {
        Intrinsics.checkNotNullParameter(detaillist, "detaillist");
        Intrinsics.checkNotNullParameter(currentlist, "currentlist");
        this.detaillist = detaillist;
        this.currentlist = currentlist;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApplStatusTransListModel copy$default(ApplStatusTransListModel applStatusTransListModel, ArrayList arrayList, ArrayList arrayList2, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = applStatusTransListModel.detaillist;
        }
        if ((i & 2) != 0) {
            arrayList2 = applStatusTransListModel.currentlist;
        }
        return applStatusTransListModel.copy(arrayList, arrayList2);
    }

    public final ArrayList<ApplStatusDetailsListModel> component1() {
        return this.detaillist;
    }

    public final ArrayList<ApplStatusCurrentListModel> component2() {
        return this.currentlist;
    }

    public final ApplStatusTransListModel copy(ArrayList<ApplStatusDetailsListModel> detaillist, ArrayList<ApplStatusCurrentListModel> currentlist) {
        Intrinsics.checkNotNullParameter(detaillist, "detaillist");
        Intrinsics.checkNotNullParameter(currentlist, "currentlist");
        return new ApplStatusTransListModel(detaillist, currentlist);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApplStatusTransListModel)) {
            return false;
        }
        ApplStatusTransListModel applStatusTransListModel = (ApplStatusTransListModel) other;
        return Intrinsics.areEqual(this.detaillist, applStatusTransListModel.detaillist) && Intrinsics.areEqual(this.currentlist, applStatusTransListModel.currentlist);
    }

    public final ArrayList<ApplStatusCurrentListModel> getCurrentlist() {
        return this.currentlist;
    }

    public final ArrayList<ApplStatusDetailsListModel> getDetaillist() {
        return this.detaillist;
    }

    public int hashCode() {
        return (this.detaillist.hashCode() * 31) + this.currentlist.hashCode();
    }

    public String toString() {
        return "ApplStatusTransListModel(detaillist=" + this.detaillist + ", currentlist=" + this.currentlist + ')';
    }
}
