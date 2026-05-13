package com.nic.mparivahan.Sarathithreeservices.model.app_status;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/nic/mparivahan/Sarathithreeservices/model/app_status/PendingAt;", "", "counter", "", "pending_at", "transaction", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCounter", "()Ljava/lang/String;", "getPending_at", "getTransaction", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PendingAt {
    private final String counter;
    private final String pending_at;
    private final String transaction;

    public PendingAt(String counter, String pending_at, String transaction) {
        Intrinsics.checkNotNullParameter(counter, "counter");
        Intrinsics.checkNotNullParameter(pending_at, "pending_at");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.counter = counter;
        this.pending_at = pending_at;
        this.transaction = transaction;
    }

    public static /* synthetic */ PendingAt copy$default(PendingAt pendingAt, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pendingAt.counter;
        }
        if ((i & 2) != 0) {
            str2 = pendingAt.pending_at;
        }
        if ((i & 4) != 0) {
            str3 = pendingAt.transaction;
        }
        return pendingAt.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCounter() {
        return this.counter;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPending_at() {
        return this.pending_at;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTransaction() {
        return this.transaction;
    }

    public final PendingAt copy(String counter, String pending_at, String transaction) {
        Intrinsics.checkNotNullParameter(counter, "counter");
        Intrinsics.checkNotNullParameter(pending_at, "pending_at");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return new PendingAt(counter, pending_at, transaction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PendingAt)) {
            return false;
        }
        PendingAt pendingAt = (PendingAt) other;
        return Intrinsics.areEqual(this.counter, pendingAt.counter) && Intrinsics.areEqual(this.pending_at, pendingAt.pending_at) && Intrinsics.areEqual(this.transaction, pendingAt.transaction);
    }

    public final String getCounter() {
        return this.counter;
    }

    public final String getPending_at() {
        return this.pending_at;
    }

    public final String getTransaction() {
        return this.transaction;
    }

    public int hashCode() {
        return (((this.counter.hashCode() * 31) + this.pending_at.hashCode()) * 31) + this.transaction.hashCode();
    }

    public String toString() {
        return "PendingAt(counter=" + this.counter + ", pending_at=" + this.pending_at + ", transaction=" + this.transaction + ')';
    }
}
