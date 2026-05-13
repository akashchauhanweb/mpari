package com.nic.mparivahan.VahanServices.FancyServices.AllotmentLetterModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/nic/mparivahan/VahanServices/FancyServices/AllotmentLetterModel/AllotmentLetterModel;", "", "data", "", "message", "status", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getData", "()Ljava/lang/String;", "getMessage", "getStatus", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AllotmentLetterModel {
    private final String data;
    private final String message;
    private final String status;

    public AllotmentLetterModel(String data, String message, String status) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(status, "status");
        this.data = data;
        this.message = message;
        this.status = status;
    }

    public static /* synthetic */ AllotmentLetterModel copy$default(AllotmentLetterModel allotmentLetterModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = allotmentLetterModel.data;
        }
        if ((i & 2) != 0) {
            str2 = allotmentLetterModel.message;
        }
        if ((i & 4) != 0) {
            str3 = allotmentLetterModel.status;
        }
        return allotmentLetterModel.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getData() {
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

    public final AllotmentLetterModel copy(String data, String message, String status) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(status, "status");
        return new AllotmentLetterModel(data, message, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AllotmentLetterModel)) {
            return false;
        }
        AllotmentLetterModel allotmentLetterModel = (AllotmentLetterModel) other;
        return Intrinsics.areEqual(this.data, allotmentLetterModel.data) && Intrinsics.areEqual(this.message, allotmentLetterModel.message) && Intrinsics.areEqual(this.status, allotmentLetterModel.status);
    }

    public final String getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((this.data.hashCode() * 31) + this.message.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "AllotmentLetterModel(data=" + this.data + ", message=" + this.message + ", status=" + this.status + ')';
    }
}
