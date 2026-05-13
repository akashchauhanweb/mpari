package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import com.zepto.xy5;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJV\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0010\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0012\u0010\fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006\""}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/ApplFlowStatusListItem;", "Ljava/io/Serializable;", "trName", "", "trCd", "", "acDesc", "acCd", "status", "flowSlno", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V", "getAcCd", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAcDesc", "()Ljava/lang/String;", "getFlowSlno", "getStatus", "getTrCd", "getTrName", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)Lcom/nic/mparivahan/dlservices/data/model/ApplFlowStatusListItem;", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ApplFlowStatusListItem implements Serializable {

    @xy5("acCd")
    private final Integer acCd;

    @xy5("acDesc")
    private final String acDesc;

    @xy5("flowSlno")
    private final Integer flowSlno;

    @xy5("status")
    private final String status;

    @xy5("trCd")
    private final Integer trCd;

    @xy5("trName")
    private final String trName;

    public ApplFlowStatusListItem() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ ApplFlowStatusListItem copy$default(ApplFlowStatusListItem applFlowStatusListItem, String str, Integer num, String str2, Integer num2, String str3, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = applFlowStatusListItem.trName;
        }
        if ((i & 2) != 0) {
            num = applFlowStatusListItem.trCd;
        }
        Integer num4 = num;
        if ((i & 4) != 0) {
            str2 = applFlowStatusListItem.acDesc;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            num2 = applFlowStatusListItem.acCd;
        }
        Integer num5 = num2;
        if ((i & 16) != 0) {
            str3 = applFlowStatusListItem.status;
        }
        String str5 = str3;
        if ((i & 32) != 0) {
            num3 = applFlowStatusListItem.flowSlno;
        }
        return applFlowStatusListItem.copy(str, num4, str4, num5, str5, num3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTrName() {
        return this.trName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getTrCd() {
        return this.trCd;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAcDesc() {
        return this.acDesc;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getAcCd() {
        return this.acCd;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getFlowSlno() {
        return this.flowSlno;
    }

    public final ApplFlowStatusListItem copy(String trName, Integer trCd, String acDesc, Integer acCd, String status, Integer flowSlno) {
        return new ApplFlowStatusListItem(trName, trCd, acDesc, acCd, status, flowSlno);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApplFlowStatusListItem)) {
            return false;
        }
        ApplFlowStatusListItem applFlowStatusListItem = (ApplFlowStatusListItem) other;
        return Intrinsics.areEqual(this.trName, applFlowStatusListItem.trName) && Intrinsics.areEqual(this.trCd, applFlowStatusListItem.trCd) && Intrinsics.areEqual(this.acDesc, applFlowStatusListItem.acDesc) && Intrinsics.areEqual(this.acCd, applFlowStatusListItem.acCd) && Intrinsics.areEqual(this.status, applFlowStatusListItem.status) && Intrinsics.areEqual(this.flowSlno, applFlowStatusListItem.flowSlno);
    }

    public final Integer getAcCd() {
        return this.acCd;
    }

    public final String getAcDesc() {
        return this.acDesc;
    }

    public final Integer getFlowSlno() {
        return this.flowSlno;
    }

    public final String getStatus() {
        return this.status;
    }

    public final Integer getTrCd() {
        return this.trCd;
    }

    public final String getTrName() {
        return this.trName;
    }

    public int hashCode() {
        String str = this.trName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.trCd;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.acDesc;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.acCd;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.status;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.flowSlno;
        return iHashCode5 + (num3 != null ? num3.hashCode() : 0);
    }

    public String toString() {
        return "ApplFlowStatusListItem(trName=" + this.trName + ", trCd=" + this.trCd + ", acDesc=" + this.acDesc + ", acCd=" + this.acCd + ", status=" + this.status + ", flowSlno=" + this.flowSlno + ')';
    }

    public ApplFlowStatusListItem(String str, Integer num, String str2, Integer num2, String str3, Integer num3) {
        this.trName = str;
        this.trCd = num;
        this.acDesc = str2;
        this.acCd = num2;
        this.status = str3;
        this.flowSlno = num3;
    }

    public /* synthetic */ ApplFlowStatusListItem(String str, Integer num, String str2, Integer num2, String str3, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : num3);
    }
}
