package com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel;

import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001Bo\u00120\u0010\u0002\u001a,\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0003j\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0018\u0001`\u0005\u0012\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0002\u0010\fJ3\u0010\u0015\u001a,\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0003j\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0018\u0001`\u0005HÆ\u0003J\u001d\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J}\u0010\u001a\u001a\u00020\u000022\b\u0002\u0010\u0002\u001a,\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0003j\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0018\u0001`\u00052\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001J\t\u0010 \u001a\u00020\tHÖ\u0001R;\u0010\u0002\u001a,\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0003j\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0018\u0001`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR%\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanMultiService/BeforePaymentModel/MultiServiceDto;", "Ljava/io/Serializable;", "feesList", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/BeforePaymentModel/Fees;", "Lkotlin/collections/ArrayList;", "purposeCode", "", "regn_no", "", "state_cd", "totalAmount", "(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;I)V", "getFeesList", "()Ljava/util/ArrayList;", "getPurposeCode", "getRegn_no", "()Ljava/lang/String;", "getState_cd", "getTotalAmount", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class MultiServiceDto implements Serializable {
    private final ArrayList<ArrayList<Fees>> feesList;
    private final ArrayList<Integer> purposeCode;
    private final String regn_no;
    private final String state_cd;
    private final int totalAmount;

    public MultiServiceDto(ArrayList<ArrayList<Fees>> arrayList, ArrayList<Integer> arrayList2, String str, String str2, int i) {
        this.feesList = arrayList;
        this.purposeCode = arrayList2;
        this.regn_no = str;
        this.state_cd = str2;
        this.totalAmount = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MultiServiceDto copy$default(MultiServiceDto multiServiceDto, ArrayList arrayList, ArrayList arrayList2, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            arrayList = multiServiceDto.feesList;
        }
        if ((i2 & 2) != 0) {
            arrayList2 = multiServiceDto.purposeCode;
        }
        ArrayList arrayList3 = arrayList2;
        if ((i2 & 4) != 0) {
            str = multiServiceDto.regn_no;
        }
        String str3 = str;
        if ((i2 & 8) != 0) {
            str2 = multiServiceDto.state_cd;
        }
        String str4 = str2;
        if ((i2 & 16) != 0) {
            i = multiServiceDto.totalAmount;
        }
        return multiServiceDto.copy(arrayList, arrayList3, str3, str4, i);
    }

    public final ArrayList<ArrayList<Fees>> component1() {
        return this.feesList;
    }

    public final ArrayList<Integer> component2() {
        return this.purposeCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRegn_no() {
        return this.regn_no;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getState_cd() {
        return this.state_cd;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getTotalAmount() {
        return this.totalAmount;
    }

    public final MultiServiceDto copy(ArrayList<ArrayList<Fees>> feesList, ArrayList<Integer> purposeCode, String regn_no, String state_cd, int totalAmount) {
        return new MultiServiceDto(feesList, purposeCode, regn_no, state_cd, totalAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiServiceDto)) {
            return false;
        }
        MultiServiceDto multiServiceDto = (MultiServiceDto) other;
        return Intrinsics.areEqual(this.feesList, multiServiceDto.feesList) && Intrinsics.areEqual(this.purposeCode, multiServiceDto.purposeCode) && Intrinsics.areEqual(this.regn_no, multiServiceDto.regn_no) && Intrinsics.areEqual(this.state_cd, multiServiceDto.state_cd) && this.totalAmount == multiServiceDto.totalAmount;
    }

    public final ArrayList<ArrayList<Fees>> getFeesList() {
        return this.feesList;
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

    public final int getTotalAmount() {
        return this.totalAmount;
    }

    public int hashCode() {
        ArrayList<ArrayList<Fees>> arrayList = this.feesList;
        int iHashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
        ArrayList<Integer> arrayList2 = this.purposeCode;
        int iHashCode2 = (iHashCode + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
        String str = this.regn_no;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.state_cd;
        return ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.totalAmount);
    }

    public String toString() {
        return "MultiServiceDto(feesList=" + this.feesList + ", purposeCode=" + this.purposeCode + ", regn_no=" + this.regn_no + ", state_cd=" + this.state_cd + ", totalAmount=" + this.totalAmount + ')';
    }
}
