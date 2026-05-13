package com.zepto;

import com.zepto.ff1;
import java.sql.Date;
import java.sql.Timestamp;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b66 {
    public static final boolean a;
    public static final ff1.b b;
    public static final ff1.b c;
    public static final oo6 d;
    public static final oo6 e;
    public static final oo6 f;

    public class a extends ff1.b {
        public a(Class cls) {
            super(cls);
        }
    }

    public class b extends ff1.b {
        public b(Class cls) {
            super(cls);
        }
    }

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        a = z;
        if (z) {
            b = new a(Date.class);
            c = new b(Timestamp.class);
            d = v56.b;
            e = x56.b;
            f = z56.b;
            return;
        }
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
    }
}
