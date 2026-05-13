package com.nic.mparivahan.VahanServices.DMS.DmsModle;

import androidx.annotation.Keep;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/nic/mparivahan/VahanServices/DMS/DmsModle/VahanDmsModleResponse;", "", "()V", "statusCode", "", "getStatusCode", "()Ljava/lang/String;", "setStatusCode", "(Ljava/lang/String;)V", "statusDesc", "getStatusDesc", "setStatusDesc", "uploadDataDto", "Lcom/nic/mparivahan/VahanServices/DMS/DmsModle/UploadDataDto;", "getUploadDataDto", "()Lcom/nic/mparivahan/VahanServices/DMS/DmsModle/UploadDataDto;", "setUploadDataDto", "(Lcom/nic/mparivahan/VahanServices/DMS/DmsModle/UploadDataDto;)V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class VahanDmsModleResponse {
    private String statusCode;
    private String statusDesc;
    private UploadDataDto uploadDataDto;

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final UploadDataDto getUploadDataDto() {
        return this.uploadDataDto;
    }

    public final void setStatusCode(String str) {
        this.statusCode = str;
    }

    public final void setStatusDesc(String str) {
        this.statusDesc = str;
    }

    public final void setUploadDataDto(UploadDataDto uploadDataDto) {
        this.uploadDataDto = uploadDataDto;
    }
}
