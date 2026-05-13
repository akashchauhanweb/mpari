package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/DistictModleItem;", "", "descr", "", "dist_cd", "", "state_cd", "(Ljava/lang/String;ILjava/lang/String;)V", "getDescr", "()Ljava/lang/String;", "getDist_cd", "()I", "getState_cd", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DistictModleItem {
    private final String descr;
    private final int dist_cd;
    private final String state_cd;

    public DistictModleItem(String descr, int i, String state_cd) {
        Intrinsics.checkNotNullParameter(descr, "descr");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        this.descr = descr;
        this.dist_cd = i;
        this.state_cd = state_cd;
    }

    public static /* synthetic */ DistictModleItem copy$default(DistictModleItem distictModleItem, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = distictModleItem.descr;
        }
        if ((i2 & 2) != 0) {
            i = distictModleItem.dist_cd;
        }
        if ((i2 & 4) != 0) {
            str2 = distictModleItem.state_cd;
        }
        return distictModleItem.copy(str, i, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDescr() {
        return this.descr;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDist_cd() {
        return this.dist_cd;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getState_cd() {
        return this.state_cd;
    }

    public final DistictModleItem copy(String descr, int dist_cd, String state_cd) {
        Intrinsics.checkNotNullParameter(descr, "descr");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        return new DistictModleItem(descr, dist_cd, state_cd);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DistictModleItem)) {
            return false;
        }
        DistictModleItem distictModleItem = (DistictModleItem) other;
        return Intrinsics.areEqual(this.descr, distictModleItem.descr) && this.dist_cd == distictModleItem.dist_cd && Intrinsics.areEqual(this.state_cd, distictModleItem.state_cd);
    }

    public final String getDescr() {
        return this.descr;
    }

    public final int getDist_cd() {
        return this.dist_cd;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public int hashCode() {
        return (((this.descr.hashCode() * 31) + Integer.hashCode(this.dist_cd)) * 31) + this.state_cd.hashCode();
    }

    public String toString() {
        return "DistictModleItem(descr=" + this.descr + ", dist_cd=" + this.dist_cd + ", state_cd=" + this.state_cd + ')';
    }
}
