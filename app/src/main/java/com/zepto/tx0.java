package com.zepto;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class tx0 {
    public List a = new ArrayList();
    public il4 b = new il4();
    public q26 c;
    public c96 d;

    public tx0(si1 si1Var, c96 c96Var) throws sx0 {
        this.d = c96Var;
        d(si1Var);
    }

    public il4 a() {
        return this.b;
    }

    public q26 b() {
        return this.c;
    }

    public List c() {
        return new ArrayList(this.a);
    }

    public final void d(si1 si1Var) throws sx0 {
        Constructor[] constructors = si1Var.getConstructors();
        if (!si1Var.m()) {
            throw new sx0("Can not construct inner %s", si1Var);
        }
        for (Constructor constructor : constructors) {
            if (!si1Var.c()) {
                e(constructor);
            }
        }
    }

    public final void e(Constructor constructor) {
        v26 v26Var = new v26(constructor, this.b, this.d);
        if (v26Var.d()) {
            for (q26 q26Var : v26Var.c()) {
                if (q26Var.size() == 0) {
                    this.c = q26Var;
                }
                this.a.add(q26Var);
            }
        }
    }
}
