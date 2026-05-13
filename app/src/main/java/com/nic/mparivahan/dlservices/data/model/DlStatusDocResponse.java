package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import com.zepto.xy5;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J>\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/DlStatusDocResponse;", "Ljava/io/Serializable;", "isvalid", "", "isekyc", "uploadAcStatus", "", "message", "Lcom/nic/mparivahan/dlservices/data/model/ResponseMsg;", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Object;Lcom/nic/mparivahan/dlservices/data/model/ResponseMsg;)V", "getIsekyc", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getIsvalid", "getMessage", "()Lcom/nic/mparivahan/dlservices/data/model/ResponseMsg;", "getUploadAcStatus", "()Ljava/lang/Object;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Object;Lcom/nic/mparivahan/dlservices/data/model/ResponseMsg;)Lcom/nic/mparivahan/dlservices/data/model/DlStatusDocResponse;", "equals", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DlStatusDocResponse implements Serializable {

    @xy5("isekyc")
    private final Boolean isekyc;

    @xy5("isvalid")
    private final Boolean isvalid;

    @xy5("message")
    private final ResponseMsg message;

    @xy5("uploadAcStatus")
    private final Object uploadAcStatus;

    public DlStatusDocResponse(Boolean bool, Boolean bool2, Object obj, ResponseMsg responseMsg) {
        this.isvalid = bool;
        this.isekyc = bool2;
        this.uploadAcStatus = obj;
        this.message = responseMsg;
    }

    public static /* synthetic */ DlStatusDocResponse copy$default(DlStatusDocResponse dlStatusDocResponse, Boolean bool, Boolean bool2, Object obj, ResponseMsg responseMsg, int i, Object obj2) {
        if ((i & 1) != 0) {
            bool = dlStatusDocResponse.isvalid;
        }
        if ((i & 2) != 0) {
            bool2 = dlStatusDocResponse.isekyc;
        }
        if ((i & 4) != 0) {
            obj = dlStatusDocResponse.uploadAcStatus;
        }
        if ((i & 8) != 0) {
            responseMsg = dlStatusDocResponse.message;
        }
        return dlStatusDocResponse.copy(bool, bool2, obj, responseMsg);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getIsvalid() {
        return this.isvalid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getIsekyc() {
        return this.isekyc;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Object getUploadAcStatus() {
        return this.uploadAcStatus;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ResponseMsg getMessage() {
        return this.message;
    }

    public final DlStatusDocResponse copy(Boolean isvalid, Boolean isekyc, Object uploadAcStatus, ResponseMsg message) {
        return new DlStatusDocResponse(isvalid, isekyc, uploadAcStatus, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DlStatusDocResponse)) {
            return false;
        }
        DlStatusDocResponse dlStatusDocResponse = (DlStatusDocResponse) other;
        return Intrinsics.areEqual(this.isvalid, dlStatusDocResponse.isvalid) && Intrinsics.areEqual(this.isekyc, dlStatusDocResponse.isekyc) && Intrinsics.areEqual(this.uploadAcStatus, dlStatusDocResponse.uploadAcStatus) && Intrinsics.areEqual(this.message, dlStatusDocResponse.message);
    }

    public final Boolean getIsekyc() {
        return this.isekyc;
    }

    public final Boolean getIsvalid() {
        return this.isvalid;
    }

    public final ResponseMsg getMessage() {
        return this.message;
    }

    public final Object getUploadAcStatus() {
        return this.uploadAcStatus;
    }

    public int hashCode() {
        Boolean bool = this.isvalid;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.isekyc;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Object obj = this.uploadAcStatus;
        int iHashCode3 = (iHashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
        ResponseMsg responseMsg = this.message;
        return iHashCode3 + (responseMsg != null ? responseMsg.hashCode() : 0);
    }

    public String toString() {
        return "DlStatusDocResponse(isvalid=" + this.isvalid + ", isekyc=" + this.isekyc + ", uploadAcStatus=" + this.uploadAcStatus + ", message=" + this.message + ')';
    }

    public /* synthetic */ DlStatusDocResponse(Boolean bool, Boolean bool2, Object obj, ResponseMsg responseMsg, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bool, bool2, obj, (i & 8) != 0 ? null : responseMsg);
    }
}
