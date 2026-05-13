package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0013\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u001d\u0010\t\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001b\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/Dlresponse;", "Ljava/io/Serializable;", "dldetobj", "", "Lcom/nic/mparivahan/dlservices/data/model/DldetobjItem;", "(Ljava/util/List;)V", "getDldetobj", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Dlresponse implements Serializable {
    private final List<DldetobjItem> dldetobj;

    public Dlresponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Dlresponse copy$default(Dlresponse dlresponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = dlresponse.dldetobj;
        }
        return dlresponse.copy(list);
    }

    public final List<DldetobjItem> component1() {
        return this.dldetobj;
    }

    public final Dlresponse copy(List<DldetobjItem> dldetobj) {
        return new Dlresponse(dldetobj);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Dlresponse) && Intrinsics.areEqual(this.dldetobj, ((Dlresponse) other).dldetobj);
    }

    public final List<DldetobjItem> getDldetobj() {
        return this.dldetobj;
    }

    public int hashCode() {
        List<DldetobjItem> list = this.dldetobj;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "Dlresponse(dldetobj=" + this.dldetobj + ')';
    }

    public Dlresponse(List<DldetobjItem> list) {
        this.dldetobj = list;
    }

    public /* synthetic */ Dlresponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
