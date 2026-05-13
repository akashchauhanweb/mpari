package com.zepto;

import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class r53 extends f53 {
    public final Object c;

    public r53(Boolean bool) {
        Objects.requireNonNull(bool);
        this.c = bool;
    }

    public static boolean e0(r53 r53Var) {
        Object obj = r53Var.c;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public boolean D() {
        return d0() ? ((Boolean) this.c).booleanValue() : Boolean.parseBoolean(r());
    }

    public double O() {
        return f0() ? a0().doubleValue() : Double.parseDouble(r());
    }

    public int P() {
        return f0() ? a0().intValue() : Integer.parseInt(r());
    }

    public long T() {
        return f0() ? a0().longValue() : Long.parseLong(r());
    }

    public Number a0() {
        Object obj = this.c;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new kb3((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public boolean d0() {
        return this.c instanceof Boolean;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r53.class != obj.getClass()) {
            return false;
        }
        r53 r53Var = (r53) obj;
        if (this.c == null) {
            return r53Var.c == null;
        }
        if (e0(this) && e0(r53Var)) {
            return a0().longValue() == r53Var.a0().longValue();
        }
        Object obj2 = this.c;
        if (!(obj2 instanceof Number) || !(r53Var.c instanceof Number)) {
            return obj2.equals(r53Var.c);
        }
        double dDoubleValue = a0().doubleValue();
        double dDoubleValue2 = r53Var.a0().doubleValue();
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public boolean f0() {
        return this.c instanceof Number;
    }

    public boolean g0() {
        return this.c instanceof String;
    }

    public int hashCode() {
        long jDoubleToLongBits;
        if (this.c == null) {
            return 31;
        }
        if (e0(this)) {
            jDoubleToLongBits = a0().longValue();
        } else {
            Object obj = this.c;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(a0().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    @Override // com.zepto.f53
    public String r() {
        Object obj = this.c;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (f0()) {
            return a0().toString();
        }
        if (d0()) {
            return ((Boolean) this.c).toString();
        }
        throw new AssertionError("Unexpected value type: " + this.c.getClass());
    }

    public r53(Number number) {
        Objects.requireNonNull(number);
        this.c = number;
    }

    public r53(String str) {
        Objects.requireNonNull(str);
        this.c = str;
    }
}
