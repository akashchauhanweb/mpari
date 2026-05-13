package com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileUpdateModel;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0003J7\u0010\u0012\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/nic/mparivahan/VahanServices/updateMobileNo/UpdateMobileNumber/MobileUpdateModel/Data;", "", "ownerDetailEntity", "", "Lcom/nic/mparivahan/VahanServices/updateMobileNo/UpdateMobileNumber/MobileUpdateModel/OwnerDetailEntity;", "renderAdharDtls", "", "vtOwnerIdentitificationEntity", "Lcom/nic/mparivahan/VahanServices/updateMobileNo/UpdateMobileNumber/MobileUpdateModel/VtOwnerIdentitificationEntity;", "(Ljava/util/List;ZLjava/util/List;)V", "getOwnerDetailEntity", "()Ljava/util/List;", "getRenderAdharDtls", "()Z", "getVtOwnerIdentitificationEntity", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Data {
    private final List<OwnerDetailEntity> ownerDetailEntity;
    private final boolean renderAdharDtls;
    private final List<VtOwnerIdentitificationEntity> vtOwnerIdentitificationEntity;

    public Data(List<OwnerDetailEntity> list, boolean z, List<VtOwnerIdentitificationEntity> list2) {
        this.ownerDetailEntity = list;
        this.renderAdharDtls = z;
        this.vtOwnerIdentitificationEntity = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Data copy$default(Data data, List list, boolean z, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = data.ownerDetailEntity;
        }
        if ((i & 2) != 0) {
            z = data.renderAdharDtls;
        }
        if ((i & 4) != 0) {
            list2 = data.vtOwnerIdentitificationEntity;
        }
        return data.copy(list, z, list2);
    }

    public final List<OwnerDetailEntity> component1() {
        return this.ownerDetailEntity;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getRenderAdharDtls() {
        return this.renderAdharDtls;
    }

    public final List<VtOwnerIdentitificationEntity> component3() {
        return this.vtOwnerIdentitificationEntity;
    }

    public final Data copy(List<OwnerDetailEntity> ownerDetailEntity, boolean renderAdharDtls, List<VtOwnerIdentitificationEntity> vtOwnerIdentitificationEntity) {
        return new Data(ownerDetailEntity, renderAdharDtls, vtOwnerIdentitificationEntity);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Data)) {
            return false;
        }
        Data data = (Data) other;
        return Intrinsics.areEqual(this.ownerDetailEntity, data.ownerDetailEntity) && this.renderAdharDtls == data.renderAdharDtls && Intrinsics.areEqual(this.vtOwnerIdentitificationEntity, data.vtOwnerIdentitificationEntity);
    }

    public final List<OwnerDetailEntity> getOwnerDetailEntity() {
        return this.ownerDetailEntity;
    }

    public final boolean getRenderAdharDtls() {
        return this.renderAdharDtls;
    }

    public final List<VtOwnerIdentitificationEntity> getVtOwnerIdentitificationEntity() {
        return this.vtOwnerIdentitificationEntity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        List<OwnerDetailEntity> list = this.ownerDetailEntity;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        boolean z = this.renderAdharDtls;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (iHashCode + r2) * 31;
        List<VtOwnerIdentitificationEntity> list2 = this.vtOwnerIdentitificationEntity;
        return i + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "Data(ownerDetailEntity=" + this.ownerDetailEntity + ", renderAdharDtls=" + this.renderAdharDtls + ", vtOwnerIdentitificationEntity=" + this.vtOwnerIdentitificationEntity + ')';
    }
}
