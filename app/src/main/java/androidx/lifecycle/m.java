package androidx.lifecycle;

import androidx.lifecycle.h;
import com.zepto.cf3;
import com.zepto.df3;
import com.zepto.gf3;
import com.zepto.hi5;
import com.zepto.jx;
import com.zepto.k82;
import com.zepto.ty3;
import com.zepto.x66;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class m extends h {
    public static final a k = new a(null);
    public final boolean b;
    public k82 c;
    public h.b d;
    public final WeakReference e;
    public int f;
    public boolean g;
    public boolean h;
    public ArrayList i;
    public final ty3 j;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h.b a(h.b state1, h.b bVar) {
            Intrinsics.checkNotNullParameter(state1, "state1");
            return (bVar == null || bVar.compareTo(state1) >= 0) ? state1 : bVar;
        }
    }

    public static final class b {
        public h.b a;
        public k b;

        public b(cf3 cf3Var, h.b initialState) {
            Intrinsics.checkNotNullParameter(initialState, "initialState");
            Intrinsics.checkNotNull(cf3Var);
            this.b = gf3.f(cf3Var);
            this.a = initialState;
        }

        public final void a(df3 df3Var, h.a event) {
            Intrinsics.checkNotNullParameter(event, "event");
            h.b bVarB = event.b();
            this.a = m.k.a(this.a, bVarB);
            k kVar = this.b;
            Intrinsics.checkNotNull(df3Var);
            kVar.e(df3Var, event);
            this.a = bVarB;
        }

        public final h.b b() {
            return this.a;
        }
    }

    public m(df3 df3Var, boolean z) {
        this.b = z;
        this.c = new k82();
        h.b bVar = h.b.INITIALIZED;
        this.d = bVar;
        this.i = new ArrayList();
        this.e = new WeakReference(df3Var);
        this.j = x66.a(bVar);
    }

    @Override // androidx.lifecycle.h
    public void a(cf3 observer) {
        df3 df3Var;
        Intrinsics.checkNotNullParameter(observer, "observer");
        g("addObserver");
        h.b bVar = this.d;
        h.b bVar2 = h.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = h.b.INITIALIZED;
        }
        b bVar3 = new b(observer, bVar2);
        if (((b) this.c.w(observer, bVar3)) == null && (df3Var = (df3) this.e.get()) != null) {
            boolean z = this.f != 0 || this.g;
            h.b bVarF = f(observer);
            this.f++;
            while (bVar3.b().compareTo(bVarF) < 0 && this.c.contains(observer)) {
                n(bVar3.b());
                h.a aVarB = h.a.Companion.b(bVar3.b());
                if (aVarB == null) {
                    throw new IllegalStateException("no event up from " + bVar3.b());
                }
                bVar3.a(df3Var, aVarB);
                m();
                bVarF = f(observer);
            }
            if (!z) {
                p();
            }
            this.f--;
        }
    }

    @Override // androidx.lifecycle.h
    public h.b b() {
        return this.d;
    }

    @Override // androidx.lifecycle.h
    public void d(cf3 observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        g("removeObserver");
        this.c.z(observer);
    }

    public final void e(df3 df3Var) {
        Iterator itDescendingIterator = this.c.descendingIterator();
        Intrinsics.checkNotNullExpressionValue(itDescendingIterator, "observerMap.descendingIterator()");
        while (itDescendingIterator.hasNext() && !this.h) {
            Map.Entry entry = (Map.Entry) itDescendingIterator.next();
            Intrinsics.checkNotNullExpressionValue(entry, "next()");
            cf3 cf3Var = (cf3) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.d) > 0 && !this.h && this.c.contains(cf3Var)) {
                h.a aVarA = h.a.Companion.a(bVar.b());
                if (aVarA == null) {
                    throw new IllegalStateException("no event down from " + bVar.b());
                }
                n(aVarA.b());
                bVar.a(df3Var, aVarA);
                m();
            }
        }
    }

    public final h.b f(cf3 cf3Var) {
        b bVar;
        Map.Entry entryB = this.c.B(cf3Var);
        h.b bVar2 = null;
        h.b bVarB = (entryB == null || (bVar = (b) entryB.getValue()) == null) ? null : bVar.b();
        if (!this.i.isEmpty()) {
            bVar2 = (h.b) this.i.get(r0.size() - 1);
        }
        a aVar = k;
        return aVar.a(aVar.a(this.d, bVarB), bVar2);
    }

    public final void g(String str) {
        if (!this.b || jx.g().b()) {
            return;
        }
        throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
    }

    public final void h(df3 df3Var) {
        hi5.d dVarN = this.c.n();
        Intrinsics.checkNotNullExpressionValue(dVarN, "observerMap.iteratorWithAdditions()");
        while (dVarN.hasNext() && !this.h) {
            Map.Entry entry = (Map.Entry) dVarN.next();
            cf3 cf3Var = (cf3) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.d) < 0 && !this.h && this.c.contains(cf3Var)) {
                n(bVar.b());
                h.a aVarB = h.a.Companion.b(bVar.b());
                if (aVarB == null) {
                    throw new IllegalStateException("no event up from " + bVar.b());
                }
                bVar.a(df3Var, aVarB);
                m();
            }
        }
    }

    public void i(h.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        g("handleLifecycleEvent");
        l(event.b());
    }

    public final boolean j() {
        if (this.c.size() == 0) {
            return true;
        }
        Map.Entry entryJ = this.c.j();
        Intrinsics.checkNotNull(entryJ);
        h.b bVarB = ((b) entryJ.getValue()).b();
        Map.Entry entryR = this.c.r();
        Intrinsics.checkNotNull(entryR);
        h.b bVarB2 = ((b) entryR.getValue()).b();
        return bVarB == bVarB2 && this.d == bVarB2;
    }

    public void k(h.b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        g("markState");
        o(state);
    }

    public final void l(h.b bVar) {
        h.b bVar2 = this.d;
        if (bVar2 == bVar) {
            return;
        }
        if (bVar2 == h.b.INITIALIZED && bVar == h.b.DESTROYED) {
            throw new IllegalStateException(("no event down from " + this.d + " in component " + this.e.get()).toString());
        }
        this.d = bVar;
        if (this.g || this.f != 0) {
            this.h = true;
            return;
        }
        this.g = true;
        p();
        this.g = false;
        if (this.d == h.b.DESTROYED) {
            this.c = new k82();
        }
    }

    public final void m() {
        this.i.remove(r0.size() - 1);
    }

    public final void n(h.b bVar) {
        this.i.add(bVar);
    }

    public void o(h.b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        g("setCurrentState");
        l(state);
    }

    public final void p() {
        df3 df3Var = (df3) this.e.get();
        if (df3Var == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!j()) {
            this.h = false;
            h.b bVar = this.d;
            Map.Entry entryJ = this.c.j();
            Intrinsics.checkNotNull(entryJ);
            if (bVar.compareTo(((b) entryJ.getValue()).b()) < 0) {
                e(df3Var);
            }
            Map.Entry entryR = this.c.r();
            if (!this.h && entryR != null && this.d.compareTo(((b) entryR.getValue()).b()) > 0) {
                h(df3Var);
            }
        }
        this.h = false;
        this.j.setValue(b());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(df3 provider) {
        this(provider, true);
        Intrinsics.checkNotNullParameter(provider, "provider");
    }
}
