package com.zepto;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public class mx7 extends lx7 {
    public static final String j = rn3.i("WorkContinuationImpl");
    public final jy7 a;
    public final String b;
    public final s62 c;
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public boolean h;
    public nh4 i;

    public mx7(jy7 jy7Var, List list) {
        this(jy7Var, null, s62.KEEP, list, null);
    }

    public static boolean i(mx7 mx7Var, Set set) {
        set.addAll(mx7Var.c());
        Set setL = l(mx7Var);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (setL.contains((String) it.next())) {
                return true;
            }
        }
        List listE = mx7Var.e();
        if (listE != null && !listE.isEmpty()) {
            Iterator it2 = listE.iterator();
            while (it2.hasNext()) {
                if (i((mx7) it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(mx7Var.c());
        return false;
    }

    public static Set l(mx7 mx7Var) {
        HashSet hashSet = new HashSet();
        List listE = mx7Var.e();
        if (listE != null && !listE.isEmpty()) {
            Iterator it = listE.iterator();
            while (it.hasNext()) {
                hashSet.addAll(((mx7) it.next()).c());
            }
        }
        return hashSet;
    }

    public nh4 a() {
        if (this.h) {
            rn3.e().k(j, "Already enqueued work ids (" + TextUtils.join(", ", this.e) + ")");
        } else {
            r22 r22Var = new r22(this);
            this.a.o().c(r22Var);
            this.i = r22Var.d();
        }
        return this.i;
    }

    public s62 b() {
        return this.c;
    }

    public List c() {
        return this.e;
    }

    public String d() {
        return this.b;
    }

    public List e() {
        return this.g;
    }

    public List f() {
        return this.d;
    }

    public jy7 g() {
        return this.a;
    }

    public boolean h() {
        return i(this, new HashSet());
    }

    public boolean j() {
        return this.h;
    }

    public void k() {
        this.h = true;
    }

    public mx7(jy7 jy7Var, String str, s62 s62Var, List list, List list2) {
        this.a = jy7Var;
        this.b = str;
        this.c = s62Var;
        this.d = list;
        this.g = list2;
        this.e = new ArrayList(list.size());
        this.f = new ArrayList();
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                this.f.addAll(((mx7) it.next()).f);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (s62Var == s62.REPLACE && ((uy7) list.get(i)).d().e() != LongCompanionObject.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String strB = ((uy7) list.get(i)).b();
            this.e.add(strB);
            this.f.add(strB);
        }
    }
}
