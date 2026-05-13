package com.nic.mparivahan.Dl.Model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/nic/mparivahan/Dl/Model/DLDocument;", "", "docnumber", "", "dldetails", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "dob", "(Ljava/lang/String;Lcom/nic/mparivahan/Dl/Model/DldetobjX;Ljava/lang/String;)V", "getDldetails", "()Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "setDldetails", "(Lcom/nic/mparivahan/Dl/Model/DldetobjX;)V", "getDob", "()Ljava/lang/String;", "setDob", "(Ljava/lang/String;)V", "getDocnumber", "setDocnumber", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DLDocument {
    private DldetobjX dldetails;
    private String dob;
    private String docnumber;

    public DLDocument(String str, DldetobjX dldetobjX, String str2) {
        this.docnumber = str;
        this.dldetails = dldetobjX;
        this.dob = str2;
    }

    public static /* synthetic */ DLDocument copy$default(DLDocument dLDocument, String str, DldetobjX dldetobjX, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dLDocument.docnumber;
        }
        if ((i & 2) != 0) {
            dldetobjX = dLDocument.dldetails;
        }
        if ((i & 4) != 0) {
            str2 = dLDocument.dob;
        }
        return dLDocument.copy(str, dldetobjX, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDocnumber() {
        return this.docnumber;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DldetobjX getDldetails() {
        return this.dldetails;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDob() {
        return this.dob;
    }

    public final DLDocument copy(String docnumber, DldetobjX dldetails, String dob) {
        return new DLDocument(docnumber, dldetails, dob);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DLDocument)) {
            return false;
        }
        DLDocument dLDocument = (DLDocument) other;
        return Intrinsics.areEqual(this.docnumber, dLDocument.docnumber) && Intrinsics.areEqual(this.dldetails, dLDocument.dldetails) && Intrinsics.areEqual(this.dob, dLDocument.dob);
    }

    public final DldetobjX getDldetails() {
        return this.dldetails;
    }

    public final String getDob() {
        return this.dob;
    }

    public final String getDocnumber() {
        return this.docnumber;
    }

    public int hashCode() {
        String str = this.docnumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        DldetobjX dldetobjX = this.dldetails;
        int iHashCode2 = (iHashCode + (dldetobjX == null ? 0 : dldetobjX.hashCode())) * 31;
        String str2 = this.dob;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setDldetails(DldetobjX dldetobjX) {
        this.dldetails = dldetobjX;
    }

    public final void setDob(String str) {
        this.dob = str;
    }

    public final void setDocnumber(String str) {
        this.docnumber = str;
    }

    public String toString() {
        return "DLDocument(docnumber=" + this.docnumber + ", dldetails=" + this.dldetails + ", dob=" + this.dob + ')';
    }
}
