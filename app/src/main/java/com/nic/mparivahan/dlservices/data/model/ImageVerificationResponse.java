package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/ImageVerificationResponse;", "", "responseMsg", "Lcom/nic/mparivahan/dlservices/data/model/ImgResponseMsg;", "(Lcom/nic/mparivahan/dlservices/data/model/ImgResponseMsg;)V", "getResponseMsg", "()Lcom/nic/mparivahan/dlservices/data/model/ImgResponseMsg;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ImageVerificationResponse {

    @xy5("responseMsg")
    private final ImgResponseMsg responseMsg;

    public ImageVerificationResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ImageVerificationResponse copy$default(ImageVerificationResponse imageVerificationResponse, ImgResponseMsg imgResponseMsg, int i, Object obj) {
        if ((i & 1) != 0) {
            imgResponseMsg = imageVerificationResponse.responseMsg;
        }
        return imageVerificationResponse.copy(imgResponseMsg);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ImgResponseMsg getResponseMsg() {
        return this.responseMsg;
    }

    public final ImageVerificationResponse copy(ImgResponseMsg responseMsg) {
        return new ImageVerificationResponse(responseMsg);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ImageVerificationResponse) && Intrinsics.areEqual(this.responseMsg, ((ImageVerificationResponse) other).responseMsg);
    }

    public final ImgResponseMsg getResponseMsg() {
        return this.responseMsg;
    }

    public int hashCode() {
        ImgResponseMsg imgResponseMsg = this.responseMsg;
        if (imgResponseMsg == null) {
            return 0;
        }
        return imgResponseMsg.hashCode();
    }

    public String toString() {
        return "ImageVerificationResponse(responseMsg=" + this.responseMsg + ')';
    }

    public ImageVerificationResponse(ImgResponseMsg imgResponseMsg) {
        this.responseMsg = imgResponseMsg;
    }

    public /* synthetic */ ImageVerificationResponse(ImgResponseMsg imgResponseMsg, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : imgResponseMsg);
    }
}
