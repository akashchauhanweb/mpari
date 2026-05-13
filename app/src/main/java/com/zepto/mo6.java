package com.zepto;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mo6 {

    public class a extends mo6 {
        public a() {
        }

        @Override // com.zepto.mo6
        public void c(a63 a63Var, Object obj) throws IOException {
            if (obj == null) {
                a63Var.m0();
            } else {
                mo6.this.c(a63Var, obj);
            }
        }
    }

    public final mo6 a() {
        return new a();
    }

    public final e53 b(Object obj) {
        try {
            y53 y53Var = new y53();
            c(y53Var, obj);
            return y53Var.M0();
        } catch (IOException e) {
            throw new h53(e);
        }
    }

    public abstract void c(a63 a63Var, Object obj);
}
