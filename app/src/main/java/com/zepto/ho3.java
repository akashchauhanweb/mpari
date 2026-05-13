package com.zepto;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ho3 {
    public static final ho3 c;
    public static final ho3 e;
    public static final /* synthetic */ ho3[] f;

    public enum a extends ho3 {
        public a(String str, int i) {
            super(str, i, null);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        c = aVar;
        ho3 ho3Var = new ho3("STRING", 1) { // from class: com.zepto.ho3.b
            {
                a aVar2 = null;
            }
        };
        e = ho3Var;
        f = new ho3[]{aVar, ho3Var};
    }

    public ho3(String str, int i) {
    }

    public static ho3 valueOf(String str) {
        return (ho3) Enum.valueOf(ho3.class, str);
    }

    public static ho3[] values() {
        return (ho3[]) f.clone();
    }

    public /* synthetic */ ho3(String str, int i, a aVar) {
        this(str, i);
    }
}
