package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class da8 extends gg8 {
    public final int a;
    public final String b;
    public final long c;
    public final long d;
    public final int e;

    public da8(int i, String str, long j, long j2, int i2) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = i2;
    }

    @Override // com.zepto.gg8
    public final int a() {
        return this.a;
    }

    @Override // com.zepto.gg8
    public final int b() {
        return this.e;
    }

    @Override // com.zepto.gg8
    public final long c() {
        return this.c;
    }

    @Override // com.zepto.gg8
    public final long d() {
        return this.d;
    }

    @Override // com.zepto.gg8
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof gg8) {
            gg8 gg8Var = (gg8) obj;
            if (this.a == gg8Var.a() && ((str = this.b) != null ? str.equals(gg8Var.e()) : gg8Var.e() == null) && this.c == gg8Var.c() && this.d == gg8Var.d() && this.e == gg8Var.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.a ^ 1000003) * 1000003;
        String str = this.b;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.c;
        long j2 = this.d;
        return ((((((i ^ iHashCode) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.e;
    }

    public final String toString() {
        int i = this.a;
        String str = this.b;
        long j = this.c;
        long j2 = this.d;
        int i2 = this.e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 157);
        sb.append("SliceCheckpoint{fileExtractionStatus=");
        sb.append(i);
        sb.append(", filePath=");
        sb.append(str);
        sb.append(", fileOffset=");
        sb.append(j);
        sb.append(", remainingBytes=");
        sb.append(j2);
        sb.append(", previousChunk=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
