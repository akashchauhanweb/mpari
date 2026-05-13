package com.nic.mparivahan.Account.Model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0011\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0000H\u0096\u0002J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\tHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000bR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/nic/mparivahan/Account/Model/State;", "", "name", "", "stateCode", "isSentinal", "", "isAndroid", "isNgmp", "", "(Ljava/lang/String;Ljava/lang/String;ZZI)V", "()Z", "()I", "getName", "()Ljava/lang/String;", "getStateCode", "compareTo", "other", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class State implements Comparable<State> {
    private final boolean isAndroid;
    private final int isNgmp;
    private final boolean isSentinal;
    private final String name;
    private final String stateCode;

    public State(String name, String stateCode, boolean z, boolean z2, int i) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(stateCode, "stateCode");
        this.name = name;
        this.stateCode = stateCode;
        this.isSentinal = z;
        this.isAndroid = z2;
        this.isNgmp = i;
    }

    public static /* synthetic */ State copy$default(State state, String str, String str2, boolean z, boolean z2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = state.name;
        }
        if ((i2 & 2) != 0) {
            str2 = state.stateCode;
        }
        String str3 = str2;
        if ((i2 & 4) != 0) {
            z = state.isSentinal;
        }
        boolean z3 = z;
        if ((i2 & 8) != 0) {
            z2 = state.isAndroid;
        }
        boolean z4 = z2;
        if ((i2 & 16) != 0) {
            i = state.isNgmp;
        }
        return state.copy(str, str3, z3, z4, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStateCode() {
        return this.stateCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsSentinal() {
        return this.isSentinal;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsAndroid() {
        return this.isAndroid;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getIsNgmp() {
        return this.isNgmp;
    }

    public final State copy(String name, String stateCode, boolean isSentinal, boolean isAndroid, int isNgmp) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(stateCode, "stateCode");
        return new State(name, stateCode, isSentinal, isAndroid, isNgmp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return Intrinsics.areEqual(this.name, state.name) && Intrinsics.areEqual(this.stateCode, state.stateCode) && this.isSentinal == state.isSentinal && this.isAndroid == state.isAndroid && this.isNgmp == state.isNgmp;
    }

    public final String getName() {
        return this.name;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((this.name.hashCode() * 31) + this.stateCode.hashCode()) * 31;
        boolean z = this.isSentinal;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.isAndroid;
        return ((i + (z2 ? 1 : z2)) * 31) + Integer.hashCode(this.isNgmp);
    }

    public final boolean isAndroid() {
        return this.isAndroid;
    }

    public final int isNgmp() {
        return this.isNgmp;
    }

    public final boolean isSentinal() {
        return this.isSentinal;
    }

    public String toString() {
        return "State(name=" + this.name + ", stateCode=" + this.stateCode + ", isSentinal=" + this.isSentinal + ", isAndroid=" + this.isAndroid + ", isNgmp=" + this.isNgmp + ')';
    }

    @Override // java.lang.Comparable
    public int compareTo(State other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.name.compareTo(other.name);
    }
}
