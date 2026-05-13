package com.zepto;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes2.dex */
public abstract class v35 extends v40 {
    public static final Set f;
    public static final Set g = jy0.a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(l33.g);
        linkedHashSet.add(l33.h);
        linkedHashSet.add(l33.i);
        linkedHashSet.add(l33.j);
        linkedHashSet.add(l33.k);
        f = Collections.unmodifiableSet(linkedHashSet);
    }

    public v35(SecretKey secretKey) {
        super(f, jy0.a, secretKey);
    }
}
