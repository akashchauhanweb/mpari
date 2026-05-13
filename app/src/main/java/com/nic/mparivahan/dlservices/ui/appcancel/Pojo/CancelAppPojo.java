package com.nic.mparivahan.dlservices.ui.appcancel.Pojo;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u0019\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J7\u0010\u0012\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/appcancel/Pojo/CancelAppPojo;", "", "Slot_Details", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/dlservices/ui/appcancel/Pojo/SlotDetail;", "Lkotlin/collections/ArrayList;", "status_code", "", "status_desc", "(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V", "getSlot_Details", "()Ljava/util/ArrayList;", "getStatus_code", "()Ljava/lang/String;", "getStatus_desc", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CancelAppPojo {
    private final ArrayList<SlotDetail> Slot_Details;
    private final String status_code;
    private final String status_desc;

    public CancelAppPojo(ArrayList<SlotDetail> Slot_Details, String status_code, String status_desc) {
        Intrinsics.checkNotNullParameter(Slot_Details, "Slot_Details");
        Intrinsics.checkNotNullParameter(status_code, "status_code");
        Intrinsics.checkNotNullParameter(status_desc, "status_desc");
        this.Slot_Details = Slot_Details;
        this.status_code = status_code;
        this.status_desc = status_desc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CancelAppPojo copy$default(CancelAppPojo cancelAppPojo, ArrayList arrayList, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = cancelAppPojo.Slot_Details;
        }
        if ((i & 2) != 0) {
            str = cancelAppPojo.status_code;
        }
        if ((i & 4) != 0) {
            str2 = cancelAppPojo.status_desc;
        }
        return cancelAppPojo.copy(arrayList, str, str2);
    }

    public final ArrayList<SlotDetail> component1() {
        return this.Slot_Details;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatus_code() {
        return this.status_code;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatus_desc() {
        return this.status_desc;
    }

    public final CancelAppPojo copy(ArrayList<SlotDetail> Slot_Details, String status_code, String status_desc) {
        Intrinsics.checkNotNullParameter(Slot_Details, "Slot_Details");
        Intrinsics.checkNotNullParameter(status_code, "status_code");
        Intrinsics.checkNotNullParameter(status_desc, "status_desc");
        return new CancelAppPojo(Slot_Details, status_code, status_desc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CancelAppPojo)) {
            return false;
        }
        CancelAppPojo cancelAppPojo = (CancelAppPojo) other;
        return Intrinsics.areEqual(this.Slot_Details, cancelAppPojo.Slot_Details) && Intrinsics.areEqual(this.status_code, cancelAppPojo.status_code) && Intrinsics.areEqual(this.status_desc, cancelAppPojo.status_desc);
    }

    public final ArrayList<SlotDetail> getSlot_Details() {
        return this.Slot_Details;
    }

    public final String getStatus_code() {
        return this.status_code;
    }

    public final String getStatus_desc() {
        return this.status_desc;
    }

    public int hashCode() {
        return (((this.Slot_Details.hashCode() * 31) + this.status_code.hashCode()) * 31) + this.status_desc.hashCode();
    }

    public String toString() {
        return "CancelAppPojo(Slot_Details=" + this.Slot_Details + ", status_code=" + this.status_code + ", status_desc=" + this.status_desc + ')';
    }
}
