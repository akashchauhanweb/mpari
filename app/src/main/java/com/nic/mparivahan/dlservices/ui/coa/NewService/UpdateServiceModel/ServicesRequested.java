package com.nic.mparivahan.dlservices.ui.coa.NewService.UpdateServiceModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/coa/NewService/UpdateServiceModel/ServicesRequested;", "", "515", "", "(Ljava/lang/String;)V", "get515", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ServicesRequested {
    private final String 515;

    public ServicesRequested(String str) {
        Intrinsics.checkNotNullParameter(str, "515");
        this.515 = str;
    }

    public static /* synthetic */ ServicesRequested copy$default(ServicesRequested servicesRequested, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = servicesRequested.515;
        }
        return servicesRequested.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String get515() {
        return this.515;
    }

    public final ServicesRequested copy(String str) {
        Intrinsics.checkNotNullParameter(str, "515");
        return new ServicesRequested(str);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ServicesRequested) && Intrinsics.areEqual(this.515, ((ServicesRequested) other).515);
    }

    public final String get515() {
        return this.515;
    }

    public int hashCode() {
        return this.515.hashCode();
    }

    public String toString() {
        return "ServicesRequested(515=" + this.515 + ')';
    }
}
