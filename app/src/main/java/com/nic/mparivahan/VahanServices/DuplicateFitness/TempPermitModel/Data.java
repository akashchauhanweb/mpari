package com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel;

import androidx.annotation.Keep;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.DetailModle.TmConfigurationTempPmt;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B·\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u001a\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\b\u0012\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\b\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u001a\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\u001d\u0010(\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\u001d\u0010+\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\bHÆ\u0003J\t\u0010,\u001a\u00020\nHÆ\u0003J\u001d\u0010-\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\bHÆ\u0003J\u001d\u0010.\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\bHÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003JÓ\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u001c\b\u0002\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\b2\u001c\b\u0002\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\b2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\u001c\b\u0002\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u00106\u001a\u00020\nHÖ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R%\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR%\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR%\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R%\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001a¨\u00068"}, d2 = {"Lcom/nic/mparivahan/VahanServices/DuplicateFitness/TempPermitModel/Data;", "Ljava/io/Serializable;", "allotmentOffice", "", "goodsType", "", "natureOfGoods", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "period", "", "periodMode", "purposeOfJourny", "regnNo", "stateCode", "validFrom", "validUpto", "vmServiceType", "tmConfigurationTempPmt", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/TempPermitModel/DetailModle/TmConfigurationTempPmt;", "(Ljava/lang/String;Ljava/lang/Object;Ljava/util/ArrayList;ILjava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Lcom/nic/mparivahan/VahanServices/DuplicateFitness/TempPermitModel/DetailModle/TmConfigurationTempPmt;)V", "getAllotmentOffice", "()Ljava/lang/String;", "getGoodsType", "()Ljava/lang/Object;", "getNatureOfGoods", "()Ljava/util/ArrayList;", "getPeriod", "()I", "getPeriodMode", "getPurposeOfJourny", "getRegnNo", "getStateCode", "getTmConfigurationTempPmt", "()Lcom/nic/mparivahan/VahanServices/DuplicateFitness/TempPermitModel/DetailModle/TmConfigurationTempPmt;", "getValidFrom", "getValidUpto", "getVmServiceType", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Data implements Serializable {
    private final String allotmentOffice;
    private final Object goodsType;
    private final ArrayList<String> natureOfGoods;
    private final int period;
    private final ArrayList<String> periodMode;
    private final ArrayList<String> purposeOfJourny;
    private final Object regnNo;
    private final Object stateCode;
    private final TmConfigurationTempPmt tmConfigurationTempPmt;
    private final Object validFrom;
    private final Object validUpto;
    private final ArrayList<String> vmServiceType;

    public Data(String allotmentOffice, Object goodsType, ArrayList<String> arrayList, int i, ArrayList<String> arrayList2, ArrayList<String> arrayList3, Object regnNo, Object stateCode, Object validFrom, Object validUpto, ArrayList<String> arrayList4, TmConfigurationTempPmt tmConfigurationTempPmt) {
        Intrinsics.checkNotNullParameter(allotmentOffice, "allotmentOffice");
        Intrinsics.checkNotNullParameter(goodsType, "goodsType");
        Intrinsics.checkNotNullParameter(regnNo, "regnNo");
        Intrinsics.checkNotNullParameter(stateCode, "stateCode");
        Intrinsics.checkNotNullParameter(validFrom, "validFrom");
        Intrinsics.checkNotNullParameter(validUpto, "validUpto");
        this.allotmentOffice = allotmentOffice;
        this.goodsType = goodsType;
        this.natureOfGoods = arrayList;
        this.period = i;
        this.periodMode = arrayList2;
        this.purposeOfJourny = arrayList3;
        this.regnNo = regnNo;
        this.stateCode = stateCode;
        this.validFrom = validFrom;
        this.validUpto = validUpto;
        this.vmServiceType = arrayList4;
        this.tmConfigurationTempPmt = tmConfigurationTempPmt;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAllotmentOffice() {
        return this.allotmentOffice;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Object getValidUpto() {
        return this.validUpto;
    }

    public final ArrayList<String> component11() {
        return this.vmServiceType;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final TmConfigurationTempPmt getTmConfigurationTempPmt() {
        return this.tmConfigurationTempPmt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getGoodsType() {
        return this.goodsType;
    }

    public final ArrayList<String> component3() {
        return this.natureOfGoods;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getPeriod() {
        return this.period;
    }

    public final ArrayList<String> component5() {
        return this.periodMode;
    }

    public final ArrayList<String> component6() {
        return this.purposeOfJourny;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Object getRegnNo() {
        return this.regnNo;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Object getStateCode() {
        return this.stateCode;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Object getValidFrom() {
        return this.validFrom;
    }

    public final Data copy(String allotmentOffice, Object goodsType, ArrayList<String> natureOfGoods, int period, ArrayList<String> periodMode, ArrayList<String> purposeOfJourny, Object regnNo, Object stateCode, Object validFrom, Object validUpto, ArrayList<String> vmServiceType, TmConfigurationTempPmt tmConfigurationTempPmt) {
        Intrinsics.checkNotNullParameter(allotmentOffice, "allotmentOffice");
        Intrinsics.checkNotNullParameter(goodsType, "goodsType");
        Intrinsics.checkNotNullParameter(regnNo, "regnNo");
        Intrinsics.checkNotNullParameter(stateCode, "stateCode");
        Intrinsics.checkNotNullParameter(validFrom, "validFrom");
        Intrinsics.checkNotNullParameter(validUpto, "validUpto");
        return new Data(allotmentOffice, goodsType, natureOfGoods, period, periodMode, purposeOfJourny, regnNo, stateCode, validFrom, validUpto, vmServiceType, tmConfigurationTempPmt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Data)) {
            return false;
        }
        Data data = (Data) other;
        return Intrinsics.areEqual(this.allotmentOffice, data.allotmentOffice) && Intrinsics.areEqual(this.goodsType, data.goodsType) && Intrinsics.areEqual(this.natureOfGoods, data.natureOfGoods) && this.period == data.period && Intrinsics.areEqual(this.periodMode, data.periodMode) && Intrinsics.areEqual(this.purposeOfJourny, data.purposeOfJourny) && Intrinsics.areEqual(this.regnNo, data.regnNo) && Intrinsics.areEqual(this.stateCode, data.stateCode) && Intrinsics.areEqual(this.validFrom, data.validFrom) && Intrinsics.areEqual(this.validUpto, data.validUpto) && Intrinsics.areEqual(this.vmServiceType, data.vmServiceType) && Intrinsics.areEqual(this.tmConfigurationTempPmt, data.tmConfigurationTempPmt);
    }

    public final String getAllotmentOffice() {
        return this.allotmentOffice;
    }

    public final Object getGoodsType() {
        return this.goodsType;
    }

    public final ArrayList<String> getNatureOfGoods() {
        return this.natureOfGoods;
    }

    public final int getPeriod() {
        return this.period;
    }

    public final ArrayList<String> getPeriodMode() {
        return this.periodMode;
    }

    public final ArrayList<String> getPurposeOfJourny() {
        return this.purposeOfJourny;
    }

    public final Object getRegnNo() {
        return this.regnNo;
    }

    public final Object getStateCode() {
        return this.stateCode;
    }

    public final TmConfigurationTempPmt getTmConfigurationTempPmt() {
        return this.tmConfigurationTempPmt;
    }

    public final Object getValidFrom() {
        return this.validFrom;
    }

    public final Object getValidUpto() {
        return this.validUpto;
    }

    public final ArrayList<String> getVmServiceType() {
        return this.vmServiceType;
    }

    public int hashCode() {
        int iHashCode = ((this.allotmentOffice.hashCode() * 31) + this.goodsType.hashCode()) * 31;
        ArrayList<String> arrayList = this.natureOfGoods;
        int iHashCode2 = (((iHashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31) + Integer.hashCode(this.period)) * 31;
        ArrayList<String> arrayList2 = this.periodMode;
        int iHashCode3 = (iHashCode2 + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
        ArrayList<String> arrayList3 = this.purposeOfJourny;
        int iHashCode4 = (((((((((iHashCode3 + (arrayList3 == null ? 0 : arrayList3.hashCode())) * 31) + this.regnNo.hashCode()) * 31) + this.stateCode.hashCode()) * 31) + this.validFrom.hashCode()) * 31) + this.validUpto.hashCode()) * 31;
        ArrayList<String> arrayList4 = this.vmServiceType;
        int iHashCode5 = (iHashCode4 + (arrayList4 == null ? 0 : arrayList4.hashCode())) * 31;
        TmConfigurationTempPmt tmConfigurationTempPmt = this.tmConfigurationTempPmt;
        return iHashCode5 + (tmConfigurationTempPmt != null ? tmConfigurationTempPmt.hashCode() : 0);
    }

    public String toString() {
        return "Data(allotmentOffice=" + this.allotmentOffice + ", goodsType=" + this.goodsType + ", natureOfGoods=" + this.natureOfGoods + ", period=" + this.period + ", periodMode=" + this.periodMode + ", purposeOfJourny=" + this.purposeOfJourny + ", regnNo=" + this.regnNo + ", stateCode=" + this.stateCode + ", validFrom=" + this.validFrom + ", validUpto=" + this.validUpto + ", vmServiceType=" + this.vmServiceType + ", tmConfigurationTempPmt=" + this.tmConfigurationTempPmt + ')';
    }
}
