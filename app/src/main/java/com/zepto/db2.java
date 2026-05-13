package com.zepto;

import java.lang.reflect.Field;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class db2 {
    public final Field a;

    public db2(Field field) {
        Objects.requireNonNull(field);
        this.a = field;
    }

    public String toString() {
        return this.a.toString();
    }
}
