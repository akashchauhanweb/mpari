package com.nic.mparivahan.VahanServices.FancyServices.AvailableFancyModel;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/nic/mparivahan/VahanServices/FancyServices/AvailableFancyModel/AvailableFancyModel;", "", "data", "", "Lcom/nic/mparivahan/VahanServices/FancyServices/AvailableFancyModel/Data;", "message", "", "status", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getData", "()Ljava/util/List;", "getMessage", "()Ljava/lang/String;", "getStatus", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AvailableFancyModel {
    private final List<Data> data;
    private final String message;
    private final String status;

    public AvailableFancyModel(List<Data> data, String message, String status) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(status, "status");
        this.data = data;
        this.message = message;
        this.status = status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AvailableFancyModel copy$default(AvailableFancyModel availableFancyModel, List list, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = availableFancyModel.data;
        }
        if ((i & 2) != 0) {
            str = availableFancyModel.message;
        }
        if ((i & 4) != 0) {
            str2 = availableFancyModel.status;
        }
        return availableFancyModel.copy(list, str, str2);
    }

    public final List<Data> component1() {
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

    public final AvailableFancyModel copy(List<Data> data, String message, String status) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(status, "status");
        return new AvailableFancyModel(data, message, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvailableFancyModel)) {
            return false;
        }
        AvailableFancyModel availableFancyModel = (AvailableFancyModel) other;
        return Intrinsics.areEqual(this.data, availableFancyModel.data) && Intrinsics.areEqual(this.message, availableFancyModel.message) && Intrinsics.areEqual(this.status, availableFancyModel.status);
    }

    public final List<Data> getData() {
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
        return "AvailableFancyModel(data=" + this.data + ", message=" + this.message + ", status=" + this.status + ')';
    }
}
