package com.nic.mparivahan.dlservices.ui.dms.uploadmodel;

import androidx.annotation.Keep;
import com.zepto.xy5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u0013\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001R \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR(\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/dms/uploadmodel/DocUploadRequest;", "", "uploadDocsBean", "", "Lcom/nic/mparivahan/dlservices/ui/dms/uploadmodel/UploadDocsBeanItem;", "agentId", "", "agentPW", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getAgentId", "()Ljava/lang/String;", "setAgentId", "(Ljava/lang/String;)V", "getAgentPW", "setAgentPW", "getUploadDocsBean", "()Ljava/util/List;", "setUploadDocsBean", "(Ljava/util/List;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DocUploadRequest {

    @xy5("agentId")
    private String agentId;

    @xy5("agentPW")
    private String agentPW;

    @xy5("uploadDocsBean")
    private List<UploadDocsBeanItem> uploadDocsBean;

    public DocUploadRequest() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DocUploadRequest copy$default(DocUploadRequest docUploadRequest, List list, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = docUploadRequest.uploadDocsBean;
        }
        if ((i & 2) != 0) {
            str = docUploadRequest.agentId;
        }
        if ((i & 4) != 0) {
            str2 = docUploadRequest.agentPW;
        }
        return docUploadRequest.copy(list, str, str2);
    }

    public final List<UploadDocsBeanItem> component1() {
        return this.uploadDocsBean;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAgentId() {
        return this.agentId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAgentPW() {
        return this.agentPW;
    }

    public final DocUploadRequest copy(List<UploadDocsBeanItem> uploadDocsBean, String agentId, String agentPW) {
        return new DocUploadRequest(uploadDocsBean, agentId, agentPW);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocUploadRequest)) {
            return false;
        }
        DocUploadRequest docUploadRequest = (DocUploadRequest) other;
        return Intrinsics.areEqual(this.uploadDocsBean, docUploadRequest.uploadDocsBean) && Intrinsics.areEqual(this.agentId, docUploadRequest.agentId) && Intrinsics.areEqual(this.agentPW, docUploadRequest.agentPW);
    }

    public final String getAgentId() {
        return this.agentId;
    }

    public final String getAgentPW() {
        return this.agentPW;
    }

    public final List<UploadDocsBeanItem> getUploadDocsBean() {
        return this.uploadDocsBean;
    }

    public int hashCode() {
        List<UploadDocsBeanItem> list = this.uploadDocsBean;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.agentId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.agentPW;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setAgentId(String str) {
        this.agentId = str;
    }

    public final void setAgentPW(String str) {
        this.agentPW = str;
    }

    public final void setUploadDocsBean(List<UploadDocsBeanItem> list) {
        this.uploadDocsBean = list;
    }

    public String toString() {
        return "DocUploadRequest(uploadDocsBean=" + this.uploadDocsBean + ", agentId=" + this.agentId + ", agentPW=" + this.agentPW + ')';
    }

    public DocUploadRequest(List<UploadDocsBeanItem> list, String str, String str2) {
        this.uploadDocsBean = list;
        this.agentId = str;
        this.agentPW = str2;
    }

    public /* synthetic */ DocUploadRequest(List list, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
