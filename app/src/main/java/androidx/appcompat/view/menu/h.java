package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.i;
import com.zepto.dq7;
import com.zepto.jk2;
import com.zepto.lz4;
import com.zepto.us3;

/* JADX INFO: loaded from: classes.dex */
public class h {
    public final Context a;
    public final e b;
    public final boolean c;
    public final int d;
    public final int e;
    public View f;
    public int g;
    public boolean h;
    public i.a i;
    public us3 j;
    public PopupWindow.OnDismissListener k;
    public final PopupWindow.OnDismissListener l;

    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            h.this.e();
        }
    }

    public static class b {
        public static void a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public h(Context context, e eVar, View view, boolean z, int i) {
        this(context, eVar, view, z, i, 0);
    }

    public final us3 a() {
        Display defaultDisplay = ((WindowManager) this.a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        b.a(defaultDisplay, point);
        us3 bVar = Math.min(point.x, point.y) >= this.a.getResources().getDimensionPixelSize(lz4.a) ? new androidx.appcompat.view.menu.b(this.a, this.f, this.d, this.e, this.c) : new k(this.a, this.b, this.f, this.d, this.e, this.c);
        bVar.o(this.b);
        bVar.x(this.l);
        bVar.s(this.f);
        bVar.n(this.i);
        bVar.u(this.h);
        bVar.v(this.g);
        return bVar;
    }

    public void b() {
        if (d()) {
            this.j.dismiss();
        }
    }

    public us3 c() {
        if (this.j == null) {
            this.j = a();
        }
        return this.j;
    }

    public boolean d() {
        us3 us3Var = this.j;
        return us3Var != null && us3Var.d();
    }

    public void e() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f = view;
    }

    public void g(boolean z) {
        this.h = z;
        us3 us3Var = this.j;
        if (us3Var != null) {
            us3Var.u(z);
        }
    }

    public void h(int i) {
        this.g = i;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.k = onDismissListener;
    }

    public void j(i.a aVar) {
        this.i = aVar;
        us3 us3Var = this.j;
        if (us3Var != null) {
            us3Var.n(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public final void l(int i, int i2, boolean z, boolean z2) {
        us3 us3VarC = c();
        us3VarC.y(z2);
        if (z) {
            if ((jk2.b(this.g, dq7.B(this.f)) & 7) == 5) {
                i -= this.f.getWidth();
            }
            us3VarC.w(i);
            us3VarC.z(i2);
            int i3 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            us3VarC.t(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        us3VarC.a();
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i, int i2) {
        if (d()) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        l(i, i2, true, true);
        return true;
    }

    public h(Context context, e eVar, View view, boolean z, int i, int i2) {
        this.g = 8388611;
        this.l = new a();
        this.a = context;
        this.b = eVar;
        this.f = view;
        this.c = z;
        this.d = i;
        this.e = i2;
    }
}
