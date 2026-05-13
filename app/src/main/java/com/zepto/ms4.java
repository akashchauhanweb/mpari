package com.zepto;

import android.os.Bundle;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class ms4 {
    public static final Set a = new HashSet(Arrays.asList("app_update", "review"));
    public static final Set b = new HashSet(Arrays.asList("native", "unity"));
    public static final Map c = new HashMap();
    public static final z68 d = new z68("PlayCoreVersion");

    public static Bundle a(String str) {
        Bundle bundle = new Bundle();
        Map mapB = b(str);
        bundle.putInt("playcore_version_code", ((Integer) mapB.get("java")).intValue());
        if (mapB.containsKey("native")) {
            bundle.putInt("playcore_native_version", ((Integer) mapB.get("native")).intValue());
        }
        if (mapB.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", ((Integer) mapB.get("unity")).intValue());
        }
        return bundle;
    }

    public static synchronized Map b(String str) {
        Map map;
        try {
            map = c;
            if (!map.containsKey(str)) {
                HashMap map2 = new HashMap();
                map2.put("java", 11003);
                map.put(str, map2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) map.get(str);
    }
}
