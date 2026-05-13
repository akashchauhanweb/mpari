package com.zepto;

import java.lang.reflect.Field;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class cb2 {
    public final Field a;

    public cb2(Field field) {
        Objects.requireNonNull(field);
        this.a = field;
    }

    public String toString() {
        return this.a.toString();
    }
}
