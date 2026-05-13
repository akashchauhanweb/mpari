package com.nic.mparivahan.dlservices.data.RenewalServicesFilesCoa;

import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/RenewalServicesFilesCoa/DuplicateDlCoaList;", "", "jsonMember513", "", "jsonMember515", "(Ljava/lang/String;Ljava/lang/String;)V", "getJsonMember513", "()Ljava/lang/String;", "setJsonMember513", "(Ljava/lang/String;)V", "getJsonMember515", "setJsonMember515", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DuplicateDlCoaList {

    @xy5("513")
    private String jsonMember513;

    @xy5("515")
    private String jsonMember515;

    public DuplicateDlCoaList() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DuplicateDlCoaList copy$default(DuplicateDlCoaList duplicateDlCoaList, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = duplicateDlCoaList.jsonMember513;
        }
        if ((i & 2) != 0) {
            str2 = duplicateDlCoaList.jsonMember515;
        }
        return duplicateDlCoaList.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getJsonMember513() {
        return this.jsonMember513;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getJsonMember515() {
        return this.jsonMember515;
    }

    public final DuplicateDlCoaList copy(String jsonMember513, String jsonMember515) {
        return new DuplicateDlCoaList(jsonMember513, jsonMember515);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DuplicateDlCoaList)) {
            return false;
        }
        DuplicateDlCoaList duplicateDlCoaList = (DuplicateDlCoaList) other;
        return Intrinsics.areEqual(this.jsonMember513, duplicateDlCoaList.jsonMember513) && Intrinsics.areEqual(this.jsonMember515, duplicateDlCoaList.jsonMember515);
    }

    public final String getJsonMember513() {
        return this.jsonMember513;
    }

    public final String getJsonMember515() {
        return this.jsonMember515;
    }

    public int hashCode() {
        String str = this.jsonMember513;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.jsonMember515;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setJsonMember513(String str) {
        this.jsonMember513 = str;
    }

    public final void setJsonMember515(String str) {
        this.jsonMember515 = str;
    }

    public String toString() {
        return "DuplicateDlCoaList(jsonMember513=" + this.jsonMember513 + ", jsonMember515=" + this.jsonMember515 + ')';
    }

    public DuplicateDlCoaList(String str, String str2) {
        this.jsonMember513 = str;
        this.jsonMember515 = str2;
    }

    public /* synthetic */ DuplicateDlCoaList(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
