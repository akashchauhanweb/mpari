package com.nic.mparivahan.VahanServices.VahanMultiService.Model;

import androidx.annotation.Keep;
import com.nic.mparivahan.VahanServices.VahanMultiService.FeeModel.Fees;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/FessMultiModel;", "", "service_name", "", "arrayList", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/FeeModel/Fees;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/util/ArrayList;)V", "getArrayList", "()Ljava/util/ArrayList;", "getService_name", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class FessMultiModel {
    private final ArrayList<Fees> arrayList;
    private final String service_name;

    public FessMultiModel(String service_name, ArrayList<Fees> arrayList) {
        Intrinsics.checkNotNullParameter(service_name, "service_name");
        Intrinsics.checkNotNullParameter(arrayList, "arrayList");
        this.service_name = service_name;
        this.arrayList = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FessMultiModel copy$default(FessMultiModel fessMultiModel, String str, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fessMultiModel.service_name;
        }
        if ((i & 2) != 0) {
            arrayList = fessMultiModel.arrayList;
        }
        return fessMultiModel.copy(str, arrayList);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getService_name() {
        return this.service_name;
    }

    public final ArrayList<Fees> component2() {
        return this.arrayList;
    }

    public final FessMultiModel copy(String service_name, ArrayList<Fees> arrayList) {
        Intrinsics.checkNotNullParameter(service_name, "service_name");
        Intrinsics.checkNotNullParameter(arrayList, "arrayList");
        return new FessMultiModel(service_name, arrayList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FessMultiModel)) {
            return false;
        }
        FessMultiModel fessMultiModel = (FessMultiModel) other;
        return Intrinsics.areEqual(this.service_name, fessMultiModel.service_name) && Intrinsics.areEqual(this.arrayList, fessMultiModel.arrayList);
    }

    public final ArrayList<Fees> getArrayList() {
        return this.arrayList;
    }

    public final String getService_name() {
        return this.service_name;
    }

    public int hashCode() {
        return (this.service_name.hashCode() * 31) + this.arrayList.hashCode();
    }

    public String toString() {
        return "FessMultiModel(service_name=" + this.service_name + ", arrayList=" + this.arrayList + ')';
    }
}
