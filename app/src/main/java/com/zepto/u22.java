package com.zepto;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class u22 extends f16 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u22(je5 database) {
        super(database);
        Intrinsics.checkNotNullParameter(database, "database");
    }

    public abstract void i(r96 r96Var, Object obj);

    public final void j(Object obj) {
        r96 r96VarB = b();
        try {
            i(r96VarB, obj);
            r96VarB.q0();
        } finally {
            h(r96VarB);
        }
    }
}
