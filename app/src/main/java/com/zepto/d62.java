package com.zepto;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class d62 implements od5 {
    private final Executor mResponsePoster;

    public class a implements Executor {
        final /* synthetic */ Handler val$handler;

        public a(Handler handler) {
            this.val$handler = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.val$handler.post(runnable);
        }
    }

    public static class b implements Runnable {
        private final ic5 mRequest;
        private final id5 mResponse;
        private final Runnable mRunnable;

        public b(ic5 ic5Var, id5 id5Var, Runnable runnable) {
            this.mRequest = ic5Var;
            this.mResponse = id5Var;
            this.mRunnable = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.mRequest.isCanceled()) {
                this.mRequest.finish("canceled-at-delivery");
                return;
            }
            if (this.mResponse.isSuccess()) {
                this.mRequest.deliverResponse(this.mResponse.result);
            } else {
                this.mRequest.deliverError(this.mResponse.error);
            }
            if (this.mResponse.intermediate) {
                this.mRequest.addMarker("intermediate-response");
            } else {
                this.mRequest.finish("done");
            }
            Runnable runnable = this.mRunnable;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public d62(Handler handler) {
        this.mResponsePoster = new a(handler);
    }

    @Override // com.zepto.od5
    public void postError(ic5 ic5Var, bu7 bu7Var) {
        ic5Var.addMarker("post-error");
        this.mResponsePoster.execute(new b(ic5Var, id5.error(bu7Var), null));
    }

    @Override // com.zepto.od5
    public void postResponse(ic5 ic5Var, id5 id5Var) {
        postResponse(ic5Var, id5Var, null);
    }

    @Override // com.zepto.od5
    public void postResponse(ic5 ic5Var, id5 id5Var, Runnable runnable) {
        ic5Var.markDelivered();
        ic5Var.addMarker("post-response");
        this.mResponsePoster.execute(new b(ic5Var, id5Var, runnable));
    }

    public d62(Executor executor) {
        this.mResponsePoster = executor;
    }
}
