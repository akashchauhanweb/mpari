package com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.CalculateValidity;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0010J\u000b\u0010!\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010(\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u009e\u0001\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0006HÖ\u0001J\t\u00103\u001a\u00020\u000eHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0012¨\u00064"}, d2 = {"Lcom/nic/mparivahan/VahanServices/DuplicateFitness/TempPermitModel/CalculateValidity/Data;", "", "allotmentOffice", "goodsType", "natureOfGoods", "period", "", "periodMode", "purposeOfJourny", "regnNo", "stateCode", "tmConfigurationTempPmt", "validFrom", "validUpto", "", "vmServiceType", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V", "getAllotmentOffice", "()Ljava/lang/Object;", "getGoodsType", "getNatureOfGoods", "getPeriod", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPeriodMode", "getPurposeOfJourny", "getRegnNo", "getStateCode", "getTmConfigurationTempPmt", "getValidFrom", "getValidUpto", "()Ljava/lang/String;", "getVmServiceType", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Lcom/nic/mparivahan/VahanServices/DuplicateFitness/TempPermitModel/CalculateValidity/Data;", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Data {
    private final Object allotmentOffice;
    private final Object goodsType;
    private final Object natureOfGoods;
    private final Integer period;
    private final Object periodMode;
    private final Object purposeOfJourny;
    private final Object regnNo;
    private final Object stateCode;
    private final Object tmConfigurationTempPmt;
    private final Object validFrom;
    private final String validUpto;
    private final Object vmServiceType;

    public Data(Object obj, Object obj2, Object obj3, Integer num, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, String str, Object obj10) {
        this.allotmentOffice = obj;
        this.goodsType = obj2;
        this.natureOfGoods = obj3;
        this.period = num;
        this.periodMode = obj4;
        this.purposeOfJourny = obj5;
        this.regnNo = obj6;
        this.stateCode = obj7;
        this.tmConfigurationTempPmt = obj8;
        this.validFrom = obj9;
        this.validUpto = str;
        this.vmServiceType = obj10;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Object getAllotmentOffice() {
        return this.allotmentOffice;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Object getValidFrom() {
        return this.validFrom;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getValidUpto() {
        return this.validUpto;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Object getVmServiceType() {
        return this.vmServiceType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getGoodsType() {
        return this.goodsType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Object getNatureOfGoods() {
        return this.natureOfGoods;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getPeriod() {
        return this.period;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Object getPeriodMode() {
        return this.periodMode;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Object getPurposeOfJourny() {
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
    public final Object getTmConfigurationTempPmt() {
        return this.tmConfigurationTempPmt;
    }

    public final Data copy(Object allotmentOffice, Object goodsType, Object natureOfGoods, Integer period, Object periodMode, Object purposeOfJourny, Object regnNo, Object stateCode, Object tmConfigurationTempPmt, Object validFrom, String validUpto, Object vmServiceType) {
        return new Data(allotmentOffice, goodsType, natureOfGoods, period, periodMode, purposeOfJourny, regnNo, stateCode, tmConfigurationTempPmt, validFrom, validUpto, vmServiceType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Data)) {
            return false;
        }
        Data data = (Data) other;
        return Intrinsics.areEqual(this.allotmentOffice, data.allotmentOffice) && Intrinsics.areEqual(this.goodsType, data.goodsType) && Intrinsics.areEqual(this.natureOfGoods, data.natureOfGoods) && Intrinsics.areEqual(this.period, data.period) && Intrinsics.areEqual(this.periodMode, data.periodMode) && Intrinsics.areEqual(this.purposeOfJourny, data.purposeOfJourny) && Intrinsics.areEqual(this.regnNo, data.regnNo) && Intrinsics.areEqual(this.stateCode, data.stateCode) && Intrinsics.areEqual(this.tmConfigurationTempPmt, data.tmConfigurationTempPmt) && Intrinsics.areEqual(this.validFrom, data.validFrom) && Intrinsics.areEqual(this.validUpto, data.validUpto) && Intrinsics.areEqual(this.vmServiceType, data.vmServiceType);
    }

    public final Object getAllotmentOffice() {
        return this.allotmentOffice;
    }

    public final Object getGoodsType() {
        return this.goodsType;
    }

    public final Object getNatureOfGoods() {
        return this.natureOfGoods;
    }

    public final Integer getPeriod() {
        return this.period;
    }

    public final Object getPeriodMode() {
        return this.periodMode;
    }

    public final Object getPurposeOfJourny() {
        return this.purposeOfJourny;
    }

    public final Object getRegnNo() {
        return this.regnNo;
    }

    public final Object getStateCode() {
        return this.stateCode;
    }

    public final Object getTmConfigurationTempPmt() {
        return this.tmConfigurationTempPmt;
    }

    public final Object getValidFrom() {
        return this.validFrom;
    }

    public final String getValidUpto() {
        return this.validUpto;
    }

    public final Object getVmServiceType() {
        return this.vmServiceType;
    }

    public int hashCode() {
        Object obj = this.allotmentOffice;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.goodsType;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.natureOfGoods;
        int iHashCode3 = (iHashCode2 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Integer num = this.period;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Object obj4 = this.periodMode;
        int iHashCode5 = (iHashCode4 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        Object obj5 = this.purposeOfJourny;
        int iHashCode6 = (iHashCode5 + (obj5 == null ? 0 : obj5.hashCode())) * 31;
        Object obj6 = this.regnNo;
        int iHashCode7 = (iHashCode6 + (obj6 == null ? 0 : obj6.hashCode())) * 31;
        Object obj7 = this.stateCode;
        int iHashCode8 = (iHashCode7 + (obj7 == null ? 0 : obj7.hashCode())) * 31;
        Object obj8 = this.tmConfigurationTempPmt;
        int iHashCode9 = (iHashCode8 + (obj8 == null ? 0 : obj8.hashCode())) * 31;
        Object obj9 = this.validFrom;
        int iHashCode10 = (iHashCode9 + (obj9 == null ? 0 : obj9.hashCode())) * 31;
        String str = this.validUpto;
        int iHashCode11 = (iHashCode10 + (str == null ? 0 : str.hashCode())) * 31;
        Object obj10 = this.vmServiceType;
        return iHashCode11 + (obj10 != null ? obj10.hashCode() : 0);
    }

    public String toString() {
        return "Data(allotmentOffice=" + this.allotmentOffice + ", goodsType=" + this.goodsType + ", natureOfGoods=" + this.natureOfGoods + ", period=" + this.period + ", periodMode=" + this.periodMode + ", purposeOfJourny=" + this.purposeOfJourny + ", regnNo=" + this.regnNo + ", stateCode=" + this.stateCode + ", tmConfigurationTempPmt=" + this.tmConfigurationTempPmt + ", validFrom=" + this.validFrom + ", validUpto=" + this.validUpto + ", vmServiceType=" + this.vmServiceType + ')';
    }
}
