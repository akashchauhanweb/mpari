package com.zepto;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e53 {
    public y43 j() {
        if (r()) {
            return (y43) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public l53 m() {
        if (w()) {
            return (l53) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public q53 n() {
        if (z()) {
            return (q53) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public boolean r() {
        return this instanceof y43;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            a63 a63Var = new a63(stringWriter);
            a63Var.C0(true);
            w76.a(this, a63Var);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public boolean u() {
        return this instanceof j53;
    }

    public boolean w() {
        return this instanceof l53;
    }

    public boolean z() {
        return this instanceof q53;
    }
}
