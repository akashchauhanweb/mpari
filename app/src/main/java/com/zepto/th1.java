package com.zepto;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class th1 extends n2 implements ScheduledFuture {
    public final ScheduledFuture k;

    public class a implements b {
        public a() {
        }

        @Override // com.zepto.th1.b
        public void a(Throwable th) {
            th1.this.p(th);
        }

        @Override // com.zepto.th1.b
        public void set(Object obj) {
            th1.this.o(obj);
        }
    }

    public interface b {
        void a(Throwable th);

        void set(Object obj);
    }

    public interface c {
        ScheduledFuture a(b bVar);
    }

    public th1(c cVar) {
        this.k = cVar.a(new a());
    }

    @Override // com.zepto.n2
    public void c() {
        this.k.cancel(r());
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.k.getDelay(timeUnit);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        return this.k.compareTo(delayed);
    }
}
