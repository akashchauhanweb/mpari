package com.zepto;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class oa3 {
    public final List a;
    public final int b;

    public oa3(ma3 ma3Var) {
        this(Arrays.asList(ma3Var));
    }

    public List a() {
        return this.a;
    }

    public ma3 b() {
        if (this.b > 0) {
            return (ma3) this.a.get(0);
        }
        return null;
    }

    public oa3(List list) {
        this.b = list.size();
        this.a = list;
    }
}
