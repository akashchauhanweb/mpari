package com.zepto;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes2.dex */
public final class jb3 extends Number {
    public final String c;

    public jb3(String str) {
        this.c = str;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jb3)) {
            return false;
        }
        String str = this.c;
        String str2 = ((jb3) obj).c;
        return str == str2 || str.equals(str2);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.c);
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.c);
            } catch (NumberFormatException unused) {
                return new BigDecimal(this.c).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(this.c);
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.c);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.c).longValue();
        }
    }

    public String toString() {
        return this.c;
    }
}
