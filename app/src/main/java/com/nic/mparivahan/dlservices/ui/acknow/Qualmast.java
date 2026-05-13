package com.nic.mparivahan.dlservices.ui.acknow;

import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\rJJ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0012\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/acknow/Qualmast;", "", "qmQualdesc", "", "qmCheckUsertoken", "qmTokenId", "qmUserId", "", "qmQualcd", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getQmCheckUsertoken", "()Ljava/lang/Object;", "getQmQualcd", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getQmQualdesc", "()Ljava/lang/String;", "getQmTokenId", "getQmUserId", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/nic/mparivahan/dlservices/ui/acknow/Qualmast;", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Qualmast {

    @xy5("qmCheckUsertoken")
    private final Object qmCheckUsertoken;

    @xy5("qmQualcd")
    private final Integer qmQualcd;

    @xy5("qmQualdesc")
    private final String qmQualdesc;

    @xy5("qmTokenId")
    private final Object qmTokenId;

    @xy5("qmUserId")
    private final Integer qmUserId;

    public Qualmast() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ Qualmast copy$default(Qualmast qualmast, String str, Object obj, Object obj2, Integer num, Integer num2, int i, Object obj3) {
        if ((i & 1) != 0) {
            str = qualmast.qmQualdesc;
        }
        if ((i & 2) != 0) {
            obj = qualmast.qmCheckUsertoken;
        }
        Object obj4 = obj;
        if ((i & 4) != 0) {
            obj2 = qualmast.qmTokenId;
        }
        Object obj5 = obj2;
        if ((i & 8) != 0) {
            num = qualmast.qmUserId;
        }
        Integer num3 = num;
        if ((i & 16) != 0) {
            num2 = qualmast.qmQualcd;
        }
        return qualmast.copy(str, obj4, obj5, num3, num2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getQmQualdesc() {
        return this.qmQualdesc;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getQmCheckUsertoken() {
        return this.qmCheckUsertoken;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Object getQmTokenId() {
        return this.qmTokenId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getQmUserId() {
        return this.qmUserId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getQmQualcd() {
        return this.qmQualcd;
    }

    public final Qualmast copy(String qmQualdesc, Object qmCheckUsertoken, Object qmTokenId, Integer qmUserId, Integer qmQualcd) {
        return new Qualmast(qmQualdesc, qmCheckUsertoken, qmTokenId, qmUserId, qmQualcd);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Qualmast)) {
            return false;
        }
        Qualmast qualmast = (Qualmast) other;
        return Intrinsics.areEqual(this.qmQualdesc, qualmast.qmQualdesc) && Intrinsics.areEqual(this.qmCheckUsertoken, qualmast.qmCheckUsertoken) && Intrinsics.areEqual(this.qmTokenId, qualmast.qmTokenId) && Intrinsics.areEqual(this.qmUserId, qualmast.qmUserId) && Intrinsics.areEqual(this.qmQualcd, qualmast.qmQualcd);
    }

    public final Object getQmCheckUsertoken() {
        return this.qmCheckUsertoken;
    }

    public final Integer getQmQualcd() {
        return this.qmQualcd;
    }

    public final String getQmQualdesc() {
        return this.qmQualdesc;
    }

    public final Object getQmTokenId() {
        return this.qmTokenId;
    }

    public final Integer getQmUserId() {
        return this.qmUserId;
    }

    public int hashCode() {
        String str = this.qmQualdesc;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Object obj = this.qmCheckUsertoken;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.qmTokenId;
        int iHashCode3 = (iHashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Integer num = this.qmUserId;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.qmQualcd;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "Qualmast(qmQualdesc=" + this.qmQualdesc + ", qmCheckUsertoken=" + this.qmCheckUsertoken + ", qmTokenId=" + this.qmTokenId + ", qmUserId=" + this.qmUserId + ", qmQualcd=" + this.qmQualcd + ')';
    }

    public Qualmast(String str, Object obj, Object obj2, Integer num, Integer num2) {
        this.qmQualdesc = str;
        this.qmCheckUsertoken = obj;
        this.qmTokenId = obj2;
        this.qmUserId = num;
        this.qmQualcd = num2;
    }

    public /* synthetic */ Qualmast(String str, Object obj, Object obj2, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : obj, (i & 4) != 0 ? null : obj2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2);
    }
}
