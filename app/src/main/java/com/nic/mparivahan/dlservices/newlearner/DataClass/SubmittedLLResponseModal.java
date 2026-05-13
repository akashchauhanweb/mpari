package com.nic.mparivahan.dlservices.newlearner.DataClass;

import androidx.annotation.Keep;
import com.zepto.xy5;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u001c\b\u0002\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\bHÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u001c\b\u0002\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R*\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/nic/mparivahan/dlservices/newlearner/DataClass/SubmittedLLResponseModal;", "", "status_code", "", "status_desc", "NewLLAcknowledgement", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/dlservices/newlearner/DataClass/NewLLAcknowledgement;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "getNewLLAcknowledgement", "()Ljava/util/ArrayList;", "getStatus_code", "()Ljava/lang/String;", "setStatus_code", "(Ljava/lang/String;)V", "getStatus_desc", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SubmittedLLResponseModal {

    @xy5("NewLLAcknowledgement")
    private final ArrayList<NewLLAcknowledgement> NewLLAcknowledgement;

    @xy5("status_code")
    private String status_code;

    @xy5("status_desc")
    private final String status_desc;

    public SubmittedLLResponseModal() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubmittedLLResponseModal copy$default(SubmittedLLResponseModal submittedLLResponseModal, String str, String str2, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = submittedLLResponseModal.status_code;
        }
        if ((i & 2) != 0) {
            str2 = submittedLLResponseModal.status_desc;
        }
        if ((i & 4) != 0) {
            arrayList = submittedLLResponseModal.NewLLAcknowledgement;
        }
        return submittedLLResponseModal.copy(str, str2, arrayList);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatus_code() {
        return this.status_code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatus_desc() {
        return this.status_desc;
    }

    public final ArrayList<NewLLAcknowledgement> component3() {
        return this.NewLLAcknowledgement;
    }

    public final SubmittedLLResponseModal copy(String status_code, String status_desc, ArrayList<NewLLAcknowledgement> NewLLAcknowledgement) {
        Intrinsics.checkNotNullParameter(status_code, "status_code");
        Intrinsics.checkNotNullParameter(status_desc, "status_desc");
        return new SubmittedLLResponseModal(status_code, status_desc, NewLLAcknowledgement);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubmittedLLResponseModal)) {
            return false;
        }
        SubmittedLLResponseModal submittedLLResponseModal = (SubmittedLLResponseModal) other;
        return Intrinsics.areEqual(this.status_code, submittedLLResponseModal.status_code) && Intrinsics.areEqual(this.status_desc, submittedLLResponseModal.status_desc) && Intrinsics.areEqual(this.NewLLAcknowledgement, submittedLLResponseModal.NewLLAcknowledgement);
    }

    public final ArrayList<NewLLAcknowledgement> getNewLLAcknowledgement() {
        return this.NewLLAcknowledgement;
    }

    public final String getStatus_code() {
        return this.status_code;
    }

    public final String getStatus_desc() {
        return this.status_desc;
    }

    public int hashCode() {
        int iHashCode = ((this.status_code.hashCode() * 31) + this.status_desc.hashCode()) * 31;
        ArrayList<NewLLAcknowledgement> arrayList = this.NewLLAcknowledgement;
        return iHashCode + (arrayList == null ? 0 : arrayList.hashCode());
    }

    public final void setStatus_code(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.status_code = str;
    }

    public String toString() {
        return "SubmittedLLResponseModal(status_code=" + this.status_code + ", status_desc=" + this.status_desc + ", NewLLAcknowledgement=" + this.NewLLAcknowledgement + ')';
    }

    public SubmittedLLResponseModal(String status_code, String status_desc, ArrayList<NewLLAcknowledgement> arrayList) {
        Intrinsics.checkNotNullParameter(status_code, "status_code");
        Intrinsics.checkNotNullParameter(status_desc, "status_desc");
        this.status_code = status_code;
        this.status_desc = status_desc;
        this.NewLLAcknowledgement = arrayList;
    }

    public /* synthetic */ SubmittedLLResponseModal(String str, String str2, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : arrayList);
    }
}
