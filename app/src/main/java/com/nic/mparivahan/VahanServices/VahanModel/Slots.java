package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000bJ\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012JV\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020\u00072\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0005HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\u0014R\"\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006,"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/Slots;", "", "timeForDisp", "", "avalableSeats", "", "qaflag", "", "qcflag", "slotNo", "hflag", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getAvalableSeats", "()Ljava/lang/Integer;", "setAvalableSeats", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getHflag", "()Ljava/lang/Boolean;", "setHflag", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getQaflag", "setQaflag", "getQcflag", "setQcflag", "getSlotNo", "setSlotNo", "getTimeForDisp", "()Ljava/lang/String;", "setTimeForDisp", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/nic/mparivahan/VahanServices/VahanModel/Slots;", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Slots {

    @xy5("avalableSeats")
    private Integer avalableSeats;

    @xy5("hflag")
    private Boolean hflag;

    @xy5("qaflag")
    private Boolean qaflag;

    @xy5("qcflag")
    private Boolean qcflag;

    @xy5("slotNo")
    private Integer slotNo;

    @xy5("timeForDisp")
    private String timeForDisp;

    public Slots() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ Slots copy$default(Slots slots, String str, Integer num, Boolean bool, Boolean bool2, Integer num2, Boolean bool3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = slots.timeForDisp;
        }
        if ((i & 2) != 0) {
            num = slots.avalableSeats;
        }
        Integer num3 = num;
        if ((i & 4) != 0) {
            bool = slots.qaflag;
        }
        Boolean bool4 = bool;
        if ((i & 8) != 0) {
            bool2 = slots.qcflag;
        }
        Boolean bool5 = bool2;
        if ((i & 16) != 0) {
            num2 = slots.slotNo;
        }
        Integer num4 = num2;
        if ((i & 32) != 0) {
            bool3 = slots.hflag;
        }
        return slots.copy(str, num3, bool4, bool5, num4, bool3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTimeForDisp() {
        return this.timeForDisp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getAvalableSeats() {
        return this.avalableSeats;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getQaflag() {
        return this.qaflag;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getQcflag() {
        return this.qcflag;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getSlotNo() {
        return this.slotNo;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getHflag() {
        return this.hflag;
    }

    public final Slots copy(String timeForDisp, Integer avalableSeats, Boolean qaflag, Boolean qcflag, Integer slotNo, Boolean hflag) {
        return new Slots(timeForDisp, avalableSeats, qaflag, qcflag, slotNo, hflag);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Slots)) {
            return false;
        }
        Slots slots = (Slots) other;
        return Intrinsics.areEqual(this.timeForDisp, slots.timeForDisp) && Intrinsics.areEqual(this.avalableSeats, slots.avalableSeats) && Intrinsics.areEqual(this.qaflag, slots.qaflag) && Intrinsics.areEqual(this.qcflag, slots.qcflag) && Intrinsics.areEqual(this.slotNo, slots.slotNo) && Intrinsics.areEqual(this.hflag, slots.hflag);
    }

    public final Integer getAvalableSeats() {
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

    public final Integer getSlotNo() {
        return this.slotNo;
    }

    public final String getTimeForDisp() {
        return this.timeForDisp;
    }

    public int hashCode() {
        String str = this.timeForDisp;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.avalableSeats;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.qaflag;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.qcflag;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num2 = this.slotNo;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool3 = this.hflag;
        return iHashCode5 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final void setAvalableSeats(Integer num) {
        this.avalableSeats = num;
    }

    public final void setHflag(Boolean bool) {
        this.hflag = bool;
    }

    public final void setQaflag(Boolean bool) {
        this.qaflag = bool;
    }

    public final void setQcflag(Boolean bool) {
        this.qcflag = bool;
    }

    public final void setSlotNo(Integer num) {
        this.slotNo = num;
    }

    public final void setTimeForDisp(String str) {
        this.timeForDisp = str;
    }

    public String toString() {
        return "Slots(timeForDisp=" + this.timeForDisp + ", avalableSeats=" + this.avalableSeats + ", qaflag=" + this.qaflag + ", qcflag=" + this.qcflag + ", slotNo=" + this.slotNo + ", hflag=" + this.hflag + ')';
    }

    public Slots(String str, Integer num, Boolean bool, Boolean bool2, Integer num2, Boolean bool3) {
        this.timeForDisp = str;
        this.avalableSeats = num;
        this.qaflag = bool;
        this.qcflag = bool2;
        this.slotNo = num2;
        this.hflag = bool3;
    }

    public /* synthetic */ Slots(String str, Integer num, Boolean bool, Boolean bool2, Integer num2, Boolean bool3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : bool3);
    }
}
