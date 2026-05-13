package com.nic.mparivahan.Citizen.Models;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u0019\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J7\u0010\u0012\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/nic/mparivahan/Citizen/Models/ComplaintList;", "", "citizenViolations", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/Citizen/Models/MparCitizenViolationX;", "Lkotlin/collections/ArrayList;", "statusCode", "", "statusDesc", "(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V", "getCitizenViolations", "()Ljava/util/ArrayList;", "getStatusCode", "()Ljava/lang/String;", "getStatusDesc", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ComplaintList {
    private final ArrayList<MparCitizenViolationX> citizenViolations;
    private final String statusCode;
    private final String statusDesc;

    public ComplaintList(ArrayList<MparCitizenViolationX> citizenViolations, String statusCode, String statusDesc) {
        Intrinsics.checkNotNullParameter(citizenViolations, "citizenViolations");
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        this.citizenViolations = citizenViolations;
        this.statusCode = statusCode;
        this.statusDesc = statusDesc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ComplaintList copy$default(ComplaintList complaintList, ArrayList arrayList, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = complaintList.citizenViolations;
        }
        if ((i & 2) != 0) {
            str = complaintList.statusCode;
        }
        if ((i & 4) != 0) {
            str2 = complaintList.statusDesc;
        }
        return complaintList.copy(arrayList, str, str2);
    }

    public final ArrayList<MparCitizenViolationX> component1() {
        return this.citizenViolations;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatusCode() {
        return this.statusCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final ComplaintList copy(ArrayList<MparCitizenViolationX> citizenViolations, String statusCode, String statusDesc) {
        Intrinsics.checkNotNullParameter(citizenViolations, "citizenViolations");
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        return new ComplaintList(citizenViolations, statusCode, statusDesc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComplaintList)) {
            return false;
        }
        ComplaintList complaintList = (ComplaintList) other;
        return Intrinsics.areEqual(this.citizenViolations, complaintList.citizenViolations) && Intrinsics.areEqual(this.statusCode, complaintList.statusCode) && Intrinsics.areEqual(this.statusDesc, complaintList.statusDesc);
    }

    public final ArrayList<MparCitizenViolationX> getCitizenViolations() {
        return this.citizenViolations;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (((this.citizenViolations.hashCode() * 31) + this.statusCode.hashCode()) * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "ComplaintList(citizenViolations=" + this.citizenViolations + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
