package com.zepto;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import com.zepto.fn6;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class jn6 extends fn6 {
    public int N;
    public ArrayList L = new ArrayList();
    public boolean M = true;
    public boolean O = false;
    public int P = 0;

    public class a extends gn6 {
        public final /* synthetic */ fn6 a;

        public a(fn6 fn6Var) {
            this.a = fn6Var;
        }

        @Override // com.zepto.fn6.f
        public void b(fn6 fn6Var) {
            this.a.Z();
            fn6Var.V(this);
        }
    }

    public static class b extends gn6 {
        public jn6 a;

        public b(jn6 jn6Var) {
            this.a = jn6Var;
        }

        @Override // com.zepto.fn6.f
        public void b(fn6 fn6Var) {
            jn6 jn6Var = this.a;
            int i = jn6Var.N - 1;
            jn6Var.N = i;
            if (i == 0) {
                jn6Var.O = false;
                jn6Var.r();
            }
            fn6Var.V(this);
        }

        @Override // com.zepto.gn6, com.zepto.fn6.f
        public void e(fn6 fn6Var) {
            jn6 jn6Var = this.a;
            if (jn6Var.O) {
                return;
            }
            jn6Var.i0();
            this.a.O = true;
        }
    }

    @Override // com.zepto.fn6
    public void T(View view) {
        super.T(view);
        int size = this.L.size();
        for (int i = 0; i < size; i++) {
            ((fn6) this.L.get(i)).T(view);
        }
    }

    @Override // com.zepto.fn6
    public void X(View view) {
        super.X(view);
        int size = this.L.size();
        for (int i = 0; i < size; i++) {
            ((fn6) this.L.get(i)).X(view);
        }
    }

    @Override // com.zepto.fn6
    public void Z() {
        if (this.L.isEmpty()) {
            i0();
            r();
            return;
        }
        w0();
        if (this.M) {
            Iterator it = this.L.iterator();
            while (it.hasNext()) {
                ((fn6) it.next()).Z();
            }
            return;
        }
        for (int i = 1; i < this.L.size(); i++) {
            ((fn6) this.L.get(i - 1)).a(new a((fn6) this.L.get(i)));
        }
        fn6 fn6Var = (fn6) this.L.get(0);
        if (fn6Var != null) {
            fn6Var.Z();
        }
    }

    @Override // com.zepto.fn6
    public void b0(fn6.e eVar) {
        super.b0(eVar);
        this.P |= 8;
        int size = this.L.size();
        for (int i = 0; i < size; i++) {
            ((fn6) this.L.get(i)).b0(eVar);
        }
    }

    @Override // com.zepto.fn6
    public void cancel() {
        super.cancel();
        int size = this.L.size();
        for (int i = 0; i < size; i++) {
            ((fn6) this.L.get(i)).cancel();
        }
    }

    @Override // com.zepto.fn6
    public void f(mn6 mn6Var) {
        if (L(mn6Var.b)) {
            for (fn6 fn6Var : this.L) {
                if (fn6Var.L(mn6Var.b)) {
                    fn6Var.f(mn6Var);
                    mn6Var.c.add(fn6Var);
                }
            }
        }
    }

    @Override // com.zepto.fn6
    public void f0(dm4 dm4Var) {
        super.f0(dm4Var);
        this.P |= 4;
        if (this.L != null) {
            for (int i = 0; i < this.L.size(); i++) {
                ((fn6) this.L.get(i)).f0(dm4Var);
            }
        }
    }

    @Override // com.zepto.fn6
    public void g0(in6 in6Var) {
        super.g0(in6Var);
        this.P |= 2;
        int size = this.L.size();
        for (int i = 0; i < size; i++) {
            ((fn6) this.L.get(i)).g0(in6Var);
        }
    }

    @Override // com.zepto.fn6
    public void h(mn6 mn6Var) {
        super.h(mn6Var);
        int size = this.L.size();
        for (int i = 0; i < size; i++) {
            ((fn6) this.L.get(i)).h(mn6Var);
        }
    }

    @Override // com.zepto.fn6
    public void i(mn6 mn6Var) {
        if (L(mn6Var.b)) {
            for (fn6 fn6Var : this.L) {
                if (fn6Var.L(mn6Var.b)) {
                    fn6Var.i(mn6Var);
                    mn6Var.c.add(fn6Var);
                }
            }
        }
    }

    @Override // com.zepto.fn6
    public String j0(String str) {
        String strJ0 = super.j0(str);
        for (int i = 0; i < this.L.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strJ0);
            sb.append("\n");
            sb.append(((fn6) this.L.get(i)).j0(str + "  "));
            strJ0 = sb.toString();
        }
        return strJ0;
    }

    @Override // com.zepto.fn6
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public jn6 a(fn6.f fVar) {
        return (jn6) super.a(fVar);
    }

    @Override // com.zepto.fn6
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public jn6 b(View view) {
        for (int i = 0; i < this.L.size(); i++) {
            ((fn6) this.L.get(i)).b(view);
        }
        return (jn6) super.b(view);
    }

    public jn6 m0(fn6 fn6Var) {
        n0(fn6Var);
        long j = this.f;
        if (j >= 0) {
            fn6Var.a0(j);
        }
        if ((this.P & 1) != 0) {
            fn6Var.c0(u());
        }
        if ((this.P & 2) != 0) {
            z();
            fn6Var.g0(null);
        }
        if ((this.P & 4) != 0) {
            fn6Var.f0(y());
        }
        if ((this.P & 8) != 0) {
            fn6Var.b0(t());
        }
        return this;
    }

    public final void n0(fn6 fn6Var) {
        this.L.add(fn6Var);
        fn6Var.u = this;
    }

    @Override // com.zepto.fn6
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public fn6 clone() {
        jn6 jn6Var = (jn6) super.clone();
        jn6Var.L = new ArrayList();
        int size = this.L.size();
        for (int i = 0; i < size; i++) {
            jn6Var.n0(((fn6) this.L.get(i)).clone());
        }
        return jn6Var;
    }

    public fn6 o0(int i) {
        if (i < 0 || i >= this.L.size()) {
            return null;
        }
        return (fn6) this.L.get(i);
    }

    public int p0() {
        return this.L.size();
    }

    @Override // com.zepto.fn6
    public void q(ViewGroup viewGroup, nn6 nn6Var, nn6 nn6Var2, ArrayList arrayList, ArrayList arrayList2) {
        long jC = C();
        int size = this.L.size();
        for (int i = 0; i < size; i++) {
            fn6 fn6Var = (fn6) this.L.get(i);
            if (jC > 0 && (this.M || i == 0)) {
                long jC2 = fn6Var.C();
                if (jC2 > 0) {
                    fn6Var.h0(jC2 + jC);
                } else {
                    fn6Var.h0(jC);
                }
            }
            fn6Var.q(viewGroup, nn6Var, nn6Var2, arrayList, arrayList2);
        }
    }

    @Override // com.zepto.fn6
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public jn6 V(fn6.f fVar) {
        return (jn6) super.V(fVar);
    }

    @Override // com.zepto.fn6
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public jn6 W(View view) {
        for (int i = 0; i < this.L.size(); i++) {
            ((fn6) this.L.get(i)).W(view);
        }
        return (jn6) super.W(view);
    }

    @Override // com.zepto.fn6
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public jn6 a0(long j) {
        ArrayList arrayList;
        super.a0(j);
        if (this.f >= 0 && (arrayList = this.L) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((fn6) this.L.get(i)).a0(j);
            }
        }
        return this;
    }

    @Override // com.zepto.fn6
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public jn6 c0(TimeInterpolator timeInterpolator) {
        this.P |= 1;
        ArrayList arrayList = this.L;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((fn6) this.L.get(i)).c0(timeInterpolator);
            }
        }
        return (jn6) super.c0(timeInterpolator);
    }

    public jn6 u0(int i) {
        if (i == 0) {
            this.M = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
            }
            this.M = false;
        }
        return this;
    }

    @Override // com.zepto.fn6
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public jn6 h0(long j) {
        return (jn6) super.h0(j);
    }

    public final void w0() {
        b bVar = new b(this);
        Iterator it = this.L.iterator();
        while (it.hasNext()) {
            ((fn6) it.next()).a(bVar);
        }
        this.N = this.L.size();
    }
}
