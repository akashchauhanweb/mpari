package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\bJ\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B±\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jµ\u0002\u0010R\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010S\u001a\u00020T2\b\u0010U\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u0010V\u001a\u00020WHÖ\u0001J\t\u0010X\u001a\u00020\tHÖ\u0001R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\"R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\"R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\"R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\"R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\"R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\"R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\"R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001fR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\"R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001fR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\"R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\"R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\"R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\"R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001fR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\"R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\u001f¨\u0006Y"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/BioImgObj;", "Ljava/io/Serializable;", "biMinutiaCapturedThumb", "", "biLminutia", "biDigest", "biEndorsetime", "biConfirmCapture", "biRightThumb", "", "biEndorsementNo", "biPhoto", "biLeftThumbDate", "biDlno", "biLeftThumb", "bdDevId", "biBioId", "biSignDate", "biLtm19794", "biRtm19794", "biSignature", "biEndorsedt", "biBioCapturedDt", "biPhotoDate", "biRminutia", "biApplno", "biusid", "biRightThumbDate", "biTokenId", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", "getBdDevId", "()Ljava/lang/String;", "getBiApplno", "getBiBioCapturedDt", "()Ljava/lang/Object;", "getBiBioId", "getBiConfirmCapture", "getBiDigest", "getBiDlno", "getBiEndorsedt", "getBiEndorsementNo", "getBiEndorsetime", "getBiLeftThumb", "getBiLeftThumbDate", "getBiLminutia", "getBiLtm19794", "getBiMinutiaCapturedThumb", "getBiPhoto", "getBiPhotoDate", "getBiRightThumb", "getBiRightThumbDate", "getBiRminutia", "getBiRtm19794", "getBiSignDate", "getBiSignature", "getBiTokenId", "getBiusid", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    private final String biRightThumb;
    private final Object biRightThumbDate;
    private final Object biRminutia;
    private final Object biRtm19794;
    private final Object biSignDate;
    private final String biSignature;
    private final Object biTokenId;
    private final String biusid;

    public BioImgObj() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554431, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Object getBiMinutiaCapturedThumb() {
        return this.biMinutiaCapturedThumb;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Object getBiDlno() {
        return this.biDlno;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Object getBiLeftThumb() {
        return this.biLeftThumb;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getBdDevId() {
        return this.bdDevId;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getBiBioId() {
        return this.biBioId;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Object getBiSignDate() {
        return this.biSignDate;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Object getBiLtm19794() {
        return this.biLtm19794;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Object getBiRtm19794() {
        return this.biRtm19794;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getBiSignature() {
        return this.biSignature;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Object getBiEndorsedt() {
        return this.biEndorsedt;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Object getBiBioCapturedDt() {
        return this.biBioCapturedDt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getBiLminutia() {
        return this.biLminutia;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Object getBiPhotoDate() {
        return this.biPhotoDate;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Object getBiRminutia() {
        return this.biRminutia;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getBiApplno() {
        return this.biApplno;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getBiusid() {
        return this.biusid;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Object getBiRightThumbDate() {
        return this.biRightThumbDate;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Object getBiTokenId() {
        return this.biTokenId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Object getBiDigest() {
        return this.biDigest;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Object getBiEndorsetime() {
        return this.biEndorsetime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Object getBiConfirmCapture() {
        return this.biConfirmCapture;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBiRightThumb() {
        return this.biRightThumb;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Object getBiEndorsementNo() {
        return this.biEndorsementNo;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getBiPhoto() {
        return this.biPhoto;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Object getBiLeftThumbDate() {
        return this.biLeftThumbDate;
    }

    public final BioImgObj copy(Object biMinutiaCapturedThumb, Object biLminutia, Object biDigest, Object biEndorsetime, Object biConfirmCapture, String biRightThumb, Object biEndorsementNo, String biPhoto, Object biLeftThumbDate, Object biDlno, Object biLeftThumb, String bdDevId, String biBioId, Object biSignDate, Object biLtm19794, Object biRtm19794, String biSignature, Object biEndorsedt, Object biBioCapturedDt, Object biPhotoDate, Object biRminutia, String biApplno, String biusid, Object biRightThumbDate, Object biTokenId) {
        return new BioImgObj(biMinutiaCapturedThumb, biLminutia, biDigest, biEndorsetime, biConfirmCapture, biRightThumb, biEndorsementNo, biPhoto, biLeftThumbDate, biDlno, biLeftThumb, bdDevId, biBioId, biSignDate, biLtm19794, biRtm19794, biSignature, biEndorsedt, biBioCapturedDt, biPhotoDate, biRminutia, biApplno, biusid, biRightThumbDate, biTokenId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BioImgObj)) {
            return false;
        }
        BioImgObj bioImgObj = (BioImgObj) other;
        return Intrinsics.areEqual(this.biMinutiaCapturedThumb, bioImgObj.biMinutiaCapturedThumb) && Intrinsics.areEqual(this.biLminutia, bioImgObj.biLminutia) && Intrinsics.areEqual(this.biDigest, bioImgObj.biDigest) && Intrinsics.areEqual(this.biEndorsetime, bioImgObj.biEndorsetime) && Intrinsics.areEqual(this.biConfirmCapture, bioImgObj.biConfirmCapture) && Intrinsics.areEqual(this.biRightThumb, bioImgObj.biRightThumb) && Intrinsics.areEqual(this.biEndorsementNo, bioImgObj.biEndorsementNo) && Intrinsics.areEqual(this.biPhoto, bioImgObj.biPhoto) && Intrinsics.areEqual(this.biLeftThumbDate, bioImgObj.biLeftThumbDate) && Intrinsics.areEqual(this.biDlno, bioImgObj.biDlno) && Intrinsics.areEqual(this.biLeftThumb, bioImgObj.biLeftThumb) && Intrinsics.areEqual(this.bdDevId, bioImgObj.bdDevId) && Intrinsics.areEqual(this.biBioId, bioImgObj.biBioId) && Intrinsics.areEqual(this.biSignDate, bioImgObj.biSignDate) && Intrinsics.areEqual(this.biLtm19794, bioImgObj.biLtm19794) && Intrinsics.areEqual(this.biRtm19794, bioImgObj.biRtm19794) && Intrinsics.areEqual(this.biSignature, bioImgObj.biSignature) && Intrinsics.areEqual(this.biEndorsedt, bioImgObj.biEndorsedt) && Intrinsics.areEqual(this.biBioCapturedDt, bioImgObj.biBioCapturedDt) && Intrinsics.areEqual(this.biPhotoDate, bioImgObj.biPhotoDate) && Intrinsics.areEqual(this.biRminutia, bioImgObj.biRminutia) && Intrinsics.areEqual(this.biApplno, bioImgObj.biApplno) && Intrinsics.areEqual(this.biusid, bioImgObj.biusid) && Intrinsics.areEqual(this.biRightThumbDate, bioImgObj.biRightThumbDate) && Intrinsics.areEqual(this.biTokenId, bioImgObj.biTokenId);
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

    public final String getBiusid() {
        return this.biusid;
    }

    public int hashCode() {
        Object obj = this.biMinutiaCapturedThumb;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.biLminutia;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.biDigest;
        int iHashCode3 = (iHashCode2 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.biEndorsetime;
        int iHashCode4 = (iHashCode3 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        Object obj5 = this.biConfirmCapture;
        int iHashCode5 = (iHashCode4 + (obj5 == null ? 0 : obj5.hashCode())) * 31;
        String str = this.biRightThumb;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Object obj6 = this.biEndorsementNo;
        int iHashCode7 = (iHashCode6 + (obj6 == null ? 0 : obj6.hashCode())) * 31;
        String str2 = this.biPhoto;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Object obj7 = this.biLeftThumbDate;
        int iHashCode9 = (iHashCode8 + (obj7 == null ? 0 : obj7.hashCode())) * 31;
        Object obj8 = this.biDlno;
        int iHashCode10 = (iHashCode9 + (obj8 == null ? 0 : obj8.hashCode())) * 31;
        Object obj9 = this.biLeftThumb;
        int iHashCode11 = (iHashCode10 + (obj9 == null ? 0 : obj9.hashCode())) * 31;
        String str3 = this.bdDevId;
        int iHashCode12 = (iHashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.biBioId;
        int iHashCode13 = (iHashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Object obj10 = this.biSignDate;
        int iHashCode14 = (iHashCode13 + (obj10 == null ? 0 : obj10.hashCode())) * 31;
        Object obj11 = this.biLtm19794;
        int iHashCode15 = (iHashCode14 + (obj11 == null ? 0 : obj11.hashCode())) * 31;
        Object obj12 = this.biRtm19794;
        int iHashCode16 = (iHashCode15 + (obj12 == null ? 0 : obj12.hashCode())) * 31;
        String str5 = this.biSignature;
        int iHashCode17 = (iHashCode16 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Object obj13 = this.biEndorsedt;
        int iHashCode18 = (iHashCode17 + (obj13 == null ? 0 : obj13.hashCode())) * 31;
        Object obj14 = this.biBioCapturedDt;
        int iHashCode19 = (iHashCode18 + (obj14 == null ? 0 : obj14.hashCode())) * 31;
        Object obj15 = this.biPhotoDate;
        int iHashCode20 = (iHashCode19 + (obj15 == null ? 0 : obj15.hashCode())) * 31;
        Object obj16 = this.biRminutia;
        int iHashCode21 = (iHashCode20 + (obj16 == null ? 0 : obj16.hashCode())) * 31;
        String str6 = this.biApplno;
        int iHashCode22 = (iHashCode21 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.biusid;
        int iHashCode23 = (iHashCode22 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Object obj17 = this.biRightThumbDate;
        int iHashCode24 = (iHashCode23 + (obj17 == null ? 0 : obj17.hashCode())) * 31;
        Object obj18 = this.biTokenId;
        return iHashCode24 + (obj18 != null ? obj18.hashCode() : 0);
    }

    public String toString() {
        return "BioImgObj(biMinutiaCapturedThumb=" + this.biMinutiaCapturedThumb + ", biLminutia=" + this.biLminutia + ", biDigest=" + this.biDigest + ", biEndorsetime=" + this.biEndorsetime + ", biConfirmCapture=" + this.biConfirmCapture + ", biRightThumb=" + this.biRightThumb + ", biEndorsementNo=" + this.biEndorsementNo + ", biPhoto=" + this.biPhoto + ", biLeftThumbDate=" + this.biLeftThumbDate + ", biDlno=" + this.biDlno + ", biLeftThumb=" + this.biLeftThumb + ", bdDevId=" + this.bdDevId + ", biBioId=" + this.biBioId + ", biSignDate=" + this.biSignDate + ", biLtm19794=" + this.biLtm19794 + ", biRtm19794=" + this.biRtm19794 + ", biSignature=" + this.biSignature + ", biEndorsedt=" + this.biEndorsedt + ", biBioCapturedDt=" + this.biBioCapturedDt + ", biPhotoDate=" + this.biPhotoDate + ", biRminutia=" + this.biRminutia + ", biApplno=" + this.biApplno + ", biusid=" + this.biusid + ", biRightThumbDate=" + this.biRightThumbDate + ", biTokenId=" + this.biTokenId + ')';
    }

    public BioImgObj(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, Object obj6, String str2, Object obj7, Object obj8, Object obj9, String str3, String str4, Object obj10, Object obj11, Object obj12, String str5, Object obj13, Object obj14, Object obj15, Object obj16, String str6, String str7, Object obj17, Object obj18) {
        this.biMinutiaCapturedThumb = obj;
        this.biLminutia = obj2;
        this.biDigest = obj3;
        this.biEndorsetime = obj4;
        this.biConfirmCapture = obj5;
        this.biRightThumb = str;
        this.biEndorsementNo = obj6;
        this.biPhoto = str2;
        this.biLeftThumbDate = obj7;
        this.biDlno = obj8;
        this.biLeftThumb = obj9;
        this.bdDevId = str3;
        this.biBioId = str4;
        this.biSignDate = obj10;
        this.biLtm19794 = obj11;
        this.biRtm19794 = obj12;
        this.biSignature = str5;
        this.biEndorsedt = obj13;
        this.biBioCapturedDt = obj14;
        this.biPhotoDate = obj15;
        this.biRminutia = obj16;
        this.biApplno = str6;
        this.biusid = str7;
        this.biRightThumbDate = obj17;
        this.biTokenId = obj18;
    }

    public /* synthetic */ BioImgObj(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, Object obj6, String str2, Object obj7, Object obj8, Object obj9, String str3, String str4, Object obj10, Object obj11, Object obj12, String str5, Object obj13, Object obj14, Object obj15, Object obj16, String str6, String str7, Object obj17, Object obj18, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? null : obj2, (i & 4) != 0 ? null : obj3, (i & 8) != 0 ? null : obj4, (i & 16) != 0 ? null : obj5, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : obj6, (i & 128) != 0 ? null : str2, (i & 256) != 0 ? null : obj7, (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : obj8, (i & 1024) != 0 ? null : obj9, (i & 2048) != 0 ? null : str3, (i & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? null : str4, (i & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? null : obj10, (i & 16384) != 0 ? null : obj11, (i & 32768) != 0 ? null : obj12, (i & 65536) != 0 ? null : str5, (i & 131072) != 0 ? null : obj13, (i & 262144) != 0 ? null : obj14, (i & 524288) != 0 ? null : obj15, (i & 1048576) != 0 ? null : obj16, (i & 2097152) != 0 ? null : str6, (i & 4194304) != 0 ? null : str7, (i & 8388608) != 0 ? null : obj17, (i & 16777216) != 0 ? null : obj18);
    }
}
