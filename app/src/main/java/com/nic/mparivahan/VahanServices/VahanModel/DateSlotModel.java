package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\"\u0010\u001a\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u001b\u0010\u0013\"\u0004\b\u001c\u0010\u0015R \u0010\u001d\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010\u000fR\"\u0010 \u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010\bR \u0010#\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\r\"\u0004\b%\u0010\u000f¨\u0006&"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/DateSlotModel;", "", "()V", "availabelSeet", "", "getAvailabelSeet", "()Ljava/lang/Integer;", "setAvailabelSeet", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "date", "", "getDate", "()Ljava/lang/String;", "setDate", "(Ljava/lang/String;)V", "holidayFlag", "", "getHolidayFlag", "()Ljava/lang/Boolean;", "setHolidayFlag", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "quotaAvailableFlag", "getQuotaAvailableFlag", "setQuotaAvailableFlag", "quotaCompleteFlag", "getQuotaCompleteFlag", "setQuotaCompleteFlag", "rtoCode", "getRtoCode", "setRtoCode", "slotNo", "getSlotNo", "setSlotNo", "time", "getTime", "setTime", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DateSlotModel {

    @xy5("avalableSeats")
    private Integer availabelSeet;

    @xy5("quotadt")
    private String date;

    @xy5("hflag")
    private Boolean holidayFlag;

    @xy5("qaflag")
    private Boolean quotaAvailableFlag;

    @xy5("qcflag")
    private Boolean quotaCompleteFlag;

    @xy5("rtoCode")
    private String rtoCode;

    @xy5("slotNo")
    private Integer slotNo;

    @xy5("timeForDisp")
    private String time;

    public final Integer getAvailabelSeet() {
        return this.availabelSeet;
    }

    public final String getDate() {
        return this.date;
    }

    public final Boolean getHolidayFlag() {
        return this.holidayFlag;
    }

    public final Boolean getQuotaAvailableFlag() {
        return this.quotaAvailableFlag;
    }

    public final Boolean getQuotaCompleteFlag() {
        return this.quotaCompleteFlag;
    }

    public final String getRtoCode() {
        return this.rtoCode;
    }

    public final Integer getSlotNo() {
        return this.slotNo;
    }

    public final String getTime() {
        return this.time;
    }

    public final void setAvailabelSeet(Integer num) {
        this.availabelSeet = num;
    }

    public final void setDate(String str) {
        this.date = str;
    }

    public final void setHolidayFlag(Boolean bool) {
        this.holidayFlag = bool;
    }

    public final void setQuotaAvailableFlag(Boolean bool) {
        this.quotaAvailableFlag = bool;
    }

    public final void setQuotaCompleteFlag(Boolean bool) {
        this.quotaCompleteFlag = bool;
    }

    public final void setRtoCode(String str) {
        this.rtoCode = str;
    }

    public final void setSlotNo(Integer num) {
        this.slotNo = num;
    }

    public final void setTime(String str) {
        this.time = str;
    }
}
