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
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/SlotResponse;", "", "statusCode", "", "statusDesc", "slotDetails", "", "Lcom/nic/mparivahan/VahanServices/VahanModel/SlotDetails;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getSlotDetails", "()Ljava/util/List;", "setSlotDetails", "(Ljava/util/List;)V", "getStatusCode", "()Ljava/lang/String;", "setStatusCode", "(Ljava/lang/String;)V", "getStatusDesc", "setStatusDesc", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SlotResponse {

    @xy5("slot_Details")
    private List<SlotDetails> slotDetails;

    @xy5("status_code")
    private String statusCode;

    @xy5("status_desc")
    private String statusDesc;

    public SlotResponse() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SlotResponse copy$default(SlotResponse slotResponse, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = slotResponse.statusCode;
        }
        if ((i & 2) != 0) {
            str2 = slotResponse.statusDesc;
        }
        if ((i & 4) != 0) {
            list = slotResponse.slotDetails;
        }
        return slotResponse.copy(str, str2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatusCode() {
        return this.statusCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final List<SlotDetails> component3() {
        return this.slotDetails;
    }

    public final SlotResponse copy(String statusCode, String statusDesc, List<SlotDetails> slotDetails) {
        Intrinsics.checkNotNullParameter(slotDetails, "slotDetails");
        return new SlotResponse(statusCode, statusDesc, slotDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SlotResponse)) {
            return false;
        }
        SlotResponse slotResponse = (SlotResponse) other;
        return Intrinsics.areEqual(this.statusCode, slotResponse.statusCode) && Intrinsics.areEqual(this.statusDesc, slotResponse.statusDesc) && Intrinsics.areEqual(this.slotDetails, slotResponse.slotDetails);
    }

    public final List<SlotDetails> getSlotDetails() {
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

    public final void setSlotDetails(List<SlotDetails> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.slotDetails = list;
    }

    public final void setStatusCode(String str) {
        this.statusCode = str;
    }

    public final void setStatusDesc(String str) {
        this.statusDesc = str;
    }

    public String toString() {
        return "SlotResponse(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ", slotDetails=" + this.slotDetails + ')';
    }

    public SlotResponse(String str, String str2, List<SlotDetails> slotDetails) {
        Intrinsics.checkNotNullParameter(slotDetails, "slotDetails");
        this.statusCode = str;
        this.statusDesc = str2;
        this.slotDetails = slotDetails;
    }

    public /* synthetic */ SlotResponse(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? new ArrayList() : list);
    }
}
