package com.nic.mparivahan.RC.Model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/nic/mparivahan/RC/Model/GetSharedRecivedDoc;", "", "receivedDocs", "", "Lcom/nic/mparivahan/RC/Model/ReceivedDoc;", "sharedDocs", "Lcom/nic/mparivahan/RC/Model/SharedDoc;", "statusCode", "", "statusDesc", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getReceivedDocs", "()Ljava/util/List;", "getSharedDocs", "getStatusCode", "()Ljava/lang/String;", "getStatusDesc", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class GetSharedRecivedDoc {
    private final List<ReceivedDoc> receivedDocs;
    private final List<SharedDoc> sharedDocs;
    private final String statusCode;
    private final String statusDesc;

    public GetSharedRecivedDoc(List<ReceivedDoc> receivedDocs, List<SharedDoc> sharedDocs, String statusCode, String statusDesc) {
        Intrinsics.checkNotNullParameter(receivedDocs, "receivedDocs");
        Intrinsics.checkNotNullParameter(sharedDocs, "sharedDocs");
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        this.receivedDocs = receivedDocs;
        this.sharedDocs = sharedDocs;
        this.statusCode = statusCode;
        this.statusDesc = statusDesc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetSharedRecivedDoc copy$default(GetSharedRecivedDoc getSharedRecivedDoc, List list, List list2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getSharedRecivedDoc.receivedDocs;
        }
        if ((i & 2) != 0) {
            list2 = getSharedRecivedDoc.sharedDocs;
        }
        if ((i & 4) != 0) {
            str = getSharedRecivedDoc.statusCode;
        }
        if ((i & 8) != 0) {
            str2 = getSharedRecivedDoc.statusDesc;
        }
        return getSharedRecivedDoc.copy(list, list2, str, str2);
    }

    public final List<ReceivedDoc> component1() {
        return this.receivedDocs;
    }

    public final List<SharedDoc> component2() {
        return this.sharedDocs;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatusCode() {
        return this.statusCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final GetSharedRecivedDoc copy(List<ReceivedDoc> receivedDocs, List<SharedDoc> sharedDocs, String statusCode, String statusDesc) {
        Intrinsics.checkNotNullParameter(receivedDocs, "receivedDocs");
        Intrinsics.checkNotNullParameter(sharedDocs, "sharedDocs");
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        return new GetSharedRecivedDoc(receivedDocs, sharedDocs, statusCode, statusDesc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetSharedRecivedDoc)) {
            return false;
        }
        GetSharedRecivedDoc getSharedRecivedDoc = (GetSharedRecivedDoc) other;
        return Intrinsics.areEqual(this.receivedDocs, getSharedRecivedDoc.receivedDocs) && Intrinsics.areEqual(this.sharedDocs, getSharedRecivedDoc.sharedDocs) && Intrinsics.areEqual(this.statusCode, getSharedRecivedDoc.statusCode) && Intrinsics.areEqual(this.statusDesc, getSharedRecivedDoc.statusDesc);
    }

    public final List<ReceivedDoc> getReceivedDocs() {
        return this.receivedDocs;
    }

    public final List<SharedDoc> getSharedDocs() {
        return this.sharedDocs;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (((((this.receivedDocs.hashCode() * 31) + this.sharedDocs.hashCode()) * 31) + this.statusCode.hashCode()) * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "GetSharedRecivedDoc(receivedDocs=" + this.receivedDocs + ", sharedDocs=" + this.sharedDocs + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
