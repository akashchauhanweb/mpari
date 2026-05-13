package com.nic.mparivahan.VahanServices.DMS.DmsModle;

import androidx.annotation.Keep;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0011R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\bR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u0011R\u001c\u0010\"\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\bR\u001c\u0010%\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0006\"\u0004\b'\u0010\bR\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001e\u0010.\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b/\u0010\u000f\"\u0004\b0\u0010\u0011R\u001c\u00101\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0006\"\u0004\b3\u0010\b¨\u00064"}, d2 = {"Lcom/nic/mparivahan/VahanServices/DMS/DmsModle/Uploaded;", "", "()V", "catId", "", "getCatId", "()Ljava/lang/String;", "setCatId", "(Ljava/lang/String;)V", "catName", "getCatName", "setCatName", "docApproved", "", "getDocApproved", "()Ljava/lang/Boolean;", "setDocApproved", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "docRecieved", "getDocRecieved", "setDocRecieved", "docUploaded", "getDocUploaded", "setDocUploaded", "docUploadedDate", "getDocUploadedDate", "setDocUploadedDate", "docUrl", "getDocUrl", "setDocUrl", "docVerified", "getDocVerified", "setDocVerified", "mandatory", "getMandatory", "setMandatory", "objectId", "getObjectId", "setObjectId", "subcategoryMasterData", "Lcom/nic/mparivahan/VahanServices/DMS/DmsModle/SubcategoryMasterDataXX;", "getSubcategoryMasterData", "()Lcom/nic/mparivahan/VahanServices/DMS/DmsModle/SubcategoryMasterDataXX;", "setSubcategoryMasterData", "(Lcom/nic/mparivahan/VahanServices/DMS/DmsModle/SubcategoryMasterDataXX;)V", "tempDocApproved", "getTempDocApproved", "setTempDocApproved", "uniqueRefNo", "getUniqueRefNo", "setUniqueRefNo", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Uploaded {
    private String catId;
    private String catName;
    private Boolean docApproved;
    private Boolean docRecieved;
    private Boolean docUploaded;
    private String docUploadedDate;
    private String docUrl;
    private Boolean docVerified;
    private String mandatory;
    private String objectId;
    private SubcategoryMasterDataXX subcategoryMasterData;
    private Boolean tempDocApproved;
    private String uniqueRefNo;

    public Uploaded() {
        Boolean bool = Boolean.FALSE;
        this.docApproved = bool;
        this.docRecieved = bool;
        this.docUploaded = bool;
        this.tempDocApproved = bool;
    }

    public final String getCatId() {
        return this.catId;
    }

    public final String getCatName() {
        return this.catName;
    }

    public final Boolean getDocApproved() {
        return this.docApproved;
    }

    public final Boolean getDocRecieved() {
        return this.docRecieved;
    }

    public final Boolean getDocUploaded() {
        return this.docUploaded;
    }

    public final String getDocUploadedDate() {
        return this.docUploadedDate;
    }

    public final String getDocUrl() {
        return this.docUrl;
    }

    public final Boolean getDocVerified() {
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

    public final Boolean getTempDocApproved() {
        return this.tempDocApproved;
    }

    public final String getUniqueRefNo() {
        return this.uniqueRefNo;
    }

    public final void setCatId(String str) {
        this.catId = str;
    }

    public final void setCatName(String str) {
        this.catName = str;
    }

    public final void setDocApproved(Boolean bool) {
        this.docApproved = bool;
    }

    public final void setDocRecieved(Boolean bool) {
        this.docRecieved = bool;
    }

    public final void setDocUploaded(Boolean bool) {
        this.docUploaded = bool;
    }

    public final void setDocUploadedDate(String str) {
        this.docUploadedDate = str;
    }

    public final void setDocUrl(String str) {
        this.docUrl = str;
    }

    public final void setDocVerified(Boolean bool) {
        this.docVerified = bool;
    }

    public final void setMandatory(String str) {
        this.mandatory = str;
    }

    public final void setObjectId(String str) {
        this.objectId = str;
    }

    public final void setSubcategoryMasterData(SubcategoryMasterDataXX subcategoryMasterDataXX) {
        this.subcategoryMasterData = subcategoryMasterDataXX;
    }

    public final void setTempDocApproved(Boolean bool) {
        this.tempDocApproved = bool;
    }

    public final void setUniqueRefNo(String str) {
        this.uniqueRefNo = str;
    }
}
