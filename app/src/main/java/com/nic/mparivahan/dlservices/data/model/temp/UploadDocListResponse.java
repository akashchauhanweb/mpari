package com.nic.mparivahan.dlservices.data.model.temp;

import androidx.annotation.Keep;
import com.zepto.xy5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0007¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0013\u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0007HÆ\u0003Je\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0007HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\rHÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010¨\u0006$"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/temp/UploadDocListResponse;", "", "responseBean", "Lcom/nic/mparivahan/dlservices/data/model/temp/ResponseBean;", "applicationNumber", "", "documentList", "", "Lcom/nic/mparivahan/dlservices/data/model/temp/DocumentListItem;", "proofList", "Lcom/nic/mparivahan/dlservices/data/model/temp/ProofList;", "stateCode", "dCodes", "", "(Lcom/nic/mparivahan/dlservices/data/model/temp/ResponseBean;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "getApplicationNumber", "()Ljava/lang/String;", "getDCodes", "()Ljava/util/List;", "getDocumentList", "getProofList", "getResponseBean", "()Lcom/nic/mparivahan/dlservices/data/model/temp/ResponseBean;", "getStateCode", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class UploadDocListResponse {

    @xy5("applicationNumber")
    private final String applicationNumber;

    @xy5("dCodes")
    private final List<Integer> dCodes;

    @xy5("documentList")
    private final List<DocumentListItem> documentList;

    @xy5("proofList")
    private final List<ProofList> proofList;

    @xy5("responseBean")
    private final ResponseBean responseBean;

    @xy5("stateCode")
    private final String stateCode;

    public UploadDocListResponse(ResponseBean responseBean, String str, List<DocumentListItem> list, List<ProofList> list2, String str2, List<Integer> dCodes) {
        Intrinsics.checkNotNullParameter(dCodes, "dCodes");
        this.responseBean = responseBean;
        this.applicationNumber = str;
        this.documentList = list;
        this.proofList = list2;
        this.stateCode = str2;
        this.dCodes = dCodes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UploadDocListResponse copy$default(UploadDocListResponse uploadDocListResponse, ResponseBean responseBean, String str, List list, List list2, String str2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            responseBean = uploadDocListResponse.responseBean;
        }
        if ((i & 2) != 0) {
            str = uploadDocListResponse.applicationNumber;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            list = uploadDocListResponse.documentList;
        }
        List list4 = list;
        if ((i & 8) != 0) {
            list2 = uploadDocListResponse.proofList;
        }
        List list5 = list2;
        if ((i & 16) != 0) {
            str2 = uploadDocListResponse.stateCode;
        }
        String str4 = str2;
        if ((i & 32) != 0) {
            list3 = uploadDocListResponse.dCodes;
        }
        return uploadDocListResponse.copy(responseBean, str3, list4, list5, str4, list3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ResponseBean getResponseBean() {
        return this.responseBean;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getApplicationNumber() {
        return this.applicationNumber;
    }

    public final List<DocumentListItem> component3() {
        return this.documentList;
    }

    public final List<ProofList> component4() {
        return this.proofList;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStateCode() {
        return this.stateCode;
    }

    public final List<Integer> component6() {
        return this.dCodes;
    }

    public final UploadDocListResponse copy(ResponseBean responseBean, String applicationNumber, List<DocumentListItem> documentList, List<ProofList> proofList, String stateCode, List<Integer> dCodes) {
        Intrinsics.checkNotNullParameter(dCodes, "dCodes");
        return new UploadDocListResponse(responseBean, applicationNumber, documentList, proofList, stateCode, dCodes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadDocListResponse)) {
            return false;
        }
        UploadDocListResponse uploadDocListResponse = (UploadDocListResponse) other;
        return Intrinsics.areEqual(this.responseBean, uploadDocListResponse.responseBean) && Intrinsics.areEqual(this.applicationNumber, uploadDocListResponse.applicationNumber) && Intrinsics.areEqual(this.documentList, uploadDocListResponse.documentList) && Intrinsics.areEqual(this.proofList, uploadDocListResponse.proofList) && Intrinsics.areEqual(this.stateCode, uploadDocListResponse.stateCode) && Intrinsics.areEqual(this.dCodes, uploadDocListResponse.dCodes);
    }

    public final String getApplicationNumber() {
        return this.applicationNumber;
    }

    public final List<Integer> getDCodes() {
        return this.dCodes;
    }

    public final List<DocumentListItem> getDocumentList() {
        return this.documentList;
    }

    public final List<ProofList> getProofList() {
        return this.proofList;
    }

    public final ResponseBean getResponseBean() {
        return this.responseBean;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public int hashCode() {
        ResponseBean responseBean = this.responseBean;
        int iHashCode = (responseBean == null ? 0 : responseBean.hashCode()) * 31;
        String str = this.applicationNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<DocumentListItem> list = this.documentList;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<ProofList> list2 = this.proofList;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.stateCode;
        return ((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.dCodes.hashCode();
    }

    public String toString() {
        return "UploadDocListResponse(responseBean=" + this.responseBean + ", applicationNumber=" + this.applicationNumber + ", documentList=" + this.documentList + ", proofList=" + this.proofList + ", stateCode=" + this.stateCode + ", dCodes=" + this.dCodes + ')';
    }

    public /* synthetic */ UploadDocListResponse(ResponseBean responseBean, String str, List list, List list2, String str2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : responseBean, (i & 2) != 0 ? null : str, list, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : str2, list3);
    }
}
