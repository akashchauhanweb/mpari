package com.nic.mparivahan.Dl.Model;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\bM\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÏ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0006\u0012\u0006\u0010\u001c\u001a\u00020\u0003¢\u0006\u0002\u0010\u001dJ\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0006HÆ\u0003J\t\u0010;\u001a\u00020\u0006HÆ\u0003J\t\u0010<\u001a\u00020\u0006HÆ\u0003J\t\u0010=\u001a\u00020\u0006HÆ\u0003J\t\u0010>\u001a\u00020\u0006HÆ\u0003J\t\u0010?\u001a\u00020\u0006HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0006HÆ\u0003J\t\u0010B\u001a\u00020\u0006HÆ\u0003J\t\u0010C\u001a\u00020\u0006HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0006HÆ\u0003J\t\u0010F\u001a\u00020\u0006HÆ\u0003J\t\u0010G\u001a\u00020\u0006HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0006HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0006HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0006HÆ\u0003J\t\u0010N\u001a\u00020\u0006HÆ\u0003J\t\u0010O\u001a\u00020\u0006HÆ\u0003J\t\u0010P\u001a\u00020\u0006HÆ\u0003J\t\u0010Q\u001a\u00020\u0006HÆ\u0003J\u0085\u0002\u0010R\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u0003HÆ\u0001J\u0013\u0010S\u001a\u00020T2\b\u0010U\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010V\u001a\u00020WHÖ\u0001J\t\u0010X\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\"R\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\"R\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\"R\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\"R\u0011\u0010\u0010\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\"R\u0011\u0010\u0011\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\"R\u0011\u0010\u0012\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\"R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001fR\u0011\u0010\u0014\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\"R\u0011\u0010\u0015\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\"R\u0011\u0010\u0016\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\"R\u0011\u0010\u0017\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\"R\u0011\u0010\u0018\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\"R\u0011\u0010\u0019\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\"R\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001fR\u0011\u0010\u001b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\"R\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\u001f¨\u0006Y"}, d2 = {"Lcom/nic/mparivahan/Dl/Model/BioImgObj;", "Ljava/io/Serializable;", "bdDevId", "", "biApplno", "biBioCapturedDt", "", "biBioId", "biConfirmCapture", "biDigest", "biDlno", "biEndorsedt", "biEndorsementNo", "biEndorsetime", "biLeftThumb", "biLeftThumbDate", "biLminutia", "biLtm19794", "biMinutiaCapturedThumb", "biPhoto", "biPhotoDate", "biRightThumb", "biRightThumbDate", "biRminutia", "biRtm19794", "biSignDate", "biSignature", "biTokenId", "biusid", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V", "getBdDevId", "()Ljava/lang/String;", "getBiApplno", "getBiBioCapturedDt", "()Ljava/lang/Object;", "getBiBioId", "getBiConfirmCapture", "getBiDigest", "getBiDlno", "getBiEndorsedt", "getBiEndorsementNo", "getBiEndorsetime", "getBiLeftThumb", "getBiLeftThumbDate", "getBiLminutia", "getBiLtm19794", "getBiMinutiaCapturedThumb", "getBiPhoto", "getBiPhotoDate", "getBiRightThumb", "getBiRightThumbDate", "getBiRminutia", "getBiRtm19794", "getBiSignDate", "getBiSignature", "getBiTokenId", "getBiusid", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class BioImgObj implements Serializable {
    private final String bdDevId;
    private final String biApplno;
    private final Object biBioCapturedDt;
    private final String biBioId;
    private final Object biConfirmCapture;
    private final Object biDigest;
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
    private final Object biRightThumb;
    private final Object biRightThumbDate;
    private final Object biRminutia;
    private final Object biRtm19794;
    private final Object biSignDate;
    private final String biSignature;
    private final Object biTokenId;
    private final String biusid;

    public BioImgObj(String bdDevId, String biApplno, Object biBioCapturedDt, String biBioId, Object biConfirmCapture, Object biDigest, Object biDlno, Object biEndorsedt, Object biEndorsementNo, Object biEndorsetime, Object biLeftThumb, Object biLeftThumbDate, Object biLminutia, Object biLtm19794, Object biMinutiaCapturedThumb, String str, Object biPhotoDate, Object biRightThumb, Object biRightThumbDate, Object biRminutia, Object biRtm19794, Object biSignDate, String biSignature, Object biTokenId, String biusid) {
        Intrinsics.checkNotNullParameter(bdDevId, "bdDevId");
        Intrinsics.checkNotNullParameter(biApplno, "biApplno");
        Intrinsics.checkNotNullParameter(biBioCapturedDt, "biBioCapturedDt");
        Intrinsics.checkNotNullParameter(biBioId, "biBioId");
        Intrinsics.checkNotNullParameter(biConfirmCapture, "biConfirmCapture");
        Intrinsics.checkNotNullParameter(biDigest, "biDigest");
        Intrinsics.checkNotNullParameter(biDlno, "biDlno");
        Intrinsics.checkNotNullParameter(biEndorsedt, "biEndorsedt");
        Intrinsics.checkNotNullParameter(biEndorsementNo, "biEndorsementNo");
        Intrinsics.checkNotNullParameter(biEndorsetime, "biEndorsetime");
        Intrinsics.checkNotNullParameter(biLeftThumb, "biLeftThumb");
        Intrinsics.checkNotNullParameter(biLeftThumbDate, "biLeftThumbDate");
        Intrinsics.checkNotNullParameter(biLminutia, "biLminutia");
        Intrinsics.checkNotNullParameter(biLtm19794, "biLtm19794");
        Intrinsics.checkNotNullParameter(biMinutiaCapturedThumb, "biMinutiaCapturedThumb");
        Intrinsics.checkNotNullParameter(biPhotoDate, "biPhotoDate");
        Intrinsics.checkNotNullParameter(biRightThumb, "biRightThumb");
        Intrinsics.checkNotNullParameter(biRightThumbDate, "biRightThumbDate");
        Intrinsics.checkNotNullParameter(biRminutia, "biRminutia");
        Intrinsics.checkNotNullParameter(biRtm19794, "biRtm19794");
        Intrinsics.checkNotNullParameter(biSignDate, "biSignDate");
        Intrinsics.checkNotNullParameter(biSignature, "biSignature");
        Intrinsics.checkNotNullParameter(biTokenId, "biTokenId");
        Intrinsics.checkNotNullParameter(biusid, "biusid");
        this.bdDevId = bdDevId;
        this.biApplno = biApplno;
        this.biBioCapturedDt = biBioCapturedDt;
        this.biBioId = biBioId;
        this.biConfirmCapture = biConfirmCapture;
        this.biDigest = biDigest;
        this.biDlno = biDlno;
        this.biEndorsedt = biEndorsedt;
        this.biEndorsementNo = biEndorsementNo;
        this.biEndorsetime = biEndorsetime;
        this.biLeftThumb = biLeftThumb;
        this.biLeftThumbDate = biLeftThumbDate;
        this.biLminutia = biLminutia;
        this.biLtm19794 = biLtm19794;
        this.biMinutiaCapturedThumb = biMinutiaCapturedThumb;
        this.biPhoto = str;
        this.biPhotoDate = biPhotoDate;
        this.biRightThumb = biRightThumb;
        this.biRightThumbDate = biRightThumbDate;
        this.biRminutia = biRminutia;
        this.biRtm19794 = biRtm19794;
        this.biSignDate = biSignDate;
        this.biSignature = biSignature;
        this.biTokenId = biTokenId;
        this.biusid = biusid;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBdDevId() {
        return this.bdDevId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Object getBiEndorsetime() {
        return this.biEndorsetime;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Object getBiLeftThumb() {
        return this.biLeftThumb;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Object getBiLeftThumbDate() {
        return this.biLeftThumbDate;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Object getBiLminutia() {
        return this.biLminutia;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Object getBiLtm19794() {
        return this.biLtm19794;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Object getBiMinutiaCapturedThumb() {
        return this.biMinutiaCapturedThumb;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getBiPhoto() {
        return this.biPhoto;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Object getBiPhotoDate() {
        return this.biPhotoDate;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Object getBiRightThumb() {
        return this.biRightThumb;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Object getBiRightThumbDate() {
        return this.biRightThumbDate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBiApplno() {
        return this.biApplno;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Object getBiRminutia() {
        return this.biRminutia;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Object getBiRtm19794() {
        return this.biRtm19794;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Object getBiSignDate() {
        return this.biSignDate;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getBiSignature() {
        return this.biSignature;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Object getBiTokenId() {
        return this.biTokenId;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getBiusid() {
        return this.biusid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Object getBiBioCapturedDt() {
        return this.biBioCapturedDt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBiBioId() {
        return this.biBioId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Object getBiConfirmCapture() {
        return this.biConfirmCapture;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Object getBiDigest() {
        return this.biDigest;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Object getBiDlno() {
        return this.biDlno;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Object getBiEndorsedt() {
        return this.biEndorsedt;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Object getBiEndorsementNo() {
        return this.biEndorsementNo;
    }

    public final BioImgObj copy(String bdDevId, String biApplno, Object biBioCapturedDt, String biBioId, Object biConfirmCapture, Object biDigest, Object biDlno, Object biEndorsedt, Object biEndorsementNo, Object biEndorsetime, Object biLeftThumb, Object biLeftThumbDate, Object biLminutia, Object biLtm19794, Object biMinutiaCapturedThumb, String biPhoto, Object biPhotoDate, Object biRightThumb, Object biRightThumbDate, Object biRminutia, Object biRtm19794, Object biSignDate, String biSignature, Object biTokenId, String biusid) {
        Intrinsics.checkNotNullParameter(bdDevId, "bdDevId");
        Intrinsics.checkNotNullParameter(biApplno, "biApplno");
        Intrinsics.checkNotNullParameter(biBioCapturedDt, "biBioCapturedDt");
        Intrinsics.checkNotNullParameter(biBioId, "biBioId");
        Intrinsics.checkNotNullParameter(biConfirmCapture, "biConfirmCapture");
        Intrinsics.checkNotNullParameter(biDigest, "biDigest");
        Intrinsics.checkNotNullParameter(biDlno, "biDlno");
        Intrinsics.checkNotNullParameter(biEndorsedt, "biEndorsedt");
        Intrinsics.checkNotNullParameter(biEndorsementNo, "biEndorsementNo");
        Intrinsics.checkNotNullParameter(biEndorsetime, "biEndorsetime");
        Intrinsics.checkNotNullParameter(biLeftThumb, "biLeftThumb");
        Intrinsics.checkNotNullParameter(biLeftThumbDate, "biLeftThumbDate");
        Intrinsics.checkNotNullParameter(biLminutia, "biLminutia");
        Intrinsics.checkNotNullParameter(biLtm19794, "biLtm19794");
        Intrinsics.checkNotNullParameter(biMinutiaCapturedThumb, "biMinutiaCapturedThumb");
        Intrinsics.checkNotNullParameter(biPhotoDate, "biPhotoDate");
        Intrinsics.checkNotNullParameter(biRightThumb, "biRightThumb");
        Intrinsics.checkNotNullParameter(biRightThumbDate, "biRightThumbDate");
        Intrinsics.checkNotNullParameter(biRminutia, "biRminutia");
        Intrinsics.checkNotNullParameter(biRtm19794, "biRtm19794");
        Intrinsics.checkNotNullParameter(biSignDate, "biSignDate");
        Intrinsics.checkNotNullParameter(biSignature, "biSignature");
        Intrinsics.checkNotNullParameter(biTokenId, "biTokenId");
        Intrinsics.checkNotNullParameter(biusid, "biusid");
        return new BioImgObj(bdDevId, biApplno, biBioCapturedDt, biBioId, biConfirmCapture, biDigest, biDlno, biEndorsedt, biEndorsementNo, biEndorsetime, biLeftThumb, biLeftThumbDate, biLminutia, biLtm19794, biMinutiaCapturedThumb, biPhoto, biPhotoDate, biRightThumb, biRightThumbDate, biRminutia, biRtm19794, biSignDate, biSignature, biTokenId, biusid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BioImgObj)) {
            return false;
        }
        BioImgObj bioImgObj = (BioImgObj) other;
        return Intrinsics.areEqual(this.bdDevId, bioImgObj.bdDevId) && Intrinsics.areEqual(this.biApplno, bioImgObj.biApplno) && Intrinsics.areEqual(this.biBioCapturedDt, bioImgObj.biBioCapturedDt) && Intrinsics.areEqual(this.biBioId, bioImgObj.biBioId) && Intrinsics.areEqual(this.biConfirmCapture, bioImgObj.biConfirmCapture) && Intrinsics.areEqual(this.biDigest, bioImgObj.biDigest) && Intrinsics.areEqual(this.biDlno, bioImgObj.biDlno) && Intrinsics.areEqual(this.biEndorsedt, bioImgObj.biEndorsedt) && Intrinsics.areEqual(this.biEndorsementNo, bioImgObj.biEndorsementNo) && Intrinsics.areEqual(this.biEndorsetime, bioImgObj.biEndorsetime) && Intrinsics.areEqual(this.biLeftThumb, bioImgObj.biLeftThumb) && Intrinsics.areEqual(this.biLeftThumbDate, bioImgObj.biLeftThumbDate) && Intrinsics.areEqual(this.biLminutia, bioImgObj.biLminutia) && Intrinsics.areEqual(this.biLtm19794, bioImgObj.biLtm19794) && Intrinsics.areEqual(this.biMinutiaCapturedThumb, bioImgObj.biMinutiaCapturedThumb) && Intrinsics.areEqual(this.biPhoto, bioImgObj.biPhoto) && Intrinsics.areEqual(this.biPhotoDate, bioImgObj.biPhotoDate) && Intrinsics.areEqual(this.biRightThumb, bioImgObj.biRightThumb) && Intrinsics.areEqual(this.biRightThumbDate, bioImgObj.biRightThumbDate) && Intrinsics.areEqual(this.biRminutia, bioImgObj.biRminutia) && Intrinsics.areEqual(this.biRtm19794, bioImgObj.biRtm19794) && Intrinsics.areEqual(this.biSignDate, bioImgObj.biSignDate) && Intrinsics.areEqual(this.biSignature, bioImgObj.biSignature) && Intrinsics.areEqual(this.biTokenId, bioImgObj.biTokenId) && Intrinsics.areEqual(this.biusid, bioImgObj.biusid);
    }

    public final String getBdDevId() {
        return this.bdDevId;
    }

    public final String getBiApplno() {
        return this.biApplno;
    }

    public final Object getBiBioCapturedDt() {
        return this.biBioCapturedDt;
    }

    public final String getBiBioId() {
        return this.biBioId;
    }

    public final Object getBiConfirmCapture() {
        return this.biConfirmCapture;
    }

    public final Object getBiDigest() {
        return this.biDigest;
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

    public final Object getBiRightThumb() {
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

    public final String getBiusid() {
        return this.biusid;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((this.bdDevId.hashCode() * 31) + this.biApplno.hashCode()) * 31) + this.biBioCapturedDt.hashCode()) * 31) + this.biBioId.hashCode()) * 31) + this.biConfirmCapture.hashCode()) * 31) + this.biDigest.hashCode()) * 31) + this.biDlno.hashCode()) * 31) + this.biEndorsedt.hashCode()) * 31) + this.biEndorsementNo.hashCode()) * 31) + this.biEndorsetime.hashCode()) * 31) + this.biLeftThumb.hashCode()) * 31) + this.biLeftThumbDate.hashCode()) * 31) + this.biLminutia.hashCode()) * 31) + this.biLtm19794.hashCode()) * 31) + this.biMinutiaCapturedThumb.hashCode()) * 31;
        String str = this.biPhoto;
        return ((((((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.biPhotoDate.hashCode()) * 31) + this.biRightThumb.hashCode()) * 31) + this.biRightThumbDate.hashCode()) * 31) + this.biRminutia.hashCode()) * 31) + this.biRtm19794.hashCode()) * 31) + this.biSignDate.hashCode()) * 31) + this.biSignature.hashCode()) * 31) + this.biTokenId.hashCode()) * 31) + this.biusid.hashCode();
    }

    public String toString() {
        return "BioImgObj(bdDevId=" + this.bdDevId + ", biApplno=" + this.biApplno + ", biBioCapturedDt=" + this.biBioCapturedDt + ", biBioId=" + this.biBioId + ", biConfirmCapture=" + this.biConfirmCapture + ", biDigest=" + this.biDigest + ", biDlno=" + this.biDlno + ", biEndorsedt=" + this.biEndorsedt + ", biEndorsementNo=" + this.biEndorsementNo + ", biEndorsetime=" + this.biEndorsetime + ", biLeftThumb=" + this.biLeftThumb + ", biLeftThumbDate=" + this.biLeftThumbDate + ", biLminutia=" + this.biLminutia + ", biLtm19794=" + this.biLtm19794 + ", biMinutiaCapturedThumb=" + this.biMinutiaCapturedThumb + ", biPhoto=" + this.biPhoto + ", biPhotoDate=" + this.biPhotoDate + ", biRightThumb=" + this.biRightThumb + ", biRightThumbDate=" + this.biRightThumbDate + ", biRminutia=" + this.biRminutia + ", biRtm19794=" + this.biRtm19794 + ", biSignDate=" + this.biSignDate + ", biSignature=" + this.biSignature + ", biTokenId=" + this.biTokenId + ", biusid=" + this.biusid + ')';
    }
}
