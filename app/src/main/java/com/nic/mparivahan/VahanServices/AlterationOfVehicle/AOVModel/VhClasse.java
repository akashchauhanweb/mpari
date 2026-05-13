package com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/nic/mparivahan/VahanServices/AlterationOfVehicle/AOVModel/VhClasse;", "", "classtype", "", "convertibleclasses", "", "descr", "transportcatg", "vhclass", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getClasstype", "()I", "getConvertibleclasses", "()Ljava/lang/String;", "getDescr", "getTransportcatg", "getVhclass", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class VhClasse {
    private final int classtype;
    private final String convertibleclasses;
    private final String descr;
    private final String transportcatg;
    private final int vhclass;

    public VhClasse(int i, String convertibleclasses, String descr, String transportcatg, int i2) {
        Intrinsics.checkNotNullParameter(convertibleclasses, "convertibleclasses");
        Intrinsics.checkNotNullParameter(descr, "descr");
        Intrinsics.checkNotNullParameter(transportcatg, "transportcatg");
        this.classtype = i;
        this.convertibleclasses = convertibleclasses;
        this.descr = descr;
        this.transportcatg = transportcatg;
        this.vhclass = i2;
    }

    public static /* synthetic */ VhClasse copy$default(VhClasse vhClasse, int i, String str, String str2, String str3, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = vhClasse.classtype;
        }
        if ((i3 & 2) != 0) {
            str = vhClasse.convertibleclasses;
        }
        String str4 = str;
        if ((i3 & 4) != 0) {
            str2 = vhClasse.descr;
        }
        String str5 = str2;
        if ((i3 & 8) != 0) {
            str3 = vhClasse.transportcatg;
        }
        String str6 = str3;
        if ((i3 & 16) != 0) {
            i2 = vhClasse.vhclass;
        }
        return vhClasse.copy(i, str4, str5, str6, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getClasstype() {
        return this.classtype;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getConvertibleclasses() {
        return this.convertibleclasses;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescr() {
        return this.descr;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTransportcatg() {
        return this.transportcatg;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getVhclass() {
        return this.vhclass;
    }

    public final VhClasse copy(int classtype, String convertibleclasses, String descr, String transportcatg, int vhclass) {
        Intrinsics.checkNotNullParameter(convertibleclasses, "convertibleclasses");
        Intrinsics.checkNotNullParameter(descr, "descr");
        Intrinsics.checkNotNullParameter(transportcatg, "transportcatg");
        return new VhClasse(classtype, convertibleclasses, descr, transportcatg, vhclass);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VhClasse)) {
            return false;
        }
        VhClasse vhClasse = (VhClasse) other;
        return this.classtype == vhClasse.classtype && Intrinsics.areEqual(this.convertibleclasses, vhClasse.convertibleclasses) && Intrinsics.areEqual(this.descr, vhClasse.descr) && Intrinsics.areEqual(this.transportcatg, vhClasse.transportcatg) && this.vhclass == vhClasse.vhclass;
    }

    public final int getClasstype() {
        return this.classtype;
    }

    public final String getConvertibleclasses() {
        return this.convertibleclasses;
    }

    public final String getDescr() {
        return this.descr;
    }

    public final String getTransportcatg() {
        return this.transportcatg;
    }

    public final int getVhclass() {
        return this.vhclass;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.classtype) * 31) + this.convertibleclasses.hashCode()) * 31) + this.descr.hashCode()) * 31) + this.transportcatg.hashCode()) * 31) + Integer.hashCode(this.vhclass);
    }

    public String toString() {
        return "VhClasse(classtype=" + this.classtype + ", convertibleclasses=" + this.convertibleclasses + ", descr=" + this.descr + ", transportcatg=" + this.transportcatg + ", vhclass=" + this.vhclass + ')';
    }
}
