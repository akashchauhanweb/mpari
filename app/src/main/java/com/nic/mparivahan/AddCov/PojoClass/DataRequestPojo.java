package com.nic.mparivahan.AddCov.PojoClass;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/nic/mparivahan/AddCov/PojoClass/DataRequestPojo;", "", "ApplStatus_Details", "Lcom/nic/mparivahan/AddCov/PojoClass/ApplStatusDetails;", "status_code", "", "status_desc", "(Lcom/nic/mparivahan/AddCov/PojoClass/ApplStatusDetails;Ljava/lang/String;Ljava/lang/String;)V", "getApplStatus_Details", "()Lcom/nic/mparivahan/AddCov/PojoClass/ApplStatusDetails;", "getStatus_code", "()Ljava/lang/String;", "getStatus_desc", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DataRequestPojo {
    private final ApplStatusDetails ApplStatus_Details;
    private final String status_code;
    private final String status_desc;

    public DataRequestPojo(ApplStatusDetails ApplStatus_Details, String status_code, String status_desc) {
        Intrinsics.checkNotNullParameter(ApplStatus_Details, "ApplStatus_Details");
        Intrinsics.checkNotNullParameter(status_code, "status_code");
        Intrinsics.checkNotNullParameter(status_desc, "status_desc");
        this.ApplStatus_Details = ApplStatus_Details;
        this.status_code = status_code;
        this.status_desc = status_desc;
    }

    public static /* synthetic */ DataRequestPojo copy$default(DataRequestPojo dataRequestPojo, ApplStatusDetails applStatusDetails, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            applStatusDetails = dataRequestPojo.ApplStatus_Details;
        }
        if ((i & 2) != 0) {
            str = dataRequestPojo.status_code;
        }
        if ((i & 4) != 0) {
            str2 = dataRequestPojo.status_desc;
        }
        return dataRequestPojo.copy(applStatusDetails, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ApplStatusDetails getApplStatus_Details() {
        return this.ApplStatus_Details;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatus_code() {
        return this.status_code;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatus_desc() {
        return this.status_desc;
    }

    public final DataRequestPojo copy(ApplStatusDetails ApplStatus_Details, String status_code, String status_desc) {
        Intrinsics.checkNotNullParameter(ApplStatus_Details, "ApplStatus_Details");
        Intrinsics.checkNotNullParameter(status_code, "status_code");
        Intrinsics.checkNotNullParameter(status_desc, "status_desc");
        return new DataRequestPojo(ApplStatus_Details, status_code, status_desc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataRequestPojo)) {
            return false;
        }
        DataRequestPojo dataRequestPojo = (DataRequestPojo) other;
        return Intrinsics.areEqual(this.ApplStatus_Details, dataRequestPojo.ApplStatus_Details) && Intrinsics.areEqual(this.status_code, dataRequestPojo.status_code) && Intrinsics.areEqual(this.status_desc, dataRequestPojo.status_desc);
    }

    public final ApplStatusDetails getApplStatus_Details() {
        return this.ApplStatus_Details;
    }

    public final String getStatus_code() {
        return this.status_code;
    }

    public final String getStatus_desc() {
        return this.status_desc;
    }

    public int hashCode() {
        return (((this.ApplStatus_Details.hashCode() * 31) + this.status_code.hashCode()) * 31) + this.status_desc.hashCode();
    }

    public String toString() {
        return "DataRequestPojo(ApplStatus_Details=" + this.ApplStatus_Details + ", status_code=" + this.status_code + ", status_desc=" + this.status_desc + ')';
    }
}
