package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006!"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/UploadPhotoSignReqeust;", "", "aiApplno", "", "dateOfBirth", "statecode", "aiphotos", "aiSignatures", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAiApplno", "()Ljava/lang/String;", "setAiApplno", "(Ljava/lang/String;)V", "getAiSignatures", "setAiSignatures", "getAiphotos", "setAiphotos", "getDateOfBirth", "setDateOfBirth", "getStatecode", "setStatecode", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class UploadPhotoSignReqeust {
    private String aiApplno;
    private String aiSignatures;
    private String aiphotos;
    private String dateOfBirth;
    private String statecode;

    public UploadPhotoSignReqeust(String aiApplno, String dateOfBirth, String statecode, String aiphotos, String aiSignatures) {
        Intrinsics.checkNotNullParameter(aiApplno, "aiApplno");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(statecode, "statecode");
        Intrinsics.checkNotNullParameter(aiphotos, "aiphotos");
        Intrinsics.checkNotNullParameter(aiSignatures, "aiSignatures");
        this.aiApplno = aiApplno;
        this.dateOfBirth = dateOfBirth;
        this.statecode = statecode;
        this.aiphotos = aiphotos;
        this.aiSignatures = aiSignatures;
    }

    public static /* synthetic */ UploadPhotoSignReqeust copy$default(UploadPhotoSignReqeust uploadPhotoSignReqeust, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uploadPhotoSignReqeust.aiApplno;
        }
        if ((i & 2) != 0) {
            str2 = uploadPhotoSignReqeust.dateOfBirth;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = uploadPhotoSignReqeust.statecode;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = uploadPhotoSignReqeust.aiphotos;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = uploadPhotoSignReqeust.aiSignatures;
        }
        return uploadPhotoSignReqeust.copy(str, str6, str7, str8, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAiApplno() {
        return this.aiApplno;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatecode() {
        return this.statecode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAiphotos() {
        return this.aiphotos;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAiSignatures() {
        return this.aiSignatures;
    }

    public final UploadPhotoSignReqeust copy(String aiApplno, String dateOfBirth, String statecode, String aiphotos, String aiSignatures) {
        Intrinsics.checkNotNullParameter(aiApplno, "aiApplno");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(statecode, "statecode");
        Intrinsics.checkNotNullParameter(aiphotos, "aiphotos");
        Intrinsics.checkNotNullParameter(aiSignatures, "aiSignatures");
        return new UploadPhotoSignReqeust(aiApplno, dateOfBirth, statecode, aiphotos, aiSignatures);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadPhotoSignReqeust)) {
            return false;
        }
        UploadPhotoSignReqeust uploadPhotoSignReqeust = (UploadPhotoSignReqeust) other;
        return Intrinsics.areEqual(this.aiApplno, uploadPhotoSignReqeust.aiApplno) && Intrinsics.areEqual(this.dateOfBirth, uploadPhotoSignReqeust.dateOfBirth) && Intrinsics.areEqual(this.statecode, uploadPhotoSignReqeust.statecode) && Intrinsics.areEqual(this.aiphotos, uploadPhotoSignReqeust.aiphotos) && Intrinsics.areEqual(this.aiSignatures, uploadPhotoSignReqeust.aiSignatures);
    }

    public final String getAiApplno() {
        return this.aiApplno;
    }

    public final String getAiSignatures() {
        return this.aiSignatures;
    }

    public final String getAiphotos() {
        return this.aiphotos;
    }

    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final String getStatecode() {
        return this.statecode;
    }

    public int hashCode() {
        return (((((((this.aiApplno.hashCode() * 31) + this.dateOfBirth.hashCode()) * 31) + this.statecode.hashCode()) * 31) + this.aiphotos.hashCode()) * 31) + this.aiSignatures.hashCode();
    }

    public final void setAiApplno(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aiApplno = str;
    }

    public final void setAiSignatures(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aiSignatures = str;
    }

    public final void setAiphotos(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aiphotos = str;
    }

    public final void setDateOfBirth(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dateOfBirth = str;
    }

    public final void setStatecode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.statecode = str;
    }

    public String toString() {
        return "UploadPhotoSignReqeust(aiApplno=" + this.aiApplno + ", dateOfBirth=" + this.dateOfBirth + ", statecode=" + this.statecode + ", aiphotos=" + this.aiphotos + ", aiSignatures=" + this.aiSignatures + ')';
    }
}
