package com.zepto;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes2.dex */
public abstract class v40 implements s33 {
    public static final Set e = Collections.unmodifiableSet(new HashSet(Arrays.asList("AES", "ChaCha20")));
    public final Set a;
    public final Set b;
    public final q33 c = new q33();
    public final SecretKey d;

    public v40(Set set, Set set2, SecretKey secretKey) {
        if (set == null) {
            throw new IllegalArgumentException("The supported JWE algorithm set must not be null");
        }
        this.a = Collections.unmodifiableSet(set);
        if (set2 == null) {
            throw new IllegalArgumentException("The supported encryption methods must not be null");
        }
        this.b = set2;
        if (secretKey != null && set.size() > 1 && (secretKey.getAlgorithm() == null || !e.contains(secretKey.getAlgorithm()))) {
            throw new IllegalArgumentException("The algorithm of the content encryption key (CEK) must be AES or ChaCha20");
        }
        this.d = secretKey;
    }

    @Override // com.zepto.s33
    public Set a() {
        return this.b;
    }

    @Override // com.zepto.s33
    public Set c() {
        return this.a;
    }

    public SecretKey d(j22 j22Var) {
        return (f() || j22Var == null) ? this.d : jy0.c(j22Var, this.c.b());
    }

    public q33 e() {
        return this.c;
    }

    public boolean f() {
        return this.d != null;
    }
}
