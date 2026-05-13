package com.zepto;

import android.util.Log;
import com.zepto.dh2;
import com.zepto.mg2;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class o30 extends dh2 implements mg2.m {
    public final mg2 t;
    public boolean u;
    public int v;
    public boolean w;

    public o30(mg2 mg2Var) {
        super(mg2Var.t0(), mg2Var.w0() != null ? mg2Var.w0().f().getClassLoader() : null);
        this.v = -1;
        this.w = false;
        this.t = mg2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.zepto.sf2 A(java.util.ArrayList r17, com.zepto.sf2 r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = 0
        L7:
            java.util.ArrayList r5 = r0.c
            int r5 = r5.size()
            if (r4 >= r5) goto Lbe
            java.util.ArrayList r5 = r0.c
            java.lang.Object r5 = r5.get(r4)
            com.zepto.dh2$a r5 = (com.zepto.dh2.a) r5
            int r6 = r5.a
            r7 = 1
            if (r6 == r7) goto Lb6
            r8 = 2
            r9 = 0
            r10 = 3
            r11 = 9
            if (r6 == r8) goto L5a
            if (r6 == r10) goto L43
            r8 = 6
            if (r6 == r8) goto L43
            r8 = 7
            if (r6 == r8) goto Lb6
            r8 = 8
            if (r6 == r8) goto L31
            goto Lbb
        L31:
            java.util.ArrayList r6 = r0.c
            com.zepto.dh2$a r8 = new com.zepto.dh2$a
            r8.<init>(r11, r3, r7)
            r6.add(r4, r8)
            r5.c = r7
            int r4 = r4 + 1
            com.zepto.sf2 r3 = r5.b
            goto Lbb
        L43:
            com.zepto.sf2 r6 = r5.b
            r1.remove(r6)
            com.zepto.sf2 r5 = r5.b
            if (r5 != r3) goto Lbb
            java.util.ArrayList r3 = r0.c
            com.zepto.dh2$a r6 = new com.zepto.dh2$a
            r6.<init>(r11, r5)
            r3.add(r4, r6)
            int r4 = r4 + 1
            r3 = r9
            goto Lbb
        L5a:
            com.zepto.sf2 r6 = r5.b
            int r8 = r6.y
            int r12 = r17.size()
            int r12 = r12 - r7
            r13 = 0
        L64:
            if (r12 < 0) goto La4
            java.lang.Object r14 = r1.get(r12)
            com.zepto.sf2 r14 = (com.zepto.sf2) r14
            int r15 = r14.y
            if (r15 != r8) goto La1
            if (r14 != r6) goto L74
            r13 = r7
            goto La1
        L74:
            if (r14 != r3) goto L83
            java.util.ArrayList r3 = r0.c
            com.zepto.dh2$a r15 = new com.zepto.dh2$a
            r15.<init>(r11, r14, r7)
            r3.add(r4, r15)
            int r4 = r4 + 1
            r3 = r9
        L83:
            com.zepto.dh2$a r15 = new com.zepto.dh2$a
            r15.<init>(r10, r14, r7)
            int r2 = r5.d
            r15.d = r2
            int r2 = r5.f
            r15.f = r2
            int r2 = r5.e
            r15.e = r2
            int r2 = r5.g
            r15.g = r2
            java.util.ArrayList r2 = r0.c
            r2.add(r4, r15)
            r1.remove(r14)
            int r4 = r4 + r7
        La1:
            int r12 = r12 + (-1)
            goto L64
        La4:
            if (r13 == 0) goto Lae
            java.util.ArrayList r2 = r0.c
            r2.remove(r4)
            int r4 = r4 + (-1)
            goto Lbb
        Lae:
            r5.a = r7
            r5.c = r7
            r1.add(r6)
            goto Lbb
        Lb6:
            com.zepto.sf2 r2 = r5.b
            r1.add(r2)
        Lbb:
            int r4 = r4 + r7
            goto L7
        Lbe:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.o30.A(java.util.ArrayList, com.zepto.sf2):com.zepto.sf2");
    }

    public String B() {
        return this.k;
    }

    public void C() {
        if (this.s != null) {
            for (int i = 0; i < this.s.size(); i++) {
                ((Runnable) this.s.get(i)).run();
            }
            this.s = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.zepto.sf2 D(java.util.ArrayList r6, com.zepto.sf2 r7) {
        /*
            r5 = this;
            java.util.ArrayList r0 = r5.c
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto L35
            java.util.ArrayList r2 = r5.c
            java.lang.Object r2 = r2.get(r0)
            com.zepto.dh2$a r2 = (com.zepto.dh2.a) r2
            int r3 = r2.a
            if (r3 == r1) goto L2d
            r4 = 3
            if (r3 == r4) goto L27
            switch(r3) {
                case 6: goto L27;
                case 7: goto L2d;
                case 8: goto L25;
                case 9: goto L22;
                case 10: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L32
        L1d:
            androidx.lifecycle.h$b r3 = r2.h
            r2.i = r3
            goto L32
        L22:
            com.zepto.sf2 r7 = r2.b
            goto L32
        L25:
            r7 = 0
            goto L32
        L27:
            com.zepto.sf2 r2 = r2.b
            r6.add(r2)
            goto L32
        L2d:
            com.zepto.sf2 r2 = r2.b
            r6.remove(r2)
        L32:
            int r0 = r0 + (-1)
            goto L8
        L35:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.o30.D(java.util.ArrayList, com.zepto.sf2):com.zepto.sf2");
    }

    @Override // com.zepto.mg2.m
    public boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (mg2.J0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.i) {
            return true;
        }
        this.t.g(this);
        return true;
    }

    @Override // com.zepto.dh2
    public int h() {
        return v(false);
    }

    @Override // com.zepto.dh2
    public int i() {
        return v(true);
    }

    @Override // com.zepto.dh2
    public void j() {
        l();
        this.t.a0(this, false);
    }

    @Override // com.zepto.dh2
    public void k() {
        l();
        this.t.a0(this, true);
    }

    @Override // com.zepto.dh2
    public void m(int i, sf2 sf2Var, String str, int i2) {
        super.m(i, sf2Var, str, i2);
        sf2Var.t = this.t;
    }

    @Override // com.zepto.dh2
    public dh2 n(sf2 sf2Var) {
        mg2 mg2Var = sf2Var.t;
        if (mg2Var == null || mg2Var == this.t) {
            return super.n(sf2Var);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + sf2Var.toString() + " is already attached to a FragmentManager.");
    }

    @Override // com.zepto.dh2
    public dh2 r(sf2 sf2Var) {
        mg2 mg2Var;
        if (sf2Var == null || (mg2Var = sf2Var.t) == null || mg2Var == this.t) {
            return super.r(sf2Var);
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + sf2Var.toString() + " is already attached to a FragmentManager.");
    }

    public void t(int i) {
        if (this.i) {
            if (mg2.J0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                dh2.a aVar = (dh2.a) this.c.get(i2);
                sf2 sf2Var = aVar.b;
                if (sf2Var != null) {
                    sf2Var.s += i;
                    if (mg2.J0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.b + " to " + aVar.b.s);
                    }
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.v >= 0) {
            sb.append(" #");
            sb.append(this.v);
        }
        if (this.k != null) {
            sb.append(" ");
            sb.append(this.k);
        }
        sb.append("}");
        return sb.toString();
    }

    public void u() {
        int size = this.c.size() - 1;
        while (size >= 0) {
            dh2.a aVar = (dh2.a) this.c.get(size);
            if (aVar.c) {
                if (aVar.a == 8) {
                    aVar.c = false;
                    this.c.remove(size - 1);
                    size--;
                } else {
                    int i = aVar.b.y;
                    aVar.a = 2;
                    aVar.c = false;
                    for (int i2 = size - 1; i2 >= 0; i2--) {
                        dh2.a aVar2 = (dh2.a) this.c.get(i2);
                        if (aVar2.c && aVar2.b.y == i) {
                            this.c.remove(i2);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public int v(boolean z) {
        if (this.u) {
            throw new IllegalStateException("commit already called");
        }
        if (mg2.J0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new on3("FragmentManager"));
            w("  ", printWriter);
            printWriter.close();
        }
        this.u = true;
        if (this.i) {
            this.v = this.t.k();
        } else {
            this.v = -1;
        }
        this.t.X(this, z);
        return this.v;
    }

    public void w(String str, PrintWriter printWriter) {
        x(str, printWriter, true);
    }

    public void x(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.k);
            printWriter.print(" mIndex=");
            printWriter.print(this.v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.u);
            if (this.h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.h));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.f != 0 || this.g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.g));
            }
            if (this.l != 0 || this.m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.m);
            }
            if (this.n != 0 || this.o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.o);
            }
        }
        if (this.c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            dh2.a aVar = (dh2.a) this.c.get(i);
            switch (aVar.a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.b);
            if (z) {
                if (aVar.d != 0 || aVar.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.e));
                }
                if (aVar.f != 0 || aVar.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.g));
                }
            }
        }
    }

    public void y() {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            dh2.a aVar = (dh2.a) this.c.get(i);
            sf2 sf2Var = aVar.b;
            if (sf2Var != null) {
                sf2Var.n = this.w;
                sf2Var.O1(false);
                sf2Var.N1(this.h);
                sf2Var.Q1(this.p, this.q);
            }
            switch (aVar.a) {
                case 1:
                    sf2Var.K1(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.s1(sf2Var, false);
                    this.t.h(sf2Var);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.a);
                case 3:
                    sf2Var.K1(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.h1(sf2Var);
                    break;
                case 4:
                    sf2Var.K1(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.G0(sf2Var);
                    break;
                case 5:
                    sf2Var.K1(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.s1(sf2Var, false);
                    this.t.w1(sf2Var);
                    break;
                case 6:
                    sf2Var.K1(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.v(sf2Var);
                    break;
                case 7:
                    sf2Var.K1(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.s1(sf2Var, false);
                    this.t.m(sf2Var);
                    break;
                case 8:
                    this.t.u1(sf2Var);
                    break;
                case 9:
                    this.t.u1(null);
                    break;
                case 10:
                    this.t.t1(sf2Var, aVar.i);
                    break;
            }
        }
    }

    public void z() {
        for (int size = this.c.size() - 1; size >= 0; size--) {
            dh2.a aVar = (dh2.a) this.c.get(size);
            sf2 sf2Var = aVar.b;
            if (sf2Var != null) {
                sf2Var.n = this.w;
                sf2Var.O1(true);
                sf2Var.N1(mg2.n1(this.h));
                sf2Var.Q1(this.q, this.p);
            }
            switch (aVar.a) {
                case 1:
                    sf2Var.K1(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.s1(sf2Var, true);
                    this.t.h1(sf2Var);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.a);
                case 3:
                    sf2Var.K1(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.h(sf2Var);
                    break;
                case 4:
                    sf2Var.K1(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.w1(sf2Var);
                    break;
                case 5:
                    sf2Var.K1(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.s1(sf2Var, true);
                    this.t.G0(sf2Var);
                    break;
                case 6:
                    sf2Var.K1(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.m(sf2Var);
                    break;
                case 7:
                    sf2Var.K1(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.s1(sf2Var, true);
                    this.t.v(sf2Var);
                    break;
                case 8:
                    this.t.u1(null);
                    break;
                case 9:
                    this.t.u1(sf2Var);
                    break;
                case 10:
                    this.t.t1(sf2Var, aVar.h);
                    break;
            }
        }
    }

    public o30(o30 o30Var) {
        super(o30Var.t.t0(), o30Var.t.w0() != null ? o30Var.t.w0().f().getClassLoader() : null, o30Var);
        this.v = -1;
        this.w = false;
        this.t = o30Var.t;
        this.u = o30Var.u;
        this.v = o30Var.v;
        this.w = o30Var.w;
    }
}
