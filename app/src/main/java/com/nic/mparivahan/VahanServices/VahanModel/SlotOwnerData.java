package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/SlotOwnerData;", "", "owner_name", "", "vh_class", "", "vh_class_desc", "vch_catg", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getOwner_name", "()Ljava/lang/String;", "getVch_catg", "getVh_class", "()I", "getVh_class_desc", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SlotOwnerData {
    private final String owner_name;
    private final String vch_catg;
    private final int vh_class;
    private final String vh_class_desc;

    public SlotOwnerData(String owner_name, int i, String vh_class_desc, String vch_catg) {
        Intrinsics.checkNotNullParameter(owner_name, "owner_name");
        Intrinsics.checkNotNullParameter(vh_class_desc, "vh_class_desc");
        Intrinsics.checkNotNullParameter(vch_catg, "vch_catg");
        this.owner_name = owner_name;
        this.vh_class = i;
        this.vh_class_desc = vh_class_desc;
        this.vch_catg = vch_catg;
    }

    public static /* synthetic */ SlotOwnerData copy$default(SlotOwnerData slotOwnerData, String str, int i, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = slotOwnerData.owner_name;
        }
        if ((i2 & 2) != 0) {
            i = slotOwnerData.vh_class;
        }
        if ((i2 & 4) != 0) {
            str2 = slotOwnerData.vh_class_desc;
        }
        if ((i2 & 8) != 0) {
            str3 = slotOwnerData.vch_catg;
        }
        return slotOwnerData.copy(str, i, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOwner_name() {
        return this.owner_name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getVh_class() {
        return this.vh_class;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getVh_class_desc() {
        return this.vh_class_desc;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getVch_catg() {
        return this.vch_catg;
    }

    public final SlotOwnerData copy(String owner_name, int vh_class, String vh_class_desc, String vch_catg) {
        Intrinsics.checkNotNullParameter(owner_name, "owner_name");
        Intrinsics.checkNotNullParameter(vh_class_desc, "vh_class_desc");
        Intrinsics.checkNotNullParameter(vch_catg, "vch_catg");
        return new SlotOwnerData(owner_name, vh_class, vh_class_desc, vch_catg);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SlotOwnerData)) {
            return false;
        }
        SlotOwnerData slotOwnerData = (SlotOwnerData) other;
        return Intrinsics.areEqual(this.owner_name, slotOwnerData.owner_name) && this.vh_class == slotOwnerData.vh_class && Intrinsics.areEqual(this.vh_class_desc, slotOwnerData.vh_class_desc) && Intrinsics.areEqual(this.vch_catg, slotOwnerData.vch_catg);
    }

    public final String getOwner_name() {
        return this.owner_name;
    }

    public final String getVch_catg() {
        return this.vch_catg;
    }

    public final int getVh_class() {
        return this.vh_class;
    }

    public final String getVh_class_desc() {
        return this.vh_class_desc;
    }

    public int hashCode() {
        return (((((this.owner_name.hashCode() * 31) + Integer.hashCode(this.vh_class)) * 31) + this.vh_class_desc.hashCode()) * 31) + this.vch_catg.hashCode();
    }

    public String toString() {
        return "SlotOwnerData(owner_name=" + this.owner_name + ", vh_class=" + this.vh_class + ", vh_class_desc=" + this.vh_class_desc + ", vch_catg=" + this.vch_catg + ')';
    }
}
