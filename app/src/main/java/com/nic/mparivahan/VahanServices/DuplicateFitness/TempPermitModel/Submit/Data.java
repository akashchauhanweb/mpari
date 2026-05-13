package com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit;

import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001Bã\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\u001a\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017j\n\u0012\u0004\u0012\u00020\u0018\u0018\u0001`\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00106\u001a\u00020\u000bHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00108\u001a\u00020\u000bHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001d\u0010?\u001a\u0016\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017j\n\u0012\u0004\u0012\u00020\u0018\u0018\u0001`\u0019HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u000bHÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0091\u0002\u0010J\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u001c\b\u0002\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017j\n\u0012\u0004\u0012\u00020\u0018\u0018\u0001`\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010K\u001a\u00020L2\b\u0010M\u001a\u0004\u0018\u00010NHÖ\u0003J\t\u0010O\u001a\u00020\u000bHÖ\u0001J\t\u0010P\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001eR\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010&R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001eR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001eR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001eR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001eR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001eR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001eR%\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017j\n\u0012\u0004\u0012\u00020\u0018\u0018\u0001`\u0019¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001eR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001e¨\u0006Q"}, d2 = {"Lcom/nic/mparivahan/VahanServices/DuplicateFitness/TempPermitModel/Submit/Data;", "Ljava/io/Serializable;", "allotmentOffice", "", "applNo", "goodsDetails", "goodsToCarry", "goodsType", "ipAddress", "issueDt", "offCd", "", "others", "period", "periodMode", "purCd", "purposeOfJourny", "regnNo", "routeDescription", "stateCd", "travelFrom", "travelUpto", "vaSplPassengerdto", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/Welcome/testws/VaSplPassengerdto;", "Lkotlin/collections/ArrayList;", "validFrom", "validUpto", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V", "getAllotmentOffice", "()Ljava/lang/String;", "getApplNo", "getGoodsDetails", "getGoodsToCarry", "getGoodsType", "getIpAddress", "getIssueDt", "getOffCd", "()I", "getOthers", "getPeriod", "getPeriodMode", "getPurCd", "getPurposeOfJourny", "getRegnNo", "getRouteDescription", "getStateCd", "getTravelFrom", "getTravelUpto", "getVaSplPassengerdto", "()Ljava/util/ArrayList;", "getValidFrom", "getValidUpto", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Data implements Serializable {
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
    private final ArrayList<com.nic.mparivahan.Welcome.testws.VaSplPassengerdto> vaSplPassengerdto;
    private final String validFrom;
    private final String validUpto;

    public Data(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8, int i2, String str9, int i3, String str10, String str11, String str12, String str13, String str14, String str15, ArrayList<com.nic.mparivahan.Welcome.testws.VaSplPassengerdto> arrayList, String str16, String str17) {
        this.allotmentOffice = str;
        this.applNo = str2;
        this.goodsDetails = str3;
        this.goodsToCarry = str4;
        this.goodsType = str5;
        this.ipAddress = str6;
        this.issueDt = str7;
        this.offCd = i;
        this.others = str8;
        this.period = i2;
        this.periodMode = str9;
        this.purCd = i3;
        this.purposeOfJourny = str10;
        this.regnNo = str11;
        this.routeDescription = str12;
        this.stateCd = str13;
        this.travelFrom = str14;
        this.travelUpto = str15;
        this.vaSplPassengerdto = arrayList;
        this.validFrom = str16;
        this.validUpto = str17;
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

    public final ArrayList<com.nic.mparivahan.Welcome.testws.VaSplPassengerdto> component19() {
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

    public final Data copy(String allotmentOffice, String applNo, String goodsDetails, String goodsToCarry, String goodsType, String ipAddress, String issueDt, int offCd, String others, int period, String periodMode, int purCd, String purposeOfJourny, String regnNo, String routeDescription, String stateCd, String travelFrom, String travelUpto, ArrayList<com.nic.mparivahan.Welcome.testws.VaSplPassengerdto> vaSplPassengerdto, String validFrom, String validUpto) {
        return new Data(allotmentOffice, applNo, goodsDetails, goodsToCarry, goodsType, ipAddress, issueDt, offCd, others, period, periodMode, purCd, purposeOfJourny, regnNo, routeDescription, stateCd, travelFrom, travelUpto, vaSplPassengerdto, validFrom, validUpto);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Data)) {
            return false;
        }
        Data data = (Data) other;
        return Intrinsics.areEqual(this.allotmentOffice, data.allotmentOffice) && Intrinsics.areEqual(this.applNo, data.applNo) && Intrinsics.areEqual(this.goodsDetails, data.goodsDetails) && Intrinsics.areEqual(this.goodsToCarry, data.goodsToCarry) && Intrinsics.areEqual(this.goodsType, data.goodsType) && Intrinsics.areEqual(this.ipAddress, data.ipAddress) && Intrinsics.areEqual(this.issueDt, data.issueDt) && this.offCd == data.offCd && Intrinsics.areEqual(this.others, data.others) && this.period == data.period && Intrinsics.areEqual(this.periodMode, data.periodMode) && this.purCd == data.purCd && Intrinsics.areEqual(this.purposeOfJourny, data.purposeOfJourny) && Intrinsics.areEqual(this.regnNo, data.regnNo) && Intrinsics.areEqual(this.routeDescription, data.routeDescription) && Intrinsics.areEqual(this.stateCd, data.stateCd) && Intrinsics.areEqual(this.travelFrom, data.travelFrom) && Intrinsics.areEqual(this.travelUpto, data.travelUpto) && Intrinsics.areEqual(this.vaSplPassengerdto, data.vaSplPassengerdto) && Intrinsics.areEqual(this.validFrom, data.validFrom) && Intrinsics.areEqual(this.validUpto, data.validUpto);
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

    public final ArrayList<com.nic.mparivahan.Welcome.testws.VaSplPassengerdto> getVaSplPassengerdto() {
        return this.vaSplPassengerdto;
    }

    public final String getValidFrom() {
        return this.validFrom;
    }

    public final String getValidUpto() {
        return this.validUpto;
    }

    public int hashCode() {
        String str = this.allotmentOffice;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.applNo;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.goodsDetails;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.goodsToCarry;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.goodsType;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.ipAddress;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.issueDt;
        int iHashCode7 = (((iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31) + Integer.hashCode(this.offCd)) * 31;
        String str8 = this.others;
        int iHashCode8 = (((iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31) + Integer.hashCode(this.period)) * 31;
        String str9 = this.periodMode;
        int iHashCode9 = (((iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31) + Integer.hashCode(this.purCd)) * 31;
        String str10 = this.purposeOfJourny;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.regnNo;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.routeDescription;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.stateCd;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.travelFrom;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.travelUpto;
        int iHashCode15 = (iHashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        ArrayList<com.nic.mparivahan.Welcome.testws.VaSplPassengerdto> arrayList = this.vaSplPassengerdto;
        int iHashCode16 = (iHashCode15 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        String str16 = this.validFrom;
        int iHashCode17 = (iHashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.validUpto;
        return iHashCode17 + (str17 != null ? str17.hashCode() : 0);
    }

    public String toString() {
        return "Data(allotmentOffice=" + this.allotmentOffice + ", applNo=" + this.applNo + ", goodsDetails=" + this.goodsDetails + ", goodsToCarry=" + this.goodsToCarry + ", goodsType=" + this.goodsType + ", ipAddress=" + this.ipAddress + ", issueDt=" + this.issueDt + ", offCd=" + this.offCd + ", others=" + this.others + ", period=" + this.period + ", periodMode=" + this.periodMode + ", purCd=" + this.purCd + ", purposeOfJourny=" + this.purposeOfJourny + ", regnNo=" + this.regnNo + ", routeDescription=" + this.routeDescription + ", stateCd=" + this.stateCd + ", travelFrom=" + this.travelFrom + ", travelUpto=" + this.travelUpto + ", vaSplPassengerdto=" + this.vaSplPassengerdto + ", validFrom=" + this.validFrom + ", validUpto=" + this.validUpto + ')';
    }
}
