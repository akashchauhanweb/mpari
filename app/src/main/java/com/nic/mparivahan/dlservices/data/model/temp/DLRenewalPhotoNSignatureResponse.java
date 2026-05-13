package com.nic.mparivahan.dlservices.data.model.temp;

import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/temp/DLRenewalPhotoNSignatureResponse;", "", "photoDto", "Lcom/nic/mparivahan/dlservices/data/model/temp/PhotoDto;", "responseMsg", "Lcom/nic/mparivahan/dlservices/data/model/temp/ResponseMsg;", "(Lcom/nic/mparivahan/dlservices/data/model/temp/PhotoDto;Lcom/nic/mparivahan/dlservices/data/model/temp/ResponseMsg;)V", "getPhotoDto", "()Lcom/nic/mparivahan/dlservices/data/model/temp/PhotoDto;", "getResponseMsg", "()Lcom/nic/mparivahan/dlservices/data/model/temp/ResponseMsg;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DLRenewalPhotoNSignatureResponse {

    @xy5("photoDto")
    private final PhotoDto photoDto;

    @xy5("responseMsg")
    private final ResponseMsg responseMsg;

    public DLRenewalPhotoNSignatureResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DLRenewalPhotoNSignatureResponse copy$default(DLRenewalPhotoNSignatureResponse dLRenewalPhotoNSignatureResponse, PhotoDto photoDto, ResponseMsg responseMsg, int i, Object obj) {
        if ((i & 1) != 0) {
            photoDto = dLRenewalPhotoNSignatureResponse.photoDto;
        }
        if ((i & 2) != 0) {
            responseMsg = dLRenewalPhotoNSignatureResponse.responseMsg;
        }
        return dLRenewalPhotoNSignatureResponse.copy(photoDto, responseMsg);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PhotoDto getPhotoDto() {
        return this.photoDto;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ResponseMsg getResponseMsg() {
        return this.responseMsg;
    }

    public final DLRenewalPhotoNSignatureResponse copy(PhotoDto photoDto, ResponseMsg responseMsg) {
        return new DLRenewalPhotoNSignatureResponse(photoDto, responseMsg);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DLRenewalPhotoNSignatureResponse)) {
            return false;
        }
        DLRenewalPhotoNSignatureResponse dLRenewalPhotoNSignatureResponse = (DLRenewalPhotoNSignatureResponse) other;
        return Intrinsics.areEqual(this.photoDto, dLRenewalPhotoNSignatureResponse.photoDto) && Intrinsics.areEqual(this.responseMsg, dLRenewalPhotoNSignatureResponse.responseMsg);
    }

    public final PhotoDto getPhotoDto() {
        return this.photoDto;
    }

    public final ResponseMsg getResponseMsg() {
        return this.responseMsg;
    }

    public int hashCode() {
        PhotoDto photoDto = this.photoDto;
        int iHashCode = (photoDto == null ? 0 : photoDto.hashCode()) * 31;
        ResponseMsg responseMsg = this.responseMsg;
        return iHashCode + (responseMsg != null ? responseMsg.hashCode() : 0);
    }

    public String toString() {
        return "DLRenewalPhotoNSignatureResponse(photoDto=" + this.photoDto + ", responseMsg=" + this.responseMsg + ')';
    }

    public DLRenewalPhotoNSignatureResponse(PhotoDto photoDto, ResponseMsg responseMsg) {
        this.photoDto = photoDto;
        this.responseMsg = responseMsg;
    }

    public /* synthetic */ DLRenewalPhotoNSignatureResponse(PhotoDto photoDto, ResponseMsg responseMsg, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : photoDto, (i & 2) != 0 ? null : responseMsg);
    }
}
