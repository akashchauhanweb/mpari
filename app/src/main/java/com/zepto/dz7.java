package com.zepto;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public interface dz7 {

    public static final class a {
        public static void a(dz7 dz7Var, String id, Set tags) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(tags, "tags");
            dz7.super.b(id, tags);
        }
    }

    void a(cz7 cz7Var);

    default void b(String id, Set tags) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Iterator it = tags.iterator();
        while (it.hasNext()) {
            a(new cz7((String) it.next(), id));
        }
    }

    List d(String str);
}
