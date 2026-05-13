package com.nic.mparivahan.Sarathithreeservices.model;

import androidx.annotation.Keep;
import com.zepto.xy5;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b,\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BÑ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u00103\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÚ\u0001\u0010=\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010>J\u0013\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010B\u001a\u00020\u0013HÖ\u0001J\t\u0010C\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001aR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0018R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b+\u0010\u001f¨\u0006D"}, d2 = {"Lcom/nic/mparivahan/Sarathithreeservices/model/Trans;", "Ljava/io/Serializable;", "trEndcd", "", "trActionType", "trTokenId", "", "Any", "trCovapplicable", "trLicType", "trHoa", "trScope", "trPrntSeperate", "feeCovwise", "trName", "trEndtype", "trAbbrv", "servicable", "trUserId", "", "trCdNr", "trFlowApplicable", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getAny", "()Ljava/lang/Object;", "getFeeCovwise", "()Ljava/lang/String;", "getServicable", "getTrAbbrv", "getTrActionType", "getTrCdNr", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTrCovapplicable", "getTrEndcd", "getTrEndtype", "getTrFlowApplicable", "getTrHoa", "getTrLicType", "getTrName", "getTrPrntSeperate", "getTrScope", "getTrTokenId", "getTrUserId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/nic/mparivahan/Sarathithreeservices/model/Trans;", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Trans implements Serializable {

    @xy5("trCd")
    private final Object Any;

    @xy5("feeCovwise")
    private final String feeCovwise;

    @xy5("servicable")
    private final String servicable;

    @xy5("trAbbrv")
    private final String trAbbrv;

    @xy5("trActionType")
    private final String trActionType;

    @xy5("trCdNr")
    private final Integer trCdNr;

    @xy5("trCovapplicable")
    private final String trCovapplicable;

    @xy5("trEndcd")
    private final String trEndcd;

    @xy5("trEndtype")
    private final String trEndtype;

    @xy5("trFlowApplicable")
    private final String trFlowApplicable;

    @xy5("trHoa")
    private final String trHoa;

    @xy5("trLicType")
    private final String trLicType;

    @xy5("trName")
    private final String trName;

    @xy5("trPrntSeperate")
    private final String trPrntSeperate;

    @xy5("trScope")
    private final String trScope;

    @xy5("trTokenId")
    private final Object trTokenId;

    @xy5("trUserId")
    private final Integer trUserId;

    public Trans() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTrEndcd() {
        return this.trEndcd;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getFeeCovwise() {
        return this.feeCovwise;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getTrName() {
        return this.trName;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getTrEndtype() {
        return this.trEndtype;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getTrAbbrv() {
        return this.trAbbrv;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getServicable() {
        return this.servicable;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Integer getTrUserId() {
        return this.trUserId;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Integer getTrCdNr() {
        return this.trCdNr;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getTrFlowApplicable() {
        return this.trFlowApplicable;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTrActionType() {
        return this.trActionType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Object getTrTokenId() {
        return this.trTokenId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Object getAny() {
        return this.Any;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTrCovapplicable() {
        return this.trCovapplicable;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTrLicType() {
        return this.trLicType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTrHoa() {
        return this.trHoa;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTrScope() {
        return this.trScope;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTrPrntSeperate() {
        return this.trPrntSeperate;
    }

    public final Trans copy(String trEndcd, String trActionType, Object trTokenId, Object Any, String trCovapplicable, String trLicType, String trHoa, String trScope, String trPrntSeperate, String feeCovwise, String trName, String trEndtype, String trAbbrv, String servicable, Integer trUserId, Integer trCdNr, String trFlowApplicable) {
        return new Trans(trEndcd, trActionType, trTokenId, Any, trCovapplicable, trLicType, trHoa, trScope, trPrntSeperate, feeCovwise, trName, trEndtype, trAbbrv, servicable, trUserId, trCdNr, trFlowApplicable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Trans)) {
            return false;
        }
        Trans trans = (Trans) other;
        return Intrinsics.areEqual(this.trEndcd, trans.trEndcd) && Intrinsics.areEqual(this.trActionType, trans.trActionType) && Intrinsics.areEqual(this.trTokenId, trans.trTokenId) && Intrinsics.areEqual(this.Any, trans.Any) && Intrinsics.areEqual(this.trCovapplicable, trans.trCovapplicable) && Intrinsics.areEqual(this.trLicType, trans.trLicType) && Intrinsics.areEqual(this.trHoa, trans.trHoa) && Intrinsics.areEqual(this.trScope, trans.trScope) && Intrinsics.areEqual(this.trPrntSeperate, trans.trPrntSeperate) && Intrinsics.areEqual(this.feeCovwise, trans.feeCovwise) && Intrinsics.areEqual(this.trName, trans.trName) && Intrinsics.areEqual(this.trEndtype, trans.trEndtype) && Intrinsics.areEqual(this.trAbbrv, trans.trAbbrv) && Intrinsics.areEqual(this.servicable, trans.servicable) && Intrinsics.areEqual(this.trUserId, trans.trUserId) && Intrinsics.areEqual(this.trCdNr, trans.trCdNr) && Intrinsics.areEqual(this.trFlowApplicable, trans.trFlowApplicable);
    }

    public final Object getAny() {
        return this.Any;
    }

    public final String getFeeCovwise() {
        return this.feeCovwise;
    }

    public final String getServicable() {
        return this.servicable;
    }

    public final String getTrAbbrv() {
        return this.trAbbrv;
    }

    public final String getTrActionType() {
        return this.trActionType;
    }

    public final Integer getTrCdNr() {
        return this.trCdNr;
    }

    public final String getTrCovapplicable() {
        return this.trCovapplicable;
    }

    public final String getTrEndcd() {
        return this.trEndcd;
    }

    public final String getTrEndtype() {
        return this.trEndtype;
    }

    public final String getTrFlowApplicable() {
        return this.trFlowApplicable;
    }

    public final String getTrHoa() {
        return this.trHoa;
    }

    public final String getTrLicType() {
        return this.trLicType;
    }

    public final String getTrName() {
        return this.trName;
    }

    public final String getTrPrntSeperate() {
        return this.trPrntSeperate;
    }

    public final String getTrScope() {
        return this.trScope;
    }

    public final Object getTrTokenId() {
        return this.trTokenId;
    }

    public final Integer getTrUserId() {
        return this.trUserId;
    }

    public int hashCode() {
        String str = this.trEndcd;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.trActionType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Object obj = this.trTokenId;
        int iHashCode3 = (iHashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.Any;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        String str3 = this.trCovapplicable;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.trLicType;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.trHoa;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.trScope;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.trPrntSeperate;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.feeCovwise;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.trName;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.trEndtype;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.trAbbrv;
        int iHashCode13 = (iHashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.servicable;
        int iHashCode14 = (iHashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num = this.trUserId;
        int iHashCode15 = (iHashCode14 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.trCdNr;
        int iHashCode16 = (iHashCode15 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str13 = this.trFlowApplicable;
        return iHashCode16 + (str13 != null ? str13.hashCode() : 0);
    }

    public String toString() {
        return "Trans(trEndcd=" + this.trEndcd + ", trActionType=" + this.trActionType + ", trTokenId=" + this.trTokenId + ", Any=" + this.Any + ", trCovapplicable=" + this.trCovapplicable + ", trLicType=" + this.trLicType + ", trHoa=" + this.trHoa + ", trScope=" + this.trScope + ", trPrntSeperate=" + this.trPrntSeperate + ", feeCovwise=" + this.feeCovwise + ", trName=" + this.trName + ", trEndtype=" + this.trEndtype + ", trAbbrv=" + this.trAbbrv + ", servicable=" + this.servicable + ", trUserId=" + this.trUserId + ", trCdNr=" + this.trCdNr + ", trFlowApplicable=" + this.trFlowApplicable + ')';
    }

    public Trans(String str, String str2, Object obj, Object obj2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Integer num, Integer num2, String str13) {
        this.trEndcd = str;
        this.trActionType = str2;
        this.trTokenId = obj;
        this.Any = obj2;
        this.trCovapplicable = str3;
        this.trLicType = str4;
        this.trHoa = str5;
        this.trScope = str6;
        this.trPrntSeperate = str7;
        this.feeCovwise = str8;
        this.trName = str9;
        this.trEndtype = str10;
        this.trAbbrv = str11;
        this.servicable = str12;
        this.trUserId = num;
        this.trCdNr = num2;
        this.trFlowApplicable = str13;
    }

    public /* synthetic */ Trans(String str, String str2, Object obj, Object obj2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Integer num, Integer num2, String str13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : obj, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : str8, (i & 1024) != 0 ? null : str9, (i & 2048) != 0 ? null : str10, (i & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? null : str11, (i & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? null : str12, (i & 16384) != 0 ? null : num, (i & 32768) != 0 ? null : num2, (i & 65536) != 0 ? null : str13);
    }
}
