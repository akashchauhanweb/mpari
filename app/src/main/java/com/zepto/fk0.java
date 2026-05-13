package com.zepto;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class fk0 implements f02 {
    public static final fk0 g = new fk0("\n");
    public static final fk0 h;
    public StringBuffer c;
    public zd2 e;
    public HashMap f;

    static {
        fk0 fk0Var = new fk0("");
        h = fk0Var;
        fk0Var.n();
    }

    public fk0(String str, zd2 zd2Var) {
        this.c = null;
        this.e = null;
        this.f = null;
        this.c = new StringBuffer(str);
        this.e = zd2Var;
    }

    @Override // com.zepto.f02
    public boolean O() {
        return true;
    }

    public StringBuffer a(String str) {
        StringBuffer stringBuffer = this.c;
        stringBuffer.append(str);
        return stringBuffer;
    }

    @Override // com.zepto.f02
    public ArrayList a0() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        return arrayList;
    }

    public HashMap b() {
        return this.f;
    }

    public String c() {
        return this.c.toString();
    }

    public zd2 d() {
        return this.e;
    }

    public float e() {
        Float f;
        HashMap map = this.f;
        if (map == null || (f = (Float) map.get("HSCALE")) == null) {
            return 1.0f;
        }
        return f.floatValue();
    }

    public gs2 f() {
        HashMap map = this.f;
        if (map == null) {
            return null;
        }
        wb0.a(map.get("HYPHENATION"));
        return null;
    }

    public hx2 g() {
        Object[] objArr;
        HashMap map = this.f;
        if (map == null || (objArr = (Object[]) map.get("IMAGE")) == null) {
            return null;
        }
        wb0.a(objArr[0]);
        return null;
    }

    public float h() {
        g();
        return this.e.d(true).x(c(), this.e.f()) * e();
    }

    public boolean i() {
        return this.f != null;
    }

    public boolean j() {
        return this.c.toString().trim().length() == 0 && this.c.toString().indexOf("\n") == -1 && this.f == null;
    }

    public final fk0 k(String str, Object obj) {
        if (this.f == null) {
            this.f = new HashMap();
        }
        this.f.put(str, obj);
        return this;
    }

    public void l(HashMap map) {
        this.f = map;
    }

    public void m(zd2 zd2Var) {
        this.e = zd2Var;
    }

    public fk0 n() {
        return k("NEWPAGE", null);
    }

    public String toString() {
        return c();
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
        return 10;
    }

    public fk0(String str) {
        this(str, new zd2());
    }
}
