package com.nic.mparivahan.VahanServices.CompoundingFee.ComModle;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J#\u0010\n\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/nic/mparivahan/VahanServices/CompoundingFee/ComModle/Feelist;", "", "feesList", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/VahanServices/CompoundingFee/ComModle/Fees;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getFeesList", "()Ljava/util/ArrayList;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Feelist {
    private final ArrayList<Fees> feesList;

    public Feelist(ArrayList<Fees> feesList) {
        Intrinsics.checkNotNullParameter(feesList, "feesList");
        this.feesList = feesList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Feelist copy$default(Feelist feelist, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = feelist.feesList;
        }
        return feelist.copy(arrayList);
    }

    public final ArrayList<Fees> component1() {
        return this.feesList;
    }

    public final Feelist copy(ArrayList<Fees> feesList) {
        Intrinsics.checkNotNullParameter(feesList, "feesList");
        return new Feelist(feesList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Feelist) && Intrinsics.areEqual(this.feesList, ((Feelist) other).feesList);
    }

    public final ArrayList<Fees> getFeesList() {
        return this.feesList;
    }

    public int hashCode() {
        return this.feesList.hashCode();
    }

    public String toString() {
        return "Feelist(feesList=" + this.feesList + ')';
    }
}
