package com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\""}, d2 = {"Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/ApplicantAddress;", "Ljava/io/Serializable;", "biomobileno", "", "biotemp1", "biotemp2", "biotempdistNa", "biotemppin", "biotempstNa", "swdFullName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBiomobileno", "()Ljava/lang/String;", "getBiotemp1", "getBiotemp2", "getBiotempdistNa", "getBiotemppin", "getBiotempstNa", "getSwdFullName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ApplicantAddress implements Serializable {
    private final String biomobileno;
    private final String biotemp1;
    private final String biotemp2;
    private final String biotempdistNa;
    private final String biotemppin;
    private final String biotempstNa;
    private final String swdFullName;

    public ApplicantAddress(String biomobileno, String biotemp1, String biotemp2, String biotempdistNa, String biotemppin, String biotempstNa, String swdFullName) {
        Intrinsics.checkNotNullParameter(biomobileno, "biomobileno");
        Intrinsics.checkNotNullParameter(biotemp1, "biotemp1");
        Intrinsics.checkNotNullParameter(biotemp2, "biotemp2");
        Intrinsics.checkNotNullParameter(biotempdistNa, "biotempdistNa");
        Intrinsics.checkNotNullParameter(biotemppin, "biotemppin");
        Intrinsics.checkNotNullParameter(biotempstNa, "biotempstNa");
        Intrinsics.checkNotNullParameter(swdFullName, "swdFullName");
        this.biomobileno = biomobileno;
        this.biotemp1 = biotemp1;
        this.biotemp2 = biotemp2;
        this.biotempdistNa = biotempdistNa;
        this.biotemppin = biotemppin;
        this.biotempstNa = biotempstNa;
        this.swdFullName = swdFullName;
    }

    public static /* synthetic */ ApplicantAddress copy$default(ApplicantAddress applicantAddress, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = applicantAddress.biomobileno;
        }
        if ((i & 2) != 0) {
            str2 = applicantAddress.biotemp1;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = applicantAddress.biotemp2;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = applicantAddress.biotempdistNa;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = applicantAddress.biotemppin;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = applicantAddress.biotempstNa;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = applicantAddress.swdFullName;
        }
        return applicantAddress.copy(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBiomobileno() {
        return this.biomobileno;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBiotemp1() {
        return this.biotemp1;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBiotemp2() {
        return this.biotemp2;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBiotempdistNa() {
        return this.biotempdistNa;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBiotemppin() {
        return this.biotemppin;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBiotempstNa() {
        return this.biotempstNa;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSwdFullName() {
        return this.swdFullName;
    }

    public final ApplicantAddress copy(String biomobileno, String biotemp1, String biotemp2, String biotempdistNa, String biotemppin, String biotempstNa, String swdFullName) {
        Intrinsics.checkNotNullParameter(biomobileno, "biomobileno");
        Intrinsics.checkNotNullParameter(biotemp1, "biotemp1");
        Intrinsics.checkNotNullParameter(biotemp2, "biotemp2");
        Intrinsics.checkNotNullParameter(biotempdistNa, "biotempdistNa");
        Intrinsics.checkNotNullParameter(biotemppin, "biotemppin");
        Intrinsics.checkNotNullParameter(biotempstNa, "biotempstNa");
        Intrinsics.checkNotNullParameter(swdFullName, "swdFullName");
        return new ApplicantAddress(biomobileno, biotemp1, biotemp2, biotempdistNa, biotemppin, biotempstNa, swdFullName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApplicantAddress)) {
            return false;
        }
        ApplicantAddress applicantAddress = (ApplicantAddress) other;
        return Intrinsics.areEqual(this.biomobileno, applicantAddress.biomobileno) && Intrinsics.areEqual(this.biotemp1, applicantAddress.biotemp1) && Intrinsics.areEqual(this.biotemp2, applicantAddress.biotemp2) && Intrinsics.areEqual(this.biotempdistNa, applicantAddress.biotempdistNa) && Intrinsics.areEqual(this.biotemppin, applicantAddress.biotemppin) && Intrinsics.areEqual(this.biotempstNa, applicantAddress.biotempstNa) && Intrinsics.areEqual(this.swdFullName, applicantAddress.swdFullName);
    }

    public final String getBiomobileno() {
        return this.biomobileno;
    }

    public final String getBiotemp1() {
        return this.biotemp1;
    }

    public final String getBiotemp2() {
        return this.biotemp2;
    }

    public final String getBiotempdistNa() {
        return this.biotempdistNa;
    }

    public final String getBiotemppin() {
        return this.biotemppin;
    }

    public final String getBiotempstNa() {
        return this.biotempstNa;
    }

    public final String getSwdFullName() {
        return this.swdFullName;
    }

    public int hashCode() {
        return (((((((((((this.biomobileno.hashCode() * 31) + this.biotemp1.hashCode()) * 31) + this.biotemp2.hashCode()) * 31) + this.biotempdistNa.hashCode()) * 31) + this.biotemppin.hashCode()) * 31) + this.biotempstNa.hashCode()) * 31) + this.swdFullName.hashCode();
    }

    public String toString() {
        return "ApplicantAddress(biomobileno=" + this.biomobileno + ", biotemp1=" + this.biotemp1 + ", biotemp2=" + this.biotemp2 + ", biotempdistNa=" + this.biotempdistNa + ", biotemppin=" + this.biotemppin + ", biotempstNa=" + this.biotempstNa + ", swdFullName=" + this.swdFullName + ')';
    }
}
