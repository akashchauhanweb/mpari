package com.nic.mparivahan.DLServicesAuth.Model.SarathiCurrentState;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/nic/mparivahan/DLServicesAuth/Model/SarathiCurrentState/CurrentStateSarathi;", "", "states", "", "Lcom/nic/mparivahan/DLServicesAuth/Model/SarathiCurrentState/State;", "statusCode", "", "statusDesc", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getStates", "()Ljava/util/List;", "getStatusCode", "()Ljava/lang/String;", "getStatusDesc", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CurrentStateSarathi {
    private final List<State> states;
    private final String statusCode;
    private final String statusDesc;

    public CurrentStateSarathi(List<State> states, String statusCode, String statusDesc) {
        Intrinsics.checkNotNullParameter(states, "states");
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        this.states = states;
        this.statusCode = statusCode;
        this.statusDesc = statusDesc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CurrentStateSarathi copy$default(CurrentStateSarathi currentStateSarathi, List list, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = currentStateSarathi.states;
        }
        if ((i & 2) != 0) {
            str = currentStateSarathi.statusCode;
        }
        if ((i & 4) != 0) {
            str2 = currentStateSarathi.statusDesc;
        }
        return currentStateSarathi.copy(list, str, str2);
    }

    public final List<State> component1() {
        return this.states;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatusCode() {
        return this.statusCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final CurrentStateSarathi copy(List<State> states, String statusCode, String statusDesc) {
        Intrinsics.checkNotNullParameter(states, "states");
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        return new CurrentStateSarathi(states, statusCode, statusDesc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrentStateSarathi)) {
            return false;
        }
        CurrentStateSarathi currentStateSarathi = (CurrentStateSarathi) other;
        return Intrinsics.areEqual(this.states, currentStateSarathi.states) && Intrinsics.areEqual(this.statusCode, currentStateSarathi.statusCode) && Intrinsics.areEqual(this.statusDesc, currentStateSarathi.statusDesc);
    }

    public final List<State> getStates() {
        return this.states;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (((this.states.hashCode() * 31) + this.statusCode.hashCode()) * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "CurrentStateSarathi(states=" + this.states + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
