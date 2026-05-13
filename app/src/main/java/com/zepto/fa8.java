package com.zepto;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class fa8 extends ng8 {
    public final String a;
    public final long b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final byte[] f;

    public fa8(String str, long j, int i, boolean z, boolean z2, byte[] bArr) {
        this.a = str;
        this.b = j;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = bArr;
    }

    @Override // com.zepto.ng8
    public final int a() {
        return this.c;
    }

    @Override // com.zepto.ng8
    public final long b() {
        return this.b;
    }

    @Override // com.zepto.ng8
    public final String c() {
        return this.a;
    }

    @Override // com.zepto.ng8
    public final boolean d() {
        return this.e;
    }

    @Override // com.zepto.ng8
    public final boolean e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ng8) {
            ng8 ng8Var = (ng8) obj;
            String str = this.a;
            if (str != null ? str.equals(ng8Var.c()) : ng8Var.c() == null) {
                if (this.b == ng8Var.b() && this.c == ng8Var.a() && this.d == ng8Var.e() && this.e == ng8Var.d()) {
                    if (Arrays.equals(this.f, ng8Var instanceof fa8 ? ((fa8) ng8Var).f : ng8Var.f())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.zepto.ng8
    public final byte[] f() {
        return this.f;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        return ((((((((((iHashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ Arrays.hashCode(this.f);
    }

    public final String toString() {
        String str = this.a;
        long j = this.b;
        int i = this.c;
        boolean z = this.d;
        boolean z2 = this.e;
        String string = Arrays.toString(this.f);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 126 + String.valueOf(string).length());
        sb.append("ZipEntry{name=");
        sb.append(str);
        sb.append(", size=");
        sb.append(j);
        sb.append(", compressionMethod=");
        sb.append(i);
        sb.append(", isPartial=");
        sb.append(z);
        sb.append(", isEndOfArchive=");
        sb.append(z2);
        sb.append(", headerBytes=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
