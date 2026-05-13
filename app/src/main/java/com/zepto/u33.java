package com.zepto;

import java.io.Serializable;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class u33 implements Serializable {
    public static final Set e;
    public final Map c;

    public static class b {
        public final Map a = new LinkedHashMap();

        public u33 a() {
            return new u33(this.a);
        }

        public b b(Date date) {
            this.a.put("exp", date);
            return this;
        }

        public b c(Date date) {
            this.a.put("iat", date);
            return this;
        }

        public b d(String str) {
            this.a.put("iss", str);
            return this;
        }

        public b e(String str) {
            this.a.put("jti", str);
            return this;
        }

        public b f(Date date) {
            this.a.put("nbf", date);
            return this;
        }

        public b g(String str) {
            this.a.put("sub", str);
            return this;
        }
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("iss");
        hashSet.add("sub");
        hashSet.add("aud");
        hashSet.add("exp");
        hashSet.add("nbf");
        hashSet.add("iat");
        hashSet.add("jti");
        e = Collections.unmodifiableSet(hashSet);
    }

    public List a() {
        Object objB = b("aud");
        if (objB instanceof String) {
            return Collections.singletonList((String) objB);
        }
        try {
            List listE = e("aud");
            return listE != null ? listE : Collections.emptyList();
        } catch (ParseException unused) {
            return Collections.emptyList();
        }
    }

    public Object b(String str) {
        return this.c.get(str);
    }

    public List c(String str) throws ParseException {
        if (b(str) == null) {
            return null;
        }
        try {
            return (List) b(str);
        } catch (ClassCastException unused) {
            throw new ParseException("The " + str + " claim is not a list / JSON array", 0);
        }
    }

    public String[] d(String str) throws ParseException {
        List listC = c(str);
        if (listC == null) {
            return null;
        }
        int size = listC.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            try {
                strArr[i] = (String) listC.get(i);
            } catch (ClassCastException unused) {
                throw new ParseException("The " + str + " claim is not a list / JSON array of strings", 0);
            }
        }
        return strArr;
    }

    public List e(String str) throws ParseException {
        String[] strArrD = d(str);
        if (strArrD == null) {
            return null;
        }
        return Collections.unmodifiableList(Arrays.asList(strArrD));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u33) {
            return Objects.equals(this.c, ((u33) obj).c);
        }
        return false;
    }

    public Map f() {
        return g(false);
    }

    public Map g(boolean z) {
        Map mapA = j33.a();
        for (Map.Entry entry : this.c.entrySet()) {
            if (entry.getValue() instanceof Date) {
                mapA.put(entry.getKey(), Long.valueOf(ee1.a((Date) entry.getValue())));
            } else if ("aud".equals(entry.getKey())) {
                List listA = a();
                if (listA == null || listA.isEmpty()) {
                    if (z) {
                        mapA.put("aud", null);
                    }
                } else if (listA.size() == 1) {
                    mapA.put("aud", listA.get(0));
                } else {
                    List listA2 = i33.a();
                    listA2.addAll(listA);
                    mapA.put("aud", listA2);
                }
            } else if (entry.getValue() != null) {
                mapA.put(entry.getKey(), entry.getValue());
            } else if (z) {
                mapA.put(entry.getKey(), null);
            }
        }
        return mapA;
    }

    public int hashCode() {
        return Objects.hash(this.c);
    }

    public String toString() {
        return j33.b(f());
    }

    public u33(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.c = linkedHashMap;
        linkedHashMap.putAll(map);
    }
}
