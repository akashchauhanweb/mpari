package com.nic.mparivahan.VahanServices.ApplicationStatusModel;

import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/nic/mparivahan/VahanServices/ApplicationStatusModel/Currentlist;", "Ljava/io/Serializable;", "applnolist", "", "Lcom/nic/mparivahan/VahanServices/ApplicationStatusModel/Applnolist;", "(Ljava/util/List;)V", "getApplnolist", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Currentlist implements Serializable {
    private final List<Applnolist> applnolist;

    public Currentlist(List<Applnolist> applnolist) {
        Intrinsics.checkNotNullParameter(applnolist, "applnolist");
        this.applnolist = applnolist;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Currentlist copy$default(Currentlist currentlist, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = currentlist.applnolist;
        }
        return currentlist.copy(list);
    }

    public final List<Applnolist> component1() {
        return this.applnolist;
    }

    public final Currentlist copy(List<Applnolist> applnolist) {
        Intrinsics.checkNotNullParameter(applnolist, "applnolist");
        return new Currentlist(applnolist);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Currentlist) && Intrinsics.areEqual(this.applnolist, ((Currentlist) other).applnolist);
    }

    public final List<Applnolist> getApplnolist() {
        return this.applnolist;
    }

    public int hashCode() {
        return this.applnolist.hashCode();
    }

    public String toString() {
        return "Currentlist(applnolist=" + this.applnolist + ')';
    }
}
