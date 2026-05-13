package com.zepto;

import android.util.Log;
import androidx.lifecycle.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class pg2 extends zq7 {
    public static final z.b k = new a();
    public final boolean g;
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;

    public class a implements z.b {
        @Override // androidx.lifecycle.z.b
        public zq7 a(Class cls) {
            return new pg2(true);
        }
    }

    public pg2(boolean z) {
        this.g = z;
    }

    public static pg2 m(cr7 cr7Var) {
        return (pg2) new androidx.lifecycle.z(cr7Var, k).a(pg2.class);
    }

    @Override // com.zepto.zq7
    public void e() {
        if (mg2.J0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.h = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pg2.class != obj.getClass()) {
            return false;
        }
        pg2 pg2Var = (pg2) obj;
        return this.d.equals(pg2Var.d) && this.e.equals(pg2Var.e) && this.f.equals(pg2Var.f);
    }

    public void g(sf2 sf2Var) {
        if (this.j) {
            if (mg2.J0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.d.containsKey(sf2Var.f)) {
                return;
            }
            this.d.put(sf2Var.f, sf2Var);
            if (mg2.J0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + sf2Var);
            }
        }
    }

    public void h(sf2 sf2Var, boolean z) {
        if (mg2.J0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + sf2Var);
        }
        j(sf2Var.f, z);
    }

    public int hashCode() {
        return (((this.d.hashCode() * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public void i(String str, boolean z) {
        if (mg2.J0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        j(str, z);
    }

    public final void j(String str, boolean z) {
        pg2 pg2Var = (pg2) this.e.get(str);
        if (pg2Var != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(pg2Var.e.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    pg2Var.i((String) it.next(), true);
                }
            }
            pg2Var.e();
            this.e.remove(str);
        }
        cr7 cr7Var = (cr7) this.f.get(str);
        if (cr7Var != null) {
            cr7Var.a();
            this.f.remove(str);
        }
    }

    public sf2 k(String str) {
        return (sf2) this.d.get(str);
    }

    public pg2 l(sf2 sf2Var) {
        pg2 pg2Var = (pg2) this.e.get(sf2Var.f);
        if (pg2Var != null) {
            return pg2Var;
        }
        pg2 pg2Var2 = new pg2(this.g);
        this.e.put(sf2Var.f, pg2Var2);
        return pg2Var2;
    }

    public Collection n() {
        return new ArrayList(this.d.values());
    }

    public cr7 o(sf2 sf2Var) {
        cr7 cr7Var = (cr7) this.f.get(sf2Var.f);
        if (cr7Var != null) {
            return cr7Var;
        }
        cr7 cr7Var2 = new cr7();
        this.f.put(sf2Var.f, cr7Var2);
        return cr7Var2;
    }

    public boolean p() {
        return this.h;
    }

    public void q(sf2 sf2Var) {
        if (this.j) {
            if (mg2.J0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.d.remove(sf2Var.f) == null || !mg2.J0(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + sf2Var);
        }
    }

    public void r(boolean z) {
        this.j = z;
    }

    public boolean s(sf2 sf2Var) {
        if (this.d.containsKey(sf2Var.f)) {
            return this.g ? this.h : !this.i;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
