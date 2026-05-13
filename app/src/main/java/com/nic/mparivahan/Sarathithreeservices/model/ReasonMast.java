package com.nic.mparivahan.Sarathithreeservices.model;

import androidx.annotation.Keep;
import com.zepto.xy5;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJJ\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0013\u0010\u000e¨\u0006 "}, d2 = {"Lcom/nic/mparivahan/Sarathithreeservices/model/ReasonMast;", "Ljava/io/Serializable;", "rmReasonCode", "", "rmCheckUsertoken", "", "rmReasonDesc", "", "rmTokenId", "rmUserId", "(Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Integer;)V", "getRmCheckUsertoken", "()Ljava/lang/Object;", "getRmReasonCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRmReasonDesc", "()Ljava/lang/String;", "getRmTokenId", "getRmUserId", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Integer;)Lcom/nic/mparivahan/Sarathithreeservices/model/ReasonMast;", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ReasonMast implements Serializable {

    @xy5("rmCheckUsertoken")
    private final Object rmCheckUsertoken;

    @xy5("rmReasonCode")
    private final Integer rmReasonCode;

    @xy5("rmReasonDesc")
    private final String rmReasonDesc;

    @xy5("rmTokenId")
    private final Object rmTokenId;

    @xy5("rmUserId")
    private final Integer rmUserId;

    public ReasonMast() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ ReasonMast copy$default(ReasonMast reasonMast, Integer num, Object obj, String str, Object obj2, Integer num2, int i, Object obj3) {
        if ((i & 1) != 0) {
            num = reasonMast.rmReasonCode;
        }
        if ((i & 2) != 0) {
            obj = reasonMast.rmCheckUsertoken;
        }
        Object obj4 = obj;
        if ((i & 4) != 0) {
            str = reasonMast.rmReasonDesc;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            obj2 = reasonMast.rmTokenId;
        }
        Object obj5 = obj2;
        if ((i & 16) != 0) {
            num2 = reasonMast.rmUserId;
        }
        return reasonMast.copy(num, obj4, str2, obj5, num2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getRmReasonCode() {
        return this.rmReasonCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getRmCheckUsertoken() {
        return this.rmCheckUsertoken;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRmReasonDesc() {
        return this.rmReasonDesc;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Object getRmTokenId() {
        return this.rmTokenId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getRmUserId() {
        return this.rmUserId;
    }

    public final ReasonMast copy(Integer rmReasonCode, Object rmCheckUsertoken, String rmReasonDesc, Object rmTokenId, Integer rmUserId) {
        return new ReasonMast(rmReasonCode, rmCheckUsertoken, rmReasonDesc, rmTokenId, rmUserId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReasonMast)) {
            return false;
        }
        ReasonMast reasonMast = (ReasonMast) other;
        return Intrinsics.areEqual(this.rmReasonCode, reasonMast.rmReasonCode) && Intrinsics.areEqual(this.rmCheckUsertoken, reasonMast.rmCheckUsertoken) && Intrinsics.areEqual(this.rmReasonDesc, reasonMast.rmReasonDesc) && Intrinsics.areEqual(this.rmTokenId, reasonMast.rmTokenId) && Intrinsics.areEqual(this.rmUserId, reasonMast.rmUserId);
    }

    public final Object getRmCheckUsertoken() {
        return this.rmCheckUsertoken;
    }

    public final Integer getRmReasonCode() {
        return this.rmReasonCode;
    }

    public final String getRmReasonDesc() {
        return this.rmReasonDesc;
    }

    public final Object getRmTokenId() {
        return this.rmTokenId;
    }

    public final Integer getRmUserId() {
        return this.rmUserId;
    }

    public int hashCode() {
        Integer num = this.rmReasonCode;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Object obj = this.rmCheckUsertoken;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.rmReasonDesc;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Object obj2 = this.rmTokenId;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Integer num2 = this.rmUserId;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "ReasonMast(rmReasonCode=" + this.rmReasonCode + ", rmCheckUsertoken=" + this.rmCheckUsertoken + ", rmReasonDesc=" + this.rmReasonDesc + ", rmTokenId=" + this.rmTokenId + ", rmUserId=" + this.rmUserId + ')';
    }

    public ReasonMast(Integer num, Object obj, String str, Object obj2, Integer num2) {
        this.rmReasonCode = num;
        this.rmCheckUsertoken = obj;
        this.rmReasonDesc = str;
        this.rmTokenId = obj2;
        this.rmUserId = num2;
    }

    public /* synthetic */ ReasonMast(Integer num, Object obj, String str, Object obj2, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : obj, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : num2);
    }
}
