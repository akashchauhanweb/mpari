package com.zepto;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ji1 extends mi1 {
    public final List c;

    public ji1(List list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.c = list;
    }
}
