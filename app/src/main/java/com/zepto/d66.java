package com.zepto;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d66 extends ArrayList {
    public d66(int i) {
        super(i);
    }

    public Object pop() {
        int size = size();
        if (size <= 0) {
            return null;
        }
        return remove(size - 1);
    }

    public Object r(Object obj) {
        add(obj);
        return obj;
    }

    public Object u() {
        int size = size();
        if (size <= 0) {
            return null;
        }
        return get(size - 1);
    }
}
