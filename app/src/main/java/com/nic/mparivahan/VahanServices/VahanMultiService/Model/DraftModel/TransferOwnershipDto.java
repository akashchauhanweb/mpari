package com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\t\n\u0002\bS\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B©\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u000b\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u000b\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u000b\u0012\u0006\u0010\"\u001a\u00020\u0003\u0012\u0006\u0010#\u001a\u00020\u0003\u0012\u0006\u0010$\u001a\u00020%\u0012\u0006\u0010&\u001a\u00020\u0003\u0012\u0006\u0010'\u001a\u00020\u0003\u0012\u0006\u0010(\u001a\u00020\u0003\u0012\u0006\u0010)\u001a\u00020\u0003¢\u0006\u0002\u0010*J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u0011HÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\u000bHÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u000bHÆ\u0003J\t\u0010[\u001a\u00020\u000bHÆ\u0003J\t\u0010\\\u001a\u00020\u0003HÆ\u0003J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\t\u0010^\u001a\u00020\u0003HÆ\u0003J\t\u0010_\u001a\u00020\u000bHÆ\u0003J\t\u0010`\u001a\u00020\u0003HÆ\u0003J\t\u0010a\u001a\u00020\u0003HÆ\u0003J\t\u0010b\u001a\u00020\u0003HÆ\u0003J\t\u0010c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010e\u001a\u00020\u000bHÆ\u0003J\t\u0010f\u001a\u00020\u0003HÆ\u0003J\t\u0010g\u001a\u00020\u000bHÆ\u0003J\t\u0010h\u001a\u00020\u0003HÆ\u0003J\t\u0010i\u001a\u00020\u0003HÆ\u0003J\t\u0010j\u001a\u00020\u0003HÆ\u0003J\t\u0010k\u001a\u00020%HÆ\u0003J\t\u0010l\u001a\u00020\u0003HÆ\u0003J\t\u0010m\u001a\u00020\u0003HÆ\u0003J\t\u0010n\u001a\u00020\u0003HÆ\u0003J\t\u0010o\u001a\u00020\u0003HÆ\u0003J\t\u0010p\u001a\u00020\u0003HÆ\u0003J\t\u0010q\u001a\u00020\u0003HÆ\u0003J\t\u0010r\u001a\u00020\u0003HÆ\u0003J\t\u0010s\u001a\u00020\u0003HÆ\u0003J\t\u0010t\u001a\u00020\u000bHÆ\u0003J\t\u0010u\u001a\u00020\u0003HÆ\u0003Jõ\u0002\u0010v\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020\u00032\b\b\u0002\u0010'\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020\u00032\b\b\u0002\u0010)\u001a\u00020\u0003HÆ\u0001J\u0013\u0010w\u001a\u00020\u00112\b\u0010x\u001a\u0004\u0018\u00010yHÖ\u0003J\t\u0010z\u001a\u00020\u000bHÖ\u0001J\t\u0010{\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010,R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010,R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010,R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010,R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010,R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010,R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010,R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010,R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010,R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010,R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u00109R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010,R\u0011\u0010\u0013\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b;\u00104R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010,R\u0011\u0010\u0015\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b=\u00104R\u0011\u0010\u0016\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b>\u00104R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010,R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u0010,R\u0011\u0010\u0019\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bA\u00104R\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010,R\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u0010,R\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u0010,R\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u0010,R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u0010,R\u0011\u0010\u001f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bG\u00104R\u0011\u0010 \u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bH\u0010,R\u0011\u0010!\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bI\u00104R\u0011\u0010\"\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010,R\u0011\u0010#\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bK\u0010,R\u0011\u0010$\u001a\u00020%¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0011\u0010&\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bN\u0010,R\u0011\u0010'\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bO\u0010,R\u0011\u0010(\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bP\u0010,R\u0011\u0010)\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010,¨\u0006|"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/TransferOwnershipDto;", "Ljava/io/Serializable;", "applNo", "", "authMode", "chassisNo", "currentAddress1", "currentAddress2", "currentAddress3", "currentDistrict", "currentPinCode", "", "currentState", "emailId", "fatherName", "garageAddress", "isRetainSwap", "", "movedOn", "officeCode", "openDate", "ownerCategory", "ownerCode", "ownerFrom", "ownerName", "ownerSerial", "panNo", "permanentAddress1", "permanentAddress2", "permanentAddress3", "permanentDistrict", "permanentPinCode", "permanentState", "purposeCode", "reason", "regnNo", "saleAmmount", "", "saleDate", "services", "stateCode", "transferDate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApplNo", "()Ljava/lang/String;", "getAuthMode", "getChassisNo", "getCurrentAddress1", "getCurrentAddress2", "getCurrentAddress3", "getCurrentDistrict", "getCurrentPinCode", "()I", "getCurrentState", "getEmailId", "getFatherName", "getGarageAddress", "()Z", "getMovedOn", "getOfficeCode", "getOpenDate", "getOwnerCategory", "getOwnerCode", "getOwnerFrom", "getOwnerName", "getOwnerSerial", "getPanNo", "getPermanentAddress1", "getPermanentAddress2", "getPermanentAddress3", "getPermanentDistrict", "getPermanentPinCode", "getPermanentState", "getPurposeCode", "getReason", "getRegnNo", "getSaleAmmount", "()J", "getSaleDate", "getServices", "getStateCode", "getTransferDate", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class TransferOwnershipDto implements Serializable {
    private final String applNo;
    private final String authMode;
    private final String chassisNo;
    private final String currentAddress1;
    private final String currentAddress2;
    private final String currentAddress3;
    private final String currentDistrict;
    private final int currentPinCode;
    private final String currentState;
    private final String emailId;
    private final String fatherName;
    private final String garageAddress;
    private final boolean isRetainSwap;
    private final String movedOn;
    private final int officeCode;
    private final String openDate;
    private final int ownerCategory;
    private final int ownerCode;
    private final String ownerFrom;
    private final String ownerName;
    private final int ownerSerial;
    private final String panNo;
    private final String permanentAddress1;
    private final String permanentAddress2;
    private final String permanentAddress3;
    private final String permanentDistrict;
    private final int permanentPinCode;
    private final String permanentState;
    private final int purposeCode;
    private final String reason;
    private final String regnNo;
    private final long saleAmmount;
    private final String saleDate;
    private final String services;
    private final String stateCode;
    private final String transferDate;

    public TransferOwnershipDto(String str, String authMode, String chassisNo, String currentAddress1, String currentAddress2, String currentAddress3, String currentDistrict, int i, String currentState, String emailId, String fatherName, String garageAddress, boolean z, String movedOn, int i2, String openDate, int i3, int i4, String ownerFrom, String ownerName, int i5, String panNo, String permanentAddress1, String permanentAddress2, String permanentAddress3, String str2, int i6, String permanentState, int i7, String reason, String regnNo, long j, String saleDate, String services, String stateCode, String transferDate) {
        Intrinsics.checkNotNullParameter(authMode, "authMode");
        Intrinsics.checkNotNullParameter(chassisNo, "chassisNo");
        Intrinsics.checkNotNullParameter(currentAddress1, "currentAddress1");
        Intrinsics.checkNotNullParameter(currentAddress2, "currentAddress2");
        Intrinsics.checkNotNullParameter(currentAddress3, "currentAddress3");
        Intrinsics.checkNotNullParameter(currentDistrict, "currentDistrict");
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        Intrinsics.checkNotNullParameter(emailId, "emailId");
        Intrinsics.checkNotNullParameter(fatherName, "fatherName");
        Intrinsics.checkNotNullParameter(garageAddress, "garageAddress");
        Intrinsics.checkNotNullParameter(movedOn, "movedOn");
        Intrinsics.checkNotNullParameter(openDate, "openDate");
        Intrinsics.checkNotNullParameter(ownerFrom, "ownerFrom");
        Intrinsics.checkNotNullParameter(ownerName, "ownerName");
        Intrinsics.checkNotNullParameter(panNo, "panNo");
        Intrinsics.checkNotNullParameter(permanentAddress1, "permanentAddress1");
        Intrinsics.checkNotNullParameter(permanentAddress2, "permanentAddress2");
        Intrinsics.checkNotNullParameter(permanentAddress3, "permanentAddress3");
        Intrinsics.checkNotNullParameter(permanentState, "permanentState");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(regnNo, "regnNo");
        Intrinsics.checkNotNullParameter(saleDate, "saleDate");
        Intrinsics.checkNotNullParameter(services, "services");
        Intrinsics.checkNotNullParameter(stateCode, "stateCode");
        Intrinsics.checkNotNullParameter(transferDate, "transferDate");
        this.applNo = str;
        this.authMode = authMode;
        this.chassisNo = chassisNo;
        this.currentAddress1 = currentAddress1;
        this.currentAddress2 = currentAddress2;
        this.currentAddress3 = currentAddress3;
        this.currentDistrict = currentDistrict;
        this.currentPinCode = i;
        this.currentState = currentState;
        this.emailId = emailId;
        this.fatherName = fatherName;
        this.garageAddress = garageAddress;
        this.isRetainSwap = z;
        this.movedOn = movedOn;
        this.officeCode = i2;
        this.openDate = openDate;
        this.ownerCategory = i3;
        this.ownerCode = i4;
        this.ownerFrom = ownerFrom;
        this.ownerName = ownerName;
        this.ownerSerial = i5;
        this.panNo = panNo;
        this.permanentAddress1 = permanentAddress1;
        this.permanentAddress2 = permanentAddress2;
        this.permanentAddress3 = permanentAddress3;
        this.permanentDistrict = str2;
        this.permanentPinCode = i6;
        this.permanentState = permanentState;
        this.purposeCode = i7;
        this.reason = reason;
        this.regnNo = regnNo;
        this.saleAmmount = j;
        this.saleDate = saleDate;
        this.services = services;
        this.stateCode = stateCode;
        this.transferDate = transferDate;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApplNo() {
        return this.applNo;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getEmailId() {
        return this.emailId;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getFatherName() {
        return this.fatherName;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getGarageAddress() {
        return this.garageAddress;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getIsRetainSwap() {
        return this.isRetainSwap;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getMovedOn() {
        return this.movedOn;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getOfficeCode() {
        return this.officeCode;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getOpenDate() {
        return this.openDate;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getOwnerCategory() {
        return this.ownerCategory;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getOwnerCode() {
        return this.ownerCode;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getOwnerFrom() {
        return this.ownerFrom;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAuthMode() {
        return this.authMode;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getOwnerName() {
        return this.ownerName;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final int getOwnerSerial() {
        return this.ownerSerial;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getPanNo() {
        return this.panNo;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getPermanentAddress1() {
        return this.permanentAddress1;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getPermanentAddress2() {
        return this.permanentAddress2;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getPermanentAddress3() {
        return this.permanentAddress3;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getPermanentDistrict() {
        return this.permanentDistrict;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final int getPermanentPinCode() {
        return this.permanentPinCode;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getPermanentState() {
        return this.permanentState;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final int getPurposeCode() {
        return this.purposeCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getChassisNo() {
        return this.chassisNo;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getRegnNo() {
        return this.regnNo;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final long getSaleAmmount() {
        return this.saleAmmount;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getSaleDate() {
        return this.saleDate;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final String getServices() {
        return this.services;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final String getStateCode() {
        return this.stateCode;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final String getTransferDate() {
        return this.transferDate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrentAddress1() {
        return this.currentAddress1;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCurrentAddress2() {
        return this.currentAddress2;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCurrentAddress3() {
        return this.currentAddress3;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCurrentDistrict() {
        return this.currentDistrict;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getCurrentPinCode() {
        return this.currentPinCode;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCurrentState() {
        return this.currentState;
    }

    public final TransferOwnershipDto copy(String applNo, String authMode, String chassisNo, String currentAddress1, String currentAddress2, String currentAddress3, String currentDistrict, int currentPinCode, String currentState, String emailId, String fatherName, String garageAddress, boolean isRetainSwap, String movedOn, int officeCode, String openDate, int ownerCategory, int ownerCode, String ownerFrom, String ownerName, int ownerSerial, String panNo, String permanentAddress1, String permanentAddress2, String permanentAddress3, String permanentDistrict, int permanentPinCode, String permanentState, int purposeCode, String reason, String regnNo, long saleAmmount, String saleDate, String services, String stateCode, String transferDate) {
        Intrinsics.checkNotNullParameter(authMode, "authMode");
        Intrinsics.checkNotNullParameter(chassisNo, "chassisNo");
        Intrinsics.checkNotNullParameter(currentAddress1, "currentAddress1");
        Intrinsics.checkNotNullParameter(currentAddress2, "currentAddress2");
        Intrinsics.checkNotNullParameter(currentAddress3, "currentAddress3");
        Intrinsics.checkNotNullParameter(currentDistrict, "currentDistrict");
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        Intrinsics.checkNotNullParameter(emailId, "emailId");
        Intrinsics.checkNotNullParameter(fatherName, "fatherName");
        Intrinsics.checkNotNullParameter(garageAddress, "garageAddress");
        Intrinsics.checkNotNullParameter(movedOn, "movedOn");
        Intrinsics.checkNotNullParameter(openDate, "openDate");
        Intrinsics.checkNotNullParameter(ownerFrom, "ownerFrom");
        Intrinsics.checkNotNullParameter(ownerName, "ownerName");
        Intrinsics.checkNotNullParameter(panNo, "panNo");
        Intrinsics.checkNotNullParameter(permanentAddress1, "permanentAddress1");
        Intrinsics.checkNotNullParameter(permanentAddress2, "permanentAddress2");
        Intrinsics.checkNotNullParameter(permanentAddress3, "permanentAddress3");
        Intrinsics.checkNotNullParameter(permanentState, "permanentState");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(regnNo, "regnNo");
        Intrinsics.checkNotNullParameter(saleDate, "saleDate");
        Intrinsics.checkNotNullParameter(services, "services");
        Intrinsics.checkNotNullParameter(stateCode, "stateCode");
        Intrinsics.checkNotNullParameter(transferDate, "transferDate");
        return new TransferOwnershipDto(applNo, authMode, chassisNo, currentAddress1, currentAddress2, currentAddress3, currentDistrict, currentPinCode, currentState, emailId, fatherName, garageAddress, isRetainSwap, movedOn, officeCode, openDate, ownerCategory, ownerCode, ownerFrom, ownerName, ownerSerial, panNo, permanentAddress1, permanentAddress2, permanentAddress3, permanentDistrict, permanentPinCode, permanentState, purposeCode, reason, regnNo, saleAmmount, saleDate, services, stateCode, transferDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferOwnershipDto)) {
            return false;
        }
        TransferOwnershipDto transferOwnershipDto = (TransferOwnershipDto) other;
        return Intrinsics.areEqual(this.applNo, transferOwnershipDto.applNo) && Intrinsics.areEqual(this.authMode, transferOwnershipDto.authMode) && Intrinsics.areEqual(this.chassisNo, transferOwnershipDto.chassisNo) && Intrinsics.areEqual(this.currentAddress1, transferOwnershipDto.currentAddress1) && Intrinsics.areEqual(this.currentAddress2, transferOwnershipDto.currentAddress2) && Intrinsics.areEqual(this.currentAddress3, transferOwnershipDto.currentAddress3) && Intrinsics.areEqual(this.currentDistrict, transferOwnershipDto.currentDistrict) && this.currentPinCode == transferOwnershipDto.currentPinCode && Intrinsics.areEqual(this.currentState, transferOwnershipDto.currentState) && Intrinsics.areEqual(this.emailId, transferOwnershipDto.emailId) && Intrinsics.areEqual(this.fatherName, transferOwnershipDto.fatherName) && Intrinsics.areEqual(this.garageAddress, transferOwnershipDto.garageAddress) && this.isRetainSwap == transferOwnershipDto.isRetainSwap && Intrinsics.areEqual(this.movedOn, transferOwnershipDto.movedOn) && this.officeCode == transferOwnershipDto.officeCode && Intrinsics.areEqual(this.openDate, transferOwnershipDto.openDate) && this.ownerCategory == transferOwnershipDto.ownerCategory && this.ownerCode == transferOwnershipDto.ownerCode && Intrinsics.areEqual(this.ownerFrom, transferOwnershipDto.ownerFrom) && Intrinsics.areEqual(this.ownerName, transferOwnershipDto.ownerName) && this.ownerSerial == transferOwnershipDto.ownerSerial && Intrinsics.areEqual(this.panNo, transferOwnershipDto.panNo) && Intrinsics.areEqual(this.permanentAddress1, transferOwnershipDto.permanentAddress1) && Intrinsics.areEqual(this.permanentAddress2, transferOwnershipDto.permanentAddress2) && Intrinsics.areEqual(this.permanentAddress3, transferOwnershipDto.permanentAddress3) && Intrinsics.areEqual(this.permanentDistrict, transferOwnershipDto.permanentDistrict) && this.permanentPinCode == transferOwnershipDto.permanentPinCode && Intrinsics.areEqual(this.permanentState, transferOwnershipDto.permanentState) && this.purposeCode == transferOwnershipDto.purposeCode && Intrinsics.areEqual(this.reason, transferOwnershipDto.reason) && Intrinsics.areEqual(this.regnNo, transferOwnershipDto.regnNo) && this.saleAmmount == transferOwnershipDto.saleAmmount && Intrinsics.areEqual(this.saleDate, transferOwnershipDto.saleDate) && Intrinsics.areEqual(this.services, transferOwnershipDto.services) && Intrinsics.areEqual(this.stateCode, transferOwnershipDto.stateCode) && Intrinsics.areEqual(this.transferDate, transferOwnershipDto.transferDate);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final String getAuthMode() {
        return this.authMode;
    }

    public final String getChassisNo() {
        return this.chassisNo;
    }

    public final String getCurrentAddress1() {
        return this.currentAddress1;
    }

    public final String getCurrentAddress2() {
        return this.currentAddress2;
    }

    public final String getCurrentAddress3() {
        return this.currentAddress3;
    }

    public final String getCurrentDistrict() {
        return this.currentDistrict;
    }

    public final int getCurrentPinCode() {
        return this.currentPinCode;
    }

    public final String getCurrentState() {
        return this.currentState;
    }

    public final String getEmailId() {
        return this.emailId;
    }

    public final String getFatherName() {
        return this.fatherName;
    }

    public final String getGarageAddress() {
        return this.garageAddress;
    }

    public final String getMovedOn() {
        return this.movedOn;
    }

    public final int getOfficeCode() {
        return this.officeCode;
    }

    public final String getOpenDate() {
        return this.openDate;
    }

    public final int getOwnerCategory() {
        return this.ownerCategory;
    }

    public final int getOwnerCode() {
        return this.ownerCode;
    }

    public final String getOwnerFrom() {
        return this.ownerFrom;
    }

    public final String getOwnerName() {
        return this.ownerName;
    }

    public final int getOwnerSerial() {
        return this.ownerSerial;
    }

    public final String getPanNo() {
        return this.panNo;
    }

    public final String getPermanentAddress1() {
        return this.permanentAddress1;
    }

    public final String getPermanentAddress2() {
        return this.permanentAddress2;
    }

    public final String getPermanentAddress3() {
        return this.permanentAddress3;
    }

    public final String getPermanentDistrict() {
        return this.permanentDistrict;
    }

    public final int getPermanentPinCode() {
        return this.permanentPinCode;
    }

    public final String getPermanentState() {
        return this.permanentState;
    }

    public final int getPurposeCode() {
        return this.purposeCode;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final long getSaleAmmount() {
        return this.saleAmmount;
    }

    public final String getSaleDate() {
        return this.saleDate;
    }

    public final String getServices() {
        return this.services;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public final String getTransferDate() {
        return this.transferDate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v23, types: [int] */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v50 */
    public int hashCode() {
        String str = this.applNo;
        int iHashCode = (((((((((((((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.authMode.hashCode()) * 31) + this.chassisNo.hashCode()) * 31) + this.currentAddress1.hashCode()) * 31) + this.currentAddress2.hashCode()) * 31) + this.currentAddress3.hashCode()) * 31) + this.currentDistrict.hashCode()) * 31) + Integer.hashCode(this.currentPinCode)) * 31) + this.currentState.hashCode()) * 31) + this.emailId.hashCode()) * 31) + this.fatherName.hashCode()) * 31) + this.garageAddress.hashCode()) * 31;
        boolean z = this.isRetainSwap;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int iHashCode2 = (((((((((((((((((((((((((iHashCode + r2) * 31) + this.movedOn.hashCode()) * 31) + Integer.hashCode(this.officeCode)) * 31) + this.openDate.hashCode()) * 31) + Integer.hashCode(this.ownerCategory)) * 31) + Integer.hashCode(this.ownerCode)) * 31) + this.ownerFrom.hashCode()) * 31) + this.ownerName.hashCode()) * 31) + Integer.hashCode(this.ownerSerial)) * 31) + this.panNo.hashCode()) * 31) + this.permanentAddress1.hashCode()) * 31) + this.permanentAddress2.hashCode()) * 31) + this.permanentAddress3.hashCode()) * 31;
        String str2 = this.permanentDistrict;
        return ((((((((((((((((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.permanentPinCode)) * 31) + this.permanentState.hashCode()) * 31) + Integer.hashCode(this.purposeCode)) * 31) + this.reason.hashCode()) * 31) + this.regnNo.hashCode()) * 31) + Long.hashCode(this.saleAmmount)) * 31) + this.saleDate.hashCode()) * 31) + this.services.hashCode()) * 31) + this.stateCode.hashCode()) * 31) + this.transferDate.hashCode();
    }

    public final boolean isRetainSwap() {
        return this.isRetainSwap;
    }

    public String toString() {
        return "TransferOwnershipDto(applNo=" + this.applNo + ", authMode=" + this.authMode + ", chassisNo=" + this.chassisNo + ", currentAddress1=" + this.currentAddress1 + ", currentAddress2=" + this.currentAddress2 + ", currentAddress3=" + this.currentAddress3 + ", currentDistrict=" + this.currentDistrict + ", currentPinCode=" + this.currentPinCode + ", currentState=" + this.currentState + ", emailId=" + this.emailId + ", fatherName=" + this.fatherName + ", garageAddress=" + this.garageAddress + ", isRetainSwap=" + this.isRetainSwap + ", movedOn=" + this.movedOn + ", officeCode=" + this.officeCode + ", openDate=" + this.openDate + ", ownerCategory=" + this.ownerCategory + ", ownerCode=" + this.ownerCode + ", ownerFrom=" + this.ownerFrom + ", ownerName=" + this.ownerName + ", ownerSerial=" + this.ownerSerial + ", panNo=" + this.panNo + ", permanentAddress1=" + this.permanentAddress1 + ", permanentAddress2=" + this.permanentAddress2 + ", permanentAddress3=" + this.permanentAddress3 + ", permanentDistrict=" + this.permanentDistrict + ", permanentPinCode=" + this.permanentPinCode + ", permanentState=" + this.permanentState + ", purposeCode=" + this.purposeCode + ", reason=" + this.reason + ", regnNo=" + this.regnNo + ", saleAmmount=" + this.saleAmmount + ", saleDate=" + this.saleDate + ", services=" + this.services + ", stateCode=" + this.stateCode + ", transferDate=" + this.transferDate + ')';
    }
}
