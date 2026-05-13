package com.nic.mparivahan.ClServices.Pojo;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/nic/mparivahan/ClServices/Pojo/ClApplFlowStatus;", "", "()V", "acCd", "", "getAcCd", "()I", "setAcCd", "(I)V", "acDesc", "", "getAcDesc", "()Ljava/lang/String;", "setAcDesc", "(Ljava/lang/String;)V", "flowSlno", "getFlowSlno", "setFlowSlno", "status", "getStatus", "setStatus", "trCd", "getTrCd", "setTrCd", "trName", "getTrName", "setTrName", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ClApplFlowStatus {
    private int acCd;
    private int flowSlno;
    private int trCd;
    private String acDesc = "";
    private String status = "";
    private String trName = "";

    public final int getAcCd() {
        return this.acCd;
    }

    public final String getAcDesc() {
        return this.acDesc;
    }

    public final int getFlowSlno() {
        return this.flowSlno;
    }

    public final String getStatus() {
        return this.status;
    }

    public final int getTrCd() {
        return this.trCd;
    }

    public final String getTrName() {
        return this.trName;
    }

    public final void setAcCd(int i) {
        this.acCd = i;
    }

    public final void setAcDesc(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.acDesc = str;
    }

    public final void setFlowSlno(int i) {
        this.flowSlno = i;
    }

    public final void setStatus(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.status = str;
    }

    public final void setTrCd(int i) {
        this.trCd = i;
    }

    public final void setTrName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.trName = str;
    }
}
