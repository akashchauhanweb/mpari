package com.nic.mparivahan.VahanServices.VahanMultiService.FeeModel;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u0019\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J7\u0010\u0012\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanMultiService/FeeModel/FeeRequest;", "", "purposeCode", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "regn_no", "", "state_cd", "(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V", "getPurposeCode", "()Ljava/util/ArrayList;", "getRegn_no", "()Ljava/lang/String;", "getState_cd", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class FeeRequest {
    private final ArrayList<Integer> purposeCode;
    private final String regn_no;
    private final String state_cd;

    public FeeRequest(ArrayList<Integer> purposeCode, String regn_no, String state_cd) {
        Intrinsics.checkNotNullParameter(purposeCode, "purposeCode");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        this.purposeCode = purposeCode;
        this.regn_no = regn_no;
        this.state_cd = state_cd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeeRequest copy$default(FeeRequest feeRequest, ArrayList arrayList, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = feeRequest.purposeCode;
        }
        if ((i & 2) != 0) {
            str = feeRequest.regn_no;
        }
        if ((i & 4) != 0) {
            str2 = feeRequest.state_cd;
        }
        return feeRequest.copy(arrayList, str, str2);
    }

    public final ArrayList<Integer> component1() {
        return this.purposeCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRegn_no() {
        return this.regn_no;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getState_cd() {
        return this.state_cd;
    }

    public final FeeRequest copy(ArrayList<Integer> purposeCode, String regn_no, String state_cd) {
        Intrinsics.checkNotNullParameter(purposeCode, "purposeCode");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        return new FeeRequest(purposeCode, regn_no, state_cd);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeeRequest)) {
            return false;
        }
        FeeRequest feeRequest = (FeeRequest) other;
        return Intrinsics.areEqual(this.purposeCode, feeRequest.purposeCode) && Intrinsics.areEqual(this.regn_no, feeRequest.regn_no) && Intrinsics.areEqual(this.state_cd, feeRequest.state_cd);
    }

    public final ArrayList<Integer> getPurposeCode() {
        return this.purposeCode;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public int hashCode() {
        return (((this.purposeCode.hashCode() * 31) + this.regn_no.hashCode()) * 31) + this.state_cd.hashCode();
    }

    public String toString() {
        return "FeeRequest(purposeCode=" + this.purposeCode + ", regn_no=" + this.regn_no + ", state_cd=" + this.state_cd + ')';
    }
}
