package com.zepto;

import java.util.Stack;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e66 implements bc2 {
    public Stack a = new Stack();

    @Override // com.zepto.bc2
    public String a(String str) {
        String strA;
        int size = this.a.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
            strA = ((bc2) this.a.get(size)).a(str);
        } while (strA == null);
        return strA;
    }

    public void b(bc2 bc2Var) {
        this.a.push(bc2Var);
    }
}
