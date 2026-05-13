package com.nic.mparivahan.VahanServices.Checkpost.CheckpostTaxReceipt.CheckpostTaxReceiptModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\bD\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bµ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0001\u0012\u0006\u0010\u0010\u001a\u00020\u0001\u0012\u0006\u0010\u0011\u001a\u00020\u0001\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003¢\u0006\u0002\u0010\u001aJ\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0001HÆ\u0003J\t\u00108\u001a\u00020\u0001HÆ\u0003J\t\u00109\u001a\u00020\u0001HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0007HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0007HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003Jå\u0001\u0010J\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u0003HÆ\u0001J\u0013\u0010K\u001a\u00020L2\b\u0010M\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010N\u001a\u00020\u0007HÖ\u0001J\t\u0010O\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0010\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0011\u0010\u0011\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b+\u0010)R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001cR\u0011\u0010\u0013\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001cR\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001cR\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001cR\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001cR\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001cR\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001c¨\u0006P"}, d2 = {"Lcom/nic/mparivahan/VahanServices/Checkpost/CheckpostTaxReceipt/CheckpostTaxReceiptModel/CheckpostTaxReceiptDownloadItem;", "", "amount", "", "bankRefNo", "chassisNo", "ldWt", "", "ownerName", "paymentDate", "paymentMode", "paymentStatus", "rcptNo", "regnNo", "seatingCap", "serviceType", "serviceTypeName", "stateCd", "taxFrom", "taxMode", "taxModeName", "taxUpto", "vehicleClass", "vehicleClassName", "vehicleType", "vehicleTypeName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getBankRefNo", "getChassisNo", "getLdWt", "()I", "getOwnerName", "getPaymentDate", "getPaymentMode", "getPaymentStatus", "getRcptNo", "getRegnNo", "getSeatingCap", "getServiceType", "()Ljava/lang/Object;", "getServiceTypeName", "getStateCd", "getTaxFrom", "getTaxMode", "getTaxModeName", "getTaxUpto", "getVehicleClass", "getVehicleClassName", "getVehicleType", "getVehicleTypeName", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CheckpostTaxReceiptDownloadItem {
    private final String amount;
    private final String bankRefNo;
    private final String chassisNo;
    private final int ldWt;
    private final String ownerName;
    private final String paymentDate;
    private final String paymentMode;
    private final String paymentStatus;
    private final String rcptNo;
    private final String regnNo;
    private final String seatingCap;
    private final Object serviceType;
    private final Object serviceTypeName;
    private final Object stateCd;
    private final String taxFrom;
    private final int taxMode;
    private final String taxModeName;
    private final String taxUpto;
    private final String vehicleClass;
    private final String vehicleClassName;
    private final String vehicleType;
    private final String vehicleTypeName;

    public CheckpostTaxReceiptDownloadItem(String amount, String bankRefNo, String chassisNo, int i, String ownerName, String paymentDate, String paymentMode, String paymentStatus, String rcptNo, String regnNo, String seatingCap, Object serviceType, Object serviceTypeName, Object stateCd, String taxFrom, int i2, String taxModeName, String taxUpto, String vehicleClass, String vehicleClassName, String vehicleType, String vehicleTypeName) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(bankRefNo, "bankRefNo");
        Intrinsics.checkNotNullParameter(chassisNo, "chassisNo");
        Intrinsics.checkNotNullParameter(ownerName, "ownerName");
        Intrinsics.checkNotNullParameter(paymentDate, "paymentDate");
        Intrinsics.checkNotNullParameter(paymentMode, "paymentMode");
        Intrinsics.checkNotNullParameter(paymentStatus, "paymentStatus");
        Intrinsics.checkNotNullParameter(rcptNo, "rcptNo");
        Intrinsics.checkNotNullParameter(regnNo, "regnNo");
        Intrinsics.checkNotNullParameter(seatingCap, "seatingCap");
        Intrinsics.checkNotNullParameter(serviceType, "serviceType");
        Intrinsics.checkNotNullParameter(serviceTypeName, "serviceTypeName");
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        Intrinsics.checkNotNullParameter(taxFrom, "taxFrom");
        Intrinsics.checkNotNullParameter(taxModeName, "taxModeName");
        Intrinsics.checkNotNullParameter(taxUpto, "taxUpto");
        Intrinsics.checkNotNullParameter(vehicleClass, "vehicleClass");
        Intrinsics.checkNotNullParameter(vehicleClassName, "vehicleClassName");
        Intrinsics.checkNotNullParameter(vehicleType, "vehicleType");
        Intrinsics.checkNotNullParameter(vehicleTypeName, "vehicleTypeName");
        this.amount = amount;
        this.bankRefNo = bankRefNo;
        this.chassisNo = chassisNo;
        this.ldWt = i;
        this.ownerName = ownerName;
        this.paymentDate = paymentDate;
        this.paymentMode = paymentMode;
        this.paymentStatus = paymentStatus;
        this.rcptNo = rcptNo;
        this.regnNo = regnNo;
        this.seatingCap = seatingCap;
        this.serviceType = serviceType;
        this.serviceTypeName = serviceTypeName;
        this.stateCd = stateCd;
        this.taxFrom = taxFrom;
        this.taxMode = i2;
        this.taxModeName = taxModeName;
        this.taxUpto = taxUpto;
        this.vehicleClass = vehicleClass;
        this.vehicleClassName = vehicleClassName;
        this.vehicleType = vehicleType;
        this.vehicleTypeName = vehicleTypeName;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getRegnNo() {
        return this.regnNo;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getSeatingCap() {
        return this.seatingCap;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Object getServiceType() {
        return this.serviceType;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Object getServiceTypeName() {
        return this.serviceTypeName;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Object getStateCd() {
        return this.stateCd;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getTaxFrom() {
        return this.taxFrom;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getTaxMode() {
        return this.taxMode;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getTaxModeName() {
        return this.taxModeName;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getTaxUpto() {
        return this.taxUpto;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getVehicleClass() {
        return this.vehicleClass;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBankRefNo() {
        return this.bankRefNo;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getVehicleClassName() {
        return this.vehicleClassName;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getVehicleType() {
        return this.vehicleType;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getVehicleTypeName() {
        return this.vehicleTypeName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getChassisNo() {
        return this.chassisNo;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getLdWt() {
        return this.ldWt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOwnerName() {
        return this.ownerName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPaymentDate() {
        return this.paymentDate;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPaymentMode() {
        return this.paymentMode;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPaymentStatus() {
        return this.paymentStatus;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getRcptNo() {
        return this.rcptNo;
    }

    public final CheckpostTaxReceiptDownloadItem copy(String amount, String bankRefNo, String chassisNo, int ldWt, String ownerName, String paymentDate, String paymentMode, String paymentStatus, String rcptNo, String regnNo, String seatingCap, Object serviceType, Object serviceTypeName, Object stateCd, String taxFrom, int taxMode, String taxModeName, String taxUpto, String vehicleClass, String vehicleClassName, String vehicleType, String vehicleTypeName) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(bankRefNo, "bankRefNo");
        Intrinsics.checkNotNullParameter(chassisNo, "chassisNo");
        Intrinsics.checkNotNullParameter(ownerName, "ownerName");
        Intrinsics.checkNotNullParameter(paymentDate, "paymentDate");
        Intrinsics.checkNotNullParameter(paymentMode, "paymentMode");
        Intrinsics.checkNotNullParameter(paymentStatus, "paymentStatus");
        Intrinsics.checkNotNullParameter(rcptNo, "rcptNo");
        Intrinsics.checkNotNullParameter(regnNo, "regnNo");
        Intrinsics.checkNotNullParameter(seatingCap, "seatingCap");
        Intrinsics.checkNotNullParameter(serviceType, "serviceType");
        Intrinsics.checkNotNullParameter(serviceTypeName, "serviceTypeName");
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        Intrinsics.checkNotNullParameter(taxFrom, "taxFrom");
        Intrinsics.checkNotNullParameter(taxModeName, "taxModeName");
        Intrinsics.checkNotNullParameter(taxUpto, "taxUpto");
        Intrinsics.checkNotNullParameter(vehicleClass, "vehicleClass");
        Intrinsics.checkNotNullParameter(vehicleClassName, "vehicleClassName");
        Intrinsics.checkNotNullParameter(vehicleType, "vehicleType");
        Intrinsics.checkNotNullParameter(vehicleTypeName, "vehicleTypeName");
        return new CheckpostTaxReceiptDownloadItem(amount, bankRefNo, chassisNo, ldWt, ownerName, paymentDate, paymentMode, paymentStatus, rcptNo, regnNo, seatingCap, serviceType, serviceTypeName, stateCd, taxFrom, taxMode, taxModeName, taxUpto, vehicleClass, vehicleClassName, vehicleType, vehicleTypeName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckpostTaxReceiptDownloadItem)) {
            return false;
        }
        CheckpostTaxReceiptDownloadItem checkpostTaxReceiptDownloadItem = (CheckpostTaxReceiptDownloadItem) other;
        return Intrinsics.areEqual(this.amount, checkpostTaxReceiptDownloadItem.amount) && Intrinsics.areEqual(this.bankRefNo, checkpostTaxReceiptDownloadItem.bankRefNo) && Intrinsics.areEqual(this.chassisNo, checkpostTaxReceiptDownloadItem.chassisNo) && this.ldWt == checkpostTaxReceiptDownloadItem.ldWt && Intrinsics.areEqual(this.ownerName, checkpostTaxReceiptDownloadItem.ownerName) && Intrinsics.areEqual(this.paymentDate, checkpostTaxReceiptDownloadItem.paymentDate) && Intrinsics.areEqual(this.paymentMode, checkpostTaxReceiptDownloadItem.paymentMode) && Intrinsics.areEqual(this.paymentStatus, checkpostTaxReceiptDownloadItem.paymentStatus) && Intrinsics.areEqual(this.rcptNo, checkpostTaxReceiptDownloadItem.rcptNo) && Intrinsics.areEqual(this.regnNo, checkpostTaxReceiptDownloadItem.regnNo) && Intrinsics.areEqual(this.seatingCap, checkpostTaxReceiptDownloadItem.seatingCap) && Intrinsics.areEqual(this.serviceType, checkpostTaxReceiptDownloadItem.serviceType) && Intrinsics.areEqual(this.serviceTypeName, checkpostTaxReceiptDownloadItem.serviceTypeName) && Intrinsics.areEqual(this.stateCd, checkpostTaxReceiptDownloadItem.stateCd) && Intrinsics.areEqual(this.taxFrom, checkpostTaxReceiptDownloadItem.taxFrom) && this.taxMode == checkpostTaxReceiptDownloadItem.taxMode && Intrinsics.areEqual(this.taxModeName, checkpostTaxReceiptDownloadItem.taxModeName) && Intrinsics.areEqual(this.taxUpto, checkpostTaxReceiptDownloadItem.taxUpto) && Intrinsics.areEqual(this.vehicleClass, checkpostTaxReceiptDownloadItem.vehicleClass) && Intrinsics.areEqual(this.vehicleClassName, checkpostTaxReceiptDownloadItem.vehicleClassName) && Intrinsics.areEqual(this.vehicleType, checkpostTaxReceiptDownloadItem.vehicleType) && Intrinsics.areEqual(this.vehicleTypeName, checkpostTaxReceiptDownloadItem.vehicleTypeName);
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getBankRefNo() {
        return this.bankRefNo;
    }

    public final String getChassisNo() {
        return this.chassisNo;
    }

    public final int getLdWt() {
        return this.ldWt;
    }

    public final String getOwnerName() {
        return this.ownerName;
    }

    public final String getPaymentDate() {
        return this.paymentDate;
    }

    public final String getPaymentMode() {
        return this.paymentMode;
    }

    public final String getPaymentStatus() {
        return this.paymentStatus;
    }

    public final String getRcptNo() {
        return this.rcptNo;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final String getSeatingCap() {
        return this.seatingCap;
    }

    public final Object getServiceType() {
        return this.serviceType;
    }

    public final Object getServiceTypeName() {
        return this.serviceTypeName;
    }

    public final Object getStateCd() {
        return this.stateCd;
    }

    public final String getTaxFrom() {
        return this.taxFrom;
    }

    public final int getTaxMode() {
        return this.taxMode;
    }

    public final String getTaxModeName() {
        return this.taxModeName;
    }

    public final String getTaxUpto() {
        return this.taxUpto;
    }

    public final String getVehicleClass() {
        return this.vehicleClass;
    }

    public final String getVehicleClassName() {
        return this.vehicleClassName;
    }

    public final String getVehicleType() {
        return this.vehicleType;
    }

    public final String getVehicleTypeName() {
        return this.vehicleTypeName;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((this.amount.hashCode() * 31) + this.bankRefNo.hashCode()) * 31) + this.chassisNo.hashCode()) * 31) + Integer.hashCode(this.ldWt)) * 31) + this.ownerName.hashCode()) * 31) + this.paymentDate.hashCode()) * 31) + this.paymentMode.hashCode()) * 31) + this.paymentStatus.hashCode()) * 31) + this.rcptNo.hashCode()) * 31) + this.regnNo.hashCode()) * 31) + this.seatingCap.hashCode()) * 31) + this.serviceType.hashCode()) * 31) + this.serviceTypeName.hashCode()) * 31) + this.stateCd.hashCode()) * 31) + this.taxFrom.hashCode()) * 31) + Integer.hashCode(this.taxMode)) * 31) + this.taxModeName.hashCode()) * 31) + this.taxUpto.hashCode()) * 31) + this.vehicleClass.hashCode()) * 31) + this.vehicleClassName.hashCode()) * 31) + this.vehicleType.hashCode()) * 31) + this.vehicleTypeName.hashCode();
    }

    public String toString() {
        return "CheckpostTaxReceiptDownloadItem(amount=" + this.amount + ", bankRefNo=" + this.bankRefNo + ", chassisNo=" + this.chassisNo + ", ldWt=" + this.ldWt + ", ownerName=" + this.ownerName + ", paymentDate=" + this.paymentDate + ", paymentMode=" + this.paymentMode + ", paymentStatus=" + this.paymentStatus + ", rcptNo=" + this.rcptNo + ", regnNo=" + this.regnNo + ", seatingCap=" + this.seatingCap + ", serviceType=" + this.serviceType + ", serviceTypeName=" + this.serviceTypeName + ", stateCd=" + this.stateCd + ", taxFrom=" + this.taxFrom + ", taxMode=" + this.taxMode + ", taxModeName=" + this.taxModeName + ", taxUpto=" + this.taxUpto + ", vehicleClass=" + this.vehicleClass + ", vehicleClassName=" + this.vehicleClassName + ", vehicleType=" + this.vehicleType + ", vehicleTypeName=" + this.vehicleTypeName + ')';
    }
}
