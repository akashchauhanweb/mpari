package com.nic.mparivahan.DLServicesAuth.Model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J\t\u0010\u001c\u001a\u00020\fHÆ\u0003JA\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\fHÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, d2 = {"Lcom/nic/mparivahan/DLServicesAuth/Model/DLResWithODob;", "", "bioObj", "Lcom/nic/mparivahan/DLServicesAuth/Model/BioObj;", "dbLoc", "", "dlcovs", "", "Lcom/nic/mparivahan/DLServicesAuth/Model/Dlcov;", "dlobj", "Lcom/nic/mparivahan/DLServicesAuth/Model/Dlobj;", "errorcd", "", "(Lcom/nic/mparivahan/DLServicesAuth/Model/BioObj;Ljava/lang/String;Ljava/util/List;Lcom/nic/mparivahan/DLServicesAuth/Model/Dlobj;I)V", "getBioObj", "()Lcom/nic/mparivahan/DLServicesAuth/Model/BioObj;", "getDbLoc", "()Ljava/lang/String;", "getDlcovs", "()Ljava/util/List;", "getDlobj", "()Lcom/nic/mparivahan/DLServicesAuth/Model/Dlobj;", "getErrorcd", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DLResWithODob {
    private final BioObj bioObj;
    private final String dbLoc;
    private final List<Dlcov> dlcovs;
    private final Dlobj dlobj;
    private final int errorcd;

    public DLResWithODob(BioObj bioObj, String dbLoc, List<Dlcov> dlcovs, Dlobj dlobj, int i) {
        Intrinsics.checkNotNullParameter(bioObj, "bioObj");
        Intrinsics.checkNotNullParameter(dbLoc, "dbLoc");
        Intrinsics.checkNotNullParameter(dlcovs, "dlcovs");
        Intrinsics.checkNotNullParameter(dlobj, "dlobj");
        this.bioObj = bioObj;
        this.dbLoc = dbLoc;
        this.dlcovs = dlcovs;
        this.dlobj = dlobj;
        this.errorcd = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DLResWithODob copy$default(DLResWithODob dLResWithODob, BioObj bioObj, String str, List list, Dlobj dlobj, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bioObj = dLResWithODob.bioObj;
        }
        if ((i2 & 2) != 0) {
            str = dLResWithODob.dbLoc;
        }
        String str2 = str;
        if ((i2 & 4) != 0) {
            list = dLResWithODob.dlcovs;
        }
        List list2 = list;
        if ((i2 & 8) != 0) {
            dlobj = dLResWithODob.dlobj;
        }
        Dlobj dlobj2 = dlobj;
        if ((i2 & 16) != 0) {
            i = dLResWithODob.errorcd;
        }
        return dLResWithODob.copy(bioObj, str2, list2, dlobj2, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BioObj getBioObj() {
        return this.bioObj;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDbLoc() {
        return this.dbLoc;
    }

    public final List<Dlcov> component3() {
        return this.dlcovs;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Dlobj getDlobj() {
        return this.dlobj;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getErrorcd() {
        return this.errorcd;
    }

    public final DLResWithODob copy(BioObj bioObj, String dbLoc, List<Dlcov> dlcovs, Dlobj dlobj, int errorcd) {
        Intrinsics.checkNotNullParameter(bioObj, "bioObj");
        Intrinsics.checkNotNullParameter(dbLoc, "dbLoc");
        Intrinsics.checkNotNullParameter(dlcovs, "dlcovs");
        Intrinsics.checkNotNullParameter(dlobj, "dlobj");
        return new DLResWithODob(bioObj, dbLoc, dlcovs, dlobj, errorcd);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DLResWithODob)) {
            return false;
        }
        DLResWithODob dLResWithODob = (DLResWithODob) other;
        return Intrinsics.areEqual(this.bioObj, dLResWithODob.bioObj) && Intrinsics.areEqual(this.dbLoc, dLResWithODob.dbLoc) && Intrinsics.areEqual(this.dlcovs, dLResWithODob.dlcovs) && Intrinsics.areEqual(this.dlobj, dLResWithODob.dlobj) && this.errorcd == dLResWithODob.errorcd;
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

    public int hashCode() {
        return (((((((this.bioObj.hashCode() * 31) + this.dbLoc.hashCode()) * 31) + this.dlcovs.hashCode()) * 31) + this.dlobj.hashCode()) * 31) + Integer.hashCode(this.errorcd);
    }

    public String toString() {
        return "DLResWithODob(bioObj=" + this.bioObj + ", dbLoc=" + this.dbLoc + ", dlcovs=" + this.dlcovs + ", dlobj=" + this.dlobj + ", errorcd=" + this.errorcd + ')';
    }
}
