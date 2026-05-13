package com.nic.mparivahan.ServiceWithdrawnScreen.Modal;

import androidx.annotation.Keep;
import com.zepto.xy5;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\nHÆ\u0003JO\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\nHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR*\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/nic/mparivahan/ServiceWithdrawnScreen/Modal/AppliedServiceListModal;", "", "validateService", "", "statusDesp", "statusCd", "applNo", "appliedServiceResultModal", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/ServiceWithdrawnScreen/Modal/AppliedServiceResultModal;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "getApplNo", "()Ljava/lang/String;", "getAppliedServiceResultModal", "()Ljava/util/ArrayList;", "getStatusCd", "getStatusDesp", "getValidateService", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AppliedServiceListModal {

    @xy5("applicationNumber")
    private final String applNo;

    @xy5("Result")
    private final ArrayList<AppliedServiceResultModal> appliedServiceResultModal;

    @xy5("status_code")
    private final String statusCd;

    @xy5("status_desp")
    private final String statusDesp;

    @xy5("validateService")
    private final String validateService;

    public AppliedServiceListModal() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppliedServiceListModal copy$default(AppliedServiceListModal appliedServiceListModal, String str, String str2, String str3, String str4, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appliedServiceListModal.validateService;
        }
        if ((i & 2) != 0) {
            str2 = appliedServiceListModal.statusDesp;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = appliedServiceListModal.statusCd;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = appliedServiceListModal.applNo;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            arrayList = appliedServiceListModal.appliedServiceResultModal;
        }
        return appliedServiceListModal.copy(str, str5, str6, str7, arrayList);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getValidateService() {
        return this.validateService;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatusDesp() {
        return this.statusDesp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatusCd() {
        return this.statusCd;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getApplNo() {
        return this.applNo;
    }

    public final ArrayList<AppliedServiceResultModal> component5() {
        return this.appliedServiceResultModal;
    }

    public final AppliedServiceListModal copy(String validateService, String statusDesp, String statusCd, String applNo, ArrayList<AppliedServiceResultModal> appliedServiceResultModal) {
        Intrinsics.checkNotNullParameter(validateService, "validateService");
        Intrinsics.checkNotNullParameter(statusDesp, "statusDesp");
        Intrinsics.checkNotNullParameter(statusCd, "statusCd");
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        return new AppliedServiceListModal(validateService, statusDesp, statusCd, applNo, appliedServiceResultModal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppliedServiceListModal)) {
            return false;
        }
        AppliedServiceListModal appliedServiceListModal = (AppliedServiceListModal) other;
        return Intrinsics.areEqual(this.validateService, appliedServiceListModal.validateService) && Intrinsics.areEqual(this.statusDesp, appliedServiceListModal.statusDesp) && Intrinsics.areEqual(this.statusCd, appliedServiceListModal.statusCd) && Intrinsics.areEqual(this.applNo, appliedServiceListModal.applNo) && Intrinsics.areEqual(this.appliedServiceResultModal, appliedServiceListModal.appliedServiceResultModal);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final ArrayList<AppliedServiceResultModal> getAppliedServiceResultModal() {
        return this.appliedServiceResultModal;
    }

    public final String getStatusCd() {
        return this.statusCd;
    }

    public final String getStatusDesp() {
        return this.statusDesp;
    }

    public final String getValidateService() {
        return this.validateService;
    }

    public int hashCode() {
        int iHashCode = ((((((this.validateService.hashCode() * 31) + this.statusDesp.hashCode()) * 31) + this.statusCd.hashCode()) * 31) + this.applNo.hashCode()) * 31;
        ArrayList<AppliedServiceResultModal> arrayList = this.appliedServiceResultModal;
        return iHashCode + (arrayList == null ? 0 : arrayList.hashCode());
    }

    public String toString() {
        return "AppliedServiceListModal(validateService=" + this.validateService + ", statusDesp=" + this.statusDesp + ", statusCd=" + this.statusCd + ", applNo=" + this.applNo + ", appliedServiceResultModal=" + this.appliedServiceResultModal + ')';
    }

    public AppliedServiceListModal(String validateService, String statusDesp, String statusCd, String applNo, ArrayList<AppliedServiceResultModal> arrayList) {
        Intrinsics.checkNotNullParameter(validateService, "validateService");
        Intrinsics.checkNotNullParameter(statusDesp, "statusDesp");
        Intrinsics.checkNotNullParameter(statusCd, "statusCd");
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        this.validateService = validateService;
        this.statusDesp = statusDesp;
        this.statusCd = statusCd;
        this.applNo = applNo;
        this.appliedServiceResultModal = arrayList;
    }

    public /* synthetic */ AppliedServiceListModal(String str, String str2, String str3, String str4, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? null : arrayList);
    }
}
