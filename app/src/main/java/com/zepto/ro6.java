package com.zepto;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.zepto.n75;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: loaded from: classes.dex */
public final class ro6 extends no6 {
    public final Gson a;
    public final no6 b;
    public final Type c;

    public ro6(Gson gson, no6 no6Var, Type type) {
        this.a = gson;
        this.b = no6Var;
        this.c = type;
    }

    public static Type a(Type type, Object obj) {
        return obj != null ? ((type instanceof Class) || (type instanceof TypeVariable)) ? obj.getClass() : type : type;
    }

    public static boolean b(no6 no6Var) {
        no6 serializationDelegate;
        while ((no6Var instanceof uy5) && (serializationDelegate = ((uy5) no6Var).getSerializationDelegate()) != no6Var) {
            no6Var = serializationDelegate;
        }
        return no6Var instanceof n75.b;
    }

    @Override // com.zepto.no6
    public Object read(s53 s53Var) {
        return this.b.read(s53Var);
    }

    @Override // com.zepto.no6
    public void write(b63 b63Var, Object obj) {
        no6 adapter = this.b;
        Type typeA = a(this.c, obj);
        if (typeA != this.c) {
            adapter = this.a.getAdapter(TypeToken.get(typeA));
            if ((adapter instanceof n75.b) && !b(this.b)) {
                adapter = this.b;
            }
        }
        adapter.write(b63Var, obj);
    }
}
