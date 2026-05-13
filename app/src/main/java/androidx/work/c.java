package androidx.work;

import android.content.Context;
import com.zepto.hz7;
import com.zepto.nz5;
import com.zepto.uc6;
import com.zepto.xf3;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public Context a;
    public WorkerParameters b;
    public volatile int c = -256;
    public boolean d;

    public static abstract class a {

        /* JADX INFO: renamed from: androidx.work.c$a$a, reason: collision with other inner class name */
        public static final class C0028a extends a {
            public final androidx.work.b a;

            public C0028a() {
                this(androidx.work.b.c);
            }

            public androidx.work.b e() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0028a.class != obj.getClass()) {
                    return false;
                }
                return this.a.equals(((C0028a) obj).a);
            }

            public int hashCode() {
                return (C0028a.class.getName().hashCode() * 31) + this.a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.a + '}';
            }

            public C0028a(androidx.work.b bVar) {
                this.a = bVar;
            }
        }

        public static final class b extends a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        /* JADX INFO: renamed from: androidx.work.c$a$c, reason: collision with other inner class name */
        public static final class C0029c extends a {
            public final androidx.work.b a;

            public C0029c() {
                this(androidx.work.b.c);
            }

            public androidx.work.b e() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0029c.class != obj.getClass()) {
                    return false;
                }
                return this.a.equals(((C0029c) obj).a);
            }

            public int hashCode() {
                return (C0029c.class.getName().hashCode() * 31) + this.a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.a + '}';
            }

            public C0029c(androidx.work.b bVar) {
                this.a = bVar;
            }
        }

        public static a a() {
            return new C0028a();
        }

        public static a b() {
            return new b();
        }

        public static a c() {
            return new C0029c();
        }

        public static a d(androidx.work.b bVar) {
            return new C0029c(bVar);
        }
    }

    public c(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.a = context;
        this.b = workerParameters;
    }

    public final Context a() {
        return this.a;
    }

    public Executor c() {
        return this.b.a();
    }

    public xf3 d() {
        nz5 nz5VarT = nz5.t();
        nz5VarT.q(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return nz5VarT;
    }

    public final UUID e() {
        return this.b.c();
    }

    public final b f() {
        return this.b.d();
    }

    public final int g() {
        return this.c;
    }

    public uc6 h() {
        return this.b.e();
    }

    public hz7 i() {
        return this.b.f();
    }

    public final boolean j() {
        return this.c != -256;
    }

    public final boolean k() {
        return this.d;
    }

    public void l() {
    }

    public final void m() {
        this.d = true;
    }

    public abstract xf3 n();

    public final void o(int i) {
        this.c = i;
        l();
    }
}
