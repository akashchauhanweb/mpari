package com.zepto;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class k45 extends du1 {
    public File b;

    public k45(du1 du1Var, File file) {
        super(du1Var);
        this.b = file;
    }

    @Override // com.zepto.du1
    public long c() {
        return this.b.length();
    }
}
