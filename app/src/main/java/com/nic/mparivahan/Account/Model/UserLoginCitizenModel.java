package com.nic.mparivahan.Account.Model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/nic/mparivahan/Account/Model/UserLoginCitizenModel;", "", "ctzRecordId", "", "ctzMobile", "", "ctzMpinStatus", "ctzToken", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCtzMobile", "()Ljava/lang/String;", "getCtzMpinStatus", "getCtzRecordId", "()J", "getCtzToken", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class UserLoginCitizenModel {
    private final String ctzMobile;
    private final String ctzMpinStatus;
    private final long ctzRecordId;
    private final String ctzToken;

    public UserLoginCitizenModel(long j, String ctzMobile, String ctzMpinStatus, String ctzToken) {
        Intrinsics.checkNotNullParameter(ctzMobile, "ctzMobile");
        Intrinsics.checkNotNullParameter(ctzMpinStatus, "ctzMpinStatus");
        Intrinsics.checkNotNullParameter(ctzToken, "ctzToken");
        this.ctzRecordId = j;
        this.ctzMobile = ctzMobile;
        this.ctzMpinStatus = ctzMpinStatus;
        this.ctzToken = ctzToken;
    }

    public static /* synthetic */ UserLoginCitizenModel copy$default(UserLoginCitizenModel userLoginCitizenModel, long j, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = userLoginCitizenModel.ctzRecordId;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = userLoginCitizenModel.ctzMobile;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = userLoginCitizenModel.ctzMpinStatus;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = userLoginCitizenModel.ctzToken;
        }
        return userLoginCitizenModel.copy(j2, str4, str5, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getCtzRecordId() {
        return this.ctzRecordId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCtzMobile() {
        return this.ctzMobile;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCtzMpinStatus() {
        return this.ctzMpinStatus;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCtzToken() {
        return this.ctzToken;
    }

    public final UserLoginCitizenModel copy(long ctzRecordId, String ctzMobile, String ctzMpinStatus, String ctzToken) {
        Intrinsics.checkNotNullParameter(ctzMobile, "ctzMobile");
        Intrinsics.checkNotNullParameter(ctzMpinStatus, "ctzMpinStatus");
        Intrinsics.checkNotNullParameter(ctzToken, "ctzToken");
        return new UserLoginCitizenModel(ctzRecordId, ctzMobile, ctzMpinStatus, ctzToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserLoginCitizenModel)) {
            return false;
        }
        UserLoginCitizenModel userLoginCitizenModel = (UserLoginCitizenModel) other;
        return this.ctzRecordId == userLoginCitizenModel.ctzRecordId && Intrinsics.areEqual(this.ctzMobile, userLoginCitizenModel.ctzMobile) && Intrinsics.areEqual(this.ctzMpinStatus, userLoginCitizenModel.ctzMpinStatus) && Intrinsics.areEqual(this.ctzToken, userLoginCitizenModel.ctzToken);
    }

    public final String getCtzMobile() {
        return this.ctzMobile;
    }

    public final String getCtzMpinStatus() {
        return this.ctzMpinStatus;
    }

    public final long getCtzRecordId() {
        return this.ctzRecordId;
    }

    public final String getCtzToken() {
        return this.ctzToken;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.ctzRecordId) * 31) + this.ctzMobile.hashCode()) * 31) + this.ctzMpinStatus.hashCode()) * 31) + this.ctzToken.hashCode();
    }

    public String toString() {
        return "UserLoginCitizenModel(ctzRecordId=" + this.ctzRecordId + ", ctzMobile=" + this.ctzMobile + ", ctzMpinStatus=" + this.ctzMpinStatus + ", ctzToken=" + this.ctzToken + ')';
    }
}
