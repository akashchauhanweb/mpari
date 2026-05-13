package com.nic.mparivahan.Citizen.Models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/nic/mparivahan/Citizen/Models/VoilationEvidenceModel;", "", "evidenceType", "", "evidenceName", "evidenceVal", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEvidenceName", "()Ljava/lang/String;", "getEvidenceType", "getEvidenceVal", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class VoilationEvidenceModel {
    private final String evidenceName;
    private final String evidenceType;
    private final String evidenceVal;

    public VoilationEvidenceModel(String evidenceType, String evidenceName, String evidenceVal) {
        Intrinsics.checkNotNullParameter(evidenceType, "evidenceType");
        Intrinsics.checkNotNullParameter(evidenceName, "evidenceName");
        Intrinsics.checkNotNullParameter(evidenceVal, "evidenceVal");
        this.evidenceType = evidenceType;
        this.evidenceName = evidenceName;
        this.evidenceVal = evidenceVal;
    }

    public static /* synthetic */ VoilationEvidenceModel copy$default(VoilationEvidenceModel voilationEvidenceModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voilationEvidenceModel.evidenceType;
        }
        if ((i & 2) != 0) {
            str2 = voilationEvidenceModel.evidenceName;
        }
        if ((i & 4) != 0) {
            str3 = voilationEvidenceModel.evidenceVal;
        }
        return voilationEvidenceModel.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEvidenceType() {
        return this.evidenceType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEvidenceName() {
        return this.evidenceName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEvidenceVal() {
        return this.evidenceVal;
    }

    public final VoilationEvidenceModel copy(String evidenceType, String evidenceName, String evidenceVal) {
        Intrinsics.checkNotNullParameter(evidenceType, "evidenceType");
        Intrinsics.checkNotNullParameter(evidenceName, "evidenceName");
        Intrinsics.checkNotNullParameter(evidenceVal, "evidenceVal");
        return new VoilationEvidenceModel(evidenceType, evidenceName, evidenceVal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoilationEvidenceModel)) {
            return false;
        }
        VoilationEvidenceModel voilationEvidenceModel = (VoilationEvidenceModel) other;
        return Intrinsics.areEqual(this.evidenceType, voilationEvidenceModel.evidenceType) && Intrinsics.areEqual(this.evidenceName, voilationEvidenceModel.evidenceName) && Intrinsics.areEqual(this.evidenceVal, voilationEvidenceModel.evidenceVal);
    }

    public final String getEvidenceName() {
        return this.evidenceName;
    }

    public final String getEvidenceType() {
        return this.evidenceType;
    }

    public final String getEvidenceVal() {
        return this.evidenceVal;
    }

    public int hashCode() {
        return (((this.evidenceType.hashCode() * 31) + this.evidenceName.hashCode()) * 31) + this.evidenceVal.hashCode();
    }

    public String toString() {
        return "VoilationEvidenceModel(evidenceType=" + this.evidenceType + ", evidenceName=" + this.evidenceName + ", evidenceVal=" + this.evidenceVal + ')';
    }
}
