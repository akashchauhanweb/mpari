package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000bj\b\u0012\u0004\u0012\u00020\u0003`\f\u0012\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000bj\b\u0012\u0004\u0012\u00020\u0003`\f\u0012\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000bj\b\u0012\u0004\u0012\u00020\u0003`\f\u0012\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000bj\b\u0012\u0004\u0012\u00020\u0003`\f¢\u0006\u0002\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000bj\b\u0012\u0004\u0012\u00020\u0003`\fHÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\u0019\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000bj\b\u0012\u0004\u0012\u00020\u0003`\fHÆ\u0003J\u0019\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000bj\b\u0012\u0004\u0012\u00020\u0003`\fHÆ\u0003J\u0019\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000bj\b\u0012\u0004\u0012\u00020\u0003`\fHÆ\u0003J\u00ad\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000bj\b\u0012\u0004\u0012\u00020\u0003`\f2\u0018\b\u0002\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000bj\b\u0012\u0004\u0012\u00020\u0003`\f2\u0018\b\u0002\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000bj\b\u0012\u0004\u0012\u00020\u0003`\f2\u0018\b\u0002\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000bj\b\u0012\u0004\u0012\u00020\u0003`\fHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R!\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000bj\b\u0012\u0004\u0012\u00020\u0003`\f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R!\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000bj\b\u0012\u0004\u0012\u00020\u0003`\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R!\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000bj\b\u0012\u0004\u0012\u00020\u0003`\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000bj\b\u0012\u0004\u0012\u00020\u0003`\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014¨\u0006/"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/SlotUserDataModel;", "", "regn_no", "", "appl_no", "state_cd", "off_cd", "pur_cd", "owner_dobj", "Lcom/nic/mparivahan/VahanServices/VahanModel/SlotOwnerData;", "sel_services", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "availableDates", "alreadyBookedDates", "holidayDeclareDates", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/VahanModel/SlotOwnerData;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "getAlreadyBookedDates", "()Ljava/util/ArrayList;", "getAppl_no", "()Ljava/lang/String;", "getAvailableDates", "getHolidayDeclareDates", "getOff_cd", "getOwner_dobj", "()Lcom/nic/mparivahan/VahanServices/VahanModel/SlotOwnerData;", "getPur_cd", "getRegn_no", "getSel_services", "getState_cd", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SlotUserDataModel {
    private final ArrayList<String> alreadyBookedDates;
    private final String appl_no;
    private final ArrayList<String> availableDates;
    private final ArrayList<String> holidayDeclareDates;
    private final String off_cd;
    private final SlotOwnerData owner_dobj;
    private final String pur_cd;
    private final String regn_no;
    private final ArrayList<String> sel_services;
    private final String state_cd;

    public SlotUserDataModel(String regn_no, String appl_no, String state_cd, String off_cd, String pur_cd, SlotOwnerData owner_dobj, ArrayList<String> sel_services, ArrayList<String> availableDates, ArrayList<String> alreadyBookedDates, ArrayList<String> holidayDeclareDates) {
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(appl_no, "appl_no");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(off_cd, "off_cd");
        Intrinsics.checkNotNullParameter(pur_cd, "pur_cd");
        Intrinsics.checkNotNullParameter(owner_dobj, "owner_dobj");
        Intrinsics.checkNotNullParameter(sel_services, "sel_services");
        Intrinsics.checkNotNullParameter(availableDates, "availableDates");
        Intrinsics.checkNotNullParameter(alreadyBookedDates, "alreadyBookedDates");
        Intrinsics.checkNotNullParameter(holidayDeclareDates, "holidayDeclareDates");
        this.regn_no = regn_no;
        this.appl_no = appl_no;
        this.state_cd = state_cd;
        this.off_cd = off_cd;
        this.pur_cd = pur_cd;
        this.owner_dobj = owner_dobj;
        this.sel_services = sel_services;
        this.availableDates = availableDates;
        this.alreadyBookedDates = alreadyBookedDates;
        this.holidayDeclareDates = holidayDeclareDates;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRegn_no() {
        return this.regn_no;
    }

    public final ArrayList<String> component10() {
        return this.holidayDeclareDates;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAppl_no() {
        return this.appl_no;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getState_cd() {
        return this.state_cd;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOff_cd() {
        return this.off_cd;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPur_cd() {
        return this.pur_cd;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final SlotOwnerData getOwner_dobj() {
        return this.owner_dobj;
    }

    public final ArrayList<String> component7() {
        return this.sel_services;
    }

    public final ArrayList<String> component8() {
        return this.availableDates;
    }

    public final ArrayList<String> component9() {
        return this.alreadyBookedDates;
    }

    public final SlotUserDataModel copy(String regn_no, String appl_no, String state_cd, String off_cd, String pur_cd, SlotOwnerData owner_dobj, ArrayList<String> sel_services, ArrayList<String> availableDates, ArrayList<String> alreadyBookedDates, ArrayList<String> holidayDeclareDates) {
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(appl_no, "appl_no");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(off_cd, "off_cd");
        Intrinsics.checkNotNullParameter(pur_cd, "pur_cd");
        Intrinsics.checkNotNullParameter(owner_dobj, "owner_dobj");
        Intrinsics.checkNotNullParameter(sel_services, "sel_services");
        Intrinsics.checkNotNullParameter(availableDates, "availableDates");
        Intrinsics.checkNotNullParameter(alreadyBookedDates, "alreadyBookedDates");
        Intrinsics.checkNotNullParameter(holidayDeclareDates, "holidayDeclareDates");
        return new SlotUserDataModel(regn_no, appl_no, state_cd, off_cd, pur_cd, owner_dobj, sel_services, availableDates, alreadyBookedDates, holidayDeclareDates);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SlotUserDataModel)) {
            return false;
        }
        SlotUserDataModel slotUserDataModel = (SlotUserDataModel) other;
        return Intrinsics.areEqual(this.regn_no, slotUserDataModel.regn_no) && Intrinsics.areEqual(this.appl_no, slotUserDataModel.appl_no) && Intrinsics.areEqual(this.state_cd, slotUserDataModel.state_cd) && Intrinsics.areEqual(this.off_cd, slotUserDataModel.off_cd) && Intrinsics.areEqual(this.pur_cd, slotUserDataModel.pur_cd) && Intrinsics.areEqual(this.owner_dobj, slotUserDataModel.owner_dobj) && Intrinsics.areEqual(this.sel_services, slotUserDataModel.sel_services) && Intrinsics.areEqual(this.availableDates, slotUserDataModel.availableDates) && Intrinsics.areEqual(this.alreadyBookedDates, slotUserDataModel.alreadyBookedDates) && Intrinsics.areEqual(this.holidayDeclareDates, slotUserDataModel.holidayDeclareDates);
    }

    public final ArrayList<String> getAlreadyBookedDates() {
        return this.alreadyBookedDates;
    }

    public final String getAppl_no() {
        return this.appl_no;
    }

    public final ArrayList<String> getAvailableDates() {
        return this.availableDates;
    }

    public final ArrayList<String> getHolidayDeclareDates() {
        return this.holidayDeclareDates;
    }

    public final String getOff_cd() {
        return this.off_cd;
    }

    public final SlotOwnerData getOwner_dobj() {
        return this.owner_dobj;
    }

    public final String getPur_cd() {
        return this.pur_cd;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final ArrayList<String> getSel_services() {
        return this.sel_services;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public int hashCode() {
        return (((((((((((((((((this.regn_no.hashCode() * 31) + this.appl_no.hashCode()) * 31) + this.state_cd.hashCode()) * 31) + this.off_cd.hashCode()) * 31) + this.pur_cd.hashCode()) * 31) + this.owner_dobj.hashCode()) * 31) + this.sel_services.hashCode()) * 31) + this.availableDates.hashCode()) * 31) + this.alreadyBookedDates.hashCode()) * 31) + this.holidayDeclareDates.hashCode();
    }

    public String toString() {
        return "SlotUserDataModel(regn_no=" + this.regn_no + ", appl_no=" + this.appl_no + ", state_cd=" + this.state_cd + ", off_cd=" + this.off_cd + ", pur_cd=" + this.pur_cd + ", owner_dobj=" + this.owner_dobj + ", sel_services=" + this.sel_services + ", availableDates=" + this.availableDates + ", alreadyBookedDates=" + this.alreadyBookedDates + ", holidayDeclareDates=" + this.holidayDeclareDates + ')';
    }
}
