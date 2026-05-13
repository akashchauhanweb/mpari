package com.zepto;

import android.graphics.Typeface;
import android.os.Handler;
import com.zepto.he2;
import com.zepto.je2;

/* JADX INFO: loaded from: classes.dex */
public class ka0 {
    public final je2.c a;
    public final Handler b;

    public class a implements Runnable {
        public final /* synthetic */ je2.c c;
        public final /* synthetic */ Typeface e;

        public a(je2.c cVar, Typeface typeface) {
            this.c = cVar;
            this.e = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.c.b(this.e);
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ je2.c c;
        public final /* synthetic */ int e;

        public b(je2.c cVar, int i) {
            this.c = cVar;
            this.e = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.c.a(this.e);
        }
    }

    public ka0(je2.c cVar, Handler handler) {
        this.a = cVar;
        this.b = handler;
    }

    public final void a(int i) {
        this.b.post(new b(this.a, i));
    }

    public void b(he2.e eVar) {
        if (eVar.a()) {
            c(eVar.a);
        } else {
            a(eVar.b);
        }
    }

    public final void c(Typeface typeface) {
        this.b.post(new a(this.a, typeface));
    }
}
