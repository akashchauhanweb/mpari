package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/NocReasonModleItem;", "", "code", "", "descr", "", "(ILjava/lang/String;)V", "getCode", "()I", "getDescr", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class NocReasonModleItem {
    private final int code;
    private final String descr;

    public NocReasonModleItem(int i, String descr) {
        Intrinsics.checkNotNullParameter(descr, "descr");
        this.code = i;
        this.descr = descr;
    }

    public static /* synthetic */ NocReasonModleItem copy$default(NocReasonModleItem nocReasonModleItem, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = nocReasonModleItem.code;
        }
        if ((i2 & 2) != 0) {
            str = nocReasonModleItem.descr;
        }
        return nocReasonModleItem.copy(i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescr() {
        return this.descr;
    }

    public final NocReasonModleItem copy(int code, String descr) {
        Intrinsics.checkNotNullParameter(descr, "descr");
        return new NocReasonModleItem(code, descr);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NocReasonModleItem)) {
            return false;
        }
        NocReasonModleItem nocReasonModleItem = (NocReasonModleItem) other;
        return this.code == nocReasonModleItem.code && Intrinsics.areEqual(this.descr, nocReasonModleItem.descr);
    }

    public final int getCode() {
        return this.code;
    }

    public final String getDescr() {
        return this.descr;
    }

    public int hashCode() {
        return (Integer.hashCode(this.code) * 31) + this.descr.hashCode();
    }

    public String toString() {
        return "NocReasonModleItem(code=" + this.code + ", descr=" + this.descr + ')';
    }
}
