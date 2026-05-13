package com.zepto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class m44 {
    public final List<ml2> allHeaders;
    public final byte[] data;
    public final Map<String, String> headers;
    public final long networkTimeMs;
    public final boolean notModified;
    public final int statusCode;

    @Deprecated
    public m44(int i, byte[] bArr, Map<String, String> map, boolean z, long j) {
        this(i, bArr, map, toAllHeaderList(map), z, j);
    }

    private static List<ml2> toAllHeaderList(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new ml2(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    private static Map<String, String> toHeaderMap(List<ml2> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (ml2 ml2Var : list) {
            treeMap.put(ml2Var.getName(), ml2Var.getValue());
        }
        return treeMap;
    }

    public m44(int i, byte[] bArr, boolean z, long j, List<ml2> list) {
        this(i, bArr, toHeaderMap(list), list, z, j);
    }

    @Deprecated
    public m44(int i, byte[] bArr, Map<String, String> map, boolean z) {
        this(i, bArr, map, z, 0L);
    }

    public m44(byte[] bArr) {
        this(200, bArr, false, 0L, (List<ml2>) Collections.emptyList());
    }

    @Deprecated
    public m44(byte[] bArr, Map<String, String> map) {
        this(200, bArr, map, false, 0L);
    }

    private m44(int i, byte[] bArr, Map<String, String> map, List<ml2> list, boolean z, long j) {
        this.statusCode = i;
        this.data = bArr;
        this.headers = map;
        if (list == null) {
            this.allHeaders = null;
        } else {
            this.allHeaders = Collections.unmodifiableList(list);
        }
        this.notModified = z;
        this.networkTimeMs = j;
    }
}
