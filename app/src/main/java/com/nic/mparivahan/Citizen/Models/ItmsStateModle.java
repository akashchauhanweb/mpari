package com.nic.mparivahan.Citizen.Models;

import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u001d\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J;\u0010\u0012\u001a\u00020\u00002\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R%\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/nic/mparivahan/Citizen/Models/ItmsStateModle;", "Ljava/io/Serializable;", "data", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/Citizen/Models/DataX;", "Lkotlin/collections/ArrayList;", "status", "", "status_code", "(Ljava/util/ArrayList;II)V", "getData", "()Ljava/util/ArrayList;", "getStatus", "()I", "getStatus_code", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ItmsStateModle implements Serializable {
    private final ArrayList<DataX> data;
    private final int status;
    private final int status_code;

    public ItmsStateModle(ArrayList<DataX> arrayList, int i, int i2) {
        this.data = arrayList;
        this.status = i;
        this.status_code = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ItmsStateModle copy$default(ItmsStateModle itmsStateModle, ArrayList arrayList, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            arrayList = itmsStateModle.data;
        }
        if ((i3 & 2) != 0) {
            i = itmsStateModle.status;
        }
        if ((i3 & 4) != 0) {
            i2 = itmsStateModle.status_code;
        }
        return itmsStateModle.copy(arrayList, i, i2);
    }

    public final ArrayList<DataX> component1() {
        return this.data;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getStatus_code() {
        return this.status_code;
    }

    public final ItmsStateModle copy(ArrayList<DataX> data, int status, int status_code) {
        return new ItmsStateModle(data, status, status_code);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItmsStateModle)) {
            return false;
        }
        ItmsStateModle itmsStateModle = (ItmsStateModle) other;
        return Intrinsics.areEqual(this.data, itmsStateModle.data) && this.status == itmsStateModle.status && this.status_code == itmsStateModle.status_code;
    }

    public final ArrayList<DataX> getData() {
        return this.data;
    }

    public final int getStatus() {
        return this.status;
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    public int hashCode() {
        ArrayList<DataX> arrayList = this.data;
        return ((((arrayList == null ? 0 : arrayList.hashCode()) * 31) + Integer.hashCode(this.status)) * 31) + Integer.hashCode(this.status_code);
    }

    public String toString() {
        return "ItmsStateModle(data=" + this.data + ", status=" + this.status + ", status_code=" + this.status_code + ')';
    }
}
