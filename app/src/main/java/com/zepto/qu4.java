package com.zepto;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class qu4 extends LinkedHashMap implements q14 {
    public final oj4 c;

    public qu4(oj4 oj4Var) {
        this.c = oj4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zepto.q14
    public String J(String str, String str2) {
        if (r(str) != null) {
            return null;
        }
        return (String) put(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zepto.q14
    public String U(String str) {
        String str2;
        return (size() <= 0 || (str2 = (String) get(str)) == null) ? r(str) : str2;
    }

    @Override // com.zepto.q14
    public String Z(String str) {
        if (containsValue(str)) {
            Iterator it = iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                String str3 = (String) get(str2);
                if (str3 != null && str3.equals(str)) {
                    return str2;
                }
            }
        }
        return u(str);
    }

    @Override // com.zepto.q14, java.lang.Iterable
    public Iterator iterator() {
        return keySet().iterator();
    }

    public final String r(String str) {
        q14 q14VarE = this.c.e();
        if (q14VarE == null) {
            return null;
        }
        String strU = q14VarE.U(str);
        if (containsValue(strU)) {
            return null;
        }
        return strU;
    }

    public final String u(String str) {
        q14 q14VarE = this.c.e();
        if (q14VarE != null) {
            return q14VarE.Z(str);
        }
        return null;
    }
}
