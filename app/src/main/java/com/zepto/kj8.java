package com.zepto;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class kj8 extends pc6 {
    public final Object a = new Object();
    public final ph8 b = new ph8();
    public boolean c;
    public Object d;
    public Exception e;

    @Override // com.zepto.pc6
    public final pc6 a(ig4 ig4Var) {
        this.b.a(new z88(wc6.a, ig4Var));
        o();
        return this;
    }

    @Override // com.zepto.pc6
    public final pc6 b(Executor executor, qg4 qg4Var) {
        this.b.a(new id8(executor, qg4Var));
        o();
        return this;
    }

    @Override // com.zepto.pc6
    public final pc6 c(dh4 dh4Var) {
        d(wc6.a, dh4Var);
        return this;
    }

    @Override // com.zepto.pc6
    public final pc6 d(Executor executor, dh4 dh4Var) {
        this.b.a(new wg8(executor, dh4Var));
        o();
        return this;
    }

    @Override // com.zepto.pc6
    public final Exception e() {
        Exception exc;
        synchronized (this.a) {
            exc = this.e;
        }
        return exc;
    }

    @Override // com.zepto.pc6
    public final Object f() {
        Object obj;
        synchronized (this.a) {
            try {
                m();
                Exception exc = this.e;
                if (exc != null) {
                    throw new ag5(exc);
                }
                obj = this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.zepto.pc6
    public final boolean g() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    @Override // com.zepto.pc6
    public final boolean h() {
        boolean z;
        synchronized (this.a) {
            try {
                z = false;
                if (this.c && this.e == null) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    public final void i(Exception exc) {
        synchronized (this.a) {
            n();
            this.c = true;
            this.e = exc;
        }
        this.b.b(this);
    }

    public final void j(Object obj) {
        synchronized (this.a) {
            n();
            this.c = true;
            this.d = obj;
        }
        this.b.b(this);
    }

    public final boolean k(Exception exc) {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return false;
                }
                this.c = true;
                this.e = exc;
                this.b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean l(Object obj) {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return false;
                }
                this.c = true;
                this.d = obj;
                this.b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m() {
        wb8.b(this.c, "Task is not yet complete");
    }

    public final void n() {
        wb8.b(!this.c, "Task is already complete");
    }

    public final void o() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    this.b.b(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
