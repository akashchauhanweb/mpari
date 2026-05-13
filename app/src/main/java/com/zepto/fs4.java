package com.zepto;

import android.net.NetworkInfo;
import com.zepto.ds4;
import com.zepto.nt6;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class fs4 extends ThreadPoolExecutor {

    public static final class a extends FutureTask implements Comparable {
        public final t60 c;

        public a(t60 t60Var) {
            super(t60Var, null);
            this.c = t60Var;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            ds4.f fVarR = this.c.r();
            ds4.f fVarR2 = aVar.c.r();
            return fVarR == fVarR2 ? this.c.c - aVar.c.c : fVarR2.ordinal() - fVarR.ordinal();
        }
    }

    public fs4() {
        super(3, 3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new nt6.c());
    }

    public void a(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isConnectedOrConnecting()) {
            b(3);
            return;
        }
        int type = networkInfo.getType();
        if (type != 0) {
            if (type == 1 || type == 6 || type == 9) {
                b(4);
                return;
            } else {
                b(3);
                return;
            }
        }
        int subtype = networkInfo.getSubtype();
        switch (subtype) {
            case 1:
            case 2:
                b(1);
                return;
            case 3:
            case 4:
            case 5:
            case 6:
                break;
            default:
                switch (subtype) {
                    case 12:
                        break;
                    case 13:
                    case 14:
                    case 15:
                        b(3);
                        break;
                    default:
                        b(3);
                        break;
                }
                return;
        }
        b(2);
    }

    public final void b(int i) {
        setCorePoolSize(i);
        setMaximumPoolSize(i);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        a aVar = new a((t60) runnable);
        execute(aVar);
        return aVar;
    }
}
