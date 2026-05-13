package com.nic.mparivahan.Sos.SModle;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/nic/mparivahan/Sos/SModle/MparRelation;", "", "relId", "", "relName", "", "relStatus", "(ILjava/lang/String;I)V", "getRelId", "()I", "getRelName", "()Ljava/lang/String;", "getRelStatus", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class MparRelation {
    private final int relId;
    private final String relName;
    private final int relStatus;

    public MparRelation(int i, String relName, int i2) {
        Intrinsics.checkNotNullParameter(relName, "relName");
        this.relId = i;
        this.relName = relName;
        this.relStatus = i2;
    }

    public static /* synthetic */ MparRelation copy$default(MparRelation mparRelation, int i, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = mparRelation.relId;
        }
        if ((i3 & 2) != 0) {
            str = mparRelation.relName;
        }
        if ((i3 & 4) != 0) {
            i2 = mparRelation.relStatus;
        }
        return mparRelation.copy(i, str, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRelId() {
        return this.relId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRelName() {
        return this.relName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getRelStatus() {
        return this.relStatus;
    }

    public final MparRelation copy(int relId, String relName, int relStatus) {
        Intrinsics.checkNotNullParameter(relName, "relName");
        return new MparRelation(relId, relName, relStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MparRelation)) {
            return false;
        }
        MparRelation mparRelation = (MparRelation) other;
        return this.relId == mparRelation.relId && Intrinsics.areEqual(this.relName, mparRelation.relName) && this.relStatus == mparRelation.relStatus;
    }

    public final int getRelId() {
        return this.relId;
    }

    public final String getRelName() {
        return this.relName;
    }

    public final int getRelStatus() {
        return this.relStatus;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.relId) * 31) + this.relName.hashCode()) * 31) + Integer.hashCode(this.relStatus);
    }

    public String toString() {
        return "MparRelation(relId=" + this.relId + ", relName=" + this.relName + ", relStatus=" + this.relStatus + ')';
    }
}
