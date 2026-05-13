package com.zepto;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class h31 {
    public final Map a = new LinkedHashMap();

    public static final class a extends h31 {
        public static final a b = new a();

        @Override // com.zepto.h31
        public Object a(b key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return null;
        }
    }

    public interface b {
    }

    public abstract Object a(b bVar);

    public final Map b() {
        return this.a;
    }
}
