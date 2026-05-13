package com.zepto;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class sx extends no6 {
    public static final po6 c = new a();
    public final Class a;
    public final no6 b;

    public class a implements po6 {
        @Override // com.zepto.po6
        public no6 a(Gson gson, TypeToken typeToken) {
            Type type = typeToken.getType();
            if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type typeG = c.g(type);
            return new sx(gson, gson.getAdapter(TypeToken.get(typeG)), c.k(typeG));
        }
    }

    public sx(Gson gson, no6 no6Var, Class cls) {
        this.b = new ro6(gson, no6Var, cls);
        this.a = cls;
    }

    @Override // com.zepto.no6
    public Object read(s53 s53Var) throws IOException {
        if (s53Var.G0() == v53.NULL) {
            s53Var.C0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        s53Var.d();
        while (s53Var.d0()) {
            arrayList.add(this.b.read(s53Var));
        }
        s53Var.w();
        int size = arrayList.size();
        if (!this.a.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) this.a, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) this.a, size);
        for (int i = 0; i < size; i++) {
            Array.set(objNewInstance, i, arrayList.get(i));
        }
        return objNewInstance;
    }

    @Override // com.zepto.no6
    public void write(b63 b63Var, Object obj) throws IOException {
        if (obj == null) {
            b63Var.m0();
            return;
        }
        b63Var.j();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.b.write(b63Var, Array.get(obj, i));
        }
        b63Var.w();
    }
}
