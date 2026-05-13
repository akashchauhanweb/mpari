package com.zepto;

import android.content.Context;
import android.view.SubMenu;

/* JADX INFO: loaded from: classes.dex */
public class y24 extends androidx.appcompat.view.menu.e {
    public y24(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.e, android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) a(i, i2, i3, charSequence);
        a34 a34Var = new a34(w(), this, gVar);
        gVar.x(a34Var);
        return a34Var;
    }
}
