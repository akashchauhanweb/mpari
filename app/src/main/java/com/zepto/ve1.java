package com.zepto;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;

/* JADX INFO: loaded from: classes.dex */
public interface ve1 {
    void a(Menu menu, i.a aVar);

    boolean b();

    void c();

    void collapseActionView();

    boolean d();

    boolean e();

    boolean f();

    boolean g();

    Context getContext();

    CharSequence getTitle();

    void h();

    void i(i.a aVar, e.a aVar2);

    void j(int i);

    void k(androidx.appcompat.widget.b bVar);

    ViewGroup l();

    void m(boolean z);

    boolean n();

    void o(int i);

    int p();

    Menu q();

    void r(int i);

    void s(int i);

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    int t();

    lr7 u(int i, long j);

    void v();

    void w();

    void x(Drawable drawable);

    void y(boolean z);
}
