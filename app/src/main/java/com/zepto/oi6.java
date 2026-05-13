package com.zepto;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.Toolbar;
import com.zepto.zq;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class oi6 extends t5 {
    public final ve1 a;
    public final Window.Callback b;
    public final zq.g c;
    public boolean d;
    public boolean e;
    public boolean f;
    public ArrayList g = new ArrayList();
    public final Runnable h = new a();
    public final Toolbar.h i;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            oi6.this.B();
        }
    }

    public class b implements Toolbar.h {
        public b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.h
        public boolean onMenuItemClick(MenuItem menuItem) {
            return oi6.this.b.onMenuItemSelected(0, menuItem);
        }
    }

    public final class c implements i.a {
        public boolean a;

        public c() {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z) {
            if (this.a) {
                return;
            }
            this.a = true;
            oi6.this.a.h();
            oi6.this.b.onPanelClosed(108, eVar);
            this.a = false;
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            oi6.this.b.onMenuOpened(108, eVar);
            return true;
        }
    }

    public final class d implements e.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (oi6.this.a.b()) {
                oi6.this.b.onPanelClosed(108, eVar);
            } else if (oi6.this.b.onPreparePanel(0, null, eVar)) {
                oi6.this.b.onMenuOpened(108, eVar);
            }
        }
    }

    public class e implements zq.g {
        public e() {
        }

        @Override // com.zepto.zq.g
        public boolean a(int i) {
            if (i != 0) {
                return false;
            }
            oi6 oi6Var = oi6.this;
            if (oi6Var.d) {
                return false;
            }
            oi6Var.a.c();
            oi6.this.d = true;
            return false;
        }

        @Override // com.zepto.zq.g
        public View onCreatePanelView(int i) {
            if (i == 0) {
                return new View(oi6.this.a.getContext());
            }
            return null;
        }
    }

    public oi6(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.i = bVar;
        lu4.g(toolbar);
        androidx.appcompat.widget.c cVar = new androidx.appcompat.widget.c(toolbar, false);
        this.a = cVar;
        this.b = (Window.Callback) lu4.g(callback);
        cVar.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        cVar.setWindowTitle(charSequence);
        this.c = new e();
    }

    public final Menu A() {
        if (!this.e) {
            this.a.i(new c(), new d());
            this.e = true;
        }
        return this.a.q();
    }

    public void B() {
        Menu menuA = A();
        androidx.appcompat.view.menu.e eVar = menuA instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menuA : null;
        if (eVar != null) {
            eVar.h0();
        }
        try {
            menuA.clear();
            if (!this.b.onCreatePanelMenu(0, menuA) || !this.b.onPreparePanel(0, null, menuA)) {
                menuA.clear();
            }
            if (eVar != null) {
                eVar.g0();
            }
        } catch (Throwable th) {
            if (eVar != null) {
                eVar.g0();
            }
            throw th;
        }
    }

    public void C(int i, int i2) {
        this.a.o((i & i2) | ((~i2) & this.a.p()));
    }

    @Override // com.zepto.t5
    public boolean g() {
        return this.a.e();
    }

    @Override // com.zepto.t5
    public boolean h() {
        if (!this.a.n()) {
            return false;
        }
        this.a.collapseActionView();
        return true;
    }

    @Override // com.zepto.t5
    public void i(boolean z) {
        if (z == this.f) {
            return;
        }
        this.f = z;
        if (this.g.size() <= 0) {
            return;
        }
        wb0.a(this.g.get(0));
        throw null;
    }

    @Override // com.zepto.t5
    public int j() {
        return this.a.p();
    }

    @Override // com.zepto.t5
    public Context k() {
        return this.a.getContext();
    }

    @Override // com.zepto.t5
    public boolean l() {
        this.a.l().removeCallbacks(this.h);
        dq7.i0(this.a.l(), this.h);
        return true;
    }

    @Override // com.zepto.t5
    public void m(Configuration configuration) {
        super.m(configuration);
    }

    @Override // com.zepto.t5
    public void n() {
        this.a.l().removeCallbacks(this.h);
    }

    @Override // com.zepto.t5
    public boolean o(int i, KeyEvent keyEvent) {
        Menu menuA = A();
        if (menuA == null) {
            return false;
        }
        menuA.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuA.performShortcut(i, keyEvent, 0);
    }

    @Override // com.zepto.t5
    public boolean p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            q();
        }
        return true;
    }

    @Override // com.zepto.t5
    public boolean q() {
        return this.a.f();
    }

    @Override // com.zepto.t5
    public void r(boolean z) {
    }

    @Override // com.zepto.t5
    public void s(boolean z) {
        C(z ? 4 : 0, 4);
    }

    @Override // com.zepto.t5
    public void t(boolean z) {
        C(z ? 8 : 0, 8);
    }

    @Override // com.zepto.t5
    public void u(int i) {
        this.a.s(i);
    }

    @Override // com.zepto.t5
    public void v(Drawable drawable) {
        this.a.x(drawable);
    }

    @Override // com.zepto.t5
    public void w(boolean z) {
    }

    @Override // com.zepto.t5
    public void x(CharSequence charSequence) {
        this.a.setTitle(charSequence);
    }

    @Override // com.zepto.t5
    public void y(CharSequence charSequence) {
        this.a.setWindowTitle(charSequence);
    }
}
