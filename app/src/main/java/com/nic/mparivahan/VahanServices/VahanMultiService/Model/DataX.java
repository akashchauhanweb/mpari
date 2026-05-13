package com.nic.mparivahan.VahanServices.VahanMultiService.Model;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DataX;", "Ljava/io/Serializable;", "aadharAuth", "", "mobileAuth", "(Ljava/lang/String;Ljava/lang/String;)V", "getAadharAuth", "()Ljava/lang/String;", "getMobileAuth", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DataX implements Serializable {
    private final String aadharAuth;
    private final String mobileAuth;

    public DataX(String str, String str2) {
        this.aadharAuth = str;
        this.mobileAuth = str2;
    }

    public static /* synthetic */ DataX copy$default(DataX dataX, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dataX.aadharAuth;
        }
        if ((i & 2) != 0) {
            str2 = dataX.mobileAuth;
        }
        return dataX.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAadharAuth() {
        return this.aadharAuth;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMobileAuth() {
        return this.mobileAuth;
    }

    public final DataX copy(String aadharAuth, String mobileAuth) {
        return new DataX(aadharAuth, mobileAuth);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataX)) {
            return false;
        }
        DataX dataX = (DataX) other;
        return Intrinsics.areEqual(this.aadharAuth, dataX.aadharAuth) && Intrinsics.areEqual(this.mobileAuth, dataX.mobileAuth);
    }

    public final String getAadharAuth() {
        return this.aadharAuth;
    }

    public final String getMobileAuth() {
        return this.mobileAuth;
    }

    public int hashCode() {
        String str = this.aadharAuth;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.mobileAuth;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "DataX(aadharAuth=" + this.aadharAuth + ", mobileAuth=" + this.mobileAuth + ')';
    }
}
