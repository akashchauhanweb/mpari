package com.nic.mparivahan.Echallan.Model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/nic/mparivahan/Echallan/Model/VirtualChallanProceedingModel;", "", "challan_no", "", "party_name", "date_of_proceeding", "fine_imposed", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChallan_no", "()Ljava/lang/String;", "getDate_of_proceeding", "getFine_imposed", "getParty_name", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class VirtualChallanProceedingModel {
    private final String challan_no;
    private final String date_of_proceeding;
    private final String fine_imposed;
    private final String party_name;

    public VirtualChallanProceedingModel(String challan_no, String party_name, String date_of_proceeding, String fine_imposed) {
        Intrinsics.checkNotNullParameter(challan_no, "challan_no");
        Intrinsics.checkNotNullParameter(party_name, "party_name");
        Intrinsics.checkNotNullParameter(date_of_proceeding, "date_of_proceeding");
        Intrinsics.checkNotNullParameter(fine_imposed, "fine_imposed");
        this.challan_no = challan_no;
        this.party_name = party_name;
        this.date_of_proceeding = date_of_proceeding;
        this.fine_imposed = fine_imposed;
    }

    public static /* synthetic */ VirtualChallanProceedingModel copy$default(VirtualChallanProceedingModel virtualChallanProceedingModel, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = virtualChallanProceedingModel.challan_no;
        }
        if ((i & 2) != 0) {
            str2 = virtualChallanProceedingModel.party_name;
        }
        if ((i & 4) != 0) {
            str3 = virtualChallanProceedingModel.date_of_proceeding;
        }
        if ((i & 8) != 0) {
            str4 = virtualChallanProceedingModel.fine_imposed;
        }
        return virtualChallanProceedingModel.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChallan_no() {
        return this.challan_no;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getParty_name() {
        return this.party_name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDate_of_proceeding() {
        return this.date_of_proceeding;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFine_imposed() {
        return this.fine_imposed;
    }

    public final VirtualChallanProceedingModel copy(String challan_no, String party_name, String date_of_proceeding, String fine_imposed) {
        Intrinsics.checkNotNullParameter(challan_no, "challan_no");
        Intrinsics.checkNotNullParameter(party_name, "party_name");
        Intrinsics.checkNotNullParameter(date_of_proceeding, "date_of_proceeding");
        Intrinsics.checkNotNullParameter(fine_imposed, "fine_imposed");
        return new VirtualChallanProceedingModel(challan_no, party_name, date_of_proceeding, fine_imposed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VirtualChallanProceedingModel)) {
            return false;
        }
        VirtualChallanProceedingModel virtualChallanProceedingModel = (VirtualChallanProceedingModel) other;
        return Intrinsics.areEqual(this.challan_no, virtualChallanProceedingModel.challan_no) && Intrinsics.areEqual(this.party_name, virtualChallanProceedingModel.party_name) && Intrinsics.areEqual(this.date_of_proceeding, virtualChallanProceedingModel.date_of_proceeding) && Intrinsics.areEqual(this.fine_imposed, virtualChallanProceedingModel.fine_imposed);
    }

    public final String getChallan_no() {
        return this.challan_no;
    }

    public final String getDate_of_proceeding() {
        return this.date_of_proceeding;
    }

    public final String getFine_imposed() {
        return this.fine_imposed;
    }

    public final String getParty_name() {
        return this.party_name;
    }

    public int hashCode() {
        return (((((this.challan_no.hashCode() * 31) + this.party_name.hashCode()) * 31) + this.date_of_proceeding.hashCode()) * 31) + this.fine_imposed.hashCode();
    }

    public String toString() {
        return "VirtualChallanProceedingModel(challan_no=" + this.challan_no + ", party_name=" + this.party_name + ", date_of_proceeding=" + this.date_of_proceeding + ", fine_imposed=" + this.fine_imposed + ')';
    }
}
