package com.zepto;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c66 {
    private String sslexpirydate;
    private boolean sslflag;
    private String sslpublickey;

    public c66(String sslexpirydate, String sslpublickey, boolean z) {
        Intrinsics.checkNotNullParameter(sslexpirydate, "sslexpirydate");
        Intrinsics.checkNotNullParameter(sslpublickey, "sslpublickey");
        this.sslexpirydate = sslexpirydate;
        this.sslpublickey = sslpublickey;
        this.sslflag = z;
    }

    public static /* synthetic */ c66 copy$default(c66 c66Var, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c66Var.sslexpirydate;
        }
        if ((i & 2) != 0) {
            str2 = c66Var.sslpublickey;
        }
        if ((i & 4) != 0) {
            z = c66Var.sslflag;
        }
        return c66Var.copy(str, str2, z);
    }

    public final String component1() {
        return this.sslexpirydate;
    }

    public final String component2() {
        return this.sslpublickey;
    }

    public final boolean component3() {
        return this.sslflag;
    }

    public final c66 copy(String sslexpirydate, String sslpublickey, boolean z) {
        Intrinsics.checkNotNullParameter(sslexpirydate, "sslexpirydate");
        Intrinsics.checkNotNullParameter(sslpublickey, "sslpublickey");
        return new c66(sslexpirydate, sslpublickey, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c66)) {
            return false;
        }
        c66 c66Var = (c66) obj;
        return Intrinsics.areEqual(this.sslexpirydate, c66Var.sslexpirydate) && Intrinsics.areEqual(this.sslpublickey, c66Var.sslpublickey) && this.sslflag == c66Var.sslflag;
    }

    public final String getSslexpirydate() {
        return this.sslexpirydate;
    }

    public final boolean getSslflag() {
        return this.sslflag;
    }

    public final String getSslpublickey() {
        return this.sslpublickey;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public int hashCode() {
        int iHashCode = ((this.sslexpirydate.hashCode() * 31) + this.sslpublickey.hashCode()) * 31;
        boolean z = this.sslflag;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final void setSslexpirydate(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sslexpirydate = str;
    }

    public final void setSslflag(boolean z) {
        this.sslflag = z;
    }

    public final void setSslpublickey(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sslpublickey = str;
    }

    public String toString() {
        return "SslDetails(sslexpirydate=" + this.sslexpirydate + ", sslpublickey=" + this.sslpublickey + ", sslflag=" + this.sslflag + ')';
    }
}
