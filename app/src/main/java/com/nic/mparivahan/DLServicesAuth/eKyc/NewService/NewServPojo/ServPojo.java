package com.nic.mparivahan.DLServicesAuth.eKyc.NewService.NewServPojo;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0001HÆ\u0003J\u0019\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u000bHÆ\u0003JK\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R!\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/nic/mparivahan/DLServicesAuth/eKyc/NewService/NewServPojo/ServPojo;", "", "authRequired", "", "ekycCustOptions", "ekycImplStates", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/NewService/NewServPojo/EkycImplState;", "Lkotlin/collections/ArrayList;", "ekycRequired", "responseMsg", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/NewService/NewServPojo/ResponseMsg;", "(Ljava/lang/String;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/String;Lcom/nic/mparivahan/DLServicesAuth/eKyc/NewService/NewServPojo/ResponseMsg;)V", "getAuthRequired", "()Ljava/lang/String;", "getEkycCustOptions", "()Ljava/lang/Object;", "getEkycImplStates", "()Ljava/util/ArrayList;", "getEkycRequired", "getResponseMsg", "()Lcom/nic/mparivahan/DLServicesAuth/eKyc/NewService/NewServPojo/ResponseMsg;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ServPojo {
    private final String authRequired;
    private final Object ekycCustOptions;
    private final ArrayList<EkycImplState> ekycImplStates;
    private final String ekycRequired;
    private final ResponseMsg responseMsg;

    public ServPojo(String authRequired, Object ekycCustOptions, ArrayList<EkycImplState> ekycImplStates, String ekycRequired, ResponseMsg responseMsg) {
        Intrinsics.checkNotNullParameter(authRequired, "authRequired");
        Intrinsics.checkNotNullParameter(ekycCustOptions, "ekycCustOptions");
        Intrinsics.checkNotNullParameter(ekycImplStates, "ekycImplStates");
        Intrinsics.checkNotNullParameter(ekycRequired, "ekycRequired");
        Intrinsics.checkNotNullParameter(responseMsg, "responseMsg");
        this.authRequired = authRequired;
        this.ekycCustOptions = ekycCustOptions;
        this.ekycImplStates = ekycImplStates;
        this.ekycRequired = ekycRequired;
        this.responseMsg = responseMsg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ServPojo copy$default(ServPojo servPojo, String str, Object obj, ArrayList arrayList, String str2, ResponseMsg responseMsg, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = servPojo.authRequired;
        }
        if ((i & 2) != 0) {
            obj = servPojo.ekycCustOptions;
        }
        Object obj3 = obj;
        if ((i & 4) != 0) {
            arrayList = servPojo.ekycImplStates;
        }
        ArrayList arrayList2 = arrayList;
        if ((i & 8) != 0) {
            str2 = servPojo.ekycRequired;
        }
        String str3 = str2;
        if ((i & 16) != 0) {
            responseMsg = servPojo.responseMsg;
        }
        return servPojo.copy(str, obj3, arrayList2, str3, responseMsg);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAuthRequired() {
        return this.authRequired;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getEkycCustOptions() {
        return this.ekycCustOptions;
    }

    public final ArrayList<EkycImplState> component3() {
        return this.ekycImplStates;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEkycRequired() {
        return this.ekycRequired;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ResponseMsg getResponseMsg() {
        return this.responseMsg;
    }

    public final ServPojo copy(String authRequired, Object ekycCustOptions, ArrayList<EkycImplState> ekycImplStates, String ekycRequired, ResponseMsg responseMsg) {
        Intrinsics.checkNotNullParameter(authRequired, "authRequired");
        Intrinsics.checkNotNullParameter(ekycCustOptions, "ekycCustOptions");
        Intrinsics.checkNotNullParameter(ekycImplStates, "ekycImplStates");
        Intrinsics.checkNotNullParameter(ekycRequired, "ekycRequired");
        Intrinsics.checkNotNullParameter(responseMsg, "responseMsg");
        return new ServPojo(authRequired, ekycCustOptions, ekycImplStates, ekycRequired, responseMsg);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServPojo)) {
            return false;
        }
        ServPojo servPojo = (ServPojo) other;
        return Intrinsics.areEqual(this.authRequired, servPojo.authRequired) && Intrinsics.areEqual(this.ekycCustOptions, servPojo.ekycCustOptions) && Intrinsics.areEqual(this.ekycImplStates, servPojo.ekycImplStates) && Intrinsics.areEqual(this.ekycRequired, servPojo.ekycRequired) && Intrinsics.areEqual(this.responseMsg, servPojo.responseMsg);
    }

    public final String getAuthRequired() {
        return this.authRequired;
    }

    public final Object getEkycCustOptions() {
        return this.ekycCustOptions;
    }

    public final ArrayList<EkycImplState> getEkycImplStates() {
        return this.ekycImplStates;
    }

    public final String getEkycRequired() {
        return this.ekycRequired;
    }

    public final ResponseMsg getResponseMsg() {
        return this.responseMsg;
    }

    public int hashCode() {
        return (((((((this.authRequired.hashCode() * 31) + this.ekycCustOptions.hashCode()) * 31) + this.ekycImplStates.hashCode()) * 31) + this.ekycRequired.hashCode()) * 31) + this.responseMsg.hashCode();
    }

    public String toString() {
        return "ServPojo(authRequired=" + this.authRequired + ", ekycCustOptions=" + this.ekycCustOptions + ", ekycImplStates=" + this.ekycImplStates + ", ekycRequired=" + this.ekycRequired + ", responseMsg=" + this.responseMsg + ')';
    }
}
