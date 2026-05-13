package com.nic.mparivahan.VahanServices.VahanViewModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b+\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bå\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0001\u0012\u0006\u0010\u0016\u001a\u00020\u0001\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003¢\u0006\u0002\u0010 J\t\u0010!\u001a\u00020\u0003HÂ\u0003J\t\u0010\"\u001a\u00020\u0003HÂ\u0003J\t\u0010#\u001a\u00020\u0003HÂ\u0003J\t\u0010$\u001a\u00020\u0003HÂ\u0003J\t\u0010%\u001a\u00020\u0003HÂ\u0003J\t\u0010&\u001a\u00020\u0003HÂ\u0003J\t\u0010'\u001a\u00020\u0003HÂ\u0003J\t\u0010(\u001a\u00020\u0013HÂ\u0003J\t\u0010)\u001a\u00020\u0003HÂ\u0003J\t\u0010*\u001a\u00020\u0001HÂ\u0003J\t\u0010+\u001a\u00020\u0001HÂ\u0003J\t\u0010,\u001a\u00020\u0003HÂ\u0003J\t\u0010-\u001a\u00020\u0003HÂ\u0003J\t\u0010.\u001a\u00020\u0003HÂ\u0003J\t\u0010/\u001a\u00020\u0003HÂ\u0003J\t\u00100\u001a\u00020\u0003HÂ\u0003J\t\u00101\u001a\u00020\u0003HÂ\u0003J\t\u00102\u001a\u00020\u0003HÂ\u0003J\t\u00103\u001a\u00020\u0003HÂ\u0003J\t\u00104\u001a\u00020\u0003HÂ\u0003J\t\u00105\u001a\u00020\u0003HÂ\u0003J\t\u00106\u001a\u00020\u0003HÂ\u0003J\t\u00107\u001a\u00020\u0003HÂ\u0003J\t\u00108\u001a\u00020\u0003HÂ\u0003J\t\u00109\u001a\u00020\u0003HÂ\u0003J\t\u0010:\u001a\u00020\u0003HÂ\u0003J\t\u0010;\u001a\u00020\u0003HÂ\u0003J\t\u0010<\u001a\u00020\u0003HÂ\u0003J¡\u0002\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010A\u001a\u00020\u0013HÖ\u0001J\t\u0010B\u001a\u00020\u0003HÖ\u0001R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006C"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanViewModel/SaveSlotAppointmentRequest;", "", "state_cd", "", "off_cd", "appt_id", "day_of_week", "slot_id", "service_id", "counter_id", "appl_no", "regn_no", "appointment_dt", "op_date", "count_reschedule", "book_status", "service_descr", "fit_officer", "mobile_no", "", "paymemt_status", "op_dateas_date", "op_date_release", "new_appl_no", "new_appointment_dt", "vh_class", "vch_catg", "owner_name", "vh_class_desc", "old_appointment_dt", "shift_day_of_week", "shift_slot_id", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SaveSlotAppointmentRequest {
    private final String appl_no;
    private final String appointment_dt;
    private final String appt_id;
    private final String book_status;
    private final String count_reschedule;
    private final String counter_id;
    private final String day_of_week;
    private final String fit_officer;
    private final int mobile_no;
    private final String new_appl_no;
    private final String new_appointment_dt;
    private final String off_cd;
    private final String old_appointment_dt;
    private final String op_date;
    private final Object op_date_release;
    private final Object op_dateas_date;
    private final String owner_name;
    private final String paymemt_status;
    private final String regn_no;
    private final String service_descr;
    private final String service_id;
    private final String shift_day_of_week;
    private final String shift_slot_id;
    private final String slot_id;
    private final String state_cd;
    private final String vch_catg;
    private final String vh_class;
    private final String vh_class_desc;

    public SaveSlotAppointmentRequest(String state_cd, String off_cd, String appt_id, String day_of_week, String slot_id, String service_id, String counter_id, String appl_no, String regn_no, String appointment_dt, String op_date, String count_reschedule, String book_status, String service_descr, String fit_officer, int i, String paymemt_status, Object op_dateas_date, Object op_date_release, String new_appl_no, String new_appointment_dt, String vh_class, String vch_catg, String owner_name, String vh_class_desc, String old_appointment_dt, String shift_day_of_week, String shift_slot_id) {
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(off_cd, "off_cd");
        Intrinsics.checkNotNullParameter(appt_id, "appt_id");
        Intrinsics.checkNotNullParameter(day_of_week, "day_of_week");
        Intrinsics.checkNotNullParameter(slot_id, "slot_id");
        Intrinsics.checkNotNullParameter(service_id, "service_id");
        Intrinsics.checkNotNullParameter(counter_id, "counter_id");
        Intrinsics.checkNotNullParameter(appl_no, "appl_no");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(appointment_dt, "appointment_dt");
        Intrinsics.checkNotNullParameter(op_date, "op_date");
        Intrinsics.checkNotNullParameter(count_reschedule, "count_reschedule");
        Intrinsics.checkNotNullParameter(book_status, "book_status");
        Intrinsics.checkNotNullParameter(service_descr, "service_descr");
        Intrinsics.checkNotNullParameter(fit_officer, "fit_officer");
        Intrinsics.checkNotNullParameter(paymemt_status, "paymemt_status");
        Intrinsics.checkNotNullParameter(op_dateas_date, "op_dateas_date");
        Intrinsics.checkNotNullParameter(op_date_release, "op_date_release");
        Intrinsics.checkNotNullParameter(new_appl_no, "new_appl_no");
        Intrinsics.checkNotNullParameter(new_appointment_dt, "new_appointment_dt");
        Intrinsics.checkNotNullParameter(vh_class, "vh_class");
        Intrinsics.checkNotNullParameter(vch_catg, "vch_catg");
        Intrinsics.checkNotNullParameter(owner_name, "owner_name");
        Intrinsics.checkNotNullParameter(vh_class_desc, "vh_class_desc");
        Intrinsics.checkNotNullParameter(old_appointment_dt, "old_appointment_dt");
        Intrinsics.checkNotNullParameter(shift_day_of_week, "shift_day_of_week");
        Intrinsics.checkNotNullParameter(shift_slot_id, "shift_slot_id");
        this.state_cd = state_cd;
        this.off_cd = off_cd;
        this.appt_id = appt_id;
        this.day_of_week = day_of_week;
        this.slot_id = slot_id;
        this.service_id = service_id;
        this.counter_id = counter_id;
        this.appl_no = appl_no;
        this.regn_no = regn_no;
        this.appointment_dt = appointment_dt;
        this.op_date = op_date;
        this.count_reschedule = count_reschedule;
        this.book_status = book_status;
        this.service_descr = service_descr;
        this.fit_officer = fit_officer;
        this.mobile_no = i;
        this.paymemt_status = paymemt_status;
        this.op_dateas_date = op_dateas_date;
        this.op_date_release = op_date_release;
        this.new_appl_no = new_appl_no;
        this.new_appointment_dt = new_appointment_dt;
        this.vh_class = vh_class;
        this.vch_catg = vch_catg;
        this.owner_name = owner_name;
        this.vh_class_desc = vh_class_desc;
        this.old_appointment_dt = old_appointment_dt;
        this.shift_day_of_week = shift_day_of_week;
        this.shift_slot_id = shift_slot_id;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final String getState_cd() {
        return this.state_cd;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    private final String getAppointment_dt() {
        return this.appointment_dt;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    private final String getOp_date() {
        return this.op_date;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    private final String getCount_reschedule() {
        return this.count_reschedule;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    private final String getBook_status() {
        return this.book_status;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    private final String getService_descr() {
        return this.service_descr;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    private final String getFit_officer() {
        return this.fit_officer;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    private final int getMobile_no() {
        return this.mobile_no;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    private final String getPaymemt_status() {
        return this.paymemt_status;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    private final Object getOp_dateas_date() {
        return this.op_dateas_date;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    private final Object getOp_date_release() {
        return this.op_date_release;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final String getOff_cd() {
        return this.off_cd;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    private final String getNew_appl_no() {
        return this.new_appl_no;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    private final String getNew_appointment_dt() {
        return this.new_appointment_dt;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    private final String getVh_class() {
        return this.vh_class;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    private final String getVch_catg() {
        return this.vch_catg;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    private final String getOwner_name() {
        return this.owner_name;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    private final String getVh_class_desc() {
        return this.vh_class_desc;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    private final String getOld_appointment_dt() {
        return this.old_appointment_dt;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    private final String getShift_day_of_week() {
        return this.shift_day_of_week;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    private final String getShift_slot_id() {
        return this.shift_slot_id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final String getAppt_id() {
        return this.appt_id;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    private final String getDay_of_week() {
        return this.day_of_week;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    private final String getSlot_id() {
        return this.slot_id;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    private final String getService_id() {
        return this.service_id;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    private final String getCounter_id() {
        return this.counter_id;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    private final String getAppl_no() {
        return this.appl_no;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    private final String getRegn_no() {
        return this.regn_no;
    }

    public final SaveSlotAppointmentRequest copy(String state_cd, String off_cd, String appt_id, String day_of_week, String slot_id, String service_id, String counter_id, String appl_no, String regn_no, String appointment_dt, String op_date, String count_reschedule, String book_status, String service_descr, String fit_officer, int mobile_no, String paymemt_status, Object op_dateas_date, Object op_date_release, String new_appl_no, String new_appointment_dt, String vh_class, String vch_catg, String owner_name, String vh_class_desc, String old_appointment_dt, String shift_day_of_week, String shift_slot_id) {
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(off_cd, "off_cd");
        Intrinsics.checkNotNullParameter(appt_id, "appt_id");
        Intrinsics.checkNotNullParameter(day_of_week, "day_of_week");
        Intrinsics.checkNotNullParameter(slot_id, "slot_id");
        Intrinsics.checkNotNullParameter(service_id, "service_id");
        Intrinsics.checkNotNullParameter(counter_id, "counter_id");
        Intrinsics.checkNotNullParameter(appl_no, "appl_no");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(appointment_dt, "appointment_dt");
        Intrinsics.checkNotNullParameter(op_date, "op_date");
        Intrinsics.checkNotNullParameter(count_reschedule, "count_reschedule");
        Intrinsics.checkNotNullParameter(book_status, "book_status");
        Intrinsics.checkNotNullParameter(service_descr, "service_descr");
        Intrinsics.checkNotNullParameter(fit_officer, "fit_officer");
        Intrinsics.checkNotNullParameter(paymemt_status, "paymemt_status");
        Intrinsics.checkNotNullParameter(op_dateas_date, "op_dateas_date");
        Intrinsics.checkNotNullParameter(op_date_release, "op_date_release");
        Intrinsics.checkNotNullParameter(new_appl_no, "new_appl_no");
        Intrinsics.checkNotNullParameter(new_appointment_dt, "new_appointment_dt");
        Intrinsics.checkNotNullParameter(vh_class, "vh_class");
        Intrinsics.checkNotNullParameter(vch_catg, "vch_catg");
        Intrinsics.checkNotNullParameter(owner_name, "owner_name");
        Intrinsics.checkNotNullParameter(vh_class_desc, "vh_class_desc");
        Intrinsics.checkNotNullParameter(old_appointment_dt, "old_appointment_dt");
        Intrinsics.checkNotNullParameter(shift_day_of_week, "shift_day_of_week");
        Intrinsics.checkNotNullParameter(shift_slot_id, "shift_slot_id");
        return new SaveSlotAppointmentRequest(state_cd, off_cd, appt_id, day_of_week, slot_id, service_id, counter_id, appl_no, regn_no, appointment_dt, op_date, count_reschedule, book_status, service_descr, fit_officer, mobile_no, paymemt_status, op_dateas_date, op_date_release, new_appl_no, new_appointment_dt, vh_class, vch_catg, owner_name, vh_class_desc, old_appointment_dt, shift_day_of_week, shift_slot_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SaveSlotAppointmentRequest)) {
            return false;
        }
        SaveSlotAppointmentRequest saveSlotAppointmentRequest = (SaveSlotAppointmentRequest) other;
        return Intrinsics.areEqual(this.state_cd, saveSlotAppointmentRequest.state_cd) && Intrinsics.areEqual(this.off_cd, saveSlotAppointmentRequest.off_cd) && Intrinsics.areEqual(this.appt_id, saveSlotAppointmentRequest.appt_id) && Intrinsics.areEqual(this.day_of_week, saveSlotAppointmentRequest.day_of_week) && Intrinsics.areEqual(this.slot_id, saveSlotAppointmentRequest.slot_id) && Intrinsics.areEqual(this.service_id, saveSlotAppointmentRequest.service_id) && Intrinsics.areEqual(this.counter_id, saveSlotAppointmentRequest.counter_id) && Intrinsics.areEqual(this.appl_no, saveSlotAppointmentRequest.appl_no) && Intrinsics.areEqual(this.regn_no, saveSlotAppointmentRequest.regn_no) && Intrinsics.areEqual(this.appointment_dt, saveSlotAppointmentRequest.appointment_dt) && Intrinsics.areEqual(this.op_date, saveSlotAppointmentRequest.op_date) && Intrinsics.areEqual(this.count_reschedule, saveSlotAppointmentRequest.count_reschedule) && Intrinsics.areEqual(this.book_status, saveSlotAppointmentRequest.book_status) && Intrinsics.areEqual(this.service_descr, saveSlotAppointmentRequest.service_descr) && Intrinsics.areEqual(this.fit_officer, saveSlotAppointmentRequest.fit_officer) && this.mobile_no == saveSlotAppointmentRequest.mobile_no && Intrinsics.areEqual(this.paymemt_status, saveSlotAppointmentRequest.paymemt_status) && Intrinsics.areEqual(this.op_dateas_date, saveSlotAppointmentRequest.op_dateas_date) && Intrinsics.areEqual(this.op_date_release, saveSlotAppointmentRequest.op_date_release) && Intrinsics.areEqual(this.new_appl_no, saveSlotAppointmentRequest.new_appl_no) && Intrinsics.areEqual(this.new_appointment_dt, saveSlotAppointmentRequest.new_appointment_dt) && Intrinsics.areEqual(this.vh_class, saveSlotAppointmentRequest.vh_class) && Intrinsics.areEqual(this.vch_catg, saveSlotAppointmentRequest.vch_catg) && Intrinsics.areEqual(this.owner_name, saveSlotAppointmentRequest.owner_name) && Intrinsics.areEqual(this.vh_class_desc, saveSlotAppointmentRequest.vh_class_desc) && Intrinsics.areEqual(this.old_appointment_dt, saveSlotAppointmentRequest.old_appointment_dt) && Intrinsics.areEqual(this.shift_day_of_week, saveSlotAppointmentRequest.shift_day_of_week) && Intrinsics.areEqual(this.shift_slot_id, saveSlotAppointmentRequest.shift_slot_id);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((this.state_cd.hashCode() * 31) + this.off_cd.hashCode()) * 31) + this.appt_id.hashCode()) * 31) + this.day_of_week.hashCode()) * 31) + this.slot_id.hashCode()) * 31) + this.service_id.hashCode()) * 31) + this.counter_id.hashCode()) * 31) + this.appl_no.hashCode()) * 31) + this.regn_no.hashCode()) * 31) + this.appointment_dt.hashCode()) * 31) + this.op_date.hashCode()) * 31) + this.count_reschedule.hashCode()) * 31) + this.book_status.hashCode()) * 31) + this.service_descr.hashCode()) * 31) + this.fit_officer.hashCode()) * 31) + Integer.hashCode(this.mobile_no)) * 31) + this.paymemt_status.hashCode()) * 31) + this.op_dateas_date.hashCode()) * 31) + this.op_date_release.hashCode()) * 31) + this.new_appl_no.hashCode()) * 31) + this.new_appointment_dt.hashCode()) * 31) + this.vh_class.hashCode()) * 31) + this.vch_catg.hashCode()) * 31) + this.owner_name.hashCode()) * 31) + this.vh_class_desc.hashCode()) * 31) + this.old_appointment_dt.hashCode()) * 31) + this.shift_day_of_week.hashCode()) * 31) + this.shift_slot_id.hashCode();
    }

    public String toString() {
        return "SaveSlotAppointmentRequest(state_cd=" + this.state_cd + ", off_cd=" + this.off_cd + ", appt_id=" + this.appt_id + ", day_of_week=" + this.day_of_week + ", slot_id=" + this.slot_id + ", service_id=" + this.service_id + ", counter_id=" + this.counter_id + ", appl_no=" + this.appl_no + ", regn_no=" + this.regn_no + ", appointment_dt=" + this.appointment_dt + ", op_date=" + this.op_date + ", count_reschedule=" + this.count_reschedule + ", book_status=" + this.book_status + ", service_descr=" + this.service_descr + ", fit_officer=" + this.fit_officer + ", mobile_no=" + this.mobile_no + ", paymemt_status=" + this.paymemt_status + ", op_dateas_date=" + this.op_dateas_date + ", op_date_release=" + this.op_date_release + ", new_appl_no=" + this.new_appl_no + ", new_appointment_dt=" + this.new_appointment_dt + ", vh_class=" + this.vh_class + ", vch_catg=" + this.vch_catg + ", owner_name=" + this.owner_name + ", vh_class_desc=" + this.vh_class_desc + ", old_appointment_dt=" + this.old_appointment_dt + ", shift_day_of_week=" + this.shift_day_of_week + ", shift_slot_id=" + this.shift_slot_id + ')';
    }
}
