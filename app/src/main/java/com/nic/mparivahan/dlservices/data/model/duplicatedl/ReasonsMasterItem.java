package com.nic.mparivahan.dlservices.data.model.duplicatedl;

import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/duplicatedl/ReasonsMasterItem;", "", "reasonCode", "", "reasonName", "", "(Ljava/lang/Integer;Ljava/lang/String;)V", "getReasonCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getReasonName", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/nic/mparivahan/dlservices/data/model/duplicatedl/ReasonsMasterItem;", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ReasonsMasterItem {

    @xy5("ReasonCode")
    private final Integer reasonCode;

    @xy5("ReasonName")
    private final String reasonName;

    public ReasonsMasterItem() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ReasonsMasterItem copy$default(ReasonsMasterItem reasonsMasterItem, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = reasonsMasterItem.reasonCode;
        }
        if ((i & 2) != 0) {
            str = reasonsMasterItem.reasonName;
        }
        return reasonsMasterItem.copy(num, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getReasonCode() {
        return this.reasonCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getReasonName() {
        return this.reasonName;
    }

    public final ReasonsMasterItem copy(Integer reasonCode, String reasonName) {
        return new ReasonsMasterItem(reasonCode, reasonName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReasonsMasterItem)) {
            return false;
        }
        ReasonsMasterItem reasonsMasterItem = (ReasonsMasterItem) other;
        return Intrinsics.areEqual(this.reasonCode, reasonsMasterItem.reasonCode) && Intrinsics.areEqual(this.reasonName, reasonsMasterItem.reasonName);
    }

    public final Integer getReasonCode() {
        return this.reasonCode;
    }

    public final String getReasonName() {
        return this.reasonName;
    }

    public int hashCode() {
        Integer num = this.reasonCode;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.reasonName;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "ReasonsMasterItem(reasonCode=" + this.reasonCode + ", reasonName=" + this.reasonName + ')';
    }

    public ReasonsMasterItem(Integer num, String str) {
        this.reasonCode = num;
        this.reasonName = str;
    }

    public /* synthetic */ ReasonsMasterItem(Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
    }
}
