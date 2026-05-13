package com.nic.mparivahan.VahanServices.SpecialPermit;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0007j\b\u0012\u0004\u0012\u00020\u0003`\b\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0007j\b\u0012\u0004\u0012\u00020\u0003`\b\u0012\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0007j\b\u0012\u0004\u0012\u00020\u0003`\b\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0019\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0007j\b\u0012\u0004\u0012\u00020\u0003`\bHÆ\u0003J\u0019\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0007j\b\u0012\u0004\u0012\u00020\u0003`\bHÆ\u0003J\u0019\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0007j\b\u0012\u0004\u0012\u00020\u0003`\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\fHÆ\u0003J\u0085\u0001\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0007j\b\u0012\u0004\u0012\u00020\u0003`\b2\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0007j\b\u0012\u0004\u0012\u00020\u0003`\b2\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0007j\b\u0012\u0004\u0012\u00020\u0003`\b2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR!\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0007j\b\u0012\u0004\u0012\u00020\u0003`\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R!\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0007j\b\u0012\u0004\u0012\u00020\u0003`\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0007j\b\u0012\u0004\u0012\u00020\u0003`\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011¨\u0006&"}, d2 = {"Lcom/nic/mparivahan/VahanServices/SpecialPermit/SpPermitData;", "", "allotmentOffice", "", "stateCode", "regnNo", "periodMode", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "natureOfGoods", "vmServiceType", "tmConfigSpecialPermitDetails", "Lcom/nic/mparivahan/VahanServices/SpecialPermit/SpPermitConfigDetails;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Lcom/nic/mparivahan/VahanServices/SpecialPermit/SpPermitConfigDetails;)V", "getAllotmentOffice", "()Ljava/lang/String;", "getNatureOfGoods", "()Ljava/util/ArrayList;", "getPeriodMode", "getRegnNo", "getStateCode", "getTmConfigSpecialPermitDetails", "()Lcom/nic/mparivahan/VahanServices/SpecialPermit/SpPermitConfigDetails;", "getVmServiceType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SpPermitData {
    private final String allotmentOffice;
    private final ArrayList<String> natureOfGoods;
    private final ArrayList<String> periodMode;
    private final String regnNo;
    private final String stateCode;
    private final SpPermitConfigDetails tmConfigSpecialPermitDetails;
    private final ArrayList<String> vmServiceType;

    public SpPermitData(String str, String str2, String str3, ArrayList<String> periodMode, ArrayList<String> natureOfGoods, ArrayList<String> vmServiceType, SpPermitConfigDetails tmConfigSpecialPermitDetails) {
        Intrinsics.checkNotNullParameter(periodMode, "periodMode");
        Intrinsics.checkNotNullParameter(natureOfGoods, "natureOfGoods");
        Intrinsics.checkNotNullParameter(vmServiceType, "vmServiceType");
        Intrinsics.checkNotNullParameter(tmConfigSpecialPermitDetails, "tmConfigSpecialPermitDetails");
        this.allotmentOffice = str;
        this.stateCode = str2;
        this.regnNo = str3;
        this.periodMode = periodMode;
        this.natureOfGoods = natureOfGoods;
        this.vmServiceType = vmServiceType;
        this.tmConfigSpecialPermitDetails = tmConfigSpecialPermitDetails;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpPermitData copy$default(SpPermitData spPermitData, String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SpPermitConfigDetails spPermitConfigDetails, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spPermitData.allotmentOffice;
        }
        if ((i & 2) != 0) {
            str2 = spPermitData.stateCode;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = spPermitData.regnNo;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            arrayList = spPermitData.periodMode;
        }
        ArrayList arrayList4 = arrayList;
        if ((i & 16) != 0) {
            arrayList2 = spPermitData.natureOfGoods;
        }
        ArrayList arrayList5 = arrayList2;
        if ((i & 32) != 0) {
            arrayList3 = spPermitData.vmServiceType;
        }
        ArrayList arrayList6 = arrayList3;
        if ((i & 64) != 0) {
            spPermitConfigDetails = spPermitData.tmConfigSpecialPermitDetails;
        }
        return spPermitData.copy(str, str4, str5, arrayList4, arrayList5, arrayList6, spPermitConfigDetails);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAllotmentOffice() {
        return this.allotmentOffice;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStateCode() {
        return this.stateCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRegnNo() {
        return this.regnNo;
    }

    public final ArrayList<String> component4() {
        return this.periodMode;
    }

    public final ArrayList<String> component5() {
        return this.natureOfGoods;
    }

    public final ArrayList<String> component6() {
        return this.vmServiceType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final SpPermitConfigDetails getTmConfigSpecialPermitDetails() {
        return this.tmConfigSpecialPermitDetails;
    }

    public final SpPermitData copy(String allotmentOffice, String stateCode, String regnNo, ArrayList<String> periodMode, ArrayList<String> natureOfGoods, ArrayList<String> vmServiceType, SpPermitConfigDetails tmConfigSpecialPermitDetails) {
        Intrinsics.checkNotNullParameter(periodMode, "periodMode");
        Intrinsics.checkNotNullParameter(natureOfGoods, "natureOfGoods");
        Intrinsics.checkNotNullParameter(vmServiceType, "vmServiceType");
        Intrinsics.checkNotNullParameter(tmConfigSpecialPermitDetails, "tmConfigSpecialPermitDetails");
        return new SpPermitData(allotmentOffice, stateCode, regnNo, periodMode, natureOfGoods, vmServiceType, tmConfigSpecialPermitDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpPermitData)) {
            return false;
        }
        SpPermitData spPermitData = (SpPermitData) other;
        return Intrinsics.areEqual(this.allotmentOffice, spPermitData.allotmentOffice) && Intrinsics.areEqual(this.stateCode, spPermitData.stateCode) && Intrinsics.areEqual(this.regnNo, spPermitData.regnNo) && Intrinsics.areEqual(this.periodMode, spPermitData.periodMode) && Intrinsics.areEqual(this.natureOfGoods, spPermitData.natureOfGoods) && Intrinsics.areEqual(this.vmServiceType, spPermitData.vmServiceType) && Intrinsics.areEqual(this.tmConfigSpecialPermitDetails, spPermitData.tmConfigSpecialPermitDetails);
    }

    public final String getAllotmentOffice() {
        return this.allotmentOffice;
    }

    public final ArrayList<String> getNatureOfGoods() {
        return this.natureOfGoods;
    }

    public final ArrayList<String> getPeriodMode() {
        return this.periodMode;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public final SpPermitConfigDetails getTmConfigSpecialPermitDetails() {
        return this.tmConfigSpecialPermitDetails;
    }

    public final ArrayList<String> getVmServiceType() {
        return this.vmServiceType;
    }

    public int hashCode() {
        String str = this.allotmentOffice;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.stateCode;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.regnNo;
        return ((((((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.periodMode.hashCode()) * 31) + this.natureOfGoods.hashCode()) * 31) + this.vmServiceType.hashCode()) * 31) + this.tmConfigSpecialPermitDetails.hashCode();
    }

    public String toString() {
        return "SpPermitData(allotmentOffice=" + this.allotmentOffice + ", stateCode=" + this.stateCode + ", regnNo=" + this.regnNo + ", periodMode=" + this.periodMode + ", natureOfGoods=" + this.natureOfGoods + ", vmServiceType=" + this.vmServiceType + ", tmConfigSpecialPermitDetails=" + this.tmConfigSpecialPermitDetails + ')';
    }

    public /* synthetic */ SpPermitData(String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SpPermitConfigDetails spPermitConfigDetails, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, arrayList, arrayList2, arrayList3, spPermitConfigDetails);
    }
}
