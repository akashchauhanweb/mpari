package com.nic.mparivahan.LLServices.GetLlPojo;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/nic/mparivahan/LLServices/GetLlPojo/LlFromRTO1;", "Ljava/io/Serializable;", "rtoCode", "", "rtoName", "(Ljava/lang/String;Ljava/lang/String;)V", "getRtoCode", "()Ljava/lang/String;", "getRtoName", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class LlFromRTO1 implements Serializable {
    private final String rtoCode;
    private final String rtoName;

    public LlFromRTO1(String rtoCode, String rtoName) {
        Intrinsics.checkNotNullParameter(rtoCode, "rtoCode");
        Intrinsics.checkNotNullParameter(rtoName, "rtoName");
        this.rtoCode = rtoCode;
        this.rtoName = rtoName;
    }

    public static /* synthetic */ LlFromRTO1 copy$default(LlFromRTO1 llFromRTO1, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = llFromRTO1.rtoCode;
        }
        if ((i & 2) != 0) {
            str2 = llFromRTO1.rtoName;
        }
        return llFromRTO1.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRtoCode() {
        return this.rtoCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRtoName() {
        return this.rtoName;
    }

    public final LlFromRTO1 copy(String rtoCode, String rtoName) {
        Intrinsics.checkNotNullParameter(rtoCode, "rtoCode");
        Intrinsics.checkNotNullParameter(rtoName, "rtoName");
        return new LlFromRTO1(rtoCode, rtoName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LlFromRTO1)) {
            return false;
        }
        LlFromRTO1 llFromRTO1 = (LlFromRTO1) other;
        return Intrinsics.areEqual(this.rtoCode, llFromRTO1.rtoCode) && Intrinsics.areEqual(this.rtoName, llFromRTO1.rtoName);
    }

    public final String getRtoCode() {
        return this.rtoCode;
    }

    public final String getRtoName() {
        return this.rtoName;
    }

    public int hashCode() {
        return (this.rtoCode.hashCode() * 31) + this.rtoName.hashCode();
    }

    public String toString() {
        return "LlFromRTO1(rtoCode=" + this.rtoCode + ", rtoName=" + this.rtoName + ')';
    }
}
