package com.nic.mparivahan.Account.Model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003¢\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\tHÆ\u0003J\t\u0010,\u001a\u00020\u000bHÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u000eHÆ\u0003J\u0081\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0003HÆ\u0001J\u0013\u00100\u001a\u00020\t2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u000eHÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014¨\u00064"}, d2 = {"Lcom/nic/mparivahan/Account/Model/MparCitizenUserX;", "", "ctzCreatedAt", "", "ctzDispName", "ctzEmail", "ctzImage", "ctzMobile", "ctzMpinStatus", "", "ctzRecordId", "", "ctzStateCd", "ctzStatus", "", "ctzToken", "ctzTokenAt", "ctzUpdatedAt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCtzCreatedAt", "()Ljava/lang/String;", "getCtzDispName", "getCtzEmail", "getCtzImage", "getCtzMobile", "getCtzMpinStatus", "()Z", "getCtzRecordId", "()J", "getCtzStateCd", "getCtzStatus", "()I", "getCtzToken", "getCtzTokenAt", "getCtzUpdatedAt", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class MparCitizenUserX {
    private final String ctzCreatedAt;
    private final String ctzDispName;
    private final String ctzEmail;
    private final String ctzImage;
    private final String ctzMobile;
    private final boolean ctzMpinStatus;
    private final long ctzRecordId;
    private final String ctzStateCd;
    private final int ctzStatus;
    private final String ctzToken;
    private final String ctzTokenAt;
    private final String ctzUpdatedAt;

    public MparCitizenUserX(String ctzCreatedAt, String ctzDispName, String ctzEmail, String ctzImage, String ctzMobile, boolean z, long j, String ctzStateCd, int i, String ctzToken, String ctzTokenAt, String ctzUpdatedAt) {
        Intrinsics.checkNotNullParameter(ctzCreatedAt, "ctzCreatedAt");
        Intrinsics.checkNotNullParameter(ctzDispName, "ctzDispName");
        Intrinsics.checkNotNullParameter(ctzEmail, "ctzEmail");
        Intrinsics.checkNotNullParameter(ctzImage, "ctzImage");
        Intrinsics.checkNotNullParameter(ctzMobile, "ctzMobile");
        Intrinsics.checkNotNullParameter(ctzStateCd, "ctzStateCd");
        Intrinsics.checkNotNullParameter(ctzToken, "ctzToken");
        Intrinsics.checkNotNullParameter(ctzTokenAt, "ctzTokenAt");
        Intrinsics.checkNotNullParameter(ctzUpdatedAt, "ctzUpdatedAt");
        this.ctzCreatedAt = ctzCreatedAt;
        this.ctzDispName = ctzDispName;
        this.ctzEmail = ctzEmail;
        this.ctzImage = ctzImage;
        this.ctzMobile = ctzMobile;
        this.ctzMpinStatus = z;
        this.ctzRecordId = j;
        this.ctzStateCd = ctzStateCd;
        this.ctzStatus = i;
        this.ctzToken = ctzToken;
        this.ctzTokenAt = ctzTokenAt;
        this.ctzUpdatedAt = ctzUpdatedAt;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCtzCreatedAt() {
        return this.ctzCreatedAt;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getCtzToken() {
        return this.ctzToken;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getCtzTokenAt() {
        return this.ctzTokenAt;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getCtzUpdatedAt() {
        return this.ctzUpdatedAt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCtzDispName() {
        return this.ctzDispName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCtzEmail() {
        return this.ctzEmail;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCtzImage() {
        return this.ctzImage;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCtzMobile() {
        return this.ctzMobile;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getCtzMpinStatus() {
        return this.ctzMpinStatus;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getCtzRecordId() {
        return this.ctzRecordId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCtzStateCd() {
        return this.ctzStateCd;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getCtzStatus() {
        return this.ctzStatus;
    }

    public final MparCitizenUserX copy(String ctzCreatedAt, String ctzDispName, String ctzEmail, String ctzImage, String ctzMobile, boolean ctzMpinStatus, long ctzRecordId, String ctzStateCd, int ctzStatus, String ctzToken, String ctzTokenAt, String ctzUpdatedAt) {
        Intrinsics.checkNotNullParameter(ctzCreatedAt, "ctzCreatedAt");
        Intrinsics.checkNotNullParameter(ctzDispName, "ctzDispName");
        Intrinsics.checkNotNullParameter(ctzEmail, "ctzEmail");
        Intrinsics.checkNotNullParameter(ctzImage, "ctzImage");
        Intrinsics.checkNotNullParameter(ctzMobile, "ctzMobile");
        Intrinsics.checkNotNullParameter(ctzStateCd, "ctzStateCd");
        Intrinsics.checkNotNullParameter(ctzToken, "ctzToken");
        Intrinsics.checkNotNullParameter(ctzTokenAt, "ctzTokenAt");
        Intrinsics.checkNotNullParameter(ctzUpdatedAt, "ctzUpdatedAt");
        return new MparCitizenUserX(ctzCreatedAt, ctzDispName, ctzEmail, ctzImage, ctzMobile, ctzMpinStatus, ctzRecordId, ctzStateCd, ctzStatus, ctzToken, ctzTokenAt, ctzUpdatedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MparCitizenUserX)) {
            return false;
        }
        MparCitizenUserX mparCitizenUserX = (MparCitizenUserX) other;
        return Intrinsics.areEqual(this.ctzCreatedAt, mparCitizenUserX.ctzCreatedAt) && Intrinsics.areEqual(this.ctzDispName, mparCitizenUserX.ctzDispName) && Intrinsics.areEqual(this.ctzEmail, mparCitizenUserX.ctzEmail) && Intrinsics.areEqual(this.ctzImage, mparCitizenUserX.ctzImage) && Intrinsics.areEqual(this.ctzMobile, mparCitizenUserX.ctzMobile) && this.ctzMpinStatus == mparCitizenUserX.ctzMpinStatus && this.ctzRecordId == mparCitizenUserX.ctzRecordId && Intrinsics.areEqual(this.ctzStateCd, mparCitizenUserX.ctzStateCd) && this.ctzStatus == mparCitizenUserX.ctzStatus && Intrinsics.areEqual(this.ctzToken, mparCitizenUserX.ctzToken) && Intrinsics.areEqual(this.ctzTokenAt, mparCitizenUserX.ctzTokenAt) && Intrinsics.areEqual(this.ctzUpdatedAt, mparCitizenUserX.ctzUpdatedAt);
    }

    public final String getCtzCreatedAt() {
        return this.ctzCreatedAt;
    }

    public final String getCtzDispName() {
        return this.ctzDispName;
    }

    public final String getCtzEmail() {
        return this.ctzEmail;
    }

    public final String getCtzImage() {
        return this.ctzImage;
    }

    public final String getCtzMobile() {
        return this.ctzMobile;
    }

    public final boolean getCtzMpinStatus() {
        return this.ctzMpinStatus;
    }

    public final long getCtzRecordId() {
        return this.ctzRecordId;
    }

    public final String getCtzStateCd() {
        return this.ctzStateCd;
    }

    public final int getCtzStatus() {
        return this.ctzStatus;
    }

    public final String getCtzToken() {
        return this.ctzToken;
    }

    public final String getCtzTokenAt() {
        return this.ctzTokenAt;
    }

    public final String getCtzUpdatedAt() {
        return this.ctzUpdatedAt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    public int hashCode() {
        int iHashCode = ((((((((this.ctzCreatedAt.hashCode() * 31) + this.ctzDispName.hashCode()) * 31) + this.ctzEmail.hashCode()) * 31) + this.ctzImage.hashCode()) * 31) + this.ctzMobile.hashCode()) * 31;
        boolean z = this.ctzMpinStatus;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((((((((((iHashCode + r1) * 31) + Long.hashCode(this.ctzRecordId)) * 31) + this.ctzStateCd.hashCode()) * 31) + Integer.hashCode(this.ctzStatus)) * 31) + this.ctzToken.hashCode()) * 31) + this.ctzTokenAt.hashCode()) * 31) + this.ctzUpdatedAt.hashCode();
    }

    public String toString() {
        return "MparCitizenUserX(ctzCreatedAt=" + this.ctzCreatedAt + ", ctzDispName=" + this.ctzDispName + ", ctzEmail=" + this.ctzEmail + ", ctzImage=" + this.ctzImage + ", ctzMobile=" + this.ctzMobile + ", ctzMpinStatus=" + this.ctzMpinStatus + ", ctzRecordId=" + this.ctzRecordId + ", ctzStateCd=" + this.ctzStateCd + ", ctzStatus=" + this.ctzStatus + ", ctzToken=" + this.ctzToken + ", ctzTokenAt=" + this.ctzTokenAt + ", ctzUpdatedAt=" + this.ctzUpdatedAt + ')';
    }
}
