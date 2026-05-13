package com.nic.mparivahan.Language.Modle;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/nic/mparivahan/Language/Modle/LangJSON;", "", "text_code", "", "text_value", "(Ljava/lang/String;Ljava/lang/String;)V", "getText_code", "()Ljava/lang/String;", "getText_value", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class LangJSON {
    private final String text_code;
    private final String text_value;

    public LangJSON(String str, String str2) {
        this.text_code = str;
        this.text_value = str2;
    }

    public static /* synthetic */ LangJSON copy$default(LangJSON langJSON, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = langJSON.text_code;
        }
        if ((i & 2) != 0) {
            str2 = langJSON.text_value;
        }
        return langJSON.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText_code() {
        return this.text_code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getText_value() {
        return this.text_value;
    }

    public final LangJSON copy(String text_code, String text_value) {
        return new LangJSON(text_code, text_value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LangJSON)) {
            return false;
        }
        LangJSON langJSON = (LangJSON) other;
        return Intrinsics.areEqual(this.text_code, langJSON.text_code) && Intrinsics.areEqual(this.text_value, langJSON.text_value);
    }

    public final String getText_code() {
        return this.text_code;
    }

    public final String getText_value() {
        return this.text_value;
    }

    public int hashCode() {
        String str = this.text_code;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.text_value;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "LangJSON(text_code=" + this.text_code + ", text_value=" + this.text_value + ')';
    }
}
