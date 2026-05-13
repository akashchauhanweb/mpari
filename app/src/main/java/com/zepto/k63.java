package com.zepto;

import com.zepto.v63;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public class k63 implements j63 {
    public final v63 a;
    public final Class b;

    public static class a {
        public final v63.a a;

        public a(v63.a aVar) {
            this.a = aVar;
        }

        public at3 a(s80 s80Var) {
            return b(this.a.d(s80Var));
        }

        public final at3 b(at3 at3Var) {
            this.a.e(at3Var);
            return this.a.a(at3Var);
        }
    }

    public k63(v63 v63Var, Class cls) {
        if (!v63Var.i().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", v63Var.toString(), cls.getName()));
        }
        this.a = v63Var;
        this.b = cls;
    }

    @Override // com.zepto.j63
    public final Object a(s80 s80Var) throws GeneralSecurityException {
        try {
            return f(this.a.h(s80Var));
        } catch (b13 e) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.a.c().getName(), e);
        }
    }

    @Override // com.zepto.j63
    public final f63 b(s80 s80Var) throws GeneralSecurityException {
        try {
            return (f63) f63.c0().u(c()).v(e().a(s80Var).f()).t(this.a.g()).h();
        } catch (b13 e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    @Override // com.zepto.j63
    public final String c() {
        return this.a.d();
    }

    @Override // com.zepto.j63
    public final at3 d(s80 s80Var) throws GeneralSecurityException {
        try {
            return e().a(s80Var);
        } catch (b13 e) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.a.f().b().getName(), e);
        }
    }

    public final a e() {
        return new a(this.a.f());
    }

    public final Object f(at3 at3Var) throws GeneralSecurityException {
        if (Void.class.equals(this.b)) {
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        }
        this.a.j(at3Var);
        return this.a.e(at3Var, this.b);
    }
}
