package com.nic.mparivahan.dlservices.ui.slots.calendar;

import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jl\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020\b2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0006HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u0011R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016¨\u0006*"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/slots/calendar/SlotDetailsItem;", "", "quotadt", "", "timeForDisp", "avalableSeats", "", "qaflag", "", "qcflag", "slotNo", "hflag", "rtoCode", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;)V", "getAvalableSeats", "()I", "getHflag", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getQaflag", "getQcflag", "getQuotadt", "()Ljava/lang/String;", "getRtoCode", "getSlotNo", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTimeForDisp", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/nic/mparivahan/dlservices/ui/slots/calendar/SlotDetailsItem;", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SlotDetailsItem {

    @xy5("avalableSeats")
    private final int avalableSeats;

    @xy5("hflag")
    private final Boolean hflag;

    @xy5("qaflag")
    private final Boolean qaflag;

    @xy5("qcflag")
    private final Boolean qcflag;

    @xy5("quotadt")
    private final String quotadt;

    @xy5("rtoCode")
    private final String rtoCode;

    @xy5("slotNo")
    private final Integer slotNo;

    @xy5("timeForDisp")
    private final String timeForDisp;

    public SlotDetailsItem() {
        this(null, null, 0, null, null, null, null, null, KotlinVersion.MAX_COMPONENT_VALUE, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getQuotadt() {
        return this.quotadt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTimeForDisp() {
        return this.timeForDisp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getAvalableSeats() {
        return this.avalableSeats;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getQaflag() {
        return this.qaflag;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getQcflag() {
        return this.qcflag;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getSlotNo() {
        return this.slotNo;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getHflag() {
        return this.hflag;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getRtoCode() {
        return this.rtoCode;
    }

    public final SlotDetailsItem copy(String quotadt, String timeForDisp, int avalableSeats, Boolean qaflag, Boolean qcflag, Integer slotNo, Boolean hflag, String rtoCode) {
        return new SlotDetailsItem(quotadt, timeForDisp, avalableSeats, qaflag, qcflag, slotNo, hflag, rtoCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SlotDetailsItem)) {
            return false;
        }
        SlotDetailsItem slotDetailsItem = (SlotDetailsItem) other;
        return Intrinsics.areEqual(this.quotadt, slotDetailsItem.quotadt) && Intrinsics.areEqual(this.timeForDisp, slotDetailsItem.timeForDisp) && this.avalableSeats == slotDetailsItem.avalableSeats && Intrinsics.areEqual(this.qaflag, slotDetailsItem.qaflag) && Intrinsics.areEqual(this.qcflag, slotDetailsItem.qcflag) && Intrinsics.areEqual(this.slotNo, slotDetailsItem.slotNo) && Intrinsics.areEqual(this.hflag, slotDetailsItem.hflag) && Intrinsics.areEqual(this.rtoCode, slotDetailsItem.rtoCode);
    }

    public final int getAvalableSeats() {
        return this.avalableSeats;
    }

    public final Boolean getHflag() {
        return this.hflag;
    }

    public final Boolean getQaflag() {
        return this.qaflag;
    }

    public final Boolean getQcflag() {
        return this.qcflag;
    }

    public final String getQuotadt() {
        return this.quotadt;
    }

    public final String getRtoCode() {
        return this.rtoCode;
    }

    public final Integer getSlotNo() {
        return this.slotNo;
    }

    public final String getTimeForDisp() {
        return this.timeForDisp;
    }

    public int hashCode() {
        String str = this.quotadt;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.timeForDisp;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.avalableSeats)) * 31;
        Boolean bool = this.qaflag;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.qcflag;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.slotNo;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool3 = this.hflag;
        int iHashCode6 = (iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str3 = this.rtoCode;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "SlotDetailsItem(quotadt=" + this.quotadt + ", timeForDisp=" + this.timeForDisp + ", avalableSeats=" + this.avalableSeats + ", qaflag=" + this.qaflag + ", qcflag=" + this.qcflag + ", slotNo=" + this.slotNo + ", hflag=" + this.hflag + ", rtoCode=" + this.rtoCode + ')';
    }

    public SlotDetailsItem(String str, String str2, int i, Boolean bool, Boolean bool2, Integer num, Boolean bool3, String str3) {
        this.quotadt = str;
        this.timeForDisp = str2;
        this.avalableSeats = i;
        this.qaflag = bool;
        this.qcflag = bool2;
        this.slotNo = num;
        this.hflag = bool3;
        this.rtoCode = str3;
    }

    public /* synthetic */ SlotDetailsItem(String str, String str2, int i, Boolean bool, Boolean bool2, Integer num, Boolean bool3, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : bool, (i2 & 16) != 0 ? null : bool2, (i2 & 32) != 0 ? null : num, (i2 & 64) != 0 ? null : bool3, (i2 & 128) == 0 ? str3 : null);
    }
}
