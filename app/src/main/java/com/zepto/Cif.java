package com.zepto;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.zepto.if, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public abstract class Cif {

    /* JADX INFO: renamed from: com.zepto.if$a */
    public static final class a {
        public final Object a;

        public a(Object obj) {
            this.a = obj;
        }

        public final Object a() {
            return this.a;
        }
    }

    public abstract Intent a(Context context, Object obj);

    public a b(Context context, Object obj) {
        Intrinsics.checkNotNullParameter(context, "context");
        return null;
    }

    public abstract Object c(int i, Intent intent);
}
