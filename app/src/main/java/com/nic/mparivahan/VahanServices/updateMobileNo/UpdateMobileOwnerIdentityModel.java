package com.nic.mparivahan.VahanServices.updateMobileNo;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/nic/mparivahan/VahanServices/updateMobileNo/UpdateMobileOwnerIdentityModel;", "", "mobile_no", "", "email_id", "aadhar_no", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAadhar_no", "()Ljava/lang/String;", "setAadhar_no", "(Ljava/lang/String;)V", "getEmail_id", "setEmail_id", "getMobile_no", "setMobile_no", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class UpdateMobileOwnerIdentityModel {
    private String aadhar_no;
    private String email_id;
    private String mobile_no;

    public UpdateMobileOwnerIdentityModel(String mobile_no, String email_id, String aadhar_no) {
        Intrinsics.checkNotNullParameter(mobile_no, "mobile_no");
        Intrinsics.checkNotNullParameter(email_id, "email_id");
        Intrinsics.checkNotNullParameter(aadhar_no, "aadhar_no");
        this.mobile_no = mobile_no;
        this.email_id = email_id;
        this.aadhar_no = aadhar_no;
    }

    public static /* synthetic */ UpdateMobileOwnerIdentityModel copy$default(UpdateMobileOwnerIdentityModel updateMobileOwnerIdentityModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateMobileOwnerIdentityModel.mobile_no;
        }
        if ((i & 2) != 0) {
            str2 = updateMobileOwnerIdentityModel.email_id;
        }
        if ((i & 4) != 0) {
            str3 = updateMobileOwnerIdentityModel.aadhar_no;
        }
        return updateMobileOwnerIdentityModel.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMobile_no() {
        return this.mobile_no;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEmail_id() {
        return this.email_id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAadhar_no() {
        return this.aadhar_no;
    }

    public final UpdateMobileOwnerIdentityModel copy(String mobile_no, String email_id, String aadhar_no) {
        Intrinsics.checkNotNullParameter(mobile_no, "mobile_no");
        Intrinsics.checkNotNullParameter(email_id, "email_id");
        Intrinsics.checkNotNullParameter(aadhar_no, "aadhar_no");
        return new UpdateMobileOwnerIdentityModel(mobile_no, email_id, aadhar_no);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateMobileOwnerIdentityModel)) {
            return false;
        }
        UpdateMobileOwnerIdentityModel updateMobileOwnerIdentityModel = (UpdateMobileOwnerIdentityModel) other;
        return Intrinsics.areEqual(this.mobile_no, updateMobileOwnerIdentityModel.mobile_no) && Intrinsics.areEqual(this.email_id, updateMobileOwnerIdentityModel.email_id) && Intrinsics.areEqual(this.aadhar_no, updateMobileOwnerIdentityModel.aadhar_no);
    }

    public final String getAadhar_no() {
        return this.aadhar_no;
    }

    public final String getEmail_id() {
        return this.email_id;
    }

    public final String getMobile_no() {
        return this.mobile_no;
    }

    public int hashCode() {
        return (((this.mobile_no.hashCode() * 31) + this.email_id.hashCode()) * 31) + this.aadhar_no.hashCode();
    }

    public final void setAadhar_no(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_no = str;
    }

    public final void setEmail_id(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.email_id = str;
    }

    public final void setMobile_no(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mobile_no = str;
    }

    public String toString() {
        return "UpdateMobileOwnerIdentityModel(mobile_no=" + this.mobile_no + ", email_id=" + this.email_id + ", aadhar_no=" + this.aadhar_no + ')';
    }
}
