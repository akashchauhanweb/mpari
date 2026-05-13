package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/StateMasterItem;", "", "stateName", "", "stateCode", "(Ljava/lang/String;Ljava/lang/String;)V", "getStateCode", "()Ljava/lang/String;", "getStateName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class StateMasterItem {

    @xy5("state_code")
    private final String stateCode;

    @xy5("state_name")
    private final String stateName;

    public StateMasterItem() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ StateMasterItem copy$default(StateMasterItem stateMasterItem, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stateMasterItem.stateName;
        }
        if ((i & 2) != 0) {
            str2 = stateMasterItem.stateCode;
        }
        return stateMasterItem.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStateName() {
        return this.stateName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStateCode() {
        return this.stateCode;
    }

    public final StateMasterItem copy(String stateName, String stateCode) {
        return new StateMasterItem(stateName, stateCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StateMasterItem)) {
            return false;
        }
        StateMasterItem stateMasterItem = (StateMasterItem) other;
        return Intrinsics.areEqual(this.stateName, stateMasterItem.stateName) && Intrinsics.areEqual(this.stateCode, stateMasterItem.stateCode);
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public final String getStateName() {
        return this.stateName;
    }

    public int hashCode() {
        String str = this.stateName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.stateCode;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "StateMasterItem(stateName=" + this.stateName + ", stateCode=" + this.stateCode + ')';
    }

    public StateMasterItem(String str, String str2) {
        this.stateName = str;
        this.stateCode = str2;
    }

    public /* synthetic */ StateMasterItem(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
