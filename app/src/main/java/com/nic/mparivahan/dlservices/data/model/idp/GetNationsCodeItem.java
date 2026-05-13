package com.nic.mparivahan.dlservices.data.model.idp;

import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0011\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0000H\u0096\u0002J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0011\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0010HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/idp/GetNationsCodeItem;", "", "nationName", "", "nationCode", "natIdpIssuable", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getNatIdpIssuable", "()Ljava/lang/String;", "setNatIdpIssuable", "(Ljava/lang/String;)V", "getNationCode", "setNationCode", "getNationName", "setNationName", "compareTo", "", "other", "component1", "component2", "component3", "copy", "equals", "", "", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class GetNationsCodeItem implements Comparable<GetNationsCodeItem> {

    @xy5("NatIdpIssuable")
    private String natIdpIssuable;

    @xy5("NationCode")
    private String nationCode;

    @xy5("NationName")
    private String nationName;

    public GetNationsCodeItem() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ GetNationsCodeItem copy$default(GetNationsCodeItem getNationsCodeItem, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getNationsCodeItem.nationName;
        }
        if ((i & 2) != 0) {
            str2 = getNationsCodeItem.nationCode;
        }
        if ((i & 4) != 0) {
            str3 = getNationsCodeItem.natIdpIssuable;
        }
        return getNationsCodeItem.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNationName() {
        return this.nationName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNationCode() {
        return this.nationCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNatIdpIssuable() {
        return this.natIdpIssuable;
    }

    public final GetNationsCodeItem copy(String nationName, String nationCode, String natIdpIssuable) {
        return new GetNationsCodeItem(nationName, nationCode, natIdpIssuable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetNationsCodeItem)) {
            return false;
        }
        GetNationsCodeItem getNationsCodeItem = (GetNationsCodeItem) other;
        return Intrinsics.areEqual(this.nationName, getNationsCodeItem.nationName) && Intrinsics.areEqual(this.nationCode, getNationsCodeItem.nationCode) && Intrinsics.areEqual(this.natIdpIssuable, getNationsCodeItem.natIdpIssuable);
    }

    public final String getNatIdpIssuable() {
        return this.natIdpIssuable;
    }

    public final String getNationCode() {
        return this.nationCode;
    }

    public final String getNationName() {
        return this.nationName;
    }

    public int hashCode() {
        String str = this.nationName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.nationCode;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.natIdpIssuable;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setNatIdpIssuable(String str) {
        this.natIdpIssuable = str;
    }

    public final void setNationCode(String str) {
        this.nationCode = str;
    }

    public final void setNationName(String str) {
        this.nationName = str;
    }

    public String toString() {
        return "GetNationsCodeItem(nationName=" + this.nationName + ", nationCode=" + this.nationCode + ", natIdpIssuable=" + this.natIdpIssuable + ')';
    }

    public GetNationsCodeItem(String str, String str2, String str3) {
        this.nationName = str;
        this.nationCode = str2;
        this.natIdpIssuable = str3;
    }

    @Override // java.lang.Comparable
    public int compareTo(GetNationsCodeItem other) {
        Intrinsics.checkNotNullParameter(other, "other");
        String str = this.nationName;
        Intrinsics.checkNotNull(str);
        String str2 = other.nationName;
        Intrinsics.checkNotNull(str2);
        return str.compareTo(str2);
    }

    public /* synthetic */ GetNationsCodeItem(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
