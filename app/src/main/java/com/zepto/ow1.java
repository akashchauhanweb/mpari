package com.zepto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ow1 {
    public String a;
    public String b;
    public String c;
    public nv4 d = nv4.MEDIUM;
    public Object e;
    public int f;
    public int g;
    public String h;
    public HashMap i;

    public ow1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public nw1 a() {
        return new nw1(this);
    }

    public ow1 b(String str, String str2) {
        if (this.i == null) {
            this.i = new HashMap();
        }
        List arrayList = (List) this.i.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.i.put(str, arrayList);
        }
        if (!arrayList.contains(str2)) {
            arrayList.add(str2);
        }
        return this;
    }
}
