package com.nic.mparivahan.VahanServices.VahanViewModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003Jc\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u0005HÆ\u0001J\u0013\u0010%\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\t\u0010(\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010¨\u0006)"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanViewModel/SlotAppointmentModel;", "", "slot_id", "", "slot", "", "total_seat", "avail_seats", "slot__service_Id", "slot_service_descr", "selectCase", "", "selectApptDate", "day_ofWeek", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getAvail_seats", "()Ljava/lang/String;", "getDay_ofWeek", "getSelectApptDate", "getSelectCase", "()Z", "getSlot", "getSlot__service_Id", "getSlot_id", "()I", "getSlot_service_descr", "getTotal_seat", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SlotAppointmentModel {
    private final String avail_seats;
    private final String day_ofWeek;
    private final String selectApptDate;
    private final boolean selectCase;
    private final String slot;
    private final String slot__service_Id;
    private final int slot_id;
    private final String slot_service_descr;
    private final String total_seat;

    public SlotAppointmentModel(int i, String slot, String total_seat, String avail_seats, String slot__service_Id, String slot_service_descr, boolean z, String selectApptDate, String day_ofWeek) {
        Intrinsics.checkNotNullParameter(slot, "slot");
        Intrinsics.checkNotNullParameter(total_seat, "total_seat");
        Intrinsics.checkNotNullParameter(avail_seats, "avail_seats");
        Intrinsics.checkNotNullParameter(slot__service_Id, "slot__service_Id");
        Intrinsics.checkNotNullParameter(slot_service_descr, "slot_service_descr");
        Intrinsics.checkNotNullParameter(selectApptDate, "selectApptDate");
        Intrinsics.checkNotNullParameter(day_ofWeek, "day_ofWeek");
        this.slot_id = i;
        this.slot = slot;
        this.total_seat = total_seat;
        this.avail_seats = avail_seats;
        this.slot__service_Id = slot__service_Id;
        this.slot_service_descr = slot_service_descr;
        this.selectCase = z;
        this.selectApptDate = selectApptDate;
        this.day_ofWeek = day_ofWeek;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSlot_id() {
        return this.slot_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSlot() {
        return this.slot;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTotal_seat() {
        return this.total_seat;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAvail_seats() {
        return this.avail_seats;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSlot__service_Id() {
        return this.slot__service_Id;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSlot_service_descr() {
        return this.slot_service_descr;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getSelectCase() {
        return this.selectCase;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSelectApptDate() {
        return this.selectApptDate;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDay_ofWeek() {
        return this.day_ofWeek;
    }

    public final SlotAppointmentModel copy(int slot_id, String slot, String total_seat, String avail_seats, String slot__service_Id, String slot_service_descr, boolean selectCase, String selectApptDate, String day_ofWeek) {
        Intrinsics.checkNotNullParameter(slot, "slot");
        Intrinsics.checkNotNullParameter(total_seat, "total_seat");
        Intrinsics.checkNotNullParameter(avail_seats, "avail_seats");
        Intrinsics.checkNotNullParameter(slot__service_Id, "slot__service_Id");
        Intrinsics.checkNotNullParameter(slot_service_descr, "slot_service_descr");
        Intrinsics.checkNotNullParameter(selectApptDate, "selectApptDate");
        Intrinsics.checkNotNullParameter(day_ofWeek, "day_ofWeek");
        return new SlotAppointmentModel(slot_id, slot, total_seat, avail_seats, slot__service_Id, slot_service_descr, selectCase, selectApptDate, day_ofWeek);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SlotAppointmentModel)) {
            return false;
        }
        SlotAppointmentModel slotAppointmentModel = (SlotAppointmentModel) other;
        return this.slot_id == slotAppointmentModel.slot_id && Intrinsics.areEqual(this.slot, slotAppointmentModel.slot) && Intrinsics.areEqual(this.total_seat, slotAppointmentModel.total_seat) && Intrinsics.areEqual(this.avail_seats, slotAppointmentModel.avail_seats) && Intrinsics.areEqual(this.slot__service_Id, slotAppointmentModel.slot__service_Id) && Intrinsics.areEqual(this.slot_service_descr, slotAppointmentModel.slot_service_descr) && this.selectCase == slotAppointmentModel.selectCase && Intrinsics.areEqual(this.selectApptDate, slotAppointmentModel.selectApptDate) && Intrinsics.areEqual(this.day_ofWeek, slotAppointmentModel.day_ofWeek);
    }

    public final String getAvail_seats() {
        return this.avail_seats;
    }

    public final String getDay_ofWeek() {
        return this.day_ofWeek;
    }

    public final String getSelectApptDate() {
        return this.selectApptDate;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    public int hashCode() {
        int iHashCode = ((((((((((Integer.hashCode(this.slot_id) * 31) + this.slot.hashCode()) * 31) + this.total_seat.hashCode()) * 31) + this.avail_seats.hashCode()) * 31) + this.slot__service_Id.hashCode()) * 31) + this.slot_service_descr.hashCode()) * 31;
        boolean z = this.selectCase;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((iHashCode + r1) * 31) + this.selectApptDate.hashCode()) * 31) + this.day_ofWeek.hashCode();
    }

    public String toString() {
        return "SlotAppointmentModel(slot_id=" + this.slot_id + ", slot=" + this.slot + ", total_seat=" + this.total_seat + ", avail_seats=" + this.avail_seats + ", slot__service_Id=" + this.slot__service_Id + ", slot_service_descr=" + this.slot_service_descr + ", selectCase=" + this.selectCase + ", selectApptDate=" + this.selectApptDate + ", day_ofWeek=" + this.day_ofWeek + ')';
    }
}
