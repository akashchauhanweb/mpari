package com.nic.mparivahan.dlservices.ui.dlextract.NonSarathi;

import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/dlextract/NonSarathi/SelectedDLList;", "", "jsonMember523", "", "(Ljava/lang/String;)V", "getJsonMember523", "()Ljava/lang/String;", "setJsonMember523", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SelectedDLList {

    @xy5("523")
    private String jsonMember523;

    public SelectedDLList() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SelectedDLList copy$default(SelectedDLList selectedDLList, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = selectedDLList.jsonMember523;
        }
        return selectedDLList.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getJsonMember523() {
        return this.jsonMember523;
    }

    public final SelectedDLList copy(String jsonMember523) {
        return new SelectedDLList(jsonMember523);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SelectedDLList) && Intrinsics.areEqual(this.jsonMember523, ((SelectedDLList) other).jsonMember523);
    }

    public final String getJsonMember523() {
        return this.jsonMember523;
    }

    public int hashCode() {
        String str = this.jsonMember523;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setJsonMember523(String str) {
        this.jsonMember523 = str;
    }

    public String toString() {
        return "SelectedDLList(jsonMember523=" + this.jsonMember523 + ')';
    }

    public SelectedDLList(String str) {
        this.jsonMember523 = str;
    }

    public /* synthetic */ SelectedDLList(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
