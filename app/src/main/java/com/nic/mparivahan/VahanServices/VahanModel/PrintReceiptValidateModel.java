package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/PrintReceiptValidateModel;", "", "errorDesc", "", "errorcode", "", "(Ljava/lang/String;I)V", "getErrorDesc", "()Ljava/lang/String;", "getErrorcode", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PrintReceiptValidateModel {
    private final String errorDesc;
    private final int errorcode;

    public PrintReceiptValidateModel(String errorDesc, int i) {
        Intrinsics.checkNotNullParameter(errorDesc, "errorDesc");
        this.errorDesc = errorDesc;
        this.errorcode = i;
    }

    public static /* synthetic */ PrintReceiptValidateModel copy$default(PrintReceiptValidateModel printReceiptValidateModel, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = printReceiptValidateModel.errorDesc;
        }
        if ((i2 & 2) != 0) {
            i = printReceiptValidateModel.errorcode;
        }
        return printReceiptValidateModel.copy(str, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getErrorDesc() {
        return this.errorDesc;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getErrorcode() {
        return this.errorcode;
    }

    public final PrintReceiptValidateModel copy(String errorDesc, int errorcode) {
        Intrinsics.checkNotNullParameter(errorDesc, "errorDesc");
        return new PrintReceiptValidateModel(errorDesc, errorcode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrintReceiptValidateModel)) {
            return false;
        }
        PrintReceiptValidateModel printReceiptValidateModel = (PrintReceiptValidateModel) other;
        return Intrinsics.areEqual(this.errorDesc, printReceiptValidateModel.errorDesc) && this.errorcode == printReceiptValidateModel.errorcode;
    }

    public final String getErrorDesc() {
        return this.errorDesc;
    }

    public final int getErrorcode() {
        return this.errorcode;
    }

    public int hashCode() {
        return (this.errorDesc.hashCode() * 31) + Integer.hashCode(this.errorcode);
    }

    public String toString() {
        return "PrintReceiptValidateModel(errorDesc=" + this.errorDesc + ", errorcode=" + this.errorcode + ')';
    }
}
