package com.zepto;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.zepto.cm5;
import com.zepto.dd6;
import com.zepto.z5;

/* JADX INFO: loaded from: classes.dex */
public abstract class pq extends yf2 implements sq, dd6.a {
    public yq A;
    public Resources B;

    public class a implements cm5.c {
        public a() {
        }

        @Override // com.zepto.cm5.c
        public Bundle a() {
            Bundle bundle = new Bundle();
            pq.this.S0().C(bundle);
            return bundle;
        }
    }

    public class b implements ng4 {
        public b() {
        }

        @Override // com.zepto.ng4
        public void a(Context context) {
            yq yqVarS0 = pq.this.S0();
            yqVarS0.t();
            yqVarS0.y(pq.this.o().b("androidx:appcompat"));
        }
    }

    public pq() {
        V0();
    }

    public yq S0() {
        if (this.A == null) {
            this.A = yq.h(this, this);
        }
        return this.A;
    }

    public v5 T0() {
        return S0().n();
    }

    public t5 U0() {
        return S0().s();
    }

    @Override // com.zepto.dd6.a
    public Intent V() {
        return v24.a(this);
    }

    public final void V0() {
        o().h("androidx:appcompat", new a());
        r0(new b());
    }

    public final void W0() {
        ur7.a(getWindow().getDecorView(), this);
        xr7.a(getWindow().getDecorView(), this);
        wr7.a(getWindow().getDecorView(), this);
        vr7.a(getWindow().getDecorView(), this);
    }

    @Override // com.zepto.sq
    public void X(z5 z5Var) {
    }

    public void X0(dd6 dd6Var) {
        dd6Var.n(this);
    }

    public void Y0(lm3 lm3Var) {
    }

    public void Z0(int i) {
    }

    public void a1(dd6 dd6Var) {
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        W0();
        S0().e(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(S0().g(context));
    }

    public void b1() {
    }

    public boolean c1() {
        Intent intentV = V();
        if (intentV == null) {
            return false;
        }
        if (!h1(intentV)) {
            g1(intentV);
            return true;
        }
        dd6 dd6VarU = dd6.u(this);
        X0(dd6VarU);
        a1(dd6VarU);
        dd6VarU.B();
        try {
            l8.p(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        t5 t5VarU0 = U0();
        if (getWindow().hasFeature(0)) {
            if (t5VarU0 == null || !t5VarU0.g()) {
                super.closeOptionsMenu();
            }
        }
    }

    public final boolean d1(KeyEvent keyEvent) {
        return false;
    }

    @Override // com.zepto.bu0, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        t5 t5VarU0 = U0();
        if (keyCode == 82 && t5VarU0 != null && t5VarU0.p(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public void e1(Toolbar toolbar) {
        S0().N(toolbar);
    }

    public void f1() {
        S0().u();
    }

    @Override // android.app.Activity
    public View findViewById(int i) {
        return S0().j(i);
    }

    public void g1(Intent intent) {
        v24.e(this, intent);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return S0().q();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.B == null && pm7.d()) {
            this.B = new pm7(this, super.getResources());
        }
        Resources resources = this.B;
        return resources == null ? super.getResources() : resources;
    }

    public boolean h1(Intent intent) {
        return v24.f(this, intent);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        S0().u();
    }

    @Override // com.zepto.sq
    public void n(z5 z5Var) {
    }

    @Override // com.zepto.zt0, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        S0().x(configuration);
        if (this.B != null) {
            this.B.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        b1();
    }

    @Override // com.zepto.yf2, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        S0().z();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (d1(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.zepto.yf2, com.zepto.zt0, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        t5 t5VarU0 = U0();
        if (menuItem.getItemId() != 16908332 || t5VarU0 == null || (t5VarU0.j() & 4) == 0) {
            return false;
        }
        return c1();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // com.zepto.zt0, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        S0().A(bundle);
    }

    @Override // com.zepto.yf2, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        S0().B();
    }

    @Override // com.zepto.yf2, android.app.Activity
    public void onStart() {
        super.onStart();
        S0().D();
    }

    @Override // com.zepto.yf2, android.app.Activity
    public void onStop() {
        super.onStop();
        S0().E();
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        S0().P(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        t5 t5VarU0 = U0();
        if (getWindow().hasFeature(0)) {
            if (t5VarU0 == null || !t5VarU0.q()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // com.zepto.sq
    public z5 s(z5.a aVar) {
        return null;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void setContentView(int i) {
        W0();
        S0().J(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        S0().O(i);
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void setContentView(View view) {
        W0();
        S0().K(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        W0();
        S0().L(view, layoutParams);
    }
}
