package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import com.zepto.xy5;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/DlRenewalSaveDto;", "Ljava/io/Serializable;", "result", "Lcom/nic/mparivahan/dlservices/data/model/DlSubmitResult;", "failure", "", "(Lcom/nic/mparivahan/dlservices/data/model/DlSubmitResult;Ljava/lang/Object;)V", "getFailure", "()Ljava/lang/Object;", "getResult", "()Lcom/nic/mparivahan/dlservices/data/model/DlSubmitResult;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DlRenewalSaveDto implements Serializable {

    @xy5("failure")
    private final Object failure;

    @xy5("result")
    private final DlSubmitResult result;

    public DlRenewalSaveDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DlRenewalSaveDto copy$default(DlRenewalSaveDto dlRenewalSaveDto, DlSubmitResult dlSubmitResult, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            dlSubmitResult = dlRenewalSaveDto.result;
        }
        if ((i & 2) != 0) {
            obj = dlRenewalSaveDto.failure;
        }
        return dlRenewalSaveDto.copy(dlSubmitResult, obj);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DlSubmitResult getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getFailure() {
        return this.failure;
    }

    public final DlRenewalSaveDto copy(DlSubmitResult result, Object failure) {
        return new DlRenewalSaveDto(result, failure);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DlRenewalSaveDto)) {
            return false;
        }
        DlRenewalSaveDto dlRenewalSaveDto = (DlRenewalSaveDto) other;
        return Intrinsics.areEqual(this.result, dlRenewalSaveDto.result) && Intrinsics.areEqual(this.failure, dlRenewalSaveDto.failure);
    }

    public final Object getFailure() {
        return this.failure;
    }

    public final DlSubmitResult getResult() {
        return this.result;
    }

    public int hashCode() {
        DlSubmitResult dlSubmitResult = this.result;
        int iHashCode = (dlSubmitResult == null ? 0 : dlSubmitResult.hashCode()) * 31;
        Object obj = this.failure;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        return "DlRenewalSaveDto(result=" + this.result + ", failure=" + this.failure + ')';
    }

    public DlRenewalSaveDto(DlSubmitResult dlSubmitResult, Object obj) {
        this.result = dlSubmitResult;
        this.failure = obj;
    }

    public /* synthetic */ DlRenewalSaveDto(DlSubmitResult dlSubmitResult, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : dlSubmitResult, (i & 2) != 0 ? null : obj);
    }
}
