package com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVModel;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0006j\b\u0012\u0004\u0012\u00020\n`\b\u0012\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0006j\b\u0012\u0004\u0012\u00020\f`\b\u0012\u0006\u0010\r\u001a\u00020\u0001¢\u0006\u0002\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0001HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0004HÆ\u0003J\u0019\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bHÆ\u0003J\u0019\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0006j\b\u0012\u0004\u0012\u00020\n`\bHÆ\u0003J\u0019\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0006j\b\u0012\u0004\u0012\u00020\f`\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0001HÆ\u0003Ju\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0006j\b\u0012\u0004\u0012\u00020\n`\b2\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0006j\b\u0012\u0004\u0012\u00020\f`\b2\b\b\u0002\u0010\r\u001a\u00020\u0001HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R!\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R!\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0006j\b\u0012\u0004\u0012\u00020\n`\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R!\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0006j\b\u0012\u0004\u0012\u00020\f`\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\r\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010¨\u0006&"}, d2 = {"Lcom/nic/mparivahan/VahanServices/AlterationOfVehicle/AOVModel/Data;", "", "evAlterationOfVehicle", "ownerInfo", "Lcom/nic/mparivahan/VahanServices/AlterationOfVehicle/AOVModel/OwnerInfo;", "vhClasses", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/VahanServices/AlterationOfVehicle/AOVModel/VhClasse;", "Lkotlin/collections/ArrayList;", "vmFuel", "Lcom/nic/mparivahan/VahanServices/AlterationOfVehicle/AOVModel/VmFuel;", "vmVchCatgs", "Lcom/nic/mparivahan/VahanServices/AlterationOfVehicle/AOVModel/VmVchCatg;", "vtRetrofittingDtlsAppl", "(Ljava/lang/Object;Lcom/nic/mparivahan/VahanServices/AlterationOfVehicle/AOVModel/OwnerInfo;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/Object;)V", "getEvAlterationOfVehicle", "()Ljava/lang/Object;", "getOwnerInfo", "()Lcom/nic/mparivahan/VahanServices/AlterationOfVehicle/AOVModel/OwnerInfo;", "getVhClasses", "()Ljava/util/ArrayList;", "getVmFuel", "getVmVchCatgs", "getVtRetrofittingDtlsAppl", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Data {
    private final Object evAlterationOfVehicle;
    private final OwnerInfo ownerInfo;
    private final ArrayList<VhClasse> vhClasses;
    private final ArrayList<VmFuel> vmFuel;
    private final ArrayList<VmVchCatg> vmVchCatgs;
    private final Object vtRetrofittingDtlsAppl;

    public Data(Object evAlterationOfVehicle, OwnerInfo ownerInfo, ArrayList<VhClasse> vhClasses, ArrayList<VmFuel> vmFuel, ArrayList<VmVchCatg> vmVchCatgs, Object vtRetrofittingDtlsAppl) {
        Intrinsics.checkNotNullParameter(evAlterationOfVehicle, "evAlterationOfVehicle");
        Intrinsics.checkNotNullParameter(ownerInfo, "ownerInfo");
        Intrinsics.checkNotNullParameter(vhClasses, "vhClasses");
        Intrinsics.checkNotNullParameter(vmFuel, "vmFuel");
        Intrinsics.checkNotNullParameter(vmVchCatgs, "vmVchCatgs");
        Intrinsics.checkNotNullParameter(vtRetrofittingDtlsAppl, "vtRetrofittingDtlsAppl");
        this.evAlterationOfVehicle = evAlterationOfVehicle;
        this.ownerInfo = ownerInfo;
        this.vhClasses = vhClasses;
        this.vmFuel = vmFuel;
        this.vmVchCatgs = vmVchCatgs;
        this.vtRetrofittingDtlsAppl = vtRetrofittingDtlsAppl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Data copy$default(Data data, Object obj, OwnerInfo ownerInfo, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = data.evAlterationOfVehicle;
        }
        if ((i & 2) != 0) {
            ownerInfo = data.ownerInfo;
        }
        OwnerInfo ownerInfo2 = ownerInfo;
        if ((i & 4) != 0) {
            arrayList = data.vhClasses;
        }
        ArrayList arrayList4 = arrayList;
        if ((i & 8) != 0) {
            arrayList2 = data.vmFuel;
        }
        ArrayList arrayList5 = arrayList2;
        if ((i & 16) != 0) {
            arrayList3 = data.vmVchCatgs;
        }
        ArrayList arrayList6 = arrayList3;
        if ((i & 32) != 0) {
            obj2 = data.vtRetrofittingDtlsAppl;
        }
        return data.copy(obj, ownerInfo2, arrayList4, arrayList5, arrayList6, obj2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Object getEvAlterationOfVehicle() {
        return this.evAlterationOfVehicle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OwnerInfo getOwnerInfo() {
        return this.ownerInfo;
    }

    public final ArrayList<VhClasse> component3() {
        return this.vhClasses;
    }

    public final ArrayList<VmFuel> component4() {
        return this.vmFuel;
    }

    public final ArrayList<VmVchCatg> component5() {
        return this.vmVchCatgs;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Object getVtRetrofittingDtlsAppl() {
        return this.vtRetrofittingDtlsAppl;
    }

    public final Data copy(Object evAlterationOfVehicle, OwnerInfo ownerInfo, ArrayList<VhClasse> vhClasses, ArrayList<VmFuel> vmFuel, ArrayList<VmVchCatg> vmVchCatgs, Object vtRetrofittingDtlsAppl) {
        Intrinsics.checkNotNullParameter(evAlterationOfVehicle, "evAlterationOfVehicle");
        Intrinsics.checkNotNullParameter(ownerInfo, "ownerInfo");
        Intrinsics.checkNotNullParameter(vhClasses, "vhClasses");
        Intrinsics.checkNotNullParameter(vmFuel, "vmFuel");
        Intrinsics.checkNotNullParameter(vmVchCatgs, "vmVchCatgs");
        Intrinsics.checkNotNullParameter(vtRetrofittingDtlsAppl, "vtRetrofittingDtlsAppl");
        return new Data(evAlterationOfVehicle, ownerInfo, vhClasses, vmFuel, vmVchCatgs, vtRetrofittingDtlsAppl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Data)) {
            return false;
        }
        Data data = (Data) other;
        return Intrinsics.areEqual(this.evAlterationOfVehicle, data.evAlterationOfVehicle) && Intrinsics.areEqual(this.ownerInfo, data.ownerInfo) && Intrinsics.areEqual(this.vhClasses, data.vhClasses) && Intrinsics.areEqual(this.vmFuel, data.vmFuel) && Intrinsics.areEqual(this.vmVchCatgs, data.vmVchCatgs) && Intrinsics.areEqual(this.vtRetrofittingDtlsAppl, data.vtRetrofittingDtlsAppl);
    }

    public final Object getEvAlterationOfVehicle() {
        return this.evAlterationOfVehicle;
    }

    public final OwnerInfo getOwnerInfo() {
        return this.ownerInfo;
    }

    public final ArrayList<VhClasse> getVhClasses() {
        return this.vhClasses;
    }

    public final ArrayList<VmFuel> getVmFuel() {
        return this.vmFuel;
    }

    public final ArrayList<VmVchCatg> getVmVchCatgs() {
        return this.vmVchCatgs;
    }

    public final Object getVtRetrofittingDtlsAppl() {
        return this.vtRetrofittingDtlsAppl;
    }

    public int hashCode() {
        return (((((((((this.evAlterationOfVehicle.hashCode() * 31) + this.ownerInfo.hashCode()) * 31) + this.vhClasses.hashCode()) * 31) + this.vmFuel.hashCode()) * 31) + this.vmVchCatgs.hashCode()) * 31) + this.vtRetrofittingDtlsAppl.hashCode();
    }

    public String toString() {
        return "Data(evAlterationOfVehicle=" + this.evAlterationOfVehicle + ", ownerInfo=" + this.ownerInfo + ", vhClasses=" + this.vhClasses + ", vmFuel=" + this.vmFuel + ", vmVchCatgs=" + this.vmVchCatgs + ", vtRetrofittingDtlsAppl=" + this.vtRetrofittingDtlsAppl + ')';
    }
}
