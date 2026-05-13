package androidx.lifecycle;

import androidx.lifecycle.h;
import com.zepto.cm5;
import com.zepto.df3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class u implements k {
    public final String c;
    public final s e;
    public boolean f;

    public u(String key, s handle) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(handle, "handle");
        this.c = key;
        this.e = handle;
    }

    public final void c(cm5 registry, h lifecycle) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (!(!this.f)) {
            throw new IllegalStateException("Already attached to lifecycleOwner".toString());
        }
        this.f = true;
        lifecycle.a(this);
        registry.h(this.c, this.e.c());
    }

    @Override // androidx.lifecycle.k
    public void e(df3 source, h.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == h.a.ON_DESTROY) {
            this.f = false;
            source.g0().d(this);
        }
    }

    public final s i() {
        return this.e;
    }

    public final boolean j() {
        return this.f;
    }
}
