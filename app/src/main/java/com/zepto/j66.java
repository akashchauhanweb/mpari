package com.zepto;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContextView;
import com.zepto.z5;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class j66 extends z5 implements e.a {
    public Context c;
    public ActionBarContextView d;
    public z5.a e;
    public WeakReference f;
    public boolean g;
    public boolean h;
    public androidx.appcompat.view.menu.e i;

    public j66(Context context, ActionBarContextView actionBarContextView, z5.a aVar, boolean z) {
        this.c = context;
        this.d = actionBarContextView;
        this.e = aVar;
        androidx.appcompat.view.menu.e eVarW = new androidx.appcompat.view.menu.e(actionBarContextView.getContext()).W(1);
        this.i = eVarW;
        eVarW.V(this);
        this.h = z;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        return this.e.c(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        k();
        this.d.l();
    }

    @Override // com.zepto.z5
    public void c() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.e.a(this);
    }

    @Override // com.zepto.z5
    public View d() {
        WeakReference weakReference = this.f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // com.zepto.z5
    public Menu e() {
        return this.i;
    }

    @Override // com.zepto.z5
    public MenuInflater f() {
        return new g96(this.d.getContext());
    }

    @Override // com.zepto.z5
    public CharSequence g() {
        return this.d.getSubtitle();
    }

    @Override // com.zepto.z5
    public CharSequence i() {
        return this.d.getTitle();
    }

    @Override // com.zepto.z5
    public void k() {
        this.e.d(this, this.i);
    }

    @Override // com.zepto.z5
    public boolean l() {
        return this.d.j();
    }

    @Override // com.zepto.z5
    public void m(View view) {
        this.d.setCustomView(view);
        this.f = view != null ? new WeakReference(view) : null;
    }

    @Override // com.zepto.z5
    public void n(int i) {
        o(this.c.getString(i));
    }

    @Override // com.zepto.z5
    public void o(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override // com.zepto.z5
    public void q(int i) {
        r(this.c.getString(i));
    }

    @Override // com.zepto.z5
    public void r(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override // com.zepto.z5
    public void s(boolean z) {
        super.s(z);
        this.d.setTitleOptional(z);
    }
}
