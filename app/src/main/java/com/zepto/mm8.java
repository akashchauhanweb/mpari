package com.zepto;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class mm8 extends Task {
    public final Object a = new Object();
    public final dl8 b = new dl8();
    public boolean c;
    public volatile boolean d;
    public Object e;
    public Exception f;

    @Override // com.google.android.gms.tasks.Task
    public final Task a(Executor executor, hg4 hg4Var) {
        this.b.a(new nh8(executor, hg4Var));
        y();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task b(jg4 jg4Var) {
        this.b.a(new gi8(xc6.a, jg4Var));
        y();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task c(Executor executor, jg4 jg4Var) {
        this.b.a(new gi8(executor, jg4Var));
        y();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task d(rg4 rg4Var) {
        e(xc6.a, rg4Var);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task e(Executor executor, rg4 rg4Var) {
        this.b.a(new wi8(executor, rg4Var));
        y();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task f(eh4 eh4Var) {
        g(xc6.a, eh4Var);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task g(Executor executor, eh4 eh4Var) {
        this.b.a(new qj8(executor, eh4Var));
        y();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task h(Executor executor, cz0 cz0Var) {
        mm8 mm8Var = new mm8();
        this.b.a(new rd8(executor, cz0Var, mm8Var));
        y();
        return mm8Var;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task i(Executor executor, cz0 cz0Var) {
        mm8 mm8Var = new mm8();
        this.b.a(new tg8(executor, cz0Var, mm8Var));
        y();
        return mm8Var;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception j() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object k() {
        Object obj;
        synchronized (this.a) {
            try {
                v();
                w();
                Exception exc = this.f;
                if (exc != null) {
                    throw new bg5(exc);
                }
                obj = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object l(Class cls) {
        Object obj;
        synchronized (this.a) {
            try {
                v();
                w();
                if (cls.isInstance(this.f)) {
                    throw ((Throwable) cls.cast(this.f));
                }
                Exception exc = this.f;
                if (exc != null) {
                    throw new bg5(exc);
                }
                obj = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean m() {
        return this.d;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean n() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean o() {
        boolean z;
        synchronized (this.a) {
            try {
                z = false;
                if (this.c && !this.d && this.f == null) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task p(Executor executor, x86 x86Var) {
        mm8 mm8Var = new mm8();
        this.b.a(new kk8(executor, x86Var, mm8Var));
        y();
        return mm8Var;
    }

    public final void q(Exception exc) {
        iu4.j(exc, "Exception must not be null");
        synchronized (this.a) {
            x();
            this.c = true;
            this.f = exc;
        }
        this.b.b(this);
    }

    public final void r(Object obj) {
        synchronized (this.a) {
            x();
            this.c = true;
            this.e = obj;
        }
        this.b.b(this);
    }

    public final boolean s() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return false;
                }
                this.c = true;
                this.d = true;
                this.b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean t(Exception exc) {
        iu4.j(exc, "Exception must not be null");
        synchronized (this.a) {
            try {
                if (this.c) {
                    return false;
                }
                this.c = true;
                this.f = exc;
                this.b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean u(Object obj) {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return false;
                }
                this.c = true;
                this.e = obj;
                this.b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void v() {
        iu4.l(this.c, "Task is not yet complete");
    }

    public final void w() {
        if (this.d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    public final void x() {
        if (this.c) {
            throw ry1.a(this);
        }
    }

    public final void y() {
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
