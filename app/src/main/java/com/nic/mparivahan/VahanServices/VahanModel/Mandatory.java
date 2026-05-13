package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0002\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003Ji\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u0006HÆ\u0001J\u0013\u0010&\u001a\u00020\u00062\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014¨\u0006+"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/Mandatory;", "", "catId", "", "catName", "docApproved", "", "docRecieved", "docUploaded", "docVerified", "mandatory", "subcategoryMasterDataList", "", "Lcom/nic/mparivahan/VahanServices/VahanModel/SubcategoryMasterData;", "tempDocApproved", "(Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;Ljava/util/List;Z)V", "getCatId", "()Ljava/lang/String;", "getCatName", "getDocApproved", "()Z", "getDocRecieved", "getDocUploaded", "getDocVerified", "getMandatory", "getSubcategoryMasterDataList", "()Ljava/util/List;", "getTempDocApproved", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Mandatory {
    private final String catId;
    private final String catName;
    private final boolean docApproved;
    private final boolean docRecieved;
    private final boolean docUploaded;
    private final boolean docVerified;
    private final String mandatory;
    private final List<SubcategoryMasterData> subcategoryMasterDataList;
    private final boolean tempDocApproved;

    public Mandatory(String catId, String catName, boolean z, boolean z2, boolean z3, boolean z4, String mandatory, List<SubcategoryMasterData> subcategoryMasterDataList, boolean z5) {
        Intrinsics.checkNotNullParameter(catId, "catId");
        Intrinsics.checkNotNullParameter(catName, "catName");
        Intrinsics.checkNotNullParameter(mandatory, "mandatory");
        Intrinsics.checkNotNullParameter(subcategoryMasterDataList, "subcategoryMasterDataList");
        this.catId = catId;
        this.catName = catName;
        this.docApproved = z;
        this.docRecieved = z2;
        this.docUploaded = z3;
        this.docVerified = z4;
        this.mandatory = mandatory;
        this.subcategoryMasterDataList = subcategoryMasterDataList;
        this.tempDocApproved = z5;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCatId() {
        return this.catId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCatName() {
        return this.catName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getDocApproved() {
        return this.docApproved;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getDocRecieved() {
        return this.docRecieved;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getDocUploaded() {
        return this.docUploaded;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getDocVerified() {
        return this.docVerified;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMandatory() {
        return this.mandatory;
    }

    public final List<SubcategoryMasterData> component8() {
        return this.subcategoryMasterDataList;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getTempDocApproved() {
        return this.tempDocApproved;
    }

    public final Mandatory copy(String catId, String catName, boolean docApproved, boolean docRecieved, boolean docUploaded, boolean docVerified, String mandatory, List<SubcategoryMasterData> subcategoryMasterDataList, boolean tempDocApproved) {
        Intrinsics.checkNotNullParameter(catId, "catId");
        Intrinsics.checkNotNullParameter(catName, "catName");
        Intrinsics.checkNotNullParameter(mandatory, "mandatory");
        Intrinsics.checkNotNullParameter(subcategoryMasterDataList, "subcategoryMasterDataList");
        return new Mandatory(catId, catName, docApproved, docRecieved, docUploaded, docVerified, mandatory, subcategoryMasterDataList, tempDocApproved);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Mandatory)) {
            return false;
        }
        Mandatory mandatory = (Mandatory) other;
        return Intrinsics.areEqual(this.catId, mandatory.catId) && Intrinsics.areEqual(this.catName, mandatory.catName) && this.docApproved == mandatory.docApproved && this.docRecieved == mandatory.docRecieved && this.docUploaded == mandatory.docUploaded && this.docVerified == mandatory.docVerified && Intrinsics.areEqual(this.mandatory, mandatory.mandatory) && Intrinsics.areEqual(this.subcategoryMasterDataList, mandatory.subcategoryMasterDataList) && this.tempDocApproved == mandatory.tempDocApproved;
    }

    public final String getCatId() {
        return this.catId;
    }

    public final String getCatName() {
        return this.catName;
    }

    public final boolean getDocApproved() {
        return this.docApproved;
    }

    public final boolean getDocRecieved() {
        return this.docRecieved;
    }

    public final boolean getDocUploaded() {
        return this.docUploaded;
    }

    public final boolean getDocVerified() {
        return this.docVerified;
    }

    public final String getMandatory() {
        return this.mandatory;
    }

    public final List<SubcategoryMasterData> getSubcategoryMasterDataList() {
        return this.subcategoryMasterDataList;
    }

    public final boolean getTempDocApproved() {
        return this.tempDocApproved;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((this.catId.hashCode() * 31) + this.catName.hashCode()) * 31;
        boolean z = this.docApproved;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.docRecieved;
        ?? r12 = z2;
        if (z2) {
            r12 = 1;
        }
        int i2 = (i + r12) * 31;
        boolean z3 = this.docUploaded;
        ?? r13 = z3;
        if (z3) {
            r13 = 1;
        }
        int i3 = (i2 + r13) * 31;
        boolean z4 = this.docVerified;
        ?? r14 = z4;
        if (z4) {
            r14 = 1;
        }
        int iHashCode2 = (((((i3 + r14) * 31) + this.mandatory.hashCode()) * 31) + this.subcategoryMasterDataList.hashCode()) * 31;
        boolean z5 = this.tempDocApproved;
        return iHashCode2 + (z5 ? 1 : z5);
    }

    public String toString() {
        return "Mandatory(catId=" + this.catId + ", catName=" + this.catName + ", docApproved=" + this.docApproved + ", docRecieved=" + this.docRecieved + ", docUploaded=" + this.docUploaded + ", docVerified=" + this.docVerified + ", mandatory=" + this.mandatory + ", subcategoryMasterDataList=" + this.subcategoryMasterDataList + ", tempDocApproved=" + this.tempDocApproved + ')';
    }
}
