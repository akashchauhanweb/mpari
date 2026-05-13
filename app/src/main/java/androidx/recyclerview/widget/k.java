package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.zepto.dq7;
import com.zepto.r3;
import com.zepto.s3;
import com.zepto.x2;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class k extends x2 {
    public final RecyclerView d;
    public final a e;

    public static class a extends x2 {
        public final k d;
        public Map e = new WeakHashMap();

        public a(k kVar) {
            this.d = kVar;
        }

        @Override // com.zepto.x2
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            x2 x2Var = (x2) this.e.get(view);
            return x2Var != null ? x2Var.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        @Override // com.zepto.x2
        public s3 b(View view) {
            x2 x2Var = (x2) this.e.get(view);
            return x2Var != null ? x2Var.b(view) : super.b(view);
        }

        @Override // com.zepto.x2
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            x2 x2Var = (x2) this.e.get(view);
            if (x2Var != null) {
                x2Var.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        @Override // com.zepto.x2
        public void g(View view, r3 r3Var) {
            if (this.d.o() || this.d.d.getLayoutManager() == null) {
                super.g(view, r3Var);
                return;
            }
            this.d.d.getLayoutManager().U0(view, r3Var);
            x2 x2Var = (x2) this.e.get(view);
            if (x2Var != null) {
                x2Var.g(view, r3Var);
            } else {
                super.g(view, r3Var);
            }
        }

        @Override // com.zepto.x2
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            x2 x2Var = (x2) this.e.get(view);
            if (x2Var != null) {
                x2Var.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        @Override // com.zepto.x2
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            x2 x2Var = (x2) this.e.get(viewGroup);
            return x2Var != null ? x2Var.i(viewGroup, view, accessibilityEvent) : super.i(viewGroup, view, accessibilityEvent);
        }

        @Override // com.zepto.x2
        public boolean j(View view, int i, Bundle bundle) {
            if (this.d.o() || this.d.d.getLayoutManager() == null) {
                return super.j(view, i, bundle);
            }
            x2 x2Var = (x2) this.e.get(view);
            if (x2Var != null) {
                if (x2Var.j(view, i, bundle)) {
                    return true;
                }
            } else if (super.j(view, i, bundle)) {
                return true;
            }
            return this.d.d.getLayoutManager().o1(view, i, bundle);
        }

        @Override // com.zepto.x2
        public void l(View view, int i) {
            x2 x2Var = (x2) this.e.get(view);
            if (x2Var != null) {
                x2Var.l(view, i);
            } else {
                super.l(view, i);
            }
        }

        @Override // com.zepto.x2
        public void m(View view, AccessibilityEvent accessibilityEvent) {
            x2 x2Var = (x2) this.e.get(view);
            if (x2Var != null) {
                x2Var.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        public x2 n(View view) {
            return (x2) this.e.remove(view);
        }

        public void o(View view) {
            x2 x2VarL = dq7.l(view);
            if (x2VarL == null || x2VarL == this) {
                return;
            }
            this.e.put(view, x2VarL);
        }
    }

    public k(RecyclerView recyclerView) {
        this.d = recyclerView;
        x2 x2VarN = n();
        if (x2VarN == null || !(x2VarN instanceof a)) {
            this.e = new a(this);
        } else {
            this.e = (a) x2VarN;
        }
    }

    @Override // com.zepto.x2
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().Q0(accessibilityEvent);
        }
    }

    @Override // com.zepto.x2
    public void g(View view, r3 r3Var) {
        super.g(view, r3Var);
        if (o() || this.d.getLayoutManager() == null) {
            return;
        }
        this.d.getLayoutManager().T0(r3Var);
    }

    @Override // com.zepto.x2
    public boolean j(View view, int i, Bundle bundle) {
        if (super.j(view, i, bundle)) {
            return true;
        }
        if (o() || this.d.getLayoutManager() == null) {
            return false;
        }
        return this.d.getLayoutManager().m1(i, bundle);
    }

    public x2 n() {
        return this.e;
    }

    public boolean o() {
        return this.d.m0();
    }
}
