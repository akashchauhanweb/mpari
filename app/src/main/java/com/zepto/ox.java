package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class ox implements eq3 {
    public final eq3 a;

    public ox(eq3 eq3Var) {
        this.a = eq3Var;
    }

    @Override // com.zepto.eq3
    public xm6 a(Class cls) {
        Class<?> componentType = cls.getComponentType();
        if (componentType != Character.TYPE && componentType != Character.class) {
            return componentType == String.class ? new z76() : b(componentType);
        }
        return new yi0(componentType);
    }

    public final xm6 b(Class cls) {
        xm6 xm6VarA = this.a.a(cls);
        if (xm6VarA == null) {
            return null;
        }
        return new rx(xm6VarA, cls);
    }
}
