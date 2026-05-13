package com.nic.mparivahan.Echallan.Echallan.Model;

import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/nic/mparivahan/Echallan/Echallan/Model/PaymentEtransPgi;", "", "status", "", "type", "", "vurl", "venData", "message", "reason", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getReason", "getStatus", "()I", "getType", "getVenData", "getVurl", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PaymentEtransPgi {

    @xy5("message")
    private final String message;

    @xy5("reason")
    private final String reason;

    @xy5("status")
    private final int status;

    @xy5("type")
    private final String type;

    @xy5("venData")
    private final String venData;

    @xy5("vurl")
    private final String vurl;

    public PaymentEtransPgi(int i, String type, String vurl, String venData, String message, String reason) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(vurl, "vurl");
        Intrinsics.checkNotNullParameter(venData, "venData");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.status = i;
        this.type = type;
        this.vurl = vurl;
        this.venData = venData;
        this.message = message;
        this.reason = reason;
    }

    public static /* synthetic */ PaymentEtransPgi copy$default(PaymentEtransPgi paymentEtransPgi, int i, String str, String str2, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = paymentEtransPgi.status;
        }
        if ((i2 & 2) != 0) {
            str = paymentEtransPgi.type;
        }
        String str6 = str;
        if ((i2 & 4) != 0) {
            str2 = paymentEtransPgi.vurl;
        }
        String str7 = str2;
        if ((i2 & 8) != 0) {
            str3 = paymentEtransPgi.venData;
        }
        String str8 = str3;
        if ((i2 & 16) != 0) {
            str4 = paymentEtransPgi.message;
        }
        String str9 = str4;
        if ((i2 & 32) != 0) {
            str5 = paymentEtransPgi.reason;
        }
        return paymentEtransPgi.copy(i, str6, str7, str8, str9, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getVurl() {
        return this.vurl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getVenData() {
        return this.venData;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    public final PaymentEtransPgi copy(int status, String type, String vurl, String venData, String message, String reason) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(vurl, "vurl");
        Intrinsics.checkNotNullParameter(venData, "venData");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(reason, "reason");
        return new PaymentEtransPgi(status, type, vurl, venData, message, reason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentEtransPgi)) {
            return false;
        }
        PaymentEtransPgi paymentEtransPgi = (PaymentEtransPgi) other;
        return this.status == paymentEtransPgi.status && Intrinsics.areEqual(this.type, paymentEtransPgi.type) && Intrinsics.areEqual(this.vurl, paymentEtransPgi.vurl) && Intrinsics.areEqual(this.venData, paymentEtransPgi.venData) && Intrinsics.areEqual(this.message, paymentEtransPgi.message) && Intrinsics.areEqual(this.reason, paymentEtransPgi.reason);
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getReason() {
        return this.reason;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getType() {
        return this.type;
    }

    public final String getVenData() {
        return this.venData;
    }

    public final String getVurl() {
        return this.vurl;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.status) * 31) + this.type.hashCode()) * 31) + this.vurl.hashCode()) * 31) + this.venData.hashCode()) * 31) + this.message.hashCode()) * 31) + this.reason.hashCode();
    }

    public String toString() {
        return "PaymentEtransPgi(status=" + this.status + ", type=" + this.type + ", vurl=" + this.vurl + ", venData=" + this.venData + ", message=" + this.message + ", reason=" + this.reason + ')';
    }

    public /* synthetic */ PaymentEtransPgi(int i, String str, String str2, String str3, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) == 0 ? str5 : "");
    }
}
