package com.nic.mparivahan.RC.Model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010(\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J\u0086\u0001\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u000bHÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0018\u0010\u0013R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0019\u0010\u0013R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001d\u0010\u001bR\u0015\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001e\u0010\u0013¨\u00060"}, d2 = {"Lcom/nic/mparivahan/RC/Model/ReceivedDoc;", "", "shrdCreatedAt", "", "shrdDocNumber", "shrdDocType", "shrdExpireOn", "shrdFromCtz", "", "shrdId", "shrdNdays", "", "shrdStatus", "shrdToCtz", "shrdDocId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;)V", "getShrdCreatedAt", "()Ljava/lang/String;", "getShrdDocId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getShrdDocNumber", "getShrdDocType", "getShrdExpireOn", "getShrdFromCtz", "getShrdId", "getShrdNdays", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getShrdStatus", "getShrdToCtz", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;)Lcom/nic/mparivahan/RC/Model/ReceivedDoc;", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ReceivedDoc {
    private final String shrdCreatedAt;
    private final Long shrdDocId;
    private final String shrdDocNumber;
    private final String shrdDocType;
    private final String shrdExpireOn;
    private final Long shrdFromCtz;
    private final Long shrdId;
    private final Integer shrdNdays;
    private final Integer shrdStatus;
    private final Long shrdToCtz;

    public ReceivedDoc(String str, String str2, String str3, String str4, Long l, Long l2, Integer num, Integer num2, Long l3, Long l4) {
        this.shrdCreatedAt = str;
        this.shrdDocNumber = str2;
        this.shrdDocType = str3;
        this.shrdExpireOn = str4;
        this.shrdFromCtz = l;
        this.shrdId = l2;
        this.shrdNdays = num;
        this.shrdStatus = num2;
        this.shrdToCtz = l3;
        this.shrdDocId = l4;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getShrdCreatedAt() {
        return this.shrdCreatedAt;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Long getShrdDocId() {
        return this.shrdDocId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getShrdDocNumber() {
        return this.shrdDocNumber;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getShrdDocType() {
        return this.shrdDocType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getShrdExpireOn() {
        return this.shrdExpireOn;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getShrdFromCtz() {
        return this.shrdFromCtz;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getShrdId() {
        return this.shrdId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getShrdNdays() {
        return this.shrdNdays;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getShrdStatus() {
        return this.shrdStatus;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Long getShrdToCtz() {
        return this.shrdToCtz;
    }

    public final ReceivedDoc copy(String shrdCreatedAt, String shrdDocNumber, String shrdDocType, String shrdExpireOn, Long shrdFromCtz, Long shrdId, Integer shrdNdays, Integer shrdStatus, Long shrdToCtz, Long shrdDocId) {
        return new ReceivedDoc(shrdCreatedAt, shrdDocNumber, shrdDocType, shrdExpireOn, shrdFromCtz, shrdId, shrdNdays, shrdStatus, shrdToCtz, shrdDocId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReceivedDoc)) {
            return false;
        }
        ReceivedDoc receivedDoc = (ReceivedDoc) other;
        return Intrinsics.areEqual(this.shrdCreatedAt, receivedDoc.shrdCreatedAt) && Intrinsics.areEqual(this.shrdDocNumber, receivedDoc.shrdDocNumber) && Intrinsics.areEqual(this.shrdDocType, receivedDoc.shrdDocType) && Intrinsics.areEqual(this.shrdExpireOn, receivedDoc.shrdExpireOn) && Intrinsics.areEqual(this.shrdFromCtz, receivedDoc.shrdFromCtz) && Intrinsics.areEqual(this.shrdId, receivedDoc.shrdId) && Intrinsics.areEqual(this.shrdNdays, receivedDoc.shrdNdays) && Intrinsics.areEqual(this.shrdStatus, receivedDoc.shrdStatus) && Intrinsics.areEqual(this.shrdToCtz, receivedDoc.shrdToCtz) && Intrinsics.areEqual(this.shrdDocId, receivedDoc.shrdDocId);
    }

    public final String getShrdCreatedAt() {
        return this.shrdCreatedAt;
    }

    public final Long getShrdDocId() {
        return this.shrdDocId;
    }

    public final String getShrdDocNumber() {
        return this.shrdDocNumber;
    }

    public final String getShrdDocType() {
        return this.shrdDocType;
    }

    public final String getShrdExpireOn() {
        return this.shrdExpireOn;
    }

    public final Long getShrdFromCtz() {
        return this.shrdFromCtz;
    }

    public final Long getShrdId() {
        return this.shrdId;
    }

    public final Integer getShrdNdays() {
        return this.shrdNdays;
    }

    public final Integer getShrdStatus() {
        return this.shrdStatus;
    }

    public final Long getShrdToCtz() {
        return this.shrdToCtz;
    }

    public int hashCode() {
        String str = this.shrdCreatedAt;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.shrdDocNumber;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.shrdDocType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.shrdExpireOn;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.shrdFromCtz;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.shrdId;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.shrdNdays;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.shrdStatus;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l3 = this.shrdToCtz;
        int iHashCode9 = (iHashCode8 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.shrdDocId;
        return iHashCode9 + (l4 != null ? l4.hashCode() : 0);
    }

    public String toString() {
        return "ReceivedDoc(shrdCreatedAt=" + this.shrdCreatedAt + ", shrdDocNumber=" + this.shrdDocNumber + ", shrdDocType=" + this.shrdDocType + ", shrdExpireOn=" + this.shrdExpireOn + ", shrdFromCtz=" + this.shrdFromCtz + ", shrdId=" + this.shrdId + ", shrdNdays=" + this.shrdNdays + ", shrdStatus=" + this.shrdStatus + ", shrdToCtz=" + this.shrdToCtz + ", shrdDocId=" + this.shrdDocId + ')';
    }
}
