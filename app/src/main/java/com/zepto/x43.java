package com.zepto;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/* JADX INFO: loaded from: classes.dex */
public final class x43 implements po6 {
    public final rx0 c;

    public x43(rx0 rx0Var) {
        this.c = rx0Var;
    }

    @Override // com.zepto.po6
    public no6 a(Gson gson, TypeToken typeToken) {
        v43 v43Var = (v43) typeToken.getRawType().getAnnotation(v43.class);
        if (v43Var == null) {
            return null;
        }
        return b(this.c, gson, typeToken, v43Var);
    }

    public no6 b(rx0 rx0Var, Gson gson, TypeToken typeToken, v43 v43Var) {
        no6 no6VarA;
        Object objA = rx0Var.b(TypeToken.get(v43Var.value())).a();
        boolean zNullSafe = v43Var.nullSafe();
        if (objA instanceof no6) {
            no6VarA = (no6) objA;
        } else {
            if (!(objA instanceof po6)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objA.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            no6VarA = ((po6) objA).a(gson, typeToken);
        }
        return (no6VarA == null || !zNullSafe) ? no6VarA : no6VarA.nullSafe();
    }
}
