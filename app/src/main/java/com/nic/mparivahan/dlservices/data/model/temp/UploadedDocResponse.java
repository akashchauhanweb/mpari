package com.nic.mparivahan.dlservices.data.model.temp;

import androidx.annotation.Keep;
import com.zepto.xy5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0013\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\rJ:\u0010\u0014\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\bHÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R \u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/temp/UploadedDocResponse;", "", "responses", "", "Lcom/nic/mparivahan/dlservices/data/model/temp/ResponsesItem;", "statusMessage", "", "statusCode", "", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;)V", "getResponses", "()Ljava/util/List;", "getStatusCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStatusMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;)Lcom/nic/mparivahan/dlservices/data/model/temp/UploadedDocResponse;", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class UploadedDocResponse {

    @xy5("responses")
    private final List<ResponsesItem> responses;

    @xy5("statusCode")
    private final Integer statusCode;

    @xy5("statusMessage")
    private final String statusMessage;

    public UploadedDocResponse() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UploadedDocResponse copy$default(UploadedDocResponse uploadedDocResponse, List list, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            list = uploadedDocResponse.responses;
        }
        if ((i & 2) != 0) {
            str = uploadedDocResponse.statusMessage;
        }
        if ((i & 4) != 0) {
            num = uploadedDocResponse.statusCode;
        }
        return uploadedDocResponse.copy(list, str, num);
    }

    public final List<ResponsesItem> component1() {
        return this.responses;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatusMessage() {
        return this.statusMessage;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public final UploadedDocResponse copy(List<ResponsesItem> responses, String statusMessage, Integer statusCode) {
        return new UploadedDocResponse(responses, statusMessage, statusCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadedDocResponse)) {
            return false;
        }
        UploadedDocResponse uploadedDocResponse = (UploadedDocResponse) other;
        return Intrinsics.areEqual(this.responses, uploadedDocResponse.responses) && Intrinsics.areEqual(this.statusMessage, uploadedDocResponse.statusMessage) && Intrinsics.areEqual(this.statusCode, uploadedDocResponse.statusCode);
    }

    public final List<ResponsesItem> getResponses() {
        return this.responses;
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMessage() {
        return this.statusMessage;
    }

    public int hashCode() {
        List<ResponsesItem> list = this.responses;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.statusMessage;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.statusCode;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "UploadedDocResponse(responses=" + this.responses + ", statusMessage=" + this.statusMessage + ", statusCode=" + this.statusCode + ')';
    }

    public UploadedDocResponse(List<ResponsesItem> list, String str, Integer num) {
        this.responses = list;
        this.statusMessage = str;
        this.statusCode = num;
    }

    public /* synthetic */ UploadedDocResponse(List list, String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num);
    }
}
