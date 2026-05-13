package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOPurposeData.TOPurposeResponseData;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOPurposeData/TOPurposeResponseData/Data;", "", "code", "", "description", "", "stateCode", "(ILjava/lang/String;Ljava/lang/String;)V", "getCode", "()I", "getDescription", "()Ljava/lang/String;", "getStateCode", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Data {
    private final int code;
    private final String description;
    private final String stateCode;

    public Data(int i, String str, String str2) {
        this.code = i;
        this.description = str;
        this.stateCode = str2;
    }

    public static /* synthetic */ Data copy$default(Data data, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = data.code;
        }
        if ((i2 & 2) != 0) {
            str = data.description;
        }
        if ((i2 & 4) != 0) {
            str2 = data.stateCode;
        }
        return data.copy(i, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStateCode() {
        return this.stateCode;
    }

    public final Data copy(int code, String description, String stateCode) {
        return new Data(code, description, stateCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Data)) {
            return false;
        }
        Data data = (Data) other;
        return this.code == data.code && Intrinsics.areEqual(this.description, data.description) && Intrinsics.areEqual(this.stateCode, data.stateCode);
    }

    public final int getCode() {
        return this.code;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.code) * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.stateCode;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Data(code=" + this.code + ", description=" + this.description + ", stateCode=" + this.stateCode + ')';
    }
}
