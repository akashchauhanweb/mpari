package com.nic.mparivahan.dlservices.newlearner.DataClass;

import androidx.annotation.Keep;
import com.zepto.xy5;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/nic/mparivahan/dlservices/newlearner/DataClass/CampResponseModal;", "", "status_code", "", "status_desc", "CampDetails", "", "Lcom/nic/mparivahan/dlservices/newlearner/DataClass/CampDetailsResponseModal;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCampDetails", "()Ljava/util/List;", "getStatus_code", "()Ljava/lang/String;", "getStatus_desc", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CampResponseModal {

    @xy5("CampDetails")
    private final List<CampDetailsResponseModal> CampDetails;

    @xy5("status_code")
    private final String status_code;

    @xy5("status_desc")
    private final String status_desc;

    public CampResponseModal() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CampResponseModal copy$default(CampResponseModal campResponseModal, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = campResponseModal.status_code;
        }
        if ((i & 2) != 0) {
            str2 = campResponseModal.status_desc;
        }
        if ((i & 4) != 0) {
            list = campResponseModal.CampDetails;
        }
        return campResponseModal.copy(str, str2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatus_code() {
        return this.status_code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatus_desc() {
        return this.status_desc;
    }

    public final List<CampDetailsResponseModal> component3() {
        return this.CampDetails;
    }

    public final CampResponseModal copy(String status_code, String status_desc, List<CampDetailsResponseModal> CampDetails) {
        Intrinsics.checkNotNullParameter(status_code, "status_code");
        Intrinsics.checkNotNullParameter(status_desc, "status_desc");
        Intrinsics.checkNotNullParameter(CampDetails, "CampDetails");
        return new CampResponseModal(status_code, status_desc, CampDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CampResponseModal)) {
            return false;
        }
        CampResponseModal campResponseModal = (CampResponseModal) other;
        return Intrinsics.areEqual(this.status_code, campResponseModal.status_code) && Intrinsics.areEqual(this.status_desc, campResponseModal.status_desc) && Intrinsics.areEqual(this.CampDetails, campResponseModal.CampDetails);
    }

    public final List<CampDetailsResponseModal> getCampDetails() {
        return this.CampDetails;
    }

    public final String getStatus_code() {
        return this.status_code;
    }

    public final String getStatus_desc() {
        return this.status_desc;
    }

    public int hashCode() {
        return (((this.status_code.hashCode() * 31) + this.status_desc.hashCode()) * 31) + this.CampDetails.hashCode();
    }

    public String toString() {
        return "CampResponseModal(status_code=" + this.status_code + ", status_desc=" + this.status_desc + ", CampDetails=" + this.CampDetails + ')';
    }

    public CampResponseModal(String status_code, String status_desc, List<CampDetailsResponseModal> CampDetails) {
        Intrinsics.checkNotNullParameter(status_code, "status_code");
        Intrinsics.checkNotNullParameter(status_desc, "status_desc");
        Intrinsics.checkNotNullParameter(CampDetails, "CampDetails");
        this.status_code = status_code;
        this.status_desc = status_desc;
        this.CampDetails = CampDetails;
    }

    public /* synthetic */ CampResponseModal(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new ArrayList() : list);
    }
}
