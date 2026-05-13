package com.zepto;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public abstract class fi6 implements gi6 {
    public static final fi6 c;
    public static final fi6 e;
    public static final fi6 f;
    public static final fi6 g;
    public static final /* synthetic */ fi6[] h;

    public enum a extends fi6 {
        public a(String str, int i) {
            super(str, i, null);
        }
    }

    static {
        a aVar = new a("DOUBLE", 0);
        c = aVar;
        fi6 fi6Var = new fi6("LAZILY_PARSED_NUMBER", 1) { // from class: com.zepto.fi6.b
            {
                a aVar2 = null;
            }
        };
        e = fi6Var;
        fi6 fi6Var2 = new fi6("LONG_OR_DOUBLE", 2) { // from class: com.zepto.fi6.c
            {
                a aVar2 = null;
            }
        };
        f = fi6Var2;
        fi6 fi6Var3 = new fi6("BIG_DECIMAL", 3) { // from class: com.zepto.fi6.d
            {
                a aVar2 = null;
            }
        };
        g = fi6Var3;
        h = new fi6[]{aVar, fi6Var, fi6Var2, fi6Var3};
    }

    public fi6(String str, int i) {
    }

    public static fi6 valueOf(String str) {
        return (fi6) Enum.valueOf(fi6.class, str);
    }

    public static fi6[] values() {
        return (fi6[]) h.clone();
    }

    public /* synthetic */ fi6(String str, int i, a aVar) {
        this(str, i);
    }
}
