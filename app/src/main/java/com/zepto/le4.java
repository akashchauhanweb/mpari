package com.zepto;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class le4 extends no6 {
    public static final po6 b = b(ei6.e);
    public final hi6 a;

    public class a implements po6 {
        public a() {
        }

        @Override // com.zepto.po6
        public no6 a(Gson gson, TypeToken typeToken) {
            if (typeToken.getRawType() == Number.class) {
                return le4.this;
            }
            return null;
        }
    }

    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[v53.values().length];
            a = iArr;
            try {
                iArr[v53.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[v53.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[v53.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public le4(hi6 hi6Var) {
        this.a = hi6Var;
    }

    public static po6 a(hi6 hi6Var) {
        return hi6Var == ei6.e ? b : b(hi6Var);
    }

    public static po6 b(hi6 hi6Var) {
        return new le4(hi6Var).new a();
    }

    @Override // com.zepto.no6
    public Number read(s53 s53Var) throws IOException {
        v53 v53VarG0 = s53Var.G0();
        int i = b.a[v53VarG0.ordinal()];
        if (i == 1) {
            s53Var.C0();
            return null;
        }
        if (i == 2 || i == 3) {
            return this.a.a(s53Var);
        }
        throw new u53("Expecting number, got: " + v53VarG0 + "; at path " + s53Var.b());
    }

    @Override // com.zepto.no6
    public void write(b63 b63Var, Number number) throws IOException {
        b63Var.I0(number);
    }
}
