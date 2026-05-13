package com.zepto;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class kt3 implements f02 {
    public int c;
    public StringBuffer e;

    public kt3(int i, String str) {
        this.c = i;
        this.e = new StringBuffer(str);
    }

    @Override // com.zepto.f02
    public boolean O() {
        return false;
    }

    public String a() {
        return this.e.toString();
    }

    @Override // com.zepto.f02
    public ArrayList a0() {
        return new ArrayList();
    }

    public String b() {
        switch (this.c) {
            case 1:
                return "title";
            case 2:
                return "subject";
            case 3:
                return "keywords";
            case 4:
                return "author";
            case 5:
                return "producer";
            case 6:
                return "creationdate";
            default:
                return "unknown";
        }
    }

    @Override // com.zepto.f02
    public boolean u(r02 r02Var) {
        try {
            return r02Var.d(this);
        } catch (cu1 unused) {
            return false;
        }
    }

    @Override // com.zepto.f02
    public int z() {
        return this.c;
    }
}
