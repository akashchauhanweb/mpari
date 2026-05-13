package com.zepto;

import java.security.AlgorithmParameters;
import java.security.Provider;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fo {
    public static AlgorithmParameters a(String str, Provider provider) {
        return provider == null ? AlgorithmParameters.getInstance(str) : AlgorithmParameters.getInstance(str, provider);
    }
}
