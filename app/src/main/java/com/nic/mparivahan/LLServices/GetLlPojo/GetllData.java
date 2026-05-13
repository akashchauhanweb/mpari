package com.nic.mparivahan.LLServices.GetLlPojo;

import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/nic/mparivahan/LLServices/GetLlPojo/GetllData;", "Ljava/io/Serializable;", "LLDetails", "", "Lcom/nic/mparivahan/LLServices/GetLlPojo/LLDetail;", "status_code", "", "status_desc", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getLLDetails", "()Ljava/util/List;", "getStatus_code", "()Ljava/lang/String;", "getStatus_desc", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class GetllData implements Serializable {
    private final List<LLDetail> LLDetails;
    private final String status_code;
    private final String status_desc;

    public GetllData(List<LLDetail> LLDetails, String status_code, String status_desc) {
        Intrinsics.checkNotNullParameter(LLDetails, "LLDetails");
        Intrinsics.checkNotNullParameter(status_code, "status_code");
        Intrinsics.checkNotNullParameter(status_desc, "status_desc");
        this.LLDetails = LLDetails;
        this.status_code = status_code;
        this.status_desc = status_desc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetllData copy$default(GetllData getllData, List list, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getllData.LLDetails;
        }
        if ((i & 2) != 0) {
            str = getllData.status_code;
        }
        if ((i & 4) != 0) {
            str2 = getllData.status_desc;
        }
        return getllData.copy(list, str, str2);
    }

    public final List<LLDetail> component1() {
        return this.LLDetails;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatus_code() {
        return this.status_code;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatus_desc() {
        return this.status_desc;
    }

    public final GetllData copy(List<LLDetail> LLDetails, String status_code, String status_desc) {
        Intrinsics.checkNotNullParameter(LLDetails, "LLDetails");
        Intrinsics.checkNotNullParameter(status_code, "status_code");
        Intrinsics.checkNotNullParameter(status_desc, "status_desc");
        return new GetllData(LLDetails, status_code, status_desc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetllData)) {
            return false;
        }
        GetllData getllData = (GetllData) other;
        return Intrinsics.areEqual(this.LLDetails, getllData.LLDetails) && Intrinsics.areEqual(this.status_code, getllData.status_code) && Intrinsics.areEqual(this.status_desc, getllData.status_desc);
    }

    public final List<LLDetail> getLLDetails() {
        return this.LLDetails;
    }

    public final String getStatus_code() {
        return this.status_code;
    }

    public final String getStatus_desc() {
        return this.status_desc;
    }

    public int hashCode() {
        return (((this.LLDetails.hashCode() * 31) + this.status_code.hashCode()) * 31) + this.status_desc.hashCode();
    }

    public String toString() {
        return "GetllData(LLDetails=" + this.LLDetails + ", status_code=" + this.status_code + ", status_desc=" + this.status_desc + ')';
    }
}
