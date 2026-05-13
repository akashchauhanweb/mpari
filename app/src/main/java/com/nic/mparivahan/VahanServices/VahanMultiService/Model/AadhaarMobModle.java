package com.nic.mparivahan.VahanServices.VahanMultiService.Model;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/AadhaarMobModle;", "Ljava/io/Serializable;", "apiMessage", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/ApiMessageX;", "data", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DataX;", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/ApiMessageX;Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DataX;)V", "getApiMessage", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/ApiMessageX;", "getData", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DataX;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AadhaarMobModle implements Serializable {
    private final ApiMessageX apiMessage;
    private final DataX data;

    public AadhaarMobModle(ApiMessageX apiMessage, DataX data) {
        Intrinsics.checkNotNullParameter(apiMessage, "apiMessage");
        Intrinsics.checkNotNullParameter(data, "data");
        this.apiMessage = apiMessage;
        this.data = data;
    }

    public static /* synthetic */ AadhaarMobModle copy$default(AadhaarMobModle aadhaarMobModle, ApiMessageX apiMessageX, DataX dataX, int i, Object obj) {
        if ((i & 1) != 0) {
            apiMessageX = aadhaarMobModle.apiMessage;
        }
        if ((i & 2) != 0) {
            dataX = aadhaarMobModle.data;
        }
        return aadhaarMobModle.copy(apiMessageX, dataX);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ApiMessageX getApiMessage() {
        return this.apiMessage;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DataX getData() {
        return this.data;
    }

    public final AadhaarMobModle copy(ApiMessageX apiMessage, DataX data) {
        Intrinsics.checkNotNullParameter(apiMessage, "apiMessage");
        Intrinsics.checkNotNullParameter(data, "data");
        return new AadhaarMobModle(apiMessage, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AadhaarMobModle)) {
            return false;
        }
        AadhaarMobModle aadhaarMobModle = (AadhaarMobModle) other;
        return Intrinsics.areEqual(this.apiMessage, aadhaarMobModle.apiMessage) && Intrinsics.areEqual(this.data, aadhaarMobModle.data);
    }

    public final ApiMessageX getApiMessage() {
        return this.apiMessage;
    }

    public final DataX getData() {
        return this.data;
    }

    public int hashCode() {
        return (this.apiMessage.hashCode() * 31) + this.data.hashCode();
    }

    public String toString() {
        return "AadhaarMobModle(apiMessage=" + this.apiMessage + ", data=" + this.data + ')';
    }
}
