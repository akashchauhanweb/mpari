package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0003¢\u0006\u0002\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u000fHÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0006HÆ\u0003J\t\u00100\u001a\u00020\u0006HÆ\u0003J\t\u00101\u001a\u00020\u0006HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0006HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\u009b\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u0003HÆ\u0001J\u0013\u00107\u001a\u00020\u00062\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020:HÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0013\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0017¨\u0006<"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/Uploaded;", "", "catId", "", "catName", "docApproved", "", "docRecieved", "docUploaded", "docUploadedDate", "docUrl", "docVerified", "mandatory", "objectId", "subcategoryMasterData", "Lcom/nic/mparivahan/VahanServices/VahanModel/SubcategoryMasterDataXX;", "subcategoryMasterDataList", "", "Lcom/nic/mparivahan/VahanServices/VahanModel/SubcategoryMasterDataXXX;", "tempDocApproved", "uniqueRefNo", "(Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/VahanModel/SubcategoryMasterDataXX;Ljava/util/List;ZLjava/lang/String;)V", "getCatId", "()Ljava/lang/String;", "getCatName", "getDocApproved", "()Z", "getDocRecieved", "getDocUploaded", "getDocUploadedDate", "getDocUrl", "getDocVerified", "getMandatory", "getObjectId", "getSubcategoryMasterData", "()Lcom/nic/mparivahan/VahanServices/VahanModel/SubcategoryMasterDataXX;", "getSubcategoryMasterDataList", "()Ljava/util/List;", "getTempDocApproved", "getUniqueRefNo", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Uploaded {
    private final String catId;
    private final String catName;
    private final boolean docApproved;
    private final boolean docRecieved;
    private final boolean docUploaded;
    private final String docUploadedDate;
    private final String docUrl;
    private final boolean docVerified;
    private final String mandatory;
    private final String objectId;
    private final SubcategoryMasterDataXX subcategoryMasterData;
    private final List<SubcategoryMasterDataXXX> subcategoryMasterDataList;
    private final boolean tempDocApproved;
    private final String uniqueRefNo;

    public Uploaded(String catId, String catName, boolean z, boolean z2, boolean z3, String docUploadedDate, String docUrl, boolean z4, String mandatory, String objectId, SubcategoryMasterDataXX subcategoryMasterData, List<SubcategoryMasterDataXXX> subcategoryMasterDataList, boolean z5, String uniqueRefNo) {
        Intrinsics.checkNotNullParameter(catId, "catId");
        Intrinsics.checkNotNullParameter(catName, "catName");
        Intrinsics.checkNotNullParameter(docUploadedDate, "docUploadedDate");
        Intrinsics.checkNotNullParameter(docUrl, "docUrl");
        Intrinsics.checkNotNullParameter(mandatory, "mandatory");
        Intrinsics.checkNotNullParameter(objectId, "objectId");
        Intrinsics.checkNotNullParameter(subcategoryMasterData, "subcategoryMasterData");
        Intrinsics.checkNotNullParameter(subcategoryMasterDataList, "subcategoryMasterDataList");
        Intrinsics.checkNotNullParameter(uniqueRefNo, "uniqueRefNo");
        this.catId = catId;
        this.catName = catName;
        this.docApproved = z;
        this.docRecieved = z2;
        this.docUploaded = z3;
        this.docUploadedDate = docUploadedDate;
        this.docUrl = docUrl;
        this.docVerified = z4;
        this.mandatory = mandatory;
        this.objectId = objectId;
        this.subcategoryMasterData = subcategoryMasterData;
        this.subcategoryMasterDataList = subcategoryMasterDataList;
        this.tempDocApproved = z5;
        this.uniqueRefNo = uniqueRefNo;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCatId() {
        return this.catId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getObjectId() {
        return this.objectId;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final SubcategoryMasterDataXX getSubcategoryMasterData() {
        return this.subcategoryMasterData;
    }

    public final List<SubcategoryMasterDataXXX> component12() {
        return this.subcategoryMasterDataList;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getTempDocApproved() {
        return this.tempDocApproved;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getUniqueRefNo() {
        return this.uniqueRefNo;
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
    public final String getDocUploadedDate() {
        return this.docUploadedDate;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDocUrl() {
        return this.docUrl;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getDocVerified() {
        return this.docVerified;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getMandatory() {
        return this.mandatory;
    }

    public final Uploaded copy(String catId, String catName, boolean docApproved, boolean docRecieved, boolean docUploaded, String docUploadedDate, String docUrl, boolean docVerified, String mandatory, String objectId, SubcategoryMasterDataXX subcategoryMasterData, List<SubcategoryMasterDataXXX> subcategoryMasterDataList, boolean tempDocApproved, String uniqueRefNo) {
        Intrinsics.checkNotNullParameter(catId, "catId");
        Intrinsics.checkNotNullParameter(catName, "catName");
        Intrinsics.checkNotNullParameter(docUploadedDate, "docUploadedDate");
        Intrinsics.checkNotNullParameter(docUrl, "docUrl");
        Intrinsics.checkNotNullParameter(mandatory, "mandatory");
        Intrinsics.checkNotNullParameter(objectId, "objectId");
        Intrinsics.checkNotNullParameter(subcategoryMasterData, "subcategoryMasterData");
        Intrinsics.checkNotNullParameter(subcategoryMasterDataList, "subcategoryMasterDataList");
        Intrinsics.checkNotNullParameter(uniqueRefNo, "uniqueRefNo");
        return new Uploaded(catId, catName, docApproved, docRecieved, docUploaded, docUploadedDate, docUrl, docVerified, mandatory, objectId, subcategoryMasterData, subcategoryMasterDataList, tempDocApproved, uniqueRefNo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Uploaded)) {
            return false;
        }
        Uploaded uploaded = (Uploaded) other;
        return Intrinsics.areEqual(this.catId, uploaded.catId) && Intrinsics.areEqual(this.catName, uploaded.catName) && this.docApproved == uploaded.docApproved && this.docRecieved == uploaded.docRecieved && this.docUploaded == uploaded.docUploaded && Intrinsics.areEqual(this.docUploadedDate, uploaded.docUploadedDate) && Intrinsics.areEqual(this.docUrl, uploaded.docUrl) && this.docVerified == uploaded.docVerified && Intrinsics.areEqual(this.mandatory, uploaded.mandatory) && Intrinsics.areEqual(this.objectId, uploaded.objectId) && Intrinsics.areEqual(this.subcategoryMasterData, uploaded.subcategoryMasterData) && Intrinsics.areEqual(this.subcategoryMasterDataList, uploaded.subcategoryMasterDataList) && this.tempDocApproved == uploaded.tempDocApproved && Intrinsics.areEqual(this.uniqueRefNo, uploaded.uniqueRefNo);
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

    public final String getDocUploadedDate() {
        return this.docUploadedDate;
    }

    public final String getDocUrl() {
        return this.docUrl;
    }

    public final boolean getDocVerified() {
        return this.docVerified;
    }

    public final String getMandatory() {
        return this.mandatory;
    }

    public final String getObjectId() {
        return this.objectId;
    }

    public final SubcategoryMasterDataXX getSubcategoryMasterData() {
        return this.subcategoryMasterData;
    }

    public final List<SubcategoryMasterDataXXX> getSubcategoryMasterDataList() {
        return this.subcategoryMasterDataList;
    }

    public final boolean getTempDocApproved() {
        return this.tempDocApproved;
    }

    public final String getUniqueRefNo() {
        return this.uniqueRefNo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
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
        int iHashCode2 = (((((i2 + r13) * 31) + this.docUploadedDate.hashCode()) * 31) + this.docUrl.hashCode()) * 31;
        boolean z4 = this.docVerified;
        ?? r14 = z4;
        if (z4) {
            r14 = 1;
        }
        int iHashCode3 = (((((((((iHashCode2 + r14) * 31) + this.mandatory.hashCode()) * 31) + this.objectId.hashCode()) * 31) + this.subcategoryMasterData.hashCode()) * 31) + this.subcategoryMasterDataList.hashCode()) * 31;
        boolean z5 = this.tempDocApproved;
        return ((iHashCode3 + (z5 ? 1 : z5)) * 31) + this.uniqueRefNo.hashCode();
    }

    public String toString() {
        return "Uploaded(catId=" + this.catId + ", catName=" + this.catName + ", docApproved=" + this.docApproved + ", docRecieved=" + this.docRecieved + ", docUploaded=" + this.docUploaded + ", docUploadedDate=" + this.docUploadedDate + ", docUrl=" + this.docUrl + ", docVerified=" + this.docVerified + ", mandatory=" + this.mandatory + ", objectId=" + this.objectId + ", subcategoryMasterData=" + this.subcategoryMasterData + ", subcategoryMasterDataList=" + this.subcategoryMasterDataList + ", tempDocApproved=" + this.tempDocApproved + ", uniqueRefNo=" + this.uniqueRefNo + ')';
    }
}
