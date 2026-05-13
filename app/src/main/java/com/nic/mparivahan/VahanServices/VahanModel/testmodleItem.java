package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0002\u0010\u0010J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0001HÆ\u0003J\t\u0010#\u001a\u00020\u0001HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0001HÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\fHÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003Jw\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0001HÆ\u0001J\u0013\u0010,\u001a\u00020\b2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\fHÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012R\u0011\u0010\u000f\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014¨\u00060"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/testmodleItem;", "", "avail_seats", "", "day_ofWeek", "selectApptDate", "selectApptDateDay", "selectCase", "", "slot", "slot__service_Id", "slot_id", "", "slot_service_descr", "total_seat", "veh_class", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "getAvail_seats", "()Ljava/lang/String;", "getDay_ofWeek", "()Ljava/lang/Object;", "getSelectApptDate", "getSelectApptDateDay", "getSelectCase", "()Z", "getSlot", "getSlot__service_Id", "getSlot_id", "()I", "getSlot_service_descr", "getTotal_seat", "getVeh_class", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class testmodleItem {
    private final String avail_seats;
    private final Object day_ofWeek;
    private final String selectApptDate;
    private final Object selectApptDateDay;
    private final boolean selectCase;
    private final String slot;
    private final String slot__service_Id;
    private final int slot_id;
    private final String slot_service_descr;
    private final String total_seat;
    private final Object veh_class;

    public testmodleItem(String avail_seats, Object day_ofWeek, String selectApptDate, Object selectApptDateDay, boolean z, String slot, String slot__service_Id, int i, String slot_service_descr, String total_seat, Object veh_class) {
        Intrinsics.checkNotNullParameter(avail_seats, "avail_seats");
        Intrinsics.checkNotNullParameter(day_ofWeek, "day_ofWeek");
        Intrinsics.checkNotNullParameter(selectApptDate, "selectApptDate");
        Intrinsics.checkNotNullParameter(selectApptDateDay, "selectApptDateDay");
        Intrinsics.checkNotNullParameter(slot, "slot");
        Intrinsics.checkNotNullParameter(slot__service_Id, "slot__service_Id");
        Intrinsics.checkNotNullParameter(slot_service_descr, "slot_service_descr");
        Intrinsics.checkNotNullParameter(total_seat, "total_seat");
        Intrinsics.checkNotNullParameter(veh_class, "veh_class");
        this.avail_seats = avail_seats;
        this.day_ofWeek = day_ofWeek;
        this.selectApptDate = selectApptDate;
        this.selectApptDateDay = selectApptDateDay;
        this.selectCase = z;
        this.slot = slot;
        this.slot__service_Id = slot__service_Id;
        this.slot_id = i;
        this.slot_service_descr = slot_service_descr;
        this.total_seat = total_seat;
        this.veh_class = veh_class;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAvail_seats() {
        return this.avail_seats;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTotal_seat() {
        return this.total_seat;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Object getVeh_class() {
        return this.veh_class;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getDay_ofWeek() {
        return this.day_ofWeek;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSelectApptDate() {
        return this.selectApptDate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Object getSelectApptDateDay() {
        return this.selectApptDateDay;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getSelectCase() {
        return this.selectCase;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSlot() {
        return this.slot;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSlot__service_Id() {
        return this.slot__service_Id;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getSlot_id() {
        return this.slot_id;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSlot_service_descr() {
        return this.slot_service_descr;
    }

    public final testmodleItem copy(String avail_seats, Object day_ofWeek, String selectApptDate, Object selectApptDateDay, boolean selectCase, String slot, String slot__service_Id, int slot_id, String slot_service_descr, String total_seat, Object veh_class) {
        Intrinsics.checkNotNullParameter(avail_seats, "avail_seats");
        Intrinsics.checkNotNullParameter(day_ofWeek, "day_ofWeek");
        Intrinsics.checkNotNullParameter(selectApptDate, "selectApptDate");
        Intrinsics.checkNotNullParameter(selectApptDateDay, "selectApptDateDay");
        Intrinsics.checkNotNullParameter(slot, "slot");
        Intrinsics.checkNotNullParameter(slot__service_Id, "slot__service_Id");
        Intrinsics.checkNotNullParameter(slot_service_descr, "slot_service_descr");
        Intrinsics.checkNotNullParameter(total_seat, "total_seat");
        Intrinsics.checkNotNullParameter(veh_class, "veh_class");
        return new testmodleItem(avail_seats, day_ofWeek, selectApptDate, selectApptDateDay, selectCase, slot, slot__service_Id, slot_id, slot_service_descr, total_seat, veh_class);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof testmodleItem)) {
            return false;
        }
        testmodleItem testmodleitem = (testmodleItem) other;
        return Intrinsics.areEqual(this.avail_seats, testmodleitem.avail_seats) && Intrinsics.areEqual(this.day_ofWeek, testmodleitem.day_ofWeek) && Intrinsics.areEqual(this.selectApptDate, testmodleitem.selectApptDate) && Intrinsics.areEqual(this.selectApptDateDay, testmodleitem.selectApptDateDay) && this.selectCase == testmodleitem.selectCase && Intrinsics.areEqual(this.slot, testmodleitem.slot) && Intrinsics.areEqual(this.slot__service_Id, testmodleitem.slot__service_Id) && this.slot_id == testmodleitem.slot_id && Intrinsics.areEqual(this.slot_service_descr, testmodleitem.slot_service_descr) && Intrinsics.areEqual(this.total_seat, testmodleitem.total_seat) && Intrinsics.areEqual(this.veh_class, testmodleitem.veh_class);
    }

    public final String getAvail_seats() {
        return this.avail_seats;
    }

    public final Object getDay_ofWeek() {
        return this.day_ofWeek;
    }

    public final String getSelectApptDate() {
        return this.selectApptDate;
    }

    public final Object getSelectApptDateDay() {
        return this.selectApptDateDay;
    }

    public final boolean getSelectCase() {
        return this.selectCase;
    }

    public final String getSlot() {
        return this.slot;
    }

    public final String getSlot__service_Id() {
        return this.slot__service_Id;
    }

    public final int getSlot_id() {
        return this.slot_id;
    }

    public final String getSlot_service_descr() {
        return this.slot_service_descr;
    }

    public final String getTotal_seat() {
        return this.total_seat;
    }

    public final Object getVeh_class() {
        return this.veh_class;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    public int hashCode() {
        int iHashCode = ((((((this.avail_seats.hashCode() * 31) + this.day_ofWeek.hashCode()) * 31) + this.selectApptDate.hashCode()) * 31) + this.selectApptDateDay.hashCode()) * 31;
        boolean z = this.selectCase;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((((((((((iHashCode + r1) * 31) + this.slot.hashCode()) * 31) + this.slot__service_Id.hashCode()) * 31) + Integer.hashCode(this.slot_id)) * 31) + this.slot_service_descr.hashCode()) * 31) + this.total_seat.hashCode()) * 31) + this.veh_class.hashCode();
    }

    public String toString() {
        return "testmodleItem(avail_seats=" + this.avail_seats + ", day_ofWeek=" + this.day_ofWeek + ", selectApptDate=" + this.selectApptDate + ", selectApptDateDay=" + this.selectApptDateDay + ", selectCase=" + this.selectCase + ", slot=" + this.slot + ", slot__service_Id=" + this.slot__service_Id + ", slot_id=" + this.slot_id + ", slot_service_descr=" + this.slot_service_descr + ", total_seat=" + this.total_seat + ", veh_class=" + this.veh_class + ')';
    }
}
