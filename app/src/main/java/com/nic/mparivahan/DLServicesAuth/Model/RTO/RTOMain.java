package com.nic.mparivahan.DLServicesAuth.Model.RTO;

import androidx.annotation.Keep;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/nic/mparivahan/DLServicesAuth/Model/RTO/RTOMain;", "", "()V", "dlLastRtoDetailsDto", "Lcom/nic/mparivahan/DLServicesAuth/Model/RTO/DlLastRtoDetailsDto;", "getDlLastRtoDetailsDto", "()Lcom/nic/mparivahan/DLServicesAuth/Model/RTO/DlLastRtoDetailsDto;", "setDlLastRtoDetailsDto", "(Lcom/nic/mparivahan/DLServicesAuth/Model/RTO/DlLastRtoDetailsDto;)V", "param", "", "getParam", "()Ljava/lang/String;", "setParam", "(Ljava/lang/String;)V", "responseBody", "getResponseBody", "setResponseBody", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RTOMain {
    private DlLastRtoDetailsDto dlLastRtoDetailsDto;
    private String param;
    private String responseBody;

    public final DlLastRtoDetailsDto getDlLastRtoDetailsDto() {
        return this.dlLastRtoDetailsDto;
    }

    public final String getParam() {
        return this.param;
    }

    public final String getResponseBody() {
        return this.responseBody;
    }

    public final void setDlLastRtoDetailsDto(DlLastRtoDetailsDto dlLastRtoDetailsDto) {
        this.dlLastRtoDetailsDto = dlLastRtoDetailsDto;
    }

    public final void setParam(String str) {
        this.param = str;
    }

    public final void setResponseBody(String str) {
        this.responseBody = str;
    }
}
