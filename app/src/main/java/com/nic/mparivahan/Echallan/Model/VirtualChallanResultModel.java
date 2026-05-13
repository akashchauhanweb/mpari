package com.nic.mparivahan.Echallan.Model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\t\u0010\"\u001a\u00020\rHÆ\u0003JY\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006*"}, d2 = {"Lcom/nic/mparivahan/Echallan/Model/VirtualChallanResultModel;", "", "challan_no", "", "amount", "court_name", "court_address", "forword_date", "proceeding_data", "Lcom/nic/mparivahan/Echallan/Model/VirtualChallanProceedingModel;", "contested_data", "Lcom/nic/mparivahan/Echallan/Model/ContestedDataModel;", "transferred_to_court_data", "Lcom/nic/mparivahan/Echallan/Model/TransferredCourtDataModel;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/Echallan/Model/VirtualChallanProceedingModel;Lcom/nic/mparivahan/Echallan/Model/ContestedDataModel;Lcom/nic/mparivahan/Echallan/Model/TransferredCourtDataModel;)V", "getAmount", "()Ljava/lang/String;", "getChallan_no", "getContested_data", "()Lcom/nic/mparivahan/Echallan/Model/ContestedDataModel;", "getCourt_address", "getCourt_name", "getForword_date", "getProceeding_data", "()Lcom/nic/mparivahan/Echallan/Model/VirtualChallanProceedingModel;", "getTransferred_to_court_data", "()Lcom/nic/mparivahan/Echallan/Model/TransferredCourtDataModel;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class VirtualChallanResultModel {
    private final String amount;
    private final String challan_no;
    private final ContestedDataModel contested_data;
    private final String court_address;
    private final String court_name;
    private final String forword_date;
    private final VirtualChallanProceedingModel proceeding_data;
    private final TransferredCourtDataModel transferred_to_court_data;

    public VirtualChallanResultModel(String challan_no, String amount, String court_name, String court_address, String forword_date, VirtualChallanProceedingModel proceeding_data, ContestedDataModel contested_data, TransferredCourtDataModel transferred_to_court_data) {
        Intrinsics.checkNotNullParameter(challan_no, "challan_no");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(court_name, "court_name");
        Intrinsics.checkNotNullParameter(court_address, "court_address");
        Intrinsics.checkNotNullParameter(forword_date, "forword_date");
        Intrinsics.checkNotNullParameter(proceeding_data, "proceeding_data");
        Intrinsics.checkNotNullParameter(contested_data, "contested_data");
        Intrinsics.checkNotNullParameter(transferred_to_court_data, "transferred_to_court_data");
        this.challan_no = challan_no;
        this.amount = amount;
        this.court_name = court_name;
        this.court_address = court_address;
        this.forword_date = forword_date;
        this.proceeding_data = proceeding_data;
        this.contested_data = contested_data;
        this.transferred_to_court_data = transferred_to_court_data;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChallan_no() {
        return this.challan_no;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCourt_name() {
        return this.court_name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCourt_address() {
        return this.court_address;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getForword_date() {
        return this.forword_date;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final VirtualChallanProceedingModel getProceeding_data() {
        return this.proceeding_data;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ContestedDataModel getContested_data() {
        return this.contested_data;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final TransferredCourtDataModel getTransferred_to_court_data() {
        return this.transferred_to_court_data;
    }

    public final VirtualChallanResultModel copy(String challan_no, String amount, String court_name, String court_address, String forword_date, VirtualChallanProceedingModel proceeding_data, ContestedDataModel contested_data, TransferredCourtDataModel transferred_to_court_data) {
        Intrinsics.checkNotNullParameter(challan_no, "challan_no");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(court_name, "court_name");
        Intrinsics.checkNotNullParameter(court_address, "court_address");
        Intrinsics.checkNotNullParameter(forword_date, "forword_date");
        Intrinsics.checkNotNullParameter(proceeding_data, "proceeding_data");
        Intrinsics.checkNotNullParameter(contested_data, "contested_data");
        Intrinsics.checkNotNullParameter(transferred_to_court_data, "transferred_to_court_data");
        return new VirtualChallanResultModel(challan_no, amount, court_name, court_address, forword_date, proceeding_data, contested_data, transferred_to_court_data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VirtualChallanResultModel)) {
            return false;
        }
        VirtualChallanResultModel virtualChallanResultModel = (VirtualChallanResultModel) other;
        return Intrinsics.areEqual(this.challan_no, virtualChallanResultModel.challan_no) && Intrinsics.areEqual(this.amount, virtualChallanResultModel.amount) && Intrinsics.areEqual(this.court_name, virtualChallanResultModel.court_name) && Intrinsics.areEqual(this.court_address, virtualChallanResultModel.court_address) && Intrinsics.areEqual(this.forword_date, virtualChallanResultModel.forword_date) && Intrinsics.areEqual(this.proceeding_data, virtualChallanResultModel.proceeding_data) && Intrinsics.areEqual(this.contested_data, virtualChallanResultModel.contested_data) && Intrinsics.areEqual(this.transferred_to_court_data, virtualChallanResultModel.transferred_to_court_data);
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getChallan_no() {
        return this.challan_no;
    }

    public final ContestedDataModel getContested_data() {
        return this.contested_data;
    }

    public final String getCourt_address() {
        return this.court_address;
    }

    public final String getCourt_name() {
        return this.court_name;
    }

    public final String getForword_date() {
        return this.forword_date;
    }

    public final VirtualChallanProceedingModel getProceeding_data() {
        return this.proceeding_data;
    }

    public final TransferredCourtDataModel getTransferred_to_court_data() {
        return this.transferred_to_court_data;
    }

    public int hashCode() {
        return (((((((((((((this.challan_no.hashCode() * 31) + this.amount.hashCode()) * 31) + this.court_name.hashCode()) * 31) + this.court_address.hashCode()) * 31) + this.forword_date.hashCode()) * 31) + this.proceeding_data.hashCode()) * 31) + this.contested_data.hashCode()) * 31) + this.transferred_to_court_data.hashCode();
    }

    public String toString() {
        return "VirtualChallanResultModel(challan_no=" + this.challan_no + ", amount=" + this.amount + ", court_name=" + this.court_name + ", court_address=" + this.court_address + ", forword_date=" + this.forword_date + ", proceeding_data=" + this.proceeding_data + ", contested_data=" + this.contested_data + ", transferred_to_court_data=" + this.transferred_to_court_data + ')';
    }
}
