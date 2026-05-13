package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/DlRenewalCustomDocUpload;", "", "applNo", "", "stateCode", "transCode", "Lorg/json/JSONArray;", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONArray;)V", "getApplNo", "()Ljava/lang/String;", "setApplNo", "(Ljava/lang/String;)V", "getStateCode", "setStateCode", "getTransCode", "()Lorg/json/JSONArray;", "setTransCode", "(Lorg/json/JSONArray;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DlRenewalCustomDocUpload {
    private String applNo;
    private String stateCode;
    private JSONArray transCode;

    public DlRenewalCustomDocUpload(String applNo, String stateCode, JSONArray transCode) {
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(stateCode, "stateCode");
        Intrinsics.checkNotNullParameter(transCode, "transCode");
        this.applNo = applNo;
        this.stateCode = stateCode;
        this.transCode = transCode;
    }

    public static /* synthetic */ DlRenewalCustomDocUpload copy$default(DlRenewalCustomDocUpload dlRenewalCustomDocUpload, String str, String str2, JSONArray jSONArray, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dlRenewalCustomDocUpload.applNo;
        }
        if ((i & 2) != 0) {
            str2 = dlRenewalCustomDocUpload.stateCode;
        }
        if ((i & 4) != 0) {
            jSONArray = dlRenewalCustomDocUpload.transCode;
        }
        return dlRenewalCustomDocUpload.copy(str, str2, jSONArray);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApplNo() {
        return this.applNo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStateCode() {
        return this.stateCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final JSONArray getTransCode() {
        return this.transCode;
    }

    public final DlRenewalCustomDocUpload copy(String applNo, String stateCode, JSONArray transCode) {
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(stateCode, "stateCode");
        Intrinsics.checkNotNullParameter(transCode, "transCode");
        return new DlRenewalCustomDocUpload(applNo, stateCode, transCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DlRenewalCustomDocUpload)) {
            return false;
        }
        DlRenewalCustomDocUpload dlRenewalCustomDocUpload = (DlRenewalCustomDocUpload) other;
        return Intrinsics.areEqual(this.applNo, dlRenewalCustomDocUpload.applNo) && Intrinsics.areEqual(this.stateCode, dlRenewalCustomDocUpload.stateCode) && Intrinsics.areEqual(this.transCode, dlRenewalCustomDocUpload.transCode);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public final JSONArray getTransCode() {
        return this.transCode;
    }

    public int hashCode() {
        return (((this.applNo.hashCode() * 31) + this.stateCode.hashCode()) * 31) + this.transCode.hashCode();
    }

    public final void setApplNo(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.applNo = str;
    }

    public final void setStateCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stateCode = str;
    }

    public final void setTransCode(JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "<set-?>");
        this.transCode = jSONArray;
    }

    public String toString() {
        return "DlRenewalCustomDocUpload(applNo=" + this.applNo + ", stateCode=" + this.stateCode + ", transCode=" + this.transCode + ')';
    }
}
