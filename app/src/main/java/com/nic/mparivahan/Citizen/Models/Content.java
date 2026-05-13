package com.nic.mparivahan.Citizen.Models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/nic/mparivahan/Citizen/Models/Content;", "", "recordCount", "", "recordName", "", "recordType", "(ILjava/lang/String;I)V", "getRecordCount", "()I", "getRecordName", "()Ljava/lang/String;", "getRecordType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Content {
    private final int recordCount;
    private final String recordName;
    private final int recordType;

    public Content(int i, String recordName, int i2) {
        Intrinsics.checkNotNullParameter(recordName, "recordName");
        this.recordCount = i;
        this.recordName = recordName;
        this.recordType = i2;
    }

    public static /* synthetic */ Content copy$default(Content content, int i, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = content.recordCount;
        }
        if ((i3 & 2) != 0) {
            str = content.recordName;
        }
        if ((i3 & 4) != 0) {
            i2 = content.recordType;
        }
        return content.copy(i, str, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRecordCount() {
        return this.recordCount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRecordName() {
        return this.recordName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getRecordType() {
        return this.recordType;
    }

    public final Content copy(int recordCount, String recordName, int recordType) {
        Intrinsics.checkNotNullParameter(recordName, "recordName");
        return new Content(recordCount, recordName, recordType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Content)) {
            return false;
        }
        Content content = (Content) other;
        return this.recordCount == content.recordCount && Intrinsics.areEqual(this.recordName, content.recordName) && this.recordType == content.recordType;
    }

    public final int getRecordCount() {
        return this.recordCount;
    }

    public final String getRecordName() {
        return this.recordName;
    }

    public final int getRecordType() {
        return this.recordType;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.recordCount) * 31) + this.recordName.hashCode()) * 31) + Integer.hashCode(this.recordType);
    }

    public String toString() {
        return "Content(recordCount=" + this.recordCount + ", recordName=" + this.recordName + ", recordType=" + this.recordType + ')';
    }
}
