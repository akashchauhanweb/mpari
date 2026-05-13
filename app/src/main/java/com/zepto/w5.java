package com.zepto;

import android.content.Context;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class w5 extends b2 {
    public final pq f;

    /* JADX WARN: Illegal instructions before constructor call */
    public w5(pq activity, jq configuration) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        v5 v5VarT0 = activity.T0();
        if (v5VarT0 != null) {
            Context contextB = v5VarT0.b();
            Intrinsics.checkNotNullExpressionValue(contextB, "checkNotNull(activity.dr… }.actionBarThemedContext");
            super(contextB, configuration);
            this.f = activity;
            return;
        }
        throw new IllegalStateException(("Activity " + activity + " does not have an DrawerToggleDelegate set").toString());
    }

    @Override // com.zepto.b2
    public void c(Drawable drawable, int i) {
        t5 t5VarU0 = this.f.U0();
        if (t5VarU0 == null) {
            throw new IllegalStateException(("Activity " + this.f + " does not have an ActionBar set via setSupportActionBar()").toString());
        }
        Intrinsics.checkNotNullExpressionValue(t5VarU0, "checkNotNull(activity.su…ortActionBar()\"\n        }");
        t5VarU0.s(drawable != null);
        v5 v5VarT0 = this.f.T0();
        if (v5VarT0 != null) {
            Intrinsics.checkNotNullExpressionValue(v5VarT0, "checkNotNull(activity.dr…leDelegate set\"\n        }");
            v5VarT0.a(drawable, i);
        } else {
            throw new IllegalStateException(("Activity " + this.f + " does not have an DrawerToggleDelegate set").toString());
        }
    }

    @Override // com.zepto.b2
    public void d(CharSequence charSequence) {
        t5 t5VarU0 = this.f.U0();
        if (t5VarU0 != null) {
            Intrinsics.checkNotNullExpressionValue(t5VarU0, "checkNotNull(activity.su…ortActionBar()\"\n        }");
            t5VarU0.x(charSequence);
        } else {
            throw new IllegalStateException(("Activity " + this.f + " does not have an ActionBar set via setSupportActionBar()").toString());
        }
    }
}
