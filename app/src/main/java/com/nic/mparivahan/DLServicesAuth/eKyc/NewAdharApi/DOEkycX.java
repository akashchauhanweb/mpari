package com.nic.mparivahan.DLServicesAuth.eKyc.NewAdharApi;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\bN\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BÍ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u0005¢\u0006\u0002\u0010\u001dJ\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0005HÆ\u0003J\t\u0010;\u001a\u00020\u0005HÆ\u0003J\t\u0010<\u001a\u00020\u0005HÆ\u0003J\t\u0010=\u001a\u00020\u0005HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0005HÆ\u0003J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\t\u0010B\u001a\u00020\u0005HÆ\u0003J\t\u0010C\u001a\u00020\u0005HÆ\u0003J\t\u0010D\u001a\u00020\u0005HÆ\u0003J\t\u0010E\u001a\u00020\u0005HÆ\u0003J\t\u0010F\u001a\u00020\u0005HÆ\u0003J\t\u0010G\u001a\u00020\u0005HÆ\u0003J\t\u0010H\u001a\u00020\u0005HÆ\u0003J\t\u0010I\u001a\u00020\u0005HÆ\u0003J\t\u0010J\u001a\u00020\u0005HÆ\u0003J\t\u0010K\u001a\u00020\u0005HÆ\u0003J\t\u0010L\u001a\u00020\u0005HÆ\u0003J\t\u0010M\u001a\u00020\u0005HÆ\u0003J\t\u0010N\u001a\u00020\u0005HÆ\u0003J\t\u0010O\u001a\u00020\u0005HÆ\u0003J\t\u0010P\u001a\u00020\u0005HÆ\u0003J\t\u0010Q\u001a\u00020\u0005HÆ\u0003J\u0083\u0002\u0010R\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u0005HÆ\u0001J\u0013\u0010S\u001a\u00020T2\b\u0010U\u001a\u0004\u0018\u00010VHÖ\u0003J\t\u0010W\u001a\u00020\u0003HÖ\u0001J\t\u0010X\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010!R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010!R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010!R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010!R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010!R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010!R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001fR\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010!R\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010!R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010!R\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b1\u0010!R\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b2\u0010!R\u0011\u0010\u0017\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u0010!R\u0011\u0010\u0018\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b4\u0010!R\u0011\u0010\u0019\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u0010!R\u0011\u0010\u001a\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b6\u0010!R\u0011\u0010\u001b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b7\u0010!R\u0011\u0010\u001c\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b8\u0010!¨\u0006Y"}, d2 = {"Lcom/nic/mparivahan/DLServicesAuth/eKyc/NewAdharApi/DOEkycX;", "Ljava/io/Serializable;", "aadhaarNo", "", "careOf", "", "careOfType", "code", "dist", "dob", "email", "errorCode", "gender", "house", "landMark", "localityIfAny", "name", "phone", "pht", "pincode", "postOffice", "reason", "state", "status", "street", "subDist", "villageTownCity", "vtcCode", "xmlUID", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAadhaarNo", "()I", "getCareOf", "()Ljava/lang/String;", "getCareOfType", "getCode", "getDist", "getDob", "getEmail", "getErrorCode", "getGender", "getHouse", "getLandMark", "getLocalityIfAny", "getName", "getPhone", "getPht", "getPincode", "getPostOffice", "getReason", "getState", "getStatus", "getStreet", "getSubDist", "getVillageTownCity", "getVtcCode", "getXmlUID", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DOEkycX implements Serializable {
    private final int aadhaarNo;
    private final String careOf;
    private final String careOfType;
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
    private final String pincode;
    private final String postOffice;
    private final String reason;
    private final String state;
    private final String status;
    private final String street;
    private final String subDist;
    private final String villageTownCity;
    private final String vtcCode;
    private final String xmlUID;

    public DOEkycX(int i, String careOf, String careOfType, String code, String dist, String dob, String email, String errorCode, String gender, String house, String landMark, String localityIfAny, String name, int i2, String pht, String pincode, String postOffice, String reason, String state, String status, String street, String subDist, String villageTownCity, String vtcCode, String xmlUID) {
        Intrinsics.checkNotNullParameter(careOf, "careOf");
        Intrinsics.checkNotNullParameter(careOfType, "careOfType");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(dist, "dist");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(house, "house");
        Intrinsics.checkNotNullParameter(landMark, "landMark");
        Intrinsics.checkNotNullParameter(localityIfAny, "localityIfAny");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(pht, "pht");
        Intrinsics.checkNotNullParameter(pincode, "pincode");
        Intrinsics.checkNotNullParameter(postOffice, "postOffice");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(street, "street");
        Intrinsics.checkNotNullParameter(subDist, "subDist");
        Intrinsics.checkNotNullParameter(villageTownCity, "villageTownCity");
        Intrinsics.checkNotNullParameter(vtcCode, "vtcCode");
        Intrinsics.checkNotNullParameter(xmlUID, "xmlUID");
        this.aadhaarNo = i;
        this.careOf = careOf;
        this.careOfType = careOfType;
        this.code = code;
        this.dist = dist;
        this.dob = dob;
        this.email = email;
        this.errorCode = errorCode;
        this.gender = gender;
        this.house = house;
        this.landMark = landMark;
        this.localityIfAny = localityIfAny;
        this.name = name;
        this.phone = i2;
        this.pht = pht;
        this.pincode = pincode;
        this.postOffice = postOffice;
        this.reason = reason;
        this.state = state;
        this.status = status;
        this.street = street;
        this.subDist = subDist;
        this.villageTownCity = villageTownCity;
        this.vtcCode = vtcCode;
        this.xmlUID = xmlUID;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAadhaarNo() {
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
    public final String getPincode() {
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
    public final String getCareOf() {
        return this.careOf;
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
    public final String getCareOfType() {
        return this.careOfType;
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

    public final DOEkycX copy(int aadhaarNo, String careOf, String careOfType, String code, String dist, String dob, String email, String errorCode, String gender, String house, String landMark, String localityIfAny, String name, int phone, String pht, String pincode, String postOffice, String reason, String state, String status, String street, String subDist, String villageTownCity, String vtcCode, String xmlUID) {
        Intrinsics.checkNotNullParameter(careOf, "careOf");
        Intrinsics.checkNotNullParameter(careOfType, "careOfType");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(dist, "dist");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(house, "house");
        Intrinsics.checkNotNullParameter(landMark, "landMark");
        Intrinsics.checkNotNullParameter(localityIfAny, "localityIfAny");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(pht, "pht");
        Intrinsics.checkNotNullParameter(pincode, "pincode");
        Intrinsics.checkNotNullParameter(postOffice, "postOffice");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(street, "street");
        Intrinsics.checkNotNullParameter(subDist, "subDist");
        Intrinsics.checkNotNullParameter(villageTownCity, "villageTownCity");
        Intrinsics.checkNotNullParameter(vtcCode, "vtcCode");
        Intrinsics.checkNotNullParameter(xmlUID, "xmlUID");
        return new DOEkycX(aadhaarNo, careOf, careOfType, code, dist, dob, email, errorCode, gender, house, landMark, localityIfAny, name, phone, pht, pincode, postOffice, reason, state, status, street, subDist, villageTownCity, vtcCode, xmlUID);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DOEkycX)) {
            return false;
        }
        DOEkycX dOEkycX = (DOEkycX) other;
        return this.aadhaarNo == dOEkycX.aadhaarNo && Intrinsics.areEqual(this.careOf, dOEkycX.careOf) && Intrinsics.areEqual(this.careOfType, dOEkycX.careOfType) && Intrinsics.areEqual(this.code, dOEkycX.code) && Intrinsics.areEqual(this.dist, dOEkycX.dist) && Intrinsics.areEqual(this.dob, dOEkycX.dob) && Intrinsics.areEqual(this.email, dOEkycX.email) && Intrinsics.areEqual(this.errorCode, dOEkycX.errorCode) && Intrinsics.areEqual(this.gender, dOEkycX.gender) && Intrinsics.areEqual(this.house, dOEkycX.house) && Intrinsics.areEqual(this.landMark, dOEkycX.landMark) && Intrinsics.areEqual(this.localityIfAny, dOEkycX.localityIfAny) && Intrinsics.areEqual(this.name, dOEkycX.name) && this.phone == dOEkycX.phone && Intrinsics.areEqual(this.pht, dOEkycX.pht) && Intrinsics.areEqual(this.pincode, dOEkycX.pincode) && Intrinsics.areEqual(this.postOffice, dOEkycX.postOffice) && Intrinsics.areEqual(this.reason, dOEkycX.reason) && Intrinsics.areEqual(this.state, dOEkycX.state) && Intrinsics.areEqual(this.status, dOEkycX.status) && Intrinsics.areEqual(this.street, dOEkycX.street) && Intrinsics.areEqual(this.subDist, dOEkycX.subDist) && Intrinsics.areEqual(this.villageTownCity, dOEkycX.villageTownCity) && Intrinsics.areEqual(this.vtcCode, dOEkycX.vtcCode) && Intrinsics.areEqual(this.xmlUID, dOEkycX.xmlUID);
    }

    public final int getAadhaarNo() {
        return this.aadhaarNo;
    }

    public final String getCareOf() {
        return this.careOf;
    }

    public final String getCareOfType() {
        return this.careOfType;
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

    public final String getPincode() {
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
        return (((((((((((((((((((((((((((((((((((((((((((((((Integer.hashCode(this.aadhaarNo) * 31) + this.careOf.hashCode()) * 31) + this.careOfType.hashCode()) * 31) + this.code.hashCode()) * 31) + this.dist.hashCode()) * 31) + this.dob.hashCode()) * 31) + this.email.hashCode()) * 31) + this.errorCode.hashCode()) * 31) + this.gender.hashCode()) * 31) + this.house.hashCode()) * 31) + this.landMark.hashCode()) * 31) + this.localityIfAny.hashCode()) * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.phone)) * 31) + this.pht.hashCode()) * 31) + this.pincode.hashCode()) * 31) + this.postOffice.hashCode()) * 31) + this.reason.hashCode()) * 31) + this.state.hashCode()) * 31) + this.status.hashCode()) * 31) + this.street.hashCode()) * 31) + this.subDist.hashCode()) * 31) + this.villageTownCity.hashCode()) * 31) + this.vtcCode.hashCode()) * 31) + this.xmlUID.hashCode();
    }

    public String toString() {
        return "DOEkycX(aadhaarNo=" + this.aadhaarNo + ", careOf=" + this.careOf + ", careOfType=" + this.careOfType + ", code=" + this.code + ", dist=" + this.dist + ", dob=" + this.dob + ", email=" + this.email + ", errorCode=" + this.errorCode + ", gender=" + this.gender + ", house=" + this.house + ", landMark=" + this.landMark + ", localityIfAny=" + this.localityIfAny + ", name=" + this.name + ", phone=" + this.phone + ", pht=" + this.pht + ", pincode=" + this.pincode + ", postOffice=" + this.postOffice + ", reason=" + this.reason + ", state=" + this.state + ", status=" + this.status + ", street=" + this.street + ", subDist=" + this.subDist + ", villageTownCity=" + this.villageTownCity + ", vtcCode=" + this.vtcCode + ", xmlUID=" + this.xmlUID + ')';
    }
}
