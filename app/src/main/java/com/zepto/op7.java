package com.zepto;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class op7 {
    public final nx a;
    public final nx b;
    public final nx c;

    public op7(nx nxVar, nx nxVar2, nx nxVar3) {
        this.a = nxVar;
        this.b = nxVar2;
        this.c = nxVar3;
    }

    public abstract void A(byte[] bArr);

    public void B(byte[] bArr, int i) {
        w(i);
        A(bArr);
    }

    public abstract void C(CharSequence charSequence);

    public void D(CharSequence charSequence, int i) {
        w(i);
        C(charSequence);
    }

    public abstract void E(int i);

    public void F(int i, int i2) {
        w(i2);
        E(i);
    }

    public abstract void G(Parcelable parcelable);

    public void H(Parcelable parcelable, int i) {
        w(i);
        G(parcelable);
    }

    public abstract void I(String str);

    public void J(String str, int i) {
        w(i);
        I(str);
    }

    public void K(qp7 qp7Var, op7 op7Var) {
        try {
            e(qp7Var.getClass()).invoke(null, qp7Var, op7Var);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (!(e4.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
            }
            throw ((RuntimeException) e4.getCause());
        }
    }

    public void L(qp7 qp7Var) {
        if (qp7Var == null) {
            I(null);
            return;
        }
        N(qp7Var);
        op7 op7VarB = b();
        K(qp7Var, op7VarB);
        op7VarB.a();
    }

    public void M(qp7 qp7Var, int i) {
        w(i);
        L(qp7Var);
    }

    public final void N(qp7 qp7Var) {
        try {
            I(c(qp7Var.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(qp7Var.getClass().getSimpleName() + " does not have a Parcelizer", e);
        }
    }

    public abstract void a();

    public abstract op7 b();

    public final Class c(Class cls) throws ClassNotFoundException {
        Class cls2 = (Class) this.c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.c.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method d(String str) throws NoSuchMethodException {
        Method method = (Method) this.a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, op7.class.getClassLoader()).getDeclaredMethod("read", op7.class);
        this.a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Method e(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        Method method = (Method) this.b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class clsC = c(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsC.getDeclaredMethod("write", cls, op7.class);
        this.b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public boolean h(boolean z, int i) {
        return !m(i) ? z : g();
    }

    public abstract byte[] i();

    public byte[] j(byte[] bArr, int i) {
        return !m(i) ? bArr : i();
    }

    public abstract CharSequence k();

    public CharSequence l(CharSequence charSequence, int i) {
        return !m(i) ? charSequence : k();
    }

    public abstract boolean m(int i);

    public qp7 n(String str, op7 op7Var) {
        try {
            return (qp7) d(str).invoke(null, op7Var);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public abstract int o();

    public int p(int i, int i2) {
        return !m(i2) ? i : o();
    }

    public abstract Parcelable q();

    public Parcelable r(Parcelable parcelable, int i) {
        return !m(i) ? parcelable : q();
    }

    public abstract String s();

    public String t(String str, int i) {
        return !m(i) ? str : s();
    }

    public qp7 u() {
        String strS = s();
        if (strS == null) {
            return null;
        }
        return n(strS, b());
    }

    public qp7 v(qp7 qp7Var, int i) {
        return !m(i) ? qp7Var : u();
    }

    public abstract void w(int i);

    public void x(boolean z, boolean z2) {
    }

    public abstract void y(boolean z);

    public void z(boolean z, int i) {
        w(i);
        y(z);
    }
}
