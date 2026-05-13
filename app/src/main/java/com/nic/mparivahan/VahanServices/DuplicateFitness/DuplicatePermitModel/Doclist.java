package com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicatePermitModel/Doclist;", "Ljava/io/Serializable;", "descr", "", "docId", "(Ljava/lang/String;Ljava/lang/String;)V", "getDescr", "()Ljava/lang/String;", "getDocId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Doclist implements Serializable {
    private final String descr;
    private final String docId;

    public Doclist(String descr, String docId) {
        Intrinsics.checkNotNullParameter(descr, "descr");
        Intrinsics.checkNotNullParameter(docId, "docId");
        this.descr = descr;
        this.docId = docId;
    }

    public static /* synthetic */ Doclist copy$default(Doclist doclist, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = doclist.descr;
        }
        if ((i & 2) != 0) {
            str2 = doclist.docId;
        }
        return doclist.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDescr() {
        return this.descr;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDocId() {
        return this.docId;
    }

    public final Doclist copy(String descr, String docId) {
        Intrinsics.checkNotNullParameter(descr, "descr");
        Intrinsics.checkNotNullParameter(docId, "docId");
        return new Doclist(descr, docId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Doclist)) {
            return false;
        }
        Doclist doclist = (Doclist) other;
        return Intrinsics.areEqual(this.descr, doclist.descr) && Intrinsics.areEqual(this.docId, doclist.docId);
    }

    public final String getDescr() {
        return this.descr;
    }

    public final String getDocId() {
        return this.docId;
    }

    public int hashCode() {
        return (this.descr.hashCode() * 31) + this.docId.hashCode();
    }

    public String toString() {
        return "Doclist(descr=" + this.descr + ", docId=" + this.docId + ')';
    }
}
