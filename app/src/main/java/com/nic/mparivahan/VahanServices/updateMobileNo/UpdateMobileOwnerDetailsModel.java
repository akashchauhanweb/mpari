package com.nic.mparivahan.VahanServices.updateMobileNo;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/nic/mparivahan/VahanServices/updateMobileNo/UpdateMobileOwnerDetailsModel;", "", "state_cd", "", "state_name", "regn_no", "owner_name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOwner_name", "()Ljava/lang/String;", "setOwner_name", "(Ljava/lang/String;)V", "getRegn_no", "setRegn_no", "getState_cd", "setState_cd", "getState_name", "setState_name", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class UpdateMobileOwnerDetailsModel {
    private String owner_name;
    private String regn_no;
    private String state_cd;
    private String state_name;

    public UpdateMobileOwnerDetailsModel(String state_cd, String state_name, String regn_no, String owner_name) {
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(state_name, "state_name");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(owner_name, "owner_name");
        this.state_cd = state_cd;
        this.state_name = state_name;
        this.regn_no = regn_no;
        this.owner_name = owner_name;
    }

    public static /* synthetic */ UpdateMobileOwnerDetailsModel copy$default(UpdateMobileOwnerDetailsModel updateMobileOwnerDetailsModel, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateMobileOwnerDetailsModel.state_cd;
        }
        if ((i & 2) != 0) {
            str2 = updateMobileOwnerDetailsModel.state_name;
        }
        if ((i & 4) != 0) {
            str3 = updateMobileOwnerDetailsModel.regn_no;
        }
        if ((i & 8) != 0) {
            str4 = updateMobileOwnerDetailsModel.owner_name;
        }
        return updateMobileOwnerDetailsModel.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getState_cd() {
        return this.state_cd;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getState_name() {
        return this.state_name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRegn_no() {
        return this.regn_no;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOwner_name() {
        return this.owner_name;
    }

    public final UpdateMobileOwnerDetailsModel copy(String state_cd, String state_name, String regn_no, String owner_name) {
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(state_name, "state_name");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(owner_name, "owner_name");
        return new UpdateMobileOwnerDetailsModel(state_cd, state_name, regn_no, owner_name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateMobileOwnerDetailsModel)) {
            return false;
        }
        UpdateMobileOwnerDetailsModel updateMobileOwnerDetailsModel = (UpdateMobileOwnerDetailsModel) other;
        return Intrinsics.areEqual(this.state_cd, updateMobileOwnerDetailsModel.state_cd) && Intrinsics.areEqual(this.state_name, updateMobileOwnerDetailsModel.state_name) && Intrinsics.areEqual(this.regn_no, updateMobileOwnerDetailsModel.regn_no) && Intrinsics.areEqual(this.owner_name, updateMobileOwnerDetailsModel.owner_name);
    }

    public final String getOwner_name() {
        return this.owner_name;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public final String getState_name() {
        return this.state_name;
    }

    public int hashCode() {
        return (((((this.state_cd.hashCode() * 31) + this.state_name.hashCode()) * 31) + this.regn_no.hashCode()) * 31) + this.owner_name.hashCode();
    }

    public final void setOwner_name(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.owner_name = str;
    }

    public final void setRegn_no(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.regn_no = str;
    }

    public final void setState_cd(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.state_cd = str;
    }

    public final void setState_name(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.state_name = str;
    }

    public String toString() {
        return "UpdateMobileOwnerDetailsModel(state_cd=" + this.state_cd + ", state_name=" + this.state_name + ", regn_no=" + this.regn_no + ", owner_name=" + this.owner_name + ')';
    }
}
