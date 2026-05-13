package com.zepto;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'h' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class x33 {
    public static final x33 g;
    public static final x33 h;
    public static final x33 i;
    public static final x33 j;
    public static final x33 k;
    public static final x33 l;
    public static final x33 m;
    public static final x33 n;
    public static final x33 o;
    public static final x33 p;
    public static final /* synthetic */ x33[] q;
    public final Class c;
    public final Class e;
    public final Object f;

    static {
        x33 x33Var = new x33("VOID", 0, Void.class, Void.class, null);
        g = x33Var;
        Class cls = Integer.TYPE;
        x33 x33Var2 = new x33("INT", 1, cls, Integer.class, 0);
        h = x33Var2;
        x33 x33Var3 = new x33("LONG", 2, Long.TYPE, Long.class, 0L);
        i = x33Var3;
        x33 x33Var4 = new x33("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        j = x33Var4;
        x33 x33Var5 = new x33("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        k = x33Var5;
        x33 x33Var6 = new x33("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        l = x33Var6;
        x33 x33Var7 = new x33("STRING", 6, String.class, String.class, "");
        m = x33Var7;
        x33 x33Var8 = new x33("BYTE_STRING", 7, s80.class, s80.class, s80.e);
        n = x33Var8;
        x33 x33Var9 = new x33("ENUM", 8, cls, Integer.class, null);
        o = x33Var9;
        x33 x33Var10 = new x33("MESSAGE", 9, Object.class, Object.class, null);
        p = x33Var10;
        q = new x33[]{x33Var, x33Var2, x33Var3, x33Var4, x33Var5, x33Var6, x33Var7, x33Var8, x33Var9, x33Var10};
    }

    public x33(String str, int i2, Class cls, Class cls2, Object obj) {
        this.c = cls;
        this.e = cls2;
        this.f = obj;
    }

    public static x33 valueOf(String str) {
        return (x33) Enum.valueOf(x33.class, str);
    }

    public static x33[] values() {
        return (x33[]) q.clone();
    }

    public Class a() {
        return this.e;
    }
}
