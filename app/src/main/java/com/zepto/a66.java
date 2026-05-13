package com.zepto;

import com.zepto.ef1;
import java.sql.Date;
import java.sql.Timestamp;

/* JADX INFO: loaded from: classes.dex */
public abstract class a66 {
    public static final boolean a;
    public static final ef1.b b;
    public static final ef1.b c;
    public static final po6 d;
    public static final po6 e;
    public static final po6 f;

    public class a extends ef1.b {
        public a(Class cls) {
            super(cls);
        }

        @Override // com.zepto.ef1.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Date d(java.util.Date date) {
            return new Date(date.getTime());
        }
    }

    public class b extends ef1.b {
        public b(Class cls) {
            super(cls);
        }

        @Override // com.zepto.ef1.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Timestamp d(java.util.Date date) {
            return new Timestamp(date.getTime());
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
            d = u56.b;
            e = w56.b;
            f = y56.b;
            return;
        }
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
    }
}
