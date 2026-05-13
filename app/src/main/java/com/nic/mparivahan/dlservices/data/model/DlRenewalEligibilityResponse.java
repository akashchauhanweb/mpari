package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/DlRenewalEligibilityResponse;", "", "dlservicesValidationdto", "Lcom/nic/mparivahan/dlservices/data/model/DlservicesValidationdto;", "(Lcom/nic/mparivahan/dlservices/data/model/DlservicesValidationdto;)V", "getDlservicesValidationdto", "()Lcom/nic/mparivahan/dlservices/data/model/DlservicesValidationdto;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DlRenewalEligibilityResponse {

    @xy5("dlservicesValidationdto")
    private final DlservicesValidationdto dlservicesValidationdto;

    public DlRenewalEligibilityResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DlRenewalEligibilityResponse copy$default(DlRenewalEligibilityResponse dlRenewalEligibilityResponse, DlservicesValidationdto dlservicesValidationdto, int i, Object obj) {
        if ((i & 1) != 0) {
            dlservicesValidationdto = dlRenewalEligibilityResponse.dlservicesValidationdto;
        }
        return dlRenewalEligibilityResponse.copy(dlservicesValidationdto);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DlservicesValidationdto getDlservicesValidationdto() {
        return this.dlservicesValidationdto;
    }

    public final DlRenewalEligibilityResponse copy(DlservicesValidationdto dlservicesValidationdto) {
        return new DlRenewalEligibilityResponse(dlservicesValidationdto);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DlRenewalEligibilityResponse) && Intrinsics.areEqual(this.dlservicesValidationdto, ((DlRenewalEligibilityResponse) other).dlservicesValidationdto);
    }

    public final DlservicesValidationdto getDlservicesValidationdto() {
        return this.dlservicesValidationdto;
    }

    public int hashCode() {
        DlservicesValidationdto dlservicesValidationdto = this.dlservicesValidationdto;
        if (dlservicesValidationdto == null) {
            return 0;
        }
        return dlservicesValidationdto.hashCode();
    }

    public String toString() {
        return "DlRenewalEligibilityResponse(dlservicesValidationdto=" + this.dlservicesValidationdto + ')';
    }

    public DlRenewalEligibilityResponse(DlservicesValidationdto dlservicesValidationdto) {
        this.dlservicesValidationdto = dlservicesValidationdto;
    }

    public /* synthetic */ DlRenewalEligibilityResponse(DlservicesValidationdto dlservicesValidationdto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : dlservicesValidationdto);
    }
}
