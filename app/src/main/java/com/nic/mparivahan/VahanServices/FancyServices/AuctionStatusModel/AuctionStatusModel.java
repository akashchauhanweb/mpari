package com.nic.mparivahan.VahanServices.FancyServices.AuctionStatusModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/nic/mparivahan/VahanServices/FancyServices/AuctionStatusModel/AuctionStatusModel;", "", "data", "Lcom/nic/mparivahan/VahanServices/FancyServices/AuctionStatusModel/Data;", "message", "", "status", "(Lcom/nic/mparivahan/VahanServices/FancyServices/AuctionStatusModel/Data;Ljava/lang/String;Ljava/lang/String;)V", "getData", "()Lcom/nic/mparivahan/VahanServices/FancyServices/AuctionStatusModel/Data;", "getMessage", "()Ljava/lang/String;", "getStatus", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AuctionStatusModel {
    private final Data data;
    private final String message;
    private final String status;

    public AuctionStatusModel(Data data, String str, String str2) {
        this.data = data;
        this.message = str;
        this.status = str2;
    }

    public static /* synthetic */ AuctionStatusModel copy$default(AuctionStatusModel auctionStatusModel, Data data, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            data = auctionStatusModel.data;
        }
        if ((i & 2) != 0) {
            str = auctionStatusModel.message;
        }
        if ((i & 4) != 0) {
            str2 = auctionStatusModel.status;
        }
        return auctionStatusModel.copy(data, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Data getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final AuctionStatusModel copy(Data data, String message, String status) {
        return new AuctionStatusModel(data, message, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuctionStatusModel)) {
            return false;
        }
        AuctionStatusModel auctionStatusModel = (AuctionStatusModel) other;
        return Intrinsics.areEqual(this.data, auctionStatusModel.data) && Intrinsics.areEqual(this.message, auctionStatusModel.message) && Intrinsics.areEqual(this.status, auctionStatusModel.status);
    }

    public final Data getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        Data data = this.data;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        String str = this.message;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.status;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "AuctionStatusModel(data=" + this.data + ", message=" + this.message + ", status=" + this.status + ')';
    }
}
