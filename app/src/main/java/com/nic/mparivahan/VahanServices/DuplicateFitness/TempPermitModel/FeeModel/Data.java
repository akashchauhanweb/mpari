package com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.FeeModel;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\nJ\u001d\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003JK\u0010\u0015\u001a\u00020\u00002\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001R%\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/nic/mparivahan/VahanServices/DuplicateFitness/TempPermitModel/FeeModel/Data;", "", "feeDobj", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/TempPermitModel/FeeModel/FeeDobj;", "Lkotlin/collections/ArrayList;", "sumOfFee", "", "sumOfFine", "sumOfTotal", "(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFeeDobj", "()Ljava/util/ArrayList;", "getSumOfFee", "()Ljava/lang/String;", "getSumOfFine", "getSumOfTotal", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Data {
    private final ArrayList<FeeDobj> feeDobj;
    private final String sumOfFee;
    private final String sumOfFine;
    private final String sumOfTotal;

    public Data(ArrayList<FeeDobj> arrayList, String str, String str2, String str3) {
        this.feeDobj = arrayList;
        this.sumOfFee = str;
        this.sumOfFine = str2;
        this.sumOfTotal = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Data copy$default(Data data, ArrayList arrayList, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = data.feeDobj;
        }
        if ((i & 2) != 0) {
            str = data.sumOfFee;
        }
        if ((i & 4) != 0) {
            str2 = data.sumOfFine;
        }
        if ((i & 8) != 0) {
            str3 = data.sumOfTotal;
        }
        return data.copy(arrayList, str, str2, str3);
    }

    public final ArrayList<FeeDobj> component1() {
        return this.feeDobj;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSumOfFee() {
        return this.sumOfFee;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSumOfFine() {
        return this.sumOfFine;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSumOfTotal() {
        return this.sumOfTotal;
    }

    public final Data copy(ArrayList<FeeDobj> feeDobj, String sumOfFee, String sumOfFine, String sumOfTotal) {
        return new Data(feeDobj, sumOfFee, sumOfFine, sumOfTotal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Data)) {
            return false;
        }
        Data data = (Data) other;
        return Intrinsics.areEqual(this.feeDobj, data.feeDobj) && Intrinsics.areEqual(this.sumOfFee, data.sumOfFee) && Intrinsics.areEqual(this.sumOfFine, data.sumOfFine) && Intrinsics.areEqual(this.sumOfTotal, data.sumOfTotal);
    }

    public final ArrayList<FeeDobj> getFeeDobj() {
        return this.feeDobj;
    }

    public final String getSumOfFee() {
        return this.sumOfFee;
    }

    public final String getSumOfFine() {
        return this.sumOfFine;
    }

    public final String getSumOfTotal() {
        return this.sumOfTotal;
    }

    public int hashCode() {
        ArrayList<FeeDobj> arrayList = this.feeDobj;
        int iHashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
        String str = this.sumOfFee;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sumOfFine;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sumOfTotal;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "Data(feeDobj=" + this.feeDobj + ", sumOfFee=" + this.sumOfFee + ", sumOfFine=" + this.sumOfFine + ", sumOfTotal=" + this.sumOfTotal + ')';
    }
}
