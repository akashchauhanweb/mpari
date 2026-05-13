package com.nic.mparivahan.VahanServices.DMS.DmsModle;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0011R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\bR\"\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010&\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b'\u0010\u000f\"\u0004\b(\u0010\u0011¨\u0006)"}, d2 = {"Lcom/nic/mparivahan/VahanServices/DMS/DmsModle/Mandatory;", "", "()V", "catId", "", "getCatId", "()Ljava/lang/String;", "setCatId", "(Ljava/lang/String;)V", "catName", "getCatName", "setCatName", "docApproved", "", "getDocApproved", "()Ljava/lang/Boolean;", "setDocApproved", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "docRecieved", "getDocRecieved", "setDocRecieved", "docUploaded", "getDocUploaded", "setDocUploaded", "docVerified", "getDocVerified", "setDocVerified", "mandatory", "getMandatory", "setMandatory", "subcategoryMasterDataList", "", "Lcom/nic/mparivahan/VahanServices/DMS/DmsModle/SubcategoryMasterData;", "getSubcategoryMasterDataList", "()Ljava/util/List;", "setSubcategoryMasterDataList", "(Ljava/util/List;)V", "tempDocApproved", "getTempDocApproved", "setTempDocApproved", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Mandatory {
    private String catId;
    private String catName;
    private Boolean docApproved;
    private Boolean docRecieved;
    private Boolean docUploaded;
    private Boolean docVerified;
    private String mandatory;
    private List<SubcategoryMasterData> subcategoryMasterDataList;
    private Boolean tempDocApproved;

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

    public final Boolean getDocVerified() {
        return this.docVerified;
    }

    public final String getMandatory() {
        return this.mandatory;
    }

    public final List<SubcategoryMasterData> getSubcategoryMasterDataList() {
        return this.subcategoryMasterDataList;
    }

    public final Boolean getTempDocApproved() {
        return this.tempDocApproved;
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

    public final void setDocVerified(Boolean bool) {
        this.docVerified = bool;
    }

    public final void setMandatory(String str) {
        this.mandatory = str;
    }

    public final void setSubcategoryMasterDataList(List<SubcategoryMasterData> list) {
        this.subcategoryMasterDataList = list;
    }

    public final void setTempDocApproved(Boolean bool) {
        this.tempDocApproved = bool;
    }
}
