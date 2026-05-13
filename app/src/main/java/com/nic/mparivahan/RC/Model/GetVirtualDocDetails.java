package com.nic.mparivahan.RC.Model;

import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u0019\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J7\u0010\u0012\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/nic/mparivahan/RC/Model/GetVirtualDocDetails;", "Ljava/io/Serializable;", "mparCitizenDocInfo", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/RC/Model/MparCitizenDocInfo;", "Lkotlin/collections/ArrayList;", "statusCode", "", "statusDesc", "(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V", "getMparCitizenDocInfo", "()Ljava/util/ArrayList;", "getStatusCode", "()Ljava/lang/String;", "getStatusDesc", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class GetVirtualDocDetails implements Serializable {
    private final ArrayList<MparCitizenDocInfo> mparCitizenDocInfo;
    private final String statusCode;
    private final String statusDesc;

    public GetVirtualDocDetails(ArrayList<MparCitizenDocInfo> mparCitizenDocInfo, String statusCode, String statusDesc) {
        Intrinsics.checkNotNullParameter(mparCitizenDocInfo, "mparCitizenDocInfo");
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        this.mparCitizenDocInfo = mparCitizenDocInfo;
        this.statusCode = statusCode;
        this.statusDesc = statusDesc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetVirtualDocDetails copy$default(GetVirtualDocDetails getVirtualDocDetails, ArrayList arrayList, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = getVirtualDocDetails.mparCitizenDocInfo;
        }
        if ((i & 2) != 0) {
            str = getVirtualDocDetails.statusCode;
        }
        if ((i & 4) != 0) {
            str2 = getVirtualDocDetails.statusDesc;
        }
        return getVirtualDocDetails.copy(arrayList, str, str2);
    }

    public final ArrayList<MparCitizenDocInfo> component1() {
        return this.mparCitizenDocInfo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatusCode() {
        return this.statusCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final GetVirtualDocDetails copy(ArrayList<MparCitizenDocInfo> mparCitizenDocInfo, String statusCode, String statusDesc) {
        Intrinsics.checkNotNullParameter(mparCitizenDocInfo, "mparCitizenDocInfo");
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        return new GetVirtualDocDetails(mparCitizenDocInfo, statusCode, statusDesc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetVirtualDocDetails)) {
            return false;
        }
        GetVirtualDocDetails getVirtualDocDetails = (GetVirtualDocDetails) other;
        return Intrinsics.areEqual(this.mparCitizenDocInfo, getVirtualDocDetails.mparCitizenDocInfo) && Intrinsics.areEqual(this.statusCode, getVirtualDocDetails.statusCode) && Intrinsics.areEqual(this.statusDesc, getVirtualDocDetails.statusDesc);
    }

    public final ArrayList<MparCitizenDocInfo> getMparCitizenDocInfo() {
        return this.mparCitizenDocInfo;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (((this.mparCitizenDocInfo.hashCode() * 31) + this.statusCode.hashCode()) * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "GetVirtualDocDetails(mparCitizenDocInfo=" + this.mparCitizenDocInfo + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
