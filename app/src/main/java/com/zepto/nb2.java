package com.zepto;

import java.lang.reflect.Type;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'i' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class nb2 {
    public static final nb2 A;
    public static final nb2 B;
    public static final nb2 C;
    public static final nb2 D;
    public static final nb2 E;
    public static final nb2 F;
    public static final nb2 G;
    public static final nb2 H;
    public static final nb2 I;
    public static final nb2 J;
    public static final nb2 K;
    public static final nb2 L;
    public static final nb2 M;
    public static final nb2 N;
    public static final nb2 O;
    public static final nb2 P;
    public static final nb2 Q;
    public static final nb2 R;
    public static final nb2 S;
    public static final nb2 T;
    public static final nb2 U;
    public static final nb2 V;
    public static final nb2 W;
    public static final nb2 X;
    public static final nb2 Y;
    public static final nb2 Z;
    public static final nb2 a0;
    public static final nb2 b0;
    public static final nb2 c0;
    public static final nb2 d0;
    public static final nb2 e0;
    public static final nb2 f0;
    public static final nb2 g0;
    public static final nb2[] h0;
    public static final nb2 i;
    public static final Type[] i0;
    public static final nb2 j;
    public static final /* synthetic */ nb2[] j0;
    public static final nb2 k;
    public static final nb2 l;
    public static final nb2 m;
    public static final nb2 n;
    public static final nb2 o;
    public static final nb2 p;
    public static final nb2 q;
    public static final nb2 r;
    public static final nb2 s;
    public static final nb2 t;
    public static final nb2 u;
    public static final nb2 v;
    public static final nb2 w;
    public static final nb2 x;
    public static final nb2 y;
    public static final nb2 z;
    public final x33 c;
    public final int e;
    public final b f;
    public final Class g;
    public final boolean h;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[x33.values().length];
            b = iArr;
            try {
                iArr[x33.n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[x33.p.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[x33.m.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            a = iArr2;
            try {
                iArr2[b.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.VECTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[b.SCALAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum b {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);

        public final boolean c;

        b(boolean z) {
            this.c = z;
        }
    }

    static {
        b bVar = b.SCALAR;
        x33 x33Var = x33.k;
        nb2 nb2Var = new nb2("DOUBLE", 0, 0, bVar, x33Var);
        i = nb2Var;
        x33 x33Var2 = x33.j;
        nb2 nb2Var2 = new nb2("FLOAT", 1, 1, bVar, x33Var2);
        j = nb2Var2;
        x33 x33Var3 = x33.i;
        nb2 nb2Var3 = new nb2("INT64", 2, 2, bVar, x33Var3);
        k = nb2Var3;
        nb2 nb2Var4 = new nb2("UINT64", 3, 3, bVar, x33Var3);
        l = nb2Var4;
        x33 x33Var4 = x33.h;
        nb2 nb2Var5 = new nb2("INT32", 4, 4, bVar, x33Var4);
        m = nb2Var5;
        nb2 nb2Var6 = new nb2("FIXED64", 5, 5, bVar, x33Var3);
        n = nb2Var6;
        nb2 nb2Var7 = new nb2("FIXED32", 6, 6, bVar, x33Var4);
        o = nb2Var7;
        x33 x33Var5 = x33.l;
        nb2 nb2Var8 = new nb2("BOOL", 7, 7, bVar, x33Var5);
        p = nb2Var8;
        x33 x33Var6 = x33.m;
        nb2 nb2Var9 = new nb2("STRING", 8, 8, bVar, x33Var6);
        q = nb2Var9;
        x33 x33Var7 = x33.p;
        nb2 nb2Var10 = new nb2("MESSAGE", 9, 9, bVar, x33Var7);
        r = nb2Var10;
        x33 x33Var8 = x33.n;
        nb2 nb2Var11 = new nb2("BYTES", 10, 10, bVar, x33Var8);
        s = nb2Var11;
        nb2 nb2Var12 = new nb2("UINT32", 11, 11, bVar, x33Var4);
        t = nb2Var12;
        x33 x33Var9 = x33.o;
        nb2 nb2Var13 = new nb2("ENUM", 12, 12, bVar, x33Var9);
        u = nb2Var13;
        nb2 nb2Var14 = new nb2("SFIXED32", 13, 13, bVar, x33Var4);
        v = nb2Var14;
        nb2 nb2Var15 = new nb2("SFIXED64", 14, 14, bVar, x33Var3);
        w = nb2Var15;
        nb2 nb2Var16 = new nb2("SINT32", 15, 15, bVar, x33Var4);
        x = nb2Var16;
        nb2 nb2Var17 = new nb2("SINT64", 16, 16, bVar, x33Var3);
        y = nb2Var17;
        nb2 nb2Var18 = new nb2("GROUP", 17, 17, bVar, x33Var7);
        z = nb2Var18;
        b bVar2 = b.VECTOR;
        nb2 nb2Var19 = new nb2("DOUBLE_LIST", 18, 18, bVar2, x33Var);
        A = nb2Var19;
        nb2 nb2Var20 = new nb2("FLOAT_LIST", 19, 19, bVar2, x33Var2);
        B = nb2Var20;
        nb2 nb2Var21 = new nb2("INT64_LIST", 20, 20, bVar2, x33Var3);
        C = nb2Var21;
        nb2 nb2Var22 = new nb2("UINT64_LIST", 21, 21, bVar2, x33Var3);
        D = nb2Var22;
        nb2 nb2Var23 = new nb2("INT32_LIST", 22, 22, bVar2, x33Var4);
        E = nb2Var23;
        nb2 nb2Var24 = new nb2("FIXED64_LIST", 23, 23, bVar2, x33Var3);
        F = nb2Var24;
        nb2 nb2Var25 = new nb2("FIXED32_LIST", 24, 24, bVar2, x33Var4);
        G = nb2Var25;
        nb2 nb2Var26 = new nb2("BOOL_LIST", 25, 25, bVar2, x33Var5);
        H = nb2Var26;
        nb2 nb2Var27 = new nb2("STRING_LIST", 26, 26, bVar2, x33Var6);
        I = nb2Var27;
        nb2 nb2Var28 = new nb2("MESSAGE_LIST", 27, 27, bVar2, x33Var7);
        J = nb2Var28;
        nb2 nb2Var29 = new nb2("BYTES_LIST", 28, 28, bVar2, x33Var8);
        K = nb2Var29;
        nb2 nb2Var30 = new nb2("UINT32_LIST", 29, 29, bVar2, x33Var4);
        L = nb2Var30;
        nb2 nb2Var31 = new nb2("ENUM_LIST", 30, 30, bVar2, x33Var9);
        M = nb2Var31;
        nb2 nb2Var32 = new nb2("SFIXED32_LIST", 31, 31, bVar2, x33Var4);
        N = nb2Var32;
        nb2 nb2Var33 = new nb2("SFIXED64_LIST", 32, 32, bVar2, x33Var3);
        O = nb2Var33;
        nb2 nb2Var34 = new nb2("SINT32_LIST", 33, 33, bVar2, x33Var4);
        P = nb2Var34;
        nb2 nb2Var35 = new nb2("SINT64_LIST", 34, 34, bVar2, x33Var3);
        Q = nb2Var35;
        b bVar3 = b.PACKED_VECTOR;
        nb2 nb2Var36 = new nb2("DOUBLE_LIST_PACKED", 35, 35, bVar3, x33Var);
        R = nb2Var36;
        nb2 nb2Var37 = new nb2("FLOAT_LIST_PACKED", 36, 36, bVar3, x33Var2);
        S = nb2Var37;
        nb2 nb2Var38 = new nb2("INT64_LIST_PACKED", 37, 37, bVar3, x33Var3);
        T = nb2Var38;
        nb2 nb2Var39 = new nb2("UINT64_LIST_PACKED", 38, 38, bVar3, x33Var3);
        U = nb2Var39;
        nb2 nb2Var40 = new nb2("INT32_LIST_PACKED", 39, 39, bVar3, x33Var4);
        V = nb2Var40;
        nb2 nb2Var41 = new nb2("FIXED64_LIST_PACKED", 40, 40, bVar3, x33Var3);
        W = nb2Var41;
        nb2 nb2Var42 = new nb2("FIXED32_LIST_PACKED", 41, 41, bVar3, x33Var4);
        X = nb2Var42;
        nb2 nb2Var43 = new nb2("BOOL_LIST_PACKED", 42, 42, bVar3, x33Var5);
        Y = nb2Var43;
        nb2 nb2Var44 = new nb2("UINT32_LIST_PACKED", 43, 43, bVar3, x33Var4);
        Z = nb2Var44;
        nb2 nb2Var45 = new nb2("ENUM_LIST_PACKED", 44, 44, bVar3, x33Var9);
        a0 = nb2Var45;
        nb2 nb2Var46 = new nb2("SFIXED32_LIST_PACKED", 45, 45, bVar3, x33Var4);
        b0 = nb2Var46;
        nb2 nb2Var47 = new nb2("SFIXED64_LIST_PACKED", 46, 46, bVar3, x33Var3);
        c0 = nb2Var47;
        nb2 nb2Var48 = new nb2("SINT32_LIST_PACKED", 47, 47, bVar3, x33Var4);
        d0 = nb2Var48;
        nb2 nb2Var49 = new nb2("SINT64_LIST_PACKED", 48, 48, bVar3, x33Var3);
        e0 = nb2Var49;
        nb2 nb2Var50 = new nb2("GROUP_LIST", 49, 49, bVar2, x33Var7);
        f0 = nb2Var50;
        nb2 nb2Var51 = new nb2("MAP", 50, 50, b.MAP, x33.g);
        g0 = nb2Var51;
        j0 = new nb2[]{nb2Var, nb2Var2, nb2Var3, nb2Var4, nb2Var5, nb2Var6, nb2Var7, nb2Var8, nb2Var9, nb2Var10, nb2Var11, nb2Var12, nb2Var13, nb2Var14, nb2Var15, nb2Var16, nb2Var17, nb2Var18, nb2Var19, nb2Var20, nb2Var21, nb2Var22, nb2Var23, nb2Var24, nb2Var25, nb2Var26, nb2Var27, nb2Var28, nb2Var29, nb2Var30, nb2Var31, nb2Var32, nb2Var33, nb2Var34, nb2Var35, nb2Var36, nb2Var37, nb2Var38, nb2Var39, nb2Var40, nb2Var41, nb2Var42, nb2Var43, nb2Var44, nb2Var45, nb2Var46, nb2Var47, nb2Var48, nb2Var49, nb2Var50, nb2Var51};
        i0 = new Type[0];
        nb2[] nb2VarArrValues = values();
        h0 = new nb2[nb2VarArrValues.length];
        for (nb2 nb2Var52 : nb2VarArrValues) {
            h0[nb2Var52.e] = nb2Var52;
        }
    }

    public nb2(String str, int i2, int i3, b bVar, x33 x33Var) {
        int i4;
        this.e = i3;
        this.f = bVar;
        this.c = x33Var;
        int i5 = a.a[bVar.ordinal()];
        if (i5 == 1 || i5 == 2) {
            this.g = x33Var.a();
        } else {
            this.g = null;
        }
        this.h = (bVar != b.SCALAR || (i4 = a.b[x33Var.ordinal()]) == 1 || i4 == 2 || i4 == 3) ? false : true;
    }

    public static nb2 valueOf(String str) {
        return (nb2) Enum.valueOf(nb2.class, str);
    }

    public static nb2[] values() {
        return (nb2[]) j0.clone();
    }

    public int a() {
        return this.e;
    }
}
