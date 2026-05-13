package com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel;

import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010 \n\u0002\bB\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BÓ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\n\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0003¢\u0006\u0002\u0010\u001fJ\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\nHÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\nHÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\nHÆ\u0003J\u000f\u0010D\u001a\b\u0012\u0004\u0012\u00020\n0\u0015HÆ\u0003J\t\u0010E\u001a\u00020\u0007HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\nHÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0007HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\nHÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\u0089\u0002\u0010V\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\n2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\n2\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010W\u001a\u00020X2\b\u0010Y\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010Z\u001a\u00020\nHÖ\u0001J\t\u0010[\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010!R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010!R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010!R\u0011\u0010\u000e\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b,\u0010(R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010!R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010!R\u0011\u0010\u0011\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b/\u0010(R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010!R\u0011\u0010\u0013\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b1\u0010(R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0015¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\u0016\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b4\u0010%R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010!R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010!R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010!R\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010!R\u0011\u0010\u001b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b9\u0010(R\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010!R\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010!R\u0011\u0010\u001e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010!¨\u0006\\"}, d2 = {"Lcom/nic/mparivahan/VahanServices/RenewalOfPermit/RPSaveToDraftModel/Data;", "Ljava/io/Serializable;", "applNo", "", "authDateUpto", "authDatefrom", "authNo", "", "chassisNo", "domainCd", "", "goodsToCarry", "ipAddress", "jorneyPurpose", "offCd", "opDt", "parking1", "pmtCatg", "pmtNo", "pmtType", "purCd", "", "rcptNo", "regionCovered", "regnNo", "remarks1", "replaceDate", "serviceType", "stateCd", "validFrom", "validUpto", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/util/List;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApplNo", "()Ljava/lang/String;", "getAuthDateUpto", "getAuthDatefrom", "getAuthNo", "()Ljava/lang/Object;", "getChassisNo", "getDomainCd", "()I", "getGoodsToCarry", "getIpAddress", "getJorneyPurpose", "getOffCd", "getOpDt", "getParking1", "getPmtCatg", "getPmtNo", "getPmtType", "getPurCd", "()Ljava/util/List;", "getRcptNo", "getRegionCovered", "getRegnNo", "getRemarks1", "getReplaceDate", "getServiceType", "getStateCd", "getValidFrom", "getValidUpto", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Data implements Serializable {
    private final String applNo;
    private final String authDateUpto;
    private final String authDatefrom;
    private final Object authNo;
    private final String chassisNo;
    private final int domainCd;
    private final String goodsToCarry;
    private final String ipAddress;
    private final String jorneyPurpose;
    private final int offCd;
    private final String opDt;
    private final String parking1;
    private final int pmtCatg;
    private final String pmtNo;
    private final int pmtType;
    private final List<Integer> purCd;
    private final Object rcptNo;
    private final String regionCovered;
    private final String regnNo;
    private final String remarks1;
    private final String replaceDate;
    private final int serviceType;
    private final String stateCd;
    private final String validFrom;
    private final String validUpto;

    public Data(String applNo, String authDateUpto, String authDatefrom, Object authNo, String chassisNo, int i, String goodsToCarry, String ipAddress, String jorneyPurpose, int i2, String opDt, String parking1, int i3, String pmtNo, int i4, List<Integer> purCd, Object rcptNo, String regionCovered, String regnNo, String remarks1, String replaceDate, int i5, String stateCd, String validFrom, String validUpto) {
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(authDateUpto, "authDateUpto");
        Intrinsics.checkNotNullParameter(authDatefrom, "authDatefrom");
        Intrinsics.checkNotNullParameter(authNo, "authNo");
        Intrinsics.checkNotNullParameter(chassisNo, "chassisNo");
        Intrinsics.checkNotNullParameter(goodsToCarry, "goodsToCarry");
        Intrinsics.checkNotNullParameter(ipAddress, "ipAddress");
        Intrinsics.checkNotNullParameter(jorneyPurpose, "jorneyPurpose");
        Intrinsics.checkNotNullParameter(opDt, "opDt");
        Intrinsics.checkNotNullParameter(parking1, "parking1");
        Intrinsics.checkNotNullParameter(pmtNo, "pmtNo");
        Intrinsics.checkNotNullParameter(purCd, "purCd");
        Intrinsics.checkNotNullParameter(rcptNo, "rcptNo");
        Intrinsics.checkNotNullParameter(regionCovered, "regionCovered");
        Intrinsics.checkNotNullParameter(regnNo, "regnNo");
        Intrinsics.checkNotNullParameter(remarks1, "remarks1");
        Intrinsics.checkNotNullParameter(replaceDate, "replaceDate");
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        Intrinsics.checkNotNullParameter(validFrom, "validFrom");
        Intrinsics.checkNotNullParameter(validUpto, "validUpto");
        this.applNo = applNo;
        this.authDateUpto = authDateUpto;
        this.authDatefrom = authDatefrom;
        this.authNo = authNo;
        this.chassisNo = chassisNo;
        this.domainCd = i;
        this.goodsToCarry = goodsToCarry;
        this.ipAddress = ipAddress;
        this.jorneyPurpose = jorneyPurpose;
        this.offCd = i2;
        this.opDt = opDt;
        this.parking1 = parking1;
        this.pmtCatg = i3;
        this.pmtNo = pmtNo;
        this.pmtType = i4;
        this.purCd = purCd;
        this.rcptNo = rcptNo;
        this.regionCovered = regionCovered;
        this.regnNo = regnNo;
        this.remarks1 = remarks1;
        this.replaceDate = replaceDate;
        this.serviceType = i5;
        this.stateCd = stateCd;
        this.validFrom = validFrom;
        this.validUpto = validUpto;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApplNo() {
        return this.applNo;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getOffCd() {
        return this.offCd;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getOpDt() {
        return this.opDt;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getParking1() {
        return this.parking1;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getPmtCatg() {
        return this.pmtCatg;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getPmtNo() {
        return this.pmtNo;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getPmtType() {
        return this.pmtType;
    }

    public final List<Integer> component16() {
        return this.purCd;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Object getRcptNo() {
        return this.rcptNo;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getRegionCovered() {
        return this.regionCovered;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getRegnNo() {
        return this.regnNo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAuthDateUpto() {
        return this.authDateUpto;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getRemarks1() {
        return this.remarks1;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getReplaceDate() {
        return this.replaceDate;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final int getServiceType() {
        return this.serviceType;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getStateCd() {
        return this.stateCd;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getValidFrom() {
        return this.validFrom;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getValidUpto() {
        return this.validUpto;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAuthDatefrom() {
        return this.authDatefrom;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Object getAuthNo() {
        return this.authNo;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getChassisNo() {
        return this.chassisNo;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getDomainCd() {
        return this.domainCd;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getGoodsToCarry() {
        return this.goodsToCarry;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getIpAddress() {
        return this.ipAddress;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getJorneyPurpose() {
        return this.jorneyPurpose;
    }

    public final Data copy(String applNo, String authDateUpto, String authDatefrom, Object authNo, String chassisNo, int domainCd, String goodsToCarry, String ipAddress, String jorneyPurpose, int offCd, String opDt, String parking1, int pmtCatg, String pmtNo, int pmtType, List<Integer> purCd, Object rcptNo, String regionCovered, String regnNo, String remarks1, String replaceDate, int serviceType, String stateCd, String validFrom, String validUpto) {
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(authDateUpto, "authDateUpto");
        Intrinsics.checkNotNullParameter(authDatefrom, "authDatefrom");
        Intrinsics.checkNotNullParameter(authNo, "authNo");
        Intrinsics.checkNotNullParameter(chassisNo, "chassisNo");
        Intrinsics.checkNotNullParameter(goodsToCarry, "goodsToCarry");
        Intrinsics.checkNotNullParameter(ipAddress, "ipAddress");
        Intrinsics.checkNotNullParameter(jorneyPurpose, "jorneyPurpose");
        Intrinsics.checkNotNullParameter(opDt, "opDt");
        Intrinsics.checkNotNullParameter(parking1, "parking1");
        Intrinsics.checkNotNullParameter(pmtNo, "pmtNo");
        Intrinsics.checkNotNullParameter(purCd, "purCd");
        Intrinsics.checkNotNullParameter(rcptNo, "rcptNo");
        Intrinsics.checkNotNullParameter(regionCovered, "regionCovered");
        Intrinsics.checkNotNullParameter(regnNo, "regnNo");
        Intrinsics.checkNotNullParameter(remarks1, "remarks1");
        Intrinsics.checkNotNullParameter(replaceDate, "replaceDate");
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        Intrinsics.checkNotNullParameter(validFrom, "validFrom");
        Intrinsics.checkNotNullParameter(validUpto, "validUpto");
        return new Data(applNo, authDateUpto, authDatefrom, authNo, chassisNo, domainCd, goodsToCarry, ipAddress, jorneyPurpose, offCd, opDt, parking1, pmtCatg, pmtNo, pmtType, purCd, rcptNo, regionCovered, regnNo, remarks1, replaceDate, serviceType, stateCd, validFrom, validUpto);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Data)) {
            return false;
        }
        Data data = (Data) other;
        return Intrinsics.areEqual(this.applNo, data.applNo) && Intrinsics.areEqual(this.authDateUpto, data.authDateUpto) && Intrinsics.areEqual(this.authDatefrom, data.authDatefrom) && Intrinsics.areEqual(this.authNo, data.authNo) && Intrinsics.areEqual(this.chassisNo, data.chassisNo) && this.domainCd == data.domainCd && Intrinsics.areEqual(this.goodsToCarry, data.goodsToCarry) && Intrinsics.areEqual(this.ipAddress, data.ipAddress) && Intrinsics.areEqual(this.jorneyPurpose, data.jorneyPurpose) && this.offCd == data.offCd && Intrinsics.areEqual(this.opDt, data.opDt) && Intrinsics.areEqual(this.parking1, data.parking1) && this.pmtCatg == data.pmtCatg && Intrinsics.areEqual(this.pmtNo, data.pmtNo) && this.pmtType == data.pmtType && Intrinsics.areEqual(this.purCd, data.purCd) && Intrinsics.areEqual(this.rcptNo, data.rcptNo) && Intrinsics.areEqual(this.regionCovered, data.regionCovered) && Intrinsics.areEqual(this.regnNo, data.regnNo) && Intrinsics.areEqual(this.remarks1, data.remarks1) && Intrinsics.areEqual(this.replaceDate, data.replaceDate) && this.serviceType == data.serviceType && Intrinsics.areEqual(this.stateCd, data.stateCd) && Intrinsics.areEqual(this.validFrom, data.validFrom) && Intrinsics.areEqual(this.validUpto, data.validUpto);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final String getAuthDateUpto() {
        return this.authDateUpto;
    }

    public final String getAuthDatefrom() {
        return this.authDatefrom;
    }

    public final Object getAuthNo() {
        return this.authNo;
    }

    public final String getChassisNo() {
        return this.chassisNo;
    }

    public final int getDomainCd() {
        return this.domainCd;
    }

    public final String getGoodsToCarry() {
        return this.goodsToCarry;
    }

    public final String getIpAddress() {
        return this.ipAddress;
    }

    public final String getJorneyPurpose() {
        return this.jorneyPurpose;
    }

    public final int getOffCd() {
        return this.offCd;
    }

    public final String getOpDt() {
        return this.opDt;
    }

    public final String getParking1() {
        return this.parking1;
    }

    public final int getPmtCatg() {
        return this.pmtCatg;
    }

    public final String getPmtNo() {
        return this.pmtNo;
    }

    public final int getPmtType() {
        return this.pmtType;
    }

    public final List<Integer> getPurCd() {
        return this.purCd;
    }

    public final Object getRcptNo() {
        return this.rcptNo;
    }

    public final String getRegionCovered() {
        return this.regionCovered;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final String getRemarks1() {
        return this.remarks1;
    }

    public final String getReplaceDate() {
        return this.replaceDate;
    }

    public final int getServiceType() {
        return this.serviceType;
    }

    public final String getStateCd() {
        return this.stateCd;
    }

    public final String getValidFrom() {
        return this.validFrom;
    }

    public final String getValidUpto() {
        return this.validUpto;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((this.applNo.hashCode() * 31) + this.authDateUpto.hashCode()) * 31) + this.authDatefrom.hashCode()) * 31) + this.authNo.hashCode()) * 31) + this.chassisNo.hashCode()) * 31) + Integer.hashCode(this.domainCd)) * 31) + this.goodsToCarry.hashCode()) * 31) + this.ipAddress.hashCode()) * 31) + this.jorneyPurpose.hashCode()) * 31) + Integer.hashCode(this.offCd)) * 31) + this.opDt.hashCode()) * 31) + this.parking1.hashCode()) * 31) + Integer.hashCode(this.pmtCatg)) * 31) + this.pmtNo.hashCode()) * 31) + Integer.hashCode(this.pmtType)) * 31) + this.purCd.hashCode()) * 31) + this.rcptNo.hashCode()) * 31) + this.regionCovered.hashCode()) * 31) + this.regnNo.hashCode()) * 31) + this.remarks1.hashCode()) * 31) + this.replaceDate.hashCode()) * 31) + Integer.hashCode(this.serviceType)) * 31) + this.stateCd.hashCode()) * 31) + this.validFrom.hashCode()) * 31) + this.validUpto.hashCode();
    }

    public String toString() {
        return "Data(applNo=" + this.applNo + ", authDateUpto=" + this.authDateUpto + ", authDatefrom=" + this.authDatefrom + ", authNo=" + this.authNo + ", chassisNo=" + this.chassisNo + ", domainCd=" + this.domainCd + ", goodsToCarry=" + this.goodsToCarry + ", ipAddress=" + this.ipAddress + ", jorneyPurpose=" + this.jorneyPurpose + ", offCd=" + this.offCd + ", opDt=" + this.opDt + ", parking1=" + this.parking1 + ", pmtCatg=" + this.pmtCatg + ", pmtNo=" + this.pmtNo + ", pmtType=" + this.pmtType + ", purCd=" + this.purCd + ", rcptNo=" + this.rcptNo + ", regionCovered=" + this.regionCovered + ", regnNo=" + this.regnNo + ", remarks1=" + this.remarks1 + ", replaceDate=" + this.replaceDate + ", serviceType=" + this.serviceType + ", stateCd=" + this.stateCd + ", validFrom=" + this.validFrom + ", validUpto=" + this.validUpto + ')';
    }
}
