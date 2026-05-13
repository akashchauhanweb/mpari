package com.nic.mparivahan.Citizen.Models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/nic/mparivahan/Citizen/Models/Data;", "", "vhClass", "", "vhClassDescription", "", "(ILjava/lang/String;)V", "getVhClass", "()I", "getVhClassDescription", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Data {
    private final int vhClass;
    private final String vhClassDescription;

    public Data(int i, String vhClassDescription) {
        Intrinsics.checkNotNullParameter(vhClassDescription, "vhClassDescription");
        this.vhClass = i;
        this.vhClassDescription = vhClassDescription;
    }

    public static /* synthetic */ Data copy$default(Data data, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = data.vhClass;
        }
        if ((i2 & 2) != 0) {
            str = data.vhClassDescription;
        }
        return data.copy(i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getVhClass() {
        return this.vhClass;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVhClassDescription() {
        return this.vhClassDescription;
    }

    public final Data copy(int vhClass, String vhClassDescription) {
        Intrinsics.checkNotNullParameter(vhClassDescription, "vhClassDescription");
        return new Data(vhClass, vhClassDescription);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Data)) {
            return false;
        }
        Data data = (Data) other;
        return this.vhClass == data.vhClass && Intrinsics.areEqual(this.vhClassDescription, data.vhClassDescription);
    }

    public final int getVhClass() {
        return this.vhClass;
    }

    public final String getVhClassDescription() {
        return this.vhClassDescription;
    }

    public int hashCode() {
        return (Integer.hashCode(this.vhClass) * 31) + this.vhClassDescription.hashCode();
    }

    public String toString() {
        return "Data(vhClass=" + this.vhClass + ", vhClassDescription=" + this.vhClassDescription + ')';
    }
}
