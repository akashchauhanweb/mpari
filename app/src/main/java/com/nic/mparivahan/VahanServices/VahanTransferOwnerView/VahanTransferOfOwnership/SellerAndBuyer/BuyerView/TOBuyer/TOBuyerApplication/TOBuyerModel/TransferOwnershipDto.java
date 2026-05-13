package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerModel;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\br\b\u0087\b\u0018\u00002\u00020\u0001B½\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u000b\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u000b\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0006\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u000b\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010\"\u001a\u00020\u000b\u0012\u0006\u0010#\u001a\u00020\u000b\u0012\u0006\u0010$\u001a\u00020\u0003\u0012\u0006\u0010%\u001a\u00020\u000b\u0012\u0006\u0010&\u001a\u00020\u0003\u0012\u0006\u0010'\u001a\u00020\u0003\u0012\u0006\u0010(\u001a\u00020\u000b\u0012\u0006\u0010)\u001a\u00020\u0003\u0012\u0006\u0010*\u001a\u00020\u0003\u0012\u0006\u0010+\u001a\u00020\u0003\u0012\u0006\u0010,\u001a\u00020\u0003¢\u0006\u0002\u0010-J\t\u0010X\u001a\u00020\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\t\u0010[\u001a\u00020\u0003HÆ\u0003J\t\u0010\\\u001a\u00020\u0012HÆ\u0003J\t\u0010]\u001a\u00020\u0006HÆ\u0003J\t\u0010^\u001a\u00020\u0003HÆ\u0003J\t\u0010_\u001a\u00020\u000bHÆ\u0003J\t\u0010`\u001a\u00020\u0003HÆ\u0003J\t\u0010a\u001a\u00020\u000bHÆ\u0003J\t\u0010b\u001a\u00020\u0003HÆ\u0003J\t\u0010c\u001a\u00020\u0003HÆ\u0003J\t\u0010d\u001a\u00020\u000bHÆ\u0003J\t\u0010e\u001a\u00020\u0003HÆ\u0003J\t\u0010f\u001a\u00020\u0006HÆ\u0003J\t\u0010g\u001a\u00020\u0003HÆ\u0003J\t\u0010h\u001a\u00020\u000bHÆ\u0003J\t\u0010i\u001a\u00020\u0003HÆ\u0003J\t\u0010j\u001a\u00020\u0003HÆ\u0003J\t\u0010k\u001a\u00020\u0003HÆ\u0003J\t\u0010l\u001a\u00020\u0003HÆ\u0003J\t\u0010m\u001a\u00020\u000bHÆ\u0003J\t\u0010n\u001a\u00020\u0006HÆ\u0003J\t\u0010o\u001a\u00020\u000bHÆ\u0003J\t\u0010p\u001a\u00020\u0003HÆ\u0003J\t\u0010q\u001a\u00020\u000bHÆ\u0003J\t\u0010r\u001a\u00020\u0003HÆ\u0003J\t\u0010s\u001a\u00020\u0003HÆ\u0003J\t\u0010t\u001a\u00020\u000bHÆ\u0003J\t\u0010u\u001a\u00020\u0003HÆ\u0003J\t\u0010v\u001a\u00020\u0003HÆ\u0003J\t\u0010w\u001a\u00020\u0003HÆ\u0003J\t\u0010x\u001a\u00020\u0003HÆ\u0003J\t\u0010y\u001a\u00020\u0003HÆ\u0003J\t\u0010z\u001a\u00020\u0003HÆ\u0003J\t\u0010{\u001a\u00020\u0003HÆ\u0003J\t\u0010|\u001a\u00020\u000bHÆ\u0003J\t\u0010}\u001a\u00020\u000bHÆ\u0003J\t\u0010~\u001a\u00020\u0003HÆ\u0003J\u008f\u0003\u0010\u007f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u000b2\b\b\u0002\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u0010&\u001a\u00020\u00032\b\b\u0002\u0010'\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020\u000b2\b\b\u0002\u0010)\u001a\u00020\u00032\b\b\u0002\u0010*\u001a\u00020\u00032\b\b\u0002\u0010+\u001a\u00020\u00032\b\b\u0002\u0010,\u001a\u00020\u0003HÆ\u0001J\u0015\u0010\u0080\u0001\u001a\u00020\u00122\t\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\n\u0010\u0082\u0001\u001a\u00020\u000bHÖ\u0001J\n\u0010\u0083\u0001\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010/R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010/R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010/R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010/R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b8\u00107R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010/R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010/R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010/R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010/R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010=R\u0011\u0010\u0013\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b>\u00102R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010/R\u0011\u0010\u0015\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b@\u00107R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u0010/R\u0011\u0010\u0017\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bB\u00107R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u0010/R\u0011\u0010\u0019\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bD\u00107R\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u0010/R\u0011\u0010\u001b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bF\u00102R\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u0010/R\u0011\u0010\u001d\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bH\u00107R\u0011\u0010\u001e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bI\u0010/R\u0011\u0010\u001f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010/R\u0011\u0010 \u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bK\u0010/R\u0011\u0010!\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bL\u0010/R\u0011\u0010\"\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bM\u00107R\u0011\u0010#\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bN\u00107R\u0011\u0010$\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bO\u0010/R\u0011\u0010%\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bP\u00107R\u0011\u0010&\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010/R\u0011\u0010'\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bR\u0010/R\u0011\u0010(\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bS\u00107R\u0011\u0010)\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bT\u0010/R\u0011\u0010*\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bU\u0010/R\u0011\u0010+\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bV\u0010/R\u0011\u0010,\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bW\u0010/¨\u0006\u0084\u0001"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/BuyerView/TOBuyer/TOBuyerApplication/TOBuyerModel/TransferOwnershipDto;", "Ljava/io/Serializable;", "applNo", "", "authMode", "chassisNo", "", "currentAddress1", "currentAddress2", "currentAddress3", "currentDistrict", "", "currentPinCode", "currentState", "emailId", "fatherName", "garageAddress", "isRetainSwap", "", "mobileNo", "movedOn", "officeCode", "openDate", "ownerCategory", "ownerCategoryDesc", "ownerCode", "ownerCodeDesc", "ownerFrom", "ownerName", "ownerSerial", "panNo", "permanentAddress1", "permanentAddress2", "permanentAddress3", "permanentDistrict", "permanentPinCode", "permanentState", "purposeCode", "reason", "regnNo", "saleAmmount", "saleDate", "services", "stateCode", "transferDate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Object;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApplNo", "()Ljava/lang/String;", "getAuthMode", "getChassisNo", "()Ljava/lang/Object;", "getCurrentAddress1", "getCurrentAddress2", "getCurrentAddress3", "getCurrentDistrict", "()I", "getCurrentPinCode", "getCurrentState", "getEmailId", "getFatherName", "getGarageAddress", "()Z", "getMobileNo", "getMovedOn", "getOfficeCode", "getOpenDate", "getOwnerCategory", "getOwnerCategoryDesc", "getOwnerCode", "getOwnerCodeDesc", "getOwnerFrom", "getOwnerName", "getOwnerSerial", "getPanNo", "getPermanentAddress1", "getPermanentAddress2", "getPermanentAddress3", "getPermanentDistrict", "getPermanentPinCode", "getPermanentState", "getPurposeCode", "getReason", "getRegnNo", "getSaleAmmount", "getSaleDate", "getServices", "getStateCode", "getTransferDate", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class TransferOwnershipDto implements Serializable {
    private final String applNo;
    private final String authMode;
    private final Object chassisNo;
    private final String currentAddress1;
    private final String currentAddress2;
    private final String currentAddress3;
    private final int currentDistrict;
    private final int currentPinCode;
    private final String currentState;
    private final String emailId;
    private final String fatherName;
    private final String garageAddress;
    private final boolean isRetainSwap;
    private final Object mobileNo;
    private final String movedOn;
    private final int officeCode;
    private final String openDate;
    private final int ownerCategory;
    private final String ownerCategoryDesc;
    private final int ownerCode;
    private final String ownerCodeDesc;
    private final Object ownerFrom;
    private final String ownerName;
    private final int ownerSerial;
    private final String panNo;
    private final String permanentAddress1;
    private final String permanentAddress2;
    private final String permanentAddress3;
    private final int permanentDistrict;
    private final int permanentPinCode;
    private final String permanentState;
    private final int purposeCode;
    private final String reason;
    private final String regnNo;
    private final int saleAmmount;
    private final String saleDate;
    private final String services;
    private final String stateCode;
    private final String transferDate;

    public TransferOwnershipDto(String applNo, String authMode, Object chassisNo, String currentAddress1, String currentAddress2, String currentAddress3, int i, int i2, String currentState, String emailId, String fatherName, String garageAddress, boolean z, Object mobileNo, String movedOn, int i3, String openDate, int i4, String ownerCategoryDesc, int i5, String ownerCodeDesc, Object ownerFrom, String ownerName, int i6, String panNo, String permanentAddress1, String permanentAddress2, String permanentAddress3, int i7, int i8, String permanentState, int i9, String reason, String regnNo, int i10, String saleDate, String services, String stateCode, String transferDate) {
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(authMode, "authMode");
        Intrinsics.checkNotNullParameter(chassisNo, "chassisNo");
        Intrinsics.checkNotNullParameter(currentAddress1, "currentAddress1");
        Intrinsics.checkNotNullParameter(currentAddress2, "currentAddress2");
        Intrinsics.checkNotNullParameter(currentAddress3, "currentAddress3");
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        Intrinsics.checkNotNullParameter(emailId, "emailId");
        Intrinsics.checkNotNullParameter(fatherName, "fatherName");
        Intrinsics.checkNotNullParameter(garageAddress, "garageAddress");
        Intrinsics.checkNotNullParameter(mobileNo, "mobileNo");
        Intrinsics.checkNotNullParameter(movedOn, "movedOn");
        Intrinsics.checkNotNullParameter(openDate, "openDate");
        Intrinsics.checkNotNullParameter(ownerCategoryDesc, "ownerCategoryDesc");
        Intrinsics.checkNotNullParameter(ownerCodeDesc, "ownerCodeDesc");
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
        this.applNo = applNo;
        this.authMode = authMode;
        this.chassisNo = chassisNo;
        this.currentAddress1 = currentAddress1;
        this.currentAddress2 = currentAddress2;
        this.currentAddress3 = currentAddress3;
        this.currentDistrict = i;
        this.currentPinCode = i2;
        this.currentState = currentState;
        this.emailId = emailId;
        this.fatherName = fatherName;
        this.garageAddress = garageAddress;
        this.isRetainSwap = z;
        this.mobileNo = mobileNo;
        this.movedOn = movedOn;
        this.officeCode = i3;
        this.openDate = openDate;
        this.ownerCategory = i4;
        this.ownerCategoryDesc = ownerCategoryDesc;
        this.ownerCode = i5;
        this.ownerCodeDesc = ownerCodeDesc;
        this.ownerFrom = ownerFrom;
        this.ownerName = ownerName;
        this.ownerSerial = i6;
        this.panNo = panNo;
        this.permanentAddress1 = permanentAddress1;
        this.permanentAddress2 = permanentAddress2;
        this.permanentAddress3 = permanentAddress3;
        this.permanentDistrict = i7;
        this.permanentPinCode = i8;
        this.permanentState = permanentState;
        this.purposeCode = i9;
        this.reason = reason;
        this.regnNo = regnNo;
        this.saleAmmount = i10;
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
    public final Object getMobileNo() {
        return this.mobileNo;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getMovedOn() {
        return this.movedOn;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getOfficeCode() {
        return this.officeCode;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getOpenDate() {
        return this.openDate;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getOwnerCategory() {
        return this.ownerCategory;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getOwnerCategoryDesc() {
        return this.ownerCategoryDesc;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAuthMode() {
        return this.authMode;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final int getOwnerCode() {
        return this.ownerCode;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getOwnerCodeDesc() {
        return this.ownerCodeDesc;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Object getOwnerFrom() {
        return this.ownerFrom;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getOwnerName() {
        return this.ownerName;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final int getOwnerSerial() {
        return this.ownerSerial;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getPanNo() {
        return this.panNo;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getPermanentAddress1() {
        return this.permanentAddress1;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getPermanentAddress2() {
        return this.permanentAddress2;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getPermanentAddress3() {
        return this.permanentAddress3;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final int getPermanentDistrict() {
        return this.permanentDistrict;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Object getChassisNo() {
        return this.chassisNo;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final int getPermanentPinCode() {
        return this.permanentPinCode;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getPermanentState() {
        return this.permanentState;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final int getPurposeCode() {
        return this.purposeCode;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final String getRegnNo() {
        return this.regnNo;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final int getSaleAmmount() {
        return this.saleAmmount;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final String getSaleDate() {
        return this.saleDate;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final String getServices() {
        return this.services;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final String getStateCode() {
        return this.stateCode;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
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
    public final int getCurrentDistrict() {
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

    public final TransferOwnershipDto copy(String applNo, String authMode, Object chassisNo, String currentAddress1, String currentAddress2, String currentAddress3, int currentDistrict, int currentPinCode, String currentState, String emailId, String fatherName, String garageAddress, boolean isRetainSwap, Object mobileNo, String movedOn, int officeCode, String openDate, int ownerCategory, String ownerCategoryDesc, int ownerCode, String ownerCodeDesc, Object ownerFrom, String ownerName, int ownerSerial, String panNo, String permanentAddress1, String permanentAddress2, String permanentAddress3, int permanentDistrict, int permanentPinCode, String permanentState, int purposeCode, String reason, String regnNo, int saleAmmount, String saleDate, String services, String stateCode, String transferDate) {
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(authMode, "authMode");
        Intrinsics.checkNotNullParameter(chassisNo, "chassisNo");
        Intrinsics.checkNotNullParameter(currentAddress1, "currentAddress1");
        Intrinsics.checkNotNullParameter(currentAddress2, "currentAddress2");
        Intrinsics.checkNotNullParameter(currentAddress3, "currentAddress3");
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        Intrinsics.checkNotNullParameter(emailId, "emailId");
        Intrinsics.checkNotNullParameter(fatherName, "fatherName");
        Intrinsics.checkNotNullParameter(garageAddress, "garageAddress");
        Intrinsics.checkNotNullParameter(mobileNo, "mobileNo");
        Intrinsics.checkNotNullParameter(movedOn, "movedOn");
        Intrinsics.checkNotNullParameter(openDate, "openDate");
        Intrinsics.checkNotNullParameter(ownerCategoryDesc, "ownerCategoryDesc");
        Intrinsics.checkNotNullParameter(ownerCodeDesc, "ownerCodeDesc");
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
        return new TransferOwnershipDto(applNo, authMode, chassisNo, currentAddress1, currentAddress2, currentAddress3, currentDistrict, currentPinCode, currentState, emailId, fatherName, garageAddress, isRetainSwap, mobileNo, movedOn, officeCode, openDate, ownerCategory, ownerCategoryDesc, ownerCode, ownerCodeDesc, ownerFrom, ownerName, ownerSerial, panNo, permanentAddress1, permanentAddress2, permanentAddress3, permanentDistrict, permanentPinCode, permanentState, purposeCode, reason, regnNo, saleAmmount, saleDate, services, stateCode, transferDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferOwnershipDto)) {
            return false;
        }
        TransferOwnershipDto transferOwnershipDto = (TransferOwnershipDto) other;
        return Intrinsics.areEqual(this.applNo, transferOwnershipDto.applNo) && Intrinsics.areEqual(this.authMode, transferOwnershipDto.authMode) && Intrinsics.areEqual(this.chassisNo, transferOwnershipDto.chassisNo) && Intrinsics.areEqual(this.currentAddress1, transferOwnershipDto.currentAddress1) && Intrinsics.areEqual(this.currentAddress2, transferOwnershipDto.currentAddress2) && Intrinsics.areEqual(this.currentAddress3, transferOwnershipDto.currentAddress3) && this.currentDistrict == transferOwnershipDto.currentDistrict && this.currentPinCode == transferOwnershipDto.currentPinCode && Intrinsics.areEqual(this.currentState, transferOwnershipDto.currentState) && Intrinsics.areEqual(this.emailId, transferOwnershipDto.emailId) && Intrinsics.areEqual(this.fatherName, transferOwnershipDto.fatherName) && Intrinsics.areEqual(this.garageAddress, transferOwnershipDto.garageAddress) && this.isRetainSwap == transferOwnershipDto.isRetainSwap && Intrinsics.areEqual(this.mobileNo, transferOwnershipDto.mobileNo) && Intrinsics.areEqual(this.movedOn, transferOwnershipDto.movedOn) && this.officeCode == transferOwnershipDto.officeCode && Intrinsics.areEqual(this.openDate, transferOwnershipDto.openDate) && this.ownerCategory == transferOwnershipDto.ownerCategory && Intrinsics.areEqual(this.ownerCategoryDesc, transferOwnershipDto.ownerCategoryDesc) && this.ownerCode == transferOwnershipDto.ownerCode && Intrinsics.areEqual(this.ownerCodeDesc, transferOwnershipDto.ownerCodeDesc) && Intrinsics.areEqual(this.ownerFrom, transferOwnershipDto.ownerFrom) && Intrinsics.areEqual(this.ownerName, transferOwnershipDto.ownerName) && this.ownerSerial == transferOwnershipDto.ownerSerial && Intrinsics.areEqual(this.panNo, transferOwnershipDto.panNo) && Intrinsics.areEqual(this.permanentAddress1, transferOwnershipDto.permanentAddress1) && Intrinsics.areEqual(this.permanentAddress2, transferOwnershipDto.permanentAddress2) && Intrinsics.areEqual(this.permanentAddress3, transferOwnershipDto.permanentAddress3) && this.permanentDistrict == transferOwnershipDto.permanentDistrict && this.permanentPinCode == transferOwnershipDto.permanentPinCode && Intrinsics.areEqual(this.permanentState, transferOwnershipDto.permanentState) && this.purposeCode == transferOwnershipDto.purposeCode && Intrinsics.areEqual(this.reason, transferOwnershipDto.reason) && Intrinsics.areEqual(this.regnNo, transferOwnershipDto.regnNo) && this.saleAmmount == transferOwnershipDto.saleAmmount && Intrinsics.areEqual(this.saleDate, transferOwnershipDto.saleDate) && Intrinsics.areEqual(this.services, transferOwnershipDto.services) && Intrinsics.areEqual(this.stateCode, transferOwnershipDto.stateCode) && Intrinsics.areEqual(this.transferDate, transferOwnershipDto.transferDate);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final String getAuthMode() {
        return this.authMode;
    }

    public final Object getChassisNo() {
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

    public final int getCurrentDistrict() {
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

    public final Object getMobileNo() {
        return this.mobileNo;
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

    public final String getOwnerCategoryDesc() {
        return this.ownerCategoryDesc;
    }

    public final int getOwnerCode() {
        return this.ownerCode;
    }

    public final String getOwnerCodeDesc() {
        return this.ownerCodeDesc;
    }

    public final Object getOwnerFrom() {
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

    public final int getPermanentDistrict() {
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

    public final int getSaleAmmount() {
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
    /* JADX WARN: Type inference failed for: r1v23, types: [int] */
    /* JADX WARN: Type inference failed for: r1v76 */
    /* JADX WARN: Type inference failed for: r1v77 */
    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((this.applNo.hashCode() * 31) + this.authMode.hashCode()) * 31) + this.chassisNo.hashCode()) * 31) + this.currentAddress1.hashCode()) * 31) + this.currentAddress2.hashCode()) * 31) + this.currentAddress3.hashCode()) * 31) + Integer.hashCode(this.currentDistrict)) * 31) + Integer.hashCode(this.currentPinCode)) * 31) + this.currentState.hashCode()) * 31) + this.emailId.hashCode()) * 31) + this.fatherName.hashCode()) * 31) + this.garageAddress.hashCode()) * 31;
        boolean z = this.isRetainSwap;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode + r1) * 31) + this.mobileNo.hashCode()) * 31) + this.movedOn.hashCode()) * 31) + Integer.hashCode(this.officeCode)) * 31) + this.openDate.hashCode()) * 31) + Integer.hashCode(this.ownerCategory)) * 31) + this.ownerCategoryDesc.hashCode()) * 31) + Integer.hashCode(this.ownerCode)) * 31) + this.ownerCodeDesc.hashCode()) * 31) + this.ownerFrom.hashCode()) * 31) + this.ownerName.hashCode()) * 31) + Integer.hashCode(this.ownerSerial)) * 31) + this.panNo.hashCode()) * 31) + this.permanentAddress1.hashCode()) * 31) + this.permanentAddress2.hashCode()) * 31) + this.permanentAddress3.hashCode()) * 31) + Integer.hashCode(this.permanentDistrict)) * 31) + Integer.hashCode(this.permanentPinCode)) * 31) + this.permanentState.hashCode()) * 31) + Integer.hashCode(this.purposeCode)) * 31) + this.reason.hashCode()) * 31) + this.regnNo.hashCode()) * 31) + Integer.hashCode(this.saleAmmount)) * 31) + this.saleDate.hashCode()) * 31) + this.services.hashCode()) * 31) + this.stateCode.hashCode()) * 31) + this.transferDate.hashCode();
    }

    public final boolean isRetainSwap() {
        return this.isRetainSwap;
    }

    public String toString() {
        return "TransferOwnershipDto(applNo=" + this.applNo + ", authMode=" + this.authMode + ", chassisNo=" + this.chassisNo + ", currentAddress1=" + this.currentAddress1 + ", currentAddress2=" + this.currentAddress2 + ", currentAddress3=" + this.currentAddress3 + ", currentDistrict=" + this.currentDistrict + ", currentPinCode=" + this.currentPinCode + ", currentState=" + this.currentState + ", emailId=" + this.emailId + ", fatherName=" + this.fatherName + ", garageAddress=" + this.garageAddress + ", isRetainSwap=" + this.isRetainSwap + ", mobileNo=" + this.mobileNo + ", movedOn=" + this.movedOn + ", officeCode=" + this.officeCode + ", openDate=" + this.openDate + ", ownerCategory=" + this.ownerCategory + ", ownerCategoryDesc=" + this.ownerCategoryDesc + ", ownerCode=" + this.ownerCode + ", ownerCodeDesc=" + this.ownerCodeDesc + ", ownerFrom=" + this.ownerFrom + ", ownerName=" + this.ownerName + ", ownerSerial=" + this.ownerSerial + ", panNo=" + this.panNo + ", permanentAddress1=" + this.permanentAddress1 + ", permanentAddress2=" + this.permanentAddress2 + ", permanentAddress3=" + this.permanentAddress3 + ", permanentDistrict=" + this.permanentDistrict + ", permanentPinCode=" + this.permanentPinCode + ", permanentState=" + this.permanentState + ", purposeCode=" + this.purposeCode + ", reason=" + this.reason + ", regnNo=" + this.regnNo + ", saleAmmount=" + this.saleAmmount + ", saleDate=" + this.saleDate + ", services=" + this.services + ", stateCode=" + this.stateCode + ", transferDate=" + this.transferDate + ')';
    }
}
