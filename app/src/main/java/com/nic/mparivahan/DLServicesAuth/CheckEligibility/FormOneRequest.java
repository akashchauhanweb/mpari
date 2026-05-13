package com.nic.mparivahan.DLServicesAuth.CheckEligibility;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bHÆ\u0003JU\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\nHÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R*\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010¨\u0006)"}, d2 = {"Lcom/nic/mparivahan/DLServicesAuth/CheckEligibility/FormOneRequest;", "", "agentId", "", "agentPwd", "agentIpAddress", "agentServiceName", "rtoCode", "reqTrans", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "getAgentId", "()Ljava/lang/String;", "setAgentId", "(Ljava/lang/String;)V", "getAgentIpAddress", "setAgentIpAddress", "getAgentPwd", "setAgentPwd", "getAgentServiceName", "setAgentServiceName", "getReqTrans", "()Ljava/util/ArrayList;", "setReqTrans", "(Ljava/util/ArrayList;)V", "getRtoCode", "setRtoCode", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class FormOneRequest {
    private String agentId;
    private String agentIpAddress;
    private String agentPwd;
    private String agentServiceName;
    private ArrayList<Integer> reqTrans;
    private String rtoCode;

    public FormOneRequest(String agentId, String agentPwd, String agentIpAddress, String agentServiceName, String rtoCode, ArrayList<Integer> reqTrans) {
        Intrinsics.checkNotNullParameter(agentId, "agentId");
        Intrinsics.checkNotNullParameter(agentPwd, "agentPwd");
        Intrinsics.checkNotNullParameter(agentIpAddress, "agentIpAddress");
        Intrinsics.checkNotNullParameter(agentServiceName, "agentServiceName");
        Intrinsics.checkNotNullParameter(rtoCode, "rtoCode");
        Intrinsics.checkNotNullParameter(reqTrans, "reqTrans");
        this.agentId = agentId;
        this.agentPwd = agentPwd;
        this.agentIpAddress = agentIpAddress;
        this.agentServiceName = agentServiceName;
        this.rtoCode = rtoCode;
        this.reqTrans = reqTrans;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FormOneRequest copy$default(FormOneRequest formOneRequest, String str, String str2, String str3, String str4, String str5, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = formOneRequest.agentId;
        }
        if ((i & 2) != 0) {
            str2 = formOneRequest.agentPwd;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = formOneRequest.agentIpAddress;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = formOneRequest.agentServiceName;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = formOneRequest.rtoCode;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            arrayList = formOneRequest.reqTrans;
        }
        return formOneRequest.copy(str, str6, str7, str8, str9, arrayList);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAgentId() {
        return this.agentId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAgentPwd() {
        return this.agentPwd;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAgentIpAddress() {
        return this.agentIpAddress;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAgentServiceName() {
        return this.agentServiceName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRtoCode() {
        return this.rtoCode;
    }

    public final ArrayList<Integer> component6() {
        return this.reqTrans;
    }

    public final FormOneRequest copy(String agentId, String agentPwd, String agentIpAddress, String agentServiceName, String rtoCode, ArrayList<Integer> reqTrans) {
        Intrinsics.checkNotNullParameter(agentId, "agentId");
        Intrinsics.checkNotNullParameter(agentPwd, "agentPwd");
        Intrinsics.checkNotNullParameter(agentIpAddress, "agentIpAddress");
        Intrinsics.checkNotNullParameter(agentServiceName, "agentServiceName");
        Intrinsics.checkNotNullParameter(rtoCode, "rtoCode");
        Intrinsics.checkNotNullParameter(reqTrans, "reqTrans");
        return new FormOneRequest(agentId, agentPwd, agentIpAddress, agentServiceName, rtoCode, reqTrans);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormOneRequest)) {
            return false;
        }
        FormOneRequest formOneRequest = (FormOneRequest) other;
        return Intrinsics.areEqual(this.agentId, formOneRequest.agentId) && Intrinsics.areEqual(this.agentPwd, formOneRequest.agentPwd) && Intrinsics.areEqual(this.agentIpAddress, formOneRequest.agentIpAddress) && Intrinsics.areEqual(this.agentServiceName, formOneRequest.agentServiceName) && Intrinsics.areEqual(this.rtoCode, formOneRequest.rtoCode) && Intrinsics.areEqual(this.reqTrans, formOneRequest.reqTrans);
    }

    public final String getAgentId() {
        return this.agentId;
    }

    public final String getAgentIpAddress() {
        return this.agentIpAddress;
    }

    public final String getAgentPwd() {
        return this.agentPwd;
    }

    public final String getAgentServiceName() {
        return this.agentServiceName;
    }

    public final ArrayList<Integer> getReqTrans() {
        return this.reqTrans;
    }

    public final String getRtoCode() {
        return this.rtoCode;
    }

    public int hashCode() {
        return (((((((((this.agentId.hashCode() * 31) + this.agentPwd.hashCode()) * 31) + this.agentIpAddress.hashCode()) * 31) + this.agentServiceName.hashCode()) * 31) + this.rtoCode.hashCode()) * 31) + this.reqTrans.hashCode();
    }

    public final void setAgentId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.agentId = str;
    }

    public final void setAgentIpAddress(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.agentIpAddress = str;
    }

    public final void setAgentPwd(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.agentPwd = str;
    }

    public final void setAgentServiceName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.agentServiceName = str;
    }

    public final void setReqTrans(ArrayList<Integer> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.reqTrans = arrayList;
    }

    public final void setRtoCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rtoCode = str;
    }

    public String toString() {
        return "FormOneRequest(agentId=" + this.agentId + ", agentPwd=" + this.agentPwd + ", agentIpAddress=" + this.agentIpAddress + ", agentServiceName=" + this.agentServiceName + ", rtoCode=" + this.rtoCode + ", reqTrans=" + this.reqTrans + ')';
    }
}
