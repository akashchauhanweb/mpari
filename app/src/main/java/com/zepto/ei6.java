package com.zepto;

import java.io.IOException;
import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public abstract class ei6 implements hi6 {
    public static final ei6 c = new a("DOUBLE", 0);
    public static final ei6 e = new ei6("LAZILY_PARSED_NUMBER", 1) { // from class: com.zepto.ei6.b
        {
            a aVar = null;
        }

        @Override // com.zepto.hi6
        public Number a(s53 s53Var) {
            return new kb3(s53Var.E0());
        }
    };
    public static final ei6 f = new ei6("LONG_OR_DOUBLE", 2) { // from class: com.zepto.ei6.c
        {
            a aVar = null;
        }

        @Override // com.zepto.hi6
        public Number a(s53 s53Var) throws IOException {
            String strE0 = s53Var.E0();
            try {
                try {
                    return Long.valueOf(Long.parseLong(strE0));
                } catch (NumberFormatException e2) {
                    throw new o53("Cannot parse " + strE0 + "; at path " + s53Var.U(), e2);
                }
            } catch (NumberFormatException unused) {
                Double dValueOf = Double.valueOf(strE0);
                if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                    if (!s53Var.e0()) {
                        throw new gp3("JSON forbids NaN and infinities: " + dValueOf + "; at path " + s53Var.U());
                    }
                }
                return dValueOf;
            }
        }
    };
    public static final ei6 g = new ei6("BIG_DECIMAL", 3) { // from class: com.zepto.ei6.d
        {
            a aVar = null;
        }

        @Override // com.zepto.hi6
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public BigDecimal a(s53 s53Var) throws IOException {
            String strE0 = s53Var.E0();
            try {
                return new BigDecimal(strE0);
            } catch (NumberFormatException e2) {
                throw new o53("Cannot parse " + strE0 + "; at path " + s53Var.U(), e2);
            }
        }
    };
    public static final /* synthetic */ ei6[] h = b();

    public enum a extends ei6 {
        public a(String str, int i) {
            super(str, i, null);
        }

        @Override // com.zepto.hi6
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Double a(s53 s53Var) {
            return Double.valueOf(s53Var.x0());
        }
    }

    public ei6(String str, int i) {
    }

    public static /* synthetic */ ei6[] b() {
        return new ei6[]{c, e, f, g};
    }

    public static ei6 valueOf(String str) {
        return (ei6) Enum.valueOf(ei6.class, str);
    }

    public static ei6[] values() {
        return (ei6[]) h.clone();
    }

    public /* synthetic */ ei6(String str, int i, a aVar) {
        this(str, i);
    }
}
