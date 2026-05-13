package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class kz5 {
    public ThreadLocal a = new ThreadLocal();

    public static class a {
        public iz5 a;
        public int b;

        public a(boolean z) {
            this.a = new iz5(z);
        }

        public int a() {
            int i = this.b - 1;
            this.b = i;
            return i;
        }

        public iz5 b() {
            int i = this.b;
            if (i >= 0) {
                this.b = i + 1;
            }
            return this.a;
        }
    }

    public void a() throws ir4 {
        a aVar = (a) this.a.get();
        if (aVar == null) {
            throw new ir4("Session does not exist", new Object[0]);
        }
        if (aVar.a() == 0) {
            this.a.remove();
        }
    }

    public final iz5 b(boolean z) {
        a aVar = new a(z);
        this.a.set(aVar);
        return aVar.b();
    }

    public iz5 c() {
        return d(true);
    }

    public iz5 d(boolean z) {
        a aVar = (a) this.a.get();
        return aVar != null ? aVar.b() : b(z);
    }
}
