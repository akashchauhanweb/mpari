package com.zepto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class cs4 extends ArrayList implements f02 {
    public float c;
    public zd2 e;

    public cs4() {
        this(16.0f);
    }

    @Override // com.zepto.f02
    public boolean O() {
        return true;
    }

    @Override // com.zepto.f02
    public ArrayList a0() {
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            arrayList.addAll(((f02) it.next()).a0());
        }
        return arrayList;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            add((f02) it.next());
        }
        return true;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public void add(int i, f02 f02Var) {
        if (f02Var == null) {
            return;
        }
        try {
            if (f02Var.z() == 10) {
                fk0 fk0Var = (fk0) f02Var;
                if (!this.e.l()) {
                    fk0Var.m(this.e.b(fk0Var.d()));
                }
                super.add(i, fk0Var);
                return;
            }
            if (f02Var.z() != 11 && f02Var.z() != 17 && f02Var.z() != 29 && f02Var.z() != 55 && f02Var.z() != 50) {
                throw new ClassCastException(String.valueOf(f02Var.z()));
            }
            super.add(i, f02Var);
        } catch (ClassCastException e) {
            throw new ClassCastException(dt3.b("insertion.of.illegal.element.1", e.getMessage()));
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public boolean add(f02 f02Var) {
        if (f02Var == null) {
            return false;
        }
        try {
            int iZ = f02Var.z();
            if (iZ == 14 || iZ == 17 || iZ == 23 || iZ == 29 || iZ == 50 || iZ == 55) {
                return super.add(f02Var);
            }
            switch (iZ) {
                case 10:
                    return h0((fk0) f02Var);
                case 11:
                case 12:
                    boolean zH0 = true;
                    for (f02 f02Var2 : (cs4) f02Var) {
                        zH0 &= f02Var2 instanceof fk0 ? h0((fk0) f02Var2) : add(f02Var2);
                    }
                    return zH0;
                default:
                    throw new ClassCastException(String.valueOf(f02Var.z()));
            }
        } catch (ClassCastException e) {
            throw new ClassCastException(dt3.b("insertion.of.illegal.element.1", e.getMessage()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean h0(fk0 fk0Var) {
        zd2 zd2VarD = fk0Var.d();
        String strC = fk0Var.c();
        zd2 zd2Var = this.e;
        if (zd2Var != null && !zd2Var.l()) {
            zd2VarD = this.e.b(fk0Var.d());
        }
        if (size() > 0 && !fk0Var.i()) {
            try {
                fk0 fk0Var2 = (fk0) get(size() - 1);
                if (!fk0Var2.i() && ((zd2VarD == null || zd2VarD.compareTo(fk0Var2.d()) == 0) && !"".equals(fk0Var2.c().trim()) && !"".equals(strC.trim()))) {
                    fk0Var2.a(strC);
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        fk0 fk0Var3 = new fk0(strC, zd2VarD);
        fk0Var3.l(fk0Var.b());
        return super.add(fk0Var3);
    }

    public zd2 i0() {
        return this.e;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        int size = size();
        if (size == 0) {
            return true;
        }
        if (size != 1) {
            return false;
        }
        f02 f02Var = (f02) get(0);
        return f02Var.z() == 10 && ((fk0) f02Var).j();
    }

    public gs2 j0() {
        return null;
    }

    public float k0() {
        zd2 zd2Var;
        return (!Float.isNaN(this.c) || (zd2Var = this.e) == null) ? this.c : zd2Var.e(1.5f);
    }

    public boolean l0() {
        return !Float.isNaN(this.c);
    }

    public void m0(gs2 gs2Var) {
    }

    @Override // com.zepto.f02
    public boolean u(r02 r02Var) {
        try {
            Iterator<E> it = iterator();
            while (it.hasNext()) {
                r02Var.d((f02) it.next());
            }
            return true;
        } catch (cu1 unused) {
            return false;
        }
    }

    @Override // com.zepto.f02
    public int z() {
        return 11;
    }

    public cs4(cs4 cs4Var) {
        this.c = Float.NaN;
        addAll(cs4Var);
        this.c = cs4Var.k0();
        this.e = cs4Var.i0();
        cs4Var.j0();
        m0(null);
    }

    public cs4(float f) {
        this.c = f;
        this.e = new zd2();
    }

    public cs4(fk0 fk0Var) {
        this.c = Float.NaN;
        super.add(fk0Var);
        this.e = fk0Var.d();
        fk0Var.f();
        m0(null);
    }

    public cs4(String str) {
        this(Float.NaN, str, new zd2());
    }

    public cs4(String str, zd2 zd2Var) {
        this(Float.NaN, str, zd2Var);
    }

    public cs4(float f, String str, zd2 zd2Var) {
        this.c = f;
        this.e = zd2Var;
        if (str == null || str.length() == 0) {
            return;
        }
        super.add(new fk0(str, zd2Var));
    }
}
