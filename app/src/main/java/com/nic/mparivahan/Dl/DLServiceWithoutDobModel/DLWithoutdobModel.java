package com.nic.mparivahan.Dl.DLServiceWithoutDobModel;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0011J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010$\u001a\u00020\fHÆ\u0003J\t\u0010%\u001a\u00020\u000eHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003Je\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u000eHÖ\u0001J\t\u0010-\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017¨\u0006."}, d2 = {"Lcom/nic/mparivahan/Dl/DLServiceWithoutDobModel/DLWithoutdobModel;", "", "bioImgObj", "Lcom/nic/mparivahan/Dl/DLServiceWithoutDobModel/BioImgObj;", "bioObj", "Lcom/nic/mparivahan/Dl/DLServiceWithoutDobModel/BioObj;", "dbLoc", "", "dlcovs", "", "Lcom/nic/mparivahan/Dl/DLServiceWithoutDobModel/Dlcov;", "dlobj", "Lcom/nic/mparivahan/Dl/DLServiceWithoutDobModel/Dlobj;", "errorcd", "", "statusDesc", "statusCode", "(Lcom/nic/mparivahan/Dl/DLServiceWithoutDobModel/BioImgObj;Lcom/nic/mparivahan/Dl/DLServiceWithoutDobModel/BioObj;Ljava/lang/String;Ljava/util/List;Lcom/nic/mparivahan/Dl/DLServiceWithoutDobModel/Dlobj;ILjava/lang/String;Ljava/lang/String;)V", "getBioImgObj", "()Lcom/nic/mparivahan/Dl/DLServiceWithoutDobModel/BioImgObj;", "getBioObj", "()Lcom/nic/mparivahan/Dl/DLServiceWithoutDobModel/BioObj;", "getDbLoc", "()Ljava/lang/String;", "getDlcovs", "()Ljava/util/List;", "getDlobj", "()Lcom/nic/mparivahan/Dl/DLServiceWithoutDobModel/Dlobj;", "getErrorcd", "()I", "getStatusCode", "getStatusDesc", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DLWithoutdobModel {
    private final BioImgObj bioImgObj;
    private final BioObj bioObj;
    private final String dbLoc;
    private final List<Dlcov> dlcovs;
    private final Dlobj dlobj;
    private final int errorcd;
    private final String statusCode;
    private final String statusDesc;

    public DLWithoutdobModel(BioImgObj bioImgObj, BioObj bioObj, String dbLoc, List<Dlcov> dlcovs, Dlobj dlobj, int i, String str, String str2) {
        Intrinsics.checkNotNullParameter(bioObj, "bioObj");
        Intrinsics.checkNotNullParameter(dbLoc, "dbLoc");
        Intrinsics.checkNotNullParameter(dlcovs, "dlcovs");
        Intrinsics.checkNotNullParameter(dlobj, "dlobj");
        this.bioImgObj = bioImgObj;
        this.bioObj = bioObj;
        this.dbLoc = dbLoc;
        this.dlcovs = dlcovs;
        this.dlobj = dlobj;
        this.errorcd = i;
        this.statusDesc = str;
        this.statusCode = str2;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BioImgObj getBioImgObj() {
        return this.bioImgObj;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BioObj getBioObj() {
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
    public final Dlobj getDlobj() {
        return this.dlobj;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getErrorcd() {
        return this.errorcd;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getStatusDesc() {
        return this.statusDesc;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getStatusCode() {
        return this.statusCode;
    }

    public final DLWithoutdobModel copy(BioImgObj bioImgObj, BioObj bioObj, String dbLoc, List<Dlcov> dlcovs, Dlobj dlobj, int errorcd, String statusDesc, String statusCode) {
        Intrinsics.checkNotNullParameter(bioObj, "bioObj");
        Intrinsics.checkNotNullParameter(dbLoc, "dbLoc");
        Intrinsics.checkNotNullParameter(dlcovs, "dlcovs");
        Intrinsics.checkNotNullParameter(dlobj, "dlobj");
        return new DLWithoutdobModel(bioImgObj, bioObj, dbLoc, dlcovs, dlobj, errorcd, statusDesc, statusCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DLWithoutdobModel)) {
            return false;
        }
        DLWithoutdobModel dLWithoutdobModel = (DLWithoutdobModel) other;
        return Intrinsics.areEqual(this.bioImgObj, dLWithoutdobModel.bioImgObj) && Intrinsics.areEqual(this.bioObj, dLWithoutdobModel.bioObj) && Intrinsics.areEqual(this.dbLoc, dLWithoutdobModel.dbLoc) && Intrinsics.areEqual(this.dlcovs, dLWithoutdobModel.dlcovs) && Intrinsics.areEqual(this.dlobj, dLWithoutdobModel.dlobj) && this.errorcd == dLWithoutdobModel.errorcd && Intrinsics.areEqual(this.statusDesc, dLWithoutdobModel.statusDesc) && Intrinsics.areEqual(this.statusCode, dLWithoutdobModel.statusCode);
    }

    public final BioImgObj getBioImgObj() {
        return this.bioImgObj;
    }

    public final BioObj getBioObj() {
        return this.bioObj;
    }

    public final String getDbLoc() {
        return this.dbLoc;
    }

    public final List<Dlcov> getDlcovs() {
        return this.dlcovs;
    }

    public final Dlobj getDlobj() {
        return this.dlobj;
    }

    public final int getErrorcd() {
        return this.errorcd;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        BioImgObj bioImgObj = this.bioImgObj;
        int iHashCode = (((((((((((bioImgObj == null ? 0 : bioImgObj.hashCode()) * 31) + this.bioObj.hashCode()) * 31) + this.dbLoc.hashCode()) * 31) + this.dlcovs.hashCode()) * 31) + this.dlobj.hashCode()) * 31) + Integer.hashCode(this.errorcd)) * 31;
        String str = this.statusDesc;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.statusCode;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "DLWithoutdobModel(bioImgObj=" + this.bioImgObj + ", bioObj=" + this.bioObj + ", dbLoc=" + this.dbLoc + ", dlcovs=" + this.dlcovs + ", dlobj=" + this.dlobj + ", errorcd=" + this.errorcd + ", statusDesc=" + this.statusDesc + ", statusCode=" + this.statusCode + ')';
    }
}
