package com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/Covobj;", "Ljava/io/Serializable;", "covAbbr", "", "covCd", "", "covType", "(Ljava/lang/String;ILjava/lang/String;)V", "getCovAbbr", "()Ljava/lang/String;", "getCovCd", "()I", "getCovType", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Covobj implements Serializable {
    private final String covAbbr;
    private final int covCd;
    private final String covType;

    public Covobj(String covAbbr, int i, String covType) {
        Intrinsics.checkNotNullParameter(covAbbr, "covAbbr");
        Intrinsics.checkNotNullParameter(covType, "covType");
        this.covAbbr = covAbbr;
        this.covCd = i;
        this.covType = covType;
    }

    public static /* synthetic */ Covobj copy$default(Covobj covobj, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = covobj.covAbbr;
        }
        if ((i2 & 2) != 0) {
            i = covobj.covCd;
        }
        if ((i2 & 4) != 0) {
            str2 = covobj.covType;
        }
        return covobj.copy(str, i, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCovAbbr() {
        return this.covAbbr;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCovCd() {
        return this.covCd;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCovType() {
        return this.covType;
    }

    public final Covobj copy(String covAbbr, int covCd, String covType) {
        Intrinsics.checkNotNullParameter(covAbbr, "covAbbr");
        Intrinsics.checkNotNullParameter(covType, "covType");
        return new Covobj(covAbbr, covCd, covType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Covobj)) {
            return false;
        }
        Covobj covobj = (Covobj) other;
        return Intrinsics.areEqual(this.covAbbr, covobj.covAbbr) && this.covCd == covobj.covCd && Intrinsics.areEqual(this.covType, covobj.covType);
    }

    public final String getCovAbbr() {
        return this.covAbbr;
    }

    public final int getCovCd() {
        return this.covCd;
    }

    public final String getCovType() {
        return this.covType;
    }

    public int hashCode() {
        return (((this.covAbbr.hashCode() * 31) + Integer.hashCode(this.covCd)) * 31) + this.covType.hashCode();
    }

    public String toString() {
        return "Covobj(covAbbr=" + this.covAbbr + ", covCd=" + this.covCd + ", covType=" + this.covType + ')';
    }
}
