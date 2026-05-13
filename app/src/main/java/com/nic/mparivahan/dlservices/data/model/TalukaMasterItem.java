package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/TalukaMasterItem;", "", "subDistname", "", "subDistcode", "(Ljava/lang/String;Ljava/lang/String;)V", "getSubDistcode", "()Ljava/lang/String;", "getSubDistname", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class TalukaMasterItem {

    @xy5("subDist_code")
    private final String subDistcode;

    @xy5("subDist_name")
    private final String subDistname;

    public TalukaMasterItem() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ TalukaMasterItem copy$default(TalukaMasterItem talukaMasterItem, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = talukaMasterItem.subDistname;
        }
        if ((i & 2) != 0) {
            str2 = talukaMasterItem.subDistcode;
        }
        return talukaMasterItem.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSubDistname() {
        return this.subDistname;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubDistcode() {
        return this.subDistcode;
    }

    public final TalukaMasterItem copy(String subDistname, String subDistcode) {
        return new TalukaMasterItem(subDistname, subDistcode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TalukaMasterItem)) {
            return false;
        }
        TalukaMasterItem talukaMasterItem = (TalukaMasterItem) other;
        return Intrinsics.areEqual(this.subDistname, talukaMasterItem.subDistname) && Intrinsics.areEqual(this.subDistcode, talukaMasterItem.subDistcode);
    }

    public final String getSubDistcode() {
        return this.subDistcode;
    }

    public final String getSubDistname() {
        return this.subDistname;
    }

    public int hashCode() {
        String str = this.subDistname;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subDistcode;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "TalukaMasterItem(subDistname=" + this.subDistname + ", subDistcode=" + this.subDistcode + ')';
    }

    public TalukaMasterItem(String str, String str2) {
        this.subDistname = str;
        this.subDistcode = str2;
    }

    public /* synthetic */ TalukaMasterItem(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
