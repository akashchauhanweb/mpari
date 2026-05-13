package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/DmsUrlModle;", "", "urlDocUpload", "", "(Ljava/lang/String;)V", "getUrlDocUpload", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DmsUrlModle {
    private final String urlDocUpload;

    public DmsUrlModle(String urlDocUpload) {
        Intrinsics.checkNotNullParameter(urlDocUpload, "urlDocUpload");
        this.urlDocUpload = urlDocUpload;
    }

    public static /* synthetic */ DmsUrlModle copy$default(DmsUrlModle dmsUrlModle, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dmsUrlModle.urlDocUpload;
        }
        return dmsUrlModle.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrlDocUpload() {
        return this.urlDocUpload;
    }

    public final DmsUrlModle copy(String urlDocUpload) {
        Intrinsics.checkNotNullParameter(urlDocUpload, "urlDocUpload");
        return new DmsUrlModle(urlDocUpload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DmsUrlModle) && Intrinsics.areEqual(this.urlDocUpload, ((DmsUrlModle) other).urlDocUpload);
    }

    public final String getUrlDocUpload() {
        return this.urlDocUpload;
    }

    public int hashCode() {
        return this.urlDocUpload.hashCode();
    }

    public String toString() {
        return "DmsUrlModle(urlDocUpload=" + this.urlDocUpload + ')';
    }
}
