package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/DlRto;", "", "requestBody", "", "param", "(Ljava/lang/String;Ljava/lang/String;)V", "getParam", "()Ljava/lang/String;", "setParam", "(Ljava/lang/String;)V", "getRequestBody", "setRequestBody", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DlRto {
    private String param;
    private String requestBody;

    public DlRto(String str, String str2) {
        this.requestBody = str;
        this.param = str2;
    }

    public static /* synthetic */ DlRto copy$default(DlRto dlRto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dlRto.requestBody;
        }
        if ((i & 2) != 0) {
            str2 = dlRto.param;
        }
        return dlRto.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRequestBody() {
        return this.requestBody;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getParam() {
        return this.param;
    }

    public final DlRto copy(String requestBody, String param) {
        return new DlRto(requestBody, param);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DlRto)) {
            return false;
        }
        DlRto dlRto = (DlRto) other;
        return Intrinsics.areEqual(this.requestBody, dlRto.requestBody) && Intrinsics.areEqual(this.param, dlRto.param);
    }

    public final String getParam() {
        return this.param;
    }

    public final String getRequestBody() {
        return this.requestBody;
    }

    public int hashCode() {
        String str = this.requestBody;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.param;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setParam(String str) {
        this.param = str;
    }

    public final void setRequestBody(String str) {
        this.requestBody = str;
    }

    public String toString() {
        return "DlRto(requestBody=" + this.requestBody + ", param=" + this.param + ')';
    }
}
