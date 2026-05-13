package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public abstract class n63 {
    public final x80 a;
    public final Class b;

    public class a extends n63 {
        public final /* synthetic */ b c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x80 x80Var, Class cls, b bVar) {
            super(x80Var, cls, null);
            this.c = bVar;
        }

        @Override // com.zepto.n63
        public e63 d(sy5 sy5Var, pu5 pu5Var) {
            return this.c.a(sy5Var, pu5Var);
        }
    }

    public interface b {
        e63 a(sy5 sy5Var, pu5 pu5Var);
    }

    public /* synthetic */ n63(x80 x80Var, Class cls, a aVar) {
        this(x80Var, cls);
    }

    public static n63 a(b bVar, x80 x80Var, Class cls) {
        return new a(x80Var, cls, bVar);
    }

    public final x80 b() {
        return this.a;
    }

    public final Class c() {
        return this.b;
    }

    public abstract e63 d(sy5 sy5Var, pu5 pu5Var);

    public n63(x80 x80Var, Class cls) {
        this.a = x80Var;
        this.b = cls;
    }
}
