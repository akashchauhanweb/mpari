package com.nic.mparivahan.DLServicesAuth.eKyc.Pojo;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0001HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/nic/mparivahan/DLServicesAuth/eKyc/Pojo/CheckByState;", "", "authRequired", "", "ekycCustOptions", "ekycRequired", "responseMsg", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/Pojo/ResponseMsg;", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Lcom/nic/mparivahan/DLServicesAuth/eKyc/Pojo/ResponseMsg;)V", "getAuthRequired", "()Ljava/lang/String;", "getEkycCustOptions", "()Ljava/lang/Object;", "getEkycRequired", "getResponseMsg", "()Lcom/nic/mparivahan/DLServicesAuth/eKyc/Pojo/ResponseMsg;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CheckByState {
    private final String authRequired;
    private final Object ekycCustOptions;
    private final String ekycRequired;
    private final ResponseMsg responseMsg;

    public CheckByState(String authRequired, Object ekycCustOptions, String ekycRequired, ResponseMsg responseMsg) {
        Intrinsics.checkNotNullParameter(authRequired, "authRequired");
        Intrinsics.checkNotNullParameter(ekycCustOptions, "ekycCustOptions");
        Intrinsics.checkNotNullParameter(ekycRequired, "ekycRequired");
        Intrinsics.checkNotNullParameter(responseMsg, "responseMsg");
        this.authRequired = authRequired;
        this.ekycCustOptions = ekycCustOptions;
        this.ekycRequired = ekycRequired;
        this.responseMsg = responseMsg;
    }

    public static /* synthetic */ CheckByState copy$default(CheckByState checkByState, String str, Object obj, String str2, ResponseMsg responseMsg, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = checkByState.authRequired;
        }
        if ((i & 2) != 0) {
            obj = checkByState.ekycCustOptions;
        }
        if ((i & 4) != 0) {
            str2 = checkByState.ekycRequired;
        }
        if ((i & 8) != 0) {
            responseMsg = checkByState.responseMsg;
        }
        return checkByState.copy(str, obj, str2, responseMsg);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAuthRequired() {
        return this.authRequired;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getEkycCustOptions() {
        return this.ekycCustOptions;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEkycRequired() {
        return this.ekycRequired;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ResponseMsg getResponseMsg() {
        return this.responseMsg;
    }

    public final CheckByState copy(String authRequired, Object ekycCustOptions, String ekycRequired, ResponseMsg responseMsg) {
        Intrinsics.checkNotNullParameter(authRequired, "authRequired");
        Intrinsics.checkNotNullParameter(ekycCustOptions, "ekycCustOptions");
        Intrinsics.checkNotNullParameter(ekycRequired, "ekycRequired");
        Intrinsics.checkNotNullParameter(responseMsg, "responseMsg");
        return new CheckByState(authRequired, ekycCustOptions, ekycRequired, responseMsg);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckByState)) {
            return false;
        }
        CheckByState checkByState = (CheckByState) other;
        return Intrinsics.areEqual(this.authRequired, checkByState.authRequired) && Intrinsics.areEqual(this.ekycCustOptions, checkByState.ekycCustOptions) && Intrinsics.areEqual(this.ekycRequired, checkByState.ekycRequired) && Intrinsics.areEqual(this.responseMsg, checkByState.responseMsg);
    }

    public final String getAuthRequired() {
        return this.authRequired;
    }

    public final Object getEkycCustOptions() {
        return this.ekycCustOptions;
    }

    public final String getEkycRequired() {
        return this.ekycRequired;
    }

    public final ResponseMsg getResponseMsg() {
        return this.responseMsg;
    }

    public int hashCode() {
        return (((((this.authRequired.hashCode() * 31) + this.ekycCustOptions.hashCode()) * 31) + this.ekycRequired.hashCode()) * 31) + this.responseMsg.hashCode();
    }

    public String toString() {
        return "CheckByState(authRequired=" + this.authRequired + ", ekycCustOptions=" + this.ekycCustOptions + ", ekycRequired=" + this.ekycRequired + ", responseMsg=" + this.responseMsg + ')';
    }
}
