package com.zepto;

import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public final class pa8 implements Runnable {
    public final /* synthetic */ Task c;
    public final /* synthetic */ rd8 e;

    public pa8(rd8 rd8Var, Task task) {
        this.e = rd8Var;
        this.c = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c.m()) {
            this.e.c.s();
            return;
        }
        try {
            this.e.c.r(this.e.b.a(this.c));
        } catch (bg5 e) {
            if (e.getCause() instanceof Exception) {
                this.e.c.q((Exception) e.getCause());
            } else {
                this.e.c.q(e);
            }
        } catch (Exception e2) {
            this.e.c.q(e2);
        }
    }
}
