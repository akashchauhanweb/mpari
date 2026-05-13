package com.nic.mparivahan.RC.Model;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0019\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tHÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR!\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/nic/mparivahan/RC/Model/ImpoundRcSuccessModel;", "", "status", "", "message", "", "result", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/RC/Model/ImpoundRcResultModel;", "Lkotlin/collections/ArrayList;", "(ILjava/lang/String;Ljava/util/ArrayList;)V", "getMessage", "()Ljava/lang/String;", "getResult", "()Ljava/util/ArrayList;", "getStatus", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ImpoundRcSuccessModel {
    private final String message;
    private final ArrayList<ImpoundRcResultModel> result;
    private final int status;

    public ImpoundRcSuccessModel(int i, String message, ArrayList<ImpoundRcResultModel> result) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(result, "result");
        this.status = i;
        this.message = message;
        this.result = result;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ImpoundRcSuccessModel copy$default(ImpoundRcSuccessModel impoundRcSuccessModel, int i, String str, ArrayList arrayList, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = impoundRcSuccessModel.status;
        }
        if ((i2 & 2) != 0) {
            str = impoundRcSuccessModel.message;
        }
        if ((i2 & 4) != 0) {
            arrayList = impoundRcSuccessModel.result;
        }
        return impoundRcSuccessModel.copy(i, str, arrayList);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final ArrayList<ImpoundRcResultModel> component3() {
        return this.result;
    }

    public final ImpoundRcSuccessModel copy(int status, String message, ArrayList<ImpoundRcResultModel> result) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(result, "result");
        return new ImpoundRcSuccessModel(status, message, result);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImpoundRcSuccessModel)) {
            return false;
        }
        ImpoundRcSuccessModel impoundRcSuccessModel = (ImpoundRcSuccessModel) other;
        return this.status == impoundRcSuccessModel.status && Intrinsics.areEqual(this.message, impoundRcSuccessModel.message) && Intrinsics.areEqual(this.result, impoundRcSuccessModel.result);
    }

    public final String getMessage() {
        return this.message;
    }

    public final ArrayList<ImpoundRcResultModel> getResult() {
        return this.result;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.status) * 31) + this.message.hashCode()) * 31) + this.result.hashCode();
    }

    public String toString() {
        return "ImpoundRcSuccessModel(status=" + this.status + ", message=" + this.message + ", result=" + this.result + ')';
    }

    public /* synthetic */ ImpoundRcSuccessModel(int i, String str, ArrayList arrayList, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? new ArrayList() : arrayList);
    }
}
