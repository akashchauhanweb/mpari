package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JY\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0005HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006&"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/ListOfDisposeApplModel;", "Ljava/io/Serializable;", "transaction_no", "", "pur_cd", "", "regn_no", "application_status", "request_dt", "state_cd", "off_cd", "descr", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getApplication_status", "()Ljava/lang/String;", "getDescr", "getOff_cd", "()I", "getPur_cd", "getRegn_no", "getRequest_dt", "getState_cd", "getTransaction_no", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ListOfDisposeApplModel implements Serializable {
    private final String application_status;
    private final String descr;
    private final int off_cd;
    private final int pur_cd;
    private final String regn_no;
    private final String request_dt;
    private final String state_cd;
    private final String transaction_no;

    public ListOfDisposeApplModel(String transaction_no, int i, String regn_no, String application_status, String request_dt, String state_cd, int i2, String descr) {
        Intrinsics.checkNotNullParameter(transaction_no, "transaction_no");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(application_status, "application_status");
        Intrinsics.checkNotNullParameter(request_dt, "request_dt");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(descr, "descr");
        this.transaction_no = transaction_no;
        this.pur_cd = i;
        this.regn_no = regn_no;
        this.application_status = application_status;
        this.request_dt = request_dt;
        this.state_cd = state_cd;
        this.off_cd = i2;
        this.descr = descr;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTransaction_no() {
        return this.transaction_no;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPur_cd() {
        return this.pur_cd;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRegn_no() {
        return this.regn_no;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getApplication_status() {
        return this.application_status;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRequest_dt() {
        return this.request_dt;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getState_cd() {
        return this.state_cd;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getOff_cd() {
        return this.off_cd;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDescr() {
        return this.descr;
    }

    public final ListOfDisposeApplModel copy(String transaction_no, int pur_cd, String regn_no, String application_status, String request_dt, String state_cd, int off_cd, String descr) {
        Intrinsics.checkNotNullParameter(transaction_no, "transaction_no");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(application_status, "application_status");
        Intrinsics.checkNotNullParameter(request_dt, "request_dt");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(descr, "descr");
        return new ListOfDisposeApplModel(transaction_no, pur_cd, regn_no, application_status, request_dt, state_cd, off_cd, descr);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ListOfDisposeApplModel)) {
            return false;
        }
        ListOfDisposeApplModel listOfDisposeApplModel = (ListOfDisposeApplModel) other;
        return Intrinsics.areEqual(this.transaction_no, listOfDisposeApplModel.transaction_no) && this.pur_cd == listOfDisposeApplModel.pur_cd && Intrinsics.areEqual(this.regn_no, listOfDisposeApplModel.regn_no) && Intrinsics.areEqual(this.application_status, listOfDisposeApplModel.application_status) && Intrinsics.areEqual(this.request_dt, listOfDisposeApplModel.request_dt) && Intrinsics.areEqual(this.state_cd, listOfDisposeApplModel.state_cd) && this.off_cd == listOfDisposeApplModel.off_cd && Intrinsics.areEqual(this.descr, listOfDisposeApplModel.descr);
    }

    public final String getApplication_status() {
        return this.application_status;
    }

    public final String getDescr() {
        return this.descr;
    }

    public final int getOff_cd() {
        return this.off_cd;
    }

    public final int getPur_cd() {
        return this.pur_cd;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final String getRequest_dt() {
        return this.request_dt;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public final String getTransaction_no() {
        return this.transaction_no;
    }

    public int hashCode() {
        return (((((((((((((this.transaction_no.hashCode() * 31) + Integer.hashCode(this.pur_cd)) * 31) + this.regn_no.hashCode()) * 31) + this.application_status.hashCode()) * 31) + this.request_dt.hashCode()) * 31) + this.state_cd.hashCode()) * 31) + Integer.hashCode(this.off_cd)) * 31) + this.descr.hashCode();
    }

    public String toString() {
        return "ListOfDisposeApplModel(transaction_no=" + this.transaction_no + ", pur_cd=" + this.pur_cd + ", regn_no=" + this.regn_no + ", application_status=" + this.application_status + ", request_dt=" + this.request_dt + ", state_cd=" + this.state_cd + ", off_cd=" + this.off_cd + ", descr=" + this.descr + ')';
    }
}
