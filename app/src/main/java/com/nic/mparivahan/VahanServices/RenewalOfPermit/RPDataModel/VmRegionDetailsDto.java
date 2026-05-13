package com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel;

import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007\u0012\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0007\u0012\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u001d\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007HÆ\u0003J\u001d\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0007HÆ\u0003J\u001d\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0080\u0001\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u00072\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u00072\u001c\b\u0002\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0006HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR%\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R%\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R%\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lcom/nic/mparivahan/VahanServices/RenewalOfPermit/RPDataModel/VmRegionDetailsDto;", "Ljava/io/Serializable;", "offCd", "", "region", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "regionCd", "regionsCovered", "stateCd", "(Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;)V", "getOffCd", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRegion", "()Ljava/util/ArrayList;", "getRegionCd", "getRegionsCovered", "getStateCd", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;)Lcom/nic/mparivahan/VahanServices/RenewalOfPermit/RPDataModel/VmRegionDetailsDto;", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class VmRegionDetailsDto implements Serializable {
    private final Integer offCd;
    private final ArrayList<String> region;
    private final ArrayList<Integer> regionCd;
    private final ArrayList<Integer> regionsCovered;
    private final String stateCd;

    public VmRegionDetailsDto(Integer num, ArrayList<String> arrayList, ArrayList<Integer> arrayList2, ArrayList<Integer> arrayList3, String str) {
        this.offCd = num;
        this.region = arrayList;
        this.regionCd = arrayList2;
        this.regionsCovered = arrayList3;
        this.stateCd = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VmRegionDetailsDto copy$default(VmRegionDetailsDto vmRegionDetailsDto, Integer num, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = vmRegionDetailsDto.offCd;
        }
        if ((i & 2) != 0) {
            arrayList = vmRegionDetailsDto.region;
        }
        ArrayList arrayList4 = arrayList;
        if ((i & 4) != 0) {
            arrayList2 = vmRegionDetailsDto.regionCd;
        }
        ArrayList arrayList5 = arrayList2;
        if ((i & 8) != 0) {
            arrayList3 = vmRegionDetailsDto.regionsCovered;
        }
        ArrayList arrayList6 = arrayList3;
        if ((i & 16) != 0) {
            str = vmRegionDetailsDto.stateCd;
        }
        return vmRegionDetailsDto.copy(num, arrayList4, arrayList5, arrayList6, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getOffCd() {
        return this.offCd;
    }

    public final ArrayList<String> component2() {
        return this.region;
    }

    public final ArrayList<Integer> component3() {
        return this.regionCd;
    }

    public final ArrayList<Integer> component4() {
        return this.regionsCovered;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStateCd() {
        return this.stateCd;
    }

    public final VmRegionDetailsDto copy(Integer offCd, ArrayList<String> region, ArrayList<Integer> regionCd, ArrayList<Integer> regionsCovered, String stateCd) {
        return new VmRegionDetailsDto(offCd, region, regionCd, regionsCovered, stateCd);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VmRegionDetailsDto)) {
            return false;
        }
        VmRegionDetailsDto vmRegionDetailsDto = (VmRegionDetailsDto) other;
        return Intrinsics.areEqual(this.offCd, vmRegionDetailsDto.offCd) && Intrinsics.areEqual(this.region, vmRegionDetailsDto.region) && Intrinsics.areEqual(this.regionCd, vmRegionDetailsDto.regionCd) && Intrinsics.areEqual(this.regionsCovered, vmRegionDetailsDto.regionsCovered) && Intrinsics.areEqual(this.stateCd, vmRegionDetailsDto.stateCd);
    }

    public final Integer getOffCd() {
        return this.offCd;
    }

    public final ArrayList<String> getRegion() {
        return this.region;
    }

    public final ArrayList<Integer> getRegionCd() {
        return this.regionCd;
    }

    public final ArrayList<Integer> getRegionsCovered() {
        return this.regionsCovered;
    }

    public final String getStateCd() {
        return this.stateCd;
    }

    public int hashCode() {
        Integer num = this.offCd;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        ArrayList<String> arrayList = this.region;
        int iHashCode2 = (iHashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ArrayList<Integer> arrayList2 = this.regionCd;
        int iHashCode3 = (iHashCode2 + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
        ArrayList<Integer> arrayList3 = this.regionsCovered;
        int iHashCode4 = (iHashCode3 + (arrayList3 == null ? 0 : arrayList3.hashCode())) * 31;
        String str = this.stateCd;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "VmRegionDetailsDto(offCd=" + this.offCd + ", region=" + this.region + ", regionCd=" + this.regionCd + ", regionsCovered=" + this.regionsCovered + ", stateCd=" + this.stateCd + ')';
    }
}
