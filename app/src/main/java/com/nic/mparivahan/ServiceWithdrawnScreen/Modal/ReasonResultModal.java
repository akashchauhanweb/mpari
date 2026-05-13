package com.nic.mparivahan.ServiceWithdrawnScreen.Modal;

import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/nic/mparivahan/ServiceWithdrawnScreen/Modal/ReasonResultModal;", "", "key", "", "(Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ReasonResultModal {

    @xy5("key")
    private final String key;

    public ReasonResultModal() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ReasonResultModal copy$default(ReasonResultModal reasonResultModal, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reasonResultModal.key;
        }
        return reasonResultModal.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    public final ReasonResultModal copy(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return new ReasonResultModal(key);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ReasonResultModal) && Intrinsics.areEqual(this.key, ((ReasonResultModal) other).key);
    }

    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        return this.key.hashCode();
    }

    public String toString() {
        return "ReasonResultModal(key=" + this.key + ')';
    }

    public ReasonResultModal(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.key = key;
    }

    public /* synthetic */ ReasonResultModal(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
