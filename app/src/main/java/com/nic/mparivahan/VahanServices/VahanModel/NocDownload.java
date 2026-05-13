package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/NocDownload;", "", "apiMessage", "Lcom/nic/mparivahan/VahanServices/VahanModel/ApiMessage;", "data", "", "(Lcom/nic/mparivahan/VahanServices/VahanModel/ApiMessage;Ljava/lang/String;)V", "getApiMessage", "()Lcom/nic/mparivahan/VahanServices/VahanModel/ApiMessage;", "getData", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class NocDownload {
    private final ApiMessage apiMessage;
    private final String data;

    public NocDownload(ApiMessage apiMessage, String str) {
        this.apiMessage = apiMessage;
        this.data = str;
    }

    public static /* synthetic */ NocDownload copy$default(NocDownload nocDownload, ApiMessage apiMessage, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            apiMessage = nocDownload.apiMessage;
        }
        if ((i & 2) != 0) {
            str = nocDownload.data;
        }
        return nocDownload.copy(apiMessage, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ApiMessage getApiMessage() {
        return this.apiMessage;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getData() {
        return this.data;
    }

    public final NocDownload copy(ApiMessage apiMessage, String data) {
        return new NocDownload(apiMessage, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NocDownload)) {
            return false;
        }
        NocDownload nocDownload = (NocDownload) other;
        return Intrinsics.areEqual(this.apiMessage, nocDownload.apiMessage) && Intrinsics.areEqual(this.data, nocDownload.data);
    }

    public final ApiMessage getApiMessage() {
        return this.apiMessage;
    }

    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        ApiMessage apiMessage = this.apiMessage;
        int iHashCode = (apiMessage == null ? 0 : apiMessage.hashCode()) * 31;
        String str = this.data;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "NocDownload(apiMessage=" + this.apiMessage + ", data=" + this.data + ')';
    }
}
