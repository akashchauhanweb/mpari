package com.zepto;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.zepto.db0;
import com.zepto.fn6;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class hh2 extends gh2 {

    public class a extends fn6.e {
        public final /* synthetic */ Rect a;

        public a(Rect rect) {
            this.a = rect;
        }
    }

    public class b implements fn6.f {
        public final /* synthetic */ View a;
        public final /* synthetic */ ArrayList b;

        public b(View view, ArrayList arrayList) {
            this.a = view;
            this.b = arrayList;
        }

        @Override // com.zepto.fn6.f
        public void a(fn6 fn6Var) {
        }

        @Override // com.zepto.fn6.f
        public void b(fn6 fn6Var) {
            fn6Var.V(this);
            this.a.setVisibility(8);
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.b.get(i)).setVisibility(0);
            }
        }

        @Override // com.zepto.fn6.f
        public void c(fn6 fn6Var) {
        }

        @Override // com.zepto.fn6.f
        public void d(fn6 fn6Var) {
        }

        @Override // com.zepto.fn6.f
        public void e(fn6 fn6Var) {
            fn6Var.V(this);
            fn6Var.a(this);
        }
    }

    public class c extends gn6 {
        public final /* synthetic */ Object a;
        public final /* synthetic */ ArrayList b;
        public final /* synthetic */ Object c;
        public final /* synthetic */ ArrayList d;
        public final /* synthetic */ Object e;
        public final /* synthetic */ ArrayList f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.a = obj;
            this.b = arrayList;
            this.c = obj2;
            this.d = arrayList2;
            this.e = obj3;
            this.f = arrayList3;
        }

        @Override // com.zepto.fn6.f
        public void b(fn6 fn6Var) {
            fn6Var.V(this);
        }

        @Override // com.zepto.gn6, com.zepto.fn6.f
        public void e(fn6 fn6Var) {
            Object obj = this.a;
            if (obj != null) {
                hh2.this.w(obj, this.b, null);
            }
            Object obj2 = this.c;
            if (obj2 != null) {
                hh2.this.w(obj2, this.d, null);
            }
            Object obj3 = this.e;
            if (obj3 != null) {
                hh2.this.w(obj3, this.f, null);
            }
        }
    }

    public class d implements db0.b {
        public final /* synthetic */ fn6 a;

        public d(fn6 fn6Var) {
            this.a = fn6Var;
        }

        @Override // com.zepto.db0.b
        public void a() {
            this.a.cancel();
        }
    }

    public class e implements fn6.f {
        public final /* synthetic */ Runnable a;

        public e(Runnable runnable) {
            this.a = runnable;
        }

        @Override // com.zepto.fn6.f
        public void a(fn6 fn6Var) {
        }

        @Override // com.zepto.fn6.f
        public void b(fn6 fn6Var) {
            this.a.run();
        }

        @Override // com.zepto.fn6.f
        public void c(fn6 fn6Var) {
        }

        @Override // com.zepto.fn6.f
        public void d(fn6 fn6Var) {
        }

        @Override // com.zepto.fn6.f
        public void e(fn6 fn6Var) {
        }
    }

    public class f extends fn6.e {
        public final /* synthetic */ Rect a;

        public f(Rect rect) {
            this.a = rect;
        }
    }

    public static boolean v(fn6 fn6Var) {
        return (gh2.i(fn6Var.E()) && gh2.i(fn6Var.F()) && gh2.i(fn6Var.G())) ? false : true;
    }

    @Override // com.zepto.gh2
    public void a(Object obj, View view) {
        if (obj != null) {
            ((fn6) obj).b(view);
        }
    }

    @Override // com.zepto.gh2
    public void b(Object obj, ArrayList arrayList) {
        fn6 fn6Var = (fn6) obj;
        if (fn6Var == null) {
            return;
        }
        int i = 0;
        if (fn6Var instanceof jn6) {
            jn6 jn6Var = (jn6) fn6Var;
            int iP0 = jn6Var.p0();
            while (i < iP0) {
                b(jn6Var.o0(i), arrayList);
                i++;
            }
            return;
        }
        if (v(fn6Var) || !gh2.i(fn6Var.H())) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            fn6Var.b((View) arrayList.get(i));
            i++;
        }
    }

    @Override // com.zepto.gh2
    public void c(ViewGroup viewGroup, Object obj) {
        hn6.a(viewGroup, (fn6) obj);
    }

    @Override // com.zepto.gh2
    public boolean e(Object obj) {
        return obj instanceof fn6;
    }

    @Override // com.zepto.gh2
    public Object f(Object obj) {
        if (obj != null) {
            return ((fn6) obj).clone();
        }
        return null;
    }

    @Override // com.zepto.gh2
    public Object j(Object obj, Object obj2, Object obj3) {
        fn6 fn6VarU0 = (fn6) obj;
        fn6 fn6Var = (fn6) obj2;
        fn6 fn6Var2 = (fn6) obj3;
        if (fn6VarU0 != null && fn6Var != null) {
            fn6VarU0 = new jn6().m0(fn6VarU0).m0(fn6Var).u0(1);
        } else if (fn6VarU0 == null) {
            fn6VarU0 = fn6Var != null ? fn6Var : null;
        }
        if (fn6Var2 == null) {
            return fn6VarU0;
        }
        jn6 jn6Var = new jn6();
        if (fn6VarU0 != null) {
            jn6Var.m0(fn6VarU0);
        }
        jn6Var.m0(fn6Var2);
        return jn6Var;
    }

    @Override // com.zepto.gh2
    public Object k(Object obj, Object obj2, Object obj3) {
        jn6 jn6Var = new jn6();
        if (obj != null) {
            jn6Var.m0((fn6) obj);
        }
        if (obj2 != null) {
            jn6Var.m0((fn6) obj2);
        }
        if (obj3 != null) {
            jn6Var.m0((fn6) obj3);
        }
        return jn6Var;
    }

    @Override // com.zepto.gh2
    public void m(Object obj, View view, ArrayList arrayList) {
        ((fn6) obj).a(new b(view, arrayList));
    }

    @Override // com.zepto.gh2
    public void n(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((fn6) obj).a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // com.zepto.gh2
    public void o(Object obj, Rect rect) {
        if (obj != null) {
            ((fn6) obj).b0(new f(rect));
        }
    }

    @Override // com.zepto.gh2
    public void p(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            h(view, rect);
            ((fn6) obj).b0(new a(rect));
        }
    }

    @Override // com.zepto.gh2
    public void q(sf2 sf2Var, Object obj, db0 db0Var, Runnable runnable) {
        fn6 fn6Var = (fn6) obj;
        db0Var.c(new d(fn6Var));
        fn6Var.a(new e(runnable));
    }

    @Override // com.zepto.gh2
    public void s(Object obj, View view, ArrayList arrayList) {
        jn6 jn6Var = (jn6) obj;
        List listH = jn6Var.H();
        listH.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            gh2.d(listH, (View) arrayList.get(i));
        }
        listH.add(view);
        arrayList.add(view);
        b(jn6Var, arrayList);
    }

    @Override // com.zepto.gh2
    public void t(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        jn6 jn6Var = (jn6) obj;
        if (jn6Var != null) {
            jn6Var.H().clear();
            jn6Var.H().addAll(arrayList2);
            w(jn6Var, arrayList, arrayList2);
        }
    }

    @Override // com.zepto.gh2
    public Object u(Object obj) {
        if (obj == null) {
            return null;
        }
        jn6 jn6Var = new jn6();
        jn6Var.m0((fn6) obj);
        return jn6Var;
    }

    public void w(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        fn6 fn6Var = (fn6) obj;
        int i = 0;
        if (fn6Var instanceof jn6) {
            jn6 jn6Var = (jn6) fn6Var;
            int iP0 = jn6Var.p0();
            while (i < iP0) {
                w(jn6Var.o0(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (v(fn6Var)) {
            return;
        }
        List listH = fn6Var.H();
        if (listH.size() == arrayList.size() && listH.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                fn6Var.b((View) arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                fn6Var.W((View) arrayList.get(size2));
            }
        }
    }
}
