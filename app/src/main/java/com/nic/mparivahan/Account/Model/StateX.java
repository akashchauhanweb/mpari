package com.nic.mparivahan.Account.Model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0001HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JY\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006%"}, d2 = {"Lcom/nic/mparivahan/Account/Model/StateX;", "", "egovCode", "", "id", "isActive", "logo", "name", "", "s4Enabled", "stateCode", "v4Enabled", "(IIILjava/lang/Object;Ljava/lang/String;ILjava/lang/String;I)V", "getEgovCode", "()I", "getId", "getLogo", "()Ljava/lang/Object;", "getName", "()Ljava/lang/String;", "getS4Enabled", "getStateCode", "getV4Enabled", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class StateX {
    private final int egovCode;
    private final int id;
    private final int isActive;
    private final Object logo;
    private final String name;
    private final int s4Enabled;
    private final String stateCode;
    private final int v4Enabled;

    public StateX(int i, int i2, int i3, Object logo, String name, int i4, String stateCode, int i5) {
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(stateCode, "stateCode");
        this.egovCode = i;
        this.id = i2;
        this.isActive = i3;
        this.logo = logo;
        this.name = name;
        this.s4Enabled = i4;
        this.stateCode = stateCode;
        this.v4Enabled = i5;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getEgovCode() {
        return this.egovCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getIsActive() {
        return this.isActive;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Object getLogo() {
        return this.logo;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getS4Enabled() {
        return this.s4Enabled;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getStateCode() {
        return this.stateCode;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getV4Enabled() {
        return this.v4Enabled;
    }

    public final StateX copy(int egovCode, int id, int isActive, Object logo, String name, int s4Enabled, String stateCode, int v4Enabled) {
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(stateCode, "stateCode");
        return new StateX(egovCode, id, isActive, logo, name, s4Enabled, stateCode, v4Enabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StateX)) {
            return false;
        }
        StateX stateX = (StateX) other;
        return this.egovCode == stateX.egovCode && this.id == stateX.id && this.isActive == stateX.isActive && Intrinsics.areEqual(this.logo, stateX.logo) && Intrinsics.areEqual(this.name, stateX.name) && this.s4Enabled == stateX.s4Enabled && Intrinsics.areEqual(this.stateCode, stateX.stateCode) && this.v4Enabled == stateX.v4Enabled;
    }

    public final int getEgovCode() {
        return this.egovCode;
    }

    public final int getId() {
        return this.id;
    }

    public final Object getLogo() {
        return this.logo;
    }

    public final String getName() {
        return this.name;
    }

    public final int getS4Enabled() {
        return this.s4Enabled;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public final int getV4Enabled() {
        return this.v4Enabled;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.egovCode) * 31) + Integer.hashCode(this.id)) * 31) + Integer.hashCode(this.isActive)) * 31) + this.logo.hashCode()) * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.s4Enabled)) * 31) + this.stateCode.hashCode()) * 31) + Integer.hashCode(this.v4Enabled);
    }

    public final int isActive() {
        return this.isActive;
    }

    public String toString() {
        return "StateX(egovCode=" + this.egovCode + ", id=" + this.id + ", isActive=" + this.isActive + ", logo=" + this.logo + ", name=" + this.name + ", s4Enabled=" + this.s4Enabled + ", stateCode=" + this.stateCode + ", v4Enabled=" + this.v4Enabled + ')';
    }
}
