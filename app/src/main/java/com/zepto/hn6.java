package com.zepto;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class hn6 {
    public static fn6 a = new n00();
    public static ThreadLocal b = new ThreadLocal();
    public static ArrayList c = new ArrayList();

    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
        public fn6 a;
        public ViewGroup b;

        /* JADX INFO: renamed from: com.zepto.hn6$a$a, reason: collision with other inner class name */
        public class C0089a extends gn6 {
            public final /* synthetic */ nx a;

            public C0089a(nx nxVar) {
                this.a = nxVar;
            }

            @Override // com.zepto.fn6.f
            public void b(fn6 fn6Var) {
                ((ArrayList) this.a.get(a.this.b)).remove(fn6Var);
                fn6Var.V(this);
            }
        }

        public a(fn6 fn6Var, ViewGroup viewGroup) {
            this.a = fn6Var;
            this.b = viewGroup;
        }

        public final void a() {
            this.b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!hn6.c.remove(this.b)) {
                return true;
            }
            nx nxVarB = hn6.b();
            ArrayList arrayList = (ArrayList) nxVarB.get(this.b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                nxVarB.put(this.b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.a);
            this.a.a(new C0089a(nxVarB));
            this.a.k(this.b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((fn6) it.next()).X(this.b);
                }
            }
            this.a.U(this.b);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            hn6.c.remove(this.b);
            ArrayList arrayList = (ArrayList) hn6.b().get(this.b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((fn6) it.next()).X(this.b);
                }
            }
            this.a.l(true);
        }
    }

    public static void a(ViewGroup viewGroup, fn6 fn6Var) {
        if (c.contains(viewGroup) || !dq7.U(viewGroup)) {
            return;
        }
        c.add(viewGroup);
        if (fn6Var == null) {
            fn6Var = a;
        }
        fn6 fn6VarClone = fn6Var.clone();
        d(viewGroup, fn6VarClone);
        po5.b(viewGroup, null);
        c(viewGroup, fn6VarClone);
    }

    public static nx b() {
        nx nxVar;
        WeakReference weakReference = (WeakReference) b.get();
        if (weakReference != null && (nxVar = (nx) weakReference.get()) != null) {
            return nxVar;
        }
        nx nxVar2 = new nx();
        b.set(new WeakReference(nxVar2));
        return nxVar2;
    }

    public static void c(ViewGroup viewGroup, fn6 fn6Var) {
        if (fn6Var == null || viewGroup == null) {
            return;
        }
        a aVar = new a(fn6Var, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    public static void d(ViewGroup viewGroup, fn6 fn6Var) {
        ArrayList arrayList = (ArrayList) b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((fn6) it.next()).T(viewGroup);
            }
        }
        if (fn6Var != null) {
            fn6Var.k(viewGroup, true);
        }
        po5.a(viewGroup);
    }
}
