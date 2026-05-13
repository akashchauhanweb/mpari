package com.nic.mparivahan.Dl.Model;

import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\t¢\u0006\u0002\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J\t\u0010$\u001a\u00020\u000eHÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00100\tHÆ\u0003J[\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\tHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020\u000eHÖ\u0001J\t\u0010,\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019¨\u0006-"}, d2 = {"Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "Ljava/io/Serializable;", "bioImgObj", "Lcom/nic/mparivahan/Dl/Model/BioImgObjX;", "bioObj", "Lcom/nic/mparivahan/Dl/Model/BioObjX;", "dbLoc", "", "dlcovs", "", "Lcom/nic/mparivahan/Dl/Model/Dlcov;", "dlobj", "Lcom/nic/mparivahan/Dl/Model/DlobjX;", "errorcd", "", "transReqObj", "Lcom/nic/mparivahan/Dl/Model/TransReqObj;", "(Lcom/nic/mparivahan/Dl/Model/BioImgObjX;Lcom/nic/mparivahan/Dl/Model/BioObjX;Ljava/lang/String;Ljava/util/List;Lcom/nic/mparivahan/Dl/Model/DlobjX;ILjava/util/List;)V", "getBioImgObj", "()Lcom/nic/mparivahan/Dl/Model/BioImgObjX;", "getBioObj", "()Lcom/nic/mparivahan/Dl/Model/BioObjX;", "getDbLoc", "()Ljava/lang/String;", "getDlcovs", "()Ljava/util/List;", "getDlobj", "()Lcom/nic/mparivahan/Dl/Model/DlobjX;", "getErrorcd", "()I", "getTransReqObj", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DldetobjX implements Serializable {
    private final BioImgObjX bioImgObj;
    private final BioObjX bioObj;
    private final String dbLoc;
    private final List<Dlcov> dlcovs;
    private final DlobjX dlobj;
    private final int errorcd;
    private final List<TransReqObj> transReqObj;

    public DldetobjX(BioImgObjX bioImgObj, BioObjX bioObj, String dbLoc, List<Dlcov> dlcovs, DlobjX dlobj, int i, List<TransReqObj> transReqObj) {
        Intrinsics.checkNotNullParameter(bioImgObj, "bioImgObj");
        Intrinsics.checkNotNullParameter(bioObj, "bioObj");
        Intrinsics.checkNotNullParameter(dbLoc, "dbLoc");
        Intrinsics.checkNotNullParameter(dlcovs, "dlcovs");
        Intrinsics.checkNotNullParameter(dlobj, "dlobj");
        Intrinsics.checkNotNullParameter(transReqObj, "transReqObj");
        this.bioImgObj = bioImgObj;
        this.bioObj = bioObj;
        this.dbLoc = dbLoc;
        this.dlcovs = dlcovs;
        this.dlobj = dlobj;
        this.errorcd = i;
        this.transReqObj = transReqObj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DldetobjX copy$default(DldetobjX dldetobjX, BioImgObjX bioImgObjX, BioObjX bioObjX, String str, List list, DlobjX dlobjX, int i, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bioImgObjX = dldetobjX.bioImgObj;
        }
        if ((i2 & 2) != 0) {
            bioObjX = dldetobjX.bioObj;
        }
        BioObjX bioObjX2 = bioObjX;
        if ((i2 & 4) != 0) {
            str = dldetobjX.dbLoc;
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            list = dldetobjX.dlcovs;
        }
        List list3 = list;
        if ((i2 & 16) != 0) {
            dlobjX = dldetobjX.dlobj;
        }
        DlobjX dlobjX2 = dlobjX;
        if ((i2 & 32) != 0) {
            i = dldetobjX.errorcd;
        }
        int i3 = i;
        if ((i2 & 64) != 0) {
            list2 = dldetobjX.transReqObj;
        }
        return dldetobjX.copy(bioImgObjX, bioObjX2, str2, list3, dlobjX2, i3, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BioImgObjX getBioImgObj() {
        return this.bioImgObj;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BioObjX getBioObj() {
        return this.bioObj;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDbLoc() {
        return this.dbLoc;
    }

    public final List<Dlcov> component4() {
        return this.dlcovs;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DlobjX getDlobj() {
        return this.dlobj;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getErrorcd() {
        return this.errorcd;
    }

    public final List<TransReqObj> component7() {
        return this.transReqObj;
    }

    public final DldetobjX copy(BioImgObjX bioImgObj, BioObjX bioObj, String dbLoc, List<Dlcov> dlcovs, DlobjX dlobj, int errorcd, List<TransReqObj> transReqObj) {
        Intrinsics.checkNotNullParameter(bioImgObj, "bioImgObj");
        Intrinsics.checkNotNullParameter(bioObj, "bioObj");
        Intrinsics.checkNotNullParameter(dbLoc, "dbLoc");
        Intrinsics.checkNotNullParameter(dlcovs, "dlcovs");
        Intrinsics.checkNotNullParameter(dlobj, "dlobj");
        Intrinsics.checkNotNullParameter(transReqObj, "transReqObj");
        return new DldetobjX(bioImgObj, bioObj, dbLoc, dlcovs, dlobj, errorcd, transReqObj);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DldetobjX)) {
            return false;
        }
        DldetobjX dldetobjX = (DldetobjX) other;
        return Intrinsics.areEqual(this.bioImgObj, dldetobjX.bioImgObj) && Intrinsics.areEqual(this.bioObj, dldetobjX.bioObj) && Intrinsics.areEqual(this.dbLoc, dldetobjX.dbLoc) && Intrinsics.areEqual(this.dlcovs, dldetobjX.dlcovs) && Intrinsics.areEqual(this.dlobj, dldetobjX.dlobj) && this.errorcd == dldetobjX.errorcd && Intrinsics.areEqual(this.transReqObj, dldetobjX.transReqObj);
    }

    public final BioImgObjX getBioImgObj() {
        return this.bioImgObj;
    }

    public final BioObjX getBioObj() {
        return this.bioObj;
    }

    public final String getDbLoc() {
        return this.dbLoc;
    }

    public final List<Dlcov> getDlcovs() {
        return this.dlcovs;
    }

    public final DlobjX getDlobj() {
        return this.dlobj;
    }

    public final int getErrorcd() {
        return this.errorcd;
    }

    public final List<TransReqObj> getTransReqObj() {
        return this.transReqObj;
    }

    public int hashCode() {
        return (((((((((((this.bioImgObj.hashCode() * 31) + this.bioObj.hashCode()) * 31) + this.dbLoc.hashCode()) * 31) + this.dlcovs.hashCode()) * 31) + this.dlobj.hashCode()) * 31) + Integer.hashCode(this.errorcd)) * 31) + this.transReqObj.hashCode();
    }

    public String toString() {
        return "DldetobjX(bioImgObj=" + this.bioImgObj + ", bioObj=" + this.bioObj + ", dbLoc=" + this.dbLoc + ", dlcovs=" + this.dlcovs + ", dlobj=" + this.dlobj + ", errorcd=" + this.errorcd + ", transReqObj=" + this.transReqObj + ')';
    }
}
