package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import com.zepto.xy5;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/SlotDetails;", "", "date", "", "label", "slots", "", "Lcom/nic/mparivahan/VahanServices/VahanModel/Slots;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getDate", "()Ljava/lang/String;", "setDate", "(Ljava/lang/String;)V", "getLabel", "setLabel", "getSlots", "()Ljava/util/List;", "setSlots", "(Ljava/util/List;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SlotDetails {

    @xy5("date")
    private String date;

    @xy5("label")
    private String label;

    @xy5("slots")
    private List<Slots> slots;

    public SlotDetails() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SlotDetails copy$default(SlotDetails slotDetails, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = slotDetails.date;
        }
        if ((i & 2) != 0) {
            str2 = slotDetails.label;
        }
        if ((i & 4) != 0) {
            list = slotDetails.slots;
        }
        return slotDetails.copy(str, str2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    public final List<Slots> component3() {
        return this.slots;
    }

    public final SlotDetails copy(String date, String label, List<Slots> slots) {
        Intrinsics.checkNotNullParameter(slots, "slots");
        return new SlotDetails(date, label, slots);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SlotDetails)) {
            return false;
        }
        SlotDetails slotDetails = (SlotDetails) other;
        return Intrinsics.areEqual(this.date, slotDetails.date) && Intrinsics.areEqual(this.label, slotDetails.label) && Intrinsics.areEqual(this.slots, slotDetails.slots);
    }

    public final String getDate() {
        return this.date;
    }

    public final String getLabel() {
        return this.label;
    }

    public final List<Slots> getSlots() {
        return this.slots;
    }

    public int hashCode() {
        String str = this.date;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.label;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.slots.hashCode();
    }

    public final void setDate(String str) {
        this.date = str;
    }

    public final void setLabel(String str) {
        this.label = str;
    }

    public final void setSlots(List<Slots> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.slots = list;
    }

    public String toString() {
        return "SlotDetails(date=" + this.date + ", label=" + this.label + ", slots=" + this.slots + ')';
    }

    public SlotDetails(String str, String str2, List<Slots> slots) {
        Intrinsics.checkNotNullParameter(slots, "slots");
        this.date = str;
        this.label = str2;
        this.slots = slots;
    }

    public /* synthetic */ SlotDetails(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? new ArrayList() : list);
    }
}
