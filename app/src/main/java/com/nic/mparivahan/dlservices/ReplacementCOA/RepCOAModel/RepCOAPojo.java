package com.nic.mparivahan.dlservices.ReplacementCOA.RepCOAModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/nic/mparivahan/dlservices/ReplacementCOA/RepCOAModel/RepCOAPojo;", "", "result", "Lcom/nic/mparivahan/dlservices/ReplacementCOA/RepCOAModel/Result;", "(Lcom/nic/mparivahan/dlservices/ReplacementCOA/RepCOAModel/Result;)V", "getResult", "()Lcom/nic/mparivahan/dlservices/ReplacementCOA/RepCOAModel/Result;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class RepCOAPojo {
    private final Result result;

    public RepCOAPojo(Result result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.result = result;
    }

    public static /* synthetic */ RepCOAPojo copy$default(RepCOAPojo repCOAPojo, Result result, int i, Object obj) {
        if ((i & 1) != 0) {
            result = repCOAPojo.result;
        }
        return repCOAPojo.copy(result);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Result getResult() {
        return this.result;
    }

    public final RepCOAPojo copy(Result result) {
        Intrinsics.checkNotNullParameter(result, "result");
        return new RepCOAPojo(result);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RepCOAPojo) && Intrinsics.areEqual(this.result, ((RepCOAPojo) other).result);
    }

    public final Result getResult() {
        return this.result;
    }

    public int hashCode() {
        return this.result.hashCode();
    }

    public String toString() {
        return "RepCOAPojo(result=" + this.result + ')';
    }
}
