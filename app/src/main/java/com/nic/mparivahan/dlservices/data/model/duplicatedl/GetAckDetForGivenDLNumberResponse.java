package com.nic.mparivahan.dlservices.data.model.duplicatedl;

import androidx.annotation.Keep;
import com.nic.mparivahan.dlservices.data.model.DlSubmitResult;
import com.zepto.xy5;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/duplicatedl/GetAckDetForGivenDLNumberResponse;", "Ljava/io/Serializable;", "dlSubmitresult", "Lcom/nic/mparivahan/dlservices/data/model/DlSubmitResult;", "(Lcom/nic/mparivahan/dlservices/data/model/DlSubmitResult;)V", "getDlSubmitresult", "()Lcom/nic/mparivahan/dlservices/data/model/DlSubmitResult;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class GetAckDetForGivenDLNumberResponse implements Serializable {

    @xy5("result")
    private final DlSubmitResult dlSubmitresult;

    public GetAckDetForGivenDLNumberResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ GetAckDetForGivenDLNumberResponse copy$default(GetAckDetForGivenDLNumberResponse getAckDetForGivenDLNumberResponse, DlSubmitResult dlSubmitResult, int i, Object obj) {
        if ((i & 1) != 0) {
            dlSubmitResult = getAckDetForGivenDLNumberResponse.dlSubmitresult;
        }
        return getAckDetForGivenDLNumberResponse.copy(dlSubmitResult);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DlSubmitResult getDlSubmitresult() {
        return this.dlSubmitresult;
    }

    public final GetAckDetForGivenDLNumberResponse copy(DlSubmitResult dlSubmitresult) {
        return new GetAckDetForGivenDLNumberResponse(dlSubmitresult);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GetAckDetForGivenDLNumberResponse) && Intrinsics.areEqual(this.dlSubmitresult, ((GetAckDetForGivenDLNumberResponse) other).dlSubmitresult);
    }

    public final DlSubmitResult getDlSubmitresult() {
        return this.dlSubmitresult;
    }

    public int hashCode() {
        DlSubmitResult dlSubmitResult = this.dlSubmitresult;
        if (dlSubmitResult == null) {
            return 0;
        }
        return dlSubmitResult.hashCode();
    }

    public String toString() {
        return "GetAckDetForGivenDLNumberResponse(dlSubmitresult=" + this.dlSubmitresult + ')';
    }

    public GetAckDetForGivenDLNumberResponse(DlSubmitResult dlSubmitResult) {
        this.dlSubmitresult = dlSubmitResult;
    }

    public /* synthetic */ GetAckDetForGivenDLNumberResponse(DlSubmitResult dlSubmitResult, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : dlSubmitResult);
    }
}
