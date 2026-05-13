package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public abstract class kl4 {
    public final x80 a;
    public final Class b;

    public class a extends kl4 {
        public final /* synthetic */ b c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x80 x80Var, Class cls, b bVar) {
            super(x80Var, cls, null);
            this.c = bVar;
        }
    }

    public interface b {
    }

    public /* synthetic */ kl4(x80 x80Var, Class cls, a aVar) {
        this(x80Var, cls);
    }

    public static kl4 a(b bVar, x80 x80Var, Class cls) {
        return new a(x80Var, cls, bVar);
    }

    public final x80 b() {
        return this.a;
    }

    public final Class c() {
        return this.b;
    }

    public kl4(x80 x80Var, Class cls) {
        this.a = x80Var;
        this.b = cls;
    }
}
