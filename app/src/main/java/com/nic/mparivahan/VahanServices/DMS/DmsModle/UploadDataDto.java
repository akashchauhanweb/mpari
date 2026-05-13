package com.nic.mparivahan.VahanServices.DMS.DmsModle;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\bR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\bR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\bR\"\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\r\"\u0004\b \u0010\u000f¨\u0006!"}, d2 = {"Lcom/nic/mparivahan/VahanServices/DMS/DmsModle/UploadDataDto;", "", "()V", "applno", "", "getApplno", "()Ljava/lang/String;", "setApplno", "(Ljava/lang/String;)V", "mandatoryList", "", "Lcom/nic/mparivahan/VahanServices/DMS/DmsModle/Mandatory;", "getMandatoryList", "()Ljava/util/List;", "setMandatoryList", "(Ljava/util/List;)V", "nonUploadedList", "Lcom/nic/mparivahan/VahanServices/DMS/DmsModle/NonUploaded;", "getNonUploadedList", "setNonUploadedList", "purposeCode", "getPurposeCode", "setPurposeCode", "purposeName", "getPurposeName", "setPurposeName", "state", "getState", "setState", "uploadedList", "Lcom/nic/mparivahan/VahanServices/DMS/DmsModle/Uploaded;", "getUploadedList", "setUploadedList", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class UploadDataDto {
    private String applno;
    private List<Mandatory> mandatoryList;
    private List<NonUploaded> nonUploadedList;
    private String purposeCode;
    private String purposeName;
    private String state;
    private List<Uploaded> uploadedList;

    public final String getApplno() {
        return this.applno;
    }

    public final List<Mandatory> getMandatoryList() {
        return this.mandatoryList;
    }

    public final List<NonUploaded> getNonUploadedList() {
        return this.nonUploadedList;
    }

    public final String getPurposeCode() {
        return this.purposeCode;
    }

    public final String getPurposeName() {
        return this.purposeName;
    }

    public final String getState() {
        return this.state;
    }

    public final List<Uploaded> getUploadedList() {
        return this.uploadedList;
    }

    public final void setApplno(String str) {
        this.applno = str;
    }

    public final void setMandatoryList(List<Mandatory> list) {
        this.mandatoryList = list;
    }

    public final void setNonUploadedList(List<NonUploaded> list) {
        this.nonUploadedList = list;
    }

    public final void setPurposeCode(String str) {
        this.purposeCode = str;
    }

    public final void setPurposeName(String str) {
        this.purposeName = str;
    }

    public final void setState(String str) {
        this.state = str;
    }

    public final void setUploadedList(List<Uploaded> list) {
        this.uploadedList = list;
    }
}
