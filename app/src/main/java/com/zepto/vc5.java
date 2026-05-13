package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public class vc5 {
    public static /* synthetic */ Throwable a;
    public static final /* synthetic */ vc5 b = null;

    static {
        try {
            a();
        } catch (Throwable th) {
            a = th;
        }
    }

    public static /* synthetic */ void a() {
        b = new vc5();
    }

    public static vc5 b() {
        vc5 vc5Var = b;
        if (vc5Var != null) {
            return vc5Var;
        }
        throw new m94("com.googlecode.mp4parser.RequiresParseDetailAspect", a);
    }

    public void c(r43 r43Var) {
        if (r43Var.getTarget() instanceof c2) {
            if (((c2) r43Var.getTarget()).i()) {
                return;
            }
            ((c2) r43Var.getTarget()).l();
        } else {
            throw new RuntimeException("Only methods in subclasses of " + c2.class.getName() + " can  be annotated with ParseDetail");
        }
    }
}
