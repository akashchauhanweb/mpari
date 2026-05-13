package com.nic.mparivahan.dlservices.ui.slots.model;

import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/slots/model/SlotsDetRequest;", "", "rtocd", "", "campid", "campcd", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCampcd", "()Ljava/lang/String;", "getCampid", "getRtocd", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SlotsDetRequest {

    @xy5("campcd")
    private final String campcd;

    @xy5("campid")
    private final String campid;

    @xy5("rtocd")
    private final String rtocd;

    public SlotsDetRequest() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ SlotsDetRequest copy$default(SlotsDetRequest slotsDetRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = slotsDetRequest.rtocd;
        }
        if ((i & 2) != 0) {
            str2 = slotsDetRequest.campid;
        }
        if ((i & 4) != 0) {
            str3 = slotsDetRequest.campcd;
        }
        return slotsDetRequest.copy(str, str2, str3);
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
    public final String getCampcd() {
        return this.campcd;
    }

    public final SlotsDetRequest copy(String rtocd, String campid, String campcd) {
        return new SlotsDetRequest(rtocd, campid, campcd);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SlotsDetRequest)) {
            return false;
        }
        SlotsDetRequest slotsDetRequest = (SlotsDetRequest) other;
        return Intrinsics.areEqual(this.rtocd, slotsDetRequest.rtocd) && Intrinsics.areEqual(this.campid, slotsDetRequest.campid) && Intrinsics.areEqual(this.campcd, slotsDetRequest.campcd);
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

    public int hashCode() {
        String str = this.rtocd;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.campid;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.campcd;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "SlotsDetRequest(rtocd=" + this.rtocd + ", campid=" + this.campid + ", campcd=" + this.campcd + ')';
    }

    public SlotsDetRequest(String str, String str2, String str3) {
        this.rtocd = str;
        this.campid = str2;
        this.campcd = str3;
    }

    public /* synthetic */ SlotsDetRequest(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
