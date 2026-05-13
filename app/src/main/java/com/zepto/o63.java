package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public abstract class o63 {
    public final Class a;
    public final Class b;

    public class a extends o63 {
        public final /* synthetic */ b c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, null);
            this.c = bVar;
        }
    }

    public interface b {
    }

    public /* synthetic */ o63(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }

    public static o63 a(b bVar, Class cls, Class cls2) {
        return new a(cls, cls2, bVar);
    }

    public Class b() {
        return this.a;
    }

    public Class c() {
        return this.b;
    }

    public o63(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }
}
