package com.zepto;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class qs3 {
    public final Runnable a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final Map c = new HashMap();

    public qs3(Runnable runnable) {
        this.a = runnable;
    }

    public void a(ws3 ws3Var) {
        this.b.add(ws3Var);
        this.a.run();
    }

    public void b(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((ws3) it.next()).c(menu, menuInflater);
        }
    }

    public void c(Menu menu) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((ws3) it.next()).b(menu);
        }
    }

    public boolean d(MenuItem menuItem) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            if (((ws3) it.next()).a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void e(Menu menu) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((ws3) it.next()).d(menu);
        }
    }

    public void f(ws3 ws3Var) {
        this.b.remove(ws3Var);
        wb0.a(this.c.remove(ws3Var));
        this.a.run();
    }
}
