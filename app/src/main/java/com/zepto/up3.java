package com.zepto;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class up3 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class a implements wh2 {
        public static final a c = new C0124a("KEY", 0);
        public static final a e = new b("VALUE", 1);
        public static final /* synthetic */ a[] f = b();

        /* JADX INFO: renamed from: com.zepto.up3$a$a, reason: collision with other inner class name */
        public enum C0124a extends a {
            public C0124a(String str, int i) {
                super(str, i, null);
            }

            @Override // com.zepto.wh2
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Object a(Map.Entry entry) {
                return entry.getKey();
            }
        }

        public enum b extends a {
            public b(String str, int i) {
                super(str, i, null);
            }

            @Override // com.zepto.wh2
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Object a(Map.Entry entry) {
                return entry.getValue();
            }
        }

        public a(String str, int i) {
        }

        public static /* synthetic */ a[] b() {
            return new a[]{c, e};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f.clone();
        }

        public /* synthetic */ a(String str, int i, tp3 tp3Var) {
            this(str, i);
        }
    }

    public static boolean a(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static String b(Map map) {
        StringBuilder sbA = or0.a(map.size());
        sbA.append('{');
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z) {
                sbA.append(", ");
            }
            sbA.append(entry.getKey());
            sbA.append('=');
            sbA.append(entry.getValue());
            z = false;
        }
        sbA.append('}');
        return sbA.toString();
    }

    public static wh2 c() {
        return a.e;
    }
}
