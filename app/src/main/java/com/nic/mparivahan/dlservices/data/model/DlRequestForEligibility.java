package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\b\u0010\u0016\u001a\u00020\u0003H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0007R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\t\"\u0004\b\f\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/DlRequestForEligibility;", "", "applNumber", "", "dob", "stateCd", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;)V", "getApplNumber", "()Ljava/lang/String;", "setApplNumber", "getDob", "setDob", "getStateCd", "setStateCd", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DlRequestForEligibility {
    private String applNumber;
    private String dob;
    private String stateCd;

    public DlRequestForEligibility(String applNumber) {
        Intrinsics.checkNotNullParameter(applNumber, "applNumber");
        this.applNumber = applNumber;
        this.dob = "";
        this.stateCd = "";
    }

    public static /* synthetic */ DlRequestForEligibility copy$default(DlRequestForEligibility dlRequestForEligibility, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dlRequestForEligibility.applNumber;
        }
        return dlRequestForEligibility.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApplNumber() {
        return this.applNumber;
    }

    public final DlRequestForEligibility copy(String applNumber) {
        Intrinsics.checkNotNullParameter(applNumber, "applNumber");
        return new DlRequestForEligibility(applNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DlRequestForEligibility) && Intrinsics.areEqual(this.applNumber, ((DlRequestForEligibility) other).applNumber);
    }

    public final String getApplNumber() {
        return this.applNumber;
    }

    public final String getDob() {
        return this.dob;
    }

    public final String getStateCd() {
        return this.stateCd;
    }

    public int hashCode() {
        return this.applNumber.hashCode();
    }

    public final void setApplNumber(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.applNumber = str;
    }

    public final void setDob(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dob = str;
    }

    public final void setStateCd(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stateCd = str;
    }

    public String toString() {
        return "{\"dlNumber\"=\"" + this.applNumber + "\", \"dob\"=\"" + this.dob + "\", \"rtoCd\"=\"" + this.stateCd + "\" }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DlRequestForEligibility(String applNumber, String dob, String stateCd) {
        this(applNumber);
        Intrinsics.checkNotNullParameter(applNumber, "applNumber");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        this.dob = dob;
        this.stateCd = stateCd;
    }
}
