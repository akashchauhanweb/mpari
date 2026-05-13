package com.zepto;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class lb2 extends wx0 {
    public final wp c;
    public final ay0 e = new ay0();
    public final c96 f;

    public static class a {
        public final Class a;
        public final String b;

        public a(Field field) {
            this.a = field.getDeclaringClass();
            this.b = field.getName();
        }

        public final boolean a(a aVar) {
            if (aVar.a != this.a) {
                return false;
            }
            return aVar.b.equals(this.b);
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return a((a) obj);
            }
            return false;
        }

        public int hashCode() {
            return this.b.hashCode();
        }
    }

    public lb2(si1 si1Var, c96 c96Var) {
        this.c = new wp(si1Var, c96Var);
        this.f = c96Var;
        k0(si1Var);
    }

    public final void O(si1 si1Var, mg1 mg1Var) {
        List<gb2> listJ = si1Var.j();
        if (mg1Var == mg1.FIELD) {
            for (gb2 gb2Var : listJ) {
                Annotation[] annotationArrA = gb2Var.a();
                Field fieldB = gb2Var.b();
                Class<?> type = fieldB.getType();
                if (!a0(fieldB) && !g0(fieldB)) {
                    h0(fieldB, type, annotationArrA);
                }
            }
        }
    }

    public final void T(Object obj, vx0 vx0Var) {
        vx0 vx0Var2 = (vx0) this.e.remove(obj);
        if (vx0Var2 != null && f0(vx0Var)) {
            vx0Var = vx0Var2;
        }
        this.e.put(obj, vx0Var);
    }

    public final boolean a0(Field field) {
        return Modifier.isStatic(field.getModifiers());
    }

    public final boolean f0(vx0 vx0Var) {
        return vx0Var.a() instanceof oe6;
    }

    public final boolean g0(Field field) {
        return Modifier.isTransient(field.getModifiers());
    }

    public final void h0(Field field, Class cls, Annotation[] annotationArr) {
        Annotation annotationC = this.c.c(cls, o75.e(field));
        if (annotationC != null) {
            i0(field, annotationC, annotationArr);
        }
    }

    public final void i0(Field field, Annotation annotation, Annotation[] annotationArr) {
        eb2 eb2Var = new eb2(field, annotation, annotationArr);
        a aVar = new a(field);
        if (!field.isAccessible()) {
            field.setAccessible(true);
        }
        T(aVar, eb2Var);
    }

    public final void j0(Field field, Annotation annotation) {
        this.e.remove(new a(field));
    }

    public final void k0(si1 si1Var) {
        mg1 mg1VarI = si1Var.i();
        mg1 mg1VarK = si1Var.k();
        Class clsL = si1Var.l();
        if (clsL != null) {
            u(clsL, mg1VarI);
        }
        O(si1Var, mg1VarK);
        z(si1Var);
        r();
    }

    public final void l0(Field field, Annotation annotation, Annotation[] annotationArr) {
        if (annotation instanceof cz) {
            i0(field, annotation, annotationArr);
        }
        if (annotation instanceof z02) {
            i0(field, annotation, annotationArr);
        }
        if (annotation instanceof o02) {
            i0(field, annotation, annotationArr);
        }
        if (annotation instanceof v02) {
            i0(field, annotation, annotationArr);
        }
        if (annotation instanceof l02) {
            i0(field, annotation, annotationArr);
        }
        if (annotation instanceof g02) {
            i0(field, annotation, annotationArr);
        }
        if (annotation instanceof s02) {
            i0(field, annotation, annotationArr);
        }
        if (annotation instanceof e02) {
            i0(field, annotation, annotationArr);
        }
        if (annotation instanceof ip7) {
            i0(field, annotation, annotationArr);
        }
        if (annotation instanceof oe6) {
            i0(field, annotation, annotationArr);
        }
        if (annotation instanceof en6) {
            j0(field, annotation);
        }
    }

    public final void r() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            add((vx0) it.next());
        }
    }

    public final void u(Class cls, mg1 mg1Var) {
        wx0 wx0VarE = this.f.e(cls, mg1Var);
        if (wx0VarE != null) {
            addAll(wx0VarE);
        }
    }

    public final void z(si1 si1Var) {
        for (gb2 gb2Var : si1Var.j()) {
            Annotation[] annotationArrA = gb2Var.a();
            Field fieldB = gb2Var.b();
            for (Annotation annotation : annotationArrA) {
                l0(fieldB, annotation, annotationArrA);
            }
        }
    }
}
