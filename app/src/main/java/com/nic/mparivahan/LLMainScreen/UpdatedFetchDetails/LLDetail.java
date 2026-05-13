package com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/LLDetail;", "Ljava/io/Serializable;", "status_code", "", "status_desc", "(Ljava/lang/String;Ljava/lang/String;)V", "getStatus_code", "()Ljava/lang/String;", "getStatus_desc", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class LLDetail implements Serializable {
    private final String status_code;
    private final String status_desc;

    public LLDetail(String status_code, String status_desc) {
        Intrinsics.checkNotNullParameter(status_code, "status_code");
        Intrinsics.checkNotNullParameter(status_desc, "status_desc");
        this.status_code = status_code;
        this.status_desc = status_desc;
    }

    public static /* synthetic */ LLDetail copy$default(LLDetail lLDetail, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lLDetail.status_code;
        }
        if ((i & 2) != 0) {
            str2 = lLDetail.status_desc;
        }
        return lLDetail.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatus_code() {
        return this.status_code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatus_desc() {
        return this.status_desc;
    }

    public final LLDetail copy(String status_code, String status_desc) {
        Intrinsics.checkNotNullParameter(status_code, "status_code");
        Intrinsics.checkNotNullParameter(status_desc, "status_desc");
        return new LLDetail(status_code, status_desc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LLDetail)) {
            return false;
        }
        LLDetail lLDetail = (LLDetail) other;
        return Intrinsics.areEqual(this.status_code, lLDetail.status_code) && Intrinsics.areEqual(this.status_desc, lLDetail.status_desc);
    }

    public final String getStatus_code() {
        return this.status_code;
    }

    public final String getStatus_desc() {
        return this.status_desc;
    }

    public int hashCode() {
        return (this.status_code.hashCode() * 31) + this.status_desc.hashCode();
    }

    public String toString() {
        return "LLDetail(status_code=" + this.status_code + ", status_desc=" + this.status_desc + ')';
    }
}
