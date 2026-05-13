package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003JV\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006!"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/ValidateChassinoRes;", "", "c_pincode", "", "c_state", "", "c_state_name", "chasi_no", "errorcode", "errorDesc", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getC_pincode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getC_state", "()Ljava/lang/String;", "getC_state_name", "getChasi_no", "getErrorDesc", "getErrorcode", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/nic/mparivahan/VahanServices/VahanModel/ValidateChassinoRes;", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ValidateChassinoRes {
    private final Integer c_pincode;
    private final String c_state;
    private final String c_state_name;
    private final String chasi_no;
    private final String errorDesc;
    private final String errorcode;

    public ValidateChassinoRes(Integer num, String str, String str2, String str3, String str4, String str5) {
        this.c_pincode = num;
        this.c_state = str;
        this.c_state_name = str2;
        this.chasi_no = str3;
        this.errorcode = str4;
        this.errorDesc = str5;
    }

    public static /* synthetic */ ValidateChassinoRes copy$default(ValidateChassinoRes validateChassinoRes, Integer num, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            num = validateChassinoRes.c_pincode;
        }
        if ((i & 2) != 0) {
            str = validateChassinoRes.c_state;
        }
        String str6 = str;
        if ((i & 4) != 0) {
            str2 = validateChassinoRes.c_state_name;
        }
        String str7 = str2;
        if ((i & 8) != 0) {
            str3 = validateChassinoRes.chasi_no;
        }
        String str8 = str3;
        if ((i & 16) != 0) {
            str4 = validateChassinoRes.errorcode;
        }
        String str9 = str4;
        if ((i & 32) != 0) {
            str5 = validateChassinoRes.errorDesc;
        }
        return validateChassinoRes.copy(num, str6, str7, str8, str9, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getC_pincode() {
        return this.c_pincode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getC_state() {
        return this.c_state;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getC_state_name() {
        return this.c_state_name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getChasi_no() {
        return this.chasi_no;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getErrorcode() {
        return this.errorcode;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getErrorDesc() {
        return this.errorDesc;
    }

    public final ValidateChassinoRes copy(Integer c_pincode, String c_state, String c_state_name, String chasi_no, String errorcode, String errorDesc) {
        return new ValidateChassinoRes(c_pincode, c_state, c_state_name, chasi_no, errorcode, errorDesc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ValidateChassinoRes)) {
            return false;
        }
        ValidateChassinoRes validateChassinoRes = (ValidateChassinoRes) other;
        return Intrinsics.areEqual(this.c_pincode, validateChassinoRes.c_pincode) && Intrinsics.areEqual(this.c_state, validateChassinoRes.c_state) && Intrinsics.areEqual(this.c_state_name, validateChassinoRes.c_state_name) && Intrinsics.areEqual(this.chasi_no, validateChassinoRes.chasi_no) && Intrinsics.areEqual(this.errorcode, validateChassinoRes.errorcode) && Intrinsics.areEqual(this.errorDesc, validateChassinoRes.errorDesc);
    }

    public final Integer getC_pincode() {
        return this.c_pincode;
    }

    public final String getC_state() {
        return this.c_state;
    }

    public final String getC_state_name() {
        return this.c_state_name;
    }

    public final String getChasi_no() {
        return this.chasi_no;
    }

    public final String getErrorDesc() {
        return this.errorDesc;
    }

    public final String getErrorcode() {
        return this.errorcode;
    }

    public int hashCode() {
        Integer num = this.c_pincode;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.c_state;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c_state_name;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.chasi_no;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.errorcode;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.errorDesc;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "ValidateChassinoRes(c_pincode=" + this.c_pincode + ", c_state=" + this.c_state + ", c_state_name=" + this.c_state_name + ", chasi_no=" + this.chasi_no + ", errorcode=" + this.errorcode + ", errorDesc=" + this.errorDesc + ')';
    }
}
