package com.zepto;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class qp3 implements po6 {
    public final rx0 c;
    public final boolean e;

    public final class a extends no6 {
        public final no6 a;
        public final no6 b;
        public final te4 c;

        public a(Gson gson, Type type, no6 no6Var, Type type2, no6 no6Var2, te4 te4Var) {
            this.a = new ro6(gson, no6Var, type);
            this.b = new ro6(gson, no6Var2, type2);
            this.c = te4Var;
        }

        public final String a(f53 f53Var) {
            if (!f53Var.B()) {
                if (f53Var.w()) {
                    return "null";
                }
                throw new AssertionError();
            }
            r53 r53VarN = f53Var.n();
            if (r53VarN.f0()) {
                return String.valueOf(r53VarN.a0());
            }
            if (r53VarN.d0()) {
                return Boolean.toString(r53VarN.D());
            }
            if (r53VarN.g0()) {
                return r53VarN.r();
            }
            throw new AssertionError();
        }

        @Override // com.zepto.no6
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map read(s53 s53Var) throws IOException {
            v53 v53VarG0 = s53Var.G0();
            if (v53VarG0 == v53.NULL) {
                s53Var.C0();
                return null;
            }
            Map map = (Map) this.c.a();
            if (v53VarG0 == v53.BEGIN_ARRAY) {
                s53Var.d();
                while (s53Var.d0()) {
                    s53Var.d();
                    Object obj = this.a.read(s53Var);
                    if (map.put(obj, this.b.read(s53Var)) != null) {
                        throw new u53("duplicate key: " + obj);
                    }
                    s53Var.w();
                }
                s53Var.w();
            } else {
                s53Var.e();
                while (s53Var.d0()) {
                    t53.a.a(s53Var);
                    Object obj2 = this.a.read(s53Var);
                    if (map.put(obj2, this.b.read(s53Var)) != null) {
                        throw new u53("duplicate key: " + obj2);
                    }
                }
                s53Var.B();
            }
            return map;
        }

        @Override // com.zepto.no6
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(b63 b63Var, Map map) throws IOException {
            if (map == null) {
                b63Var.m0();
                return;
            }
            if (!qp3.this.e) {
                b63Var.m();
                for (Map.Entry entry : map.entrySet()) {
                    b63Var.e0(String.valueOf(entry.getKey()));
                    this.b.write(b63Var, entry.getValue());
                }
                b63Var.B();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i = 0;
            boolean z = false;
            for (Map.Entry entry2 : map.entrySet()) {
                f53 jsonTree = this.a.toJsonTree(entry2.getKey());
                arrayList.add(jsonTree);
                arrayList2.add(entry2.getValue());
                z |= jsonTree.u() || jsonTree.z();
            }
            if (!z) {
                b63Var.m();
                int size = arrayList.size();
                while (i < size) {
                    b63Var.e0(a((f53) arrayList.get(i)));
                    this.b.write(b63Var, arrayList2.get(i));
                    i++;
                }
                b63Var.B();
                return;
            }
            b63Var.j();
            int size2 = arrayList.size();
            while (i < size2) {
                b63Var.j();
                v76.b((f53) arrayList.get(i), b63Var);
                this.b.write(b63Var, arrayList2.get(i));
                b63Var.w();
                i++;
            }
            b63Var.w();
        }
    }

    public qp3(rx0 rx0Var, boolean z) {
        this.c = rx0Var;
        this.e = z;
    }

    @Override // com.zepto.po6
    public no6 a(Gson gson, TypeToken typeToken) {
        Type type = typeToken.getType();
        Class rawType = typeToken.getRawType();
        if (!Map.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type[] typeArrJ = c.j(type, rawType);
        return new a(gson, typeArrJ[0], b(gson, typeArrJ[0]), typeArrJ[1], gson.getAdapter(TypeToken.get(typeArrJ[1])), this.c.b(typeToken));
    }

    public final no6 b(Gson gson, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? so6.f : gson.getAdapter(TypeToken.get(type));
    }
}
