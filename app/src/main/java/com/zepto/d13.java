package com.zepto;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d13 {
    public final je5 a;
    public final Set b;

    public d13(je5 database) {
        Intrinsics.checkNotNullParameter(database, "database");
        this.a = database;
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        Intrinsics.checkNotNullExpressionValue(setNewSetFromMap, "newSetFromMap(IdentityHashMap())");
        this.b = setNewSetFromMap;
    }
}
