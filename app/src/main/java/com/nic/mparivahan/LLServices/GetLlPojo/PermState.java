package com.nic.mparivahan.LLServices.GetLlPojo;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/nic/mparivahan/LLServices/GetLlPojo/PermState;", "Ljava/io/Serializable;", "permStateCode", "", "permStateName", "(Ljava/lang/String;Ljava/lang/String;)V", "getPermStateCode", "()Ljava/lang/String;", "getPermStateName", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PermState implements Serializable {
    private final String permStateCode;
    private final String permStateName;

    public PermState(String permStateCode, String permStateName) {
        Intrinsics.checkNotNullParameter(permStateCode, "permStateCode");
        Intrinsics.checkNotNullParameter(permStateName, "permStateName");
        this.permStateCode = permStateCode;
        this.permStateName = permStateName;
    }

    public static /* synthetic */ PermState copy$default(PermState permState, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = permState.permStateCode;
        }
        if ((i & 2) != 0) {
            str2 = permState.permStateName;
        }
        return permState.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPermStateCode() {
        return this.permStateCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPermStateName() {
        return this.permStateName;
    }

    public final PermState copy(String permStateCode, String permStateName) {
        Intrinsics.checkNotNullParameter(permStateCode, "permStateCode");
        Intrinsics.checkNotNullParameter(permStateName, "permStateName");
        return new PermState(permStateCode, permStateName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PermState)) {
            return false;
        }
        PermState permState = (PermState) other;
        return Intrinsics.areEqual(this.permStateCode, permState.permStateCode) && Intrinsics.areEqual(this.permStateName, permState.permStateName);
    }

    public final String getPermStateCode() {
        return this.permStateCode;
    }

    public final String getPermStateName() {
        return this.permStateName;
    }

    public int hashCode() {
        return (this.permStateCode.hashCode() * 31) + this.permStateName.hashCode();
    }

    public String toString() {
        return "PermState(permStateCode=" + this.permStateCode + ", permStateName=" + this.permStateName + ')';
    }
}
