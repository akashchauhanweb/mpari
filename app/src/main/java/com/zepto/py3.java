package com.zepto;

import com.zepto.tw3;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class py3 {
    public static final py3 b = new py3();
    public static final b c = new b();
    public final AtomicReference a = new AtomicReference();

    public static class b implements tw3 {
        public b() {
        }

        @Override // com.zepto.tw3
        public tw3.a a(uw3 uw3Var, String str, String str2) {
            return vw3.a;
        }
    }

    public static py3 b() {
        return b;
    }

    public tw3 a() {
        tw3 tw3Var = (tw3) this.a.get();
        return tw3Var == null ? c : tw3Var;
    }
}
