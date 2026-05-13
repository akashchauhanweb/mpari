package com.nic.mparivahan.LLServices.GetLlPojo;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/nic/mparivahan/LLServices/GetLlPojo/LlFromState1;", "Ljava/io/Serializable;", "llFromState1Code", "", "llFromState1Name", "(Ljava/lang/String;Ljava/lang/String;)V", "getLlFromState1Code", "()Ljava/lang/String;", "getLlFromState1Name", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class LlFromState1 implements Serializable {
    private final String llFromState1Code;
    private final String llFromState1Name;

    public LlFromState1(String llFromState1Code, String llFromState1Name) {
        Intrinsics.checkNotNullParameter(llFromState1Code, "llFromState1Code");
        Intrinsics.checkNotNullParameter(llFromState1Name, "llFromState1Name");
        this.llFromState1Code = llFromState1Code;
        this.llFromState1Name = llFromState1Name;
    }

    public static /* synthetic */ LlFromState1 copy$default(LlFromState1 llFromState1, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = llFromState1.llFromState1Code;
        }
        if ((i & 2) != 0) {
            str2 = llFromState1.llFromState1Name;
        }
        return llFromState1.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLlFromState1Code() {
        return this.llFromState1Code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLlFromState1Name() {
        return this.llFromState1Name;
    }

    public final LlFromState1 copy(String llFromState1Code, String llFromState1Name) {
        Intrinsics.checkNotNullParameter(llFromState1Code, "llFromState1Code");
        Intrinsics.checkNotNullParameter(llFromState1Name, "llFromState1Name");
        return new LlFromState1(llFromState1Code, llFromState1Name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LlFromState1)) {
            return false;
        }
        LlFromState1 llFromState1 = (LlFromState1) other;
        return Intrinsics.areEqual(this.llFromState1Code, llFromState1.llFromState1Code) && Intrinsics.areEqual(this.llFromState1Name, llFromState1.llFromState1Name);
    }

    public final String getLlFromState1Code() {
        return this.llFromState1Code;
    }

    public final String getLlFromState1Name() {
        return this.llFromState1Name;
    }

    public int hashCode() {
        return (this.llFromState1Code.hashCode() * 31) + this.llFromState1Name.hashCode();
    }

    public String toString() {
        return "LlFromState1(llFromState1Code=" + this.llFromState1Code + ", llFromState1Name=" + this.llFromState1Name + ')';
    }
}
