package com.nic.mparivahan.Echallan.Echallan.Model;

import androidx.annotation.Keep;
import com.zepto.xy5;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\nHÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\nHÖ\u0001R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR&\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/nic/mparivahan/Echallan/Echallan/Model/ChallanListModal;", "", "status", "", "result", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/Echallan/Echallan/Model/ChallanListResultModal;", "Lkotlin/collections/ArrayList;", "totalChallan", "message", "", "(ILjava/util/ArrayList;ILjava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getResult", "()Ljava/util/ArrayList;", "getStatus", "()I", "getTotalChallan", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ChallanListModal {

    @xy5("message")
    private final String message;

    @xy5("results")
    private final ArrayList<ChallanListResultModal> result;

    @xy5("status")
    private final int status;

    @xy5("total_challan")
    private final int totalChallan;

    public ChallanListModal(int i, ArrayList<ChallanListResultModal> result, int i2, String message) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(message, "message");
        this.status = i;
        this.result = result;
        this.totalChallan = i2;
        this.message = message;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChallanListModal copy$default(ChallanListModal challanListModal, int i, ArrayList arrayList, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = challanListModal.status;
        }
        if ((i3 & 2) != 0) {
            arrayList = challanListModal.result;
        }
        if ((i3 & 4) != 0) {
            i2 = challanListModal.totalChallan;
        }
        if ((i3 & 8) != 0) {
            str = challanListModal.message;
        }
        return challanListModal.copy(i, arrayList, i2, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    public final ArrayList<ChallanListResultModal> component2() {
        return this.result;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTotalChallan() {
        return this.totalChallan;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final ChallanListModal copy(int status, ArrayList<ChallanListResultModal> result, int totalChallan, String message) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(message, "message");
        return new ChallanListModal(status, result, totalChallan, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChallanListModal)) {
            return false;
        }
        ChallanListModal challanListModal = (ChallanListModal) other;
        return this.status == challanListModal.status && Intrinsics.areEqual(this.result, challanListModal.result) && this.totalChallan == challanListModal.totalChallan && Intrinsics.areEqual(this.message, challanListModal.message);
    }

    public final String getMessage() {
        return this.message;
    }

    public final ArrayList<ChallanListResultModal> getResult() {
        return this.result;
    }

    public final int getStatus() {
        return this.status;
    }

    public final int getTotalChallan() {
        return this.totalChallan;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.status) * 31) + this.result.hashCode()) * 31) + Integer.hashCode(this.totalChallan)) * 31) + this.message.hashCode();
    }

    public String toString() {
        return "ChallanListModal(status=" + this.status + ", result=" + this.result + ", totalChallan=" + this.totalChallan + ", message=" + this.message + ')';
    }

    public /* synthetic */ ChallanListModal(int i, ArrayList arrayList, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? new ArrayList() : arrayList, i2, (i3 & 8) != 0 ? "" : str);
    }
}
