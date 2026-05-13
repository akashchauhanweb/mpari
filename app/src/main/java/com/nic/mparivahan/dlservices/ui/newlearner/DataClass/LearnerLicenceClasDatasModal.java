package com.nic.mparivahan.dlservices.ui.newlearner.DataClass;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/newlearner/DataClass/LearnerLicenceClasDatasModal;", "Landroid/os/Parcelable;", "covName", "", "covCode", "(Ljava/lang/String;Ljava/lang/String;)V", "getCovCode", "()Ljava/lang/String;", "getCovName", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class LearnerLicenceClasDatasModal implements Parcelable {
    public static final Parcelable.Creator<LearnerLicenceClasDatasModal> CREATOR = new a();

    @xy5("cov_code")
    private final String covCode;

    @xy5("cov_name")
    private final String covName;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LearnerLicenceClasDatasModal createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LearnerLicenceClasDatasModal(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LearnerLicenceClasDatasModal[] newArray(int i) {
            return new LearnerLicenceClasDatasModal[i];
        }
    }

    public LearnerLicenceClasDatasModal() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ LearnerLicenceClasDatasModal copy$default(LearnerLicenceClasDatasModal learnerLicenceClasDatasModal, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = learnerLicenceClasDatasModal.covName;
        }
        if ((i & 2) != 0) {
            str2 = learnerLicenceClasDatasModal.covCode;
        }
        return learnerLicenceClasDatasModal.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCovName() {
        return this.covName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCovCode() {
        return this.covCode;
    }

    public final LearnerLicenceClasDatasModal copy(String covName, String covCode) {
        Intrinsics.checkNotNullParameter(covName, "covName");
        Intrinsics.checkNotNullParameter(covCode, "covCode");
        return new LearnerLicenceClasDatasModal(covName, covCode);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LearnerLicenceClasDatasModal)) {
            return false;
        }
        LearnerLicenceClasDatasModal learnerLicenceClasDatasModal = (LearnerLicenceClasDatasModal) other;
        return Intrinsics.areEqual(this.covName, learnerLicenceClasDatasModal.covName) && Intrinsics.areEqual(this.covCode, learnerLicenceClasDatasModal.covCode);
    }

    public final String getCovCode() {
        return this.covCode;
    }

    public final String getCovName() {
        return this.covName;
    }

    public int hashCode() {
        return (this.covName.hashCode() * 31) + this.covCode.hashCode();
    }

    public String toString() {
        return "LearnerLicenceClasDatasModal(covName=" + this.covName + ", covCode=" + this.covCode + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.covName);
        parcel.writeString(this.covCode);
    }

    public LearnerLicenceClasDatasModal(String covName, String covCode) {
        Intrinsics.checkNotNullParameter(covName, "covName");
        Intrinsics.checkNotNullParameter(covCode, "covCode");
        this.covName = covName;
        this.covCode = covCode;
    }

    public /* synthetic */ LearnerLicenceClasDatasModal(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
