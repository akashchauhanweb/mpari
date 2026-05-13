package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.h;
import com.zepto.df3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class x {
    public final m a;
    public final Handler b;
    public a c;

    public static final class a implements Runnable {
        public final m c;
        public final h.a e;
        public boolean f;

        public a(m registry, h.a event) {
            Intrinsics.checkNotNullParameter(registry, "registry");
            Intrinsics.checkNotNullParameter(event, "event");
            this.c = registry;
            this.e = event;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f) {
                return;
            }
            this.c.i(this.e);
            this.f = true;
        }
    }

    public x(df3 provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.a = new m(provider);
        this.b = new Handler();
    }

    public h a() {
        return this.a;
    }

    public void b() {
        f(h.a.ON_START);
    }

    public void c() {
        f(h.a.ON_CREATE);
    }

    public void d() {
        f(h.a.ON_STOP);
        f(h.a.ON_DESTROY);
    }

    public void e() {
        f(h.a.ON_START);
    }

    public final void f(h.a aVar) {
        a aVar2 = this.c;
        if (aVar2 != null) {
            aVar2.run();
        }
        a aVar3 = new a(this.a, aVar);
        this.c = aVar3;
        Handler handler = this.b;
        Intrinsics.checkNotNull(aVar3);
        handler.postAtFrontOfQueue(aVar3);
    }
}
