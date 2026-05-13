package com.zepto;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ib2 implements jb2 {
    public static final ib2 c;
    public static final ib2 e;
    public static final ib2 f;
    public static final ib2 g;
    public static final ib2 h;
    public static final ib2 i;
    public static final ib2 j;
    public static final /* synthetic */ ib2[] k;

    public enum a extends ib2 {
        public a(String str, int i) {
            super(str, i, null);
        }

        @Override // com.zepto.jb2
        public String a(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a("IDENTITY", 0);
        c = aVar;
        ib2 ib2Var = new ib2("UPPER_CAMEL_CASE", 1) { // from class: com.zepto.ib2.b
            {
                a aVar2 = null;
            }

            @Override // com.zepto.jb2
            public String a(Field field) {
                return ib2.c(field.getName());
            }
        };
        e = ib2Var;
        ib2 ib2Var2 = new ib2("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: com.zepto.ib2.c
            {
                a aVar2 = null;
            }

            @Override // com.zepto.jb2
            public String a(Field field) {
                return ib2.c(ib2.b(field.getName(), ' '));
            }
        };
        f = ib2Var2;
        ib2 ib2Var3 = new ib2("UPPER_CASE_WITH_UNDERSCORES", 3) { // from class: com.zepto.ib2.d
            {
                a aVar2 = null;
            }

            @Override // com.zepto.jb2
            public String a(Field field) {
                return ib2.b(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        };
        g = ib2Var3;
        ib2 ib2Var4 = new ib2("LOWER_CASE_WITH_UNDERSCORES", 4) { // from class: com.zepto.ib2.e
            {
                a aVar2 = null;
            }

            @Override // com.zepto.jb2
            public String a(Field field) {
                return ib2.b(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        };
        h = ib2Var4;
        ib2 ib2Var5 = new ib2("LOWER_CASE_WITH_DASHES", 5) { // from class: com.zepto.ib2.f
            {
                a aVar2 = null;
            }

            @Override // com.zepto.jb2
            public String a(Field field) {
                return ib2.b(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        };
        i = ib2Var5;
        ib2 ib2Var6 = new ib2("LOWER_CASE_WITH_DOTS", 6) { // from class: com.zepto.ib2.g
            {
                a aVar2 = null;
            }

            @Override // com.zepto.jb2
            public String a(Field field) {
                return ib2.b(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        };
        j = ib2Var6;
        k = new ib2[]{aVar, ib2Var, ib2Var2, ib2Var3, ib2Var4, ib2Var5, ib2Var6};
    }

    public ib2(String str, int i2) {
    }

    public static String b(String str, char c2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(c2);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static String c(String str) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (Character.isLetter(cCharAt)) {
                if (Character.isUpperCase(cCharAt)) {
                    return str;
                }
                char upperCase = Character.toUpperCase(cCharAt);
                if (i2 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i2) + upperCase + str.substring(i2 + 1);
            }
        }
        return str;
    }

    public static ib2 valueOf(String str) {
        return (ib2) Enum.valueOf(ib2.class, str);
    }

    public static ib2[] values() {
        return (ib2[]) k.clone();
    }

    public /* synthetic */ ib2(String str, int i2, a aVar) {
        this(str, i2);
    }
}
