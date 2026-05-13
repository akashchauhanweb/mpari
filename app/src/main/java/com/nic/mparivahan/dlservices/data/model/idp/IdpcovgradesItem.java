package com.nic.mparivahan.dlservices.data.model.idp;

import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/idp/IdpcovgradesItem;", "", "idpCovgrdCd", "", "idpcovgrdDesc", "status", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getIdpCovgrdCd", "()Ljava/lang/String;", "getIdpcovgrdDesc", "getStatus", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class IdpcovgradesItem {

    @xy5("IdpCovgrdCd")
    private final String idpCovgrdCd;

    @xy5("IdpcovgrdDesc")
    private final String idpcovgrdDesc;
    private final boolean status;

    public IdpcovgradesItem() {
        this(null, null, false, 7, null);
    }

    public static /* synthetic */ IdpcovgradesItem copy$default(IdpcovgradesItem idpcovgradesItem, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = idpcovgradesItem.idpCovgrdCd;
        }
        if ((i & 2) != 0) {
            str2 = idpcovgradesItem.idpcovgrdDesc;
        }
        if ((i & 4) != 0) {
            z = idpcovgradesItem.status;
        }
        return idpcovgradesItem.copy(str, str2, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIdpCovgrdCd() {
        return this.idpCovgrdCd;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIdpcovgrdDesc() {
        return this.idpcovgrdDesc;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getStatus() {
        return this.status;
    }

    public final IdpcovgradesItem copy(String idpCovgrdCd, String idpcovgrdDesc, boolean status) {
        return new IdpcovgradesItem(idpCovgrdCd, idpcovgrdDesc, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdpcovgradesItem)) {
            return false;
        }
        IdpcovgradesItem idpcovgradesItem = (IdpcovgradesItem) other;
        return Intrinsics.areEqual(this.idpCovgrdCd, idpcovgradesItem.idpCovgrdCd) && Intrinsics.areEqual(this.idpcovgrdDesc, idpcovgradesItem.idpcovgrdDesc) && this.status == idpcovgradesItem.status;
    }

    public final String getIdpCovgrdCd() {
        return this.idpCovgrdCd;
    }

    public final String getIdpcovgrdDesc() {
        return this.idpcovgrdDesc;
    }

    public final boolean getStatus() {
        return this.status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public int hashCode() {
        String str = this.idpCovgrdCd;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.idpcovgrdDesc;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.status;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode2 + r1;
    }

    public String toString() {
        return "IdpcovgradesItem(idpCovgrdCd=" + this.idpCovgrdCd + ", idpcovgrdDesc=" + this.idpcovgrdDesc + ", status=" + this.status + ')';
    }

    public IdpcovgradesItem(String str, String str2, boolean z) {
        this.idpCovgrdCd = str;
        this.idpcovgrdDesc = str2;
        this.status = z;
    }

    public /* synthetic */ IdpcovgradesItem(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z);
    }
}
