package com.zepto;

import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public final class dl8 {
    public final Object a = new Object();
    public Queue b;
    public boolean c;

    public final void a(uk8 uk8Var) {
        synchronized (this.a) {
            try {
                if (this.b == null) {
                    this.b = new ArrayDeque();
                }
                this.b.add(uk8Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Task task) {
        uk8 uk8Var;
        synchronized (this.a) {
            if (this.b != null && !this.c) {
                this.c = true;
                while (true) {
                    synchronized (this.a) {
                        try {
                            uk8Var = (uk8) this.b.poll();
                            if (uk8Var == null) {
                                this.c = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    uk8Var.d(task);
                }
            }
        }
    }
}
