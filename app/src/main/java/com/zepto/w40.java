package com.zepto;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: loaded from: classes.dex */
public abstract class w40 {
    public final Context a;
    public w26 b;
    public w26 c;

    public w40(Context context) {
        this.a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof h96)) {
            return menuItem;
        }
        h96 h96Var = (h96) menuItem;
        if (this.b == null) {
            this.b = new w26();
        }
        MenuItem menuItem2 = (MenuItem) this.b.get(h96Var);
        if (menuItem2 != null) {
            return menuItem2;
        }
        ts3 ts3Var = new ts3(this.a, h96Var);
        this.b.put(h96Var, ts3Var);
        return ts3Var;
    }

    public final SubMenu d(SubMenu subMenu) {
        return subMenu;
    }

    public final void e() {
        w26 w26Var = this.b;
        if (w26Var != null) {
            w26Var.clear();
        }
        w26 w26Var2 = this.c;
        if (w26Var2 != null) {
            w26Var2.clear();
        }
    }

    public final void f(int i) {
        if (this.b == null) {
            return;
        }
        int i2 = 0;
        while (i2 < this.b.size()) {
            if (((h96) this.b.i(i2)).getGroupId() == i) {
                this.b.k(i2);
                i2--;
            }
            i2++;
        }
    }

    public final void g(int i) {
        if (this.b == null) {
            return;
        }
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            if (((h96) this.b.i(i2)).getItemId() == i) {
                this.b.k(i2);
                return;
            }
        }
    }
}
