package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.h;
import androidx.lifecycle.r;
import com.zepto.df3;
import com.zepto.q12;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class p implements df3 {
    public static final b i = new b(null);
    public static final p j = new p();
    public int a;
    public int b;
    public Handler e;
    public boolean c = true;
    public boolean d = true;
    public final m f = new m(this);
    public final Runnable g = new Runnable() { // from class: com.zepto.uv4
        @Override // java.lang.Runnable
        public final void run() {
            androidx.lifecycle.p.i(this.c);
        }
    };
    public final r.a h = new d();

    public static final class a {
        public static final a a = new a();

        @JvmStatic
        public static final void a(Activity activity, Application.ActivityLifecycleCallbacks callback) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(callback, "callback");
            activity.registerActivityLifecycleCallbacks(callback);
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final df3 a() {
            return p.j;
        }

        public final void b(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            p.j.h(context);
        }
    }

    public static final class c extends q12 {

        public static final class a extends q12 {
            final /* synthetic */ p this$0;

            public a(p pVar) {
                this.this$0 = pVar;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                this.this$0.e();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                this.this$0.f();
            }
        }

        public c() {
        }

        @Override // com.zepto.q12, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                r.b.b(activity).f(p.this.h);
            }
        }

        @Override // com.zepto.q12, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            p.this.d();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            a.a(activity, new a(p.this));
        }

        @Override // com.zepto.q12, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            p.this.g();
        }
    }

    public static final class d implements r.a {
        public d() {
        }

        @Override // androidx.lifecycle.r.a
        public void a() {
            p.this.e();
        }

        @Override // androidx.lifecycle.r.a
        public void b() {
            p.this.f();
        }

        @Override // androidx.lifecycle.r.a
        public void onCreate() {
        }
    }

    public static final void i(p this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.j();
        this$0.k();
    }

    public final void d() {
        int i2 = this.b - 1;
        this.b = i2;
        if (i2 == 0) {
            Handler handler = this.e;
            Intrinsics.checkNotNull(handler);
            handler.postDelayed(this.g, 700L);
        }
    }

    public final void e() {
        int i2 = this.b + 1;
        this.b = i2;
        if (i2 == 1) {
            if (this.c) {
                this.f.i(h.a.ON_RESUME);
                this.c = false;
            } else {
                Handler handler = this.e;
                Intrinsics.checkNotNull(handler);
                handler.removeCallbacks(this.g);
            }
        }
    }

    public final void f() {
        int i2 = this.a + 1;
        this.a = i2;
        if (i2 == 1 && this.d) {
            this.f.i(h.a.ON_START);
            this.d = false;
        }
    }

    public final void g() {
        this.a--;
        k();
    }

    @Override // com.zepto.df3
    public h g0() {
        return this.f;
    }

    public final void h(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.e = new Handler();
        this.f.i(h.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c());
    }

    public final void j() {
        if (this.b == 0) {
            this.c = true;
            this.f.i(h.a.ON_PAUSE);
        }
    }

    public final void k() {
        if (this.a == 0 && this.c) {
            this.f.i(h.a.ON_STOP);
            this.d = true;
        }
    }
}
