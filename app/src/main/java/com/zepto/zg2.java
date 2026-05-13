package com.zepto;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class zg2 {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public pg2 d;

    public void A(pg2 pg2Var) {
        this.d = pg2Var;
    }

    public Bundle B(String str, Bundle bundle) {
        return bundle != null ? (Bundle) this.c.put(str, bundle) : (Bundle) this.c.remove(str);
    }

    public void a(sf2 sf2Var) {
        if (this.a.contains(sf2Var)) {
            throw new IllegalStateException("Fragment already added: " + sf2Var);
        }
        synchronized (this.a) {
            this.a.add(sf2Var);
        }
        sf2Var.l = true;
    }

    public void b() {
        this.b.values().removeAll(Collections.singleton(null));
    }

    public boolean c(String str) {
        return this.b.get(str) != null;
    }

    public void d(int i) {
        for (yg2 yg2Var : this.b.values()) {
            if (yg2Var != null) {
                yg2Var.s(i);
            }
        }
    }

    public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (yg2 yg2Var : this.b.values()) {
                printWriter.print(str);
                if (yg2Var != null) {
                    sf2 sf2VarK = yg2Var.k();
                    printWriter.println(sf2VarK);
                    sf2VarK.i(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                sf2 sf2Var = (sf2) this.a.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(sf2Var.toString());
            }
        }
    }

    public sf2 f(String str) {
        yg2 yg2Var = (yg2) this.b.get(str);
        if (yg2Var != null) {
            return yg2Var.k();
        }
        return null;
    }

    public sf2 g(int i) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            sf2 sf2Var = (sf2) this.a.get(size);
            if (sf2Var != null && sf2Var.x == i) {
                return sf2Var;
            }
        }
        for (yg2 yg2Var : this.b.values()) {
            if (yg2Var != null) {
                sf2 sf2VarK = yg2Var.k();
                if (sf2VarK.x == i) {
                    return sf2VarK;
                }
            }
        }
        return null;
    }

    public sf2 h(String str) {
        if (str != null) {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                sf2 sf2Var = (sf2) this.a.get(size);
                if (sf2Var != null && str.equals(sf2Var.z)) {
                    return sf2Var;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (yg2 yg2Var : this.b.values()) {
            if (yg2Var != null) {
                sf2 sf2VarK = yg2Var.k();
                if (str.equals(sf2VarK.z)) {
                    return sf2VarK;
                }
            }
        }
        return null;
    }

    public sf2 i(String str) {
        sf2 sf2VarK;
        for (yg2 yg2Var : this.b.values()) {
            if (yg2Var != null && (sf2VarK = yg2Var.k().k(str)) != null) {
                return sf2VarK;
            }
        }
        return null;
    }

    public int j(sf2 sf2Var) {
        View view;
        View view2;
        ViewGroup viewGroup = sf2Var.H;
        if (viewGroup == null) {
            return -1;
        }
        int iIndexOf = this.a.indexOf(sf2Var);
        for (int i = iIndexOf - 1; i >= 0; i--) {
            sf2 sf2Var2 = (sf2) this.a.get(i);
            if (sf2Var2.H == viewGroup && (view2 = sf2Var2.I) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.a.size()) {
                return -1;
            }
            sf2 sf2Var3 = (sf2) this.a.get(iIndexOf);
            if (sf2Var3.H == viewGroup && (view = sf2Var3.I) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    public List k() {
        ArrayList arrayList = new ArrayList();
        for (yg2 yg2Var : this.b.values()) {
            if (yg2Var != null) {
                arrayList.add(yg2Var);
            }
        }
        return arrayList;
    }

    public List l() {
        ArrayList arrayList = new ArrayList();
        for (yg2 yg2Var : this.b.values()) {
            if (yg2Var != null) {
                arrayList.add(yg2Var.k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public HashMap m() {
        return this.c;
    }

    public yg2 n(String str) {
        return (yg2) this.b.get(str);
    }

    public List o() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    public pg2 p() {
        return this.d;
    }

    public Bundle q(String str) {
        return (Bundle) this.c.get(str);
    }

    public void r(yg2 yg2Var) {
        sf2 sf2VarK = yg2Var.k();
        if (c(sf2VarK.f)) {
            return;
        }
        this.b.put(sf2VarK.f, yg2Var);
        if (sf2VarK.D) {
            if (sf2VarK.C) {
                this.d.g(sf2VarK);
            } else {
                this.d.q(sf2VarK);
            }
            sf2VarK.D = false;
        }
        if (mg2.J0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + sf2VarK);
        }
    }

    public void s(yg2 yg2Var) {
        sf2 sf2VarK = yg2Var.k();
        if (sf2VarK.C) {
            this.d.q(sf2VarK);
        }
        if (this.b.get(sf2VarK.f) == yg2Var && ((yg2) this.b.put(sf2VarK.f, null)) != null && mg2.J0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + sf2VarK);
        }
    }

    public void t() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            yg2 yg2Var = (yg2) this.b.get(((sf2) it.next()).f);
            if (yg2Var != null) {
                yg2Var.m();
            }
        }
        for (yg2 yg2Var2 : this.b.values()) {
            if (yg2Var2 != null) {
                yg2Var2.m();
                sf2 sf2VarK = yg2Var2.k();
                if (sf2VarK.m && !sf2VarK.p0()) {
                    if (sf2VarK.n && !this.c.containsKey(sf2VarK.f)) {
                        B(sf2VarK.f, yg2Var2.q());
                    }
                    s(yg2Var2);
                }
            }
        }
    }

    public void u(sf2 sf2Var) {
        synchronized (this.a) {
            this.a.remove(sf2Var);
        }
        sf2Var.l = false;
    }

    public void v() {
        this.b.clear();
    }

    public void w(List list) {
        this.a.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                sf2 sf2VarF = f(str);
                if (sf2VarF == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (mg2.J0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + sf2VarF);
                }
                a(sf2VarF);
            }
        }
    }

    public void x(HashMap map) {
        this.c.clear();
        this.c.putAll(map);
    }

    public ArrayList y() {
        ArrayList arrayList = new ArrayList(this.b.size());
        for (yg2 yg2Var : this.b.values()) {
            if (yg2Var != null) {
                sf2 sf2VarK = yg2Var.k();
                B(sf2VarK.f, yg2Var.q());
                arrayList.add(sf2VarK.f);
                if (mg2.J0(2)) {
                    Log.v("FragmentManager", "Saved state of " + sf2VarK + ": " + sf2VarK.b);
                }
            }
        }
        return arrayList;
    }

    public ArrayList z() {
        synchronized (this.a) {
            try {
                if (this.a.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(this.a.size());
                for (sf2 sf2Var : this.a) {
                    arrayList.add(sf2Var.f);
                    if (mg2.J0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + sf2Var.f + "): " + sf2Var);
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
