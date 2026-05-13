package com.zepto;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface cu0 {
    default Object a(Class cls) {
        return f(ky4.b(cls));
    }

    nx4 b(ky4 ky4Var);

    default Set c(Class cls) {
        return d(ky4.b(cls));
    }

    default Set d(ky4 ky4Var) {
        return (Set) b(ky4Var).get();
    }

    nx4 e(ky4 ky4Var);

    default Object f(ky4 ky4Var) {
        nx4 nx4VarE = e(ky4Var);
        if (nx4VarE == null) {
            return null;
        }
        return nx4VarE.get();
    }

    default nx4 g(Class cls) {
        return e(ky4.b(cls));
    }
}
