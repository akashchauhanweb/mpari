package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\b\u0010\u000f\u001a\u00020\u0003H\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/DlRtoRequest;", "", "stateCd", "", "(Ljava/lang/String;)V", "getStateCd", "()Ljava/lang/String;", "setStateCd", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DlRtoRequest {
    private String stateCd;

    public DlRtoRequest(String str) {
        this.stateCd = str;
    }

    public static /* synthetic */ DlRtoRequest copy$default(DlRtoRequest dlRtoRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dlRtoRequest.stateCd;
        }
        return dlRtoRequest.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStateCd() {
        return this.stateCd;
    }

    public final DlRtoRequest copy(String stateCd) {
        return new DlRtoRequest(stateCd);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DlRtoRequest) && Intrinsics.areEqual(this.stateCd, ((DlRtoRequest) other).stateCd);
    }

    public final String getStateCd() {
        return this.stateCd;
    }

    public int hashCode() {
        String str = this.stateCd;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setStateCd(String str) {
        this.stateCd = str;
    }

    public String toString() {
        return "{\"stateCd\"=\"" + this.stateCd + "\" }";
    }
}
