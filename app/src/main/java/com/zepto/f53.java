package com.zepto;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class f53 {
    public boolean B() {
        return this instanceof r53;
    }

    public z43 j() {
        if (u()) {
            return (z43) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public m53 m() {
        if (z()) {
            return (m53) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public r53 n() {
        if (B()) {
            return (r53) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public String r() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            b63 b63Var = new b63(stringWriter);
            b63Var.C0(true);
            v76.b(this, b63Var);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public boolean u() {
        return this instanceof z43;
    }

    public boolean w() {
        return this instanceof k53;
    }

    public boolean z() {
        return this instanceof m53;
    }
}
