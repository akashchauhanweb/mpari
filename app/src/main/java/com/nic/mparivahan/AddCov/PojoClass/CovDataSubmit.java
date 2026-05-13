package com.nic.mparivahan.AddCov.PojoClass;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u0019\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J7\u0010\u0012\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/nic/mparivahan/AddCov/PojoClass/CovDataSubmit;", "", "ApplStatus_ACK_Details", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/AddCov/PojoClass/ApplStatusACKDetail;", "Lkotlin/collections/ArrayList;", "status_code", "", "status_desc", "(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V", "getApplStatus_ACK_Details", "()Ljava/util/ArrayList;", "getStatus_code", "()Ljava/lang/String;", "getStatus_desc", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CovDataSubmit {
    private final ArrayList<ApplStatusACKDetail> ApplStatus_ACK_Details;
    private final String status_code;
    private final String status_desc;

    public CovDataSubmit(ArrayList<ApplStatusACKDetail> ApplStatus_ACK_Details, String status_code, String status_desc) {
        Intrinsics.checkNotNullParameter(ApplStatus_ACK_Details, "ApplStatus_ACK_Details");
        Intrinsics.checkNotNullParameter(status_code, "status_code");
        Intrinsics.checkNotNullParameter(status_desc, "status_desc");
        this.ApplStatus_ACK_Details = ApplStatus_ACK_Details;
        this.status_code = status_code;
        this.status_desc = status_desc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CovDataSubmit copy$default(CovDataSubmit covDataSubmit, ArrayList arrayList, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = covDataSubmit.ApplStatus_ACK_Details;
        }
        if ((i & 2) != 0) {
            str = covDataSubmit.status_code;
        }
        if ((i & 4) != 0) {
            str2 = covDataSubmit.status_desc;
        }
        return covDataSubmit.copy(arrayList, str, str2);
    }

    public final ArrayList<ApplStatusACKDetail> component1() {
        return this.ApplStatus_ACK_Details;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatus_code() {
        return this.status_code;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatus_desc() {
        return this.status_desc;
    }

    public final CovDataSubmit copy(ArrayList<ApplStatusACKDetail> ApplStatus_ACK_Details, String status_code, String status_desc) {
        Intrinsics.checkNotNullParameter(ApplStatus_ACK_Details, "ApplStatus_ACK_Details");
        Intrinsics.checkNotNullParameter(status_code, "status_code");
        Intrinsics.checkNotNullParameter(status_desc, "status_desc");
        return new CovDataSubmit(ApplStatus_ACK_Details, status_code, status_desc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CovDataSubmit)) {
            return false;
        }
        CovDataSubmit covDataSubmit = (CovDataSubmit) other;
        return Intrinsics.areEqual(this.ApplStatus_ACK_Details, covDataSubmit.ApplStatus_ACK_Details) && Intrinsics.areEqual(this.status_code, covDataSubmit.status_code) && Intrinsics.areEqual(this.status_desc, covDataSubmit.status_desc);
    }

    public final ArrayList<ApplStatusACKDetail> getApplStatus_ACK_Details() {
        return this.ApplStatus_ACK_Details;
    }

    public final String getStatus_code() {
        return this.status_code;
    }

    public final String getStatus_desc() {
        return this.status_desc;
    }

    public int hashCode() {
        return (((this.ApplStatus_ACK_Details.hashCode() * 31) + this.status_code.hashCode()) * 31) + this.status_desc.hashCode();
    }

    public String toString() {
        return "CovDataSubmit(ApplStatus_ACK_Details=" + this.ApplStatus_ACK_Details + ", status_code=" + this.status_code + ", status_desc=" + this.status_desc + ')';
    }
}
