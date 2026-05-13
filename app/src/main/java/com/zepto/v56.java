package com.zepto;

import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes2.dex */
public final class v56 extends mo6 {
    public static final oo6 b = new a();
    public final DateFormat a;

    public class a implements oo6 {
        @Override // com.zepto.oo6
        public mo6 a(pk2 pk2Var, uo6 uo6Var) {
            a aVar = null;
            if (uo6Var.c() == Date.class) {
                return new v56(aVar);
            }
            return null;
        }
    }

    public /* synthetic */ v56(a aVar) {
        this();
    }

    @Override // com.zepto.mo6
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void c(a63 a63Var, Date date) throws IOException {
        String str;
        if (date == null) {
            a63Var.m0();
            return;
        }
        synchronized (this) {
            str = this.a.format((java.util.Date) date);
        }
        a63Var.J0(str);
    }

    public v56() {
        this.a = new SimpleDateFormat("MMM d, yyyy");
    }
}
