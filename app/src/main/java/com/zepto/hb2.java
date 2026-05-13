package com.zepto;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public abstract class hb2 implements kb2 {
    public static final hb2 c = new a("IDENTITY", 0);
    public static final hb2 e = new hb2("UPPER_CAMEL_CASE", 1) { // from class: com.zepto.hb2.b
        {
            a aVar = null;
        }

        @Override // com.zepto.kb2
        public String a(Field field) {
            return hb2.d(field.getName());
        }
    };
    public static final hb2 f = new hb2("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: com.zepto.hb2.c
        {
            a aVar = null;
        }

        @Override // com.zepto.kb2
        public String a(Field field) {
            return hb2.d(hb2.c(field.getName(), ' '));
        }
    };
    public static final hb2 g = new hb2("UPPER_CASE_WITH_UNDERSCORES", 3) { // from class: com.zepto.hb2.d
        {
            a aVar = null;
        }

        @Override // com.zepto.kb2
        public String a(Field field) {
            return hb2.c(field.getName(), '_').toUpperCase(Locale.ENGLISH);
        }
    };
    public static final hb2 h = new hb2("LOWER_CASE_WITH_UNDERSCORES", 4) { // from class: com.zepto.hb2.e
        {
            a aVar = null;
        }

        @Override // com.zepto.kb2
        public String a(Field field) {
            return hb2.c(field.getName(), '_').toLowerCase(Locale.ENGLISH);
        }
    };
    public static final hb2 i = new hb2("LOWER_CASE_WITH_DASHES", 5) { // from class: com.zepto.hb2.f
        {
            a aVar = null;
        }

        @Override // com.zepto.kb2
        public String a(Field field) {
            return hb2.c(field.getName(), '-').toLowerCase(Locale.ENGLISH);
        }
    };
    public static final hb2 j = new hb2("LOWER_CASE_WITH_DOTS", 6) { // from class: com.zepto.hb2.g
        {
            a aVar = null;
        }

        @Override // com.zepto.kb2
        public String a(Field field) {
            return hb2.c(field.getName(), '.').toLowerCase(Locale.ENGLISH);
        }
    };
    public static final /* synthetic */ hb2[] k = b();

    public enum a extends hb2 {
        public a(String str, int i) {
            super(str, i, null);
        }

        @Override // com.zepto.kb2
        public String a(Field field) {
            return field.getName();
        }
    }

    public hb2(String str, int i2) {
    }

    public static /* synthetic */ hb2[] b() {
        return new hb2[]{c, e, f, g, h, i, j};
    }

    public static String c(String str, char c2) {
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

    public static String d(String str) {
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

    public static hb2 valueOf(String str) {
        return (hb2) Enum.valueOf(hb2.class, str);
    }

    public static hb2[] values() {
        return (hb2[]) k.clone();
    }

    public /* synthetic */ hb2(String str, int i2, a aVar) {
        this(str, i2);
    }
}
