package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.ToCommonModel2;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/ToCommonModel2/OwnerCatagory;", "", "catgCode", "", "catgDescription", "", "(ILjava/lang/String;)V", "getCatgCode", "()I", "getCatgDescription", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class OwnerCatagory {
    private final int catgCode;
    private final String catgDescription;

    public OwnerCatagory(int i, String catgDescription) {
        Intrinsics.checkNotNullParameter(catgDescription, "catgDescription");
        this.catgCode = i;
        this.catgDescription = catgDescription;
    }

    public static /* synthetic */ OwnerCatagory copy$default(OwnerCatagory ownerCatagory, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = ownerCatagory.catgCode;
        }
        if ((i2 & 2) != 0) {
            str = ownerCatagory.catgDescription;
        }
        return ownerCatagory.copy(i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCatgCode() {
        return this.catgCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCatgDescription() {
        return this.catgDescription;
    }

    public final OwnerCatagory copy(int catgCode, String catgDescription) {
        Intrinsics.checkNotNullParameter(catgDescription, "catgDescription");
        return new OwnerCatagory(catgCode, catgDescription);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OwnerCatagory)) {
            return false;
        }
        OwnerCatagory ownerCatagory = (OwnerCatagory) other;
        return this.catgCode == ownerCatagory.catgCode && Intrinsics.areEqual(this.catgDescription, ownerCatagory.catgDescription);
    }

    public final int getCatgCode() {
        return this.catgCode;
    }

    public final String getCatgDescription() {
        return this.catgDescription;
    }

    public int hashCode() {
        return (Integer.hashCode(this.catgCode) * 31) + this.catgDescription.hashCode();
    }

    public String toString() {
        return "OwnerCatagory(catgCode=" + this.catgCode + ", catgDescription=" + this.catgDescription + ')';
    }
}
