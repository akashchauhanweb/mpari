package com.nic.mparivahan.PushNoti.Pojo;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/nic/mparivahan/PushNoti/Pojo/Notification;", "", "pshnotId", "", "pshnotTmplt", "", "pshnotSentAt", "pshnotType", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPshnotId", "()J", "getPshnotSentAt", "()Ljava/lang/String;", "getPshnotTmplt", "getPshnotType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Notification {
    private final long pshnotId;
    private final String pshnotSentAt;
    private final String pshnotTmplt;
    private final String pshnotType;

    public Notification(long j, String pshnotTmplt, String pshnotSentAt, String pshnotType) {
        Intrinsics.checkNotNullParameter(pshnotTmplt, "pshnotTmplt");
        Intrinsics.checkNotNullParameter(pshnotSentAt, "pshnotSentAt");
        Intrinsics.checkNotNullParameter(pshnotType, "pshnotType");
        this.pshnotId = j;
        this.pshnotTmplt = pshnotTmplt;
        this.pshnotSentAt = pshnotSentAt;
        this.pshnotType = pshnotType;
    }

    public static /* synthetic */ Notification copy$default(Notification notification, long j, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = notification.pshnotId;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = notification.pshnotTmplt;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = notification.pshnotSentAt;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = notification.pshnotType;
        }
        return notification.copy(j2, str4, str5, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getPshnotId() {
        return this.pshnotId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPshnotTmplt() {
        return this.pshnotTmplt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPshnotSentAt() {
        return this.pshnotSentAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPshnotType() {
        return this.pshnotType;
    }

    public final Notification copy(long pshnotId, String pshnotTmplt, String pshnotSentAt, String pshnotType) {
        Intrinsics.checkNotNullParameter(pshnotTmplt, "pshnotTmplt");
        Intrinsics.checkNotNullParameter(pshnotSentAt, "pshnotSentAt");
        Intrinsics.checkNotNullParameter(pshnotType, "pshnotType");
        return new Notification(pshnotId, pshnotTmplt, pshnotSentAt, pshnotType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Notification)) {
            return false;
        }
        Notification notification = (Notification) other;
        return this.pshnotId == notification.pshnotId && Intrinsics.areEqual(this.pshnotTmplt, notification.pshnotTmplt) && Intrinsics.areEqual(this.pshnotSentAt, notification.pshnotSentAt) && Intrinsics.areEqual(this.pshnotType, notification.pshnotType);
    }

    public final long getPshnotId() {
        return this.pshnotId;
    }

    public final String getPshnotSentAt() {
        return this.pshnotSentAt;
    }

    public final String getPshnotTmplt() {
        return this.pshnotTmplt;
    }

    public final String getPshnotType() {
        return this.pshnotType;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.pshnotId) * 31) + this.pshnotTmplt.hashCode()) * 31) + this.pshnotSentAt.hashCode()) * 31) + this.pshnotType.hashCode();
    }

    public String toString() {
        return "Notification(pshnotId=" + this.pshnotId + ", pshnotTmplt=" + this.pshnotTmplt + ", pshnotSentAt=" + this.pshnotSentAt + ", pshnotType=" + this.pshnotType + ')';
    }
}
