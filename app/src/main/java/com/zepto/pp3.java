package com.zepto;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class pp3 implements bc2 {
    public bc2 a;
    public Map b;

    public pp3(Map map) {
        this(map, null);
    }

    @Override // com.zepto.bc2
    public String a(String str) {
        Map map = this.b;
        Object obj = map != null ? map.get(str) : null;
        if (obj != null) {
            return obj.toString();
        }
        bc2 bc2Var = this.a;
        if (bc2Var != null) {
            return bc2Var.a(str);
        }
        return null;
    }

    public pp3(Map map, bc2 bc2Var) {
        this.a = bc2Var;
        this.b = map;
    }
}
