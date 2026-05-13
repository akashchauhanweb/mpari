package com.zepto;

import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class t68 extends qg8 {
    public final /* synthetic */ ff5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t68(ff5 ff5Var, Looper looper) {
        super(looper);
        this.b = ff5Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        ff5.e(this.b, message);
    }
}
