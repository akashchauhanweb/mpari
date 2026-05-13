package com.nic.mparivahan.VahanServices.VahanMultiService.FeeModel;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BO\u00120\u0010\u0002\u001a,\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0003j\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0018\u0001`\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ3\u0010\u0013\u001a,\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0003j\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0018\u0001`\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\nHÆ\u0003J[\u0010\u0017\u001a\u00020\u000022\b\u0002\u0010\u0002\u001a,\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0003j\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0018\u0001`\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\nHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001R;\u0010\u0002\u001a,\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0003j\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0018\u0001`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanMultiService/FeeModel/FeesResponse;", "", "feesList", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/FeeModel/Fees;", "Lkotlin/collections/ArrayList;", "regn_no", "", "state_cd", "totalAmount", "", "(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;I)V", "getFeesList", "()Ljava/util/ArrayList;", "getRegn_no", "()Ljava/lang/String;", "getState_cd", "getTotalAmount", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class FeesResponse {
    private final ArrayList<ArrayList<Fees>> feesList;
    private final String regn_no;
    private final String state_cd;
    private final int totalAmount;

    public FeesResponse(ArrayList<ArrayList<Fees>> arrayList, String regn_no, String state_cd, int i) {
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        this.feesList = arrayList;
        this.regn_no = regn_no;
        this.state_cd = state_cd;
        this.totalAmount = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeesResponse copy$default(FeesResponse feesResponse, ArrayList arrayList, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            arrayList = feesResponse.feesList;
        }
        if ((i2 & 2) != 0) {
            str = feesResponse.regn_no;
        }
        if ((i2 & 4) != 0) {
            str2 = feesResponse.state_cd;
        }
        if ((i2 & 8) != 0) {
            i = feesResponse.totalAmount;
        }
        return feesResponse.copy(arrayList, str, str2, i);
    }

    public final ArrayList<ArrayList<Fees>> component1() {
        return this.feesList;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRegn_no() {
        return this.regn_no;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getState_cd() {
        return this.state_cd;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTotalAmount() {
        return this.totalAmount;
    }

    public final FeesResponse copy(ArrayList<ArrayList<Fees>> feesList, String regn_no, String state_cd, int totalAmount) {
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        return new FeesResponse(feesList, regn_no, state_cd, totalAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeesResponse)) {
            return false;
        }
        FeesResponse feesResponse = (FeesResponse) other;
        return Intrinsics.areEqual(this.feesList, feesResponse.feesList) && Intrinsics.areEqual(this.regn_no, feesResponse.regn_no) && Intrinsics.areEqual(this.state_cd, feesResponse.state_cd) && this.totalAmount == feesResponse.totalAmount;
    }

    public final ArrayList<ArrayList<Fees>> getFeesList() {
        return this.feesList;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public final int getTotalAmount() {
        return this.totalAmount;
    }

    public int hashCode() {
        ArrayList<ArrayList<Fees>> arrayList = this.feesList;
        return ((((((arrayList == null ? 0 : arrayList.hashCode()) * 31) + this.regn_no.hashCode()) * 31) + this.state_cd.hashCode()) * 31) + Integer.hashCode(this.totalAmount);
    }

    public String toString() {
        return "FeesResponse(feesList=" + this.feesList + ", regn_no=" + this.regn_no + ", state_cd=" + this.state_cd + ", totalAmount=" + this.totalAmount + ')';
    }
}
