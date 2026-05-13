package com.nic.mparivahan.VahanServices.DMS.DmsModle;

import android.graphics.Bitmap;
import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001b\u0010\u000eR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u001d\u0010\u0015\"\u0004\b\u001e\u0010\u0017R\u001e\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010&\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b'\u0010\u0015\"\u0004\b(\u0010\u0017R\u001e\u0010)\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b*\u0010\u0015\"\u0004\b+\u0010\u0017R\u001c\u0010,\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\f\"\u0004\b.\u0010\u000eR\u001e\u0010/\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b/\u0010\u0015\"\u0004\b0\u0010\u0017R\u001c\u00101\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\f\"\u0004\b3\u0010\u000eR\u001c\u00104\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\f\"\u0004\b6\u0010\u000eR\"\u00107\u001a\n\u0012\u0004\u0012\u000209\u0018\u000108X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001e\u0010>\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b?\u0010\u0015\"\u0004\b@\u0010\u0017¨\u0006A"}, d2 = {"Lcom/nic/mparivahan/VahanServices/DMS/DmsModle/NonUploaded;", "", "()V", "bitmap", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "setBitmap", "(Landroid/graphics/Bitmap;)V", "catId", "", "getCatId", "()Ljava/lang/String;", "setCatId", "(Ljava/lang/String;)V", "catName", "getCatName", "setCatName", "docApproved", "", "getDocApproved", "()Ljava/lang/Boolean;", "setDocApproved", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "docBase64", "getDocBase64", "setDocBase64", "docRecieved", "getDocRecieved", "setDocRecieved", "docType", "", "getDocType", "()Ljava/lang/Integer;", "setDocType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "docUploaded", "getDocUploaded", "setDocUploaded", "docVerified", "getDocVerified", "setDocVerified", "file_name", "getFile_name", "setFile_name", "isAttached", "setAttached", "mandatory", "getMandatory", "setMandatory", "subId", "getSubId", "setSubId", "subcategoryMasterDataList", "", "Lcom/nic/mparivahan/VahanServices/DMS/DmsModle/SubcategoryMasterDataX;", "getSubcategoryMasterDataList", "()Ljava/util/List;", "setSubcategoryMasterDataList", "(Ljava/util/List;)V", "tempDocApproved", "getTempDocApproved", "setTempDocApproved", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NonUploaded {
    private Bitmap bitmap;
    private String catId;
    private String catName;
    private Boolean docApproved;
    private String docBase64;
    private Boolean docRecieved;
    private Integer docType;
    private Boolean docUploaded;
    private Boolean docVerified;
    private String file_name;
    private Boolean isAttached;
    private String mandatory;
    private String subId;
    private List<SubcategoryMasterDataX> subcategoryMasterDataList;
    private Boolean tempDocApproved;

    public NonUploaded() {
        Boolean bool = Boolean.FALSE;
        this.docApproved = bool;
        this.docRecieved = bool;
        this.docUploaded = bool;
        this.docVerified = bool;
        this.tempDocApproved = bool;
        this.isAttached = bool;
        this.docType = 0;
    }

    public final Bitmap getBitmap() {
        return this.bitmap;
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

    public final String getDocBase64() {
        return this.docBase64;
    }

    public final Boolean getDocRecieved() {
        return this.docRecieved;
    }

    public final Integer getDocType() {
        return this.docType;
    }

    public final Boolean getDocUploaded() {
        return this.docUploaded;
    }

    public final Boolean getDocVerified() {
        return this.docVerified;
    }

    public final String getFile_name() {
        return this.file_name;
    }

    public final String getMandatory() {
        return this.mandatory;
    }

    public final String getSubId() {
        return this.subId;
    }

    public final List<SubcategoryMasterDataX> getSubcategoryMasterDataList() {
        return this.subcategoryMasterDataList;
    }

    public final Boolean getTempDocApproved() {
        return this.tempDocApproved;
    }

    /* JADX INFO: renamed from: isAttached, reason: from getter */
    public final Boolean getIsAttached() {
        return this.isAttached;
    }

    public final void setAttached(Boolean bool) {
        this.isAttached = bool;
    }

    public final void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
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

    public final void setDocBase64(String str) {
        this.docBase64 = str;
    }

    public final void setDocRecieved(Boolean bool) {
        this.docRecieved = bool;
    }

    public final void setDocType(Integer num) {
        this.docType = num;
    }

    public final void setDocUploaded(Boolean bool) {
        this.docUploaded = bool;
    }

    public final void setDocVerified(Boolean bool) {
        this.docVerified = bool;
    }

    public final void setFile_name(String str) {
        this.file_name = str;
    }

    public final void setMandatory(String str) {
        this.mandatory = str;
    }

    public final void setSubId(String str) {
        this.subId = str;
    }

    public final void setSubcategoryMasterDataList(List<SubcategoryMasterDataX> list) {
        this.subcategoryMasterDataList = list;
    }

    public final void setTempDocApproved(Boolean bool) {
        this.tempDocApproved = bool;
    }
}
