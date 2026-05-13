package com.nic.mparivahan.VahanServices.SpecialPermit;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JL\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, d2 = {"Lcom/nic/mparivahan/VahanServices/SpecialPermit/SpPermitConfigDetails;", "", "permanentPermitValid", "", "maxDaysSpl", "", "maxWeeksSpl", "minDaysSpl", "minWeeksSpl", "passengerListSpl", "(Ljava/lang/Boolean;IIIIZ)V", "getMaxDaysSpl", "()I", "getMaxWeeksSpl", "getMinDaysSpl", "getMinWeeksSpl", "getPassengerListSpl", "()Z", "getPermanentPermitValid", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Boolean;IIIIZ)Lcom/nic/mparivahan/VahanServices/SpecialPermit/SpPermitConfigDetails;", "equals", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SpPermitConfigDetails {
    private final int maxDaysSpl;
    private final int maxWeeksSpl;
    private final int minDaysSpl;
    private final int minWeeksSpl;
    private final boolean passengerListSpl;
    private final Boolean permanentPermitValid;

    public SpPermitConfigDetails(Boolean bool, int i, int i2, int i3, int i4, boolean z) {
        this.permanentPermitValid = bool;
        this.maxDaysSpl = i;
        this.maxWeeksSpl = i2;
        this.minDaysSpl = i3;
        this.minWeeksSpl = i4;
        this.passengerListSpl = z;
    }

    public static /* synthetic */ SpPermitConfigDetails copy$default(SpPermitConfigDetails spPermitConfigDetails, Boolean bool, int i, int i2, int i3, int i4, boolean z, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            bool = spPermitConfigDetails.permanentPermitValid;
        }
        if ((i5 & 2) != 0) {
            i = spPermitConfigDetails.maxDaysSpl;
        }
        int i6 = i;
        if ((i5 & 4) != 0) {
            i2 = spPermitConfigDetails.maxWeeksSpl;
        }
        int i7 = i2;
        if ((i5 & 8) != 0) {
            i3 = spPermitConfigDetails.minDaysSpl;
        }
        int i8 = i3;
        if ((i5 & 16) != 0) {
            i4 = spPermitConfigDetails.minWeeksSpl;
        }
        int i9 = i4;
        if ((i5 & 32) != 0) {
            z = spPermitConfigDetails.passengerListSpl;
        }
        return spPermitConfigDetails.copy(bool, i6, i7, i8, i9, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getPermanentPermitValid() {
        return this.permanentPermitValid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMaxDaysSpl() {
        return this.maxDaysSpl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMaxWeeksSpl() {
        return this.maxWeeksSpl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMinDaysSpl() {
        return this.minDaysSpl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getMinWeeksSpl() {
        return this.minWeeksSpl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getPassengerListSpl() {
        return this.passengerListSpl;
    }

    public final SpPermitConfigDetails copy(Boolean permanentPermitValid, int maxDaysSpl, int maxWeeksSpl, int minDaysSpl, int minWeeksSpl, boolean passengerListSpl) {
        return new SpPermitConfigDetails(permanentPermitValid, maxDaysSpl, maxWeeksSpl, minDaysSpl, minWeeksSpl, passengerListSpl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpPermitConfigDetails)) {
            return false;
        }
        SpPermitConfigDetails spPermitConfigDetails = (SpPermitConfigDetails) other;
        return Intrinsics.areEqual(this.permanentPermitValid, spPermitConfigDetails.permanentPermitValid) && this.maxDaysSpl == spPermitConfigDetails.maxDaysSpl && this.maxWeeksSpl == spPermitConfigDetails.maxWeeksSpl && this.minDaysSpl == spPermitConfigDetails.minDaysSpl && this.minWeeksSpl == spPermitConfigDetails.minWeeksSpl && this.passengerListSpl == spPermitConfigDetails.passengerListSpl;
    }

    public final int getMaxDaysSpl() {
        return this.maxDaysSpl;
    }

    public final int getMaxWeeksSpl() {
        return this.maxWeeksSpl;
    }

    public final int getMinDaysSpl() {
        return this.minDaysSpl;
    }

    public final int getMinWeeksSpl() {
        return this.minWeeksSpl;
    }

    public final boolean getPassengerListSpl() {
        return this.passengerListSpl;
    }

    public final Boolean getPermanentPermitValid() {
        return this.permanentPermitValid;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    public int hashCode() {
        Boolean bool = this.permanentPermitValid;
        int iHashCode = (((((((((bool == null ? 0 : bool.hashCode()) * 31) + Integer.hashCode(this.maxDaysSpl)) * 31) + Integer.hashCode(this.maxWeeksSpl)) * 31) + Integer.hashCode(this.minDaysSpl)) * 31) + Integer.hashCode(this.minWeeksSpl)) * 31;
        boolean z = this.passengerListSpl;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public String toString() {
        return "SpPermitConfigDetails(permanentPermitValid=" + this.permanentPermitValid + ", maxDaysSpl=" + this.maxDaysSpl + ", maxWeeksSpl=" + this.maxWeeksSpl + ", minDaysSpl=" + this.minDaysSpl + ", minWeeksSpl=" + this.minWeeksSpl + ", passengerListSpl=" + this.passengerListSpl + ')';
    }
}
