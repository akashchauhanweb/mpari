package com.nic.mparivahan.Echallan.Model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/nic/mparivahan/Echallan/Model/TransferredCourtDataModel;", "", "challan_no", "", "(Ljava/lang/String;)V", "getChallan_no", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class TransferredCourtDataModel {
    private final String challan_no;

    public TransferredCourtDataModel(String challan_no) {
        Intrinsics.checkNotNullParameter(challan_no, "challan_no");
        this.challan_no = challan_no;
    }

    public static /* synthetic */ TransferredCourtDataModel copy$default(TransferredCourtDataModel transferredCourtDataModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transferredCourtDataModel.challan_no;
        }
        return transferredCourtDataModel.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChallan_no() {
        return this.challan_no;
    }

    public final TransferredCourtDataModel copy(String challan_no) {
        Intrinsics.checkNotNullParameter(challan_no, "challan_no");
        return new TransferredCourtDataModel(challan_no);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TransferredCourtDataModel) && Intrinsics.areEqual(this.challan_no, ((TransferredCourtDataModel) other).challan_no);
    }

    public final String getChallan_no() {
        return this.challan_no;
    }

    public int hashCode() {
        return this.challan_no.hashCode();
    }

    public String toString() {
        return "TransferredCourtDataModel(challan_no=" + this.challan_no + ')';
    }
}
