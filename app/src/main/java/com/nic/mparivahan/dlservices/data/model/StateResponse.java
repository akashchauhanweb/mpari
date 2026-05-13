package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import com.zepto.xy5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006HÆ\u0003J5\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R \u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/StateResponse;", "", "statusCode", "", "statusDesc", "stateMaster", "", "Lcom/nic/mparivahan/dlservices/data/model/StateMasterItem;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getStateMaster", "()Ljava/util/List;", "getStatusCode", "()Ljava/lang/String;", "getStatusDesc", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class StateResponse {

    @xy5("StateMaster")
    private final List<StateMasterItem> stateMaster;

    @xy5("status_code")
    private final String statusCode;

    @xy5("status_desc")
    private final String statusDesc;

    public StateResponse() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StateResponse copy$default(StateResponse stateResponse, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stateResponse.statusCode;
        }
        if ((i & 2) != 0) {
            str2 = stateResponse.statusDesc;
        }
        if ((i & 4) != 0) {
            list = stateResponse.stateMaster;
        }
        return stateResponse.copy(str, str2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatusCode() {
        return this.statusCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final List<StateMasterItem> component3() {
        return this.stateMaster;
    }

    public final StateResponse copy(String statusCode, String statusDesc, List<StateMasterItem> stateMaster) {
        return new StateResponse(statusCode, statusDesc, stateMaster);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StateResponse)) {
            return false;
        }
        StateResponse stateResponse = (StateResponse) other;
        return Intrinsics.areEqual(this.statusCode, stateResponse.statusCode) && Intrinsics.areEqual(this.statusDesc, stateResponse.statusDesc) && Intrinsics.areEqual(this.stateMaster, stateResponse.stateMaster);
    }

    public final List<StateMasterItem> getStateMaster() {
        return this.stateMaster;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        String str = this.statusCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.statusDesc;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<StateMasterItem> list = this.stateMaster;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "StateResponse(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ", stateMaster=" + this.stateMaster + ')';
    }

    public StateResponse(String str, String str2, List<StateMasterItem> list) {
        this.statusCode = str;
        this.statusDesc = str2;
        this.stateMaster = list;
    }

    public /* synthetic */ StateResponse(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list);
    }
}
