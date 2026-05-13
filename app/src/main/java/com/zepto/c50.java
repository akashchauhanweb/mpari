package com.zepto;

import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class c50 implements hy0, Iterator, Closeable {
    public static final p70 i = new a("eof ");
    public static sn3 j = sn3.a(c50.class);
    public p70 c = null;
    public long e = 0;
    public long f = 0;
    public long g = 0;
    public List h = new ArrayList();

    public class a extends c2 {
        public a(String str) {
            super(str);
        }

        @Override // com.zepto.c2
        public void a(ByteBuffer byteBuffer) {
        }

        @Override // com.zepto.c2
        public void b(ByteBuffer byteBuffer) {
        }

        @Override // com.zepto.c2
        public long c() {
            return 0L;
        }
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public p70 next() {
        p70 p70Var = this.c;
        if (p70Var == null || p70Var == i) {
            this.c = i;
            throw new NoSuchElementException();
        }
        this.c = null;
        return p70Var;
    }

    public final void D(WritableByteChannel writableByteChannel) {
        Iterator it = n().iterator();
        while (it.hasNext()) {
            ((p70) it.next()).e(writableByteChannel);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw null;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        p70 p70Var = this.c;
        if (p70Var == i) {
            return false;
        }
        if (p70Var != null) {
            return true;
        }
        try {
            this.c = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.c = i;
            return false;
        }
    }

    public void m(p70 p70Var) {
        if (p70Var != null) {
            this.h = new ArrayList(n());
            p70Var.d(this);
            this.h.add(p70Var);
        }
    }

    public List n() {
        return this.h;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            if (i2 > 0) {
                sb.append(";");
            }
            sb.append(((p70) this.h.get(i2)).toString());
        }
        sb.append("]");
        return sb.toString();
    }

    public long w() {
        long j2 = 0;
        for (int i2 = 0; i2 < n().size(); i2++) {
            j2 += ((p70) this.h.get(i2)).j();
        }
        return j2;
    }
}
