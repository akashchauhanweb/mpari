package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public abstract class bp3 extends sz0 {
    public abstract bp3 B0();

    public final String C0() {
        bp3 bp3VarB0;
        bp3 bp3VarC = qk1.c();
        if (this == bp3VarC) {
            return "Dispatchers.Main";
        }
        try {
            bp3VarB0 = bp3VarC.B0();
        } catch (UnsupportedOperationException unused) {
            bp3VarB0 = null;
        }
        if (this == bp3VarB0) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
