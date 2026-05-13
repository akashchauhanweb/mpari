package com.zepto;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class c98 extends th8 {
    public final /* synthetic */ t40 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c98(t40 t40Var, Looper looper) {
        super(looper);
        this.a = t40Var;
    }

    public static final void a(Message message) {
        xa8 xa8Var = (xa8) message.obj;
        xa8Var.b();
        xa8Var.e();
    }

    public static final boolean b(Message message) {
        int i = message.what;
        return i == 2 || i == 1 || i == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.a.C.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i = message.what;
        if ((i == 1 || i == 7 || ((i == 4 && !this.a.q()) || message.what == 5)) && !this.a.g()) {
            a(message);
            return;
        }
        int i2 = message.what;
        if (i2 == 4) {
            this.a.z = new lw0(message.arg2);
            if (t40.d0(this.a)) {
                t40 t40Var = this.a;
                if (!t40Var.A) {
                    t40Var.e0(3, null);
                    return;
                }
            }
            t40 t40Var2 = this.a;
            lw0 lw0Var = t40Var2.z != null ? t40Var2.z : new lw0(8);
            this.a.p.b(lw0Var);
            this.a.I(lw0Var);
            return;
        }
        if (i2 == 5) {
            t40 t40Var3 = this.a;
            lw0 lw0Var2 = t40Var3.z != null ? t40Var3.z : new lw0(8);
            this.a.p.b(lw0Var2);
            this.a.I(lw0Var2);
            return;
        }
        if (i2 == 3) {
            Object obj = message.obj;
            lw0 lw0Var3 = new lw0(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.a.p.b(lw0Var3);
            this.a.I(lw0Var3);
            return;
        }
        if (i2 == 6) {
            this.a.e0(5, null);
            t40 t40Var4 = this.a;
            if (t40Var4.u != null) {
                t40Var4.u.d(message.arg2);
            }
            this.a.J(message.arg2);
            t40.c0(this.a, 5, 1, null);
            return;
        }
        if (i2 == 2 && !this.a.isConnected()) {
            a(message);
            return;
        }
        if (b(message)) {
            ((xa8) message.obj).c();
            return;
        }
        Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
    }
}
