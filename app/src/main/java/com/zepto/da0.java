package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public interface da0 extends Cloneable {

    public interface a {
        da0 a(kc5 kc5Var);
    }

    void cancel();

    ld5 execute();

    boolean isCanceled();

    void n(ga0 ga0Var);

    kc5 request();

    cg6 timeout();
}
