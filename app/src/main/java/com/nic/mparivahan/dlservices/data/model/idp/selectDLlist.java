package com.nic.mparivahan.dlservices.data.model.idp;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/idp/selectDLlist;", "", "525", "", "(Ljava/lang/String;)V", "get525", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class selectDLlist {
    private final String 525;

    public selectDLlist() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ selectDLlist copy$default(selectDLlist selectdllist, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = selectdllist.525;
        }
        return selectdllist.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String get525() {
        return this.525;
    }

    public final selectDLlist copy(String str) {
        Intrinsics.checkNotNullParameter(str, "525");
        return new selectDLlist(str);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof selectDLlist) && Intrinsics.areEqual(this.525, ((selectDLlist) other).525);
    }

    public final String get525() {
        return this.525;
    }

    public int hashCode() {
        return this.525.hashCode();
    }

    public String toString() {
        return "selectDLlist(525=" + this.525 + ')';
    }

    public selectDLlist(String str) {
        Intrinsics.checkNotNullParameter(str, "525");
        this.525 = str;
    }

    public /* synthetic */ selectDLlist(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "ISSUE International Driving Permit" : str);
    }
}
