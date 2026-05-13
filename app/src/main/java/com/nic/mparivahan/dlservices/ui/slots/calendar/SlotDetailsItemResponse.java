package com.nic.mparivahan.dlservices.ui.slots.calendar;

import androidx.annotation.Keep;
import com.zepto.xy5;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0019\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bHÆ\u0003J;\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bHÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R&\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/slots/calendar/SlotDetailsItemResponse;", "", "statusCode", "", "statusDesc", "slotDetails", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/dlservices/ui/slots/calendar/SlotDetailsItem;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "getSlotDetails", "()Ljava/util/ArrayList;", "getStatusCode", "()Ljava/lang/String;", "getStatusDesc", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SlotDetailsItemResponse {

    @xy5("Slot_Details")
    private final ArrayList<SlotDetailsItem> slotDetails;

    @xy5("status_code")
    private final String statusCode;

    @xy5("status_desc")
    private final String statusDesc;

    public SlotDetailsItemResponse(String str, String str2, ArrayList<SlotDetailsItem> slotDetails) {
        Intrinsics.checkNotNullParameter(slotDetails, "slotDetails");
        this.statusCode = str;
        this.statusDesc = str2;
        this.slotDetails = slotDetails;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SlotDetailsItemResponse copy$default(SlotDetailsItemResponse slotDetailsItemResponse, String str, String str2, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = slotDetailsItemResponse.statusCode;
        }
        if ((i & 2) != 0) {
            str2 = slotDetailsItemResponse.statusDesc;
        }
        if ((i & 4) != 0) {
            arrayList = slotDetailsItemResponse.slotDetails;
        }
        return slotDetailsItemResponse.copy(str, str2, arrayList);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatusCode() {
        return this.statusCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final ArrayList<SlotDetailsItem> component3() {
        return this.slotDetails;
    }

    public final SlotDetailsItemResponse copy(String statusCode, String statusDesc, ArrayList<SlotDetailsItem> slotDetails) {
        Intrinsics.checkNotNullParameter(slotDetails, "slotDetails");
        return new SlotDetailsItemResponse(statusCode, statusDesc, slotDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SlotDetailsItemResponse)) {
            return false;
        }
        SlotDetailsItemResponse slotDetailsItemResponse = (SlotDetailsItemResponse) other;
        return Intrinsics.areEqual(this.statusCode, slotDetailsItemResponse.statusCode) && Intrinsics.areEqual(this.statusDesc, slotDetailsItemResponse.statusDesc) && Intrinsics.areEqual(this.slotDetails, slotDetailsItemResponse.slotDetails);
    }

    public final ArrayList<SlotDetailsItem> getSlotDetails() {
        return this.slotDetails;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        String str = this.statusCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.statusDesc;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.slotDetails.hashCode();
    }

    public String toString() {
        return "SlotDetailsItemResponse(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ", slotDetails=" + this.slotDetails + ')';
    }

    public /* synthetic */ SlotDetailsItemResponse(String str, String str2, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, arrayList);
    }
}
