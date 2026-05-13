package com.nic.mparivahan.dlservices.ui.renewalofdl.Revalidation;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\bg\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bå\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000bj\b\u0012\u0004\u0012\u00020\u0003`\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003¢\u0006\u0002\u0010 J\t\u0010X\u001a\u00020\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\t\u0010[\u001a\u00020\u0003HÆ\u0003J\t\u0010\\\u001a\u00020\u0003HÆ\u0003J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\t\u0010^\u001a\u00020\u0003HÆ\u0003J\t\u0010_\u001a\u00020\u0003HÆ\u0003J\t\u0010`\u001a\u00020\u0003HÆ\u0003J\t\u0010a\u001a\u00020\u0003HÆ\u0003J\t\u0010b\u001a\u00020\u0003HÆ\u0003J\t\u0010c\u001a\u00020\u0003HÆ\u0003J\t\u0010d\u001a\u00020\u0003HÆ\u0003J\t\u0010e\u001a\u00020\u0003HÆ\u0003J\t\u0010f\u001a\u00020\u0003HÆ\u0003J\t\u0010g\u001a\u00020\u0003HÆ\u0003J\t\u0010h\u001a\u00020\u0003HÆ\u0003J\t\u0010i\u001a\u00020\u0003HÆ\u0003J\t\u0010j\u001a\u00020\u0003HÆ\u0003J\t\u0010k\u001a\u00020\u0003HÆ\u0003J\t\u0010l\u001a\u00020\u0003HÆ\u0003J\t\u0010m\u001a\u00020\u0003HÆ\u0003J\t\u0010n\u001a\u00020\tHÆ\u0003J\u0019\u0010o\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000bj\b\u0012\u0004\u0012\u00020\u0003`\fHÆ\u0003J\t\u0010p\u001a\u00020\u0003HÆ\u0003J\t\u0010q\u001a\u00020\u0003HÆ\u0003J\u009d\u0002\u0010r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000bj\b\u0012\u0004\u0012\u00020\u0003`\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010s\u001a\u00020t2\b\u0010u\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010v\u001a\u00020wHÖ\u0001J\t\u0010x\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010$R!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000bj\b\u0012\u0004\u0012\u00020\u0003`\f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\"\"\u0004\b*\u0010$R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\"\"\u0004\b,\u0010$R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\"\"\u0004\b.\u0010$R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\"\"\u0004\b0\u0010$R\u001a\u0010\u0015\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\"\"\u0004\b2\u0010$R\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\"\"\u0004\b4\u0010$R\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\"\"\u0004\b6\u0010$R\u001a\u0010\u0017\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\"\"\u0004\b8\u0010$R\u001a\u0010\u0016\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\"\"\u0004\b:\u0010$R\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\"\"\u0004\b<\u0010$R\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\"\"\u0004\b>\u0010$R\u001a\u0010\u0013\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\"\"\u0004\b@\u0010$R\u001a\u0010\u001d\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\"\"\u0004\bB\u0010$R\u001a\u0010\u0018\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\"\"\u0004\bD\u0010$R\u001a\u0010\u001a\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\"\"\u0004\bF\u0010$R\u001a\u0010\u001f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\"\"\u0004\bH\u0010$R\u001a\u0010\u001e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\"\"\u0004\bJ\u0010$R\u001a\u0010\u0019\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\"\"\u0004\bL\u0010$R\u001a\u0010\u001c\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\"\"\u0004\bN\u0010$R\u001a\u0010\u001b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\"\"\u0004\bP\u0010$R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010\"R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\"\"\u0004\bW\u0010$¨\u0006y"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/renewalofdl/Revalidation/RenewalCoaValidation;", "", "dlno", "", "dob", "rtoCodeDLTr", "applcatgDLserReq", "mobileNumber", "selectedDLSerList", "Lcom/nic/mparivahan/dlservices/ui/renewalofdl/Revalidation/SelectRenewalCoalist;", "covsForRetest", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "dlHolderAltMobMum", "willtoDonateOrgans", "changeOfAddReq", "perHouseNo", "perStreet", "perLocation", "permVillageOrTown", "perSubDistrict", "perDistrict", "perState", "perPinCode", "presHouseNo", "presStreet", "presLocation", "presVillageOrTown", "presSubDistrict", "presDistrict", "presState", "presPincode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/dlservices/ui/renewalofdl/Revalidation/SelectRenewalCoalist;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApplcatgDLserReq", "()Ljava/lang/String;", "setApplcatgDLserReq", "(Ljava/lang/String;)V", "getChangeOfAddReq", "setChangeOfAddReq", "getCovsForRetest", "()Ljava/util/ArrayList;", "getDlHolderAltMobMum", "setDlHolderAltMobMum", "getDlno", "setDlno", "getDob", "setDob", "getMobileNumber", "setMobileNumber", "getPerDistrict", "setPerDistrict", "getPerHouseNo", "setPerHouseNo", "getPerLocation", "setPerLocation", "getPerPinCode", "setPerPinCode", "getPerState", "setPerState", "getPerStreet", "setPerStreet", "getPerSubDistrict", "setPerSubDistrict", "getPermVillageOrTown", "setPermVillageOrTown", "getPresDistrict", "setPresDistrict", "getPresHouseNo", "setPresHouseNo", "getPresLocation", "setPresLocation", "getPresPincode", "setPresPincode", "getPresState", "setPresState", "getPresStreet", "setPresStreet", "getPresSubDistrict", "setPresSubDistrict", "getPresVillageOrTown", "setPresVillageOrTown", "getRtoCodeDLTr", "getSelectedDLSerList", "()Lcom/nic/mparivahan/dlservices/ui/renewalofdl/Revalidation/SelectRenewalCoalist;", "setSelectedDLSerList", "(Lcom/nic/mparivahan/dlservices/ui/renewalofdl/Revalidation/SelectRenewalCoalist;)V", "getWilltoDonateOrgans", "setWilltoDonateOrgans", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class RenewalCoaValidation {
    private String applcatgDLserReq;
    private String changeOfAddReq;
    private final ArrayList<String> covsForRetest;
    private String dlHolderAltMobMum;
    private String dlno;
    private String dob;
    private String mobileNumber;
    private String perDistrict;
    private String perHouseNo;
    private String perLocation;
    private String perPinCode;
    private String perState;
    private String perStreet;
    private String perSubDistrict;
    private String permVillageOrTown;
    private String presDistrict;
    private String presHouseNo;
    private String presLocation;
    private String presPincode;
    private String presState;
    private String presStreet;
    private String presSubDistrict;
    private String presVillageOrTown;
    private final String rtoCodeDLTr;
    private SelectRenewalCoalist selectedDLSerList;
    private String willtoDonateOrgans;

    public RenewalCoaValidation(String dlno, String dob, String rtoCodeDLTr, String applcatgDLserReq, String mobileNumber, SelectRenewalCoalist selectedDLSerList, ArrayList<String> covsForRetest, String dlHolderAltMobMum, String willtoDonateOrgans, String changeOfAddReq, String perHouseNo, String perStreet, String perLocation, String permVillageOrTown, String perSubDistrict, String perDistrict, String perState, String perPinCode, String presHouseNo, String presStreet, String presLocation, String presVillageOrTown, String presSubDistrict, String presDistrict, String presState, String presPincode) {
        Intrinsics.checkNotNullParameter(dlno, "dlno");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(rtoCodeDLTr, "rtoCodeDLTr");
        Intrinsics.checkNotNullParameter(applcatgDLserReq, "applcatgDLserReq");
        Intrinsics.checkNotNullParameter(mobileNumber, "mobileNumber");
        Intrinsics.checkNotNullParameter(selectedDLSerList, "selectedDLSerList");
        Intrinsics.checkNotNullParameter(covsForRetest, "covsForRetest");
        Intrinsics.checkNotNullParameter(dlHolderAltMobMum, "dlHolderAltMobMum");
        Intrinsics.checkNotNullParameter(willtoDonateOrgans, "willtoDonateOrgans");
        Intrinsics.checkNotNullParameter(changeOfAddReq, "changeOfAddReq");
        Intrinsics.checkNotNullParameter(perHouseNo, "perHouseNo");
        Intrinsics.checkNotNullParameter(perStreet, "perStreet");
        Intrinsics.checkNotNullParameter(perLocation, "perLocation");
        Intrinsics.checkNotNullParameter(permVillageOrTown, "permVillageOrTown");
        Intrinsics.checkNotNullParameter(perSubDistrict, "perSubDistrict");
        Intrinsics.checkNotNullParameter(perDistrict, "perDistrict");
        Intrinsics.checkNotNullParameter(perState, "perState");
        Intrinsics.checkNotNullParameter(perPinCode, "perPinCode");
        Intrinsics.checkNotNullParameter(presHouseNo, "presHouseNo");
        Intrinsics.checkNotNullParameter(presStreet, "presStreet");
        Intrinsics.checkNotNullParameter(presLocation, "presLocation");
        Intrinsics.checkNotNullParameter(presVillageOrTown, "presVillageOrTown");
        Intrinsics.checkNotNullParameter(presSubDistrict, "presSubDistrict");
        Intrinsics.checkNotNullParameter(presDistrict, "presDistrict");
        Intrinsics.checkNotNullParameter(presState, "presState");
        Intrinsics.checkNotNullParameter(presPincode, "presPincode");
        this.dlno = dlno;
        this.dob = dob;
        this.rtoCodeDLTr = rtoCodeDLTr;
        this.applcatgDLserReq = applcatgDLserReq;
        this.mobileNumber = mobileNumber;
        this.selectedDLSerList = selectedDLSerList;
        this.covsForRetest = covsForRetest;
        this.dlHolderAltMobMum = dlHolderAltMobMum;
        this.willtoDonateOrgans = willtoDonateOrgans;
        this.changeOfAddReq = changeOfAddReq;
        this.perHouseNo = perHouseNo;
        this.perStreet = perStreet;
        this.perLocation = perLocation;
        this.permVillageOrTown = permVillageOrTown;
        this.perSubDistrict = perSubDistrict;
        this.perDistrict = perDistrict;
        this.perState = perState;
        this.perPinCode = perPinCode;
        this.presHouseNo = presHouseNo;
        this.presStreet = presStreet;
        this.presLocation = presLocation;
        this.presVillageOrTown = presVillageOrTown;
        this.presSubDistrict = presSubDistrict;
        this.presDistrict = presDistrict;
        this.presState = presState;
        this.presPincode = presPincode;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDlno() {
        return this.dlno;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getChangeOfAddReq() {
        return this.changeOfAddReq;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getPerHouseNo() {
        return this.perHouseNo;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getPerStreet() {
        return this.perStreet;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getPerLocation() {
        return this.perLocation;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getPermVillageOrTown() {
        return this.permVillageOrTown;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getPerSubDistrict() {
        return this.perSubDistrict;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getPerDistrict() {
        return this.perDistrict;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getPerState() {
        return this.perState;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getPerPinCode() {
        return this.perPinCode;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getPresHouseNo() {
        return this.presHouseNo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDob() {
        return this.dob;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getPresStreet() {
        return this.presStreet;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getPresLocation() {
        return this.presLocation;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getPresVillageOrTown() {
        return this.presVillageOrTown;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getPresSubDistrict() {
        return this.presSubDistrict;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getPresDistrict() {
        return this.presDistrict;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getPresState() {
        return this.presState;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getPresPincode() {
        return this.presPincode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRtoCodeDLTr() {
        return this.rtoCodeDLTr;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getApplcatgDLserReq() {
        return this.applcatgDLserReq;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final SelectRenewalCoalist getSelectedDLSerList() {
        return this.selectedDLSerList;
    }

    public final ArrayList<String> component7() {
        return this.covsForRetest;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDlHolderAltMobMum() {
        return this.dlHolderAltMobMum;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getWilltoDonateOrgans() {
        return this.willtoDonateOrgans;
    }

    public final RenewalCoaValidation copy(String dlno, String dob, String rtoCodeDLTr, String applcatgDLserReq, String mobileNumber, SelectRenewalCoalist selectedDLSerList, ArrayList<String> covsForRetest, String dlHolderAltMobMum, String willtoDonateOrgans, String changeOfAddReq, String perHouseNo, String perStreet, String perLocation, String permVillageOrTown, String perSubDistrict, String perDistrict, String perState, String perPinCode, String presHouseNo, String presStreet, String presLocation, String presVillageOrTown, String presSubDistrict, String presDistrict, String presState, String presPincode) {
        Intrinsics.checkNotNullParameter(dlno, "dlno");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(rtoCodeDLTr, "rtoCodeDLTr");
        Intrinsics.checkNotNullParameter(applcatgDLserReq, "applcatgDLserReq");
        Intrinsics.checkNotNullParameter(mobileNumber, "mobileNumber");
        Intrinsics.checkNotNullParameter(selectedDLSerList, "selectedDLSerList");
        Intrinsics.checkNotNullParameter(covsForRetest, "covsForRetest");
        Intrinsics.checkNotNullParameter(dlHolderAltMobMum, "dlHolderAltMobMum");
        Intrinsics.checkNotNullParameter(willtoDonateOrgans, "willtoDonateOrgans");
        Intrinsics.checkNotNullParameter(changeOfAddReq, "changeOfAddReq");
        Intrinsics.checkNotNullParameter(perHouseNo, "perHouseNo");
        Intrinsics.checkNotNullParameter(perStreet, "perStreet");
        Intrinsics.checkNotNullParameter(perLocation, "perLocation");
        Intrinsics.checkNotNullParameter(permVillageOrTown, "permVillageOrTown");
        Intrinsics.checkNotNullParameter(perSubDistrict, "perSubDistrict");
        Intrinsics.checkNotNullParameter(perDistrict, "perDistrict");
        Intrinsics.checkNotNullParameter(perState, "perState");
        Intrinsics.checkNotNullParameter(perPinCode, "perPinCode");
        Intrinsics.checkNotNullParameter(presHouseNo, "presHouseNo");
        Intrinsics.checkNotNullParameter(presStreet, "presStreet");
        Intrinsics.checkNotNullParameter(presLocation, "presLocation");
        Intrinsics.checkNotNullParameter(presVillageOrTown, "presVillageOrTown");
        Intrinsics.checkNotNullParameter(presSubDistrict, "presSubDistrict");
        Intrinsics.checkNotNullParameter(presDistrict, "presDistrict");
        Intrinsics.checkNotNullParameter(presState, "presState");
        Intrinsics.checkNotNullParameter(presPincode, "presPincode");
        return new RenewalCoaValidation(dlno, dob, rtoCodeDLTr, applcatgDLserReq, mobileNumber, selectedDLSerList, covsForRetest, dlHolderAltMobMum, willtoDonateOrgans, changeOfAddReq, perHouseNo, perStreet, perLocation, permVillageOrTown, perSubDistrict, perDistrict, perState, perPinCode, presHouseNo, presStreet, presLocation, presVillageOrTown, presSubDistrict, presDistrict, presState, presPincode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RenewalCoaValidation)) {
            return false;
        }
        RenewalCoaValidation renewalCoaValidation = (RenewalCoaValidation) other;
        return Intrinsics.areEqual(this.dlno, renewalCoaValidation.dlno) && Intrinsics.areEqual(this.dob, renewalCoaValidation.dob) && Intrinsics.areEqual(this.rtoCodeDLTr, renewalCoaValidation.rtoCodeDLTr) && Intrinsics.areEqual(this.applcatgDLserReq, renewalCoaValidation.applcatgDLserReq) && Intrinsics.areEqual(this.mobileNumber, renewalCoaValidation.mobileNumber) && Intrinsics.areEqual(this.selectedDLSerList, renewalCoaValidation.selectedDLSerList) && Intrinsics.areEqual(this.covsForRetest, renewalCoaValidation.covsForRetest) && Intrinsics.areEqual(this.dlHolderAltMobMum, renewalCoaValidation.dlHolderAltMobMum) && Intrinsics.areEqual(this.willtoDonateOrgans, renewalCoaValidation.willtoDonateOrgans) && Intrinsics.areEqual(this.changeOfAddReq, renewalCoaValidation.changeOfAddReq) && Intrinsics.areEqual(this.perHouseNo, renewalCoaValidation.perHouseNo) && Intrinsics.areEqual(this.perStreet, renewalCoaValidation.perStreet) && Intrinsics.areEqual(this.perLocation, renewalCoaValidation.perLocation) && Intrinsics.areEqual(this.permVillageOrTown, renewalCoaValidation.permVillageOrTown) && Intrinsics.areEqual(this.perSubDistrict, renewalCoaValidation.perSubDistrict) && Intrinsics.areEqual(this.perDistrict, renewalCoaValidation.perDistrict) && Intrinsics.areEqual(this.perState, renewalCoaValidation.perState) && Intrinsics.areEqual(this.perPinCode, renewalCoaValidation.perPinCode) && Intrinsics.areEqual(this.presHouseNo, renewalCoaValidation.presHouseNo) && Intrinsics.areEqual(this.presStreet, renewalCoaValidation.presStreet) && Intrinsics.areEqual(this.presLocation, renewalCoaValidation.presLocation) && Intrinsics.areEqual(this.presVillageOrTown, renewalCoaValidation.presVillageOrTown) && Intrinsics.areEqual(this.presSubDistrict, renewalCoaValidation.presSubDistrict) && Intrinsics.areEqual(this.presDistrict, renewalCoaValidation.presDistrict) && Intrinsics.areEqual(this.presState, renewalCoaValidation.presState) && Intrinsics.areEqual(this.presPincode, renewalCoaValidation.presPincode);
    }

    public final String getApplcatgDLserReq() {
        return this.applcatgDLserReq;
    }

    public final String getChangeOfAddReq() {
        return this.changeOfAddReq;
    }

    public final ArrayList<String> getCovsForRetest() {
        return this.covsForRetest;
    }

    public final String getDlHolderAltMobMum() {
        return this.dlHolderAltMobMum;
    }

    public final String getDlno() {
        return this.dlno;
    }

    public final String getDob() {
        return this.dob;
    }

    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    public final String getPerDistrict() {
        return this.perDistrict;
    }

    public final String getPerHouseNo() {
        return this.perHouseNo;
    }

    public final String getPerLocation() {
        return this.perLocation;
    }

    public final String getPerPinCode() {
        return this.perPinCode;
    }

    public final String getPerState() {
        return this.perState;
    }

    public final String getPerStreet() {
        return this.perStreet;
    }

    public final String getPerSubDistrict() {
        return this.perSubDistrict;
    }

    public final String getPermVillageOrTown() {
        return this.permVillageOrTown;
    }

    public final String getPresDistrict() {
        return this.presDistrict;
    }

    public final String getPresHouseNo() {
        return this.presHouseNo;
    }

    public final String getPresLocation() {
        return this.presLocation;
    }

    public final String getPresPincode() {
        return this.presPincode;
    }

    public final String getPresState() {
        return this.presState;
    }

    public final String getPresStreet() {
        return this.presStreet;
    }

    public final String getPresSubDistrict() {
        return this.presSubDistrict;
    }

    public final String getPresVillageOrTown() {
        return this.presVillageOrTown;
    }

    public final String getRtoCodeDLTr() {
        return this.rtoCodeDLTr;
    }

    public final SelectRenewalCoalist getSelectedDLSerList() {
        return this.selectedDLSerList;
    }

    public final String getWilltoDonateOrgans() {
        return this.willtoDonateOrgans;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((this.dlno.hashCode() * 31) + this.dob.hashCode()) * 31) + this.rtoCodeDLTr.hashCode()) * 31) + this.applcatgDLserReq.hashCode()) * 31) + this.mobileNumber.hashCode()) * 31) + this.selectedDLSerList.hashCode()) * 31) + this.covsForRetest.hashCode()) * 31) + this.dlHolderAltMobMum.hashCode()) * 31) + this.willtoDonateOrgans.hashCode()) * 31) + this.changeOfAddReq.hashCode()) * 31) + this.perHouseNo.hashCode()) * 31) + this.perStreet.hashCode()) * 31) + this.perLocation.hashCode()) * 31) + this.permVillageOrTown.hashCode()) * 31) + this.perSubDistrict.hashCode()) * 31) + this.perDistrict.hashCode()) * 31) + this.perState.hashCode()) * 31) + this.perPinCode.hashCode()) * 31) + this.presHouseNo.hashCode()) * 31) + this.presStreet.hashCode()) * 31) + this.presLocation.hashCode()) * 31) + this.presVillageOrTown.hashCode()) * 31) + this.presSubDistrict.hashCode()) * 31) + this.presDistrict.hashCode()) * 31) + this.presState.hashCode()) * 31) + this.presPincode.hashCode();
    }

    public final void setApplcatgDLserReq(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.applcatgDLserReq = str;
    }

    public final void setChangeOfAddReq(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.changeOfAddReq = str;
    }

    public final void setDlHolderAltMobMum(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dlHolderAltMobMum = str;
    }

    public final void setDlno(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dlno = str;
    }

    public final void setDob(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dob = str;
    }

    public final void setMobileNumber(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mobileNumber = str;
    }

    public final void setPerDistrict(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.perDistrict = str;
    }

    public final void setPerHouseNo(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.perHouseNo = str;
    }

    public final void setPerLocation(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.perLocation = str;
    }

    public final void setPerPinCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.perPinCode = str;
    }

    public final void setPerState(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.perState = str;
    }

    public final void setPerStreet(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.perStreet = str;
    }

    public final void setPerSubDistrict(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.perSubDistrict = str;
    }

    public final void setPermVillageOrTown(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.permVillageOrTown = str;
    }

    public final void setPresDistrict(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.presDistrict = str;
    }

    public final void setPresHouseNo(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.presHouseNo = str;
    }

    public final void setPresLocation(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.presLocation = str;
    }

    public final void setPresPincode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.presPincode = str;
    }

    public final void setPresState(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.presState = str;
    }

    public final void setPresStreet(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.presStreet = str;
    }

    public final void setPresSubDistrict(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.presSubDistrict = str;
    }

    public final void setPresVillageOrTown(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.presVillageOrTown = str;
    }

    public final void setSelectedDLSerList(SelectRenewalCoalist selectRenewalCoalist) {
        Intrinsics.checkNotNullParameter(selectRenewalCoalist, "<set-?>");
        this.selectedDLSerList = selectRenewalCoalist;
    }

    public final void setWilltoDonateOrgans(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.willtoDonateOrgans = str;
    }

    public String toString() {
        return "RenewalCoaValidation(dlno=" + this.dlno + ", dob=" + this.dob + ", rtoCodeDLTr=" + this.rtoCodeDLTr + ", applcatgDLserReq=" + this.applcatgDLserReq + ", mobileNumber=" + this.mobileNumber + ", selectedDLSerList=" + this.selectedDLSerList + ", covsForRetest=" + this.covsForRetest + ", dlHolderAltMobMum=" + this.dlHolderAltMobMum + ", willtoDonateOrgans=" + this.willtoDonateOrgans + ", changeOfAddReq=" + this.changeOfAddReq + ", perHouseNo=" + this.perHouseNo + ", perStreet=" + this.perStreet + ", perLocation=" + this.perLocation + ", permVillageOrTown=" + this.permVillageOrTown + ", perSubDistrict=" + this.perSubDistrict + ", perDistrict=" + this.perDistrict + ", perState=" + this.perState + ", perPinCode=" + this.perPinCode + ", presHouseNo=" + this.presHouseNo + ", presStreet=" + this.presStreet + ", presLocation=" + this.presLocation + ", presVillageOrTown=" + this.presVillageOrTown + ", presSubDistrict=" + this.presSubDistrict + ", presDistrict=" + this.presDistrict + ", presState=" + this.presState + ", presPincode=" + this.presPincode + ')';
    }
}
