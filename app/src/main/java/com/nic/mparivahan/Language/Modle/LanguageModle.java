package com.nic.mparivahan.Language.Modle;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0001HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/nic/mparivahan/Language/Modle/LanguageModle;", "", "langJSON", "languages", "", "Lcom/nic/mparivahan/Language/Modle/Language;", "statusCode", "", "statusDesc", "(Ljava/lang/Object;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getLangJSON", "()Ljava/lang/Object;", "getLanguages", "()Ljava/util/List;", "getStatusCode", "()Ljava/lang/String;", "getStatusDesc", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class LanguageModle {
    private final Object langJSON;
    private final List<Language> languages;
    private final String statusCode;
    private final String statusDesc;

    public LanguageModle(Object langJSON, List<Language> languages, String statusCode, String statusDesc) {
        Intrinsics.checkNotNullParameter(langJSON, "langJSON");
        Intrinsics.checkNotNullParameter(languages, "languages");
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        this.langJSON = langJSON;
        this.languages = languages;
        this.statusCode = statusCode;
        this.statusDesc = statusDesc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LanguageModle copy$default(LanguageModle languageModle, Object obj, List list, String str, String str2, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = languageModle.langJSON;
        }
        if ((i & 2) != 0) {
            list = languageModle.languages;
        }
        if ((i & 4) != 0) {
            str = languageModle.statusCode;
        }
        if ((i & 8) != 0) {
            str2 = languageModle.statusDesc;
        }
        return languageModle.copy(obj, list, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Object getLangJSON() {
        return this.langJSON;
    }

    public final List<Language> component2() {
        return this.languages;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatusCode() {
        return this.statusCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final LanguageModle copy(Object langJSON, List<Language> languages, String statusCode, String statusDesc) {
        Intrinsics.checkNotNullParameter(langJSON, "langJSON");
        Intrinsics.checkNotNullParameter(languages, "languages");
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        return new LanguageModle(langJSON, languages, statusCode, statusDesc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LanguageModle)) {
            return false;
        }
        LanguageModle languageModle = (LanguageModle) other;
        return Intrinsics.areEqual(this.langJSON, languageModle.langJSON) && Intrinsics.areEqual(this.languages, languageModle.languages) && Intrinsics.areEqual(this.statusCode, languageModle.statusCode) && Intrinsics.areEqual(this.statusDesc, languageModle.statusDesc);
    }

    public final Object getLangJSON() {
        return this.langJSON;
    }

    public final List<Language> getLanguages() {
        return this.languages;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (((((this.langJSON.hashCode() * 31) + this.languages.hashCode()) * 31) + this.statusCode.hashCode()) * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "LanguageModle(langJSON=" + this.langJSON + ", languages=" + this.languages + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
