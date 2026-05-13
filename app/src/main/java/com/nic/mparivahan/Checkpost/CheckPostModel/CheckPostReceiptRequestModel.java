package com.nic.mparivahan.Checkpost.CheckPostModel;

import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/nic/mparivahan/Checkpost/CheckPostModel/CheckPostReceiptRequestModel;", "", "rcptNo", "", "(Ljava/lang/String;)V", "getRcptNo", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CheckPostReceiptRequestModel {

    @xy5("rcptNo")
    private final String rcptNo;

    public CheckPostReceiptRequestModel(String rcptNo) {
        Intrinsics.checkNotNullParameter(rcptNo, "rcptNo");
        this.rcptNo = rcptNo;
    }

    public static /* synthetic */ CheckPostReceiptRequestModel copy$default(CheckPostReceiptRequestModel checkPostReceiptRequestModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkPostReceiptRequestModel.rcptNo;
        }
        return checkPostReceiptRequestModel.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRcptNo() {
        return this.rcptNo;
    }

    public final CheckPostReceiptRequestModel copy(String rcptNo) {
        Intrinsics.checkNotNullParameter(rcptNo, "rcptNo");
        return new CheckPostReceiptRequestModel(rcptNo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CheckPostReceiptRequestModel) && Intrinsics.areEqual(this.rcptNo, ((CheckPostReceiptRequestModel) other).rcptNo);
    }

    public final String getRcptNo() {
        return this.rcptNo;
    }

    public int hashCode() {
        return this.rcptNo.hashCode();
    }

    public String toString() {
        return "CheckPostReceiptRequestModel(rcptNo=" + this.rcptNo + ')';
    }
}
