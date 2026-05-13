package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public abstract class q43 {
    public static final s96 a = new s96("COMPLETING_ALREADY");
    public static final s96 b = new s96("COMPLETING_WAITING_CHILDREN");
    public static final s96 c = new s96("COMPLETING_RETRY");
    public static final s96 d = new s96("TOO_LATE_TO_CANCEL");
    public static final s96 e = new s96("SEALED");
    public static final p12 f = new p12(false);
    public static final p12 g = new p12(true);

    public static final Object g(Object obj) {
        return obj instanceof gy2 ? new hy2((gy2) obj) : obj;
    }

    public static final Object h(Object obj) {
        gy2 gy2Var;
        hy2 hy2Var = obj instanceof hy2 ? (hy2) obj : null;
        return (hy2Var == null || (gy2Var = hy2Var.a) == null) ? obj : gy2Var;
    }
}
