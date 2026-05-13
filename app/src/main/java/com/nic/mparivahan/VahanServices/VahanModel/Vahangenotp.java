package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/Vahangenotp;", "Ljava/io/Serializable;", "apiMessage", "Lcom/nic/mparivahan/VahanServices/VahanModel/ApiMessageXX;", "data", "Lcom/nic/mparivahan/VahanServices/VahanModel/DataX;", "(Lcom/nic/mparivahan/VahanServices/VahanModel/ApiMessageXX;Lcom/nic/mparivahan/VahanServices/VahanModel/DataX;)V", "getApiMessage", "()Lcom/nic/mparivahan/VahanServices/VahanModel/ApiMessageXX;", "getData", "()Lcom/nic/mparivahan/VahanServices/VahanModel/DataX;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Vahangenotp implements Serializable {
    private final ApiMessageXX apiMessage;
    private final DataX data;

    public Vahangenotp(ApiMessageXX apiMessage, DataX data) {
        Intrinsics.checkNotNullParameter(apiMessage, "apiMessage");
        Intrinsics.checkNotNullParameter(data, "data");
        this.apiMessage = apiMessage;
        this.data = data;
    }

    public static /* synthetic */ Vahangenotp copy$default(Vahangenotp vahangenotp, ApiMessageXX apiMessageXX, DataX dataX, int i, Object obj) {
        if ((i & 1) != 0) {
            apiMessageXX = vahangenotp.apiMessage;
        }
        if ((i & 2) != 0) {
            dataX = vahangenotp.data;
        }
        return vahangenotp.copy(apiMessageXX, dataX);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ApiMessageXX getApiMessage() {
        return this.apiMessage;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DataX getData() {
        return this.data;
    }

    public final Vahangenotp copy(ApiMessageXX apiMessage, DataX data) {
        Intrinsics.checkNotNullParameter(apiMessage, "apiMessage");
        Intrinsics.checkNotNullParameter(data, "data");
        return new Vahangenotp(apiMessage, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Vahangenotp)) {
            return false;
        }
        Vahangenotp vahangenotp = (Vahangenotp) other;
        return Intrinsics.areEqual(this.apiMessage, vahangenotp.apiMessage) && Intrinsics.areEqual(this.data, vahangenotp.data);
    }

    public final ApiMessageXX getApiMessage() {
        return this.apiMessage;
    }

    public final DataX getData() {
        return this.data;
    }

    public int hashCode() {
        return (this.apiMessage.hashCode() * 31) + this.data.hashCode();
    }

    public String toString() {
        return "Vahangenotp(apiMessage=" + this.apiMessage + ", data=" + this.data + ')';
    }
}
