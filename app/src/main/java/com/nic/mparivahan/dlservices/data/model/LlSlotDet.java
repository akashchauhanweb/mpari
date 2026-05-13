package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/LlSlotDet;", "", "()V", "avalableSeats", "", "getAvalableSeats", "()I", "setAvalableSeats", "(I)V", "quotadt", "", "getQuotadt", "()Ljava/lang/String;", "setQuotadt", "(Ljava/lang/String;)V", "rtoCode", "getRtoCode", "setRtoCode", "slotNo", "getSlotNo", "setSlotNo", "subOffCd", "getSubOffCd", "setSubOffCd", "timeForDisp", "getTimeForDisp", "setTimeForDisp", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LlSlotDet {
    private int avalableSeats;
    private int slotNo;
    private int subOffCd;
    private String quotadt = "";
    private String timeForDisp = "";
    private String rtoCode = "";

    public final int getAvalableSeats() {
        return this.avalableSeats;
    }

    public final String getQuotadt() {
        return this.quotadt;
    }

    public final String getRtoCode() {
        return this.rtoCode;
    }

    public final int getSlotNo() {
        return this.slotNo;
    }

    public final int getSubOffCd() {
        return this.subOffCd;
    }

    public final String getTimeForDisp() {
        return this.timeForDisp;
    }

    public final void setAvalableSeats(int i) {
        this.avalableSeats = i;
    }

    public final void setQuotadt(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.quotadt = str;
    }

    public final void setRtoCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rtoCode = str;
    }

    public final void setSlotNo(int i) {
        this.slotNo = i;
    }

    public final void setSubOffCd(int i) {
        this.subOffCd = i;
    }

    public final void setTimeForDisp(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.timeForDisp = str;
    }
}
