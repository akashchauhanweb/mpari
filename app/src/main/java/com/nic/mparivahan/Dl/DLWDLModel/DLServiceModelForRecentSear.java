package com.nic.mparivahan.Dl.DLWDLModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/nic/mparivahan/Dl/DLWDLModel/DLServiceModelForRecentSear;", "", "bioObj", "Lcom/nic/mparivahan/Dl/DLWDLModel/BioObj;", "errorcd", "", "(Lcom/nic/mparivahan/Dl/DLWDLModel/BioObj;I)V", "getBioObj", "()Lcom/nic/mparivahan/Dl/DLWDLModel/BioObj;", "getErrorcd", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DLServiceModelForRecentSear {
    private final BioObj bioObj;
    private final int errorcd;

    public DLServiceModelForRecentSear(BioObj bioObj, int i) {
        Intrinsics.checkNotNullParameter(bioObj, "bioObj");
        this.bioObj = bioObj;
        this.errorcd = i;
    }

    public static /* synthetic */ DLServiceModelForRecentSear copy$default(DLServiceModelForRecentSear dLServiceModelForRecentSear, BioObj bioObj, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bioObj = dLServiceModelForRecentSear.bioObj;
        }
        if ((i2 & 2) != 0) {
            i = dLServiceModelForRecentSear.errorcd;
        }
        return dLServiceModelForRecentSear.copy(bioObj, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BioObj getBioObj() {
        return this.bioObj;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getErrorcd() {
        return this.errorcd;
    }

    public final DLServiceModelForRecentSear copy(BioObj bioObj, int errorcd) {
        Intrinsics.checkNotNullParameter(bioObj, "bioObj");
        return new DLServiceModelForRecentSear(bioObj, errorcd);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DLServiceModelForRecentSear)) {
            return false;
        }
        DLServiceModelForRecentSear dLServiceModelForRecentSear = (DLServiceModelForRecentSear) other;
        return Intrinsics.areEqual(this.bioObj, dLServiceModelForRecentSear.bioObj) && this.errorcd == dLServiceModelForRecentSear.errorcd;
    }

    public final BioObj getBioObj() {
        return this.bioObj;
    }

    public final int getErrorcd() {
        return this.errorcd;
    }

    public int hashCode() {
        return (this.bioObj.hashCode() * 31) + Integer.hashCode(this.errorcd);
    }

    public String toString() {
        return "DLServiceModelForRecentSear(bioObj=" + this.bioObj + ", errorcd=" + this.errorcd + ')';
    }
}
