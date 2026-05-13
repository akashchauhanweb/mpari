package com.nic.mparivahan.Tax.Model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0002\u0010\bR\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/nic/mparivahan/Tax/Model/Latestpaytaxdetails;", "", "tax_from", "tax_mode", "", "tax_upto", "tax_amt", "rcpt_dt", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V", "getRcpt_dt", "()Ljava/lang/String;", "getTax_amt", "()Ljava/lang/Object;", "getTax_from", "getTax_mode", "getTax_upto", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Latestpaytaxdetails {
    private final String rcpt_dt;
    private final Object tax_amt;
    private final Object tax_from;
    private final String tax_mode;
    private final Object tax_upto;

    public Latestpaytaxdetails(Object obj, String str, Object obj2, Object obj3, String rcpt_dt) {
        Intrinsics.checkNotNullParameter(rcpt_dt, "rcpt_dt");
        this.tax_from = obj;
        this.tax_mode = str;
        this.tax_upto = obj2;
        this.tax_amt = obj3;
        this.rcpt_dt = rcpt_dt;
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
}
