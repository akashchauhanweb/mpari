package com.zepto;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public interface da6 {

    public static final class a {
        public static ca6 a(da6 da6Var, ay7 id) {
            Intrinsics.checkNotNullParameter(id, "id");
            return da6.super.c(id);
        }

        public static void b(da6 da6Var, ay7 id) {
            Intrinsics.checkNotNullParameter(id, "id");
            da6.super.h(id);
        }
    }

    List a();

    void b(ca6 ca6Var);

    default ca6 c(ay7 id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return g(id.b(), id.a());
    }

    void d(String str, int i);

    void f(String str);

    ca6 g(String str, int i);

    default void h(ay7 id) {
        Intrinsics.checkNotNullParameter(id, "id");
        d(id.b(), id.a());
    }
}
