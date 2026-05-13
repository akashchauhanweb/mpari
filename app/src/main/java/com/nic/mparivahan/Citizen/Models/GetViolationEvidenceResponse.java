package com.nic.mparivahan.Citizen.Models;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bHÆ\u0003J7\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bHÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R!\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/nic/mparivahan/Citizen/Models/GetViolationEvidenceResponse;", "", "statusCode", "", "statusDesc", "evidences", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/Citizen/Models/VoilationEvidenceModel;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "getEvidences", "()Ljava/util/ArrayList;", "getStatusCode", "()Ljava/lang/String;", "getStatusDesc", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class GetViolationEvidenceResponse {
    private final ArrayList<VoilationEvidenceModel> evidences;
    private final String statusCode;
    private final String statusDesc;

    public GetViolationEvidenceResponse(String statusCode, String statusDesc, ArrayList<VoilationEvidenceModel> evidences) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        Intrinsics.checkNotNullParameter(evidences, "evidences");
        this.statusCode = statusCode;
        this.statusDesc = statusDesc;
        this.evidences = evidences;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetViolationEvidenceResponse copy$default(GetViolationEvidenceResponse getViolationEvidenceResponse, String str, String str2, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getViolationEvidenceResponse.statusCode;
        }
        if ((i & 2) != 0) {
            str2 = getViolationEvidenceResponse.statusDesc;
        }
        if ((i & 4) != 0) {
            arrayList = getViolationEvidenceResponse.evidences;
        }
        return getViolationEvidenceResponse.copy(str, str2, arrayList);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatusCode() {
        return this.statusCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final ArrayList<VoilationEvidenceModel> component3() {
        return this.evidences;
    }

    public final GetViolationEvidenceResponse copy(String statusCode, String statusDesc, ArrayList<VoilationEvidenceModel> evidences) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        Intrinsics.checkNotNullParameter(evidences, "evidences");
        return new GetViolationEvidenceResponse(statusCode, statusDesc, evidences);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetViolationEvidenceResponse)) {
            return false;
        }
        GetViolationEvidenceResponse getViolationEvidenceResponse = (GetViolationEvidenceResponse) other;
        return Intrinsics.areEqual(this.statusCode, getViolationEvidenceResponse.statusCode) && Intrinsics.areEqual(this.statusDesc, getViolationEvidenceResponse.statusDesc) && Intrinsics.areEqual(this.evidences, getViolationEvidenceResponse.evidences);
    }

    public final ArrayList<VoilationEvidenceModel> getEvidences() {
        return this.evidences;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (((this.statusCode.hashCode() * 31) + this.statusDesc.hashCode()) * 31) + this.evidences.hashCode();
    }

    public String toString() {
        return "GetViolationEvidenceResponse(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ", evidences=" + this.evidences + ')';
    }
}
