package com.zepto;

import com.zepto.e50;
import com.zepto.jx0;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.io.ConstantsKt;

/* JADX INFO: loaded from: classes.dex */
public class kx0 extends uu7 {
    public int O0;
    public int S0;
    public int T0;
    public int U0;
    public int V0;
    public e50 M0 = new e50(this);
    public ni1 N0 = new ni1(this);
    public e50.b P0 = null;
    public boolean Q0 = false;
    public nf3 R0 = new nf3();
    public int W0 = 0;
    public int X0 = 0;
    public ic0[] Y0 = new ic0[4];
    public ic0[] Z0 = new ic0[4];
    public boolean a1 = false;
    public boolean b1 = false;
    public boolean c1 = false;
    public int d1 = 0;
    public int e1 = 0;
    public int f1 = 257;
    public boolean g1 = false;
    public boolean h1 = false;
    public boolean i1 = false;
    public int j1 = 0;
    public WeakReference k1 = null;
    public WeakReference l1 = null;
    public WeakReference m1 = null;
    public WeakReference n1 = null;
    public HashSet o1 = new HashSet();
    public e50.a p1 = new e50.a();

    public static boolean S1(int i, jx0 jx0Var, e50.b bVar, e50.a aVar, int i2) {
        int i3;
        int i4;
        if (bVar == null) {
            return false;
        }
        if (jx0Var.V() == 8 || (jx0Var instanceof sk2) || (jx0Var instanceof a40)) {
            aVar.e = 0;
            aVar.f = 0;
            return false;
        }
        aVar.a = jx0Var.A();
        aVar.b = jx0Var.T();
        aVar.c = jx0Var.W();
        aVar.d = jx0Var.x();
        aVar.i = false;
        aVar.j = i2;
        jx0.b bVar2 = aVar.a;
        jx0.b bVar3 = jx0.b.MATCH_CONSTRAINT;
        boolean z = bVar2 == bVar3;
        boolean z2 = aVar.b == bVar3;
        boolean z3 = z && jx0Var.d0 > 0.0f;
        boolean z4 = z2 && jx0Var.d0 > 0.0f;
        if (z && jx0Var.a0(0) && jx0Var.w == 0 && !z3) {
            aVar.a = jx0.b.WRAP_CONTENT;
            if (z2 && jx0Var.x == 0) {
                aVar.a = jx0.b.FIXED;
            }
            z = false;
        }
        if (z2 && jx0Var.a0(1) && jx0Var.x == 0 && !z4) {
            aVar.b = jx0.b.WRAP_CONTENT;
            if (z && jx0Var.w == 0) {
                aVar.b = jx0.b.FIXED;
            }
            z2 = false;
        }
        if (jx0Var.n0()) {
            aVar.a = jx0.b.FIXED;
            z = false;
        }
        if (jx0Var.o0()) {
            aVar.b = jx0.b.FIXED;
            z2 = false;
        }
        if (z3) {
            if (jx0Var.y[0] == 4) {
                aVar.a = jx0.b.FIXED;
            } else if (!z2) {
                jx0.b bVar4 = aVar.b;
                jx0.b bVar5 = jx0.b.FIXED;
                if (bVar4 == bVar5) {
                    i4 = aVar.d;
                } else {
                    aVar.a = jx0.b.WRAP_CONTENT;
                    bVar.b(jx0Var, aVar);
                    i4 = aVar.f;
                }
                aVar.a = bVar5;
                aVar.c = (int) (jx0Var.v() * i4);
            }
        }
        if (z4) {
            if (jx0Var.y[1] == 4) {
                aVar.b = jx0.b.FIXED;
            } else if (!z) {
                jx0.b bVar6 = aVar.a;
                jx0.b bVar7 = jx0.b.FIXED;
                if (bVar6 == bVar7) {
                    i3 = aVar.c;
                } else {
                    aVar.b = jx0.b.WRAP_CONTENT;
                    bVar.b(jx0Var, aVar);
                    i3 = aVar.e;
                }
                aVar.b = bVar7;
                if (jx0Var.w() == -1) {
                    aVar.d = (int) (i3 / jx0Var.v());
                } else {
                    aVar.d = (int) (jx0Var.v() * i3);
                }
            }
        }
        bVar.b(jx0Var, aVar);
        jx0Var.k1(aVar.e);
        jx0Var.L0(aVar.f);
        jx0Var.K0(aVar.h);
        jx0Var.A0(aVar.g);
        aVar.j = e50.a.k;
        return aVar.i;
    }

    public final void A1(yw0 yw0Var, h46 h46Var) {
        this.R0.h(h46Var, this.R0.q(yw0Var), 0, 5);
    }

    public final void B1(yw0 yw0Var, h46 h46Var) {
        this.R0.h(this.R0.q(yw0Var), h46Var, 0, 5);
    }

    public final void C1(jx0 jx0Var) {
        int i = this.X0 + 1;
        ic0[] ic0VarArr = this.Y0;
        if (i >= ic0VarArr.length) {
            this.Y0 = (ic0[]) Arrays.copyOf(ic0VarArr, ic0VarArr.length * 2);
        }
        this.Y0[this.X0] = new ic0(jx0Var, 1, P1());
        this.X0++;
    }

    public void D1(yw0 yw0Var) {
        WeakReference weakReference = this.m1;
        if (weakReference == null || weakReference.get() == null || yw0Var.e() > ((yw0) this.m1.get()).e()) {
            this.m1 = new WeakReference(yw0Var);
        }
    }

    public void E1(yw0 yw0Var) {
        WeakReference weakReference = this.k1;
        if (weakReference == null || weakReference.get() == null || yw0Var.e() > ((yw0) this.k1.get()).e()) {
            this.k1 = new WeakReference(yw0Var);
        }
    }

    public boolean F1(boolean z) {
        return this.N0.f(z);
    }

    public boolean G1(boolean z) {
        return this.N0.g(z);
    }

    public boolean H1(boolean z, int i) {
        return this.N0.h(z, i);
    }

    public e50.b I1() {
        return this.P0;
    }

    public int J1() {
        return this.f1;
    }

    public nf3 K1() {
        return this.R0;
    }

    public boolean L1() {
        return false;
    }

    public void M1() {
        this.N0.j();
    }

    public void N1() {
        this.N0.k();
    }

    @Override // com.zepto.jx0
    public void O(StringBuilder sb) {
        sb.append(this.o + ":{\n");
        sb.append("  actualWidth:" + this.b0);
        sb.append("\n");
        sb.append("  actualHeight:" + this.c0);
        sb.append("\n");
        Iterator it = r1().iterator();
        while (it.hasNext()) {
            ((jx0) it.next()).O(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }

    public boolean O1() {
        return this.i1;
    }

    public boolean P1() {
        return this.Q0;
    }

    public boolean Q1() {
        return this.h1;
    }

    public long R1(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.S0 = i8;
        this.T0 = i9;
        return this.M0.d(this, i, i8, i9, i2, i3, i4, i5, i6, i7);
    }

    public boolean T1(int i) {
        return (this.f1 & i) == i;
    }

    public final void U1() {
        this.W0 = 0;
        this.X0 = 0;
    }

    public void V1(e50.b bVar) {
        this.P0 = bVar;
        this.N0.n(bVar);
    }

    public void W1(int i) {
        this.f1 = i;
        nf3.r = T1(ConstantsKt.MINIMUM_BLOCK_SIZE);
    }

    public void X1(int i) {
        this.O0 = i;
    }

    public void Y1(boolean z) {
        this.Q0 = z;
    }

    public boolean Z1(nf3 nf3Var, boolean[] zArr) {
        zArr[2] = false;
        boolean zT1 = T1(64);
        q1(nf3Var, zT1);
        int size = this.L0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            jx0 jx0Var = (jx0) this.L0.get(i);
            jx0Var.q1(nf3Var, zT1);
            if (jx0Var.c0()) {
                z = true;
            }
        }
        return z;
    }

    public void a2() {
        this.M0.e(this);
    }

    @Override // com.zepto.jx0
    public void p1(boolean z, boolean z2) {
        super.p1(z, z2);
        int size = this.L0.size();
        for (int i = 0; i < size; i++) {
            ((jx0) this.L0.get(i)).p1(z, z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0307 A[PHI: r2 r16
      0x0307: PHI (r2v15 ??) = (r2v14 ??), (r2v19 ??), (r2v19 ??), (r2v19 ??) binds: [B:138:0x02c8, B:146:0x02ed, B:147:0x02ef, B:149:0x02f5] A[DONT_GENERATE, DONT_INLINE]
      0x0307: PHI (r16v4 boolean) = (r16v3 boolean), (r16v5 boolean), (r16v5 boolean), (r16v5 boolean) binds: [B:138:0x02c8, B:146:0x02ed, B:147:0x02ef, B:149:0x02f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // com.zepto.uu7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void s1() {
        /*
            Method dump skipped, instruction units count: 813
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.kx0.s1():void");
    }

    @Override // com.zepto.uu7, com.zepto.jx0
    public void t0() {
        this.R0.D();
        this.S0 = 0;
        this.U0 = 0;
        this.T0 = 0;
        this.V0 = 0;
        this.g1 = false;
        super.t0();
    }

    public void v1(jx0 jx0Var, int i) {
        if (i == 0) {
            x1(jx0Var);
        } else if (i == 1) {
            C1(jx0Var);
        }
    }

    public boolean w1(nf3 nf3Var) {
        boolean zT1 = T1(64);
        g(nf3Var, zT1);
        int size = this.L0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            jx0 jx0Var = (jx0) this.L0.get(i);
            jx0Var.S0(0, false);
            jx0Var.S0(1, false);
            if (jx0Var instanceof a40) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                jx0 jx0Var2 = (jx0) this.L0.get(i2);
                if (jx0Var2 instanceof a40) {
                    ((a40) jx0Var2).y1();
                }
            }
        }
        this.o1.clear();
        for (int i3 = 0; i3 < size; i3++) {
            jx0 jx0Var3 = (jx0) this.L0.get(i3);
            if (jx0Var3.f()) {
                if (jx0Var3 instanceof mt7) {
                    this.o1.add(jx0Var3);
                } else {
                    jx0Var3.g(nf3Var, zT1);
                }
            }
        }
        while (this.o1.size() > 0) {
            int size2 = this.o1.size();
            Iterator it = this.o1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                mt7 mt7Var = (mt7) ((jx0) it.next());
                if (mt7Var.v1(this.o1)) {
                    mt7Var.g(nf3Var, zT1);
                    this.o1.remove(mt7Var);
                    break;
                }
            }
            if (size2 == this.o1.size()) {
                Iterator it2 = this.o1.iterator();
                while (it2.hasNext()) {
                    ((jx0) it2.next()).g(nf3Var, zT1);
                }
                this.o1.clear();
            }
        }
        if (nf3.r) {
            HashSet<jx0> hashSet = new HashSet();
            for (int i4 = 0; i4 < size; i4++) {
                jx0 jx0Var4 = (jx0) this.L0.get(i4);
                if (!jx0Var4.f()) {
                    hashSet.add(jx0Var4);
                }
            }
            e(this, nf3Var, hashSet, A() == jx0.b.WRAP_CONTENT ? 0 : 1, false);
            for (jx0 jx0Var5 : hashSet) {
                ph4.a(this, nf3Var, jx0Var5);
                jx0Var5.g(nf3Var, zT1);
            }
        } else {
            for (int i5 = 0; i5 < size; i5++) {
                jx0 jx0Var6 = (jx0) this.L0.get(i5);
                if (jx0Var6 instanceof kx0) {
                    jx0.b[] bVarArr = jx0Var6.Z;
                    jx0.b bVar = bVarArr[0];
                    jx0.b bVar2 = bVarArr[1];
                    jx0.b bVar3 = jx0.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        jx0Var6.P0(jx0.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        jx0Var6.g1(jx0.b.FIXED);
                    }
                    jx0Var6.g(nf3Var, zT1);
                    if (bVar == bVar3) {
                        jx0Var6.P0(bVar);
                    }
                    if (bVar2 == bVar3) {
                        jx0Var6.g1(bVar2);
                    }
                } else {
                    ph4.a(this, nf3Var, jx0Var6);
                    if (!jx0Var6.f()) {
                        jx0Var6.g(nf3Var, zT1);
                    }
                }
            }
        }
        if (this.W0 > 0) {
            hc0.b(this, nf3Var, null, 0);
        }
        if (this.X0 > 0) {
            hc0.b(this, nf3Var, null, 1);
        }
        return true;
    }

    public final void x1(jx0 jx0Var) {
        int i = this.W0 + 1;
        ic0[] ic0VarArr = this.Z0;
        if (i >= ic0VarArr.length) {
            this.Z0 = (ic0[]) Arrays.copyOf(ic0VarArr, ic0VarArr.length * 2);
        }
        this.Z0[this.W0] = new ic0(jx0Var, 0, P1());
        this.W0++;
    }

    public void y1(yw0 yw0Var) {
        WeakReference weakReference = this.n1;
        if (weakReference == null || weakReference.get() == null || yw0Var.e() > ((yw0) this.n1.get()).e()) {
            this.n1 = new WeakReference(yw0Var);
        }
    }

    public void z1(yw0 yw0Var) {
        WeakReference weakReference = this.l1;
        if (weakReference == null || weakReference.get() == null || yw0Var.e() > ((yw0) this.l1.get()).e()) {
            this.l1 = new WeakReference(yw0Var);
        }
    }
}
