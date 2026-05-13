package com.zepto;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class x53 extends b63 {
    public static final Writer s = new a();
    public static final r53 t = new r53("closed");
    public final List p;
    public String q;
    public f53 r;

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

    public x53() {
        super(s);
        this.p = new ArrayList();
        this.r = k53.c;
    }

    @Override // com.zepto.b63
    public b63 B() {
        if (this.p.isEmpty() || this.q != null) {
            throw new IllegalStateException();
        }
        if (!(N0() instanceof m53)) {
            throw new IllegalStateException();
        }
        this.p.remove(r0.size() - 1);
        return this;
    }

    @Override // com.zepto.b63
    public b63 F0(double d) {
        if (U() || !(Double.isNaN(d) || Double.isInfinite(d))) {
            O0(new r53(Double.valueOf(d)));
            return this;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
    }

    @Override // com.zepto.b63
    public b63 G0(long j) {
        O0(new r53(Long.valueOf(j)));
        return this;
    }

    @Override // com.zepto.b63
    public b63 H0(Boolean bool) {
        if (bool == null) {
            return m0();
        }
        O0(new r53(bool));
        return this;
    }

    @Override // com.zepto.b63
    public b63 I0(Number number) {
        if (number == null) {
            return m0();
        }
        if (!U()) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        O0(new r53(number));
        return this;
    }

    @Override // com.zepto.b63
    public b63 J0(String str) {
        if (str == null) {
            return m0();
        }
        O0(new r53(str));
        return this;
    }

    @Override // com.zepto.b63
    public b63 K0(boolean z) {
        O0(new r53(Boolean.valueOf(z)));
        return this;
    }

    public f53 M0() {
        if (this.p.isEmpty()) {
            return this.r;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.p);
    }

    public final f53 N0() {
        return (f53) this.p.get(r0.size() - 1);
    }

    public final void O0(f53 f53Var) {
        if (this.q != null) {
            if (!f53Var.w() || D()) {
                ((m53) N0()).D(this.q, f53Var);
            }
            this.q = null;
            return;
        }
        if (this.p.isEmpty()) {
            this.r = f53Var;
            return;
        }
        f53 f53VarN0 = N0();
        if (!(f53VarN0 instanceof z43)) {
            throw new IllegalStateException();
        }
        ((z43) f53VarN0).D(f53Var);
    }

    @Override // com.zepto.b63, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.p.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.p.add(t);
    }

    @Override // com.zepto.b63
    public b63 e0(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.p.isEmpty() || this.q != null) {
            throw new IllegalStateException();
        }
        if (!(N0() instanceof m53)) {
            throw new IllegalStateException();
        }
        this.q = str;
        return this;
    }

    @Override // com.zepto.b63, java.io.Flushable
    public void flush() {
    }

    @Override // com.zepto.b63
    public b63 j() {
        z43 z43Var = new z43();
        O0(z43Var);
        this.p.add(z43Var);
        return this;
    }

    @Override // com.zepto.b63
    public b63 m() {
        m53 m53Var = new m53();
        O0(m53Var);
        this.p.add(m53Var);
        return this;
    }

    @Override // com.zepto.b63
    public b63 m0() {
        O0(k53.c);
        return this;
    }

    @Override // com.zepto.b63
    public b63 w() {
        if (this.p.isEmpty() || this.q != null) {
            throw new IllegalStateException();
        }
        if (!(N0() instanceof z43)) {
            throw new IllegalStateException();
        }
        this.p.remove(r0.size() - 1);
        return this;
    }
}
