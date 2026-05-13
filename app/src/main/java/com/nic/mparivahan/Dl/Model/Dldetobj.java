package com.nic.mparivahan.Dl.Model;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003J=\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u000bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lcom/nic/mparivahan/Dl/Model/Dldetobj;", "Ljava/io/Serializable;", "bioImgObj", "Lcom/nic/mparivahan/Dl/Model/BioImgObj;", "bioObj", "Lcom/nic/mparivahan/Dl/Model/BioObj;", "dlobj", "Lcom/nic/mparivahan/Dl/Model/Dlobj;", "erormsg", "", "errorcd", "", "(Lcom/nic/mparivahan/Dl/Model/BioImgObj;Lcom/nic/mparivahan/Dl/Model/BioObj;Lcom/nic/mparivahan/Dl/Model/Dlobj;Ljava/lang/Object;Ljava/lang/String;)V", "getBioImgObj", "()Lcom/nic/mparivahan/Dl/Model/BioImgObj;", "getBioObj", "()Lcom/nic/mparivahan/Dl/Model/BioObj;", "getDlobj", "()Lcom/nic/mparivahan/Dl/Model/Dlobj;", "getErormsg", "()Ljava/lang/Object;", "getErrorcd", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Dldetobj implements Serializable {
    private final BioImgObj bioImgObj;
    private final BioObj bioObj;
    private final Dlobj dlobj;
    private final Object erormsg;
    private final String errorcd;

    public Dldetobj(BioImgObj bioImgObj, BioObj bioObj, Dlobj dlobj, Object erormsg, String errorcd) {
        Intrinsics.checkNotNullParameter(bioObj, "bioObj");
        Intrinsics.checkNotNullParameter(dlobj, "dlobj");
        Intrinsics.checkNotNullParameter(erormsg, "erormsg");
        Intrinsics.checkNotNullParameter(errorcd, "errorcd");
        this.bioImgObj = bioImgObj;
        this.bioObj = bioObj;
        this.dlobj = dlobj;
        this.erormsg = erormsg;
        this.errorcd = errorcd;
    }

    public static /* synthetic */ Dldetobj copy$default(Dldetobj dldetobj, BioImgObj bioImgObj, BioObj bioObj, Dlobj dlobj, Object obj, String str, int i, Object obj2) {
        if ((i & 1) != 0) {
            bioImgObj = dldetobj.bioImgObj;
        }
        if ((i & 2) != 0) {
            bioObj = dldetobj.bioObj;
        }
        BioObj bioObj2 = bioObj;
        if ((i & 4) != 0) {
            dlobj = dldetobj.dlobj;
        }
        Dlobj dlobj2 = dlobj;
        if ((i & 8) != 0) {
            obj = dldetobj.erormsg;
        }
        Object obj3 = obj;
        if ((i & 16) != 0) {
            str = dldetobj.errorcd;
        }
        return dldetobj.copy(bioImgObj, bioObj2, dlobj2, obj3, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BioImgObj getBioImgObj() {
        return this.bioImgObj;
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
    public final String getErrorcd() {
        return this.errorcd;
    }

    public final Dldetobj copy(BioImgObj bioImgObj, BioObj bioObj, Dlobj dlobj, Object erormsg, String errorcd) {
        Intrinsics.checkNotNullParameter(bioObj, "bioObj");
        Intrinsics.checkNotNullParameter(dlobj, "dlobj");
        Intrinsics.checkNotNullParameter(erormsg, "erormsg");
        Intrinsics.checkNotNullParameter(errorcd, "errorcd");
        return new Dldetobj(bioImgObj, bioObj, dlobj, erormsg, errorcd);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Dldetobj)) {
            return false;
        }
        Dldetobj dldetobj = (Dldetobj) other;
        return Intrinsics.areEqual(this.bioImgObj, dldetobj.bioImgObj) && Intrinsics.areEqual(this.bioObj, dldetobj.bioObj) && Intrinsics.areEqual(this.dlobj, dldetobj.dlobj) && Intrinsics.areEqual(this.erormsg, dldetobj.erormsg) && Intrinsics.areEqual(this.errorcd, dldetobj.errorcd);
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
        BioImgObj bioImgObj = this.bioImgObj;
        return ((((((((bioImgObj == null ? 0 : bioImgObj.hashCode()) * 31) + this.bioObj.hashCode()) * 31) + this.dlobj.hashCode()) * 31) + this.erormsg.hashCode()) * 31) + this.errorcd.hashCode();
    }

    public String toString() {
        return "Dldetobj(bioImgObj=" + this.bioImgObj + ", bioObj=" + this.bioObj + ", dlobj=" + this.dlobj + ", erormsg=" + this.erormsg + ", errorcd=" + this.errorcd + ')';
    }
}
