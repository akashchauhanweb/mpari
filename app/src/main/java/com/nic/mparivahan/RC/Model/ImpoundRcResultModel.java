package com.nic.mparivahan.RC.Model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/nic/mparivahan/RC/Model/ImpoundRcResultModel;", "", "impound_type", "", "document", "doc_impound_type", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDoc_impound_type", "()Ljava/lang/String;", "getDocument", "getImpound_type", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ImpoundRcResultModel {
    private final String doc_impound_type;
    private final String document;
    private final String impound_type;

    public ImpoundRcResultModel() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ ImpoundRcResultModel copy$default(ImpoundRcResultModel impoundRcResultModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = impoundRcResultModel.impound_type;
        }
        if ((i & 2) != 0) {
            str2 = impoundRcResultModel.document;
        }
        if ((i & 4) != 0) {
            str3 = impoundRcResultModel.doc_impound_type;
        }
        return impoundRcResultModel.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getImpound_type() {
        return this.impound_type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDocument() {
        return this.document;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDoc_impound_type() {
        return this.doc_impound_type;
    }

    public final ImpoundRcResultModel copy(String impound_type, String document, String doc_impound_type) {
        Intrinsics.checkNotNullParameter(impound_type, "impound_type");
        Intrinsics.checkNotNullParameter(document, "document");
        Intrinsics.checkNotNullParameter(doc_impound_type, "doc_impound_type");
        return new ImpoundRcResultModel(impound_type, document, doc_impound_type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImpoundRcResultModel)) {
            return false;
        }
        ImpoundRcResultModel impoundRcResultModel = (ImpoundRcResultModel) other;
        return Intrinsics.areEqual(this.impound_type, impoundRcResultModel.impound_type) && Intrinsics.areEqual(this.document, impoundRcResultModel.document) && Intrinsics.areEqual(this.doc_impound_type, impoundRcResultModel.doc_impound_type);
    }

    public final String getDoc_impound_type() {
        return this.doc_impound_type;
    }

    public final String getDocument() {
        return this.document;
    }

    public final String getImpound_type() {
        return this.impound_type;
    }

    public int hashCode() {
        return (((this.impound_type.hashCode() * 31) + this.document.hashCode()) * 31) + this.doc_impound_type.hashCode();
    }

    public String toString() {
        return "ImpoundRcResultModel(impound_type=" + this.impound_type + ", document=" + this.document + ", doc_impound_type=" + this.doc_impound_type + ')';
    }

    public ImpoundRcResultModel(String impound_type, String document, String doc_impound_type) {
        Intrinsics.checkNotNullParameter(impound_type, "impound_type");
        Intrinsics.checkNotNullParameter(document, "document");
        Intrinsics.checkNotNullParameter(doc_impound_type, "doc_impound_type");
        this.impound_type = impound_type;
        this.document = document;
        this.doc_impound_type = doc_impound_type;
    }

    public /* synthetic */ ImpoundRcResultModel(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
