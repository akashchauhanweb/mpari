package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public class sh4 implements nx4 {
    public static final rg1 c = new rg1() { // from class: com.zepto.qh4
        @Override // com.zepto.rg1
        public final void a(nx4 nx4Var) {
            sh4.d(nx4Var);
        }
    };
    public static final nx4 d = new nx4() { // from class: com.zepto.rh4
        @Override // com.zepto.nx4
        public final Object get() {
            return sh4.e();
        }
    };
    public rg1 a;
    public volatile nx4 b;

    public sh4(rg1 rg1Var, nx4 nx4Var) {
        this.a = rg1Var;
        this.b = nx4Var;
    }

    public static sh4 c() {
        return new sh4(c, d);
    }

    public static /* synthetic */ void d(nx4 nx4Var) {
    }

    public static /* synthetic */ Object e() {
        return null;
    }

    public void f(nx4 nx4Var) {
        rg1 rg1Var;
        if (this.b != d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            rg1Var = this.a;
            this.a = null;
            this.b = nx4Var;
        }
        rg1Var.a(nx4Var);
    }

    @Override // com.zepto.nx4
    public Object get() {
        return this.b.get();
    }
}
