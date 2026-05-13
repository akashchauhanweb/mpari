package com.nic.mparivahan.dlservices.ui.newlearner.DataClass;

import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/newlearner/DataClass/QualificationMasterDataModal;", "", "qualificationName", "", "qualificationCode", "(Ljava/lang/String;Ljava/lang/String;)V", "getQualificationCode", "()Ljava/lang/String;", "getQualificationName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class QualificationMasterDataModal {

    @xy5("qualification_code")
    private final String qualificationCode;

    @xy5("qualification_name")
    private final String qualificationName;

    public QualificationMasterDataModal() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ QualificationMasterDataModal copy$default(QualificationMasterDataModal qualificationMasterDataModal, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = qualificationMasterDataModal.qualificationName;
        }
        if ((i & 2) != 0) {
            str2 = qualificationMasterDataModal.qualificationCode;
        }
        return qualificationMasterDataModal.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getQualificationName() {
        return this.qualificationName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getQualificationCode() {
        return this.qualificationCode;
    }

    public final QualificationMasterDataModal copy(String qualificationName, String qualificationCode) {
        Intrinsics.checkNotNullParameter(qualificationName, "qualificationName");
        Intrinsics.checkNotNullParameter(qualificationCode, "qualificationCode");
        return new QualificationMasterDataModal(qualificationName, qualificationCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QualificationMasterDataModal)) {
            return false;
        }
        QualificationMasterDataModal qualificationMasterDataModal = (QualificationMasterDataModal) other;
        return Intrinsics.areEqual(this.qualificationName, qualificationMasterDataModal.qualificationName) && Intrinsics.areEqual(this.qualificationCode, qualificationMasterDataModal.qualificationCode);
    }

    public final String getQualificationCode() {
        return this.qualificationCode;
    }

    public final String getQualificationName() {
        return this.qualificationName;
    }

    public int hashCode() {
        return (this.qualificationName.hashCode() * 31) + this.qualificationCode.hashCode();
    }

    public String toString() {
        return "QualificationMasterDataModal(qualificationName=" + this.qualificationName + ", qualificationCode=" + this.qualificationCode + ')';
    }

    public QualificationMasterDataModal(String qualificationName, String qualificationCode) {
        Intrinsics.checkNotNullParameter(qualificationName, "qualificationName");
        Intrinsics.checkNotNullParameter(qualificationCode, "qualificationCode");
        this.qualificationName = qualificationName;
        this.qualificationCode = qualificationCode;
    }

    public /* synthetic */ QualificationMasterDataModal(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
