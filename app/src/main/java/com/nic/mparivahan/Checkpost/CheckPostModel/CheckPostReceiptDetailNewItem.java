package com.nic.mparivahan.Checkpost.CheckPostModel;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001Bé\u0001\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0002\u0012\b\u00100\u001a\u0004\u0018\u00010\u0002\u0012\b\u00101\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bZ\u0010[J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0098\u0002\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b2\u00103J\t\u00104\u001a\u00020\u0002HÖ\u0001J\t\u00105\u001a\u00020\u0006HÖ\u0001J\u0013\u00108\u001a\u0002072\b\u00106\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u00109\u001a\u00020\u0006HÖ\u0001J\u0019\u0010>\u001a\u00020=2\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020\u0006HÖ\u0001R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010?\u001a\u0004\bB\u0010AR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010?\u001a\u0004\bC\u0010AR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010D\u001a\u0004\bE\u0010\bR\u0019\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010?\u001a\u0004\bF\u0010AR\u0019\u0010!\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010?\u001a\u0004\bG\u0010AR\u0019\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010?\u001a\u0004\bH\u0010AR\u0019\u0010#\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010?\u001a\u0004\bI\u0010AR\u0019\u0010$\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010?\u001a\u0004\bJ\u0010AR\u0019\u0010%\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010?\u001a\u0004\bK\u0010AR\u0019\u0010&\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010?\u001a\u0004\bL\u0010AR\u0019\u0010'\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b'\u0010M\u001a\u0004\bN\u0010OR\u0019\u0010(\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b(\u0010M\u001a\u0004\bP\u0010OR\u0019\u0010)\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b)\u0010M\u001a\u0004\bQ\u0010OR\u0019\u0010*\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010?\u001a\u0004\bR\u0010AR\u0019\u0010+\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b+\u0010D\u001a\u0004\bS\u0010\bR\u0019\u0010,\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010?\u001a\u0004\bT\u0010AR\u0019\u0010-\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010?\u001a\u0004\bU\u0010AR\u0019\u0010.\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b.\u0010?\u001a\u0004\bV\u0010AR\u0019\u0010/\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b/\u0010?\u001a\u0004\bW\u0010AR\u0019\u00100\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010?\u001a\u0004\bX\u0010AR\u0019\u00101\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b1\u0010?\u001a\u0004\bY\u0010A¨\u0006\\"}, d2 = {"Lcom/nic/mparivahan/Checkpost/CheckPostModel/CheckPostReceiptDetailNewItem;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "", "component4", "()Ljava/lang/Integer;", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "amount", "bankRefNo", "chassisNo", "ldWt", "ownerName", "paymentDate", "paymentMode", "paymentStatus", "rcptNo", "regnNo", "seatingCap", "serviceType", "serviceTypeName", "stateCd", "taxFrom", "taxMode", "taxModeName", "taxUpto", "vehicleClass", "vehicleClassName", "vehicleType", "vehicleTypeName", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/nic/mparivahan/Checkpost/CheckPostModel/CheckPostReceiptDetailNewItem;", "toString", "hashCode", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "Ljava/lang/String;", "getAmount", "()Ljava/lang/String;", "getBankRefNo", "getChassisNo", "Ljava/lang/Integer;", "getLdWt", "getOwnerName", "getPaymentDate", "getPaymentMode", "getPaymentStatus", "getRcptNo", "getRegnNo", "getSeatingCap", "Ljava/lang/Object;", "getServiceType", "()Ljava/lang/Object;", "getServiceTypeName", "getStateCd", "getTaxFrom", "getTaxMode", "getTaxModeName", "getTaxUpto", "getVehicleClass", "getVehicleClassName", "getVehicleType", "getVehicleTypeName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "app_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class CheckPostReceiptDetailNewItem implements Parcelable {
    public static final Parcelable.Creator<CheckPostReceiptDetailNewItem> CREATOR = new a();
    private final String amount;
    private final String bankRefNo;
    private final String chassisNo;
    private final Integer ldWt;
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
    private final Integer taxMode;
    private final String taxModeName;
    private final String taxUpto;
    private final String vehicleClass;
    private final String vehicleClassName;
    private final String vehicleType;
    private final String vehicleTypeName;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CheckPostReceiptDetailNewItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CheckPostReceiptDetailNewItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readValue(CheckPostReceiptDetailNewItem.class.getClassLoader()), parcel.readValue(CheckPostReceiptDetailNewItem.class.getClassLoader()), parcel.readValue(CheckPostReceiptDetailNewItem.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CheckPostReceiptDetailNewItem[] newArray(int i) {
            return new CheckPostReceiptDetailNewItem[i];
        }
    }

    public CheckPostReceiptDetailNewItem(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Object obj, Object obj2, Object obj3, String str11, Integer num2, String str12, String str13, String str14, String str15, String str16, String str17) {
        this.amount = str;
        this.bankRefNo = str2;
        this.chassisNo = str3;
        this.ldWt = num;
        this.ownerName = str4;
        this.paymentDate = str5;
        this.paymentMode = str6;
        this.paymentStatus = str7;
        this.rcptNo = str8;
        this.regnNo = str9;
        this.seatingCap = str10;
        this.serviceType = obj;
        this.serviceTypeName = obj2;
        this.stateCd = obj3;
        this.taxFrom = str11;
        this.taxMode = num2;
        this.taxModeName = str12;
        this.taxUpto = str13;
        this.vehicleClass = str14;
        this.vehicleClassName = str15;
        this.vehicleType = str16;
        this.vehicleTypeName = str17;
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
    public final Integer getTaxMode() {
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
    public final Integer getLdWt() {
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

    public final CheckPostReceiptDetailNewItem copy(String amount, String bankRefNo, String chassisNo, Integer ldWt, String ownerName, String paymentDate, String paymentMode, String paymentStatus, String rcptNo, String regnNo, String seatingCap, Object serviceType, Object serviceTypeName, Object stateCd, String taxFrom, Integer taxMode, String taxModeName, String taxUpto, String vehicleClass, String vehicleClassName, String vehicleType, String vehicleTypeName) {
        return new CheckPostReceiptDetailNewItem(amount, bankRefNo, chassisNo, ldWt, ownerName, paymentDate, paymentMode, paymentStatus, rcptNo, regnNo, seatingCap, serviceType, serviceTypeName, stateCd, taxFrom, taxMode, taxModeName, taxUpto, vehicleClass, vehicleClassName, vehicleType, vehicleTypeName);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckPostReceiptDetailNewItem)) {
            return false;
        }
        CheckPostReceiptDetailNewItem checkPostReceiptDetailNewItem = (CheckPostReceiptDetailNewItem) other;
        return Intrinsics.areEqual(this.amount, checkPostReceiptDetailNewItem.amount) && Intrinsics.areEqual(this.bankRefNo, checkPostReceiptDetailNewItem.bankRefNo) && Intrinsics.areEqual(this.chassisNo, checkPostReceiptDetailNewItem.chassisNo) && Intrinsics.areEqual(this.ldWt, checkPostReceiptDetailNewItem.ldWt) && Intrinsics.areEqual(this.ownerName, checkPostReceiptDetailNewItem.ownerName) && Intrinsics.areEqual(this.paymentDate, checkPostReceiptDetailNewItem.paymentDate) && Intrinsics.areEqual(this.paymentMode, checkPostReceiptDetailNewItem.paymentMode) && Intrinsics.areEqual(this.paymentStatus, checkPostReceiptDetailNewItem.paymentStatus) && Intrinsics.areEqual(this.rcptNo, checkPostReceiptDetailNewItem.rcptNo) && Intrinsics.areEqual(this.regnNo, checkPostReceiptDetailNewItem.regnNo) && Intrinsics.areEqual(this.seatingCap, checkPostReceiptDetailNewItem.seatingCap) && Intrinsics.areEqual(this.serviceType, checkPostReceiptDetailNewItem.serviceType) && Intrinsics.areEqual(this.serviceTypeName, checkPostReceiptDetailNewItem.serviceTypeName) && Intrinsics.areEqual(this.stateCd, checkPostReceiptDetailNewItem.stateCd) && Intrinsics.areEqual(this.taxFrom, checkPostReceiptDetailNewItem.taxFrom) && Intrinsics.areEqual(this.taxMode, checkPostReceiptDetailNewItem.taxMode) && Intrinsics.areEqual(this.taxModeName, checkPostReceiptDetailNewItem.taxModeName) && Intrinsics.areEqual(this.taxUpto, checkPostReceiptDetailNewItem.taxUpto) && Intrinsics.areEqual(this.vehicleClass, checkPostReceiptDetailNewItem.vehicleClass) && Intrinsics.areEqual(this.vehicleClassName, checkPostReceiptDetailNewItem.vehicleClassName) && Intrinsics.areEqual(this.vehicleType, checkPostReceiptDetailNewItem.vehicleType) && Intrinsics.areEqual(this.vehicleTypeName, checkPostReceiptDetailNewItem.vehicleTypeName);
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

    public final Integer getLdWt() {
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

    public final Integer getTaxMode() {
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
        String str = this.amount;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bankRefNo;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.chassisNo;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.ldWt;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.ownerName;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.paymentDate;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.paymentMode;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.paymentStatus;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.rcptNo;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.regnNo;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.seatingCap;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Object obj = this.serviceType;
        int iHashCode12 = (iHashCode11 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.serviceTypeName;
        int iHashCode13 = (iHashCode12 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.stateCd;
        int iHashCode14 = (iHashCode13 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        String str11 = this.taxFrom;
        int iHashCode15 = (iHashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Integer num2 = this.taxMode;
        int iHashCode16 = (iHashCode15 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str12 = this.taxModeName;
        int iHashCode17 = (iHashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.taxUpto;
        int iHashCode18 = (iHashCode17 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.vehicleClass;
        int iHashCode19 = (iHashCode18 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.vehicleClassName;
        int iHashCode20 = (iHashCode19 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.vehicleType;
        int iHashCode21 = (iHashCode20 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.vehicleTypeName;
        return iHashCode21 + (str17 != null ? str17.hashCode() : 0);
    }

    public String toString() {
        return "CheckPostReceiptDetailNewItem(amount=" + this.amount + ", bankRefNo=" + this.bankRefNo + ", chassisNo=" + this.chassisNo + ", ldWt=" + this.ldWt + ", ownerName=" + this.ownerName + ", paymentDate=" + this.paymentDate + ", paymentMode=" + this.paymentMode + ", paymentStatus=" + this.paymentStatus + ", rcptNo=" + this.rcptNo + ", regnNo=" + this.regnNo + ", seatingCap=" + this.seatingCap + ", serviceType=" + this.serviceType + ", serviceTypeName=" + this.serviceTypeName + ", stateCd=" + this.stateCd + ", taxFrom=" + this.taxFrom + ", taxMode=" + this.taxMode + ", taxModeName=" + this.taxModeName + ", taxUpto=" + this.taxUpto + ", vehicleClass=" + this.vehicleClass + ", vehicleClassName=" + this.vehicleClassName + ", vehicleType=" + this.vehicleType + ", vehicleTypeName=" + this.vehicleTypeName + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.amount);
        parcel.writeString(this.bankRefNo);
        parcel.writeString(this.chassisNo);
        Integer num = this.ldWt;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.ownerName);
        parcel.writeString(this.paymentDate);
        parcel.writeString(this.paymentMode);
        parcel.writeString(this.paymentStatus);
        parcel.writeString(this.rcptNo);
        parcel.writeString(this.regnNo);
        parcel.writeString(this.seatingCap);
        parcel.writeValue(this.serviceType);
        parcel.writeValue(this.serviceTypeName);
        parcel.writeValue(this.stateCd);
        parcel.writeString(this.taxFrom);
        Integer num2 = this.taxMode;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.taxModeName);
        parcel.writeString(this.taxUpto);
        parcel.writeString(this.vehicleClass);
        parcel.writeString(this.vehicleClassName);
        parcel.writeString(this.vehicleType);
        parcel.writeString(this.vehicleTypeName);
    }

    public /* synthetic */ CheckPostReceiptDetailNewItem(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Object obj, Object obj2, Object obj3, String str11, Integer num2, String str12, String str13, String str14, String str15, String str16, String str17, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, num, str4, str5, str6, str7, str8, str9, str10, (i & 2048) != 0 ? null : obj, (i & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? null : obj2, (i & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? null : obj3, str11, num2, str12, str13, str14, str15, str16, str17);
    }
}
