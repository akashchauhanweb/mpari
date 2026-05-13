package com.zepto;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class gu7 implements p08 {
    public static final Map c;
    public final int a;
    public final String b;

    static {
        HashMap map = new HashMap();
        map.put(b("SHA-256", 32, 16, 67), new gu7(16777217, "WOTSP_SHA2-256_W16"));
        map.put(b("SHA-512", 64, 16, 131), new gu7(33554434, "WOTSP_SHA2-512_W16"));
        map.put(b("SHAKE128", 32, 16, 67), new gu7(50331651, "WOTSP_SHAKE128_W16"));
        map.put(b("SHAKE256", 64, 16, 131), new gu7(67108868, "WOTSP_SHAKE256_W16"));
        c = Collections.unmodifiableMap(map);
    }

    public gu7(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public static String b(String str, int i, int i2, int i3) {
        if (str == null) {
            throw new NullPointerException("algorithmName == null");
        }
        return str + "-" + i + "-" + i2 + "-" + i3;
    }

    public static gu7 c(String str, int i, int i2, int i3) {
        if (str != null) {
            return (gu7) c.get(b(str, i, i2, i3));
        }
        throw new NullPointerException("algorithmName == null");
    }

    @Override // com.zepto.p08
    public int a() {
        return this.a;
    }

    public String toString() {
        return this.b;
    }
}
