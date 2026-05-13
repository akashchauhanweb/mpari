package com.nic.mparivahan.LLServices.GetLlPojo;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001f"}, d2 = {"Lcom/nic/mparivahan/LLServices/GetLlPojo/LlstoDisplayMap;", "Ljava/io/Serializable;", "covs", "", "equivalentCovs", "expiresOn", "issueDate", "llNumber", "oldLLNumber", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCovs", "()Ljava/lang/String;", "getEquivalentCovs", "getExpiresOn", "getIssueDate", "getLlNumber", "getOldLLNumber", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class LlstoDisplayMap implements Serializable {
    private final String covs;
    private final String equivalentCovs;
    private final String expiresOn;
    private final String issueDate;
    private final String llNumber;
    private final String oldLLNumber;

    public LlstoDisplayMap(String covs, String equivalentCovs, String expiresOn, String issueDate, String llNumber, String oldLLNumber) {
        Intrinsics.checkNotNullParameter(covs, "covs");
        Intrinsics.checkNotNullParameter(equivalentCovs, "equivalentCovs");
        Intrinsics.checkNotNullParameter(expiresOn, "expiresOn");
        Intrinsics.checkNotNullParameter(issueDate, "issueDate");
        Intrinsics.checkNotNullParameter(llNumber, "llNumber");
        Intrinsics.checkNotNullParameter(oldLLNumber, "oldLLNumber");
        this.covs = covs;
        this.equivalentCovs = equivalentCovs;
        this.expiresOn = expiresOn;
        this.issueDate = issueDate;
        this.llNumber = llNumber;
        this.oldLLNumber = oldLLNumber;
    }

    public static /* synthetic */ LlstoDisplayMap copy$default(LlstoDisplayMap llstoDisplayMap, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = llstoDisplayMap.covs;
        }
        if ((i & 2) != 0) {
            str2 = llstoDisplayMap.equivalentCovs;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = llstoDisplayMap.expiresOn;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = llstoDisplayMap.issueDate;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = llstoDisplayMap.llNumber;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = llstoDisplayMap.oldLLNumber;
        }
        return llstoDisplayMap.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCovs() {
        return this.covs;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEquivalentCovs() {
        return this.equivalentCovs;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getExpiresOn() {
        return this.expiresOn;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIssueDate() {
        return this.issueDate;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLlNumber() {
        return this.llNumber;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOldLLNumber() {
        return this.oldLLNumber;
    }

    public final LlstoDisplayMap copy(String covs, String equivalentCovs, String expiresOn, String issueDate, String llNumber, String oldLLNumber) {
        Intrinsics.checkNotNullParameter(covs, "covs");
        Intrinsics.checkNotNullParameter(equivalentCovs, "equivalentCovs");
        Intrinsics.checkNotNullParameter(expiresOn, "expiresOn");
        Intrinsics.checkNotNullParameter(issueDate, "issueDate");
        Intrinsics.checkNotNullParameter(llNumber, "llNumber");
        Intrinsics.checkNotNullParameter(oldLLNumber, "oldLLNumber");
        return new LlstoDisplayMap(covs, equivalentCovs, expiresOn, issueDate, llNumber, oldLLNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LlstoDisplayMap)) {
            return false;
        }
        LlstoDisplayMap llstoDisplayMap = (LlstoDisplayMap) other;
        return Intrinsics.areEqual(this.covs, llstoDisplayMap.covs) && Intrinsics.areEqual(this.equivalentCovs, llstoDisplayMap.equivalentCovs) && Intrinsics.areEqual(this.expiresOn, llstoDisplayMap.expiresOn) && Intrinsics.areEqual(this.issueDate, llstoDisplayMap.issueDate) && Intrinsics.areEqual(this.llNumber, llstoDisplayMap.llNumber) && Intrinsics.areEqual(this.oldLLNumber, llstoDisplayMap.oldLLNumber);
    }

    public final String getCovs() {
        return this.covs;
    }

    public final String getEquivalentCovs() {
        return this.equivalentCovs;
    }

    public final String getExpiresOn() {
        return this.expiresOn;
    }

    public final String getIssueDate() {
        return this.issueDate;
    }

    public final String getLlNumber() {
        return this.llNumber;
    }

    public final String getOldLLNumber() {
        return this.oldLLNumber;
    }

    public int hashCode() {
        return (((((((((this.covs.hashCode() * 31) + this.equivalentCovs.hashCode()) * 31) + this.expiresOn.hashCode()) * 31) + this.issueDate.hashCode()) * 31) + this.llNumber.hashCode()) * 31) + this.oldLLNumber.hashCode();
    }

    public String toString() {
        return "LlstoDisplayMap(covs=" + this.covs + ", equivalentCovs=" + this.equivalentCovs + ", expiresOn=" + this.expiresOn + ", issueDate=" + this.issueDate + ", llNumber=" + this.llNumber + ", oldLLNumber=" + this.oldLLNumber + ')';
    }
}
