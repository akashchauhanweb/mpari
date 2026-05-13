package com.zepto;

import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class q53 extends e53 {
    public final Object c;

    public q53(Boolean bool) {
        Objects.requireNonNull(bool);
        this.c = bool;
    }

    public static boolean T(q53 q53Var) {
        Object obj = q53Var.c;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public boolean B() {
        return P() ? ((Boolean) this.c).booleanValue() : Boolean.parseBoolean(O());
    }

    public Number D() {
        Object obj = this.c;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new jb3((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public String O() {
        Object obj = this.c;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (a0()) {
            return D().toString();
        }
        if (P()) {
            return ((Boolean) this.c).toString();
        }
        throw new AssertionError("Unexpected value type: " + this.c.getClass());
    }

    public boolean P() {
        return this.c instanceof Boolean;
    }

    public boolean a0() {
        return this.c instanceof Number;
    }

    public boolean d0() {
        return this.c instanceof String;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q53.class != obj.getClass()) {
            return false;
        }
        q53 q53Var = (q53) obj;
        if (this.c == null) {
            return q53Var.c == null;
        }
        if (T(this) && T(q53Var)) {
            return D().longValue() == q53Var.D().longValue();
        }
        Object obj2 = this.c;
        if (!(obj2 instanceof Number) || !(q53Var.c instanceof Number)) {
            return obj2.equals(q53Var.c);
        }
        double dDoubleValue = D().doubleValue();
        double dDoubleValue2 = q53Var.D().doubleValue();
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public int hashCode() {
        long jDoubleToLongBits;
        if (this.c == null) {
            return 31;
        }
        if (T(this)) {
            jDoubleToLongBits = D().longValue();
        } else {
            Object obj = this.c;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(D().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    public q53(Number number) {
        Objects.requireNonNull(number);
        this.c = number;
    }

    public q53(String str) {
        Objects.requireNonNull(str);
        this.c = str;
    }
}
