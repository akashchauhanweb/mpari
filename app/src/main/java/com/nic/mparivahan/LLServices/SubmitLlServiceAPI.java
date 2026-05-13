package com.nic.mparivahan.LLServices;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\b\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/nic/mparivahan/LLServices/SubmitLlServiceAPI;", "", "applicationNumber", "", "dateOfBirth", "msg", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApplicationNumber", "()Ljava/lang/String;", "getDateOfBirth", "setDateOfBirth", "(Ljava/lang/String;)V", "getMsg", "setMsg", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SubmitLlServiceAPI {
    private final String applicationNumber;
    private String dateOfBirth;
    private String msg;

    public SubmitLlServiceAPI(String applicationNumber, String dateOfBirth, String msg) {
        Intrinsics.checkNotNullParameter(applicationNumber, "applicationNumber");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.applicationNumber = applicationNumber;
        this.dateOfBirth = dateOfBirth;
        this.msg = msg;
    }

    public static /* synthetic */ SubmitLlServiceAPI copy$default(SubmitLlServiceAPI submitLlServiceAPI, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = submitLlServiceAPI.applicationNumber;
        }
        if ((i & 2) != 0) {
            str2 = submitLlServiceAPI.dateOfBirth;
        }
        if ((i & 4) != 0) {
            str3 = submitLlServiceAPI.msg;
        }
        return submitLlServiceAPI.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApplicationNumber() {
        return this.applicationNumber;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    public final SubmitLlServiceAPI copy(String applicationNumber, String dateOfBirth, String msg) {
        Intrinsics.checkNotNullParameter(applicationNumber, "applicationNumber");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(msg, "msg");
        return new SubmitLlServiceAPI(applicationNumber, dateOfBirth, msg);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubmitLlServiceAPI)) {
            return false;
        }
        SubmitLlServiceAPI submitLlServiceAPI = (SubmitLlServiceAPI) other;
        return Intrinsics.areEqual(this.applicationNumber, submitLlServiceAPI.applicationNumber) && Intrinsics.areEqual(this.dateOfBirth, submitLlServiceAPI.dateOfBirth) && Intrinsics.areEqual(this.msg, submitLlServiceAPI.msg);
    }

    public final String getApplicationNumber() {
        return this.applicationNumber;
    }

    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final String getMsg() {
        return this.msg;
    }

    public int hashCode() {
        return (((this.applicationNumber.hashCode() * 31) + this.dateOfBirth.hashCode()) * 31) + this.msg.hashCode();
    }

    public final void setDateOfBirth(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dateOfBirth = str;
    }

    public final void setMsg(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.msg = str;
    }

    public String toString() {
        return "SubmitLlServiceAPI(applicationNumber=" + this.applicationNumber + ", dateOfBirth=" + this.dateOfBirth + ", msg=" + this.msg + ')';
    }
}
