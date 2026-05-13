package com.nic.mparivahan.Welcome.Model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/nic/mparivahan/Welcome/Model/NapixTokenModel;", "", "access_token", "", "consented_on", "", "expires_in", "scope", "token_type", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V", "getAccess_token", "()Ljava/lang/String;", "getConsented_on", "()I", "getExpires_in", "getScope", "getToken_type", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class NapixTokenModel {
    private final String access_token;
    private final int consented_on;
    private final int expires_in;
    private final String scope;
    private final String token_type;

    public NapixTokenModel(String access_token, int i, int i2, String scope, String token_type) {
        Intrinsics.checkNotNullParameter(access_token, "access_token");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(token_type, "token_type");
        this.access_token = access_token;
        this.consented_on = i;
        this.expires_in = i2;
        this.scope = scope;
        this.token_type = token_type;
    }

    public static /* synthetic */ NapixTokenModel copy$default(NapixTokenModel napixTokenModel, String str, int i, int i2, String str2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = napixTokenModel.access_token;
        }
        if ((i3 & 2) != 0) {
            i = napixTokenModel.consented_on;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = napixTokenModel.expires_in;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            str2 = napixTokenModel.scope;
        }
        String str4 = str2;
        if ((i3 & 16) != 0) {
            str3 = napixTokenModel.token_type;
        }
        return napixTokenModel.copy(str, i4, i5, str4, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccess_token() {
        return this.access_token;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getConsented_on() {
        return this.consented_on;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getExpires_in() {
        return this.expires_in;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getScope() {
        return this.scope;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getToken_type() {
        return this.token_type;
    }

    public final NapixTokenModel copy(String access_token, int consented_on, int expires_in, String scope, String token_type) {
        Intrinsics.checkNotNullParameter(access_token, "access_token");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(token_type, "token_type");
        return new NapixTokenModel(access_token, consented_on, expires_in, scope, token_type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NapixTokenModel)) {
            return false;
        }
        NapixTokenModel napixTokenModel = (NapixTokenModel) other;
        return Intrinsics.areEqual(this.access_token, napixTokenModel.access_token) && this.consented_on == napixTokenModel.consented_on && this.expires_in == napixTokenModel.expires_in && Intrinsics.areEqual(this.scope, napixTokenModel.scope) && Intrinsics.areEqual(this.token_type, napixTokenModel.token_type);
    }

    public final String getAccess_token() {
        return this.access_token;
    }

    public final int getConsented_on() {
        return this.consented_on;
    }

    public final int getExpires_in() {
        return this.expires_in;
    }

    public final String getScope() {
        return this.scope;
    }

    public final String getToken_type() {
        return this.token_type;
    }

    public int hashCode() {
        return (((((((this.access_token.hashCode() * 31) + Integer.hashCode(this.consented_on)) * 31) + Integer.hashCode(this.expires_in)) * 31) + this.scope.hashCode()) * 31) + this.token_type.hashCode();
    }

    public String toString() {
        return "NapixTokenModel(access_token=" + this.access_token + ", consented_on=" + this.consented_on + ", expires_in=" + this.expires_in + ", scope=" + this.scope + ", token_type=" + this.token_type + ')';
    }
}
