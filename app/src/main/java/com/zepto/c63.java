package com.zepto;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public class c63 extends sn3 {
    public Logger a;

    public c63(String str) {
        this.a = Logger.getLogger(str);
    }

    @Override // com.zepto.sn3
    public void b(String str) {
        this.a.log(Level.FINE, str);
    }
}
