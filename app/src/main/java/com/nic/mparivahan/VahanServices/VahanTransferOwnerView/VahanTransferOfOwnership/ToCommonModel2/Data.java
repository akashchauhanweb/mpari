package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.ToCommonModel2;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0003j\b\u0012\u0004\u0012\u00020\u0007`\u0005\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0003j\b\u0012\u0004\u0012\u00020\t`\u0005¢\u0006\u0002\u0010\nJ\u0019\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J\u0019\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0003j\b\u0012\u0004\u0012\u00020\u0007`\u0005HÆ\u0003J\u0019\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0003j\b\u0012\u0004\u0012\u00020\t`\u0005HÆ\u0003JW\u0010\u0012\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0003j\b\u0012\u0004\u0012\u00020\u0007`\u00052\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0003j\b\u0012\u0004\u0012\u00020\t`\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR!\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0003j\b\u0012\u0004\u0012\u00020\u0007`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR!\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0003j\b\u0012\u0004\u0012\u00020\t`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/ToCommonModel2/Data;", "", "ownerCatagory", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/ToCommonModel2/OwnerCatagory;", "Lkotlin/collections/ArrayList;", "ownerShipType", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/ToCommonModel2/OwnerShipType;", "relation", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/ToCommonModel2/Relation;", "(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "getOwnerCatagory", "()Ljava/util/ArrayList;", "getOwnerShipType", "getRelation", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Data {
    private final ArrayList<OwnerCatagory> ownerCatagory;
    private final ArrayList<OwnerShipType> ownerShipType;
    private final ArrayList<Relation> relation;

    public Data(ArrayList<OwnerCatagory> ownerCatagory, ArrayList<OwnerShipType> ownerShipType, ArrayList<Relation> relation) {
        Intrinsics.checkNotNullParameter(ownerCatagory, "ownerCatagory");
        Intrinsics.checkNotNullParameter(ownerShipType, "ownerShipType");
        Intrinsics.checkNotNullParameter(relation, "relation");
        this.ownerCatagory = ownerCatagory;
        this.ownerShipType = ownerShipType;
        this.relation = relation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Data copy$default(Data data, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = data.ownerCatagory;
        }
        if ((i & 2) != 0) {
            arrayList2 = data.ownerShipType;
        }
        if ((i & 4) != 0) {
            arrayList3 = data.relation;
        }
        return data.copy(arrayList, arrayList2, arrayList3);
    }

    public final ArrayList<OwnerCatagory> component1() {
        return this.ownerCatagory;
    }

    public final ArrayList<OwnerShipType> component2() {
        return this.ownerShipType;
    }

    public final ArrayList<Relation> component3() {
        return this.relation;
    }

    public final Data copy(ArrayList<OwnerCatagory> ownerCatagory, ArrayList<OwnerShipType> ownerShipType, ArrayList<Relation> relation) {
        Intrinsics.checkNotNullParameter(ownerCatagory, "ownerCatagory");
        Intrinsics.checkNotNullParameter(ownerShipType, "ownerShipType");
        Intrinsics.checkNotNullParameter(relation, "relation");
        return new Data(ownerCatagory, ownerShipType, relation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Data)) {
            return false;
        }
        Data data = (Data) other;
        return Intrinsics.areEqual(this.ownerCatagory, data.ownerCatagory) && Intrinsics.areEqual(this.ownerShipType, data.ownerShipType) && Intrinsics.areEqual(this.relation, data.relation);
    }

    public final ArrayList<OwnerCatagory> getOwnerCatagory() {
        return this.ownerCatagory;
    }

    public final ArrayList<OwnerShipType> getOwnerShipType() {
        return this.ownerShipType;
    }

    public final ArrayList<Relation> getRelation() {
        return this.relation;
    }

    public int hashCode() {
        return (((this.ownerCatagory.hashCode() * 31) + this.ownerShipType.hashCode()) * 31) + this.relation.hashCode();
    }

    public String toString() {
        return "Data(ownerCatagory=" + this.ownerCatagory + ", ownerShipType=" + this.ownerShipType + ", relation=" + this.relation + ')';
    }
}
