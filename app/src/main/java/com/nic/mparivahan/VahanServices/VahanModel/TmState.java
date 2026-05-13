package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/TmState;", "", "descr", "", "state_code", "(Ljava/lang/String;Ljava/lang/String;)V", "getDescr", "()Ljava/lang/String;", "getState_code", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class TmState {
    private final String descr;
    private final String state_code;

    public TmState(String descr, String state_code) {
        Intrinsics.checkNotNullParameter(descr, "descr");
        Intrinsics.checkNotNullParameter(state_code, "state_code");
        this.descr = descr;
        this.state_code = state_code;
    }

    public static /* synthetic */ TmState copy$default(TmState tmState, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tmState.descr;
        }
        if ((i & 2) != 0) {
            str2 = tmState.state_code;
        }
        return tmState.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDescr() {
        return this.descr;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getState_code() {
        return this.state_code;
    }

    public final TmState copy(String descr, String state_code) {
        Intrinsics.checkNotNullParameter(descr, "descr");
        Intrinsics.checkNotNullParameter(state_code, "state_code");
        return new TmState(descr, state_code);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TmState)) {
            return false;
        }
        TmState tmState = (TmState) other;
        return Intrinsics.areEqual(this.descr, tmState.descr) && Intrinsics.areEqual(this.state_code, tmState.state_code);
    }

    public final String getDescr() {
        return this.descr;
    }

    public final String getState_code() {
        return this.state_code;
    }

    public int hashCode() {
        return (this.descr.hashCode() * 31) + this.state_code.hashCode();
    }

    public String toString() {
        return "TmState(descr=" + this.descr + ", state_code=" + this.state_code + ')';
    }
}
