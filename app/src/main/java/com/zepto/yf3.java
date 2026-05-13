package com.zepto;

import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class yf3 {
    public final Executor a;
    public volatile Object b;
    public volatile a c;

    public static final class a {
        public final Object a;
        public final String b;

        public a(Object obj, String str) {
            this.a = obj;
            this.b = str;
        }

        public String a() {
            return this.b + "@" + System.identityHashCode(this.a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b.equals(aVar.b);
        }

        public int hashCode() {
            return (System.identityHashCode(this.a) * 31) + this.b.hashCode();
        }
    }

    public interface b {
        void a(Object obj);

        void b();
    }

    public yf3(Looper looper, Object obj, String str) {
        this.a = new fl2(looper);
        this.b = iu4.j(obj, "Listener must not be null");
        this.c = new a(obj, iu4.e(str));
    }

    public void a() {
        this.b = null;
        this.c = null;
    }

    public a b() {
        return this.c;
    }

    public void c(final b bVar) {
        iu4.j(bVar, "Notifier must not be null");
        this.a.execute(new Runnable() { // from class: com.zepto.w28
            @Override // java.lang.Runnable
            public final void run() {
                this.c.d(bVar);
            }
        });
    }

    public final void d(b bVar) {
        Object obj = this.b;
        if (obj == null) {
            bVar.b();
            return;
        }
        try {
            bVar.a(obj);
        } catch (RuntimeException e) {
            bVar.b();
            throw e;
        }
    }
}
