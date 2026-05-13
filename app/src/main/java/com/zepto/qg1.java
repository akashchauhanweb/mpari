package com.zepto;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class qg1 implements p08 {
    public static final Map c;
    public final int a;
    public final String b;

    static {
        HashMap map = new HashMap();
        map.put(b("SHA-256", 32, 16, 67, 10), new qg1(1, "XMSS_SHA2_10_256"));
        map.put(b("SHA-256", 32, 16, 67, 16), new qg1(2, "XMSS_SHA2_16_256"));
        map.put(b("SHA-256", 32, 16, 67, 20), new qg1(3, "XMSS_SHA2_20_256"));
        map.put(b("SHA-512", 64, 16, 131, 10), new qg1(4, "XMSS_SHA2_10_512"));
        map.put(b("SHA-512", 64, 16, 131, 16), new qg1(5, "XMSS_SHA2_16_512"));
        map.put(b("SHA-512", 64, 16, 131, 20), new qg1(6, "XMSS_SHA2_20_512"));
        map.put(b("SHAKE128", 32, 16, 67, 10), new qg1(7, "XMSS_SHAKE_10_256"));
        map.put(b("SHAKE128", 32, 16, 67, 16), new qg1(8, "XMSS_SHAKE_16_256"));
        map.put(b("SHAKE128", 32, 16, 67, 20), new qg1(9, "XMSS_SHAKE_20_256"));
        map.put(b("SHAKE256", 64, 16, 131, 10), new qg1(10, "XMSS_SHAKE_10_512"));
        map.put(b("SHAKE256", 64, 16, 131, 16), new qg1(11, "XMSS_SHAKE_16_512"));
        map.put(b("SHAKE256", 64, 16, 131, 20), new qg1(12, "XMSS_SHAKE_20_512"));
        c = Collections.unmodifiableMap(map);
    }

    public qg1(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public static String b(String str, int i, int i2, int i3, int i4) {
        if (str == null) {
            throw new NullPointerException("algorithmName == null");
        }
        return str + "-" + i + "-" + i2 + "-" + i3 + "-" + i4;
    }

    public static qg1 c(String str, int i, int i2, int i3, int i4) {
        if (str != null) {
            return (qg1) c.get(b(str, i, i2, i3, i4));
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
