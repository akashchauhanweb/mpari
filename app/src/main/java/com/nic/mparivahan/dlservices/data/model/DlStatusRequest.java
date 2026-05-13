package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/DlStatusRequest;", "", "applNumber", "", "applDob", "(Ljava/lang/String;Ljava/lang/String;)V", "getApplDob", "()Ljava/lang/String;", "setApplDob", "(Ljava/lang/String;)V", "getApplNumber", "setApplNumber", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DlStatusRequest {
    private String applDob;
    private String applNumber;

    public DlStatusRequest(String str, String str2) {
        this.applNumber = str;
        this.applDob = str2;
    }

    public static /* synthetic */ DlStatusRequest copy$default(DlStatusRequest dlStatusRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dlStatusRequest.applNumber;
        }
        if ((i & 2) != 0) {
            str2 = dlStatusRequest.applDob;
        }
        return dlStatusRequest.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApplNumber() {
        return this.applNumber;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getApplDob() {
        return this.applDob;
    }

    public final DlStatusRequest copy(String applNumber, String applDob) {
        return new DlStatusRequest(applNumber, applDob);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DlStatusRequest)) {
            return false;
        }
        DlStatusRequest dlStatusRequest = (DlStatusRequest) other;
        return Intrinsics.areEqual(this.applNumber, dlStatusRequest.applNumber) && Intrinsics.areEqual(this.applDob, dlStatusRequest.applDob);
    }

    public final String getApplDob() {
        return this.applDob;
    }

    public final String getApplNumber() {
        return this.applNumber;
    }

    public int hashCode() {
        String str = this.applNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.applDob;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setApplDob(String str) {
        this.applDob = str;
    }

    public final void setApplNumber(String str) {
        this.applNumber = str;
    }

    public String toString() {
        return "DlStatusRequest(applNumber=" + this.applNumber + ", applDob=" + this.applDob + ')';
    }
}
