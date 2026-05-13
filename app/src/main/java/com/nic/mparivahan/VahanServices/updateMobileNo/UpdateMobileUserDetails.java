package com.nic.mparivahan.VahanServices.updateMobileNo;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0005j\b\u0012\u0004\u0012\u00020\t`\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\rJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0003J\u0019\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\t0\u0005j\b\u0012\u0004\u0012\u00020\t`\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003J_\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0005j\b\u0012\u0004\u0012\u00020\t`\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010$\u001a\u00020\u00032\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u000bHÖ\u0001R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R*\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR*\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0005j\b\u0012\u0004\u0012\u00020\t`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017¨\u0006)"}, d2 = {"Lcom/nic/mparivahan/VahanServices/updateMobileNo/UpdateMobileUserDetails;", "", "renderAdharDtls", "", "ownerDetailEntity", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/VahanServices/updateMobileNo/UpdateMobileOwnerDetailsModel;", "Lkotlin/collections/ArrayList;", "vtOwnerIdentitificationEntity", "Lcom/nic/mparivahan/VahanServices/updateMobileNo/UpdateMobileOwnerIdentityModel;", "errorcode", "", "errorDesc", "(ZLjava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V", "getErrorDesc", "()Ljava/lang/String;", "setErrorDesc", "(Ljava/lang/String;)V", "getErrorcode", "setErrorcode", "getOwnerDetailEntity", "()Ljava/util/ArrayList;", "setOwnerDetailEntity", "(Ljava/util/ArrayList;)V", "getRenderAdharDtls", "()Z", "setRenderAdharDtls", "(Z)V", "getVtOwnerIdentitificationEntity", "setVtOwnerIdentitificationEntity", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class UpdateMobileUserDetails {
    private String errorDesc;
    private String errorcode;
    private ArrayList<UpdateMobileOwnerDetailsModel> ownerDetailEntity;
    private boolean renderAdharDtls;
    private ArrayList<UpdateMobileOwnerIdentityModel> vtOwnerIdentitificationEntity;

    public UpdateMobileUserDetails(boolean z, ArrayList<UpdateMobileOwnerDetailsModel> ownerDetailEntity, ArrayList<UpdateMobileOwnerIdentityModel> vtOwnerIdentitificationEntity, String str, String str2) {
        Intrinsics.checkNotNullParameter(ownerDetailEntity, "ownerDetailEntity");
        Intrinsics.checkNotNullParameter(vtOwnerIdentitificationEntity, "vtOwnerIdentitificationEntity");
        this.renderAdharDtls = z;
        this.ownerDetailEntity = ownerDetailEntity;
        this.vtOwnerIdentitificationEntity = vtOwnerIdentitificationEntity;
        this.errorcode = str;
        this.errorDesc = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpdateMobileUserDetails copy$default(UpdateMobileUserDetails updateMobileUserDetails, boolean z, ArrayList arrayList, ArrayList arrayList2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = updateMobileUserDetails.renderAdharDtls;
        }
        if ((i & 2) != 0) {
            arrayList = updateMobileUserDetails.ownerDetailEntity;
        }
        ArrayList arrayList3 = arrayList;
        if ((i & 4) != 0) {
            arrayList2 = updateMobileUserDetails.vtOwnerIdentitificationEntity;
        }
        ArrayList arrayList4 = arrayList2;
        if ((i & 8) != 0) {
            str = updateMobileUserDetails.errorcode;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            str2 = updateMobileUserDetails.errorDesc;
        }
        return updateMobileUserDetails.copy(z, arrayList3, arrayList4, str3, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getRenderAdharDtls() {
        return this.renderAdharDtls;
    }

    public final ArrayList<UpdateMobileOwnerDetailsModel> component2() {
        return this.ownerDetailEntity;
    }

    public final ArrayList<UpdateMobileOwnerIdentityModel> component3() {
        return this.vtOwnerIdentitificationEntity;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getErrorcode() {
        return this.errorcode;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getErrorDesc() {
        return this.errorDesc;
    }

    public final UpdateMobileUserDetails copy(boolean renderAdharDtls, ArrayList<UpdateMobileOwnerDetailsModel> ownerDetailEntity, ArrayList<UpdateMobileOwnerIdentityModel> vtOwnerIdentitificationEntity, String errorcode, String errorDesc) {
        Intrinsics.checkNotNullParameter(ownerDetailEntity, "ownerDetailEntity");
        Intrinsics.checkNotNullParameter(vtOwnerIdentitificationEntity, "vtOwnerIdentitificationEntity");
        return new UpdateMobileUserDetails(renderAdharDtls, ownerDetailEntity, vtOwnerIdentitificationEntity, errorcode, errorDesc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateMobileUserDetails)) {
            return false;
        }
        UpdateMobileUserDetails updateMobileUserDetails = (UpdateMobileUserDetails) other;
        return this.renderAdharDtls == updateMobileUserDetails.renderAdharDtls && Intrinsics.areEqual(this.ownerDetailEntity, updateMobileUserDetails.ownerDetailEntity) && Intrinsics.areEqual(this.vtOwnerIdentitificationEntity, updateMobileUserDetails.vtOwnerIdentitificationEntity) && Intrinsics.areEqual(this.errorcode, updateMobileUserDetails.errorcode) && Intrinsics.areEqual(this.errorDesc, updateMobileUserDetails.errorDesc);
    }

    public final String getErrorDesc() {
        return this.errorDesc;
    }

    public final String getErrorcode() {
        return this.errorcode;
    }

    public final ArrayList<UpdateMobileOwnerDetailsModel> getOwnerDetailEntity() {
        return this.ownerDetailEntity;
    }

    public final boolean getRenderAdharDtls() {
        return this.renderAdharDtls;
    }

    public final ArrayList<UpdateMobileOwnerIdentityModel> getVtOwnerIdentitificationEntity() {
        return this.vtOwnerIdentitificationEntity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    public int hashCode() {
        boolean z = this.renderAdharDtls;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int iHashCode = ((((r0 * 31) + this.ownerDetailEntity.hashCode()) * 31) + this.vtOwnerIdentitificationEntity.hashCode()) * 31;
        String str = this.errorcode;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorDesc;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setErrorDesc(String str) {
        this.errorDesc = str;
    }

    public final void setErrorcode(String str) {
        this.errorcode = str;
    }

    public final void setOwnerDetailEntity(ArrayList<UpdateMobileOwnerDetailsModel> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.ownerDetailEntity = arrayList;
    }

    public final void setRenderAdharDtls(boolean z) {
        this.renderAdharDtls = z;
    }

    public final void setVtOwnerIdentitificationEntity(ArrayList<UpdateMobileOwnerIdentityModel> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.vtOwnerIdentitificationEntity = arrayList;
    }

    public String toString() {
        return "UpdateMobileUserDetails(renderAdharDtls=" + this.renderAdharDtls + ", ownerDetailEntity=" + this.ownerDetailEntity + ", vtOwnerIdentitificationEntity=" + this.vtOwnerIdentitificationEntity + ", errorcode=" + this.errorcode + ", errorDesc=" + this.errorDesc + ')';
    }
}
