package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.i;
import com.zepto.dq7;
import com.zepto.lz4;
import com.zepto.r05;
import com.zepto.us3;
import com.zepto.vs3;

/* JADX INFO: loaded from: classes.dex */
public final class k extends us3 implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public static final int v = r05.m;
    public final Context b;
    public final e c;
    public final d d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;
    public final vs3 i;
    public PopupWindow.OnDismissListener l;
    public View m;
    public View n;
    public i.a o;
    public ViewTreeObserver p;
    public boolean q;
    public boolean r;
    public int s;
    public boolean u;
    public final ViewTreeObserver.OnGlobalLayoutListener j = new a();
    public final View.OnAttachStateChangeListener k = new b();
    public int t = 0;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!k.this.d() || k.this.i.B()) {
                return;
            }
            View view = k.this.n;
            if (view == null || !view.isShown()) {
                k.this.dismiss();
            } else {
                k.this.i.a();
            }
        }
    }

    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = k.this.p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    k.this.p = view.getViewTreeObserver();
                }
                k kVar = k.this;
                kVar.p.removeGlobalOnLayoutListener(kVar.j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public k(Context context, e eVar, View view, int i, int i2, boolean z) {
        this.b = context;
        this.c = eVar;
        this.e = z;
        this.d = new d(eVar, LayoutInflater.from(context), z, v);
        this.g = i;
        this.h = i2;
        Resources resources = context.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(lz4.b));
        this.m = view;
        this.i = new vs3(context, null, i, i2);
        eVar.c(this, context);
    }

    public final boolean C() {
        View view;
        if (d()) {
            return true;
        }
        if (this.q || (view = this.m) == null) {
            return false;
        }
        this.n = view;
        this.i.K(this);
        this.i.L(this);
        this.i.J(true);
        View view2 = this.n;
        boolean z = this.p == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.p = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.j);
        }
        view2.addOnAttachStateChangeListener(this.k);
        this.i.D(view2);
        this.i.G(this.t);
        if (!this.r) {
            this.s = us3.r(this.d, null, this.b, this.f);
            this.r = true;
        }
        this.i.F(this.s);
        this.i.I(2);
        this.i.H(q());
        this.i.a();
        ListView listViewH = this.i.h();
        listViewH.setOnKeyListener(this);
        if (this.u && this.c.z() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.b).inflate(r05.l, (ViewGroup) listViewH, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.c.z());
            }
            frameLayout.setEnabled(false);
            listViewH.addHeaderView(frameLayout, null, false);
        }
        this.i.p(this.d);
        this.i.a();
        return true;
    }

    @Override // com.zepto.s16
    public void a() {
        if (!C()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void b(e eVar, boolean z) {
        if (eVar != this.c) {
            return;
        }
        dismiss();
        i.a aVar = this.o;
        if (aVar != null) {
            aVar.b(eVar, z);
        }
    }

    @Override // com.zepto.s16
    public boolean d() {
        return !this.q && this.i.d();
    }

    @Override // com.zepto.s16
    public void dismiss() {
        if (d()) {
            this.i.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void f(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean g(l lVar) {
        if (lVar.hasVisibleItems()) {
            h hVar = new h(this.b, lVar, this.n, this.e, this.g, this.h);
            hVar.j(this.o);
            hVar.g(us3.A(lVar));
            hVar.i(this.l);
            this.l = null;
            this.c.e(false);
            int iE = this.i.e();
            int iN = this.i.n();
            if ((Gravity.getAbsoluteGravity(this.t, dq7.B(this.m)) & 7) == 5) {
                iE += this.m.getWidth();
            }
            if (hVar.n(iE, iN)) {
                i.a aVar = this.o;
                if (aVar == null) {
                    return true;
                }
                aVar.c(lVar);
                return true;
            }
        }
        return false;
    }

    @Override // com.zepto.s16
    public ListView h() {
        return this.i.h();
    }

    @Override // androidx.appcompat.view.menu.i
    public void i(boolean z) {
        this.r = false;
        d dVar = this.d;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean j() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public Parcelable k() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.i
    public void n(i.a aVar) {
        this.o = aVar;
    }

    @Override // com.zepto.us3
    public void o(e eVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.q = true;
        this.c.close();
        ViewTreeObserver viewTreeObserver = this.p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.p = this.n.getViewTreeObserver();
            }
            this.p.removeGlobalOnLayoutListener(this.j);
            this.p = null;
        }
        this.n.removeOnAttachStateChangeListener(this.k);
        PopupWindow.OnDismissListener onDismissListener = this.l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // com.zepto.us3
    public void s(View view) {
        this.m = view;
    }

    @Override // com.zepto.us3
    public void u(boolean z) {
        this.d.d(z);
    }

    @Override // com.zepto.us3
    public void v(int i) {
        this.t = i;
    }

    @Override // com.zepto.us3
    public void w(int i) {
        this.i.l(i);
    }

    @Override // com.zepto.us3
    public void x(PopupWindow.OnDismissListener onDismissListener) {
        this.l = onDismissListener;
    }

    @Override // com.zepto.us3
    public void y(boolean z) {
        this.u = z;
    }

    @Override // com.zepto.us3
    public void z(int i) {
        this.i.j(i);
    }
}
