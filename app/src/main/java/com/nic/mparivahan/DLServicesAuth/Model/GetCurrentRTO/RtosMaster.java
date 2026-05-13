package com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/nic/mparivahan/DLServicesAuth/Model/GetCurrentRTO/RtosMaster;", "", "rto_name", "", "rto_code", "(Ljava/lang/String;Ljava/lang/String;)V", "getRto_code", "()Ljava/lang/String;", "getRto_name", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class RtosMaster {
    private final String rto_code;
    private final String rto_name;

    public RtosMaster(String rto_name, String rto_code) {
        Intrinsics.checkNotNullParameter(rto_name, "rto_name");
        Intrinsics.checkNotNullParameter(rto_code, "rto_code");
        this.rto_name = rto_name;
        this.rto_code = rto_code;
    }

    public static /* synthetic */ RtosMaster copy$default(RtosMaster rtosMaster, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rtosMaster.rto_name;
        }
        if ((i & 2) != 0) {
            str2 = rtosMaster.rto_code;
        }
        return rtosMaster.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRto_name() {
        return this.rto_name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRto_code() {
        return this.rto_code;
    }

    public final RtosMaster copy(String rto_name, String rto_code) {
        Intrinsics.checkNotNullParameter(rto_name, "rto_name");
        Intrinsics.checkNotNullParameter(rto_code, "rto_code");
        return new RtosMaster(rto_name, rto_code);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RtosMaster)) {
            return false;
        }
        RtosMaster rtosMaster = (RtosMaster) other;
        return Intrinsics.areEqual(this.rto_name, rtosMaster.rto_name) && Intrinsics.areEqual(this.rto_code, rtosMaster.rto_code);
    }

    public final String getRto_code() {
        return this.rto_code;
    }

    public final String getRto_name() {
        return this.rto_name;
    }

    public int hashCode() {
        return (this.rto_name.hashCode() * 31) + this.rto_code.hashCode();
    }

    public String toString() {
        return "RtosMaster(rto_name=" + this.rto_name + ", rto_code=" + this.rto_code + ')';
    }
}
