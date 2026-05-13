package com.nic.mparivahan.Account.Model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/nic/mparivahan/Account/Model/UserLoginModel;", "", "statusCode", "", "statusDesc", "token", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getStatusCode", "()Ljava/lang/String;", "getStatusDesc", "getToken", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class UserLoginModel {
    private final String statusCode;
    private final String statusDesc;
    private final String token;

    public UserLoginModel(String str, String str2, String str3) {
        this.statusCode = str;
        this.statusDesc = str2;
        this.token = str3;
    }

    public static /* synthetic */ UserLoginModel copy$default(UserLoginModel userLoginModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userLoginModel.statusCode;
        }
        if ((i & 2) != 0) {
            str2 = userLoginModel.statusDesc;
        }
        if ((i & 4) != 0) {
            str3 = userLoginModel.token;
        }
        return userLoginModel.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatusCode() {
        return this.statusCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatusDesc() {
        return this.statusDesc;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    public final UserLoginModel copy(String statusCode, String statusDesc, String token) {
        return new UserLoginModel(statusCode, statusDesc, token);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserLoginModel)) {
            return false;
        }
        UserLoginModel userLoginModel = (UserLoginModel) other;
        return Intrinsics.areEqual(this.statusCode, userLoginModel.statusCode) && Intrinsics.areEqual(this.statusDesc, userLoginModel.statusDesc) && Intrinsics.areEqual(this.token, userLoginModel.token);
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        String str = this.statusCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.statusDesc;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.token;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "UserLoginModel(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ", token=" + this.token + ')';
    }
}
