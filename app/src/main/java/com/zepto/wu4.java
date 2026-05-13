package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public abstract class wu4 {
    public final Class a;
    public final Class b;

    public class a extends wu4 {
        public final /* synthetic */ b c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, null);
            this.c = bVar;
        }

        @Override // com.zepto.wu4
        public Object a(e63 e63Var) {
            return this.c.a(e63Var);
        }
    }

    public interface b {
        Object a(e63 e63Var);
    }

    public /* synthetic */ wu4(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }

    public static wu4 b(b bVar, Class cls, Class cls2) {
        return new a(cls, cls2, bVar);
    }

    public abstract Object a(e63 e63Var);

    public Class c() {
        return this.a;
    }

    public Class d() {
        return this.b;
    }

    public wu4(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }
}
