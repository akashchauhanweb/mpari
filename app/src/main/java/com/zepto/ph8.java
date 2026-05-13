package com.zepto;

import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public final class ph8 {
    public final Object a = new Object();
    public Queue b;
    public boolean c;

    public final void a(yg8 yg8Var) {
        synchronized (this.a) {
            try {
                if (this.b == null) {
                    this.b = new ArrayDeque();
                }
                this.b.add(yg8Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(pc6 pc6Var) {
        yg8 yg8Var;
        synchronized (this.a) {
            if (this.b != null && !this.c) {
                this.c = true;
                while (true) {
                    synchronized (this.a) {
                        try {
                            yg8Var = (yg8) this.b.poll();
                            if (yg8Var == null) {
                                this.c = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    yg8Var.a(pc6Var);
                }
            }
        }
    }
}
