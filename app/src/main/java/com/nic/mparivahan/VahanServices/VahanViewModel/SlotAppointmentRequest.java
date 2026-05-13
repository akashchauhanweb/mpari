package com.nic.mparivahan.VahanServices.VahanViewModel;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\tj\b\u0012\u0004\u0012\u00020\u0003`\n¢\u0006\u0002\u0010\u000bJ\t\u0010\f\u001a\u00020\u0003HÂ\u0003J\t\u0010\r\u001a\u00020\u0003HÂ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÂ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÂ\u0003J\u0019\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00030\tj\b\u0012\u0004\u0012\u00020\u0003`\nHÂ\u0003JU\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\tj\b\u0012\u0004\u0012\u00020\u0003`\nHÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\tj\b\u0012\u0004\u0012\u00020\u0003`\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanViewModel/SlotAppointmentRequest;", "", "regn_no", "", "appl_no", "state_cd", "off_cd", "book_dt", "sel_services", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SlotAppointmentRequest {
    private final String appl_no;
    private final String book_dt;
    private final String off_cd;
    private final String regn_no;
    private final ArrayList<String> sel_services;
    private final String state_cd;

    public SlotAppointmentRequest(String regn_no, String appl_no, String state_cd, String off_cd, String book_dt, ArrayList<String> sel_services) {
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(appl_no, "appl_no");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(off_cd, "off_cd");
        Intrinsics.checkNotNullParameter(book_dt, "book_dt");
        Intrinsics.checkNotNullParameter(sel_services, "sel_services");
        this.regn_no = regn_no;
        this.appl_no = appl_no;
        this.state_cd = state_cd;
        this.off_cd = off_cd;
        this.book_dt = book_dt;
        this.sel_services = sel_services;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final String getRegn_no() {
        return this.regn_no;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final String getAppl_no() {
        return this.appl_no;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final String getState_cd() {
        return this.state_cd;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    private final String getOff_cd() {
        return this.off_cd;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    private final String getBook_dt() {
        return this.book_dt;
    }

    private final ArrayList<String> component6() {
        return this.sel_services;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SlotAppointmentRequest copy$default(SlotAppointmentRequest slotAppointmentRequest, String str, String str2, String str3, String str4, String str5, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = slotAppointmentRequest.regn_no;
        }
        if ((i & 2) != 0) {
            str2 = slotAppointmentRequest.appl_no;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = slotAppointmentRequest.state_cd;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = slotAppointmentRequest.off_cd;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = slotAppointmentRequest.book_dt;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            arrayList = slotAppointmentRequest.sel_services;
        }
        return slotAppointmentRequest.copy(str, str6, str7, str8, str9, arrayList);
    }

    public final SlotAppointmentRequest copy(String regn_no, String appl_no, String state_cd, String off_cd, String book_dt, ArrayList<String> sel_services) {
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(appl_no, "appl_no");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(off_cd, "off_cd");
        Intrinsics.checkNotNullParameter(book_dt, "book_dt");
        Intrinsics.checkNotNullParameter(sel_services, "sel_services");
        return new SlotAppointmentRequest(regn_no, appl_no, state_cd, off_cd, book_dt, sel_services);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SlotAppointmentRequest)) {
            return false;
        }
        SlotAppointmentRequest slotAppointmentRequest = (SlotAppointmentRequest) other;
        return Intrinsics.areEqual(this.regn_no, slotAppointmentRequest.regn_no) && Intrinsics.areEqual(this.appl_no, slotAppointmentRequest.appl_no) && Intrinsics.areEqual(this.state_cd, slotAppointmentRequest.state_cd) && Intrinsics.areEqual(this.off_cd, slotAppointmentRequest.off_cd) && Intrinsics.areEqual(this.book_dt, slotAppointmentRequest.book_dt) && Intrinsics.areEqual(this.sel_services, slotAppointmentRequest.sel_services);
    }

    public int hashCode() {
        return (((((((((this.regn_no.hashCode() * 31) + this.appl_no.hashCode()) * 31) + this.state_cd.hashCode()) * 31) + this.off_cd.hashCode()) * 31) + this.book_dt.hashCode()) * 31) + this.sel_services.hashCode();
    }

    public String toString() {
        return "SlotAppointmentRequest(regn_no=" + this.regn_no + ", appl_no=" + this.appl_no + ", state_cd=" + this.state_cd + ", off_cd=" + this.off_cd + ", book_dt=" + this.book_dt + ", sel_services=" + this.sel_services + ')';
    }
}
