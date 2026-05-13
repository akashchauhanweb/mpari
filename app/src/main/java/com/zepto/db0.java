package com.zepto;

import android.os.CancellationSignal;

/* JADX INFO: loaded from: classes.dex */
public final class db0 {
    public boolean a;
    public b b;
    public Object c;
    public boolean d;

    public static class a {
        public static void a(Object obj) {
            ((CancellationSignal) obj).cancel();
        }

        public static CancellationSignal b() {
            return new CancellationSignal();
        }
    }

    public interface b {
        void a();
    }

    public void a() {
        synchronized (this) {
            try {
                if (this.a) {
                    return;
                }
                this.a = true;
                this.d = true;
                b bVar = this.b;
                Object obj = this.c;
                if (bVar != null) {
                    try {
                        bVar.a();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.d = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (obj != null) {
                    a.a(obj);
                }
                synchronized (this) {
                    this.d = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }

    public Object b() {
        Object obj;
        synchronized (this) {
            try {
                if (this.c == null) {
                    CancellationSignal cancellationSignalB = a.b();
                    this.c = cancellationSignalB;
                    if (this.a) {
                        a.a(cancellationSignalB);
                    }
                }
                obj = this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public void c(b bVar) {
        synchronized (this) {
            try {
                d();
                if (this.b == bVar) {
                    return;
                }
                this.b = bVar;
                if (this.a && bVar != null) {
                    bVar.a();
                }
            } finally {
            }
        }
    }

    public final void d() {
        while (this.d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }
}
