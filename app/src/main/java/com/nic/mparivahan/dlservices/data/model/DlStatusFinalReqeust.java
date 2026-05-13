package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/DlStatusFinalReqeust;", "", "requestBody", "", "param", "(Ljava/lang/String;Ljava/lang/String;)V", "getParam", "()Ljava/lang/String;", "getRequestBody", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DlStatusFinalReqeust {
    private final String param;
    private final String requestBody;

    public DlStatusFinalReqeust(String requestBody, String param) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(param, "param");
        this.requestBody = requestBody;
        this.param = param;
    }

    public static /* synthetic */ DlStatusFinalReqeust copy$default(DlStatusFinalReqeust dlStatusFinalReqeust, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dlStatusFinalReqeust.requestBody;
        }
        if ((i & 2) != 0) {
            str2 = dlStatusFinalReqeust.param;
        }
        return dlStatusFinalReqeust.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRequestBody() {
        return this.requestBody;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getParam() {
        return this.param;
    }

    public final DlStatusFinalReqeust copy(String requestBody, String param) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(param, "param");
        return new DlStatusFinalReqeust(requestBody, param);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DlStatusFinalReqeust)) {
            return false;
        }
        DlStatusFinalReqeust dlStatusFinalReqeust = (DlStatusFinalReqeust) other;
        return Intrinsics.areEqual(this.requestBody, dlStatusFinalReqeust.requestBody) && Intrinsics.areEqual(this.param, dlStatusFinalReqeust.param);
    }

    public final String getParam() {
        return this.param;
    }

    public final String getRequestBody() {
        return this.requestBody;
    }

    public int hashCode() {
        return (this.requestBody.hashCode() * 31) + this.param.hashCode();
    }

    public String toString() {
        return "DlStatusFinalReqeust(requestBody=" + this.requestBody + ", param=" + this.param + ')';
    }
}
