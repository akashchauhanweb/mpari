package com.zepto;

import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public class z56 extends mo6 {
    public static final oo6 b = new a();
    public final mo6 a;

    public class a implements oo6 {
        @Override // com.zepto.oo6
        public mo6 a(pk2 pk2Var, uo6 uo6Var) {
            a aVar = null;
            if (uo6Var.c() == Timestamp.class) {
                return new z56(pk2Var.g(Date.class), aVar);
            }
            return null;
        }
    }

    public /* synthetic */ z56(mo6 mo6Var, a aVar) {
        this(mo6Var);
    }

    @Override // com.zepto.mo6
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void c(a63 a63Var, Timestamp timestamp) {
        this.a.c(a63Var, timestamp);
    }

    public z56(mo6 mo6Var) {
        this.a = mo6Var;
    }
}
