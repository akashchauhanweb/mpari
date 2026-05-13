package com.nic.mparivahan.DLServicesAuth.Model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/nic/mparivahan/DLServicesAuth/Model/ServiceCheckPojo;", "", "Result", "", "allowed", "status_code", "status_desc", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getResult", "()Ljava/lang/String;", "getAllowed", "getStatus_code", "getStatus_desc", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ServiceCheckPojo {
    private final String Result;
    private final String allowed;
    private final String status_code;
    private final String status_desc;

    public ServiceCheckPojo(String Result, String allowed, String status_code, String status_desc) {
        Intrinsics.checkNotNullParameter(Result, "Result");
        Intrinsics.checkNotNullParameter(allowed, "allowed");
        Intrinsics.checkNotNullParameter(status_code, "status_code");
        Intrinsics.checkNotNullParameter(status_desc, "status_desc");
        this.Result = Result;
        this.allowed = allowed;
        this.status_code = status_code;
        this.status_desc = status_desc;
    }

    public static /* synthetic */ ServiceCheckPojo copy$default(ServiceCheckPojo serviceCheckPojo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = serviceCheckPojo.Result;
        }
        if ((i & 2) != 0) {
            str2 = serviceCheckPojo.allowed;
        }
        if ((i & 4) != 0) {
            str3 = serviceCheckPojo.status_code;
        }
        if ((i & 8) != 0) {
            str4 = serviceCheckPojo.status_desc;
        }
        return serviceCheckPojo.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getResult() {
        return this.Result;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAllowed() {
        return this.allowed;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatus_code() {
        return this.status_code;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStatus_desc() {
        return this.status_desc;
    }

    public final ServiceCheckPojo copy(String Result, String allowed, String status_code, String status_desc) {
        Intrinsics.checkNotNullParameter(Result, "Result");
        Intrinsics.checkNotNullParameter(allowed, "allowed");
        Intrinsics.checkNotNullParameter(status_code, "status_code");
        Intrinsics.checkNotNullParameter(status_desc, "status_desc");
        return new ServiceCheckPojo(Result, allowed, status_code, status_desc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServiceCheckPojo)) {
            return false;
        }
        ServiceCheckPojo serviceCheckPojo = (ServiceCheckPojo) other;
        return Intrinsics.areEqual(this.Result, serviceCheckPojo.Result) && Intrinsics.areEqual(this.allowed, serviceCheckPojo.allowed) && Intrinsics.areEqual(this.status_code, serviceCheckPojo.status_code) && Intrinsics.areEqual(this.status_desc, serviceCheckPojo.status_desc);
    }

    public final String getAllowed() {
        return this.allowed;
    }

    public final String getResult() {
        return this.Result;
    }

    public final String getStatus_code() {
        return this.status_code;
    }

    public final String getStatus_desc() {
        return this.status_desc;
    }

    public int hashCode() {
        return (((((this.Result.hashCode() * 31) + this.allowed.hashCode()) * 31) + this.status_code.hashCode()) * 31) + this.status_desc.hashCode();
    }

    public String toString() {
        return "ServiceCheckPojo(Result=" + this.Result + ", allowed=" + this.allowed + ", status_code=" + this.status_code + ", status_desc=" + this.status_desc + ')';
    }
}
