package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\bN\b\u0087\b\u0018\u00002\u00020\u0001Bå\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0005\u0012\u0006\u0010\u001f\u001a\u00020\u0005\u0012\u0006\u0010 \u001a\u00020\u0005\u0012\u0006\u0010!\u001a\u00020\u0003¢\u0006\u0002\u0010\"J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0005HÆ\u0003J\t\u0010E\u001a\u00020\u0005HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0011HÆ\u0003J\t\u0010H\u001a\u00020\u0005HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0005HÆ\u0003J\t\u0010K\u001a\u00020\u0016HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0005HÆ\u0003J\t\u0010O\u001a\u00020\u0005HÆ\u0003J\t\u0010P\u001a\u00020\u0005HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0005HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0005HÆ\u0003J\t\u0010U\u001a\u00020\u0005HÆ\u0003J\t\u0010V\u001a\u00020\u0005HÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\u0005HÆ\u0003J\t\u0010Y\u001a\u00020\u0005HÆ\u0003J\t\u0010Z\u001a\u00020\u0005HÆ\u0003J\t\u0010[\u001a\u00020\u0005HÆ\u0003J\t\u0010\\\u001a\u00020\u0003HÆ\u0003J\t\u0010]\u001a\u00020\u0005HÆ\u0003J\t\u0010^\u001a\u00020\u0005HÆ\u0003J¡\u0002\u0010_\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010 \u001a\u00020\u00052\b\b\u0002\u0010!\u001a\u00020\u0003HÆ\u0001J\u0013\u0010`\u001a\u00020\u00052\b\u0010a\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010b\u001a\u00020\u0011HÖ\u0001J\t\u0010c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010&R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010&R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010$R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010&R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010&R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010&R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010&R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010$R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u0010&R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010$R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u0010&R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010$R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010$R\u0011\u0010\u0019\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b:\u0010&R\u0011\u0010\u001a\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b;\u0010&R\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010$R\u0011\u0010\u001c\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b=\u0010&R\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010$R\u0011\u0010\u001e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b?\u0010&R\u0011\u0010\u001f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b@\u0010&R\u0011\u0010 \u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bA\u0010&R\u0011\u0010!\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010$¨\u0006d"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/PermitCustStateResp;", "Ljava/io/Serializable;", "allowedVchClassNoresct", "", "applicationPrintAllowed", "", "countSignAfterAuth", "countSignReccmLtr", "counterSignWithoutReccmLtr", "duplicatePermit", "editableInsurance", "endoresementPermit", "freshPermit", "freshWithoutVehicle", "homeAuth", "insuranceCheckPurCd", "offCd", "", "paymorthFee", "permitCatg", "permitPrintAllowed", "permitPrintConfig", "", "permitPrintPurcd", "permitType", "renewPemit", "renewalTemporaryPermit", "routeDisabledViaRegion", "specialPemit", "stateCd", "surrCountSignPermit", "surrenderPermit", "temporaryPemit", "vchClass", "(Ljava/lang/String;ZZZZZLjava/lang/String;ZZZZLjava/lang/String;IZLjava/lang/String;ZLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZLjava/lang/String;ZZZLjava/lang/String;)V", "getAllowedVchClassNoresct", "()Ljava/lang/String;", "getApplicationPrintAllowed", "()Z", "getCountSignAfterAuth", "getCountSignReccmLtr", "getCounterSignWithoutReccmLtr", "getDuplicatePermit", "getEditableInsurance", "getEndoresementPermit", "getFreshPermit", "getFreshWithoutVehicle", "getHomeAuth", "getInsuranceCheckPurCd", "getOffCd", "()I", "getPaymorthFee", "getPermitCatg", "getPermitPrintAllowed", "getPermitPrintConfig", "()Ljava/lang/Object;", "getPermitPrintPurcd", "getPermitType", "getRenewPemit", "getRenewalTemporaryPermit", "getRouteDisabledViaRegion", "getSpecialPemit", "getStateCd", "getSurrCountSignPermit", "getSurrenderPermit", "getTemporaryPemit", "getVchClass", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PermitCustStateResp implements Serializable {
    private final String allowedVchClassNoresct;
    private final boolean applicationPrintAllowed;
    private final boolean countSignAfterAuth;
    private final boolean countSignReccmLtr;
    private final boolean counterSignWithoutReccmLtr;
    private final boolean duplicatePermit;
    private final String editableInsurance;
    private final boolean endoresementPermit;
    private final boolean freshPermit;
    private final boolean freshWithoutVehicle;
    private final boolean homeAuth;
    private final String insuranceCheckPurCd;
    private final int offCd;
    private final boolean paymorthFee;
    private final String permitCatg;
    private final boolean permitPrintAllowed;
    private final Object permitPrintConfig;
    private final String permitPrintPurcd;
    private final String permitType;
    private final boolean renewPemit;
    private final boolean renewalTemporaryPermit;
    private final String routeDisabledViaRegion;
    private final boolean specialPemit;
    private final String stateCd;
    private final boolean surrCountSignPermit;
    private final boolean surrenderPermit;
    private final boolean temporaryPemit;
    private final String vchClass;

    public PermitCustStateResp(String allowedVchClassNoresct, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String editableInsurance, boolean z6, boolean z7, boolean z8, boolean z9, String insuranceCheckPurCd, int i, boolean z10, String permitCatg, boolean z11, Object permitPrintConfig, String permitPrintPurcd, String permitType, boolean z12, boolean z13, String routeDisabledViaRegion, boolean z14, String stateCd, boolean z15, boolean z16, boolean z17, String vchClass) {
        Intrinsics.checkNotNullParameter(allowedVchClassNoresct, "allowedVchClassNoresct");
        Intrinsics.checkNotNullParameter(editableInsurance, "editableInsurance");
        Intrinsics.checkNotNullParameter(insuranceCheckPurCd, "insuranceCheckPurCd");
        Intrinsics.checkNotNullParameter(permitCatg, "permitCatg");
        Intrinsics.checkNotNullParameter(permitPrintConfig, "permitPrintConfig");
        Intrinsics.checkNotNullParameter(permitPrintPurcd, "permitPrintPurcd");
        Intrinsics.checkNotNullParameter(permitType, "permitType");
        Intrinsics.checkNotNullParameter(routeDisabledViaRegion, "routeDisabledViaRegion");
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        Intrinsics.checkNotNullParameter(vchClass, "vchClass");
        this.allowedVchClassNoresct = allowedVchClassNoresct;
        this.applicationPrintAllowed = z;
        this.countSignAfterAuth = z2;
        this.countSignReccmLtr = z3;
        this.counterSignWithoutReccmLtr = z4;
        this.duplicatePermit = z5;
        this.editableInsurance = editableInsurance;
        this.endoresementPermit = z6;
        this.freshPermit = z7;
        this.freshWithoutVehicle = z8;
        this.homeAuth = z9;
        this.insuranceCheckPurCd = insuranceCheckPurCd;
        this.offCd = i;
        this.paymorthFee = z10;
        this.permitCatg = permitCatg;
        this.permitPrintAllowed = z11;
        this.permitPrintConfig = permitPrintConfig;
        this.permitPrintPurcd = permitPrintPurcd;
        this.permitType = permitType;
        this.renewPemit = z12;
        this.renewalTemporaryPermit = z13;
        this.routeDisabledViaRegion = routeDisabledViaRegion;
        this.specialPemit = z14;
        this.stateCd = stateCd;
        this.surrCountSignPermit = z15;
        this.surrenderPermit = z16;
        this.temporaryPemit = z17;
        this.vchClass = vchClass;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAllowedVchClassNoresct() {
        return this.allowedVchClassNoresct;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getFreshWithoutVehicle() {
        return this.freshWithoutVehicle;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getHomeAuth() {
        return this.homeAuth;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getInsuranceCheckPurCd() {
        return this.insuranceCheckPurCd;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getOffCd() {
        return this.offCd;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getPaymorthFee() {
        return this.paymorthFee;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getPermitCatg() {
        return this.permitCatg;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getPermitPrintAllowed() {
        return this.permitPrintAllowed;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Object getPermitPrintConfig() {
        return this.permitPrintConfig;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getPermitPrintPurcd() {
        return this.permitPrintPurcd;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getPermitType() {
        return this.permitType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getApplicationPrintAllowed() {
        return this.applicationPrintAllowed;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final boolean getRenewPemit() {
        return this.renewPemit;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final boolean getRenewalTemporaryPermit() {
        return this.renewalTemporaryPermit;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getRouteDisabledViaRegion() {
        return this.routeDisabledViaRegion;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final boolean getSpecialPemit() {
        return this.specialPemit;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getStateCd() {
        return this.stateCd;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final boolean getSurrCountSignPermit() {
        return this.surrCountSignPermit;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final boolean getSurrenderPermit() {
        return this.surrenderPermit;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final boolean getTemporaryPemit() {
        return this.temporaryPemit;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getVchClass() {
        return this.vchClass;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getCountSignAfterAuth() {
        return this.countSignAfterAuth;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getCountSignReccmLtr() {
        return this.countSignReccmLtr;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getCounterSignWithoutReccmLtr() {
        return this.counterSignWithoutReccmLtr;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getDuplicatePermit() {
        return this.duplicatePermit;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getEditableInsurance() {
        return this.editableInsurance;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getEndoresementPermit() {
        return this.endoresementPermit;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getFreshPermit() {
        return this.freshPermit;
    }

    public final PermitCustStateResp copy(String allowedVchClassNoresct, boolean applicationPrintAllowed, boolean countSignAfterAuth, boolean countSignReccmLtr, boolean counterSignWithoutReccmLtr, boolean duplicatePermit, String editableInsurance, boolean endoresementPermit, boolean freshPermit, boolean freshWithoutVehicle, boolean homeAuth, String insuranceCheckPurCd, int offCd, boolean paymorthFee, String permitCatg, boolean permitPrintAllowed, Object permitPrintConfig, String permitPrintPurcd, String permitType, boolean renewPemit, boolean renewalTemporaryPermit, String routeDisabledViaRegion, boolean specialPemit, String stateCd, boolean surrCountSignPermit, boolean surrenderPermit, boolean temporaryPemit, String vchClass) {
        Intrinsics.checkNotNullParameter(allowedVchClassNoresct, "allowedVchClassNoresct");
        Intrinsics.checkNotNullParameter(editableInsurance, "editableInsurance");
        Intrinsics.checkNotNullParameter(insuranceCheckPurCd, "insuranceCheckPurCd");
        Intrinsics.checkNotNullParameter(permitCatg, "permitCatg");
        Intrinsics.checkNotNullParameter(permitPrintConfig, "permitPrintConfig");
        Intrinsics.checkNotNullParameter(permitPrintPurcd, "permitPrintPurcd");
        Intrinsics.checkNotNullParameter(permitType, "permitType");
        Intrinsics.checkNotNullParameter(routeDisabledViaRegion, "routeDisabledViaRegion");
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        Intrinsics.checkNotNullParameter(vchClass, "vchClass");
        return new PermitCustStateResp(allowedVchClassNoresct, applicationPrintAllowed, countSignAfterAuth, countSignReccmLtr, counterSignWithoutReccmLtr, duplicatePermit, editableInsurance, endoresementPermit, freshPermit, freshWithoutVehicle, homeAuth, insuranceCheckPurCd, offCd, paymorthFee, permitCatg, permitPrintAllowed, permitPrintConfig, permitPrintPurcd, permitType, renewPemit, renewalTemporaryPermit, routeDisabledViaRegion, specialPemit, stateCd, surrCountSignPermit, surrenderPermit, temporaryPemit, vchClass);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PermitCustStateResp)) {
            return false;
        }
        PermitCustStateResp permitCustStateResp = (PermitCustStateResp) other;
        return Intrinsics.areEqual(this.allowedVchClassNoresct, permitCustStateResp.allowedVchClassNoresct) && this.applicationPrintAllowed == permitCustStateResp.applicationPrintAllowed && this.countSignAfterAuth == permitCustStateResp.countSignAfterAuth && this.countSignReccmLtr == permitCustStateResp.countSignReccmLtr && this.counterSignWithoutReccmLtr == permitCustStateResp.counterSignWithoutReccmLtr && this.duplicatePermit == permitCustStateResp.duplicatePermit && Intrinsics.areEqual(this.editableInsurance, permitCustStateResp.editableInsurance) && this.endoresementPermit == permitCustStateResp.endoresementPermit && this.freshPermit == permitCustStateResp.freshPermit && this.freshWithoutVehicle == permitCustStateResp.freshWithoutVehicle && this.homeAuth == permitCustStateResp.homeAuth && Intrinsics.areEqual(this.insuranceCheckPurCd, permitCustStateResp.insuranceCheckPurCd) && this.offCd == permitCustStateResp.offCd && this.paymorthFee == permitCustStateResp.paymorthFee && Intrinsics.areEqual(this.permitCatg, permitCustStateResp.permitCatg) && this.permitPrintAllowed == permitCustStateResp.permitPrintAllowed && Intrinsics.areEqual(this.permitPrintConfig, permitCustStateResp.permitPrintConfig) && Intrinsics.areEqual(this.permitPrintPurcd, permitCustStateResp.permitPrintPurcd) && Intrinsics.areEqual(this.permitType, permitCustStateResp.permitType) && this.renewPemit == permitCustStateResp.renewPemit && this.renewalTemporaryPermit == permitCustStateResp.renewalTemporaryPermit && Intrinsics.areEqual(this.routeDisabledViaRegion, permitCustStateResp.routeDisabledViaRegion) && this.specialPemit == permitCustStateResp.specialPemit && Intrinsics.areEqual(this.stateCd, permitCustStateResp.stateCd) && this.surrCountSignPermit == permitCustStateResp.surrCountSignPermit && this.surrenderPermit == permitCustStateResp.surrenderPermit && this.temporaryPemit == permitCustStateResp.temporaryPemit && Intrinsics.areEqual(this.vchClass, permitCustStateResp.vchClass);
    }

    public final String getAllowedVchClassNoresct() {
        return this.allowedVchClassNoresct;
    }

    public final boolean getApplicationPrintAllowed() {
        return this.applicationPrintAllowed;
    }

    public final boolean getCountSignAfterAuth() {
        return this.countSignAfterAuth;
    }

    public final boolean getCountSignReccmLtr() {
        return this.countSignReccmLtr;
    }

    public final boolean getCounterSignWithoutReccmLtr() {
        return this.counterSignWithoutReccmLtr;
    }

    public final boolean getDuplicatePermit() {
        return this.duplicatePermit;
    }

    public final String getEditableInsurance() {
        return this.editableInsurance;
    }

    public final boolean getEndoresementPermit() {
        return this.endoresementPermit;
    }

    public final boolean getFreshPermit() {
        return this.freshPermit;
    }

    public final boolean getFreshWithoutVehicle() {
        return this.freshWithoutVehicle;
    }

    public final boolean getHomeAuth() {
        return this.homeAuth;
    }

    public final String getInsuranceCheckPurCd() {
        return this.insuranceCheckPurCd;
    }

    public final int getOffCd() {
        return this.offCd;
    }

    public final boolean getPaymorthFee() {
        return this.paymorthFee;
    }

    public final String getPermitCatg() {
        return this.permitCatg;
    }

    public final boolean getPermitPrintAllowed() {
        return this.permitPrintAllowed;
    }

    public final Object getPermitPrintConfig() {
        return this.permitPrintConfig;
    }

    public final String getPermitPrintPurcd() {
        return this.permitPrintPurcd;
    }

    public final String getPermitType() {
        return this.permitType;
    }

    public final boolean getRenewPemit() {
        return this.renewPemit;
    }

    public final boolean getRenewalTemporaryPermit() {
        return this.renewalTemporaryPermit;
    }

    public final String getRouteDisabledViaRegion() {
        return this.routeDisabledViaRegion;
    }

    public final boolean getSpecialPemit() {
        return this.specialPemit;
    }

    public final String getStateCd() {
        return this.stateCd;
    }

    public final boolean getSurrCountSignPermit() {
        return this.surrCountSignPermit;
    }

    public final boolean getSurrenderPermit() {
        return this.surrenderPermit;
    }

    public final boolean getTemporaryPemit() {
        return this.temporaryPemit;
    }

    public final String getVchClass() {
        return this.vchClass;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v17, types: [int] */
    /* JADX WARN: Type inference failed for: r1v19, types: [int] */
    /* JADX WARN: Type inference failed for: r1v25, types: [int] */
    /* JADX WARN: Type inference failed for: r1v29, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v37, types: [int] */
    /* JADX WARN: Type inference failed for: r1v39, types: [int] */
    /* JADX WARN: Type inference failed for: r1v43, types: [int] */
    /* JADX WARN: Type inference failed for: r1v47, types: [int] */
    /* JADX WARN: Type inference failed for: r1v49, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r1v54 */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r1v56 */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v58 */
    /* JADX WARN: Type inference failed for: r1v59 */
    /* JADX WARN: Type inference failed for: r1v60 */
    /* JADX WARN: Type inference failed for: r1v61 */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r1v63 */
    /* JADX WARN: Type inference failed for: r1v64 */
    /* JADX WARN: Type inference failed for: r1v65 */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r1v67 */
    /* JADX WARN: Type inference failed for: r1v68 */
    /* JADX WARN: Type inference failed for: r1v69 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v70 */
    /* JADX WARN: Type inference failed for: r1v71 */
    /* JADX WARN: Type inference failed for: r1v72 */
    /* JADX WARN: Type inference failed for: r1v73 */
    /* JADX WARN: Type inference failed for: r1v74 */
    /* JADX WARN: Type inference failed for: r1v75 */
    /* JADX WARN: Type inference failed for: r1v76 */
    /* JADX WARN: Type inference failed for: r1v77 */
    /* JADX WARN: Type inference failed for: r1v78 */
    /* JADX WARN: Type inference failed for: r1v79 */
    /* JADX WARN: Type inference failed for: r1v80 */
    /* JADX WARN: Type inference failed for: r1v81 */
    /* JADX WARN: Type inference failed for: r1v82 */
    /* JADX WARN: Type inference failed for: r1v83 */
    /* JADX WARN: Type inference failed for: r1v84 */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = this.allowedVchClassNoresct.hashCode() * 31;
        boolean z = this.applicationPrintAllowed;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.countSignAfterAuth;
        ?? r12 = z2;
        if (z2) {
            r12 = 1;
        }
        int i2 = (i + r12) * 31;
        boolean z3 = this.countSignReccmLtr;
        ?? r13 = z3;
        if (z3) {
            r13 = 1;
        }
        int i3 = (i2 + r13) * 31;
        boolean z4 = this.counterSignWithoutReccmLtr;
        ?? r14 = z4;
        if (z4) {
            r14 = 1;
        }
        int i4 = (i3 + r14) * 31;
        boolean z5 = this.duplicatePermit;
        ?? r15 = z5;
        if (z5) {
            r15 = 1;
        }
        int iHashCode2 = (((i4 + r15) * 31) + this.editableInsurance.hashCode()) * 31;
        boolean z6 = this.endoresementPermit;
        ?? r16 = z6;
        if (z6) {
            r16 = 1;
        }
        int i5 = (iHashCode2 + r16) * 31;
        boolean z7 = this.freshPermit;
        ?? r17 = z7;
        if (z7) {
            r17 = 1;
        }
        int i6 = (i5 + r17) * 31;
        boolean z8 = this.freshWithoutVehicle;
        ?? r18 = z8;
        if (z8) {
            r18 = 1;
        }
        int i7 = (i6 + r18) * 31;
        boolean z9 = this.homeAuth;
        ?? r19 = z9;
        if (z9) {
            r19 = 1;
        }
        int iHashCode3 = (((((i7 + r19) * 31) + this.insuranceCheckPurCd.hashCode()) * 31) + Integer.hashCode(this.offCd)) * 31;
        boolean z10 = this.paymorthFee;
        ?? r110 = z10;
        if (z10) {
            r110 = 1;
        }
        int iHashCode4 = (((iHashCode3 + r110) * 31) + this.permitCatg.hashCode()) * 31;
        boolean z11 = this.permitPrintAllowed;
        ?? r111 = z11;
        if (z11) {
            r111 = 1;
        }
        int iHashCode5 = (((((((iHashCode4 + r111) * 31) + this.permitPrintConfig.hashCode()) * 31) + this.permitPrintPurcd.hashCode()) * 31) + this.permitType.hashCode()) * 31;
        boolean z12 = this.renewPemit;
        ?? r112 = z12;
        if (z12) {
            r112 = 1;
        }
        int i8 = (iHashCode5 + r112) * 31;
        boolean z13 = this.renewalTemporaryPermit;
        ?? r113 = z13;
        if (z13) {
            r113 = 1;
        }
        int iHashCode6 = (((i8 + r113) * 31) + this.routeDisabledViaRegion.hashCode()) * 31;
        boolean z14 = this.specialPemit;
        ?? r114 = z14;
        if (z14) {
            r114 = 1;
        }
        int iHashCode7 = (((iHashCode6 + r114) * 31) + this.stateCd.hashCode()) * 31;
        boolean z15 = this.surrCountSignPermit;
        ?? r115 = z15;
        if (z15) {
            r115 = 1;
        }
        int i9 = (iHashCode7 + r115) * 31;
        boolean z16 = this.surrenderPermit;
        ?? r116 = z16;
        if (z16) {
            r116 = 1;
        }
        int i10 = (i9 + r116) * 31;
        boolean z17 = this.temporaryPemit;
        return ((i10 + (z17 ? 1 : z17)) * 31) + this.vchClass.hashCode();
    }

    public String toString() {
        return "PermitCustStateResp(allowedVchClassNoresct=" + this.allowedVchClassNoresct + ", applicationPrintAllowed=" + this.applicationPrintAllowed + ", countSignAfterAuth=" + this.countSignAfterAuth + ", countSignReccmLtr=" + this.countSignReccmLtr + ", counterSignWithoutReccmLtr=" + this.counterSignWithoutReccmLtr + ", duplicatePermit=" + this.duplicatePermit + ", editableInsurance=" + this.editableInsurance + ", endoresementPermit=" + this.endoresementPermit + ", freshPermit=" + this.freshPermit + ", freshWithoutVehicle=" + this.freshWithoutVehicle + ", homeAuth=" + this.homeAuth + ", insuranceCheckPurCd=" + this.insuranceCheckPurCd + ", offCd=" + this.offCd + ", paymorthFee=" + this.paymorthFee + ", permitCatg=" + this.permitCatg + ", permitPrintAllowed=" + this.permitPrintAllowed + ", permitPrintConfig=" + this.permitPrintConfig + ", permitPrintPurcd=" + this.permitPrintPurcd + ", permitType=" + this.permitType + ", renewPemit=" + this.renewPemit + ", renewalTemporaryPermit=" + this.renewalTemporaryPermit + ", routeDisabledViaRegion=" + this.routeDisabledViaRegion + ", specialPemit=" + this.specialPemit + ", stateCd=" + this.stateCd + ", surrCountSignPermit=" + this.surrCountSignPermit + ", surrenderPermit=" + this.surrenderPermit + ", temporaryPemit=" + this.temporaryPemit + ", vchClass=" + this.vchClass + ')';
    }
}
