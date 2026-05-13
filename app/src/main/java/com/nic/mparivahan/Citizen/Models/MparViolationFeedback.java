package com.nic.mparivahan.Citizen.Models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/nic/mparivahan/Citizen/Models/MparViolationFeedback;", "", "feedbackCreatedAt", "", "feedbackId", "", "feedbackRemarks", "feedbackViolationId", "(Ljava/lang/String;ILjava/lang/String;I)V", "getFeedbackCreatedAt", "()Ljava/lang/String;", "getFeedbackId", "()I", "getFeedbackRemarks", "getFeedbackViolationId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class MparViolationFeedback {
    private final String feedbackCreatedAt;
    private final int feedbackId;
    private final String feedbackRemarks;
    private final int feedbackViolationId;

    public MparViolationFeedback(String feedbackCreatedAt, int i, String feedbackRemarks, int i2) {
        Intrinsics.checkNotNullParameter(feedbackCreatedAt, "feedbackCreatedAt");
        Intrinsics.checkNotNullParameter(feedbackRemarks, "feedbackRemarks");
        this.feedbackCreatedAt = feedbackCreatedAt;
        this.feedbackId = i;
        this.feedbackRemarks = feedbackRemarks;
        this.feedbackViolationId = i2;
    }

    public static /* synthetic */ MparViolationFeedback copy$default(MparViolationFeedback mparViolationFeedback, String str, int i, String str2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = mparViolationFeedback.feedbackCreatedAt;
        }
        if ((i3 & 2) != 0) {
            i = mparViolationFeedback.feedbackId;
        }
        if ((i3 & 4) != 0) {
            str2 = mparViolationFeedback.feedbackRemarks;
        }
        if ((i3 & 8) != 0) {
            i2 = mparViolationFeedback.feedbackViolationId;
        }
        return mparViolationFeedback.copy(str, i, str2, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFeedbackCreatedAt() {
        return this.feedbackCreatedAt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getFeedbackId() {
        return this.feedbackId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFeedbackRemarks() {
        return this.feedbackRemarks;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getFeedbackViolationId() {
        return this.feedbackViolationId;
    }

    public final MparViolationFeedback copy(String feedbackCreatedAt, int feedbackId, String feedbackRemarks, int feedbackViolationId) {
        Intrinsics.checkNotNullParameter(feedbackCreatedAt, "feedbackCreatedAt");
        Intrinsics.checkNotNullParameter(feedbackRemarks, "feedbackRemarks");
        return new MparViolationFeedback(feedbackCreatedAt, feedbackId, feedbackRemarks, feedbackViolationId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MparViolationFeedback)) {
            return false;
        }
        MparViolationFeedback mparViolationFeedback = (MparViolationFeedback) other;
        return Intrinsics.areEqual(this.feedbackCreatedAt, mparViolationFeedback.feedbackCreatedAt) && this.feedbackId == mparViolationFeedback.feedbackId && Intrinsics.areEqual(this.feedbackRemarks, mparViolationFeedback.feedbackRemarks) && this.feedbackViolationId == mparViolationFeedback.feedbackViolationId;
    }

    public final String getFeedbackCreatedAt() {
        return this.feedbackCreatedAt;
    }

    public final int getFeedbackId() {
        return this.feedbackId;
    }

    public final String getFeedbackRemarks() {
        return this.feedbackRemarks;
    }

    public final int getFeedbackViolationId() {
        return this.feedbackViolationId;
    }

    public int hashCode() {
        return (((((this.feedbackCreatedAt.hashCode() * 31) + Integer.hashCode(this.feedbackId)) * 31) + this.feedbackRemarks.hashCode()) * 31) + Integer.hashCode(this.feedbackViolationId);
    }

    public String toString() {
        return "MparViolationFeedback(feedbackCreatedAt=" + this.feedbackCreatedAt + ", feedbackId=" + this.feedbackId + ", feedbackRemarks=" + this.feedbackRemarks + ", feedbackViolationId=" + this.feedbackViolationId + ')';
    }
}
