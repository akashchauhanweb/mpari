package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/RtoResponse;", "", "rtosMasterDto", "Lcom/nic/mparivahan/dlservices/data/model/RtosMasterDto;", "(Lcom/nic/mparivahan/dlservices/data/model/RtosMasterDto;)V", "getRtosMasterDto", "()Lcom/nic/mparivahan/dlservices/data/model/RtosMasterDto;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class RtoResponse {

    @xy5("rtosMasterDto")
    private final RtosMasterDto rtosMasterDto;

    public RtoResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ RtoResponse copy$default(RtoResponse rtoResponse, RtosMasterDto rtosMasterDto, int i, Object obj) {
        if ((i & 1) != 0) {
            rtosMasterDto = rtoResponse.rtosMasterDto;
        }
        return rtoResponse.copy(rtosMasterDto);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final RtosMasterDto getRtosMasterDto() {
        return this.rtosMasterDto;
    }

    public final RtoResponse copy(RtosMasterDto rtosMasterDto) {
        return new RtoResponse(rtosMasterDto);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RtoResponse) && Intrinsics.areEqual(this.rtosMasterDto, ((RtoResponse) other).rtosMasterDto);
    }

    public final RtosMasterDto getRtosMasterDto() {
        return this.rtosMasterDto;
    }

    public int hashCode() {
        RtosMasterDto rtosMasterDto = this.rtosMasterDto;
        if (rtosMasterDto == null) {
            return 0;
        }
        return rtosMasterDto.hashCode();
    }

    public String toString() {
        return "RtoResponse(rtosMasterDto=" + this.rtosMasterDto + ')';
    }

    public RtoResponse(RtosMasterDto rtosMasterDto) {
        this.rtosMasterDto = rtosMasterDto;
    }

    public /* synthetic */ RtoResponse(RtosMasterDto rtosMasterDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : rtosMasterDto);
    }
}
