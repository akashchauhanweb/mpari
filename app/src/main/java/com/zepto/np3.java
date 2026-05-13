package com.zepto;

import com.zepto.kp3;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class np3 implements mp3 {
    public static int i(int i, Object obj, Object obj2) {
        lp3 lp3Var = (lp3) obj;
        wb0.a(obj2);
        if (lp3Var.isEmpty()) {
            return 0;
        }
        Iterator it = lp3Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    public static lp3 j(Object obj, Object obj2) {
        lp3 lp3VarL = (lp3) obj;
        lp3 lp3Var = (lp3) obj2;
        if (!lp3Var.isEmpty()) {
            if (!lp3VarL.h()) {
                lp3VarL = lp3VarL.l();
            }
            lp3VarL.k(lp3Var);
        }
        return lp3VarL;
    }

    @Override // com.zepto.mp3
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // com.zepto.mp3
    public Object b(Object obj) {
        return lp3.d().l();
    }

    @Override // com.zepto.mp3
    public int c(int i, Object obj, Object obj2) {
        return i(i, obj, obj2);
    }

    @Override // com.zepto.mp3
    public boolean d(Object obj) {
        return !((lp3) obj).h();
    }

    @Override // com.zepto.mp3
    public Object e(Object obj) {
        ((lp3) obj).i();
        return obj;
    }

    @Override // com.zepto.mp3
    public kp3.a f(Object obj) {
        wb0.a(obj);
        throw null;
    }

    @Override // com.zepto.mp3
    public Map g(Object obj) {
        return (lp3) obj;
    }

    @Override // com.zepto.mp3
    public Map h(Object obj) {
        return (lp3) obj;
    }
}
