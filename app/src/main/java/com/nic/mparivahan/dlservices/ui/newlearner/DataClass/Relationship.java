package com.nic.mparivahan.dlservices.ui.newlearner.DataClass;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/newlearner/DataClass/Relationship;", "", "relationCode", "", "relationName", "(Ljava/lang/String;Ljava/lang/String;)V", "getRelationCode", "()Ljava/lang/String;", "setRelationCode", "(Ljava/lang/String;)V", "getRelationName", "setRelationName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Relationship {
    private String relationCode;
    private String relationName;

    public Relationship() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Relationship copy$default(Relationship relationship, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = relationship.relationCode;
        }
        if ((i & 2) != 0) {
            str2 = relationship.relationName;
        }
        return relationship.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRelationCode() {
        return this.relationCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRelationName() {
        return this.relationName;
    }

    public final Relationship copy(String relationCode, String relationName) {
        Intrinsics.checkNotNullParameter(relationCode, "relationCode");
        Intrinsics.checkNotNullParameter(relationName, "relationName");
        return new Relationship(relationCode, relationName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Relationship)) {
            return false;
        }
        Relationship relationship = (Relationship) other;
        return Intrinsics.areEqual(this.relationCode, relationship.relationCode) && Intrinsics.areEqual(this.relationName, relationship.relationName);
    }

    public final String getRelationCode() {
        return this.relationCode;
    }

    public final String getRelationName() {
        return this.relationName;
    }

    public int hashCode() {
        return (this.relationCode.hashCode() * 31) + this.relationName.hashCode();
    }

    public final void setRelationCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.relationCode = str;
    }

    public final void setRelationName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.relationName = str;
    }

    public String toString() {
        return "Relationship(relationCode=" + this.relationCode + ", relationName=" + this.relationName + ')';
    }

    public Relationship(String relationCode, String relationName) {
        Intrinsics.checkNotNullParameter(relationCode, "relationCode");
        Intrinsics.checkNotNullParameter(relationName, "relationName");
        this.relationCode = relationCode;
        this.relationName = relationName;
    }

    public /* synthetic */ Relationship(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
