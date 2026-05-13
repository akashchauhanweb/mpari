package com.nic.mparivahan.RC.Model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/nic/mparivahan/RC/Model/Document;", "", "nrvDetails", "Lcom/nic/mparivahan/RC/Model/NrvDetails;", "rc", "", "(Lcom/nic/mparivahan/RC/Model/NrvDetails;Ljava/lang/String;)V", "getNrvDetails", "()Lcom/nic/mparivahan/RC/Model/NrvDetails;", "getRc", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Document {
    private final NrvDetails nrvDetails;
    private final String rc;

    public Document(NrvDetails nrvDetails, String rc) {
        Intrinsics.checkNotNullParameter(rc, "rc");
        this.nrvDetails = nrvDetails;
        this.rc = rc;
    }

    public static /* synthetic */ Document copy$default(Document document, NrvDetails nrvDetails, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            nrvDetails = document.nrvDetails;
        }
        if ((i & 2) != 0) {
            str = document.rc;
        }
        return document.copy(nrvDetails, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NrvDetails getNrvDetails() {
        return this.nrvDetails;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRc() {
        return this.rc;
    }

    public final Document copy(NrvDetails nrvDetails, String rc) {
        Intrinsics.checkNotNullParameter(rc, "rc");
        return new Document(nrvDetails, rc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Document)) {
            return false;
        }
        Document document = (Document) other;
        return Intrinsics.areEqual(this.nrvDetails, document.nrvDetails) && Intrinsics.areEqual(this.rc, document.rc);
    }

    public final NrvDetails getNrvDetails() {
        return this.nrvDetails;
    }

    public final String getRc() {
        return this.rc;
    }

    public int hashCode() {
        NrvDetails nrvDetails = this.nrvDetails;
        return ((nrvDetails == null ? 0 : nrvDetails.hashCode()) * 31) + this.rc.hashCode();
    }

    public String toString() {
        return "Document(nrvDetails=" + this.nrvDetails + ", rc=" + this.rc + ')';
    }
}
