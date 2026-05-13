package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003JC\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/Latesttaxdetails;", "Ljava/io/Serializable;", "tax_from", "", "tax_mode", "", "tax_upto", "rcpt_dt", "tax_amt", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V", "getRcpt_dt", "()Ljava/lang/String;", "getTax_amt", "()Ljava/lang/Object;", "getTax_from", "getTax_mode", "getTax_upto", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Latesttaxdetails implements Serializable {
    private final String rcpt_dt;
    private final Object tax_amt;
    private final Object tax_from;
    private final String tax_mode;
    private final Object tax_upto;

    public Latesttaxdetails(Object obj, String str, Object obj2, String rcpt_dt, Object obj3) {
        Intrinsics.checkNotNullParameter(rcpt_dt, "rcpt_dt");
        this.tax_from = obj;
        this.tax_mode = str;
        this.tax_upto = obj2;
        this.rcpt_dt = rcpt_dt;
        this.tax_amt = obj3;
    }

    public static /* synthetic */ Latesttaxdetails copy$default(Latesttaxdetails latesttaxdetails, Object obj, String str, Object obj2, String str2, Object obj3, int i, Object obj4) {
        if ((i & 1) != 0) {
            obj = latesttaxdetails.tax_from;
        }
        if ((i & 2) != 0) {
            str = latesttaxdetails.tax_mode;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            obj2 = latesttaxdetails.tax_upto;
        }
        Object obj5 = obj2;
        if ((i & 8) != 0) {
            str2 = latesttaxdetails.rcpt_dt;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            obj3 = latesttaxdetails.tax_amt;
        }
        return latesttaxdetails.copy(obj, str3, obj5, str4, obj3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Object getTax_from() {
        return this.tax_from;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTax_mode() {
        return this.tax_mode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Object getTax_upto() {
        return this.tax_upto;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRcpt_dt() {
        return this.rcpt_dt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Object getTax_amt() {
        return this.tax_amt;
    }

    public final Latesttaxdetails copy(Object tax_from, String tax_mode, Object tax_upto, String rcpt_dt, Object tax_amt) {
        Intrinsics.checkNotNullParameter(rcpt_dt, "rcpt_dt");
        return new Latesttaxdetails(tax_from, tax_mode, tax_upto, rcpt_dt, tax_amt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Latesttaxdetails)) {
            return false;
        }
        Latesttaxdetails latesttaxdetails = (Latesttaxdetails) other;
        return Intrinsics.areEqual(this.tax_from, latesttaxdetails.tax_from) && Intrinsics.areEqual(this.tax_mode, latesttaxdetails.tax_mode) && Intrinsics.areEqual(this.tax_upto, latesttaxdetails.tax_upto) && Intrinsics.areEqual(this.rcpt_dt, latesttaxdetails.rcpt_dt) && Intrinsics.areEqual(this.tax_amt, latesttaxdetails.tax_amt);
    }

    public final String getRcpt_dt() {
        return this.rcpt_dt;
    }

    public final Object getTax_amt() {
        return this.tax_amt;
    }

    public final Object getTax_from() {
        return this.tax_from;
    }

    public final String getTax_mode() {
        return this.tax_mode;
    }

    public final Object getTax_upto() {
        return this.tax_upto;
    }

    public int hashCode() {
        Object obj = this.tax_from;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        String str = this.tax_mode;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Object obj2 = this.tax_upto;
        int iHashCode3 = (((iHashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31) + this.rcpt_dt.hashCode()) * 31;
        Object obj3 = this.tax_amt;
        return iHashCode3 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public String toString() {
        return "Latesttaxdetails(tax_from=" + this.tax_from + ", tax_mode=" + this.tax_mode + ", tax_upto=" + this.tax_upto + ", rcpt_dt=" + this.rcpt_dt + ", tax_amt=" + this.tax_amt + ')';
    }
}
