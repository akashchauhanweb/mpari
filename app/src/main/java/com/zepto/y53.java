package com.zepto;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class y53 extends a63 {
    public static final Writer s = new a();
    public static final q53 t = new q53("closed");
    public final List p;
    public String q;
    public e53 r;

    public class a extends Writer {
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public y53() {
        super(s);
        this.p = new ArrayList();
        this.r = j53.c;
    }

    @Override // com.zepto.a63
    public a63 B() {
        if (this.p.isEmpty() || this.q != null) {
            throw new IllegalStateException();
        }
        if (!(N0() instanceof l53)) {
            throw new IllegalStateException();
        }
        this.p.remove(r0.size() - 1);
        return this;
    }

    @Override // com.zepto.a63
    public a63 F0(double d) {
        if (U() || !(Double.isNaN(d) || Double.isInfinite(d))) {
            O0(new q53(Double.valueOf(d)));
            return this;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
    }

    @Override // com.zepto.a63
    public a63 G0(long j) {
        O0(new q53(Long.valueOf(j)));
        return this;
    }

    @Override // com.zepto.a63
    public a63 H0(Boolean bool) {
        if (bool == null) {
            return m0();
        }
        O0(new q53(bool));
        return this;
    }

    @Override // com.zepto.a63
    public a63 I0(Number number) {
        if (number == null) {
            return m0();
        }
        if (!U()) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        O0(new q53(number));
        return this;
    }

    @Override // com.zepto.a63
    public a63 J0(String str) {
        if (str == null) {
            return m0();
        }
        O0(new q53(str));
        return this;
    }

    @Override // com.zepto.a63
    public a63 K0(boolean z) {
        O0(new q53(Boolean.valueOf(z)));
        return this;
    }

    public e53 M0() {
        if (this.p.isEmpty()) {
            return this.r;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.p);
    }

    public final e53 N0() {
        return (e53) this.p.get(r0.size() - 1);
    }

    public final void O0(e53 e53Var) {
        if (this.q != null) {
            if (!e53Var.u() || D()) {
                ((l53) N0()).B(this.q, e53Var);
            }
            this.q = null;
            return;
        }
        if (this.p.isEmpty()) {
            this.r = e53Var;
            return;
        }
        e53 e53VarN0 = N0();
        if (!(e53VarN0 instanceof y43)) {
            throw new IllegalStateException();
        }
        ((y43) e53VarN0).B(e53Var);
    }

    @Override // com.zepto.a63, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.p.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.p.add(t);
    }

    @Override // com.zepto.a63
    public a63 e0(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.p.isEmpty() || this.q != null) {
            throw new IllegalStateException();
        }
        if (!(N0() instanceof l53)) {
            throw new IllegalStateException();
        }
        this.q = str;
        return this;
    }

    @Override // com.zepto.a63, java.io.Flushable
    public void flush() {
    }

    @Override // com.zepto.a63
    public a63 j() {
        y43 y43Var = new y43();
        O0(y43Var);
        this.p.add(y43Var);
        return this;
    }

    @Override // com.zepto.a63
    public a63 m() {
        l53 l53Var = new l53();
        O0(l53Var);
        this.p.add(l53Var);
        return this;
    }

    @Override // com.zepto.a63
    public a63 m0() {
        O0(j53.c);
        return this;
    }

    @Override // com.zepto.a63
    public a63 w() {
        if (this.p.isEmpty() || this.q != null) {
            throw new IllegalStateException();
        }
        if (!(N0() instanceof y43)) {
            throw new IllegalStateException();
        }
        this.p.remove(r0.size() - 1);
        return this;
    }
}
