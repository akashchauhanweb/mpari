package com.zepto;

import com.zepto.x03;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class rf3 {
    public static final rf3 a;
    public static final rf3 b;

    public static final class b extends rf3 {
        public static final Class c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        public b() {
            super();
        }

        public static List f(Object obj, long j) {
            return (List) iq6.C(obj, j);
        }

        public static List g(Object obj, long j, int i) {
            List list;
            List listF = f(obj, j);
            if (listF.isEmpty()) {
                List rb3Var = listF instanceof sb3 ? new rb3(i) : ((listF instanceof av4) && (listF instanceof x03.d)) ? ((x03.d) listF).t(i) : new ArrayList(i);
                iq6.R(obj, j, rb3Var);
                return rb3Var;
            }
            if (c.isAssignableFrom(listF.getClass())) {
                ArrayList arrayList = new ArrayList(listF.size() + i);
                arrayList.addAll(listF);
                iq6.R(obj, j, arrayList);
                list = arrayList;
            } else {
                if (!(listF instanceof zp6)) {
                    if (!(listF instanceof av4) || !(listF instanceof x03.d)) {
                        return listF;
                    }
                    x03.d dVar = (x03.d) listF;
                    if (dVar.X()) {
                        return listF;
                    }
                    x03.d dVarT = dVar.t(listF.size() + i);
                    iq6.R(obj, j, dVarT);
                    return dVarT;
                }
                rb3 rb3Var2 = new rb3(listF.size() + i);
                rb3Var2.addAll((zp6) listF);
                iq6.R(obj, j, rb3Var2);
                list = rb3Var2;
            }
            return list;
        }

        @Override // com.zepto.rf3
        public void c(Object obj, long j) {
            Object objUnmodifiableList;
            List list = (List) iq6.C(obj, j);
            if (list instanceof sb3) {
                objUnmodifiableList = ((sb3) list).I();
            } else {
                if (c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof av4) && (list instanceof x03.d)) {
                    x03.d dVar = (x03.d) list;
                    if (dVar.X()) {
                        dVar.q();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            iq6.R(obj, j, objUnmodifiableList);
        }

        @Override // com.zepto.rf3
        public void d(Object obj, Object obj2, long j) {
            List listF = f(obj2, j);
            List listG = g(obj, j, listF.size());
            int size = listG.size();
            int size2 = listF.size();
            if (size > 0 && size2 > 0) {
                listG.addAll(listF);
            }
            if (size > 0) {
                listF = listG;
            }
            iq6.R(obj, j, listF);
        }

        @Override // com.zepto.rf3
        public List e(Object obj, long j) {
            return g(obj, j, 10);
        }
    }

    public static final class c extends rf3 {
        public c() {
            super();
        }

        public static x03.d f(Object obj, long j) {
            return (x03.d) iq6.C(obj, j);
        }

        @Override // com.zepto.rf3
        public void c(Object obj, long j) {
            f(obj, j).q();
        }

        @Override // com.zepto.rf3
        public void d(Object obj, Object obj2, long j) {
            x03.d dVarF = f(obj, j);
            x03.d dVarF2 = f(obj2, j);
            int size = dVarF.size();
            int size2 = dVarF2.size();
            if (size > 0 && size2 > 0) {
                if (!dVarF.X()) {
                    dVarF = dVarF.t(size2 + size);
                }
                dVarF.addAll(dVarF2);
            }
            if (size > 0) {
                dVarF2 = dVarF;
            }
            iq6.R(obj, j, dVarF2);
        }

        @Override // com.zepto.rf3
        public List e(Object obj, long j) {
            x03.d dVarF = f(obj, j);
            if (dVarF.X()) {
                return dVarF;
            }
            int size = dVarF.size();
            x03.d dVarT = dVarF.t(size == 0 ? 10 : size * 2);
            iq6.R(obj, j, dVarT);
            return dVarT;
        }
    }

    static {
        a = new b();
        b = new c();
    }

    public rf3() {
    }

    public static rf3 a() {
        return a;
    }

    public static rf3 b() {
        return b;
    }

    public abstract void c(Object obj, long j);

    public abstract void d(Object obj, Object obj2, long j);

    public abstract List e(Object obj, long j);
}
