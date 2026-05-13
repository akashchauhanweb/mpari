package com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanMultiService/BeforePaymentModel/VaSplPassengerdto;", "Ljava/io/Serializable;", "passengerAddress", "", "passengerAge", "", "passengerGender", "passengerName", "serialNo", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V", "getPassengerAddress", "()Ljava/lang/String;", "getPassengerAge", "()I", "getPassengerGender", "getPassengerName", "getSerialNo", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class VaSplPassengerdto implements Serializable {
    private final String passengerAddress;
    private final int passengerAge;
    private final String passengerGender;
    private final String passengerName;
    private final int serialNo;

    public VaSplPassengerdto(String passengerAddress, int i, String passengerGender, String passengerName, int i2) {
        Intrinsics.checkNotNullParameter(passengerAddress, "passengerAddress");
        Intrinsics.checkNotNullParameter(passengerGender, "passengerGender");
        Intrinsics.checkNotNullParameter(passengerName, "passengerName");
        this.passengerAddress = passengerAddress;
        this.passengerAge = i;
        this.passengerGender = passengerGender;
        this.passengerName = passengerName;
        this.serialNo = i2;
    }

    public static /* synthetic */ VaSplPassengerdto copy$default(VaSplPassengerdto vaSplPassengerdto, String str, int i, String str2, String str3, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = vaSplPassengerdto.passengerAddress;
        }
        if ((i3 & 2) != 0) {
            i = vaSplPassengerdto.passengerAge;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            str2 = vaSplPassengerdto.passengerGender;
        }
        String str4 = str2;
        if ((i3 & 8) != 0) {
            str3 = vaSplPassengerdto.passengerName;
        }
        String str5 = str3;
        if ((i3 & 16) != 0) {
            i2 = vaSplPassengerdto.serialNo;
        }
        return vaSplPassengerdto.copy(str, i4, str4, str5, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPassengerAddress() {
        return this.passengerAddress;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPassengerAge() {
        return this.passengerAge;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPassengerGender() {
        return this.passengerGender;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPassengerName() {
        return this.passengerName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getSerialNo() {
        return this.serialNo;
    }

    public final VaSplPassengerdto copy(String passengerAddress, int passengerAge, String passengerGender, String passengerName, int serialNo) {
        Intrinsics.checkNotNullParameter(passengerAddress, "passengerAddress");
        Intrinsics.checkNotNullParameter(passengerGender, "passengerGender");
        Intrinsics.checkNotNullParameter(passengerName, "passengerName");
        return new VaSplPassengerdto(passengerAddress, passengerAge, passengerGender, passengerName, serialNo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VaSplPassengerdto)) {
            return false;
        }
        VaSplPassengerdto vaSplPassengerdto = (VaSplPassengerdto) other;
        return Intrinsics.areEqual(this.passengerAddress, vaSplPassengerdto.passengerAddress) && this.passengerAge == vaSplPassengerdto.passengerAge && Intrinsics.areEqual(this.passengerGender, vaSplPassengerdto.passengerGender) && Intrinsics.areEqual(this.passengerName, vaSplPassengerdto.passengerName) && this.serialNo == vaSplPassengerdto.serialNo;
    }

    public final String getPassengerAddress() {
        return this.passengerAddress;
    }

    public final int getPassengerAge() {
        return this.passengerAge;
    }

    public final String getPassengerGender() {
        return this.passengerGender;
    }

    public final String getPassengerName() {
        return this.passengerName;
    }

    public final int getSerialNo() {
        return this.serialNo;
    }

    public int hashCode() {
        return (((((((this.passengerAddress.hashCode() * 31) + Integer.hashCode(this.passengerAge)) * 31) + this.passengerGender.hashCode()) * 31) + this.passengerName.hashCode()) * 31) + Integer.hashCode(this.serialNo);
    }

    public String toString() {
        return "VaSplPassengerdto(passengerAddress=" + this.passengerAddress + ", passengerAge=" + this.passengerAge + ", passengerGender=" + this.passengerGender + ", passengerName=" + this.passengerName + ", serialNo=" + this.serialNo + ')';
    }
}
