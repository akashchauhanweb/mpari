package com.nic.mparivahan.LLServices.GetLlPojo;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/nic/mparivahan/LLServices/GetLlPojo/RelationType;", "Ljava/io/Serializable;", "relationCode", "", "relationDesc", "(Ljava/lang/String;Ljava/lang/String;)V", "getRelationCode", "()Ljava/lang/String;", "getRelationDesc", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class RelationType implements Serializable {
    private final String relationCode;
    private final String relationDesc;

    public RelationType(String relationCode, String relationDesc) {
        Intrinsics.checkNotNullParameter(relationCode, "relationCode");
        Intrinsics.checkNotNullParameter(relationDesc, "relationDesc");
        this.relationCode = relationCode;
        this.relationDesc = relationDesc;
    }

    public static /* synthetic */ RelationType copy$default(RelationType relationType, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = relationType.relationCode;
        }
        if ((i & 2) != 0) {
            str2 = relationType.relationDesc;
        }
        return relationType.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRelationCode() {
        return this.relationCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRelationDesc() {
        return this.relationDesc;
    }

    public final RelationType copy(String relationCode, String relationDesc) {
        Intrinsics.checkNotNullParameter(relationCode, "relationCode");
        Intrinsics.checkNotNullParameter(relationDesc, "relationDesc");
        return new RelationType(relationCode, relationDesc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RelationType)) {
            return false;
        }
        RelationType relationType = (RelationType) other;
        return Intrinsics.areEqual(this.relationCode, relationType.relationCode) && Intrinsics.areEqual(this.relationDesc, relationType.relationDesc);
    }

    public final String getRelationCode() {
        return this.relationCode;
    }

    public final String getRelationDesc() {
        return this.relationDesc;
    }

    public int hashCode() {
        return (this.relationCode.hashCode() * 31) + this.relationDesc.hashCode();
    }

    public String toString() {
        return "RelationType(relationCode=" + this.relationCode + ", relationDesc=" + this.relationDesc + ')';
    }
}
