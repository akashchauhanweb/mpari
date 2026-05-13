package com.nic.mparivahan.Account.Model;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\t\u0010(\u001a\u00020\fHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u000fHÆ\u0003J{\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010,\u001a\u00020\n2\b\u0010-\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010.\u001a\u00020\u000fHÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013¨\u00060"}, d2 = {"Lcom/nic/mparivahan/Account/Model/MparCitizenUser;", "Ljava/io/Serializable;", "ctzCreatedAt", "", "ctzDispName", "ctzEmail", "ctzImage", "", "ctzMobile", "ctzMpinStatus", "", "ctzRecordId", "", "ctzStateCd", "ctzStatus", "", "ctzUpdatedAt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZJLjava/lang/String;ILjava/lang/String;)V", "getCtzCreatedAt", "()Ljava/lang/String;", "getCtzDispName", "getCtzEmail", "getCtzImage", "()Ljava/lang/Object;", "getCtzMobile", "getCtzMpinStatus", "()Z", "getCtzRecordId", "()J", "getCtzStateCd", "getCtzStatus", "()I", "getCtzUpdatedAt", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class MparCitizenUser implements Serializable {
    private final String ctzCreatedAt;
    private final String ctzDispName;
    private final String ctzEmail;
    private final Object ctzImage;
    private final String ctzMobile;
    private final boolean ctzMpinStatus;
    private final long ctzRecordId;
    private final String ctzStateCd;
    private final int ctzStatus;
    private final String ctzUpdatedAt;

    public MparCitizenUser(String str, String str2, String str3, Object obj, String str4, boolean z, long j, String str5, int i, String str6) {
        this.ctzCreatedAt = str;
        this.ctzDispName = str2;
        this.ctzEmail = str3;
        this.ctzImage = obj;
        this.ctzMobile = str4;
        this.ctzMpinStatus = z;
        this.ctzRecordId = j;
        this.ctzStateCd = str5;
        this.ctzStatus = i;
        this.ctzUpdatedAt = str6;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCtzCreatedAt() {
        return this.ctzCreatedAt;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
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
    public final Object getCtzImage() {
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

    public final MparCitizenUser copy(String ctzCreatedAt, String ctzDispName, String ctzEmail, Object ctzImage, String ctzMobile, boolean ctzMpinStatus, long ctzRecordId, String ctzStateCd, int ctzStatus, String ctzUpdatedAt) {
        return new MparCitizenUser(ctzCreatedAt, ctzDispName, ctzEmail, ctzImage, ctzMobile, ctzMpinStatus, ctzRecordId, ctzStateCd, ctzStatus, ctzUpdatedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MparCitizenUser)) {
            return false;
        }
        MparCitizenUser mparCitizenUser = (MparCitizenUser) other;
        return Intrinsics.areEqual(this.ctzCreatedAt, mparCitizenUser.ctzCreatedAt) && Intrinsics.areEqual(this.ctzDispName, mparCitizenUser.ctzDispName) && Intrinsics.areEqual(this.ctzEmail, mparCitizenUser.ctzEmail) && Intrinsics.areEqual(this.ctzImage, mparCitizenUser.ctzImage) && Intrinsics.areEqual(this.ctzMobile, mparCitizenUser.ctzMobile) && this.ctzMpinStatus == mparCitizenUser.ctzMpinStatus && this.ctzRecordId == mparCitizenUser.ctzRecordId && Intrinsics.areEqual(this.ctzStateCd, mparCitizenUser.ctzStateCd) && this.ctzStatus == mparCitizenUser.ctzStatus && Intrinsics.areEqual(this.ctzUpdatedAt, mparCitizenUser.ctzUpdatedAt);
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

    public final Object getCtzImage() {
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

    public final String getCtzUpdatedAt() {
        return this.ctzUpdatedAt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13, types: [int] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v28 */
    public int hashCode() {
        String str = this.ctzCreatedAt;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.ctzDispName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ctzEmail;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Object obj = this.ctzImage;
        int iHashCode4 = (iHashCode3 + (obj == null ? 0 : obj.hashCode())) * 31;
        String str4 = this.ctzMobile;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        boolean z = this.ctzMpinStatus;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int iHashCode6 = (((iHashCode5 + r2) * 31) + Long.hashCode(this.ctzRecordId)) * 31;
        String str5 = this.ctzStateCd;
        int iHashCode7 = (((iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31) + Integer.hashCode(this.ctzStatus)) * 31;
        String str6 = this.ctzUpdatedAt;
        return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "MparCitizenUser(ctzCreatedAt=" + this.ctzCreatedAt + ", ctzDispName=" + this.ctzDispName + ", ctzEmail=" + this.ctzEmail + ", ctzImage=" + this.ctzImage + ", ctzMobile=" + this.ctzMobile + ", ctzMpinStatus=" + this.ctzMpinStatus + ", ctzRecordId=" + this.ctzRecordId + ", ctzStateCd=" + this.ctzStateCd + ", ctzStatus=" + this.ctzStatus + ", ctzUpdatedAt=" + this.ctzUpdatedAt + ')';
    }
}
