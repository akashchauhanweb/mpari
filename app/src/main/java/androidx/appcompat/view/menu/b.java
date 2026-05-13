package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.i;
import com.zepto.dq7;
import com.zepto.jk2;
import com.zepto.lz4;
import com.zepto.r05;
import com.zepto.ss3;
import com.zepto.us3;
import com.zepto.vs3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b extends us3 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public static final int B = r05.e;
    public boolean A;
    public final Context b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final Handler g;
    public View o;
    public View p;
    public boolean r;
    public boolean s;
    public int t;
    public int u;
    public boolean w;
    public i.a x;
    public ViewTreeObserver y;
    public PopupWindow.OnDismissListener z;
    public final List h = new ArrayList();
    public final List i = new ArrayList();
    public final ViewTreeObserver.OnGlobalLayoutListener j = new a();
    public final View.OnAttachStateChangeListener k = new ViewOnAttachStateChangeListenerC0002b();
    public final ss3 l = new c();
    public int m = 0;
    public int n = 0;
    public boolean v = false;
    public int q = G();

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!b.this.d() || b.this.i.size() <= 0 || ((d) b.this.i.get(0)).a.B()) {
                return;
            }
            View view = b.this.p;
            if (view == null || !view.isShown()) {
                b.this.dismiss();
                return;
            }
            Iterator it = b.this.i.iterator();
            while (it.hasNext()) {
                ((d) it.next()).a.a();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$b, reason: collision with other inner class name */
    public class ViewOnAttachStateChangeListenerC0002b implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC0002b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.y = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.y.removeGlobalOnLayoutListener(bVar.j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public class c implements ss3 {

        public class a implements Runnable {
            public final /* synthetic */ d c;
            public final /* synthetic */ MenuItem e;
            public final /* synthetic */ e f;

            public a(d dVar, MenuItem menuItem, e eVar) {
                this.c = dVar;
                this.e = menuItem;
                this.f = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.c;
                if (dVar != null) {
                    b.this.A = true;
                    dVar.b.e(false);
                    b.this.A = false;
                }
                if (this.e.isEnabled() && this.e.hasSubMenu()) {
                    this.f.N(this.e, 4);
                }
            }
        }

        public c() {
        }

        @Override // com.zepto.ss3
        public void c(e eVar, MenuItem menuItem) {
            b.this.g.removeCallbacksAndMessages(null);
            int size = b.this.i.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (eVar == ((d) b.this.i.get(i)).b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            b.this.g.postAtTime(new a(i2 < b.this.i.size() ? (d) b.this.i.get(i2) : null, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // com.zepto.ss3
        public void f(e eVar, MenuItem menuItem) {
            b.this.g.removeCallbacksAndMessages(eVar);
        }
    }

    public static class d {
        public final vs3 a;
        public final e b;
        public final int c;

        public d(vs3 vs3Var, e eVar, int i) {
            this.a = vs3Var;
            this.b = eVar;
            this.c = i;
        }

        public ListView a() {
            return this.a.h();
        }
    }

    public b(Context context, View view, int i, int i2, boolean z) {
        this.b = context;
        this.o = view;
        this.d = i;
        this.e = i2;
        this.f = z;
        Resources resources = context.getResources();
        this.c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(lz4.b));
        this.g = new Handler();
    }

    public final vs3 C() {
        vs3 vs3Var = new vs3(this.b, null, this.d, this.e);
        vs3Var.U(this.l);
        vs3Var.L(this);
        vs3Var.K(this);
        vs3Var.D(this.o);
        vs3Var.G(this.n);
        vs3Var.J(true);
        vs3Var.I(2);
        return vs3Var;
    }

    public final int D(e eVar) {
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            if (eVar == ((d) this.i.get(i)).b) {
                return i;
            }
        }
        return -1;
    }

    public final MenuItem E(e eVar, e eVar2) {
        int size = eVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = eVar.getItem(i);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    public final View F(d dVar, e eVar) {
        androidx.appcompat.view.menu.d dVar2;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemE = E(dVar.b, eVar);
        if (menuItemE == null) {
            return null;
        }
        ListView listViewA = dVar.a();
        ListAdapter adapter = listViewA.getAdapter();
        int i = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            dVar2 = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (androidx.appcompat.view.menu.d) adapter;
            headersCount = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i >= count) {
                i = -1;
                break;
            }
            if (menuItemE == dVar2.getItem(i)) {
                break;
            }
            i++;
        }
        if (i != -1 && (firstVisiblePosition = (i + headersCount) - listViewA.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewA.getChildCount()) {
            return listViewA.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    public final int G() {
        return dq7.B(this.o) == 1 ? 0 : 1;
    }

    public final int H(int i) {
        List list = this.i;
        ListView listViewA = ((d) list.get(list.size() - 1)).a();
        int[] iArr = new int[2];
        listViewA.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.p.getWindowVisibleDisplayFrame(rect);
        return this.q == 1 ? (iArr[0] + listViewA.getWidth()) + i > rect.right ? 0 : 1 : iArr[0] - i < 0 ? 1 : 0;
    }

    public final void I(e eVar) {
        d dVar;
        View viewF;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.b);
        androidx.appcompat.view.menu.d dVar2 = new androidx.appcompat.view.menu.d(eVar, layoutInflaterFrom, this.f, B);
        if (!d() && this.v) {
            dVar2.d(true);
        } else if (d()) {
            dVar2.d(us3.A(eVar));
        }
        int iR = us3.r(dVar2, null, this.b, this.c);
        vs3 vs3VarC = C();
        vs3VarC.p(dVar2);
        vs3VarC.F(iR);
        vs3VarC.G(this.n);
        if (this.i.size() > 0) {
            List list = this.i;
            dVar = (d) list.get(list.size() - 1);
            viewF = F(dVar, eVar);
        } else {
            dVar = null;
            viewF = null;
        }
        if (viewF != null) {
            vs3VarC.V(false);
            vs3VarC.S(null);
            int iH = H(iR);
            boolean z = iH == 1;
            this.q = iH;
            vs3VarC.D(viewF);
            if ((this.n & 5) != 5) {
                iR = z ? viewF.getWidth() : 0 - iR;
            } else if (!z) {
                iR = 0 - viewF.getWidth();
            }
            vs3VarC.l(iR);
            vs3VarC.N(true);
            vs3VarC.j(0);
        } else {
            if (this.r) {
                vs3VarC.l(this.t);
            }
            if (this.s) {
                vs3VarC.j(this.u);
            }
            vs3VarC.H(q());
        }
        this.i.add(new d(vs3VarC, eVar, this.q));
        vs3VarC.a();
        ListView listViewH = vs3VarC.h();
        listViewH.setOnKeyListener(this);
        if (dVar == null && this.w && eVar.z() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(r05.l, (ViewGroup) listViewH, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(eVar.z());
            listViewH.addHeaderView(frameLayout, null, false);
            vs3VarC.a();
        }
    }

    @Override // com.zepto.s16
    public void a() {
        if (d()) {
            return;
        }
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            I((e) it.next());
        }
        this.h.clear();
        View view = this.o;
        this.p = view;
        if (view != null) {
            boolean z = this.y == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.y = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.j);
            }
            this.p.addOnAttachStateChangeListener(this.k);
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void b(e eVar, boolean z) {
        int iD = D(eVar);
        if (iD < 0) {
            return;
        }
        int i = iD + 1;
        if (i < this.i.size()) {
            ((d) this.i.get(i)).b.e(false);
        }
        d dVar = (d) this.i.remove(iD);
        dVar.b.Q(this);
        if (this.A) {
            dVar.a.T(null);
            dVar.a.E(0);
        }
        dVar.a.dismiss();
        int size = this.i.size();
        if (size > 0) {
            this.q = ((d) this.i.get(size - 1)).c;
        } else {
            this.q = G();
        }
        if (size != 0) {
            if (z) {
                ((d) this.i.get(0)).b.e(false);
                return;
            }
            return;
        }
        dismiss();
        i.a aVar = this.x;
        if (aVar != null) {
            aVar.b(eVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.y;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.y.removeGlobalOnLayoutListener(this.j);
            }
            this.y = null;
        }
        this.p.removeOnAttachStateChangeListener(this.k);
        this.z.onDismiss();
    }

    @Override // com.zepto.s16
    public boolean d() {
        return this.i.size() > 0 && ((d) this.i.get(0)).a.d();
    }

    @Override // com.zepto.s16
    public void dismiss() {
        int size = this.i.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.i.toArray(new d[size]);
            for (int i = size - 1; i >= 0; i--) {
                d dVar = dVarArr[i];
                if (dVar.a.d()) {
                    dVar.a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void f(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean g(l lVar) {
        for (d dVar : this.i) {
            if (lVar == dVar.b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!lVar.hasVisibleItems()) {
            return false;
        }
        o(lVar);
        i.a aVar = this.x;
        if (aVar != null) {
            aVar.c(lVar);
        }
        return true;
    }

    @Override // com.zepto.s16
    public ListView h() {
        if (this.i.isEmpty()) {
            return null;
        }
        return ((d) this.i.get(r0.size() - 1)).a();
    }

    @Override // androidx.appcompat.view.menu.i
    public void i(boolean z) {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            us3.B(((d) it.next()).a().getAdapter()).notifyDataSetChanged();
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
        this.x = aVar;
    }

    @Override // com.zepto.us3
    public void o(e eVar) {
        eVar.c(this, this.b);
        if (d()) {
            I(eVar);
        } else {
            this.h.add(eVar);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.i.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = (d) this.i.get(i);
            if (!dVar.a.d()) {
                break;
            } else {
                i++;
            }
        }
        if (dVar != null) {
            dVar.b.e(false);
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
    public boolean p() {
        return false;
    }

    @Override // com.zepto.us3
    public void s(View view) {
        if (this.o != view) {
            this.o = view;
            this.n = jk2.b(this.m, dq7.B(view));
        }
    }

    @Override // com.zepto.us3
    public void u(boolean z) {
        this.v = z;
    }

    @Override // com.zepto.us3
    public void v(int i) {
        if (this.m != i) {
            this.m = i;
            this.n = jk2.b(i, dq7.B(this.o));
        }
    }

    @Override // com.zepto.us3
    public void w(int i) {
        this.r = true;
        this.t = i;
    }

    @Override // com.zepto.us3
    public void x(PopupWindow.OnDismissListener onDismissListener) {
        this.z = onDismissListener;
    }

    @Override // com.zepto.us3
    public void y(boolean z) {
        this.w = z;
    }

    @Override // com.zepto.us3
    public void z(int i) {
        this.s = true;
        this.u = i;
    }
}
