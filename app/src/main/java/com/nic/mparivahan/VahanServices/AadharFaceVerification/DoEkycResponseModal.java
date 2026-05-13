package com.nic.mparivahan.VahanServices.AadharFaceVerification;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\bN\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B±\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jµ\u0002\u0010P\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010Q\u001a\u00020R2\b\u0010S\u001a\u0004\u0018\u00010THÖ\u0003J\t\u0010U\u001a\u00020VHÖ\u0001J\t\u0010W\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001eR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001eR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001eR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001eR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001eR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001eR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001eR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001eR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001eR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001eR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001e¨\u0006X"}, d2 = {"Lcom/nic/mparivahan/VahanServices/AadharFaceVerification/DoEkycResponseModal;", "Ljava/io/Serializable;", "aadhaarNo", "", "address", "code", "dist", "careOf", "email", "errorCode", "landMark", "localityIfAny", "reason", "status", "subDist", "xmlUID", "dob", "gender", "house", "name", "phone", "pht", "pincode", "postOffice", "state", "street", "villageTownCity", "vtcCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAadhaarNo", "()Ljava/lang/String;", "getAddress", "getCareOf", "getCode", "getDist", "getDob", "getEmail", "getErrorCode", "getGender", "getHouse", "getLandMark", "getLocalityIfAny", "getName", "getPhone", "getPht", "getPincode", "getPostOffice", "getReason", "getState", "getStatus", "getStreet", "getSubDist", "getVillageTownCity", "getVtcCode", "getXmlUID", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DoEkycResponseModal implements Serializable {
    private final String aadhaarNo;
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
    private final String phone;
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

    public DoEkycResponseModal() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554431, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAadhaarNo() {
        return this.aadhaarNo;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getSubDist() {
        return this.subDist;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getXmlUID() {
        return this.xmlUID;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getDob() {
        return this.dob;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getGender() {
        return this.gender;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getHouse() {
        return this.house;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getPht() {
        return this.pht;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getPincode() {
        return this.pincode;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getPostOffice() {
        return this.postOffice;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getStreet() {
        return this.street;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getVillageTownCity() {
        return this.villageTownCity;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getVtcCode() {
        return this.vtcCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDist() {
        return this.dist;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCareOf() {
        return this.careOf;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getLandMark() {
        return this.landMark;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getLocalityIfAny() {
        return this.localityIfAny;
    }

    public final DoEkycResponseModal copy(String aadhaarNo, String address, String code, String dist, String careOf, String email, String errorCode, String landMark, String localityIfAny, String reason, String status, String subDist, String xmlUID, String dob, String gender, String house, String name, String phone, String pht, String pincode, String postOffice, String state, String street, String villageTownCity, String vtcCode) {
        return new DoEkycResponseModal(aadhaarNo, address, code, dist, careOf, email, errorCode, landMark, localityIfAny, reason, status, subDist, xmlUID, dob, gender, house, name, phone, pht, pincode, postOffice, state, street, villageTownCity, vtcCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DoEkycResponseModal)) {
            return false;
        }
        DoEkycResponseModal doEkycResponseModal = (DoEkycResponseModal) other;
        return Intrinsics.areEqual(this.aadhaarNo, doEkycResponseModal.aadhaarNo) && Intrinsics.areEqual(this.address, doEkycResponseModal.address) && Intrinsics.areEqual(this.code, doEkycResponseModal.code) && Intrinsics.areEqual(this.dist, doEkycResponseModal.dist) && Intrinsics.areEqual(this.careOf, doEkycResponseModal.careOf) && Intrinsics.areEqual(this.email, doEkycResponseModal.email) && Intrinsics.areEqual(this.errorCode, doEkycResponseModal.errorCode) && Intrinsics.areEqual(this.landMark, doEkycResponseModal.landMark) && Intrinsics.areEqual(this.localityIfAny, doEkycResponseModal.localityIfAny) && Intrinsics.areEqual(this.reason, doEkycResponseModal.reason) && Intrinsics.areEqual(this.status, doEkycResponseModal.status) && Intrinsics.areEqual(this.subDist, doEkycResponseModal.subDist) && Intrinsics.areEqual(this.xmlUID, doEkycResponseModal.xmlUID) && Intrinsics.areEqual(this.dob, doEkycResponseModal.dob) && Intrinsics.areEqual(this.gender, doEkycResponseModal.gender) && Intrinsics.areEqual(this.house, doEkycResponseModal.house) && Intrinsics.areEqual(this.name, doEkycResponseModal.name) && Intrinsics.areEqual(this.phone, doEkycResponseModal.phone) && Intrinsics.areEqual(this.pht, doEkycResponseModal.pht) && Intrinsics.areEqual(this.pincode, doEkycResponseModal.pincode) && Intrinsics.areEqual(this.postOffice, doEkycResponseModal.postOffice) && Intrinsics.areEqual(this.state, doEkycResponseModal.state) && Intrinsics.areEqual(this.street, doEkycResponseModal.street) && Intrinsics.areEqual(this.villageTownCity, doEkycResponseModal.villageTownCity) && Intrinsics.areEqual(this.vtcCode, doEkycResponseModal.vtcCode);
    }

    public final String getAadhaarNo() {
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

    public final String getPhone() {
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
        String str = this.aadhaarNo;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.address;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.code;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.dist;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.careOf;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.email;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.errorCode;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.landMark;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.localityIfAny;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.reason;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.status;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.subDist;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.xmlUID;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.dob;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.gender;
        int iHashCode15 = (iHashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.house;
        int iHashCode16 = (iHashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.name;
        int iHashCode17 = (iHashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.phone;
        int iHashCode18 = (iHashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.pht;
        int iHashCode19 = (iHashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.pincode;
        int iHashCode20 = (iHashCode19 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.postOffice;
        int iHashCode21 = (iHashCode20 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.state;
        int iHashCode22 = (iHashCode21 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.street;
        int iHashCode23 = (iHashCode22 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.villageTownCity;
        int iHashCode24 = (iHashCode23 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.vtcCode;
        return iHashCode24 + (str25 != null ? str25.hashCode() : 0);
    }

    public String toString() {
        return "DoEkycResponseModal(aadhaarNo=" + this.aadhaarNo + ", address=" + this.address + ", code=" + this.code + ", dist=" + this.dist + ", careOf=" + this.careOf + ", email=" + this.email + ", errorCode=" + this.errorCode + ", landMark=" + this.landMark + ", localityIfAny=" + this.localityIfAny + ", reason=" + this.reason + ", status=" + this.status + ", subDist=" + this.subDist + ", xmlUID=" + this.xmlUID + ", dob=" + this.dob + ", gender=" + this.gender + ", house=" + this.house + ", name=" + this.name + ", phone=" + this.phone + ", pht=" + this.pht + ", pincode=" + this.pincode + ", postOffice=" + this.postOffice + ", state=" + this.state + ", street=" + this.street + ", villageTownCity=" + this.villageTownCity + ", vtcCode=" + this.vtcCode + ')';
    }

    public DoEkycResponseModal(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25) {
        this.aadhaarNo = str;
        this.address = str2;
        this.code = str3;
        this.dist = str4;
        this.careOf = str5;
        this.email = str6;
        this.errorCode = str7;
        this.landMark = str8;
        this.localityIfAny = str9;
        this.reason = str10;
        this.status = str11;
        this.subDist = str12;
        this.xmlUID = str13;
        this.dob = str14;
        this.gender = str15;
        this.house = str16;
        this.name = str17;
        this.phone = str18;
        this.pht = str19;
        this.pincode = str20;
        this.postOffice = str21;
        this.state = str22;
        this.street = str23;
        this.villageTownCity = str24;
        this.vtcCode = str25;
    }

    public /* synthetic */ DoEkycResponseModal(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & ConstantsKt.DEFAULT_BLOCK_SIZE) == 0 ? str13 : "", (i & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? null : str14, (i & 16384) != 0 ? null : str15, (i & 32768) != 0 ? null : str16, (i & 65536) != 0 ? null : str17, (i & 131072) != 0 ? null : str18, (i & 262144) != 0 ? null : str19, (i & 524288) != 0 ? null : str20, (i & 1048576) != 0 ? null : str21, (i & 2097152) != 0 ? null : str22, (i & 4194304) != 0 ? null : str23, (i & 8388608) != 0 ? null : str24, (i & 16777216) != 0 ? null : str25);
    }
}
