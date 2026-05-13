package com.zepto;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class nj2 {
    public static volatile nj2 b;
    public final Set a = new HashSet();

    public static nj2 a() {
        nj2 nj2Var = b;
        if (nj2Var == null) {
            synchronized (nj2.class) {
                try {
                    nj2Var = b;
                    if (nj2Var == null) {
                        nj2Var = new nj2();
                        b = nj2Var;
                    }
                } finally {
                }
            }
        }
        return nj2Var;
    }

    public Set b() {
        Set setUnmodifiableSet;
        synchronized (this.a) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.a);
        }
        return setUnmodifiableSet;
    }
}
