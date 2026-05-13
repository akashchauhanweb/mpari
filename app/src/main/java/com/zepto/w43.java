package com.zepto;

/* JADX INFO: loaded from: classes2.dex */
public final class w43 implements oo6 {
    public final qx0 c;

    public w43(qx0 qx0Var) {
        this.c = qx0Var;
    }

    @Override // com.zepto.oo6
    public mo6 a(pk2 pk2Var, uo6 uo6Var) {
        u43 u43Var = (u43) uo6Var.c().getAnnotation(u43.class);
        if (u43Var == null) {
            return null;
        }
        return b(this.c, pk2Var, uo6Var, u43Var);
    }

    public mo6 b(qx0 qx0Var, pk2 pk2Var, uo6 uo6Var, u43 u43Var) {
        mo6 mo6VarA;
        Object objA = qx0Var.b(uo6.a(u43Var.value())).a();
        boolean zNullSafe = u43Var.nullSafe();
        if (objA instanceof mo6) {
            mo6VarA = (mo6) objA;
        } else {
            if (!(objA instanceof oo6)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objA.getClass().getName() + " as a @JsonAdapter for " + uo6Var.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            mo6VarA = ((oo6) objA).a(pk2Var, uo6Var);
        }
        return (mo6VarA == null || !zNullSafe) ? mo6VarA : mo6VarA.a();
    }
}
