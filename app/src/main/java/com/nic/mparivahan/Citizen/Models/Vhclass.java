package com.nic.mparivahan.Citizen.Models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/nic/mparivahan/Citizen/Models/Vhclass;", "", "apiMessage", "Lcom/nic/mparivahan/Citizen/Models/ApiMessage;", "data", "Lcom/nic/mparivahan/Citizen/Models/Data;", "(Lcom/nic/mparivahan/Citizen/Models/ApiMessage;Lcom/nic/mparivahan/Citizen/Models/Data;)V", "getApiMessage", "()Lcom/nic/mparivahan/Citizen/Models/ApiMessage;", "getData", "()Lcom/nic/mparivahan/Citizen/Models/Data;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Vhclass {
    private final ApiMessage apiMessage;
    private final Data data;

    public Vhclass(ApiMessage apiMessage, Data data) {
        Intrinsics.checkNotNullParameter(apiMessage, "apiMessage");
        Intrinsics.checkNotNullParameter(data, "data");
        this.apiMessage = apiMessage;
        this.data = data;
    }

    public static /* synthetic */ Vhclass copy$default(Vhclass vhclass, ApiMessage apiMessage, Data data, int i, Object obj) {
        if ((i & 1) != 0) {
            apiMessage = vhclass.apiMessage;
        }
        if ((i & 2) != 0) {
            data = vhclass.data;
        }
        return vhclass.copy(apiMessage, data);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ApiMessage getApiMessage() {
        return this.apiMessage;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Data getData() {
        return this.data;
    }

    public final Vhclass copy(ApiMessage apiMessage, Data data) {
        Intrinsics.checkNotNullParameter(apiMessage, "apiMessage");
        Intrinsics.checkNotNullParameter(data, "data");
        return new Vhclass(apiMessage, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Vhclass)) {
            return false;
        }
        Vhclass vhclass = (Vhclass) other;
        return Intrinsics.areEqual(this.apiMessage, vhclass.apiMessage) && Intrinsics.areEqual(this.data, vhclass.data);
    }

    public final ApiMessage getApiMessage() {
        return this.apiMessage;
    }

    public final Data getData() {
        return this.data;
    }

    public int hashCode() {
        return (this.apiMessage.hashCode() * 31) + this.data.hashCode();
    }

    public String toString() {
        return "Vhclass(apiMessage=" + this.apiMessage + ", data=" + this.data + ')';
    }
}
