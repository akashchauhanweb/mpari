package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class jq6 extends UnsupportedOperationException {
    public final w82 c;

    public jq6(w82 w82Var) {
        this.c = w82Var;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.c));
    }
}
