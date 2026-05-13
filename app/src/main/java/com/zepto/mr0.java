package com.zepto;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class mr0 implements po6 {
    public final rx0 c;

    public static final class a extends no6 {
        public final no6 a;
        public final te4 b;

        public a(Gson gson, Type type, no6 no6Var, te4 te4Var) {
            this.a = new ro6(gson, no6Var, type);
            this.b = te4Var;
        }

        @Override // com.zepto.no6
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Collection read(s53 s53Var) throws IOException {
            if (s53Var.G0() == v53.NULL) {
                s53Var.C0();
                return null;
            }
            Collection collection = (Collection) this.b.a();
            s53Var.d();
            while (s53Var.d0()) {
                collection.add(this.a.read(s53Var));
            }
            s53Var.w();
            return collection;
        }

        @Override // com.zepto.no6
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(b63 b63Var, Collection collection) throws IOException {
            if (collection == null) {
                b63Var.m0();
                return;
            }
            b63Var.j();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                this.a.write(b63Var, it.next());
            }
            b63Var.w();
        }
    }

    public mr0(rx0 rx0Var) {
        this.c = rx0Var;
    }

    @Override // com.zepto.po6
    public no6 a(Gson gson, TypeToken typeToken) {
        Type type = typeToken.getType();
        Class rawType = typeToken.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type typeH = c.h(type, rawType);
        return new a(gson, typeH, gson.getAdapter(TypeToken.get(typeH)), this.c.b(typeToken));
    }
}
