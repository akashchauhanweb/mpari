package com.nic.mparivahan.ClServices.Pojo.NewClPojo;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/nic/mparivahan/ClServices/Pojo/NewClPojo/SpinnerPojo;", "", "code", "", "name", "(Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SpinnerPojo {
    private final String code;
    private final String name;

    public SpinnerPojo(String code, String name) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(name, "name");
        this.code = code;
        this.name = name;
    }

    public static /* synthetic */ SpinnerPojo copy$default(SpinnerPojo spinnerPojo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spinnerPojo.code;
        }
        if ((i & 2) != 0) {
            str2 = spinnerPojo.name;
        }
        return spinnerPojo.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final SpinnerPojo copy(String code, String name) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(name, "name");
        return new SpinnerPojo(code, name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpinnerPojo)) {
            return false;
        }
        SpinnerPojo spinnerPojo = (SpinnerPojo) other;
        return Intrinsics.areEqual(this.code, spinnerPojo.code) && Intrinsics.areEqual(this.name, spinnerPojo.name);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (this.code.hashCode() * 31) + this.name.hashCode();
    }

    public String toString() {
        return "SpinnerPojo(code=" + this.code + ", name=" + this.name + ')';
    }
}
