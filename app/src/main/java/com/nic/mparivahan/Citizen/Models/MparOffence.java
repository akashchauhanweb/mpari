package com.nic.mparivahan.Citizen.Models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/nic/mparivahan/Citizen/Models/MparOffence;", "", "offenceDispName", "", "offenceId", "", "offenceChallanId", "offenceVchCatg", "(Ljava/lang/String;IILjava/lang/String;)V", "getOffenceChallanId", "()I", "getOffenceDispName", "()Ljava/lang/String;", "getOffenceId", "getOffenceVchCatg", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class MparOffence {
    private final int offenceChallanId;
    private final String offenceDispName;
    private final int offenceId;
    private final String offenceVchCatg;

    public MparOffence(String offenceDispName, int i, int i2, String offenceVchCatg) {
        Intrinsics.checkNotNullParameter(offenceDispName, "offenceDispName");
        Intrinsics.checkNotNullParameter(offenceVchCatg, "offenceVchCatg");
        this.offenceDispName = offenceDispName;
        this.offenceId = i;
        this.offenceChallanId = i2;
        this.offenceVchCatg = offenceVchCatg;
    }

    public static /* synthetic */ MparOffence copy$default(MparOffence mparOffence, String str, int i, int i2, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = mparOffence.offenceDispName;
        }
        if ((i3 & 2) != 0) {
            i = mparOffence.offenceId;
        }
        if ((i3 & 4) != 0) {
            i2 = mparOffence.offenceChallanId;
        }
        if ((i3 & 8) != 0) {
            str2 = mparOffence.offenceVchCatg;
        }
        return mparOffence.copy(str, i, i2, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOffenceDispName() {
        return this.offenceDispName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getOffenceId() {
        return this.offenceId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getOffenceChallanId() {
        return this.offenceChallanId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOffenceVchCatg() {
        return this.offenceVchCatg;
    }

    public final MparOffence copy(String offenceDispName, int offenceId, int offenceChallanId, String offenceVchCatg) {
        Intrinsics.checkNotNullParameter(offenceDispName, "offenceDispName");
        Intrinsics.checkNotNullParameter(offenceVchCatg, "offenceVchCatg");
        return new MparOffence(offenceDispName, offenceId, offenceChallanId, offenceVchCatg);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MparOffence)) {
            return false;
        }
        MparOffence mparOffence = (MparOffence) other;
        return Intrinsics.areEqual(this.offenceDispName, mparOffence.offenceDispName) && this.offenceId == mparOffence.offenceId && this.offenceChallanId == mparOffence.offenceChallanId && Intrinsics.areEqual(this.offenceVchCatg, mparOffence.offenceVchCatg);
    }

    public final int getOffenceChallanId() {
        return this.offenceChallanId;
    }

    public final String getOffenceDispName() {
        return this.offenceDispName;
    }

    public final int getOffenceId() {
        return this.offenceId;
    }

    public final String getOffenceVchCatg() {
        return this.offenceVchCatg;
    }

    public int hashCode() {
        return (((((this.offenceDispName.hashCode() * 31) + Integer.hashCode(this.offenceId)) * 31) + Integer.hashCode(this.offenceChallanId)) * 31) + this.offenceVchCatg.hashCode();
    }

    public String toString() {
        return "MparOffence(offenceDispName=" + this.offenceDispName + ", offenceId=" + this.offenceId + ", offenceChallanId=" + this.offenceChallanId + ", offenceVchCatg=" + this.offenceVchCatg + ')';
    }
}
