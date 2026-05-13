package com.zepto;

import com.zepto.at3;
import com.zepto.s80;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class k2 implements at3 {
    protected int memoizedHashCode = 0;

    public static abstract class a implements at3.a {
        public static rp6 g(at3 at3Var) {
            return new rp6(at3Var);
        }
    }

    @Override // com.zepto.at3
    public byte[] d() {
        try {
            byte[] bArr = new byte[a()];
            hr0 hr0VarU = hr0.U(bArr);
            c(hr0VarU);
            hr0VarU.c();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(h("byte array"), e);
        }
    }

    @Override // com.zepto.at3
    public s80 f() {
        try {
            s80.h hVarT = s80.T(a());
            c(hVarT.b());
            return hVarT.a();
        } catch (IOException e) {
            throw new RuntimeException(h("ByteString"), e);
        }
    }

    public abstract int g(dp5 dp5Var);

    public final String h(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public rp6 i() {
        return new rp6(this);
    }
}
