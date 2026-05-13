package com.zepto;

import com.zepto.ix4;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ix4 {
    public final Map a;
    public final Map b;
    public final we4 c;

    public static final class a implements a22 {
        public static final we4 d = new we4() { // from class: com.zepto.hx4
            @Override // com.zepto.we4
            public final void a(Object obj, Object obj2) {
                ix4.a.e(obj, (xe4) obj2);
            }
        };
        public final Map a = new HashMap();
        public final Map b = new HashMap();
        public we4 c = d;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void e(Object obj, xe4 xe4Var) {
            throw new e22("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public ix4 c() {
            return new ix4(new HashMap(this.a), new HashMap(this.b), this.c);
        }

        public a d(aw0 aw0Var) {
            aw0Var.a(this);
            return this;
        }

        @Override // com.zepto.a22
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public a a(Class cls, we4 we4Var) {
            this.a.put(cls, we4Var);
            this.b.remove(cls);
            return this;
        }
    }

    public ix4(Map map, Map map2, we4 we4Var) {
        this.a = map;
        this.b = map2;
        this.c = we4Var;
    }

    public static a a() {
        return new a();
    }

    public void b(Object obj, OutputStream outputStream) {
        new gx4(outputStream, this.a, this.b, this.c).q(obj);
    }

    public byte[] c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
