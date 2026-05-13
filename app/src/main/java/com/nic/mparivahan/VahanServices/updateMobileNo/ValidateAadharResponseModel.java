package com.nic.mparivahan.VahanServices.updateMobileNo;

import androidx.annotation.Keep;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/nic/mparivahan/VahanServices/updateMobileNo/ValidateAadharResponseModel;", "", "status", "", "(Z)V", "getStatus", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ValidateAadharResponseModel {
    private final boolean status;

    public ValidateAadharResponseModel(boolean z) {
        this.status = z;
    }

    public static /* synthetic */ ValidateAadharResponseModel copy$default(ValidateAadharResponseModel validateAadharResponseModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = validateAadharResponseModel.status;
        }
        return validateAadharResponseModel.copy(z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getStatus() {
        return this.status;
    }

    public final ValidateAadharResponseModel copy(boolean status) {
        return new ValidateAadharResponseModel(status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ValidateAadharResponseModel) && this.status == ((ValidateAadharResponseModel) other).status;
    }

    public final boolean getStatus() {
        return this.status;
    }

    public int hashCode() {
        boolean z = this.status;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "ValidateAadharResponseModel(status=" + this.status + ')';
    }
}
