package com.nic.mparivahan.NewDlScreen.Modal;

import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/nic/mparivahan/NewDlScreen/Modal/TransactionListModal;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "setValue", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class TransactionListModal {

    @xy5("value")
    private String value;

    public TransactionListModal() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ TransactionListModal copy$default(TransactionListModal transactionListModal, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transactionListModal.value;
        }
        return transactionListModal.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final TransactionListModal copy(String value) {
        return new TransactionListModal(value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TransactionListModal) && Intrinsics.areEqual(this.value, ((TransactionListModal) other).value);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.value;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setValue(String str) {
        this.value = str;
    }

    public String toString() {
        return "TransactionListModal(value=" + this.value + ')';
    }

    public TransactionListModal(String str) {
        this.value = str;
    }

    public /* synthetic */ TransactionListModal(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
