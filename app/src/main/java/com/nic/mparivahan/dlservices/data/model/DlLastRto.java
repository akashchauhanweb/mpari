package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\b\u0010\u0014\u001a\u00020\u0003H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/DlLastRto;", "", "dlNumber", "", "dob", "(Ljava/lang/String;Ljava/lang/String;)V", "getDlNumber", "()Ljava/lang/String;", "setDlNumber", "(Ljava/lang/String;)V", "getDob", "setDob", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DlLastRto {
    private String dlNumber;
    private String dob;

    public DlLastRto(String dlNumber, String dob) {
        Intrinsics.checkNotNullParameter(dlNumber, "dlNumber");
        Intrinsics.checkNotNullParameter(dob, "dob");
        this.dlNumber = dlNumber;
        this.dob = dob;
    }

    public static /* synthetic */ DlLastRto copy$default(DlLastRto dlLastRto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dlLastRto.dlNumber;
        }
        if ((i & 2) != 0) {
            str2 = dlLastRto.dob;
        }
        return dlLastRto.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDlNumber() {
        return this.dlNumber;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDob() {
        return this.dob;
    }

    public final DlLastRto copy(String dlNumber, String dob) {
        Intrinsics.checkNotNullParameter(dlNumber, "dlNumber");
        Intrinsics.checkNotNullParameter(dob, "dob");
        return new DlLastRto(dlNumber, dob);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DlLastRto)) {
            return false;
        }
        DlLastRto dlLastRto = (DlLastRto) other;
        return Intrinsics.areEqual(this.dlNumber, dlLastRto.dlNumber) && Intrinsics.areEqual(this.dob, dlLastRto.dob);
    }

    public final String getDlNumber() {
        return this.dlNumber;
    }

    public final String getDob() {
        return this.dob;
    }

    public int hashCode() {
        return (this.dlNumber.hashCode() * 31) + this.dob.hashCode();
    }

    public final void setDlNumber(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dlNumber = str;
    }

    public final void setDob(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dob = str;
    }

    public String toString() {
        return "{\"dlNumber\"=\"" + this.dlNumber + "\", \"dob\"=\"" + this.dob + "\" }";
    }
}
