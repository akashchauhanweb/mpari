package com.nic.mparivahan.dlservices.data.model.temp;

import androidx.annotation.Keep;
import com.zepto.xy5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0012\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u0013\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003JF\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0012\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR \u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/temp/InsertedUploadDocResponse;", "", "applicationNumber", "insertedDocBean", "", "Lcom/nic/mparivahan/dlservices/data/model/temp/InsertedDocBeanItem;", "putUpCase", "", "responseMessage", "Lcom/nic/mparivahan/dlservices/data/model/temp/InsertedUploadResponseMessage;", "(Ljava/lang/Object;Ljava/util/List;Ljava/lang/Boolean;Lcom/nic/mparivahan/dlservices/data/model/temp/InsertedUploadResponseMessage;)V", "getApplicationNumber", "()Ljava/lang/Object;", "getInsertedDocBean", "()Ljava/util/List;", "getPutUpCase", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getResponseMessage", "()Lcom/nic/mparivahan/dlservices/data/model/temp/InsertedUploadResponseMessage;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Object;Ljava/util/List;Ljava/lang/Boolean;Lcom/nic/mparivahan/dlservices/data/model/temp/InsertedUploadResponseMessage;)Lcom/nic/mparivahan/dlservices/data/model/temp/InsertedUploadDocResponse;", "equals", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class InsertedUploadDocResponse {

    @xy5("applicationNumber")
    private final Object applicationNumber;

    @xy5("insertedDocBean")
    private final List<InsertedDocBeanItem> insertedDocBean;

    @xy5("putUpCase")
    private final Boolean putUpCase;

    @xy5("responseMessage")
    private final InsertedUploadResponseMessage responseMessage;

    public InsertedUploadDocResponse() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InsertedUploadDocResponse copy$default(InsertedUploadDocResponse insertedUploadDocResponse, Object obj, List list, Boolean bool, InsertedUploadResponseMessage insertedUploadResponseMessage, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = insertedUploadDocResponse.applicationNumber;
        }
        if ((i & 2) != 0) {
            list = insertedUploadDocResponse.insertedDocBean;
        }
        if ((i & 4) != 0) {
            bool = insertedUploadDocResponse.putUpCase;
        }
        if ((i & 8) != 0) {
            insertedUploadResponseMessage = insertedUploadDocResponse.responseMessage;
        }
        return insertedUploadDocResponse.copy(obj, list, bool, insertedUploadResponseMessage);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Object getApplicationNumber() {
        return this.applicationNumber;
    }

    public final List<InsertedDocBeanItem> component2() {
        return this.insertedDocBean;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getPutUpCase() {
        return this.putUpCase;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final InsertedUploadResponseMessage getResponseMessage() {
        return this.responseMessage;
    }

    public final InsertedUploadDocResponse copy(Object applicationNumber, List<InsertedDocBeanItem> insertedDocBean, Boolean putUpCase, InsertedUploadResponseMessage responseMessage) {
        return new InsertedUploadDocResponse(applicationNumber, insertedDocBean, putUpCase, responseMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InsertedUploadDocResponse)) {
            return false;
        }
        InsertedUploadDocResponse insertedUploadDocResponse = (InsertedUploadDocResponse) other;
        return Intrinsics.areEqual(this.applicationNumber, insertedUploadDocResponse.applicationNumber) && Intrinsics.areEqual(this.insertedDocBean, insertedUploadDocResponse.insertedDocBean) && Intrinsics.areEqual(this.putUpCase, insertedUploadDocResponse.putUpCase) && Intrinsics.areEqual(this.responseMessage, insertedUploadDocResponse.responseMessage);
    }

    public final Object getApplicationNumber() {
        return this.applicationNumber;
    }

    public final List<InsertedDocBeanItem> getInsertedDocBean() {
        return this.insertedDocBean;
    }

    public final Boolean getPutUpCase() {
        return this.putUpCase;
    }

    public final InsertedUploadResponseMessage getResponseMessage() {
        return this.responseMessage;
    }

    public int hashCode() {
        Object obj = this.applicationNumber;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        List<InsertedDocBeanItem> list = this.insertedDocBean;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.putUpCase;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        InsertedUploadResponseMessage insertedUploadResponseMessage = this.responseMessage;
        return iHashCode3 + (insertedUploadResponseMessage != null ? insertedUploadResponseMessage.hashCode() : 0);
    }

    public String toString() {
        return "InsertedUploadDocResponse(applicationNumber=" + this.applicationNumber + ", insertedDocBean=" + this.insertedDocBean + ", putUpCase=" + this.putUpCase + ", responseMessage=" + this.responseMessage + ')';
    }

    public InsertedUploadDocResponse(Object obj, List<InsertedDocBeanItem> list, Boolean bool, InsertedUploadResponseMessage insertedUploadResponseMessage) {
        this.applicationNumber = obj;
        this.insertedDocBean = list;
        this.putUpCase = bool;
        this.responseMessage = insertedUploadResponseMessage;
    }

    public /* synthetic */ InsertedUploadDocResponse(Object obj, List list, Boolean bool, InsertedUploadResponseMessage insertedUploadResponseMessage, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : insertedUploadResponseMessage);
    }
}
