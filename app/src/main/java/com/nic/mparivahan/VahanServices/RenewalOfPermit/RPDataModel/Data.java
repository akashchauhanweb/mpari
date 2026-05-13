package com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel;

import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\bE\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B¡\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0015\u001a\u00020\n\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0017\u001a\u00020\n\u0012\u0006\u0010\u0018\u001a\u00020\n\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001d\u001a\u00020\n\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010#¢\u0006\u0002\u0010$J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010L\u001a\u00020\nHÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010P\u001a\u00020\nHÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010R\u001a\u00020\nHÆ\u0003J\t\u0010S\u001a\u00020\nHÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\nHÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010#HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010-J\u0011\u0010c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fHÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010e\u001a\u00020\nHÆ\u0003Jä\u0002\u0010f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0011\u001a\u00020\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0015\u001a\u00020\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\n2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001d\u001a\u00020\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#HÆ\u0001¢\u0006\u0002\u0010gJ\u0013\u0010h\u001a\u00020i2\b\u0010j\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010k\u001a\u00020\nHÖ\u0001J\t\u0010l\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b+\u0010)R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010&R\u0011\u0010\u000e\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010&R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010&R\u0011\u0010\u0011\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b6\u00103R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010&R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010&R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010&R\u0011\u0010\u0015\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b:\u00103R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010&R\u0011\u0010\u0017\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b<\u00103R\u0011\u0010\u0018\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b=\u00103R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010&R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010&R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u0010&R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u0010&R\u0011\u0010\u001d\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bB\u00103R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u0010&R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u0010&R\u0013\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u0010&R\u0013\u0010!\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u0010&R\u0013\u0010\"\u001a\u0004\u0018\u00010#¢\u0006\b\n\u0000\u001a\u0004\bG\u0010H¨\u0006m"}, d2 = {"Lcom/nic/mparivahan/VahanServices/RenewalOfPermit/RPDataModel/Data;", "Ljava/io/Serializable;", "allotmentOffice", "", "applNo", "authDateUpto", "", "authDatefrom", "authNo", "domainCd", "", "goodsToCarry", "", "jorneyPurpose", "offCd", "opDt", "parking1", "period", "periodMode", "permitCatgDescr", "permitTypeDescr", "pmtCatg", "pmtNo", "pmtType", "purCd", "rcptNo", "regionCovered", "regnNo", "remarks1", "serviceType", "serviceTypeDescr", "stateCd", "validFrom", "validUpto", "vmRegionDetailsDto", "Lcom/nic/mparivahan/VahanServices/RenewalOfPermit/RPDataModel/VmRegionDetailsDto;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/RenewalOfPermit/RPDataModel/VmRegionDetailsDto;)V", "getAllotmentOffice", "()Ljava/lang/String;", "getApplNo", "getAuthDateUpto", "()Ljava/lang/Object;", "getAuthDatefrom", "getAuthNo", "getDomainCd", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getGoodsToCarry", "()Ljava/util/List;", "getJorneyPurpose", "getOffCd", "()I", "getOpDt", "getParking1", "getPeriod", "getPeriodMode", "getPermitCatgDescr", "getPermitTypeDescr", "getPmtCatg", "getPmtNo", "getPmtType", "getPurCd", "getRcptNo", "getRegionCovered", "getRegnNo", "getRemarks1", "getServiceType", "getServiceTypeDescr", "getStateCd", "getValidFrom", "getValidUpto", "getVmRegionDetailsDto", "()Lcom/nic/mparivahan/VahanServices/RenewalOfPermit/RPDataModel/VmRegionDetailsDto;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/RenewalOfPermit/RPDataModel/VmRegionDetailsDto;)Lcom/nic/mparivahan/VahanServices/RenewalOfPermit/RPDataModel/Data;", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Data implements Serializable {
    private final String allotmentOffice;
    private final String applNo;
    private final Object authDateUpto;
    private final Object authDatefrom;
    private final Object authNo;
    private final Integer domainCd;
    private final List<String> goodsToCarry;
    private final String jorneyPurpose;
    private final int offCd;
    private final String opDt;
    private final String parking1;
    private final int period;
    private final String periodMode;
    private final String permitCatgDescr;
    private final String permitTypeDescr;
    private final int pmtCatg;
    private final String pmtNo;
    private final int pmtType;
    private final int purCd;
    private final String rcptNo;
    private final String regionCovered;
    private final String regnNo;
    private final String remarks1;
    private final int serviceType;
    private final String serviceTypeDescr;
    private final String stateCd;
    private final String validFrom;
    private final String validUpto;
    private final VmRegionDetailsDto vmRegionDetailsDto;

    public Data(String str, String str2, Object obj, Object obj2, Object obj3, Integer num, List<String> list, String str3, int i, String str4, String str5, int i2, String str6, String str7, String str8, int i3, String str9, int i4, int i5, String str10, String str11, String str12, String str13, int i6, String str14, String str15, String str16, String str17, VmRegionDetailsDto vmRegionDetailsDto) {
        this.allotmentOffice = str;
        this.applNo = str2;
        this.authDateUpto = obj;
        this.authDatefrom = obj2;
        this.authNo = obj3;
        this.domainCd = num;
        this.goodsToCarry = list;
        this.jorneyPurpose = str3;
        this.offCd = i;
        this.opDt = str4;
        this.parking1 = str5;
        this.period = i2;
        this.periodMode = str6;
        this.permitCatgDescr = str7;
        this.permitTypeDescr = str8;
        this.pmtCatg = i3;
        this.pmtNo = str9;
        this.pmtType = i4;
        this.purCd = i5;
        this.rcptNo = str10;
        this.regionCovered = str11;
        this.regnNo = str12;
        this.remarks1 = str13;
        this.serviceType = i6;
        this.serviceTypeDescr = str14;
        this.stateCd = str15;
        this.validFrom = str16;
        this.validUpto = str17;
        this.vmRegionDetailsDto = vmRegionDetailsDto;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAllotmentOffice() {
        return this.allotmentOffice;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getOpDt() {
        return this.opDt;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getParking1() {
        return this.parking1;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getPeriod() {
        return this.period;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getPeriodMode() {
        return this.periodMode;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getPermitCatgDescr() {
        return this.permitCatgDescr;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getPermitTypeDescr() {
        return this.permitTypeDescr;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getPmtCatg() {
        return this.pmtCatg;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getPmtNo() {
        return this.pmtNo;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getPmtType() {
        return this.pmtType;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getPurCd() {
        return this.purCd;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getApplNo() {
        return this.applNo;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getRcptNo() {
        return this.rcptNo;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getRegionCovered() {
        return this.regionCovered;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getRegnNo() {
        return this.regnNo;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getRemarks1() {
        return this.remarks1;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final int getServiceType() {
        return this.serviceType;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getServiceTypeDescr() {
        return this.serviceTypeDescr;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getStateCd() {
        return this.stateCd;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getValidFrom() {
        return this.validFrom;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getValidUpto() {
        return this.validUpto;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final VmRegionDetailsDto getVmRegionDetailsDto() {
        return this.vmRegionDetailsDto;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Object getAuthDateUpto() {
        return this.authDateUpto;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Object getAuthDatefrom() {
        return this.authDatefrom;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Object getAuthNo() {
        return this.authNo;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getDomainCd() {
        return this.domainCd;
    }

    public final List<String> component7() {
        return this.goodsToCarry;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getJorneyPurpose() {
        return this.jorneyPurpose;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getOffCd() {
        return this.offCd;
    }

    public final Data copy(String allotmentOffice, String applNo, Object authDateUpto, Object authDatefrom, Object authNo, Integer domainCd, List<String> goodsToCarry, String jorneyPurpose, int offCd, String opDt, String parking1, int period, String periodMode, String permitCatgDescr, String permitTypeDescr, int pmtCatg, String pmtNo, int pmtType, int purCd, String rcptNo, String regionCovered, String regnNo, String remarks1, int serviceType, String serviceTypeDescr, String stateCd, String validFrom, String validUpto, VmRegionDetailsDto vmRegionDetailsDto) {
        return new Data(allotmentOffice, applNo, authDateUpto, authDatefrom, authNo, domainCd, goodsToCarry, jorneyPurpose, offCd, opDt, parking1, period, periodMode, permitCatgDescr, permitTypeDescr, pmtCatg, pmtNo, pmtType, purCd, rcptNo, regionCovered, regnNo, remarks1, serviceType, serviceTypeDescr, stateCd, validFrom, validUpto, vmRegionDetailsDto);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Data)) {
            return false;
        }
        Data data = (Data) other;
        return Intrinsics.areEqual(this.allotmentOffice, data.allotmentOffice) && Intrinsics.areEqual(this.applNo, data.applNo) && Intrinsics.areEqual(this.authDateUpto, data.authDateUpto) && Intrinsics.areEqual(this.authDatefrom, data.authDatefrom) && Intrinsics.areEqual(this.authNo, data.authNo) && Intrinsics.areEqual(this.domainCd, data.domainCd) && Intrinsics.areEqual(this.goodsToCarry, data.goodsToCarry) && Intrinsics.areEqual(this.jorneyPurpose, data.jorneyPurpose) && this.offCd == data.offCd && Intrinsics.areEqual(this.opDt, data.opDt) && Intrinsics.areEqual(this.parking1, data.parking1) && this.period == data.period && Intrinsics.areEqual(this.periodMode, data.periodMode) && Intrinsics.areEqual(this.permitCatgDescr, data.permitCatgDescr) && Intrinsics.areEqual(this.permitTypeDescr, data.permitTypeDescr) && this.pmtCatg == data.pmtCatg && Intrinsics.areEqual(this.pmtNo, data.pmtNo) && this.pmtType == data.pmtType && this.purCd == data.purCd && Intrinsics.areEqual(this.rcptNo, data.rcptNo) && Intrinsics.areEqual(this.regionCovered, data.regionCovered) && Intrinsics.areEqual(this.regnNo, data.regnNo) && Intrinsics.areEqual(this.remarks1, data.remarks1) && this.serviceType == data.serviceType && Intrinsics.areEqual(this.serviceTypeDescr, data.serviceTypeDescr) && Intrinsics.areEqual(this.stateCd, data.stateCd) && Intrinsics.areEqual(this.validFrom, data.validFrom) && Intrinsics.areEqual(this.validUpto, data.validUpto) && Intrinsics.areEqual(this.vmRegionDetailsDto, data.vmRegionDetailsDto);
    }

    public final String getAllotmentOffice() {
        return this.allotmentOffice;
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final Object getAuthDateUpto() {
        return this.authDateUpto;
    }

    public final Object getAuthDatefrom() {
        return this.authDatefrom;
    }

    public final Object getAuthNo() {
        return this.authNo;
    }

    public final Integer getDomainCd() {
        return this.domainCd;
    }

    public final List<String> getGoodsToCarry() {
        return this.goodsToCarry;
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

    public final int getPeriod() {
        return this.period;
    }

    public final String getPeriodMode() {
        return this.periodMode;
    }

    public final String getPermitCatgDescr() {
        return this.permitCatgDescr;
    }

    public final String getPermitTypeDescr() {
        return this.permitTypeDescr;
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

    public final int getPurCd() {
        return this.purCd;
    }

    public final String getRcptNo() {
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

    public final int getServiceType() {
        return this.serviceType;
    }

    public final String getServiceTypeDescr() {
        return this.serviceTypeDescr;
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

    public final VmRegionDetailsDto getVmRegionDetailsDto() {
        return this.vmRegionDetailsDto;
    }

    public int hashCode() {
        String str = this.allotmentOffice;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.applNo;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Object obj = this.authDateUpto;
        int iHashCode3 = (iHashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.authDatefrom;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.authNo;
        int iHashCode5 = (iHashCode4 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Integer num = this.domainCd;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        List<String> list = this.goodsToCarry;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.jorneyPurpose;
        int iHashCode8 = (((iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31) + Integer.hashCode(this.offCd)) * 31;
        String str4 = this.opDt;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.parking1;
        int iHashCode10 = (((iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31) + Integer.hashCode(this.period)) * 31;
        String str6 = this.periodMode;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.permitCatgDescr;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.permitTypeDescr;
        int iHashCode13 = (((iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31) + Integer.hashCode(this.pmtCatg)) * 31;
        String str9 = this.pmtNo;
        int iHashCode14 = (((((iHashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31) + Integer.hashCode(this.pmtType)) * 31) + Integer.hashCode(this.purCd)) * 31;
        String str10 = this.rcptNo;
        int iHashCode15 = (iHashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.regionCovered;
        int iHashCode16 = (iHashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.regnNo;
        int iHashCode17 = (iHashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.remarks1;
        int iHashCode18 = (((iHashCode17 + (str13 == null ? 0 : str13.hashCode())) * 31) + Integer.hashCode(this.serviceType)) * 31;
        String str14 = this.serviceTypeDescr;
        int iHashCode19 = (iHashCode18 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.stateCd;
        int iHashCode20 = (iHashCode19 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.validFrom;
        int iHashCode21 = (iHashCode20 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.validUpto;
        int iHashCode22 = (iHashCode21 + (str17 == null ? 0 : str17.hashCode())) * 31;
        VmRegionDetailsDto vmRegionDetailsDto = this.vmRegionDetailsDto;
        return iHashCode22 + (vmRegionDetailsDto != null ? vmRegionDetailsDto.hashCode() : 0);
    }

    public String toString() {
        return "Data(allotmentOffice=" + this.allotmentOffice + ", applNo=" + this.applNo + ", authDateUpto=" + this.authDateUpto + ", authDatefrom=" + this.authDatefrom + ", authNo=" + this.authNo + ", domainCd=" + this.domainCd + ", goodsToCarry=" + this.goodsToCarry + ", jorneyPurpose=" + this.jorneyPurpose + ", offCd=" + this.offCd + ", opDt=" + this.opDt + ", parking1=" + this.parking1 + ", period=" + this.period + ", periodMode=" + this.periodMode + ", permitCatgDescr=" + this.permitCatgDescr + ", permitTypeDescr=" + this.permitTypeDescr + ", pmtCatg=" + this.pmtCatg + ", pmtNo=" + this.pmtNo + ", pmtType=" + this.pmtType + ", purCd=" + this.purCd + ", rcptNo=" + this.rcptNo + ", regionCovered=" + this.regionCovered + ", regnNo=" + this.regnNo + ", remarks1=" + this.remarks1 + ", serviceType=" + this.serviceType + ", serviceTypeDescr=" + this.serviceTypeDescr + ", stateCd=" + this.stateCd + ", validFrom=" + this.validFrom + ", validUpto=" + this.validUpto + ", vmRegionDetailsDto=" + this.vmRegionDetailsDto + ')';
    }
}
