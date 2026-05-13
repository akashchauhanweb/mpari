package com.nic.mparivahan.VahanServices.FancyServices.AvailableFancyModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/nic/mparivahan/VahanServices/FancyServices/AvailableFancyModel/Data;", "", "booking_fee", "", "category", "", "number_type", "reg_no", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBooking_fee", "()I", "getCategory", "()Ljava/lang/String;", "getNumber_type", "getReg_no", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Data {
    private final int booking_fee;
    private final String category;
    private final String number_type;
    private final String reg_no;

    public Data(int i, String category, String number_type, String reg_no) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(number_type, "number_type");
        Intrinsics.checkNotNullParameter(reg_no, "reg_no");
        this.booking_fee = i;
        this.category = category;
        this.number_type = number_type;
        this.reg_no = reg_no;
    }

    public static /* synthetic */ Data copy$default(Data data, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = data.booking_fee;
        }
        if ((i2 & 2) != 0) {
            str = data.category;
        }
        if ((i2 & 4) != 0) {
            str2 = data.number_type;
        }
        if ((i2 & 8) != 0) {
            str3 = data.reg_no;
        }
        return data.copy(i, str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBooking_fee() {
        return this.booking_fee;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNumber_type() {
        return this.number_type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getReg_no() {
        return this.reg_no;
    }

    public final Data copy(int booking_fee, String category, String number_type, String reg_no) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(number_type, "number_type");
        Intrinsics.checkNotNullParameter(reg_no, "reg_no");
        return new Data(booking_fee, category, number_type, reg_no);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Data)) {
            return false;
        }
        Data data = (Data) other;
        return this.booking_fee == data.booking_fee && Intrinsics.areEqual(this.category, data.category) && Intrinsics.areEqual(this.number_type, data.number_type) && Intrinsics.areEqual(this.reg_no, data.reg_no);
    }

    public final int getBooking_fee() {
        return this.booking_fee;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getNumber_type() {
        return this.number_type;
    }

    public final String getReg_no() {
        return this.reg_no;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.booking_fee) * 31) + this.category.hashCode()) * 31) + this.number_type.hashCode()) * 31) + this.reg_no.hashCode();
    }

    public String toString() {
        return "Data(booking_fee=" + this.booking_fee + ", category=" + this.category + ", number_type=" + this.number_type + ", reg_no=" + this.reg_no + ')';
    }
}
