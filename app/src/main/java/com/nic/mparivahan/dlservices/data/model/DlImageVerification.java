package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/DlImageVerification;", "", "dlNumber", "", "dOsVersion", "oldImage", "newImage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDOsVersion", "()Ljava/lang/String;", "setDOsVersion", "(Ljava/lang/String;)V", "getDlNumber", "setDlNumber", "getNewImage", "setNewImage", "getOldImage", "setOldImage", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DlImageVerification {
    private String dOsVersion;
    private String dlNumber;
    private String newImage;
    private String oldImage;

    public DlImageVerification(String str, String str2, String str3, String str4) {
        this.dlNumber = str;
        this.dOsVersion = str2;
        this.oldImage = str3;
        this.newImage = str4;
    }

    public static /* synthetic */ DlImageVerification copy$default(DlImageVerification dlImageVerification, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dlImageVerification.dlNumber;
        }
        if ((i & 2) != 0) {
            str2 = dlImageVerification.dOsVersion;
        }
        if ((i & 4) != 0) {
            str3 = dlImageVerification.oldImage;
        }
        if ((i & 8) != 0) {
            str4 = dlImageVerification.newImage;
        }
        return dlImageVerification.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDlNumber() {
        return this.dlNumber;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDOsVersion() {
        return this.dOsVersion;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOldImage() {
        return this.oldImage;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNewImage() {
        return this.newImage;
    }

    public final DlImageVerification copy(String dlNumber, String dOsVersion, String oldImage, String newImage) {
        return new DlImageVerification(dlNumber, dOsVersion, oldImage, newImage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DlImageVerification)) {
            return false;
        }
        DlImageVerification dlImageVerification = (DlImageVerification) other;
        return Intrinsics.areEqual(this.dlNumber, dlImageVerification.dlNumber) && Intrinsics.areEqual(this.dOsVersion, dlImageVerification.dOsVersion) && Intrinsics.areEqual(this.oldImage, dlImageVerification.oldImage) && Intrinsics.areEqual(this.newImage, dlImageVerification.newImage);
    }

    public final String getDOsVersion() {
        return this.dOsVersion;
    }

    public final String getDlNumber() {
        return this.dlNumber;
    }

    public final String getNewImage() {
        return this.newImage;
    }

    public final String getOldImage() {
        return this.oldImage;
    }

    public int hashCode() {
        String str = this.dlNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dOsVersion;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.oldImage;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.newImage;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setDOsVersion(String str) {
        this.dOsVersion = str;
    }

    public final void setDlNumber(String str) {
        this.dlNumber = str;
    }

    public final void setNewImage(String str) {
        this.newImage = str;
    }

    public final void setOldImage(String str) {
        this.oldImage = str;
    }

    public String toString() {
        return "DlImageVerification(dlNumber=" + this.dlNumber + ", dOsVersion=" + this.dOsVersion + ", oldImage=" + this.oldImage + ", newImage=" + this.newImage + ')';
    }
}
