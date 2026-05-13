package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.zepto.q12;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    public static final j a = new j();
    public static final AtomicBoolean b = new AtomicBoolean(false);

    public static final class a extends q12 {
        @Override // com.zepto.q12, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            r.b.c(activity);
        }
    }

    public static final void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (b.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
    }
}
