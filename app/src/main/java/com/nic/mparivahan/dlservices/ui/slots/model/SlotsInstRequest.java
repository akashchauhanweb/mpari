package com.nic.mparivahan.dlservices.ui.slots.model;

import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/slots/model/SlotsInstRequest;", "", "rtocd", "", "campid", "applNo", "slotDate", "campcd", "slotNo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApplNo", "()Ljava/lang/String;", "getCampcd", "getCampid", "getRtocd", "getSlotDate", "getSlotNo", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SlotsInstRequest {

    @xy5("applNo")
    private final String applNo;

    @xy5("campcd")
    private final String campcd;

    @xy5("campid")
    private final String campid;

    @xy5("rtocd")
    private final String rtocd;

    @xy5("slotDate")
    private final String slotDate;

    @xy5("slotNo")
    private final String slotNo;

    public SlotsInstRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ SlotsInstRequest copy$default(SlotsInstRequest slotsInstRequest, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = slotsInstRequest.rtocd;
        }
        if ((i & 2) != 0) {
            str2 = slotsInstRequest.campid;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = slotsInstRequest.applNo;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = slotsInstRequest.slotDate;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = slotsInstRequest.campcd;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = slotsInstRequest.slotNo;
        }
        return slotsInstRequest.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRtocd() {
        return this.rtocd;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCampid() {
        return this.campid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getApplNo() {
        return this.applNo;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSlotDate() {
        return this.slotDate;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCampcd() {
        return this.campcd;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSlotNo() {
        return this.slotNo;
    }

    public final SlotsInstRequest copy(String rtocd, String campid, String applNo, String slotDate, String campcd, String slotNo) {
        return new SlotsInstRequest(rtocd, campid, applNo, slotDate, campcd, slotNo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SlotsInstRequest)) {
            return false;
        }
        SlotsInstRequest slotsInstRequest = (SlotsInstRequest) other;
        return Intrinsics.areEqual(this.rtocd, slotsInstRequest.rtocd) && Intrinsics.areEqual(this.campid, slotsInstRequest.campid) && Intrinsics.areEqual(this.applNo, slotsInstRequest.applNo) && Intrinsics.areEqual(this.slotDate, slotsInstRequest.slotDate) && Intrinsics.areEqual(this.campcd, slotsInstRequest.campcd) && Intrinsics.areEqual(this.slotNo, slotsInstRequest.slotNo);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final String getCampcd() {
        return this.campcd;
    }

    public final String getCampid() {
        return this.campid;
    }

    public final String getRtocd() {
        return this.rtocd;
    }

    public final String getSlotDate() {
        return this.slotDate;
    }

    public final String getSlotNo() {
        return this.slotNo;
    }

    public int hashCode() {
        String str = this.rtocd;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.campid;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.applNo;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.slotDate;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.campcd;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.slotNo;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "SlotsInstRequest(rtocd=" + this.rtocd + ", campid=" + this.campid + ", applNo=" + this.applNo + ", slotDate=" + this.slotDate + ", campcd=" + this.campcd + ", slotNo=" + this.slotNo + ')';
    }

    public SlotsInstRequest(String str, String str2, String str3, String str4, String str5, String str6) {
        this.rtocd = str;
        this.campid = str2;
        this.applNo = str3;
        this.slotDate = str4;
        this.campcd = str5;
        this.slotNo = str6;
    }

    public /* synthetic */ SlotsInstRequest(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }
}
