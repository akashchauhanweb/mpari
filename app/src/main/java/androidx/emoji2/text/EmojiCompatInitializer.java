package androidx.emoji2.text;

import android.content.Context;
import androidx.emoji2.text.c;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.h;
import com.zepto.aj6;
import com.zepto.df3;
import com.zepto.is;
import com.zepto.qy2;
import com.zepto.rf1;
import com.zepto.sv0;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements qy2 {

    public class a implements rf1 {
        public final /* synthetic */ h c;

        public a(h hVar) {
            this.c = hVar;
        }

        @Override // com.zepto.rf1
        public void h(df3 df3Var) {
            EmojiCompatInitializer.this.e();
            this.c.d(this);
        }
    }

    public static class b extends c.AbstractC0011c {
        public b(Context context) {
            super(new c(context));
            b(1);
        }
    }

    public static class c implements c.g {
        public final Context a;

        public class a extends c.h {
            public final /* synthetic */ c.h a;
            public final /* synthetic */ ThreadPoolExecutor b;

            public a(c.h hVar, ThreadPoolExecutor threadPoolExecutor) {
                this.a = hVar;
                this.b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.c.h
            public void a(Throwable th) {
                try {
                    this.a.a(th);
                } finally {
                    this.b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.c.h
            public void b(f fVar) {
                try {
                    this.a.b(fVar);
                } finally {
                    this.b.shutdown();
                }
            }
        }

        public c(Context context) {
            this.a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.c.g
        public void a(final c.h hVar) {
            final ThreadPoolExecutor threadPoolExecutorB = sv0.b("EmojiCompatInitializer");
            threadPoolExecutorB.execute(new Runnable() { // from class: com.zepto.e12
                @Override // java.lang.Runnable
                public final void run() {
                    this.c.d(hVar, threadPoolExecutorB);
                }
            });
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void d(c.h hVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                e eVarA = androidx.emoji2.text.a.a(this.a);
                if (eVarA == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                eVarA.c(threadPoolExecutor);
                eVarA.a().a(new a(hVar, threadPoolExecutor));
            } catch (Throwable th) {
                hVar.a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    public static class d implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                aj6.a("EmojiCompat.EmojiCompatInitializer.run");
                if (androidx.emoji2.text.c.h()) {
                    androidx.emoji2.text.c.b().k();
                }
            } finally {
                aj6.b();
            }
        }
    }

    @Override // com.zepto.qy2
    public List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // com.zepto.qy2
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Boolean b(Context context) {
        androidx.emoji2.text.c.g(new b(context));
        d(context);
        return Boolean.TRUE;
    }

    public void d(Context context) {
        h hVarG0 = ((df3) is.e(context).f(ProcessLifecycleInitializer.class)).g0();
        hVarG0.a(new a(hVarG0));
    }

    public void e() {
        sv0.d().postDelayed(new d(), 500L);
    }
}
