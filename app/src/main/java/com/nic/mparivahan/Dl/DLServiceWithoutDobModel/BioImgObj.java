package com.nic.mparivahan.Dl.DLServiceWithoutDobModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b,\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0001\u0012\u0006\u0010\b\u001a\u00020\u0001\u0012\u0006\u0010\t\u001a\u00020\u0001\u0012\u0006\u0010\n\u001a\u00020\u0001\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0001\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u0001\u0012\u0006\u0010\u0010\u001a\u00020\u0001\u0012\u0006\u0010\u0011\u001a\u00020\u0001\u0012\u0006\u0010\u0012\u001a\u00020\u0001\u0012\u0006\u0010\u0013\u001a\u00020\f\u0012\u0006\u0010\u0014\u001a\u00020\u0001\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017J\t\u0010.\u001a\u00020\u0001HÆ\u0003J\t\u0010/\u001a\u00020\fHÆ\u0003J\t\u00100\u001a\u00020\u0001HÆ\u0003J\t\u00101\u001a\u00020\fHÆ\u0003J\t\u00102\u001a\u00020\u0001HÆ\u0003J\t\u00103\u001a\u00020\u0001HÆ\u0003J\t\u00104\u001a\u00020\u0001HÆ\u0003J\t\u00105\u001a\u00020\u0001HÆ\u0003J\t\u00106\u001a\u00020\fHÆ\u0003J\t\u00107\u001a\u00020\u0001HÆ\u0003J\t\u00108\u001a\u00020\u0016HÆ\u0003J\t\u00109\u001a\u00020\u0001HÆ\u0003J\t\u0010:\u001a\u00020\u0001HÆ\u0003J\t\u0010;\u001a\u00020\u0001HÆ\u0003J\t\u0010<\u001a\u00020\u0001HÆ\u0003J\t\u0010=\u001a\u00020\u0001HÆ\u0003J\t\u0010>\u001a\u00020\u0001HÆ\u0003J\t\u0010?\u001a\u00020\u0001HÆ\u0003J\t\u0010@\u001a\u00020\u0001HÆ\u0003JÇ\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u0016HÆ\u0001J\u0013\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010E\u001a\u00020\u0016HÖ\u0001J\t\u0010F\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0003\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010\t\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0011\u0010\n\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\r\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0011\u0010\u000f\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019R\u0011\u0010\u0011\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019R\u0011\u0010\u0012\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0019R\u0011\u0010\u0013\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b*\u0010#R\u0011\u0010\u0014\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0019R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-¨\u0006G"}, d2 = {"Lcom/nic/mparivahan/Dl/DLServiceWithoutDobModel/BioImgObj;", "", "biDlno", "biEndorsedt", "biEndorsementNo", "biEndorsetime", "biLeftThumb", "biLeftThumbDate", "biLminutia", "biLtm19794", "biMinutiaCapturedThumb", "biPhoto", "", "biPhotoDate", "biRightThumb", "biRightThumbDate", "biRminutia", "biRtm19794", "biSignDate", "biSignature", "biTokenId", "biusid", "", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;I)V", "getBiDlno", "()Ljava/lang/Object;", "getBiEndorsedt", "getBiEndorsementNo", "getBiEndorsetime", "getBiLeftThumb", "getBiLeftThumbDate", "getBiLminutia", "getBiLtm19794", "getBiMinutiaCapturedThumb", "getBiPhoto", "()Ljava/lang/String;", "getBiPhotoDate", "getBiRightThumb", "getBiRightThumbDate", "getBiRminutia", "getBiRtm19794", "getBiSignDate", "getBiSignature", "getBiTokenId", "getBiusid", "()I", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class BioImgObj {
    private final Object biDlno;
    private final Object biEndorsedt;
    private final Object biEndorsementNo;
    private final Object biEndorsetime;
    private final Object biLeftThumb;
    private final Object biLeftThumbDate;
    private final Object biLminutia;
    private final Object biLtm19794;
    private final Object biMinutiaCapturedThumb;
    private final String biPhoto;
    private final Object biPhotoDate;
    private final String biRightThumb;
    private final Object biRightThumbDate;
    private final Object biRminutia;
    private final Object biRtm19794;
    private final Object biSignDate;
    private final String biSignature;
    private final Object biTokenId;
    private final int biusid;

    public BioImgObj(Object biDlno, Object biEndorsedt, Object biEndorsementNo, Object biEndorsetime, Object biLeftThumb, Object biLeftThumbDate, Object biLminutia, Object biLtm19794, Object biMinutiaCapturedThumb, String biPhoto, Object biPhotoDate, String biRightThumb, Object biRightThumbDate, Object biRminutia, Object biRtm19794, Object biSignDate, String biSignature, Object biTokenId, int i) {
        Intrinsics.checkNotNullParameter(biDlno, "biDlno");
        Intrinsics.checkNotNullParameter(biEndorsedt, "biEndorsedt");
        Intrinsics.checkNotNullParameter(biEndorsementNo, "biEndorsementNo");
        Intrinsics.checkNotNullParameter(biEndorsetime, "biEndorsetime");
        Intrinsics.checkNotNullParameter(biLeftThumb, "biLeftThumb");
        Intrinsics.checkNotNullParameter(biLeftThumbDate, "biLeftThumbDate");
        Intrinsics.checkNotNullParameter(biLminutia, "biLminutia");
        Intrinsics.checkNotNullParameter(biLtm19794, "biLtm19794");
        Intrinsics.checkNotNullParameter(biMinutiaCapturedThumb, "biMinutiaCapturedThumb");
        Intrinsics.checkNotNullParameter(biPhoto, "biPhoto");
        Intrinsics.checkNotNullParameter(biPhotoDate, "biPhotoDate");
        Intrinsics.checkNotNullParameter(biRightThumb, "biRightThumb");
        Intrinsics.checkNotNullParameter(biRightThumbDate, "biRightThumbDate");
        Intrinsics.checkNotNullParameter(biRminutia, "biRminutia");
        Intrinsics.checkNotNullParameter(biRtm19794, "biRtm19794");
        Intrinsics.checkNotNullParameter(biSignDate, "biSignDate");
        Intrinsics.checkNotNullParameter(biSignature, "biSignature");
        Intrinsics.checkNotNullParameter(biTokenId, "biTokenId");
        this.biDlno = biDlno;
        this.biEndorsedt = biEndorsedt;
        this.biEndorsementNo = biEndorsementNo;
        this.biEndorsetime = biEndorsetime;
        this.biLeftThumb = biLeftThumb;
        this.biLeftThumbDate = biLeftThumbDate;
        this.biLminutia = biLminutia;
        this.biLtm19794 = biLtm19794;
        this.biMinutiaCapturedThumb = biMinutiaCapturedThumb;
        this.biPhoto = biPhoto;
        this.biPhotoDate = biPhotoDate;
        this.biRightThumb = biRightThumb;
        this.biRightThumbDate = biRightThumbDate;
        this.biRminutia = biRminutia;
        this.biRtm19794 = biRtm19794;
        this.biSignDate = biSignDate;
        this.biSignature = biSignature;
        this.biTokenId = biTokenId;
        this.biusid = i;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Object getBiDlno() {
        return this.biDlno;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getBiPhoto() {
        return this.biPhoto;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Object getBiPhotoDate() {
        return this.biPhotoDate;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getBiRightThumb() {
        return this.biRightThumb;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Object getBiRightThumbDate() {
        return this.biRightThumbDate;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Object getBiRminutia() {
        return this.biRminutia;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Object getBiRtm19794() {
        return this.biRtm19794;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Object getBiSignDate() {
        return this.biSignDate;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getBiSignature() {
        return this.biSignature;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Object getBiTokenId() {
        return this.biTokenId;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getBiusid() {
        return this.biusid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getBiEndorsedt() {
        return this.biEndorsedt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Object getBiEndorsementNo() {
        return this.biEndorsementNo;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Object getBiEndorsetime() {
        return this.biEndorsetime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Object getBiLeftThumb() {
        return this.biLeftThumb;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Object getBiLeftThumbDate() {
        return this.biLeftThumbDate;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Object getBiLminutia() {
        return this.biLminutia;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Object getBiLtm19794() {
        return this.biLtm19794;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Object getBiMinutiaCapturedThumb() {
        return this.biMinutiaCapturedThumb;
    }

    public final BioImgObj copy(Object biDlno, Object biEndorsedt, Object biEndorsementNo, Object biEndorsetime, Object biLeftThumb, Object biLeftThumbDate, Object biLminutia, Object biLtm19794, Object biMinutiaCapturedThumb, String biPhoto, Object biPhotoDate, String biRightThumb, Object biRightThumbDate, Object biRminutia, Object biRtm19794, Object biSignDate, String biSignature, Object biTokenId, int biusid) {
        Intrinsics.checkNotNullParameter(biDlno, "biDlno");
        Intrinsics.checkNotNullParameter(biEndorsedt, "biEndorsedt");
        Intrinsics.checkNotNullParameter(biEndorsementNo, "biEndorsementNo");
        Intrinsics.checkNotNullParameter(biEndorsetime, "biEndorsetime");
        Intrinsics.checkNotNullParameter(biLeftThumb, "biLeftThumb");
        Intrinsics.checkNotNullParameter(biLeftThumbDate, "biLeftThumbDate");
        Intrinsics.checkNotNullParameter(biLminutia, "biLminutia");
        Intrinsics.checkNotNullParameter(biLtm19794, "biLtm19794");
        Intrinsics.checkNotNullParameter(biMinutiaCapturedThumb, "biMinutiaCapturedThumb");
        Intrinsics.checkNotNullParameter(biPhoto, "biPhoto");
        Intrinsics.checkNotNullParameter(biPhotoDate, "biPhotoDate");
        Intrinsics.checkNotNullParameter(biRightThumb, "biRightThumb");
        Intrinsics.checkNotNullParameter(biRightThumbDate, "biRightThumbDate");
        Intrinsics.checkNotNullParameter(biRminutia, "biRminutia");
        Intrinsics.checkNotNullParameter(biRtm19794, "biRtm19794");
        Intrinsics.checkNotNullParameter(biSignDate, "biSignDate");
        Intrinsics.checkNotNullParameter(biSignature, "biSignature");
        Intrinsics.checkNotNullParameter(biTokenId, "biTokenId");
        return new BioImgObj(biDlno, biEndorsedt, biEndorsementNo, biEndorsetime, biLeftThumb, biLeftThumbDate, biLminutia, biLtm19794, biMinutiaCapturedThumb, biPhoto, biPhotoDate, biRightThumb, biRightThumbDate, biRminutia, biRtm19794, biSignDate, biSignature, biTokenId, biusid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BioImgObj)) {
            return false;
        }
        BioImgObj bioImgObj = (BioImgObj) other;
        return Intrinsics.areEqual(this.biDlno, bioImgObj.biDlno) && Intrinsics.areEqual(this.biEndorsedt, bioImgObj.biEndorsedt) && Intrinsics.areEqual(this.biEndorsementNo, bioImgObj.biEndorsementNo) && Intrinsics.areEqual(this.biEndorsetime, bioImgObj.biEndorsetime) && Intrinsics.areEqual(this.biLeftThumb, bioImgObj.biLeftThumb) && Intrinsics.areEqual(this.biLeftThumbDate, bioImgObj.biLeftThumbDate) && Intrinsics.areEqual(this.biLminutia, bioImgObj.biLminutia) && Intrinsics.areEqual(this.biLtm19794, bioImgObj.biLtm19794) && Intrinsics.areEqual(this.biMinutiaCapturedThumb, bioImgObj.biMinutiaCapturedThumb) && Intrinsics.areEqual(this.biPhoto, bioImgObj.biPhoto) && Intrinsics.areEqual(this.biPhotoDate, bioImgObj.biPhotoDate) && Intrinsics.areEqual(this.biRightThumb, bioImgObj.biRightThumb) && Intrinsics.areEqual(this.biRightThumbDate, bioImgObj.biRightThumbDate) && Intrinsics.areEqual(this.biRminutia, bioImgObj.biRminutia) && Intrinsics.areEqual(this.biRtm19794, bioImgObj.biRtm19794) && Intrinsics.areEqual(this.biSignDate, bioImgObj.biSignDate) && Intrinsics.areEqual(this.biSignature, bioImgObj.biSignature) && Intrinsics.areEqual(this.biTokenId, bioImgObj.biTokenId) && this.biusid == bioImgObj.biusid;
    }

    public final Object getBiDlno() {
        return this.biDlno;
    }

    public final Object getBiEndorsedt() {
        return this.biEndorsedt;
    }

    public final Object getBiEndorsementNo() {
        return this.biEndorsementNo;
    }

    public final Object getBiEndorsetime() {
        return this.biEndorsetime;
    }

    public final Object getBiLeftThumb() {
        return this.biLeftThumb;
    }

    public final Object getBiLeftThumbDate() {
        return this.biLeftThumbDate;
    }

    public final Object getBiLminutia() {
        return this.biLminutia;
    }

    public final Object getBiLtm19794() {
        return this.biLtm19794;
    }

    public final Object getBiMinutiaCapturedThumb() {
        return this.biMinutiaCapturedThumb;
    }

    public final String getBiPhoto() {
        return this.biPhoto;
    }

    public final Object getBiPhotoDate() {
        return this.biPhotoDate;
    }

    public final String getBiRightThumb() {
        return this.biRightThumb;
    }

    public final Object getBiRightThumbDate() {
        return this.biRightThumbDate;
    }

    public final Object getBiRminutia() {
        return this.biRminutia;
    }

    public final Object getBiRtm19794() {
        return this.biRtm19794;
    }

    public final Object getBiSignDate() {
        return this.biSignDate;
    }

    public final String getBiSignature() {
        return this.biSignature;
    }

    public final Object getBiTokenId() {
        return this.biTokenId;
    }

    public final int getBiusid() {
        return this.biusid;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((this.biDlno.hashCode() * 31) + this.biEndorsedt.hashCode()) * 31) + this.biEndorsementNo.hashCode()) * 31) + this.biEndorsetime.hashCode()) * 31) + this.biLeftThumb.hashCode()) * 31) + this.biLeftThumbDate.hashCode()) * 31) + this.biLminutia.hashCode()) * 31) + this.biLtm19794.hashCode()) * 31) + this.biMinutiaCapturedThumb.hashCode()) * 31) + this.biPhoto.hashCode()) * 31) + this.biPhotoDate.hashCode()) * 31) + this.biRightThumb.hashCode()) * 31) + this.biRightThumbDate.hashCode()) * 31) + this.biRminutia.hashCode()) * 31) + this.biRtm19794.hashCode()) * 31) + this.biSignDate.hashCode()) * 31) + this.biSignature.hashCode()) * 31) + this.biTokenId.hashCode()) * 31) + Integer.hashCode(this.biusid);
    }

    public String toString() {
        return "BioImgObj(biDlno=" + this.biDlno + ", biEndorsedt=" + this.biEndorsedt + ", biEndorsementNo=" + this.biEndorsementNo + ", biEndorsetime=" + this.biEndorsetime + ", biLeftThumb=" + this.biLeftThumb + ", biLeftThumbDate=" + this.biLeftThumbDate + ", biLminutia=" + this.biLminutia + ", biLtm19794=" + this.biLtm19794 + ", biMinutiaCapturedThumb=" + this.biMinutiaCapturedThumb + ", biPhoto=" + this.biPhoto + ", biPhotoDate=" + this.biPhotoDate + ", biRightThumb=" + this.biRightThumb + ", biRightThumbDate=" + this.biRightThumbDate + ", biRminutia=" + this.biRminutia + ", biRtm19794=" + this.biRtm19794 + ", biSignDate=" + this.biSignDate + ", biSignature=" + this.biSignature + ", biTokenId=" + this.biTokenId + ", biusid=" + this.biusid + ')';
    }
}
