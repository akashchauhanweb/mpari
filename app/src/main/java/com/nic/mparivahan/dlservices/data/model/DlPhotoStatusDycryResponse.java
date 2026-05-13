package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import com.zepto.xy5;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/DlPhotoStatusDycryResponse;", "Ljava/io/Serializable;", "responseMsg", "Lcom/nic/mparivahan/dlservices/data/model/ResponseMsg;", "photoDto", "Lcom/nic/mparivahan/dlservices/data/model/PhotoDto;", "(Lcom/nic/mparivahan/dlservices/data/model/ResponseMsg;Lcom/nic/mparivahan/dlservices/data/model/PhotoDto;)V", "getPhotoDto", "()Lcom/nic/mparivahan/dlservices/data/model/PhotoDto;", "getResponseMsg", "()Lcom/nic/mparivahan/dlservices/data/model/ResponseMsg;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DlPhotoStatusDycryResponse implements Serializable {

    @xy5("photoDto")
    private final PhotoDto photoDto;

    @xy5("responseMsg")
    private final ResponseMsg responseMsg;

    public DlPhotoStatusDycryResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DlPhotoStatusDycryResponse copy$default(DlPhotoStatusDycryResponse dlPhotoStatusDycryResponse, ResponseMsg responseMsg, PhotoDto photoDto, int i, Object obj) {
        if ((i & 1) != 0) {
            responseMsg = dlPhotoStatusDycryResponse.responseMsg;
        }
        if ((i & 2) != 0) {
            photoDto = dlPhotoStatusDycryResponse.photoDto;
        }
        return dlPhotoStatusDycryResponse.copy(responseMsg, photoDto);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ResponseMsg getResponseMsg() {
        return this.responseMsg;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PhotoDto getPhotoDto() {
        return this.photoDto;
    }

    public final DlPhotoStatusDycryResponse copy(ResponseMsg responseMsg, PhotoDto photoDto) {
        return new DlPhotoStatusDycryResponse(responseMsg, photoDto);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DlPhotoStatusDycryResponse)) {
            return false;
        }
        DlPhotoStatusDycryResponse dlPhotoStatusDycryResponse = (DlPhotoStatusDycryResponse) other;
        return Intrinsics.areEqual(this.responseMsg, dlPhotoStatusDycryResponse.responseMsg) && Intrinsics.areEqual(this.photoDto, dlPhotoStatusDycryResponse.photoDto);
    }

    public final PhotoDto getPhotoDto() {
        return this.photoDto;
    }

    public final ResponseMsg getResponseMsg() {
        return this.responseMsg;
    }

    public int hashCode() {
        ResponseMsg responseMsg = this.responseMsg;
        int iHashCode = (responseMsg == null ? 0 : responseMsg.hashCode()) * 31;
        PhotoDto photoDto = this.photoDto;
        return iHashCode + (photoDto != null ? photoDto.hashCode() : 0);
    }

    public String toString() {
        return "DlPhotoStatusDycryResponse(responseMsg=" + this.responseMsg + ", photoDto=" + this.photoDto + ')';
    }

    public DlPhotoStatusDycryResponse(ResponseMsg responseMsg, PhotoDto photoDto) {
        this.responseMsg = responseMsg;
        this.photoDto = photoDto;
    }

    public /* synthetic */ DlPhotoStatusDycryResponse(ResponseMsg responseMsg, PhotoDto photoDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : responseMsg, (i & 2) != 0 ? null : photoDto);
    }
}
