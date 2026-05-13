package com.nic.mparivahan.VahanServices.ApplicationStatusModel;

import androidx.annotation.Keep;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/nic/mparivahan/VahanServices/ApplicationStatusModel/AppliByRcModle;", "Ljava/io/Serializable;", VContant.MAINSCREEN, "Lcom/nic/mparivahan/VahanServices/ApplicationStatusModel/X1;", "(Lcom/nic/mparivahan/VahanServices/ApplicationStatusModel/X1;)V", "get1", "()Lcom/nic/mparivahan/VahanServices/ApplicationStatusModel/X1;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AppliByRcModle implements Serializable {
    private final X1 1;

    public AppliByRcModle(X1 x1) {
        Intrinsics.checkNotNullParameter(x1, "1");
        this.1 = x1;
    }

    public static /* synthetic */ AppliByRcModle copy$default(AppliByRcModle appliByRcModle, X1 x1, int i, Object obj) {
        if ((i & 1) != 0) {
            x1 = appliByRcModle.1;
        }
        return appliByRcModle.copy(x1);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final X1 get1() {
        return this.1;
    }

    public final AppliByRcModle copy(X1 x1) {
        Intrinsics.checkNotNullParameter(x1, "1");
        return new AppliByRcModle(x1);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AppliByRcModle) && Intrinsics.areEqual(this.1, ((AppliByRcModle) other).1);
    }

    public final X1 get1() {
        return this.1;
    }

    public int hashCode() {
        return this.1.hashCode();
    }

    public String toString() {
        return "AppliByRcModle(1=" + this.1 + ')';
    }
}
