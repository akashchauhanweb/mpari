package com.nic.mparivahan.Citizen.Models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/nic/mparivahan/Citizen/Models/MparAccidentFeedback;", "", "feedbackAccidentId", "", "feedbackCreatedAt", "", "feedbackId", "feedbackRemarks", "(ILjava/lang/String;ILjava/lang/String;)V", "getFeedbackAccidentId", "()I", "getFeedbackCreatedAt", "()Ljava/lang/String;", "getFeedbackId", "getFeedbackRemarks", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class MparAccidentFeedback {
    private final int feedbackAccidentId;
    private final String feedbackCreatedAt;
    private final int feedbackId;
    private final String feedbackRemarks;

    public MparAccidentFeedback(int i, String feedbackCreatedAt, int i2, String feedbackRemarks) {
        Intrinsics.checkNotNullParameter(feedbackCreatedAt, "feedbackCreatedAt");
        Intrinsics.checkNotNullParameter(feedbackRemarks, "feedbackRemarks");
        this.feedbackAccidentId = i;
        this.feedbackCreatedAt = feedbackCreatedAt;
        this.feedbackId = i2;
        this.feedbackRemarks = feedbackRemarks;
    }

    public static /* synthetic */ MparAccidentFeedback copy$default(MparAccidentFeedback mparAccidentFeedback, int i, String str, int i2, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = mparAccidentFeedback.feedbackAccidentId;
        }
        if ((i3 & 2) != 0) {
            str = mparAccidentFeedback.feedbackCreatedAt;
        }
        if ((i3 & 4) != 0) {
            i2 = mparAccidentFeedback.feedbackId;
        }
        if ((i3 & 8) != 0) {
            str2 = mparAccidentFeedback.feedbackRemarks;
        }
        return mparAccidentFeedback.copy(i, str, i2, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getFeedbackAccidentId() {
        return this.feedbackAccidentId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFeedbackCreatedAt() {
        return this.feedbackCreatedAt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getFeedbackId() {
        return this.feedbackId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFeedbackRemarks() {
        return this.feedbackRemarks;
    }

    public final MparAccidentFeedback copy(int feedbackAccidentId, String feedbackCreatedAt, int feedbackId, String feedbackRemarks) {
        Intrinsics.checkNotNullParameter(feedbackCreatedAt, "feedbackCreatedAt");
        Intrinsics.checkNotNullParameter(feedbackRemarks, "feedbackRemarks");
        return new MparAccidentFeedback(feedbackAccidentId, feedbackCreatedAt, feedbackId, feedbackRemarks);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MparAccidentFeedback)) {
            return false;
        }
        MparAccidentFeedback mparAccidentFeedback = (MparAccidentFeedback) other;
        return this.feedbackAccidentId == mparAccidentFeedback.feedbackAccidentId && Intrinsics.areEqual(this.feedbackCreatedAt, mparAccidentFeedback.feedbackCreatedAt) && this.feedbackId == mparAccidentFeedback.feedbackId && Intrinsics.areEqual(this.feedbackRemarks, mparAccidentFeedback.feedbackRemarks);
    }

    public final int getFeedbackAccidentId() {
        return this.feedbackAccidentId;
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

    public int hashCode() {
        return (((((Integer.hashCode(this.feedbackAccidentId) * 31) + this.feedbackCreatedAt.hashCode()) * 31) + Integer.hashCode(this.feedbackId)) * 31) + this.feedbackRemarks.hashCode();
    }

    public String toString() {
        return "MparAccidentFeedback(feedbackAccidentId=" + this.feedbackAccidentId + ", feedbackCreatedAt=" + this.feedbackCreatedAt + ", feedbackId=" + this.feedbackId + ", feedbackRemarks=" + this.feedbackRemarks + ')';
    }
}
