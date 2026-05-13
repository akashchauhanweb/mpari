package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/CustomStateResponse;", "", "stateCustomDetailsDto", "Lcom/nic/mparivahan/dlservices/data/model/StateCustomDetailsDto;", "responseMsg", "Lcom/nic/mparivahan/dlservices/data/model/CustomStateResponseMsg;", "(Lcom/nic/mparivahan/dlservices/data/model/StateCustomDetailsDto;Lcom/nic/mparivahan/dlservices/data/model/CustomStateResponseMsg;)V", "getResponseMsg", "()Lcom/nic/mparivahan/dlservices/data/model/CustomStateResponseMsg;", "getStateCustomDetailsDto", "()Lcom/nic/mparivahan/dlservices/data/model/StateCustomDetailsDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CustomStateResponse {

    @xy5("responseMsg")
    private final CustomStateResponseMsg responseMsg;

    @xy5("stateCustomDetailsDto")
    private final StateCustomDetailsDto stateCustomDetailsDto;

    public CustomStateResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CustomStateResponse copy$default(CustomStateResponse customStateResponse, StateCustomDetailsDto stateCustomDetailsDto, CustomStateResponseMsg customStateResponseMsg, int i, Object obj) {
        if ((i & 1) != 0) {
            stateCustomDetailsDto = customStateResponse.stateCustomDetailsDto;
        }
        if ((i & 2) != 0) {
            customStateResponseMsg = customStateResponse.responseMsg;
        }
        return customStateResponse.copy(stateCustomDetailsDto, customStateResponseMsg);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final StateCustomDetailsDto getStateCustomDetailsDto() {
        return this.stateCustomDetailsDto;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CustomStateResponseMsg getResponseMsg() {
        return this.responseMsg;
    }

    public final CustomStateResponse copy(StateCustomDetailsDto stateCustomDetailsDto, CustomStateResponseMsg responseMsg) {
        return new CustomStateResponse(stateCustomDetailsDto, responseMsg);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomStateResponse)) {
            return false;
        }
        CustomStateResponse customStateResponse = (CustomStateResponse) other;
        return Intrinsics.areEqual(this.stateCustomDetailsDto, customStateResponse.stateCustomDetailsDto) && Intrinsics.areEqual(this.responseMsg, customStateResponse.responseMsg);
    }

    public final CustomStateResponseMsg getResponseMsg() {
        return this.responseMsg;
    }

    public final StateCustomDetailsDto getStateCustomDetailsDto() {
        return this.stateCustomDetailsDto;
    }

    public int hashCode() {
        StateCustomDetailsDto stateCustomDetailsDto = this.stateCustomDetailsDto;
        int iHashCode = (stateCustomDetailsDto == null ? 0 : stateCustomDetailsDto.hashCode()) * 31;
        CustomStateResponseMsg customStateResponseMsg = this.responseMsg;
        return iHashCode + (customStateResponseMsg != null ? customStateResponseMsg.hashCode() : 0);
    }

    public String toString() {
        return "CustomStateResponse(stateCustomDetailsDto=" + this.stateCustomDetailsDto + ", responseMsg=" + this.responseMsg + ')';
    }

    public CustomStateResponse(StateCustomDetailsDto stateCustomDetailsDto, CustomStateResponseMsg customStateResponseMsg) {
        this.stateCustomDetailsDto = stateCustomDetailsDto;
        this.responseMsg = customStateResponseMsg;
    }

    public /* synthetic */ CustomStateResponse(StateCustomDetailsDto stateCustomDetailsDto, CustomStateResponseMsg customStateResponseMsg, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : stateCustomDetailsDto, (i & 2) != 0 ? null : customStateResponseMsg);
    }
}
