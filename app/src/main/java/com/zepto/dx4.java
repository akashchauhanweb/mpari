package com.zepto;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
public final class dx4 {
    public static final dx4 c = new dx4();
    public final ConcurrentMap b = new ConcurrentHashMap();
    public final ep5 a = new hp3();

    public static dx4 a() {
        return c;
    }

    public dp5 b(Class cls, dp5 dp5Var) {
        x03.b(cls, "messageType");
        x03.b(dp5Var, "schema");
        return (dp5) this.b.putIfAbsent(cls, dp5Var);
    }

    public dp5 c(Class cls) {
        x03.b(cls, "messageType");
        dp5 dp5Var = (dp5) this.b.get(cls);
        if (dp5Var != null) {
            return dp5Var;
        }
        dp5 dp5VarA = this.a.a(cls);
        dp5 dp5VarB = b(cls, dp5VarA);
        return dp5VarB != null ? dp5VarB : dp5VarA;
    }

    public dp5 d(Object obj) {
        return c(obj.getClass());
    }
}
