package androidx.work;

import android.content.Context;
import androidx.work.c;
import com.zepto.nz5;
import com.zepto.pe2;
import com.zepto.xf3;

/* JADX INFO: loaded from: classes.dex */
public abstract class Worker extends c {
    public nz5 e;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Worker.this.e.p(Worker.this.p());
            } catch (Throwable th) {
                Worker.this.e.q(th);
            }
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ nz5 c;

        public b(nz5 nz5Var) {
            this.c = nz5Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.c.p(Worker.this.q());
            } catch (Throwable th) {
                this.c.q(th);
            }
        }
    }

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.c
    public xf3 d() {
        nz5 nz5VarT = nz5.t();
        c().execute(new b(nz5VarT));
        return nz5VarT;
    }

    @Override // androidx.work.c
    public final xf3 n() {
        this.e = nz5.t();
        c().execute(new a());
        return this.e;
    }

    public abstract c.a p();

    public pe2 q() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
    }
}
