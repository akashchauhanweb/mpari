package com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel;

import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B³\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003¢\u0006\u0002\u0010\u001bJ\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u000bHÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u000bHÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\u000f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u000bHÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003Já\u0001\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u0003HÆ\u0001J\u0013\u0010J\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010MHÖ\u0003J\t\u0010N\u001a\u00020\u000bHÖ\u0001J\t\u0010O\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001dR\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001dR\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001dR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001dR\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001d¨\u0006P"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanMultiService/BeforePaymentModel/SpecialPermitDto;", "Ljava/io/Serializable;", "allotmentOffice", "", "applNo", "goodsDetails", "goodsToCarry", "goodsType", "ipAddress", "issueDt", "offCd", "", "others", "period", "periodMode", "purCd", "purposeOfJourny", "regnNo", "routeDescription", "stateCd", "travelFrom", "travelUpto", "vaSplPassengerdto", "", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/BeforePaymentModel/VaSplPassengerdto;", "validFrom", "validUpto", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getAllotmentOffice", "()Ljava/lang/String;", "getApplNo", "getGoodsDetails", "getGoodsToCarry", "getGoodsType", "getIpAddress", "getIssueDt", "getOffCd", "()I", "getOthers", "getPeriod", "getPeriodMode", "getPurCd", "getPurposeOfJourny", "getRegnNo", "getRouteDescription", "getStateCd", "getTravelFrom", "getTravelUpto", "getVaSplPassengerdto", "()Ljava/util/List;", "getValidFrom", "getValidUpto", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SpecialPermitDto implements Serializable {
    private final String allotmentOffice;
    private final String applNo;
    private final String goodsDetails;
    private final String goodsToCarry;
    private final String goodsType;
    private final String ipAddress;
    private final String issueDt;
    private final int offCd;
    private final String others;
    private final int period;
    private final String periodMode;
    private final int purCd;
    private final String purposeOfJourny;
    private final String regnNo;
    private final String routeDescription;
    private final String stateCd;
    private final String travelFrom;
    private final String travelUpto;
    private final List<VaSplPassengerdto> vaSplPassengerdto;
    private final String validFrom;
    private final String validUpto;

    public SpecialPermitDto(String allotmentOffice, String applNo, String goodsDetails, String goodsToCarry, String goodsType, String ipAddress, String issueDt, int i, String others, int i2, String periodMode, int i3, String purposeOfJourny, String regnNo, String routeDescription, String stateCd, String travelFrom, String travelUpto, List<VaSplPassengerdto> vaSplPassengerdto, String validFrom, String validUpto) {
        Intrinsics.checkNotNullParameter(allotmentOffice, "allotmentOffice");
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(goodsDetails, "goodsDetails");
        Intrinsics.checkNotNullParameter(goodsToCarry, "goodsToCarry");
        Intrinsics.checkNotNullParameter(goodsType, "goodsType");
        Intrinsics.checkNotNullParameter(ipAddress, "ipAddress");
        Intrinsics.checkNotNullParameter(issueDt, "issueDt");
        Intrinsics.checkNotNullParameter(others, "others");
        Intrinsics.checkNotNullParameter(periodMode, "periodMode");
        Intrinsics.checkNotNullParameter(purposeOfJourny, "purposeOfJourny");
        Intrinsics.checkNotNullParameter(regnNo, "regnNo");
        Intrinsics.checkNotNullParameter(routeDescription, "routeDescription");
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        Intrinsics.checkNotNullParameter(travelFrom, "travelFrom");
        Intrinsics.checkNotNullParameter(travelUpto, "travelUpto");
        Intrinsics.checkNotNullParameter(vaSplPassengerdto, "vaSplPassengerdto");
        Intrinsics.checkNotNullParameter(validFrom, "validFrom");
        Intrinsics.checkNotNullParameter(validUpto, "validUpto");
        this.allotmentOffice = allotmentOffice;
        this.applNo = applNo;
        this.goodsDetails = goodsDetails;
        this.goodsToCarry = goodsToCarry;
        this.goodsType = goodsType;
        this.ipAddress = ipAddress;
        this.issueDt = issueDt;
        this.offCd = i;
        this.others = others;
        this.period = i2;
        this.periodMode = periodMode;
        this.purCd = i3;
        this.purposeOfJourny = purposeOfJourny;
        this.regnNo = regnNo;
        this.routeDescription = routeDescription;
        this.stateCd = stateCd;
        this.travelFrom = travelFrom;
        this.travelUpto = travelUpto;
        this.vaSplPassengerdto = vaSplPassengerdto;
        this.validFrom = validFrom;
        this.validUpto = validUpto;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAllotmentOffice() {
        return this.allotmentOffice;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getPeriod() {
        return this.period;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getPeriodMode() {
        return this.periodMode;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getPurCd() {
        return this.purCd;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getPurposeOfJourny() {
        return this.purposeOfJourny;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getRegnNo() {
        return this.regnNo;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getRouteDescription() {
        return this.routeDescription;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getStateCd() {
        return this.stateCd;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getTravelFrom() {
        return this.travelFrom;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getTravelUpto() {
        return this.travelUpto;
    }

    public final List<VaSplPassengerdto> component19() {
        return this.vaSplPassengerdto;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getApplNo() {
        return this.applNo;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getValidFrom() {
        return this.validFrom;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getValidUpto() {
        return this.validUpto;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getGoodsDetails() {
        return this.goodsDetails;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getGoodsToCarry() {
        return this.goodsToCarry;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getGoodsType() {
        return this.goodsType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getIpAddress() {
        return this.ipAddress;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getIssueDt() {
        return this.issueDt;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getOffCd() {
        return this.offCd;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getOthers() {
        return this.others;
    }

    public final SpecialPermitDto copy(String allotmentOffice, String applNo, String goodsDetails, String goodsToCarry, String goodsType, String ipAddress, String issueDt, int offCd, String others, int period, String periodMode, int purCd, String purposeOfJourny, String regnNo, String routeDescription, String stateCd, String travelFrom, String travelUpto, List<VaSplPassengerdto> vaSplPassengerdto, String validFrom, String validUpto) {
        Intrinsics.checkNotNullParameter(allotmentOffice, "allotmentOffice");
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(goodsDetails, "goodsDetails");
        Intrinsics.checkNotNullParameter(goodsToCarry, "goodsToCarry");
        Intrinsics.checkNotNullParameter(goodsType, "goodsType");
        Intrinsics.checkNotNullParameter(ipAddress, "ipAddress");
        Intrinsics.checkNotNullParameter(issueDt, "issueDt");
        Intrinsics.checkNotNullParameter(others, "others");
        Intrinsics.checkNotNullParameter(periodMode, "periodMode");
        Intrinsics.checkNotNullParameter(purposeOfJourny, "purposeOfJourny");
        Intrinsics.checkNotNullParameter(regnNo, "regnNo");
        Intrinsics.checkNotNullParameter(routeDescription, "routeDescription");
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        Intrinsics.checkNotNullParameter(travelFrom, "travelFrom");
        Intrinsics.checkNotNullParameter(travelUpto, "travelUpto");
        Intrinsics.checkNotNullParameter(vaSplPassengerdto, "vaSplPassengerdto");
        Intrinsics.checkNotNullParameter(validFrom, "validFrom");
        Intrinsics.checkNotNullParameter(validUpto, "validUpto");
        return new SpecialPermitDto(allotmentOffice, applNo, goodsDetails, goodsToCarry, goodsType, ipAddress, issueDt, offCd, others, period, periodMode, purCd, purposeOfJourny, regnNo, routeDescription, stateCd, travelFrom, travelUpto, vaSplPassengerdto, validFrom, validUpto);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpecialPermitDto)) {
            return false;
        }
        SpecialPermitDto specialPermitDto = (SpecialPermitDto) other;
        return Intrinsics.areEqual(this.allotmentOffice, specialPermitDto.allotmentOffice) && Intrinsics.areEqual(this.applNo, specialPermitDto.applNo) && Intrinsics.areEqual(this.goodsDetails, specialPermitDto.goodsDetails) && Intrinsics.areEqual(this.goodsToCarry, specialPermitDto.goodsToCarry) && Intrinsics.areEqual(this.goodsType, specialPermitDto.goodsType) && Intrinsics.areEqual(this.ipAddress, specialPermitDto.ipAddress) && Intrinsics.areEqual(this.issueDt, specialPermitDto.issueDt) && this.offCd == specialPermitDto.offCd && Intrinsics.areEqual(this.others, specialPermitDto.others) && this.period == specialPermitDto.period && Intrinsics.areEqual(this.periodMode, specialPermitDto.periodMode) && this.purCd == specialPermitDto.purCd && Intrinsics.areEqual(this.purposeOfJourny, specialPermitDto.purposeOfJourny) && Intrinsics.areEqual(this.regnNo, specialPermitDto.regnNo) && Intrinsics.areEqual(this.routeDescription, specialPermitDto.routeDescription) && Intrinsics.areEqual(this.stateCd, specialPermitDto.stateCd) && Intrinsics.areEqual(this.travelFrom, specialPermitDto.travelFrom) && Intrinsics.areEqual(this.travelUpto, specialPermitDto.travelUpto) && Intrinsics.areEqual(this.vaSplPassengerdto, specialPermitDto.vaSplPassengerdto) && Intrinsics.areEqual(this.validFrom, specialPermitDto.validFrom) && Intrinsics.areEqual(this.validUpto, specialPermitDto.validUpto);
    }

    public final String getAllotmentOffice() {
        return this.allotmentOffice;
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final String getGoodsDetails() {
        return this.goodsDetails;
    }

    public final String getGoodsToCarry() {
        return this.goodsToCarry;
    }

    public final String getGoodsType() {
        return this.goodsType;
    }

    public final String getIpAddress() {
        return this.ipAddress;
    }

    public final String getIssueDt() {
        return this.issueDt;
    }

    public final int getOffCd() {
        return this.offCd;
    }

    public final String getOthers() {
        return this.others;
    }

    public final int getPeriod() {
        return this.period;
    }

    public final String getPeriodMode() {
        return this.periodMode;
    }

    public final int getPurCd() {
        return this.purCd;
    }

    public final String getPurposeOfJourny() {
        return this.purposeOfJourny;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final String getRouteDescription() {
        return this.routeDescription;
    }

    public final String getStateCd() {
        return this.stateCd;
    }

    public final String getTravelFrom() {
        return this.travelFrom;
    }

    public final String getTravelUpto() {
        return this.travelUpto;
    }

    public final List<VaSplPassengerdto> getVaSplPassengerdto() {
        return this.vaSplPassengerdto;
    }

    public final String getValidFrom() {
        return this.validFrom;
    }

    public final String getValidUpto() {
        return this.validUpto;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((this.allotmentOffice.hashCode() * 31) + this.applNo.hashCode()) * 31) + this.goodsDetails.hashCode()) * 31) + this.goodsToCarry.hashCode()) * 31) + this.goodsType.hashCode()) * 31) + this.ipAddress.hashCode()) * 31) + this.issueDt.hashCode()) * 31) + Integer.hashCode(this.offCd)) * 31) + this.others.hashCode()) * 31) + Integer.hashCode(this.period)) * 31) + this.periodMode.hashCode()) * 31) + Integer.hashCode(this.purCd)) * 31) + this.purposeOfJourny.hashCode()) * 31) + this.regnNo.hashCode()) * 31) + this.routeDescription.hashCode()) * 31) + this.stateCd.hashCode()) * 31) + this.travelFrom.hashCode()) * 31) + this.travelUpto.hashCode()) * 31) + this.vaSplPassengerdto.hashCode()) * 31) + this.validFrom.hashCode()) * 31) + this.validUpto.hashCode();
    }

    public String toString() {
        return "SpecialPermitDto(allotmentOffice=" + this.allotmentOffice + ", applNo=" + this.applNo + ", goodsDetails=" + this.goodsDetails + ", goodsToCarry=" + this.goodsToCarry + ", goodsType=" + this.goodsType + ", ipAddress=" + this.ipAddress + ", issueDt=" + this.issueDt + ", offCd=" + this.offCd + ", others=" + this.others + ", period=" + this.period + ", periodMode=" + this.periodMode + ", purCd=" + this.purCd + ", purposeOfJourny=" + this.purposeOfJourny + ", regnNo=" + this.regnNo + ", routeDescription=" + this.routeDescription + ", stateCd=" + this.stateCd + ", travelFrom=" + this.travelFrom + ", travelUpto=" + this.travelUpto + ", vaSplPassengerdto=" + this.vaSplPassengerdto + ", validFrom=" + this.validFrom + ", validUpto=" + this.validUpto + ')';
    }
}
