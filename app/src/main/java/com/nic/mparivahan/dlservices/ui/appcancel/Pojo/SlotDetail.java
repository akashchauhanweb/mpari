package com.nic.mparivahan.dlservices.ui.appcancel.Pojo;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/appcancel/Pojo/SlotDetail;", "", "success", "", "(Ljava/lang/String;)V", "getSuccess", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SlotDetail {
    private final String success;

    public SlotDetail(String success) {
        Intrinsics.checkNotNullParameter(success, "success");
        this.success = success;
    }

    public static /* synthetic */ SlotDetail copy$default(SlotDetail slotDetail, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = slotDetail.success;
        }
        return slotDetail.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSuccess() {
        return this.success;
    }

    public final SlotDetail copy(String success) {
        Intrinsics.checkNotNullParameter(success, "success");
        return new SlotDetail(success);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SlotDetail) && Intrinsics.areEqual(this.success, ((SlotDetail) other).success);
    }

    public final String getSuccess() {
        return this.success;
    }

    public int hashCode() {
        return this.success.hashCode();
    }

    public String toString() {
        return "SlotDetail(success=" + this.success + ')';
    }
}
