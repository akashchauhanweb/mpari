package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/DldetobjItem;", "Ljava/io/Serializable;", "errorcd", "", "bioObj", "Lcom/nic/mparivahan/dlservices/data/model/BioObj;", "dlobj", "Lcom/nic/mparivahan/dlservices/data/model/Dlobj;", "erormsg", "", "bioImgObj", "Lcom/nic/mparivahan/dlservices/data/model/BioImgObj;", "(Ljava/lang/String;Lcom/nic/mparivahan/dlservices/data/model/BioObj;Lcom/nic/mparivahan/dlservices/data/model/Dlobj;Ljava/lang/Object;Lcom/nic/mparivahan/dlservices/data/model/BioImgObj;)V", "getBioImgObj", "()Lcom/nic/mparivahan/dlservices/data/model/BioImgObj;", "getBioObj", "()Lcom/nic/mparivahan/dlservices/data/model/BioObj;", "getDlobj", "()Lcom/nic/mparivahan/dlservices/data/model/Dlobj;", "getErormsg", "()Ljava/lang/Object;", "getErrorcd", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DldetobjItem implements Serializable {
    private final BioImgObj bioImgObj;
    private final BioObj bioObj;
    private final Dlobj dlobj;
    private final Object erormsg;
    private final String errorcd;

    public DldetobjItem() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ DldetobjItem copy$default(DldetobjItem dldetobjItem, String str, BioObj bioObj, Dlobj dlobj, Object obj, BioImgObj bioImgObj, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = dldetobjItem.errorcd;
        }
        if ((i & 2) != 0) {
            bioObj = dldetobjItem.bioObj;
        }
        BioObj bioObj2 = bioObj;
        if ((i & 4) != 0) {
            dlobj = dldetobjItem.dlobj;
        }
        Dlobj dlobj2 = dlobj;
        if ((i & 8) != 0) {
            obj = dldetobjItem.erormsg;
        }
        Object obj3 = obj;
        if ((i & 16) != 0) {
            bioImgObj = dldetobjItem.bioImgObj;
        }
        return dldetobjItem.copy(str, bioObj2, dlobj2, obj3, bioImgObj);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getErrorcd() {
        return this.errorcd;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BioObj getBioObj() {
        return this.bioObj;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Dlobj getDlobj() {
        return this.dlobj;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Object getErormsg() {
        return this.erormsg;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BioImgObj getBioImgObj() {
        return this.bioImgObj;
    }

    public final DldetobjItem copy(String errorcd, BioObj bioObj, Dlobj dlobj, Object erormsg, BioImgObj bioImgObj) {
        return new DldetobjItem(errorcd, bioObj, dlobj, erormsg, bioImgObj);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DldetobjItem)) {
            return false;
        }
        DldetobjItem dldetobjItem = (DldetobjItem) other;
        return Intrinsics.areEqual(this.errorcd, dldetobjItem.errorcd) && Intrinsics.areEqual(this.bioObj, dldetobjItem.bioObj) && Intrinsics.areEqual(this.dlobj, dldetobjItem.dlobj) && Intrinsics.areEqual(this.erormsg, dldetobjItem.erormsg) && Intrinsics.areEqual(this.bioImgObj, dldetobjItem.bioImgObj);
    }

    public final BioImgObj getBioImgObj() {
        return this.bioImgObj;
    }

    public final BioObj getBioObj() {
        return this.bioObj;
    }

    public final Dlobj getDlobj() {
        return this.dlobj;
    }

    public final Object getErormsg() {
        return this.erormsg;
    }

    public final String getErrorcd() {
        return this.errorcd;
    }

    public int hashCode() {
        String str = this.errorcd;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BioObj bioObj = this.bioObj;
        int iHashCode2 = (iHashCode + (bioObj == null ? 0 : bioObj.hashCode())) * 31;
        Dlobj dlobj = this.dlobj;
        int iHashCode3 = (iHashCode2 + (dlobj == null ? 0 : dlobj.hashCode())) * 31;
        Object obj = this.erormsg;
        int iHashCode4 = (iHashCode3 + (obj == null ? 0 : obj.hashCode())) * 31;
        BioImgObj bioImgObj = this.bioImgObj;
        return iHashCode4 + (bioImgObj != null ? bioImgObj.hashCode() : 0);
    }

    public String toString() {
        return "DldetobjItem(errorcd=" + this.errorcd + ", bioObj=" + this.bioObj + ", dlobj=" + this.dlobj + ", erormsg=" + this.erormsg + ", bioImgObj=" + this.bioImgObj + ')';
    }

    public DldetobjItem(String str, BioObj bioObj, Dlobj dlobj, Object obj, BioImgObj bioImgObj) {
        this.errorcd = str;
        this.bioObj = bioObj;
        this.dlobj = dlobj;
        this.erormsg = obj;
        this.bioImgObj = bioImgObj;
    }

    public /* synthetic */ DldetobjItem(String str, BioObj bioObj, Dlobj dlobj, Object obj, BioImgObj bioImgObj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bioObj, (i & 4) != 0 ? null : dlobj, (i & 8) != 0 ? null : obj, (i & 16) != 0 ? null : bioImgObj);
    }
}
