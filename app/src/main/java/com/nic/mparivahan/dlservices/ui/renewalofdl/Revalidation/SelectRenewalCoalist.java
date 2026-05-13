package com.nic.mparivahan.dlservices.ui.renewalofdl.Revalidation;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/renewalofdl/Revalidation/SelectRenewalCoalist;", "", "537", "", "515", "(Ljava/lang/String;Ljava/lang/String;)V", "get515", "()Ljava/lang/String;", "get537", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SelectRenewalCoalist {
    private final String 515;
    private final String 537;

    public SelectRenewalCoalist() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SelectRenewalCoalist copy$default(SelectRenewalCoalist selectRenewalCoalist, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = selectRenewalCoalist.537;
        }
        if ((i & 2) != 0) {
            str2 = selectRenewalCoalist.515;
        }
        return selectRenewalCoalist.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String get537() {
        return this.537;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String get515() {
        return this.515;
    }

    public final SelectRenewalCoalist copy(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "537");
        Intrinsics.checkNotNullParameter(str2, "515");
        return new SelectRenewalCoalist(str, str2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectRenewalCoalist)) {
            return false;
        }
        SelectRenewalCoalist selectRenewalCoalist = (SelectRenewalCoalist) other;
        return Intrinsics.areEqual(this.537, selectRenewalCoalist.537) && Intrinsics.areEqual(this.515, selectRenewalCoalist.515);
    }

    public final String get515() {
        return this.515;
    }

    public final String get537() {
        return this.537;
    }

    public int hashCode() {
        return (this.537.hashCode() * 31) + this.515.hashCode();
    }

    public String toString() {
        return "SelectRenewalCoalist(537=" + this.537 + ", 515=" + this.515 + ')';
    }

    public SelectRenewalCoalist(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "537");
        Intrinsics.checkNotNullParameter(str2, "515");
        this.537 = str;
        this.515 = str2;
    }

    public /* synthetic */ SelectRenewalCoalist(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "RE-VALIDATION OF EXPIRED DL" : str, (i & 2) != 0 ? "CHANGE OF ADDRESS IN DL" : str2);
    }
}
