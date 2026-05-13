package androidx.lifecycle;

import androidx.lifecycle.h;
import com.zepto.df3;
import com.zepto.zl5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class t implements k {
    public final zl5 c;

    public t(zl5 provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.c = provider;
    }

    @Override // androidx.lifecycle.k
    public void e(df3 source, h.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == h.a.ON_CREATE) {
            source.g0().d(this);
            this.c.d();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
        }
    }
}
