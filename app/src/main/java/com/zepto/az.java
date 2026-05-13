package com.zepto;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class az {
    public final boolean a;
    public final qy b;
    public final boolean c;

    public az(boolean z, qy attestation, boolean z2) {
        Intrinsics.checkNotNullParameter(attestation, "attestation");
        this.a = z;
        this.b = attestation;
        this.c = z2;
    }

    public final qy a() {
        return this.b;
    }

    public final boolean b() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az)) {
            return false;
        }
        az azVar = (az) obj;
        return this.a == azVar.a && Intrinsics.areEqual(this.b, azVar.b) && this.c == azVar.c;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.a) * 31) + this.b.hashCode()) * 31) + Boolean.hashCode(this.c);
    }

    public String toString() {
        return "AttestationResult(isStrongBox=" + this.a + ", attestation=" + this.b + ", isGoogleRootCertificate=" + this.c + ')';
    }
}
