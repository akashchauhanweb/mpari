package com.nic.mparivahan.NewDlScreen.Modal;

import androidx.annotation.Keep;
import com.zepto.xy5;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\t¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\tHÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\tHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR*\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/nic/mparivahan/NewDlScreen/Modal/SubmitDlResponseModal;", "", "statusCd", "", "statusDesc", "msg", "submittedDlDetails", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/NewDlScreen/Modal/SubmittedDlDetailsModal;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "getMsg", "()Ljava/lang/String;", "getStatusCd", "getStatusDesc", "getSubmittedDlDetails", "()Ljava/util/ArrayList;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SubmitDlResponseModal {

    @xy5("msg")
    private final String msg;

    @xy5("status_code")
    private final String statusCd;

    @xy5("status_desc")
    private final String statusDesc;

    @xy5("DLDetails")
    private final ArrayList<SubmittedDlDetailsModal> submittedDlDetails;

    public SubmitDlResponseModal(String statusCd, String statusDesc, String msg, ArrayList<SubmittedDlDetailsModal> arrayList) {
        Intrinsics.checkNotNullParameter(statusCd, "statusCd");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.statusCd = statusCd;
        this.statusDesc = statusDesc;
        this.msg = msg;
        this.submittedDlDetails = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubmitDlResponseModal copy$default(SubmitDlResponseModal submitDlResponseModal, String str, String str2, String str3, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = submitDlResponseModal.statusCd;
        }
        if ((i & 2) != 0) {
            str2 = submitDlResponseModal.statusDesc;
        }
        if ((i & 4) != 0) {
            str3 = submitDlResponseModal.msg;
        }
        if ((i & 8) != 0) {
            arrayList = submitDlResponseModal.submittedDlDetails;
        }
        return submitDlResponseModal.copy(str, str2, str3, arrayList);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatusCd() {
        return this.statusCd;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatusDesc() {
        return this.statusDesc;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    public final ArrayList<SubmittedDlDetailsModal> component4() {
        return this.submittedDlDetails;
    }

    public final SubmitDlResponseModal copy(String statusCd, String statusDesc, String msg, ArrayList<SubmittedDlDetailsModal> submittedDlDetails) {
        Intrinsics.checkNotNullParameter(statusCd, "statusCd");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        Intrinsics.checkNotNullParameter(msg, "msg");
        return new SubmitDlResponseModal(statusCd, statusDesc, msg, submittedDlDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubmitDlResponseModal)) {
            return false;
        }
        SubmitDlResponseModal submitDlResponseModal = (SubmitDlResponseModal) other;
        return Intrinsics.areEqual(this.statusCd, submitDlResponseModal.statusCd) && Intrinsics.areEqual(this.statusDesc, submitDlResponseModal.statusDesc) && Intrinsics.areEqual(this.msg, submitDlResponseModal.msg) && Intrinsics.areEqual(this.submittedDlDetails, submitDlResponseModal.submittedDlDetails);
    }

    public final String getMsg() {
        return this.msg;
    }

    public final String getStatusCd() {
        return this.statusCd;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final ArrayList<SubmittedDlDetailsModal> getSubmittedDlDetails() {
        return this.submittedDlDetails;
    }

    public int hashCode() {
        int iHashCode = ((((this.statusCd.hashCode() * 31) + this.statusDesc.hashCode()) * 31) + this.msg.hashCode()) * 31;
        ArrayList<SubmittedDlDetailsModal> arrayList = this.submittedDlDetails;
        return iHashCode + (arrayList == null ? 0 : arrayList.hashCode());
    }

    public String toString() {
        return "SubmitDlResponseModal(statusCd=" + this.statusCd + ", statusDesc=" + this.statusDesc + ", msg=" + this.msg + ", submittedDlDetails=" + this.submittedDlDetails + ')';
    }

    public /* synthetic */ SubmitDlResponseModal(String str, String str2, String str3, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : arrayList);
    }
}
