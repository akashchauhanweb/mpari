package com.nic.mparivahan.dlservices.newlearner.DataClass;

import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/nic/mparivahan/dlservices/newlearner/DataClass/CheckPhotoSignResponseModal;", "", "photo", "", "signature", "(Ljava/lang/String;Ljava/lang/String;)V", "getPhoto", "()Ljava/lang/String;", "setPhoto", "(Ljava/lang/String;)V", "getSignature", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CheckPhotoSignResponseModal {

    @xy5("photo")
    private String photo;

    @xy5("signature")
    private final String signature;

    public CheckPhotoSignResponseModal() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CheckPhotoSignResponseModal copy$default(CheckPhotoSignResponseModal checkPhotoSignResponseModal, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkPhotoSignResponseModal.photo;
        }
        if ((i & 2) != 0) {
            str2 = checkPhotoSignResponseModal.signature;
        }
        return checkPhotoSignResponseModal.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPhoto() {
        return this.photo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSignature() {
        return this.signature;
    }

    public final CheckPhotoSignResponseModal copy(String photo, String signature) {
        Intrinsics.checkNotNullParameter(photo, "photo");
        Intrinsics.checkNotNullParameter(signature, "signature");
        return new CheckPhotoSignResponseModal(photo, signature);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckPhotoSignResponseModal)) {
            return false;
        }
        CheckPhotoSignResponseModal checkPhotoSignResponseModal = (CheckPhotoSignResponseModal) other;
        return Intrinsics.areEqual(this.photo, checkPhotoSignResponseModal.photo) && Intrinsics.areEqual(this.signature, checkPhotoSignResponseModal.signature);
    }

    public final String getPhoto() {
        return this.photo;
    }

    public final String getSignature() {
        return this.signature;
    }

    public int hashCode() {
        return (this.photo.hashCode() * 31) + this.signature.hashCode();
    }

    public final void setPhoto(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.photo = str;
    }

    public String toString() {
        return "CheckPhotoSignResponseModal(photo=" + this.photo + ", signature=" + this.signature + ')';
    }

    public CheckPhotoSignResponseModal(String photo, String signature) {
        Intrinsics.checkNotNullParameter(photo, "photo");
        Intrinsics.checkNotNullParameter(signature, "signature");
        this.photo = photo;
        this.signature = signature;
    }

    public /* synthetic */ CheckPhotoSignResponseModal(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
