package com.nic.mparivahan.dlservices.DupChangeAdd.DupChangeAddModel;

import androidx.annotation.Keep;
import com.zepto.xy5;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/nic/mparivahan/dlservices/DupChangeAdd/DupChangeAddModel/ServicesRequested;", "Ljava/io/Serializable;", "513", "", "515", "(Ljava/lang/String;Ljava/lang/String;)V", "get513", "()Ljava/lang/String;", "get515", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ServicesRequested implements Serializable {

    @xy5("513")
    private final String 513;

    @xy5("515")
    private final String 515;

    public ServicesRequested(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "513");
        Intrinsics.checkNotNullParameter(str2, "515");
        this.513 = str;
        this.515 = str2;
    }

    public static /* synthetic */ ServicesRequested copy$default(ServicesRequested servicesRequested, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = servicesRequested.513;
        }
        if ((i & 2) != 0) {
            str2 = servicesRequested.515;
        }
        return servicesRequested.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String get513() {
        return this.513;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String get515() {
        return this.515;
    }

    public final ServicesRequested copy(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "513");
        Intrinsics.checkNotNullParameter(str2, "515");
        return new ServicesRequested(str, str2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServicesRequested)) {
            return false;
        }
        ServicesRequested servicesRequested = (ServicesRequested) other;
        return Intrinsics.areEqual(this.513, servicesRequested.513) && Intrinsics.areEqual(this.515, servicesRequested.515);
    }

    public final String get513() {
        return this.513;
    }

    public final String get515() {
        return this.515;
    }

    public int hashCode() {
        return (this.513.hashCode() * 31) + this.515.hashCode();
    }

    public String toString() {
        return "ServicesRequested(513=" + this.513 + ", 515=" + this.515 + ')';
    }
}
