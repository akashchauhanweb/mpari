package com.nic.mparivahan.dlservices.ui.acknow;

import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J>\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\tHÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/acknow/DlApplStatusResponse;", "", "responseBody", "Lcom/nic/mparivahan/dlservices/ui/acknow/ResponseBody;", "docuUploadState", "", "responseMessage", "Lcom/nic/mparivahan/dlservices/ui/acknow/ResponseMessage;", "applcntAge", "", "(Lcom/nic/mparivahan/dlservices/ui/acknow/ResponseBody;Ljava/lang/Boolean;Lcom/nic/mparivahan/dlservices/ui/acknow/ResponseMessage;Ljava/lang/String;)V", "getApplcntAge", "()Ljava/lang/String;", "getDocuUploadState", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getResponseBody", "()Lcom/nic/mparivahan/dlservices/ui/acknow/ResponseBody;", "getResponseMessage", "()Lcom/nic/mparivahan/dlservices/ui/acknow/ResponseMessage;", "component1", "component2", "component3", "component4", "copy", "(Lcom/nic/mparivahan/dlservices/ui/acknow/ResponseBody;Ljava/lang/Boolean;Lcom/nic/mparivahan/dlservices/ui/acknow/ResponseMessage;Ljava/lang/String;)Lcom/nic/mparivahan/dlservices/ui/acknow/DlApplStatusResponse;", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DlApplStatusResponse {

    @xy5("applcntAge")
    private final String applcntAge;

    @xy5("docuUploadState")
    private final Boolean docuUploadState;

    @xy5("responseBody")
    private final ResponseBody responseBody;

    @xy5("responseMessage")
    private final ResponseMessage responseMessage;

    public DlApplStatusResponse() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ DlApplStatusResponse copy$default(DlApplStatusResponse dlApplStatusResponse, ResponseBody responseBody, Boolean bool, ResponseMessage responseMessage, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            responseBody = dlApplStatusResponse.responseBody;
        }
        if ((i & 2) != 0) {
            bool = dlApplStatusResponse.docuUploadState;
        }
        if ((i & 4) != 0) {
            responseMessage = dlApplStatusResponse.responseMessage;
        }
        if ((i & 8) != 0) {
            str = dlApplStatusResponse.applcntAge;
        }
        return dlApplStatusResponse.copy(responseBody, bool, responseMessage, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ResponseBody getResponseBody() {
        return this.responseBody;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getDocuUploadState() {
        return this.docuUploadState;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ResponseMessage getResponseMessage() {
        return this.responseMessage;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getApplcntAge() {
        return this.applcntAge;
    }

    public final DlApplStatusResponse copy(ResponseBody responseBody, Boolean docuUploadState, ResponseMessage responseMessage, String applcntAge) {
        return new DlApplStatusResponse(responseBody, docuUploadState, responseMessage, applcntAge);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DlApplStatusResponse)) {
            return false;
        }
        DlApplStatusResponse dlApplStatusResponse = (DlApplStatusResponse) other;
        return Intrinsics.areEqual(this.responseBody, dlApplStatusResponse.responseBody) && Intrinsics.areEqual(this.docuUploadState, dlApplStatusResponse.docuUploadState) && Intrinsics.areEqual(this.responseMessage, dlApplStatusResponse.responseMessage) && Intrinsics.areEqual(this.applcntAge, dlApplStatusResponse.applcntAge);
    }

    public final String getApplcntAge() {
        return this.applcntAge;
    }

    public final Boolean getDocuUploadState() {
        return this.docuUploadState;
    }

    public final ResponseBody getResponseBody() {
        return this.responseBody;
    }

    public final ResponseMessage getResponseMessage() {
        return this.responseMessage;
    }

    public int hashCode() {
        ResponseBody responseBody = this.responseBody;
        int iHashCode = (responseBody == null ? 0 : responseBody.hashCode()) * 31;
        Boolean bool = this.docuUploadState;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        ResponseMessage responseMessage = this.responseMessage;
        int iHashCode3 = (iHashCode2 + (responseMessage == null ? 0 : responseMessage.hashCode())) * 31;
        String str = this.applcntAge;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "DlApplStatusResponse(responseBody=" + this.responseBody + ", docuUploadState=" + this.docuUploadState + ", responseMessage=" + this.responseMessage + ", applcntAge=" + this.applcntAge + ')';
    }

    public DlApplStatusResponse(ResponseBody responseBody, Boolean bool, ResponseMessage responseMessage, String str) {
        this.responseBody = responseBody;
        this.docuUploadState = bool;
        this.responseMessage = responseMessage;
        this.applcntAge = str;
    }

    public /* synthetic */ DlApplStatusResponse(ResponseBody responseBody, Boolean bool, ResponseMessage responseMessage, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : responseBody, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : responseMessage, (i & 8) != 0 ? null : str);
    }
}
