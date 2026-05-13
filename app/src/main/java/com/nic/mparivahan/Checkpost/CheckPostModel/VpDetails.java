package com.nic.mparivahan.Checkpost.CheckPostModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/nic/mparivahan/Checkpost/CheckPostModel/VpDetails;", "", "bankCode", "", "paymentMode", "(Ljava/lang/String;Ljava/lang/String;)V", "getBankCode", "()Ljava/lang/String;", "getPaymentMode", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class VpDetails {
    private final String bankCode;
    private final String paymentMode;

    public VpDetails(String bankCode, String paymentMode) {
        Intrinsics.checkNotNullParameter(bankCode, "bankCode");
        Intrinsics.checkNotNullParameter(paymentMode, "paymentMode");
        this.bankCode = bankCode;
        this.paymentMode = paymentMode;
    }

    public static /* synthetic */ VpDetails copy$default(VpDetails vpDetails, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vpDetails.bankCode;
        }
        if ((i & 2) != 0) {
            str2 = vpDetails.paymentMode;
        }
        return vpDetails.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBankCode() {
        return this.bankCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPaymentMode() {
        return this.paymentMode;
    }

    public final VpDetails copy(String bankCode, String paymentMode) {
        Intrinsics.checkNotNullParameter(bankCode, "bankCode");
        Intrinsics.checkNotNullParameter(paymentMode, "paymentMode");
        return new VpDetails(bankCode, paymentMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VpDetails)) {
            return false;
        }
        VpDetails vpDetails = (VpDetails) other;
        return Intrinsics.areEqual(this.bankCode, vpDetails.bankCode) && Intrinsics.areEqual(this.paymentMode, vpDetails.paymentMode);
    }

    public final String getBankCode() {
        return this.bankCode;
    }

    public final String getPaymentMode() {
        return this.paymentMode;
    }

    public int hashCode() {
        return (this.bankCode.hashCode() * 31) + this.paymentMode.hashCode();
    }

    public String toString() {
        return "VpDetails(bankCode=" + this.bankCode + ", paymentMode=" + this.paymentMode + ')';
    }
}
