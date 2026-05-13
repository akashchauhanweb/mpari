package com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\bC\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001Bù\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u001eJ\t\u0010;\u001a\u00020\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010@\u001a\u00020\u0012HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010B\u001a\u00020\u0012HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0005HÆ\u0003J¯\u0002\u0010T\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010U\u001a\u00020V2\b\u0010W\u001a\u0004\u0018\u00010XHÖ\u0003J\t\u0010Y\u001a\u00020\u0012HÖ\u0001J\t\u0010Z\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\"R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\"R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\"R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\"R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\"R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\"R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\"R\u0011\u0010\u0014\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b1\u0010/R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\"R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\"R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\"R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\"R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\"R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\"R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\"R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\"R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\"¨\u0006["}, d2 = {"Lcom/nic/mparivahan/VahanEkyc/Wrapper/EkycResponse/DOEkyc;", "Ljava/io/Serializable;", "aadhaarNo", "", "address", "", "careOf", "code", "dist", "dob", "email", "errorCode", "gender", "house", "landMark", "localityIfAny", "name", "phone", "", "pht", "pincode", "postOffice", "reason", "state", "status", "street", "subDist", "villageTownCity", "vtcCode", "xmlUID", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAadhaarNo", "()J", "getAddress", "()Ljava/lang/String;", "getCareOf", "getCode", "getDist", "getDob", "getEmail", "getErrorCode", "getGender", "getHouse", "getLandMark", "getLocalityIfAny", "getName", "getPhone", "()I", "getPht", "getPincode", "getPostOffice", "getReason", "getState", "getStatus", "getStreet", "getSubDist", "getVillageTownCity", "getVtcCode", "getXmlUID", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DOEkyc implements Serializable {
    private final long aadhaarNo;
    private final String address;
    private final String careOf;
    private final String code;
    private final String dist;
    private final String dob;
    private final String email;
    private final String errorCode;
    private final String gender;
    private final String house;
    private final String landMark;
    private final String localityIfAny;
    private final String name;
    private final int phone;
    private final String pht;
    private final int pincode;
    private final String postOffice;
    private final String reason;
    private final String state;
    private final String status;
    private final String street;
    private final String subDist;
    private final String villageTownCity;
    private final String vtcCode;
    private final String xmlUID;

    public DOEkyc(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, String str13, int i2, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22) {
        this.aadhaarNo = j;
        this.address = str;
        this.careOf = str2;
        this.code = str3;
        this.dist = str4;
        this.dob = str5;
        this.email = str6;
        this.errorCode = str7;
        this.gender = str8;
        this.house = str9;
        this.landMark = str10;
        this.localityIfAny = str11;
        this.name = str12;
        this.phone = i;
        this.pht = str13;
        this.pincode = i2;
        this.postOffice = str14;
        this.reason = str15;
        this.state = str16;
        this.status = str17;
        this.street = str18;
        this.subDist = str19;
        this.villageTownCity = str20;
        this.vtcCode = str21;
        this.xmlUID = str22;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getAadhaarNo() {
        return this.aadhaarNo;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getHouse() {
        return this.house;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getLandMark() {
        return this.landMark;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getLocalityIfAny() {
        return this.localityIfAny;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getPhone() {
        return this.phone;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getPht() {
        return this.pht;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getPincode() {
        return this.pincode;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getPostOffice() {
        return this.postOffice;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getStreet() {
        return this.street;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getSubDist() {
        return this.subDist;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getVillageTownCity() {
        return this.villageTownCity;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getVtcCode() {
        return this.vtcCode;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getXmlUID() {
        return this.xmlUID;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCareOf() {
        return this.careOf;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDist() {
        return this.dist;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDob() {
        return this.dob;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getGender() {
        return this.gender;
    }

    public final DOEkyc copy(long aadhaarNo, String address, String careOf, String code, String dist, String dob, String email, String errorCode, String gender, String house, String landMark, String localityIfAny, String name, int phone, String pht, int pincode, String postOffice, String reason, String state, String status, String street, String subDist, String villageTownCity, String vtcCode, String xmlUID) {
        return new DOEkyc(aadhaarNo, address, careOf, code, dist, dob, email, errorCode, gender, house, landMark, localityIfAny, name, phone, pht, pincode, postOffice, reason, state, status, street, subDist, villageTownCity, vtcCode, xmlUID);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DOEkyc)) {
            return false;
        }
        DOEkyc dOEkyc = (DOEkyc) other;
        return this.aadhaarNo == dOEkyc.aadhaarNo && Intrinsics.areEqual(this.address, dOEkyc.address) && Intrinsics.areEqual(this.careOf, dOEkyc.careOf) && Intrinsics.areEqual(this.code, dOEkyc.code) && Intrinsics.areEqual(this.dist, dOEkyc.dist) && Intrinsics.areEqual(this.dob, dOEkyc.dob) && Intrinsics.areEqual(this.email, dOEkyc.email) && Intrinsics.areEqual(this.errorCode, dOEkyc.errorCode) && Intrinsics.areEqual(this.gender, dOEkyc.gender) && Intrinsics.areEqual(this.house, dOEkyc.house) && Intrinsics.areEqual(this.landMark, dOEkyc.landMark) && Intrinsics.areEqual(this.localityIfAny, dOEkyc.localityIfAny) && Intrinsics.areEqual(this.name, dOEkyc.name) && this.phone == dOEkyc.phone && Intrinsics.areEqual(this.pht, dOEkyc.pht) && this.pincode == dOEkyc.pincode && Intrinsics.areEqual(this.postOffice, dOEkyc.postOffice) && Intrinsics.areEqual(this.reason, dOEkyc.reason) && Intrinsics.areEqual(this.state, dOEkyc.state) && Intrinsics.areEqual(this.status, dOEkyc.status) && Intrinsics.areEqual(this.street, dOEkyc.street) && Intrinsics.areEqual(this.subDist, dOEkyc.subDist) && Intrinsics.areEqual(this.villageTownCity, dOEkyc.villageTownCity) && Intrinsics.areEqual(this.vtcCode, dOEkyc.vtcCode) && Intrinsics.areEqual(this.xmlUID, dOEkyc.xmlUID);
    }

    public final long getAadhaarNo() {
        return this.aadhaarNo;
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getCareOf() {
        return this.careOf;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getDist() {
        return this.dist;
    }

    public final String getDob() {
        return this.dob;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getGender() {
        return this.gender;
    }

    public final String getHouse() {
        return this.house;
    }

    public final String getLandMark() {
        return this.landMark;
    }

    public final String getLocalityIfAny() {
        return this.localityIfAny;
    }

    public final String getName() {
        return this.name;
    }

    public final int getPhone() {
        return this.phone;
    }

    public final String getPht() {
        return this.pht;
    }

    public final int getPincode() {
        return this.pincode;
    }

    public final String getPostOffice() {
        return this.postOffice;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getState() {
        return this.state;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getStreet() {
        return this.street;
    }

    public final String getSubDist() {
        return this.subDist;
    }

    public final String getVillageTownCity() {
        return this.villageTownCity;
    }

    public final String getVtcCode() {
        return this.vtcCode;
    }

    public final String getXmlUID() {
        return this.xmlUID;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.aadhaarNo) * 31;
        String str = this.address;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.careOf;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.code;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.dist;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.dob;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.email;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.errorCode;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.gender;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.house;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.landMark;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.localityIfAny;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.name;
        int iHashCode13 = (((iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31) + Integer.hashCode(this.phone)) * 31;
        String str13 = this.pht;
        int iHashCode14 = (((iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31) + Integer.hashCode(this.pincode)) * 31;
        String str14 = this.postOffice;
        int iHashCode15 = (iHashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.reason;
        int iHashCode16 = (iHashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.state;
        int iHashCode17 = (iHashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.status;
        int iHashCode18 = (iHashCode17 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.street;
        int iHashCode19 = (iHashCode18 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.subDist;
        int iHashCode20 = (iHashCode19 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.villageTownCity;
        int iHashCode21 = (iHashCode20 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.vtcCode;
        int iHashCode22 = (iHashCode21 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.xmlUID;
        return iHashCode22 + (str22 != null ? str22.hashCode() : 0);
    }

    public String toString() {
        return "DOEkyc(aadhaarNo=" + this.aadhaarNo + ", address=" + this.address + ", careOf=" + this.careOf + ", code=" + this.code + ", dist=" + this.dist + ", dob=" + this.dob + ", email=" + this.email + ", errorCode=" + this.errorCode + ", gender=" + this.gender + ", house=" + this.house + ", landMark=" + this.landMark + ", localityIfAny=" + this.localityIfAny + ", name=" + this.name + ", phone=" + this.phone + ", pht=" + this.pht + ", pincode=" + this.pincode + ", postOffice=" + this.postOffice + ", reason=" + this.reason + ", state=" + this.state + ", status=" + this.status + ", street=" + this.street + ", subDist=" + this.subDist + ", villageTownCity=" + this.villageTownCity + ", vtcCode=" + this.vtcCode + ", xmlUID=" + this.xmlUID + ')';
    }
}
