package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jg\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000f¨\u0006."}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/DlAddress;", "Ljava/io/Serializable;", "houseNo", "", "street", "location", "villageOrTown", "subDistrict", "district", "state", "pinCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDistrict", "()Ljava/lang/String;", "setDistrict", "(Ljava/lang/String;)V", "getHouseNo", "setHouseNo", "getLocation", "setLocation", "getPinCode", "setPinCode", "getState", "setState", "getStreet", "setStreet", "getSubDistrict", "setSubDistrict", "getVillageOrTown", "setVillageOrTown", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DlAddress implements Serializable {
    private String district;
    private String houseNo;
    private String location;
    private String pinCode;
    private String state;
    private String street;
    private String subDistrict;
    private String villageOrTown;

    public DlAddress(String str, String str2, String str3, String str4, String str5, String str6, String state, String str7) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.houseNo = str;
        this.street = str2;
        this.location = str3;
        this.villageOrTown = str4;
        this.subDistrict = str5;
        this.district = str6;
        this.state = state;
        this.pinCode = str7;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHouseNo() {
        return this.houseNo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStreet() {
        return this.street;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getVillageOrTown() {
        return this.villageOrTown;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSubDistrict() {
        return this.subDistrict;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDistrict() {
        return this.district;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPinCode() {
        return this.pinCode;
    }

    public final DlAddress copy(String houseNo, String street, String location, String villageOrTown, String subDistrict, String district, String state, String pinCode) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new DlAddress(houseNo, street, location, villageOrTown, subDistrict, district, state, pinCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DlAddress)) {
            return false;
        }
        DlAddress dlAddress = (DlAddress) other;
        return Intrinsics.areEqual(this.houseNo, dlAddress.houseNo) && Intrinsics.areEqual(this.street, dlAddress.street) && Intrinsics.areEqual(this.location, dlAddress.location) && Intrinsics.areEqual(this.villageOrTown, dlAddress.villageOrTown) && Intrinsics.areEqual(this.subDistrict, dlAddress.subDistrict) && Intrinsics.areEqual(this.district, dlAddress.district) && Intrinsics.areEqual(this.state, dlAddress.state) && Intrinsics.areEqual(this.pinCode, dlAddress.pinCode);
    }

    public final String getDistrict() {
        return this.district;
    }

    public final String getHouseNo() {
        return this.houseNo;
    }

    public final String getLocation() {
        return this.location;
    }

    public final String getPinCode() {
        return this.pinCode;
    }

    public final String getState() {
        return this.state;
    }

    public final String getStreet() {
        return this.street;
    }

    public final String getSubDistrict() {
        return this.subDistrict;
    }

    public final String getVillageOrTown() {
        return this.villageOrTown;
    }

    public int hashCode() {
        String str = this.houseNo;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.street;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.location;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.villageOrTown;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.subDistrict;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.district;
        int iHashCode6 = (((iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.state.hashCode()) * 31;
        String str7 = this.pinCode;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public final void setDistrict(String str) {
        this.district = str;
    }

    public final void setHouseNo(String str) {
        this.houseNo = str;
    }

    public final void setLocation(String str) {
        this.location = str;
    }

    public final void setPinCode(String str) {
        this.pinCode = str;
    }

    public final void setState(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.state = str;
    }

    public final void setStreet(String str) {
        this.street = str;
    }

    public final void setSubDistrict(String str) {
        this.subDistrict = str;
    }

    public final void setVillageOrTown(String str) {
        this.villageOrTown = str;
    }

    public String toString() {
        return "DlAddress(houseNo=" + this.houseNo + ", street=" + this.street + ", location=" + this.location + ", villageOrTown=" + this.villageOrTown + ", subDistrict=" + this.subDistrict + ", district=" + this.district + ", state=" + this.state + ", pinCode=" + this.pinCode + ')';
    }
}
