package com.nic.mparivahan.ClServices.Pojo;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b,\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0002\u0010\u0013J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\tHÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\u009f\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u0003HÆ\u0001J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u00020\tHÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0015¨\u0006:"}, d2 = {"Lcom/nic/mparivahan/ClServices/Pojo/GetClPojo;", "", "address", "", "cl_No", "cl_Status", "dob", "erormsg", "errorcd", "", "father_Name", "issuing_authority", "mobile_No", "name", "old_CL_No", "photo", "signature", "state", "validity", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getCl_No", "getCl_Status", "getDob", "getErormsg", "getErrorcd", "()I", "getFather_Name", "getIssuing_authority", "getMobile_No", "getName", "getOld_CL_No", "getPhoto", "getSignature", "getState", "getValidity", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class GetClPojo {
    private final String address;
    private final String cl_No;
    private final String cl_Status;
    private final String dob;
    private final String erormsg;
    private final int errorcd;
    private final String father_Name;
    private final String issuing_authority;
    private final String mobile_No;
    private final String name;
    private final String old_CL_No;
    private final String photo;
    private final String signature;
    private final String state;
    private final String validity;

    public GetClPojo(String address, String cl_No, String cl_Status, String dob, String erormsg, int i, String father_Name, String issuing_authority, String mobile_No, String name, String old_CL_No, String photo, String signature, String state, String validity) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(cl_No, "cl_No");
        Intrinsics.checkNotNullParameter(cl_Status, "cl_Status");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(erormsg, "erormsg");
        Intrinsics.checkNotNullParameter(father_Name, "father_Name");
        Intrinsics.checkNotNullParameter(issuing_authority, "issuing_authority");
        Intrinsics.checkNotNullParameter(mobile_No, "mobile_No");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(old_CL_No, "old_CL_No");
        Intrinsics.checkNotNullParameter(photo, "photo");
        Intrinsics.checkNotNullParameter(signature, "signature");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(validity, "validity");
        this.address = address;
        this.cl_No = cl_No;
        this.cl_Status = cl_Status;
        this.dob = dob;
        this.erormsg = erormsg;
        this.errorcd = i;
        this.father_Name = father_Name;
        this.issuing_authority = issuing_authority;
        this.mobile_No = mobile_No;
        this.name = name;
        this.old_CL_No = old_CL_No;
        this.photo = photo;
        this.signature = signature;
        this.state = state;
        this.validity = validity;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getOld_CL_No() {
        return this.old_CL_No;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getPhoto() {
        return this.photo;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getSignature() {
        return this.signature;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getValidity() {
        return this.validity;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCl_No() {
        return this.cl_No;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCl_Status() {
        return this.cl_Status;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDob() {
        return this.dob;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getErormsg() {
        return this.erormsg;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getErrorcd() {
        return this.errorcd;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getFather_Name() {
        return this.father_Name;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getIssuing_authority() {
        return this.issuing_authority;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getMobile_No() {
        return this.mobile_No;
    }

    public final GetClPojo copy(String address, String cl_No, String cl_Status, String dob, String erormsg, int errorcd, String father_Name, String issuing_authority, String mobile_No, String name, String old_CL_No, String photo, String signature, String state, String validity) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(cl_No, "cl_No");
        Intrinsics.checkNotNullParameter(cl_Status, "cl_Status");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(erormsg, "erormsg");
        Intrinsics.checkNotNullParameter(father_Name, "father_Name");
        Intrinsics.checkNotNullParameter(issuing_authority, "issuing_authority");
        Intrinsics.checkNotNullParameter(mobile_No, "mobile_No");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(old_CL_No, "old_CL_No");
        Intrinsics.checkNotNullParameter(photo, "photo");
        Intrinsics.checkNotNullParameter(signature, "signature");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(validity, "validity");
        return new GetClPojo(address, cl_No, cl_Status, dob, erormsg, errorcd, father_Name, issuing_authority, mobile_No, name, old_CL_No, photo, signature, state, validity);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetClPojo)) {
            return false;
        }
        GetClPojo getClPojo = (GetClPojo) other;
        return Intrinsics.areEqual(this.address, getClPojo.address) && Intrinsics.areEqual(this.cl_No, getClPojo.cl_No) && Intrinsics.areEqual(this.cl_Status, getClPojo.cl_Status) && Intrinsics.areEqual(this.dob, getClPojo.dob) && Intrinsics.areEqual(this.erormsg, getClPojo.erormsg) && this.errorcd == getClPojo.errorcd && Intrinsics.areEqual(this.father_Name, getClPojo.father_Name) && Intrinsics.areEqual(this.issuing_authority, getClPojo.issuing_authority) && Intrinsics.areEqual(this.mobile_No, getClPojo.mobile_No) && Intrinsics.areEqual(this.name, getClPojo.name) && Intrinsics.areEqual(this.old_CL_No, getClPojo.old_CL_No) && Intrinsics.areEqual(this.photo, getClPojo.photo) && Intrinsics.areEqual(this.signature, getClPojo.signature) && Intrinsics.areEqual(this.state, getClPojo.state) && Intrinsics.areEqual(this.validity, getClPojo.validity);
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getCl_No() {
        return this.cl_No;
    }

    public final String getCl_Status() {
        return this.cl_Status;
    }

    public final String getDob() {
        return this.dob;
    }

    public final String getErormsg() {
        return this.erormsg;
    }

    public final int getErrorcd() {
        return this.errorcd;
    }

    public final String getFather_Name() {
        return this.father_Name;
    }

    public final String getIssuing_authority() {
        return this.issuing_authority;
    }

    public final String getMobile_No() {
        return this.mobile_No;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOld_CL_No() {
        return this.old_CL_No;
    }

    public final String getPhoto() {
        return this.photo;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final String getState() {
        return this.state;
    }

    public final String getValidity() {
        return this.validity;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((this.address.hashCode() * 31) + this.cl_No.hashCode()) * 31) + this.cl_Status.hashCode()) * 31) + this.dob.hashCode()) * 31) + this.erormsg.hashCode()) * 31) + Integer.hashCode(this.errorcd)) * 31) + this.father_Name.hashCode()) * 31) + this.issuing_authority.hashCode()) * 31) + this.mobile_No.hashCode()) * 31) + this.name.hashCode()) * 31) + this.old_CL_No.hashCode()) * 31) + this.photo.hashCode()) * 31) + this.signature.hashCode()) * 31) + this.state.hashCode()) * 31) + this.validity.hashCode();
    }

    public String toString() {
        return "GetClPojo(address=" + this.address + ", cl_No=" + this.cl_No + ", cl_Status=" + this.cl_Status + ", dob=" + this.dob + ", erormsg=" + this.erormsg + ", errorcd=" + this.errorcd + ", father_Name=" + this.father_Name + ", issuing_authority=" + this.issuing_authority + ", mobile_No=" + this.mobile_No + ", name=" + this.name + ", old_CL_No=" + this.old_CL_No + ", photo=" + this.photo + ", signature=" + this.signature + ", state=" + this.state + ", validity=" + this.validity + ')';
    }
}
