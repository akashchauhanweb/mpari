package com.zepto;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.random.Random;

/* JADX INFO: loaded from: classes.dex */
public abstract class pf {
    public final Map a = new HashMap();
    public final Map b = new HashMap();
    public final Map c = new HashMap();
    public ArrayList d = new ArrayList();
    public final transient Map e = new HashMap();
    public final Map f = new HashMap();
    public final Bundle g = new Bundle();

    public class a implements androidx.lifecycle.k {
        public final /* synthetic */ String c;
        public final /* synthetic */ hf e;
        public final /* synthetic */ Cif f;

        public a(String str, hf hfVar, Cif cif) {
            this.c = str;
            this.e = hfVar;
            this.f = cif;
        }

        @Override // androidx.lifecycle.k
        public void e(df3 df3Var, h.a aVar) {
            if (!h.a.ON_START.equals(aVar)) {
                if (h.a.ON_STOP.equals(aVar)) {
                    pf.this.e.remove(this.c);
                    return;
                } else {
                    if (h.a.ON_DESTROY.equals(aVar)) {
                        pf.this.l(this.c);
                        return;
                    }
                    return;
                }
            }
            pf.this.e.put(this.c, new d(this.e, this.f));
            if (pf.this.f.containsKey(this.c)) {
                Object obj = pf.this.f.get(this.c);
                pf.this.f.remove(this.c);
                this.e.a(obj);
            }
            gf gfVar = (gf) pf.this.g.getParcelable(this.c);
            if (gfVar != null) {
                pf.this.g.remove(this.c);
                this.e.a(this.f.c(gfVar.d(), gfVar.c()));
            }
        }
    }

    public class b extends of {
        public final /* synthetic */ String a;
        public final /* synthetic */ Cif b;

        public b(String str, Cif cif) {
            this.a = str;
            this.b = cif;
        }

        @Override // com.zepto.of
        public void b(Object obj, ke keVar) throws Exception {
            Integer num = (Integer) pf.this.b.get(this.a);
            if (num != null) {
                pf.this.d.add(this.a);
                try {
                    pf.this.f(num.intValue(), this.b, obj, keVar);
                    return;
                } catch (Exception e) {
                    pf.this.d.remove(this.a);
                    throw e;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.b + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // com.zepto.of
        public void c() {
            pf.this.l(this.a);
        }
    }

    public class c extends of {
        public final /* synthetic */ String a;
        public final /* synthetic */ Cif b;

        public c(String str, Cif cif) {
            this.a = str;
            this.b = cif;
        }

        @Override // com.zepto.of
        public void b(Object obj, ke keVar) throws Exception {
            Integer num = (Integer) pf.this.b.get(this.a);
            if (num != null) {
                pf.this.d.add(this.a);
                try {
                    pf.this.f(num.intValue(), this.b, obj, keVar);
                    return;
                } catch (Exception e) {
                    pf.this.d.remove(this.a);
                    throw e;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.b + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // com.zepto.of
        public void c() {
            pf.this.l(this.a);
        }
    }

    public static class d {
        public final hf a;
        public final Cif b;

        public d(hf hfVar, Cif cif) {
            this.a = hfVar;
            this.b = cif;
        }
    }

    public static class e {
        public final androidx.lifecycle.h a;
        public final ArrayList b = new ArrayList();

        public e(androidx.lifecycle.h hVar) {
            this.a = hVar;
        }

        public void a(androidx.lifecycle.k kVar) {
            this.a.a(kVar);
            this.b.add(kVar);
        }

        public void b() {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                this.a.d((androidx.lifecycle.k) it.next());
            }
            this.b.clear();
        }
    }

    public final void a(int i, String str) {
        this.a.put(Integer.valueOf(i), str);
        this.b.put(str, Integer.valueOf(i));
    }

    public final boolean b(int i, int i2, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        d(str, i2, intent, (d) this.e.get(str));
        return true;
    }

    public final boolean c(int i, Object obj) {
        hf hfVar;
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        d dVar = (d) this.e.get(str);
        if (dVar == null || (hfVar = dVar.a) == null) {
            this.g.remove(str);
            this.f.put(str, obj);
            return true;
        }
        if (!this.d.remove(str)) {
            return true;
        }
        hfVar.a(obj);
        return true;
    }

    public final void d(String str, int i, Intent intent, d dVar) {
        if (dVar == null || dVar.a == null || !this.d.contains(str)) {
            this.f.remove(str);
            this.g.putParcelable(str, new gf(i, intent));
        } else {
            dVar.a.a(dVar.b.c(i, intent));
            this.d.remove(str);
        }
    }

    public final int e() {
        int iNextInt = Random.INSTANCE.nextInt(2147418112);
        while (true) {
            int i = iNextInt + 65536;
            if (!this.a.containsKey(Integer.valueOf(i))) {
                return i;
            }
            iNextInt = Random.INSTANCE.nextInt(2147418112);
        }
    }

    public abstract void f(int i, Cif cif, Object obj, ke keVar);

    public final void g(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        this.d = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        this.g.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
        for (int i = 0; i < stringArrayList.size(); i++) {
            String str = stringArrayList.get(i);
            if (this.b.containsKey(str)) {
                Integer num = (Integer) this.b.remove(str);
                if (!this.g.containsKey(str)) {
                    this.a.remove(num);
                }
            }
            a(integerArrayList.get(i).intValue(), stringArrayList.get(i));
        }
    }

    public final void h(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.b.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.b.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.g.clone());
    }

    public final of i(String str, Cif cif, hf hfVar) {
        k(str);
        this.e.put(str, new d(hfVar, cif));
        if (this.f.containsKey(str)) {
            Object obj = this.f.get(str);
            this.f.remove(str);
            hfVar.a(obj);
        }
        gf gfVar = (gf) this.g.getParcelable(str);
        if (gfVar != null) {
            this.g.remove(str);
            hfVar.a(cif.c(gfVar.d(), gfVar.c()));
        }
        return new c(str, cif);
    }

    public final of j(String str, df3 df3Var, Cif cif, hf hfVar) {
        androidx.lifecycle.h hVarG0 = df3Var.g0();
        if (hVarG0.b().b(h.b.STARTED)) {
            throw new IllegalStateException("LifecycleOwner " + df3Var + " is attempting to register while current state is " + hVarG0.b() + ". LifecycleOwners must call register before they are STARTED.");
        }
        k(str);
        e eVar = (e) this.c.get(str);
        if (eVar == null) {
            eVar = new e(hVarG0);
        }
        eVar.a(new a(str, hfVar, cif));
        this.c.put(str, eVar);
        return new b(str, cif);
    }

    public final void k(String str) {
        if (((Integer) this.b.get(str)) != null) {
            return;
        }
        a(e(), str);
    }

    public final void l(String str) {
        Integer num;
        if (!this.d.contains(str) && (num = (Integer) this.b.remove(str)) != null) {
            this.a.remove(num);
        }
        this.e.remove(str);
        if (this.f.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f.get(str));
            this.f.remove(str);
        }
        if (this.g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.g.getParcelable(str));
            this.g.remove(str);
        }
        e eVar = (e) this.c.get(str);
        if (eVar != null) {
            eVar.b();
            this.c.remove(str);
        }
    }
}
