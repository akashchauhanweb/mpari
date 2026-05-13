package com.nic.mparivahan.Dl.Model;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b-\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0002\u0010\u0013J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0007HÆ\u0003J\t\u0010-\u001a\u00020\u0007HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0007HÆ\u0003J\t\u00100\u001a\u00020\u0007HÆ\u0003J\t\u00101\u001a\u00020\u0007HÆ\u0003J\t\u00102\u001a\u00020\u0007HÆ\u0003J\u0095\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u0003HÆ\u0001J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107HÖ\u0003J\t\u00108\u001a\u00020\u0003HÖ\u0001J\t\u00109\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0011\u0010\u000f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0015¨\u0006:"}, d2 = {"Lcom/nic/mparivahan/Dl/Model/BioImgObjX;", "Ljava/io/Serializable;", "bdDevId", "", "biApplno", "", "biBioCapturedDt", "", "biBioId", "biConfirmCapture", "biDigest", "biEndorsedt", "biEndorsetime", "biPhoto", "biPhotoDate", "biSignDate", "biSignature", "biTokenId", "biusid", "(IJLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "getBdDevId", "()I", "getBiApplno", "()J", "getBiBioCapturedDt", "()Ljava/lang/String;", "getBiBioId", "getBiConfirmCapture", "getBiDigest", "getBiEndorsedt", "getBiEndorsetime", "getBiPhoto", "getBiPhotoDate", "getBiSignDate", "getBiSignature", "getBiTokenId", "getBiusid", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class BioImgObjX implements Serializable {
    private final int bdDevId;
    private final long biApplno;
    private final String biBioCapturedDt;
    private final String biBioId;
    private final int biConfirmCapture;
    private final String biDigest;
    private final String biEndorsedt;
    private final String biEndorsetime;
    private final String biPhoto;
    private final String biPhotoDate;
    private final String biSignDate;
    private final String biSignature;
    private final int biTokenId;
    private final int biusid;

    public BioImgObjX(int i, long j, String biBioCapturedDt, String biBioId, int i2, String biDigest, String biEndorsedt, String biEndorsetime, String biPhoto, String biPhotoDate, String biSignDate, String biSignature, int i3, int i4) {
        Intrinsics.checkNotNullParameter(biBioCapturedDt, "biBioCapturedDt");
        Intrinsics.checkNotNullParameter(biBioId, "biBioId");
        Intrinsics.checkNotNullParameter(biDigest, "biDigest");
        Intrinsics.checkNotNullParameter(biEndorsedt, "biEndorsedt");
        Intrinsics.checkNotNullParameter(biEndorsetime, "biEndorsetime");
        Intrinsics.checkNotNullParameter(biPhoto, "biPhoto");
        Intrinsics.checkNotNullParameter(biPhotoDate, "biPhotoDate");
        Intrinsics.checkNotNullParameter(biSignDate, "biSignDate");
        Intrinsics.checkNotNullParameter(biSignature, "biSignature");
        this.bdDevId = i;
        this.biApplno = j;
        this.biBioCapturedDt = biBioCapturedDt;
        this.biBioId = biBioId;
        this.biConfirmCapture = i2;
        this.biDigest = biDigest;
        this.biEndorsedt = biEndorsedt;
        this.biEndorsetime = biEndorsetime;
        this.biPhoto = biPhoto;
        this.biPhotoDate = biPhotoDate;
        this.biSignDate = biSignDate;
        this.biSignature = biSignature;
        this.biTokenId = i3;
        this.biusid = i4;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBdDevId() {
        return this.bdDevId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getBiPhotoDate() {
        return this.biPhotoDate;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getBiSignDate() {
        return this.biSignDate;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getBiSignature() {
        return this.biSignature;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getBiTokenId() {
        return this.biTokenId;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getBiusid() {
        return this.biusid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getBiApplno() {
        return this.biApplno;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBiBioCapturedDt() {
        return this.biBioCapturedDt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBiBioId() {
        return this.biBioId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getBiConfirmCapture() {
        return this.biConfirmCapture;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBiDigest() {
        return this.biDigest;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getBiEndorsedt() {
        return this.biEndorsedt;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getBiEndorsetime() {
        return this.biEndorsetime;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getBiPhoto() {
        return this.biPhoto;
    }

    public final BioImgObjX copy(int bdDevId, long biApplno, String biBioCapturedDt, String biBioId, int biConfirmCapture, String biDigest, String biEndorsedt, String biEndorsetime, String biPhoto, String biPhotoDate, String biSignDate, String biSignature, int biTokenId, int biusid) {
        Intrinsics.checkNotNullParameter(biBioCapturedDt, "biBioCapturedDt");
        Intrinsics.checkNotNullParameter(biBioId, "biBioId");
        Intrinsics.checkNotNullParameter(biDigest, "biDigest");
        Intrinsics.checkNotNullParameter(biEndorsedt, "biEndorsedt");
        Intrinsics.checkNotNullParameter(biEndorsetime, "biEndorsetime");
        Intrinsics.checkNotNullParameter(biPhoto, "biPhoto");
        Intrinsics.checkNotNullParameter(biPhotoDate, "biPhotoDate");
        Intrinsics.checkNotNullParameter(biSignDate, "biSignDate");
        Intrinsics.checkNotNullParameter(biSignature, "biSignature");
        return new BioImgObjX(bdDevId, biApplno, biBioCapturedDt, biBioId, biConfirmCapture, biDigest, biEndorsedt, biEndorsetime, biPhoto, biPhotoDate, biSignDate, biSignature, biTokenId, biusid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BioImgObjX)) {
            return false;
        }
        BioImgObjX bioImgObjX = (BioImgObjX) other;
        return this.bdDevId == bioImgObjX.bdDevId && this.biApplno == bioImgObjX.biApplno && Intrinsics.areEqual(this.biBioCapturedDt, bioImgObjX.biBioCapturedDt) && Intrinsics.areEqual(this.biBioId, bioImgObjX.biBioId) && this.biConfirmCapture == bioImgObjX.biConfirmCapture && Intrinsics.areEqual(this.biDigest, bioImgObjX.biDigest) && Intrinsics.areEqual(this.biEndorsedt, bioImgObjX.biEndorsedt) && Intrinsics.areEqual(this.biEndorsetime, bioImgObjX.biEndorsetime) && Intrinsics.areEqual(this.biPhoto, bioImgObjX.biPhoto) && Intrinsics.areEqual(this.biPhotoDate, bioImgObjX.biPhotoDate) && Intrinsics.areEqual(this.biSignDate, bioImgObjX.biSignDate) && Intrinsics.areEqual(this.biSignature, bioImgObjX.biSignature) && this.biTokenId == bioImgObjX.biTokenId && this.biusid == bioImgObjX.biusid;
    }

    public final int getBdDevId() {
        return this.bdDevId;
    }

    public final long getBiApplno() {
        return this.biApplno;
    }

    public final String getBiBioCapturedDt() {
        return this.biBioCapturedDt;
    }

    public final String getBiBioId() {
        return this.biBioId;
    }

    public final int getBiConfirmCapture() {
        return this.biConfirmCapture;
    }

    public final String getBiDigest() {
        return this.biDigest;
    }

    public final String getBiEndorsedt() {
        return this.biEndorsedt;
    }

    public final String getBiEndorsetime() {
        return this.biEndorsetime;
    }

    public final String getBiPhoto() {
        return this.biPhoto;
    }

    public final String getBiPhotoDate() {
        return this.biPhotoDate;
    }

    public final String getBiSignDate() {
        return this.biSignDate;
    }

    public final String getBiSignature() {
        return this.biSignature;
    }

    public final int getBiTokenId() {
        return this.biTokenId;
    }

    public final int getBiusid() {
        return this.biusid;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((Integer.hashCode(this.bdDevId) * 31) + Long.hashCode(this.biApplno)) * 31) + this.biBioCapturedDt.hashCode()) * 31) + this.biBioId.hashCode()) * 31) + Integer.hashCode(this.biConfirmCapture)) * 31) + this.biDigest.hashCode()) * 31) + this.biEndorsedt.hashCode()) * 31) + this.biEndorsetime.hashCode()) * 31) + this.biPhoto.hashCode()) * 31) + this.biPhotoDate.hashCode()) * 31) + this.biSignDate.hashCode()) * 31) + this.biSignature.hashCode()) * 31) + Integer.hashCode(this.biTokenId)) * 31) + Integer.hashCode(this.biusid);
    }

    public String toString() {
        return "BioImgObjX(bdDevId=" + this.bdDevId + ", biApplno=" + this.biApplno + ", biBioCapturedDt=" + this.biBioCapturedDt + ", biBioId=" + this.biBioId + ", biConfirmCapture=" + this.biConfirmCapture + ", biDigest=" + this.biDigest + ", biEndorsedt=" + this.biEndorsedt + ", biEndorsetime=" + this.biEndorsetime + ", biPhoto=" + this.biPhoto + ", biPhotoDate=" + this.biPhotoDate + ", biSignDate=" + this.biSignDate + ", biSignature=" + this.biSignature + ", biTokenId=" + this.biTokenId + ", biusid=" + this.biusid + ')';
    }
}
