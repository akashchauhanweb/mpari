package com.zepto;

import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class pv4 {
    public static SparseArray a = new SparseArray();
    public static HashMap b;

    static {
        HashMap map = new HashMap();
        b = map;
        map.put(mv4.DEFAULT, 0);
        b.put(mv4.VERY_LOW, 1);
        b.put(mv4.HIGHEST, 2);
        for (mv4 mv4Var : b.keySet()) {
            a.append(((Integer) b.get(mv4Var)).intValue(), mv4Var);
        }
    }

    public static int a(mv4 mv4Var) {
        Integer num = (Integer) b.get(mv4Var);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + mv4Var);
    }

    public static mv4 b(int i) {
        mv4 mv4Var = (mv4) a.get(i);
        if (mv4Var != null) {
            return mv4Var;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i);
    }
}
