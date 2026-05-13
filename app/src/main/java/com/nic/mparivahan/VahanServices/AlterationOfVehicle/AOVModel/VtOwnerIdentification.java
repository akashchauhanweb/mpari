package com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0001\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0001¢\u0006\u0002\u0010\u0012J\t\u0010$\u001a\u00020\u0001HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\u0001HÆ\u0003J\t\u0010)\u001a\u00020\u0001HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\t\u0010,\u001a\u00020\tHÆ\u0003J\t\u0010-\u001a\u00020\tHÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0001HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\u008b\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u0001HÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\tHÖ\u0001J\t\u00106\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0003\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\f\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0011\u0010\u0011\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0014¨\u00067"}, d2 = {"Lcom/nic/mparivahan/VahanServices/AlterationOfVehicle/AOVModel/VtOwnerIdentification;", "", "aadharno", "dl_no", "emailid", "", "mobileno", "", "offcd", "", "ownerctg", "panno", "passportno", "rationcardno", "regnno", "statecd", "verfiedon", "voterid", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;JIILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V", "getAadharno", "()Ljava/lang/Object;", "getDl_no", "getEmailid", "()Ljava/lang/String;", "getMobileno", "()J", "getOffcd", "()I", "getOwnerctg", "getPanno", "getPassportno", "getRationcardno", "getRegnno", "getStatecd", "getVerfiedon", "getVoterid", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class VtOwnerIdentification {
    private final Object aadharno;
    private final Object dl_no;
    private final String emailid;
    private final long mobileno;
    private final int offcd;
    private final int ownerctg;
    private final String panno;
    private final Object passportno;
    private final String rationcardno;
    private final String regnno;
    private final String statecd;
    private final long verfiedon;
    private final Object voterid;

    public VtOwnerIdentification(Object aadharno, Object dl_no, String emailid, long j, int i, int i2, String panno, Object passportno, String rationcardno, String regnno, String statecd, long j2, Object voterid) {
        Intrinsics.checkNotNullParameter(aadharno, "aadharno");
        Intrinsics.checkNotNullParameter(dl_no, "dl_no");
        Intrinsics.checkNotNullParameter(emailid, "emailid");
        Intrinsics.checkNotNullParameter(panno, "panno");
        Intrinsics.checkNotNullParameter(passportno, "passportno");
        Intrinsics.checkNotNullParameter(rationcardno, "rationcardno");
        Intrinsics.checkNotNullParameter(regnno, "regnno");
        Intrinsics.checkNotNullParameter(statecd, "statecd");
        Intrinsics.checkNotNullParameter(voterid, "voterid");
        this.aadharno = aadharno;
        this.dl_no = dl_no;
        this.emailid = emailid;
        this.mobileno = j;
        this.offcd = i;
        this.ownerctg = i2;
        this.panno = panno;
        this.passportno = passportno;
        this.rationcardno = rationcardno;
        this.regnno = regnno;
        this.statecd = statecd;
        this.verfiedon = j2;
        this.voterid = voterid;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Object getAadharno() {
        return this.aadharno;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getRegnno() {
        return this.regnno;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getStatecd() {
        return this.statecd;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final long getVerfiedon() {
        return this.verfiedon;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Object getVoterid() {
        return this.voterid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getDl_no() {
        return this.dl_no;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEmailid() {
        return this.emailid;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getMobileno() {
        return this.mobileno;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getOffcd() {
        return this.offcd;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getOwnerctg() {
        return this.ownerctg;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPanno() {
        return this.panno;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Object getPassportno() {
        return this.passportno;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getRationcardno() {
        return this.rationcardno;
    }

    public final VtOwnerIdentification copy(Object aadharno, Object dl_no, String emailid, long mobileno, int offcd, int ownerctg, String panno, Object passportno, String rationcardno, String regnno, String statecd, long verfiedon, Object voterid) {
        Intrinsics.checkNotNullParameter(aadharno, "aadharno");
        Intrinsics.checkNotNullParameter(dl_no, "dl_no");
        Intrinsics.checkNotNullParameter(emailid, "emailid");
        Intrinsics.checkNotNullParameter(panno, "panno");
        Intrinsics.checkNotNullParameter(passportno, "passportno");
        Intrinsics.checkNotNullParameter(rationcardno, "rationcardno");
        Intrinsics.checkNotNullParameter(regnno, "regnno");
        Intrinsics.checkNotNullParameter(statecd, "statecd");
        Intrinsics.checkNotNullParameter(voterid, "voterid");
        return new VtOwnerIdentification(aadharno, dl_no, emailid, mobileno, offcd, ownerctg, panno, passportno, rationcardno, regnno, statecd, verfiedon, voterid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VtOwnerIdentification)) {
            return false;
        }
        VtOwnerIdentification vtOwnerIdentification = (VtOwnerIdentification) other;
        return Intrinsics.areEqual(this.aadharno, vtOwnerIdentification.aadharno) && Intrinsics.areEqual(this.dl_no, vtOwnerIdentification.dl_no) && Intrinsics.areEqual(this.emailid, vtOwnerIdentification.emailid) && this.mobileno == vtOwnerIdentification.mobileno && this.offcd == vtOwnerIdentification.offcd && this.ownerctg == vtOwnerIdentification.ownerctg && Intrinsics.areEqual(this.panno, vtOwnerIdentification.panno) && Intrinsics.areEqual(this.passportno, vtOwnerIdentification.passportno) && Intrinsics.areEqual(this.rationcardno, vtOwnerIdentification.rationcardno) && Intrinsics.areEqual(this.regnno, vtOwnerIdentification.regnno) && Intrinsics.areEqual(this.statecd, vtOwnerIdentification.statecd) && this.verfiedon == vtOwnerIdentification.verfiedon && Intrinsics.areEqual(this.voterid, vtOwnerIdentification.voterid);
    }

    public final Object getAadharno() {
        return this.aadharno;
    }

    public final Object getDl_no() {
        return this.dl_no;
    }

    public final String getEmailid() {
        return this.emailid;
    }

    public final long getMobileno() {
        return this.mobileno;
    }

    public final int getOffcd() {
        return this.offcd;
    }

    public final int getOwnerctg() {
        return this.ownerctg;
    }

    public final String getPanno() {
        return this.panno;
    }

    public final Object getPassportno() {
        return this.passportno;
    }

    public final String getRationcardno() {
        return this.rationcardno;
    }

    public final String getRegnno() {
        return this.regnno;
    }

    public final String getStatecd() {
        return this.statecd;
    }

    public final long getVerfiedon() {
        return this.verfiedon;
    }

    public final Object getVoterid() {
        return this.voterid;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.aadharno.hashCode() * 31) + this.dl_no.hashCode()) * 31) + this.emailid.hashCode()) * 31) + Long.hashCode(this.mobileno)) * 31) + Integer.hashCode(this.offcd)) * 31) + Integer.hashCode(this.ownerctg)) * 31) + this.panno.hashCode()) * 31) + this.passportno.hashCode()) * 31) + this.rationcardno.hashCode()) * 31) + this.regnno.hashCode()) * 31) + this.statecd.hashCode()) * 31) + Long.hashCode(this.verfiedon)) * 31) + this.voterid.hashCode();
    }

    public String toString() {
        return "VtOwnerIdentification(aadharno=" + this.aadharno + ", dl_no=" + this.dl_no + ", emailid=" + this.emailid + ", mobileno=" + this.mobileno + ", offcd=" + this.offcd + ", ownerctg=" + this.ownerctg + ", panno=" + this.panno + ", passportno=" + this.passportno + ", rationcardno=" + this.rationcardno + ", regnno=" + this.regnno + ", statecd=" + this.statecd + ", verfiedon=" + this.verfiedon + ", voterid=" + this.voterid + ')';
    }
}
