package com.nic.mparivahan.Citizen.Models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/nic/mparivahan/Citizen/Models/Name;", "", "name", "", "stateCode", "isSentinal", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "()Z", "getName", "()Ljava/lang/String;", "getStateCode", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Name {
    private final boolean isSentinal;
    private final String name;
    private final String stateCode;

    public Name(String name, String stateCode, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(stateCode, "stateCode");
        this.name = name;
        this.stateCode = stateCode;
        this.isSentinal = z;
    }

    public static /* synthetic */ Name copy$default(Name name, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = name.name;
        }
        if ((i & 2) != 0) {
            str2 = name.stateCode;
        }
        if ((i & 4) != 0) {
            z = name.isSentinal;
        }
        return name.copy(str, str2, z);
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

    public final Name copy(String name, String stateCode, boolean isSentinal) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(stateCode, "stateCode");
        return new Name(name, stateCode, isSentinal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Name)) {
            return false;
        }
        Name name = (Name) other;
        return Intrinsics.areEqual(this.name, name.name) && Intrinsics.areEqual(this.stateCode, name.stateCode) && this.isSentinal == name.isSentinal;
    }

    public final String getName() {
        return this.name;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public int hashCode() {
        int iHashCode = ((this.name.hashCode() * 31) + this.stateCode.hashCode()) * 31;
        boolean z = this.isSentinal;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final boolean isSentinal() {
        return this.isSentinal;
    }

    public String toString() {
        return "Name(name=" + this.name + ", stateCode=" + this.stateCode + ", isSentinal=" + this.isSentinal + ')';
    }
}
