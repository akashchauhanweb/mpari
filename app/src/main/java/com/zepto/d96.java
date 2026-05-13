package com.zepto;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import com.zepto.z5;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class d96 extends ActionMode {
    public final Context a;
    public final z5 b;

    public static class a implements z5.a {
        public final ActionMode.Callback a;
        public final Context b;
        public final ArrayList c = new ArrayList();
        public final w26 d = new w26();

        public a(Context context, ActionMode.Callback callback) {
            this.b = context;
            this.a = callback;
        }

        @Override // com.zepto.z5.a
        public void a(z5 z5Var) {
            this.a.onDestroyActionMode(e(z5Var));
        }

        @Override // com.zepto.z5.a
        public boolean b(z5 z5Var, Menu menu) {
            return this.a.onCreateActionMode(e(z5Var), f(menu));
        }

        @Override // com.zepto.z5.a
        public boolean c(z5 z5Var, MenuItem menuItem) {
            return this.a.onActionItemClicked(e(z5Var), new ts3(this.b, (h96) menuItem));
        }

        @Override // com.zepto.z5.a
        public boolean d(z5 z5Var, Menu menu) {
            return this.a.onPrepareActionMode(e(z5Var), f(menu));
        }

        public ActionMode e(z5 z5Var) {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                d96 d96Var = (d96) this.c.get(i);
                if (d96Var != null && d96Var.b == z5Var) {
                    return d96Var;
                }
            }
            d96 d96Var2 = new d96(this.b, z5Var);
            this.c.add(d96Var2);
            return d96Var2;
        }

        public final Menu f(Menu menu) {
            Menu menu2 = (Menu) this.d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            xs3 xs3Var = new xs3(this.b, (f96) menu);
            this.d.put(menu, xs3Var);
            return xs3Var;
        }
    }

    public d96(Context context, z5 z5Var) {
        this.a = context;
        this.b = z5Var;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new xs3(this.a, (f96) this.b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.b.s(z);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.b.n(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.b.q(i);
    }
}
