package com.nic.mparivahan.dlservices.data.model.duplicatedl;

import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/duplicatedl/DLCOVList;", "", "mCWG", "Lcom/nic/mparivahan/dlservices/data/model/duplicatedl/MCWG;", "lMV", "Lcom/nic/mparivahan/dlservices/data/model/duplicatedl/LMV;", "(Lcom/nic/mparivahan/dlservices/data/model/duplicatedl/MCWG;Lcom/nic/mparivahan/dlservices/data/model/duplicatedl/LMV;)V", "getLMV", "()Lcom/nic/mparivahan/dlservices/data/model/duplicatedl/LMV;", "getMCWG", "()Lcom/nic/mparivahan/dlservices/data/model/duplicatedl/MCWG;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DLCOVList {

    @xy5("LMV   ")
    private final LMV lMV;

    @xy5("MCWG  ")
    private final MCWG mCWG;

    public DLCOVList() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DLCOVList copy$default(DLCOVList dLCOVList, MCWG mcwg, LMV lmv, int i, Object obj) {
        if ((i & 1) != 0) {
            mcwg = dLCOVList.mCWG;
        }
        if ((i & 2) != 0) {
            lmv = dLCOVList.lMV;
        }
        return dLCOVList.copy(mcwg, lmv);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MCWG getMCWG() {
        return this.mCWG;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LMV getLMV() {
        return this.lMV;
    }

    public final DLCOVList copy(MCWG mCWG, LMV lMV) {
        return new DLCOVList(mCWG, lMV);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DLCOVList)) {
            return false;
        }
        DLCOVList dLCOVList = (DLCOVList) other;
        return Intrinsics.areEqual(this.mCWG, dLCOVList.mCWG) && Intrinsics.areEqual(this.lMV, dLCOVList.lMV);
    }

    public final LMV getLMV() {
        return this.lMV;
    }

    public final MCWG getMCWG() {
        return this.mCWG;
    }

    public int hashCode() {
        MCWG mcwg = this.mCWG;
        int iHashCode = (mcwg == null ? 0 : mcwg.hashCode()) * 31;
        LMV lmv = this.lMV;
        return iHashCode + (lmv != null ? lmv.hashCode() : 0);
    }

    public String toString() {
        return "DLCOVList(mCWG=" + this.mCWG + ", lMV=" + this.lMV + ')';
    }

    public DLCOVList(MCWG mcwg, LMV lmv) {
        this.mCWG = mcwg;
        this.lMV = lmv;
    }

    public /* synthetic */ DLCOVList(MCWG mcwg, LMV lmv, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : mcwg, (i & 2) != 0 ? null : lmv);
    }
}
